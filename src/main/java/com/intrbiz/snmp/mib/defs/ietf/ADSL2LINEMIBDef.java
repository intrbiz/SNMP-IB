package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC3705]
[This document]*/
public final class ADSL2LINEMIBDef extends MIB
{
    public static final ADSL2LINEMIBDef ADSL2LINEMIB = new ADSL2LINEMIBDef();

    static { MIBs.getInstance().registerMIB(ADSL2LINEMIBDef.ADSL2LINEMIB); }

    /** October 4th, 2006*/
    public final Adsl2MIBEnt adsl2MIB;

    private ADSL2LINEMIBDef()
    {
        super("ADSL2-LINE-MIB");
        this.adsl2MIB = new Adsl2MIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.adsl2MIB
        };
    }

    public static final class Adsl2MIBEnt extends MIBEntry<ADSL2LINEMIBDef>
    {
        public final Adsl2Ent adsl2;

        private Adsl2MIBEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
        {
            super(mib, parent, "adsl2MIB", "1.3.6.1.2.1.10.238", false, false, false, false);
            this.adsl2 = new Adsl2Ent(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.adsl2
            };
        }
        public static final class Adsl2Ent extends MIBEntry<ADSL2LINEMIBDef>
        {
            /** ------------------------*/
            public final Adsl2LineEnt adsl2Line;

            public final Adsl2StatusEnt adsl2Status;

            public final Adsl2InventoryEnt adsl2Inventory;

            public final Adsl2PMEnt adsl2PM;

            public final Adsl2ProfileEnt adsl2Profile;

            public final Adsl2ScalarEnt adsl2Scalar;

            public final Adsl2NotificationsEnt adsl2Notifications;

            public final Adsl2ConformanceEnt adsl2Conformance;

            private Adsl2Ent(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
            {
                super(mib, parent, "adsl2", "1.3.6.1.2.1.10.238.1", false, false, false, false);
                this.adsl2Line = new Adsl2LineEnt(mib, this);
                this.adsl2Status = new Adsl2StatusEnt(mib, this);
                this.adsl2Inventory = new Adsl2InventoryEnt(mib, this);
                this.adsl2PM = new Adsl2PMEnt(mib, this);
                this.adsl2Profile = new Adsl2ProfileEnt(mib, this);
                this.adsl2Scalar = new Adsl2ScalarEnt(mib, this);
                this.adsl2Notifications = new Adsl2NotificationsEnt(mib, this);
                this.adsl2Conformance = new Adsl2ConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.adsl2Line,
                    this.adsl2Status,
                    this.adsl2Inventory,
                    this.adsl2PM,
                    this.adsl2Profile,
                    this.adsl2Scalar,
                    this.adsl2Notifications,
                    this.adsl2Conformance
                };
            }
            public static final class Adsl2LineEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ------------------------


------------------------
adsl2LineTable                    --
------------------------*/
                public final Adsl2LineTableEnt adsl2LineTable;

                private Adsl2LineEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Line", "1.3.6.1.2.1.10.238.1.1", false, false, false, false);
                    this.adsl2LineTable = new Adsl2LineTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2LineTable
                    };
                }
                public static final class Adsl2LineTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    public final Adsl2LineEntryEnt adsl2LineEntry;

                    private Adsl2LineTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LineTable", "1.3.6.1.2.1.10.238.1.1.1", false, true, false, false);
                        this.adsl2LineEntry = new Adsl2LineEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2LineEntry
                        };
                    }
                    public static final class Adsl2LineEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LineCnfgTemplateEnt adsl2LineCnfgTemplate;

                        public final Adsl2LineAlarmCnfgTemplateEnt adsl2LineAlarmCnfgTemplate;

                        public final Adsl2LineCmndConfPmsfEnt adsl2LineCmndConfPmsf;

                        public final Adsl2LineCmndConfLdsfEnt adsl2LineCmndConfLdsf;

                        public final Adsl2LineCmndConfLdsfFailReasonEnt adsl2LineCmndConfLdsfFailReason;

                        public final Adsl2LineCmndAutomodeColdStartEnt adsl2LineCmndAutomodeColdStart;

                        public final Adsl2LineStatusAtuTransSysEnt adsl2LineStatusAtuTransSys;

                        public final Adsl2LineStatusPwrMngStateEnt adsl2LineStatusPwrMngState;

                        public final Adsl2LineStatusInitResultEnt adsl2LineStatusInitResult;

                        public final Adsl2LineStatusLastStateDsEnt adsl2LineStatusLastStateDs;

                        public final Adsl2LineStatusLastStateUsEnt adsl2LineStatusLastStateUs;

                        public final Adsl2LineStatusAturEnt adsl2LineStatusAtur;

                        public final Adsl2LineStatusAtucEnt adsl2LineStatusAtuc;

                        public final Adsl2LineStatusLnAttenDsEnt adsl2LineStatusLnAttenDs;

                        public final Adsl2LineStatusLnAttenUsEnt adsl2LineStatusLnAttenUs;

                        public final Adsl2LineStatusSigAttenDsEnt adsl2LineStatusSigAttenDs;

                        public final Adsl2LineStatusSigAttenUsEnt adsl2LineStatusSigAttenUs;

                        public final Adsl2LineStatusSnrMarginDsEnt adsl2LineStatusSnrMarginDs;

                        public final Adsl2LineStatusSnrMarginUsEnt adsl2LineStatusSnrMarginUs;

                        public final Adsl2LineStatusAttainableRateDsEnt adsl2LineStatusAttainableRateDs;

                        public final Adsl2LineStatusAttainableRateUsEnt adsl2LineStatusAttainableRateUs;

                        public final Adsl2LineStatusActPsdDsEnt adsl2LineStatusActPsdDs;

                        public final Adsl2LineStatusActPsdUsEnt adsl2LineStatusActPsdUs;

                        public final Adsl2LineStatusActAtpDsEnt adsl2LineStatusActAtpDs;

                        public final Adsl2LineStatusActAtpUsEnt adsl2LineStatusActAtpUs;

                        private Adsl2LineEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineEntry", "1.3.6.1.2.1.10.238.1.1.1.1", false, false, false, true);
                            this.adsl2LineCnfgTemplate = new Adsl2LineCnfgTemplateEnt(mib, this);
                            this.adsl2LineAlarmCnfgTemplate = new Adsl2LineAlarmCnfgTemplateEnt(mib, this);
                            this.adsl2LineCmndConfPmsf = new Adsl2LineCmndConfPmsfEnt(mib, this);
                            this.adsl2LineCmndConfLdsf = new Adsl2LineCmndConfLdsfEnt(mib, this);
                            this.adsl2LineCmndConfLdsfFailReason = new Adsl2LineCmndConfLdsfFailReasonEnt(mib, this);
                            this.adsl2LineCmndAutomodeColdStart = new Adsl2LineCmndAutomodeColdStartEnt(mib, this);
                            this.adsl2LineStatusAtuTransSys = new Adsl2LineStatusAtuTransSysEnt(mib, this);
                            this.adsl2LineStatusPwrMngState = new Adsl2LineStatusPwrMngStateEnt(mib, this);
                            this.adsl2LineStatusInitResult = new Adsl2LineStatusInitResultEnt(mib, this);
                            this.adsl2LineStatusLastStateDs = new Adsl2LineStatusLastStateDsEnt(mib, this);
                            this.adsl2LineStatusLastStateUs = new Adsl2LineStatusLastStateUsEnt(mib, this);
                            this.adsl2LineStatusAtur = new Adsl2LineStatusAturEnt(mib, this);
                            this.adsl2LineStatusAtuc = new Adsl2LineStatusAtucEnt(mib, this);
                            this.adsl2LineStatusLnAttenDs = new Adsl2LineStatusLnAttenDsEnt(mib, this);
                            this.adsl2LineStatusLnAttenUs = new Adsl2LineStatusLnAttenUsEnt(mib, this);
                            this.adsl2LineStatusSigAttenDs = new Adsl2LineStatusSigAttenDsEnt(mib, this);
                            this.adsl2LineStatusSigAttenUs = new Adsl2LineStatusSigAttenUsEnt(mib, this);
                            this.adsl2LineStatusSnrMarginDs = new Adsl2LineStatusSnrMarginDsEnt(mib, this);
                            this.adsl2LineStatusSnrMarginUs = new Adsl2LineStatusSnrMarginUsEnt(mib, this);
                            this.adsl2LineStatusAttainableRateDs = new Adsl2LineStatusAttainableRateDsEnt(mib, this);
                            this.adsl2LineStatusAttainableRateUs = new Adsl2LineStatusAttainableRateUsEnt(mib, this);
                            this.adsl2LineStatusActPsdDs = new Adsl2LineStatusActPsdDsEnt(mib, this);
                            this.adsl2LineStatusActPsdUs = new Adsl2LineStatusActPsdUsEnt(mib, this);
                            this.adsl2LineStatusActAtpDs = new Adsl2LineStatusActAtpDsEnt(mib, this);
                            this.adsl2LineStatusActAtpUs = new Adsl2LineStatusActAtpUsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LineCnfgTemplate,
                                this.adsl2LineAlarmCnfgTemplate,
                                this.adsl2LineCmndConfPmsf,
                                this.adsl2LineCmndConfLdsf,
                                this.adsl2LineCmndConfLdsfFailReason,
                                this.adsl2LineCmndAutomodeColdStart,
                                this.adsl2LineStatusAtuTransSys,
                                this.adsl2LineStatusPwrMngState,
                                this.adsl2LineStatusInitResult,
                                this.adsl2LineStatusLastStateDs,
                                this.adsl2LineStatusLastStateUs,
                                this.adsl2LineStatusAtur,
                                this.adsl2LineStatusAtuc,
                                this.adsl2LineStatusLnAttenDs,
                                this.adsl2LineStatusLnAttenUs,
                                this.adsl2LineStatusSigAttenDs,
                                this.adsl2LineStatusSigAttenUs,
                                this.adsl2LineStatusSnrMarginDs,
                                this.adsl2LineStatusSnrMarginUs,
                                this.adsl2LineStatusAttainableRateDs,
                                this.adsl2LineStatusAttainableRateUs,
                                this.adsl2LineStatusActPsdDs,
                                this.adsl2LineStatusActPsdUs,
                                this.adsl2LineStatusActAtpDs,
                                this.adsl2LineStatusActAtpUs
                            };
                        }
                        public static final class Adsl2LineCnfgTemplateEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineCnfgTemplateEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineCnfgTemplate", "1.3.6.1.2.1.10.238.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineAlarmCnfgTemplateEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineAlarmCnfgTemplateEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineAlarmCnfgTemplate", "1.3.6.1.2.1.10.238.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineCmndConfPmsfEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineCmndConfPmsfEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineCmndConfPmsf", "1.3.6.1.2.1.10.238.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineCmndConfLdsfEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineCmndConfLdsfEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineCmndConfLdsf", "1.3.6.1.2.1.10.238.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineCmndConfLdsfFailReasonEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineCmndConfLdsfFailReasonEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineCmndConfLdsfFailReason", "1.3.6.1.2.1.10.238.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineCmndAutomodeColdStartEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineCmndAutomodeColdStartEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineCmndAutomodeColdStart", "1.3.6.1.2.1.10.238.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusAtuTransSysEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusAtuTransSysEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusAtuTransSys", "1.3.6.1.2.1.10.238.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusPwrMngStateEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusPwrMngStateEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusPwrMngState", "1.3.6.1.2.1.10.238.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusInitResultEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusInitResultEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusInitResult", "1.3.6.1.2.1.10.238.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusLastStateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusLastStateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusLastStateDs", "1.3.6.1.2.1.10.238.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusLastStateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusLastStateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusLastStateUs", "1.3.6.1.2.1.10.238.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusAtur", "1.3.6.1.2.1.10.238.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusAtuc", "1.3.6.1.2.1.10.238.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusLnAttenDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusLnAttenDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusLnAttenDs", "1.3.6.1.2.1.10.238.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusLnAttenUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusLnAttenUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusLnAttenUs", "1.3.6.1.2.1.10.238.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusSigAttenDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusSigAttenDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusSigAttenDs", "1.3.6.1.2.1.10.238.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusSigAttenUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusSigAttenUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusSigAttenUs", "1.3.6.1.2.1.10.238.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusSnrMarginDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusSnrMarginDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusSnrMarginDs", "1.3.6.1.2.1.10.238.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusSnrMarginUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusSnrMarginUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusSnrMarginUs", "1.3.6.1.2.1.10.238.1.1.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusAttainableRateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusAttainableRateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusAttainableRateDs", "1.3.6.1.2.1.10.238.1.1.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusAttainableRateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusAttainableRateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusAttainableRateUs", "1.3.6.1.2.1.10.238.1.1.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusActPsdDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusActPsdDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusActPsdDs", "1.3.6.1.2.1.10.238.1.1.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusActPsdUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusActPsdUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusActPsdUs", "1.3.6.1.2.1.10.238.1.1.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusActAtpDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusActAtpDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusActAtpDs", "1.3.6.1.2.1.10.238.1.1.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LineStatusActAtpUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LineStatusActAtpUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineStatusActAtpUs", "1.3.6.1.2.1.10.238.1.1.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Adsl2StatusEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ------------------------
