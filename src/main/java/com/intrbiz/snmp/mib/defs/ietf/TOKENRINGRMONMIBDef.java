package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**Textual Conventions*/
public final class TOKENRINGRMONMIBDef extends MIB
{
    public static final TOKENRINGRMONMIBDef TOKENRINGRMONMIB = new TOKENRINGRMONMIBDef();

    static { MIBs.getInstance().registerMIB(TOKENRINGRMONMIBDef.TOKENRINGRMONMIB); }

    /** A period of time, measured in units of 0.01 seconds.
This MIB module uses the extended OBJECT-TYPE macro asdefined in [2].
Token Ring Remote Network Monitoring MIB*/
    public final TokenRingEnt tokenRing;

    /** The Token Ring Mac-Layer Statistics GroupImplementation of this group is optional*/
    public final TokenRingMLStatsTableEnt tokenRingMLStatsTable;

    /** The Token Ring Promiscuous Statistics GroupImplementation of this group is optional*/
    public final TokenRingPStatsTableEnt tokenRingPStatsTable;

    /** The Token Ring History Groups
When an entry in the historyControlTable is created thatidentifies a token ring interface as itshistoryControlDataSource, the probe shall createcorresponding entries in the tokenRingMLHistoryTableand/or the tokenRingPHistoryTable, depending on whichgroups it supports.

The Token Ring Mac-Layer History GroupImplementation of this group is optional.Implementation of this group requires implementation ofthe historyControl group from RFC1271.*/
    public final TokenRingMLHistoryTableEnt tokenRingMLHistoryTable;

    /** The Token Ring Promiscuous History GroupImplementation of this group is optional.Implementation of this group requires the implementationof the historyControl group from RFC1271.*/
    public final TokenRingPHistoryTableEnt tokenRingPHistoryTable;

