package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RAQMONMIBDef extends MIB
{
    public static final RAQMONMIBDef RAQMONMIB = new RAQMONMIBDef();

    static { MIBs.getInstance().registerMIB(RAQMONMIBDef.RAQMONMIB); }

    /** October 10, 2006*/
    public final RaqmonMIBEnt raqmonMIB;

    private RAQMONMIBDef()
    {
        super("RAQMON-MIB");
        this.raqmonMIB = new RaqmonMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.raqmonMIB
        };
    }

    public static final class RaqmonMIBEnt extends MIBEntry<RAQMONMIBDef>
    {
        /** This OID allocation conforms to [RFC3737]


Node definitions*/
        public final RaqmonNotificationsEnt raqmonNotifications;

        public final RaqmonMIBObjectsEnt raqmonMIBObjects;

        public final RaqmonConformanceEnt raqmonConformance;

        private RaqmonMIBEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
        {
            super(mib, parent, "raqmonMIB", "1.3.6.1.2.1.16.31", false, false, false, false);
            this.raqmonNotifications = new RaqmonNotificationsEnt(mib, this);
            this.raqmonMIBObjects = new RaqmonMIBObjectsEnt(mib, this);
            this.raqmonConformance = new RaqmonConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.raqmonNotifications,
                this.raqmonMIBObjects,
                this.raqmonConformance
            };
        }
        public static final class RaqmonNotificationsEnt extends MIBEntry<RAQMONMIBDef>
        {
            public final RaqmonSessionAlarmEnt raqmonSessionAlarm;

            private RaqmonNotificationsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
            {
                super(mib, parent, "raqmonNotifications", "1.3.6.1.2.1.16.31.0", false, false, false, false);
                this.raqmonSessionAlarm = new RaqmonSessionAlarmEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.raqmonSessionAlarm
                };
            }
            public static final class RaqmonSessionAlarmEnt extends MIBEntry<RAQMONMIBDef>
            {
                private RaqmonSessionAlarmEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                {
                    super(mib, parent, "raqmonSessionAlarm", "1.3.6.1.2.1.16.31.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class RaqmonMIBObjectsEnt extends MIBEntry<RAQMONMIBDef>
        {
            public final RaqmonSessionEnt raqmonSession;

            public final RaqmonExceptionEnt raqmonException;

            public final RaqmonConfigEnt raqmonConfig;

            private RaqmonMIBObjectsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
            {
                super(mib, parent, "raqmonMIBObjects", "1.3.6.1.2.1.16.31.1", false, false, false, false);
                this.raqmonSession = new RaqmonSessionEnt(mib, this);
                this.raqmonException = new RaqmonExceptionEnt(mib, this);
                this.raqmonConfig = new RaqmonConfigEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.raqmonSession,
                    this.raqmonException,
                    this.raqmonConfig
                };
            }
            public static final class RaqmonSessionEnt extends MIBEntry<RAQMONMIBDef>
            {
                public final RaqmonParticipantTableEnt raqmonParticipantTable;

                public final RaqmonQosTableEnt raqmonQosTable;

                public final RaqmonParticipantAddrTableEnt raqmonParticipantAddrTable;

                private RaqmonSessionEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                {
                    super(mib, parent, "raqmonSession", "1.3.6.1.2.1.16.31.1.1", false, false, false, false);
                    this.raqmonParticipantTable = new RaqmonParticipantTableEnt(mib, this);
                    this.raqmonQosTable = new RaqmonQosTableEnt(mib, this);
                    this.raqmonParticipantAddrTable = new RaqmonParticipantAddrTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.raqmonParticipantTable,
                        this.raqmonQosTable,
                        this.raqmonParticipantAddrTable
                    };
                }
                public static final class RaqmonParticipantTableEnt extends MIBEntry<RAQMONMIBDef>
                {
                    public final RaqmonParticipantEntryEnt raqmonParticipantEntry;

                    private RaqmonParticipantTableEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonParticipantTable", "1.3.6.1.2.1.16.31.1.1.1", false, true, false, false);
                        this.raqmonParticipantEntry = new RaqmonParticipantEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.raqmonParticipantEntry
                        };
                    }
                    public static final class RaqmonParticipantEntryEnt extends MIBEntry<RAQMONMIBDef>
                    {
                        public final RaqmonParticipantStartDateEnt raqmonParticipantStartDate;

                        public final RaqmonParticipantIndexEnt raqmonParticipantIndex;

                        public final RaqmonParticipantReportCapsEnt raqmonParticipantReportCaps;

                        public final RaqmonParticipantAddrTypeEnt raqmonParticipantAddrType;

                        public final RaqmonParticipantAddrEnt raqmonParticipantAddr;

                        public final RaqmonParticipantSendPortEnt raqmonParticipantSendPort;

                        public final RaqmonParticipantRecvPortEnt raqmonParticipantRecvPort;

                        public final RaqmonParticipantSetupDelayEnt raqmonParticipantSetupDelay;

                        public final RaqmonParticipantNameEnt raqmonParticipantName;

                        public final RaqmonParticipantAppNameEnt raqmonParticipantAppName;

                        public final RaqmonParticipantQosCountEnt raqmonParticipantQosCount;

                        public final RaqmonParticipantEndDateEnt raqmonParticipantEndDate;

                        public final RaqmonParticipantDestPayloadTypeEnt raqmonParticipantDestPayloadType;

                        public final RaqmonParticipantSrcPayloadTypeEnt raqmonParticipantSrcPayloadType;

                        public final RaqmonParticipantActiveEnt raqmonParticipantActive;

                        public final RaqmonParticipantPeerEnt raqmonParticipantPeer;

                        public final RaqmonParticipantPeerAddrTypeEnt raqmonParticipantPeerAddrType;

                        public final RaqmonParticipantPeerAddrEnt raqmonParticipantPeerAddr;

                        public final RaqmonParticipantSrcL2PriorityEnt raqmonParticipantSrcL2Priority;

                        public final RaqmonParticipantDestL2PriorityEnt raqmonParticipantDestL2Priority;

                        public final RaqmonParticipantSrcDSCPEnt raqmonParticipantSrcDSCP;

                        public final RaqmonParticipantDestDSCPEnt raqmonParticipantDestDSCP;

                        public final RaqmonParticipantCpuMeanEnt raqmonParticipantCpuMean;

                        public final RaqmonParticipantCpuMinEnt raqmonParticipantCpuMin;

                        public final RaqmonParticipantCpuMaxEnt raqmonParticipantCpuMax;

                        public final RaqmonParticipantMemoryMeanEnt raqmonParticipantMemoryMean;

                        public final RaqmonParticipantMemoryMinEnt raqmonParticipantMemoryMin;

                        public final RaqmonParticipantMemoryMaxEnt raqmonParticipantMemoryMax;

                        public final RaqmonParticipantNetRTTMeanEnt raqmonParticipantNetRTTMean;

                        public final RaqmonParticipantNetRTTMinEnt raqmonParticipantNetRTTMin;

                        public final RaqmonParticipantNetRTTMaxEnt raqmonParticipantNetRTTMax;

                        public final RaqmonParticipantIAJitterMeanEnt raqmonParticipantIAJitterMean;

                        public final RaqmonParticipantIAJitterMinEnt raqmonParticipantIAJitterMin;

                        public final RaqmonParticipantIAJitterMaxEnt raqmonParticipantIAJitterMax;

                        public final RaqmonParticipantIPDVMeanEnt raqmonParticipantIPDVMean;

                        public final RaqmonParticipantIPDVMinEnt raqmonParticipantIPDVMin;

                        public final RaqmonParticipantIPDVMaxEnt raqmonParticipantIPDVMax;

                        public final RaqmonParticipantNetOwdMeanEnt raqmonParticipantNetOwdMean;

                        public final RaqmonParticipantNetOwdMinEnt raqmonParticipantNetOwdMin;

                        public final RaqmonParticipantNetOwdMaxEnt raqmonParticipantNetOwdMax;

                        public final RaqmonParticipantAppDelayMeanEnt raqmonParticipantAppDelayMean;

                        public final RaqmonParticipantAppDelayMinEnt raqmonParticipantAppDelayMin;

                        public final RaqmonParticipantAppDelayMaxEnt raqmonParticipantAppDelayMax;

                        public final RaqmonParticipantPacketsRcvdEnt raqmonParticipantPacketsRcvd;

                        public final RaqmonParticipantPacketsSentEnt raqmonParticipantPacketsSent;

                        public final RaqmonParticipantOctetsRcvdEnt raqmonParticipantOctetsRcvd;

                        public final RaqmonParticipantOctetsSentEnt raqmonParticipantOctetsSent;

                        public final RaqmonParticipantLostPacketsEnt raqmonParticipantLostPackets;

                        public final RaqmonParticipantLostPacketsFrctEnt raqmonParticipantLostPacketsFrct;

                        public final RaqmonParticipantDiscardsEnt raqmonParticipantDiscards;

                        public final RaqmonParticipantDiscardsFrctEnt raqmonParticipantDiscardsFrct;

                        private RaqmonParticipantEntryEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                        {
                            super(mib, parent, "raqmonParticipantEntry", "1.3.6.1.2.1.16.31.1.1.1.1", false, false, false, true);
                            this.raqmonParticipantStartDate = new RaqmonParticipantStartDateEnt(mib, this);
                            this.raqmonParticipantIndex = new RaqmonParticipantIndexEnt(mib, this);
                            this.raqmonParticipantReportCaps = new RaqmonParticipantReportCapsEnt(mib, this);
                            this.raqmonParticipantAddrType = new RaqmonParticipantAddrTypeEnt(mib, this);
                            this.raqmonParticipantAddr = new RaqmonParticipantAddrEnt(mib, this);
                            this.raqmonParticipantSendPort = new RaqmonParticipantSendPortEnt(mib, this);
                            this.raqmonParticipantRecvPort = new RaqmonParticipantRecvPortEnt(mib, this);
                            this.raqmonParticipantSetupDelay = new RaqmonParticipantSetupDelayEnt(mib, this);
                            this.raqmonParticipantName = new RaqmonParticipantNameEnt(mib, this);
                            this.raqmonParticipantAppName = new RaqmonParticipantAppNameEnt(mib, this);
                            this.raqmonParticipantQosCount = new RaqmonParticipantQosCountEnt(mib, this);
                            this.raqmonParticipantEndDate = new RaqmonParticipantEndDateEnt(mib, this);
                            this.raqmonParticipantDestPayloadType = new RaqmonParticipantDestPayloadTypeEnt(mib, this);
                            this.raqmonParticipantSrcPayloadType = new RaqmonParticipantSrcPayloadTypeEnt(mib, this);
                            this.raqmonParticipantActive = new RaqmonParticipantActiveEnt(mib, this);
                            this.raqmonParticipantPeer = new RaqmonParticipantPeerEnt(mib, this);
                            this.raqmonParticipantPeerAddrType = new RaqmonParticipantPeerAddrTypeEnt(mib, this);
                            this.raqmonParticipantPeerAddr = new RaqmonParticipantPeerAddrEnt(mib, this);
                            this.raqmonParticipantSrcL2Priority = new RaqmonParticipantSrcL2PriorityEnt(mib, this);
                            this.raqmonParticipantDestL2Priority = new RaqmonParticipantDestL2PriorityEnt(mib, this);
                            this.raqmonParticipantSrcDSCP = new RaqmonParticipantSrcDSCPEnt(mib, this);
                            this.raqmonParticipantDestDSCP = new RaqmonParticipantDestDSCPEnt(mib, this);
                            this.raqmonParticipantCpuMean = new RaqmonParticipantCpuMeanEnt(mib, this);
                            this.raqmonParticipantCpuMin = new RaqmonParticipantCpuMinEnt(mib, this);
                            this.raqmonParticipantCpuMax = new RaqmonParticipantCpuMaxEnt(mib, this);
                            this.raqmonParticipantMemoryMean = new RaqmonParticipantMemoryMeanEnt(mib, this);
                            this.raqmonParticipantMemoryMin = new RaqmonParticipantMemoryMinEnt(mib, this);
                            this.raqmonParticipantMemoryMax = new RaqmonParticipantMemoryMaxEnt(mib, this);
                            this.raqmonParticipantNetRTTMean = new RaqmonParticipantNetRTTMeanEnt(mib, this);
                            this.raqmonParticipantNetRTTMin = new RaqmonParticipantNetRTTMinEnt(mib, this);
                            this.raqmonParticipantNetRTTMax = new RaqmonParticipantNetRTTMaxEnt(mib, this);
                            this.raqmonParticipantIAJitterMean = new RaqmonParticipantIAJitterMeanEnt(mib, this);
                            this.raqmonParticipantIAJitterMin = new RaqmonParticipantIAJitterMinEnt(mib, this);
                            this.raqmonParticipantIAJitterMax = new RaqmonParticipantIAJitterMaxEnt(mib, this);
                            this.raqmonParticipantIPDVMean = new RaqmonParticipantIPDVMeanEnt(mib, this);
                            this.raqmonParticipantIPDVMin = new RaqmonParticipantIPDVMinEnt(mib, this);
                            this.raqmonParticipantIPDVMax = new RaqmonParticipantIPDVMaxEnt(mib, this);
                            this.raqmonParticipantNetOwdMean = new RaqmonParticipantNetOwdMeanEnt(mib, this);
                            this.raqmonParticipantNetOwdMin = new RaqmonParticipantNetOwdMinEnt(mib, this);
                            this.raqmonParticipantNetOwdMax = new RaqmonParticipantNetOwdMaxEnt(mib, this);
                            this.raqmonParticipantAppDelayMean = new RaqmonParticipantAppDelayMeanEnt(mib, this);
                            this.raqmonParticipantAppDelayMin = new RaqmonParticipantAppDelayMinEnt(mib, this);
                            this.raqmonParticipantAppDelayMax = new RaqmonParticipantAppDelayMaxEnt(mib, this);
                            this.raqmonParticipantPacketsRcvd = new RaqmonParticipantPacketsRcvdEnt(mib, this);
                            this.raqmonParticipantPacketsSent = new RaqmonParticipantPacketsSentEnt(mib, this);
                            this.raqmonParticipantOctetsRcvd = new RaqmonParticipantOctetsRcvdEnt(mib, this);
                            this.raqmonParticipantOctetsSent = new RaqmonParticipantOctetsSentEnt(mib, this);
                            this.raqmonParticipantLostPackets = new RaqmonParticipantLostPacketsEnt(mib, this);
                            this.raqmonParticipantLostPacketsFrct = new RaqmonParticipantLostPacketsFrctEnt(mib, this);
                            this.raqmonParticipantDiscards = new RaqmonParticipantDiscardsEnt(mib, this);
                            this.raqmonParticipantDiscardsFrct = new RaqmonParticipantDiscardsFrctEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.raqmonParticipantStartDate,
                                this.raqmonParticipantIndex,
                                this.raqmonParticipantReportCaps,
                                this.raqmonParticipantAddrType,
                                this.raqmonParticipantAddr,
                                this.raqmonParticipantSendPort,
                                this.raqmonParticipantRecvPort,
                                this.raqmonParticipantSetupDelay,
                                this.raqmonParticipantName,
                                this.raqmonParticipantAppName,
                                this.raqmonParticipantQosCount,
                                this.raqmonParticipantEndDate,
                                this.raqmonParticipantDestPayloadType,
                                this.raqmonParticipantSrcPayloadType,
                                this.raqmonParticipantActive,
                                this.raqmonParticipantPeer,
                                this.raqmonParticipantPeerAddrType,
                                this.raqmonParticipantPeerAddr,
                                this.raqmonParticipantSrcL2Priority,
                                this.raqmonParticipantDestL2Priority,
                                this.raqmonParticipantSrcDSCP,
                                this.raqmonParticipantDestDSCP,
                                this.raqmonParticipantCpuMean,
                                this.raqmonParticipantCpuMin,
                                this.raqmonParticipantCpuMax,
                                this.raqmonParticipantMemoryMean,
                                this.raqmonParticipantMemoryMin,
                                this.raqmonParticipantMemoryMax,
                                this.raqmonParticipantNetRTTMean,
                                this.raqmonParticipantNetRTTMin,
                                this.raqmonParticipantNetRTTMax,
                                this.raqmonParticipantIAJitterMean,
                                this.raqmonParticipantIAJitterMin,
                                this.raqmonParticipantIAJitterMax,
                                this.raqmonParticipantIPDVMean,
                                this.raqmonParticipantIPDVMin,
                                this.raqmonParticipantIPDVMax,
                                this.raqmonParticipantNetOwdMean,
                                this.raqmonParticipantNetOwdMin,
                                this.raqmonParticipantNetOwdMax,
                                this.raqmonParticipantAppDelayMean,
                                this.raqmonParticipantAppDelayMin,
                                this.raqmonParticipantAppDelayMax,
                                this.raqmonParticipantPacketsRcvd,
                                this.raqmonParticipantPacketsSent,
                                this.raqmonParticipantOctetsRcvd,
                                this.raqmonParticipantOctetsSent,
                                this.raqmonParticipantLostPackets,
                                this.raqmonParticipantLostPacketsFrct,
                                this.raqmonParticipantDiscards,
                                this.raqmonParticipantDiscardsFrct
                            };
                        }
                        public static final class RaqmonParticipantStartDateEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantStartDateEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantStartDate", "1.3.6.1.2.1.16.31.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIndexEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIndexEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIndex", "1.3.6.1.2.1.16.31.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantReportCapsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantReportCapsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantReportCaps", "1.3.6.1.2.1.16.31.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantAddrTypeEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAddrTypeEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAddrType", "1.3.6.1.2.1.16.31.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantAddrEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAddrEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAddr", "1.3.6.1.2.1.16.31.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantSendPortEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantSendPortEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantSendPort", "1.3.6.1.2.1.16.31.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantRecvPortEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantRecvPortEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantRecvPort", "1.3.6.1.2.1.16.31.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantSetupDelayEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantSetupDelayEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantSetupDelay", "1.3.6.1.2.1.16.31.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNameEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNameEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantName", "1.3.6.1.2.1.16.31.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantAppNameEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAppNameEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAppName", "1.3.6.1.2.1.16.31.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantQosCountEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantQosCountEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantQosCount", "1.3.6.1.2.1.16.31.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantEndDateEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantEndDateEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantEndDate", "1.3.6.1.2.1.16.31.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantDestPayloadTypeEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantDestPayloadTypeEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantDestPayloadType", "1.3.6.1.2.1.16.31.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantSrcPayloadTypeEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantSrcPayloadTypeEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantSrcPayloadType", "1.3.6.1.2.1.16.31.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantActiveEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantActiveEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantActive", "1.3.6.1.2.1.16.31.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantPeerEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantPeerEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantPeer", "1.3.6.1.2.1.16.31.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantPeerAddrTypeEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantPeerAddrTypeEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantPeerAddrType", "1.3.6.1.2.1.16.31.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantPeerAddrEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantPeerAddrEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantPeerAddr", "1.3.6.1.2.1.16.31.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantSrcL2PriorityEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantSrcL2PriorityEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantSrcL2Priority", "1.3.6.1.2.1.16.31.1.1.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantDestL2PriorityEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantDestL2PriorityEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantDestL2Priority", "1.3.6.1.2.1.16.31.1.1.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantSrcDSCPEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantSrcDSCPEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantSrcDSCP", "1.3.6.1.2.1.16.31.1.1.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantDestDSCPEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantDestDSCPEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantDestDSCP", "1.3.6.1.2.1.16.31.1.1.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantCpuMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantCpuMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantCpuMean", "1.3.6.1.2.1.16.31.1.1.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantCpuMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantCpuMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantCpuMin", "1.3.6.1.2.1.16.31.1.1.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantCpuMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantCpuMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantCpuMax", "1.3.6.1.2.1.16.31.1.1.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantMemoryMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantMemoryMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantMemoryMean", "1.3.6.1.2.1.16.31.1.1.1.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantMemoryMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantMemoryMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantMemoryMin", "1.3.6.1.2.1.16.31.1.1.1.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantMemoryMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantMemoryMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantMemoryMax", "1.3.6.1.2.1.16.31.1.1.1.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNetRTTMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNetRTTMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantNetRTTMean", "1.3.6.1.2.1.16.31.1.1.1.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNetRTTMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNetRTTMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantNetRTTMin", "1.3.6.1.2.1.16.31.1.1.1.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNetRTTMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNetRTTMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantNetRTTMax", "1.3.6.1.2.1.16.31.1.1.1.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIAJitterMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIAJitterMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIAJitterMean", "1.3.6.1.2.1.16.31.1.1.1.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIAJitterMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIAJitterMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIAJitterMin", "1.3.6.1.2.1.16.31.1.1.1.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIAJitterMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIAJitterMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIAJitterMax", "1.3.6.1.2.1.16.31.1.1.1.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIPDVMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIPDVMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIPDVMean", "1.3.6.1.2.1.16.31.1.1.1.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIPDVMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIPDVMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIPDVMin", "1.3.6.1.2.1.16.31.1.1.1.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantIPDVMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantIPDVMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantIPDVMax", "1.3.6.1.2.1.16.31.1.1.1.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNetOwdMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNetOwdMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantNetOwdMean", "1.3.6.1.2.1.16.31.1.1.1.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNetOwdMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNetOwdMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantNetOwdMin", "1.3.6.1.2.1.16.31.1.1.1.1.39", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantNetOwdMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantNetOwdMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantNetOwdMax", "1.3.6.1.2.1.16.31.1.1.1.1.40", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantAppDelayMeanEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAppDelayMeanEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAppDelayMean", "1.3.6.1.2.1.16.31.1.1.1.1.41", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantAppDelayMinEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAppDelayMinEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAppDelayMin", "1.3.6.1.2.1.16.31.1.1.1.1.42", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantAppDelayMaxEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAppDelayMaxEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAppDelayMax", "1.3.6.1.2.1.16.31.1.1.1.1.43", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantPacketsRcvdEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantPacketsRcvdEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantPacketsRcvd", "1.3.6.1.2.1.16.31.1.1.1.1.44", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantPacketsSentEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantPacketsSentEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantPacketsSent", "1.3.6.1.2.1.16.31.1.1.1.1.45", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantOctetsRcvdEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantOctetsRcvdEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantOctetsRcvd", "1.3.6.1.2.1.16.31.1.1.1.1.46", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantOctetsSentEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantOctetsSentEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantOctetsSent", "1.3.6.1.2.1.16.31.1.1.1.1.47", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantLostPacketsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantLostPacketsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantLostPackets", "1.3.6.1.2.1.16.31.1.1.1.1.48", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantLostPacketsFrctEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantLostPacketsFrctEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantLostPacketsFrct", "1.3.6.1.2.1.16.31.1.1.1.1.49", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantDiscardsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantDiscardsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantDiscards", "1.3.6.1.2.1.16.31.1.1.1.1.50", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonParticipantDiscardsFrctEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantDiscardsFrctEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantDiscardsFrct", "1.3.6.1.2.1.16.31.1.1.1.1.51", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RaqmonQosTableEnt extends MIBEntry<RAQMONMIBDef>
                {
                    public final RaqmonQosEntryEnt raqmonQosEntry;

                    private RaqmonQosTableEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonQosTable", "1.3.6.1.2.1.16.31.1.1.2", false, true, false, false);
                        this.raqmonQosEntry = new RaqmonQosEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.raqmonQosEntry
                        };
                    }
                    public static final class RaqmonQosEntryEnt extends MIBEntry<RAQMONMIBDef>
                    {
                        public final RaqmonQosTimeEnt raqmonQosTime;

                        public final RaqmonQoSEnd2EndNetDelayEnt raqmonQoSEnd2EndNetDelay;

                        public final RaqmonQoSInterArrivalJitterEnt raqmonQoSInterArrivalJitter;

                        public final RaqmonQosRcvdPacketsEnt raqmonQosRcvdPackets;

                        public final RaqmonQosRcvdOctetsEnt raqmonQosRcvdOctets;

                        public final RaqmonQosSentPacketsEnt raqmonQosSentPackets;

                        public final RaqmonQosSentOctetsEnt raqmonQosSentOctets;

                        public final RaqmonQosLostPacketsEnt raqmonQosLostPackets;

                        public final RaqmonQosSessionStatusEnt raqmonQosSessionStatus;

                        private RaqmonQosEntryEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                        {
                            super(mib, parent, "raqmonQosEntry", "1.3.6.1.2.1.16.31.1.1.2.1", false, false, false, true);
                            this.raqmonQosTime = new RaqmonQosTimeEnt(mib, this);
                            this.raqmonQoSEnd2EndNetDelay = new RaqmonQoSEnd2EndNetDelayEnt(mib, this);
                            this.raqmonQoSInterArrivalJitter = new RaqmonQoSInterArrivalJitterEnt(mib, this);
                            this.raqmonQosRcvdPackets = new RaqmonQosRcvdPacketsEnt(mib, this);
                            this.raqmonQosRcvdOctets = new RaqmonQosRcvdOctetsEnt(mib, this);
                            this.raqmonQosSentPackets = new RaqmonQosSentPacketsEnt(mib, this);
                            this.raqmonQosSentOctets = new RaqmonQosSentOctetsEnt(mib, this);
                            this.raqmonQosLostPackets = new RaqmonQosLostPacketsEnt(mib, this);
                            this.raqmonQosSessionStatus = new RaqmonQosSessionStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.raqmonQosTime,
                                this.raqmonQoSEnd2EndNetDelay,
                                this.raqmonQoSInterArrivalJitter,
                                this.raqmonQosRcvdPackets,
                                this.raqmonQosRcvdOctets,
                                this.raqmonQosSentPackets,
                                this.raqmonQosSentOctets,
                                this.raqmonQosLostPackets,
                                this.raqmonQosSessionStatus
                            };
                        }
                        public static final class RaqmonQosTimeEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosTimeEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosTime", "1.3.6.1.2.1.16.31.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQoSEnd2EndNetDelayEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQoSEnd2EndNetDelayEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQoSEnd2EndNetDelay", "1.3.6.1.2.1.16.31.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQoSInterArrivalJitterEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQoSInterArrivalJitterEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQoSInterArrivalJitter", "1.3.6.1.2.1.16.31.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQosRcvdPacketsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosRcvdPacketsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosRcvdPackets", "1.3.6.1.2.1.16.31.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQosRcvdOctetsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosRcvdOctetsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosRcvdOctets", "1.3.6.1.2.1.16.31.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQosSentPacketsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosSentPacketsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosSentPackets", "1.3.6.1.2.1.16.31.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQosSentOctetsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosSentOctetsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosSentOctets", "1.3.6.1.2.1.16.31.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQosLostPacketsEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosLostPacketsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosLostPackets", "1.3.6.1.2.1.16.31.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonQosSessionStatusEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonQosSessionStatusEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonQosSessionStatus", "1.3.6.1.2.1.16.31.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RaqmonParticipantAddrTableEnt extends MIBEntry<RAQMONMIBDef>
                {
                    public final RaqmonParticipantAddrEntryEnt raqmonParticipantAddrEntry;

                    private RaqmonParticipantAddrTableEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonParticipantAddrTable", "1.3.6.1.2.1.16.31.1.1.3", false, true, false, false);
                        this.raqmonParticipantAddrEntry = new RaqmonParticipantAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.raqmonParticipantAddrEntry
                        };
                    }
                    public static final class RaqmonParticipantAddrEntryEnt extends MIBEntry<RAQMONMIBDef>
                    {
                        public final RaqmonParticipantAddrEndDateEnt raqmonParticipantAddrEndDate;

                        private RaqmonParticipantAddrEntryEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                        {
                            super(mib, parent, "raqmonParticipantAddrEntry", "1.3.6.1.2.1.16.31.1.1.3.1", false, false, false, true);
                            this.raqmonParticipantAddrEndDate = new RaqmonParticipantAddrEndDateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.raqmonParticipantAddrEndDate
                            };
                        }
                        public static final class RaqmonParticipantAddrEndDateEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonParticipantAddrEndDateEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonParticipantAddrEndDate", "1.3.6.1.2.1.16.31.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RaqmonExceptionEnt extends MIBEntry<RAQMONMIBDef>
            {
                public final RaqmonSessionExceptionTableEnt raqmonSessionExceptionTable;

                private RaqmonExceptionEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                {
                    super(mib, parent, "raqmonException", "1.3.6.1.2.1.16.31.1.2", false, false, false, false);
                    this.raqmonSessionExceptionTable = new RaqmonSessionExceptionTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.raqmonSessionExceptionTable
                    };
                }
                public static final class RaqmonSessionExceptionTableEnt extends MIBEntry<RAQMONMIBDef>
                {
                    public final RaqmonSessionExceptionEntryEnt raqmonSessionExceptionEntry;

                    private RaqmonSessionExceptionTableEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonSessionExceptionTable", "1.3.6.1.2.1.16.31.1.2.2", false, true, false, false);
                        this.raqmonSessionExceptionEntry = new RaqmonSessionExceptionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.raqmonSessionExceptionEntry
                        };
                    }
                    public static final class RaqmonSessionExceptionEntryEnt extends MIBEntry<RAQMONMIBDef>
                    {
                        public final RaqmonSessionExceptionIndexEnt raqmonSessionExceptionIndex;

                        public final RaqmonSessionExceptionIAJitterThresholdEnt raqmonSessionExceptionIAJitterThreshold;

                        public final RaqmonSessionExceptionNetRTTThresholdEnt raqmonSessionExceptionNetRTTThreshold;

                        public final RaqmonSessionExceptionLostPacketsThresholdEnt raqmonSessionExceptionLostPacketsThreshold;

                        public final RaqmonSessionExceptionRowStatusEnt raqmonSessionExceptionRowStatus;

                        private RaqmonSessionExceptionEntryEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                        {
                            super(mib, parent, "raqmonSessionExceptionEntry", "1.3.6.1.2.1.16.31.1.2.2.1", false, false, false, true);
                            this.raqmonSessionExceptionIndex = new RaqmonSessionExceptionIndexEnt(mib, this);
                            this.raqmonSessionExceptionIAJitterThreshold = new RaqmonSessionExceptionIAJitterThresholdEnt(mib, this);
                            this.raqmonSessionExceptionNetRTTThreshold = new RaqmonSessionExceptionNetRTTThresholdEnt(mib, this);
                            this.raqmonSessionExceptionLostPacketsThreshold = new RaqmonSessionExceptionLostPacketsThresholdEnt(mib, this);
                            this.raqmonSessionExceptionRowStatus = new RaqmonSessionExceptionRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.raqmonSessionExceptionIndex,
                                this.raqmonSessionExceptionIAJitterThreshold,
                                this.raqmonSessionExceptionNetRTTThreshold,
                                this.raqmonSessionExceptionLostPacketsThreshold,
                                this.raqmonSessionExceptionRowStatus
                            };
                        }
                        public static final class RaqmonSessionExceptionIndexEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonSessionExceptionIndexEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonSessionExceptionIndex", "1.3.6.1.2.1.16.31.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonSessionExceptionIAJitterThresholdEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonSessionExceptionIAJitterThresholdEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonSessionExceptionIAJitterThreshold", "1.3.6.1.2.1.16.31.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonSessionExceptionNetRTTThresholdEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonSessionExceptionNetRTTThresholdEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonSessionExceptionNetRTTThreshold", "1.3.6.1.2.1.16.31.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonSessionExceptionLostPacketsThresholdEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonSessionExceptionLostPacketsThresholdEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonSessionExceptionLostPacketsThreshold", "1.3.6.1.2.1.16.31.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RaqmonSessionExceptionRowStatusEnt extends MIBEntry<RAQMONMIBDef>
                        {
                            private RaqmonSessionExceptionRowStatusEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                            {
                                super(mib, parent, "raqmonSessionExceptionRowStatus", "1.3.6.1.2.1.16.31.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RaqmonConfigEnt extends MIBEntry<RAQMONMIBDef>
            {
                public final RaqmonConfigPortEnt raqmonConfigPort;

                public final RaqmonConfigPduTransportEnt raqmonConfigPduTransport;

                public final RaqmonConfigRaqmonPdusEnt raqmonConfigRaqmonPdus;

                public final RaqmonConfigRDSTimeoutEnt raqmonConfigRDSTimeout;

                private RaqmonConfigEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                {
                    super(mib, parent, "raqmonConfig", "1.3.6.1.2.1.16.31.1.3", false, false, false, false);
                    this.raqmonConfigPort = new RaqmonConfigPortEnt(mib, this);
                    this.raqmonConfigPduTransport = new RaqmonConfigPduTransportEnt(mib, this);
                    this.raqmonConfigRaqmonPdus = new RaqmonConfigRaqmonPdusEnt(mib, this);
                    this.raqmonConfigRDSTimeout = new RaqmonConfigRDSTimeoutEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.raqmonConfigPort,
                        this.raqmonConfigPduTransport,
                        this.raqmonConfigRaqmonPdus,
                        this.raqmonConfigRDSTimeout
                    };
                }
                public static final class RaqmonConfigPortEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonConfigPortEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonConfigPort", "1.3.6.1.2.1.16.31.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RaqmonConfigPduTransportEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonConfigPduTransportEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonConfigPduTransport", "1.3.6.1.2.1.16.31.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RaqmonConfigRaqmonPdusEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonConfigRaqmonPdusEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonConfigRaqmonPdus", "1.3.6.1.2.1.16.31.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RaqmonConfigRDSTimeoutEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonConfigRDSTimeoutEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonConfigRDSTimeout", "1.3.6.1.2.1.16.31.1.3.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RaqmonConformanceEnt extends MIBEntry<RAQMONMIBDef>
        {
            public final RaqmonCompliancesEnt raqmonCompliances;

            public final RaqmonGroupsEnt raqmonGroups;

            private RaqmonConformanceEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
            {
                super(mib, parent, "raqmonConformance", "1.3.6.1.2.1.16.31.2", false, false, false, false);
                this.raqmonCompliances = new RaqmonCompliancesEnt(mib, this);
                this.raqmonGroups = new RaqmonGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.raqmonCompliances,
                    this.raqmonGroups
                };
            }
            public static final class RaqmonCompliancesEnt extends MIBEntry<RAQMONMIBDef>
            {
                public final RaqmonComplianceEnt raqmonCompliance;

                private RaqmonCompliancesEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                {
                    super(mib, parent, "raqmonCompliances", "1.3.6.1.2.1.16.31.2.1", false, false, false, false);
                    this.raqmonCompliance = new RaqmonComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.raqmonCompliance
                    };
                }
                public static final class RaqmonComplianceEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonComplianceEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonCompliance", "1.3.6.1.2.1.16.31.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RaqmonGroupsEnt extends MIBEntry<RAQMONMIBDef>
            {
                public final RaqmonCollectorGroupEnt raqmonCollectorGroup;

                public final RaqmonCollectorNotificationsGroupEnt raqmonCollectorNotificationsGroup;

                private RaqmonGroupsEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                {
                    super(mib, parent, "raqmonGroups", "1.3.6.1.2.1.16.31.2.2", false, false, false, false);
                    this.raqmonCollectorGroup = new RaqmonCollectorGroupEnt(mib, this);
                    this.raqmonCollectorNotificationsGroup = new RaqmonCollectorNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.raqmonCollectorGroup,
                        this.raqmonCollectorNotificationsGroup
                    };
                }
                public static final class RaqmonCollectorGroupEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonCollectorGroupEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonCollectorGroup", "1.3.6.1.2.1.16.31.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RaqmonCollectorNotificationsGroupEnt extends MIBEntry<RAQMONMIBDef>
                {
                    private RaqmonCollectorNotificationsGroupEnt(RAQMONMIBDef mib, MIBEntry<RAQMONMIBDef> parent)
                    {
                        super(mib, parent, "raqmonCollectorNotificationsGroup", "1.3.6.1.2.1.16.31.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