adsl2ChannelStatusTable             --
------------------------*/
                public final Adsl2ChannelStatusTableEnt adsl2ChannelStatusTable;

                /** ------------------------
adsl2SCStatusTable                --
------------------------*/
                public final Adsl2SCStatusTableEnt adsl2SCStatusTable;

                private Adsl2StatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Status", "1.3.6.1.2.1.10.238.1.2", false, false, false, false);
                    this.adsl2ChannelStatusTable = new Adsl2ChannelStatusTableEnt(mib, this);
                    this.adsl2SCStatusTable = new Adsl2SCStatusTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2ChannelStatusTable,
                        this.adsl2SCStatusTable
                    };
                }
                public static final class Adsl2ChannelStatusTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    public final Adsl2ChannelStatusEntryEnt adsl2ChannelStatusEntry;

                    private Adsl2ChannelStatusTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2ChannelStatusTable", "1.3.6.1.2.1.10.238.1.2.1", false, true, false, false);
                        this.adsl2ChannelStatusEntry = new Adsl2ChannelStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2ChannelStatusEntry
                        };
                    }
                    public static final class Adsl2ChannelStatusEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2ChStatusUnitEnt adsl2ChStatusUnit;

                        public final Adsl2ChStatusChannelNumEnt adsl2ChStatusChannelNum;

                        public final Adsl2ChStatusActDataRateEnt adsl2ChStatusActDataRate;

                        public final Adsl2ChStatusPrevDataRateEnt adsl2ChStatusPrevDataRate;

                        public final Adsl2ChStatusActDelayEnt adsl2ChStatusActDelay;

                        public final Adsl2ChStatusAtmStatusEnt adsl2ChStatusAtmStatus;

                        public final Adsl2ChStatusPtmStatusEnt adsl2ChStatusPtmStatus;

                        private Adsl2ChannelStatusEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChannelStatusEntry", "1.3.6.1.2.1.10.238.1.2.1.1", false, false, false, true);
                            this.adsl2ChStatusUnit = new Adsl2ChStatusUnitEnt(mib, this);
                            this.adsl2ChStatusChannelNum = new Adsl2ChStatusChannelNumEnt(mib, this);
                            this.adsl2ChStatusActDataRate = new Adsl2ChStatusActDataRateEnt(mib, this);
                            this.adsl2ChStatusPrevDataRate = new Adsl2ChStatusPrevDataRateEnt(mib, this);
                            this.adsl2ChStatusActDelay = new Adsl2ChStatusActDelayEnt(mib, this);
                            this.adsl2ChStatusAtmStatus = new Adsl2ChStatusAtmStatusEnt(mib, this);
                            this.adsl2ChStatusPtmStatus = new Adsl2ChStatusPtmStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2ChStatusUnit,
                                this.adsl2ChStatusChannelNum,
                                this.adsl2ChStatusActDataRate,
                                this.adsl2ChStatusPrevDataRate,
                                this.adsl2ChStatusActDelay,
                                this.adsl2ChStatusAtmStatus,
                                this.adsl2ChStatusPtmStatus
                            };
                        }
                        public static final class Adsl2ChStatusUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusUnit", "1.3.6.1.2.1.10.238.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2ChStatusChannelNumEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusChannelNumEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusChannelNum", "1.3.6.1.2.1.10.238.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2ChStatusActDataRateEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusActDataRateEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusActDataRate", "1.3.6.1.2.1.10.238.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2ChStatusPrevDataRateEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusPrevDataRateEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusPrevDataRate", "1.3.6.1.2.1.10.238.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2ChStatusActDelayEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusActDelayEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusActDelay", "1.3.6.1.2.1.10.238.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2ChStatusAtmStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusAtmStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusAtmStatus", "1.3.6.1.2.1.10.238.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2ChStatusPtmStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2ChStatusPtmStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChStatusPtmStatus", "1.3.6.1.2.1.10.238.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Adsl2SCStatusTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    public final Adsl2SCStatusEntryEnt adsl2SCStatusEntry;

                    private Adsl2SCStatusTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2SCStatusTable", "1.3.6.1.2.1.10.238.1.2.2", false, true, false, false);
                        this.adsl2SCStatusEntry = new Adsl2SCStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2SCStatusEntry
                        };
                    }
                    public static final class Adsl2SCStatusEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2SCStatusDirectionEnt adsl2SCStatusDirection;

                        public final Adsl2SCStatusMtimeEnt adsl2SCStatusMtime;

                        public final Adsl2SCStatusSnrEnt adsl2SCStatusSnr;

                        public final Adsl2SCStatusBitsAllocEnt adsl2SCStatusBitsAlloc;

                        public final Adsl2SCStatusGainAllocEnt adsl2SCStatusGainAlloc;

                        public final Adsl2SCStatusTssiEnt adsl2SCStatusTssi;

                        public final Adsl2SCStatusLinScaleEnt adsl2SCStatusLinScale;

                        public final Adsl2SCStatusLinRealEnt adsl2SCStatusLinReal;

                        public final Adsl2SCStatusLinImgEnt adsl2SCStatusLinImg;

                        public final Adsl2SCStatusLogMtEnt adsl2SCStatusLogMt;

                        public final Adsl2SCStatusLogEnt adsl2SCStatusLog;

                        public final Adsl2SCStatusQlnMtEnt adsl2SCStatusQlnMt;

                        public final Adsl2SCStatusQlnEnt adsl2SCStatusQln;

                        public final Adsl2SCStatusLnAttenEnt adsl2SCStatusLnAtten;

                        public final Adsl2SCStatusSigAttenEnt adsl2SCStatusSigAtten;

                        public final Adsl2SCStatusSnrMarginEnt adsl2SCStatusSnrMargin;

                        public final Adsl2SCStatusAttainableRateEnt adsl2SCStatusAttainableRate;

                        public final Adsl2SCStatusActAtpEnt adsl2SCStatusActAtp;

                        public final Adsl2SCStatusRowStatusEnt adsl2SCStatusRowStatus;

                        private Adsl2SCStatusEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2SCStatusEntry", "1.3.6.1.2.1.10.238.1.2.2.1", false, false, false, true);
                            this.adsl2SCStatusDirection = new Adsl2SCStatusDirectionEnt(mib, this);
                            this.adsl2SCStatusMtime = new Adsl2SCStatusMtimeEnt(mib, this);
                            this.adsl2SCStatusSnr = new Adsl2SCStatusSnrEnt(mib, this);
                            this.adsl2SCStatusBitsAlloc = new Adsl2SCStatusBitsAllocEnt(mib, this);
                            this.adsl2SCStatusGainAlloc = new Adsl2SCStatusGainAllocEnt(mib, this);
                            this.adsl2SCStatusTssi = new Adsl2SCStatusTssiEnt(mib, this);
                            this.adsl2SCStatusLinScale = new Adsl2SCStatusLinScaleEnt(mib, this);
                            this.adsl2SCStatusLinReal = new Adsl2SCStatusLinRealEnt(mib, this);
                            this.adsl2SCStatusLinImg = new Adsl2SCStatusLinImgEnt(mib, this);
                            this.adsl2SCStatusLogMt = new Adsl2SCStatusLogMtEnt(mib, this);
                            this.adsl2SCStatusLog = new Adsl2SCStatusLogEnt(mib, this);
                            this.adsl2SCStatusQlnMt = new Adsl2SCStatusQlnMtEnt(mib, this);
                            this.adsl2SCStatusQln = new Adsl2SCStatusQlnEnt(mib, this);
                            this.adsl2SCStatusLnAtten = new Adsl2SCStatusLnAttenEnt(mib, this);
                            this.adsl2SCStatusSigAtten = new Adsl2SCStatusSigAttenEnt(mib, this);
                            this.adsl2SCStatusSnrMargin = new Adsl2SCStatusSnrMarginEnt(mib, this);
                            this.adsl2SCStatusAttainableRate = new Adsl2SCStatusAttainableRateEnt(mib, this);
                            this.adsl2SCStatusActAtp = new Adsl2SCStatusActAtpEnt(mib, this);
                            this.adsl2SCStatusRowStatus = new Adsl2SCStatusRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2SCStatusDirection,
                                this.adsl2SCStatusMtime,
                                this.adsl2SCStatusSnr,
                                this.adsl2SCStatusBitsAlloc,
                                this.adsl2SCStatusGainAlloc,
                                this.adsl2SCStatusTssi,
                                this.adsl2SCStatusLinScale,
                                this.adsl2SCStatusLinReal,
                                this.adsl2SCStatusLinImg,
                                this.adsl2SCStatusLogMt,
                                this.adsl2SCStatusLog,
                                this.adsl2SCStatusQlnMt,
                                this.adsl2SCStatusQln,
                                this.adsl2SCStatusLnAtten,
                                this.adsl2SCStatusSigAtten,
                                this.adsl2SCStatusSnrMargin,
                                this.adsl2SCStatusAttainableRate,
                                this.adsl2SCStatusActAtp,
                                this.adsl2SCStatusRowStatus
                            };
                        }
                        public static final class Adsl2SCStatusDirectionEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusDirectionEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusDirection", "1.3.6.1.2.1.10.238.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusMtimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusMtimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusMtime", "1.3.6.1.2.1.10.238.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusSnrEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusSnrEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusSnr", "1.3.6.1.2.1.10.238.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusBitsAllocEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusBitsAllocEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusBitsAlloc", "1.3.6.1.2.1.10.238.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusGainAllocEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusGainAllocEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusGainAlloc", "1.3.6.1.2.1.10.238.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusTssiEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusTssiEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusTssi", "1.3.6.1.2.1.10.238.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusLinScaleEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusLinScaleEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusLinScale", "1.3.6.1.2.1.10.238.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusLinRealEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusLinRealEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusLinReal", "1.3.6.1.2.1.10.238.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusLinImgEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusLinImgEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusLinImg", "1.3.6.1.2.1.10.238.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusLogMtEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusLogMtEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusLogMt", "1.3.6.1.2.1.10.238.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusLogEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusLogEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusLog", "1.3.6.1.2.1.10.238.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusQlnMtEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusQlnMtEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusQlnMt", "1.3.6.1.2.1.10.238.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusQlnEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusQlnEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusQln", "1.3.6.1.2.1.10.238.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusLnAttenEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusLnAttenEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusLnAtten", "1.3.6.1.2.1.10.238.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusSigAttenEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusSigAttenEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusSigAtten", "1.3.6.1.2.1.10.238.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusSnrMarginEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusSnrMarginEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusSnrMargin", "1.3.6.1.2.1.10.238.1.2.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusAttainableRateEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusAttainableRateEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusAttainableRate", "1.3.6.1.2.1.10.238.1.2.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusActAtpEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusActAtpEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusActAtp", "1.3.6.1.2.1.10.238.1.2.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2SCStatusRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2SCStatusRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2SCStatusRowStatus", "1.3.6.1.2.1.10.238.1.2.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Adsl2InventoryEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ------------------------
adsl2LineInventoryTable             --
------------------------*/
                public final Adsl2LineInventoryTableEnt adsl2LineInventoryTable;

                private Adsl2InventoryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Inventory", "1.3.6.1.2.1.10.238.1.3", false, false, false, false);
                    this.adsl2LineInventoryTable = new Adsl2LineInventoryTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2LineInventoryTable
                    };
                }
                public static final class Adsl2LineInventoryTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    public final Adsl2LineInventoryEntryEnt adsl2LineInventoryEntry;

                    private Adsl2LineInventoryTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LineInventoryTable", "1.3.6.1.2.1.10.238.1.3.1", false, true, false, false);
                        this.adsl2LineInventoryEntry = new Adsl2LineInventoryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2LineInventoryEntry
                        };
                    }
                    public static final class Adsl2LineInventoryEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LInvUnitEnt adsl2LInvUnit;

                        public final Adsl2LInvG994VendorIdEnt adsl2LInvG994VendorId;

                        public final Adsl2LInvSystemVendorIdEnt adsl2LInvSystemVendorId;

                        public final Adsl2LInvVersionNumberEnt adsl2LInvVersionNumber;

                        public final Adsl2LInvSerialNumberEnt adsl2LInvSerialNumber;

                        public final Adsl2LInvSelfTestResultEnt adsl2LInvSelfTestResult;

                        public final Adsl2LInvTransmissionCapabilitiesEnt adsl2LInvTransmissionCapabilities;

                        private Adsl2LineInventoryEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineInventoryEntry", "1.3.6.1.2.1.10.238.1.3.1.1", false, false, false, true);
                            this.adsl2LInvUnit = new Adsl2LInvUnitEnt(mib, this);
                            this.adsl2LInvG994VendorId = new Adsl2LInvG994VendorIdEnt(mib, this);
                            this.adsl2LInvSystemVendorId = new Adsl2LInvSystemVendorIdEnt(mib, this);
                            this.adsl2LInvVersionNumber = new Adsl2LInvVersionNumberEnt(mib, this);
                            this.adsl2LInvSerialNumber = new Adsl2LInvSerialNumberEnt(mib, this);
                            this.adsl2LInvSelfTestResult = new Adsl2LInvSelfTestResultEnt(mib, this);
                            this.adsl2LInvTransmissionCapabilities = new Adsl2LInvTransmissionCapabilitiesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LInvUnit,
                                this.adsl2LInvG994VendorId,
                                this.adsl2LInvSystemVendorId,
                                this.adsl2LInvVersionNumber,
                                this.adsl2LInvSerialNumber,
                                this.adsl2LInvSelfTestResult,
                                this.adsl2LInvTransmissionCapabilities
                            };
                        }
                        public static final class Adsl2LInvUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvUnit", "1.3.6.1.2.1.10.238.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LInvG994VendorIdEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvG994VendorIdEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvG994VendorId", "1.3.6.1.2.1.10.238.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LInvSystemVendorIdEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvSystemVendorIdEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvSystemVendorId", "1.3.6.1.2.1.10.238.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LInvVersionNumberEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvVersionNumberEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvVersionNumber", "1.3.6.1.2.1.10.238.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LInvSerialNumberEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvSerialNumberEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvSerialNumber", "1.3.6.1.2.1.10.238.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LInvSelfTestResultEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvSelfTestResultEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvSelfTestResult", "1.3.6.1.2.1.10.238.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Adsl2LInvTransmissionCapabilitiesEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            private Adsl2LInvTransmissionCapabilitiesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LInvTransmissionCapabilities", "1.3.6.1.2.1.10.238.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Adsl2PMEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ------------------------*/
                public final Adsl2PMLineEnt adsl2PMLine;

                public final Adsl2PMChannelEnt adsl2PMChannel;

                private Adsl2PMEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2PM", "1.3.6.1.2.1.10.238.1.4", false, false, false, false);
                    this.adsl2PMLine = new Adsl2PMLineEnt(mib, this);
                    this.adsl2PMChannel = new Adsl2PMChannelEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2PMLine,
                        this.adsl2PMChannel
                    };
                }
                public static final class Adsl2PMLineEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** ------------------------
