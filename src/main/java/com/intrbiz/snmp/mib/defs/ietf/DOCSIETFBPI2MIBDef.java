package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC3411]
[RFC2579]
[RFC2580]
[RFC2863]*/
public final class DOCSIETFBPI2MIBDef extends MIB
{
    public static final DOCSIETFBPI2MIBDef DOCSIETFBPI2MIB = new DOCSIETFBPI2MIBDef();

    static { MIBs.getInstance().registerMIB(DOCSIETFBPI2MIBDef.DOCSIETFBPI2MIB); }

    /** [RFC4001]

July 20, 2005*/
    public final DocsBpi2MIBEnt docsBpi2MIB;

    private DOCSIETFBPI2MIBDef()
    {
        super("DOCS-IETF-BPI2-MIB");
        this.docsBpi2MIB = new DocsBpi2MIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsBpi2MIB
        };
    }

    public static final class DocsBpi2MIBEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
    {
        public final DocsBpi2MIBObjectsEnt docsBpi2MIBObjects;

        /** The BPI+ MIB Conformance Statements (with a placeholder fornotifications)*/
        public final DocsBpi2NotificationEnt docsBpi2Notification;

        public final DocsBpi2ConformanceEnt docsBpi2Conformance;

        private DocsBpi2MIBEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
        {
            super(mib, parent, "docsBpi2MIB", "1.3.6.1.2.1.126", false, false, false, false);
            this.docsBpi2MIBObjects = new DocsBpi2MIBObjectsEnt(mib, this);
            this.docsBpi2Notification = new DocsBpi2NotificationEnt(mib, this);
            this.docsBpi2Conformance = new DocsBpi2ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsBpi2MIBObjects,
                this.docsBpi2Notification,
                this.docsBpi2Conformance
            };
        }
        public static final class DocsBpi2MIBObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
        {
            /** Cable Modem Group*/
            public final DocsBpi2CmObjectsEnt docsBpi2CmObjects;

            /** Cable Modem Termination System Group*/
            public final DocsBpi2CmtsObjectsEnt docsBpi2CmtsObjects;

            /** Authenticated Software Download Objects
Note: the authenticated software download objects are aCM requirement only.*/
            public final DocsBpi2CodeDownloadControlEnt docsBpi2CodeDownloadControl;

            private DocsBpi2MIBObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
            {
                super(mib, parent, "docsBpi2MIBObjects", "1.3.6.1.2.1.126.1", false, false, false, false);
                this.docsBpi2CmObjects = new DocsBpi2CmObjectsEnt(mib, this);
                this.docsBpi2CmtsObjects = new DocsBpi2CmtsObjectsEnt(mib, this);
                this.docsBpi2CodeDownloadControl = new DocsBpi2CodeDownloadControlEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsBpi2CmObjects,
                    this.docsBpi2CmtsObjects,
                    this.docsBpi2CodeDownloadControl
                };
            }
            public static final class DocsBpi2CmObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
            {
                /** The BPI+ base and authorization table for CMs,indexed by ifIndex*/
                public final DocsBpi2CmBaseTableEnt docsBpi2CmBaseTable;

                /** The CM TEK Table, indexed by ifIndex and SAID*/
                public final DocsBpi2CmTEKTableEnt docsBpi2CmTEKTable;

                /** The CM Multicast Objects Group*/
                public final DocsBpi2CmMulticastObjectsEnt docsBpi2CmMulticastObjects;

                /** CM Cert Objects*/
                public final DocsBpi2CmCertObjectsEnt docsBpi2CmCertObjects;

                /** CM Crypto Suite Table*/
                public final DocsBpi2CmCryptoSuiteTableEnt docsBpi2CmCryptoSuiteTable;

                private DocsBpi2CmObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                {
                    super(mib, parent, "docsBpi2CmObjects", "1.3.6.1.2.1.126.1.1", false, false, false, false);
                    this.docsBpi2CmBaseTable = new DocsBpi2CmBaseTableEnt(mib, this);
                    this.docsBpi2CmTEKTable = new DocsBpi2CmTEKTableEnt(mib, this);
                    this.docsBpi2CmMulticastObjects = new DocsBpi2CmMulticastObjectsEnt(mib, this);
                    this.docsBpi2CmCertObjects = new DocsBpi2CmCertObjectsEnt(mib, this);
                    this.docsBpi2CmCryptoSuiteTable = new DocsBpi2CmCryptoSuiteTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpi2CmBaseTable,
                        this.docsBpi2CmTEKTable,
                        this.docsBpi2CmMulticastObjects,
                        this.docsBpi2CmCertObjects,
                        this.docsBpi2CmCryptoSuiteTable
                    };
                }
                public static final class DocsBpi2CmBaseTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    public final DocsBpi2CmBaseEntryEnt docsBpi2CmBaseEntry;

                    private DocsBpi2CmBaseTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmBaseTable", "1.3.6.1.2.1.126.1.1.1", false, true, false, false);
                        this.docsBpi2CmBaseEntry = new DocsBpi2CmBaseEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmBaseEntry
                        };
                    }
                    public static final class DocsBpi2CmBaseEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmPrivacyEnableEnt docsBpi2CmPrivacyEnable;

                        public final DocsBpi2CmPublicKeyEnt docsBpi2CmPublicKey;

                        public final DocsBpi2CmAuthStateEnt docsBpi2CmAuthState;

                        public final DocsBpi2CmAuthKeySequenceNumberEnt docsBpi2CmAuthKeySequenceNumber;

                        public final DocsBpi2CmAuthExpiresOldEnt docsBpi2CmAuthExpiresOld;

                        public final DocsBpi2CmAuthExpiresNewEnt docsBpi2CmAuthExpiresNew;

                        public final DocsBpi2CmAuthResetEnt docsBpi2CmAuthReset;

                        public final DocsBpi2CmAuthGraceTimeEnt docsBpi2CmAuthGraceTime;

                        public final DocsBpi2CmTEKGraceTimeEnt docsBpi2CmTEKGraceTime;

                        public final DocsBpi2CmAuthWaitTimeoutEnt docsBpi2CmAuthWaitTimeout;

                        public final DocsBpi2CmReauthWaitTimeoutEnt docsBpi2CmReauthWaitTimeout;

                        public final DocsBpi2CmOpWaitTimeoutEnt docsBpi2CmOpWaitTimeout;

                        public final DocsBpi2CmRekeyWaitTimeoutEnt docsBpi2CmRekeyWaitTimeout;

                        public final DocsBpi2CmAuthRejectWaitTimeoutEnt docsBpi2CmAuthRejectWaitTimeout;

                        public final DocsBpi2CmSAMapWaitTimeoutEnt docsBpi2CmSAMapWaitTimeout;

                        public final DocsBpi2CmSAMapMaxRetriesEnt docsBpi2CmSAMapMaxRetries;

                        public final DocsBpi2CmAuthentInfosEnt docsBpi2CmAuthentInfos;

                        public final DocsBpi2CmAuthRequestsEnt docsBpi2CmAuthRequests;

                        public final DocsBpi2CmAuthRepliesEnt docsBpi2CmAuthReplies;

                        public final DocsBpi2CmAuthRejectsEnt docsBpi2CmAuthRejects;

                        public final DocsBpi2CmAuthInvalidsEnt docsBpi2CmAuthInvalids;

                        public final DocsBpi2CmAuthRejectErrorCodeEnt docsBpi2CmAuthRejectErrorCode;

                        public final DocsBpi2CmAuthRejectErrorStringEnt docsBpi2CmAuthRejectErrorString;

                        public final DocsBpi2CmAuthInvalidErrorCodeEnt docsBpi2CmAuthInvalidErrorCode;

                        public final DocsBpi2CmAuthInvalidErrorStringEnt docsBpi2CmAuthInvalidErrorString;

                        private DocsBpi2CmBaseEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmBaseEntry", "1.3.6.1.2.1.126.1.1.1.1", false, false, false, true);
                            this.docsBpi2CmPrivacyEnable = new DocsBpi2CmPrivacyEnableEnt(mib, this);
                            this.docsBpi2CmPublicKey = new DocsBpi2CmPublicKeyEnt(mib, this);
                            this.docsBpi2CmAuthState = new DocsBpi2CmAuthStateEnt(mib, this);
                            this.docsBpi2CmAuthKeySequenceNumber = new DocsBpi2CmAuthKeySequenceNumberEnt(mib, this);
                            this.docsBpi2CmAuthExpiresOld = new DocsBpi2CmAuthExpiresOldEnt(mib, this);
                            this.docsBpi2CmAuthExpiresNew = new DocsBpi2CmAuthExpiresNewEnt(mib, this);
                            this.docsBpi2CmAuthReset = new DocsBpi2CmAuthResetEnt(mib, this);
                            this.docsBpi2CmAuthGraceTime = new DocsBpi2CmAuthGraceTimeEnt(mib, this);
                            this.docsBpi2CmTEKGraceTime = new DocsBpi2CmTEKGraceTimeEnt(mib, this);
                            this.docsBpi2CmAuthWaitTimeout = new DocsBpi2CmAuthWaitTimeoutEnt(mib, this);
                            this.docsBpi2CmReauthWaitTimeout = new DocsBpi2CmReauthWaitTimeoutEnt(mib, this);
                            this.docsBpi2CmOpWaitTimeout = new DocsBpi2CmOpWaitTimeoutEnt(mib, this);
                            this.docsBpi2CmRekeyWaitTimeout = new DocsBpi2CmRekeyWaitTimeoutEnt(mib, this);
                            this.docsBpi2CmAuthRejectWaitTimeout = new DocsBpi2CmAuthRejectWaitTimeoutEnt(mib, this);
                            this.docsBpi2CmSAMapWaitTimeout = new DocsBpi2CmSAMapWaitTimeoutEnt(mib, this);
                            this.docsBpi2CmSAMapMaxRetries = new DocsBpi2CmSAMapMaxRetriesEnt(mib, this);
                            this.docsBpi2CmAuthentInfos = new DocsBpi2CmAuthentInfosEnt(mib, this);
                            this.docsBpi2CmAuthRequests = new DocsBpi2CmAuthRequestsEnt(mib, this);
                            this.docsBpi2CmAuthReplies = new DocsBpi2CmAuthRepliesEnt(mib, this);
                            this.docsBpi2CmAuthRejects = new DocsBpi2CmAuthRejectsEnt(mib, this);
                            this.docsBpi2CmAuthInvalids = new DocsBpi2CmAuthInvalidsEnt(mib, this);
                            this.docsBpi2CmAuthRejectErrorCode = new DocsBpi2CmAuthRejectErrorCodeEnt(mib, this);
                            this.docsBpi2CmAuthRejectErrorString = new DocsBpi2CmAuthRejectErrorStringEnt(mib, this);
                            this.docsBpi2CmAuthInvalidErrorCode = new DocsBpi2CmAuthInvalidErrorCodeEnt(mib, this);
                            this.docsBpi2CmAuthInvalidErrorString = new DocsBpi2CmAuthInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmPrivacyEnable,
                                this.docsBpi2CmPublicKey,
                                this.docsBpi2CmAuthState,
                                this.docsBpi2CmAuthKeySequenceNumber,
                                this.docsBpi2CmAuthExpiresOld,
                                this.docsBpi2CmAuthExpiresNew,
                                this.docsBpi2CmAuthReset,
                                this.docsBpi2CmAuthGraceTime,
                                this.docsBpi2CmTEKGraceTime,
                                this.docsBpi2CmAuthWaitTimeout,
                                this.docsBpi2CmReauthWaitTimeout,
                                this.docsBpi2CmOpWaitTimeout,
                                this.docsBpi2CmRekeyWaitTimeout,
                                this.docsBpi2CmAuthRejectWaitTimeout,
                                this.docsBpi2CmSAMapWaitTimeout,
                                this.docsBpi2CmSAMapMaxRetries,
                                this.docsBpi2CmAuthentInfos,
                                this.docsBpi2CmAuthRequests,
                                this.docsBpi2CmAuthReplies,
                                this.docsBpi2CmAuthRejects,
                                this.docsBpi2CmAuthInvalids,
                                this.docsBpi2CmAuthRejectErrorCode,
                                this.docsBpi2CmAuthRejectErrorString,
                                this.docsBpi2CmAuthInvalidErrorCode,
                                this.docsBpi2CmAuthInvalidErrorString
                            };
                        }
                        public static final class DocsBpi2CmPrivacyEnableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmPrivacyEnableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmPrivacyEnable", "1.3.6.1.2.1.126.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmPublicKeyEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmPublicKeyEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmPublicKey", "1.3.6.1.2.1.126.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthStateEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthStateEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthState", "1.3.6.1.2.1.126.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthKeySequenceNumberEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthKeySequenceNumberEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthKeySequenceNumber", "1.3.6.1.2.1.126.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthExpiresOldEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthExpiresOldEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthExpiresOld", "1.3.6.1.2.1.126.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthExpiresNewEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthExpiresNewEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthExpiresNew", "1.3.6.1.2.1.126.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthResetEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthResetEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthReset", "1.3.6.1.2.1.126.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthGraceTimeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthGraceTimeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthGraceTime", "1.3.6.1.2.1.126.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKGraceTimeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKGraceTimeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKGraceTime", "1.3.6.1.2.1.126.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthWaitTimeoutEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthWaitTimeoutEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthWaitTimeout", "1.3.6.1.2.1.126.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmReauthWaitTimeoutEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmReauthWaitTimeoutEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmReauthWaitTimeout", "1.3.6.1.2.1.126.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmOpWaitTimeoutEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmOpWaitTimeoutEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmOpWaitTimeout", "1.3.6.1.2.1.126.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmRekeyWaitTimeoutEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmRekeyWaitTimeoutEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmRekeyWaitTimeout", "1.3.6.1.2.1.126.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthRejectWaitTimeoutEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthRejectWaitTimeoutEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthRejectWaitTimeout", "1.3.6.1.2.1.126.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmSAMapWaitTimeoutEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmSAMapWaitTimeoutEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmSAMapWaitTimeout", "1.3.6.1.2.1.126.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmSAMapMaxRetriesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmSAMapMaxRetriesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmSAMapMaxRetries", "1.3.6.1.2.1.126.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthentInfosEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthentInfosEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthentInfos", "1.3.6.1.2.1.126.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthRequests", "1.3.6.1.2.1.126.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthReplies", "1.3.6.1.2.1.126.1.1.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthRejects", "1.3.6.1.2.1.126.1.1.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthInvalidsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthInvalidsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthInvalids", "1.3.6.1.2.1.126.1.1.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthRejectErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthRejectErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthRejectErrorCode", "1.3.6.1.2.1.126.1.1.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthRejectErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthRejectErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthRejectErrorString", "1.3.6.1.2.1.126.1.1.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthInvalidErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthInvalidErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthInvalidErrorCode", "1.3.6.1.2.1.126.1.1.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmAuthInvalidErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmAuthInvalidErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmAuthInvalidErrorString", "1.3.6.1.2.1.126.1.1.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpi2CmTEKTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    public final DocsBpi2CmTEKEntryEnt docsBpi2CmTEKEntry;

                    private DocsBpi2CmTEKTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmTEKTable", "1.3.6.1.2.1.126.1.1.2", false, true, false, false);
                        this.docsBpi2CmTEKEntry = new DocsBpi2CmTEKEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmTEKEntry
                        };
                    }
                    public static final class DocsBpi2CmTEKEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmTEKSAIdEnt docsBpi2CmTEKSAId;

                        public final DocsBpi2CmTEKSATypeEnt docsBpi2CmTEKSAType;

                        public final DocsBpi2CmTEKDataEncryptAlgEnt docsBpi2CmTEKDataEncryptAlg;

                        public final DocsBpi2CmTEKDataAuthentAlgEnt docsBpi2CmTEKDataAuthentAlg;

                        public final DocsBpi2CmTEKStateEnt docsBpi2CmTEKState;

                        public final DocsBpi2CmTEKKeySequenceNumberEnt docsBpi2CmTEKKeySequenceNumber;

                        public final DocsBpi2CmTEKExpiresOldEnt docsBpi2CmTEKExpiresOld;

                        public final DocsBpi2CmTEKExpiresNewEnt docsBpi2CmTEKExpiresNew;

                        public final DocsBpi2CmTEKKeyRequestsEnt docsBpi2CmTEKKeyRequests;

                        public final DocsBpi2CmTEKKeyRepliesEnt docsBpi2CmTEKKeyReplies;

                        public final DocsBpi2CmTEKKeyRejectsEnt docsBpi2CmTEKKeyRejects;

                        public final DocsBpi2CmTEKInvalidsEnt docsBpi2CmTEKInvalids;

                        public final DocsBpi2CmTEKAuthPendsEnt docsBpi2CmTEKAuthPends;

                        public final DocsBpi2CmTEKKeyRejectErrorCodeEnt docsBpi2CmTEKKeyRejectErrorCode;

                        public final DocsBpi2CmTEKKeyRejectErrorStringEnt docsBpi2CmTEKKeyRejectErrorString;

                        public final DocsBpi2CmTEKInvalidErrorCodeEnt docsBpi2CmTEKInvalidErrorCode;

                        public final DocsBpi2CmTEKInvalidErrorStringEnt docsBpi2CmTEKInvalidErrorString;

                        private DocsBpi2CmTEKEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmTEKEntry", "1.3.6.1.2.1.126.1.1.2.1", false, false, false, true);
                            this.docsBpi2CmTEKSAId = new DocsBpi2CmTEKSAIdEnt(mib, this);
                            this.docsBpi2CmTEKSAType = new DocsBpi2CmTEKSATypeEnt(mib, this);
                            this.docsBpi2CmTEKDataEncryptAlg = new DocsBpi2CmTEKDataEncryptAlgEnt(mib, this);
                            this.docsBpi2CmTEKDataAuthentAlg = new DocsBpi2CmTEKDataAuthentAlgEnt(mib, this);
                            this.docsBpi2CmTEKState = new DocsBpi2CmTEKStateEnt(mib, this);
                            this.docsBpi2CmTEKKeySequenceNumber = new DocsBpi2CmTEKKeySequenceNumberEnt(mib, this);
                            this.docsBpi2CmTEKExpiresOld = new DocsBpi2CmTEKExpiresOldEnt(mib, this);
                            this.docsBpi2CmTEKExpiresNew = new DocsBpi2CmTEKExpiresNewEnt(mib, this);
                            this.docsBpi2CmTEKKeyRequests = new DocsBpi2CmTEKKeyRequestsEnt(mib, this);
                            this.docsBpi2CmTEKKeyReplies = new DocsBpi2CmTEKKeyRepliesEnt(mib, this);
                            this.docsBpi2CmTEKKeyRejects = new DocsBpi2CmTEKKeyRejectsEnt(mib, this);
                            this.docsBpi2CmTEKInvalids = new DocsBpi2CmTEKInvalidsEnt(mib, this);
                            this.docsBpi2CmTEKAuthPends = new DocsBpi2CmTEKAuthPendsEnt(mib, this);
                            this.docsBpi2CmTEKKeyRejectErrorCode = new DocsBpi2CmTEKKeyRejectErrorCodeEnt(mib, this);
                            this.docsBpi2CmTEKKeyRejectErrorString = new DocsBpi2CmTEKKeyRejectErrorStringEnt(mib, this);
                            this.docsBpi2CmTEKInvalidErrorCode = new DocsBpi2CmTEKInvalidErrorCodeEnt(mib, this);
                            this.docsBpi2CmTEKInvalidErrorString = new DocsBpi2CmTEKInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmTEKSAId,
                                this.docsBpi2CmTEKSAType,
                                this.docsBpi2CmTEKDataEncryptAlg,
                                this.docsBpi2CmTEKDataAuthentAlg,
                                this.docsBpi2CmTEKState,
                                this.docsBpi2CmTEKKeySequenceNumber,
                                this.docsBpi2CmTEKExpiresOld,
                                this.docsBpi2CmTEKExpiresNew,
                                this.docsBpi2CmTEKKeyRequests,
                                this.docsBpi2CmTEKKeyReplies,
                                this.docsBpi2CmTEKKeyRejects,
                                this.docsBpi2CmTEKInvalids,
                                this.docsBpi2CmTEKAuthPends,
                                this.docsBpi2CmTEKKeyRejectErrorCode,
                                this.docsBpi2CmTEKKeyRejectErrorString,
                                this.docsBpi2CmTEKInvalidErrorCode,
                                this.docsBpi2CmTEKInvalidErrorString
                            };
                        }
                        public static final class DocsBpi2CmTEKSAIdEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKSAIdEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKSAId", "1.3.6.1.2.1.126.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKSATypeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKSATypeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKSAType", "1.3.6.1.2.1.126.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKDataEncryptAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKDataEncryptAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKDataEncryptAlg", "1.3.6.1.2.1.126.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKDataAuthentAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKDataAuthentAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKDataAuthentAlg", "1.3.6.1.2.1.126.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKStateEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKStateEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKState", "1.3.6.1.2.1.126.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKKeySequenceNumberEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKKeySequenceNumberEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKKeySequenceNumber", "1.3.6.1.2.1.126.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKExpiresOldEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKExpiresOldEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKExpiresOld", "1.3.6.1.2.1.126.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKExpiresNewEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKExpiresNewEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKExpiresNew", "1.3.6.1.2.1.126.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKKeyRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKKeyRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKKeyRequests", "1.3.6.1.2.1.126.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKKeyRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKKeyRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKKeyReplies", "1.3.6.1.2.1.126.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKKeyRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKKeyRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKKeyRejects", "1.3.6.1.2.1.126.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKInvalidsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKInvalidsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKInvalids", "1.3.6.1.2.1.126.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKAuthPendsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKAuthPendsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKAuthPends", "1.3.6.1.2.1.126.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKKeyRejectErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKKeyRejectErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKKeyRejectErrorCode", "1.3.6.1.2.1.126.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKKeyRejectErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKKeyRejectErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKKeyRejectErrorString", "1.3.6.1.2.1.126.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKInvalidErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKInvalidErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKInvalidErrorCode", "1.3.6.1.2.1.126.1.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmTEKInvalidErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmTEKInvalidErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmTEKInvalidErrorString", "1.3.6.1.2.1.126.1.1.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpi2CmMulticastObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    /** The CM Dynamic IP Multicast Mapping Table, indexed bydocsBpi2CmIpMulticastIndex and by ifIndex*/
                    public final DocsBpi2CmIpMulticastMapTableEnt docsBpi2CmIpMulticastMapTable;

                    private DocsBpi2CmMulticastObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmMulticastObjects", "1.3.6.1.2.1.126.1.1.3", false, false, false, false);
                        this.docsBpi2CmIpMulticastMapTable = new DocsBpi2CmIpMulticastMapTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmIpMulticastMapTable
                        };
                    }
                    public static final class DocsBpi2CmIpMulticastMapTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmIpMulticastMapEntryEnt docsBpi2CmIpMulticastMapEntry;

                        private DocsBpi2CmIpMulticastMapTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmIpMulticastMapTable", "1.3.6.1.2.1.126.1.1.3.1", false, true, false, false);
                            this.docsBpi2CmIpMulticastMapEntry = new DocsBpi2CmIpMulticastMapEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmIpMulticastMapEntry
                            };
                        }
                        public static final class DocsBpi2CmIpMulticastMapEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            public final DocsBpi2CmIpMulticastIndexEnt docsBpi2CmIpMulticastIndex;

                            public final DocsBpi2CmIpMulticastAddressTypeEnt docsBpi2CmIpMulticastAddressType;

                            public final DocsBpi2CmIpMulticastAddressEnt docsBpi2CmIpMulticastAddress;

                            public final DocsBpi2CmIpMulticastSAIdEnt docsBpi2CmIpMulticastSAId;

                            public final DocsBpi2CmIpMulticastSAMapStateEnt docsBpi2CmIpMulticastSAMapState;

                            public final DocsBpi2CmIpMulticastSAMapRequestsEnt docsBpi2CmIpMulticastSAMapRequests;

                            public final DocsBpi2CmIpMulticastSAMapRepliesEnt docsBpi2CmIpMulticastSAMapReplies;

                            public final DocsBpi2CmIpMulticastSAMapRejectsEnt docsBpi2CmIpMulticastSAMapRejects;

                            public final DocsBpi2CmIpMulticastSAMapRejectErrorCodeEnt docsBpi2CmIpMulticastSAMapRejectErrorCode;

                            public final DocsBpi2CmIpMulticastSAMapRejectErrorStringEnt docsBpi2CmIpMulticastSAMapRejectErrorString;

                            private DocsBpi2CmIpMulticastMapEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmIpMulticastMapEntry", "1.3.6.1.2.1.126.1.1.3.1.1", false, false, false, true);
                                this.docsBpi2CmIpMulticastIndex = new DocsBpi2CmIpMulticastIndexEnt(mib, this);
                                this.docsBpi2CmIpMulticastAddressType = new DocsBpi2CmIpMulticastAddressTypeEnt(mib, this);
                                this.docsBpi2CmIpMulticastAddress = new DocsBpi2CmIpMulticastAddressEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAId = new DocsBpi2CmIpMulticastSAIdEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAMapState = new DocsBpi2CmIpMulticastSAMapStateEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAMapRequests = new DocsBpi2CmIpMulticastSAMapRequestsEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAMapReplies = new DocsBpi2CmIpMulticastSAMapRepliesEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAMapRejects = new DocsBpi2CmIpMulticastSAMapRejectsEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAMapRejectErrorCode = new DocsBpi2CmIpMulticastSAMapRejectErrorCodeEnt(mib, this);
                                this.docsBpi2CmIpMulticastSAMapRejectErrorString = new DocsBpi2CmIpMulticastSAMapRejectErrorStringEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpi2CmIpMulticastIndex,
                                    this.docsBpi2CmIpMulticastAddressType,
                                    this.docsBpi2CmIpMulticastAddress,
                                    this.docsBpi2CmIpMulticastSAId,
                                    this.docsBpi2CmIpMulticastSAMapState,
                                    this.docsBpi2CmIpMulticastSAMapRequests,
                                    this.docsBpi2CmIpMulticastSAMapReplies,
                                    this.docsBpi2CmIpMulticastSAMapRejects,
                                    this.docsBpi2CmIpMulticastSAMapRejectErrorCode,
                                    this.docsBpi2CmIpMulticastSAMapRejectErrorString
                                };
                            }
                            public static final class DocsBpi2CmIpMulticastIndexEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastIndexEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastIndex", "1.3.6.1.2.1.126.1.1.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastAddressTypeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastAddressTypeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastAddressType", "1.3.6.1.2.1.126.1.1.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastAddressEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastAddressEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastAddress", "1.3.6.1.2.1.126.1.1.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAIdEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAIdEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAId", "1.3.6.1.2.1.126.1.1.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAMapStateEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAMapStateEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAMapState", "1.3.6.1.2.1.126.1.1.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAMapRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAMapRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAMapRequests", "1.3.6.1.2.1.126.1.1.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAMapRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAMapRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAMapReplies", "1.3.6.1.2.1.126.1.1.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAMapRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAMapRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAMapRejects", "1.3.6.1.2.1.126.1.1.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAMapRejectErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAMapRejectErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAMapRejectErrorCode", "1.3.6.1.2.1.126.1.1.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmIpMulticastSAMapRejectErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmIpMulticastSAMapRejectErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmIpMulticastSAMapRejectErrorString", "1.3.6.1.2.1.126.1.1.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class DocsBpi2CmCertObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    /** CM Device Cert Table*/
                    public final DocsBpi2CmDeviceCertTableEnt docsBpi2CmDeviceCertTable;

                    private DocsBpi2CmCertObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmCertObjects", "1.3.6.1.2.1.126.1.1.4", false, false, false, false);
                        this.docsBpi2CmDeviceCertTable = new DocsBpi2CmDeviceCertTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmDeviceCertTable
                        };
                    }
                    public static final class DocsBpi2CmDeviceCertTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmDeviceCertEntryEnt docsBpi2CmDeviceCertEntry;

                        private DocsBpi2CmDeviceCertTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmDeviceCertTable", "1.3.6.1.2.1.126.1.1.4.1", false, true, false, false);
                            this.docsBpi2CmDeviceCertEntry = new DocsBpi2CmDeviceCertEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmDeviceCertEntry
                            };
                        }
                        public static final class DocsBpi2CmDeviceCertEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            public final DocsBpi2CmDeviceCmCertEnt docsBpi2CmDeviceCmCert;

                            public final DocsBpi2CmDeviceManufCertEnt docsBpi2CmDeviceManufCert;

                            private DocsBpi2CmDeviceCertEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmDeviceCertEntry", "1.3.6.1.2.1.126.1.1.4.1.1", false, false, false, true);
                                this.docsBpi2CmDeviceCmCert = new DocsBpi2CmDeviceCmCertEnt(mib, this);
                                this.docsBpi2CmDeviceManufCert = new DocsBpi2CmDeviceManufCertEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpi2CmDeviceCmCert,
                                    this.docsBpi2CmDeviceManufCert
                                };
                            }
                            public static final class DocsBpi2CmDeviceCmCertEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmDeviceCmCertEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmDeviceCmCert", "1.3.6.1.2.1.126.1.1.4.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmDeviceManufCertEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmDeviceManufCertEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmDeviceManufCert", "1.3.6.1.2.1.126.1.1.4.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class DocsBpi2CmCryptoSuiteTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    public final DocsBpi2CmCryptoSuiteEntryEnt docsBpi2CmCryptoSuiteEntry;

                    private DocsBpi2CmCryptoSuiteTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmCryptoSuiteTable", "1.3.6.1.2.1.126.1.1.5", false, true, false, false);
                        this.docsBpi2CmCryptoSuiteEntry = new DocsBpi2CmCryptoSuiteEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmCryptoSuiteEntry
                        };
                    }
                    public static final class DocsBpi2CmCryptoSuiteEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmCryptoSuiteIndexEnt docsBpi2CmCryptoSuiteIndex;

                        public final DocsBpi2CmCryptoSuiteDataEncryptAlgEnt docsBpi2CmCryptoSuiteDataEncryptAlg;

                        public final DocsBpi2CmCryptoSuiteDataAuthentAlgEnt docsBpi2CmCryptoSuiteDataAuthentAlg;

                        private DocsBpi2CmCryptoSuiteEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmCryptoSuiteEntry", "1.3.6.1.2.1.126.1.1.5.1", false, false, false, true);
                            this.docsBpi2CmCryptoSuiteIndex = new DocsBpi2CmCryptoSuiteIndexEnt(mib, this);
                            this.docsBpi2CmCryptoSuiteDataEncryptAlg = new DocsBpi2CmCryptoSuiteDataEncryptAlgEnt(mib, this);
                            this.docsBpi2CmCryptoSuiteDataAuthentAlg = new DocsBpi2CmCryptoSuiteDataAuthentAlgEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmCryptoSuiteIndex,
                                this.docsBpi2CmCryptoSuiteDataEncryptAlg,
                                this.docsBpi2CmCryptoSuiteDataAuthentAlg
                            };
                        }
                        public static final class DocsBpi2CmCryptoSuiteIndexEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmCryptoSuiteIndexEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmCryptoSuiteIndex", "1.3.6.1.2.1.126.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmCryptoSuiteDataEncryptAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmCryptoSuiteDataEncryptAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmCryptoSuiteDataEncryptAlg", "1.3.6.1.2.1.126.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmCryptoSuiteDataAuthentAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmCryptoSuiteDataAuthentAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmCryptoSuiteDataAuthentAlg", "1.3.6.1.2.1.126.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DocsBpi2CmtsObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
            {
                /** SPECIAL NOTE:  For the following CMTS tables, when a CM isrunning in BPI mode, replace SAID (Security Association ID)with SID (Service ID).  The CMTS is required to map SAIDs andSIDs to one contiguous space.
The BPI+ base table for CMTSs, indexed by ifIndex*/
                public final DocsBpi2CmtsBaseTableEnt docsBpi2CmtsBaseTable;

                /** The CMTS Authorization Table, indexed by ifIndex and CM MACaddress*/
                public final DocsBpi2CmtsAuthTableEnt docsBpi2CmtsAuthTable;

                /** The CMTS TEK Table, indexed by ifIndex and SAID*/
                public final DocsBpi2CmtsTEKTableEnt docsBpi2CmtsTEKTable;

                /** The CMTS Multicast Objects Group*/
                public final DocsBpi2CmtsMulticastObjectsEnt docsBpi2CmtsMulticastObjects;

                /** CMTS Cert Objects*/
                public final DocsBpi2CmtsCertObjectsEnt docsBpi2CmtsCertObjects;

                private DocsBpi2CmtsObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                {
                    super(mib, parent, "docsBpi2CmtsObjects", "1.3.6.1.2.1.126.1.2", false, false, false, false);
                    this.docsBpi2CmtsBaseTable = new DocsBpi2CmtsBaseTableEnt(mib, this);
                    this.docsBpi2CmtsAuthTable = new DocsBpi2CmtsAuthTableEnt(mib, this);
                    this.docsBpi2CmtsTEKTable = new DocsBpi2CmtsTEKTableEnt(mib, this);
                    this.docsBpi2CmtsMulticastObjects = new DocsBpi2CmtsMulticastObjectsEnt(mib, this);
                    this.docsBpi2CmtsCertObjects = new DocsBpi2CmtsCertObjectsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpi2CmtsBaseTable,
                        this.docsBpi2CmtsAuthTable,
                        this.docsBpi2CmtsTEKTable,
                        this.docsBpi2CmtsMulticastObjects,
                        this.docsBpi2CmtsCertObjects
                    };
                }
                public static final class DocsBpi2CmtsBaseTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    public final DocsBpi2CmtsBaseEntryEnt docsBpi2CmtsBaseEntry;

                    private DocsBpi2CmtsBaseTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsBaseTable", "1.3.6.1.2.1.126.1.2.1", false, true, false, false);
                        this.docsBpi2CmtsBaseEntry = new DocsBpi2CmtsBaseEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmtsBaseEntry
                        };
                    }
                    public static final class DocsBpi2CmtsBaseEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsDefaultAuthLifetimeEnt docsBpi2CmtsDefaultAuthLifetime;

                        public final DocsBpi2CmtsDefaultTEKLifetimeEnt docsBpi2CmtsDefaultTEKLifetime;

                        public final DocsBpi2CmtsDefaultSelfSignedManufCertTrustEnt docsBpi2CmtsDefaultSelfSignedManufCertTrust;

                        public final DocsBpi2CmtsCheckCertValidityPeriodsEnt docsBpi2CmtsCheckCertValidityPeriods;

                        public final DocsBpi2CmtsAuthentInfosEnt docsBpi2CmtsAuthentInfos;

                        public final DocsBpi2CmtsAuthRequestsEnt docsBpi2CmtsAuthRequests;

                        public final DocsBpi2CmtsAuthRepliesEnt docsBpi2CmtsAuthReplies;

                        public final DocsBpi2CmtsAuthRejectsEnt docsBpi2CmtsAuthRejects;

                        public final DocsBpi2CmtsAuthInvalidsEnt docsBpi2CmtsAuthInvalids;

                        public final DocsBpi2CmtsSAMapRequestsEnt docsBpi2CmtsSAMapRequests;

                        public final DocsBpi2CmtsSAMapRepliesEnt docsBpi2CmtsSAMapReplies;

                        public final DocsBpi2CmtsSAMapRejectsEnt docsBpi2CmtsSAMapRejects;

                        private DocsBpi2CmtsBaseEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsBaseEntry", "1.3.6.1.2.1.126.1.2.1.1", false, false, false, true);
                            this.docsBpi2CmtsDefaultAuthLifetime = new DocsBpi2CmtsDefaultAuthLifetimeEnt(mib, this);
                            this.docsBpi2CmtsDefaultTEKLifetime = new DocsBpi2CmtsDefaultTEKLifetimeEnt(mib, this);
                            this.docsBpi2CmtsDefaultSelfSignedManufCertTrust = new DocsBpi2CmtsDefaultSelfSignedManufCertTrustEnt(mib, this);
                            this.docsBpi2CmtsCheckCertValidityPeriods = new DocsBpi2CmtsCheckCertValidityPeriodsEnt(mib, this);
                            this.docsBpi2CmtsAuthentInfos = new DocsBpi2CmtsAuthentInfosEnt(mib, this);
                            this.docsBpi2CmtsAuthRequests = new DocsBpi2CmtsAuthRequestsEnt(mib, this);
                            this.docsBpi2CmtsAuthReplies = new DocsBpi2CmtsAuthRepliesEnt(mib, this);
                            this.docsBpi2CmtsAuthRejects = new DocsBpi2CmtsAuthRejectsEnt(mib, this);
                            this.docsBpi2CmtsAuthInvalids = new DocsBpi2CmtsAuthInvalidsEnt(mib, this);
                            this.docsBpi2CmtsSAMapRequests = new DocsBpi2CmtsSAMapRequestsEnt(mib, this);
                            this.docsBpi2CmtsSAMapReplies = new DocsBpi2CmtsSAMapRepliesEnt(mib, this);
                            this.docsBpi2CmtsSAMapRejects = new DocsBpi2CmtsSAMapRejectsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsDefaultAuthLifetime,
                                this.docsBpi2CmtsDefaultTEKLifetime,
                                this.docsBpi2CmtsDefaultSelfSignedManufCertTrust,
                                this.docsBpi2CmtsCheckCertValidityPeriods,
                                this.docsBpi2CmtsAuthentInfos,
                                this.docsBpi2CmtsAuthRequests,
                                this.docsBpi2CmtsAuthReplies,
                                this.docsBpi2CmtsAuthRejects,
                                this.docsBpi2CmtsAuthInvalids,
                                this.docsBpi2CmtsSAMapRequests,
                                this.docsBpi2CmtsSAMapReplies,
                                this.docsBpi2CmtsSAMapRejects
                            };
                        }
                        public static final class DocsBpi2CmtsDefaultAuthLifetimeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsDefaultAuthLifetimeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsDefaultAuthLifetime", "1.3.6.1.2.1.126.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsDefaultTEKLifetimeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsDefaultTEKLifetimeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsDefaultTEKLifetime", "1.3.6.1.2.1.126.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsDefaultSelfSignedManufCertTrustEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsDefaultSelfSignedManufCertTrustEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsDefaultSelfSignedManufCertTrust", "1.3.6.1.2.1.126.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsCheckCertValidityPeriodsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsCheckCertValidityPeriodsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsCheckCertValidityPeriods", "1.3.6.1.2.1.126.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthentInfosEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthentInfosEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthentInfos", "1.3.6.1.2.1.126.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthRequests", "1.3.6.1.2.1.126.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthReplies", "1.3.6.1.2.1.126.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthRejects", "1.3.6.1.2.1.126.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthInvalidsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthInvalidsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthInvalids", "1.3.6.1.2.1.126.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsSAMapRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsSAMapRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsSAMapRequests", "1.3.6.1.2.1.126.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsSAMapRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsSAMapRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsSAMapReplies", "1.3.6.1.2.1.126.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsSAMapRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsSAMapRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsSAMapRejects", "1.3.6.1.2.1.126.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpi2CmtsAuthTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    public final DocsBpi2CmtsAuthEntryEnt docsBpi2CmtsAuthEntry;

                    private DocsBpi2CmtsAuthTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsAuthTable", "1.3.6.1.2.1.126.1.2.2", false, true, false, false);
                        this.docsBpi2CmtsAuthEntry = new DocsBpi2CmtsAuthEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmtsAuthEntry
                        };
                    }
                    public static final class DocsBpi2CmtsAuthEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsAuthCmMacAddressEnt docsBpi2CmtsAuthCmMacAddress;

                        public final DocsBpi2CmtsAuthCmBpiVersionEnt docsBpi2CmtsAuthCmBpiVersion;

                        public final DocsBpi2CmtsAuthCmPublicKeyEnt docsBpi2CmtsAuthCmPublicKey;

                        public final DocsBpi2CmtsAuthCmKeySequenceNumberEnt docsBpi2CmtsAuthCmKeySequenceNumber;

                        public final DocsBpi2CmtsAuthCmExpiresOldEnt docsBpi2CmtsAuthCmExpiresOld;

                        public final DocsBpi2CmtsAuthCmExpiresNewEnt docsBpi2CmtsAuthCmExpiresNew;

                        public final DocsBpi2CmtsAuthCmLifetimeEnt docsBpi2CmtsAuthCmLifetime;

                        public final DocsBpi2CmtsAuthCmResetEnt docsBpi2CmtsAuthCmReset;

                        public final DocsBpi2CmtsAuthCmInfosEnt docsBpi2CmtsAuthCmInfos;

                        public final DocsBpi2CmtsAuthCmRequestsEnt docsBpi2CmtsAuthCmRequests;

                        public final DocsBpi2CmtsAuthCmRepliesEnt docsBpi2CmtsAuthCmReplies;

                        public final DocsBpi2CmtsAuthCmRejectsEnt docsBpi2CmtsAuthCmRejects;

                        public final DocsBpi2CmtsAuthCmInvalidsEnt docsBpi2CmtsAuthCmInvalids;

                        public final DocsBpi2CmtsAuthRejectErrorCodeEnt docsBpi2CmtsAuthRejectErrorCode;

                        public final DocsBpi2CmtsAuthRejectErrorStringEnt docsBpi2CmtsAuthRejectErrorString;

                        public final DocsBpi2CmtsAuthInvalidErrorCodeEnt docsBpi2CmtsAuthInvalidErrorCode;

                        public final DocsBpi2CmtsAuthInvalidErrorStringEnt docsBpi2CmtsAuthInvalidErrorString;

                        public final DocsBpi2CmtsAuthPrimarySAIdEnt docsBpi2CmtsAuthPrimarySAId;

                        public final DocsBpi2CmtsAuthBpkmCmCertValidEnt docsBpi2CmtsAuthBpkmCmCertValid;

                        public final DocsBpi2CmtsAuthBpkmCmCertEnt docsBpi2CmtsAuthBpkmCmCert;

                        public final DocsBpi2CmtsAuthCACertIndexPtrEnt docsBpi2CmtsAuthCACertIndexPtr;

                        private DocsBpi2CmtsAuthEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsAuthEntry", "1.3.6.1.2.1.126.1.2.2.1", false, false, false, true);
                            this.docsBpi2CmtsAuthCmMacAddress = new DocsBpi2CmtsAuthCmMacAddressEnt(mib, this);
                            this.docsBpi2CmtsAuthCmBpiVersion = new DocsBpi2CmtsAuthCmBpiVersionEnt(mib, this);
                            this.docsBpi2CmtsAuthCmPublicKey = new DocsBpi2CmtsAuthCmPublicKeyEnt(mib, this);
                            this.docsBpi2CmtsAuthCmKeySequenceNumber = new DocsBpi2CmtsAuthCmKeySequenceNumberEnt(mib, this);
                            this.docsBpi2CmtsAuthCmExpiresOld = new DocsBpi2CmtsAuthCmExpiresOldEnt(mib, this);
                            this.docsBpi2CmtsAuthCmExpiresNew = new DocsBpi2CmtsAuthCmExpiresNewEnt(mib, this);
                            this.docsBpi2CmtsAuthCmLifetime = new DocsBpi2CmtsAuthCmLifetimeEnt(mib, this);
                            this.docsBpi2CmtsAuthCmReset = new DocsBpi2CmtsAuthCmResetEnt(mib, this);
                            this.docsBpi2CmtsAuthCmInfos = new DocsBpi2CmtsAuthCmInfosEnt(mib, this);
                            this.docsBpi2CmtsAuthCmRequests = new DocsBpi2CmtsAuthCmRequestsEnt(mib, this);
                            this.docsBpi2CmtsAuthCmReplies = new DocsBpi2CmtsAuthCmRepliesEnt(mib, this);
                            this.docsBpi2CmtsAuthCmRejects = new DocsBpi2CmtsAuthCmRejectsEnt(mib, this);
                            this.docsBpi2CmtsAuthCmInvalids = new DocsBpi2CmtsAuthCmInvalidsEnt(mib, this);
                            this.docsBpi2CmtsAuthRejectErrorCode = new DocsBpi2CmtsAuthRejectErrorCodeEnt(mib, this);
                            this.docsBpi2CmtsAuthRejectErrorString = new DocsBpi2CmtsAuthRejectErrorStringEnt(mib, this);
                            this.docsBpi2CmtsAuthInvalidErrorCode = new DocsBpi2CmtsAuthInvalidErrorCodeEnt(mib, this);
                            this.docsBpi2CmtsAuthInvalidErrorString = new DocsBpi2CmtsAuthInvalidErrorStringEnt(mib, this);
                            this.docsBpi2CmtsAuthPrimarySAId = new DocsBpi2CmtsAuthPrimarySAIdEnt(mib, this);
                            this.docsBpi2CmtsAuthBpkmCmCertValid = new DocsBpi2CmtsAuthBpkmCmCertValidEnt(mib, this);
                            this.docsBpi2CmtsAuthBpkmCmCert = new DocsBpi2CmtsAuthBpkmCmCertEnt(mib, this);
                            this.docsBpi2CmtsAuthCACertIndexPtr = new DocsBpi2CmtsAuthCACertIndexPtrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsAuthCmMacAddress,
                                this.docsBpi2CmtsAuthCmBpiVersion,
                                this.docsBpi2CmtsAuthCmPublicKey,
                                this.docsBpi2CmtsAuthCmKeySequenceNumber,
                                this.docsBpi2CmtsAuthCmExpiresOld,
                                this.docsBpi2CmtsAuthCmExpiresNew,
                                this.docsBpi2CmtsAuthCmLifetime,
                                this.docsBpi2CmtsAuthCmReset,
                                this.docsBpi2CmtsAuthCmInfos,
                                this.docsBpi2CmtsAuthCmRequests,
                                this.docsBpi2CmtsAuthCmReplies,
                                this.docsBpi2CmtsAuthCmRejects,
                                this.docsBpi2CmtsAuthCmInvalids,
                                this.docsBpi2CmtsAuthRejectErrorCode,
                                this.docsBpi2CmtsAuthRejectErrorString,
                                this.docsBpi2CmtsAuthInvalidErrorCode,
                                this.docsBpi2CmtsAuthInvalidErrorString,
                                this.docsBpi2CmtsAuthPrimarySAId,
                                this.docsBpi2CmtsAuthBpkmCmCertValid,
                                this.docsBpi2CmtsAuthBpkmCmCert,
                                this.docsBpi2CmtsAuthCACertIndexPtr
                            };
                        }
                        public static final class DocsBpi2CmtsAuthCmMacAddressEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmMacAddressEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmMacAddress", "1.3.6.1.2.1.126.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmBpiVersionEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmBpiVersionEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmBpiVersion", "1.3.6.1.2.1.126.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmPublicKeyEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmPublicKeyEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmPublicKey", "1.3.6.1.2.1.126.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmKeySequenceNumberEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmKeySequenceNumberEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmKeySequenceNumber", "1.3.6.1.2.1.126.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmExpiresOldEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmExpiresOldEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmExpiresOld", "1.3.6.1.2.1.126.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmExpiresNewEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmExpiresNewEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmExpiresNew", "1.3.6.1.2.1.126.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmLifetimeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmLifetimeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmLifetime", "1.3.6.1.2.1.126.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmResetEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmResetEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmReset", "1.3.6.1.2.1.126.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmInfosEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmInfosEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmInfos", "1.3.6.1.2.1.126.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmRequests", "1.3.6.1.2.1.126.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmReplies", "1.3.6.1.2.1.126.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmRejects", "1.3.6.1.2.1.126.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCmInvalidsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCmInvalidsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCmInvalids", "1.3.6.1.2.1.126.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthRejectErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthRejectErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthRejectErrorCode", "1.3.6.1.2.1.126.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthRejectErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthRejectErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthRejectErrorString", "1.3.6.1.2.1.126.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthInvalidErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthInvalidErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthInvalidErrorCode", "1.3.6.1.2.1.126.1.2.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthInvalidErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthInvalidErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthInvalidErrorString", "1.3.6.1.2.1.126.1.2.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthPrimarySAIdEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthPrimarySAIdEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthPrimarySAId", "1.3.6.1.2.1.126.1.2.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthBpkmCmCertValidEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthBpkmCmCertValidEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthBpkmCmCertValid", "1.3.6.1.2.1.126.1.2.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthBpkmCmCertEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthBpkmCmCertEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthBpkmCmCert", "1.3.6.1.2.1.126.1.2.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsAuthCACertIndexPtrEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsAuthCACertIndexPtrEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsAuthCACertIndexPtr", "1.3.6.1.2.1.126.1.2.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpi2CmtsTEKTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    public final DocsBpi2CmtsTEKEntryEnt docsBpi2CmtsTEKEntry;

                    private DocsBpi2CmtsTEKTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsTEKTable", "1.3.6.1.2.1.126.1.2.3", false, true, false, false);
                        this.docsBpi2CmtsTEKEntry = new DocsBpi2CmtsTEKEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmtsTEKEntry
                        };
                    }
                    public static final class DocsBpi2CmtsTEKEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsTEKSAIdEnt docsBpi2CmtsTEKSAId;

                        public final DocsBpi2CmtsTEKSATypeEnt docsBpi2CmtsTEKSAType;

                        public final DocsBpi2CmtsTEKDataEncryptAlgEnt docsBpi2CmtsTEKDataEncryptAlg;

                        public final DocsBpi2CmtsTEKDataAuthentAlgEnt docsBpi2CmtsTEKDataAuthentAlg;

                        public final DocsBpi2CmtsTEKLifetimeEnt docsBpi2CmtsTEKLifetime;

                        public final DocsBpi2CmtsTEKKeySequenceNumberEnt docsBpi2CmtsTEKKeySequenceNumber;

                        public final DocsBpi2CmtsTEKExpiresOldEnt docsBpi2CmtsTEKExpiresOld;

                        public final DocsBpi2CmtsTEKExpiresNewEnt docsBpi2CmtsTEKExpiresNew;

                        public final DocsBpi2CmtsTEKResetEnt docsBpi2CmtsTEKReset;

                        public final DocsBpi2CmtsKeyRequestsEnt docsBpi2CmtsKeyRequests;

                        public final DocsBpi2CmtsKeyRepliesEnt docsBpi2CmtsKeyReplies;

                        public final DocsBpi2CmtsKeyRejectsEnt docsBpi2CmtsKeyRejects;

                        public final DocsBpi2CmtsTEKInvalidsEnt docsBpi2CmtsTEKInvalids;

                        public final DocsBpi2CmtsKeyRejectErrorCodeEnt docsBpi2CmtsKeyRejectErrorCode;

                        public final DocsBpi2CmtsKeyRejectErrorStringEnt docsBpi2CmtsKeyRejectErrorString;

                        public final DocsBpi2CmtsTEKInvalidErrorCodeEnt docsBpi2CmtsTEKInvalidErrorCode;

                        public final DocsBpi2CmtsTEKInvalidErrorStringEnt docsBpi2CmtsTEKInvalidErrorString;

                        private DocsBpi2CmtsTEKEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsTEKEntry", "1.3.6.1.2.1.126.1.2.3.1", false, false, false, true);
                            this.docsBpi2CmtsTEKSAId = new DocsBpi2CmtsTEKSAIdEnt(mib, this);
                            this.docsBpi2CmtsTEKSAType = new DocsBpi2CmtsTEKSATypeEnt(mib, this);
                            this.docsBpi2CmtsTEKDataEncryptAlg = new DocsBpi2CmtsTEKDataEncryptAlgEnt(mib, this);
                            this.docsBpi2CmtsTEKDataAuthentAlg = new DocsBpi2CmtsTEKDataAuthentAlgEnt(mib, this);
                            this.docsBpi2CmtsTEKLifetime = new DocsBpi2CmtsTEKLifetimeEnt(mib, this);
                            this.docsBpi2CmtsTEKKeySequenceNumber = new DocsBpi2CmtsTEKKeySequenceNumberEnt(mib, this);
                            this.docsBpi2CmtsTEKExpiresOld = new DocsBpi2CmtsTEKExpiresOldEnt(mib, this);
                            this.docsBpi2CmtsTEKExpiresNew = new DocsBpi2CmtsTEKExpiresNewEnt(mib, this);
                            this.docsBpi2CmtsTEKReset = new DocsBpi2CmtsTEKResetEnt(mib, this);
                            this.docsBpi2CmtsKeyRequests = new DocsBpi2CmtsKeyRequestsEnt(mib, this);
                            this.docsBpi2CmtsKeyReplies = new DocsBpi2CmtsKeyRepliesEnt(mib, this);
                            this.docsBpi2CmtsKeyRejects = new DocsBpi2CmtsKeyRejectsEnt(mib, this);
                            this.docsBpi2CmtsTEKInvalids = new DocsBpi2CmtsTEKInvalidsEnt(mib, this);
                            this.docsBpi2CmtsKeyRejectErrorCode = new DocsBpi2CmtsKeyRejectErrorCodeEnt(mib, this);
                            this.docsBpi2CmtsKeyRejectErrorString = new DocsBpi2CmtsKeyRejectErrorStringEnt(mib, this);
                            this.docsBpi2CmtsTEKInvalidErrorCode = new DocsBpi2CmtsTEKInvalidErrorCodeEnt(mib, this);
                            this.docsBpi2CmtsTEKInvalidErrorString = new DocsBpi2CmtsTEKInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsTEKSAId,
                                this.docsBpi2CmtsTEKSAType,
                                this.docsBpi2CmtsTEKDataEncryptAlg,
                                this.docsBpi2CmtsTEKDataAuthentAlg,
                                this.docsBpi2CmtsTEKLifetime,
                                this.docsBpi2CmtsTEKKeySequenceNumber,
                                this.docsBpi2CmtsTEKExpiresOld,
                                this.docsBpi2CmtsTEKExpiresNew,
                                this.docsBpi2CmtsTEKReset,
                                this.docsBpi2CmtsKeyRequests,
                                this.docsBpi2CmtsKeyReplies,
                                this.docsBpi2CmtsKeyRejects,
                                this.docsBpi2CmtsTEKInvalids,
                                this.docsBpi2CmtsKeyRejectErrorCode,
                                this.docsBpi2CmtsKeyRejectErrorString,
                                this.docsBpi2CmtsTEKInvalidErrorCode,
                                this.docsBpi2CmtsTEKInvalidErrorString
                            };
                        }
                        public static final class DocsBpi2CmtsTEKSAIdEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKSAIdEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKSAId", "1.3.6.1.2.1.126.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKSATypeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKSATypeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKSAType", "1.3.6.1.2.1.126.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKDataEncryptAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKDataEncryptAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKDataEncryptAlg", "1.3.6.1.2.1.126.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKDataAuthentAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKDataAuthentAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKDataAuthentAlg", "1.3.6.1.2.1.126.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKLifetimeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKLifetimeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKLifetime", "1.3.6.1.2.1.126.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKKeySequenceNumberEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKKeySequenceNumberEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKKeySequenceNumber", "1.3.6.1.2.1.126.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKExpiresOldEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKExpiresOldEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKExpiresOld", "1.3.6.1.2.1.126.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKExpiresNewEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKExpiresNewEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKExpiresNew", "1.3.6.1.2.1.126.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKResetEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKResetEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKReset", "1.3.6.1.2.1.126.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsKeyRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsKeyRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsKeyRequests", "1.3.6.1.2.1.126.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsKeyRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsKeyRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsKeyReplies", "1.3.6.1.2.1.126.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsKeyRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsKeyRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsKeyRejects", "1.3.6.1.2.1.126.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKInvalidsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKInvalidsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKInvalids", "1.3.6.1.2.1.126.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsKeyRejectErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsKeyRejectErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsKeyRejectErrorCode", "1.3.6.1.2.1.126.1.2.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsKeyRejectErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsKeyRejectErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsKeyRejectErrorString", "1.3.6.1.2.1.126.1.2.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKInvalidErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKInvalidErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKInvalidErrorCode", "1.3.6.1.2.1.126.1.2.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpi2CmtsTEKInvalidErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            private DocsBpi2CmtsTEKInvalidErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsTEKInvalidErrorString", "1.3.6.1.2.1.126.1.2.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpi2CmtsMulticastObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    /** The CMTS IP Multicast Mapping Table, indexed bydocsBpi2CmtsIpMulticastIndex, and by ifIndex*/
                    public final DocsBpi2CmtsIpMulticastMapTableEnt docsBpi2CmtsIpMulticastMapTable;

                    /** The CMTS Multicast SAID Authorization Table,indexed by ifIndex bymulticast SAID by CM MAC address*/
                    public final DocsBpi2CmtsMulticastAuthTableEnt docsBpi2CmtsMulticastAuthTable;

                    private DocsBpi2CmtsMulticastObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsMulticastObjects", "1.3.6.1.2.1.126.1.2.4", false, false, false, false);
                        this.docsBpi2CmtsIpMulticastMapTable = new DocsBpi2CmtsIpMulticastMapTableEnt(mib, this);
                        this.docsBpi2CmtsMulticastAuthTable = new DocsBpi2CmtsMulticastAuthTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmtsIpMulticastMapTable,
                            this.docsBpi2CmtsMulticastAuthTable
                        };
                    }
                    public static final class DocsBpi2CmtsIpMulticastMapTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsIpMulticastMapEntryEnt docsBpi2CmtsIpMulticastMapEntry;

                        private DocsBpi2CmtsIpMulticastMapTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsIpMulticastMapTable", "1.3.6.1.2.1.126.1.2.4.1", false, true, false, false);
                            this.docsBpi2CmtsIpMulticastMapEntry = new DocsBpi2CmtsIpMulticastMapEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsIpMulticastMapEntry
                            };
                        }
                        public static final class DocsBpi2CmtsIpMulticastMapEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            public final DocsBpi2CmtsIpMulticastIndexEnt docsBpi2CmtsIpMulticastIndex;

                            public final DocsBpi2CmtsIpMulticastAddressTypeEnt docsBpi2CmtsIpMulticastAddressType;

                            public final DocsBpi2CmtsIpMulticastAddressEnt docsBpi2CmtsIpMulticastAddress;

                            public final DocsBpi2CmtsIpMulticastMaskEnt docsBpi2CmtsIpMulticastMask;

                            public final DocsBpi2CmtsIpMulticastSAIdEnt docsBpi2CmtsIpMulticastSAId;

                            public final DocsBpi2CmtsIpMulticastSATypeEnt docsBpi2CmtsIpMulticastSAType;

                            public final DocsBpi2CmtsIpMulticastDataEncryptAlgEnt docsBpi2CmtsIpMulticastDataEncryptAlg;

                            public final DocsBpi2CmtsIpMulticastDataAuthentAlgEnt docsBpi2CmtsIpMulticastDataAuthentAlg;

                            public final DocsBpi2CmtsIpMulticastSAMapRequestsEnt docsBpi2CmtsIpMulticastSAMapRequests;

                            public final DocsBpi2CmtsIpMulticastSAMapRepliesEnt docsBpi2CmtsIpMulticastSAMapReplies;

                            public final DocsBpi2CmtsIpMulticastSAMapRejectsEnt docsBpi2CmtsIpMulticastSAMapRejects;

                            public final DocsBpi2CmtsIpMulticastSAMapRejectErrorCodeEnt docsBpi2CmtsIpMulticastSAMapRejectErrorCode;

                            public final DocsBpi2CmtsIpMulticastSAMapRejectErrorStringEnt docsBpi2CmtsIpMulticastSAMapRejectErrorString;

                            public final DocsBpi2CmtsIpMulticastMapControlEnt docsBpi2CmtsIpMulticastMapControl;

                            public final DocsBpi2CmtsIpMulticastMapStorageTypeEnt docsBpi2CmtsIpMulticastMapStorageType;

                            private DocsBpi2CmtsIpMulticastMapEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsIpMulticastMapEntry", "1.3.6.1.2.1.126.1.2.4.1.1", false, false, false, true);
                                this.docsBpi2CmtsIpMulticastIndex = new DocsBpi2CmtsIpMulticastIndexEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastAddressType = new DocsBpi2CmtsIpMulticastAddressTypeEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastAddress = new DocsBpi2CmtsIpMulticastAddressEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastMask = new DocsBpi2CmtsIpMulticastMaskEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAId = new DocsBpi2CmtsIpMulticastSAIdEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAType = new DocsBpi2CmtsIpMulticastSATypeEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastDataEncryptAlg = new DocsBpi2CmtsIpMulticastDataEncryptAlgEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastDataAuthentAlg = new DocsBpi2CmtsIpMulticastDataAuthentAlgEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAMapRequests = new DocsBpi2CmtsIpMulticastSAMapRequestsEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAMapReplies = new DocsBpi2CmtsIpMulticastSAMapRepliesEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAMapRejects = new DocsBpi2CmtsIpMulticastSAMapRejectsEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAMapRejectErrorCode = new DocsBpi2CmtsIpMulticastSAMapRejectErrorCodeEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastSAMapRejectErrorString = new DocsBpi2CmtsIpMulticastSAMapRejectErrorStringEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastMapControl = new DocsBpi2CmtsIpMulticastMapControlEnt(mib, this);
                                this.docsBpi2CmtsIpMulticastMapStorageType = new DocsBpi2CmtsIpMulticastMapStorageTypeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpi2CmtsIpMulticastIndex,
                                    this.docsBpi2CmtsIpMulticastAddressType,
                                    this.docsBpi2CmtsIpMulticastAddress,
                                    this.docsBpi2CmtsIpMulticastMask,
                                    this.docsBpi2CmtsIpMulticastSAId,
                                    this.docsBpi2CmtsIpMulticastSAType,
                                    this.docsBpi2CmtsIpMulticastDataEncryptAlg,
                                    this.docsBpi2CmtsIpMulticastDataAuthentAlg,
                                    this.docsBpi2CmtsIpMulticastSAMapRequests,
                                    this.docsBpi2CmtsIpMulticastSAMapReplies,
                                    this.docsBpi2CmtsIpMulticastSAMapRejects,
                                    this.docsBpi2CmtsIpMulticastSAMapRejectErrorCode,
                                    this.docsBpi2CmtsIpMulticastSAMapRejectErrorString,
                                    this.docsBpi2CmtsIpMulticastMapControl,
                                    this.docsBpi2CmtsIpMulticastMapStorageType
                                };
                            }
                            public static final class DocsBpi2CmtsIpMulticastIndexEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastIndexEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastIndex", "1.3.6.1.2.1.126.1.2.4.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastAddressTypeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastAddressTypeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastAddressType", "1.3.6.1.2.1.126.1.2.4.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastAddressEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastAddressEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastAddress", "1.3.6.1.2.1.126.1.2.4.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastMaskEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastMaskEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastMask", "1.3.6.1.2.1.126.1.2.4.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSAIdEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSAIdEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAId", "1.3.6.1.2.1.126.1.2.4.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSATypeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSATypeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAType", "1.3.6.1.2.1.126.1.2.4.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastDataEncryptAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastDataEncryptAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastDataEncryptAlg", "1.3.6.1.2.1.126.1.2.4.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastDataAuthentAlgEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastDataAuthentAlgEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastDataAuthentAlg", "1.3.6.1.2.1.126.1.2.4.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSAMapRequestsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSAMapRequestsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAMapRequests", "1.3.6.1.2.1.126.1.2.4.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSAMapRepliesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSAMapRepliesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAMapReplies", "1.3.6.1.2.1.126.1.2.4.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSAMapRejectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSAMapRejectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAMapRejects", "1.3.6.1.2.1.126.1.2.4.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSAMapRejectErrorCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSAMapRejectErrorCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAMapRejectErrorCode", "1.3.6.1.2.1.126.1.2.4.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastSAMapRejectErrorStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastSAMapRejectErrorStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastSAMapRejectErrorString", "1.3.6.1.2.1.126.1.2.4.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastMapControlEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastMapControlEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastMapControl", "1.3.6.1.2.1.126.1.2.4.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsIpMulticastMapStorageTypeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsIpMulticastMapStorageTypeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsIpMulticastMapStorageType", "1.3.6.1.2.1.126.1.2.4.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class DocsBpi2CmtsMulticastAuthTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsMulticastAuthEntryEnt docsBpi2CmtsMulticastAuthEntry;

                        private DocsBpi2CmtsMulticastAuthTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsMulticastAuthTable", "1.3.6.1.2.1.126.1.2.4.2", false, true, false, false);
                            this.docsBpi2CmtsMulticastAuthEntry = new DocsBpi2CmtsMulticastAuthEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsMulticastAuthEntry
                            };
                        }
                        public static final class DocsBpi2CmtsMulticastAuthEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            public final DocsBpi2CmtsMulticastAuthSAIdEnt docsBpi2CmtsMulticastAuthSAId;

                            public final DocsBpi2CmtsMulticastAuthCmMacAddressEnt docsBpi2CmtsMulticastAuthCmMacAddress;

                            public final DocsBpi2CmtsMulticastAuthControlEnt docsBpi2CmtsMulticastAuthControl;

                            private DocsBpi2CmtsMulticastAuthEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsMulticastAuthEntry", "1.3.6.1.2.1.126.1.2.4.2.1", false, false, false, true);
                                this.docsBpi2CmtsMulticastAuthSAId = new DocsBpi2CmtsMulticastAuthSAIdEnt(mib, this);
                                this.docsBpi2CmtsMulticastAuthCmMacAddress = new DocsBpi2CmtsMulticastAuthCmMacAddressEnt(mib, this);
                                this.docsBpi2CmtsMulticastAuthControl = new DocsBpi2CmtsMulticastAuthControlEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpi2CmtsMulticastAuthSAId,
                                    this.docsBpi2CmtsMulticastAuthCmMacAddress,
                                    this.docsBpi2CmtsMulticastAuthControl
                                };
                            }
                            public static final class DocsBpi2CmtsMulticastAuthSAIdEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsMulticastAuthSAIdEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsMulticastAuthSAId", "1.3.6.1.2.1.126.1.2.4.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsMulticastAuthCmMacAddressEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsMulticastAuthCmMacAddressEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsMulticastAuthCmMacAddress", "1.3.6.1.2.1.126.1.2.4.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsMulticastAuthControlEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsMulticastAuthControlEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsMulticastAuthControl", "1.3.6.1.2.1.126.1.2.4.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class DocsBpi2CmtsCertObjectsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    /** CMTS Provisioned CM Cert Table*/
                    public final DocsBpi2CmtsProvisionedCmCertTableEnt docsBpi2CmtsProvisionedCmCertTable;

                    /** CMTS CA Cert Table*/
                    public final DocsBpi2CmtsCACertTableEnt docsBpi2CmtsCACertTable;

                    private DocsBpi2CmtsCertObjectsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsCertObjects", "1.3.6.1.2.1.126.1.2.5", false, false, false, false);
                        this.docsBpi2CmtsProvisionedCmCertTable = new DocsBpi2CmtsProvisionedCmCertTableEnt(mib, this);
                        this.docsBpi2CmtsCACertTable = new DocsBpi2CmtsCACertTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpi2CmtsProvisionedCmCertTable,
                            this.docsBpi2CmtsCACertTable
                        };
                    }
                    public static final class DocsBpi2CmtsProvisionedCmCertTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsProvisionedCmCertEntryEnt docsBpi2CmtsProvisionedCmCertEntry;

                        private DocsBpi2CmtsProvisionedCmCertTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsProvisionedCmCertTable", "1.3.6.1.2.1.126.1.2.5.1", false, true, false, false);
                            this.docsBpi2CmtsProvisionedCmCertEntry = new DocsBpi2CmtsProvisionedCmCertEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsProvisionedCmCertEntry
                            };
                        }
                        public static final class DocsBpi2CmtsProvisionedCmCertEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            public final DocsBpi2CmtsProvisionedCmCertMacAddressEnt docsBpi2CmtsProvisionedCmCertMacAddress;

                            public final DocsBpi2CmtsProvisionedCmCertTrustEnt docsBpi2CmtsProvisionedCmCertTrust;

                            public final DocsBpi2CmtsProvisionedCmCertSourceEnt docsBpi2CmtsProvisionedCmCertSource;

                            public final DocsBpi2CmtsProvisionedCmCertStatusEnt docsBpi2CmtsProvisionedCmCertStatus;

                            public final DocsBpi2CmtsProvisionedCmCertEnt docsBpi2CmtsProvisionedCmCert;

                            private DocsBpi2CmtsProvisionedCmCertEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsProvisionedCmCertEntry", "1.3.6.1.2.1.126.1.2.5.1.1", false, false, false, true);
                                this.docsBpi2CmtsProvisionedCmCertMacAddress = new DocsBpi2CmtsProvisionedCmCertMacAddressEnt(mib, this);
                                this.docsBpi2CmtsProvisionedCmCertTrust = new DocsBpi2CmtsProvisionedCmCertTrustEnt(mib, this);
                                this.docsBpi2CmtsProvisionedCmCertSource = new DocsBpi2CmtsProvisionedCmCertSourceEnt(mib, this);
                                this.docsBpi2CmtsProvisionedCmCertStatus = new DocsBpi2CmtsProvisionedCmCertStatusEnt(mib, this);
                                this.docsBpi2CmtsProvisionedCmCert = new DocsBpi2CmtsProvisionedCmCertEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpi2CmtsProvisionedCmCertMacAddress,
                                    this.docsBpi2CmtsProvisionedCmCertTrust,
                                    this.docsBpi2CmtsProvisionedCmCertSource,
                                    this.docsBpi2CmtsProvisionedCmCertStatus,
                                    this.docsBpi2CmtsProvisionedCmCert
                                };
                            }
                            public static final class DocsBpi2CmtsProvisionedCmCertMacAddressEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsProvisionedCmCertMacAddressEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsProvisionedCmCertMacAddress", "1.3.6.1.2.1.126.1.2.5.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsProvisionedCmCertTrustEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsProvisionedCmCertTrustEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsProvisionedCmCertTrust", "1.3.6.1.2.1.126.1.2.5.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsProvisionedCmCertSourceEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsProvisionedCmCertSourceEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsProvisionedCmCertSource", "1.3.6.1.2.1.126.1.2.5.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsProvisionedCmCertStatusEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsProvisionedCmCertStatusEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsProvisionedCmCertStatus", "1.3.6.1.2.1.126.1.2.5.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsProvisionedCmCertEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsProvisionedCmCertEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsProvisionedCmCert", "1.3.6.1.2.1.126.1.2.5.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class DocsBpi2CmtsCACertTableEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                    {
                        public final DocsBpi2CmtsCACertEntryEnt docsBpi2CmtsCACertEntry;

                        private DocsBpi2CmtsCACertTableEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                        {
                            super(mib, parent, "docsBpi2CmtsCACertTable", "1.3.6.1.2.1.126.1.2.5.2", false, true, false, false);
                            this.docsBpi2CmtsCACertEntry = new DocsBpi2CmtsCACertEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpi2CmtsCACertEntry
                            };
                        }
                        public static final class DocsBpi2CmtsCACertEntryEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                        {
                            public final DocsBpi2CmtsCACertIndexEnt docsBpi2CmtsCACertIndex;

                            public final DocsBpi2CmtsCACertSubjectEnt docsBpi2CmtsCACertSubject;

                            public final DocsBpi2CmtsCACertIssuerEnt docsBpi2CmtsCACertIssuer;

                            public final DocsBpi2CmtsCACertSerialNumberEnt docsBpi2CmtsCACertSerialNumber;

                            public final DocsBpi2CmtsCACertTrustEnt docsBpi2CmtsCACertTrust;

                            public final DocsBpi2CmtsCACertSourceEnt docsBpi2CmtsCACertSource;

                            public final DocsBpi2CmtsCACertStatusEnt docsBpi2CmtsCACertStatus;

                            public final DocsBpi2CmtsCACertEnt docsBpi2CmtsCACert;

                            public final DocsBpi2CmtsCACertThumbprintEnt docsBpi2CmtsCACertThumbprint;

                            private DocsBpi2CmtsCACertEntryEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                            {
                                super(mib, parent, "docsBpi2CmtsCACertEntry", "1.3.6.1.2.1.126.1.2.5.2.1", false, false, false, true);
                                this.docsBpi2CmtsCACertIndex = new DocsBpi2CmtsCACertIndexEnt(mib, this);
                                this.docsBpi2CmtsCACertSubject = new DocsBpi2CmtsCACertSubjectEnt(mib, this);
                                this.docsBpi2CmtsCACertIssuer = new DocsBpi2CmtsCACertIssuerEnt(mib, this);
                                this.docsBpi2CmtsCACertSerialNumber = new DocsBpi2CmtsCACertSerialNumberEnt(mib, this);
                                this.docsBpi2CmtsCACertTrust = new DocsBpi2CmtsCACertTrustEnt(mib, this);
                                this.docsBpi2CmtsCACertSource = new DocsBpi2CmtsCACertSourceEnt(mib, this);
                                this.docsBpi2CmtsCACertStatus = new DocsBpi2CmtsCACertStatusEnt(mib, this);
                                this.docsBpi2CmtsCACert = new DocsBpi2CmtsCACertEnt(mib, this);
                                this.docsBpi2CmtsCACertThumbprint = new DocsBpi2CmtsCACertThumbprintEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpi2CmtsCACertIndex,
                                    this.docsBpi2CmtsCACertSubject,
                                    this.docsBpi2CmtsCACertIssuer,
                                    this.docsBpi2CmtsCACertSerialNumber,
                                    this.docsBpi2CmtsCACertTrust,
                                    this.docsBpi2CmtsCACertSource,
                                    this.docsBpi2CmtsCACertStatus,
                                    this.docsBpi2CmtsCACert,
                                    this.docsBpi2CmtsCACertThumbprint
                                };
                            }
                            public static final class DocsBpi2CmtsCACertIndexEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertIndexEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertIndex", "1.3.6.1.2.1.126.1.2.5.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertSubjectEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertSubjectEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertSubject", "1.3.6.1.2.1.126.1.2.5.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertIssuerEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertIssuerEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertIssuer", "1.3.6.1.2.1.126.1.2.5.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertSerialNumberEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertSerialNumberEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertSerialNumber", "1.3.6.1.2.1.126.1.2.5.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertTrustEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertTrustEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertTrust", "1.3.6.1.2.1.126.1.2.5.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertSourceEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertSourceEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertSource", "1.3.6.1.2.1.126.1.2.5.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertStatusEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertStatusEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertStatus", "1.3.6.1.2.1.126.1.2.5.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACert", "1.3.6.1.2.1.126.1.2.5.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpi2CmtsCACertThumbprintEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                            {
                                private DocsBpi2CmtsCACertThumbprintEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                                {
                                    super(mib, parent, "docsBpi2CmtsCACertThumbprint", "1.3.6.1.2.1.126.1.2.5.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class DocsBpi2CodeDownloadControlEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
            {
                public final DocsBpi2CodeDownloadStatusCodeEnt docsBpi2CodeDownloadStatusCode;

                public final DocsBpi2CodeDownloadStatusStringEnt docsBpi2CodeDownloadStatusString;

                public final DocsBpi2CodeMfgOrgNameEnt docsBpi2CodeMfgOrgName;

                public final DocsBpi2CodeMfgCodeAccessStartEnt docsBpi2CodeMfgCodeAccessStart;

                public final DocsBpi2CodeMfgCvcAccessStartEnt docsBpi2CodeMfgCvcAccessStart;

                public final DocsBpi2CodeCoSignerOrgNameEnt docsBpi2CodeCoSignerOrgName;

                public final DocsBpi2CodeCoSignerCodeAccessStartEnt docsBpi2CodeCoSignerCodeAccessStart;

                public final DocsBpi2CodeCoSignerCvcAccessStartEnt docsBpi2CodeCoSignerCvcAccessStart;

                public final DocsBpi2CodeCvcUpdateEnt docsBpi2CodeCvcUpdate;

                private DocsBpi2CodeDownloadControlEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                {
                    super(mib, parent, "docsBpi2CodeDownloadControl", "1.3.6.1.2.1.126.1.4", false, false, false, false);
                    this.docsBpi2CodeDownloadStatusCode = new DocsBpi2CodeDownloadStatusCodeEnt(mib, this);
                    this.docsBpi2CodeDownloadStatusString = new DocsBpi2CodeDownloadStatusStringEnt(mib, this);
                    this.docsBpi2CodeMfgOrgName = new DocsBpi2CodeMfgOrgNameEnt(mib, this);
                    this.docsBpi2CodeMfgCodeAccessStart = new DocsBpi2CodeMfgCodeAccessStartEnt(mib, this);
                    this.docsBpi2CodeMfgCvcAccessStart = new DocsBpi2CodeMfgCvcAccessStartEnt(mib, this);
                    this.docsBpi2CodeCoSignerOrgName = new DocsBpi2CodeCoSignerOrgNameEnt(mib, this);
                    this.docsBpi2CodeCoSignerCodeAccessStart = new DocsBpi2CodeCoSignerCodeAccessStartEnt(mib, this);
                    this.docsBpi2CodeCoSignerCvcAccessStart = new DocsBpi2CodeCoSignerCvcAccessStartEnt(mib, this);
                    this.docsBpi2CodeCvcUpdate = new DocsBpi2CodeCvcUpdateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpi2CodeDownloadStatusCode,
                        this.docsBpi2CodeDownloadStatusString,
                        this.docsBpi2CodeMfgOrgName,
                        this.docsBpi2CodeMfgCodeAccessStart,
                        this.docsBpi2CodeMfgCvcAccessStart,
                        this.docsBpi2CodeCoSignerOrgName,
                        this.docsBpi2CodeCoSignerCodeAccessStart,
                        this.docsBpi2CodeCoSignerCvcAccessStart,
                        this.docsBpi2CodeCvcUpdate
                    };
                }
                public static final class DocsBpi2CodeDownloadStatusCodeEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeDownloadStatusCodeEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeDownloadStatusCode", "1.3.6.1.2.1.126.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeDownloadStatusStringEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeDownloadStatusStringEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeDownloadStatusString", "1.3.6.1.2.1.126.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeMfgOrgNameEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeMfgOrgNameEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeMfgOrgName", "1.3.6.1.2.1.126.1.4.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeMfgCodeAccessStartEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeMfgCodeAccessStartEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeMfgCodeAccessStart", "1.3.6.1.2.1.126.1.4.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeMfgCvcAccessStartEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeMfgCvcAccessStartEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeMfgCvcAccessStart", "1.3.6.1.2.1.126.1.4.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeCoSignerOrgNameEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeCoSignerOrgNameEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeCoSignerOrgName", "1.3.6.1.2.1.126.1.4.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeCoSignerCodeAccessStartEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeCoSignerCodeAccessStartEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeCoSignerCodeAccessStart", "1.3.6.1.2.1.126.1.4.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeCoSignerCvcAccessStartEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeCoSignerCvcAccessStartEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeCoSignerCvcAccessStart", "1.3.6.1.2.1.126.1.4.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeCvcUpdateEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeCvcUpdateEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeCvcUpdate", "1.3.6.1.2.1.126.1.4.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DocsBpi2NotificationEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
        {
            private DocsBpi2NotificationEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
            {
                super(mib, parent, "docsBpi2Notification", "1.3.6.1.2.1.126.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsBpi2ConformanceEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
        {
            public final DocsBpi2CompliancesEnt docsBpi2Compliances;

            public final DocsBpi2GroupsEnt docsBpi2Groups;

            private DocsBpi2ConformanceEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
            {
                super(mib, parent, "docsBpi2Conformance", "1.3.6.1.2.1.126.2", false, false, false, false);
                this.docsBpi2Compliances = new DocsBpi2CompliancesEnt(mib, this);
                this.docsBpi2Groups = new DocsBpi2GroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsBpi2Compliances,
                    this.docsBpi2Groups
                };
            }
            public static final class DocsBpi2CompliancesEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
            {
                public final DocsBpi2CmComplianceEnt docsBpi2CmCompliance;

                public final DocsBpi2CmtsComplianceEnt docsBpi2CmtsCompliance;

                private DocsBpi2CompliancesEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                {
                    super(mib, parent, "docsBpi2Compliances", "1.3.6.1.2.1.126.2.1", false, false, false, false);
                    this.docsBpi2CmCompliance = new DocsBpi2CmComplianceEnt(mib, this);
                    this.docsBpi2CmtsCompliance = new DocsBpi2CmtsComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpi2CmCompliance,
                        this.docsBpi2CmtsCompliance
                    };
                }
                public static final class DocsBpi2CmComplianceEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CmComplianceEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmCompliance", "1.3.6.1.2.1.126.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CmtsComplianceEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CmtsComplianceEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsCompliance", "1.3.6.1.2.1.126.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsBpi2GroupsEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
            {
                public final DocsBpi2CmGroupEnt docsBpi2CmGroup;

                public final DocsBpi2CmtsGroupEnt docsBpi2CmtsGroup;

                public final DocsBpi2CodeDownloadGroupEnt docsBpi2CodeDownloadGroup;

                private DocsBpi2GroupsEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                {
                    super(mib, parent, "docsBpi2Groups", "1.3.6.1.2.1.126.2.2", false, false, false, false);
                    this.docsBpi2CmGroup = new DocsBpi2CmGroupEnt(mib, this);
                    this.docsBpi2CmtsGroup = new DocsBpi2CmtsGroupEnt(mib, this);
                    this.docsBpi2CodeDownloadGroup = new DocsBpi2CodeDownloadGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpi2CmGroup,
                        this.docsBpi2CmtsGroup,
                        this.docsBpi2CodeDownloadGroup
                    };
                }
                public static final class DocsBpi2CmGroupEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CmGroupEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmGroup", "1.3.6.1.2.1.126.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CmtsGroupEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CmtsGroupEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CmtsGroup", "1.3.6.1.2.1.126.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpi2CodeDownloadGroupEnt extends MIBEntry<DOCSIETFBPI2MIBDef>
                {
                    private DocsBpi2CodeDownloadGroupEnt(DOCSIETFBPI2MIBDef mib, MIBEntry<DOCSIETFBPI2MIBDef> parent)
                    {
                        super(mib, parent, "docsBpi2CodeDownloadGroup", "1.3.6.1.2.1.126.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
