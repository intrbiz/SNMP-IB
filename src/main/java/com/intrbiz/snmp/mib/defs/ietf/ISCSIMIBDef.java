package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 3411
RFC 4001*/
public final class ISCSIMIBDef extends MIB
{
    public static final ISCSIMIBDef ISCSIMIB = new ISCSIMIBDef();

    static { MIBs.getInstance().registerMIB(ISCSIMIBDef.ISCSIMIB); }

    /** May 22, 2006*/
    public final IscsiMibModuleEnt iscsiMibModule;

    private ISCSIMIBDef()
    {
        super("ISCSI-MIB");
        this.iscsiMibModule = new IscsiMibModuleEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.iscsiMibModule
        };
    }

    public static final class IscsiMibModuleEnt extends MIBEntry<ISCSIMIBDef>
    {
        public final IscsiNotificationsEnt iscsiNotifications;

        public final IscsiObjectsEnt iscsiObjects;

        public final IscsiConformanceEnt iscsiConformance;

        public final IscsiAdminEnt iscsiAdmin;

        private IscsiMibModuleEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
        {
            super(mib, parent, "iscsiMibModule", "1.3.6.1.2.1.142", false, false, false, false);
            this.iscsiNotifications = new IscsiNotificationsEnt(mib, this);
            this.iscsiObjects = new IscsiObjectsEnt(mib, this);
            this.iscsiConformance = new IscsiConformanceEnt(mib, this);
            this.iscsiAdmin = new IscsiAdminEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.iscsiNotifications,
                this.iscsiObjects,
                this.iscsiConformance,
                this.iscsiAdmin
            };
        }
        public static final class IscsiNotificationsEnt extends MIBEntry<ISCSIMIBDef>
        {
            /** **********************************************************************Notifications*/
            public final IscsiTgtLoginFailureEnt iscsiTgtLoginFailure;

            public final IscsiIntrLoginFailureEnt iscsiIntrLoginFailure;

            public final IscsiInstSessionFailureEnt iscsiInstSessionFailure;

            private IscsiNotificationsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
            {
                super(mib, parent, "iscsiNotifications", "1.3.6.1.2.1.142.0", false, false, false, false);
                this.iscsiTgtLoginFailure = new IscsiTgtLoginFailureEnt(mib, this);
                this.iscsiIntrLoginFailure = new IscsiIntrLoginFailureEnt(mib, this);
                this.iscsiInstSessionFailure = new IscsiInstSessionFailureEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.iscsiTgtLoginFailure,
                    this.iscsiIntrLoginFailure,
                    this.iscsiInstSessionFailure
                };
            }
            public static final class IscsiTgtLoginFailureEnt extends MIBEntry<ISCSIMIBDef>
            {
                private IscsiTgtLoginFailureEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiTgtLoginFailure", "1.3.6.1.2.1.142.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IscsiIntrLoginFailureEnt extends MIBEntry<ISCSIMIBDef>
            {
                private IscsiIntrLoginFailureEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiIntrLoginFailure", "1.3.6.1.2.1.142.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IscsiInstSessionFailureEnt extends MIBEntry<ISCSIMIBDef>
            {
                private IscsiInstSessionFailureEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiInstSessionFailure", "1.3.6.1.2.1.142.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class IscsiObjectsEnt extends MIBEntry<ISCSIMIBDef>
        {
            /** ***********************************************************************/
            public final IscsiInstanceEnt iscsiInstance;

            /** ***********************************************************************/
            public final IscsiPortalEnt iscsiPortal;

            /** ***********************************************************************/
            public final IscsiTargetPortalEnt iscsiTargetPortal;

            /** ***********************************************************************/
            public final IscsiInitiatorPortalEnt iscsiInitiatorPortal;

            /** ***********************************************************************/
            public final IscsiNodeEnt iscsiNode;

            /** ***********************************************************************/
            public final IscsiTargetEnt iscsiTarget;

            /** ***********************************************************************/
            public final IscsiTgtAuthorizationEnt iscsiTgtAuthorization;

            /** ***********************************************************************/
            public final IscsiInitiatorEnt iscsiInitiator;

            /** ***********************************************************************/
            public final IscsiIntrAuthorizationEnt iscsiIntrAuthorization;

            /** ***********************************************************************/
            public final IscsiSessionEnt iscsiSession;

            /** ***********************************************************************/
            public final IscsiConnectionEnt iscsiConnection;

            private IscsiObjectsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
            {
                super(mib, parent, "iscsiObjects", "1.3.6.1.2.1.142.1", false, false, false, false);
                this.iscsiInstance = new IscsiInstanceEnt(mib, this);
                this.iscsiPortal = new IscsiPortalEnt(mib, this);
                this.iscsiTargetPortal = new IscsiTargetPortalEnt(mib, this);
                this.iscsiInitiatorPortal = new IscsiInitiatorPortalEnt(mib, this);
                this.iscsiNode = new IscsiNodeEnt(mib, this);
                this.iscsiTarget = new IscsiTargetEnt(mib, this);
                this.iscsiTgtAuthorization = new IscsiTgtAuthorizationEnt(mib, this);
                this.iscsiInitiator = new IscsiInitiatorEnt(mib, this);
                this.iscsiIntrAuthorization = new IscsiIntrAuthorizationEnt(mib, this);
                this.iscsiSession = new IscsiSessionEnt(mib, this);
                this.iscsiConnection = new IscsiConnectionEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.iscsiInstance,
                    this.iscsiPortal,
                    this.iscsiTargetPortal,
                    this.iscsiInitiatorPortal,
                    this.iscsiNode,
                    this.iscsiTarget,
                    this.iscsiTgtAuthorization,
                    this.iscsiInitiator,
                    this.iscsiIntrAuthorization,
                    this.iscsiSession,
                    this.iscsiConnection
                };
            }
            public static final class IscsiInstanceEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Instance Attributes Table*/
                public final IscsiInstanceAttributesTableEnt iscsiInstanceAttributesTable;

                /** Instance Session Failure Stats Table*/
                public final IscsiInstanceSsnErrorStatsTableEnt iscsiInstanceSsnErrorStatsTable;

                private IscsiInstanceEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiInstance", "1.3.6.1.2.1.142.1.1", false, false, false, false);
                    this.iscsiInstanceAttributesTable = new IscsiInstanceAttributesTableEnt(mib, this);
                    this.iscsiInstanceSsnErrorStatsTable = new IscsiInstanceSsnErrorStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiInstanceAttributesTable,
                        this.iscsiInstanceSsnErrorStatsTable
                    };
                }
                public static final class IscsiInstanceAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiInstanceAttributesEntryEnt iscsiInstanceAttributesEntry;

                    private IscsiInstanceAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInstanceAttributesTable", "1.3.6.1.2.1.142.1.1.1", false, true, false, false);
                        this.iscsiInstanceAttributesEntry = new IscsiInstanceAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiInstanceAttributesEntry
                        };
                    }
                    public static final class IscsiInstanceAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiInstIndexEnt iscsiInstIndex;

                        public final IscsiInstDescrEnt iscsiInstDescr;

                        public final IscsiInstVersionMinEnt iscsiInstVersionMin;

                        public final IscsiInstVersionMaxEnt iscsiInstVersionMax;

                        public final IscsiInstVendorIDEnt iscsiInstVendorID;

                        public final IscsiInstVendorVersionEnt iscsiInstVendorVersion;

                        public final IscsiInstPortalNumberEnt iscsiInstPortalNumber;

                        public final IscsiInstNodeNumberEnt iscsiInstNodeNumber;

                        public final IscsiInstSessionNumberEnt iscsiInstSessionNumber;

                        public final IscsiInstSsnFailuresEnt iscsiInstSsnFailures;

                        public final IscsiInstLastSsnFailureTypeEnt iscsiInstLastSsnFailureType;

                        public final IscsiInstLastSsnRmtNodeNameEnt iscsiInstLastSsnRmtNodeName;

                        public final IscsiInstDiscontinuityTimeEnt iscsiInstDiscontinuityTime;

                        private IscsiInstanceAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiInstanceAttributesEntry", "1.3.6.1.2.1.142.1.1.1.1", false, false, false, true);
                            this.iscsiInstIndex = new IscsiInstIndexEnt(mib, this);
                            this.iscsiInstDescr = new IscsiInstDescrEnt(mib, this);
                            this.iscsiInstVersionMin = new IscsiInstVersionMinEnt(mib, this);
                            this.iscsiInstVersionMax = new IscsiInstVersionMaxEnt(mib, this);
                            this.iscsiInstVendorID = new IscsiInstVendorIDEnt(mib, this);
                            this.iscsiInstVendorVersion = new IscsiInstVendorVersionEnt(mib, this);
                            this.iscsiInstPortalNumber = new IscsiInstPortalNumberEnt(mib, this);
                            this.iscsiInstNodeNumber = new IscsiInstNodeNumberEnt(mib, this);
                            this.iscsiInstSessionNumber = new IscsiInstSessionNumberEnt(mib, this);
                            this.iscsiInstSsnFailures = new IscsiInstSsnFailuresEnt(mib, this);
                            this.iscsiInstLastSsnFailureType = new IscsiInstLastSsnFailureTypeEnt(mib, this);
                            this.iscsiInstLastSsnRmtNodeName = new IscsiInstLastSsnRmtNodeNameEnt(mib, this);
                            this.iscsiInstDiscontinuityTime = new IscsiInstDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiInstIndex,
                                this.iscsiInstDescr,
                                this.iscsiInstVersionMin,
                                this.iscsiInstVersionMax,
                                this.iscsiInstVendorID,
                                this.iscsiInstVendorVersion,
                                this.iscsiInstPortalNumber,
                                this.iscsiInstNodeNumber,
                                this.iscsiInstSessionNumber,
                                this.iscsiInstSsnFailures,
                                this.iscsiInstLastSsnFailureType,
                                this.iscsiInstLastSsnRmtNodeName,
                                this.iscsiInstDiscontinuityTime
                            };
                        }
                        public static final class IscsiInstIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstIndex", "1.3.6.1.2.1.142.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstDescrEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstDescrEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstDescr", "1.3.6.1.2.1.142.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstVersionMinEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstVersionMinEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstVersionMin", "1.3.6.1.2.1.142.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstVersionMaxEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstVersionMaxEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstVersionMax", "1.3.6.1.2.1.142.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstVendorIDEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstVendorIDEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstVendorID", "1.3.6.1.2.1.142.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstVendorVersionEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstVendorVersionEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstVendorVersion", "1.3.6.1.2.1.142.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstPortalNumberEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstPortalNumberEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstPortalNumber", "1.3.6.1.2.1.142.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstNodeNumberEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstNodeNumberEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstNodeNumber", "1.3.6.1.2.1.142.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstSessionNumberEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstSessionNumberEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstSessionNumber", "1.3.6.1.2.1.142.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstSsnFailuresEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstSsnFailuresEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstSsnFailures", "1.3.6.1.2.1.142.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstLastSsnFailureTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstLastSsnFailureTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstLastSsnFailureType", "1.3.6.1.2.1.142.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstLastSsnRmtNodeNameEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstLastSsnRmtNodeNameEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstLastSsnRmtNodeName", "1.3.6.1.2.1.142.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstDiscontinuityTimeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstDiscontinuityTimeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstDiscontinuityTime", "1.3.6.1.2.1.142.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiInstanceSsnErrorStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiInstanceSsnErrorStatsEntryEnt iscsiInstanceSsnErrorStatsEntry;

                    private IscsiInstanceSsnErrorStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInstanceSsnErrorStatsTable", "1.3.6.1.2.1.142.1.1.2", false, true, false, false);
                        this.iscsiInstanceSsnErrorStatsEntry = new IscsiInstanceSsnErrorStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiInstanceSsnErrorStatsEntry
                        };
                    }
                    public static final class IscsiInstanceSsnErrorStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiInstSsnDigestErrorsEnt iscsiInstSsnDigestErrors;

                        public final IscsiInstSsnCxnTimeoutErrorsEnt iscsiInstSsnCxnTimeoutErrors;

                        public final IscsiInstSsnFormatErrorsEnt iscsiInstSsnFormatErrors;

                        private IscsiInstanceSsnErrorStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiInstanceSsnErrorStatsEntry", "1.3.6.1.2.1.142.1.1.2.1", false, false, false, true);
                            this.iscsiInstSsnDigestErrors = new IscsiInstSsnDigestErrorsEnt(mib, this);
                            this.iscsiInstSsnCxnTimeoutErrors = new IscsiInstSsnCxnTimeoutErrorsEnt(mib, this);
                            this.iscsiInstSsnFormatErrors = new IscsiInstSsnFormatErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiInstSsnDigestErrors,
                                this.iscsiInstSsnCxnTimeoutErrors,
                                this.iscsiInstSsnFormatErrors
                            };
                        }
                        public static final class IscsiInstSsnDigestErrorsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstSsnDigestErrorsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstSsnDigestErrors", "1.3.6.1.2.1.142.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstSsnCxnTimeoutErrorsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstSsnCxnTimeoutErrorsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstSsnCxnTimeoutErrors", "1.3.6.1.2.1.142.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiInstSsnFormatErrorsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiInstSsnFormatErrorsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiInstSsnFormatErrors", "1.3.6.1.2.1.142.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiPortalEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Portal Attributes Table*/
                public final IscsiPortalAttributesTableEnt iscsiPortalAttributesTable;

                private IscsiPortalEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiPortal", "1.3.6.1.2.1.142.1.2", false, false, false, false);
                    this.iscsiPortalAttributesTable = new IscsiPortalAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiPortalAttributesTable
                    };
                }
                public static final class IscsiPortalAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiPortalAttributesEntryEnt iscsiPortalAttributesEntry;

                    private IscsiPortalAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiPortalAttributesTable", "1.3.6.1.2.1.142.1.2.1", false, true, false, false);
                        this.iscsiPortalAttributesEntry = new IscsiPortalAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiPortalAttributesEntry
                        };
                    }
                    public static final class IscsiPortalAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiPortalIndexEnt iscsiPortalIndex;

                        public final IscsiPortalRowStatusEnt iscsiPortalRowStatus;

                        public final IscsiPortalRolesEnt iscsiPortalRoles;

                        public final IscsiPortalAddrTypeEnt iscsiPortalAddrType;

                        public final IscsiPortalAddrEnt iscsiPortalAddr;

                        /** TCP*/
                        public final IscsiPortalProtocolEnt iscsiPortalProtocol;

                        public final IscsiPortalMaxRecvDataSegLengthEnt iscsiPortalMaxRecvDataSegLength;

                        public final IscsiPortalPrimaryHdrDigestEnt iscsiPortalPrimaryHdrDigest;

                        public final IscsiPortalPrimaryDataDigestEnt iscsiPortalPrimaryDataDigest;

                        public final IscsiPortalSecondaryHdrDigestEnt iscsiPortalSecondaryHdrDigest;

                        public final IscsiPortalSecondaryDataDigestEnt iscsiPortalSecondaryDataDigest;

                        public final IscsiPortalRecvMarkerEnt iscsiPortalRecvMarker;

                        public final IscsiPortalStorageTypeEnt iscsiPortalStorageType;

                        private IscsiPortalAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiPortalAttributesEntry", "1.3.6.1.2.1.142.1.2.1.1", false, false, false, true);
                            this.iscsiPortalIndex = new IscsiPortalIndexEnt(mib, this);
                            this.iscsiPortalRowStatus = new IscsiPortalRowStatusEnt(mib, this);
                            this.iscsiPortalRoles = new IscsiPortalRolesEnt(mib, this);
                            this.iscsiPortalAddrType = new IscsiPortalAddrTypeEnt(mib, this);
                            this.iscsiPortalAddr = new IscsiPortalAddrEnt(mib, this);
                            this.iscsiPortalProtocol = new IscsiPortalProtocolEnt(mib, this);
                            this.iscsiPortalMaxRecvDataSegLength = new IscsiPortalMaxRecvDataSegLengthEnt(mib, this);
                            this.iscsiPortalPrimaryHdrDigest = new IscsiPortalPrimaryHdrDigestEnt(mib, this);
                            this.iscsiPortalPrimaryDataDigest = new IscsiPortalPrimaryDataDigestEnt(mib, this);
                            this.iscsiPortalSecondaryHdrDigest = new IscsiPortalSecondaryHdrDigestEnt(mib, this);
                            this.iscsiPortalSecondaryDataDigest = new IscsiPortalSecondaryDataDigestEnt(mib, this);
                            this.iscsiPortalRecvMarker = new IscsiPortalRecvMarkerEnt(mib, this);
                            this.iscsiPortalStorageType = new IscsiPortalStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiPortalIndex,
                                this.iscsiPortalRowStatus,
                                this.iscsiPortalRoles,
                                this.iscsiPortalAddrType,
                                this.iscsiPortalAddr,
                                this.iscsiPortalProtocol,
                                this.iscsiPortalMaxRecvDataSegLength,
                                this.iscsiPortalPrimaryHdrDigest,
                                this.iscsiPortalPrimaryDataDigest,
                                this.iscsiPortalSecondaryHdrDigest,
                                this.iscsiPortalSecondaryDataDigest,
                                this.iscsiPortalRecvMarker,
                                this.iscsiPortalStorageType
                            };
                        }
                        public static final class IscsiPortalIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalIndex", "1.3.6.1.2.1.142.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalRowStatusEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalRowStatusEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalRowStatus", "1.3.6.1.2.1.142.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalRolesEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalRolesEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalRoles", "1.3.6.1.2.1.142.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalAddrTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalAddrTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalAddrType", "1.3.6.1.2.1.142.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalAddrEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalAddrEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalAddr", "1.3.6.1.2.1.142.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalProtocolEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalProtocolEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalProtocol", "1.3.6.1.2.1.142.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalMaxRecvDataSegLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalMaxRecvDataSegLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalMaxRecvDataSegLength", "1.3.6.1.2.1.142.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalPrimaryHdrDigestEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalPrimaryHdrDigestEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalPrimaryHdrDigest", "1.3.6.1.2.1.142.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalPrimaryDataDigestEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalPrimaryDataDigestEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalPrimaryDataDigest", "1.3.6.1.2.1.142.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalSecondaryHdrDigestEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalSecondaryHdrDigestEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalSecondaryHdrDigest", "1.3.6.1.2.1.142.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalSecondaryDataDigestEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalSecondaryDataDigestEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalSecondaryDataDigest", "1.3.6.1.2.1.142.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalRecvMarkerEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalRecvMarkerEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalRecvMarker", "1.3.6.1.2.1.142.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiPortalStorageTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiPortalStorageTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiPortalStorageType", "1.3.6.1.2.1.142.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiTargetPortalEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Target Portal Attributes Table*/
                public final IscsiTgtPortalAttributesTableEnt iscsiTgtPortalAttributesTable;

                private IscsiTargetPortalEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiTargetPortal", "1.3.6.1.2.1.142.1.3", false, false, false, false);
                    this.iscsiTgtPortalAttributesTable = new IscsiTgtPortalAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiTgtPortalAttributesTable
                    };
                }
                public static final class IscsiTgtPortalAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiTgtPortalAttributesEntryEnt iscsiTgtPortalAttributesEntry;

                    private IscsiTgtPortalAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTgtPortalAttributesTable", "1.3.6.1.2.1.142.1.3.1", false, true, false, false);
                        this.iscsiTgtPortalAttributesEntry = new IscsiTgtPortalAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiTgtPortalAttributesEntry
                        };
                    }
                    public static final class IscsiTgtPortalAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiTgtPortalNodeIndexOrZeroEnt iscsiTgtPortalNodeIndexOrZero;

                        public final IscsiTgtPortalPortEnt iscsiTgtPortalPort;

                        public final IscsiTgtPortalTagEnt iscsiTgtPortalTag;

                        private IscsiTgtPortalAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiTgtPortalAttributesEntry", "1.3.6.1.2.1.142.1.3.1.1", false, false, false, true);
                            this.iscsiTgtPortalNodeIndexOrZero = new IscsiTgtPortalNodeIndexOrZeroEnt(mib, this);
                            this.iscsiTgtPortalPort = new IscsiTgtPortalPortEnt(mib, this);
                            this.iscsiTgtPortalTag = new IscsiTgtPortalTagEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiTgtPortalNodeIndexOrZero,
                                this.iscsiTgtPortalPort,
                                this.iscsiTgtPortalTag
                            };
                        }
                        public static final class IscsiTgtPortalNodeIndexOrZeroEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtPortalNodeIndexOrZeroEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtPortalNodeIndexOrZero", "1.3.6.1.2.1.142.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtPortalPortEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtPortalPortEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtPortalPort", "1.3.6.1.2.1.142.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtPortalTagEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtPortalTagEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtPortalTag", "1.3.6.1.2.1.142.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiInitiatorPortalEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Initiator Portal Attributes Table*/
                public final IscsiIntrPortalAttributesTableEnt iscsiIntrPortalAttributesTable;

                private IscsiInitiatorPortalEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiInitiatorPortal", "1.3.6.1.2.1.142.1.4", false, false, false, false);
                    this.iscsiIntrPortalAttributesTable = new IscsiIntrPortalAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiIntrPortalAttributesTable
                    };
                }
                public static final class IscsiIntrPortalAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiIntrPortalAttributesEntryEnt iscsiIntrPortalAttributesEntry;

                    private IscsiIntrPortalAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiIntrPortalAttributesTable", "1.3.6.1.2.1.142.1.4.1", false, true, false, false);
                        this.iscsiIntrPortalAttributesEntry = new IscsiIntrPortalAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiIntrPortalAttributesEntry
                        };
                    }
                    public static final class IscsiIntrPortalAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiIntrPortalNodeIndexOrZeroEnt iscsiIntrPortalNodeIndexOrZero;

                        public final IscsiIntrPortalTagEnt iscsiIntrPortalTag;

                        private IscsiIntrPortalAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiIntrPortalAttributesEntry", "1.3.6.1.2.1.142.1.4.1.1", false, false, false, true);
                            this.iscsiIntrPortalNodeIndexOrZero = new IscsiIntrPortalNodeIndexOrZeroEnt(mib, this);
                            this.iscsiIntrPortalTag = new IscsiIntrPortalTagEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiIntrPortalNodeIndexOrZero,
                                this.iscsiIntrPortalTag
                            };
                        }
                        public static final class IscsiIntrPortalNodeIndexOrZeroEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrPortalNodeIndexOrZeroEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrPortalNodeIndexOrZero", "1.3.6.1.2.1.142.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrPortalTagEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrPortalTagEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrPortalTag", "1.3.6.1.2.1.142.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiNodeEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Node Attributes Table*/
                public final IscsiNodeAttributesTableEnt iscsiNodeAttributesTable;

                private IscsiNodeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiNode", "1.3.6.1.2.1.142.1.5", false, false, false, false);
                    this.iscsiNodeAttributesTable = new IscsiNodeAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiNodeAttributesTable
                    };
                }
                public static final class IscsiNodeAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiNodeAttributesEntryEnt iscsiNodeAttributesEntry;

                    private IscsiNodeAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiNodeAttributesTable", "1.3.6.1.2.1.142.1.5.1", false, true, false, false);
                        this.iscsiNodeAttributesEntry = new IscsiNodeAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiNodeAttributesEntry
                        };
                    }
                    public static final class IscsiNodeAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiNodeIndexEnt iscsiNodeIndex;

                        public final IscsiNodeNameEnt iscsiNodeName;

                        public final IscsiNodeAliasEnt iscsiNodeAlias;

                        public final IscsiNodeRolesEnt iscsiNodeRoles;

                        public final IscsiNodeTransportTypeEnt iscsiNodeTransportType;

                        public final IscsiNodeInitialR2TEnt iscsiNodeInitialR2T;

                        public final IscsiNodeImmediateDataEnt iscsiNodeImmediateData;

                        public final IscsiNodeMaxOutstandingR2TEnt iscsiNodeMaxOutstandingR2T;

                        public final IscsiNodeFirstBurstLengthEnt iscsiNodeFirstBurstLength;

                        public final IscsiNodeMaxBurstLengthEnt iscsiNodeMaxBurstLength;

                        public final IscsiNodeMaxConnectionsEnt iscsiNodeMaxConnections;

                        public final IscsiNodeDataSequenceInOrderEnt iscsiNodeDataSequenceInOrder;

                        public final IscsiNodeDataPDUInOrderEnt iscsiNodeDataPDUInOrder;

                        public final IscsiNodeDefaultTime2WaitEnt iscsiNodeDefaultTime2Wait;

                        public final IscsiNodeDefaultTime2RetainEnt iscsiNodeDefaultTime2Retain;

                        public final IscsiNodeErrorRecoveryLevelEnt iscsiNodeErrorRecoveryLevel;

                        public final IscsiNodeDiscontinuityTimeEnt iscsiNodeDiscontinuityTime;

                        public final IscsiNodeStorageTypeEnt iscsiNodeStorageType;

                        private IscsiNodeAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiNodeAttributesEntry", "1.3.6.1.2.1.142.1.5.1.1", false, false, false, true);
                            this.iscsiNodeIndex = new IscsiNodeIndexEnt(mib, this);
                            this.iscsiNodeName = new IscsiNodeNameEnt(mib, this);
                            this.iscsiNodeAlias = new IscsiNodeAliasEnt(mib, this);
                            this.iscsiNodeRoles = new IscsiNodeRolesEnt(mib, this);
                            this.iscsiNodeTransportType = new IscsiNodeTransportTypeEnt(mib, this);
                            this.iscsiNodeInitialR2T = new IscsiNodeInitialR2TEnt(mib, this);
                            this.iscsiNodeImmediateData = new IscsiNodeImmediateDataEnt(mib, this);
                            this.iscsiNodeMaxOutstandingR2T = new IscsiNodeMaxOutstandingR2TEnt(mib, this);
                            this.iscsiNodeFirstBurstLength = new IscsiNodeFirstBurstLengthEnt(mib, this);
                            this.iscsiNodeMaxBurstLength = new IscsiNodeMaxBurstLengthEnt(mib, this);
                            this.iscsiNodeMaxConnections = new IscsiNodeMaxConnectionsEnt(mib, this);
                            this.iscsiNodeDataSequenceInOrder = new IscsiNodeDataSequenceInOrderEnt(mib, this);
                            this.iscsiNodeDataPDUInOrder = new IscsiNodeDataPDUInOrderEnt(mib, this);
                            this.iscsiNodeDefaultTime2Wait = new IscsiNodeDefaultTime2WaitEnt(mib, this);
                            this.iscsiNodeDefaultTime2Retain = new IscsiNodeDefaultTime2RetainEnt(mib, this);
                            this.iscsiNodeErrorRecoveryLevel = new IscsiNodeErrorRecoveryLevelEnt(mib, this);
                            this.iscsiNodeDiscontinuityTime = new IscsiNodeDiscontinuityTimeEnt(mib, this);
                            this.iscsiNodeStorageType = new IscsiNodeStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiNodeIndex,
                                this.iscsiNodeName,
                                this.iscsiNodeAlias,
                                this.iscsiNodeRoles,
                                this.iscsiNodeTransportType,
                                this.iscsiNodeInitialR2T,
                                this.iscsiNodeImmediateData,
                                this.iscsiNodeMaxOutstandingR2T,
                                this.iscsiNodeFirstBurstLength,
                                this.iscsiNodeMaxBurstLength,
                                this.iscsiNodeMaxConnections,
                                this.iscsiNodeDataSequenceInOrder,
                                this.iscsiNodeDataPDUInOrder,
                                this.iscsiNodeDefaultTime2Wait,
                                this.iscsiNodeDefaultTime2Retain,
                                this.iscsiNodeErrorRecoveryLevel,
                                this.iscsiNodeDiscontinuityTime,
                                this.iscsiNodeStorageType
                            };
                        }
                        public static final class IscsiNodeIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeIndex", "1.3.6.1.2.1.142.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeNameEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeNameEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeName", "1.3.6.1.2.1.142.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeAliasEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeAliasEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeAlias", "1.3.6.1.2.1.142.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeRolesEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeRolesEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeRoles", "1.3.6.1.2.1.142.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeTransportTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeTransportTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeTransportType", "1.3.6.1.2.1.142.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeInitialR2TEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeInitialR2TEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeInitialR2T", "1.3.6.1.2.1.142.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeImmediateDataEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeImmediateDataEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeImmediateData", "1.3.6.1.2.1.142.1.5.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeMaxOutstandingR2TEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeMaxOutstandingR2TEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeMaxOutstandingR2T", "1.3.6.1.2.1.142.1.5.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeFirstBurstLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeFirstBurstLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeFirstBurstLength", "1.3.6.1.2.1.142.1.5.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeMaxBurstLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeMaxBurstLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeMaxBurstLength", "1.3.6.1.2.1.142.1.5.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeMaxConnectionsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeMaxConnectionsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeMaxConnections", "1.3.6.1.2.1.142.1.5.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeDataSequenceInOrderEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeDataSequenceInOrderEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeDataSequenceInOrder", "1.3.6.1.2.1.142.1.5.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeDataPDUInOrderEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeDataPDUInOrderEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeDataPDUInOrder", "1.3.6.1.2.1.142.1.5.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeDefaultTime2WaitEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeDefaultTime2WaitEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeDefaultTime2Wait", "1.3.6.1.2.1.142.1.5.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeDefaultTime2RetainEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeDefaultTime2RetainEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeDefaultTime2Retain", "1.3.6.1.2.1.142.1.5.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeErrorRecoveryLevelEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeErrorRecoveryLevelEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeErrorRecoveryLevel", "1.3.6.1.2.1.142.1.5.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeDiscontinuityTimeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeDiscontinuityTimeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeDiscontinuityTime", "1.3.6.1.2.1.142.1.5.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiNodeStorageTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiNodeStorageTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiNodeStorageType", "1.3.6.1.2.1.142.1.5.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiTargetEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Target Attributes Table*/
                public final IscsiTargetAttributesTableEnt iscsiTargetAttributesTable;

                /** Target Login Stats Table*/
                public final IscsiTargetLoginStatsTableEnt iscsiTargetLoginStatsTable;

                /** Target Logout Stats Table*/
                public final IscsiTargetLogoutStatsTableEnt iscsiTargetLogoutStatsTable;

                private IscsiTargetEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiTarget", "1.3.6.1.2.1.142.1.6", false, false, false, false);
                    this.iscsiTargetAttributesTable = new IscsiTargetAttributesTableEnt(mib, this);
                    this.iscsiTargetLoginStatsTable = new IscsiTargetLoginStatsTableEnt(mib, this);
                    this.iscsiTargetLogoutStatsTable = new IscsiTargetLogoutStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiTargetAttributesTable,
                        this.iscsiTargetLoginStatsTable,
                        this.iscsiTargetLogoutStatsTable
                    };
                }
                public static final class IscsiTargetAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiTargetAttributesEntryEnt iscsiTargetAttributesEntry;

                    private IscsiTargetAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetAttributesTable", "1.3.6.1.2.1.142.1.6.1", false, true, false, false);
                        this.iscsiTargetAttributesEntry = new IscsiTargetAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiTargetAttributesEntry
                        };
                    }
                    public static final class IscsiTargetAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiTgtLoginFailuresEnt iscsiTgtLoginFailures;

                        public final IscsiTgtLastFailureTimeEnt iscsiTgtLastFailureTime;

                        public final IscsiTgtLastFailureTypeEnt iscsiTgtLastFailureType;

                        public final IscsiTgtLastIntrFailureNameEnt iscsiTgtLastIntrFailureName;

                        public final IscsiTgtLastIntrFailureAddrTypeEnt iscsiTgtLastIntrFailureAddrType;

                        public final IscsiTgtLastIntrFailureAddrEnt iscsiTgtLastIntrFailureAddr;

                        private IscsiTargetAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiTargetAttributesEntry", "1.3.6.1.2.1.142.1.6.1.1", false, false, false, true);
                            this.iscsiTgtLoginFailures = new IscsiTgtLoginFailuresEnt(mib, this);
                            this.iscsiTgtLastFailureTime = new IscsiTgtLastFailureTimeEnt(mib, this);
                            this.iscsiTgtLastFailureType = new IscsiTgtLastFailureTypeEnt(mib, this);
                            this.iscsiTgtLastIntrFailureName = new IscsiTgtLastIntrFailureNameEnt(mib, this);
                            this.iscsiTgtLastIntrFailureAddrType = new IscsiTgtLastIntrFailureAddrTypeEnt(mib, this);
                            this.iscsiTgtLastIntrFailureAddr = new IscsiTgtLastIntrFailureAddrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiTgtLoginFailures,
                                this.iscsiTgtLastFailureTime,
                                this.iscsiTgtLastFailureType,
                                this.iscsiTgtLastIntrFailureName,
                                this.iscsiTgtLastIntrFailureAddrType,
                                this.iscsiTgtLastIntrFailureAddr
                            };
                        }
                        public static final class IscsiTgtLoginFailuresEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginFailuresEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginFailures", "1.3.6.1.2.1.142.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLastFailureTimeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLastFailureTimeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLastFailureTime", "1.3.6.1.2.1.142.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLastFailureTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLastFailureTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLastFailureType", "1.3.6.1.2.1.142.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLastIntrFailureNameEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLastIntrFailureNameEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLastIntrFailureName", "1.3.6.1.2.1.142.1.6.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLastIntrFailureAddrTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLastIntrFailureAddrTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLastIntrFailureAddrType", "1.3.6.1.2.1.142.1.6.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLastIntrFailureAddrEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLastIntrFailureAddrEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLastIntrFailureAddr", "1.3.6.1.2.1.142.1.6.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiTargetLoginStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiTargetLoginStatsEntryEnt iscsiTargetLoginStatsEntry;

                    private IscsiTargetLoginStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetLoginStatsTable", "1.3.6.1.2.1.142.1.6.2", false, true, false, false);
                        this.iscsiTargetLoginStatsEntry = new IscsiTargetLoginStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiTargetLoginStatsEntry
                        };
                    }
                    public static final class IscsiTargetLoginStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiTgtLoginAcceptsEnt iscsiTgtLoginAccepts;

                        public final IscsiTgtLoginOtherFailsEnt iscsiTgtLoginOtherFails;

                        public final IscsiTgtLoginRedirectsEnt iscsiTgtLoginRedirects;

                        public final IscsiTgtLoginAuthorizeFailsEnt iscsiTgtLoginAuthorizeFails;

                        public final IscsiTgtLoginAuthenticateFailsEnt iscsiTgtLoginAuthenticateFails;

                        public final IscsiTgtLoginNegotiateFailsEnt iscsiTgtLoginNegotiateFails;

                        private IscsiTargetLoginStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiTargetLoginStatsEntry", "1.3.6.1.2.1.142.1.6.2.1", false, false, false, true);
                            this.iscsiTgtLoginAccepts = new IscsiTgtLoginAcceptsEnt(mib, this);
                            this.iscsiTgtLoginOtherFails = new IscsiTgtLoginOtherFailsEnt(mib, this);
                            this.iscsiTgtLoginRedirects = new IscsiTgtLoginRedirectsEnt(mib, this);
                            this.iscsiTgtLoginAuthorizeFails = new IscsiTgtLoginAuthorizeFailsEnt(mib, this);
                            this.iscsiTgtLoginAuthenticateFails = new IscsiTgtLoginAuthenticateFailsEnt(mib, this);
                            this.iscsiTgtLoginNegotiateFails = new IscsiTgtLoginNegotiateFailsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiTgtLoginAccepts,
                                this.iscsiTgtLoginOtherFails,
                                this.iscsiTgtLoginRedirects,
                                this.iscsiTgtLoginAuthorizeFails,
                                this.iscsiTgtLoginAuthenticateFails,
                                this.iscsiTgtLoginNegotiateFails
                            };
                        }
                        public static final class IscsiTgtLoginAcceptsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginAcceptsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginAccepts", "1.3.6.1.2.1.142.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLoginOtherFailsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginOtherFailsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginOtherFails", "1.3.6.1.2.1.142.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLoginRedirectsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginRedirectsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginRedirects", "1.3.6.1.2.1.142.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLoginAuthorizeFailsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginAuthorizeFailsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginAuthorizeFails", "1.3.6.1.2.1.142.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLoginAuthenticateFailsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginAuthenticateFailsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginAuthenticateFails", "1.3.6.1.2.1.142.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLoginNegotiateFailsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLoginNegotiateFailsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLoginNegotiateFails", "1.3.6.1.2.1.142.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiTargetLogoutStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiTargetLogoutStatsEntryEnt iscsiTargetLogoutStatsEntry;

                    private IscsiTargetLogoutStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetLogoutStatsTable", "1.3.6.1.2.1.142.1.6.3", false, true, false, false);
                        this.iscsiTargetLogoutStatsEntry = new IscsiTargetLogoutStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiTargetLogoutStatsEntry
                        };
                    }
                    public static final class IscsiTargetLogoutStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiTgtLogoutNormalsEnt iscsiTgtLogoutNormals;

                        public final IscsiTgtLogoutOthersEnt iscsiTgtLogoutOthers;

                        private IscsiTargetLogoutStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiTargetLogoutStatsEntry", "1.3.6.1.2.1.142.1.6.3.1", false, false, false, true);
                            this.iscsiTgtLogoutNormals = new IscsiTgtLogoutNormalsEnt(mib, this);
                            this.iscsiTgtLogoutOthers = new IscsiTgtLogoutOthersEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiTgtLogoutNormals,
                                this.iscsiTgtLogoutOthers
                            };
                        }
                        public static final class IscsiTgtLogoutNormalsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLogoutNormalsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLogoutNormals", "1.3.6.1.2.1.142.1.6.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtLogoutOthersEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtLogoutOthersEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtLogoutOthers", "1.3.6.1.2.1.142.1.6.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiTgtAuthorizationEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Target Authorization Attributes Table*/
                public final IscsiTgtAuthAttributesTableEnt iscsiTgtAuthAttributesTable;

                private IscsiTgtAuthorizationEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiTgtAuthorization", "1.3.6.1.2.1.142.1.7", false, false, false, false);
                    this.iscsiTgtAuthAttributesTable = new IscsiTgtAuthAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiTgtAuthAttributesTable
                    };
                }
                public static final class IscsiTgtAuthAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiTgtAuthAttributesEntryEnt iscsiTgtAuthAttributesEntry;

                    private IscsiTgtAuthAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTgtAuthAttributesTable", "1.3.6.1.2.1.142.1.7.1", false, true, false, false);
                        this.iscsiTgtAuthAttributesEntry = new IscsiTgtAuthAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiTgtAuthAttributesEntry
                        };
                    }
                    public static final class IscsiTgtAuthAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiTgtAuthIndexEnt iscsiTgtAuthIndex;

                        public final IscsiTgtAuthRowStatusEnt iscsiTgtAuthRowStatus;

                        public final IscsiTgtAuthIdentityEnt iscsiTgtAuthIdentity;

                        public final IscsiTgtAuthStorageTypeEnt iscsiTgtAuthStorageType;

                        private IscsiTgtAuthAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiTgtAuthAttributesEntry", "1.3.6.1.2.1.142.1.7.1.1", false, false, false, true);
                            this.iscsiTgtAuthIndex = new IscsiTgtAuthIndexEnt(mib, this);
                            this.iscsiTgtAuthRowStatus = new IscsiTgtAuthRowStatusEnt(mib, this);
                            this.iscsiTgtAuthIdentity = new IscsiTgtAuthIdentityEnt(mib, this);
                            this.iscsiTgtAuthStorageType = new IscsiTgtAuthStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiTgtAuthIndex,
                                this.iscsiTgtAuthRowStatus,
                                this.iscsiTgtAuthIdentity,
                                this.iscsiTgtAuthStorageType
                            };
                        }
                        public static final class IscsiTgtAuthIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtAuthIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtAuthIndex", "1.3.6.1.2.1.142.1.7.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtAuthRowStatusEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtAuthRowStatusEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtAuthRowStatus", "1.3.6.1.2.1.142.1.7.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtAuthIdentityEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtAuthIdentityEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtAuthIdentity", "1.3.6.1.2.1.142.1.7.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiTgtAuthStorageTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiTgtAuthStorageTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiTgtAuthStorageType", "1.3.6.1.2.1.142.1.7.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiInitiatorEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Initiator Attributes Table*/
                public final IscsiInitiatorAttributesTableEnt iscsiInitiatorAttributesTable;

                /** Initiator Login Stats Table*/
                public final IscsiInitiatorLoginStatsTableEnt iscsiInitiatorLoginStatsTable;

                /** Initiator Logout Stats Table*/
                public final IscsiInitiatorLogoutStatsTableEnt iscsiInitiatorLogoutStatsTable;

                private IscsiInitiatorEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiInitiator", "1.3.6.1.2.1.142.1.8", false, false, false, false);
                    this.iscsiInitiatorAttributesTable = new IscsiInitiatorAttributesTableEnt(mib, this);
                    this.iscsiInitiatorLoginStatsTable = new IscsiInitiatorLoginStatsTableEnt(mib, this);
                    this.iscsiInitiatorLogoutStatsTable = new IscsiInitiatorLogoutStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiInitiatorAttributesTable,
                        this.iscsiInitiatorLoginStatsTable,
                        this.iscsiInitiatorLogoutStatsTable
                    };
                }
                public static final class IscsiInitiatorAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiInitiatorAttributesEntryEnt iscsiInitiatorAttributesEntry;

                    private IscsiInitiatorAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorAttributesTable", "1.3.6.1.2.1.142.1.8.1", false, true, false, false);
                        this.iscsiInitiatorAttributesEntry = new IscsiInitiatorAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiInitiatorAttributesEntry
                        };
                    }
                    public static final class IscsiInitiatorAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiIntrLoginFailuresEnt iscsiIntrLoginFailures;

                        public final IscsiIntrLastFailureTimeEnt iscsiIntrLastFailureTime;

                        public final IscsiIntrLastFailureTypeEnt iscsiIntrLastFailureType;

                        public final IscsiIntrLastTgtFailureNameEnt iscsiIntrLastTgtFailureName;

                        public final IscsiIntrLastTgtFailureAddrTypeEnt iscsiIntrLastTgtFailureAddrType;

                        public final IscsiIntrLastTgtFailureAddrEnt iscsiIntrLastTgtFailureAddr;

                        private IscsiInitiatorAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiInitiatorAttributesEntry", "1.3.6.1.2.1.142.1.8.1.1", false, false, false, true);
                            this.iscsiIntrLoginFailures = new IscsiIntrLoginFailuresEnt(mib, this);
                            this.iscsiIntrLastFailureTime = new IscsiIntrLastFailureTimeEnt(mib, this);
                            this.iscsiIntrLastFailureType = new IscsiIntrLastFailureTypeEnt(mib, this);
                            this.iscsiIntrLastTgtFailureName = new IscsiIntrLastTgtFailureNameEnt(mib, this);
                            this.iscsiIntrLastTgtFailureAddrType = new IscsiIntrLastTgtFailureAddrTypeEnt(mib, this);
                            this.iscsiIntrLastTgtFailureAddr = new IscsiIntrLastTgtFailureAddrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiIntrLoginFailures,
                                this.iscsiIntrLastFailureTime,
                                this.iscsiIntrLastFailureType,
                                this.iscsiIntrLastTgtFailureName,
                                this.iscsiIntrLastTgtFailureAddrType,
                                this.iscsiIntrLastTgtFailureAddr
                            };
                        }
                        public static final class IscsiIntrLoginFailuresEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginFailuresEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginFailures", "1.3.6.1.2.1.142.1.8.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLastFailureTimeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLastFailureTimeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLastFailureTime", "1.3.6.1.2.1.142.1.8.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLastFailureTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLastFailureTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLastFailureType", "1.3.6.1.2.1.142.1.8.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLastTgtFailureNameEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLastTgtFailureNameEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLastTgtFailureName", "1.3.6.1.2.1.142.1.8.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLastTgtFailureAddrTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLastTgtFailureAddrTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLastTgtFailureAddrType", "1.3.6.1.2.1.142.1.8.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLastTgtFailureAddrEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLastTgtFailureAddrEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLastTgtFailureAddr", "1.3.6.1.2.1.142.1.8.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiInitiatorLoginStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiInitiatorLoginStatsEntryEnt iscsiInitiatorLoginStatsEntry;

                    private IscsiInitiatorLoginStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorLoginStatsTable", "1.3.6.1.2.1.142.1.8.2", false, true, false, false);
                        this.iscsiInitiatorLoginStatsEntry = new IscsiInitiatorLoginStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiInitiatorLoginStatsEntry
                        };
                    }
                    public static final class IscsiInitiatorLoginStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiIntrLoginAcceptRspsEnt iscsiIntrLoginAcceptRsps;

                        public final IscsiIntrLoginOtherFailRspsEnt iscsiIntrLoginOtherFailRsps;

                        public final IscsiIntrLoginRedirectRspsEnt iscsiIntrLoginRedirectRsps;

                        public final IscsiIntrLoginAuthFailRspsEnt iscsiIntrLoginAuthFailRsps;

                        public final IscsiIntrLoginAuthenticateFailsEnt iscsiIntrLoginAuthenticateFails;

                        public final IscsiIntrLoginNegotiateFailsEnt iscsiIntrLoginNegotiateFails;

                        private IscsiInitiatorLoginStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiInitiatorLoginStatsEntry", "1.3.6.1.2.1.142.1.8.2.1", false, false, false, true);
                            this.iscsiIntrLoginAcceptRsps = new IscsiIntrLoginAcceptRspsEnt(mib, this);
                            this.iscsiIntrLoginOtherFailRsps = new IscsiIntrLoginOtherFailRspsEnt(mib, this);
                            this.iscsiIntrLoginRedirectRsps = new IscsiIntrLoginRedirectRspsEnt(mib, this);
                            this.iscsiIntrLoginAuthFailRsps = new IscsiIntrLoginAuthFailRspsEnt(mib, this);
                            this.iscsiIntrLoginAuthenticateFails = new IscsiIntrLoginAuthenticateFailsEnt(mib, this);
                            this.iscsiIntrLoginNegotiateFails = new IscsiIntrLoginNegotiateFailsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiIntrLoginAcceptRsps,
                                this.iscsiIntrLoginOtherFailRsps,
                                this.iscsiIntrLoginRedirectRsps,
                                this.iscsiIntrLoginAuthFailRsps,
                                this.iscsiIntrLoginAuthenticateFails,
                                this.iscsiIntrLoginNegotiateFails
                            };
                        }
                        public static final class IscsiIntrLoginAcceptRspsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginAcceptRspsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginAcceptRsps", "1.3.6.1.2.1.142.1.8.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLoginOtherFailRspsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginOtherFailRspsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginOtherFailRsps", "1.3.6.1.2.1.142.1.8.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLoginRedirectRspsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginRedirectRspsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginRedirectRsps", "1.3.6.1.2.1.142.1.8.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLoginAuthFailRspsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginAuthFailRspsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginAuthFailRsps", "1.3.6.1.2.1.142.1.8.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLoginAuthenticateFailsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginAuthenticateFailsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginAuthenticateFails", "1.3.6.1.2.1.142.1.8.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLoginNegotiateFailsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLoginNegotiateFailsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLoginNegotiateFails", "1.3.6.1.2.1.142.1.8.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiInitiatorLogoutStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiInitiatorLogoutStatsEntryEnt iscsiInitiatorLogoutStatsEntry;

                    private IscsiInitiatorLogoutStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorLogoutStatsTable", "1.3.6.1.2.1.142.1.8.3", false, true, false, false);
                        this.iscsiInitiatorLogoutStatsEntry = new IscsiInitiatorLogoutStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiInitiatorLogoutStatsEntry
                        };
                    }
                    public static final class IscsiInitiatorLogoutStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiIntrLogoutNormalsEnt iscsiIntrLogoutNormals;

                        public final IscsiIntrLogoutOthersEnt iscsiIntrLogoutOthers;

                        private IscsiInitiatorLogoutStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiInitiatorLogoutStatsEntry", "1.3.6.1.2.1.142.1.8.3.1", false, false, false, true);
                            this.iscsiIntrLogoutNormals = new IscsiIntrLogoutNormalsEnt(mib, this);
                            this.iscsiIntrLogoutOthers = new IscsiIntrLogoutOthersEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiIntrLogoutNormals,
                                this.iscsiIntrLogoutOthers
                            };
                        }
                        public static final class IscsiIntrLogoutNormalsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLogoutNormalsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLogoutNormals", "1.3.6.1.2.1.142.1.8.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrLogoutOthersEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrLogoutOthersEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrLogoutOthers", "1.3.6.1.2.1.142.1.8.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiIntrAuthorizationEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Initiator Authorization Attributes Table*/
                public final IscsiIntrAuthAttributesTableEnt iscsiIntrAuthAttributesTable;

                private IscsiIntrAuthorizationEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiIntrAuthorization", "1.3.6.1.2.1.142.1.9", false, false, false, false);
                    this.iscsiIntrAuthAttributesTable = new IscsiIntrAuthAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiIntrAuthAttributesTable
                    };
                }
                public static final class IscsiIntrAuthAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiIntrAuthAttributesEntryEnt iscsiIntrAuthAttributesEntry;

                    private IscsiIntrAuthAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiIntrAuthAttributesTable", "1.3.6.1.2.1.142.1.9.1", false, true, false, false);
                        this.iscsiIntrAuthAttributesEntry = new IscsiIntrAuthAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiIntrAuthAttributesEntry
                        };
                    }
                    public static final class IscsiIntrAuthAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiIntrAuthIndexEnt iscsiIntrAuthIndex;

                        public final IscsiIntrAuthRowStatusEnt iscsiIntrAuthRowStatus;

                        public final IscsiIntrAuthIdentityEnt iscsiIntrAuthIdentity;

                        public final IscsiIntrAuthStorageTypeEnt iscsiIntrAuthStorageType;

                        private IscsiIntrAuthAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiIntrAuthAttributesEntry", "1.3.6.1.2.1.142.1.9.1.1", false, false, false, true);
                            this.iscsiIntrAuthIndex = new IscsiIntrAuthIndexEnt(mib, this);
                            this.iscsiIntrAuthRowStatus = new IscsiIntrAuthRowStatusEnt(mib, this);
                            this.iscsiIntrAuthIdentity = new IscsiIntrAuthIdentityEnt(mib, this);
                            this.iscsiIntrAuthStorageType = new IscsiIntrAuthStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiIntrAuthIndex,
                                this.iscsiIntrAuthRowStatus,
                                this.iscsiIntrAuthIdentity,
                                this.iscsiIntrAuthStorageType
                            };
                        }
                        public static final class IscsiIntrAuthIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrAuthIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrAuthIndex", "1.3.6.1.2.1.142.1.9.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrAuthRowStatusEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrAuthRowStatusEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrAuthRowStatus", "1.3.6.1.2.1.142.1.9.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrAuthIdentityEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrAuthIdentityEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrAuthIdentity", "1.3.6.1.2.1.142.1.9.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiIntrAuthStorageTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiIntrAuthStorageTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiIntrAuthStorageType", "1.3.6.1.2.1.142.1.9.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiSessionEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Session Attributes Table*/
                public final IscsiSessionAttributesTableEnt iscsiSessionAttributesTable;

                /** Session Stats Table*/
                public final IscsiSessionStatsTableEnt iscsiSessionStatsTable;

                /** Session Connection Error Stats Table*/
                public final IscsiSessionCxnErrorStatsTableEnt iscsiSessionCxnErrorStatsTable;

                private IscsiSessionEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiSession", "1.3.6.1.2.1.142.1.10", false, false, false, false);
                    this.iscsiSessionAttributesTable = new IscsiSessionAttributesTableEnt(mib, this);
                    this.iscsiSessionStatsTable = new IscsiSessionStatsTableEnt(mib, this);
                    this.iscsiSessionCxnErrorStatsTable = new IscsiSessionCxnErrorStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiSessionAttributesTable,
                        this.iscsiSessionStatsTable,
                        this.iscsiSessionCxnErrorStatsTable
                    };
                }
                public static final class IscsiSessionAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiSessionAttributesEntryEnt iscsiSessionAttributesEntry;

                    private IscsiSessionAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionAttributesTable", "1.3.6.1.2.1.142.1.10.1", false, true, false, false);
                        this.iscsiSessionAttributesEntry = new IscsiSessionAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiSessionAttributesEntry
                        };
                    }
                    public static final class IscsiSessionAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiSsnNodeIndexEnt iscsiSsnNodeIndex;

                        public final IscsiSsnIndexEnt iscsiSsnIndex;

                        public final IscsiSsnDirectionEnt iscsiSsnDirection;

                        public final IscsiSsnInitiatorNameEnt iscsiSsnInitiatorName;

                        public final IscsiSsnTargetNameEnt iscsiSsnTargetName;

                        public final IscsiSsnTSIHEnt iscsiSsnTSIH;

                        public final IscsiSsnISIDEnt iscsiSsnISID;

                        public final IscsiSsnInitiatorAliasEnt iscsiSsnInitiatorAlias;

                        public final IscsiSsnTargetAliasEnt iscsiSsnTargetAlias;

                        public final IscsiSsnInitialR2TEnt iscsiSsnInitialR2T;

                        public final IscsiSsnImmediateDataEnt iscsiSsnImmediateData;

                        public final IscsiSsnTypeEnt iscsiSsnType;

                        public final IscsiSsnMaxOutstandingR2TEnt iscsiSsnMaxOutstandingR2T;

                        public final IscsiSsnFirstBurstLengthEnt iscsiSsnFirstBurstLength;

                        public final IscsiSsnMaxBurstLengthEnt iscsiSsnMaxBurstLength;

                        public final IscsiSsnConnectionNumberEnt iscsiSsnConnectionNumber;

                        public final IscsiSsnAuthIdentityEnt iscsiSsnAuthIdentity;

                        public final IscsiSsnDataSequenceInOrderEnt iscsiSsnDataSequenceInOrder;

                        public final IscsiSsnDataPDUInOrderEnt iscsiSsnDataPDUInOrder;

                        public final IscsiSsnErrorRecoveryLevelEnt iscsiSsnErrorRecoveryLevel;

                        public final IscsiSsnDiscontinuityTimeEnt iscsiSsnDiscontinuityTime;

                        private IscsiSessionAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiSessionAttributesEntry", "1.3.6.1.2.1.142.1.10.1.1", false, false, false, true);
                            this.iscsiSsnNodeIndex = new IscsiSsnNodeIndexEnt(mib, this);
                            this.iscsiSsnIndex = new IscsiSsnIndexEnt(mib, this);
                            this.iscsiSsnDirection = new IscsiSsnDirectionEnt(mib, this);
                            this.iscsiSsnInitiatorName = new IscsiSsnInitiatorNameEnt(mib, this);
                            this.iscsiSsnTargetName = new IscsiSsnTargetNameEnt(mib, this);
                            this.iscsiSsnTSIH = new IscsiSsnTSIHEnt(mib, this);
                            this.iscsiSsnISID = new IscsiSsnISIDEnt(mib, this);
                            this.iscsiSsnInitiatorAlias = new IscsiSsnInitiatorAliasEnt(mib, this);
                            this.iscsiSsnTargetAlias = new IscsiSsnTargetAliasEnt(mib, this);
                            this.iscsiSsnInitialR2T = new IscsiSsnInitialR2TEnt(mib, this);
                            this.iscsiSsnImmediateData = new IscsiSsnImmediateDataEnt(mib, this);
                            this.iscsiSsnType = new IscsiSsnTypeEnt(mib, this);
                            this.iscsiSsnMaxOutstandingR2T = new IscsiSsnMaxOutstandingR2TEnt(mib, this);
                            this.iscsiSsnFirstBurstLength = new IscsiSsnFirstBurstLengthEnt(mib, this);
                            this.iscsiSsnMaxBurstLength = new IscsiSsnMaxBurstLengthEnt(mib, this);
                            this.iscsiSsnConnectionNumber = new IscsiSsnConnectionNumberEnt(mib, this);
                            this.iscsiSsnAuthIdentity = new IscsiSsnAuthIdentityEnt(mib, this);
                            this.iscsiSsnDataSequenceInOrder = new IscsiSsnDataSequenceInOrderEnt(mib, this);
                            this.iscsiSsnDataPDUInOrder = new IscsiSsnDataPDUInOrderEnt(mib, this);
                            this.iscsiSsnErrorRecoveryLevel = new IscsiSsnErrorRecoveryLevelEnt(mib, this);
                            this.iscsiSsnDiscontinuityTime = new IscsiSsnDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiSsnNodeIndex,
                                this.iscsiSsnIndex,
                                this.iscsiSsnDirection,
                                this.iscsiSsnInitiatorName,
                                this.iscsiSsnTargetName,
                                this.iscsiSsnTSIH,
                                this.iscsiSsnISID,
                                this.iscsiSsnInitiatorAlias,
                                this.iscsiSsnTargetAlias,
                                this.iscsiSsnInitialR2T,
                                this.iscsiSsnImmediateData,
                                this.iscsiSsnType,
                                this.iscsiSsnMaxOutstandingR2T,
                                this.iscsiSsnFirstBurstLength,
                                this.iscsiSsnMaxBurstLength,
                                this.iscsiSsnConnectionNumber,
                                this.iscsiSsnAuthIdentity,
                                this.iscsiSsnDataSequenceInOrder,
                                this.iscsiSsnDataPDUInOrder,
                                this.iscsiSsnErrorRecoveryLevel,
                                this.iscsiSsnDiscontinuityTime
                            };
                        }
                        public static final class IscsiSsnNodeIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnNodeIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnNodeIndex", "1.3.6.1.2.1.142.1.10.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnIndex", "1.3.6.1.2.1.142.1.10.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnDirectionEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnDirectionEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnDirection", "1.3.6.1.2.1.142.1.10.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnInitiatorNameEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnInitiatorNameEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnInitiatorName", "1.3.6.1.2.1.142.1.10.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnTargetNameEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnTargetNameEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnTargetName", "1.3.6.1.2.1.142.1.10.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnTSIHEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnTSIHEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnTSIH", "1.3.6.1.2.1.142.1.10.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnISIDEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnISIDEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnISID", "1.3.6.1.2.1.142.1.10.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnInitiatorAliasEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnInitiatorAliasEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnInitiatorAlias", "1.3.6.1.2.1.142.1.10.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnTargetAliasEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnTargetAliasEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnTargetAlias", "1.3.6.1.2.1.142.1.10.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnInitialR2TEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnInitialR2TEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnInitialR2T", "1.3.6.1.2.1.142.1.10.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnImmediateDataEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnImmediateDataEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnImmediateData", "1.3.6.1.2.1.142.1.10.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnType", "1.3.6.1.2.1.142.1.10.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnMaxOutstandingR2TEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnMaxOutstandingR2TEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnMaxOutstandingR2T", "1.3.6.1.2.1.142.1.10.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnFirstBurstLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnFirstBurstLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnFirstBurstLength", "1.3.6.1.2.1.142.1.10.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnMaxBurstLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnMaxBurstLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnMaxBurstLength", "1.3.6.1.2.1.142.1.10.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnConnectionNumberEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnConnectionNumberEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnConnectionNumber", "1.3.6.1.2.1.142.1.10.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnAuthIdentityEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnAuthIdentityEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnAuthIdentity", "1.3.6.1.2.1.142.1.10.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnDataSequenceInOrderEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnDataSequenceInOrderEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnDataSequenceInOrder", "1.3.6.1.2.1.142.1.10.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnDataPDUInOrderEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnDataPDUInOrderEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnDataPDUInOrder", "1.3.6.1.2.1.142.1.10.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnErrorRecoveryLevelEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnErrorRecoveryLevelEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnErrorRecoveryLevel", "1.3.6.1.2.1.142.1.10.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnDiscontinuityTimeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnDiscontinuityTimeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnDiscontinuityTime", "1.3.6.1.2.1.142.1.10.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiSessionStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiSessionStatsEntryEnt iscsiSessionStatsEntry;

                    private IscsiSessionStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionStatsTable", "1.3.6.1.2.1.142.1.10.2", false, true, false, false);
                        this.iscsiSessionStatsEntry = new IscsiSessionStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiSessionStatsEntry
                        };
                    }
                    public static final class IscsiSessionStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiSsnCmdPDUsEnt iscsiSsnCmdPDUs;

                        public final IscsiSsnRspPDUsEnt iscsiSsnRspPDUs;

                        public final IscsiSsnTxDataOctetsEnt iscsiSsnTxDataOctets;

                        public final IscsiSsnRxDataOctetsEnt iscsiSsnRxDataOctets;

                        public final IscsiSsnLCTxDataOctetsEnt iscsiSsnLCTxDataOctets;

                        public final IscsiSsnLCRxDataOctetsEnt iscsiSsnLCRxDataOctets;

                        private IscsiSessionStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiSessionStatsEntry", "1.3.6.1.2.1.142.1.10.2.1", false, false, false, true);
                            this.iscsiSsnCmdPDUs = new IscsiSsnCmdPDUsEnt(mib, this);
                            this.iscsiSsnRspPDUs = new IscsiSsnRspPDUsEnt(mib, this);
                            this.iscsiSsnTxDataOctets = new IscsiSsnTxDataOctetsEnt(mib, this);
                            this.iscsiSsnRxDataOctets = new IscsiSsnRxDataOctetsEnt(mib, this);
                            this.iscsiSsnLCTxDataOctets = new IscsiSsnLCTxDataOctetsEnt(mib, this);
                            this.iscsiSsnLCRxDataOctets = new IscsiSsnLCRxDataOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiSsnCmdPDUs,
                                this.iscsiSsnRspPDUs,
                                this.iscsiSsnTxDataOctets,
                                this.iscsiSsnRxDataOctets,
                                this.iscsiSsnLCTxDataOctets,
                                this.iscsiSsnLCRxDataOctets
                            };
                        }
                        public static final class IscsiSsnCmdPDUsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnCmdPDUsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnCmdPDUs", "1.3.6.1.2.1.142.1.10.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnRspPDUsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnRspPDUsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnRspPDUs", "1.3.6.1.2.1.142.1.10.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnTxDataOctetsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnTxDataOctetsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnTxDataOctets", "1.3.6.1.2.1.142.1.10.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnRxDataOctetsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnRxDataOctetsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnRxDataOctets", "1.3.6.1.2.1.142.1.10.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnLCTxDataOctetsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnLCTxDataOctetsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnLCTxDataOctets", "1.3.6.1.2.1.142.1.10.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnLCRxDataOctetsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnLCRxDataOctetsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnLCRxDataOctets", "1.3.6.1.2.1.142.1.10.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IscsiSessionCxnErrorStatsTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiSessionCxnErrorStatsEntryEnt iscsiSessionCxnErrorStatsEntry;

                    private IscsiSessionCxnErrorStatsTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionCxnErrorStatsTable", "1.3.6.1.2.1.142.1.10.3", false, true, false, false);
                        this.iscsiSessionCxnErrorStatsEntry = new IscsiSessionCxnErrorStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiSessionCxnErrorStatsEntry
                        };
                    }
                    public static final class IscsiSessionCxnErrorStatsEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiSsnCxnDigestErrorsEnt iscsiSsnCxnDigestErrors;

                        public final IscsiSsnCxnTimeoutErrorsEnt iscsiSsnCxnTimeoutErrors;

                        private IscsiSessionCxnErrorStatsEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiSessionCxnErrorStatsEntry", "1.3.6.1.2.1.142.1.10.3.1", false, false, false, true);
                            this.iscsiSsnCxnDigestErrors = new IscsiSsnCxnDigestErrorsEnt(mib, this);
                            this.iscsiSsnCxnTimeoutErrors = new IscsiSsnCxnTimeoutErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiSsnCxnDigestErrors,
                                this.iscsiSsnCxnTimeoutErrors
                            };
                        }
                        public static final class IscsiSsnCxnDigestErrorsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnCxnDigestErrorsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnCxnDigestErrors", "1.3.6.1.2.1.142.1.10.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiSsnCxnTimeoutErrorsEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiSsnCxnTimeoutErrorsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiSsnCxnTimeoutErrors", "1.3.6.1.2.1.142.1.10.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IscsiConnectionEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** Connection Attributes Table*/
                public final IscsiConnectionAttributesTableEnt iscsiConnectionAttributesTable;

                private IscsiConnectionEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiConnection", "1.3.6.1.2.1.142.1.11", false, false, false, false);
                    this.iscsiConnectionAttributesTable = new IscsiConnectionAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiConnectionAttributesTable
                    };
                }
                public static final class IscsiConnectionAttributesTableEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiConnectionAttributesEntryEnt iscsiConnectionAttributesEntry;

                    private IscsiConnectionAttributesTableEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiConnectionAttributesTable", "1.3.6.1.2.1.142.1.11.1", false, true, false, false);
                        this.iscsiConnectionAttributesEntry = new IscsiConnectionAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiConnectionAttributesEntry
                        };
                    }
                    public static final class IscsiConnectionAttributesEntryEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        public final IscsiCxnIndexEnt iscsiCxnIndex;

                        public final IscsiCxnCidEnt iscsiCxnCid;

                        public final IscsiCxnStateEnt iscsiCxnState;

                        public final IscsiCxnAddrTypeEnt iscsiCxnAddrType;

                        public final IscsiCxnLocalAddrEnt iscsiCxnLocalAddr;

                        public final IscsiCxnProtocolEnt iscsiCxnProtocol;

                        public final IscsiCxnLocalPortEnt iscsiCxnLocalPort;

                        public final IscsiCxnRemoteAddrEnt iscsiCxnRemoteAddr;

                        public final IscsiCxnRemotePortEnt iscsiCxnRemotePort;

                        public final IscsiCxnMaxRecvDataSegLengthEnt iscsiCxnMaxRecvDataSegLength;

                        public final IscsiCxnMaxXmitDataSegLengthEnt iscsiCxnMaxXmitDataSegLength;

                        public final IscsiCxnHeaderIntegrityEnt iscsiCxnHeaderIntegrity;

                        public final IscsiCxnDataIntegrityEnt iscsiCxnDataIntegrity;

                        public final IscsiCxnRecvMarkerEnt iscsiCxnRecvMarker;

                        public final IscsiCxnSendMarkerEnt iscsiCxnSendMarker;

                        public final IscsiCxnVersionActiveEnt iscsiCxnVersionActive;

                        private IscsiConnectionAttributesEntryEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiConnectionAttributesEntry", "1.3.6.1.2.1.142.1.11.1.1", false, false, false, true);
                            this.iscsiCxnIndex = new IscsiCxnIndexEnt(mib, this);
                            this.iscsiCxnCid = new IscsiCxnCidEnt(mib, this);
                            this.iscsiCxnState = new IscsiCxnStateEnt(mib, this);
                            this.iscsiCxnAddrType = new IscsiCxnAddrTypeEnt(mib, this);
                            this.iscsiCxnLocalAddr = new IscsiCxnLocalAddrEnt(mib, this);
                            this.iscsiCxnProtocol = new IscsiCxnProtocolEnt(mib, this);
                            this.iscsiCxnLocalPort = new IscsiCxnLocalPortEnt(mib, this);
                            this.iscsiCxnRemoteAddr = new IscsiCxnRemoteAddrEnt(mib, this);
                            this.iscsiCxnRemotePort = new IscsiCxnRemotePortEnt(mib, this);
                            this.iscsiCxnMaxRecvDataSegLength = new IscsiCxnMaxRecvDataSegLengthEnt(mib, this);
                            this.iscsiCxnMaxXmitDataSegLength = new IscsiCxnMaxXmitDataSegLengthEnt(mib, this);
                            this.iscsiCxnHeaderIntegrity = new IscsiCxnHeaderIntegrityEnt(mib, this);
                            this.iscsiCxnDataIntegrity = new IscsiCxnDataIntegrityEnt(mib, this);
                            this.iscsiCxnRecvMarker = new IscsiCxnRecvMarkerEnt(mib, this);
                            this.iscsiCxnSendMarker = new IscsiCxnSendMarkerEnt(mib, this);
                            this.iscsiCxnVersionActive = new IscsiCxnVersionActiveEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.iscsiCxnIndex,
                                this.iscsiCxnCid,
                                this.iscsiCxnState,
                                this.iscsiCxnAddrType,
                                this.iscsiCxnLocalAddr,
                                this.iscsiCxnProtocol,
                                this.iscsiCxnLocalPort,
                                this.iscsiCxnRemoteAddr,
                                this.iscsiCxnRemotePort,
                                this.iscsiCxnMaxRecvDataSegLength,
                                this.iscsiCxnMaxXmitDataSegLength,
                                this.iscsiCxnHeaderIntegrity,
                                this.iscsiCxnDataIntegrity,
                                this.iscsiCxnRecvMarker,
                                this.iscsiCxnSendMarker,
                                this.iscsiCxnVersionActive
                            };
                        }
                        public static final class IscsiCxnIndexEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnIndexEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnIndex", "1.3.6.1.2.1.142.1.11.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnCidEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnCidEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnCid", "1.3.6.1.2.1.142.1.11.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnStateEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnStateEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnState", "1.3.6.1.2.1.142.1.11.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnAddrTypeEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnAddrTypeEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnAddrType", "1.3.6.1.2.1.142.1.11.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnLocalAddrEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnLocalAddrEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnLocalAddr", "1.3.6.1.2.1.142.1.11.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnProtocolEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnProtocolEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnProtocol", "1.3.6.1.2.1.142.1.11.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnLocalPortEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnLocalPortEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnLocalPort", "1.3.6.1.2.1.142.1.11.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnRemoteAddrEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnRemoteAddrEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnRemoteAddr", "1.3.6.1.2.1.142.1.11.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnRemotePortEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnRemotePortEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnRemotePort", "1.3.6.1.2.1.142.1.11.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnMaxRecvDataSegLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnMaxRecvDataSegLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnMaxRecvDataSegLength", "1.3.6.1.2.1.142.1.11.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnMaxXmitDataSegLengthEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnMaxXmitDataSegLengthEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnMaxXmitDataSegLength", "1.3.6.1.2.1.142.1.11.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnHeaderIntegrityEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnHeaderIntegrityEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnHeaderIntegrity", "1.3.6.1.2.1.142.1.11.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnDataIntegrityEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnDataIntegrityEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnDataIntegrity", "1.3.6.1.2.1.142.1.11.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnRecvMarkerEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnRecvMarkerEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnRecvMarker", "1.3.6.1.2.1.142.1.11.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnSendMarkerEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnSendMarkerEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnSendMarker", "1.3.6.1.2.1.142.1.11.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IscsiCxnVersionActiveEnt extends MIBEntry<ISCSIMIBDef>
                        {
                            private IscsiCxnVersionActiveEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                            {
                                super(mib, parent, "iscsiCxnVersionActive", "1.3.6.1.2.1.142.1.11.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class IscsiConformanceEnt extends MIBEntry<ISCSIMIBDef>
        {
            /** **********************************************************************
Conformance Statements*/
            public final IscsiCompliancesEnt iscsiCompliances;

            public final IscsiGroupsEnt iscsiGroups;

            private IscsiConformanceEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
            {
                super(mib, parent, "iscsiConformance", "1.3.6.1.2.1.142.2", false, false, false, false);
                this.iscsiCompliances = new IscsiCompliancesEnt(mib, this);
                this.iscsiGroups = new IscsiGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.iscsiCompliances,
                    this.iscsiGroups
                };
            }
            public static final class IscsiCompliancesEnt extends MIBEntry<ISCSIMIBDef>
            {
                /** ***********************************************************************/
                public final IscsiComplianceV1Ent iscsiComplianceV1;

                private IscsiCompliancesEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiCompliances", "1.3.6.1.2.1.142.2.1", false, false, false, false);
                    this.iscsiComplianceV1 = new IscsiComplianceV1Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiComplianceV1
                    };
                }
                public static final class IscsiComplianceV1Ent extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiComplianceV1Ent(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiComplianceV1", "1.3.6.1.2.1.142.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IscsiGroupsEnt extends MIBEntry<ISCSIMIBDef>
            {
                public final IscsiInstanceAttributesGroupEnt iscsiInstanceAttributesGroup;

                public final IscsiInstanceSsnErrorStatsGroupEnt iscsiInstanceSsnErrorStatsGroup;

                public final IscsiPortalAttributesGroupEnt iscsiPortalAttributesGroup;

                public final IscsiTgtPortalAttributesGroupEnt iscsiTgtPortalAttributesGroup;

                public final IscsiIntrPortalAttributesGroupEnt iscsiIntrPortalAttributesGroup;

                public final IscsiNodeAttributesGroupEnt iscsiNodeAttributesGroup;

                public final IscsiTargetAttributesGroupEnt iscsiTargetAttributesGroup;

                public final IscsiTargetLoginStatsGroupEnt iscsiTargetLoginStatsGroup;

                public final IscsiTargetLogoutStatsGroupEnt iscsiTargetLogoutStatsGroup;

                public final IscsiTargetAuthGroupEnt iscsiTargetAuthGroup;

                public final IscsiInitiatorAttributesGroupEnt iscsiInitiatorAttributesGroup;

                public final IscsiInitiatorLoginStatsGroupEnt iscsiInitiatorLoginStatsGroup;

                public final IscsiInitiatorLogoutStatsGroupEnt iscsiInitiatorLogoutStatsGroup;

                public final IscsiInitiatorAuthGroupEnt iscsiInitiatorAuthGroup;

                public final IscsiSessionAttributesGroupEnt iscsiSessionAttributesGroup;

                public final IscsiSessionPDUStatsGroupEnt iscsiSessionPDUStatsGroup;

                public final IscsiSessionOctetStatsGroupEnt iscsiSessionOctetStatsGroup;

                public final IscsiSessionLCOctetStatsGroupEnt iscsiSessionLCOctetStatsGroup;

                public final IscsiSessionCxnErrorStatsGroupEnt iscsiSessionCxnErrorStatsGroup;

                public final IscsiConnectionAttributesGroupEnt iscsiConnectionAttributesGroup;

                public final IscsiTgtLgnNotificationsGroupEnt iscsiTgtLgnNotificationsGroup;

                public final IscsiIntrLgnNotificationsGroupEnt iscsiIntrLgnNotificationsGroup;

                public final IscsiSsnFlrNotificationsGroupEnt iscsiSsnFlrNotificationsGroup;

                private IscsiGroupsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiGroups", "1.3.6.1.2.1.142.2.2", false, false, false, false);
                    this.iscsiInstanceAttributesGroup = new IscsiInstanceAttributesGroupEnt(mib, this);
                    this.iscsiInstanceSsnErrorStatsGroup = new IscsiInstanceSsnErrorStatsGroupEnt(mib, this);
                    this.iscsiPortalAttributesGroup = new IscsiPortalAttributesGroupEnt(mib, this);
                    this.iscsiTgtPortalAttributesGroup = new IscsiTgtPortalAttributesGroupEnt(mib, this);
                    this.iscsiIntrPortalAttributesGroup = new IscsiIntrPortalAttributesGroupEnt(mib, this);
                    this.iscsiNodeAttributesGroup = new IscsiNodeAttributesGroupEnt(mib, this);
                    this.iscsiTargetAttributesGroup = new IscsiTargetAttributesGroupEnt(mib, this);
                    this.iscsiTargetLoginStatsGroup = new IscsiTargetLoginStatsGroupEnt(mib, this);
                    this.iscsiTargetLogoutStatsGroup = new IscsiTargetLogoutStatsGroupEnt(mib, this);
                    this.iscsiTargetAuthGroup = new IscsiTargetAuthGroupEnt(mib, this);
                    this.iscsiInitiatorAttributesGroup = new IscsiInitiatorAttributesGroupEnt(mib, this);
                    this.iscsiInitiatorLoginStatsGroup = new IscsiInitiatorLoginStatsGroupEnt(mib, this);
                    this.iscsiInitiatorLogoutStatsGroup = new IscsiInitiatorLogoutStatsGroupEnt(mib, this);
                    this.iscsiInitiatorAuthGroup = new IscsiInitiatorAuthGroupEnt(mib, this);
                    this.iscsiSessionAttributesGroup = new IscsiSessionAttributesGroupEnt(mib, this);
                    this.iscsiSessionPDUStatsGroup = new IscsiSessionPDUStatsGroupEnt(mib, this);
                    this.iscsiSessionOctetStatsGroup = new IscsiSessionOctetStatsGroupEnt(mib, this);
                    this.iscsiSessionLCOctetStatsGroup = new IscsiSessionLCOctetStatsGroupEnt(mib, this);
                    this.iscsiSessionCxnErrorStatsGroup = new IscsiSessionCxnErrorStatsGroupEnt(mib, this);
                    this.iscsiConnectionAttributesGroup = new IscsiConnectionAttributesGroupEnt(mib, this);
                    this.iscsiTgtLgnNotificationsGroup = new IscsiTgtLgnNotificationsGroupEnt(mib, this);
                    this.iscsiIntrLgnNotificationsGroup = new IscsiIntrLgnNotificationsGroupEnt(mib, this);
                    this.iscsiSsnFlrNotificationsGroup = new IscsiSsnFlrNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiInstanceAttributesGroup,
                        this.iscsiInstanceSsnErrorStatsGroup,
                        this.iscsiPortalAttributesGroup,
                        this.iscsiTgtPortalAttributesGroup,
                        this.iscsiIntrPortalAttributesGroup,
                        this.iscsiNodeAttributesGroup,
                        this.iscsiTargetAttributesGroup,
                        this.iscsiTargetLoginStatsGroup,
                        this.iscsiTargetLogoutStatsGroup,
                        this.iscsiTargetAuthGroup,
                        this.iscsiInitiatorAttributesGroup,
                        this.iscsiInitiatorLoginStatsGroup,
                        this.iscsiInitiatorLogoutStatsGroup,
                        this.iscsiInitiatorAuthGroup,
                        this.iscsiSessionAttributesGroup,
                        this.iscsiSessionPDUStatsGroup,
                        this.iscsiSessionOctetStatsGroup,
                        this.iscsiSessionLCOctetStatsGroup,
                        this.iscsiSessionCxnErrorStatsGroup,
                        this.iscsiConnectionAttributesGroup,
                        this.iscsiTgtLgnNotificationsGroup,
                        this.iscsiIntrLgnNotificationsGroup,
                        this.iscsiSsnFlrNotificationsGroup
                    };
                }
                public static final class IscsiInstanceAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiInstanceAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInstanceAttributesGroup", "1.3.6.1.2.1.142.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiInstanceSsnErrorStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiInstanceSsnErrorStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInstanceSsnErrorStatsGroup", "1.3.6.1.2.1.142.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiPortalAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiPortalAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiPortalAttributesGroup", "1.3.6.1.2.1.142.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiTgtPortalAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiTgtPortalAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTgtPortalAttributesGroup", "1.3.6.1.2.1.142.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiIntrPortalAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiIntrPortalAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiIntrPortalAttributesGroup", "1.3.6.1.2.1.142.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiNodeAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiNodeAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiNodeAttributesGroup", "1.3.6.1.2.1.142.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiTargetAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiTargetAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetAttributesGroup", "1.3.6.1.2.1.142.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiTargetLoginStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiTargetLoginStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetLoginStatsGroup", "1.3.6.1.2.1.142.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiTargetLogoutStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiTargetLogoutStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetLogoutStatsGroup", "1.3.6.1.2.1.142.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiTargetAuthGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiTargetAuthGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTargetAuthGroup", "1.3.6.1.2.1.142.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiInitiatorAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiInitiatorAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorAttributesGroup", "1.3.6.1.2.1.142.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiInitiatorLoginStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiInitiatorLoginStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorLoginStatsGroup", "1.3.6.1.2.1.142.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiInitiatorLogoutStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiInitiatorLogoutStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorLogoutStatsGroup", "1.3.6.1.2.1.142.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiInitiatorAuthGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiInitiatorAuthGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiInitiatorAuthGroup", "1.3.6.1.2.1.142.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiSessionAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiSessionAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionAttributesGroup", "1.3.6.1.2.1.142.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiSessionPDUStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiSessionPDUStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionPDUStatsGroup", "1.3.6.1.2.1.142.2.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiSessionOctetStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiSessionOctetStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionOctetStatsGroup", "1.3.6.1.2.1.142.2.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiSessionLCOctetStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiSessionLCOctetStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionLCOctetStatsGroup", "1.3.6.1.2.1.142.2.2.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiSessionCxnErrorStatsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiSessionCxnErrorStatsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSessionCxnErrorStatsGroup", "1.3.6.1.2.1.142.2.2.19", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiConnectionAttributesGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiConnectionAttributesGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiConnectionAttributesGroup", "1.3.6.1.2.1.142.2.2.20", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiTgtLgnNotificationsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiTgtLgnNotificationsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiTgtLgnNotificationsGroup", "1.3.6.1.2.1.142.2.2.21", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiIntrLgnNotificationsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiIntrLgnNotificationsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiIntrLgnNotificationsGroup", "1.3.6.1.2.1.142.2.2.22", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IscsiSsnFlrNotificationsGroupEnt extends MIBEntry<ISCSIMIBDef>
                {
                    private IscsiSsnFlrNotificationsGroupEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiSsnFlrNotificationsGroup", "1.3.6.1.2.1.142.2.2.23", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IscsiAdminEnt extends MIBEntry<ISCSIMIBDef>
        {
            /** ***********************************************************************/
            public final IscsiDescriptorsEnt iscsiDescriptors;

            private IscsiAdminEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
            {
                super(mib, parent, "iscsiAdmin", "1.3.6.1.2.1.142.3", false, false, false, false);
                this.iscsiDescriptors = new IscsiDescriptorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.iscsiDescriptors
                };
            }
            public static final class IscsiDescriptorsEnt extends MIBEntry<ISCSIMIBDef>
            {
                public final IscsiHeaderIntegrityTypesEnt iscsiHeaderIntegrityTypes;

                public final IscsiDataIntegrityTypesEnt iscsiDataIntegrityTypes;

                private IscsiDescriptorsEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                {
                    super(mib, parent, "iscsiDescriptors", "1.3.6.1.2.1.142.3.1", false, false, false, false);
                    this.iscsiHeaderIntegrityTypes = new IscsiHeaderIntegrityTypesEnt(mib, this);
                    this.iscsiDataIntegrityTypes = new IscsiDataIntegrityTypesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.iscsiHeaderIntegrityTypes,
                        this.iscsiDataIntegrityTypes
                    };
                }
                public static final class IscsiHeaderIntegrityTypesEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiHdrIntegrityNoneEnt iscsiHdrIntegrityNone;

                    public final IscsiHdrIntegrityCrc32cEnt iscsiHdrIntegrityCrc32c;

                    private IscsiHeaderIntegrityTypesEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiHeaderIntegrityTypes", "1.3.6.1.2.1.142.3.1.1", false, false, false, false);
                        this.iscsiHdrIntegrityNone = new IscsiHdrIntegrityNoneEnt(mib, this);
                        this.iscsiHdrIntegrityCrc32c = new IscsiHdrIntegrityCrc32cEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiHdrIntegrityNone,
                            this.iscsiHdrIntegrityCrc32c
                        };
                    }
                    public static final class IscsiHdrIntegrityNoneEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        private IscsiHdrIntegrityNoneEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiHdrIntegrityNone", "1.3.6.1.2.1.142.3.1.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IscsiHdrIntegrityCrc32cEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        private IscsiHdrIntegrityCrc32cEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiHdrIntegrityCrc32c", "1.3.6.1.2.1.142.3.1.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class IscsiDataIntegrityTypesEnt extends MIBEntry<ISCSIMIBDef>
                {
                    public final IscsiDataIntegrityNoneEnt iscsiDataIntegrityNone;

                    public final IscsiDataIntegrityCrc32cEnt iscsiDataIntegrityCrc32c;

                    private IscsiDataIntegrityTypesEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                    {
                        super(mib, parent, "iscsiDataIntegrityTypes", "1.3.6.1.2.1.142.3.1.2", false, false, false, false);
                        this.iscsiDataIntegrityNone = new IscsiDataIntegrityNoneEnt(mib, this);
                        this.iscsiDataIntegrityCrc32c = new IscsiDataIntegrityCrc32cEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.iscsiDataIntegrityNone,
                            this.iscsiDataIntegrityCrc32c
                        };
                    }
                    public static final class IscsiDataIntegrityNoneEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        private IscsiDataIntegrityNoneEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiDataIntegrityNone", "1.3.6.1.2.1.142.3.1.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IscsiDataIntegrityCrc32cEnt extends MIBEntry<ISCSIMIBDef>
                    {
                        private IscsiDataIntegrityCrc32cEnt(ISCSIMIBDef mib, MIBEntry<ISCSIMIBDef> parent)
                        {
                            super(mib, parent, "iscsiDataIntegrityCrc32c", "1.3.6.1.2.1.142.3.1.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