PM line current counters          --
------------------------*/
                    public final Adsl2PMLineCurrTableEnt adsl2PMLineCurrTable;

                    /** ------------------------
PM line init current counters     --
------------------------*/
                    public final Adsl2PMLineCurrInitTableEnt adsl2PMLineCurrInitTable;

                    /** ---------------------PM line history 15 Minutes      --
---------------------*/
                    public final Adsl2PMLineHist15MinTableEnt adsl2PMLineHist15MinTable;

                    /** -------------------PM line history 1 Day       --
-------------------*/
                    public final Adsl2PMLineHist1DayTableEnt adsl2PMLineHist1DayTable;

                    /** ---------------------PM line init history 15 Minutes   --
---------------------*/
                    public final Adsl2PMLineInitHist15MinTableEnt adsl2PMLineInitHist15MinTable;

                    /** ---------------------PM line init history 1 Day      --
---------------------*/
                    public final Adsl2PMLineInitHist1DayTableEnt adsl2PMLineInitHist1DayTable;

                    private Adsl2PMLineEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2PMLine", "1.3.6.1.2.1.10.238.1.4.1", false, false, false, false);
                        this.adsl2PMLineCurrTable = new Adsl2PMLineCurrTableEnt(mib, this);
                        this.adsl2PMLineCurrInitTable = new Adsl2PMLineCurrInitTableEnt(mib, this);
                        this.adsl2PMLineHist15MinTable = new Adsl2PMLineHist15MinTableEnt(mib, this);
                        this.adsl2PMLineHist1DayTable = new Adsl2PMLineHist1DayTableEnt(mib, this);
                        this.adsl2PMLineInitHist15MinTable = new Adsl2PMLineInitHist15MinTableEnt(mib, this);
                        this.adsl2PMLineInitHist1DayTable = new Adsl2PMLineInitHist1DayTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2PMLineCurrTable,
                            this.adsl2PMLineCurrInitTable,
                            this.adsl2PMLineHist15MinTable,
                            this.adsl2PMLineHist1DayTable,
                            this.adsl2PMLineInitHist15MinTable,
                            this.adsl2PMLineInitHist1DayTable
                        };
                    }
                    public static final class Adsl2PMLineCurrTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMLineCurrEntryEnt adsl2PMLineCurrEntry;

                        private Adsl2PMLineCurrTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineCurrTable", "1.3.6.1.2.1.10.238.1.4.1.1", false, true, false, false);
                            this.adsl2PMLineCurrEntry = new Adsl2PMLineCurrEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMLineCurrEntry
                            };
                        }
                        public static final class Adsl2PMLineCurrEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMLCurrUnitEnt adsl2PMLCurrUnit;

                            public final Adsl2PMLCurrValidIntervalsEnt adsl2PMLCurrValidIntervals;

                            public final Adsl2PMLCurrInvalidIntervalsEnt adsl2PMLCurrInvalidIntervals;

                            public final Adsl2PMLCurr15MTimeElapsedEnt adsl2PMLCurr15MTimeElapsed;

                            public final Adsl2PMLCurr15MFecsEnt adsl2PMLCurr15MFecs;

                            public final Adsl2PMLCurr15MEsEnt adsl2PMLCurr15MEs;

                            public final Adsl2PMLCurr15MSesEnt adsl2PMLCurr15MSes;

                            public final Adsl2PMLCurr15MLossEnt adsl2PMLCurr15MLoss;

                            public final Adsl2PMLCurr15MUasEnt adsl2PMLCurr15MUas;

                            public final Adsl2PMLCurr1DayValidIntervalsEnt adsl2PMLCurr1DayValidIntervals;

                            public final Adsl2PMLCurr1DayInvalidIntervalsEnt adsl2PMLCurr1DayInvalidIntervals;

                            public final Adsl2PMLCurr1DayTimeElapsedEnt adsl2PMLCurr1DayTimeElapsed;

                            public final Adsl2PMLCurr1DayFecsEnt adsl2PMLCurr1DayFecs;

                            public final Adsl2PMLCurr1DayEsEnt adsl2PMLCurr1DayEs;

                            public final Adsl2PMLCurr1DaySesEnt adsl2PMLCurr1DaySes;

                            public final Adsl2PMLCurr1DayLossEnt adsl2PMLCurr1DayLoss;

                            public final Adsl2PMLCurr1DayUasEnt adsl2PMLCurr1DayUas;

                            private Adsl2PMLineCurrEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMLineCurrEntry", "1.3.6.1.2.1.10.238.1.4.1.1.1", false, false, false, true);
                                this.adsl2PMLCurrUnit = new Adsl2PMLCurrUnitEnt(mib, this);
                                this.adsl2PMLCurrValidIntervals = new Adsl2PMLCurrValidIntervalsEnt(mib, this);
                                this.adsl2PMLCurrInvalidIntervals = new Adsl2PMLCurrInvalidIntervalsEnt(mib, this);
                                this.adsl2PMLCurr15MTimeElapsed = new Adsl2PMLCurr15MTimeElapsedEnt(mib, this);
                                this.adsl2PMLCurr15MFecs = new Adsl2PMLCurr15MFecsEnt(mib, this);
                                this.adsl2PMLCurr15MEs = new Adsl2PMLCurr15MEsEnt(mib, this);
                                this.adsl2PMLCurr15MSes = new Adsl2PMLCurr15MSesEnt(mib, this);
                                this.adsl2PMLCurr15MLoss = new Adsl2PMLCurr15MLossEnt(mib, this);
                                this.adsl2PMLCurr15MUas = new Adsl2PMLCurr15MUasEnt(mib, this);
                                this.adsl2PMLCurr1DayValidIntervals = new Adsl2PMLCurr1DayValidIntervalsEnt(mib, this);
                                this.adsl2PMLCurr1DayInvalidIntervals = new Adsl2PMLCurr1DayInvalidIntervalsEnt(mib, this);
                                this.adsl2PMLCurr1DayTimeElapsed = new Adsl2PMLCurr1DayTimeElapsedEnt(mib, this);
                                this.adsl2PMLCurr1DayFecs = new Adsl2PMLCurr1DayFecsEnt(mib, this);
                                this.adsl2PMLCurr1DayEs = new Adsl2PMLCurr1DayEsEnt(mib, this);
                                this.adsl2PMLCurr1DaySes = new Adsl2PMLCurr1DaySesEnt(mib, this);
                                this.adsl2PMLCurr1DayLoss = new Adsl2PMLCurr1DayLossEnt(mib, this);
                                this.adsl2PMLCurr1DayUas = new Adsl2PMLCurr1DayUasEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMLCurrUnit,
                                    this.adsl2PMLCurrValidIntervals,
                                    this.adsl2PMLCurrInvalidIntervals,
                                    this.adsl2PMLCurr15MTimeElapsed,
                                    this.adsl2PMLCurr15MFecs,
                                    this.adsl2PMLCurr15MEs,
                                    this.adsl2PMLCurr15MSes,
                                    this.adsl2PMLCurr15MLoss,
                                    this.adsl2PMLCurr15MUas,
                                    this.adsl2PMLCurr1DayValidIntervals,
                                    this.adsl2PMLCurr1DayInvalidIntervals,
                                    this.adsl2PMLCurr1DayTimeElapsed,
                                    this.adsl2PMLCurr1DayFecs,
                                    this.adsl2PMLCurr1DayEs,
                                    this.adsl2PMLCurr1DaySes,
                                    this.adsl2PMLCurr1DayLoss,
                                    this.adsl2PMLCurr1DayUas
                                };
                            }
                            public static final class Adsl2PMLCurrUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrUnit", "1.3.6.1.2.1.10.238.1.4.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrValidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrValidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrValidIntervals", "1.3.6.1.2.1.10.238.1.4.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInvalidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInvalidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInvalidIntervals", "1.3.6.1.2.1.10.238.1.4.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr15MTimeElapsedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr15MTimeElapsedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr15MTimeElapsed", "1.3.6.1.2.1.10.238.1.4.1.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr15MFecsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr15MFecsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr15MFecs", "1.3.6.1.2.1.10.238.1.4.1.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr15MEsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr15MEsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr15MEs", "1.3.6.1.2.1.10.238.1.4.1.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr15MSesEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr15MSesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr15MSes", "1.3.6.1.2.1.10.238.1.4.1.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr15MLossEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr15MLossEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr15MLoss", "1.3.6.1.2.1.10.238.1.4.1.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr15MUasEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr15MUasEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr15MUas", "1.3.6.1.2.1.10.238.1.4.1.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayValidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayValidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayValidIntervals", "1.3.6.1.2.1.10.238.1.4.1.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayInvalidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayInvalidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayInvalidIntervals", "1.3.6.1.2.1.10.238.1.4.1.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayTimeElapsedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayTimeElapsedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayTimeElapsed", "1.3.6.1.2.1.10.238.1.4.1.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayFecsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayFecsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayFecs", "1.3.6.1.2.1.10.238.1.4.1.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayEsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayEsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayEs", "1.3.6.1.2.1.10.238.1.4.1.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DaySesEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DaySesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DaySes", "1.3.6.1.2.1.10.238.1.4.1.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayLossEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayLossEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayLoss", "1.3.6.1.2.1.10.238.1.4.1.1.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurr1DayUasEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurr1DayUasEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurr1DayUas", "1.3.6.1.2.1.10.238.1.4.1.1.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMLineCurrInitTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMLineCurrInitEntryEnt adsl2PMLineCurrInitEntry;

                        private Adsl2PMLineCurrInitTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineCurrInitTable", "1.3.6.1.2.1.10.238.1.4.1.2", false, true, false, false);
                            this.adsl2PMLineCurrInitEntry = new Adsl2PMLineCurrInitEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMLineCurrInitEntry
                            };
                        }
                        public static final class Adsl2PMLineCurrInitEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMLCurrInit15MTimeElapsedEnt adsl2PMLCurrInit15MTimeElapsed;

                            public final Adsl2PMLCurrInit15MFullInitsEnt adsl2PMLCurrInit15MFullInits;

                            public final Adsl2PMLCurrInit15MFailedFullInitsEnt adsl2PMLCurrInit15MFailedFullInits;

                            public final Adsl2PMLCurrInit15MShortInitsEnt adsl2PMLCurrInit15MShortInits;

                            public final Adsl2PMLCurrInit15MFailedShortInitsEnt adsl2PMLCurrInit15MFailedShortInits;

                            public final Adsl2PMLCurrInit1DayTimeElapsedEnt adsl2PMLCurrInit1DayTimeElapsed;

                            public final Adsl2PMLCurrInit1DayFullInitsEnt adsl2PMLCurrInit1DayFullInits;

                            public final Adsl2PMLCurrInit1DayFailedFullInitsEnt adsl2PMLCurrInit1DayFailedFullInits;

                            public final Adsl2PMLCurrInit1DayShortInitsEnt adsl2PMLCurrInit1DayShortInits;

                            public final Adsl2PMLCurrInit1DayFailedShortInitsEnt adsl2PMLCurrInit1DayFailedShortInits;

                            private Adsl2PMLineCurrInitEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMLineCurrInitEntry", "1.3.6.1.2.1.10.238.1.4.1.2.1", false, false, false, true);
                                this.adsl2PMLCurrInit15MTimeElapsed = new Adsl2PMLCurrInit15MTimeElapsedEnt(mib, this);
                                this.adsl2PMLCurrInit15MFullInits = new Adsl2PMLCurrInit15MFullInitsEnt(mib, this);
                                this.adsl2PMLCurrInit15MFailedFullInits = new Adsl2PMLCurrInit15MFailedFullInitsEnt(mib, this);
                                this.adsl2PMLCurrInit15MShortInits = new Adsl2PMLCurrInit15MShortInitsEnt(mib, this);
                                this.adsl2PMLCurrInit15MFailedShortInits = new Adsl2PMLCurrInit15MFailedShortInitsEnt(mib, this);
                                this.adsl2PMLCurrInit1DayTimeElapsed = new Adsl2PMLCurrInit1DayTimeElapsedEnt(mib, this);
                                this.adsl2PMLCurrInit1DayFullInits = new Adsl2PMLCurrInit1DayFullInitsEnt(mib, this);
                                this.adsl2PMLCurrInit1DayFailedFullInits = new Adsl2PMLCurrInit1DayFailedFullInitsEnt(mib, this);
                                this.adsl2PMLCurrInit1DayShortInits = new Adsl2PMLCurrInit1DayShortInitsEnt(mib, this);
                                this.adsl2PMLCurrInit1DayFailedShortInits = new Adsl2PMLCurrInit1DayFailedShortInitsEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMLCurrInit15MTimeElapsed,
                                    this.adsl2PMLCurrInit15MFullInits,
                                    this.adsl2PMLCurrInit15MFailedFullInits,
                                    this.adsl2PMLCurrInit15MShortInits,
                                    this.adsl2PMLCurrInit15MFailedShortInits,
                                    this.adsl2PMLCurrInit1DayTimeElapsed,
                                    this.adsl2PMLCurrInit1DayFullInits,
                                    this.adsl2PMLCurrInit1DayFailedFullInits,
                                    this.adsl2PMLCurrInit1DayShortInits,
                                    this.adsl2PMLCurrInit1DayFailedShortInits
                                };
                            }
                            public static final class Adsl2PMLCurrInit15MTimeElapsedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit15MTimeElapsedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit15MTimeElapsed", "1.3.6.1.2.1.10.238.1.4.1.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit15MFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit15MFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit15MFullInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit15MFailedFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit15MFailedFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit15MFailedFullInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit15MShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit15MShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit15MShortInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit15MFailedShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit15MFailedShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit15MFailedShortInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit1DayTimeElapsedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit1DayTimeElapsedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit1DayTimeElapsed", "1.3.6.1.2.1.10.238.1.4.1.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit1DayFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit1DayFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit1DayFullInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit1DayFailedFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit1DayFailedFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit1DayFailedFullInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit1DayShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit1DayShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit1DayShortInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLCurrInit1DayFailedShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLCurrInit1DayFailedShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLCurrInit1DayFailedShortInits", "1.3.6.1.2.1.10.238.1.4.1.2.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMLineHist15MinTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMLineHist15MinEntryEnt adsl2PMLineHist15MinEntry;

                        private Adsl2PMLineHist15MinTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineHist15MinTable", "1.3.6.1.2.1.10.238.1.4.1.3", false, true, false, false);
                            this.adsl2PMLineHist15MinEntry = new Adsl2PMLineHist15MinEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMLineHist15MinEntry
                            };
                        }
                        public static final class Adsl2PMLineHist15MinEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMLHist15MUnitEnt adsl2PMLHist15MUnit;

                            public final Adsl2PMLHist15MIntervalEnt adsl2PMLHist15MInterval;

                            public final Adsl2PMLHist15MMonitoredTimeEnt adsl2PMLHist15MMonitoredTime;

                            public final Adsl2PMLHist15MFecsEnt adsl2PMLHist15MFecs;

                            public final Adsl2PMLHist15MEsEnt adsl2PMLHist15MEs;

                            public final Adsl2PMLHist15MSesEnt adsl2PMLHist15MSes;

                            public final Adsl2PMLHist15MLossEnt adsl2PMLHist15MLoss;

                            public final Adsl2PMLHist15MUasEnt adsl2PMLHist15MUas;

                            public final Adsl2PMLHist15MValidIntervalEnt adsl2PMLHist15MValidInterval;

                            private Adsl2PMLineHist15MinEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMLineHist15MinEntry", "1.3.6.1.2.1.10.238.1.4.1.3.1", false, false, false, true);
                                this.adsl2PMLHist15MUnit = new Adsl2PMLHist15MUnitEnt(mib, this);
                                this.adsl2PMLHist15MInterval = new Adsl2PMLHist15MIntervalEnt(mib, this);
                                this.adsl2PMLHist15MMonitoredTime = new Adsl2PMLHist15MMonitoredTimeEnt(mib, this);
                                this.adsl2PMLHist15MFecs = new Adsl2PMLHist15MFecsEnt(mib, this);
                                this.adsl2PMLHist15MEs = new Adsl2PMLHist15MEsEnt(mib, this);
                                this.adsl2PMLHist15MSes = new Adsl2PMLHist15MSesEnt(mib, this);
                                this.adsl2PMLHist15MLoss = new Adsl2PMLHist15MLossEnt(mib, this);
                                this.adsl2PMLHist15MUas = new Adsl2PMLHist15MUasEnt(mib, this);
                                this.adsl2PMLHist15MValidInterval = new Adsl2PMLHist15MValidIntervalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMLHist15MUnit,
                                    this.adsl2PMLHist15MInterval,
                                    this.adsl2PMLHist15MMonitoredTime,
                                    this.adsl2PMLHist15MFecs,
                                    this.adsl2PMLHist15MEs,
                                    this.adsl2PMLHist15MSes,
                                    this.adsl2PMLHist15MLoss,
                                    this.adsl2PMLHist15MUas,
                                    this.adsl2PMLHist15MValidInterval
                                };
                            }
                            public static final class Adsl2PMLHist15MUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MUnit", "1.3.6.1.2.1.10.238.1.4.1.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MInterval", "1.3.6.1.2.1.10.238.1.4.1.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MMonitoredTimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MMonitoredTimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MMonitoredTime", "1.3.6.1.2.1.10.238.1.4.1.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MFecsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MFecsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MFecs", "1.3.6.1.2.1.10.238.1.4.1.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MEsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MEsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MEs", "1.3.6.1.2.1.10.238.1.4.1.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MSesEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MSesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MSes", "1.3.6.1.2.1.10.238.1.4.1.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MLossEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MLossEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MLoss", "1.3.6.1.2.1.10.238.1.4.1.3.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MUasEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MUasEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MUas", "1.3.6.1.2.1.10.238.1.4.1.3.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist15MValidIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist15MValidIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist15MValidInterval", "1.3.6.1.2.1.10.238.1.4.1.3.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMLineHist1DayTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMLineHist1DayEntryEnt adsl2PMLineHist1DayEntry;

                        private Adsl2PMLineHist1DayTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineHist1DayTable", "1.3.6.1.2.1.10.238.1.4.1.4", false, true, false, false);
                            this.adsl2PMLineHist1DayEntry = new Adsl2PMLineHist1DayEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMLineHist1DayEntry
                            };
                        }
                        public static final class Adsl2PMLineHist1DayEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMLHist1DUnitEnt adsl2PMLHist1DUnit;

                            public final Adsl2PMLHist1DIntervalEnt adsl2PMLHist1DInterval;

                            public final Adsl2PMLHist1DMonitoredTimeEnt adsl2PMLHist1DMonitoredTime;

                            public final Adsl2PMLHist1DFecsEnt adsl2PMLHist1DFecs;

                            public final Adsl2PMLHist1DEsEnt adsl2PMLHist1DEs;

                            public final Adsl2PMLHist1DSesEnt adsl2PMLHist1DSes;

                            public final Adsl2PMLHist1DLossEnt adsl2PMLHist1DLoss;

                            public final Adsl2PMLHist1DUasEnt adsl2PMLHist1DUas;

                            public final Adsl2PMLHist1DValidIntervalEnt adsl2PMLHist1DValidInterval;

                            private Adsl2PMLineHist1DayEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMLineHist1DayEntry", "1.3.6.1.2.1.10.238.1.4.1.4.1", false, false, false, true);
                                this.adsl2PMLHist1DUnit = new Adsl2PMLHist1DUnitEnt(mib, this);
                                this.adsl2PMLHist1DInterval = new Adsl2PMLHist1DIntervalEnt(mib, this);
                                this.adsl2PMLHist1DMonitoredTime = new Adsl2PMLHist1DMonitoredTimeEnt(mib, this);
                                this.adsl2PMLHist1DFecs = new Adsl2PMLHist1DFecsEnt(mib, this);
                                this.adsl2PMLHist1DEs = new Adsl2PMLHist1DEsEnt(mib, this);
                                this.adsl2PMLHist1DSes = new Adsl2PMLHist1DSesEnt(mib, this);
                                this.adsl2PMLHist1DLoss = new Adsl2PMLHist1DLossEnt(mib, this);
                                this.adsl2PMLHist1DUas = new Adsl2PMLHist1DUasEnt(mib, this);
                                this.adsl2PMLHist1DValidInterval = new Adsl2PMLHist1DValidIntervalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMLHist1DUnit,
                                    this.adsl2PMLHist1DInterval,
                                    this.adsl2PMLHist1DMonitoredTime,
                                    this.adsl2PMLHist1DFecs,
                                    this.adsl2PMLHist1DEs,
                                    this.adsl2PMLHist1DSes,
                                    this.adsl2PMLHist1DLoss,
                                    this.adsl2PMLHist1DUas,
                                    this.adsl2PMLHist1DValidInterval
                                };
                            }
                            public static final class Adsl2PMLHist1DUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DUnit", "1.3.6.1.2.1.10.238.1.4.1.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DInterval", "1.3.6.1.2.1.10.238.1.4.1.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DMonitoredTimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DMonitoredTimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DMonitoredTime", "1.3.6.1.2.1.10.238.1.4.1.4.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DFecsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DFecsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DFecs", "1.3.6.1.2.1.10.238.1.4.1.4.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DEsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DEsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DEs", "1.3.6.1.2.1.10.238.1.4.1.4.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DSesEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DSesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DSes", "1.3.6.1.2.1.10.238.1.4.1.4.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DLossEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DLossEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DLoss", "1.3.6.1.2.1.10.238.1.4.1.4.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DUasEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DUasEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DUas", "1.3.6.1.2.1.10.238.1.4.1.4.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHist1DValidIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHist1DValidIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHist1DValidInterval", "1.3.6.1.2.1.10.238.1.4.1.4.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMLineInitHist15MinTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMLineInitHist15MinEntryEnt adsl2PMLineInitHist15MinEntry;

                        private Adsl2PMLineInitHist15MinTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineInitHist15MinTable", "1.3.6.1.2.1.10.238.1.4.1.5", false, true, false, false);
                            this.adsl2PMLineInitHist15MinEntry = new Adsl2PMLineInitHist15MinEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMLineInitHist15MinEntry
                            };
                        }
                        public static final class Adsl2PMLineInitHist15MinEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMLHistInit15MIntervalEnt adsl2PMLHistInit15MInterval;

                            public final Adsl2PMLHistInit15MMonitoredTimeEnt adsl2PMLHistInit15MMonitoredTime;

                            public final Adsl2PMLHistInit15MFullInitsEnt adsl2PMLHistInit15MFullInits;

                            public final Adsl2PMLHistInit15MFailedFullInitsEnt adsl2PMLHistInit15MFailedFullInits;

                            public final Adsl2PMLHistInit15MShortInitsEnt adsl2PMLHistInit15MShortInits;

                            public final Adsl2PMLHistInit15MFailedShortInitsEnt adsl2PMLHistInit15MFailedShortInits;

                            public final Adsl2PMLHistInit15MValidIntervalEnt adsl2PMLHistInit15MValidInterval;

                            private Adsl2PMLineInitHist15MinEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMLineInitHist15MinEntry", "1.3.6.1.2.1.10.238.1.4.1.5.1", false, false, false, true);
                                this.adsl2PMLHistInit15MInterval = new Adsl2PMLHistInit15MIntervalEnt(mib, this);
                                this.adsl2PMLHistInit15MMonitoredTime = new Adsl2PMLHistInit15MMonitoredTimeEnt(mib, this);
                                this.adsl2PMLHistInit15MFullInits = new Adsl2PMLHistInit15MFullInitsEnt(mib, this);
                                this.adsl2PMLHistInit15MFailedFullInits = new Adsl2PMLHistInit15MFailedFullInitsEnt(mib, this);
                                this.adsl2PMLHistInit15MShortInits = new Adsl2PMLHistInit15MShortInitsEnt(mib, this);
                                this.adsl2PMLHistInit15MFailedShortInits = new Adsl2PMLHistInit15MFailedShortInitsEnt(mib, this);
                                this.adsl2PMLHistInit15MValidInterval = new Adsl2PMLHistInit15MValidIntervalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMLHistInit15MInterval,
                                    this.adsl2PMLHistInit15MMonitoredTime,
                                    this.adsl2PMLHistInit15MFullInits,
                                    this.adsl2PMLHistInit15MFailedFullInits,
                                    this.adsl2PMLHistInit15MShortInits,
                                    this.adsl2PMLHistInit15MFailedShortInits,
                                    this.adsl2PMLHistInit15MValidInterval
                                };
                            }
                            public static final class Adsl2PMLHistInit15MIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MInterval", "1.3.6.1.2.1.10.238.1.4.1.5.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistInit15MMonitoredTimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MMonitoredTimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MMonitoredTime", "1.3.6.1.2.1.10.238.1.4.1.5.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistInit15MFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MFullInits", "1.3.6.1.2.1.10.238.1.4.1.5.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistInit15MFailedFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MFailedFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MFailedFullInits", "1.3.6.1.2.1.10.238.1.4.1.5.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistInit15MShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MShortInits", "1.3.6.1.2.1.10.238.1.4.1.5.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistInit15MFailedShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MFailedShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MFailedShortInits", "1.3.6.1.2.1.10.238.1.4.1.5.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistInit15MValidIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistInit15MValidIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistInit15MValidInterval", "1.3.6.1.2.1.10.238.1.4.1.5.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMLineInitHist1DayTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMLineInitHist1DayEntryEnt adsl2PMLineInitHist1DayEntry;

                        private Adsl2PMLineInitHist1DayTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineInitHist1DayTable", "1.3.6.1.2.1.10.238.1.4.1.6", false, true, false, false);
                            this.adsl2PMLineInitHist1DayEntry = new Adsl2PMLineInitHist1DayEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMLineInitHist1DayEntry
                            };
                        }
                        public static final class Adsl2PMLineInitHist1DayEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMLHistinit1DIntervalEnt adsl2PMLHistinit1DInterval;

                            public final Adsl2PMLHistinit1DMonitoredTimeEnt adsl2PMLHistinit1DMonitoredTime;

                            public final Adsl2PMLHistinit1DFullInitsEnt adsl2PMLHistinit1DFullInits;

                            public final Adsl2PMLHistinit1DFailedFullInitsEnt adsl2PMLHistinit1DFailedFullInits;

                            public final Adsl2PMLHistinit1DShortInitsEnt adsl2PMLHistinit1DShortInits;

                            public final Adsl2PMLHistinit1DFailedShortInitsEnt adsl2PMLHistinit1DFailedShortInits;

                            public final Adsl2PMLHistinit1DValidIntervalEnt adsl2PMLHistinit1DValidInterval;

                            private Adsl2PMLineInitHist1DayEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMLineInitHist1DayEntry", "1.3.6.1.2.1.10.238.1.4.1.6.1", false, false, false, true);
                                this.adsl2PMLHistinit1DInterval = new Adsl2PMLHistinit1DIntervalEnt(mib, this);
                                this.adsl2PMLHistinit1DMonitoredTime = new Adsl2PMLHistinit1DMonitoredTimeEnt(mib, this);
                                this.adsl2PMLHistinit1DFullInits = new Adsl2PMLHistinit1DFullInitsEnt(mib, this);
                                this.adsl2PMLHistinit1DFailedFullInits = new Adsl2PMLHistinit1DFailedFullInitsEnt(mib, this);
                                this.adsl2PMLHistinit1DShortInits = new Adsl2PMLHistinit1DShortInitsEnt(mib, this);
                                this.adsl2PMLHistinit1DFailedShortInits = new Adsl2PMLHistinit1DFailedShortInitsEnt(mib, this);
                                this.adsl2PMLHistinit1DValidInterval = new Adsl2PMLHistinit1DValidIntervalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMLHistinit1DInterval,
                                    this.adsl2PMLHistinit1DMonitoredTime,
                                    this.adsl2PMLHistinit1DFullInits,
                                    this.adsl2PMLHistinit1DFailedFullInits,
                                    this.adsl2PMLHistinit1DShortInits,
                                    this.adsl2PMLHistinit1DFailedShortInits,
                                    this.adsl2PMLHistinit1DValidInterval
                                };
                            }
                            public static final class Adsl2PMLHistinit1DIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DInterval", "1.3.6.1.2.1.10.238.1.4.1.6.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistinit1DMonitoredTimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DMonitoredTimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DMonitoredTime", "1.3.6.1.2.1.10.238.1.4.1.6.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistinit1DFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DFullInits", "1.3.6.1.2.1.10.238.1.4.1.6.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistinit1DFailedFullInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DFailedFullInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DFailedFullInits", "1.3.6.1.2.1.10.238.1.4.1.6.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistinit1DShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DShortInits", "1.3.6.1.2.1.10.238.1.4.1.6.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistinit1DFailedShortInitsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DFailedShortInitsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DFailedShortInits", "1.3.6.1.2.1.10.238.1.4.1.6.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMLHistinit1DValidIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMLHistinit1DValidIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMLHistinit1DValidInterval", "1.3.6.1.2.1.10.238.1.4.1.6.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class Adsl2PMChannelEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** -------------------------PM channel current counters          --
