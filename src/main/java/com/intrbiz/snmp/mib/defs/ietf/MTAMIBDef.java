package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class MTAMIBDef extends MIB
{
    public static final MTAMIBDef MTAMIB = new MTAMIBDef();

    static { MIBs.getInstance().registerMIB(MTAMIBDef.MTAMIB); }

    public final MtaEnt mta;

    private MTAMIBDef()
    {
        super("MTA-MIB");
        this.mta = new MtaEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mta
        };
    }

    public static final class MtaEnt extends MIBEntry<MTAMIBDef>
    {
        public final MtaTableEnt mtaTable;

        /** MTAs typically group inbound reception, queue storage, andoutbound transmission in some way, rather than accounting forsuch operations only across the MTA as a whole. In the mostextreme case separate information will be maintained for eachdifferent entity that receives messages and for each entitythe MTA stores messages for and delivers messages to.  OtherMTAs may elect to treat all reception equally, all queuestorage equally, all deliveries equally, or some combinationof this. Overlapped groupings are also possible, where an MTAdecomposes its traffic in different ways for differentpurposes.
In any case, a grouping abstraction is an extremely useful forbreaking down the activities of an MTA. For purposes oflabelling this will be called a "group" in this MIB.
Each group contains all the variables needed to monitor allaspects of an MTA's operation.  However, the fact that allgroups contain all possible variables does not imply that allgroups must use all possible variables. For example, a singlegroup might be used to monitor only one kind of event (inboundprocessing, outbound processing, or storage). In this sort ofconfiguration any counters that are unused as a result of agiven MTA's use of the group construct must be inaccessible;e.g., returning either a noSuchName error (for an SNMPv1 get),or a noSuchInstance exception (for an SNMPv2 get).
Groups can be created at any time after MTA initialization. Oncea group is created it should not be deleted or its mtaGroupIndexchanged unless the MTA is reinitialized.
Groups are not necessarily mutually exclusive. A given event maybe recorded by more than one group, a message may be seen asstored by more than one group, and so on.  Groups should be allinclusive, however: if groups are implemented all aspects of anMTA's operation should be registered in at least one group.This freedom lets implementors use different sets of groups toprovide different "views" of an MTA.
The possibility of overlap between groups means that summingvariables across groups may not produce values equal to those inthe mtaTable. mtaTable should always provide accurate information
about the MTA as a whole.
The term "channel" is often used in MTA implementations; channelsare usually, but not always, equivalent to a group. However,this MIB does not use the term "channel" because there is norequirement that an MTA supporting this MIB has to map its"channel" abstraction one-to-one onto the MIB's group abstraction.
An MTA may create a group or group of groups at any time. Oncecreated, however, an MTA cannot delete an entry for a group fromthe group table.  Deletion is only allowed when the MTA isreinitialized, and is not required even then.  This restrictionis imposed so that monitoring agents can rely on groupassignments being consistent across multiple query operations.
Groups may be laid out so as to form a hierarchical arrangement,with some groups acting as subgroups for other groups.Alternately, disjoint groups of groups may be used to providedifferent sorts of "snapshots" of MTA operation.  ThemtaGroupHierarchy variable provides an indication of how eachgroup fits into the overall arrangement being used.
Note that SNMP also defines and uses term "group". MTA groups areNOT the same as SNMP groups.*/
        public final MtaGroupTableEnt mtaGroupTable;

        /** The mtaGroupAssociationTable provides a means of correlatingentries in the network services association table with theMTA group responsible for the association.*/
        public final MtaGroupAssociationTableEnt mtaGroupAssociationTable;

        /** The mtaGroupErrorTable gives each group a way of tallyingthe specific errors it has encountered.  The mechanismdefined here uses RFC 1893 status codes to identifyvarious specific errors.  There are also classes for genericerrors of various sorts, and the entire mechanism is alsoextensible, in that new error codes can be defined at anytime.*/
        public final MtaGroupErrorTableEnt mtaGroupErrorTable;

        /** Conformance information*/
        public final MtaConformanceEnt mtaConformance;

        private MtaEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
        {
            super(mib, parent, "mta", "1.3.6.1.2.1.28", false, false, false, false);
            this.mtaTable = new MtaTableEnt(mib, this);
            this.mtaGroupTable = new MtaGroupTableEnt(mib, this);
            this.mtaGroupAssociationTable = new MtaGroupAssociationTableEnt(mib, this);
            this.mtaGroupErrorTable = new MtaGroupErrorTableEnt(mib, this);
            this.mtaConformance = new MtaConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mtaTable,
                this.mtaGroupTable,
                this.mtaGroupAssociationTable,
                this.mtaGroupErrorTable,
                this.mtaConformance
            };
        }
        public static final class MtaTableEnt extends MIBEntry<MTAMIBDef>
        {
            public final MtaEntryEnt mtaEntry;

            private MtaTableEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
            {
                super(mib, parent, "mtaTable", "1.3.6.1.2.1.28.1", false, true, false, false);
                this.mtaEntry = new MtaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mtaEntry
                };
            }
            public static final class MtaEntryEnt extends MIBEntry<MTAMIBDef>
            {
                public final MtaReceivedMessagesEnt mtaReceivedMessages;

                public final MtaStoredMessagesEnt mtaStoredMessages;

                public final MtaTransmittedMessagesEnt mtaTransmittedMessages;

                public final MtaReceivedVolumeEnt mtaReceivedVolume;

                public final MtaStoredVolumeEnt mtaStoredVolume;

                public final MtaTransmittedVolumeEnt mtaTransmittedVolume;

                public final MtaReceivedRecipientsEnt mtaReceivedRecipients;

                public final MtaStoredRecipientsEnt mtaStoredRecipients;

                public final MtaTransmittedRecipientsEnt mtaTransmittedRecipients;

                public final MtaSuccessfulConvertedMessagesEnt mtaSuccessfulConvertedMessages;

                public final MtaFailedConvertedMessagesEnt mtaFailedConvertedMessages;

                public final MtaLoopsDetectedEnt mtaLoopsDetected;

                private MtaEntryEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                {
                    super(mib, parent, "mtaEntry", "1.3.6.1.2.1.28.1.1", false, false, false, true);
                    this.mtaReceivedMessages = new MtaReceivedMessagesEnt(mib, this);
                    this.mtaStoredMessages = new MtaStoredMessagesEnt(mib, this);
                    this.mtaTransmittedMessages = new MtaTransmittedMessagesEnt(mib, this);
                    this.mtaReceivedVolume = new MtaReceivedVolumeEnt(mib, this);
                    this.mtaStoredVolume = new MtaStoredVolumeEnt(mib, this);
                    this.mtaTransmittedVolume = new MtaTransmittedVolumeEnt(mib, this);
                    this.mtaReceivedRecipients = new MtaReceivedRecipientsEnt(mib, this);
                    this.mtaStoredRecipients = new MtaStoredRecipientsEnt(mib, this);
                    this.mtaTransmittedRecipients = new MtaTransmittedRecipientsEnt(mib, this);
                    this.mtaSuccessfulConvertedMessages = new MtaSuccessfulConvertedMessagesEnt(mib, this);
                    this.mtaFailedConvertedMessages = new MtaFailedConvertedMessagesEnt(mib, this);
                    this.mtaLoopsDetected = new MtaLoopsDetectedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mtaReceivedMessages,
                        this.mtaStoredMessages,
                        this.mtaTransmittedMessages,
                        this.mtaReceivedVolume,
                        this.mtaStoredVolume,
                        this.mtaTransmittedVolume,
                        this.mtaReceivedRecipients,
                        this.mtaStoredRecipients,
                        this.mtaTransmittedRecipients,
                        this.mtaSuccessfulConvertedMessages,
                        this.mtaFailedConvertedMessages,
                        this.mtaLoopsDetected
                    };
                }
                public static final class MtaReceivedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaReceivedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaReceivedMessages", "1.3.6.1.2.1.28.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaStoredMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaStoredMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaStoredMessages", "1.3.6.1.2.1.28.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaTransmittedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaTransmittedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaTransmittedMessages", "1.3.6.1.2.1.28.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaReceivedVolumeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaReceivedVolumeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaReceivedVolume", "1.3.6.1.2.1.28.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaStoredVolumeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaStoredVolumeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaStoredVolume", "1.3.6.1.2.1.28.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaTransmittedVolumeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaTransmittedVolumeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaTransmittedVolume", "1.3.6.1.2.1.28.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaReceivedRecipientsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaReceivedRecipientsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaReceivedRecipients", "1.3.6.1.2.1.28.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaStoredRecipientsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaStoredRecipientsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaStoredRecipients", "1.3.6.1.2.1.28.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaTransmittedRecipientsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaTransmittedRecipientsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaTransmittedRecipients", "1.3.6.1.2.1.28.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaSuccessfulConvertedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaSuccessfulConvertedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaSuccessfulConvertedMessages", "1.3.6.1.2.1.28.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaFailedConvertedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaFailedConvertedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaFailedConvertedMessages", "1.3.6.1.2.1.28.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaLoopsDetectedEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaLoopsDetectedEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaLoopsDetected", "1.3.6.1.2.1.28.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class MtaGroupTableEnt extends MIBEntry<MTAMIBDef>
        {
            public final MtaGroupEntryEnt mtaGroupEntry;

            private MtaGroupTableEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
            {
                super(mib, parent, "mtaGroupTable", "1.3.6.1.2.1.28.2", false, true, false, false);
                this.mtaGroupEntry = new MtaGroupEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mtaGroupEntry
                };
            }
            public static final class MtaGroupEntryEnt extends MIBEntry<MTAMIBDef>
            {
                public final MtaGroupIndexEnt mtaGroupIndex;

                public final MtaGroupReceivedMessagesEnt mtaGroupReceivedMessages;

                public final MtaGroupRejectedMessagesEnt mtaGroupRejectedMessages;

                public final MtaGroupStoredMessagesEnt mtaGroupStoredMessages;

                public final MtaGroupTransmittedMessagesEnt mtaGroupTransmittedMessages;

                public final MtaGroupReceivedVolumeEnt mtaGroupReceivedVolume;

                public final MtaGroupStoredVolumeEnt mtaGroupStoredVolume;

                public final MtaGroupTransmittedVolumeEnt mtaGroupTransmittedVolume;

                public final MtaGroupReceivedRecipientsEnt mtaGroupReceivedRecipients;

                public final MtaGroupStoredRecipientsEnt mtaGroupStoredRecipients;

                public final MtaGroupTransmittedRecipientsEnt mtaGroupTransmittedRecipients;

                public final MtaGroupOldestMessageStoredEnt mtaGroupOldestMessageStored;

                public final MtaGroupInboundAssociationsEnt mtaGroupInboundAssociations;

                public final MtaGroupOutboundAssociationsEnt mtaGroupOutboundAssociations;

                public final MtaGroupAccumulatedInboundAssociationsEnt mtaGroupAccumulatedInboundAssociations;

                public final MtaGroupAccumulatedOutboundAssociationsEnt mtaGroupAccumulatedOutboundAssociations;

                public final MtaGroupLastInboundActivityEnt mtaGroupLastInboundActivity;

                public final MtaGroupLastOutboundActivityEnt mtaGroupLastOutboundActivity;

                public final MtaGroupLastOutboundAssociationAttemptEnt mtaGroupLastOutboundAssociationAttempt;

                public final MtaGroupRejectedInboundAssociationsEnt mtaGroupRejectedInboundAssociations;

                public final MtaGroupFailedOutboundAssociationsEnt mtaGroupFailedOutboundAssociations;

                public final MtaGroupInboundRejectionReasonEnt mtaGroupInboundRejectionReason;

                public final MtaGroupOutboundConnectFailureReasonEnt mtaGroupOutboundConnectFailureReason;

                public final MtaGroupScheduledRetryEnt mtaGroupScheduledRetry;

                public final MtaGroupMailProtocolEnt mtaGroupMailProtocol;

                public final MtaGroupNameEnt mtaGroupName;

                public final MtaGroupSuccessfulConvertedMessagesEnt mtaGroupSuccessfulConvertedMessages;

                public final MtaGroupFailedConvertedMessagesEnt mtaGroupFailedConvertedMessages;

                public final MtaGroupDescriptionEnt mtaGroupDescription;

                public final MtaGroupURLEnt mtaGroupURL;

                public final MtaGroupCreationTimeEnt mtaGroupCreationTime;

                public final MtaGroupHierarchyEnt mtaGroupHierarchy;

                public final MtaGroupOldestMessageIdEnt mtaGroupOldestMessageId;

                public final MtaGroupLoopsDetectedEnt mtaGroupLoopsDetected;

                private MtaGroupEntryEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                {
                    super(mib, parent, "mtaGroupEntry", "1.3.6.1.2.1.28.2.1", false, false, false, true);
                    this.mtaGroupIndex = new MtaGroupIndexEnt(mib, this);
                    this.mtaGroupReceivedMessages = new MtaGroupReceivedMessagesEnt(mib, this);
                    this.mtaGroupRejectedMessages = new MtaGroupRejectedMessagesEnt(mib, this);
                    this.mtaGroupStoredMessages = new MtaGroupStoredMessagesEnt(mib, this);
                    this.mtaGroupTransmittedMessages = new MtaGroupTransmittedMessagesEnt(mib, this);
                    this.mtaGroupReceivedVolume = new MtaGroupReceivedVolumeEnt(mib, this);
                    this.mtaGroupStoredVolume = new MtaGroupStoredVolumeEnt(mib, this);
                    this.mtaGroupTransmittedVolume = new MtaGroupTransmittedVolumeEnt(mib, this);
                    this.mtaGroupReceivedRecipients = new MtaGroupReceivedRecipientsEnt(mib, this);
                    this.mtaGroupStoredRecipients = new MtaGroupStoredRecipientsEnt(mib, this);
                    this.mtaGroupTransmittedRecipients = new MtaGroupTransmittedRecipientsEnt(mib, this);
                    this.mtaGroupOldestMessageStored = new MtaGroupOldestMessageStoredEnt(mib, this);
                    this.mtaGroupInboundAssociations = new MtaGroupInboundAssociationsEnt(mib, this);
                    this.mtaGroupOutboundAssociations = new MtaGroupOutboundAssociationsEnt(mib, this);
                    this.mtaGroupAccumulatedInboundAssociations = new MtaGroupAccumulatedInboundAssociationsEnt(mib, this);
                    this.mtaGroupAccumulatedOutboundAssociations = new MtaGroupAccumulatedOutboundAssociationsEnt(mib, this);
                    this.mtaGroupLastInboundActivity = new MtaGroupLastInboundActivityEnt(mib, this);
                    this.mtaGroupLastOutboundActivity = new MtaGroupLastOutboundActivityEnt(mib, this);
                    this.mtaGroupLastOutboundAssociationAttempt = new MtaGroupLastOutboundAssociationAttemptEnt(mib, this);
                    this.mtaGroupRejectedInboundAssociations = new MtaGroupRejectedInboundAssociationsEnt(mib, this);
                    this.mtaGroupFailedOutboundAssociations = new MtaGroupFailedOutboundAssociationsEnt(mib, this);
                    this.mtaGroupInboundRejectionReason = new MtaGroupInboundRejectionReasonEnt(mib, this);
                    this.mtaGroupOutboundConnectFailureReason = new MtaGroupOutboundConnectFailureReasonEnt(mib, this);
                    this.mtaGroupScheduledRetry = new MtaGroupScheduledRetryEnt(mib, this);
                    this.mtaGroupMailProtocol = new MtaGroupMailProtocolEnt(mib, this);
                    this.mtaGroupName = new MtaGroupNameEnt(mib, this);
                    this.mtaGroupSuccessfulConvertedMessages = new MtaGroupSuccessfulConvertedMessagesEnt(mib, this);
                    this.mtaGroupFailedConvertedMessages = new MtaGroupFailedConvertedMessagesEnt(mib, this);
                    this.mtaGroupDescription = new MtaGroupDescriptionEnt(mib, this);
                    this.mtaGroupURL = new MtaGroupURLEnt(mib, this);
                    this.mtaGroupCreationTime = new MtaGroupCreationTimeEnt(mib, this);
                    this.mtaGroupHierarchy = new MtaGroupHierarchyEnt(mib, this);
                    this.mtaGroupOldestMessageId = new MtaGroupOldestMessageIdEnt(mib, this);
                    this.mtaGroupLoopsDetected = new MtaGroupLoopsDetectedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mtaGroupIndex,
                        this.mtaGroupReceivedMessages,
                        this.mtaGroupRejectedMessages,
                        this.mtaGroupStoredMessages,
                        this.mtaGroupTransmittedMessages,
                        this.mtaGroupReceivedVolume,
                        this.mtaGroupStoredVolume,
                        this.mtaGroupTransmittedVolume,
                        this.mtaGroupReceivedRecipients,
                        this.mtaGroupStoredRecipients,
                        this.mtaGroupTransmittedRecipients,
                        this.mtaGroupOldestMessageStored,
                        this.mtaGroupInboundAssociations,
                        this.mtaGroupOutboundAssociations,
                        this.mtaGroupAccumulatedInboundAssociations,
                        this.mtaGroupAccumulatedOutboundAssociations,
                        this.mtaGroupLastInboundActivity,
                        this.mtaGroupLastOutboundActivity,
                        this.mtaGroupLastOutboundAssociationAttempt,
                        this.mtaGroupRejectedInboundAssociations,
                        this.mtaGroupFailedOutboundAssociations,
                        this.mtaGroupInboundRejectionReason,
                        this.mtaGroupOutboundConnectFailureReason,
                        this.mtaGroupScheduledRetry,
                        this.mtaGroupMailProtocol,
                        this.mtaGroupName,
                        this.mtaGroupSuccessfulConvertedMessages,
                        this.mtaGroupFailedConvertedMessages,
                        this.mtaGroupDescription,
                        this.mtaGroupURL,
                        this.mtaGroupCreationTime,
                        this.mtaGroupHierarchy,
                        this.mtaGroupOldestMessageId,
                        this.mtaGroupLoopsDetected
                    };
                }
                public static final class MtaGroupIndexEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupIndexEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupIndex", "1.3.6.1.2.1.28.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupReceivedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupReceivedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupReceivedMessages", "1.3.6.1.2.1.28.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupRejectedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupRejectedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupRejectedMessages", "1.3.6.1.2.1.28.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupStoredMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupStoredMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupStoredMessages", "1.3.6.1.2.1.28.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupTransmittedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupTransmittedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupTransmittedMessages", "1.3.6.1.2.1.28.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupReceivedVolumeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupReceivedVolumeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupReceivedVolume", "1.3.6.1.2.1.28.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupStoredVolumeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupStoredVolumeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupStoredVolume", "1.3.6.1.2.1.28.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupTransmittedVolumeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupTransmittedVolumeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupTransmittedVolume", "1.3.6.1.2.1.28.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupReceivedRecipientsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupReceivedRecipientsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupReceivedRecipients", "1.3.6.1.2.1.28.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupStoredRecipientsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupStoredRecipientsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupStoredRecipients", "1.3.6.1.2.1.28.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupTransmittedRecipientsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupTransmittedRecipientsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupTransmittedRecipients", "1.3.6.1.2.1.28.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupOldestMessageStoredEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupOldestMessageStoredEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupOldestMessageStored", "1.3.6.1.2.1.28.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupInboundAssociationsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupInboundAssociationsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupInboundAssociations", "1.3.6.1.2.1.28.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupOutboundAssociationsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupOutboundAssociationsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupOutboundAssociations", "1.3.6.1.2.1.28.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupAccumulatedInboundAssociationsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupAccumulatedInboundAssociationsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupAccumulatedInboundAssociations", "1.3.6.1.2.1.28.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupAccumulatedOutboundAssociationsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupAccumulatedOutboundAssociationsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupAccumulatedOutboundAssociations", "1.3.6.1.2.1.28.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupLastInboundActivityEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupLastInboundActivityEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupLastInboundActivity", "1.3.6.1.2.1.28.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupLastOutboundActivityEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupLastOutboundActivityEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupLastOutboundActivity", "1.3.6.1.2.1.28.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupLastOutboundAssociationAttemptEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupLastOutboundAssociationAttemptEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupLastOutboundAssociationAttempt", "1.3.6.1.2.1.28.2.1.34", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupRejectedInboundAssociationsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupRejectedInboundAssociationsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupRejectedInboundAssociations", "1.3.6.1.2.1.28.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupFailedOutboundAssociationsEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupFailedOutboundAssociationsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupFailedOutboundAssociations", "1.3.6.1.2.1.28.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupInboundRejectionReasonEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupInboundRejectionReasonEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupInboundRejectionReason", "1.3.6.1.2.1.28.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupOutboundConnectFailureReasonEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupOutboundConnectFailureReasonEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupOutboundConnectFailureReason", "1.3.6.1.2.1.28.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupScheduledRetryEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupScheduledRetryEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupScheduledRetry", "1.3.6.1.2.1.28.2.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupMailProtocolEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupMailProtocolEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupMailProtocol", "1.3.6.1.2.1.28.2.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupNameEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupNameEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupName", "1.3.6.1.2.1.28.2.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupSuccessfulConvertedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupSuccessfulConvertedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupSuccessfulConvertedMessages", "1.3.6.1.2.1.28.2.1.26", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupFailedConvertedMessagesEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupFailedConvertedMessagesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupFailedConvertedMessages", "1.3.6.1.2.1.28.2.1.27", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupDescriptionEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupDescriptionEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupDescription", "1.3.6.1.2.1.28.2.1.28", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupURLEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupURLEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupURL", "1.3.6.1.2.1.28.2.1.29", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupCreationTimeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupCreationTimeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupCreationTime", "1.3.6.1.2.1.28.2.1.30", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupHierarchyEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupHierarchyEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupHierarchy", "1.3.6.1.2.1.28.2.1.31", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupOldestMessageIdEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupOldestMessageIdEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupOldestMessageId", "1.3.6.1.2.1.28.2.1.32", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupLoopsDetectedEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupLoopsDetectedEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupLoopsDetected", "1.3.6.1.2.1.28.2.1.33", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class MtaGroupAssociationTableEnt extends MIBEntry<MTAMIBDef>
        {
            public final MtaGroupAssociationEntryEnt mtaGroupAssociationEntry;

            private MtaGroupAssociationTableEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
            {
                super(mib, parent, "mtaGroupAssociationTable", "1.3.6.1.2.1.28.3", false, true, false, false);
                this.mtaGroupAssociationEntry = new MtaGroupAssociationEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mtaGroupAssociationEntry
                };
            }
            public static final class MtaGroupAssociationEntryEnt extends MIBEntry<MTAMIBDef>
            {
                public final MtaGroupAssociationIndexEnt mtaGroupAssociationIndex;

                private MtaGroupAssociationEntryEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                {
                    super(mib, parent, "mtaGroupAssociationEntry", "1.3.6.1.2.1.28.3.1", false, false, false, true);
                    this.mtaGroupAssociationIndex = new MtaGroupAssociationIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mtaGroupAssociationIndex
                    };
                }
                public static final class MtaGroupAssociationIndexEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupAssociationIndexEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupAssociationIndex", "1.3.6.1.2.1.28.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class MtaGroupErrorTableEnt extends MIBEntry<MTAMIBDef>
        {
            public final MtaGroupErrorEntryEnt mtaGroupErrorEntry;

            private MtaGroupErrorTableEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
            {
                super(mib, parent, "mtaGroupErrorTable", "1.3.6.1.2.1.28.5", false, true, false, false);
                this.mtaGroupErrorEntry = new MtaGroupErrorEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mtaGroupErrorEntry
                };
            }
            public static final class MtaGroupErrorEntryEnt extends MIBEntry<MTAMIBDef>
            {
                public final MtaGroupInboundErrorCountEnt mtaGroupInboundErrorCount;

                public final MtaGroupInternalErrorCountEnt mtaGroupInternalErrorCount;

                public final MtaGroupOutboundErrorCountEnt mtaGroupOutboundErrorCount;

                public final MtaStatusCodeEnt mtaStatusCode;

                private MtaGroupErrorEntryEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                {
                    super(mib, parent, "mtaGroupErrorEntry", "1.3.6.1.2.1.28.5.1", false, false, false, true);
                    this.mtaGroupInboundErrorCount = new MtaGroupInboundErrorCountEnt(mib, this);
                    this.mtaGroupInternalErrorCount = new MtaGroupInternalErrorCountEnt(mib, this);
                    this.mtaGroupOutboundErrorCount = new MtaGroupOutboundErrorCountEnt(mib, this);
                    this.mtaStatusCode = new MtaStatusCodeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mtaGroupInboundErrorCount,
                        this.mtaGroupInternalErrorCount,
                        this.mtaGroupOutboundErrorCount,
                        this.mtaStatusCode
                    };
                }
                public static final class MtaGroupInboundErrorCountEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupInboundErrorCountEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupInboundErrorCount", "1.3.6.1.2.1.28.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupInternalErrorCountEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupInternalErrorCountEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupInternalErrorCount", "1.3.6.1.2.1.28.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaGroupOutboundErrorCountEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaGroupOutboundErrorCountEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaGroupOutboundErrorCount", "1.3.6.1.2.1.28.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaStatusCodeEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaStatusCodeEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaStatusCode", "1.3.6.1.2.1.28.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class MtaConformanceEnt extends MIBEntry<MTAMIBDef>
        {
            public final MtaGroupsEnt mtaGroups;

            public final MtaCompliancesEnt mtaCompliances;

            private MtaConformanceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
            {
                super(mib, parent, "mtaConformance", "1.3.6.1.2.1.28.4", false, false, false, false);
                this.mtaGroups = new MtaGroupsEnt(mib, this);
                this.mtaCompliances = new MtaCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mtaGroups,
                    this.mtaCompliances
                };
            }
            public static final class MtaGroupsEnt extends MIBEntry<MTAMIBDef>
            {
                /** Units of conformance*/
                public final MtaRFC1566GroupEnt mtaRFC1566Group;

                public final MtaRFC1566AssocGroupEnt mtaRFC1566AssocGroup;

                public final MtaRFC2249GroupEnt mtaRFC2249Group;

                public final MtaRFC2249AssocGroupEnt mtaRFC2249AssocGroup;

                public final MtaRFC2249ErrorGroupEnt mtaRFC2249ErrorGroup;

                public final MtaRFC2789GroupEnt mtaRFC2789Group;

                public final MtaRFC2789AssocGroupEnt mtaRFC2789AssocGroup;

                public final MtaRFC2789ErrorGroupEnt mtaRFC2789ErrorGroup;

                private MtaGroupsEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                {
                    super(mib, parent, "mtaGroups", "1.3.6.1.2.1.28.4.1", false, false, false, false);
                    this.mtaRFC1566Group = new MtaRFC1566GroupEnt(mib, this);
                    this.mtaRFC1566AssocGroup = new MtaRFC1566AssocGroupEnt(mib, this);
                    this.mtaRFC2249Group = new MtaRFC2249GroupEnt(mib, this);
                    this.mtaRFC2249AssocGroup = new MtaRFC2249AssocGroupEnt(mib, this);
                    this.mtaRFC2249ErrorGroup = new MtaRFC2249ErrorGroupEnt(mib, this);
                    this.mtaRFC2789Group = new MtaRFC2789GroupEnt(mib, this);
                    this.mtaRFC2789AssocGroup = new MtaRFC2789AssocGroupEnt(mib, this);
                    this.mtaRFC2789ErrorGroup = new MtaRFC2789ErrorGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mtaRFC1566Group,
                        this.mtaRFC1566AssocGroup,
                        this.mtaRFC2249Group,
                        this.mtaRFC2249AssocGroup,
                        this.mtaRFC2249ErrorGroup,
                        this.mtaRFC2789Group,
                        this.mtaRFC2789AssocGroup,
                        this.mtaRFC2789ErrorGroup
                    };
                }
                public static final class MtaRFC1566GroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC1566GroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC1566Group", "1.3.6.1.2.1.28.4.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC1566AssocGroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC1566AssocGroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC1566AssocGroup", "1.3.6.1.2.1.28.4.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249GroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249GroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249Group", "1.3.6.1.2.1.28.4.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249AssocGroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249AssocGroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249AssocGroup", "1.3.6.1.2.1.28.4.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249ErrorGroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249ErrorGroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249ErrorGroup", "1.3.6.1.2.1.28.4.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789GroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789GroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789Group", "1.3.6.1.2.1.28.4.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789AssocGroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789AssocGroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789AssocGroup", "1.3.6.1.2.1.28.4.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789ErrorGroupEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789ErrorGroupEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789ErrorGroup", "1.3.6.1.2.1.28.4.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MtaCompliancesEnt extends MIBEntry<MTAMIBDef>
            {
                /** Compliance statements*/
                public final MtaComplianceEnt mtaCompliance;

                public final MtaAssocComplianceEnt mtaAssocCompliance;

                public final MtaRFC2249ComplianceEnt mtaRFC2249Compliance;

                public final MtaRFC2249AssocComplianceEnt mtaRFC2249AssocCompliance;

                public final MtaRFC2249ErrorComplianceEnt mtaRFC2249ErrorCompliance;

                public final MtaRFC2249FullComplianceEnt mtaRFC2249FullCompliance;

                public final MtaRFC2789ComplianceEnt mtaRFC2789Compliance;

                public final MtaRFC2789AssocComplianceEnt mtaRFC2789AssocCompliance;

                public final MtaRFC2789ErrorComplianceEnt mtaRFC2789ErrorCompliance;

                public final MtaRFC2789FullComplianceEnt mtaRFC2789FullCompliance;

                private MtaCompliancesEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                {
                    super(mib, parent, "mtaCompliances", "1.3.6.1.2.1.28.4.2", false, false, false, false);
                    this.mtaCompliance = new MtaComplianceEnt(mib, this);
                    this.mtaAssocCompliance = new MtaAssocComplianceEnt(mib, this);
                    this.mtaRFC2249Compliance = new MtaRFC2249ComplianceEnt(mib, this);
                    this.mtaRFC2249AssocCompliance = new MtaRFC2249AssocComplianceEnt(mib, this);
                    this.mtaRFC2249ErrorCompliance = new MtaRFC2249ErrorComplianceEnt(mib, this);
                    this.mtaRFC2249FullCompliance = new MtaRFC2249FullComplianceEnt(mib, this);
                    this.mtaRFC2789Compliance = new MtaRFC2789ComplianceEnt(mib, this);
                    this.mtaRFC2789AssocCompliance = new MtaRFC2789AssocComplianceEnt(mib, this);
                    this.mtaRFC2789ErrorCompliance = new MtaRFC2789ErrorComplianceEnt(mib, this);
                    this.mtaRFC2789FullCompliance = new MtaRFC2789FullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mtaCompliance,
                        this.mtaAssocCompliance,
                        this.mtaRFC2249Compliance,
                        this.mtaRFC2249AssocCompliance,
                        this.mtaRFC2249ErrorCompliance,
                        this.mtaRFC2249FullCompliance,
                        this.mtaRFC2789Compliance,
                        this.mtaRFC2789AssocCompliance,
                        this.mtaRFC2789ErrorCompliance,
                        this.mtaRFC2789FullCompliance
                    };
                }
                public static final class MtaComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaCompliance", "1.3.6.1.2.1.28.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaAssocComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaAssocComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaAssocCompliance", "1.3.6.1.2.1.28.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249ComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249ComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249Compliance", "1.3.6.1.2.1.28.4.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249AssocComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249AssocComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249AssocCompliance", "1.3.6.1.2.1.28.4.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249ErrorComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249ErrorComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249ErrorCompliance", "1.3.6.1.2.1.28.4.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2249FullComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2249FullComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2249FullCompliance", "1.3.6.1.2.1.28.4.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789ComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789ComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789Compliance", "1.3.6.1.2.1.28.4.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789AssocComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789AssocComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789AssocCompliance", "1.3.6.1.2.1.28.4.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789ErrorComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789ErrorComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789ErrorCompliance", "1.3.6.1.2.1.28.4.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MtaRFC2789FullComplianceEnt extends MIBEntry<MTAMIBDef>
                {
                    private MtaRFC2789FullComplianceEnt(MTAMIBDef mib, MIBEntry<MTAMIBDef> parent)
                    {
                        super(mib, parent, "mtaRFC2789FullCompliance", "1.3.6.1.2.1.28.4.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
