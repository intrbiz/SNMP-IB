package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class MSDPMIBDef extends MIB
{
    public static final MSDPMIBDef MSDPMIB = new MSDPMIBDef();

    static { MIBs.getInstance().registerMIB(MSDPMIBDef.MSDPMIB); }

    public final MsdpMIBEnt msdpMIB;

    private MSDPMIBDef()
    {
        super("MSDP-MIB");
        this.msdpMIB = new MsdpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.msdpMIB
        };
    }

    public static final class MsdpMIBEnt extends MIBEntry<MSDPMIBDef>
    {
        public final MsdpMIBobjectsEnt msdpMIBobjects;

        private MsdpMIBEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
        {
            super(mib, parent, "msdpMIB", "1.3.6.1.3.92", false, false, false, false);
            this.msdpMIBobjects = new MsdpMIBobjectsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.msdpMIBobjects
            };
        }
        public static final class MsdpMIBobjectsEnt extends MIBEntry<MSDPMIBDef>
        {
            public final MsdpEnt msdp;

            private MsdpMIBobjectsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
            {
                super(mib, parent, "msdpMIBobjects", "1.3.6.1.3.92.1", false, false, false, false);
                this.msdp = new MsdpEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.msdp
                };
            }
            public static final class MsdpEnt extends MIBEntry<MSDPMIBDef>
            {
                public final MsdpEnabledEnt msdpEnabled;

                public final MsdpCacheLifetimeEnt msdpCacheLifetime;

                public final MsdpNumSACacheEntriesEnt msdpNumSACacheEntries;

                /** The spec doesn't define SA-Hold-Down-Period any more.msdpSAHoldDownPeriod OBJECT-TYPE::= { msdp 9 }
This object was introduced in error, with a similar definitionto msdpCacheLifetime.msdpSAStatePeriod OBJECT-TYPE::= { msdp 10 }*/
                public final MsdpRPAddressEnt msdpRPAddress;

                /** The MSDP Requests tableSA Requests were removed from the MSDP spec, so this entire tableis deprecated.*/
                public final MsdpRequestsTableEnt msdpRequestsTable;

                /** The MSDP Peer table*/
                public final MsdpPeerTableEnt msdpPeerTable;

                /** The MSDP Source-Active Cache table*/
                public final MsdpSACacheTableEnt msdpSACacheTable;

                /** MSDP Mesh Group Membership table*/
                public final MsdpMeshGroupTableEnt msdpMeshGroupTable;

                /** Traps*/
                public final MsdpTrapsEnt msdpTraps;

                /** conformance information*/
                public final MsdpMIBConformanceEnt msdpMIBConformance;

                private MsdpEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                {
                    super(mib, parent, "msdp", "1.3.6.1.3.92.1.1", false, false, false, false);
                    this.msdpEnabled = new MsdpEnabledEnt(mib, this);
                    this.msdpCacheLifetime = new MsdpCacheLifetimeEnt(mib, this);
                    this.msdpNumSACacheEntries = new MsdpNumSACacheEntriesEnt(mib, this);
                    this.msdpRPAddress = new MsdpRPAddressEnt(mib, this);
                    this.msdpRequestsTable = new MsdpRequestsTableEnt(mib, this);
                    this.msdpPeerTable = new MsdpPeerTableEnt(mib, this);
                    this.msdpSACacheTable = new MsdpSACacheTableEnt(mib, this);
                    this.msdpMeshGroupTable = new MsdpMeshGroupTableEnt(mib, this);
                    this.msdpTraps = new MsdpTrapsEnt(mib, this);
                    this.msdpMIBConformance = new MsdpMIBConformanceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.msdpEnabled,
                        this.msdpCacheLifetime,
                        this.msdpNumSACacheEntries,
                        this.msdpRPAddress,
                        this.msdpRequestsTable,
                        this.msdpPeerTable,
                        this.msdpSACacheTable,
                        this.msdpMeshGroupTable,
                        this.msdpTraps,
                        this.msdpMIBConformance
                    };
                }
                public static final class MsdpEnabledEnt extends MIBEntry<MSDPMIBDef>
                {
                    private MsdpEnabledEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpEnabled", "1.3.6.1.3.92.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MsdpCacheLifetimeEnt extends MIBEntry<MSDPMIBDef>
                {
                    private MsdpCacheLifetimeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpCacheLifetime", "1.3.6.1.3.92.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MsdpNumSACacheEntriesEnt extends MIBEntry<MSDPMIBDef>
                {
                    private MsdpNumSACacheEntriesEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpNumSACacheEntries", "1.3.6.1.3.92.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MsdpRPAddressEnt extends MIBEntry<MSDPMIBDef>
                {
                    private MsdpRPAddressEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpRPAddress", "1.3.6.1.3.92.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MsdpRequestsTableEnt extends MIBEntry<MSDPMIBDef>
                {
                    public final MsdpRequestsEntryEnt msdpRequestsEntry;

                    private MsdpRequestsTableEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpRequestsTable", "1.3.6.1.3.92.1.1.4", false, true, false, false);
                        this.msdpRequestsEntry = new MsdpRequestsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.msdpRequestsEntry
                        };
                    }
                    public static final class MsdpRequestsEntryEnt extends MIBEntry<MSDPMIBDef>
                    {
                        public final MsdpRequestsGroupAddressEnt msdpRequestsGroupAddress;

                        public final MsdpRequestsGroupMaskEnt msdpRequestsGroupMask;

                        public final MsdpRequestsPeerEnt msdpRequestsPeer;

                        public final MsdpRequestsStatusEnt msdpRequestsStatus;

                        private MsdpRequestsEntryEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpRequestsEntry", "1.3.6.1.3.92.1.1.4.1", false, false, false, true);
                            this.msdpRequestsGroupAddress = new MsdpRequestsGroupAddressEnt(mib, this);
                            this.msdpRequestsGroupMask = new MsdpRequestsGroupMaskEnt(mib, this);
                            this.msdpRequestsPeer = new MsdpRequestsPeerEnt(mib, this);
                            this.msdpRequestsStatus = new MsdpRequestsStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.msdpRequestsGroupAddress,
                                this.msdpRequestsGroupMask,
                                this.msdpRequestsPeer,
                                this.msdpRequestsStatus
                            };
                        }
                        public static final class MsdpRequestsGroupAddressEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpRequestsGroupAddressEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpRequestsGroupAddress", "1.3.6.1.3.92.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpRequestsGroupMaskEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpRequestsGroupMaskEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpRequestsGroupMask", "1.3.6.1.3.92.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpRequestsPeerEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpRequestsPeerEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpRequestsPeer", "1.3.6.1.3.92.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpRequestsStatusEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpRequestsStatusEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpRequestsStatus", "1.3.6.1.3.92.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MsdpPeerTableEnt extends MIBEntry<MSDPMIBDef>
                {
                    public final MsdpPeerEntryEnt msdpPeerEntry;

                    private MsdpPeerTableEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpPeerTable", "1.3.6.1.3.92.1.1.5", false, true, false, false);
                        this.msdpPeerEntry = new MsdpPeerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.msdpPeerEntry
                        };
                    }
                    public static final class MsdpPeerEntryEnt extends MIBEntry<MSDPMIBDef>
                    {
                        public final MsdpPeerRemoteAddressEnt msdpPeerRemoteAddress;

                        /** dunno what happened to 2.*/
                        public final MsdpPeerStateEnt msdpPeerState;

                        public final MsdpPeerRPFFailuresEnt msdpPeerRPFFailures;

                        public final MsdpPeerInSAsEnt msdpPeerInSAs;

                        public final MsdpPeerOutSAsEnt msdpPeerOutSAs;

                        public final MsdpPeerInSARequestsEnt msdpPeerInSARequests;

                        public final MsdpPeerOutSARequestsEnt msdpPeerOutSARequests;

                        public final MsdpPeerInSAResponsesEnt msdpPeerInSAResponses;

                        public final MsdpPeerOutSAResponsesEnt msdpPeerOutSAResponses;

                        public final MsdpPeerInControlMessagesEnt msdpPeerInControlMessages;

                        public final MsdpPeerOutControlMessagesEnt msdpPeerOutControlMessages;

                        public final MsdpPeerInDataPacketsEnt msdpPeerInDataPackets;

                        public final MsdpPeerOutDataPacketsEnt msdpPeerOutDataPackets;

                        public final MsdpPeerFsmEstablishedTransitionsEnt msdpPeerFsmEstablishedTransitions;

                        public final MsdpPeerFsmEstablishedTimeEnt msdpPeerFsmEstablishedTime;

                        public final MsdpPeerInMessageTimeEnt msdpPeerInMessageTime;

                        public final MsdpPeerLocalAddressEnt msdpPeerLocalAddress;

                        /** msdpPeerSAAdvPeriod ([SA-Advertisement-Timer]) has been removed.::= { msdpPeerEntry 19 }RFC 3618, Section 5.1, says it MUST be 60 seconds.*/
                        public final MsdpPeerConnectRetryIntervalEnt msdpPeerConnectRetryInterval;

                        public final MsdpPeerHoldTimeConfiguredEnt msdpPeerHoldTimeConfigured;

                        public final MsdpPeerKeepAliveConfiguredEnt msdpPeerKeepAliveConfigured;

                        public final MsdpPeerDataTtlEnt msdpPeerDataTtl;

                        public final MsdpPeerProcessRequestsFromEnt msdpPeerProcessRequestsFrom;

                        public final MsdpPeerStatusEnt msdpPeerStatus;

                        public final MsdpPeerRemotePortEnt msdpPeerRemotePort;

                        public final MsdpPeerLocalPortEnt msdpPeerLocalPort;

                        /** msdpPeerEncapsulationState has been removedbecause there is no longer an encapsulationstate machine.::= { msdpPeerEntry 28 }*/
                        public final MsdpPeerEncapsulationTypeEnt msdpPeerEncapsulationType;

                        public final MsdpPeerConnectionAttemptsEnt msdpPeerConnectionAttempts;

                        public final MsdpPeerInNotificationsEnt msdpPeerInNotifications;

                        public final MsdpPeerOutNotificationsEnt msdpPeerOutNotifications;

                        public final MsdpPeerLastErrorEnt msdpPeerLastError;

                        public final MsdpPeerDiscontinuityTimeEnt msdpPeerDiscontinuityTime;

                        private MsdpPeerEntryEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpPeerEntry", "1.3.6.1.3.92.1.1.5.1", false, false, false, true);
                            this.msdpPeerRemoteAddress = new MsdpPeerRemoteAddressEnt(mib, this);
                            this.msdpPeerState = new MsdpPeerStateEnt(mib, this);
                            this.msdpPeerRPFFailures = new MsdpPeerRPFFailuresEnt(mib, this);
                            this.msdpPeerInSAs = new MsdpPeerInSAsEnt(mib, this);
                            this.msdpPeerOutSAs = new MsdpPeerOutSAsEnt(mib, this);
                            this.msdpPeerInSARequests = new MsdpPeerInSARequestsEnt(mib, this);
                            this.msdpPeerOutSARequests = new MsdpPeerOutSARequestsEnt(mib, this);
                            this.msdpPeerInSAResponses = new MsdpPeerInSAResponsesEnt(mib, this);
                            this.msdpPeerOutSAResponses = new MsdpPeerOutSAResponsesEnt(mib, this);
                            this.msdpPeerInControlMessages = new MsdpPeerInControlMessagesEnt(mib, this);
                            this.msdpPeerOutControlMessages = new MsdpPeerOutControlMessagesEnt(mib, this);
                            this.msdpPeerInDataPackets = new MsdpPeerInDataPacketsEnt(mib, this);
                            this.msdpPeerOutDataPackets = new MsdpPeerOutDataPacketsEnt(mib, this);
                            this.msdpPeerFsmEstablishedTransitions = new MsdpPeerFsmEstablishedTransitionsEnt(mib, this);
                            this.msdpPeerFsmEstablishedTime = new MsdpPeerFsmEstablishedTimeEnt(mib, this);
                            this.msdpPeerInMessageTime = new MsdpPeerInMessageTimeEnt(mib, this);
                            this.msdpPeerLocalAddress = new MsdpPeerLocalAddressEnt(mib, this);
                            this.msdpPeerConnectRetryInterval = new MsdpPeerConnectRetryIntervalEnt(mib, this);
                            this.msdpPeerHoldTimeConfigured = new MsdpPeerHoldTimeConfiguredEnt(mib, this);
                            this.msdpPeerKeepAliveConfigured = new MsdpPeerKeepAliveConfiguredEnt(mib, this);
                            this.msdpPeerDataTtl = new MsdpPeerDataTtlEnt(mib, this);
                            this.msdpPeerProcessRequestsFrom = new MsdpPeerProcessRequestsFromEnt(mib, this);
                            this.msdpPeerStatus = new MsdpPeerStatusEnt(mib, this);
                            this.msdpPeerRemotePort = new MsdpPeerRemotePortEnt(mib, this);
                            this.msdpPeerLocalPort = new MsdpPeerLocalPortEnt(mib, this);
                            this.msdpPeerEncapsulationType = new MsdpPeerEncapsulationTypeEnt(mib, this);
                            this.msdpPeerConnectionAttempts = new MsdpPeerConnectionAttemptsEnt(mib, this);
                            this.msdpPeerInNotifications = new MsdpPeerInNotificationsEnt(mib, this);
                            this.msdpPeerOutNotifications = new MsdpPeerOutNotificationsEnt(mib, this);
                            this.msdpPeerLastError = new MsdpPeerLastErrorEnt(mib, this);
                            this.msdpPeerDiscontinuityTime = new MsdpPeerDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.msdpPeerRemoteAddress,
                                this.msdpPeerState,
                                this.msdpPeerRPFFailures,
                                this.msdpPeerInSAs,
                                this.msdpPeerOutSAs,
                                this.msdpPeerInSARequests,
                                this.msdpPeerOutSARequests,
                                this.msdpPeerInSAResponses,
                                this.msdpPeerOutSAResponses,
                                this.msdpPeerInControlMessages,
                                this.msdpPeerOutControlMessages,
                                this.msdpPeerInDataPackets,
                                this.msdpPeerOutDataPackets,
                                this.msdpPeerFsmEstablishedTransitions,
                                this.msdpPeerFsmEstablishedTime,
                                this.msdpPeerInMessageTime,
                                this.msdpPeerLocalAddress,
                                this.msdpPeerConnectRetryInterval,
                                this.msdpPeerHoldTimeConfigured,
                                this.msdpPeerKeepAliveConfigured,
                                this.msdpPeerDataTtl,
                                this.msdpPeerProcessRequestsFrom,
                                this.msdpPeerStatus,
                                this.msdpPeerRemotePort,
                                this.msdpPeerLocalPort,
                                this.msdpPeerEncapsulationType,
                                this.msdpPeerConnectionAttempts,
                                this.msdpPeerInNotifications,
                                this.msdpPeerOutNotifications,
                                this.msdpPeerLastError,
                                this.msdpPeerDiscontinuityTime
                            };
                        }
                        public static final class MsdpPeerRemoteAddressEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerRemoteAddressEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerRemoteAddress", "1.3.6.1.3.92.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerStateEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerStateEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerState", "1.3.6.1.3.92.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerRPFFailuresEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerRPFFailuresEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerRPFFailures", "1.3.6.1.3.92.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInSAsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInSAsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInSAs", "1.3.6.1.3.92.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerOutSAsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerOutSAsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerOutSAs", "1.3.6.1.3.92.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInSARequestsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInSARequestsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInSARequests", "1.3.6.1.3.92.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerOutSARequestsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerOutSARequestsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerOutSARequests", "1.3.6.1.3.92.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInSAResponsesEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInSAResponsesEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInSAResponses", "1.3.6.1.3.92.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerOutSAResponsesEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerOutSAResponsesEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerOutSAResponses", "1.3.6.1.3.92.1.1.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInControlMessagesEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInControlMessagesEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInControlMessages", "1.3.6.1.3.92.1.1.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerOutControlMessagesEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerOutControlMessagesEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerOutControlMessages", "1.3.6.1.3.92.1.1.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInDataPacketsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInDataPacketsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInDataPackets", "1.3.6.1.3.92.1.1.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerOutDataPacketsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerOutDataPacketsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerOutDataPackets", "1.3.6.1.3.92.1.1.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerFsmEstablishedTransitionsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerFsmEstablishedTransitionsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerFsmEstablishedTransitions", "1.3.6.1.3.92.1.1.5.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerFsmEstablishedTimeEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerFsmEstablishedTimeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerFsmEstablishedTime", "1.3.6.1.3.92.1.1.5.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInMessageTimeEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInMessageTimeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInMessageTime", "1.3.6.1.3.92.1.1.5.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerLocalAddressEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerLocalAddressEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerLocalAddress", "1.3.6.1.3.92.1.1.5.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerConnectRetryIntervalEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerConnectRetryIntervalEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerConnectRetryInterval", "1.3.6.1.3.92.1.1.5.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerHoldTimeConfiguredEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerHoldTimeConfiguredEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerHoldTimeConfigured", "1.3.6.1.3.92.1.1.5.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerKeepAliveConfiguredEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerKeepAliveConfiguredEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerKeepAliveConfigured", "1.3.6.1.3.92.1.1.5.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerDataTtlEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerDataTtlEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerDataTtl", "1.3.6.1.3.92.1.1.5.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerProcessRequestsFromEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerProcessRequestsFromEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerProcessRequestsFrom", "1.3.6.1.3.92.1.1.5.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerStatusEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerStatusEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerStatus", "1.3.6.1.3.92.1.1.5.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerRemotePortEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerRemotePortEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerRemotePort", "1.3.6.1.3.92.1.1.5.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerLocalPortEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerLocalPortEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerLocalPort", "1.3.6.1.3.92.1.1.5.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerEncapsulationTypeEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerEncapsulationTypeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerEncapsulationType", "1.3.6.1.3.92.1.1.5.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerConnectionAttemptsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerConnectionAttemptsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerConnectionAttempts", "1.3.6.1.3.92.1.1.5.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerInNotificationsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerInNotificationsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerInNotifications", "1.3.6.1.3.92.1.1.5.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerOutNotificationsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerOutNotificationsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerOutNotifications", "1.3.6.1.3.92.1.1.5.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerLastErrorEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerLastErrorEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerLastError", "1.3.6.1.3.92.1.1.5.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpPeerDiscontinuityTimeEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpPeerDiscontinuityTimeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpPeerDiscontinuityTime", "1.3.6.1.3.92.1.1.5.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MsdpSACacheTableEnt extends MIBEntry<MSDPMIBDef>
                {
                    public final MsdpSACacheEntryEnt msdpSACacheEntry;

                    private MsdpSACacheTableEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpSACacheTable", "1.3.6.1.3.92.1.1.6", false, true, false, false);
                        this.msdpSACacheEntry = new MsdpSACacheEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.msdpSACacheEntry
                        };
                    }
                    public static final class MsdpSACacheEntryEnt extends MIBEntry<MSDPMIBDef>
                    {
                        public final MsdpSACacheGroupAddrEnt msdpSACacheGroupAddr;

                        public final MsdpSACacheSourceAddrEnt msdpSACacheSourceAddr;

                        public final MsdpSACacheOriginRPEnt msdpSACacheOriginRP;

                        public final MsdpSACachePeerLearnedFromEnt msdpSACachePeerLearnedFrom;

                        public final MsdpSACacheRPFPeerEnt msdpSACacheRPFPeer;

                        public final MsdpSACacheInSAsEnt msdpSACacheInSAs;

                        public final MsdpSACacheInDataPacketsEnt msdpSACacheInDataPackets;

                        public final MsdpSACacheUpTimeEnt msdpSACacheUpTime;

                        public final MsdpSACacheExpiryTimeEnt msdpSACacheExpiryTime;

                        public final MsdpSACacheStatusEnt msdpSACacheStatus;

                        private MsdpSACacheEntryEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpSACacheEntry", "1.3.6.1.3.92.1.1.6.1", false, false, false, true);
                            this.msdpSACacheGroupAddr = new MsdpSACacheGroupAddrEnt(mib, this);
                            this.msdpSACacheSourceAddr = new MsdpSACacheSourceAddrEnt(mib, this);
                            this.msdpSACacheOriginRP = new MsdpSACacheOriginRPEnt(mib, this);
                            this.msdpSACachePeerLearnedFrom = new MsdpSACachePeerLearnedFromEnt(mib, this);
                            this.msdpSACacheRPFPeer = new MsdpSACacheRPFPeerEnt(mib, this);
                            this.msdpSACacheInSAs = new MsdpSACacheInSAsEnt(mib, this);
                            this.msdpSACacheInDataPackets = new MsdpSACacheInDataPacketsEnt(mib, this);
                            this.msdpSACacheUpTime = new MsdpSACacheUpTimeEnt(mib, this);
                            this.msdpSACacheExpiryTime = new MsdpSACacheExpiryTimeEnt(mib, this);
                            this.msdpSACacheStatus = new MsdpSACacheStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.msdpSACacheGroupAddr,
                                this.msdpSACacheSourceAddr,
                                this.msdpSACacheOriginRP,
                                this.msdpSACachePeerLearnedFrom,
                                this.msdpSACacheRPFPeer,
                                this.msdpSACacheInSAs,
                                this.msdpSACacheInDataPackets,
                                this.msdpSACacheUpTime,
                                this.msdpSACacheExpiryTime,
                                this.msdpSACacheStatus
                            };
                        }
                        public static final class MsdpSACacheGroupAddrEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheGroupAddrEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheGroupAddr", "1.3.6.1.3.92.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheSourceAddrEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheSourceAddrEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheSourceAddr", "1.3.6.1.3.92.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheOriginRPEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheOriginRPEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheOriginRP", "1.3.6.1.3.92.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACachePeerLearnedFromEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACachePeerLearnedFromEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACachePeerLearnedFrom", "1.3.6.1.3.92.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheRPFPeerEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheRPFPeerEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheRPFPeer", "1.3.6.1.3.92.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheInSAsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheInSAsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheInSAs", "1.3.6.1.3.92.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheInDataPacketsEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheInDataPacketsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheInDataPackets", "1.3.6.1.3.92.1.1.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheUpTimeEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheUpTimeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheUpTime", "1.3.6.1.3.92.1.1.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheExpiryTimeEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheExpiryTimeEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheExpiryTime", "1.3.6.1.3.92.1.1.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpSACacheStatusEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpSACacheStatusEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpSACacheStatus", "1.3.6.1.3.92.1.1.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MsdpMeshGroupTableEnt extends MIBEntry<MSDPMIBDef>
                {
                    public final MsdpMeshGroupEntryEnt msdpMeshGroupEntry;

                    private MsdpMeshGroupTableEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpMeshGroupTable", "1.3.6.1.3.92.1.1.12", false, true, false, false);
                        this.msdpMeshGroupEntry = new MsdpMeshGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.msdpMeshGroupEntry
                        };
                    }
                    public static final class MsdpMeshGroupEntryEnt extends MIBEntry<MSDPMIBDef>
                    {
                        public final MsdpMeshGroupNameEnt msdpMeshGroupName;

                        public final MsdpMeshGroupPeerAddressEnt msdpMeshGroupPeerAddress;

                        public final MsdpMeshGroupStatusEnt msdpMeshGroupStatus;

                        private MsdpMeshGroupEntryEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpMeshGroupEntry", "1.3.6.1.3.92.1.1.12.1", false, false, false, true);
                            this.msdpMeshGroupName = new MsdpMeshGroupNameEnt(mib, this);
                            this.msdpMeshGroupPeerAddress = new MsdpMeshGroupPeerAddressEnt(mib, this);
                            this.msdpMeshGroupStatus = new MsdpMeshGroupStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.msdpMeshGroupName,
                                this.msdpMeshGroupPeerAddress,
                                this.msdpMeshGroupStatus
                            };
                        }
                        public static final class MsdpMeshGroupNameEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMeshGroupNameEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMeshGroupName", "1.3.6.1.3.92.1.1.12.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMeshGroupPeerAddressEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMeshGroupPeerAddressEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMeshGroupPeerAddress", "1.3.6.1.3.92.1.1.12.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMeshGroupStatusEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMeshGroupStatusEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMeshGroupStatus", "1.3.6.1.3.92.1.1.12.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MsdpTrapsEnt extends MIBEntry<MSDPMIBDef>
                {
                    public final MsdpEstablishedEnt msdpEstablished;

                    public final MsdpBackwardTransitionEnt msdpBackwardTransition;

                    private MsdpTrapsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpTraps", "1.3.6.1.3.92.1.1.0", false, false, false, false);
                        this.msdpEstablished = new MsdpEstablishedEnt(mib, this);
                        this.msdpBackwardTransition = new MsdpBackwardTransitionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.msdpEstablished,
                            this.msdpBackwardTransition
                        };
                    }
                    public static final class MsdpEstablishedEnt extends MIBEntry<MSDPMIBDef>
                    {
                        private MsdpEstablishedEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpEstablished", "1.3.6.1.3.92.1.1.0.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MsdpBackwardTransitionEnt extends MIBEntry<MSDPMIBDef>
                    {
                        private MsdpBackwardTransitionEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpBackwardTransition", "1.3.6.1.3.92.1.1.0.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MsdpMIBConformanceEnt extends MIBEntry<MSDPMIBDef>
                {
                    public final MsdpMIBCompliancesEnt msdpMIBCompliances;

                    public final MsdpMIBGroupsEnt msdpMIBGroups;

                    private MsdpMIBConformanceEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                    {
                        super(mib, parent, "msdpMIBConformance", "1.3.6.1.3.92.1.1.8", false, false, false, false);
                        this.msdpMIBCompliances = new MsdpMIBCompliancesEnt(mib, this);
                        this.msdpMIBGroups = new MsdpMIBGroupsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.msdpMIBCompliances,
                            this.msdpMIBGroups
                        };
                    }
                    public static final class MsdpMIBCompliancesEnt extends MIBEntry<MSDPMIBDef>
                    {
                        /** compliance statements*/
                        public final MsdpMIBComplianceEnt msdpMIBCompliance;

                        public final MsdpMIBFullComplianceEnt msdpMIBFullCompliance;

                        public final MsdpMIBReadOnlyComplianceEnt msdpMIBReadOnlyCompliance;

                        private MsdpMIBCompliancesEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpMIBCompliances", "1.3.6.1.3.92.1.1.8.1", false, false, false, false);
                            this.msdpMIBCompliance = new MsdpMIBComplianceEnt(mib, this);
                            this.msdpMIBFullCompliance = new MsdpMIBFullComplianceEnt(mib, this);
                            this.msdpMIBReadOnlyCompliance = new MsdpMIBReadOnlyComplianceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.msdpMIBCompliance,
                                this.msdpMIBFullCompliance,
                                this.msdpMIBReadOnlyCompliance
                            };
                        }
                        public static final class MsdpMIBComplianceEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBComplianceEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBCompliance", "1.3.6.1.3.92.1.1.8.1.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBFullComplianceEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBFullComplianceEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBFullCompliance", "1.3.6.1.3.92.1.1.8.1.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBReadOnlyComplianceEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBReadOnlyComplianceEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBReadOnlyCompliance", "1.3.6.1.3.92.1.1.8.1.3", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class MsdpMIBGroupsEnt extends MIBEntry<MSDPMIBDef>
                    {
                        /** units of conformance*/
                        public final MsdpMIBGlobalsGroupEnt msdpMIBGlobalsGroup;

                        public final MsdpMIBPeerGroupEnt msdpMIBPeerGroup;

                        public final MsdpMIBEncapsulationGroupEnt msdpMIBEncapsulationGroup;

                        public final MsdpMIBSACacheGroupEnt msdpMIBSACacheGroup;

                        public final MsdpMIBNotificationGroupEnt msdpMIBNotificationGroup;

                        public final MsdpMIBRequestsGroupEnt msdpMIBRequestsGroup;

                        public final MsdpMIBRPGroupEnt msdpMIBRPGroup;

                        public final MsdpMIBMeshGroupGroupEnt msdpMIBMeshGroupGroup;

                        public final MsdpMIBPeerGroup2Ent msdpMIBPeerGroup2;

                        private MsdpMIBGroupsEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                        {
                            super(mib, parent, "msdpMIBGroups", "1.3.6.1.3.92.1.1.8.2", false, false, false, false);
                            this.msdpMIBGlobalsGroup = new MsdpMIBGlobalsGroupEnt(mib, this);
                            this.msdpMIBPeerGroup = new MsdpMIBPeerGroupEnt(mib, this);
                            this.msdpMIBEncapsulationGroup = new MsdpMIBEncapsulationGroupEnt(mib, this);
                            this.msdpMIBSACacheGroup = new MsdpMIBSACacheGroupEnt(mib, this);
                            this.msdpMIBNotificationGroup = new MsdpMIBNotificationGroupEnt(mib, this);
                            this.msdpMIBRequestsGroup = new MsdpMIBRequestsGroupEnt(mib, this);
                            this.msdpMIBRPGroup = new MsdpMIBRPGroupEnt(mib, this);
                            this.msdpMIBMeshGroupGroup = new MsdpMIBMeshGroupGroupEnt(mib, this);
                            this.msdpMIBPeerGroup2 = new MsdpMIBPeerGroup2Ent(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.msdpMIBGlobalsGroup,
                                this.msdpMIBPeerGroup,
                                this.msdpMIBEncapsulationGroup,
                                this.msdpMIBSACacheGroup,
                                this.msdpMIBNotificationGroup,
                                this.msdpMIBRequestsGroup,
                                this.msdpMIBRPGroup,
                                this.msdpMIBMeshGroupGroup,
                                this.msdpMIBPeerGroup2
                            };
                        }
                        public static final class MsdpMIBGlobalsGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBGlobalsGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBGlobalsGroup", "1.3.6.1.3.92.1.1.8.2.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBPeerGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBPeerGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBPeerGroup", "1.3.6.1.3.92.1.1.8.2.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBEncapsulationGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBEncapsulationGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBEncapsulationGroup", "1.3.6.1.3.92.1.1.8.2.3", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBSACacheGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBSACacheGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBSACacheGroup", "1.3.6.1.3.92.1.1.8.2.4", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBNotificationGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBNotificationGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBNotificationGroup", "1.3.6.1.3.92.1.1.8.2.5", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBRequestsGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBRequestsGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBRequestsGroup", "1.3.6.1.3.92.1.1.8.2.6", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBRPGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBRPGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBRPGroup", "1.3.6.1.3.92.1.1.8.2.7", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBMeshGroupGroupEnt extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBMeshGroupGroupEnt(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBMeshGroupGroup", "1.3.6.1.3.92.1.1.8.2.8", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MsdpMIBPeerGroup2Ent extends MIBEntry<MSDPMIBDef>
                        {
                            private MsdpMIBPeerGroup2Ent(MSDPMIBDef mib, MIBEntry<MSDPMIBDef> parent)
                            {
                                super(mib, parent, "msdpMIBPeerGroup2", "1.3.6.1.3.92.1.1.8.2.9", false, false, false, false);
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