-------------------------*/
                    public final Adsl2PMChCurrTableEnt adsl2PMChCurrTable;

                    /** ---------------------PM channel history 15 Minutes      --
---------------------*/
                    public final Adsl2PMChHist15MinTableEnt adsl2PMChHist15MinTable;

                    /** --------------------PM channel history 1 Day      --
--------------------*/
                    public final Adsl2PMChHist1DTableEnt adsl2PMChHist1DTable;

                    private Adsl2PMChannelEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2PMChannel", "1.3.6.1.2.1.10.238.1.4.2", false, false, false, false);
                        this.adsl2PMChCurrTable = new Adsl2PMChCurrTableEnt(mib, this);
                        this.adsl2PMChHist15MinTable = new Adsl2PMChHist15MinTableEnt(mib, this);
                        this.adsl2PMChHist1DTable = new Adsl2PMChHist1DTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2PMChCurrTable,
                            this.adsl2PMChHist15MinTable,
                            this.adsl2PMChHist1DTable
                        };
                    }
                    public static final class Adsl2PMChCurrTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMChCurrEntryEnt adsl2PMChCurrEntry;

                        private Adsl2PMChCurrTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMChCurrTable", "1.3.6.1.2.1.10.238.1.4.2.1", false, true, false, false);
                            this.adsl2PMChCurrEntry = new Adsl2PMChCurrEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMChCurrEntry
                            };
                        }
                        public static final class Adsl2PMChCurrEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMChCurrUnitEnt adsl2PMChCurrUnit;

                            public final Adsl2PMChCurrValidIntervalsEnt adsl2PMChCurrValidIntervals;

                            public final Adsl2PMChCurrInvalidIntervalsEnt adsl2PMChCurrInvalidIntervals;

                            public final Adsl2PMChCurr15MTimeElapsedEnt adsl2PMChCurr15MTimeElapsed;

                            public final Adsl2PMChCurr15MCodingViolationsEnt adsl2PMChCurr15MCodingViolations;

                            public final Adsl2PMChCurr15MCorrectedBlocksEnt adsl2PMChCurr15MCorrectedBlocks;

                            public final Adsl2PMChCurr1DayValidIntervalsEnt adsl2PMChCurr1DayValidIntervals;

                            public final Adsl2PMChCurr1DayInvalidIntervalsEnt adsl2PMChCurr1DayInvalidIntervals;

                            public final Adsl2PMChCurr1DayTimeElapsedEnt adsl2PMChCurr1DayTimeElapsed;

                            public final Adsl2PMChCurr1DayCodingViolationsEnt adsl2PMChCurr1DayCodingViolations;

                            public final Adsl2PMChCurr1DayCorrectedBlocksEnt adsl2PMChCurr1DayCorrectedBlocks;

                            private Adsl2PMChCurrEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMChCurrEntry", "1.3.6.1.2.1.10.238.1.4.2.1.1", false, false, false, true);
                                this.adsl2PMChCurrUnit = new Adsl2PMChCurrUnitEnt(mib, this);
                                this.adsl2PMChCurrValidIntervals = new Adsl2PMChCurrValidIntervalsEnt(mib, this);
                                this.adsl2PMChCurrInvalidIntervals = new Adsl2PMChCurrInvalidIntervalsEnt(mib, this);
                                this.adsl2PMChCurr15MTimeElapsed = new Adsl2PMChCurr15MTimeElapsedEnt(mib, this);
                                this.adsl2PMChCurr15MCodingViolations = new Adsl2PMChCurr15MCodingViolationsEnt(mib, this);
                                this.adsl2PMChCurr15MCorrectedBlocks = new Adsl2PMChCurr15MCorrectedBlocksEnt(mib, this);
                                this.adsl2PMChCurr1DayValidIntervals = new Adsl2PMChCurr1DayValidIntervalsEnt(mib, this);
                                this.adsl2PMChCurr1DayInvalidIntervals = new Adsl2PMChCurr1DayInvalidIntervalsEnt(mib, this);
                                this.adsl2PMChCurr1DayTimeElapsed = new Adsl2PMChCurr1DayTimeElapsedEnt(mib, this);
                                this.adsl2PMChCurr1DayCodingViolations = new Adsl2PMChCurr1DayCodingViolationsEnt(mib, this);
                                this.adsl2PMChCurr1DayCorrectedBlocks = new Adsl2PMChCurr1DayCorrectedBlocksEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMChCurrUnit,
                                    this.adsl2PMChCurrValidIntervals,
                                    this.adsl2PMChCurrInvalidIntervals,
                                    this.adsl2PMChCurr15MTimeElapsed,
                                    this.adsl2PMChCurr15MCodingViolations,
                                    this.adsl2PMChCurr15MCorrectedBlocks,
                                    this.adsl2PMChCurr1DayValidIntervals,
                                    this.adsl2PMChCurr1DayInvalidIntervals,
                                    this.adsl2PMChCurr1DayTimeElapsed,
                                    this.adsl2PMChCurr1DayCodingViolations,
                                    this.adsl2PMChCurr1DayCorrectedBlocks
                                };
                            }
                            public static final class Adsl2PMChCurrUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurrUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurrUnit", "1.3.6.1.2.1.10.238.1.4.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurrValidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurrValidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurrValidIntervals", "1.3.6.1.2.1.10.238.1.4.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurrInvalidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurrInvalidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurrInvalidIntervals", "1.3.6.1.2.1.10.238.1.4.2.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr15MTimeElapsedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr15MTimeElapsedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr15MTimeElapsed", "1.3.6.1.2.1.10.238.1.4.2.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr15MCodingViolationsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr15MCodingViolationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr15MCodingViolations", "1.3.6.1.2.1.10.238.1.4.2.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr15MCorrectedBlocksEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr15MCorrectedBlocksEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr15MCorrectedBlocks", "1.3.6.1.2.1.10.238.1.4.2.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr1DayValidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr1DayValidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr1DayValidIntervals", "1.3.6.1.2.1.10.238.1.4.2.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr1DayInvalidIntervalsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr1DayInvalidIntervalsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr1DayInvalidIntervals", "1.3.6.1.2.1.10.238.1.4.2.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr1DayTimeElapsedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr1DayTimeElapsedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr1DayTimeElapsed", "1.3.6.1.2.1.10.238.1.4.2.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr1DayCodingViolationsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr1DayCodingViolationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr1DayCodingViolations", "1.3.6.1.2.1.10.238.1.4.2.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChCurr1DayCorrectedBlocksEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChCurr1DayCorrectedBlocksEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChCurr1DayCorrectedBlocks", "1.3.6.1.2.1.10.238.1.4.2.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMChHist15MinTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMChHist15MinEntryEnt adsl2PMChHist15MinEntry;

                        private Adsl2PMChHist15MinTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMChHist15MinTable", "1.3.6.1.2.1.10.238.1.4.2.2", false, true, false, false);
                            this.adsl2PMChHist15MinEntry = new Adsl2PMChHist15MinEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMChHist15MinEntry
                            };
                        }
                        public static final class Adsl2PMChHist15MinEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMChHist15MUnitEnt adsl2PMChHist15MUnit;

                            public final Adsl2PMChHist15MIntervalEnt adsl2PMChHist15MInterval;

                            public final Adsl2PMChHist15MMonitoredTimeEnt adsl2PMChHist15MMonitoredTime;

                            public final Adsl2PMChHist15MCodingViolationsEnt adsl2PMChHist15MCodingViolations;

                            public final Adsl2PMChHist15MCorrectedBlocksEnt adsl2PMChHist15MCorrectedBlocks;

                            public final Adsl2PMChHist15MValidIntervalEnt adsl2PMChHist15MValidInterval;

                            private Adsl2PMChHist15MinEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMChHist15MinEntry", "1.3.6.1.2.1.10.238.1.4.2.2.1", false, false, false, true);
                                this.adsl2PMChHist15MUnit = new Adsl2PMChHist15MUnitEnt(mib, this);
                                this.adsl2PMChHist15MInterval = new Adsl2PMChHist15MIntervalEnt(mib, this);
                                this.adsl2PMChHist15MMonitoredTime = new Adsl2PMChHist15MMonitoredTimeEnt(mib, this);
                                this.adsl2PMChHist15MCodingViolations = new Adsl2PMChHist15MCodingViolationsEnt(mib, this);
                                this.adsl2PMChHist15MCorrectedBlocks = new Adsl2PMChHist15MCorrectedBlocksEnt(mib, this);
                                this.adsl2PMChHist15MValidInterval = new Adsl2PMChHist15MValidIntervalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMChHist15MUnit,
                                    this.adsl2PMChHist15MInterval,
                                    this.adsl2PMChHist15MMonitoredTime,
                                    this.adsl2PMChHist15MCodingViolations,
                                    this.adsl2PMChHist15MCorrectedBlocks,
                                    this.adsl2PMChHist15MValidInterval
                                };
                            }
                            public static final class Adsl2PMChHist15MUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist15MUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist15MUnit", "1.3.6.1.2.1.10.238.1.4.2.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist15MIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist15MIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist15MInterval", "1.3.6.1.2.1.10.238.1.4.2.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist15MMonitoredTimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist15MMonitoredTimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist15MMonitoredTime", "1.3.6.1.2.1.10.238.1.4.2.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist15MCodingViolationsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist15MCodingViolationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist15MCodingViolations", "1.3.6.1.2.1.10.238.1.4.2.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist15MCorrectedBlocksEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist15MCorrectedBlocksEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist15MCorrectedBlocks", "1.3.6.1.2.1.10.238.1.4.2.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist15MValidIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist15MValidIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist15MValidInterval", "1.3.6.1.2.1.10.238.1.4.2.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2PMChHist1DTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2PMChHist1DEntryEnt adsl2PMChHist1DEntry;

                        private Adsl2PMChHist1DTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMChHist1DTable", "1.3.6.1.2.1.10.238.1.4.2.3", false, true, false, false);
                            this.adsl2PMChHist1DEntry = new Adsl2PMChHist1DEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2PMChHist1DEntry
                            };
                        }
                        public static final class Adsl2PMChHist1DEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2PMChHist1DUnitEnt adsl2PMChHist1DUnit;

                            public final Adsl2PMChHist1DIntervalEnt adsl2PMChHist1DInterval;

                            public final Adsl2PMChHist1DMonitoredTimeEnt adsl2PMChHist1DMonitoredTime;

                            public final Adsl2PMChHist1DCodingViolationsEnt adsl2PMChHist1DCodingViolations;

                            public final Adsl2PMChHist1DCorrectedBlocksEnt adsl2PMChHist1DCorrectedBlocks;

                            public final Adsl2PMChHist1DValidIntervalEnt adsl2PMChHist1DValidInterval;

                            private Adsl2PMChHist1DEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2PMChHist1DEntry", "1.3.6.1.2.1.10.238.1.4.2.3.1", false, false, false, true);
                                this.adsl2PMChHist1DUnit = new Adsl2PMChHist1DUnitEnt(mib, this);
                                this.adsl2PMChHist1DInterval = new Adsl2PMChHist1DIntervalEnt(mib, this);
                                this.adsl2PMChHist1DMonitoredTime = new Adsl2PMChHist1DMonitoredTimeEnt(mib, this);
                                this.adsl2PMChHist1DCodingViolations = new Adsl2PMChHist1DCodingViolationsEnt(mib, this);
                                this.adsl2PMChHist1DCorrectedBlocks = new Adsl2PMChHist1DCorrectedBlocksEnt(mib, this);
                                this.adsl2PMChHist1DValidInterval = new Adsl2PMChHist1DValidIntervalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2PMChHist1DUnit,
                                    this.adsl2PMChHist1DInterval,
                                    this.adsl2PMChHist1DMonitoredTime,
                                    this.adsl2PMChHist1DCodingViolations,
                                    this.adsl2PMChHist1DCorrectedBlocks,
                                    this.adsl2PMChHist1DValidInterval
                                };
                            }
                            public static final class Adsl2PMChHist1DUnitEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist1DUnitEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist1DUnit", "1.3.6.1.2.1.10.238.1.4.2.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist1DIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist1DIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist1DInterval", "1.3.6.1.2.1.10.238.1.4.2.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist1DMonitoredTimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist1DMonitoredTimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist1DMonitoredTime", "1.3.6.1.2.1.10.238.1.4.2.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist1DCodingViolationsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist1DCodingViolationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist1DCodingViolations", "1.3.6.1.2.1.10.238.1.4.2.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist1DCorrectedBlocksEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist1DCorrectedBlocksEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist1DCorrectedBlocks", "1.3.6.1.2.1.10.238.1.4.2.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2PMChHist1DValidIntervalEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2PMChHist1DValidIntervalEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2PMChHist1DValidInterval", "1.3.6.1.2.1.10.238.1.4.2.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class Adsl2ProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ------------------------*/
                public final Adsl2ProfileLineEnt adsl2ProfileLine;

                public final Adsl2ProfileChannelEnt adsl2ProfileChannel;

                public final Adsl2ProfileAlarmConfEnt adsl2ProfileAlarmConf;

                private Adsl2ProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Profile", "1.3.6.1.2.1.10.238.1.5", false, false, false, false);
                    this.adsl2ProfileLine = new Adsl2ProfileLineEnt(mib, this);
                    this.adsl2ProfileChannel = new Adsl2ProfileChannelEnt(mib, this);
                    this.adsl2ProfileAlarmConf = new Adsl2ProfileAlarmConfEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2ProfileLine,
                        this.adsl2ProfileChannel,
                        this.adsl2ProfileAlarmConf
                    };
                }
                public static final class Adsl2ProfileLineEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** ------------------------