    private TOKENRINGRMONMIBDef()
    {
        super("TOKEN-RING-RMON-MIB");
        this.tokenRing = new TokenRingEnt(this, null);
        this.tokenRingMLStatsTable = new TokenRingMLStatsTableEnt(this, null);
        this.tokenRingPStatsTable = new TokenRingPStatsTableEnt(this, null);
        this.tokenRingMLHistoryTable = new TokenRingMLHistoryTableEnt(this, null);
        this.tokenRingPHistoryTable = new TokenRingPHistoryTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tokenRing,
            this.tokenRingMLStatsTable,
            this.tokenRingPStatsTable,
            this.tokenRingMLHistoryTable,
            this.tokenRingPHistoryTable
        };
    }

    public static final class TokenRingEnt extends MIBEntry<TOKENRINGRMONMIBDef>
    {
        /** The Token Ring Ring Station GroupImplementation of this group is optionalAlthough the ringStationTable stores entries only forthose stations physically attached to the local ring andthe number of stations attached to a ring is limited, aprobe may still need to free resources when resourcesgrow tight.  In such a situation, it is suggested thatthe probe free only inactive stations, and tofirst free the stations that have been inactive for thelongest time.*/
        public final RingStationControlTableEnt ringStationControlTable;

        public final RingStationTableEnt ringStationTable;

        /** The Token Ring Ring Station Order GroupImplementation of this group is optional
The ringStationOrderTable*/
        public final RingStationOrderTableEnt ringStationOrderTable;

        /** The Token Ring Ring Station Config GroupImplementation of this group is optional.The ring station config group manages token ring nodesthrough active means.*/
        public final RingStationConfigControlTableEnt ringStationConfigControlTable;

        /** The ringStationConfig TableEntries exist in this table after an activeconfiguration query has completed successfully fora station.  This query is initiated by the associatedringStationConfigControlUpdateStats variable.*/
        public final RingStationConfigTableEnt ringStationConfigTable;

        /** The Token Ring Source Routing groupImplementation of this group is optional.The data in this group is collected from the sourcerouting information potentially present in any token ringpacket.  This information will be valid only in a puresource route bridging environment.  In a transparentbridging or a mixed bridging environment, thisinformation may not be accurate.*/
        public final SourceRoutingStatsTableEnt sourceRoutingStatsTable;

        private TokenRingEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
        {
            super(mib, parent, "tokenRing", "1.3.6.1.2.1.16.10", false, false, false, false);
            this.ringStationControlTable = new RingStationControlTableEnt(mib, this);
            this.ringStationTable = new RingStationTableEnt(mib, this);
            this.ringStationOrderTable = new RingStationOrderTableEnt(mib, this);
            this.ringStationConfigControlTable = new RingStationConfigControlTableEnt(mib, this);
            this.ringStationConfigTable = new RingStationConfigTableEnt(mib, this);
            this.sourceRoutingStatsTable = new SourceRoutingStatsTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ringStationControlTable,
                this.ringStationTable,
                this.ringStationOrderTable,
                this.ringStationConfigControlTable,
                this.ringStationConfigTable,
                this.sourceRoutingStatsTable
            };
        }
        public static final class RingStationControlTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final RingStationControlEntryEnt ringStationControlEntry;

            private RingStationControlTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "ringStationControlTable", "1.3.6.1.2.1.16.10.1", false, true, false, false);
                this.ringStationControlEntry = new RingStationControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ringStationControlEntry
                };
            }
            public static final class RingStationControlEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                public final RingStationControlIfIndexEnt ringStationControlIfIndex;

                public final RingStationControlTableSizeEnt ringStationControlTableSize;

                public final RingStationControlActiveStationsEnt ringStationControlActiveStations;

                public final RingStationControlRingStateEnt ringStationControlRingState;

                public final RingStationControlBeaconSenderEnt ringStationControlBeaconSender;

                public final RingStationControlBeaconNAUNEnt ringStationControlBeaconNAUN;

                public final RingStationControlActiveMonitorEnt ringStationControlActiveMonitor;

                public final RingStationControlOrderChangesEnt ringStationControlOrderChanges;

                public final RingStationControlOwnerEnt ringStationControlOwner;

                public final RingStationControlStatusEnt ringStationControlStatus;

                private RingStationControlEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "ringStationControlEntry", "1.3.6.1.2.1.16.10.1.1", false, false, false, true);
                    this.ringStationControlIfIndex = new RingStationControlIfIndexEnt(mib, this);
                    this.ringStationControlTableSize = new RingStationControlTableSizeEnt(mib, this);
                    this.ringStationControlActiveStations = new RingStationControlActiveStationsEnt(mib, this);
                    this.ringStationControlRingState = new RingStationControlRingStateEnt(mib, this);
                    this.ringStationControlBeaconSender = new RingStationControlBeaconSenderEnt(mib, this);
                    this.ringStationControlBeaconNAUN = new RingStationControlBeaconNAUNEnt(mib, this);
                    this.ringStationControlActiveMonitor = new RingStationControlActiveMonitorEnt(mib, this);
                    this.ringStationControlOrderChanges = new RingStationControlOrderChangesEnt(mib, this);
                    this.ringStationControlOwner = new RingStationControlOwnerEnt(mib, this);
                    this.ringStationControlStatus = new RingStationControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ringStationControlIfIndex,
                        this.ringStationControlTableSize,
                        this.ringStationControlActiveStations,
                        this.ringStationControlRingState,
                        this.ringStationControlBeaconSender,
                        this.ringStationControlBeaconNAUN,
                        this.ringStationControlActiveMonitor,
                        this.ringStationControlOrderChanges,
                        this.ringStationControlOwner,
                        this.ringStationControlStatus
                    };
                }
                public static final class RingStationControlIfIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlIfIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlIfIndex", "1.3.6.1.2.1.16.10.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlTableSizeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlTableSizeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlTableSize", "1.3.6.1.2.1.16.10.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlActiveStationsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlActiveStationsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlActiveStations", "1.3.6.1.2.1.16.10.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlRingStateEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlRingStateEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlRingState", "1.3.6.1.2.1.16.10.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlBeaconSenderEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlBeaconSenderEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlBeaconSender", "1.3.6.1.2.1.16.10.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlBeaconNAUNEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlBeaconNAUNEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlBeaconNAUN", "1.3.6.1.2.1.16.10.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlActiveMonitorEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlActiveMonitorEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlActiveMonitor", "1.3.6.1.2.1.16.10.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlOrderChangesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlOrderChangesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlOrderChanges", "1.3.6.1.2.1.16.10.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlOwnerEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlOwnerEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlOwner", "1.3.6.1.2.1.16.10.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationControlStatusEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationControlStatusEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationControlStatus", "1.3.6.1.2.1.16.10.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RingStationTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final RingStationEntryEnt ringStationEntry;

            private RingStationTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "ringStationTable", "1.3.6.1.2.1.16.10.2", false, true, false, false);
                this.ringStationEntry = new RingStationEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ringStationEntry
                };
            }
            public static final class RingStationEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                public final RingStationIfIndexEnt ringStationIfIndex;

                public final RingStationMacAddressEnt ringStationMacAddress;

                public final RingStationLastNAUNEnt ringStationLastNAUN;

                public final RingStationStationStatusEnt ringStationStationStatus;

                public final RingStationLastEnterTimeEnt ringStationLastEnterTime;

                public final RingStationLastExitTimeEnt ringStationLastExitTime;

                public final RingStationDuplicateAddressesEnt ringStationDuplicateAddresses;

                public final RingStationInLineErrorsEnt ringStationInLineErrors;

                public final RingStationOutLineErrorsEnt ringStationOutLineErrors;

                public final RingStationInternalErrorsEnt ringStationInternalErrors;

                public final RingStationInBurstErrorsEnt ringStationInBurstErrors;

                public final RingStationOutBurstErrorsEnt ringStationOutBurstErrors;

                public final RingStationACErrorsEnt ringStationACErrors;

                public final RingStationAbortErrorsEnt ringStationAbortErrors;

                public final RingStationLostFrameErrorsEnt ringStationLostFrameErrors;

                public final RingStationCongestionErrorsEnt ringStationCongestionErrors;

                public final RingStationFrameCopiedErrorsEnt ringStationFrameCopiedErrors;

                public final RingStationFrequencyErrorsEnt ringStationFrequencyErrors;

                public final RingStationTokenErrorsEnt ringStationTokenErrors;

                public final RingStationInBeaconErrorsEnt ringStationInBeaconErrors;

                public final RingStationOutBeaconErrorsEnt ringStationOutBeaconErrors;

                public final RingStationInsertionsEnt ringStationInsertions;

                private RingStationEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "ringStationEntry", "1.3.6.1.2.1.16.10.2.1", false, false, false, true);
                    this.ringStationIfIndex = new RingStationIfIndexEnt(mib, this);
                    this.ringStationMacAddress = new RingStationMacAddressEnt(mib, this);
                    this.ringStationLastNAUN = new RingStationLastNAUNEnt(mib, this);
                    this.ringStationStationStatus = new RingStationStationStatusEnt(mib, this);
                    this.ringStationLastEnterTime = new RingStationLastEnterTimeEnt(mib, this);
                    this.ringStationLastExitTime = new RingStationLastExitTimeEnt(mib, this);
                    this.ringStationDuplicateAddresses = new RingStationDuplicateAddressesEnt(mib, this);
                    this.ringStationInLineErrors = new RingStationInLineErrorsEnt(mib, this);
                    this.ringStationOutLineErrors = new RingStationOutLineErrorsEnt(mib, this);
                    this.ringStationInternalErrors = new RingStationInternalErrorsEnt(mib, this);
                    this.ringStationInBurstErrors = new RingStationInBurstErrorsEnt(mib, this);
                    this.ringStationOutBurstErrors = new RingStationOutBurstErrorsEnt(mib, this);
                    this.ringStationACErrors = new RingStationACErrorsEnt(mib, this);
                    this.ringStationAbortErrors = new RingStationAbortErrorsEnt(mib, this);
                    this.ringStationLostFrameErrors = new RingStationLostFrameErrorsEnt(mib, this);
                    this.ringStationCongestionErrors = new RingStationCongestionErrorsEnt(mib, this);
                    this.ringStationFrameCopiedErrors = new RingStationFrameCopiedErrorsEnt(mib, this);
                    this.ringStationFrequencyErrors = new RingStationFrequencyErrorsEnt(mib, this);
                    this.ringStationTokenErrors = new RingStationTokenErrorsEnt(mib, this);
                    this.ringStationInBeaconErrors = new RingStationInBeaconErrorsEnt(mib, this);
                    this.ringStationOutBeaconErrors = new RingStationOutBeaconErrorsEnt(mib, this);
                    this.ringStationInsertions = new RingStationInsertionsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ringStationIfIndex,
                        this.ringStationMacAddress,
                        this.ringStationLastNAUN,
                        this.ringStationStationStatus,
                        this.ringStationLastEnterTime,
                        this.ringStationLastExitTime,
                        this.ringStationDuplicateAddresses,
                        this.ringStationInLineErrors,
                        this.ringStationOutLineErrors,
                        this.ringStationInternalErrors,
                        this.ringStationInBurstErrors,
                        this.ringStationOutBurstErrors,
                        this.ringStationACErrors,
                        this.ringStationAbortErrors,
                        this.ringStationLostFrameErrors,
                        this.ringStationCongestionErrors,
                        this.ringStationFrameCopiedErrors,
                        this.ringStationFrequencyErrors,
                        this.ringStationTokenErrors,
                        this.ringStationInBeaconErrors,
                        this.ringStationOutBeaconErrors,
                        this.ringStationInsertions
                    };
                }
                public static final class RingStationIfIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationIfIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationIfIndex", "1.3.6.1.2.1.16.10.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationMacAddressEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationMacAddressEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationMacAddress", "1.3.6.1.2.1.16.10.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationLastNAUNEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationLastNAUNEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationLastNAUN", "1.3.6.1.2.1.16.10.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationStationStatusEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationStationStatusEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationStationStatus", "1.3.6.1.2.1.16.10.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationLastEnterTimeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationLastEnterTimeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationLastEnterTime", "1.3.6.1.2.1.16.10.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationLastExitTimeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationLastExitTimeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationLastExitTime", "1.3.6.1.2.1.16.10.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationDuplicateAddressesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationDuplicateAddressesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationDuplicateAddresses", "1.3.6.1.2.1.16.10.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationInLineErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationInLineErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationInLineErrors", "1.3.6.1.2.1.16.10.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationOutLineErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationOutLineErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationOutLineErrors", "1.3.6.1.2.1.16.10.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationInternalErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationInternalErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationInternalErrors", "1.3.6.1.2.1.16.10.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationInBurstErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationInBurstErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationInBurstErrors", "1.3.6.1.2.1.16.10.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationOutBurstErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationOutBurstErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationOutBurstErrors", "1.3.6.1.2.1.16.10.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationACErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationACErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationACErrors", "1.3.6.1.2.1.16.10.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationAbortErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationAbortErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationAbortErrors", "1.3.6.1.2.1.16.10.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationLostFrameErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationLostFrameErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationLostFrameErrors", "1.3.6.1.2.1.16.10.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationCongestionErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationCongestionErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationCongestionErrors", "1.3.6.1.2.1.16.10.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationFrameCopiedErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationFrameCopiedErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationFrameCopiedErrors", "1.3.6.1.2.1.16.10.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationFrequencyErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationFrequencyErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationFrequencyErrors", "1.3.6.1.2.1.16.10.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationTokenErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationTokenErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationTokenErrors", "1.3.6.1.2.1.16.10.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationInBeaconErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationInBeaconErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationInBeaconErrors", "1.3.6.1.2.1.16.10.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationOutBeaconErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationOutBeaconErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationOutBeaconErrors", "1.3.6.1.2.1.16.10.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationInsertionsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationInsertionsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationInsertions", "1.3.6.1.2.1.16.10.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RingStationOrderTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final RingStationOrderEntryEnt ringStationOrderEntry;

            private RingStationOrderTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "ringStationOrderTable", "1.3.6.1.2.1.16.10.3", false, true, false, false);
                this.ringStationOrderEntry = new RingStationOrderEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ringStationOrderEntry
                };
            }
            public static final class RingStationOrderEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                public final RingStationOrderIfIndexEnt ringStationOrderIfIndex;

                public final RingStationOrderOrderIndexEnt ringStationOrderOrderIndex;

                public final RingStationOrderMacAddressEnt ringStationOrderMacAddress;

                private RingStationOrderEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "ringStationOrderEntry", "1.3.6.1.2.1.16.10.3.1", false, false, false, true);
                    this.ringStationOrderIfIndex = new RingStationOrderIfIndexEnt(mib, this);
                    this.ringStationOrderOrderIndex = new RingStationOrderOrderIndexEnt(mib, this);
                    this.ringStationOrderMacAddress = new RingStationOrderMacAddressEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ringStationOrderIfIndex,
                        this.ringStationOrderOrderIndex,
                        this.ringStationOrderMacAddress
                    };
                }
                public static final class RingStationOrderIfIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationOrderIfIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationOrderIfIndex", "1.3.6.1.2.1.16.10.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationOrderOrderIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationOrderOrderIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationOrderOrderIndex", "1.3.6.1.2.1.16.10.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationOrderMacAddressEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationOrderMacAddressEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationOrderMacAddress", "1.3.6.1.2.1.16.10.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RingStationConfigControlTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final RingStationConfigControlEntryEnt ringStationConfigControlEntry;

            private RingStationConfigControlTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "ringStationConfigControlTable", "1.3.6.1.2.1.16.10.4", false, true, false, false);
                this.ringStationConfigControlEntry = new RingStationConfigControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ringStationConfigControlEntry
                };
            }
            public static final class RingStationConfigControlEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                public final RingStationConfigControlIfIndexEnt ringStationConfigControlIfIndex;

                public final RingStationConfigControlMacAddressEnt ringStationConfigControlMacAddress;

                public final RingStationConfigControlRemoveEnt ringStationConfigControlRemove;

                public final RingStationConfigControlUpdateStatsEnt ringStationConfigControlUpdateStats;

                private RingStationConfigControlEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "ringStationConfigControlEntry", "1.3.6.1.2.1.16.10.4.1", false, false, false, true);
                    this.ringStationConfigControlIfIndex = new RingStationConfigControlIfIndexEnt(mib, this);
                    this.ringStationConfigControlMacAddress = new RingStationConfigControlMacAddressEnt(mib, this);
                    this.ringStationConfigControlRemove = new RingStationConfigControlRemoveEnt(mib, this);
                    this.ringStationConfigControlUpdateStats = new RingStationConfigControlUpdateStatsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ringStationConfigControlIfIndex,
                        this.ringStationConfigControlMacAddress,
                        this.ringStationConfigControlRemove,
                        this.ringStationConfigControlUpdateStats
                    };
                }
                public static final class RingStationConfigControlIfIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigControlIfIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigControlIfIndex", "1.3.6.1.2.1.16.10.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigControlMacAddressEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigControlMacAddressEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigControlMacAddress", "1.3.6.1.2.1.16.10.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigControlRemoveEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigControlRemoveEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigControlRemove", "1.3.6.1.2.1.16.10.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigControlUpdateStatsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigControlUpdateStatsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigControlUpdateStats", "1.3.6.1.2.1.16.10.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RingStationConfigTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final RingStationConfigEntryEnt ringStationConfigEntry;

            private RingStationConfigTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "ringStationConfigTable", "1.3.6.1.2.1.16.10.5", false, true, false, false);
                this.ringStationConfigEntry = new RingStationConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ringStationConfigEntry
                };
            }
            public static final class RingStationConfigEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                public final RingStationConfigIfIndexEnt ringStationConfigIfIndex;

                public final RingStationConfigMacAddressEnt ringStationConfigMacAddress;

                public final RingStationConfigUpdateTimeEnt ringStationConfigUpdateTime;

                public final RingStationConfigLocationEnt ringStationConfigLocation;

                public final RingStationConfigMicrocodeEnt ringStationConfigMicrocode;

                public final RingStationConfigGroupAddressEnt ringStationConfigGroupAddress;

                public final RingStationConfigFunctionalAddressEnt ringStationConfigFunctionalAddress;

                private RingStationConfigEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "ringStationConfigEntry", "1.3.6.1.2.1.16.10.5.1", false, false, false, true);
                    this.ringStationConfigIfIndex = new RingStationConfigIfIndexEnt(mib, this);
                    this.ringStationConfigMacAddress = new RingStationConfigMacAddressEnt(mib, this);
                    this.ringStationConfigUpdateTime = new RingStationConfigUpdateTimeEnt(mib, this);
                    this.ringStationConfigLocation = new RingStationConfigLocationEnt(mib, this);
                    this.ringStationConfigMicrocode = new RingStationConfigMicrocodeEnt(mib, this);
                    this.ringStationConfigGroupAddress = new RingStationConfigGroupAddressEnt(mib, this);
                    this.ringStationConfigFunctionalAddress = new RingStationConfigFunctionalAddressEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ringStationConfigIfIndex,
                        this.ringStationConfigMacAddress,
                        this.ringStationConfigUpdateTime,
                        this.ringStationConfigLocation,
                        this.ringStationConfigMicrocode,
                        this.ringStationConfigGroupAddress,
                        this.ringStationConfigFunctionalAddress
                    };
                }
                public static final class RingStationConfigIfIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigIfIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigIfIndex", "1.3.6.1.2.1.16.10.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigMacAddressEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigMacAddressEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigMacAddress", "1.3.6.1.2.1.16.10.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigUpdateTimeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigUpdateTimeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigUpdateTime", "1.3.6.1.2.1.16.10.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigLocationEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigLocationEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigLocation", "1.3.6.1.2.1.16.10.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigMicrocodeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigMicrocodeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigMicrocode", "1.3.6.1.2.1.16.10.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigGroupAddressEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigGroupAddressEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigGroupAddress", "1.3.6.1.2.1.16.10.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RingStationConfigFunctionalAddressEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private RingStationConfigFunctionalAddressEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "ringStationConfigFunctionalAddress", "1.3.6.1.2.1.16.10.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SourceRoutingStatsTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final SourceRoutingStatsEntryEnt sourceRoutingStatsEntry;

            private SourceRoutingStatsTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "sourceRoutingStatsTable", "1.3.6.1.2.1.16.10.6", false, true, false, false);
                this.sourceRoutingStatsEntry = new SourceRoutingStatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sourceRoutingStatsEntry
                };
            }
            public static final class SourceRoutingStatsEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                public final SourceRoutingStatsIfIndexEnt sourceRoutingStatsIfIndex;

                public final SourceRoutingStatsRingNumberEnt sourceRoutingStatsRingNumber;

                public final SourceRoutingStatsInFramesEnt sourceRoutingStatsInFrames;

                public final SourceRoutingStatsOutFramesEnt sourceRoutingStatsOutFrames;

                public final SourceRoutingStatsThroughFramesEnt sourceRoutingStatsThroughFrames;

                public final SourceRoutingStatsAllRoutesBroadcastFramesEnt sourceRoutingStatsAllRoutesBroadcastFrames;

                public final SourceRoutingStatsSingleRouteBroadcastFramesEnt sourceRoutingStatsSingleRouteBroadcastFrames;

                public final SourceRoutingStatsInOctetsEnt sourceRoutingStatsInOctets;

                public final SourceRoutingStatsOutOctetsEnt sourceRoutingStatsOutOctets;

                public final SourceRoutingStatsThroughOctetsEnt sourceRoutingStatsThroughOctets;

                public final SourceRoutingStatsAllRoutesBroadcastOctetsEnt sourceRoutingStatsAllRoutesBroadcastOctets;

                public final SourceRoutingStatsSingleRoutesBroadcastOctetsEnt sourceRoutingStatsSingleRoutesBroadcastOctets;

                public final SourceRoutingStatsLocalLLCFramesEnt sourceRoutingStatsLocalLLCFrames;

                public final SourceRoutingStats1HopFramesEnt sourceRoutingStats1HopFrames;

                public final SourceRoutingStats2HopsFramesEnt sourceRoutingStats2HopsFrames;

                public final SourceRoutingStats3HopsFramesEnt sourceRoutingStats3HopsFrames;

                public final SourceRoutingStats4HopsFramesEnt sourceRoutingStats4HopsFrames;

                public final SourceRoutingStats5HopsFramesEnt sourceRoutingStats5HopsFrames;

                public final SourceRoutingStats6HopsFramesEnt sourceRoutingStats6HopsFrames;

                public final SourceRoutingStats7HopsFramesEnt sourceRoutingStats7HopsFrames;

                public final SourceRoutingStats8HopsFramesEnt sourceRoutingStats8HopsFrames;

                public final SourceRoutingStatsMoreThan8HopsFramesEnt sourceRoutingStatsMoreThan8HopsFrames;

                public final SourceRoutingStatsOwnerEnt sourceRoutingStatsOwner;

                public final SourceRoutingStatsStatusEnt sourceRoutingStatsStatus;

                private SourceRoutingStatsEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "sourceRoutingStatsEntry", "1.3.6.1.2.1.16.10.6.1", false, false, false, true);
                    this.sourceRoutingStatsIfIndex = new SourceRoutingStatsIfIndexEnt(mib, this);
                    this.sourceRoutingStatsRingNumber = new SourceRoutingStatsRingNumberEnt(mib, this);
                    this.sourceRoutingStatsInFrames = new SourceRoutingStatsInFramesEnt(mib, this);
                    this.sourceRoutingStatsOutFrames = new SourceRoutingStatsOutFramesEnt(mib, this);
                    this.sourceRoutingStatsThroughFrames = new SourceRoutingStatsThroughFramesEnt(mib, this);
                    this.sourceRoutingStatsAllRoutesBroadcastFrames = new SourceRoutingStatsAllRoutesBroadcastFramesEnt(mib, this);
                    this.sourceRoutingStatsSingleRouteBroadcastFrames = new SourceRoutingStatsSingleRouteBroadcastFramesEnt(mib, this);
                    this.sourceRoutingStatsInOctets = new SourceRoutingStatsInOctetsEnt(mib, this);
                    this.sourceRoutingStatsOutOctets = new SourceRoutingStatsOutOctetsEnt(mib, this);
                    this.sourceRoutingStatsThroughOctets = new SourceRoutingStatsThroughOctetsEnt(mib, this);
                    this.sourceRoutingStatsAllRoutesBroadcastOctets = new SourceRoutingStatsAllRoutesBroadcastOctetsEnt(mib, this);
                    this.sourceRoutingStatsSingleRoutesBroadcastOctets = new SourceRoutingStatsSingleRoutesBroadcastOctetsEnt(mib, this);
                    this.sourceRoutingStatsLocalLLCFrames = new SourceRoutingStatsLocalLLCFramesEnt(mib, this);
                    this.sourceRoutingStats1HopFrames = new SourceRoutingStats1HopFramesEnt(mib, this);
                    this.sourceRoutingStats2HopsFrames = new SourceRoutingStats2HopsFramesEnt(mib, this);
                    this.sourceRoutingStats3HopsFrames = new SourceRoutingStats3HopsFramesEnt(mib, this);
                    this.sourceRoutingStats4HopsFrames = new SourceRoutingStats4HopsFramesEnt(mib, this);
                    this.sourceRoutingStats5HopsFrames = new SourceRoutingStats5HopsFramesEnt(mib, this);
                    this.sourceRoutingStats6HopsFrames = new SourceRoutingStats6HopsFramesEnt(mib, this);
                    this.sourceRoutingStats7HopsFrames = new SourceRoutingStats7HopsFramesEnt(mib, this);
                    this.sourceRoutingStats8HopsFrames = new SourceRoutingStats8HopsFramesEnt(mib, this);
                    this.sourceRoutingStatsMoreThan8HopsFrames = new SourceRoutingStatsMoreThan8HopsFramesEnt(mib, this);
                    this.sourceRoutingStatsOwner = new SourceRoutingStatsOwnerEnt(mib, this);
                    this.sourceRoutingStatsStatus = new SourceRoutingStatsStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sourceRoutingStatsIfIndex,
                        this.sourceRoutingStatsRingNumber,
                        this.sourceRoutingStatsInFrames,
                        this.sourceRoutingStatsOutFrames,
                        this.sourceRoutingStatsThroughFrames,
                        this.sourceRoutingStatsAllRoutesBroadcastFrames,
                        this.sourceRoutingStatsSingleRouteBroadcastFrames,
                        this.sourceRoutingStatsInOctets,
                        this.sourceRoutingStatsOutOctets,
                        this.sourceRoutingStatsThroughOctets,
                        this.sourceRoutingStatsAllRoutesBroadcastOctets,
                        this.sourceRoutingStatsSingleRoutesBroadcastOctets,
                        this.sourceRoutingStatsLocalLLCFrames,
                        this.sourceRoutingStats1HopFrames,
                        this.sourceRoutingStats2HopsFrames,
                        this.sourceRoutingStats3HopsFrames,
                        this.sourceRoutingStats4HopsFrames,
                        this.sourceRoutingStats5HopsFrames,
                        this.sourceRoutingStats6HopsFrames,
                        this.sourceRoutingStats7HopsFrames,
                        this.sourceRoutingStats8HopsFrames,
                        this.sourceRoutingStatsMoreThan8HopsFrames,
                        this.sourceRoutingStatsOwner,
                        this.sourceRoutingStatsStatus
                    };
                }
                public static final class SourceRoutingStatsIfIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsIfIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsIfIndex", "1.3.6.1.2.1.16.10.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsRingNumberEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsRingNumberEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsRingNumber", "1.3.6.1.2.1.16.10.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsInFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsInFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsInFrames", "1.3.6.1.2.1.16.10.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsOutFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsOutFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsOutFrames", "1.3.6.1.2.1.16.10.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsThroughFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsThroughFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsThroughFrames", "1.3.6.1.2.1.16.10.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsAllRoutesBroadcastFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsAllRoutesBroadcastFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsAllRoutesBroadcastFrames", "1.3.6.1.2.1.16.10.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsSingleRouteBroadcastFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsSingleRouteBroadcastFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsSingleRouteBroadcastFrames", "1.3.6.1.2.1.16.10.6.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsInOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsInOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsInOctets", "1.3.6.1.2.1.16.10.6.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsOutOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsOutOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsOutOctets", "1.3.6.1.2.1.16.10.6.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsThroughOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsThroughOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsThroughOctets", "1.3.6.1.2.1.16.10.6.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsAllRoutesBroadcastOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsAllRoutesBroadcastOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsAllRoutesBroadcastOctets", "1.3.6.1.2.1.16.10.6.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsSingleRoutesBroadcastOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsSingleRoutesBroadcastOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsSingleRoutesBroadcastOctets", "1.3.6.1.2.1.16.10.6.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsLocalLLCFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsLocalLLCFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsLocalLLCFrames", "1.3.6.1.2.1.16.10.6.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats1HopFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats1HopFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats1HopFrames", "1.3.6.1.2.1.16.10.6.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats2HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats2HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats2HopsFrames", "1.3.6.1.2.1.16.10.6.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats3HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats3HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats3HopsFrames", "1.3.6.1.2.1.16.10.6.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats4HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats4HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats4HopsFrames", "1.3.6.1.2.1.16.10.6.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats5HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats5HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats5HopsFrames", "1.3.6.1.2.1.16.10.6.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats6HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats6HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats6HopsFrames", "1.3.6.1.2.1.16.10.6.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats7HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats7HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats7HopsFrames", "1.3.6.1.2.1.16.10.6.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStats8HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStats8HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStats8HopsFrames", "1.3.6.1.2.1.16.10.6.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsMoreThan8HopsFramesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsMoreThan8HopsFramesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsMoreThan8HopsFrames", "1.3.6.1.2.1.16.10.6.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsOwnerEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsOwnerEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsOwner", "1.3.6.1.2.1.16.10.6.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SourceRoutingStatsStatusEnt extends MIBEntry<TOKENRINGRMONMIBDef>
                {
                    private SourceRoutingStatsStatusEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                    {
                        super(mib, parent, "sourceRoutingStatsStatus", "1.3.6.1.2.1.16.10.6.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class TokenRingMLStatsTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
    {
        public final TokenRingMLStatsEntryEnt tokenRingMLStatsEntry;

        private TokenRingMLStatsTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
        {
            super(mib, parent, "tokenRingMLStatsTable", "1.3.6.1.2.1.16.1.2", false, true, false, false);
            this.tokenRingMLStatsEntry = new TokenRingMLStatsEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tokenRingMLStatsEntry
            };
        }
        public static final class TokenRingMLStatsEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final TokenRingMLStatsIndexEnt tokenRingMLStatsIndex;

            public final TokenRingMLStatsDataSourceEnt tokenRingMLStatsDataSource;

            public final TokenRingMLStatsDropEventsEnt tokenRingMLStatsDropEvents;

            public final TokenRingMLStatsMacOctetsEnt tokenRingMLStatsMacOctets;

            public final TokenRingMLStatsMacPktsEnt tokenRingMLStatsMacPkts;

            public final TokenRingMLStatsRingPurgeEventsEnt tokenRingMLStatsRingPurgeEvents;

            public final TokenRingMLStatsRingPurgePktsEnt tokenRingMLStatsRingPurgePkts;

            public final TokenRingMLStatsBeaconEventsEnt tokenRingMLStatsBeaconEvents;

            public final TokenRingMLStatsBeaconTimeEnt tokenRingMLStatsBeaconTime;

            public final TokenRingMLStatsBeaconPktsEnt tokenRingMLStatsBeaconPkts;

            public final TokenRingMLStatsClaimTokenEventsEnt tokenRingMLStatsClaimTokenEvents;

            public final TokenRingMLStatsClaimTokenPktsEnt tokenRingMLStatsClaimTokenPkts;

            public final TokenRingMLStatsNAUNChangesEnt tokenRingMLStatsNAUNChanges;

            public final TokenRingMLStatsLineErrorsEnt tokenRingMLStatsLineErrors;

            public final TokenRingMLStatsInternalErrorsEnt tokenRingMLStatsInternalErrors;

            public final TokenRingMLStatsBurstErrorsEnt tokenRingMLStatsBurstErrors;

            public final TokenRingMLStatsACErrorsEnt tokenRingMLStatsACErrors;

            public final TokenRingMLStatsAbortErrorsEnt tokenRingMLStatsAbortErrors;

            public final TokenRingMLStatsLostFrameErrorsEnt tokenRingMLStatsLostFrameErrors;

            public final TokenRingMLStatsCongestionErrorsEnt tokenRingMLStatsCongestionErrors;

            public final TokenRingMLStatsFrameCopiedErrorsEnt tokenRingMLStatsFrameCopiedErrors;

            public final TokenRingMLStatsFrequencyErrorsEnt tokenRingMLStatsFrequencyErrors;

            public final TokenRingMLStatsTokenErrorsEnt tokenRingMLStatsTokenErrors;

            public final TokenRingMLStatsSoftErrorReportsEnt tokenRingMLStatsSoftErrorReports;

            public final TokenRingMLStatsRingPollEventsEnt tokenRingMLStatsRingPollEvents;

            public final TokenRingMLStatsOwnerEnt tokenRingMLStatsOwner;

            public final TokenRingMLStatsStatusEnt tokenRingMLStatsStatus;

            private TokenRingMLStatsEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "tokenRingMLStatsEntry", "1.3.6.1.2.1.16.1.2.1", false, false, false, true);
                this.tokenRingMLStatsIndex = new TokenRingMLStatsIndexEnt(mib, this);
                this.tokenRingMLStatsDataSource = new TokenRingMLStatsDataSourceEnt(mib, this);
                this.tokenRingMLStatsDropEvents = new TokenRingMLStatsDropEventsEnt(mib, this);
                this.tokenRingMLStatsMacOctets = new TokenRingMLStatsMacOctetsEnt(mib, this);
                this.tokenRingMLStatsMacPkts = new TokenRingMLStatsMacPktsEnt(mib, this);
                this.tokenRingMLStatsRingPurgeEvents = new TokenRingMLStatsRingPurgeEventsEnt(mib, this);
                this.tokenRingMLStatsRingPurgePkts = new TokenRingMLStatsRingPurgePktsEnt(mib, this);
                this.tokenRingMLStatsBeaconEvents = new TokenRingMLStatsBeaconEventsEnt(mib, this);
                this.tokenRingMLStatsBeaconTime = new TokenRingMLStatsBeaconTimeEnt(mib, this);
                this.tokenRingMLStatsBeaconPkts = new TokenRingMLStatsBeaconPktsEnt(mib, this);
                this.tokenRingMLStatsClaimTokenEvents = new TokenRingMLStatsClaimTokenEventsEnt(mib, this);
                this.tokenRingMLStatsClaimTokenPkts = new TokenRingMLStatsClaimTokenPktsEnt(mib, this);
                this.tokenRingMLStatsNAUNChanges = new TokenRingMLStatsNAUNChangesEnt(mib, this);
                this.tokenRingMLStatsLineErrors = new TokenRingMLStatsLineErrorsEnt(mib, this);
                this.tokenRingMLStatsInternalErrors = new TokenRingMLStatsInternalErrorsEnt(mib, this);
                this.tokenRingMLStatsBurstErrors = new TokenRingMLStatsBurstErrorsEnt(mib, this);
                this.tokenRingMLStatsACErrors = new TokenRingMLStatsACErrorsEnt(mib, this);
                this.tokenRingMLStatsAbortErrors = new TokenRingMLStatsAbortErrorsEnt(mib, this);
                this.tokenRingMLStatsLostFrameErrors = new TokenRingMLStatsLostFrameErrorsEnt(mib, this);
                this.tokenRingMLStatsCongestionErrors = new TokenRingMLStatsCongestionErrorsEnt(mib, this);
                this.tokenRingMLStatsFrameCopiedErrors = new TokenRingMLStatsFrameCopiedErrorsEnt(mib, this);
                this.tokenRingMLStatsFrequencyErrors = new TokenRingMLStatsFrequencyErrorsEnt(mib, this);
                this.tokenRingMLStatsTokenErrors = new TokenRingMLStatsTokenErrorsEnt(mib, this);
                this.tokenRingMLStatsSoftErrorReports = new TokenRingMLStatsSoftErrorReportsEnt(mib, this);
                this.tokenRingMLStatsRingPollEvents = new TokenRingMLStatsRingPollEventsEnt(mib, this);
                this.tokenRingMLStatsOwner = new TokenRingMLStatsOwnerEnt(mib, this);
                this.tokenRingMLStatsStatus = new TokenRingMLStatsStatusEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tokenRingMLStatsIndex,
                    this.tokenRingMLStatsDataSource,
                    this.tokenRingMLStatsDropEvents,
                    this.tokenRingMLStatsMacOctets,
                    this.tokenRingMLStatsMacPkts,
                    this.tokenRingMLStatsRingPurgeEvents,
                    this.tokenRingMLStatsRingPurgePkts,
                    this.tokenRingMLStatsBeaconEvents,
                    this.tokenRingMLStatsBeaconTime,
                    this.tokenRingMLStatsBeaconPkts,
                    this.tokenRingMLStatsClaimTokenEvents,
                    this.tokenRingMLStatsClaimTokenPkts,
                    this.tokenRingMLStatsNAUNChanges,
                    this.tokenRingMLStatsLineErrors,
                    this.tokenRingMLStatsInternalErrors,
                    this.tokenRingMLStatsBurstErrors,
                    this.tokenRingMLStatsACErrors,
                    this.tokenRingMLStatsAbortErrors,
                    this.tokenRingMLStatsLostFrameErrors,
                    this.tokenRingMLStatsCongestionErrors,
                    this.tokenRingMLStatsFrameCopiedErrors,
                    this.tokenRingMLStatsFrequencyErrors,
                    this.tokenRingMLStatsTokenErrors,
                    this.tokenRingMLStatsSoftErrorReports,
                    this.tokenRingMLStatsRingPollEvents,
                    this.tokenRingMLStatsOwner,
                    this.tokenRingMLStatsStatus
                };
            }
            public static final class TokenRingMLStatsIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsIndex", "1.3.6.1.2.1.16.1.2.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsDataSourceEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsDataSourceEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsDataSource", "1.3.6.1.2.1.16.1.2.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsDropEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsDropEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsDropEvents", "1.3.6.1.2.1.16.1.2.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsMacOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsMacOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsMacOctets", "1.3.6.1.2.1.16.1.2.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsMacPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsMacPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsMacPkts", "1.3.6.1.2.1.16.1.2.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsRingPurgeEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsRingPurgeEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsRingPurgeEvents", "1.3.6.1.2.1.16.1.2.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsRingPurgePktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsRingPurgePktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsRingPurgePkts", "1.3.6.1.2.1.16.1.2.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsBeaconEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsBeaconEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsBeaconEvents", "1.3.6.1.2.1.16.1.2.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsBeaconTimeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsBeaconTimeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsBeaconTime", "1.3.6.1.2.1.16.1.2.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsBeaconPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsBeaconPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsBeaconPkts", "1.3.6.1.2.1.16.1.2.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsClaimTokenEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsClaimTokenEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsClaimTokenEvents", "1.3.6.1.2.1.16.1.2.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsClaimTokenPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsClaimTokenPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsClaimTokenPkts", "1.3.6.1.2.1.16.1.2.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsNAUNChangesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsNAUNChangesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsNAUNChanges", "1.3.6.1.2.1.16.1.2.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsLineErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsLineErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsLineErrors", "1.3.6.1.2.1.16.1.2.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsInternalErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsInternalErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsInternalErrors", "1.3.6.1.2.1.16.1.2.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsBurstErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsBurstErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsBurstErrors", "1.3.6.1.2.1.16.1.2.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsACErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsACErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsACErrors", "1.3.6.1.2.1.16.1.2.1.17", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsAbortErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsAbortErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsAbortErrors", "1.3.6.1.2.1.16.1.2.1.18", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsLostFrameErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsLostFrameErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsLostFrameErrors", "1.3.6.1.2.1.16.1.2.1.19", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsCongestionErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsCongestionErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsCongestionErrors", "1.3.6.1.2.1.16.1.2.1.20", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsFrameCopiedErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsFrameCopiedErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsFrameCopiedErrors", "1.3.6.1.2.1.16.1.2.1.21", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsFrequencyErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsFrequencyErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsFrequencyErrors", "1.3.6.1.2.1.16.1.2.1.22", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsTokenErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsTokenErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsTokenErrors", "1.3.6.1.2.1.16.1.2.1.23", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsSoftErrorReportsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsSoftErrorReportsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsSoftErrorReports", "1.3.6.1.2.1.16.1.2.1.24", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsRingPollEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsRingPollEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsRingPollEvents", "1.3.6.1.2.1.16.1.2.1.25", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsOwnerEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsOwnerEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsOwner", "1.3.6.1.2.1.16.1.2.1.26", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsStatusEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLStatsStatusEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsStatus", "1.3.6.1.2.1.16.1.2.1.27", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class TokenRingPStatsTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
    {
        public final TokenRingPStatsEntryEnt tokenRingPStatsEntry;

        private TokenRingPStatsTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
        {
            super(mib, parent, "tokenRingPStatsTable", "1.3.6.1.2.1.16.1.3", false, true, false, false);
            this.tokenRingPStatsEntry = new TokenRingPStatsEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tokenRingPStatsEntry
            };
        }
        public static final class TokenRingPStatsEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final TokenRingPStatsIndexEnt tokenRingPStatsIndex;

            public final TokenRingPStatsDataSourceEnt tokenRingPStatsDataSource;

            public final TokenRingPStatsDropEventsEnt tokenRingPStatsDropEvents;

            public final TokenRingPStatsDataOctetsEnt tokenRingPStatsDataOctets;

            public final TokenRingPStatsDataPktsEnt tokenRingPStatsDataPkts;

            public final TokenRingPStatsDataBroadcastPktsEnt tokenRingPStatsDataBroadcastPkts;

            public final TokenRingPStatsDataMulticastPktsEnt tokenRingPStatsDataMulticastPkts;

            public final TokenRingPStatsDataPkts18to63OctetsEnt tokenRingPStatsDataPkts18to63Octets;

            public final TokenRingPStatsDataPkts64to127OctetsEnt tokenRingPStatsDataPkts64to127Octets;

            public final TokenRingPStatsDataPkts128to255OctetsEnt tokenRingPStatsDataPkts128to255Octets;

            public final TokenRingPStatsDataPkts256to511OctetsEnt tokenRingPStatsDataPkts256to511Octets;

            public final TokenRingPStatsDataPkts512to1023OctetsEnt tokenRingPStatsDataPkts512to1023Octets;

            public final TokenRingPStatsDataPkts1024to2047OctetsEnt tokenRingPStatsDataPkts1024to2047Octets;

            public final TokenRingPStatsDataPkts2048to4095OctetsEnt tokenRingPStatsDataPkts2048to4095Octets;

            public final TokenRingPStatsDataPkts4096to8191OctetsEnt tokenRingPStatsDataPkts4096to8191Octets;

            public final TokenRingPStatsDataPkts8192to18000OctetsEnt tokenRingPStatsDataPkts8192to18000Octets;

            public final TokenRingPStatsDataPktsGreaterThan18000OctetsEnt tokenRingPStatsDataPktsGreaterThan18000Octets;

            public final TokenRingPStatsOwnerEnt tokenRingPStatsOwner;

            public final TokenRingPStatsStatusEnt tokenRingPStatsStatus;

            private TokenRingPStatsEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "tokenRingPStatsEntry", "1.3.6.1.2.1.16.1.3.1", false, false, false, true);
                this.tokenRingPStatsIndex = new TokenRingPStatsIndexEnt(mib, this);
                this.tokenRingPStatsDataSource = new TokenRingPStatsDataSourceEnt(mib, this);
                this.tokenRingPStatsDropEvents = new TokenRingPStatsDropEventsEnt(mib, this);
                this.tokenRingPStatsDataOctets = new TokenRingPStatsDataOctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts = new TokenRingPStatsDataPktsEnt(mib, this);
                this.tokenRingPStatsDataBroadcastPkts = new TokenRingPStatsDataBroadcastPktsEnt(mib, this);
                this.tokenRingPStatsDataMulticastPkts = new TokenRingPStatsDataMulticastPktsEnt(mib, this);
                this.tokenRingPStatsDataPkts18to63Octets = new TokenRingPStatsDataPkts18to63OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts64to127Octets = new TokenRingPStatsDataPkts64to127OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts128to255Octets = new TokenRingPStatsDataPkts128to255OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts256to511Octets = new TokenRingPStatsDataPkts256to511OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts512to1023Octets = new TokenRingPStatsDataPkts512to1023OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts1024to2047Octets = new TokenRingPStatsDataPkts1024to2047OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts2048to4095Octets = new TokenRingPStatsDataPkts2048to4095OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts4096to8191Octets = new TokenRingPStatsDataPkts4096to8191OctetsEnt(mib, this);
                this.tokenRingPStatsDataPkts8192to18000Octets = new TokenRingPStatsDataPkts8192to18000OctetsEnt(mib, this);
                this.tokenRingPStatsDataPktsGreaterThan18000Octets = new TokenRingPStatsDataPktsGreaterThan18000OctetsEnt(mib, this);
                this.tokenRingPStatsOwner = new TokenRingPStatsOwnerEnt(mib, this);
                this.tokenRingPStatsStatus = new TokenRingPStatsStatusEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tokenRingPStatsIndex,
                    this.tokenRingPStatsDataSource,
                    this.tokenRingPStatsDropEvents,
                    this.tokenRingPStatsDataOctets,
                    this.tokenRingPStatsDataPkts,
                    this.tokenRingPStatsDataBroadcastPkts,
                    this.tokenRingPStatsDataMulticastPkts,
                    this.tokenRingPStatsDataPkts18to63Octets,
                    this.tokenRingPStatsDataPkts64to127Octets,
                    this.tokenRingPStatsDataPkts128to255Octets,
                    this.tokenRingPStatsDataPkts256to511Octets,
                    this.tokenRingPStatsDataPkts512to1023Octets,
                    this.tokenRingPStatsDataPkts1024to2047Octets,
                    this.tokenRingPStatsDataPkts2048to4095Octets,
                    this.tokenRingPStatsDataPkts4096to8191Octets,
                    this.tokenRingPStatsDataPkts8192to18000Octets,
                    this.tokenRingPStatsDataPktsGreaterThan18000Octets,
                    this.tokenRingPStatsOwner,
                    this.tokenRingPStatsStatus
                };
            }
            public static final class TokenRingPStatsIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsIndex", "1.3.6.1.2.1.16.1.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataSourceEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataSourceEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataSource", "1.3.6.1.2.1.16.1.3.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDropEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDropEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDropEvents", "1.3.6.1.2.1.16.1.3.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataOctets", "1.3.6.1.2.1.16.1.3.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts", "1.3.6.1.2.1.16.1.3.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataBroadcastPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataBroadcastPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataBroadcastPkts", "1.3.6.1.2.1.16.1.3.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataMulticastPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataMulticastPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataMulticastPkts", "1.3.6.1.2.1.16.1.3.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts18to63OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts18to63OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts18to63Octets", "1.3.6.1.2.1.16.1.3.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts64to127OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts64to127OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts64to127Octets", "1.3.6.1.2.1.16.1.3.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts128to255OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts128to255OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts128to255Octets", "1.3.6.1.2.1.16.1.3.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts256to511OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts256to511OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts256to511Octets", "1.3.6.1.2.1.16.1.3.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts512to1023OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts512to1023OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts512to1023Octets", "1.3.6.1.2.1.16.1.3.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts1024to2047OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts1024to2047OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts1024to2047Octets", "1.3.6.1.2.1.16.1.3.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts2048to4095OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts2048to4095OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts2048to4095Octets", "1.3.6.1.2.1.16.1.3.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts4096to8191OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts4096to8191OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts4096to8191Octets", "1.3.6.1.2.1.16.1.3.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPkts8192to18000OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPkts8192to18000OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPkts8192to18000Octets", "1.3.6.1.2.1.16.1.3.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsDataPktsGreaterThan18000OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsDataPktsGreaterThan18000OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDataPktsGreaterThan18000Octets", "1.3.6.1.2.1.16.1.3.1.17", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsOwnerEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsOwnerEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsOwner", "1.3.6.1.2.1.16.1.3.1.18", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsStatusEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPStatsStatusEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsStatus", "1.3.6.1.2.1.16.1.3.1.19", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class TokenRingMLHistoryTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
    {
        public final TokenRingMLHistoryEntryEnt tokenRingMLHistoryEntry;

        private TokenRingMLHistoryTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
        {
            super(mib, parent, "tokenRingMLHistoryTable", "1.3.6.1.2.1.16.2.3", false, true, false, false);
            this.tokenRingMLHistoryEntry = new TokenRingMLHistoryEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tokenRingMLHistoryEntry
            };
        }
        public static final class TokenRingMLHistoryEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final TokenRingMLHistoryIndexEnt tokenRingMLHistoryIndex;

            public final TokenRingMLHistorySampleIndexEnt tokenRingMLHistorySampleIndex;

            public final TokenRingMLHistoryIntervalStartEnt tokenRingMLHistoryIntervalStart;

            public final TokenRingMLHistoryDropEventsEnt tokenRingMLHistoryDropEvents;

            public final TokenRingMLHistoryMacOctetsEnt tokenRingMLHistoryMacOctets;

            public final TokenRingMLHistoryMacPktsEnt tokenRingMLHistoryMacPkts;

            public final TokenRingMLHistoryRingPurgeEventsEnt tokenRingMLHistoryRingPurgeEvents;

            public final TokenRingMLHistoryRingPurgePktsEnt tokenRingMLHistoryRingPurgePkts;

            public final TokenRingMLHistoryBeaconEventsEnt tokenRingMLHistoryBeaconEvents;

            public final TokenRingMLHistoryBeaconTimeEnt tokenRingMLHistoryBeaconTime;

            public final TokenRingMLHistoryBeaconPktsEnt tokenRingMLHistoryBeaconPkts;

            public final TokenRingMLHistoryClaimTokenEventsEnt tokenRingMLHistoryClaimTokenEvents;

            public final TokenRingMLHistoryClaimTokenPktsEnt tokenRingMLHistoryClaimTokenPkts;

            public final TokenRingMLHistoryNAUNChangesEnt tokenRingMLHistoryNAUNChanges;

            public final TokenRingMLHistoryLineErrorsEnt tokenRingMLHistoryLineErrors;

            public final TokenRingMLHistoryInternalErrorsEnt tokenRingMLHistoryInternalErrors;

            public final TokenRingMLHistoryBurstErrorsEnt tokenRingMLHistoryBurstErrors;

            public final TokenRingMLHistoryACErrorsEnt tokenRingMLHistoryACErrors;

            public final TokenRingMLHistoryAbortErrorsEnt tokenRingMLHistoryAbortErrors;

            public final TokenRingMLHistoryLostFrameErrorsEnt tokenRingMLHistoryLostFrameErrors;

            public final TokenRingMLHistoryCongestionErrorsEnt tokenRingMLHistoryCongestionErrors;

            public final TokenRingMLHistoryFrameCopiedErrorsEnt tokenRingMLHistoryFrameCopiedErrors;

            public final TokenRingMLHistoryFrequencyErrorsEnt tokenRingMLHistoryFrequencyErrors;

            public final TokenRingMLHistoryTokenErrorsEnt tokenRingMLHistoryTokenErrors;

            public final TokenRingMLHistorySoftErrorReportsEnt tokenRingMLHistorySoftErrorReports;

            public final TokenRingMLHistoryRingPollEventsEnt tokenRingMLHistoryRingPollEvents;

            public final TokenRingMLHistoryActiveStationsEnt tokenRingMLHistoryActiveStations;

            private TokenRingMLHistoryEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "tokenRingMLHistoryEntry", "1.3.6.1.2.1.16.2.3.1", false, false, false, true);
                this.tokenRingMLHistoryIndex = new TokenRingMLHistoryIndexEnt(mib, this);
                this.tokenRingMLHistorySampleIndex = new TokenRingMLHistorySampleIndexEnt(mib, this);
                this.tokenRingMLHistoryIntervalStart = new TokenRingMLHistoryIntervalStartEnt(mib, this);
                this.tokenRingMLHistoryDropEvents = new TokenRingMLHistoryDropEventsEnt(mib, this);
                this.tokenRingMLHistoryMacOctets = new TokenRingMLHistoryMacOctetsEnt(mib, this);
                this.tokenRingMLHistoryMacPkts = new TokenRingMLHistoryMacPktsEnt(mib, this);
                this.tokenRingMLHistoryRingPurgeEvents = new TokenRingMLHistoryRingPurgeEventsEnt(mib, this);
                this.tokenRingMLHistoryRingPurgePkts = new TokenRingMLHistoryRingPurgePktsEnt(mib, this);
                this.tokenRingMLHistoryBeaconEvents = new TokenRingMLHistoryBeaconEventsEnt(mib, this);
                this.tokenRingMLHistoryBeaconTime = new TokenRingMLHistoryBeaconTimeEnt(mib, this);
                this.tokenRingMLHistoryBeaconPkts = new TokenRingMLHistoryBeaconPktsEnt(mib, this);
                this.tokenRingMLHistoryClaimTokenEvents = new TokenRingMLHistoryClaimTokenEventsEnt(mib, this);
                this.tokenRingMLHistoryClaimTokenPkts = new TokenRingMLHistoryClaimTokenPktsEnt(mib, this);
                this.tokenRingMLHistoryNAUNChanges = new TokenRingMLHistoryNAUNChangesEnt(mib, this);
                this.tokenRingMLHistoryLineErrors = new TokenRingMLHistoryLineErrorsEnt(mib, this);
                this.tokenRingMLHistoryInternalErrors = new TokenRingMLHistoryInternalErrorsEnt(mib, this);
                this.tokenRingMLHistoryBurstErrors = new TokenRingMLHistoryBurstErrorsEnt(mib, this);
                this.tokenRingMLHistoryACErrors = new TokenRingMLHistoryACErrorsEnt(mib, this);
                this.tokenRingMLHistoryAbortErrors = new TokenRingMLHistoryAbortErrorsEnt(mib, this);
                this.tokenRingMLHistoryLostFrameErrors = new TokenRingMLHistoryLostFrameErrorsEnt(mib, this);
                this.tokenRingMLHistoryCongestionErrors = new TokenRingMLHistoryCongestionErrorsEnt(mib, this);
                this.tokenRingMLHistoryFrameCopiedErrors = new TokenRingMLHistoryFrameCopiedErrorsEnt(mib, this);
                this.tokenRingMLHistoryFrequencyErrors = new TokenRingMLHistoryFrequencyErrorsEnt(mib, this);
                this.tokenRingMLHistoryTokenErrors = new TokenRingMLHistoryTokenErrorsEnt(mib, this);
                this.tokenRingMLHistorySoftErrorReports = new TokenRingMLHistorySoftErrorReportsEnt(mib, this);
                this.tokenRingMLHistoryRingPollEvents = new TokenRingMLHistoryRingPollEventsEnt(mib, this);
                this.tokenRingMLHistoryActiveStations = new TokenRingMLHistoryActiveStationsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tokenRingMLHistoryIndex,
                    this.tokenRingMLHistorySampleIndex,
                    this.tokenRingMLHistoryIntervalStart,
                    this.tokenRingMLHistoryDropEvents,
                    this.tokenRingMLHistoryMacOctets,
                    this.tokenRingMLHistoryMacPkts,
                    this.tokenRingMLHistoryRingPurgeEvents,
                    this.tokenRingMLHistoryRingPurgePkts,
                    this.tokenRingMLHistoryBeaconEvents,
                    this.tokenRingMLHistoryBeaconTime,
                    this.tokenRingMLHistoryBeaconPkts,
                    this.tokenRingMLHistoryClaimTokenEvents,
                    this.tokenRingMLHistoryClaimTokenPkts,
                    this.tokenRingMLHistoryNAUNChanges,
                    this.tokenRingMLHistoryLineErrors,
                    this.tokenRingMLHistoryInternalErrors,
                    this.tokenRingMLHistoryBurstErrors,
                    this.tokenRingMLHistoryACErrors,
                    this.tokenRingMLHistoryAbortErrors,
                    this.tokenRingMLHistoryLostFrameErrors,
                    this.tokenRingMLHistoryCongestionErrors,
                    this.tokenRingMLHistoryFrameCopiedErrors,
                    this.tokenRingMLHistoryFrequencyErrors,
                    this.tokenRingMLHistoryTokenErrors,
                    this.tokenRingMLHistorySoftErrorReports,
                    this.tokenRingMLHistoryRingPollEvents,
                    this.tokenRingMLHistoryActiveStations
                };
            }
            public static final class TokenRingMLHistoryIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryIndex", "1.3.6.1.2.1.16.2.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistorySampleIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistorySampleIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistorySampleIndex", "1.3.6.1.2.1.16.2.3.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryIntervalStartEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryIntervalStartEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryIntervalStart", "1.3.6.1.2.1.16.2.3.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryDropEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryDropEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryDropEvents", "1.3.6.1.2.1.16.2.3.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryMacOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryMacOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryMacOctets", "1.3.6.1.2.1.16.2.3.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryMacPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryMacPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryMacPkts", "1.3.6.1.2.1.16.2.3.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryRingPurgeEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryRingPurgeEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryRingPurgeEvents", "1.3.6.1.2.1.16.2.3.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryRingPurgePktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryRingPurgePktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryRingPurgePkts", "1.3.6.1.2.1.16.2.3.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryBeaconEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryBeaconEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryBeaconEvents", "1.3.6.1.2.1.16.2.3.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryBeaconTimeEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryBeaconTimeEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryBeaconTime", "1.3.6.1.2.1.16.2.3.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryBeaconPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryBeaconPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryBeaconPkts", "1.3.6.1.2.1.16.2.3.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryClaimTokenEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryClaimTokenEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryClaimTokenEvents", "1.3.6.1.2.1.16.2.3.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryClaimTokenPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryClaimTokenPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryClaimTokenPkts", "1.3.6.1.2.1.16.2.3.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryNAUNChangesEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryNAUNChangesEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryNAUNChanges", "1.3.6.1.2.1.16.2.3.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryLineErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryLineErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryLineErrors", "1.3.6.1.2.1.16.2.3.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryInternalErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryInternalErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryInternalErrors", "1.3.6.1.2.1.16.2.3.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryBurstErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryBurstErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryBurstErrors", "1.3.6.1.2.1.16.2.3.1.17", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryACErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryACErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryACErrors", "1.3.6.1.2.1.16.2.3.1.18", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryAbortErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryAbortErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryAbortErrors", "1.3.6.1.2.1.16.2.3.1.19", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryLostFrameErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryLostFrameErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryLostFrameErrors", "1.3.6.1.2.1.16.2.3.1.20", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryCongestionErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryCongestionErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryCongestionErrors", "1.3.6.1.2.1.16.2.3.1.21", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryFrameCopiedErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryFrameCopiedErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryFrameCopiedErrors", "1.3.6.1.2.1.16.2.3.1.22", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryFrequencyErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryFrequencyErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryFrequencyErrors", "1.3.6.1.2.1.16.2.3.1.23", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryTokenErrorsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryTokenErrorsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryTokenErrors", "1.3.6.1.2.1.16.2.3.1.24", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistorySoftErrorReportsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistorySoftErrorReportsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistorySoftErrorReports", "1.3.6.1.2.1.16.2.3.1.25", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryRingPollEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryRingPollEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryRingPollEvents", "1.3.6.1.2.1.16.2.3.1.26", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLHistoryActiveStationsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingMLHistoryActiveStationsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLHistoryActiveStations", "1.3.6.1.2.1.16.2.3.1.27", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class TokenRingPHistoryTableEnt extends MIBEntry<TOKENRINGRMONMIBDef>
    {
        public final TokenRingPHistoryEntryEnt tokenRingPHistoryEntry;

        private TokenRingPHistoryTableEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
        {
            super(mib, parent, "tokenRingPHistoryTable", "1.3.6.1.2.1.16.2.4", false, true, false, false);
            this.tokenRingPHistoryEntry = new TokenRingPHistoryEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tokenRingPHistoryEntry
            };
        }
        public static final class TokenRingPHistoryEntryEnt extends MIBEntry<TOKENRINGRMONMIBDef>
        {
            public final TokenRingPHistoryIndexEnt tokenRingPHistoryIndex;

            public final TokenRingPHistorySampleIndexEnt tokenRingPHistorySampleIndex;

            public final TokenRingPHistoryIntervalStartEnt tokenRingPHistoryIntervalStart;

            public final TokenRingPHistoryDropEventsEnt tokenRingPHistoryDropEvents;

            public final TokenRingPHistoryDataOctetsEnt tokenRingPHistoryDataOctets;

            public final TokenRingPHistoryDataPktsEnt tokenRingPHistoryDataPkts;

            public final TokenRingPHistoryDataBroadcastPktsEnt tokenRingPHistoryDataBroadcastPkts;

            public final TokenRingPHistoryDataMulticastPktsEnt tokenRingPHistoryDataMulticastPkts;

            public final TokenRingPHistoryDataPkts18to63OctetsEnt tokenRingPHistoryDataPkts18to63Octets;

            public final TokenRingPHistoryDataPkts64to127OctetsEnt tokenRingPHistoryDataPkts64to127Octets;

            public final TokenRingPHistoryDataPkts128to255OctetsEnt tokenRingPHistoryDataPkts128to255Octets;

            public final TokenRingPHistoryDataPkts256to511OctetsEnt tokenRingPHistoryDataPkts256to511Octets;

            public final TokenRingPHistoryDataPkts512to1023OctetsEnt tokenRingPHistoryDataPkts512to1023Octets;

            public final TokenRingPHistoryDataPkts1024to2047OctetsEnt tokenRingPHistoryDataPkts1024to2047Octets;

            public final TokenRingPHistoryDataPkts2048to4095OctetsEnt tokenRingPHistoryDataPkts2048to4095Octets;

            public final TokenRingPHistoryDataPkts4096to8191OctetsEnt tokenRingPHistoryDataPkts4096to8191Octets;

            public final TokenRingPHistoryDataPkts8192to18000OctetsEnt tokenRingPHistoryDataPkts8192to18000Octets;

            public final TokenRingPHistoryDataPktsGreaterThan18000OctetsEnt tokenRingPHistoryDataPktsGreaterThan18000Octets;

            private TokenRingPHistoryEntryEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
            {
                super(mib, parent, "tokenRingPHistoryEntry", "1.3.6.1.2.1.16.2.4.1", false, false, false, true);
                this.tokenRingPHistoryIndex = new TokenRingPHistoryIndexEnt(mib, this);
                this.tokenRingPHistorySampleIndex = new TokenRingPHistorySampleIndexEnt(mib, this);
                this.tokenRingPHistoryIntervalStart = new TokenRingPHistoryIntervalStartEnt(mib, this);
                this.tokenRingPHistoryDropEvents = new TokenRingPHistoryDropEventsEnt(mib, this);
                this.tokenRingPHistoryDataOctets = new TokenRingPHistoryDataOctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts = new TokenRingPHistoryDataPktsEnt(mib, this);
                this.tokenRingPHistoryDataBroadcastPkts = new TokenRingPHistoryDataBroadcastPktsEnt(mib, this);
                this.tokenRingPHistoryDataMulticastPkts = new TokenRingPHistoryDataMulticastPktsEnt(mib, this);
                this.tokenRingPHistoryDataPkts18to63Octets = new TokenRingPHistoryDataPkts18to63OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts64to127Octets = new TokenRingPHistoryDataPkts64to127OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts128to255Octets = new TokenRingPHistoryDataPkts128to255OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts256to511Octets = new TokenRingPHistoryDataPkts256to511OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts512to1023Octets = new TokenRingPHistoryDataPkts512to1023OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts1024to2047Octets = new TokenRingPHistoryDataPkts1024to2047OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts2048to4095Octets = new TokenRingPHistoryDataPkts2048to4095OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts4096to8191Octets = new TokenRingPHistoryDataPkts4096to8191OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPkts8192to18000Octets = new TokenRingPHistoryDataPkts8192to18000OctetsEnt(mib, this);
                this.tokenRingPHistoryDataPktsGreaterThan18000Octets = new TokenRingPHistoryDataPktsGreaterThan18000OctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tokenRingPHistoryIndex,
                    this.tokenRingPHistorySampleIndex,
                    this.tokenRingPHistoryIntervalStart,
                    this.tokenRingPHistoryDropEvents,
                    this.tokenRingPHistoryDataOctets,
                    this.tokenRingPHistoryDataPkts,
                    this.tokenRingPHistoryDataBroadcastPkts,
                    this.tokenRingPHistoryDataMulticastPkts,
                    this.tokenRingPHistoryDataPkts18to63Octets,
                    this.tokenRingPHistoryDataPkts64to127Octets,
                    this.tokenRingPHistoryDataPkts128to255Octets,
                    this.tokenRingPHistoryDataPkts256to511Octets,
                    this.tokenRingPHistoryDataPkts512to1023Octets,
                    this.tokenRingPHistoryDataPkts1024to2047Octets,
                    this.tokenRingPHistoryDataPkts2048to4095Octets,
                    this.tokenRingPHistoryDataPkts4096to8191Octets,
                    this.tokenRingPHistoryDataPkts8192to18000Octets,
                    this.tokenRingPHistoryDataPktsGreaterThan18000Octets
                };
            }
            public static final class TokenRingPHistoryIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryIndex", "1.3.6.1.2.1.16.2.4.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistorySampleIndexEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistorySampleIndexEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistorySampleIndex", "1.3.6.1.2.1.16.2.4.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryIntervalStartEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryIntervalStartEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryIntervalStart", "1.3.6.1.2.1.16.2.4.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDropEventsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDropEventsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDropEvents", "1.3.6.1.2.1.16.2.4.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataOctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataOctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataOctets", "1.3.6.1.2.1.16.2.4.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts", "1.3.6.1.2.1.16.2.4.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataBroadcastPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataBroadcastPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataBroadcastPkts", "1.3.6.1.2.1.16.2.4.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataMulticastPktsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataMulticastPktsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataMulticastPkts", "1.3.6.1.2.1.16.2.4.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts18to63OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts18to63OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts18to63Octets", "1.3.6.1.2.1.16.2.4.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts64to127OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts64to127OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts64to127Octets", "1.3.6.1.2.1.16.2.4.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts128to255OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts128to255OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts128to255Octets", "1.3.6.1.2.1.16.2.4.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts256to511OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts256to511OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts256to511Octets", "1.3.6.1.2.1.16.2.4.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts512to1023OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts512to1023OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts512to1023Octets", "1.3.6.1.2.1.16.2.4.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts1024to2047OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts1024to2047OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts1024to2047Octets", "1.3.6.1.2.1.16.2.4.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts2048to4095OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts2048to4095OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts2048to4095Octets", "1.3.6.1.2.1.16.2.4.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts4096to8191OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts4096to8191OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts4096to8191Octets", "1.3.6.1.2.1.16.2.4.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPkts8192to18000OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPkts8192to18000OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPkts8192to18000Octets", "1.3.6.1.2.1.16.2.4.1.17", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPHistoryDataPktsGreaterThan18000OctetsEnt extends MIBEntry<TOKENRINGRMONMIBDef>
            {
                private TokenRingPHistoryDataPktsGreaterThan18000OctetsEnt(TOKENRINGRMONMIBDef mib, MIBEntry<TOKENRINGRMONMIBDef> parent)
                {
                    super(mib, parent, "tokenRingPHistoryDataPktsGreaterThan18000Octets", "1.3.6.1.2.1.16.2.4.1.18", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
