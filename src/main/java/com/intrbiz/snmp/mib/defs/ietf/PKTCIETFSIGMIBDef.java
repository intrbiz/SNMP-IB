package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC4001]
[RFC2579]
[RFC2580]
[RFC3411]
[RFC2863]*/
public final class PKTCIETFSIGMIBDef extends MIB
{
    public static final PKTCIETFSIGMIBDef PKTCIETFSIGMIB = new PKTCIETFSIGMIBDef();

    static { MIBs.getInstance().registerMIB(PKTCIETFSIGMIBDef.PKTCIETFSIGMIB); }

    /** [RFC3289]

December 18, 2007*/
    public final PktcIetfSigMibEnt pktcIetfSigMib;

    private PKTCIETFSIGMIBDef()
    {
        super("PKTC-IETF-SIG-MIB");
        this.pktcIetfSigMib = new PktcIetfSigMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pktcIetfSigMib
        };
    }

    public static final class PktcIetfSigMibEnt extends MIBEntry<PKTCIETFSIGMIBDef>
    {
        public final PktcSigMibObjectsEnt pktcSigMibObjects;

        /** notification group is for future extension.*/
        public final PktcSigNotificationEnt pktcSigNotification;

        public final PktcSigConformanceEnt pktcSigConformance;

        private PktcIetfSigMibEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
        {
            super(mib, parent, "pktcIetfSigMib", "1.3.6.1.2.1.169", false, false, false, false);
            this.pktcSigMibObjects = new PktcSigMibObjectsEnt(mib, this);
            this.pktcSigNotification = new PktcSigNotificationEnt(mib, this);
            this.pktcSigConformance = new PktcSigConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pktcSigMibObjects,
                this.pktcSigNotification,
                this.pktcSigConformance
            };
        }
        public static final class PktcSigMibObjectsEnt extends MIBEntry<PKTCIETFSIGMIBDef>
        {
            public final PktcSigDevObjectsEnt pktcSigDevObjects;

            public final PktcSigEndPntConfigObjectsEnt pktcSigEndPntConfigObjects;

            private PktcSigMibObjectsEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
            {
                super(mib, parent, "pktcSigMibObjects", "1.3.6.1.2.1.169.1", false, false, false, false);
                this.pktcSigDevObjects = new PktcSigDevObjectsEnt(mib, this);
                this.pktcSigEndPntConfigObjects = new PktcSigEndPntConfigObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pktcSigDevObjects,
                    this.pktcSigEndPntConfigObjects
                };
            }
            public static final class PktcSigDevObjectsEnt extends MIBEntry<PKTCIETFSIGMIBDef>
            {
                /** The codec table (pktcSigDevCodecTable) defines all combinationsof codecs supported by the Multimedia Terminal Adapter (MTA).*/
                public final PktcSigDevCodecTableEnt pktcSigDevCodecTable;

                /** These are the common signaling-related definitions that affectthe entire MTA device.*/
                public final PktcSigDevEchoCancellationEnt pktcSigDevEchoCancellation;

                public final PktcSigDevSilenceSuppressionEnt pktcSigDevSilenceSuppression;

                public final PktcSigDevCidSigProtocolEnt pktcSigDevCidSigProtocol;

                public final PktcSigDevR0CadenceEnt pktcSigDevR0Cadence;

                public final PktcSigDevR1CadenceEnt pktcSigDevR1Cadence;

                public final PktcSigDevR2CadenceEnt pktcSigDevR2Cadence;

                public final PktcSigDevR3CadenceEnt pktcSigDevR3Cadence;

                public final PktcSigDevR4CadenceEnt pktcSigDevR4Cadence;

                public final PktcSigDevR5CadenceEnt pktcSigDevR5Cadence;

                public final PktcSigDevR6CadenceEnt pktcSigDevR6Cadence;

                public final PktcSigDevR7CadenceEnt pktcSigDevR7Cadence;

                public final PktcSigDevRgCadenceEnt pktcSigDevRgCadence;

                public final PktcSigDevRsCadenceEnt pktcSigDevRsCadence;

                public final PktcSigDefCallSigDscpEnt pktcSigDefCallSigDscp;

                public final PktcSigDefMediaStreamDscpEnt pktcSigDefMediaStreamDscp;

                /** pktcSigCapabilityTable - This table defines the valid signalingtypes supported by this MTA.*/
                public final PktcSigCapabilityTableEnt pktcSigCapabilityTable;

                public final PktcSigDefNcsReceiveUdpPortEnt pktcSigDefNcsReceiveUdpPort;

                public final PktcSigPowerRingFrequencyEnt pktcSigPowerRingFrequency;

                public final PktcSigPulseSignalTableEnt pktcSigPulseSignalTable;

                public final PktcSigDevCidModeEnt pktcSigDevCidMode;

                public final PktcSigDevCidAfterRingEnt pktcSigDevCidAfterRing;

                public final PktcSigDevCidAfterDTASEnt pktcSigDevCidAfterDTAS;

                public final PktcSigDevCidAfterRPASEnt pktcSigDevCidAfterRPAS;

                public final PktcSigDevRingAfterCIDEnt pktcSigDevRingAfterCID;

                public final PktcSigDevCidDTASAfterLREnt pktcSigDevCidDTASAfterLR;

                public final PktcSigDevVmwiModeEnt pktcSigDevVmwiMode;

                public final PktcSigDevVmwiAfterDTASEnt pktcSigDevVmwiAfterDTAS;

                public final PktcSigDevVmwiAfterRPASEnt pktcSigDevVmwiAfterRPAS;

                public final PktcSigDevVmwiDTASAfterLREnt pktcSigDevVmwiDTASAfterLR;

                public final PktcSigDevRingCadenceTableEnt pktcSigDevRingCadenceTable;

                public final PktcSigDevToneTableEnt pktcSigDevToneTable;

                public final PktcSigDevMultiFreqToneTableEnt pktcSigDevMultiFreqToneTable;

                public final PktcSigDevCidDelayAfterLREnt pktcSigDevCidDelayAfterLR;

                public final PktcSigDevCidDtmfStartCodeEnt pktcSigDevCidDtmfStartCode;

                public final PktcSigDevCidDtmfEndCodeEnt pktcSigDevCidDtmfEndCode;

                public final PktcSigDevVmwiSigProtocolEnt pktcSigDevVmwiSigProtocol;

                public final PktcSigDevVmwiDelayAfterLREnt pktcSigDevVmwiDelayAfterLR;

                public final PktcSigDevVmwiDtmfStartCodeEnt pktcSigDevVmwiDtmfStartCode;

                public final PktcSigDevVmwiDtmfEndCodeEnt pktcSigDevVmwiDtmfEndCode;

                public final PktcSigDevrpAsDtsDurationEnt pktcSigDevrpAsDtsDuration;

                private PktcSigDevObjectsEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                {
                    super(mib, parent, "pktcSigDevObjects", "1.3.6.1.2.1.169.1.1", false, false, false, false);
                    this.pktcSigDevCodecTable = new PktcSigDevCodecTableEnt(mib, this);
                    this.pktcSigDevEchoCancellation = new PktcSigDevEchoCancellationEnt(mib, this);
                    this.pktcSigDevSilenceSuppression = new PktcSigDevSilenceSuppressionEnt(mib, this);
                    this.pktcSigDevCidSigProtocol = new PktcSigDevCidSigProtocolEnt(mib, this);
                    this.pktcSigDevR0Cadence = new PktcSigDevR0CadenceEnt(mib, this);
                    this.pktcSigDevR1Cadence = new PktcSigDevR1CadenceEnt(mib, this);
                    this.pktcSigDevR2Cadence = new PktcSigDevR2CadenceEnt(mib, this);
                    this.pktcSigDevR3Cadence = new PktcSigDevR3CadenceEnt(mib, this);
                    this.pktcSigDevR4Cadence = new PktcSigDevR4CadenceEnt(mib, this);
                    this.pktcSigDevR5Cadence = new PktcSigDevR5CadenceEnt(mib, this);
                    this.pktcSigDevR6Cadence = new PktcSigDevR6CadenceEnt(mib, this);
                    this.pktcSigDevR7Cadence = new PktcSigDevR7CadenceEnt(mib, this);
                    this.pktcSigDevRgCadence = new PktcSigDevRgCadenceEnt(mib, this);
                    this.pktcSigDevRsCadence = new PktcSigDevRsCadenceEnt(mib, this);
                    this.pktcSigDefCallSigDscp = new PktcSigDefCallSigDscpEnt(mib, this);
                    this.pktcSigDefMediaStreamDscp = new PktcSigDefMediaStreamDscpEnt(mib, this);
                    this.pktcSigCapabilityTable = new PktcSigCapabilityTableEnt(mib, this);
                    this.pktcSigDefNcsReceiveUdpPort = new PktcSigDefNcsReceiveUdpPortEnt(mib, this);
                    this.pktcSigPowerRingFrequency = new PktcSigPowerRingFrequencyEnt(mib, this);
                    this.pktcSigPulseSignalTable = new PktcSigPulseSignalTableEnt(mib, this);
                    this.pktcSigDevCidMode = new PktcSigDevCidModeEnt(mib, this);
                    this.pktcSigDevCidAfterRing = new PktcSigDevCidAfterRingEnt(mib, this);
                    this.pktcSigDevCidAfterDTAS = new PktcSigDevCidAfterDTASEnt(mib, this);
                    this.pktcSigDevCidAfterRPAS = new PktcSigDevCidAfterRPASEnt(mib, this);
                    this.pktcSigDevRingAfterCID = new PktcSigDevRingAfterCIDEnt(mib, this);
                    this.pktcSigDevCidDTASAfterLR = new PktcSigDevCidDTASAfterLREnt(mib, this);
                    this.pktcSigDevVmwiMode = new PktcSigDevVmwiModeEnt(mib, this);
                    this.pktcSigDevVmwiAfterDTAS = new PktcSigDevVmwiAfterDTASEnt(mib, this);
                    this.pktcSigDevVmwiAfterRPAS = new PktcSigDevVmwiAfterRPASEnt(mib, this);
                    this.pktcSigDevVmwiDTASAfterLR = new PktcSigDevVmwiDTASAfterLREnt(mib, this);
                    this.pktcSigDevRingCadenceTable = new PktcSigDevRingCadenceTableEnt(mib, this);
                    this.pktcSigDevToneTable = new PktcSigDevToneTableEnt(mib, this);
                    this.pktcSigDevMultiFreqToneTable = new PktcSigDevMultiFreqToneTableEnt(mib, this);
                    this.pktcSigDevCidDelayAfterLR = new PktcSigDevCidDelayAfterLREnt(mib, this);
                    this.pktcSigDevCidDtmfStartCode = new PktcSigDevCidDtmfStartCodeEnt(mib, this);
                    this.pktcSigDevCidDtmfEndCode = new PktcSigDevCidDtmfEndCodeEnt(mib, this);
                    this.pktcSigDevVmwiSigProtocol = new PktcSigDevVmwiSigProtocolEnt(mib, this);
                    this.pktcSigDevVmwiDelayAfterLR = new PktcSigDevVmwiDelayAfterLREnt(mib, this);
                    this.pktcSigDevVmwiDtmfStartCode = new PktcSigDevVmwiDtmfStartCodeEnt(mib, this);
                    this.pktcSigDevVmwiDtmfEndCode = new PktcSigDevVmwiDtmfEndCodeEnt(mib, this);
                    this.pktcSigDevrpAsDtsDuration = new PktcSigDevrpAsDtsDurationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcSigDevCodecTable,
                        this.pktcSigDevEchoCancellation,
                        this.pktcSigDevSilenceSuppression,
                        this.pktcSigDevCidSigProtocol,
                        this.pktcSigDevR0Cadence,
                        this.pktcSigDevR1Cadence,
                        this.pktcSigDevR2Cadence,
                        this.pktcSigDevR3Cadence,
                        this.pktcSigDevR4Cadence,
                        this.pktcSigDevR5Cadence,
                        this.pktcSigDevR6Cadence,
                        this.pktcSigDevR7Cadence,
                        this.pktcSigDevRgCadence,
                        this.pktcSigDevRsCadence,
                        this.pktcSigDefCallSigDscp,
                        this.pktcSigDefMediaStreamDscp,
                        this.pktcSigCapabilityTable,
                        this.pktcSigDefNcsReceiveUdpPort,
                        this.pktcSigPowerRingFrequency,
                        this.pktcSigPulseSignalTable,
                        this.pktcSigDevCidMode,
                        this.pktcSigDevCidAfterRing,
                        this.pktcSigDevCidAfterDTAS,
                        this.pktcSigDevCidAfterRPAS,
                        this.pktcSigDevRingAfterCID,
                        this.pktcSigDevCidDTASAfterLR,
                        this.pktcSigDevVmwiMode,
                        this.pktcSigDevVmwiAfterDTAS,
                        this.pktcSigDevVmwiAfterRPAS,
                        this.pktcSigDevVmwiDTASAfterLR,
                        this.pktcSigDevRingCadenceTable,
                        this.pktcSigDevToneTable,
                        this.pktcSigDevMultiFreqToneTable,
                        this.pktcSigDevCidDelayAfterLR,
                        this.pktcSigDevCidDtmfStartCode,
                        this.pktcSigDevCidDtmfEndCode,
                        this.pktcSigDevVmwiSigProtocol,
                        this.pktcSigDevVmwiDelayAfterLR,
                        this.pktcSigDevVmwiDtmfStartCode,
                        this.pktcSigDevVmwiDtmfEndCode,
                        this.pktcSigDevrpAsDtsDuration
                    };
                }
                public static final class PktcSigDevCodecTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigDevCodecEntryEnt pktcSigDevCodecEntry;

                    private PktcSigDevCodecTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCodecTable", "1.3.6.1.2.1.169.1.1.1", false, true, false, false);
                        this.pktcSigDevCodecEntry = new PktcSigDevCodecEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigDevCodecEntry
                        };
                    }
                    public static final class PktcSigDevCodecEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigDevCodecComboIndexEnt pktcSigDevCodecComboIndex;

                        public final PktcSigDevCodecTypeEnt pktcSigDevCodecType;

                        public final PktcSigDevCodecMaxEnt pktcSigDevCodecMax;

                        private PktcSigDevCodecEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigDevCodecEntry", "1.3.6.1.2.1.169.1.1.1.1", false, false, false, true);
                            this.pktcSigDevCodecComboIndex = new PktcSigDevCodecComboIndexEnt(mib, this);
                            this.pktcSigDevCodecType = new PktcSigDevCodecTypeEnt(mib, this);
                            this.pktcSigDevCodecMax = new PktcSigDevCodecMaxEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigDevCodecComboIndex,
                                this.pktcSigDevCodecType,
                                this.pktcSigDevCodecMax
                            };
                        }
                        public static final class PktcSigDevCodecComboIndexEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevCodecComboIndexEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevCodecComboIndex", "1.3.6.1.2.1.169.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevCodecTypeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevCodecTypeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevCodecType", "1.3.6.1.2.1.169.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevCodecMaxEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevCodecMaxEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevCodecMax", "1.3.6.1.2.1.169.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcSigDevEchoCancellationEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevEchoCancellationEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevEchoCancellation", "1.3.6.1.2.1.169.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevSilenceSuppressionEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevSilenceSuppressionEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevSilenceSuppression", "1.3.6.1.2.1.169.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidSigProtocolEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidSigProtocolEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidSigProtocol", "1.3.6.1.2.1.169.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR0CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR0CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR0Cadence", "1.3.6.1.2.1.169.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR1CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR1CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR1Cadence", "1.3.6.1.2.1.169.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR2CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR2CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR2Cadence", "1.3.6.1.2.1.169.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR3CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR3CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR3Cadence", "1.3.6.1.2.1.169.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR4CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR4CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR4Cadence", "1.3.6.1.2.1.169.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR5CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR5CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR5Cadence", "1.3.6.1.2.1.169.1.1.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR6CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR6CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR6Cadence", "1.3.6.1.2.1.169.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevR7CadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevR7CadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevR7Cadence", "1.3.6.1.2.1.169.1.1.12", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevRgCadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevRgCadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevRgCadence", "1.3.6.1.2.1.169.1.1.13", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevRsCadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevRsCadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevRsCadence", "1.3.6.1.2.1.169.1.1.14", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDefCallSigDscpEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDefCallSigDscpEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDefCallSigDscp", "1.3.6.1.2.1.169.1.1.15", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDefMediaStreamDscpEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDefMediaStreamDscpEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDefMediaStreamDscp", "1.3.6.1.2.1.169.1.1.16", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigCapabilityTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigCapabilityEntryEnt pktcSigCapabilityEntry;

                    private PktcSigCapabilityTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigCapabilityTable", "1.3.6.1.2.1.169.1.1.17", false, true, false, false);
                        this.pktcSigCapabilityEntry = new PktcSigCapabilityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigCapabilityEntry
                        };
                    }
                    public static final class PktcSigCapabilityEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigCapabilityIndexEnt pktcSigCapabilityIndex;

                        public final PktcSigCapabilityTypeEnt pktcSigCapabilityType;

                        public final PktcSigCapabilityVersionEnt pktcSigCapabilityVersion;

                        public final PktcSigCapabilityVendorExtEnt pktcSigCapabilityVendorExt;

                        private PktcSigCapabilityEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigCapabilityEntry", "1.3.6.1.2.1.169.1.1.17.1", false, false, false, true);
                            this.pktcSigCapabilityIndex = new PktcSigCapabilityIndexEnt(mib, this);
                            this.pktcSigCapabilityType = new PktcSigCapabilityTypeEnt(mib, this);
                            this.pktcSigCapabilityVersion = new PktcSigCapabilityVersionEnt(mib, this);
                            this.pktcSigCapabilityVendorExt = new PktcSigCapabilityVendorExtEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigCapabilityIndex,
                                this.pktcSigCapabilityType,
                                this.pktcSigCapabilityVersion,
                                this.pktcSigCapabilityVendorExt
                            };
                        }
                        public static final class PktcSigCapabilityIndexEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigCapabilityIndexEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigCapabilityIndex", "1.3.6.1.2.1.169.1.1.17.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigCapabilityTypeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigCapabilityTypeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigCapabilityType", "1.3.6.1.2.1.169.1.1.17.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigCapabilityVersionEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigCapabilityVersionEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigCapabilityVersion", "1.3.6.1.2.1.169.1.1.17.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigCapabilityVendorExtEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigCapabilityVendorExtEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigCapabilityVendorExt", "1.3.6.1.2.1.169.1.1.17.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcSigDefNcsReceiveUdpPortEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDefNcsReceiveUdpPortEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDefNcsReceiveUdpPort", "1.3.6.1.2.1.169.1.1.18", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigPowerRingFrequencyEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigPowerRingFrequencyEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigPowerRingFrequency", "1.3.6.1.2.1.169.1.1.19", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigPulseSignalTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigPulseSignalEntryEnt pktcSigPulseSignalEntry;

                    private PktcSigPulseSignalTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigPulseSignalTable", "1.3.6.1.2.1.169.1.1.20", false, true, false, false);
                        this.pktcSigPulseSignalEntry = new PktcSigPulseSignalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigPulseSignalEntry
                        };
                    }
                    public static final class PktcSigPulseSignalEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigPulseSignalTypeEnt pktcSigPulseSignalType;

                        public final PktcSigPulseSignalFrequencyEnt pktcSigPulseSignalFrequency;

                        public final PktcSigPulseSignalDbLevelEnt pktcSigPulseSignalDbLevel;

                        public final PktcSigPulseSignalDurationEnt pktcSigPulseSignalDuration;

                        public final PktcSigPulseSignalPulseIntervalEnt pktcSigPulseSignalPulseInterval;

                        public final PktcSigPulseSignalRepeatCountEnt pktcSigPulseSignalRepeatCount;

                        private PktcSigPulseSignalEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigPulseSignalEntry", "1.3.6.1.2.1.169.1.1.20.1", false, false, false, true);
                            this.pktcSigPulseSignalType = new PktcSigPulseSignalTypeEnt(mib, this);
                            this.pktcSigPulseSignalFrequency = new PktcSigPulseSignalFrequencyEnt(mib, this);
                            this.pktcSigPulseSignalDbLevel = new PktcSigPulseSignalDbLevelEnt(mib, this);
                            this.pktcSigPulseSignalDuration = new PktcSigPulseSignalDurationEnt(mib, this);
                            this.pktcSigPulseSignalPulseInterval = new PktcSigPulseSignalPulseIntervalEnt(mib, this);
                            this.pktcSigPulseSignalRepeatCount = new PktcSigPulseSignalRepeatCountEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigPulseSignalType,
                                this.pktcSigPulseSignalFrequency,
                                this.pktcSigPulseSignalDbLevel,
                                this.pktcSigPulseSignalDuration,
                                this.pktcSigPulseSignalPulseInterval,
                                this.pktcSigPulseSignalRepeatCount
                            };
                        }
                        public static final class PktcSigPulseSignalTypeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigPulseSignalTypeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigPulseSignalType", "1.3.6.1.2.1.169.1.1.20.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigPulseSignalFrequencyEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigPulseSignalFrequencyEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigPulseSignalFrequency", "1.3.6.1.2.1.169.1.1.20.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigPulseSignalDbLevelEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigPulseSignalDbLevelEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigPulseSignalDbLevel", "1.3.6.1.2.1.169.1.1.20.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigPulseSignalDurationEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigPulseSignalDurationEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigPulseSignalDuration", "1.3.6.1.2.1.169.1.1.20.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigPulseSignalPulseIntervalEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigPulseSignalPulseIntervalEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigPulseSignalPulseInterval", "1.3.6.1.2.1.169.1.1.20.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigPulseSignalRepeatCountEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigPulseSignalRepeatCountEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigPulseSignalRepeatCount", "1.3.6.1.2.1.169.1.1.20.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcSigDevCidModeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidModeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidMode", "1.3.6.1.2.1.169.1.1.21", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidAfterRingEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidAfterRingEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidAfterRing", "1.3.6.1.2.1.169.1.1.22", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidAfterDTASEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidAfterDTASEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidAfterDTAS", "1.3.6.1.2.1.169.1.1.23", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidAfterRPASEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidAfterRPASEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidAfterRPAS", "1.3.6.1.2.1.169.1.1.24", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevRingAfterCIDEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevRingAfterCIDEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevRingAfterCID", "1.3.6.1.2.1.169.1.1.25", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidDTASAfterLREnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidDTASAfterLREnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidDTASAfterLR", "1.3.6.1.2.1.169.1.1.26", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiModeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiModeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiMode", "1.3.6.1.2.1.169.1.1.27", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiAfterDTASEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiAfterDTASEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiAfterDTAS", "1.3.6.1.2.1.169.1.1.28", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiAfterRPASEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiAfterRPASEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiAfterRPAS", "1.3.6.1.2.1.169.1.1.29", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiDTASAfterLREnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiDTASAfterLREnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiDTASAfterLR", "1.3.6.1.2.1.169.1.1.30", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevRingCadenceTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigDevRingCadenceEntryEnt pktcSigDevRingCadenceEntry;

                    private PktcSigDevRingCadenceTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevRingCadenceTable", "1.3.6.1.2.1.169.1.1.31", false, true, false, false);
                        this.pktcSigDevRingCadenceEntry = new PktcSigDevRingCadenceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigDevRingCadenceEntry
                        };
                    }
                    public static final class PktcSigDevRingCadenceEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigDevRingCadenceIndexEnt pktcSigDevRingCadenceIndex;

                        public final PktcSigDevRingCadenceEnt pktcSigDevRingCadence;

                        private PktcSigDevRingCadenceEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigDevRingCadenceEntry", "1.3.6.1.2.1.169.1.1.31.1", false, false, false, true);
                            this.pktcSigDevRingCadenceIndex = new PktcSigDevRingCadenceIndexEnt(mib, this);
                            this.pktcSigDevRingCadence = new PktcSigDevRingCadenceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigDevRingCadenceIndex,
                                this.pktcSigDevRingCadence
                            };
                        }
                        public static final class PktcSigDevRingCadenceIndexEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevRingCadenceIndexEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevRingCadenceIndex", "1.3.6.1.2.1.169.1.1.31.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevRingCadenceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevRingCadenceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevRingCadence", "1.3.6.1.2.1.169.1.1.31.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcSigDevToneTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigDevToneEntryEnt pktcSigDevToneEntry;

                    private PktcSigDevToneTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevToneTable", "1.3.6.1.2.1.169.1.1.32", false, true, false, false);
                        this.pktcSigDevToneEntry = new PktcSigDevToneEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigDevToneEntry
                        };
                    }
                    public static final class PktcSigDevToneEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigDevToneTypeEnt pktcSigDevToneType;

                        public final PktcSigDevToneFreqGroupEnt pktcSigDevToneFreqGroup;

                        public final PktcSigDevToneFreqCounterEnt pktcSigDevToneFreqCounter;

                        public final PktcSigDevToneWholeToneRepeatCountEnt pktcSigDevToneWholeToneRepeatCount;

                        public final PktcSigDevToneSteadyEnt pktcSigDevToneSteady;

                        private PktcSigDevToneEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigDevToneEntry", "1.3.6.1.2.1.169.1.1.32.1", false, false, false, true);
                            this.pktcSigDevToneType = new PktcSigDevToneTypeEnt(mib, this);
                            this.pktcSigDevToneFreqGroup = new PktcSigDevToneFreqGroupEnt(mib, this);
                            this.pktcSigDevToneFreqCounter = new PktcSigDevToneFreqCounterEnt(mib, this);
                            this.pktcSigDevToneWholeToneRepeatCount = new PktcSigDevToneWholeToneRepeatCountEnt(mib, this);
                            this.pktcSigDevToneSteady = new PktcSigDevToneSteadyEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigDevToneType,
                                this.pktcSigDevToneFreqGroup,
                                this.pktcSigDevToneFreqCounter,
                                this.pktcSigDevToneWholeToneRepeatCount,
                                this.pktcSigDevToneSteady
                            };
                        }
                        public static final class PktcSigDevToneTypeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneTypeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneType", "1.3.6.1.2.1.169.1.1.32.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqGroupEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqGroupEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqGroup", "1.3.6.1.2.1.169.1.1.32.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqCounterEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqCounterEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqCounter", "1.3.6.1.2.1.169.1.1.32.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneWholeToneRepeatCountEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneWholeToneRepeatCountEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneWholeToneRepeatCount", "1.3.6.1.2.1.169.1.1.32.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneSteadyEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneSteadyEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneSteady", "1.3.6.1.2.1.169.1.1.32.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcSigDevMultiFreqToneTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigDevMultiFreqToneEntryEnt pktcSigDevMultiFreqToneEntry;

                    private PktcSigDevMultiFreqToneTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevMultiFreqToneTable", "1.3.6.1.2.1.169.1.1.33", false, true, false, false);
                        this.pktcSigDevMultiFreqToneEntry = new PktcSigDevMultiFreqToneEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigDevMultiFreqToneEntry
                        };
                    }
                    public static final class PktcSigDevMultiFreqToneEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigDevToneNumberEnt pktcSigDevToneNumber;

                        public final PktcSigDevToneFirstFreqValueEnt pktcSigDevToneFirstFreqValue;

                        public final PktcSigDevToneSecondFreqValueEnt pktcSigDevToneSecondFreqValue;

                        public final PktcSigDevToneThirdFreqValueEnt pktcSigDevToneThirdFreqValue;

                        public final PktcSigDevToneFourthFreqValueEnt pktcSigDevToneFourthFreqValue;

                        public final PktcSigDevToneFreqModeEnt pktcSigDevToneFreqMode;

                        public final PktcSigDevToneFreqAmpModePrtgEnt pktcSigDevToneFreqAmpModePrtg;

                        public final PktcSigDevToneDbLevelEnt pktcSigDevToneDbLevel;

                        public final PktcSigDevToneFreqOnDurationEnt pktcSigDevToneFreqOnDuration;

                        public final PktcSigDevToneFreqOffDurationEnt pktcSigDevToneFreqOffDuration;

                        public final PktcSigDevToneFreqRepeatCountEnt pktcSigDevToneFreqRepeatCount;

                        private PktcSigDevMultiFreqToneEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigDevMultiFreqToneEntry", "1.3.6.1.2.1.169.1.1.33.1", false, false, false, true);
                            this.pktcSigDevToneNumber = new PktcSigDevToneNumberEnt(mib, this);
                            this.pktcSigDevToneFirstFreqValue = new PktcSigDevToneFirstFreqValueEnt(mib, this);
                            this.pktcSigDevToneSecondFreqValue = new PktcSigDevToneSecondFreqValueEnt(mib, this);
                            this.pktcSigDevToneThirdFreqValue = new PktcSigDevToneThirdFreqValueEnt(mib, this);
                            this.pktcSigDevToneFourthFreqValue = new PktcSigDevToneFourthFreqValueEnt(mib, this);
                            this.pktcSigDevToneFreqMode = new PktcSigDevToneFreqModeEnt(mib, this);
                            this.pktcSigDevToneFreqAmpModePrtg = new PktcSigDevToneFreqAmpModePrtgEnt(mib, this);
                            this.pktcSigDevToneDbLevel = new PktcSigDevToneDbLevelEnt(mib, this);
                            this.pktcSigDevToneFreqOnDuration = new PktcSigDevToneFreqOnDurationEnt(mib, this);
                            this.pktcSigDevToneFreqOffDuration = new PktcSigDevToneFreqOffDurationEnt(mib, this);
                            this.pktcSigDevToneFreqRepeatCount = new PktcSigDevToneFreqRepeatCountEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigDevToneNumber,
                                this.pktcSigDevToneFirstFreqValue,
                                this.pktcSigDevToneSecondFreqValue,
                                this.pktcSigDevToneThirdFreqValue,
                                this.pktcSigDevToneFourthFreqValue,
                                this.pktcSigDevToneFreqMode,
                                this.pktcSigDevToneFreqAmpModePrtg,
                                this.pktcSigDevToneDbLevel,
                                this.pktcSigDevToneFreqOnDuration,
                                this.pktcSigDevToneFreqOffDuration,
                                this.pktcSigDevToneFreqRepeatCount
                            };
                        }
                        public static final class PktcSigDevToneNumberEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneNumberEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneNumber", "1.3.6.1.2.1.169.1.1.33.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFirstFreqValueEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFirstFreqValueEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFirstFreqValue", "1.3.6.1.2.1.169.1.1.33.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneSecondFreqValueEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneSecondFreqValueEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneSecondFreqValue", "1.3.6.1.2.1.169.1.1.33.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneThirdFreqValueEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneThirdFreqValueEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneThirdFreqValue", "1.3.6.1.2.1.169.1.1.33.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFourthFreqValueEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFourthFreqValueEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFourthFreqValue", "1.3.6.1.2.1.169.1.1.33.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqModeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqModeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqMode", "1.3.6.1.2.1.169.1.1.33.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqAmpModePrtgEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqAmpModePrtgEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqAmpModePrtg", "1.3.6.1.2.1.169.1.1.33.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneDbLevelEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneDbLevelEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneDbLevel", "1.3.6.1.2.1.169.1.1.33.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqOnDurationEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqOnDurationEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqOnDuration", "1.3.6.1.2.1.169.1.1.33.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqOffDurationEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqOffDurationEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqOffDuration", "1.3.6.1.2.1.169.1.1.33.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigDevToneFreqRepeatCountEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigDevToneFreqRepeatCountEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigDevToneFreqRepeatCount", "1.3.6.1.2.1.169.1.1.33.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcSigDevCidDelayAfterLREnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidDelayAfterLREnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidDelayAfterLR", "1.3.6.1.2.1.169.1.1.34", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidDtmfStartCodeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidDtmfStartCodeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidDtmfStartCode", "1.3.6.1.2.1.169.1.1.35", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevCidDtmfEndCodeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevCidDtmfEndCodeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevCidDtmfEndCode", "1.3.6.1.2.1.169.1.1.36", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiSigProtocolEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiSigProtocolEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiSigProtocol", "1.3.6.1.2.1.169.1.1.37", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiDelayAfterLREnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiDelayAfterLREnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiDelayAfterLR", "1.3.6.1.2.1.169.1.1.38", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiDtmfStartCodeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiDtmfStartCodeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiDtmfStartCode", "1.3.6.1.2.1.169.1.1.39", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevVmwiDtmfEndCodeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevVmwiDtmfEndCodeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevVmwiDtmfEndCode", "1.3.6.1.2.1.169.1.1.40", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigDevrpAsDtsDurationEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDevrpAsDtsDurationEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDevrpAsDtsDuration", "1.3.6.1.2.1.169.1.1.41", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PktcSigEndPntConfigObjectsEnt extends MIBEntry<PKTCIETFSIGMIBDef>
            {
                /** The Endpoint Config Table is used to define attributes thatare specific to connection EndPoints.*/
                public final PktcSigEndPntConfigTableEnt pktcSigEndPntConfigTable;

                private PktcSigEndPntConfigObjectsEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                {
                    super(mib, parent, "pktcSigEndPntConfigObjects", "1.3.6.1.2.1.169.1.2", false, false, false, false);
                    this.pktcSigEndPntConfigTable = new PktcSigEndPntConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcSigEndPntConfigTable
                    };
                }
                public static final class PktcSigEndPntConfigTableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    public final PktcSigEndPntConfigEntryEnt pktcSigEndPntConfigEntry;

                    private PktcSigEndPntConfigTableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigEndPntConfigTable", "1.3.6.1.2.1.169.1.2.1", false, true, false, false);
                        this.pktcSigEndPntConfigEntry = new PktcSigEndPntConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcSigEndPntConfigEntry
                        };
                    }
                    public static final class PktcSigEndPntConfigEntryEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                    {
                        public final PktcSigEndPntConfigCallAgentIdEnt pktcSigEndPntConfigCallAgentId;

                        public final PktcSigEndPntConfigCallAgentUdpPortEnt pktcSigEndPntConfigCallAgentUdpPort;

                        public final PktcSigEndPntConfigPartialDialTOEnt pktcSigEndPntConfigPartialDialTO;

                        public final PktcSigEndPntConfigCriticalDialTOEnt pktcSigEndPntConfigCriticalDialTO;

                        public final PktcSigEndPntConfigBusyToneTOEnt pktcSigEndPntConfigBusyToneTO;

                        public final PktcSigEndPntConfigDialToneTOEnt pktcSigEndPntConfigDialToneTO;

                        public final PktcSigEndPntConfigMessageWaitingTOEnt pktcSigEndPntConfigMessageWaitingTO;

                        public final PktcSigEndPntConfigOffHookWarnToneTOEnt pktcSigEndPntConfigOffHookWarnToneTO;

                        public final PktcSigEndPntConfigRingingTOEnt pktcSigEndPntConfigRingingTO;

                        public final PktcSigEndPntConfigRingBackTOEnt pktcSigEndPntConfigRingBackTO;

                        public final PktcSigEndPntConfigReorderToneTOEnt pktcSigEndPntConfigReorderToneTO;

                        public final PktcSigEndPntConfigStutterDialToneTOEnt pktcSigEndPntConfigStutterDialToneTO;

                        public final PktcSigEndPntConfigTSMaxEnt pktcSigEndPntConfigTSMax;

                        public final PktcSigEndPntConfigMax1Ent pktcSigEndPntConfigMax1;

                        public final PktcSigEndPntConfigMax2Ent pktcSigEndPntConfigMax2;

                        public final PktcSigEndPntConfigMax1QEnableEnt pktcSigEndPntConfigMax1QEnable;

                        public final PktcSigEndPntConfigMax2QEnableEnt pktcSigEndPntConfigMax2QEnable;

                        public final PktcSigEndPntConfigMWDEnt pktcSigEndPntConfigMWD;

                        public final PktcSigEndPntConfigTdinitEnt pktcSigEndPntConfigTdinit;

                        public final PktcSigEndPntConfigTdminEnt pktcSigEndPntConfigTdmin;

                        public final PktcSigEndPntConfigTdmaxEnt pktcSigEndPntConfigTdmax;

                        public final PktcSigEndPntConfigRtoMaxEnt pktcSigEndPntConfigRtoMax;

                        public final PktcSigEndPntConfigRtoInitEnt pktcSigEndPntConfigRtoInit;

                        public final PktcSigEndPntConfigLongDurationKeepAliveEnt pktcSigEndPntConfigLongDurationKeepAlive;

                        public final PktcSigEndPntConfigThistEnt pktcSigEndPntConfigThist;

                        public final PktcSigEndPntConfigStatusEnt pktcSigEndPntConfigStatus;

                        public final PktcSigEndPntConfigCallWaitingMaxRepEnt pktcSigEndPntConfigCallWaitingMaxRep;

                        public final PktcSigEndPntConfigCallWaitingDelayEnt pktcSigEndPntConfigCallWaitingDelay;

                        public final PktcSigEndPntStatusCallIpAddressTypeEnt pktcSigEndPntStatusCallIpAddressType;

                        public final PktcSigEndPntStatusCallIpAddressEnt pktcSigEndPntStatusCallIpAddress;

                        public final PktcSigEndPntStatusErrorEnt pktcSigEndPntStatusError;

                        public final PktcSigEndPntConfigMinHookFlashEnt pktcSigEndPntConfigMinHookFlash;

                        public final PktcSigEndPntConfigMaxHookFlashEnt pktcSigEndPntConfigMaxHookFlash;

                        public final PktcSigEndPntConfigPulseDialInterdigitTimeEnt pktcSigEndPntConfigPulseDialInterdigitTime;

                        public final PktcSigEndPntConfigPulseDialMinMakeTimeEnt pktcSigEndPntConfigPulseDialMinMakeTime;

                        public final PktcSigEndPntConfigPulseDialMaxMakeTimeEnt pktcSigEndPntConfigPulseDialMaxMakeTime;

                        public final PktcSigEndPntConfigPulseDialMinBreakTimeEnt pktcSigEndPntConfigPulseDialMinBreakTime;

                        public final PktcSigEndPntConfigPulseDialMaxBreakTimeEnt pktcSigEndPntConfigPulseDialMaxBreakTime;

                        private PktcSigEndPntConfigEntryEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                        {
                            super(mib, parent, "pktcSigEndPntConfigEntry", "1.3.6.1.2.1.169.1.2.1.1", false, false, false, true);
                            this.pktcSigEndPntConfigCallAgentId = new PktcSigEndPntConfigCallAgentIdEnt(mib, this);
                            this.pktcSigEndPntConfigCallAgentUdpPort = new PktcSigEndPntConfigCallAgentUdpPortEnt(mib, this);
                            this.pktcSigEndPntConfigPartialDialTO = new PktcSigEndPntConfigPartialDialTOEnt(mib, this);
                            this.pktcSigEndPntConfigCriticalDialTO = new PktcSigEndPntConfigCriticalDialTOEnt(mib, this);
                            this.pktcSigEndPntConfigBusyToneTO = new PktcSigEndPntConfigBusyToneTOEnt(mib, this);
                            this.pktcSigEndPntConfigDialToneTO = new PktcSigEndPntConfigDialToneTOEnt(mib, this);
                            this.pktcSigEndPntConfigMessageWaitingTO = new PktcSigEndPntConfigMessageWaitingTOEnt(mib, this);
                            this.pktcSigEndPntConfigOffHookWarnToneTO = new PktcSigEndPntConfigOffHookWarnToneTOEnt(mib, this);
                            this.pktcSigEndPntConfigRingingTO = new PktcSigEndPntConfigRingingTOEnt(mib, this);
                            this.pktcSigEndPntConfigRingBackTO = new PktcSigEndPntConfigRingBackTOEnt(mib, this);
                            this.pktcSigEndPntConfigReorderToneTO = new PktcSigEndPntConfigReorderToneTOEnt(mib, this);
                            this.pktcSigEndPntConfigStutterDialToneTO = new PktcSigEndPntConfigStutterDialToneTOEnt(mib, this);
                            this.pktcSigEndPntConfigTSMax = new PktcSigEndPntConfigTSMaxEnt(mib, this);
                            this.pktcSigEndPntConfigMax1 = new PktcSigEndPntConfigMax1Ent(mib, this);
                            this.pktcSigEndPntConfigMax2 = new PktcSigEndPntConfigMax2Ent(mib, this);
                            this.pktcSigEndPntConfigMax1QEnable = new PktcSigEndPntConfigMax1QEnableEnt(mib, this);
                            this.pktcSigEndPntConfigMax2QEnable = new PktcSigEndPntConfigMax2QEnableEnt(mib, this);
                            this.pktcSigEndPntConfigMWD = new PktcSigEndPntConfigMWDEnt(mib, this);
                            this.pktcSigEndPntConfigTdinit = new PktcSigEndPntConfigTdinitEnt(mib, this);
                            this.pktcSigEndPntConfigTdmin = new PktcSigEndPntConfigTdminEnt(mib, this);
                            this.pktcSigEndPntConfigTdmax = new PktcSigEndPntConfigTdmaxEnt(mib, this);
                            this.pktcSigEndPntConfigRtoMax = new PktcSigEndPntConfigRtoMaxEnt(mib, this);
                            this.pktcSigEndPntConfigRtoInit = new PktcSigEndPntConfigRtoInitEnt(mib, this);
                            this.pktcSigEndPntConfigLongDurationKeepAlive = new PktcSigEndPntConfigLongDurationKeepAliveEnt(mib, this);
                            this.pktcSigEndPntConfigThist = new PktcSigEndPntConfigThistEnt(mib, this);
                            this.pktcSigEndPntConfigStatus = new PktcSigEndPntConfigStatusEnt(mib, this);
                            this.pktcSigEndPntConfigCallWaitingMaxRep = new PktcSigEndPntConfigCallWaitingMaxRepEnt(mib, this);
                            this.pktcSigEndPntConfigCallWaitingDelay = new PktcSigEndPntConfigCallWaitingDelayEnt(mib, this);
                            this.pktcSigEndPntStatusCallIpAddressType = new PktcSigEndPntStatusCallIpAddressTypeEnt(mib, this);
                            this.pktcSigEndPntStatusCallIpAddress = new PktcSigEndPntStatusCallIpAddressEnt(mib, this);
                            this.pktcSigEndPntStatusError = new PktcSigEndPntStatusErrorEnt(mib, this);
                            this.pktcSigEndPntConfigMinHookFlash = new PktcSigEndPntConfigMinHookFlashEnt(mib, this);
                            this.pktcSigEndPntConfigMaxHookFlash = new PktcSigEndPntConfigMaxHookFlashEnt(mib, this);
                            this.pktcSigEndPntConfigPulseDialInterdigitTime = new PktcSigEndPntConfigPulseDialInterdigitTimeEnt(mib, this);
                            this.pktcSigEndPntConfigPulseDialMinMakeTime = new PktcSigEndPntConfigPulseDialMinMakeTimeEnt(mib, this);
                            this.pktcSigEndPntConfigPulseDialMaxMakeTime = new PktcSigEndPntConfigPulseDialMaxMakeTimeEnt(mib, this);
                            this.pktcSigEndPntConfigPulseDialMinBreakTime = new PktcSigEndPntConfigPulseDialMinBreakTimeEnt(mib, this);
                            this.pktcSigEndPntConfigPulseDialMaxBreakTime = new PktcSigEndPntConfigPulseDialMaxBreakTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcSigEndPntConfigCallAgentId,
                                this.pktcSigEndPntConfigCallAgentUdpPort,
                                this.pktcSigEndPntConfigPartialDialTO,
                                this.pktcSigEndPntConfigCriticalDialTO,
                                this.pktcSigEndPntConfigBusyToneTO,
                                this.pktcSigEndPntConfigDialToneTO,
                                this.pktcSigEndPntConfigMessageWaitingTO,
                                this.pktcSigEndPntConfigOffHookWarnToneTO,
                                this.pktcSigEndPntConfigRingingTO,
                                this.pktcSigEndPntConfigRingBackTO,
                                this.pktcSigEndPntConfigReorderToneTO,
                                this.pktcSigEndPntConfigStutterDialToneTO,
                                this.pktcSigEndPntConfigTSMax,
                                this.pktcSigEndPntConfigMax1,
                                this.pktcSigEndPntConfigMax2,
                                this.pktcSigEndPntConfigMax1QEnable,
                                this.pktcSigEndPntConfigMax2QEnable,
                                this.pktcSigEndPntConfigMWD,
                                this.pktcSigEndPntConfigTdinit,
                                this.pktcSigEndPntConfigTdmin,
                                this.pktcSigEndPntConfigTdmax,
                                this.pktcSigEndPntConfigRtoMax,
                                this.pktcSigEndPntConfigRtoInit,
                                this.pktcSigEndPntConfigLongDurationKeepAlive,
                                this.pktcSigEndPntConfigThist,
                                this.pktcSigEndPntConfigStatus,
                                this.pktcSigEndPntConfigCallWaitingMaxRep,
                                this.pktcSigEndPntConfigCallWaitingDelay,
                                this.pktcSigEndPntStatusCallIpAddressType,
                                this.pktcSigEndPntStatusCallIpAddress,
                                this.pktcSigEndPntStatusError,
                                this.pktcSigEndPntConfigMinHookFlash,
                                this.pktcSigEndPntConfigMaxHookFlash,
                                this.pktcSigEndPntConfigPulseDialInterdigitTime,
                                this.pktcSigEndPntConfigPulseDialMinMakeTime,
                                this.pktcSigEndPntConfigPulseDialMaxMakeTime,
                                this.pktcSigEndPntConfigPulseDialMinBreakTime,
                                this.pktcSigEndPntConfigPulseDialMaxBreakTime
                            };
                        }
                        public static final class PktcSigEndPntConfigCallAgentIdEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigCallAgentIdEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigCallAgentId", "1.3.6.1.2.1.169.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigCallAgentUdpPortEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigCallAgentUdpPortEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigCallAgentUdpPort", "1.3.6.1.2.1.169.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigPartialDialTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigPartialDialTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigPartialDialTO", "1.3.6.1.2.1.169.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigCriticalDialTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigCriticalDialTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigCriticalDialTO", "1.3.6.1.2.1.169.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigBusyToneTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigBusyToneTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigBusyToneTO", "1.3.6.1.2.1.169.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigDialToneTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigDialToneTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigDialToneTO", "1.3.6.1.2.1.169.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMessageWaitingTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMessageWaitingTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMessageWaitingTO", "1.3.6.1.2.1.169.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigOffHookWarnToneTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigOffHookWarnToneTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigOffHookWarnToneTO", "1.3.6.1.2.1.169.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigRingingTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigRingingTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigRingingTO", "1.3.6.1.2.1.169.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigRingBackTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigRingBackTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigRingBackTO", "1.3.6.1.2.1.169.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigReorderToneTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigReorderToneTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigReorderToneTO", "1.3.6.1.2.1.169.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigStutterDialToneTOEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigStutterDialToneTOEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigStutterDialToneTO", "1.3.6.1.2.1.169.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigTSMaxEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigTSMaxEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigTSMax", "1.3.6.1.2.1.169.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMax1Ent extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMax1Ent(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMax1", "1.3.6.1.2.1.169.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMax2Ent extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMax2Ent(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMax2", "1.3.6.1.2.1.169.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMax1QEnableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMax1QEnableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMax1QEnable", "1.3.6.1.2.1.169.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMax2QEnableEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMax2QEnableEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMax2QEnable", "1.3.6.1.2.1.169.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMWDEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMWDEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMWD", "1.3.6.1.2.1.169.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigTdinitEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigTdinitEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigTdinit", "1.3.6.1.2.1.169.1.2.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigTdminEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigTdminEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigTdmin", "1.3.6.1.2.1.169.1.2.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigTdmaxEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigTdmaxEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigTdmax", "1.3.6.1.2.1.169.1.2.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigRtoMaxEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigRtoMaxEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigRtoMax", "1.3.6.1.2.1.169.1.2.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigRtoInitEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigRtoInitEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigRtoInit", "1.3.6.1.2.1.169.1.2.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigLongDurationKeepAliveEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigLongDurationKeepAliveEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigLongDurationKeepAlive", "1.3.6.1.2.1.169.1.2.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigThistEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigThistEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigThist", "1.3.6.1.2.1.169.1.2.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigStatusEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigStatusEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigStatus", "1.3.6.1.2.1.169.1.2.1.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigCallWaitingMaxRepEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigCallWaitingMaxRepEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigCallWaitingMaxRep", "1.3.6.1.2.1.169.1.2.1.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigCallWaitingDelayEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigCallWaitingDelayEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigCallWaitingDelay", "1.3.6.1.2.1.169.1.2.1.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntStatusCallIpAddressTypeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntStatusCallIpAddressTypeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntStatusCallIpAddressType", "1.3.6.1.2.1.169.1.2.1.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntStatusCallIpAddressEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntStatusCallIpAddressEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntStatusCallIpAddress", "1.3.6.1.2.1.169.1.2.1.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntStatusErrorEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntStatusErrorEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntStatusError", "1.3.6.1.2.1.169.1.2.1.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMinHookFlashEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMinHookFlashEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMinHookFlash", "1.3.6.1.2.1.169.1.2.1.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigMaxHookFlashEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigMaxHookFlashEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigMaxHookFlash", "1.3.6.1.2.1.169.1.2.1.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigPulseDialInterdigitTimeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigPulseDialInterdigitTimeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigPulseDialInterdigitTime", "1.3.6.1.2.1.169.1.2.1.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigPulseDialMinMakeTimeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigPulseDialMinMakeTimeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigPulseDialMinMakeTime", "1.3.6.1.2.1.169.1.2.1.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigPulseDialMaxMakeTimeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigPulseDialMaxMakeTimeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigPulseDialMaxMakeTime", "1.3.6.1.2.1.169.1.2.1.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigPulseDialMinBreakTimeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigPulseDialMinBreakTimeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigPulseDialMinBreakTime", "1.3.6.1.2.1.169.1.2.1.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcSigEndPntConfigPulseDialMaxBreakTimeEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                        {
                            private PktcSigEndPntConfigPulseDialMaxBreakTimeEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                            {
                                super(mib, parent, "pktcSigEndPntConfigPulseDialMaxBreakTime", "1.3.6.1.2.1.169.1.2.1.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class PktcSigNotificationEnt extends MIBEntry<PKTCIETFSIGMIBDef>
        {
            private PktcSigNotificationEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
            {
                super(mib, parent, "pktcSigNotification", "1.3.6.1.2.1.169.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PktcSigConformanceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
        {
            public final PktcSigCompliancesEnt pktcSigCompliances;

            public final PktcSigGroupsEnt pktcSigGroups;

            private PktcSigConformanceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
            {
                super(mib, parent, "pktcSigConformance", "1.3.6.1.2.1.169.2", false, false, false, false);
                this.pktcSigCompliances = new PktcSigCompliancesEnt(mib, this);
                this.pktcSigGroups = new PktcSigGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pktcSigCompliances,
                    this.pktcSigGroups
                };
            }
            public static final class PktcSigCompliancesEnt extends MIBEntry<PKTCIETFSIGMIBDef>
            {
                /** compliance statements*/
                public final PktcSigBasicComplianceEnt pktcSigBasicCompliance;

                private PktcSigCompliancesEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                {
                    super(mib, parent, "pktcSigCompliances", "1.3.6.1.2.1.169.2.1", false, false, false, false);
                    this.pktcSigBasicCompliance = new PktcSigBasicComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcSigBasicCompliance
                    };
                }
                public static final class PktcSigBasicComplianceEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigBasicComplianceEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigBasicCompliance", "1.3.6.1.2.1.169.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PktcSigGroupsEnt extends MIBEntry<PKTCIETFSIGMIBDef>
            {
                public final PktcSigDeviceGroupEnt pktcSigDeviceGroup;

                public final PktcSigEndpointGroupEnt pktcSigEndpointGroup;

                public final PktcInternationalGroupEnt pktcInternationalGroup;

                public final PktcLLinePackageGroupEnt pktcLLinePackageGroup;

                public final PktcELinePackageGroupEnt pktcELinePackageGroup;

                private PktcSigGroupsEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                {
                    super(mib, parent, "pktcSigGroups", "1.3.6.1.2.1.169.2.2", false, false, false, false);
                    this.pktcSigDeviceGroup = new PktcSigDeviceGroupEnt(mib, this);
                    this.pktcSigEndpointGroup = new PktcSigEndpointGroupEnt(mib, this);
                    this.pktcInternationalGroup = new PktcInternationalGroupEnt(mib, this);
                    this.pktcLLinePackageGroup = new PktcLLinePackageGroupEnt(mib, this);
                    this.pktcELinePackageGroup = new PktcELinePackageGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcSigDeviceGroup,
                        this.pktcSigEndpointGroup,
                        this.pktcInternationalGroup,
                        this.pktcLLinePackageGroup,
                        this.pktcELinePackageGroup
                    };
                }
                public static final class PktcSigDeviceGroupEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigDeviceGroupEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigDeviceGroup", "1.3.6.1.2.1.169.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcSigEndpointGroupEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcSigEndpointGroupEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcSigEndpointGroup", "1.3.6.1.2.1.169.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcInternationalGroupEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcInternationalGroupEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcInternationalGroup", "1.3.6.1.2.1.169.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcLLinePackageGroupEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcLLinePackageGroupEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcLLinePackageGroup", "1.3.6.1.2.1.169.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcELinePackageGroupEnt extends MIBEntry<PKTCIETFSIGMIBDef>
                {
                    private PktcELinePackageGroupEnt(PKTCIETFSIGMIBDef mib, MIBEntry<PKTCIETFSIGMIBDef> parent)
                    {
                        super(mib, parent, "pktcELinePackageGroup", "1.3.6.1.2.1.169.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