adsl2LineConfTemplateTable          --
------------------------*/
                    public final Adsl2LineConfTemplateTableEnt adsl2LineConfTemplateTable;

                    /** --------------------adsl2LineConfProfTable        --
--------------------*/
                    public final Adsl2LineConfProfTableEnt adsl2LineConfProfTable;

                    /** --------------------adsl2LineConfProfModeSpecTable    --
--------------------*/
                    public final Adsl2LineConfProfModeSpecTableEnt adsl2LineConfProfModeSpecTable;

                    private Adsl2ProfileLineEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2ProfileLine", "1.3.6.1.2.1.10.238.1.5.1", false, false, false, false);
                        this.adsl2LineConfTemplateTable = new Adsl2LineConfTemplateTableEnt(mib, this);
                        this.adsl2LineConfProfTable = new Adsl2LineConfProfTableEnt(mib, this);
                        this.adsl2LineConfProfModeSpecTable = new Adsl2LineConfProfModeSpecTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2LineConfTemplateTable,
                            this.adsl2LineConfProfTable,
                            this.adsl2LineConfProfModeSpecTable
                        };
                    }
                    public static final class Adsl2LineConfTemplateTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LineConfTemplateEntryEnt adsl2LineConfTemplateEntry;

                        private Adsl2LineConfTemplateTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfTemplateTable", "1.3.6.1.2.1.10.238.1.5.1.1", false, true, false, false);
                            this.adsl2LineConfTemplateEntry = new Adsl2LineConfTemplateEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LineConfTemplateEntry
                            };
                        }
                        public static final class Adsl2LineConfTemplateEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2LConfTempTemplateNameEnt adsl2LConfTempTemplateName;

                            public final Adsl2LConfTempLineProfileEnt adsl2LConfTempLineProfile;

                            public final Adsl2LConfTempChan1ConfProfileEnt adsl2LConfTempChan1ConfProfile;

                            public final Adsl2LConfTempChan1RaRatioDsEnt adsl2LConfTempChan1RaRatioDs;

                            public final Adsl2LConfTempChan1RaRatioUsEnt adsl2LConfTempChan1RaRatioUs;

                            public final Adsl2LConfTempChan2ConfProfileEnt adsl2LConfTempChan2ConfProfile;

                            public final Adsl2LConfTempChan2RaRatioDsEnt adsl2LConfTempChan2RaRatioDs;

                            public final Adsl2LConfTempChan2RaRatioUsEnt adsl2LConfTempChan2RaRatioUs;

                            public final Adsl2LConfTempChan3ConfProfileEnt adsl2LConfTempChan3ConfProfile;

                            public final Adsl2LConfTempChan3RaRatioDsEnt adsl2LConfTempChan3RaRatioDs;

                            public final Adsl2LConfTempChan3RaRatioUsEnt adsl2LConfTempChan3RaRatioUs;

                            public final Adsl2LConfTempChan4ConfProfileEnt adsl2LConfTempChan4ConfProfile;

                            public final Adsl2LConfTempChan4RaRatioDsEnt adsl2LConfTempChan4RaRatioDs;

                            public final Adsl2LConfTempChan4RaRatioUsEnt adsl2LConfTempChan4RaRatioUs;

                            public final Adsl2LConfTempRowStatusEnt adsl2LConfTempRowStatus;

                            private Adsl2LineConfTemplateEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineConfTemplateEntry", "1.3.6.1.2.1.10.238.1.5.1.1.1", false, false, false, true);
                                this.adsl2LConfTempTemplateName = new Adsl2LConfTempTemplateNameEnt(mib, this);
                                this.adsl2LConfTempLineProfile = new Adsl2LConfTempLineProfileEnt(mib, this);
                                this.adsl2LConfTempChan1ConfProfile = new Adsl2LConfTempChan1ConfProfileEnt(mib, this);
                                this.adsl2LConfTempChan1RaRatioDs = new Adsl2LConfTempChan1RaRatioDsEnt(mib, this);
                                this.adsl2LConfTempChan1RaRatioUs = new Adsl2LConfTempChan1RaRatioUsEnt(mib, this);
                                this.adsl2LConfTempChan2ConfProfile = new Adsl2LConfTempChan2ConfProfileEnt(mib, this);
                                this.adsl2LConfTempChan2RaRatioDs = new Adsl2LConfTempChan2RaRatioDsEnt(mib, this);
                                this.adsl2LConfTempChan2RaRatioUs = new Adsl2LConfTempChan2RaRatioUsEnt(mib, this);
                                this.adsl2LConfTempChan3ConfProfile = new Adsl2LConfTempChan3ConfProfileEnt(mib, this);
                                this.adsl2LConfTempChan3RaRatioDs = new Adsl2LConfTempChan3RaRatioDsEnt(mib, this);
                                this.adsl2LConfTempChan3RaRatioUs = new Adsl2LConfTempChan3RaRatioUsEnt(mib, this);
                                this.adsl2LConfTempChan4ConfProfile = new Adsl2LConfTempChan4ConfProfileEnt(mib, this);
                                this.adsl2LConfTempChan4RaRatioDs = new Adsl2LConfTempChan4RaRatioDsEnt(mib, this);
                                this.adsl2LConfTempChan4RaRatioUs = new Adsl2LConfTempChan4RaRatioUsEnt(mib, this);
                                this.adsl2LConfTempRowStatus = new Adsl2LConfTempRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2LConfTempTemplateName,
                                    this.adsl2LConfTempLineProfile,
                                    this.adsl2LConfTempChan1ConfProfile,
                                    this.adsl2LConfTempChan1RaRatioDs,
                                    this.adsl2LConfTempChan1RaRatioUs,
                                    this.adsl2LConfTempChan2ConfProfile,
                                    this.adsl2LConfTempChan2RaRatioDs,
                                    this.adsl2LConfTempChan2RaRatioUs,
                                    this.adsl2LConfTempChan3ConfProfile,
                                    this.adsl2LConfTempChan3RaRatioDs,
                                    this.adsl2LConfTempChan3RaRatioUs,
                                    this.adsl2LConfTempChan4ConfProfile,
                                    this.adsl2LConfTempChan4RaRatioDs,
                                    this.adsl2LConfTempChan4RaRatioUs,
                                    this.adsl2LConfTempRowStatus
                                };
                            }
                            public static final class Adsl2LConfTempTemplateNameEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempTemplateNameEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempTemplateName", "1.3.6.1.2.1.10.238.1.5.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempLineProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempLineProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempLineProfile", "1.3.6.1.2.1.10.238.1.5.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan1ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan1ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan1ConfProfile", "1.3.6.1.2.1.10.238.1.5.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan1RaRatioDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan1RaRatioDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan1RaRatioDs", "1.3.6.1.2.1.10.238.1.5.1.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan1RaRatioUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan1RaRatioUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan1RaRatioUs", "1.3.6.1.2.1.10.238.1.5.1.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan2ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan2ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan2ConfProfile", "1.3.6.1.2.1.10.238.1.5.1.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan2RaRatioDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan2RaRatioDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan2RaRatioDs", "1.3.6.1.2.1.10.238.1.5.1.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan2RaRatioUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan2RaRatioUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan2RaRatioUs", "1.3.6.1.2.1.10.238.1.5.1.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan3ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan3ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan3ConfProfile", "1.3.6.1.2.1.10.238.1.5.1.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan3RaRatioDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan3RaRatioDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan3RaRatioDs", "1.3.6.1.2.1.10.238.1.5.1.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan3RaRatioUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan3RaRatioUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan3RaRatioUs", "1.3.6.1.2.1.10.238.1.5.1.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan4ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan4ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan4ConfProfile", "1.3.6.1.2.1.10.238.1.5.1.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan4RaRatioDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan4RaRatioDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan4RaRatioDs", "1.3.6.1.2.1.10.238.1.5.1.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempChan4RaRatioUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempChan4RaRatioUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempChan4RaRatioUs", "1.3.6.1.2.1.10.238.1.5.1.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfTempRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfTempRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfTempRowStatus", "1.3.6.1.2.1.10.238.1.5.1.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2LineConfProfTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LineConfProfEntryEnt adsl2LineConfProfEntry;

                        private Adsl2LineConfProfTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfProfTable", "1.3.6.1.2.1.10.238.1.5.1.2", false, true, false, false);
                            this.adsl2LineConfProfEntry = new Adsl2LineConfProfEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LineConfProfEntry
                            };
                        }
                        public static final class Adsl2LineConfProfEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2LConfProfProfileNameEnt adsl2LConfProfProfileName;

                            public final Adsl2LConfProfScMaskDsEnt adsl2LConfProfScMaskDs;

                            public final Adsl2LConfProfScMaskUsEnt adsl2LConfProfScMaskUs;

                            public final Adsl2LConfProfRfiBandsDsEnt adsl2LConfProfRfiBandsDs;

                            public final Adsl2LConfProfRaModeDsEnt adsl2LConfProfRaModeDs;

                            public final Adsl2LConfProfRaModeUsEnt adsl2LConfProfRaModeUs;

                            public final Adsl2LConfProfRaUsNrmDsEnt adsl2LConfProfRaUsNrmDs;

                            public final Adsl2LConfProfRaUsNrmUsEnt adsl2LConfProfRaUsNrmUs;

                            public final Adsl2LConfProfRaUsTimeDsEnt adsl2LConfProfRaUsTimeDs;

                            public final Adsl2LConfProfRaUsTimeUsEnt adsl2LConfProfRaUsTimeUs;

                            public final Adsl2LConfProfRaDsNrmsDsEnt adsl2LConfProfRaDsNrmsDs;

                            public final Adsl2LConfProfRaDsNrmsUsEnt adsl2LConfProfRaDsNrmsUs;

                            public final Adsl2LConfProfRaDsTimeDsEnt adsl2LConfProfRaDsTimeDs;

                            public final Adsl2LConfProfRaDsTimeUsEnt adsl2LConfProfRaDsTimeUs;

                            public final Adsl2LConfProfTargetSnrmDsEnt adsl2LConfProfTargetSnrmDs;

                            public final Adsl2LConfProfTargetSnrmUsEnt adsl2LConfProfTargetSnrmUs;

                            public final Adsl2LConfProfMaxSnrmDsEnt adsl2LConfProfMaxSnrmDs;

                            public final Adsl2LConfProfMaxSnrmUsEnt adsl2LConfProfMaxSnrmUs;

                            public final Adsl2LConfProfMinSnrmDsEnt adsl2LConfProfMinSnrmDs;

                            public final Adsl2LConfProfMinSnrmUsEnt adsl2LConfProfMinSnrmUs;

                            public final Adsl2LConfProfMsgMinUsEnt adsl2LConfProfMsgMinUs;

                            public final Adsl2LConfProfMsgMinDsEnt adsl2LConfProfMsgMinDs;

                            public final Adsl2LConfProfAtuTransSysEnaEnt adsl2LConfProfAtuTransSysEna;

                            public final Adsl2LConfProfPmModeEnt adsl2LConfProfPmMode;

                            public final Adsl2LConfProfL0TimeEnt adsl2LConfProfL0Time;

                            public final Adsl2LConfProfL2TimeEnt adsl2LConfProfL2Time;

                            public final Adsl2LConfProfL2AtprEnt adsl2LConfProfL2Atpr;

                            public final Adsl2LConfProfL2AtprtEnt adsl2LConfProfL2Atprt;

                            public final Adsl2LConfProfRowStatusEnt adsl2LConfProfRowStatus;

                            private Adsl2LineConfProfEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineConfProfEntry", "1.3.6.1.2.1.10.238.1.5.1.2.1", false, false, false, true);
                                this.adsl2LConfProfProfileName = new Adsl2LConfProfProfileNameEnt(mib, this);
                                this.adsl2LConfProfScMaskDs = new Adsl2LConfProfScMaskDsEnt(mib, this);
                                this.adsl2LConfProfScMaskUs = new Adsl2LConfProfScMaskUsEnt(mib, this);
                                this.adsl2LConfProfRfiBandsDs = new Adsl2LConfProfRfiBandsDsEnt(mib, this);
                                this.adsl2LConfProfRaModeDs = new Adsl2LConfProfRaModeDsEnt(mib, this);
                                this.adsl2LConfProfRaModeUs = new Adsl2LConfProfRaModeUsEnt(mib, this);
                                this.adsl2LConfProfRaUsNrmDs = new Adsl2LConfProfRaUsNrmDsEnt(mib, this);
                                this.adsl2LConfProfRaUsNrmUs = new Adsl2LConfProfRaUsNrmUsEnt(mib, this);
                                this.adsl2LConfProfRaUsTimeDs = new Adsl2LConfProfRaUsTimeDsEnt(mib, this);
                                this.adsl2LConfProfRaUsTimeUs = new Adsl2LConfProfRaUsTimeUsEnt(mib, this);
                                this.adsl2LConfProfRaDsNrmsDs = new Adsl2LConfProfRaDsNrmsDsEnt(mib, this);
                                this.adsl2LConfProfRaDsNrmsUs = new Adsl2LConfProfRaDsNrmsUsEnt(mib, this);
                                this.adsl2LConfProfRaDsTimeDs = new Adsl2LConfProfRaDsTimeDsEnt(mib, this);
                                this.adsl2LConfProfRaDsTimeUs = new Adsl2LConfProfRaDsTimeUsEnt(mib, this);
                                this.adsl2LConfProfTargetSnrmDs = new Adsl2LConfProfTargetSnrmDsEnt(mib, this);
                                this.adsl2LConfProfTargetSnrmUs = new Adsl2LConfProfTargetSnrmUsEnt(mib, this);
                                this.adsl2LConfProfMaxSnrmDs = new Adsl2LConfProfMaxSnrmDsEnt(mib, this);
                                this.adsl2LConfProfMaxSnrmUs = new Adsl2LConfProfMaxSnrmUsEnt(mib, this);
                                this.adsl2LConfProfMinSnrmDs = new Adsl2LConfProfMinSnrmDsEnt(mib, this);
                                this.adsl2LConfProfMinSnrmUs = new Adsl2LConfProfMinSnrmUsEnt(mib, this);
                                this.adsl2LConfProfMsgMinUs = new Adsl2LConfProfMsgMinUsEnt(mib, this);
                                this.adsl2LConfProfMsgMinDs = new Adsl2LConfProfMsgMinDsEnt(mib, this);
                                this.adsl2LConfProfAtuTransSysEna = new Adsl2LConfProfAtuTransSysEnaEnt(mib, this);
                                this.adsl2LConfProfPmMode = new Adsl2LConfProfPmModeEnt(mib, this);
                                this.adsl2LConfProfL0Time = new Adsl2LConfProfL0TimeEnt(mib, this);
                                this.adsl2LConfProfL2Time = new Adsl2LConfProfL2TimeEnt(mib, this);
                                this.adsl2LConfProfL2Atpr = new Adsl2LConfProfL2AtprEnt(mib, this);
                                this.adsl2LConfProfL2Atprt = new Adsl2LConfProfL2AtprtEnt(mib, this);
                                this.adsl2LConfProfRowStatus = new Adsl2LConfProfRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2LConfProfProfileName,
                                    this.adsl2LConfProfScMaskDs,
                                    this.adsl2LConfProfScMaskUs,
                                    this.adsl2LConfProfRfiBandsDs,
                                    this.adsl2LConfProfRaModeDs,
                                    this.adsl2LConfProfRaModeUs,
                                    this.adsl2LConfProfRaUsNrmDs,
                                    this.adsl2LConfProfRaUsNrmUs,
                                    this.adsl2LConfProfRaUsTimeDs,
                                    this.adsl2LConfProfRaUsTimeUs,
                                    this.adsl2LConfProfRaDsNrmsDs,
                                    this.adsl2LConfProfRaDsNrmsUs,
                                    this.adsl2LConfProfRaDsTimeDs,
                                    this.adsl2LConfProfRaDsTimeUs,
                                    this.adsl2LConfProfTargetSnrmDs,
                                    this.adsl2LConfProfTargetSnrmUs,
                                    this.adsl2LConfProfMaxSnrmDs,
                                    this.adsl2LConfProfMaxSnrmUs,
                                    this.adsl2LConfProfMinSnrmDs,
                                    this.adsl2LConfProfMinSnrmUs,
                                    this.adsl2LConfProfMsgMinUs,
                                    this.adsl2LConfProfMsgMinDs,
                                    this.adsl2LConfProfAtuTransSysEna,
                                    this.adsl2LConfProfPmMode,
                                    this.adsl2LConfProfL0Time,
                                    this.adsl2LConfProfL2Time,
                                    this.adsl2LConfProfL2Atpr,
                                    this.adsl2LConfProfL2Atprt,
                                    this.adsl2LConfProfRowStatus
                                };
                            }
                            public static final class Adsl2LConfProfProfileNameEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfProfileNameEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfProfileName", "1.3.6.1.2.1.10.238.1.5.1.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfScMaskDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfScMaskDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfScMaskDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfScMaskUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfScMaskUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfScMaskUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRfiBandsDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRfiBandsDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRfiBandsDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaModeDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaModeDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaModeDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaModeUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaModeUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaModeUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaUsNrmDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaUsNrmDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaUsNrmDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaUsNrmUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaUsNrmUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaUsNrmUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaUsTimeDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaUsTimeDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaUsTimeDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaUsTimeUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaUsTimeUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaUsTimeUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaDsNrmsDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaDsNrmsDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaDsNrmsDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaDsNrmsUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaDsNrmsUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaDsNrmsUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaDsTimeDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaDsTimeDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaDsTimeDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRaDsTimeUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRaDsTimeUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRaDsTimeUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfTargetSnrmDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfTargetSnrmDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfTargetSnrmDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfTargetSnrmUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfTargetSnrmUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfTargetSnrmUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxSnrmDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxSnrmDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxSnrmDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxSnrmUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxSnrmUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxSnrmUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMinSnrmDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMinSnrmDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMinSnrmDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.19", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMinSnrmUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMinSnrmUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMinSnrmUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.20", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMsgMinUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMsgMinUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMsgMinUs", "1.3.6.1.2.1.10.238.1.5.1.2.1.21", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMsgMinDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMsgMinDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMsgMinDs", "1.3.6.1.2.1.10.238.1.5.1.2.1.22", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfAtuTransSysEnaEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfAtuTransSysEnaEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfAtuTransSysEna", "1.3.6.1.2.1.10.238.1.5.1.2.1.23", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfPmModeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfPmModeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfPmMode", "1.3.6.1.2.1.10.238.1.5.1.2.1.24", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfL0TimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfL0TimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfL0Time", "1.3.6.1.2.1.10.238.1.5.1.2.1.25", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfL2TimeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfL2TimeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfL2Time", "1.3.6.1.2.1.10.238.1.5.1.2.1.26", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfL2AtprEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfL2AtprEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfL2Atpr", "1.3.6.1.2.1.10.238.1.5.1.2.1.27", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfL2AtprtEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfL2AtprtEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfL2Atprt", "1.3.6.1.2.1.10.238.1.5.1.2.1.28", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfRowStatus", "1.3.6.1.2.1.10.238.1.5.1.2.1.29", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2LineConfProfModeSpecTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LineConfProfModeSpecEntryEnt adsl2LineConfProfModeSpecEntry;

                        private Adsl2LineConfProfModeSpecTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfProfModeSpecTable", "1.3.6.1.2.1.10.238.1.5.1.3", false, true, false, false);
                            this.adsl2LineConfProfModeSpecEntry = new Adsl2LineConfProfModeSpecEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LineConfProfModeSpecEntry
                            };
                        }
                        public static final class Adsl2LineConfProfModeSpecEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2LConfProfAdslModeEnt adsl2LConfProfAdslMode;

                            public final Adsl2LConfProfMaxNomPsdDsEnt adsl2LConfProfMaxNomPsdDs;

                            public final Adsl2LConfProfMaxNomPsdUsEnt adsl2LConfProfMaxNomPsdUs;

                            public final Adsl2LConfProfMaxNomAtpDsEnt adsl2LConfProfMaxNomAtpDs;

                            public final Adsl2LConfProfMaxNomAtpUsEnt adsl2LConfProfMaxNomAtpUs;

                            public final Adsl2LConfProfMaxAggRxPwrUsEnt adsl2LConfProfMaxAggRxPwrUs;

                            public final Adsl2LConfProfPsdMaskDsEnt adsl2LConfProfPsdMaskDs;

                            public final Adsl2LConfProfPsdMaskUsEnt adsl2LConfProfPsdMaskUs;

                            public final Adsl2LConfProfPsdMaskSelectUsEnt adsl2LConfProfPsdMaskSelectUs;

                            public final Adsl2LConfProfModeSpecRowStatusEnt adsl2LConfProfModeSpecRowStatus;

                            private Adsl2LineConfProfModeSpecEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineConfProfModeSpecEntry", "1.3.6.1.2.1.10.238.1.5.1.3.1", false, false, false, true);
                                this.adsl2LConfProfAdslMode = new Adsl2LConfProfAdslModeEnt(mib, this);
                                this.adsl2LConfProfMaxNomPsdDs = new Adsl2LConfProfMaxNomPsdDsEnt(mib, this);
                                this.adsl2LConfProfMaxNomPsdUs = new Adsl2LConfProfMaxNomPsdUsEnt(mib, this);
                                this.adsl2LConfProfMaxNomAtpDs = new Adsl2LConfProfMaxNomAtpDsEnt(mib, this);
                                this.adsl2LConfProfMaxNomAtpUs = new Adsl2LConfProfMaxNomAtpUsEnt(mib, this);
                                this.adsl2LConfProfMaxAggRxPwrUs = new Adsl2LConfProfMaxAggRxPwrUsEnt(mib, this);
                                this.adsl2LConfProfPsdMaskDs = new Adsl2LConfProfPsdMaskDsEnt(mib, this);
                                this.adsl2LConfProfPsdMaskUs = new Adsl2LConfProfPsdMaskUsEnt(mib, this);
                                this.adsl2LConfProfPsdMaskSelectUs = new Adsl2LConfProfPsdMaskSelectUsEnt(mib, this);
                                this.adsl2LConfProfModeSpecRowStatus = new Adsl2LConfProfModeSpecRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2LConfProfAdslMode,
                                    this.adsl2LConfProfMaxNomPsdDs,
                                    this.adsl2LConfProfMaxNomPsdUs,
                                    this.adsl2LConfProfMaxNomAtpDs,
                                    this.adsl2LConfProfMaxNomAtpUs,
                                    this.adsl2LConfProfMaxAggRxPwrUs,
                                    this.adsl2LConfProfPsdMaskDs,
                                    this.adsl2LConfProfPsdMaskUs,
                                    this.adsl2LConfProfPsdMaskSelectUs,
                                    this.adsl2LConfProfModeSpecRowStatus
                                };
                            }
                            public static final class Adsl2LConfProfAdslModeEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfAdslModeEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfAdslMode", "1.3.6.1.2.1.10.238.1.5.1.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxNomPsdDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxNomPsdDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxNomPsdDs", "1.3.6.1.2.1.10.238.1.5.1.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxNomPsdUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxNomPsdUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxNomPsdUs", "1.3.6.1.2.1.10.238.1.5.1.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxNomAtpDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxNomAtpDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxNomAtpDs", "1.3.6.1.2.1.10.238.1.5.1.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxNomAtpUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxNomAtpUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxNomAtpUs", "1.3.6.1.2.1.10.238.1.5.1.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfMaxAggRxPwrUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfMaxAggRxPwrUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfMaxAggRxPwrUs", "1.3.6.1.2.1.10.238.1.5.1.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfPsdMaskDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfPsdMaskDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfPsdMaskDs", "1.3.6.1.2.1.10.238.1.5.1.3.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfPsdMaskUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfPsdMaskUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfPsdMaskUs", "1.3.6.1.2.1.10.238.1.5.1.3.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfPsdMaskSelectUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfPsdMaskSelectUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfPsdMaskSelectUs", "1.3.6.1.2.1.10.238.1.5.1.3.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LConfProfModeSpecRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LConfProfModeSpecRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LConfProfModeSpecRowStatus", "1.3.6.1.2.1.10.238.1.5.1.3.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class Adsl2ProfileChannelEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** ------------------------
