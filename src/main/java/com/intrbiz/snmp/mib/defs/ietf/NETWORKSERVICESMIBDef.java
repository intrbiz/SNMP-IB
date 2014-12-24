package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class NETWORKSERVICESMIBDef extends MIB
{
    public static final NETWORKSERVICESMIBDef NETWORKSERVICESMIB = new NETWORKSERVICESMIBDef();

    public final ApplicationEnt application;

    private NETWORKSERVICESMIBDef()
    {
        super("NETWORK-SERVICES-MIB");
        this.application = new ApplicationEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.application
        };
    }

    public static final class ApplicationEnt extends MIBEntry<NETWORKSERVICESMIBDef>
    {
        /** The basic applTable contains a list of the applicationentities.*/
        public final ApplTableEnt applTable;

        /** The assocTable augments the information in the applTablewith information about associations.  Note that two levelsof compliance are specified below, depending on whetherassociation monitoring is mandated.*/
        public final AssocTableEnt assocTable;

        /** Conformance information*/
        public final ApplConformanceEnt applConformance;

        /** OIDs of the form {applTCPProtoID port} are intended to be usedfor TCP-based protocols that don't have OIDs assigned by othermeans. {applUDPProtoID port} serves the same purpose forUDP-based protocols. In either case 'port' corresponds tothe primary port number being used by the protocol. For example,assuming no other OID is assigned for SMTP, an OID of{applTCPProtoID 25} could be used, since SMTP is a TCP-basedprotocol that uses port 25 as its primary port.*/
        public final ApplTCPProtoIDEnt applTCPProtoID;

        public final ApplUDPProtoIDEnt applUDPProtoID;

        private ApplicationEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
        {
            super(mib, parent, "application", "1.3.6.1.2.1.27", false, false, false, false);
            this.applTable = new ApplTableEnt(mib, this);
            this.assocTable = new AssocTableEnt(mib, this);
            this.applConformance = new ApplConformanceEnt(mib, this);
            this.applTCPProtoID = new ApplTCPProtoIDEnt(mib, this);
            this.applUDPProtoID = new ApplUDPProtoIDEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.applTable,
                this.assocTable,
                this.applConformance,
                this.applTCPProtoID,
                this.applUDPProtoID
            };
        }
        public static final class ApplTableEnt extends MIBEntry<NETWORKSERVICESMIBDef>
        {
            public final ApplEntryEnt applEntry;

            private ApplTableEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
            {
                super(mib, parent, "applTable", "1.3.6.1.2.1.27.1", false, true, false, false);
                this.applEntry = new ApplEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.applEntry
                };
            }
            public static final class ApplEntryEnt extends MIBEntry<NETWORKSERVICESMIBDef>
            {
                public final ApplIndexEnt applIndex;

                public final ApplNameEnt applName;

                public final ApplDirectoryNameEnt applDirectoryName;

                public final ApplVersionEnt applVersion;

                public final ApplUptimeEnt applUptime;

                public final ApplOperStatusEnt applOperStatus;

                public final ApplLastChangeEnt applLastChange;

                public final ApplInboundAssociationsEnt applInboundAssociations;

                public final ApplOutboundAssociationsEnt applOutboundAssociations;

                public final ApplAccumulatedInboundAssociationsEnt applAccumulatedInboundAssociations;

                public final ApplAccumulatedOutboundAssociationsEnt applAccumulatedOutboundAssociations;

                public final ApplLastInboundActivityEnt applLastInboundActivity;

                public final ApplLastOutboundActivityEnt applLastOutboundActivity;

                public final ApplRejectedInboundAssociationsEnt applRejectedInboundAssociations;

                public final ApplFailedOutboundAssociationsEnt applFailedOutboundAssociations;

                public final ApplDescriptionEnt applDescription;

                public final ApplURLEnt applURL;

                private ApplEntryEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                {
                    super(mib, parent, "applEntry", "1.3.6.1.2.1.27.1.1", false, false, false, true);
                    this.applIndex = new ApplIndexEnt(mib, this);
                    this.applName = new ApplNameEnt(mib, this);
                    this.applDirectoryName = new ApplDirectoryNameEnt(mib, this);
                    this.applVersion = new ApplVersionEnt(mib, this);
                    this.applUptime = new ApplUptimeEnt(mib, this);
                    this.applOperStatus = new ApplOperStatusEnt(mib, this);
                    this.applLastChange = new ApplLastChangeEnt(mib, this);
                    this.applInboundAssociations = new ApplInboundAssociationsEnt(mib, this);
                    this.applOutboundAssociations = new ApplOutboundAssociationsEnt(mib, this);
                    this.applAccumulatedInboundAssociations = new ApplAccumulatedInboundAssociationsEnt(mib, this);
                    this.applAccumulatedOutboundAssociations = new ApplAccumulatedOutboundAssociationsEnt(mib, this);
                    this.applLastInboundActivity = new ApplLastInboundActivityEnt(mib, this);
                    this.applLastOutboundActivity = new ApplLastOutboundActivityEnt(mib, this);
                    this.applRejectedInboundAssociations = new ApplRejectedInboundAssociationsEnt(mib, this);
                    this.applFailedOutboundAssociations = new ApplFailedOutboundAssociationsEnt(mib, this);
                    this.applDescription = new ApplDescriptionEnt(mib, this);
                    this.applURL = new ApplURLEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applIndex,
                        this.applName,
                        this.applDirectoryName,
                        this.applVersion,
                        this.applUptime,
                        this.applOperStatus,
                        this.applLastChange,
                        this.applInboundAssociations,
                        this.applOutboundAssociations,
                        this.applAccumulatedInboundAssociations,
                        this.applAccumulatedOutboundAssociations,
                        this.applLastInboundActivity,
                        this.applLastOutboundActivity,
                        this.applRejectedInboundAssociations,
                        this.applFailedOutboundAssociations,
                        this.applDescription,
                        this.applURL
                    };
                }
                public static final class ApplIndexEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplIndexEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applIndex", "1.3.6.1.2.1.27.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplNameEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplNameEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applName", "1.3.6.1.2.1.27.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplDirectoryNameEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplDirectoryNameEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applDirectoryName", "1.3.6.1.2.1.27.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplVersionEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplVersionEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applVersion", "1.3.6.1.2.1.27.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplUptimeEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplUptimeEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applUptime", "1.3.6.1.2.1.27.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplOperStatusEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplOperStatusEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applOperStatus", "1.3.6.1.2.1.27.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplLastChangeEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplLastChangeEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applLastChange", "1.3.6.1.2.1.27.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplInboundAssociationsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplInboundAssociationsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applInboundAssociations", "1.3.6.1.2.1.27.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplOutboundAssociationsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplOutboundAssociationsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applOutboundAssociations", "1.3.6.1.2.1.27.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplAccumulatedInboundAssociationsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplAccumulatedInboundAssociationsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applAccumulatedInboundAssociations", "1.3.6.1.2.1.27.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplAccumulatedOutboundAssociationsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplAccumulatedOutboundAssociationsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applAccumulatedOutboundAssociations", "1.3.6.1.2.1.27.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplLastInboundActivityEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplLastInboundActivityEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applLastInboundActivity", "1.3.6.1.2.1.27.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplLastOutboundActivityEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplLastOutboundActivityEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applLastOutboundActivity", "1.3.6.1.2.1.27.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplRejectedInboundAssociationsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplRejectedInboundAssociationsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applRejectedInboundAssociations", "1.3.6.1.2.1.27.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplFailedOutboundAssociationsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplFailedOutboundAssociationsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applFailedOutboundAssociations", "1.3.6.1.2.1.27.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplDescriptionEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplDescriptionEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applDescription", "1.3.6.1.2.1.27.1.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplURLEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplURLEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applURL", "1.3.6.1.2.1.27.1.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AssocTableEnt extends MIBEntry<NETWORKSERVICESMIBDef>
        {
            public final AssocEntryEnt assocEntry;

            private AssocTableEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
            {
                super(mib, parent, "assocTable", "1.3.6.1.2.1.27.2", false, true, false, false);
                this.assocEntry = new AssocEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.assocEntry
                };
            }
            public static final class AssocEntryEnt extends MIBEntry<NETWORKSERVICESMIBDef>
            {
                public final AssocIndexEnt assocIndex;

                public final AssocRemoteApplicationEnt assocRemoteApplication;

                public final AssocApplicationProtocolEnt assocApplicationProtocol;

                public final AssocApplicationTypeEnt assocApplicationType;

                public final AssocDurationEnt assocDuration;

                private AssocEntryEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                {
                    super(mib, parent, "assocEntry", "1.3.6.1.2.1.27.2.1", false, false, false, true);
                    this.assocIndex = new AssocIndexEnt(mib, this);
                    this.assocRemoteApplication = new AssocRemoteApplicationEnt(mib, this);
                    this.assocApplicationProtocol = new AssocApplicationProtocolEnt(mib, this);
                    this.assocApplicationType = new AssocApplicationTypeEnt(mib, this);
                    this.assocDuration = new AssocDurationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.assocIndex,
                        this.assocRemoteApplication,
                        this.assocApplicationProtocol,
                        this.assocApplicationType,
                        this.assocDuration
                    };
                }
                public static final class AssocIndexEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocIndexEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocIndex", "1.3.6.1.2.1.27.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocRemoteApplicationEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocRemoteApplicationEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocRemoteApplication", "1.3.6.1.2.1.27.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocApplicationProtocolEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocApplicationProtocolEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocApplicationProtocol", "1.3.6.1.2.1.27.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocApplicationTypeEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocApplicationTypeEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocApplicationType", "1.3.6.1.2.1.27.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocDurationEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocDurationEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocDuration", "1.3.6.1.2.1.27.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ApplConformanceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
        {
            public final ApplGroupsEnt applGroups;

            public final ApplCompliancesEnt applCompliances;

            private ApplConformanceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
            {
                super(mib, parent, "applConformance", "1.3.6.1.2.1.27.3", false, false, false, false);
                this.applGroups = new ApplGroupsEnt(mib, this);
                this.applCompliances = new ApplCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.applGroups,
                    this.applCompliances
                };
            }
            public static final class ApplGroupsEnt extends MIBEntry<NETWORKSERVICESMIBDef>
            {
                /** Units of conformance*/
                public final ApplRFC1565GroupEnt applRFC1565Group;

                public final AssocRFC1565GroupEnt assocRFC1565Group;

                public final ApplRFC2248GroupEnt applRFC2248Group;

                public final AssocRFC2248GroupEnt assocRFC2248Group;

                public final ApplRFC2788GroupEnt applRFC2788Group;

                public final AssocRFC2788GroupEnt assocRFC2788Group;

                private ApplGroupsEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                {
                    super(mib, parent, "applGroups", "1.3.6.1.2.1.27.3.1", false, false, false, false);
                    this.applRFC1565Group = new ApplRFC1565GroupEnt(mib, this);
                    this.assocRFC1565Group = new AssocRFC1565GroupEnt(mib, this);
                    this.applRFC2248Group = new ApplRFC2248GroupEnt(mib, this);
                    this.assocRFC2248Group = new AssocRFC2248GroupEnt(mib, this);
                    this.applRFC2788Group = new ApplRFC2788GroupEnt(mib, this);
                    this.assocRFC2788Group = new AssocRFC2788GroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applRFC1565Group,
                        this.assocRFC1565Group,
                        this.applRFC2248Group,
                        this.assocRFC2248Group,
                        this.applRFC2788Group,
                        this.assocRFC2788Group
                    };
                }
                public static final class ApplRFC1565GroupEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplRFC1565GroupEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applRFC1565Group", "1.3.6.1.2.1.27.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocRFC1565GroupEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocRFC1565GroupEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocRFC1565Group", "1.3.6.1.2.1.27.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplRFC2248GroupEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplRFC2248GroupEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applRFC2248Group", "1.3.6.1.2.1.27.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocRFC2248GroupEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocRFC2248GroupEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocRFC2248Group", "1.3.6.1.2.1.27.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplRFC2788GroupEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplRFC2788GroupEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applRFC2788Group", "1.3.6.1.2.1.27.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocRFC2788GroupEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocRFC2788GroupEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocRFC2788Group", "1.3.6.1.2.1.27.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ApplCompliancesEnt extends MIBEntry<NETWORKSERVICESMIBDef>
            {
                /** Compliance statements*/
                public final ApplComplianceEnt applCompliance;

                public final AssocComplianceEnt assocCompliance;

                public final ApplRFC2248ComplianceEnt applRFC2248Compliance;

                public final AssocRFC2248ComplianceEnt assocRFC2248Compliance;

                public final ApplRFC2788ComplianceEnt applRFC2788Compliance;

                public final AssocRFC2788ComplianceEnt assocRFC2788Compliance;

                private ApplCompliancesEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                {
                    super(mib, parent, "applCompliances", "1.3.6.1.2.1.27.3.2", false, false, false, false);
                    this.applCompliance = new ApplComplianceEnt(mib, this);
                    this.assocCompliance = new AssocComplianceEnt(mib, this);
                    this.applRFC2248Compliance = new ApplRFC2248ComplianceEnt(mib, this);
                    this.assocRFC2248Compliance = new AssocRFC2248ComplianceEnt(mib, this);
                    this.applRFC2788Compliance = new ApplRFC2788ComplianceEnt(mib, this);
                    this.assocRFC2788Compliance = new AssocRFC2788ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applCompliance,
                        this.assocCompliance,
                        this.applRFC2248Compliance,
                        this.assocRFC2248Compliance,
                        this.applRFC2788Compliance,
                        this.assocRFC2788Compliance
                    };
                }
                public static final class ApplComplianceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplComplianceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applCompliance", "1.3.6.1.2.1.27.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocComplianceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocComplianceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocCompliance", "1.3.6.1.2.1.27.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplRFC2248ComplianceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplRFC2248ComplianceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applRFC2248Compliance", "1.3.6.1.2.1.27.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocRFC2248ComplianceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocRFC2248ComplianceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocRFC2248Compliance", "1.3.6.1.2.1.27.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplRFC2788ComplianceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private ApplRFC2788ComplianceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "applRFC2788Compliance", "1.3.6.1.2.1.27.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AssocRFC2788ComplianceEnt extends MIBEntry<NETWORKSERVICESMIBDef>
                {
                    private AssocRFC2788ComplianceEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "assocRFC2788Compliance", "1.3.6.1.2.1.27.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ApplTCPProtoIDEnt extends MIBEntry<NETWORKSERVICESMIBDef>
        {
            private ApplTCPProtoIDEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
            {
                super(mib, parent, "applTCPProtoID", "1.3.6.1.2.1.27.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ApplUDPProtoIDEnt extends MIBEntry<NETWORKSERVICESMIBDef>
        {
            private ApplUDPProtoIDEnt(NETWORKSERVICESMIBDef mib, MIBEntry<NETWORKSERVICESMIBDef> parent)
            {
                super(mib, parent, "applUDPProtoID", "1.3.6.1.2.1.27.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
