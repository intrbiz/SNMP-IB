package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class JobMonitoringMIBDef extends MIB
{
    public static final JobMonitoringMIBDef JobMonitoringMIB = new JobMonitoringMIBDef();

    /** The following textual-conventions are needed to implementcertain attributes, but are not needed to compile this MIB.They are provided here for convenience:hrDeviceIndex                        FROM HOST-RESOURCES-MIBDateAndTime                          FROM SNMPv2-TCPrtInterpreterLangFamilyTC,CodedCharSet                         FROM Printer-MIB
Use the enterprises arc assigned to the PWG which is pwg(2699).Group all PWG mibs under mibs(1).*/
    public final JobmonMIBEnt jobmonMIB;

    private JobMonitoringMIBDef()
    {
        super("Job-Monitoring-MIB");
        this.jobmonMIB = new JobmonMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.jobmonMIB
        };
    }

    public static final class JobmonMIBEnt extends MIBEntry<JobMonitoringMIBDef>
    {
        /** 31 bits, all but sign bit*/
        public final JobmonMIBObjectsEnt jobmonMIBObjects;

        /** Notifications and TrappingReserved for the future*/
        public final JobmonMIBNotificationsEnt jobmonMIBNotifications;

        /** Conformance Information*/
        public final JmMIBConformanceEnt jmMIBConformance;

        private JobmonMIBEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
        {
            super(mib, parent, "jobmonMIB", "1.3.6.1.4.1.2699.1.1", false, false, false, false);
            this.jobmonMIBObjects = new JobmonMIBObjectsEnt(mib, this);
            this.jobmonMIBNotifications = new JobmonMIBNotificationsEnt(mib, this);
            this.jmMIBConformance = new JmMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.jobmonMIBObjects,
                this.jobmonMIBNotifications,
                this.jmMIBConformance
            };
        }
        public static final class JobmonMIBObjectsEnt extends MIBEntry<JobMonitoringMIBDef>
        {
            /** The General Group (MANDATORY)
The jmGeneralGroup consists entirely of the jmGeneralTable.*/
            public final JmGeneralEnt jmGeneral;

            /** The Job ID Group (MANDATORY)
The jmJobIDGroup consists entirely of the jmJobIDTable.*/
            public final JmJobIDEnt jmJobID;

            /** The Job Group (MANDATORY)
The jmJobGroup consists entirely of the jmJobTable.*/
            public final JmJobEnt jmJob;

            /** The Attribute Group (MANDATORY)
The jmAttributeGroup consists entirely of the jmAttributeTable.Implementation of the objects in this group is MANDATORY.See Section 3.1 entitled 'Conformance Considerations'.An agent SHALL implement any attribute if (1) the server or devicesupports the functionality represented by the attribute and (2) theinformation is available to the agent.*/
            public final JmAttributeEnt jmAttribute;

            private JobmonMIBObjectsEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
            {
                super(mib, parent, "jobmonMIBObjects", "1.3.6.1.4.1.2699.1.1.1", false, false, false, false);
                this.jmGeneral = new JmGeneralEnt(mib, this);
                this.jmJobID = new JmJobIDEnt(mib, this);
                this.jmJob = new JmJobEnt(mib, this);
                this.jmAttribute = new JmAttributeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.jmGeneral,
                    this.jmJobID,
                    this.jmJob,
                    this.jmAttribute
                };
            }
            public static final class JmGeneralEnt extends MIBEntry<JobMonitoringMIBDef>
            {
                public final JmGeneralTableEnt jmGeneralTable;

                private JmGeneralEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                {
                    super(mib, parent, "jmGeneral", "1.3.6.1.4.1.2699.1.1.1.1", false, false, false, false);
                    this.jmGeneralTable = new JmGeneralTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.jmGeneralTable
                    };
                }
                public static final class JmGeneralTableEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    public final JmGeneralEntryEnt jmGeneralEntry;

                    private JmGeneralTableEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmGeneralTable", "1.3.6.1.4.1.2699.1.1.1.1.1", false, true, false, false);
                        this.jmGeneralEntry = new JmGeneralEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.jmGeneralEntry
                        };
                    }
                    public static final class JmGeneralEntryEnt extends MIBEntry<JobMonitoringMIBDef>
                    {
                        public final JmGeneralJobSetIndexEnt jmGeneralJobSetIndex;

                        /** no jobs*/
                        public final JmGeneralNumberOfActiveJobsEnt jmGeneralNumberOfActiveJobs;

                        /** no active jobs*/
                        public final JmGeneralOldestActiveJobIndexEnt jmGeneralOldestActiveJobIndex;

                        /** no active jobs*/
                        public final JmGeneralNewestActiveJobIndexEnt jmGeneralNewestActiveJobIndex;

                        /** one minute*/
                        public final JmGeneralJobPersistenceEnt jmGeneralJobPersistence;

                        /** one minute*/
                        public final JmGeneralAttributePersistenceEnt jmGeneralAttributePersistence;

                        /** empty string*/
                        public final JmGeneralJobSetNameEnt jmGeneralJobSetName;

                        private JmGeneralEntryEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                        {
                            super(mib, parent, "jmGeneralEntry", "1.3.6.1.4.1.2699.1.1.1.1.1.1", false, false, false, true);
                            this.jmGeneralJobSetIndex = new JmGeneralJobSetIndexEnt(mib, this);
                            this.jmGeneralNumberOfActiveJobs = new JmGeneralNumberOfActiveJobsEnt(mib, this);
                            this.jmGeneralOldestActiveJobIndex = new JmGeneralOldestActiveJobIndexEnt(mib, this);
                            this.jmGeneralNewestActiveJobIndex = new JmGeneralNewestActiveJobIndexEnt(mib, this);
                            this.jmGeneralJobPersistence = new JmGeneralJobPersistenceEnt(mib, this);
                            this.jmGeneralAttributePersistence = new JmGeneralAttributePersistenceEnt(mib, this);
                            this.jmGeneralJobSetName = new JmGeneralJobSetNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.jmGeneralJobSetIndex,
                                this.jmGeneralNumberOfActiveJobs,
                                this.jmGeneralOldestActiveJobIndex,
                                this.jmGeneralNewestActiveJobIndex,
                                this.jmGeneralJobPersistence,
                                this.jmGeneralAttributePersistence,
                                this.jmGeneralJobSetName
                            };
                        }
                        public static final class JmGeneralJobSetIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralJobSetIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralJobSetIndex", "1.3.6.1.4.1.2699.1.1.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmGeneralNumberOfActiveJobsEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralNumberOfActiveJobsEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralNumberOfActiveJobs", "1.3.6.1.4.1.2699.1.1.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmGeneralOldestActiveJobIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralOldestActiveJobIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralOldestActiveJobIndex", "1.3.6.1.4.1.2699.1.1.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmGeneralNewestActiveJobIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralNewestActiveJobIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralNewestActiveJobIndex", "1.3.6.1.4.1.2699.1.1.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmGeneralJobPersistenceEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralJobPersistenceEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralJobPersistence", "1.3.6.1.4.1.2699.1.1.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmGeneralAttributePersistenceEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralAttributePersistenceEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralAttributePersistence", "1.3.6.1.4.1.2699.1.1.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmGeneralJobSetNameEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmGeneralJobSetNameEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmGeneralJobSetName", "1.3.6.1.4.1.2699.1.1.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class JmJobIDEnt extends MIBEntry<JobMonitoringMIBDef>
            {
                public final JmJobIDTableEnt jmJobIDTable;

                private JmJobIDEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                {
                    super(mib, parent, "jmJobID", "1.3.6.1.4.1.2699.1.1.1.2", false, false, false, false);
                    this.jmJobIDTable = new JmJobIDTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.jmJobIDTable
                    };
                }
                public static final class JmJobIDTableEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    public final JmJobIDEntryEnt jmJobIDEntry;

                    private JmJobIDTableEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmJobIDTable", "1.3.6.1.4.1.2699.1.1.1.2.1", false, true, false, false);
                        this.jmJobIDEntry = new JmJobIDEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.jmJobIDEntry
                        };
                    }
                    public static final class JmJobIDEntryEnt extends MIBEntry<JobMonitoringMIBDef>
                    {
                        public final JmJobSubmissionIDEnt jmJobSubmissionID;

                        /** 0 indicates no job set index*/
                        public final JmJobIDJobSetIndexEnt jmJobIDJobSetIndex;

                        /** 0 indicates no jmJobIndex value.*/
                        public final JmJobIDJobIndexEnt jmJobIDJobIndex;

                        private JmJobIDEntryEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                        {
                            super(mib, parent, "jmJobIDEntry", "1.3.6.1.4.1.2699.1.1.1.2.1.1", false, false, false, true);
                            this.jmJobSubmissionID = new JmJobSubmissionIDEnt(mib, this);
                            this.jmJobIDJobSetIndex = new JmJobIDJobSetIndexEnt(mib, this);
                            this.jmJobIDJobIndex = new JmJobIDJobIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.jmJobSubmissionID,
                                this.jmJobIDJobSetIndex,
                                this.jmJobIDJobIndex
                            };
                        }
                        public static final class JmJobSubmissionIDEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobSubmissionIDEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobSubmissionID", "1.3.6.1.4.1.2699.1.1.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobIDJobSetIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobIDJobSetIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobIDJobSetIndex", "1.3.6.1.4.1.2699.1.1.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobIDJobIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobIDJobIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobIDJobIndex", "1.3.6.1.4.1.2699.1.1.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class JmJobEnt extends MIBEntry<JobMonitoringMIBDef>
            {
                public final JmJobTableEnt jmJobTable;

                private JmJobEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                {
                    super(mib, parent, "jmJob", "1.3.6.1.4.1.2699.1.1.1.3", false, false, false, false);
                    this.jmJobTable = new JmJobTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.jmJobTable
                    };
                }
                public static final class JmJobTableEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    public final JmJobEntryEnt jmJobEntry;

                    private JmJobTableEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmJobTable", "1.3.6.1.4.1.2699.1.1.1.3.1", false, true, false, false);
                        this.jmJobEntry = new JmJobEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.jmJobEntry
                        };
                    }
                    public static final class JmJobEntryEnt extends MIBEntry<JobMonitoringMIBDef>
                    {
                        public final JmJobIndexEnt jmJobIndex;

                        /** default is unknown*/
                        public final JmJobStateEnt jmJobState;

                        /** no reasons*/
                        public final JmJobStateReasons1Ent jmJobStateReasons1;

                        /** default is no intervening jobs.*/
                        public final JmNumberOfInterveningJobsEnt jmNumberOfInterveningJobs;

                        /** the default is unknown(-2)*/
                        public final JmJobKOctetsPerCopyRequestedEnt jmJobKOctetsPerCopyRequested;

                        /** default is no octets processed.*/
                        public final JmJobKOctetsProcessedEnt jmJobKOctetsProcessed;

                        /** default is unknown(-2)*/
                        public final JmJobImpressionsPerCopyRequestedEnt jmJobImpressionsPerCopyRequested;

                        /** default is no octets*/
                        public final JmJobImpressionsCompletedEnt jmJobImpressionsCompleted;

                        /** default is empty string*/
                        public final JmJobOwnerEnt jmJobOwner;

                        private JmJobEntryEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                        {
                            super(mib, parent, "jmJobEntry", "1.3.6.1.4.1.2699.1.1.1.3.1.1", false, false, false, true);
                            this.jmJobIndex = new JmJobIndexEnt(mib, this);
                            this.jmJobState = new JmJobStateEnt(mib, this);
                            this.jmJobStateReasons1 = new JmJobStateReasons1Ent(mib, this);
                            this.jmNumberOfInterveningJobs = new JmNumberOfInterveningJobsEnt(mib, this);
                            this.jmJobKOctetsPerCopyRequested = new JmJobKOctetsPerCopyRequestedEnt(mib, this);
                            this.jmJobKOctetsProcessed = new JmJobKOctetsProcessedEnt(mib, this);
                            this.jmJobImpressionsPerCopyRequested = new JmJobImpressionsPerCopyRequestedEnt(mib, this);
                            this.jmJobImpressionsCompleted = new JmJobImpressionsCompletedEnt(mib, this);
                            this.jmJobOwner = new JmJobOwnerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.jmJobIndex,
                                this.jmJobState,
                                this.jmJobStateReasons1,
                                this.jmNumberOfInterveningJobs,
                                this.jmJobKOctetsPerCopyRequested,
                                this.jmJobKOctetsProcessed,
                                this.jmJobImpressionsPerCopyRequested,
                                this.jmJobImpressionsCompleted,
                                this.jmJobOwner
                            };
                        }
                        public static final class JmJobIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobIndex", "1.3.6.1.4.1.2699.1.1.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobStateEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobStateEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobState", "1.3.6.1.4.1.2699.1.1.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobStateReasons1Ent extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobStateReasons1Ent(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobStateReasons1", "1.3.6.1.4.1.2699.1.1.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmNumberOfInterveningJobsEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmNumberOfInterveningJobsEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmNumberOfInterveningJobs", "1.3.6.1.4.1.2699.1.1.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobKOctetsPerCopyRequestedEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobKOctetsPerCopyRequestedEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobKOctetsPerCopyRequested", "1.3.6.1.4.1.2699.1.1.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobKOctetsProcessedEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobKOctetsProcessedEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobKOctetsProcessed", "1.3.6.1.4.1.2699.1.1.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobImpressionsPerCopyRequestedEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobImpressionsPerCopyRequestedEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobImpressionsPerCopyRequested", "1.3.6.1.4.1.2699.1.1.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobImpressionsCompletedEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobImpressionsCompletedEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobImpressionsCompleted", "1.3.6.1.4.1.2699.1.1.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmJobOwnerEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmJobOwnerEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmJobOwner", "1.3.6.1.4.1.2699.1.1.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class JmAttributeEnt extends MIBEntry<JobMonitoringMIBDef>
            {
                public final JmAttributeTableEnt jmAttributeTable;

                private JmAttributeEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                {
                    super(mib, parent, "jmAttribute", "1.3.6.1.4.1.2699.1.1.1.4", false, false, false, false);
                    this.jmAttributeTable = new JmAttributeTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.jmAttributeTable
                    };
                }
                public static final class JmAttributeTableEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    public final JmAttributeEntryEnt jmAttributeEntry;

                    private JmAttributeTableEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmAttributeTable", "1.3.6.1.4.1.2699.1.1.1.4.1", false, true, false, false);
                        this.jmAttributeEntry = new JmAttributeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.jmAttributeEntry
                        };
                    }
                    public static final class JmAttributeEntryEnt extends MIBEntry<JobMonitoringMIBDef>
                    {
                        public final JmAttributeTypeIndexEnt jmAttributeTypeIndex;

                        public final JmAttributeInstanceIndexEnt jmAttributeInstanceIndex;

                        /** default value is unknown(-2)*/
                        public final JmAttributeValueAsIntegerEnt jmAttributeValueAsInteger;

                        /** empty string*/
                        public final JmAttributeValueAsOctetsEnt jmAttributeValueAsOctets;

                        private JmAttributeEntryEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                        {
                            super(mib, parent, "jmAttributeEntry", "1.3.6.1.4.1.2699.1.1.1.4.1.1", false, false, false, true);
                            this.jmAttributeTypeIndex = new JmAttributeTypeIndexEnt(mib, this);
                            this.jmAttributeInstanceIndex = new JmAttributeInstanceIndexEnt(mib, this);
                            this.jmAttributeValueAsInteger = new JmAttributeValueAsIntegerEnt(mib, this);
                            this.jmAttributeValueAsOctets = new JmAttributeValueAsOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.jmAttributeTypeIndex,
                                this.jmAttributeInstanceIndex,
                                this.jmAttributeValueAsInteger,
                                this.jmAttributeValueAsOctets
                            };
                        }
                        public static final class JmAttributeTypeIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmAttributeTypeIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmAttributeTypeIndex", "1.3.6.1.4.1.2699.1.1.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmAttributeInstanceIndexEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmAttributeInstanceIndexEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmAttributeInstanceIndex", "1.3.6.1.4.1.2699.1.1.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmAttributeValueAsIntegerEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmAttributeValueAsIntegerEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmAttributeValueAsInteger", "1.3.6.1.4.1.2699.1.1.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class JmAttributeValueAsOctetsEnt extends MIBEntry<JobMonitoringMIBDef>
                        {
                            private JmAttributeValueAsOctetsEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                            {
                                super(mib, parent, "jmAttributeValueAsOctets", "1.3.6.1.4.1.2699.1.1.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class JobmonMIBNotificationsEnt extends MIBEntry<JobMonitoringMIBDef>
        {
            private JobmonMIBNotificationsEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
            {
                super(mib, parent, "jobmonMIBNotifications", "1.3.6.1.4.1.2699.1.1.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class JmMIBConformanceEnt extends MIBEntry<JobMonitoringMIBDef>
        {
            /** compliance statements

There are no CONDITIONALLY MANDATORY or OPTIONAL groups.*/
            public final JmMIBComplianceEnt jmMIBCompliance;

            public final JmMIBGroupsEnt jmMIBGroups;

            private JmMIBConformanceEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
            {
                super(mib, parent, "jmMIBConformance", "1.3.6.1.4.1.2699.1.1.3", false, false, false, false);
                this.jmMIBCompliance = new JmMIBComplianceEnt(mib, this);
                this.jmMIBGroups = new JmMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.jmMIBCompliance,
                    this.jmMIBGroups
                };
            }
            public static final class JmMIBComplianceEnt extends MIBEntry<JobMonitoringMIBDef>
            {
                private JmMIBComplianceEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                {
                    super(mib, parent, "jmMIBCompliance", "1.3.6.1.4.1.2699.1.1.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class JmMIBGroupsEnt extends MIBEntry<JobMonitoringMIBDef>
            {
                public final JmGeneralGroupEnt jmGeneralGroup;

                public final JmJobIDGroupEnt jmJobIDGroup;

                public final JmJobGroupEnt jmJobGroup;

                public final JmAttributeGroupEnt jmAttributeGroup;

                private JmMIBGroupsEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                {
                    super(mib, parent, "jmMIBGroups", "1.3.6.1.4.1.2699.1.1.3.2", false, false, false, false);
                    this.jmGeneralGroup = new JmGeneralGroupEnt(mib, this);
                    this.jmJobIDGroup = new JmJobIDGroupEnt(mib, this);
                    this.jmJobGroup = new JmJobGroupEnt(mib, this);
                    this.jmAttributeGroup = new JmAttributeGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.jmGeneralGroup,
                        this.jmJobIDGroup,
                        this.jmJobGroup,
                        this.jmAttributeGroup
                    };
                }
                public static final class JmGeneralGroupEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    private JmGeneralGroupEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmGeneralGroup", "1.3.6.1.4.1.2699.1.1.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class JmJobIDGroupEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    private JmJobIDGroupEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmJobIDGroup", "1.3.6.1.4.1.2699.1.1.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class JmJobGroupEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    private JmJobGroupEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmJobGroup", "1.3.6.1.4.1.2699.1.1.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class JmAttributeGroupEnt extends MIBEntry<JobMonitoringMIBDef>
                {
                    private JmAttributeGroupEnt(JobMonitoringMIBDef mib, MIBEntry<JobMonitoringMIBDef> parent)
                    {
                        super(mib, parent, "jmAttributeGroup", "1.3.6.1.4.1.2699.1.1.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