adsl2ChConfProfileTable           --
------------------------*/
                    public final Adsl2ChConfProfileTableEnt adsl2ChConfProfileTable;

                    private Adsl2ProfileChannelEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2ProfileChannel", "1.3.6.1.2.1.10.238.1.5.2", false, false, false, false);
                        this.adsl2ChConfProfileTable = new Adsl2ChConfProfileTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2ChConfProfileTable
                        };
                    }
                    public static final class Adsl2ChConfProfileTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2ChConfProfileEntryEnt adsl2ChConfProfileEntry;

                        private Adsl2ChConfProfileTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChConfProfileTable", "1.3.6.1.2.1.10.238.1.5.2.1", false, true, false, false);
                            this.adsl2ChConfProfileEntry = new Adsl2ChConfProfileEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2ChConfProfileEntry
                            };
                        }
                        public static final class Adsl2ChConfProfileEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2ChConfProfProfileNameEnt adsl2ChConfProfProfileName;

                            public final Adsl2ChConfProfMinDataRateDsEnt adsl2ChConfProfMinDataRateDs;

                            public final Adsl2ChConfProfMinDataRateUsEnt adsl2ChConfProfMinDataRateUs;

                            public final Adsl2ChConfProfMinResDataRateDsEnt adsl2ChConfProfMinResDataRateDs;

                            public final Adsl2ChConfProfMinResDataRateUsEnt adsl2ChConfProfMinResDataRateUs;

                            public final Adsl2ChConfProfMaxDataRateDsEnt adsl2ChConfProfMaxDataRateDs;

                            public final Adsl2ChConfProfMaxDataRateUsEnt adsl2ChConfProfMaxDataRateUs;

                            public final Adsl2ChConfProfMinDataRateLowPwrDsEnt adsl2ChConfProfMinDataRateLowPwrDs;

                            public final Adsl2ChConfProfMaxDelayDsEnt adsl2ChConfProfMaxDelayDs;

                            public final Adsl2ChConfProfMaxDelayUsEnt adsl2ChConfProfMaxDelayUs;

                            public final Adsl2ChConfProfMinProtectionDsEnt adsl2ChConfProfMinProtectionDs;

                            public final Adsl2ChConfProfMinProtectionUsEnt adsl2ChConfProfMinProtectionUs;

                            public final Adsl2ChConfProfMaxBerDsEnt adsl2ChConfProfMaxBerDs;

                            public final Adsl2ChConfProfMaxBerUsEnt adsl2ChConfProfMaxBerUs;

                            public final Adsl2ChConfProfUsDataRateDsEnt adsl2ChConfProfUsDataRateDs;

                            public final Adsl2ChConfProfDsDataRateDsEnt adsl2ChConfProfDsDataRateDs;

                            public final Adsl2ChConfProfUsDataRateUsEnt adsl2ChConfProfUsDataRateUs;

                            public final Adsl2ChConfProfDsDataRateUsEnt adsl2ChConfProfDsDataRateUs;

                            public final Adsl2ChConfProfImaEnabledEnt adsl2ChConfProfImaEnabled;

                            public final Adsl2ChConfProfRowStatusEnt adsl2ChConfProfRowStatus;

                            private Adsl2ChConfProfileEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChConfProfileEntry", "1.3.6.1.2.1.10.238.1.5.2.1.1", false, false, false, true);
                                this.adsl2ChConfProfProfileName = new Adsl2ChConfProfProfileNameEnt(mib, this);
                                this.adsl2ChConfProfMinDataRateDs = new Adsl2ChConfProfMinDataRateDsEnt(mib, this);
                                this.adsl2ChConfProfMinDataRateUs = new Adsl2ChConfProfMinDataRateUsEnt(mib, this);
                                this.adsl2ChConfProfMinResDataRateDs = new Adsl2ChConfProfMinResDataRateDsEnt(mib, this);
                                this.adsl2ChConfProfMinResDataRateUs = new Adsl2ChConfProfMinResDataRateUsEnt(mib, this);
                                this.adsl2ChConfProfMaxDataRateDs = new Adsl2ChConfProfMaxDataRateDsEnt(mib, this);
                                this.adsl2ChConfProfMaxDataRateUs = new Adsl2ChConfProfMaxDataRateUsEnt(mib, this);
                                this.adsl2ChConfProfMinDataRateLowPwrDs = new Adsl2ChConfProfMinDataRateLowPwrDsEnt(mib, this);
                                this.adsl2ChConfProfMaxDelayDs = new Adsl2ChConfProfMaxDelayDsEnt(mib, this);
                                this.adsl2ChConfProfMaxDelayUs = new Adsl2ChConfProfMaxDelayUsEnt(mib, this);
                                this.adsl2ChConfProfMinProtectionDs = new Adsl2ChConfProfMinProtectionDsEnt(mib, this);
                                this.adsl2ChConfProfMinProtectionUs = new Adsl2ChConfProfMinProtectionUsEnt(mib, this);
                                this.adsl2ChConfProfMaxBerDs = new Adsl2ChConfProfMaxBerDsEnt(mib, this);
                                this.adsl2ChConfProfMaxBerUs = new Adsl2ChConfProfMaxBerUsEnt(mib, this);
                                this.adsl2ChConfProfUsDataRateDs = new Adsl2ChConfProfUsDataRateDsEnt(mib, this);
                                this.adsl2ChConfProfDsDataRateDs = new Adsl2ChConfProfDsDataRateDsEnt(mib, this);
                                this.adsl2ChConfProfUsDataRateUs = new Adsl2ChConfProfUsDataRateUsEnt(mib, this);
                                this.adsl2ChConfProfDsDataRateUs = new Adsl2ChConfProfDsDataRateUsEnt(mib, this);
                                this.adsl2ChConfProfImaEnabled = new Adsl2ChConfProfImaEnabledEnt(mib, this);
                                this.adsl2ChConfProfRowStatus = new Adsl2ChConfProfRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2ChConfProfProfileName,
                                    this.adsl2ChConfProfMinDataRateDs,
                                    this.adsl2ChConfProfMinDataRateUs,
                                    this.adsl2ChConfProfMinResDataRateDs,
                                    this.adsl2ChConfProfMinResDataRateUs,
                                    this.adsl2ChConfProfMaxDataRateDs,
                                    this.adsl2ChConfProfMaxDataRateUs,
                                    this.adsl2ChConfProfMinDataRateLowPwrDs,
                                    this.adsl2ChConfProfMaxDelayDs,
                                    this.adsl2ChConfProfMaxDelayUs,
                                    this.adsl2ChConfProfMinProtectionDs,
                                    this.adsl2ChConfProfMinProtectionUs,
                                    this.adsl2ChConfProfMaxBerDs,
                                    this.adsl2ChConfProfMaxBerUs,
                                    this.adsl2ChConfProfUsDataRateDs,
                                    this.adsl2ChConfProfDsDataRateDs,
                                    this.adsl2ChConfProfUsDataRateUs,
                                    this.adsl2ChConfProfDsDataRateUs,
                                    this.adsl2ChConfProfImaEnabled,
                                    this.adsl2ChConfProfRowStatus
                                };
                            }
                            public static final class Adsl2ChConfProfProfileNameEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfProfileNameEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfProfileName", "1.3.6.1.2.1.10.238.1.5.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinDataRateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinDataRateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinDataRateDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinDataRateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinDataRateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinDataRateUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinResDataRateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinResDataRateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinResDataRateDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinResDataRateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinResDataRateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinResDataRateUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMaxDataRateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMaxDataRateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMaxDataRateDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMaxDataRateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMaxDataRateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMaxDataRateUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinDataRateLowPwrDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinDataRateLowPwrDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinDataRateLowPwrDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMaxDelayDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMaxDelayDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMaxDelayDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMaxDelayUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMaxDelayUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMaxDelayUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinProtectionDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinProtectionDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinProtectionDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMinProtectionUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMinProtectionUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMinProtectionUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMaxBerDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMaxBerDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMaxBerDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfMaxBerUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfMaxBerUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfMaxBerUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfUsDataRateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfUsDataRateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfUsDataRateDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfDsDataRateDsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfDsDataRateDsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfDsDataRateDs", "1.3.6.1.2.1.10.238.1.5.2.1.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfUsDataRateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfUsDataRateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfUsDataRateUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfDsDataRateUsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfDsDataRateUsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfDsDataRateUs", "1.3.6.1.2.1.10.238.1.5.2.1.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfImaEnabledEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfImaEnabledEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfImaEnabled", "1.3.6.1.2.1.10.238.1.5.2.1.1.19", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChConfProfRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChConfProfRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChConfProfRowStatus", "1.3.6.1.2.1.10.238.1.5.2.1.1.20", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class Adsl2ProfileAlarmConfEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** ------------------------
