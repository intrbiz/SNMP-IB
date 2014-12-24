package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DOCSBPIMIBDef extends MIB
{
    public static final DOCSBPIMIBDef DOCSBPIMIB = new DOCSBPIMIBDef();

    public final DocsBpiMIBEnt docsBpiMIB;

    private DOCSBPIMIBDef()
    {
        super("DOCS-BPI-MIB");
        this.docsBpiMIB = new DocsBpiMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsBpiMIB
        };
    }

    public static final class DocsBpiMIBEnt extends MIBEntry<DOCSBPIMIBDef>
    {
        public final DocsBpiMIBObjectsEnt docsBpiMIBObjects;

        /** The BPI MIB Conformance Statements (with a placeholder fornotifications)*/
        public final DocsBpiNotificationEnt docsBpiNotification;

        public final DocsBpiConformanceEnt docsBpiConformance;

        private DocsBpiMIBEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
        {
            super(mib, parent, "docsBpiMIB", "1.3.6.1.2.1.10.127.5", false, false, false, false);
            this.docsBpiMIBObjects = new DocsBpiMIBObjectsEnt(mib, this);
            this.docsBpiNotification = new DocsBpiNotificationEnt(mib, this);
            this.docsBpiConformance = new DocsBpiConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsBpiMIBObjects,
                this.docsBpiNotification,
                this.docsBpiConformance
            };
        }
        public static final class DocsBpiMIBObjectsEnt extends MIBEntry<DOCSBPIMIBDef>
        {
            /** Cable Modem Group*/
            public final DocsBpiCmObjectsEnt docsBpiCmObjects;

            /** Cable Modem Termination System Group*/
            public final DocsBpiCmtsObjectsEnt docsBpiCmtsObjects;

            private DocsBpiMIBObjectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
            {
                super(mib, parent, "docsBpiMIBObjects", "1.3.6.1.2.1.10.127.5.1", false, false, false, false);
                this.docsBpiCmObjects = new DocsBpiCmObjectsEnt(mib, this);
                this.docsBpiCmtsObjects = new DocsBpiCmtsObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsBpiCmObjects,
                    this.docsBpiCmtsObjects
                };
            }
            public static final class DocsBpiCmObjectsEnt extends MIBEntry<DOCSBPIMIBDef>
            {
                /** The BPI base and authorization table for CMs, indexed by ifIndex*/
                public final DocsBpiCmBaseTableEnt docsBpiCmBaseTable;

                /** The CM TEK Table, indexed by ifIndex and SID*/
                public final DocsBpiCmTEKTableEnt docsBpiCmTEKTable;

                private DocsBpiCmObjectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                {
                    super(mib, parent, "docsBpiCmObjects", "1.3.6.1.2.1.10.127.5.1.1", false, false, false, false);
                    this.docsBpiCmBaseTable = new DocsBpiCmBaseTableEnt(mib, this);
                    this.docsBpiCmTEKTable = new DocsBpiCmTEKTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpiCmBaseTable,
                        this.docsBpiCmTEKTable
                    };
                }
                public static final class DocsBpiCmBaseTableEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    public final DocsBpiCmBaseEntryEnt docsBpiCmBaseEntry;

                    private DocsBpiCmBaseTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmBaseTable", "1.3.6.1.2.1.10.127.5.1.1.1", false, true, false, false);
                        this.docsBpiCmBaseEntry = new DocsBpiCmBaseEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpiCmBaseEntry
                        };
                    }
                    public static final class DocsBpiCmBaseEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiCmPrivacyEnableEnt docsBpiCmPrivacyEnable;

                        public final DocsBpiCmPublicKeyEnt docsBpiCmPublicKey;

                        public final DocsBpiCmAuthStateEnt docsBpiCmAuthState;

                        public final DocsBpiCmAuthKeySequenceNumberEnt docsBpiCmAuthKeySequenceNumber;

                        public final DocsBpiCmAuthExpiresEnt docsBpiCmAuthExpires;

                        public final DocsBpiCmAuthResetEnt docsBpiCmAuthReset;

                        public final DocsBpiCmAuthGraceTimeEnt docsBpiCmAuthGraceTime;

                        public final DocsBpiCmTEKGraceTimeEnt docsBpiCmTEKGraceTime;

                        public final DocsBpiCmAuthWaitTimeoutEnt docsBpiCmAuthWaitTimeout;

                        public final DocsBpiCmReauthWaitTimeoutEnt docsBpiCmReauthWaitTimeout;

                        public final DocsBpiCmOpWaitTimeoutEnt docsBpiCmOpWaitTimeout;

                        public final DocsBpiCmRekeyWaitTimeoutEnt docsBpiCmRekeyWaitTimeout;

                        public final DocsBpiCmAuthRejectWaitTimeoutEnt docsBpiCmAuthRejectWaitTimeout;

                        public final DocsBpiCmAuthRequestsEnt docsBpiCmAuthRequests;

                        public final DocsBpiCmAuthRepliesEnt docsBpiCmAuthReplies;

                        public final DocsBpiCmAuthRejectsEnt docsBpiCmAuthRejects;

                        public final DocsBpiCmAuthInvalidsEnt docsBpiCmAuthInvalids;

                        public final DocsBpiCmAuthRejectErrorCodeEnt docsBpiCmAuthRejectErrorCode;

                        public final DocsBpiCmAuthRejectErrorStringEnt docsBpiCmAuthRejectErrorString;

                        public final DocsBpiCmAuthInvalidErrorCodeEnt docsBpiCmAuthInvalidErrorCode;

                        public final DocsBpiCmAuthInvalidErrorStringEnt docsBpiCmAuthInvalidErrorString;

                        private DocsBpiCmBaseEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiCmBaseEntry", "1.3.6.1.2.1.10.127.5.1.1.1.1", false, false, false, true);
                            this.docsBpiCmPrivacyEnable = new DocsBpiCmPrivacyEnableEnt(mib, this);
                            this.docsBpiCmPublicKey = new DocsBpiCmPublicKeyEnt(mib, this);
                            this.docsBpiCmAuthState = new DocsBpiCmAuthStateEnt(mib, this);
                            this.docsBpiCmAuthKeySequenceNumber = new DocsBpiCmAuthKeySequenceNumberEnt(mib, this);
                            this.docsBpiCmAuthExpires = new DocsBpiCmAuthExpiresEnt(mib, this);
                            this.docsBpiCmAuthReset = new DocsBpiCmAuthResetEnt(mib, this);
                            this.docsBpiCmAuthGraceTime = new DocsBpiCmAuthGraceTimeEnt(mib, this);
                            this.docsBpiCmTEKGraceTime = new DocsBpiCmTEKGraceTimeEnt(mib, this);
                            this.docsBpiCmAuthWaitTimeout = new DocsBpiCmAuthWaitTimeoutEnt(mib, this);
                            this.docsBpiCmReauthWaitTimeout = new DocsBpiCmReauthWaitTimeoutEnt(mib, this);
                            this.docsBpiCmOpWaitTimeout = new DocsBpiCmOpWaitTimeoutEnt(mib, this);
                            this.docsBpiCmRekeyWaitTimeout = new DocsBpiCmRekeyWaitTimeoutEnt(mib, this);
                            this.docsBpiCmAuthRejectWaitTimeout = new DocsBpiCmAuthRejectWaitTimeoutEnt(mib, this);
                            this.docsBpiCmAuthRequests = new DocsBpiCmAuthRequestsEnt(mib, this);
                            this.docsBpiCmAuthReplies = new DocsBpiCmAuthRepliesEnt(mib, this);
                            this.docsBpiCmAuthRejects = new DocsBpiCmAuthRejectsEnt(mib, this);
                            this.docsBpiCmAuthInvalids = new DocsBpiCmAuthInvalidsEnt(mib, this);
                            this.docsBpiCmAuthRejectErrorCode = new DocsBpiCmAuthRejectErrorCodeEnt(mib, this);
                            this.docsBpiCmAuthRejectErrorString = new DocsBpiCmAuthRejectErrorStringEnt(mib, this);
                            this.docsBpiCmAuthInvalidErrorCode = new DocsBpiCmAuthInvalidErrorCodeEnt(mib, this);
                            this.docsBpiCmAuthInvalidErrorString = new DocsBpiCmAuthInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiCmPrivacyEnable,
                                this.docsBpiCmPublicKey,
                                this.docsBpiCmAuthState,
                                this.docsBpiCmAuthKeySequenceNumber,
                                this.docsBpiCmAuthExpires,
                                this.docsBpiCmAuthReset,
                                this.docsBpiCmAuthGraceTime,
                                this.docsBpiCmTEKGraceTime,
                                this.docsBpiCmAuthWaitTimeout,
                                this.docsBpiCmReauthWaitTimeout,
                                this.docsBpiCmOpWaitTimeout,
                                this.docsBpiCmRekeyWaitTimeout,
                                this.docsBpiCmAuthRejectWaitTimeout,
                                this.docsBpiCmAuthRequests,
                                this.docsBpiCmAuthReplies,
                                this.docsBpiCmAuthRejects,
                                this.docsBpiCmAuthInvalids,
                                this.docsBpiCmAuthRejectErrorCode,
                                this.docsBpiCmAuthRejectErrorString,
                                this.docsBpiCmAuthInvalidErrorCode,
                                this.docsBpiCmAuthInvalidErrorString
                            };
                        }
                        public static final class DocsBpiCmPrivacyEnableEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmPrivacyEnableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmPrivacyEnable", "1.3.6.1.2.1.10.127.5.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmPublicKeyEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmPublicKeyEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmPublicKey", "1.3.6.1.2.1.10.127.5.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthStateEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthStateEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthState", "1.3.6.1.2.1.10.127.5.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthKeySequenceNumberEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthKeySequenceNumberEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthKeySequenceNumber", "1.3.6.1.2.1.10.127.5.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthExpiresEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthExpiresEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthExpires", "1.3.6.1.2.1.10.127.5.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthResetEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthResetEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthReset", "1.3.6.1.2.1.10.127.5.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthGraceTimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthGraceTimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthGraceTime", "1.3.6.1.2.1.10.127.5.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKGraceTimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKGraceTimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKGraceTime", "1.3.6.1.2.1.10.127.5.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthWaitTimeoutEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthWaitTimeoutEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthWaitTimeout", "1.3.6.1.2.1.10.127.5.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmReauthWaitTimeoutEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmReauthWaitTimeoutEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmReauthWaitTimeout", "1.3.6.1.2.1.10.127.5.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmOpWaitTimeoutEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmOpWaitTimeoutEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmOpWaitTimeout", "1.3.6.1.2.1.10.127.5.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmRekeyWaitTimeoutEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmRekeyWaitTimeoutEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmRekeyWaitTimeout", "1.3.6.1.2.1.10.127.5.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthRejectWaitTimeoutEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthRejectWaitTimeoutEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthRejectWaitTimeout", "1.3.6.1.2.1.10.127.5.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthRequestsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthRequestsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthRequests", "1.3.6.1.2.1.10.127.5.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthRepliesEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthRepliesEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthReplies", "1.3.6.1.2.1.10.127.5.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthRejectsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthRejectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthRejects", "1.3.6.1.2.1.10.127.5.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthInvalidsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthInvalidsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthInvalids", "1.3.6.1.2.1.10.127.5.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthRejectErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthRejectErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthRejectErrorCode", "1.3.6.1.2.1.10.127.5.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthRejectErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthRejectErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthRejectErrorString", "1.3.6.1.2.1.10.127.5.1.1.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthInvalidErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthInvalidErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthInvalidErrorCode", "1.3.6.1.2.1.10.127.5.1.1.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmAuthInvalidErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmAuthInvalidErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmAuthInvalidErrorString", "1.3.6.1.2.1.10.127.5.1.1.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpiCmTEKTableEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    public final DocsBpiCmTEKEntryEnt docsBpiCmTEKEntry;

                    private DocsBpiCmTEKTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmTEKTable", "1.3.6.1.2.1.10.127.5.1.1.2", false, true, false, false);
                        this.docsBpiCmTEKEntry = new DocsBpiCmTEKEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpiCmTEKEntry
                        };
                    }
                    public static final class DocsBpiCmTEKEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiCmTEKPrivacyEnableEnt docsBpiCmTEKPrivacyEnable;

                        public final DocsBpiCmTEKStateEnt docsBpiCmTEKState;

                        public final DocsBpiCmTEKExpiresOldEnt docsBpiCmTEKExpiresOld;

                        public final DocsBpiCmTEKExpiresNewEnt docsBpiCmTEKExpiresNew;

                        public final DocsBpiCmTEKKeyRequestsEnt docsBpiCmTEKKeyRequests;

                        public final DocsBpiCmTEKKeyRepliesEnt docsBpiCmTEKKeyReplies;

                        public final DocsBpiCmTEKKeyRejectsEnt docsBpiCmTEKKeyRejects;

                        public final DocsBpiCmTEKInvalidsEnt docsBpiCmTEKInvalids;

                        public final DocsBpiCmTEKAuthPendsEnt docsBpiCmTEKAuthPends;

                        public final DocsBpiCmTEKKeyRejectErrorCodeEnt docsBpiCmTEKKeyRejectErrorCode;

                        public final DocsBpiCmTEKKeyRejectErrorStringEnt docsBpiCmTEKKeyRejectErrorString;

                        public final DocsBpiCmTEKInvalidErrorCodeEnt docsBpiCmTEKInvalidErrorCode;

                        public final DocsBpiCmTEKInvalidErrorStringEnt docsBpiCmTEKInvalidErrorString;

                        private DocsBpiCmTEKEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiCmTEKEntry", "1.3.6.1.2.1.10.127.5.1.1.2.1", false, false, false, true);
                            this.docsBpiCmTEKPrivacyEnable = new DocsBpiCmTEKPrivacyEnableEnt(mib, this);
                            this.docsBpiCmTEKState = new DocsBpiCmTEKStateEnt(mib, this);
                            this.docsBpiCmTEKExpiresOld = new DocsBpiCmTEKExpiresOldEnt(mib, this);
                            this.docsBpiCmTEKExpiresNew = new DocsBpiCmTEKExpiresNewEnt(mib, this);
                            this.docsBpiCmTEKKeyRequests = new DocsBpiCmTEKKeyRequestsEnt(mib, this);
                            this.docsBpiCmTEKKeyReplies = new DocsBpiCmTEKKeyRepliesEnt(mib, this);
                            this.docsBpiCmTEKKeyRejects = new DocsBpiCmTEKKeyRejectsEnt(mib, this);
                            this.docsBpiCmTEKInvalids = new DocsBpiCmTEKInvalidsEnt(mib, this);
                            this.docsBpiCmTEKAuthPends = new DocsBpiCmTEKAuthPendsEnt(mib, this);
                            this.docsBpiCmTEKKeyRejectErrorCode = new DocsBpiCmTEKKeyRejectErrorCodeEnt(mib, this);
                            this.docsBpiCmTEKKeyRejectErrorString = new DocsBpiCmTEKKeyRejectErrorStringEnt(mib, this);
                            this.docsBpiCmTEKInvalidErrorCode = new DocsBpiCmTEKInvalidErrorCodeEnt(mib, this);
                            this.docsBpiCmTEKInvalidErrorString = new DocsBpiCmTEKInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiCmTEKPrivacyEnable,
                                this.docsBpiCmTEKState,
                                this.docsBpiCmTEKExpiresOld,
                                this.docsBpiCmTEKExpiresNew,
                                this.docsBpiCmTEKKeyRequests,
                                this.docsBpiCmTEKKeyReplies,
                                this.docsBpiCmTEKKeyRejects,
                                this.docsBpiCmTEKInvalids,
                                this.docsBpiCmTEKAuthPends,
                                this.docsBpiCmTEKKeyRejectErrorCode,
                                this.docsBpiCmTEKKeyRejectErrorString,
                                this.docsBpiCmTEKInvalidErrorCode,
                                this.docsBpiCmTEKInvalidErrorString
                            };
                        }
                        public static final class DocsBpiCmTEKPrivacyEnableEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKPrivacyEnableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKPrivacyEnable", "1.3.6.1.2.1.10.127.5.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKStateEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKStateEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKState", "1.3.6.1.2.1.10.127.5.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKExpiresOldEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKExpiresOldEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKExpiresOld", "1.3.6.1.2.1.10.127.5.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKExpiresNewEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKExpiresNewEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKExpiresNew", "1.3.6.1.2.1.10.127.5.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKKeyRequestsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKKeyRequestsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKKeyRequests", "1.3.6.1.2.1.10.127.5.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKKeyRepliesEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKKeyRepliesEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKKeyReplies", "1.3.6.1.2.1.10.127.5.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKKeyRejectsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKKeyRejectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKKeyRejects", "1.3.6.1.2.1.10.127.5.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKInvalidsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKInvalidsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKInvalids", "1.3.6.1.2.1.10.127.5.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKAuthPendsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKAuthPendsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKAuthPends", "1.3.6.1.2.1.10.127.5.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKKeyRejectErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKKeyRejectErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKKeyRejectErrorCode", "1.3.6.1.2.1.10.127.5.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKKeyRejectErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKKeyRejectErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKKeyRejectErrorString", "1.3.6.1.2.1.10.127.5.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKInvalidErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKInvalidErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKInvalidErrorCode", "1.3.6.1.2.1.10.127.5.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmTEKInvalidErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmTEKInvalidErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmTEKInvalidErrorString", "1.3.6.1.2.1.10.127.5.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DocsBpiCmtsObjectsEnt extends MIBEntry<DOCSBPIMIBDef>
            {
                /** The BPI base table for CMTSs, indexed by ifIndex*/
                public final DocsBpiCmtsBaseTableEnt docsBpiCmtsBaseTable;

                /** The CMTS Authorization Table, indexed by ifIndex and CM MAC address*/
                public final DocsBpiCmtsAuthTableEnt docsBpiCmtsAuthTable;

                /** The CMTS TEK Table, indexed by ifIndex and SID*/
                public final DocsBpiCmtsTEKTableEnt docsBpiCmtsTEKTable;

                /** The CMTS Multicast Control Group*/
                public final DocsBpiMulticastControlEnt docsBpiMulticastControl;

                private DocsBpiCmtsObjectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                {
                    super(mib, parent, "docsBpiCmtsObjects", "1.3.6.1.2.1.10.127.5.1.2", false, false, false, false);
                    this.docsBpiCmtsBaseTable = new DocsBpiCmtsBaseTableEnt(mib, this);
                    this.docsBpiCmtsAuthTable = new DocsBpiCmtsAuthTableEnt(mib, this);
                    this.docsBpiCmtsTEKTable = new DocsBpiCmtsTEKTableEnt(mib, this);
                    this.docsBpiMulticastControl = new DocsBpiMulticastControlEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpiCmtsBaseTable,
                        this.docsBpiCmtsAuthTable,
                        this.docsBpiCmtsTEKTable,
                        this.docsBpiMulticastControl
                    };
                }
                public static final class DocsBpiCmtsBaseTableEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    public final DocsBpiCmtsBaseEntryEnt docsBpiCmtsBaseEntry;

                    private DocsBpiCmtsBaseTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmtsBaseTable", "1.3.6.1.2.1.10.127.5.1.2.1", false, true, false, false);
                        this.docsBpiCmtsBaseEntry = new DocsBpiCmtsBaseEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpiCmtsBaseEntry
                        };
                    }
                    public static final class DocsBpiCmtsBaseEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiCmtsDefaultAuthLifetimeEnt docsBpiCmtsDefaultAuthLifetime;

                        public final DocsBpiCmtsDefaultTEKLifetimeEnt docsBpiCmtsDefaultTEKLifetime;

                        /** Note: the following two objects have been obsoleted from this MIB.*/
                        public final DocsBpiCmtsDefaultAuthGraceTimeEnt docsBpiCmtsDefaultAuthGraceTime;

                        public final DocsBpiCmtsDefaultTEKGraceTimeEnt docsBpiCmtsDefaultTEKGraceTime;

                        public final DocsBpiCmtsAuthRequestsEnt docsBpiCmtsAuthRequests;

                        public final DocsBpiCmtsAuthRepliesEnt docsBpiCmtsAuthReplies;

                        public final DocsBpiCmtsAuthRejectsEnt docsBpiCmtsAuthRejects;

                        public final DocsBpiCmtsAuthInvalidsEnt docsBpiCmtsAuthInvalids;

                        private DocsBpiCmtsBaseEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiCmtsBaseEntry", "1.3.6.1.2.1.10.127.5.1.2.1.1", false, false, false, true);
                            this.docsBpiCmtsDefaultAuthLifetime = new DocsBpiCmtsDefaultAuthLifetimeEnt(mib, this);
                            this.docsBpiCmtsDefaultTEKLifetime = new DocsBpiCmtsDefaultTEKLifetimeEnt(mib, this);
                            this.docsBpiCmtsDefaultAuthGraceTime = new DocsBpiCmtsDefaultAuthGraceTimeEnt(mib, this);
                            this.docsBpiCmtsDefaultTEKGraceTime = new DocsBpiCmtsDefaultTEKGraceTimeEnt(mib, this);
                            this.docsBpiCmtsAuthRequests = new DocsBpiCmtsAuthRequestsEnt(mib, this);
                            this.docsBpiCmtsAuthReplies = new DocsBpiCmtsAuthRepliesEnt(mib, this);
                            this.docsBpiCmtsAuthRejects = new DocsBpiCmtsAuthRejectsEnt(mib, this);
                            this.docsBpiCmtsAuthInvalids = new DocsBpiCmtsAuthInvalidsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiCmtsDefaultAuthLifetime,
                                this.docsBpiCmtsDefaultTEKLifetime,
                                this.docsBpiCmtsDefaultAuthGraceTime,
                                this.docsBpiCmtsDefaultTEKGraceTime,
                                this.docsBpiCmtsAuthRequests,
                                this.docsBpiCmtsAuthReplies,
                                this.docsBpiCmtsAuthRejects,
                                this.docsBpiCmtsAuthInvalids
                            };
                        }
                        public static final class DocsBpiCmtsDefaultAuthLifetimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsDefaultAuthLifetimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsDefaultAuthLifetime", "1.3.6.1.2.1.10.127.5.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsDefaultTEKLifetimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsDefaultTEKLifetimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsDefaultTEKLifetime", "1.3.6.1.2.1.10.127.5.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsDefaultAuthGraceTimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsDefaultAuthGraceTimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsDefaultAuthGraceTime", "1.3.6.1.2.1.10.127.5.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsDefaultTEKGraceTimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsDefaultTEKGraceTimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsDefaultTEKGraceTime", "1.3.6.1.2.1.10.127.5.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthRequestsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthRequestsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthRequests", "1.3.6.1.2.1.10.127.5.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthRepliesEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthRepliesEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthReplies", "1.3.6.1.2.1.10.127.5.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthRejectsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthRejectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthRejects", "1.3.6.1.2.1.10.127.5.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthInvalidsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthInvalidsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthInvalids", "1.3.6.1.2.1.10.127.5.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpiCmtsAuthTableEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    public final DocsBpiCmtsAuthEntryEnt docsBpiCmtsAuthEntry;

                    private DocsBpiCmtsAuthTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmtsAuthTable", "1.3.6.1.2.1.10.127.5.1.2.2", false, true, false, false);
                        this.docsBpiCmtsAuthEntry = new DocsBpiCmtsAuthEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpiCmtsAuthEntry
                        };
                    }
                    public static final class DocsBpiCmtsAuthEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiCmtsAuthCmMacAddressEnt docsBpiCmtsAuthCmMacAddress;

                        public final DocsBpiCmtsAuthCmPublicKeyEnt docsBpiCmtsAuthCmPublicKey;

                        public final DocsBpiCmtsAuthCmKeySequenceNumberEnt docsBpiCmtsAuthCmKeySequenceNumber;

                        public final DocsBpiCmtsAuthCmExpiresEnt docsBpiCmtsAuthCmExpires;

                        public final DocsBpiCmtsAuthCmLifetimeEnt docsBpiCmtsAuthCmLifetime;

                        public final DocsBpiCmtsAuthCmGraceTimeEnt docsBpiCmtsAuthCmGraceTime;

                        public final DocsBpiCmtsAuthCmResetEnt docsBpiCmtsAuthCmReset;

                        public final DocsBpiCmtsAuthCmRequestsEnt docsBpiCmtsAuthCmRequests;

                        public final DocsBpiCmtsAuthCmRepliesEnt docsBpiCmtsAuthCmReplies;

                        public final DocsBpiCmtsAuthCmRejectsEnt docsBpiCmtsAuthCmRejects;

                        public final DocsBpiCmtsAuthCmInvalidsEnt docsBpiCmtsAuthCmInvalids;

                        public final DocsBpiCmtsAuthRejectErrorCodeEnt docsBpiCmtsAuthRejectErrorCode;

                        public final DocsBpiCmtsAuthRejectErrorStringEnt docsBpiCmtsAuthRejectErrorString;

                        public final DocsBpiCmtsAuthInvalidErrorCodeEnt docsBpiCmtsAuthInvalidErrorCode;

                        public final DocsBpiCmtsAuthInvalidErrorStringEnt docsBpiCmtsAuthInvalidErrorString;

                        private DocsBpiCmtsAuthEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiCmtsAuthEntry", "1.3.6.1.2.1.10.127.5.1.2.2.1", false, false, false, true);
                            this.docsBpiCmtsAuthCmMacAddress = new DocsBpiCmtsAuthCmMacAddressEnt(mib, this);
                            this.docsBpiCmtsAuthCmPublicKey = new DocsBpiCmtsAuthCmPublicKeyEnt(mib, this);
                            this.docsBpiCmtsAuthCmKeySequenceNumber = new DocsBpiCmtsAuthCmKeySequenceNumberEnt(mib, this);
                            this.docsBpiCmtsAuthCmExpires = new DocsBpiCmtsAuthCmExpiresEnt(mib, this);
                            this.docsBpiCmtsAuthCmLifetime = new DocsBpiCmtsAuthCmLifetimeEnt(mib, this);
                            this.docsBpiCmtsAuthCmGraceTime = new DocsBpiCmtsAuthCmGraceTimeEnt(mib, this);
                            this.docsBpiCmtsAuthCmReset = new DocsBpiCmtsAuthCmResetEnt(mib, this);
                            this.docsBpiCmtsAuthCmRequests = new DocsBpiCmtsAuthCmRequestsEnt(mib, this);
                            this.docsBpiCmtsAuthCmReplies = new DocsBpiCmtsAuthCmRepliesEnt(mib, this);
                            this.docsBpiCmtsAuthCmRejects = new DocsBpiCmtsAuthCmRejectsEnt(mib, this);
                            this.docsBpiCmtsAuthCmInvalids = new DocsBpiCmtsAuthCmInvalidsEnt(mib, this);
                            this.docsBpiCmtsAuthRejectErrorCode = new DocsBpiCmtsAuthRejectErrorCodeEnt(mib, this);
                            this.docsBpiCmtsAuthRejectErrorString = new DocsBpiCmtsAuthRejectErrorStringEnt(mib, this);
                            this.docsBpiCmtsAuthInvalidErrorCode = new DocsBpiCmtsAuthInvalidErrorCodeEnt(mib, this);
                            this.docsBpiCmtsAuthInvalidErrorString = new DocsBpiCmtsAuthInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiCmtsAuthCmMacAddress,
                                this.docsBpiCmtsAuthCmPublicKey,
                                this.docsBpiCmtsAuthCmKeySequenceNumber,
                                this.docsBpiCmtsAuthCmExpires,
                                this.docsBpiCmtsAuthCmLifetime,
                                this.docsBpiCmtsAuthCmGraceTime,
                                this.docsBpiCmtsAuthCmReset,
                                this.docsBpiCmtsAuthCmRequests,
                                this.docsBpiCmtsAuthCmReplies,
                                this.docsBpiCmtsAuthCmRejects,
                                this.docsBpiCmtsAuthCmInvalids,
                                this.docsBpiCmtsAuthRejectErrorCode,
                                this.docsBpiCmtsAuthRejectErrorString,
                                this.docsBpiCmtsAuthInvalidErrorCode,
                                this.docsBpiCmtsAuthInvalidErrorString
                            };
                        }
                        public static final class DocsBpiCmtsAuthCmMacAddressEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmMacAddressEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmMacAddress", "1.3.6.1.2.1.10.127.5.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmPublicKeyEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmPublicKeyEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmPublicKey", "1.3.6.1.2.1.10.127.5.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmKeySequenceNumberEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmKeySequenceNumberEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmKeySequenceNumber", "1.3.6.1.2.1.10.127.5.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmExpiresEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmExpiresEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmExpires", "1.3.6.1.2.1.10.127.5.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmLifetimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmLifetimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmLifetime", "1.3.6.1.2.1.10.127.5.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmGraceTimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmGraceTimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmGraceTime", "1.3.6.1.2.1.10.127.5.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmResetEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmResetEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmReset", "1.3.6.1.2.1.10.127.5.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmRequestsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmRequestsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmRequests", "1.3.6.1.2.1.10.127.5.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmRepliesEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmRepliesEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmReplies", "1.3.6.1.2.1.10.127.5.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmRejectsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmRejectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmRejects", "1.3.6.1.2.1.10.127.5.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthCmInvalidsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthCmInvalidsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthCmInvalids", "1.3.6.1.2.1.10.127.5.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthRejectErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthRejectErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthRejectErrorCode", "1.3.6.1.2.1.10.127.5.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthRejectErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthRejectErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthRejectErrorString", "1.3.6.1.2.1.10.127.5.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthInvalidErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthInvalidErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthInvalidErrorCode", "1.3.6.1.2.1.10.127.5.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsAuthInvalidErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsAuthInvalidErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsAuthInvalidErrorString", "1.3.6.1.2.1.10.127.5.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpiCmtsTEKTableEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    public final DocsBpiCmtsTEKEntryEnt docsBpiCmtsTEKEntry;

                    private DocsBpiCmtsTEKTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmtsTEKTable", "1.3.6.1.2.1.10.127.5.1.2.3", false, true, false, false);
                        this.docsBpiCmtsTEKEntry = new DocsBpiCmtsTEKEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpiCmtsTEKEntry
                        };
                    }
                    public static final class DocsBpiCmtsTEKEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiCmtsTEKLifetimeEnt docsBpiCmtsTEKLifetime;

                        public final DocsBpiCmtsTEKGraceTimeEnt docsBpiCmtsTEKGraceTime;

                        public final DocsBpiCmtsTEKExpiresOldEnt docsBpiCmtsTEKExpiresOld;

                        public final DocsBpiCmtsTEKExpiresNewEnt docsBpiCmtsTEKExpiresNew;

                        public final DocsBpiCmtsTEKResetEnt docsBpiCmtsTEKReset;

                        public final DocsBpiCmtsKeyRequestsEnt docsBpiCmtsKeyRequests;

                        public final DocsBpiCmtsKeyRepliesEnt docsBpiCmtsKeyReplies;

                        public final DocsBpiCmtsKeyRejectsEnt docsBpiCmtsKeyRejects;

                        public final DocsBpiCmtsTEKInvalidsEnt docsBpiCmtsTEKInvalids;

                        public final DocsBpiCmtsKeyRejectErrorCodeEnt docsBpiCmtsKeyRejectErrorCode;

                        public final DocsBpiCmtsKeyRejectErrorStringEnt docsBpiCmtsKeyRejectErrorString;

                        public final DocsBpiCmtsTEKInvalidErrorCodeEnt docsBpiCmtsTEKInvalidErrorCode;

                        public final DocsBpiCmtsTEKInvalidErrorStringEnt docsBpiCmtsTEKInvalidErrorString;

                        private DocsBpiCmtsTEKEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiCmtsTEKEntry", "1.3.6.1.2.1.10.127.5.1.2.3.1", false, false, false, true);
                            this.docsBpiCmtsTEKLifetime = new DocsBpiCmtsTEKLifetimeEnt(mib, this);
                            this.docsBpiCmtsTEKGraceTime = new DocsBpiCmtsTEKGraceTimeEnt(mib, this);
                            this.docsBpiCmtsTEKExpiresOld = new DocsBpiCmtsTEKExpiresOldEnt(mib, this);
                            this.docsBpiCmtsTEKExpiresNew = new DocsBpiCmtsTEKExpiresNewEnt(mib, this);
                            this.docsBpiCmtsTEKReset = new DocsBpiCmtsTEKResetEnt(mib, this);
                            this.docsBpiCmtsKeyRequests = new DocsBpiCmtsKeyRequestsEnt(mib, this);
                            this.docsBpiCmtsKeyReplies = new DocsBpiCmtsKeyRepliesEnt(mib, this);
                            this.docsBpiCmtsKeyRejects = new DocsBpiCmtsKeyRejectsEnt(mib, this);
                            this.docsBpiCmtsTEKInvalids = new DocsBpiCmtsTEKInvalidsEnt(mib, this);
                            this.docsBpiCmtsKeyRejectErrorCode = new DocsBpiCmtsKeyRejectErrorCodeEnt(mib, this);
                            this.docsBpiCmtsKeyRejectErrorString = new DocsBpiCmtsKeyRejectErrorStringEnt(mib, this);
                            this.docsBpiCmtsTEKInvalidErrorCode = new DocsBpiCmtsTEKInvalidErrorCodeEnt(mib, this);
                            this.docsBpiCmtsTEKInvalidErrorString = new DocsBpiCmtsTEKInvalidErrorStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiCmtsTEKLifetime,
                                this.docsBpiCmtsTEKGraceTime,
                                this.docsBpiCmtsTEKExpiresOld,
                                this.docsBpiCmtsTEKExpiresNew,
                                this.docsBpiCmtsTEKReset,
                                this.docsBpiCmtsKeyRequests,
                                this.docsBpiCmtsKeyReplies,
                                this.docsBpiCmtsKeyRejects,
                                this.docsBpiCmtsTEKInvalids,
                                this.docsBpiCmtsKeyRejectErrorCode,
                                this.docsBpiCmtsKeyRejectErrorString,
                                this.docsBpiCmtsTEKInvalidErrorCode,
                                this.docsBpiCmtsTEKInvalidErrorString
                            };
                        }
                        public static final class DocsBpiCmtsTEKLifetimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKLifetimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKLifetime", "1.3.6.1.2.1.10.127.5.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKGraceTimeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKGraceTimeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKGraceTime", "1.3.6.1.2.1.10.127.5.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKExpiresOldEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKExpiresOldEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKExpiresOld", "1.3.6.1.2.1.10.127.5.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKExpiresNewEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKExpiresNewEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKExpiresNew", "1.3.6.1.2.1.10.127.5.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKResetEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKResetEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKReset", "1.3.6.1.2.1.10.127.5.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsKeyRequestsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsKeyRequestsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsKeyRequests", "1.3.6.1.2.1.10.127.5.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsKeyRepliesEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsKeyRepliesEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsKeyReplies", "1.3.6.1.2.1.10.127.5.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsKeyRejectsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsKeyRejectsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsKeyRejects", "1.3.6.1.2.1.10.127.5.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKInvalidsEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKInvalidsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKInvalids", "1.3.6.1.2.1.10.127.5.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsKeyRejectErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsKeyRejectErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsKeyRejectErrorCode", "1.3.6.1.2.1.10.127.5.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsKeyRejectErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsKeyRejectErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsKeyRejectErrorString", "1.3.6.1.2.1.10.127.5.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKInvalidErrorCodeEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKInvalidErrorCodeEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKInvalidErrorCode", "1.3.6.1.2.1.10.127.5.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsBpiCmtsTEKInvalidErrorStringEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            private DocsBpiCmtsTEKInvalidErrorStringEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiCmtsTEKInvalidErrorString", "1.3.6.1.2.1.10.127.5.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsBpiMulticastControlEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    /** The CMTS IP Multicast Mapping Table, indexed by IP multicastaddress and prefix, and by ifindex*/
                    public final DocsBpiIpMulticastMapTableEnt docsBpiIpMulticastMapTable;

                    /** The CMTS Multicast SID Authorization Table, indexed by ifIndex bymulticast SID by CM MAC address*/
                    public final DocsBpiMulticastAuthTableEnt docsBpiMulticastAuthTable;

                    private DocsBpiMulticastControlEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiMulticastControl", "1.3.6.1.2.1.10.127.5.1.2.4", false, false, false, false);
                        this.docsBpiIpMulticastMapTable = new DocsBpiIpMulticastMapTableEnt(mib, this);
                        this.docsBpiMulticastAuthTable = new DocsBpiMulticastAuthTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsBpiIpMulticastMapTable,
                            this.docsBpiMulticastAuthTable
                        };
                    }
                    public static final class DocsBpiIpMulticastMapTableEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiIpMulticastMapEntryEnt docsBpiIpMulticastMapEntry;

                        private DocsBpiIpMulticastMapTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiIpMulticastMapTable", "1.3.6.1.2.1.10.127.5.1.2.4.1", false, true, false, false);
                            this.docsBpiIpMulticastMapEntry = new DocsBpiIpMulticastMapEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiIpMulticastMapEntry
                            };
                        }
                        public static final class DocsBpiIpMulticastMapEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            public final DocsBpiIpMulticastAddressEnt docsBpiIpMulticastAddress;

                            public final DocsBpiIpMulticastPrefixLengthEnt docsBpiIpMulticastPrefixLength;

                            /** DEFVAL is an unused multicast SID value chosen by CMTS.*/
                            public final DocsBpiIpMulticastServiceIdEnt docsBpiIpMulticastServiceId;

                            public final DocsBpiIpMulticastMapControlEnt docsBpiIpMulticastMapControl;

                            private DocsBpiIpMulticastMapEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiIpMulticastMapEntry", "1.3.6.1.2.1.10.127.5.1.2.4.1.1", false, false, false, true);
                                this.docsBpiIpMulticastAddress = new DocsBpiIpMulticastAddressEnt(mib, this);
                                this.docsBpiIpMulticastPrefixLength = new DocsBpiIpMulticastPrefixLengthEnt(mib, this);
                                this.docsBpiIpMulticastServiceId = new DocsBpiIpMulticastServiceIdEnt(mib, this);
                                this.docsBpiIpMulticastMapControl = new DocsBpiIpMulticastMapControlEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpiIpMulticastAddress,
                                    this.docsBpiIpMulticastPrefixLength,
                                    this.docsBpiIpMulticastServiceId,
                                    this.docsBpiIpMulticastMapControl
                                };
                            }
                            public static final class DocsBpiIpMulticastAddressEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiIpMulticastAddressEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiIpMulticastAddress", "1.3.6.1.2.1.10.127.5.1.2.4.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpiIpMulticastPrefixLengthEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiIpMulticastPrefixLengthEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiIpMulticastPrefixLength", "1.3.6.1.2.1.10.127.5.1.2.4.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpiIpMulticastServiceIdEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiIpMulticastServiceIdEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiIpMulticastServiceId", "1.3.6.1.2.1.10.127.5.1.2.4.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpiIpMulticastMapControlEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiIpMulticastMapControlEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiIpMulticastMapControl", "1.3.6.1.2.1.10.127.5.1.2.4.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class DocsBpiMulticastAuthTableEnt extends MIBEntry<DOCSBPIMIBDef>
                    {
                        public final DocsBpiMulticastAuthEntryEnt docsBpiMulticastAuthEntry;

                        private DocsBpiMulticastAuthTableEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                        {
                            super(mib, parent, "docsBpiMulticastAuthTable", "1.3.6.1.2.1.10.127.5.1.2.4.2", false, true, false, false);
                            this.docsBpiMulticastAuthEntry = new DocsBpiMulticastAuthEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsBpiMulticastAuthEntry
                            };
                        }
                        public static final class DocsBpiMulticastAuthEntryEnt extends MIBEntry<DOCSBPIMIBDef>
                        {
                            public final DocsBpiMulticastServiceIdEnt docsBpiMulticastServiceId;

                            public final DocsBpiMulticastCmMacAddressEnt docsBpiMulticastCmMacAddress;

                            public final DocsBpiMulticastAuthControlEnt docsBpiMulticastAuthControl;

                            private DocsBpiMulticastAuthEntryEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                            {
                                super(mib, parent, "docsBpiMulticastAuthEntry", "1.3.6.1.2.1.10.127.5.1.2.4.2.1", false, false, false, true);
                                this.docsBpiMulticastServiceId = new DocsBpiMulticastServiceIdEnt(mib, this);
                                this.docsBpiMulticastCmMacAddress = new DocsBpiMulticastCmMacAddressEnt(mib, this);
                                this.docsBpiMulticastAuthControl = new DocsBpiMulticastAuthControlEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.docsBpiMulticastServiceId,
                                    this.docsBpiMulticastCmMacAddress,
                                    this.docsBpiMulticastAuthControl
                                };
                            }
                            public static final class DocsBpiMulticastServiceIdEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiMulticastServiceIdEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiMulticastServiceId", "1.3.6.1.2.1.10.127.5.1.2.4.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpiMulticastCmMacAddressEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiMulticastCmMacAddressEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiMulticastCmMacAddress", "1.3.6.1.2.1.10.127.5.1.2.4.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DocsBpiMulticastAuthControlEnt extends MIBEntry<DOCSBPIMIBDef>
                            {
                                private DocsBpiMulticastAuthControlEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                                {
                                    super(mib, parent, "docsBpiMulticastAuthControl", "1.3.6.1.2.1.10.127.5.1.2.4.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

        }

        public static final class DocsBpiNotificationEnt extends MIBEntry<DOCSBPIMIBDef>
        {
            private DocsBpiNotificationEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
            {
                super(mib, parent, "docsBpiNotification", "1.3.6.1.2.1.10.127.5.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsBpiConformanceEnt extends MIBEntry<DOCSBPIMIBDef>
        {
            public final DocsBpiCompliancesEnt docsBpiCompliances;

            public final DocsBpiGroupsEnt docsBpiGroups;

            private DocsBpiConformanceEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
            {
                super(mib, parent, "docsBpiConformance", "1.3.6.1.2.1.10.127.5.3", false, false, false, false);
                this.docsBpiCompliances = new DocsBpiCompliancesEnt(mib, this);
                this.docsBpiGroups = new DocsBpiGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsBpiCompliances,
                    this.docsBpiGroups
                };
            }
            public static final class DocsBpiCompliancesEnt extends MIBEntry<DOCSBPIMIBDef>
            {
                /** relaxation on mandatory range (unnecessary since object is read-only)
OBJECT       docsBpiCmtsTEKGraceTime
SYNTAX       Integer32 (300..1800)
DESCRIPTION
"The refined range corresponds to the minimum and maximum values in
operational networks, according to Appendix A.2 in [18]."*/
                public final DocsBpiBasicComplianceEnt docsBpiBasicCompliance;

                private DocsBpiCompliancesEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                {
                    super(mib, parent, "docsBpiCompliances", "1.3.6.1.2.1.10.127.5.3.1", false, false, false, false);
                    this.docsBpiBasicCompliance = new DocsBpiBasicComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpiBasicCompliance
                    };
                }
                public static final class DocsBpiBasicComplianceEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    private DocsBpiBasicComplianceEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiBasicCompliance", "1.3.6.1.2.1.10.127.5.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsBpiGroupsEnt extends MIBEntry<DOCSBPIMIBDef>
            {
                public final DocsBpiCmGroupEnt docsBpiCmGroup;

                public final DocsBpiCmtsGroupEnt docsBpiCmtsGroup;

                public final DocsBpiObsoleteObjectsGroupEnt docsBpiObsoleteObjectsGroup;

                private DocsBpiGroupsEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                {
                    super(mib, parent, "docsBpiGroups", "1.3.6.1.2.1.10.127.5.3.2", false, false, false, false);
                    this.docsBpiCmGroup = new DocsBpiCmGroupEnt(mib, this);
                    this.docsBpiCmtsGroup = new DocsBpiCmtsGroupEnt(mib, this);
                    this.docsBpiObsoleteObjectsGroup = new DocsBpiObsoleteObjectsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsBpiCmGroup,
                        this.docsBpiCmtsGroup,
                        this.docsBpiObsoleteObjectsGroup
                    };
                }
                public static final class DocsBpiCmGroupEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    private DocsBpiCmGroupEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmGroup", "1.3.6.1.2.1.10.127.5.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpiCmtsGroupEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    private DocsBpiCmtsGroupEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiCmtsGroup", "1.3.6.1.2.1.10.127.5.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsBpiObsoleteObjectsGroupEnt extends MIBEntry<DOCSBPIMIBDef>
                {
                    private DocsBpiObsoleteObjectsGroupEnt(DOCSBPIMIBDef mib, MIBEntry<DOCSBPIMIBDef> parent)
                    {
                        super(mib, parent, "docsBpiObsoleteObjectsGroup", "1.3.6.1.2.1.10.127.5.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
