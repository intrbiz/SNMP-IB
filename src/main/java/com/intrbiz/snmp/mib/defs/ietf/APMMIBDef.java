package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class APMMIBDef extends MIB
{
    public static final APMMIBDef APMMIB = new APMMIBDef();

    static { MIBs.getInstance().registerMIB(APMMIBDef.APMMIB); }

    /** Application Performance Measurement MIB

February 19, 2004*/
    public final ApmEnt apm;

    private APMMIBDef()
    {
        super("APM-MIB");
        this.apm = new ApmEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.apm
        };
    }

    public static final class ApmEnt extends MIBEntry<APMMIBDef>
    {
        public final ApmMibObjectsEnt apmMibObjects;

        public final ApmConformanceEnt apmConformance;

        /** APM Notifications*/
        public final ApmNotificationsEnt apmNotifications;

        private ApmEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
        {
            super(mib, parent, "apm", "1.3.6.1.2.1.16.23", false, false, false, false);
            this.apmMibObjects = new ApmMibObjectsEnt(mib, this);
            this.apmConformance = new ApmConformanceEnt(mib, this);
            this.apmNotifications = new ApmNotificationsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.apmMibObjects,
                this.apmConformance,
                this.apmNotifications
            };
        }
        public static final class ApmMibObjectsEnt extends MIBEntry<APMMIBDef>
        {
            /** The APM Application Directory Group
The Application Directory Table contains a record for every


application monitored by this agent. This table is also used toconfigure whether or not an application will be measured and whichbucket boundaries will be used for the application.The bucket boundaries define the break-points between bins of ahistogram analysis for that application. As an example of how thisworks, consider an entry representing response-time for http.If the boundaries are set as follows:Boundary1: 500 millisecondsBoundary2: 1 secondBoundary3: 2 secondsBoundary4: 5Boundary5: 15Boundary6: 60If the following measurements are made (all in milliseconds):377, 8645, 1300, 487, 1405, 775, 1115, 850, 945, 1054, 7745, 9380A report run during this interval would report the followingcounts:Bucket1: 2Bucket2: 3Bucket3: 4Bucket4: 0Bucket5: 3Bucket6: 0Bucket7: 0*/
            public final ApmAppDirTableEnt apmAppDirTable;

            /** Scalars related to the Application Directory table*/
            public final ApmBucketBoundaryLastChangeEnt apmBucketBoundaryLastChange;

            public final ApmAppDirIDEnt apmAppDirID;

            /** APM HTTP Filter Table
The HTTP Filter Table creates virtual applications which measure theperformance of certain web pages  or sets of web pages. Somecircumstances where this is particularly useful are:- An Intranet or ASP scenario where a business application isrunning on one or more web pages or scripts.


(i.e., /expense/submit.cgi?employeeID=3426&...)- A web-hosting scenario where one wants to measure theservice level for a particular customer- An e-commerce scenario where the performance of certainpages needs to be monitored more closely.(i.e., shopping cart, shipping, credit card authorization)*/
            public final ApmHttpFilterTableEnt apmHttpFilterTable;

            public final ApmHttpIgnoreUnregisteredURLsEnt apmHttpIgnoreUnregisteredURLs;

            public final ApmHttp4xxIsFailureEnt apmHttp4xxIsFailure;

            /** The APM User-Defined Application Table
Many application protocols will never be registered with astandards body (and thus included in a protocol directory standard)because they are custom, in-house or proprietaryapplications. Nevertheless, implementation strategies exist formonitoring the end-user experience of these applications.This read-only table provides a means for the agent to advertisewhich user-defined applications it is monitoring and to associateeach with an AppLocalIndex value. It is an implementation-dependentmatter as to how the agent learns how to monitor theseapplications.*/
            public final ApmUserDefinedAppTableEnt apmUserDefinedAppTable;

            /** The APM Name Table*/
            public final ApmNameTableEnt apmNameTable;

            /** The APM Report Group*/
            public final ApmReportControlTableEnt apmReportControlTable;

            /** The APM Report Table*/
            public final ApmReportTableEnt apmReportTable;

            /** APM Transaction Table*/
            public final ApmTransactionTableEnt apmTransactionTable;

            public final ApmTransactionsRequestedHistorySizeEnt apmTransactionsRequestedHistorySize;

            /** The APM Exception tableThe APM Exception Table creates filters so that a managementstation can get immediate notification of a transaction that hashad poor availability or responsiveness.This function is particularly helpful in unaggregated situationswhere the numbers of agents is relatively high and the transactionrate per agent is relatively low (such as agents for desktops ordedicated to small workgroups). Polling agents in such anenvironment would either cause scalability problems (high rate) orlead to long notification delays (low rate).*/
            public final ApmExceptionTableEnt apmExceptionTable;

            public final ApmThroughputExceptionMinTimeEnt apmThroughputExceptionMinTime;

            public final ApmNotificationMaxRateEnt apmNotificationMaxRate;

            private ApmMibObjectsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
            {
                super(mib, parent, "apmMibObjects", "1.3.6.1.2.1.16.23.1", false, false, false, false);
                this.apmAppDirTable = new ApmAppDirTableEnt(mib, this);
                this.apmBucketBoundaryLastChange = new ApmBucketBoundaryLastChangeEnt(mib, this);
                this.apmAppDirID = new ApmAppDirIDEnt(mib, this);
                this.apmHttpFilterTable = new ApmHttpFilterTableEnt(mib, this);
                this.apmHttpIgnoreUnregisteredURLs = new ApmHttpIgnoreUnregisteredURLsEnt(mib, this);
                this.apmHttp4xxIsFailure = new ApmHttp4xxIsFailureEnt(mib, this);
                this.apmUserDefinedAppTable = new ApmUserDefinedAppTableEnt(mib, this);
                this.apmNameTable = new ApmNameTableEnt(mib, this);
                this.apmReportControlTable = new ApmReportControlTableEnt(mib, this);
                this.apmReportTable = new ApmReportTableEnt(mib, this);
                this.apmTransactionTable = new ApmTransactionTableEnt(mib, this);
                this.apmTransactionsRequestedHistorySize = new ApmTransactionsRequestedHistorySizeEnt(mib, this);
                this.apmExceptionTable = new ApmExceptionTableEnt(mib, this);
                this.apmThroughputExceptionMinTime = new ApmThroughputExceptionMinTimeEnt(mib, this);
                this.apmNotificationMaxRate = new ApmNotificationMaxRateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.apmAppDirTable,
                    this.apmBucketBoundaryLastChange,
                    this.apmAppDirID,
                    this.apmHttpFilterTable,
                    this.apmHttpIgnoreUnregisteredURLs,
                    this.apmHttp4xxIsFailure,
                    this.apmUserDefinedAppTable,
                    this.apmNameTable,
                    this.apmReportControlTable,
                    this.apmReportTable,
                    this.apmTransactionTable,
                    this.apmTransactionsRequestedHistorySize,
                    this.apmExceptionTable,
                    this.apmThroughputExceptionMinTime,
                    this.apmNotificationMaxRate
                };
            }
            public static final class ApmAppDirTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmAppDirEntryEnt apmAppDirEntry;

                private ApmAppDirTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmAppDirTable", "1.3.6.1.2.1.16.23.1.1", false, true, false, false);
                    this.apmAppDirEntry = new ApmAppDirEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmAppDirEntry
                    };
                }
                public static final class ApmAppDirEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmAppDirAppLocalIndexEnt apmAppDirAppLocalIndex;

                    public final ApmAppDirResponsivenessTypeEnt apmAppDirResponsivenessType;

                    public final ApmAppDirConfigEnt apmAppDirConfig;

                    public final ApmAppDirResponsivenessBoundary1Ent apmAppDirResponsivenessBoundary1;

                    public final ApmAppDirResponsivenessBoundary2Ent apmAppDirResponsivenessBoundary2;

                    public final ApmAppDirResponsivenessBoundary3Ent apmAppDirResponsivenessBoundary3;

                    public final ApmAppDirResponsivenessBoundary4Ent apmAppDirResponsivenessBoundary4;

                    public final ApmAppDirResponsivenessBoundary5Ent apmAppDirResponsivenessBoundary5;

                    public final ApmAppDirResponsivenessBoundary6Ent apmAppDirResponsivenessBoundary6;

                    private ApmAppDirEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmAppDirEntry", "1.3.6.1.2.1.16.23.1.1.1", false, false, false, true);
                        this.apmAppDirAppLocalIndex = new ApmAppDirAppLocalIndexEnt(mib, this);
                        this.apmAppDirResponsivenessType = new ApmAppDirResponsivenessTypeEnt(mib, this);
                        this.apmAppDirConfig = new ApmAppDirConfigEnt(mib, this);
                        this.apmAppDirResponsivenessBoundary1 = new ApmAppDirResponsivenessBoundary1Ent(mib, this);
                        this.apmAppDirResponsivenessBoundary2 = new ApmAppDirResponsivenessBoundary2Ent(mib, this);
                        this.apmAppDirResponsivenessBoundary3 = new ApmAppDirResponsivenessBoundary3Ent(mib, this);
                        this.apmAppDirResponsivenessBoundary4 = new ApmAppDirResponsivenessBoundary4Ent(mib, this);
                        this.apmAppDirResponsivenessBoundary5 = new ApmAppDirResponsivenessBoundary5Ent(mib, this);
                        this.apmAppDirResponsivenessBoundary6 = new ApmAppDirResponsivenessBoundary6Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmAppDirAppLocalIndex,
                            this.apmAppDirResponsivenessType,
                            this.apmAppDirConfig,
                            this.apmAppDirResponsivenessBoundary1,
                            this.apmAppDirResponsivenessBoundary2,
                            this.apmAppDirResponsivenessBoundary3,
                            this.apmAppDirResponsivenessBoundary4,
                            this.apmAppDirResponsivenessBoundary5,
                            this.apmAppDirResponsivenessBoundary6
                        };
                    }
                    public static final class ApmAppDirAppLocalIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirAppLocalIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirAppLocalIndex", "1.3.6.1.2.1.16.23.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessTypeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessTypeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessType", "1.3.6.1.2.1.16.23.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirConfigEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirConfigEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirConfig", "1.3.6.1.2.1.16.23.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessBoundary1Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessBoundary1Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessBoundary1", "1.3.6.1.2.1.16.23.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessBoundary2Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessBoundary2Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessBoundary2", "1.3.6.1.2.1.16.23.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessBoundary3Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessBoundary3Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessBoundary3", "1.3.6.1.2.1.16.23.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessBoundary4Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessBoundary4Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessBoundary4", "1.3.6.1.2.1.16.23.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessBoundary5Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessBoundary5Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessBoundary5", "1.3.6.1.2.1.16.23.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmAppDirResponsivenessBoundary6Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmAppDirResponsivenessBoundary6Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmAppDirResponsivenessBoundary6", "1.3.6.1.2.1.16.23.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmBucketBoundaryLastChangeEnt extends MIBEntry<APMMIBDef>
            {
                private ApmBucketBoundaryLastChangeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmBucketBoundaryLastChange", "1.3.6.1.2.1.16.23.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmAppDirIDEnt extends MIBEntry<APMMIBDef>
            {
                private ApmAppDirIDEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmAppDirID", "1.3.6.1.2.1.16.23.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmHttpFilterTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmHttpFilterEntryEnt apmHttpFilterEntry;

                private ApmHttpFilterTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmHttpFilterTable", "1.3.6.1.2.1.16.23.1.4", false, true, false, false);
                    this.apmHttpFilterEntry = new ApmHttpFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmHttpFilterEntry
                    };
                }
                public static final class ApmHttpFilterEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmHttpFilterIndexEnt apmHttpFilterIndex;

                    public final ApmHttpFilterAppLocalIndexEnt apmHttpFilterAppLocalIndex;

                    public final ApmHttpFilterServerProtocolEnt apmHttpFilterServerProtocol;

                    public final ApmHttpFilterServerAddressEnt apmHttpFilterServerAddress;

                    public final ApmHttpFilterURLPathEnt apmHttpFilterURLPath;

                    public final ApmHttpFilterMatchTypeEnt apmHttpFilterMatchType;

                    public final ApmHttpFilterOwnerEnt apmHttpFilterOwner;

                    public final ApmHttpFilterStorageTypeEnt apmHttpFilterStorageType;

                    public final ApmHttpFilterRowStatusEnt apmHttpFilterRowStatus;

                    private ApmHttpFilterEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmHttpFilterEntry", "1.3.6.1.2.1.16.23.1.4.1", false, false, false, true);
                        this.apmHttpFilterIndex = new ApmHttpFilterIndexEnt(mib, this);
                        this.apmHttpFilterAppLocalIndex = new ApmHttpFilterAppLocalIndexEnt(mib, this);
                        this.apmHttpFilterServerProtocol = new ApmHttpFilterServerProtocolEnt(mib, this);
                        this.apmHttpFilterServerAddress = new ApmHttpFilterServerAddressEnt(mib, this);
                        this.apmHttpFilterURLPath = new ApmHttpFilterURLPathEnt(mib, this);
                        this.apmHttpFilterMatchType = new ApmHttpFilterMatchTypeEnt(mib, this);
                        this.apmHttpFilterOwner = new ApmHttpFilterOwnerEnt(mib, this);
                        this.apmHttpFilterStorageType = new ApmHttpFilterStorageTypeEnt(mib, this);
                        this.apmHttpFilterRowStatus = new ApmHttpFilterRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmHttpFilterIndex,
                            this.apmHttpFilterAppLocalIndex,
                            this.apmHttpFilterServerProtocol,
                            this.apmHttpFilterServerAddress,
                            this.apmHttpFilterURLPath,
                            this.apmHttpFilterMatchType,
                            this.apmHttpFilterOwner,
                            this.apmHttpFilterStorageType,
                            this.apmHttpFilterRowStatus
                        };
                    }
                    public static final class ApmHttpFilterIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterIndex", "1.3.6.1.2.1.16.23.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterAppLocalIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterAppLocalIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterAppLocalIndex", "1.3.6.1.2.1.16.23.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterServerProtocolEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterServerProtocolEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterServerProtocol", "1.3.6.1.2.1.16.23.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterServerAddressEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterServerAddressEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterServerAddress", "1.3.6.1.2.1.16.23.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterURLPathEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterURLPathEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterURLPath", "1.3.6.1.2.1.16.23.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterMatchTypeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterMatchTypeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterMatchType", "1.3.6.1.2.1.16.23.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterOwnerEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterOwnerEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterOwner", "1.3.6.1.2.1.16.23.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterStorageTypeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterStorageTypeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterStorageType", "1.3.6.1.2.1.16.23.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmHttpFilterRowStatusEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmHttpFilterRowStatusEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmHttpFilterRowStatus", "1.3.6.1.2.1.16.23.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmHttpIgnoreUnregisteredURLsEnt extends MIBEntry<APMMIBDef>
            {
                private ApmHttpIgnoreUnregisteredURLsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmHttpIgnoreUnregisteredURLs", "1.3.6.1.2.1.16.23.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmHttp4xxIsFailureEnt extends MIBEntry<APMMIBDef>
            {
                private ApmHttp4xxIsFailureEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmHttp4xxIsFailure", "1.3.6.1.2.1.16.23.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmUserDefinedAppTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmUserDefinedAppEntryEnt apmUserDefinedAppEntry;

                private ApmUserDefinedAppTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmUserDefinedAppTable", "1.3.6.1.2.1.16.23.1.7", false, true, false, false);
                    this.apmUserDefinedAppEntry = new ApmUserDefinedAppEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmUserDefinedAppEntry
                    };
                }
                public static final class ApmUserDefinedAppEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmUserDefinedAppParentIndexEnt apmUserDefinedAppParentIndex;

                    public final ApmUserDefinedAppApplicationEnt apmUserDefinedAppApplication;

                    private ApmUserDefinedAppEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmUserDefinedAppEntry", "1.3.6.1.2.1.16.23.1.7.1", false, false, false, true);
                        this.apmUserDefinedAppParentIndex = new ApmUserDefinedAppParentIndexEnt(mib, this);
                        this.apmUserDefinedAppApplication = new ApmUserDefinedAppApplicationEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmUserDefinedAppParentIndex,
                            this.apmUserDefinedAppApplication
                        };
                    }
                    public static final class ApmUserDefinedAppParentIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmUserDefinedAppParentIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmUserDefinedAppParentIndex", "1.3.6.1.2.1.16.23.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmUserDefinedAppApplicationEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmUserDefinedAppApplicationEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmUserDefinedAppApplication", "1.3.6.1.2.1.16.23.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmNameTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmNameEntryEnt apmNameEntry;

                private ApmNameTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmNameTable", "1.3.6.1.2.1.16.23.1.8", false, true, false, false);
                    this.apmNameEntry = new ApmNameEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmNameEntry
                    };
                }
                public static final class ApmNameEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmNameClientIDEnt apmNameClientID;

                    public final ApmNameClientAddressEnt apmNameClientAddress;

                    public final ApmNameMappingStartTimeEnt apmNameMappingStartTime;

                    public final ApmNameMachineNameEnt apmNameMachineName;

                    public final ApmNameUserNameEnt apmNameUserName;

                    private ApmNameEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmNameEntry", "1.3.6.1.2.1.16.23.1.8.1", false, false, false, true);
                        this.apmNameClientID = new ApmNameClientIDEnt(mib, this);
                        this.apmNameClientAddress = new ApmNameClientAddressEnt(mib, this);
                        this.apmNameMappingStartTime = new ApmNameMappingStartTimeEnt(mib, this);
                        this.apmNameMachineName = new ApmNameMachineNameEnt(mib, this);
                        this.apmNameUserName = new ApmNameUserNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmNameClientID,
                            this.apmNameClientAddress,
                            this.apmNameMappingStartTime,
                            this.apmNameMachineName,
                            this.apmNameUserName
                        };
                    }
                    public static final class ApmNameClientIDEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmNameClientIDEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmNameClientID", "1.3.6.1.2.1.16.23.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmNameClientAddressEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmNameClientAddressEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmNameClientAddress", "1.3.6.1.2.1.16.23.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmNameMappingStartTimeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmNameMappingStartTimeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmNameMappingStartTime", "1.3.6.1.2.1.16.23.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmNameMachineNameEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmNameMachineNameEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmNameMachineName", "1.3.6.1.2.1.16.23.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmNameUserNameEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmNameUserNameEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmNameUserName", "1.3.6.1.2.1.16.23.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmReportControlTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmReportControlEntryEnt apmReportControlEntry;

                private ApmReportControlTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmReportControlTable", "1.3.6.1.2.1.16.23.1.9", false, true, false, false);
                    this.apmReportControlEntry = new ApmReportControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmReportControlEntry
                    };
                }
                public static final class ApmReportControlEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmReportControlIndexEnt apmReportControlIndex;

                    public final ApmReportControlDataSourceEnt apmReportControlDataSource;

                    /** INTEGER {
flows(1),
clients(2),
servers(3),
applications(4)
}*/
                    public final ApmReportControlAggregationTypeEnt apmReportControlAggregationType;

                    public final ApmReportControlIntervalEnt apmReportControlInterval;

                    public final ApmReportControlRequestedSizeEnt apmReportControlRequestedSize;

                    public final ApmReportControlGrantedSizeEnt apmReportControlGrantedSize;

                    public final ApmReportControlRequestedReportsEnt apmReportControlRequestedReports;

                    public final ApmReportControlGrantedReportsEnt apmReportControlGrantedReports;

                    public final ApmReportControlStartTimeEnt apmReportControlStartTime;

                    public final ApmReportControlReportNumberEnt apmReportControlReportNumber;

                    public final ApmReportControlDeniedInsertsEnt apmReportControlDeniedInserts;

                    public final ApmReportControlDroppedFramesEnt apmReportControlDroppedFrames;

                    public final ApmReportControlOwnerEnt apmReportControlOwner;

                    public final ApmReportControlStorageTypeEnt apmReportControlStorageType;

                    public final ApmReportControlStatusEnt apmReportControlStatus;

                    private ApmReportControlEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmReportControlEntry", "1.3.6.1.2.1.16.23.1.9.1", false, false, false, true);
                        this.apmReportControlIndex = new ApmReportControlIndexEnt(mib, this);
                        this.apmReportControlDataSource = new ApmReportControlDataSourceEnt(mib, this);
                        this.apmReportControlAggregationType = new ApmReportControlAggregationTypeEnt(mib, this);
                        this.apmReportControlInterval = new ApmReportControlIntervalEnt(mib, this);
                        this.apmReportControlRequestedSize = new ApmReportControlRequestedSizeEnt(mib, this);
                        this.apmReportControlGrantedSize = new ApmReportControlGrantedSizeEnt(mib, this);
                        this.apmReportControlRequestedReports = new ApmReportControlRequestedReportsEnt(mib, this);
                        this.apmReportControlGrantedReports = new ApmReportControlGrantedReportsEnt(mib, this);
                        this.apmReportControlStartTime = new ApmReportControlStartTimeEnt(mib, this);
                        this.apmReportControlReportNumber = new ApmReportControlReportNumberEnt(mib, this);
                        this.apmReportControlDeniedInserts = new ApmReportControlDeniedInsertsEnt(mib, this);
                        this.apmReportControlDroppedFrames = new ApmReportControlDroppedFramesEnt(mib, this);
                        this.apmReportControlOwner = new ApmReportControlOwnerEnt(mib, this);
                        this.apmReportControlStorageType = new ApmReportControlStorageTypeEnt(mib, this);
                        this.apmReportControlStatus = new ApmReportControlStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmReportControlIndex,
                            this.apmReportControlDataSource,
                            this.apmReportControlAggregationType,
                            this.apmReportControlInterval,
                            this.apmReportControlRequestedSize,
                            this.apmReportControlGrantedSize,
                            this.apmReportControlRequestedReports,
                            this.apmReportControlGrantedReports,
                            this.apmReportControlStartTime,
                            this.apmReportControlReportNumber,
                            this.apmReportControlDeniedInserts,
                            this.apmReportControlDroppedFrames,
                            this.apmReportControlOwner,
                            this.apmReportControlStorageType,
                            this.apmReportControlStatus
                        };
                    }
                    public static final class ApmReportControlIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlIndex", "1.3.6.1.2.1.16.23.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlDataSourceEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlDataSourceEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlDataSource", "1.3.6.1.2.1.16.23.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlAggregationTypeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlAggregationTypeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlAggregationType", "1.3.6.1.2.1.16.23.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlIntervalEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlIntervalEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlInterval", "1.3.6.1.2.1.16.23.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlRequestedSizeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlRequestedSizeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlRequestedSize", "1.3.6.1.2.1.16.23.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlGrantedSizeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlGrantedSizeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlGrantedSize", "1.3.6.1.2.1.16.23.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlRequestedReportsEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlRequestedReportsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlRequestedReports", "1.3.6.1.2.1.16.23.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlGrantedReportsEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlGrantedReportsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlGrantedReports", "1.3.6.1.2.1.16.23.1.9.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlStartTimeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlStartTimeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlStartTime", "1.3.6.1.2.1.16.23.1.9.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlReportNumberEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlReportNumberEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlReportNumber", "1.3.6.1.2.1.16.23.1.9.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlDeniedInsertsEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlDeniedInsertsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlDeniedInserts", "1.3.6.1.2.1.16.23.1.9.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlDroppedFramesEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlDroppedFramesEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlDroppedFrames", "1.3.6.1.2.1.16.23.1.9.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlOwnerEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlOwnerEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlOwner", "1.3.6.1.2.1.16.23.1.9.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlStorageTypeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlStorageTypeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlStorageType", "1.3.6.1.2.1.16.23.1.9.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportControlStatusEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportControlStatusEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportControlStatus", "1.3.6.1.2.1.16.23.1.9.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmReportTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmReportEntryEnt apmReportEntry;

                private ApmReportTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmReportTable", "1.3.6.1.2.1.16.23.1.10", false, true, false, false);
                    this.apmReportEntry = new ApmReportEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmReportEntry
                    };
                }
                public static final class ApmReportEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmReportIndexEnt apmReportIndex;

                    public final ApmReportServerAddressEnt apmReportServerAddress;

                    public final ApmReportTransactionCountEnt apmReportTransactionCount;

                    public final ApmReportSuccessfulTransactionsEnt apmReportSuccessfulTransactions;

                    public final ApmReportResponsivenessMeanEnt apmReportResponsivenessMean;

                    public final ApmReportResponsivenessMinEnt apmReportResponsivenessMin;

                    public final ApmReportResponsivenessMaxEnt apmReportResponsivenessMax;

                    /** Note that when updating a report entry, a transaction will not becounted in more than 1 bucket in an entry. It will be counted inthe first bucket that matches, starting with Bucket 1 (B1). Notethat if a transaction matches 2 application types, it will update


one bucket in each of 2 entries in this table.*/
                    public final ApmReportResponsivenessB1Ent apmReportResponsivenessB1;

                    public final ApmReportResponsivenessB2Ent apmReportResponsivenessB2;

                    public final ApmReportResponsivenessB3Ent apmReportResponsivenessB3;

                    public final ApmReportResponsivenessB4Ent apmReportResponsivenessB4;

                    public final ApmReportResponsivenessB5Ent apmReportResponsivenessB5;

                    public final ApmReportResponsivenessB6Ent apmReportResponsivenessB6;

                    public final ApmReportResponsivenessB7Ent apmReportResponsivenessB7;

                    private ApmReportEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmReportEntry", "1.3.6.1.2.1.16.23.1.10.1", false, false, false, true);
                        this.apmReportIndex = new ApmReportIndexEnt(mib, this);
                        this.apmReportServerAddress = new ApmReportServerAddressEnt(mib, this);
                        this.apmReportTransactionCount = new ApmReportTransactionCountEnt(mib, this);
                        this.apmReportSuccessfulTransactions = new ApmReportSuccessfulTransactionsEnt(mib, this);
                        this.apmReportResponsivenessMean = new ApmReportResponsivenessMeanEnt(mib, this);
                        this.apmReportResponsivenessMin = new ApmReportResponsivenessMinEnt(mib, this);
                        this.apmReportResponsivenessMax = new ApmReportResponsivenessMaxEnt(mib, this);
                        this.apmReportResponsivenessB1 = new ApmReportResponsivenessB1Ent(mib, this);
                        this.apmReportResponsivenessB2 = new ApmReportResponsivenessB2Ent(mib, this);
                        this.apmReportResponsivenessB3 = new ApmReportResponsivenessB3Ent(mib, this);
                        this.apmReportResponsivenessB4 = new ApmReportResponsivenessB4Ent(mib, this);
                        this.apmReportResponsivenessB5 = new ApmReportResponsivenessB5Ent(mib, this);
                        this.apmReportResponsivenessB6 = new ApmReportResponsivenessB6Ent(mib, this);
                        this.apmReportResponsivenessB7 = new ApmReportResponsivenessB7Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmReportIndex,
                            this.apmReportServerAddress,
                            this.apmReportTransactionCount,
                            this.apmReportSuccessfulTransactions,
                            this.apmReportResponsivenessMean,
                            this.apmReportResponsivenessMin,
                            this.apmReportResponsivenessMax,
                            this.apmReportResponsivenessB1,
                            this.apmReportResponsivenessB2,
                            this.apmReportResponsivenessB3,
                            this.apmReportResponsivenessB4,
                            this.apmReportResponsivenessB5,
                            this.apmReportResponsivenessB6,
                            this.apmReportResponsivenessB7
                        };
                    }
                    public static final class ApmReportIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportIndex", "1.3.6.1.2.1.16.23.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportServerAddressEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportServerAddressEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportServerAddress", "1.3.6.1.2.1.16.23.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportTransactionCountEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportTransactionCountEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportTransactionCount", "1.3.6.1.2.1.16.23.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportSuccessfulTransactionsEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportSuccessfulTransactionsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportSuccessfulTransactions", "1.3.6.1.2.1.16.23.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessMeanEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessMeanEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessMean", "1.3.6.1.2.1.16.23.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessMinEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessMinEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessMin", "1.3.6.1.2.1.16.23.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessMaxEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessMaxEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessMax", "1.3.6.1.2.1.16.23.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB1Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB1Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB1", "1.3.6.1.2.1.16.23.1.10.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB2Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB2Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB2", "1.3.6.1.2.1.16.23.1.10.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB3Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB3Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB3", "1.3.6.1.2.1.16.23.1.10.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB4Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB4Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB4", "1.3.6.1.2.1.16.23.1.10.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB5Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB5Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB5", "1.3.6.1.2.1.16.23.1.10.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB6Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB6Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB6", "1.3.6.1.2.1.16.23.1.10.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmReportResponsivenessB7Ent extends MIBEntry<APMMIBDef>
                    {
                        private ApmReportResponsivenessB7Ent(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmReportResponsivenessB7", "1.3.6.1.2.1.16.23.1.10.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmTransactionTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmTransactionEntryEnt apmTransactionEntry;

                private ApmTransactionTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmTransactionTable", "1.3.6.1.2.1.16.23.1.11", false, true, false, false);
                    this.apmTransactionEntry = new ApmTransactionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmTransactionEntry
                    };
                }
                public static final class ApmTransactionEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmTransactionServerAddressEnt apmTransactionServerAddress;

                    public final ApmTransactionIDEnt apmTransactionID;

                    public final ApmTransactionResponsivenessEnt apmTransactionResponsiveness;

                    public final ApmTransactionAgeEnt apmTransactionAge;

                    public final ApmTransactionSuccessEnt apmTransactionSuccess;

                    private ApmTransactionEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmTransactionEntry", "1.3.6.1.2.1.16.23.1.11.1", false, false, false, true);
                        this.apmTransactionServerAddress = new ApmTransactionServerAddressEnt(mib, this);
                        this.apmTransactionID = new ApmTransactionIDEnt(mib, this);
                        this.apmTransactionResponsiveness = new ApmTransactionResponsivenessEnt(mib, this);
                        this.apmTransactionAge = new ApmTransactionAgeEnt(mib, this);
                        this.apmTransactionSuccess = new ApmTransactionSuccessEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmTransactionServerAddress,
                            this.apmTransactionID,
                            this.apmTransactionResponsiveness,
                            this.apmTransactionAge,
                            this.apmTransactionSuccess
                        };
                    }
                    public static final class ApmTransactionServerAddressEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmTransactionServerAddressEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmTransactionServerAddress", "1.3.6.1.2.1.16.23.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmTransactionIDEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmTransactionIDEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmTransactionID", "1.3.6.1.2.1.16.23.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmTransactionResponsivenessEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmTransactionResponsivenessEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmTransactionResponsiveness", "1.3.6.1.2.1.16.23.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmTransactionAgeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmTransactionAgeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmTransactionAge", "1.3.6.1.2.1.16.23.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmTransactionSuccessEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmTransactionSuccessEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmTransactionSuccess", "1.3.6.1.2.1.16.23.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmTransactionsRequestedHistorySizeEnt extends MIBEntry<APMMIBDef>
            {
                private ApmTransactionsRequestedHistorySizeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmTransactionsRequestedHistorySize", "1.3.6.1.2.1.16.23.1.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmExceptionTableEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmExceptionEntryEnt apmExceptionEntry;

                private ApmExceptionTableEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmExceptionTable", "1.3.6.1.2.1.16.23.1.13", false, true, false, false);
                    this.apmExceptionEntry = new ApmExceptionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmExceptionEntry
                    };
                }
                public static final class ApmExceptionEntryEnt extends MIBEntry<APMMIBDef>
                {
                    public final ApmExceptionIndexEnt apmExceptionIndex;

                    public final ApmExceptionResponsivenessComparisonEnt apmExceptionResponsivenessComparison;

                    public final ApmExceptionResponsivenessThresholdEnt apmExceptionResponsivenessThreshold;

                    public final ApmExceptionUnsuccessfulExceptionEnt apmExceptionUnsuccessfulException;

                    public final ApmExceptionResponsivenessEventsEnt apmExceptionResponsivenessEvents;

                    public final ApmExceptionUnsuccessfulEventsEnt apmExceptionUnsuccessfulEvents;

                    public final ApmExceptionOwnerEnt apmExceptionOwner;

                    public final ApmExceptionStorageTypeEnt apmExceptionStorageType;

                    public final ApmExceptionStatusEnt apmExceptionStatus;

                    private ApmExceptionEntryEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmExceptionEntry", "1.3.6.1.2.1.16.23.1.13.1", false, false, false, true);
                        this.apmExceptionIndex = new ApmExceptionIndexEnt(mib, this);
                        this.apmExceptionResponsivenessComparison = new ApmExceptionResponsivenessComparisonEnt(mib, this);
                        this.apmExceptionResponsivenessThreshold = new ApmExceptionResponsivenessThresholdEnt(mib, this);
                        this.apmExceptionUnsuccessfulException = new ApmExceptionUnsuccessfulExceptionEnt(mib, this);
                        this.apmExceptionResponsivenessEvents = new ApmExceptionResponsivenessEventsEnt(mib, this);
                        this.apmExceptionUnsuccessfulEvents = new ApmExceptionUnsuccessfulEventsEnt(mib, this);
                        this.apmExceptionOwner = new ApmExceptionOwnerEnt(mib, this);
                        this.apmExceptionStorageType = new ApmExceptionStorageTypeEnt(mib, this);
                        this.apmExceptionStatus = new ApmExceptionStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apmExceptionIndex,
                            this.apmExceptionResponsivenessComparison,
                            this.apmExceptionResponsivenessThreshold,
                            this.apmExceptionUnsuccessfulException,
                            this.apmExceptionResponsivenessEvents,
                            this.apmExceptionUnsuccessfulEvents,
                            this.apmExceptionOwner,
                            this.apmExceptionStorageType,
                            this.apmExceptionStatus
                        };
                    }
                    public static final class ApmExceptionIndexEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionIndexEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionIndex", "1.3.6.1.2.1.16.23.1.13.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionResponsivenessComparisonEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionResponsivenessComparisonEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionResponsivenessComparison", "1.3.6.1.2.1.16.23.1.13.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionResponsivenessThresholdEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionResponsivenessThresholdEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionResponsivenessThreshold", "1.3.6.1.2.1.16.23.1.13.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionUnsuccessfulExceptionEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionUnsuccessfulExceptionEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionUnsuccessfulException", "1.3.6.1.2.1.16.23.1.13.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionResponsivenessEventsEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionResponsivenessEventsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionResponsivenessEvents", "1.3.6.1.2.1.16.23.1.13.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionUnsuccessfulEventsEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionUnsuccessfulEventsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionUnsuccessfulEvents", "1.3.6.1.2.1.16.23.1.13.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionOwnerEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionOwnerEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionOwner", "1.3.6.1.2.1.16.23.1.13.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionStorageTypeEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionStorageTypeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionStorageType", "1.3.6.1.2.1.16.23.1.13.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApmExceptionStatusEnt extends MIBEntry<APMMIBDef>
                    {
                        private ApmExceptionStatusEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                        {
                            super(mib, parent, "apmExceptionStatus", "1.3.6.1.2.1.16.23.1.13.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApmThroughputExceptionMinTimeEnt extends MIBEntry<APMMIBDef>
            {
                private ApmThroughputExceptionMinTimeEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmThroughputExceptionMinTime", "1.3.6.1.2.1.16.23.1.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmNotificationMaxRateEnt extends MIBEntry<APMMIBDef>
            {
                private ApmNotificationMaxRateEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmNotificationMaxRate", "1.3.6.1.2.1.16.23.1.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class ApmConformanceEnt extends MIBEntry<APMMIBDef>
        {
            public final ApmCompliancesEnt apmCompliances;

            public final ApmGroupsEnt apmGroups;

            private ApmConformanceEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
            {
                super(mib, parent, "apmConformance", "1.3.6.1.2.1.16.23.2", false, false, false, false);
                this.apmCompliances = new ApmCompliancesEnt(mib, this);
                this.apmGroups = new ApmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.apmCompliances,
                    this.apmGroups
                };
            }
            public static final class ApmCompliancesEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmComplianceEnt apmCompliance;

                private ApmCompliancesEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmCompliances", "1.3.6.1.2.1.16.23.2.1", false, false, false, false);
                    this.apmCompliance = new ApmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmCompliance
                    };
                }
                public static final class ApmComplianceEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmComplianceEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmCompliance", "1.3.6.1.2.1.16.23.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ApmGroupsEnt extends MIBEntry<APMMIBDef>
            {
                public final ApmAppDirGroupEnt apmAppDirGroup;

                public final ApmUserDefinedApplicationsGroupEnt apmUserDefinedApplicationsGroup;

                public final ApmReportGroupEnt apmReportGroup;

                public final ApmTransactionGroupEnt apmTransactionGroup;

                public final ApmExceptionGroupEnt apmExceptionGroup;

                public final ApmNotificationGroupEnt apmNotificationGroup;

                private ApmGroupsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmGroups", "1.3.6.1.2.1.16.23.2.2", false, false, false, false);
                    this.apmAppDirGroup = new ApmAppDirGroupEnt(mib, this);
                    this.apmUserDefinedApplicationsGroup = new ApmUserDefinedApplicationsGroupEnt(mib, this);
                    this.apmReportGroup = new ApmReportGroupEnt(mib, this);
                    this.apmTransactionGroup = new ApmTransactionGroupEnt(mib, this);
                    this.apmExceptionGroup = new ApmExceptionGroupEnt(mib, this);
                    this.apmNotificationGroup = new ApmNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apmAppDirGroup,
                        this.apmUserDefinedApplicationsGroup,
                        this.apmReportGroup,
                        this.apmTransactionGroup,
                        this.apmExceptionGroup,
                        this.apmNotificationGroup
                    };
                }
                public static final class ApmAppDirGroupEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmAppDirGroupEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmAppDirGroup", "1.3.6.1.2.1.16.23.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApmUserDefinedApplicationsGroupEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmUserDefinedApplicationsGroupEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmUserDefinedApplicationsGroup", "1.3.6.1.2.1.16.23.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApmReportGroupEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmReportGroupEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmReportGroup", "1.3.6.1.2.1.16.23.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApmTransactionGroupEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmTransactionGroupEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmTransactionGroup", "1.3.6.1.2.1.16.23.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApmExceptionGroupEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmExceptionGroupEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmExceptionGroup", "1.3.6.1.2.1.16.23.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApmNotificationGroupEnt extends MIBEntry<APMMIBDef>
                {
                    private ApmNotificationGroupEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                    {
                        super(mib, parent, "apmNotificationGroup", "1.3.6.1.2.1.16.23.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ApmNotificationsEnt extends MIBEntry<APMMIBDef>
        {
            public final ApmTransactionResponsivenessAlarmEnt apmTransactionResponsivenessAlarm;

            public final ApmTransactionUnsuccessfulAlarmEnt apmTransactionUnsuccessfulAlarm;

            private ApmNotificationsEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
            {
                super(mib, parent, "apmNotifications", "1.3.6.1.2.1.16.23.0", false, false, false, false);
                this.apmTransactionResponsivenessAlarm = new ApmTransactionResponsivenessAlarmEnt(mib, this);
                this.apmTransactionUnsuccessfulAlarm = new ApmTransactionUnsuccessfulAlarmEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.apmTransactionResponsivenessAlarm,
                    this.apmTransactionUnsuccessfulAlarm
                };
            }
            public static final class ApmTransactionResponsivenessAlarmEnt extends MIBEntry<APMMIBDef>
            {
                private ApmTransactionResponsivenessAlarmEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmTransactionResponsivenessAlarm", "1.3.6.1.2.1.16.23.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ApmTransactionUnsuccessfulAlarmEnt extends MIBEntry<APMMIBDef>
            {
                private ApmTransactionUnsuccessfulAlarmEnt(APMMIBDef mib, MIBEntry<APMMIBDef> parent)
                {
                    super(mib, parent, "apmTransactionUnsuccessfulAlarm", "1.3.6.1.2.1.16.23.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