adsl2LineAlarmConfTemplateTable          --
------------------------*/
                    public final Adsl2LineAlarmConfTemplateTableEnt adsl2LineAlarmConfTemplateTable;

                    /** ------------------------
adsl2LineAlarmConfProfileTable        --
------------------------*/
                    public final Adsl2LineAlarmConfProfileTableEnt adsl2LineAlarmConfProfileTable;

                    /** ------------------------
adsl2ChAlarmConfProfileTable        --



------------------------*/
                    public final Adsl2ChAlarmConfProfileTableEnt adsl2ChAlarmConfProfileTable;

                    private Adsl2ProfileAlarmConfEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2ProfileAlarmConf", "1.3.6.1.2.1.10.238.1.5.3", false, false, false, false);
                        this.adsl2LineAlarmConfTemplateTable = new Adsl2LineAlarmConfTemplateTableEnt(mib, this);
                        this.adsl2LineAlarmConfProfileTable = new Adsl2LineAlarmConfProfileTableEnt(mib, this);
                        this.adsl2ChAlarmConfProfileTable = new Adsl2ChAlarmConfProfileTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2LineAlarmConfTemplateTable,
                            this.adsl2LineAlarmConfProfileTable,
                            this.adsl2ChAlarmConfProfileTable
                        };
                    }
                    public static final class Adsl2LineAlarmConfTemplateTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LineAlarmConfTemplateEntryEnt adsl2LineAlarmConfTemplateEntry;

                        private Adsl2LineAlarmConfTemplateTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineAlarmConfTemplateTable", "1.3.6.1.2.1.10.238.1.5.3.1", false, true, false, false);
                            this.adsl2LineAlarmConfTemplateEntry = new Adsl2LineAlarmConfTemplateEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LineAlarmConfTemplateEntry
                            };
                        }
                        public static final class Adsl2LineAlarmConfTemplateEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2LAlarmConfTempTemplateNameEnt adsl2LAlarmConfTempTemplateName;

                            public final Adsl2LAlarmConfTempLineProfileEnt adsl2LAlarmConfTempLineProfile;

                            public final Adsl2LAlarmConfTempChan1ConfProfileEnt adsl2LAlarmConfTempChan1ConfProfile;

                            public final Adsl2LAlarmConfTempChan2ConfProfileEnt adsl2LAlarmConfTempChan2ConfProfile;

                            public final Adsl2LAlarmConfTempChan3ConfProfileEnt adsl2LAlarmConfTempChan3ConfProfile;

                            public final Adsl2LAlarmConfTempChan4ConfProfileEnt adsl2LAlarmConfTempChan4ConfProfile;

                            public final Adsl2LAlarmConfTempRowStatusEnt adsl2LAlarmConfTempRowStatus;

                            private Adsl2LineAlarmConfTemplateEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineAlarmConfTemplateEntry", "1.3.6.1.2.1.10.238.1.5.3.1.1", false, false, false, true);
                                this.adsl2LAlarmConfTempTemplateName = new Adsl2LAlarmConfTempTemplateNameEnt(mib, this);
                                this.adsl2LAlarmConfTempLineProfile = new Adsl2LAlarmConfTempLineProfileEnt(mib, this);
                                this.adsl2LAlarmConfTempChan1ConfProfile = new Adsl2LAlarmConfTempChan1ConfProfileEnt(mib, this);
                                this.adsl2LAlarmConfTempChan2ConfProfile = new Adsl2LAlarmConfTempChan2ConfProfileEnt(mib, this);
                                this.adsl2LAlarmConfTempChan3ConfProfile = new Adsl2LAlarmConfTempChan3ConfProfileEnt(mib, this);
                                this.adsl2LAlarmConfTempChan4ConfProfile = new Adsl2LAlarmConfTempChan4ConfProfileEnt(mib, this);
                                this.adsl2LAlarmConfTempRowStatus = new Adsl2LAlarmConfTempRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2LAlarmConfTempTemplateName,
                                    this.adsl2LAlarmConfTempLineProfile,
                                    this.adsl2LAlarmConfTempChan1ConfProfile,
                                    this.adsl2LAlarmConfTempChan2ConfProfile,
                                    this.adsl2LAlarmConfTempChan3ConfProfile,
                                    this.adsl2LAlarmConfTempChan4ConfProfile,
                                    this.adsl2LAlarmConfTempRowStatus
                                };
                            }
                            public static final class Adsl2LAlarmConfTempTemplateNameEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempTemplateNameEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempTemplateName", "1.3.6.1.2.1.10.238.1.5.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LAlarmConfTempLineProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempLineProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempLineProfile", "1.3.6.1.2.1.10.238.1.5.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LAlarmConfTempChan1ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempChan1ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempChan1ConfProfile", "1.3.6.1.2.1.10.238.1.5.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LAlarmConfTempChan2ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempChan2ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempChan2ConfProfile", "1.3.6.1.2.1.10.238.1.5.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LAlarmConfTempChan3ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempChan3ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempChan3ConfProfile", "1.3.6.1.2.1.10.238.1.5.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LAlarmConfTempChan4ConfProfileEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempChan4ConfProfileEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempChan4ConfProfile", "1.3.6.1.2.1.10.238.1.5.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LAlarmConfTempRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LAlarmConfTempRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LAlarmConfTempRowStatus", "1.3.6.1.2.1.10.238.1.5.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2LineAlarmConfProfileTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2LineAlarmConfProfileEntryEnt adsl2LineAlarmConfProfileEntry;

                        private Adsl2LineAlarmConfProfileTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineAlarmConfProfileTable", "1.3.6.1.2.1.10.238.1.5.3.2", false, true, false, false);
                            this.adsl2LineAlarmConfProfileEntry = new Adsl2LineAlarmConfProfileEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2LineAlarmConfProfileEntry
                            };
                        }
                        public static final class Adsl2LineAlarmConfProfileEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2LineAlarmConfProfileNameEnt adsl2LineAlarmConfProfileName;

                            public final Adsl2LineAlarmConfProfileAtucThresh15MinFecsEnt adsl2LineAlarmConfProfileAtucThresh15MinFecs;

                            public final Adsl2LineAlarmConfProfileAtucThresh15MinEsEnt adsl2LineAlarmConfProfileAtucThresh15MinEs;

                            public final Adsl2LineAlarmConfProfileAtucThresh15MinSesEnt adsl2LineAlarmConfProfileAtucThresh15MinSes;

                            public final Adsl2LineAlarmConfProfileAtucThresh15MinLossEnt adsl2LineAlarmConfProfileAtucThresh15MinLoss;

                            public final Adsl2LineAlarmConfProfileAtucThresh15MinUasEnt adsl2LineAlarmConfProfileAtucThresh15MinUas;

                            public final Adsl2LineAlarmConfProfileAturThresh15MinFecsEnt adsl2LineAlarmConfProfileAturThresh15MinFecs;

                            public final Adsl2LineAlarmConfProfileAturThresh15MinEsEnt adsl2LineAlarmConfProfileAturThresh15MinEs;

                            public final Adsl2LineAlarmConfProfileAturThresh15MinSesEnt adsl2LineAlarmConfProfileAturThresh15MinSes;

                            public final Adsl2LineAlarmConfProfileAturThresh15MinLossEnt adsl2LineAlarmConfProfileAturThresh15MinLoss;

                            public final Adsl2LineAlarmConfProfileAturThresh15MinUasEnt adsl2LineAlarmConfProfileAturThresh15MinUas;

                            public final Adsl2LineAlarmConfProfileThresh15MinFailedFullIntEnt adsl2LineAlarmConfProfileThresh15MinFailedFullInt;

                            public final Adsl2LineAlarmConfProfileThresh15MinFailedShrtIntEnt adsl2LineAlarmConfProfileThresh15MinFailedShrtInt;

                            public final Adsl2LineAlarmConfProfileRowStatusEnt adsl2LineAlarmConfProfileRowStatus;

                            private Adsl2LineAlarmConfProfileEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2LineAlarmConfProfileEntry", "1.3.6.1.2.1.10.238.1.5.3.2.1", false, false, false, true);
                                this.adsl2LineAlarmConfProfileName = new Adsl2LineAlarmConfProfileNameEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAtucThresh15MinFecs = new Adsl2LineAlarmConfProfileAtucThresh15MinFecsEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAtucThresh15MinEs = new Adsl2LineAlarmConfProfileAtucThresh15MinEsEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAtucThresh15MinSes = new Adsl2LineAlarmConfProfileAtucThresh15MinSesEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAtucThresh15MinLoss = new Adsl2LineAlarmConfProfileAtucThresh15MinLossEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAtucThresh15MinUas = new Adsl2LineAlarmConfProfileAtucThresh15MinUasEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAturThresh15MinFecs = new Adsl2LineAlarmConfProfileAturThresh15MinFecsEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAturThresh15MinEs = new Adsl2LineAlarmConfProfileAturThresh15MinEsEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAturThresh15MinSes = new Adsl2LineAlarmConfProfileAturThresh15MinSesEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAturThresh15MinLoss = new Adsl2LineAlarmConfProfileAturThresh15MinLossEnt(mib, this);
                                this.adsl2LineAlarmConfProfileAturThresh15MinUas = new Adsl2LineAlarmConfProfileAturThresh15MinUasEnt(mib, this);
                                this.adsl2LineAlarmConfProfileThresh15MinFailedFullInt = new Adsl2LineAlarmConfProfileThresh15MinFailedFullIntEnt(mib, this);
                                this.adsl2LineAlarmConfProfileThresh15MinFailedShrtInt = new Adsl2LineAlarmConfProfileThresh15MinFailedShrtIntEnt(mib, this);
                                this.adsl2LineAlarmConfProfileRowStatus = new Adsl2LineAlarmConfProfileRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2LineAlarmConfProfileName,
                                    this.adsl2LineAlarmConfProfileAtucThresh15MinFecs,
                                    this.adsl2LineAlarmConfProfileAtucThresh15MinEs,
                                    this.adsl2LineAlarmConfProfileAtucThresh15MinSes,
                                    this.adsl2LineAlarmConfProfileAtucThresh15MinLoss,
                                    this.adsl2LineAlarmConfProfileAtucThresh15MinUas,
                                    this.adsl2LineAlarmConfProfileAturThresh15MinFecs,
                                    this.adsl2LineAlarmConfProfileAturThresh15MinEs,
                                    this.adsl2LineAlarmConfProfileAturThresh15MinSes,
                                    this.adsl2LineAlarmConfProfileAturThresh15MinLoss,
                                    this.adsl2LineAlarmConfProfileAturThresh15MinUas,
                                    this.adsl2LineAlarmConfProfileThresh15MinFailedFullInt,
                                    this.adsl2LineAlarmConfProfileThresh15MinFailedShrtInt,
                                    this.adsl2LineAlarmConfProfileRowStatus
                                };
                            }
                            public static final class Adsl2LineAlarmConfProfileNameEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileNameEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileName", "1.3.6.1.2.1.10.238.1.5.3.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAtucThresh15MinFecsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAtucThresh15MinFecsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAtucThresh15MinFecs", "1.3.6.1.2.1.10.238.1.5.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAtucThresh15MinEsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAtucThresh15MinEsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAtucThresh15MinEs", "1.3.6.1.2.1.10.238.1.5.3.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAtucThresh15MinSesEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAtucThresh15MinSesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAtucThresh15MinSes", "1.3.6.1.2.1.10.238.1.5.3.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAtucThresh15MinLossEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAtucThresh15MinLossEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAtucThresh15MinLoss", "1.3.6.1.2.1.10.238.1.5.3.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAtucThresh15MinUasEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAtucThresh15MinUasEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAtucThresh15MinUas", "1.3.6.1.2.1.10.238.1.5.3.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAturThresh15MinFecsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAturThresh15MinFecsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAturThresh15MinFecs", "1.3.6.1.2.1.10.238.1.5.3.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAturThresh15MinEsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAturThresh15MinEsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAturThresh15MinEs", "1.3.6.1.2.1.10.238.1.5.3.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAturThresh15MinSesEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAturThresh15MinSesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAturThresh15MinSes", "1.3.6.1.2.1.10.238.1.5.3.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAturThresh15MinLossEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAturThresh15MinLossEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAturThresh15MinLoss", "1.3.6.1.2.1.10.238.1.5.3.2.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileAturThresh15MinUasEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileAturThresh15MinUasEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileAturThresh15MinUas", "1.3.6.1.2.1.10.238.1.5.3.2.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileThresh15MinFailedFullIntEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileThresh15MinFailedFullIntEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileThresh15MinFailedFullInt", "1.3.6.1.2.1.10.238.1.5.3.2.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileThresh15MinFailedShrtIntEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileThresh15MinFailedShrtIntEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileThresh15MinFailedShrtInt", "1.3.6.1.2.1.10.238.1.5.3.2.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2LineAlarmConfProfileRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2LineAlarmConfProfileRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2LineAlarmConfProfileRowStatus", "1.3.6.1.2.1.10.238.1.5.3.2.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Adsl2ChAlarmConfProfileTableEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        public final Adsl2ChAlarmConfProfileEntryEnt adsl2ChAlarmConfProfileEntry;

                        private Adsl2ChAlarmConfProfileTableEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChAlarmConfProfileTable", "1.3.6.1.2.1.10.238.1.5.3.3", false, true, false, false);
                            this.adsl2ChAlarmConfProfileEntry = new Adsl2ChAlarmConfProfileEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adsl2ChAlarmConfProfileEntry
                            };
                        }
                        public static final class Adsl2ChAlarmConfProfileEntryEnt extends MIBEntry<ADSL2LINEMIBDef>
                        {
                            public final Adsl2ChAlarmConfProfileNameEnt adsl2ChAlarmConfProfileName;

                            public final Adsl2ChAlarmConfProfileAtucThresh15MinCodingViolationsEnt adsl2ChAlarmConfProfileAtucThresh15MinCodingViolations;

                            public final Adsl2ChAlarmConfProfileAtucThresh15MinCorrectedEnt adsl2ChAlarmConfProfileAtucThresh15MinCorrected;

                            public final Adsl2ChAlarmConfProfileAturThresh15MinCodingViolationsEnt adsl2ChAlarmConfProfileAturThresh15MinCodingViolations;

                            public final Adsl2ChAlarmConfProfileAturThresh15MinCorrectedEnt adsl2ChAlarmConfProfileAturThresh15MinCorrected;

                            public final Adsl2ChAlarmConfProfileRowStatusEnt adsl2ChAlarmConfProfileRowStatus;

                            private Adsl2ChAlarmConfProfileEntryEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                            {
                                super(mib, parent, "adsl2ChAlarmConfProfileEntry", "1.3.6.1.2.1.10.238.1.5.3.3.1", false, false, false, true);
                                this.adsl2ChAlarmConfProfileName = new Adsl2ChAlarmConfProfileNameEnt(mib, this);
                                this.adsl2ChAlarmConfProfileAtucThresh15MinCodingViolations = new Adsl2ChAlarmConfProfileAtucThresh15MinCodingViolationsEnt(mib, this);
                                this.adsl2ChAlarmConfProfileAtucThresh15MinCorrected = new Adsl2ChAlarmConfProfileAtucThresh15MinCorrectedEnt(mib, this);
                                this.adsl2ChAlarmConfProfileAturThresh15MinCodingViolations = new Adsl2ChAlarmConfProfileAturThresh15MinCodingViolationsEnt(mib, this);
                                this.adsl2ChAlarmConfProfileAturThresh15MinCorrected = new Adsl2ChAlarmConfProfileAturThresh15MinCorrectedEnt(mib, this);
                                this.adsl2ChAlarmConfProfileRowStatus = new Adsl2ChAlarmConfProfileRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.adsl2ChAlarmConfProfileName,
                                    this.adsl2ChAlarmConfProfileAtucThresh15MinCodingViolations,
                                    this.adsl2ChAlarmConfProfileAtucThresh15MinCorrected,
                                    this.adsl2ChAlarmConfProfileAturThresh15MinCodingViolations,
                                    this.adsl2ChAlarmConfProfileAturThresh15MinCorrected,
                                    this.adsl2ChAlarmConfProfileRowStatus
                                };
                            }
                            public static final class Adsl2ChAlarmConfProfileNameEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChAlarmConfProfileNameEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChAlarmConfProfileName", "1.3.6.1.2.1.10.238.1.5.3.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChAlarmConfProfileAtucThresh15MinCodingViolationsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChAlarmConfProfileAtucThresh15MinCodingViolationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChAlarmConfProfileAtucThresh15MinCodingViolations", "1.3.6.1.2.1.10.238.1.5.3.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChAlarmConfProfileAtucThresh15MinCorrectedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChAlarmConfProfileAtucThresh15MinCorrectedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChAlarmConfProfileAtucThresh15MinCorrected", "1.3.6.1.2.1.10.238.1.5.3.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChAlarmConfProfileAturThresh15MinCodingViolationsEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChAlarmConfProfileAturThresh15MinCodingViolationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChAlarmConfProfileAturThresh15MinCodingViolations", "1.3.6.1.2.1.10.238.1.5.3.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChAlarmConfProfileAturThresh15MinCorrectedEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChAlarmConfProfileAturThresh15MinCorrectedEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChAlarmConfProfileAturThresh15MinCorrected", "1.3.6.1.2.1.10.238.1.5.3.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Adsl2ChAlarmConfProfileRowStatusEnt extends MIBEntry<ADSL2LINEMIBDef>
                            {
                                private Adsl2ChAlarmConfProfileRowStatusEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                                {
                                    super(mib, parent, "adsl2ChAlarmConfProfileRowStatus", "1.3.6.1.2.1.10.238.1.5.3.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class Adsl2ScalarEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ------------------------*/
                public final Adsl2ScalarSCEnt adsl2ScalarSC;

                private Adsl2ScalarEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Scalar", "1.3.6.1.2.1.10.238.1.6", false, false, false, false);
                    this.adsl2ScalarSC = new Adsl2ScalarSCEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2ScalarSC
                    };
                }
                public static final class Adsl2ScalarSCEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** ------------------------
Scalars that relate to the adsl2SCStatusTable.------------------------*/
                    public final Adsl2ScalarSCMaxInterfacesEnt adsl2ScalarSCMaxInterfaces;

                    public final Adsl2ScalarSCAvailInterfacesEnt adsl2ScalarSCAvailInterfaces;

                    private Adsl2ScalarSCEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2ScalarSC", "1.3.6.1.2.1.10.238.1.6.1", false, false, false, false);
                        this.adsl2ScalarSCMaxInterfaces = new Adsl2ScalarSCMaxInterfacesEnt(mib, this);
                        this.adsl2ScalarSCAvailInterfaces = new Adsl2ScalarSCAvailInterfacesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2ScalarSCMaxInterfaces,
                            this.adsl2ScalarSCAvailInterfaces
                        };
                    }
                    public static final class Adsl2ScalarSCMaxInterfacesEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ScalarSCMaxInterfacesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ScalarSCMaxInterfaces", "1.3.6.1.2.1.10.238.1.6.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ScalarSCAvailInterfacesEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ScalarSCAvailInterfacesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ScalarSCAvailInterfaces", "1.3.6.1.2.1.10.238.1.6.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Adsl2NotificationsEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** ---------------------Notifications Group          --
---------------------*/
                public final Adsl2LinePerfFECSThreshAtucEnt adsl2LinePerfFECSThreshAtuc;

                public final Adsl2LinePerfFECSThreshAturEnt adsl2LinePerfFECSThreshAtur;

                public final Adsl2LinePerfESThreshAtucEnt adsl2LinePerfESThreshAtuc;

                public final Adsl2LinePerfESThreshAturEnt adsl2LinePerfESThreshAtur;

                public final Adsl2LinePerfSESThreshAtucEnt adsl2LinePerfSESThreshAtuc;

                public final Adsl2LinePerfSESThreshAturEnt adsl2LinePerfSESThreshAtur;

                public final Adsl2LinePerfLOSSThreshAtucEnt adsl2LinePerfLOSSThreshAtuc;

                public final Adsl2LinePerfLOSSThreshAturEnt adsl2LinePerfLOSSThreshAtur;

                public final Adsl2LinePerfUASThreshAtucEnt adsl2LinePerfUASThreshAtuc;

                public final Adsl2LinePerfUASThreshAturEnt adsl2LinePerfUASThreshAtur;

                public final Adsl2LinePerfCodingViolationsThreshAtucEnt adsl2LinePerfCodingViolationsThreshAtuc;

                public final Adsl2LinePerfCodingViolationsThreshAturEnt adsl2LinePerfCodingViolationsThreshAtur;

                public final Adsl2LinePerfCorrectedThreshAtucEnt adsl2LinePerfCorrectedThreshAtuc;

                public final Adsl2LinePerfCorrectedThreshAturEnt adsl2LinePerfCorrectedThreshAtur;

                public final Adsl2LinePerfFailedFullInitThreshEnt adsl2LinePerfFailedFullInitThresh;

                public final Adsl2LinePerfFailedShortInitThreshEnt adsl2LinePerfFailedShortInitThresh;

                public final Adsl2LineStatusChangeAtucEnt adsl2LineStatusChangeAtuc;

                public final Adsl2LineStatusChangeAturEnt adsl2LineStatusChangeAtur;

                private Adsl2NotificationsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Notifications", "1.3.6.1.2.1.10.238.1.0", false, false, false, false);
                    this.adsl2LinePerfFECSThreshAtuc = new Adsl2LinePerfFECSThreshAtucEnt(mib, this);
                    this.adsl2LinePerfFECSThreshAtur = new Adsl2LinePerfFECSThreshAturEnt(mib, this);
                    this.adsl2LinePerfESThreshAtuc = new Adsl2LinePerfESThreshAtucEnt(mib, this);
                    this.adsl2LinePerfESThreshAtur = new Adsl2LinePerfESThreshAturEnt(mib, this);
                    this.adsl2LinePerfSESThreshAtuc = new Adsl2LinePerfSESThreshAtucEnt(mib, this);
                    this.adsl2LinePerfSESThreshAtur = new Adsl2LinePerfSESThreshAturEnt(mib, this);
                    this.adsl2LinePerfLOSSThreshAtuc = new Adsl2LinePerfLOSSThreshAtucEnt(mib, this);
                    this.adsl2LinePerfLOSSThreshAtur = new Adsl2LinePerfLOSSThreshAturEnt(mib, this);
                    this.adsl2LinePerfUASThreshAtuc = new Adsl2LinePerfUASThreshAtucEnt(mib, this);
                    this.adsl2LinePerfUASThreshAtur = new Adsl2LinePerfUASThreshAturEnt(mib, this);
                    this.adsl2LinePerfCodingViolationsThreshAtuc = new Adsl2LinePerfCodingViolationsThreshAtucEnt(mib, this);
                    this.adsl2LinePerfCodingViolationsThreshAtur = new Adsl2LinePerfCodingViolationsThreshAturEnt(mib, this);
                    this.adsl2LinePerfCorrectedThreshAtuc = new Adsl2LinePerfCorrectedThreshAtucEnt(mib, this);
                    this.adsl2LinePerfCorrectedThreshAtur = new Adsl2LinePerfCorrectedThreshAturEnt(mib, this);
                    this.adsl2LinePerfFailedFullInitThresh = new Adsl2LinePerfFailedFullInitThreshEnt(mib, this);
                    this.adsl2LinePerfFailedShortInitThresh = new Adsl2LinePerfFailedShortInitThreshEnt(mib, this);
                    this.adsl2LineStatusChangeAtuc = new Adsl2LineStatusChangeAtucEnt(mib, this);
                    this.adsl2LineStatusChangeAtur = new Adsl2LineStatusChangeAturEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2LinePerfFECSThreshAtuc,
                        this.adsl2LinePerfFECSThreshAtur,
                        this.adsl2LinePerfESThreshAtuc,
                        this.adsl2LinePerfESThreshAtur,
                        this.adsl2LinePerfSESThreshAtuc,
                        this.adsl2LinePerfSESThreshAtur,
                        this.adsl2LinePerfLOSSThreshAtuc,
                        this.adsl2LinePerfLOSSThreshAtur,
                        this.adsl2LinePerfUASThreshAtuc,
                        this.adsl2LinePerfUASThreshAtur,
                        this.adsl2LinePerfCodingViolationsThreshAtuc,
                        this.adsl2LinePerfCodingViolationsThreshAtur,
                        this.adsl2LinePerfCorrectedThreshAtuc,
                        this.adsl2LinePerfCorrectedThreshAtur,
                        this.adsl2LinePerfFailedFullInitThresh,
                        this.adsl2LinePerfFailedShortInitThresh,
                        this.adsl2LineStatusChangeAtuc,
                        this.adsl2LineStatusChangeAtur
                    };
                }
                public static final class Adsl2LinePerfFECSThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfFECSThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfFECSThreshAtuc", "1.3.6.1.2.1.10.238.1.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfFECSThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfFECSThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfFECSThreshAtur", "1.3.6.1.2.1.10.238.1.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfESThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfESThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfESThreshAtuc", "1.3.6.1.2.1.10.238.1.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfESThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfESThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfESThreshAtur", "1.3.6.1.2.1.10.238.1.0.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfSESThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfSESThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfSESThreshAtuc", "1.3.6.1.2.1.10.238.1.0.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfSESThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfSESThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfSESThreshAtur", "1.3.6.1.2.1.10.238.1.0.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfLOSSThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfLOSSThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfLOSSThreshAtuc", "1.3.6.1.2.1.10.238.1.0.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfLOSSThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfLOSSThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfLOSSThreshAtur", "1.3.6.1.2.1.10.238.1.0.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfUASThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfUASThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfUASThreshAtuc", "1.3.6.1.2.1.10.238.1.0.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfUASThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfUASThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfUASThreshAtur", "1.3.6.1.2.1.10.238.1.0.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfCodingViolationsThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfCodingViolationsThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfCodingViolationsThreshAtuc", "1.3.6.1.2.1.10.238.1.0.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfCodingViolationsThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfCodingViolationsThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfCodingViolationsThreshAtur", "1.3.6.1.2.1.10.238.1.0.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfCorrectedThreshAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfCorrectedThreshAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfCorrectedThreshAtuc", "1.3.6.1.2.1.10.238.1.0.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfCorrectedThreshAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfCorrectedThreshAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfCorrectedThreshAtur", "1.3.6.1.2.1.10.238.1.0.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfFailedFullInitThreshEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfFailedFullInitThreshEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfFailedFullInitThresh", "1.3.6.1.2.1.10.238.1.0.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LinePerfFailedShortInitThreshEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LinePerfFailedShortInitThreshEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LinePerfFailedShortInitThresh", "1.3.6.1.2.1.10.238.1.0.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LineStatusChangeAtucEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LineStatusChangeAtucEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LineStatusChangeAtuc", "1.3.6.1.2.1.10.238.1.0.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Adsl2LineStatusChangeAturEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    private Adsl2LineStatusChangeAturEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2LineStatusChangeAtur", "1.3.6.1.2.1.10.238.1.0.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Adsl2ConformanceEnt extends MIBEntry<ADSL2LINEMIBDef>
            {
                /** conformance information*/
                public final Adsl2GroupsEnt adsl2Groups;

                public final Adsl2CompliancesEnt adsl2Compliances;

                private Adsl2ConformanceEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                {
                    super(mib, parent, "adsl2Conformance", "1.3.6.1.2.1.10.238.1.7", false, false, false, false);
                    this.adsl2Groups = new Adsl2GroupsEnt(mib, this);
                    this.adsl2Compliances = new Adsl2CompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adsl2Groups,
                        this.adsl2Compliances
                    };
                }
                public static final class Adsl2GroupsEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    /** units of conformance*/
                    public final Adsl2LineGroupEnt adsl2LineGroup;

                    public final Adsl2ChannelStatusGroupEnt adsl2ChannelStatusGroup;

                    public final Adsl2ChannelStatusAtmGroupEnt adsl2ChannelStatusAtmGroup;

                    public final Adsl2ChannelStatusPtmGroupEnt adsl2ChannelStatusPtmGroup;

                    public final Adsl2SCStatusGroupEnt adsl2SCStatusGroup;

                    public final Adsl2LineInventoryGroupEnt adsl2LineInventoryGroup;

                    public final Adsl2LineConfTemplateGroupEnt adsl2LineConfTemplateGroup;

                    public final Adsl2LineConfProfGroupEnt adsl2LineConfProfGroup;

                    public final Adsl2LineConfProfRaGroupEnt adsl2LineConfProfRaGroup;

                    public final Adsl2LineConfProfMsgMinGroupEnt adsl2LineConfProfMsgMinGroup;

                    public final Adsl2LineConfProfModeSpecGroupEnt adsl2LineConfProfModeSpecGroup;

                    public final Adsl2ChConfProfileGroupEnt adsl2ChConfProfileGroup;

                    public final Adsl2ChConfProfileAtmGroupEnt adsl2ChConfProfileAtmGroup;

                    public final Adsl2ChConfProfileMinResGroupEnt adsl2ChConfProfileMinResGroup;

                    public final Adsl2LineAlarmConfTemplateGroupEnt adsl2LineAlarmConfTemplateGroup;

                    public final Adsl2LineAlarmConfProfileGroupEnt adsl2LineAlarmConfProfileGroup;

                    public final Adsl2ChAlarmConfProfileGroupEnt adsl2ChAlarmConfProfileGroup;

                    public final Adsl2PMLineCurrGroupEnt adsl2PMLineCurrGroup;

                    public final Adsl2PMLineCurrInitGroupEnt adsl2PMLineCurrInitGroup;

                    public final Adsl2PMLineCurrInitShortGroupEnt adsl2PMLineCurrInitShortGroup;

                    public final Adsl2PMLineHist15MinGroupEnt adsl2PMLineHist15MinGroup;

                    public final Adsl2PMLineHist1DayGroupEnt adsl2PMLineHist1DayGroup;

                    public final Adsl2PMLineInitHist15MinGroupEnt adsl2PMLineInitHist15MinGroup;

                    public final Adsl2PMLineInitHist15MinShortGroupEnt adsl2PMLineInitHist15MinShortGroup;

                    public final Adsl2PMLineInitHist1DayGroupEnt adsl2PMLineInitHist1DayGroup;

                    public final Adsl2PMLineInitHist1DayShortGroupEnt adsl2PMLineInitHist1DayShortGroup;

                    public final Adsl2PMChCurrGroupEnt adsl2PMChCurrGroup;

                    public final Adsl2PMChHist15MinGroupEnt adsl2PMChHist15MinGroup;

                    public final Adsl2PMChHist1DGroupEnt adsl2PMChHist1DGroup;

                    public final Adsl2ScalarSCGroupEnt adsl2ScalarSCGroup;

                    public final Adsl2ThreshNotificationGroupEnt adsl2ThreshNotificationGroup;

                    public final Adsl2StatusChangeNotificationGroupEnt adsl2StatusChangeNotificationGroup;

                    private Adsl2GroupsEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2Groups", "1.3.6.1.2.1.10.238.1.7.1", false, false, false, false);
                        this.adsl2LineGroup = new Adsl2LineGroupEnt(mib, this);
                        this.adsl2ChannelStatusGroup = new Adsl2ChannelStatusGroupEnt(mib, this);
                        this.adsl2ChannelStatusAtmGroup = new Adsl2ChannelStatusAtmGroupEnt(mib, this);
                        this.adsl2ChannelStatusPtmGroup = new Adsl2ChannelStatusPtmGroupEnt(mib, this);
                        this.adsl2SCStatusGroup = new Adsl2SCStatusGroupEnt(mib, this);
                        this.adsl2LineInventoryGroup = new Adsl2LineInventoryGroupEnt(mib, this);
                        this.adsl2LineConfTemplateGroup = new Adsl2LineConfTemplateGroupEnt(mib, this);
                        this.adsl2LineConfProfGroup = new Adsl2LineConfProfGroupEnt(mib, this);
                        this.adsl2LineConfProfRaGroup = new Adsl2LineConfProfRaGroupEnt(mib, this);
                        this.adsl2LineConfProfMsgMinGroup = new Adsl2LineConfProfMsgMinGroupEnt(mib, this);
                        this.adsl2LineConfProfModeSpecGroup = new Adsl2LineConfProfModeSpecGroupEnt(mib, this);
                        this.adsl2ChConfProfileGroup = new Adsl2ChConfProfileGroupEnt(mib, this);
                        this.adsl2ChConfProfileAtmGroup = new Adsl2ChConfProfileAtmGroupEnt(mib, this);
                        this.adsl2ChConfProfileMinResGroup = new Adsl2ChConfProfileMinResGroupEnt(mib, this);
                        this.adsl2LineAlarmConfTemplateGroup = new Adsl2LineAlarmConfTemplateGroupEnt(mib, this);
                        this.adsl2LineAlarmConfProfileGroup = new Adsl2LineAlarmConfProfileGroupEnt(mib, this);
                        this.adsl2ChAlarmConfProfileGroup = new Adsl2ChAlarmConfProfileGroupEnt(mib, this);
                        this.adsl2PMLineCurrGroup = new Adsl2PMLineCurrGroupEnt(mib, this);
                        this.adsl2PMLineCurrInitGroup = new Adsl2PMLineCurrInitGroupEnt(mib, this);
                        this.adsl2PMLineCurrInitShortGroup = new Adsl2PMLineCurrInitShortGroupEnt(mib, this);
                        this.adsl2PMLineHist15MinGroup = new Adsl2PMLineHist15MinGroupEnt(mib, this);
                        this.adsl2PMLineHist1DayGroup = new Adsl2PMLineHist1DayGroupEnt(mib, this);
                        this.adsl2PMLineInitHist15MinGroup = new Adsl2PMLineInitHist15MinGroupEnt(mib, this);
                        this.adsl2PMLineInitHist15MinShortGroup = new Adsl2PMLineInitHist15MinShortGroupEnt(mib, this);
                        this.adsl2PMLineInitHist1DayGroup = new Adsl2PMLineInitHist1DayGroupEnt(mib, this);
                        this.adsl2PMLineInitHist1DayShortGroup = new Adsl2PMLineInitHist1DayShortGroupEnt(mib, this);
                        this.adsl2PMChCurrGroup = new Adsl2PMChCurrGroupEnt(mib, this);
                        this.adsl2PMChHist15MinGroup = new Adsl2PMChHist15MinGroupEnt(mib, this);
                        this.adsl2PMChHist1DGroup = new Adsl2PMChHist1DGroupEnt(mib, this);
                        this.adsl2ScalarSCGroup = new Adsl2ScalarSCGroupEnt(mib, this);
                        this.adsl2ThreshNotificationGroup = new Adsl2ThreshNotificationGroupEnt(mib, this);
                        this.adsl2StatusChangeNotificationGroup = new Adsl2StatusChangeNotificationGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2LineGroup,
                            this.adsl2ChannelStatusGroup,
                            this.adsl2ChannelStatusAtmGroup,
                            this.adsl2ChannelStatusPtmGroup,
                            this.adsl2SCStatusGroup,
                            this.adsl2LineInventoryGroup,
                            this.adsl2LineConfTemplateGroup,
                            this.adsl2LineConfProfGroup,
                            this.adsl2LineConfProfRaGroup,
                            this.adsl2LineConfProfMsgMinGroup,
                            this.adsl2LineConfProfModeSpecGroup,
                            this.adsl2ChConfProfileGroup,
                            this.adsl2ChConfProfileAtmGroup,
                            this.adsl2ChConfProfileMinResGroup,
                            this.adsl2LineAlarmConfTemplateGroup,
                            this.adsl2LineAlarmConfProfileGroup,
                            this.adsl2ChAlarmConfProfileGroup,
                            this.adsl2PMLineCurrGroup,
                            this.adsl2PMLineCurrInitGroup,
                            this.adsl2PMLineCurrInitShortGroup,
                            this.adsl2PMLineHist15MinGroup,
                            this.adsl2PMLineHist1DayGroup,
                            this.adsl2PMLineInitHist15MinGroup,
                            this.adsl2PMLineInitHist15MinShortGroup,
                            this.adsl2PMLineInitHist1DayGroup,
                            this.adsl2PMLineInitHist1DayShortGroup,
                            this.adsl2PMChCurrGroup,
                            this.adsl2PMChHist15MinGroup,
                            this.adsl2PMChHist1DGroup,
                            this.adsl2ScalarSCGroup,
                            this.adsl2ThreshNotificationGroup,
                            this.adsl2StatusChangeNotificationGroup
                        };
                    }
                    public static final class Adsl2LineGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineGroup", "1.3.6.1.2.1.10.238.1.7.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChannelStatusGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChannelStatusGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChannelStatusGroup", "1.3.6.1.2.1.10.238.1.7.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChannelStatusAtmGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChannelStatusAtmGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChannelStatusAtmGroup", "1.3.6.1.2.1.10.238.1.7.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChannelStatusPtmGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChannelStatusPtmGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChannelStatusPtmGroup", "1.3.6.1.2.1.10.238.1.7.1.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2SCStatusGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2SCStatusGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2SCStatusGroup", "1.3.6.1.2.1.10.238.1.7.1.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineInventoryGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineInventoryGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineInventoryGroup", "1.3.6.1.2.1.10.238.1.7.1.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineConfTemplateGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineConfTemplateGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfTemplateGroup", "1.3.6.1.2.1.10.238.1.7.1.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineConfProfGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineConfProfGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfProfGroup", "1.3.6.1.2.1.10.238.1.7.1.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineConfProfRaGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineConfProfRaGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfProfRaGroup", "1.3.6.1.2.1.10.238.1.7.1.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineConfProfMsgMinGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineConfProfMsgMinGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfProfMsgMinGroup", "1.3.6.1.2.1.10.238.1.7.1.10", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineConfProfModeSpecGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineConfProfModeSpecGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineConfProfModeSpecGroup", "1.3.6.1.2.1.10.238.1.7.1.11", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChConfProfileGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChConfProfileGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChConfProfileGroup", "1.3.6.1.2.1.10.238.1.7.1.12", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChConfProfileAtmGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChConfProfileAtmGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChConfProfileAtmGroup", "1.3.6.1.2.1.10.238.1.7.1.13", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChConfProfileMinResGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChConfProfileMinResGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChConfProfileMinResGroup", "1.3.6.1.2.1.10.238.1.7.1.14", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineAlarmConfTemplateGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineAlarmConfTemplateGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineAlarmConfTemplateGroup", "1.3.6.1.2.1.10.238.1.7.1.15", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2LineAlarmConfProfileGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineAlarmConfProfileGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineAlarmConfProfileGroup", "1.3.6.1.2.1.10.238.1.7.1.16", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ChAlarmConfProfileGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ChAlarmConfProfileGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ChAlarmConfProfileGroup", "1.3.6.1.2.1.10.238.1.7.1.17", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineCurrGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineCurrGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineCurrGroup", "1.3.6.1.2.1.10.238.1.7.1.18", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineCurrInitGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineCurrInitGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineCurrInitGroup", "1.3.6.1.2.1.10.238.1.7.1.19", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineCurrInitShortGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineCurrInitShortGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineCurrInitShortGroup", "1.3.6.1.2.1.10.238.1.7.1.20", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineHist15MinGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineHist15MinGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineHist15MinGroup", "1.3.6.1.2.1.10.238.1.7.1.21", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineHist1DayGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineHist1DayGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineHist1DayGroup", "1.3.6.1.2.1.10.238.1.7.1.22", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineInitHist15MinGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineInitHist15MinGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineInitHist15MinGroup", "1.3.6.1.2.1.10.238.1.7.1.23", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineInitHist15MinShortGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineInitHist15MinShortGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineInitHist15MinShortGroup", "1.3.6.1.2.1.10.238.1.7.1.24", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineInitHist1DayGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineInitHist1DayGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineInitHist1DayGroup", "1.3.6.1.2.1.10.238.1.7.1.25", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMLineInitHist1DayShortGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMLineInitHist1DayShortGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMLineInitHist1DayShortGroup", "1.3.6.1.2.1.10.238.1.7.1.26", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMChCurrGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMChCurrGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMChCurrGroup", "1.3.6.1.2.1.10.238.1.7.1.27", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMChHist15MinGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMChHist15MinGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMChHist15MinGroup", "1.3.6.1.2.1.10.238.1.7.1.28", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2PMChHist1DGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2PMChHist1DGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2PMChHist1DGroup", "1.3.6.1.2.1.10.238.1.7.1.29", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ScalarSCGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ScalarSCGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ScalarSCGroup", "1.3.6.1.2.1.10.238.1.7.1.30", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2ThreshNotificationGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2ThreshNotificationGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2ThreshNotificationGroup", "1.3.6.1.2.1.10.238.1.7.1.31", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Adsl2StatusChangeNotificationGroupEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2StatusChangeNotificationGroupEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2StatusChangeNotificationGroup", "1.3.6.1.2.1.10.238.1.7.1.32", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class Adsl2CompliancesEnt extends MIBEntry<ADSL2LINEMIBDef>
                {
                    public final Adsl2LineMibComplianceEnt adsl2LineMibCompliance;

                    private Adsl2CompliancesEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                    {
                        super(mib, parent, "adsl2Compliances", "1.3.6.1.2.1.10.238.1.7.2", false, false, false, false);
                        this.adsl2LineMibCompliance = new Adsl2LineMibComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adsl2LineMibCompliance
                        };
                    }
                    public static final class Adsl2LineMibComplianceEnt extends MIBEntry<ADSL2LINEMIBDef>
                    {
                        private Adsl2LineMibComplianceEnt(ADSL2LINEMIBDef mib, MIBEntry<ADSL2LINEMIBDef> parent)
                        {
                            super(mib, parent, "adsl2LineMibCompliance", "1.3.6.1.2.1.10.238.1.7.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
