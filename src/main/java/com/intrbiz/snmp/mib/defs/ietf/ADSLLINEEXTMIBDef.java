package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ADSLLINEEXTMIBDef extends MIB
{
    public static final ADSLLINEEXTMIBDef ADSLLINEEXTMIB = new ADSLLINEEXTMIBDef();

    static { MIBs.getInstance().registerMIB(ADSLLINEEXTMIBDef.ADSLLINEEXTMIB); }

    /** 10 Dec 2002*/
    public final AdslExtMIBEnt adslExtMIB;

    private ADSLLINEEXTMIBDef()
    {
        super("ADSL-LINE-EXT-MIB");
        this.adslExtMIB = new AdslExtMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.adslExtMIB
        };
    }

    public static final class AdslExtMIBEnt extends MIBEntry<ADSLLINEEXTMIBDef>
    {
        public final AdslExtMibObjectsEnt adslExtMibObjects;

        /** conformance information*/
        public final AdslExtConformanceEnt adslExtConformance;

        private AdslExtMIBEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
        {
            super(mib, parent, "adslExtMIB", "1.3.6.1.2.1.10.94.3", false, false, false, false);
            this.adslExtMibObjects = new AdslExtMibObjectsEnt(mib, this);
            this.adslExtConformance = new AdslExtConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.adslExtMibObjects,
                this.adslExtConformance
            };
        }
        public static final class AdslExtMibObjectsEnt extends MIBEntry<ADSLLINEEXTMIBDef>
        {
            public final AdslLineExtTableEnt adslLineExtTable;

            public final AdslAtucPerfDataExtTableEnt adslAtucPerfDataExtTable;

            public final AdslAtucIntervalExtTableEnt adslAtucIntervalExtTable;

            public final AdslAturPerfDataExtTableEnt adslAturPerfDataExtTable;

            public final AdslAturIntervalExtTableEnt adslAturIntervalExtTable;

            public final AdslConfProfileExtTableEnt adslConfProfileExtTable;

            public final AdslAlarmConfProfileExtTableEnt adslAlarmConfProfileExtTable;

            /** definitions*/
            public final AdslExtTrapsEnt adslExtTraps;

            private AdslExtMibObjectsEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
            {
                super(mib, parent, "adslExtMibObjects", "1.3.6.1.2.1.10.94.3.1", false, false, false, false);
                this.adslLineExtTable = new AdslLineExtTableEnt(mib, this);
                this.adslAtucPerfDataExtTable = new AdslAtucPerfDataExtTableEnt(mib, this);
                this.adslAtucIntervalExtTable = new AdslAtucIntervalExtTableEnt(mib, this);
                this.adslAturPerfDataExtTable = new AdslAturPerfDataExtTableEnt(mib, this);
                this.adslAturIntervalExtTable = new AdslAturIntervalExtTableEnt(mib, this);
                this.adslConfProfileExtTable = new AdslConfProfileExtTableEnt(mib, this);
                this.adslAlarmConfProfileExtTable = new AdslAlarmConfProfileExtTableEnt(mib, this);
                this.adslExtTraps = new AdslExtTrapsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.adslLineExtTable,
                    this.adslAtucPerfDataExtTable,
                    this.adslAtucIntervalExtTable,
                    this.adslAturPerfDataExtTable,
                    this.adslAturIntervalExtTable,
                    this.adslConfProfileExtTable,
                    this.adslAlarmConfProfileExtTable,
                    this.adslExtTraps
                };
            }
            public static final class AdslLineExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslLineExtEntryEnt adslLineExtEntry;

                private AdslLineExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslLineExtTable", "1.3.6.1.2.1.10.94.3.1.17", false, true, false, false);
                    this.adslLineExtEntry = new AdslLineExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslLineExtEntry
                    };
                }
                public static final class AdslLineExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslLineTransAtucCapEnt adslLineTransAtucCap;

                    public final AdslLineTransAtucConfigEnt adslLineTransAtucConfig;

                    public final AdslLineTransAtucActualEnt adslLineTransAtucActual;

                    public final AdslLineGlitePowerStateEnt adslLineGlitePowerState;

                    public final AdslLineConfProfileDualLiteEnt adslLineConfProfileDualLite;

                    private AdslLineExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslLineExtEntry", "1.3.6.1.2.1.10.94.3.1.17.1", false, false, false, true);
                        this.adslLineTransAtucCap = new AdslLineTransAtucCapEnt(mib, this);
                        this.adslLineTransAtucConfig = new AdslLineTransAtucConfigEnt(mib, this);
                        this.adslLineTransAtucActual = new AdslLineTransAtucActualEnt(mib, this);
                        this.adslLineGlitePowerState = new AdslLineGlitePowerStateEnt(mib, this);
                        this.adslLineConfProfileDualLite = new AdslLineConfProfileDualLiteEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslLineTransAtucCap,
                            this.adslLineTransAtucConfig,
                            this.adslLineTransAtucActual,
                            this.adslLineGlitePowerState,
                            this.adslLineConfProfileDualLite
                        };
                    }
                    public static final class AdslLineTransAtucCapEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslLineTransAtucCapEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslLineTransAtucCap", "1.3.6.1.2.1.10.94.3.1.17.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineTransAtucConfigEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslLineTransAtucConfigEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslLineTransAtucConfig", "1.3.6.1.2.1.10.94.3.1.17.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineTransAtucActualEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslLineTransAtucActualEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslLineTransAtucActual", "1.3.6.1.2.1.10.94.3.1.17.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineGlitePowerStateEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslLineGlitePowerStateEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslLineGlitePowerState", "1.3.6.1.2.1.10.94.3.1.17.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineConfProfileDualLiteEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslLineConfProfileDualLiteEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslLineConfProfileDualLite", "1.3.6.1.2.1.10.94.3.1.17.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslAtucPerfDataExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslAtucPerfDataExtEntryEnt adslAtucPerfDataExtEntry;

                private AdslAtucPerfDataExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslAtucPerfDataExtTable", "1.3.6.1.2.1.10.94.3.1.18", false, true, false, false);
                    this.adslAtucPerfDataExtEntry = new AdslAtucPerfDataExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslAtucPerfDataExtEntry
                    };
                }
                public static final class AdslAtucPerfDataExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslAtucPerfStatFastREnt adslAtucPerfStatFastR;

                    public final AdslAtucPerfStatFailedFastREnt adslAtucPerfStatFailedFastR;

                    public final AdslAtucPerfStatSesLEnt adslAtucPerfStatSesL;

                    public final AdslAtucPerfStatUasLEnt adslAtucPerfStatUasL;

                    public final AdslAtucPerfCurr15MinFastREnt adslAtucPerfCurr15MinFastR;

                    public final AdslAtucPerfCurr15MinFailedFastREnt adslAtucPerfCurr15MinFailedFastR;

                    public final AdslAtucPerfCurr15MinSesLEnt adslAtucPerfCurr15MinSesL;

                    public final AdslAtucPerfCurr15MinUasLEnt adslAtucPerfCurr15MinUasL;

                    public final AdslAtucPerfCurr1DayFastREnt adslAtucPerfCurr1DayFastR;

                    public final AdslAtucPerfCurr1DayFailedFastREnt adslAtucPerfCurr1DayFailedFastR;

                    public final AdslAtucPerfCurr1DaySesLEnt adslAtucPerfCurr1DaySesL;

                    public final AdslAtucPerfCurr1DayUasLEnt adslAtucPerfCurr1DayUasL;

                    public final AdslAtucPerfPrev1DayFastREnt adslAtucPerfPrev1DayFastR;

                    public final AdslAtucPerfPrev1DayFailedFastREnt adslAtucPerfPrev1DayFailedFastR;

                    public final AdslAtucPerfPrev1DaySesLEnt adslAtucPerfPrev1DaySesL;

                    public final AdslAtucPerfPrev1DayUasLEnt adslAtucPerfPrev1DayUasL;

                    private AdslAtucPerfDataExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucPerfDataExtEntry", "1.3.6.1.2.1.10.94.3.1.18.1", false, false, false, true);
                        this.adslAtucPerfStatFastR = new AdslAtucPerfStatFastREnt(mib, this);
                        this.adslAtucPerfStatFailedFastR = new AdslAtucPerfStatFailedFastREnt(mib, this);
                        this.adslAtucPerfStatSesL = new AdslAtucPerfStatSesLEnt(mib, this);
                        this.adslAtucPerfStatUasL = new AdslAtucPerfStatUasLEnt(mib, this);
                        this.adslAtucPerfCurr15MinFastR = new AdslAtucPerfCurr15MinFastREnt(mib, this);
                        this.adslAtucPerfCurr15MinFailedFastR = new AdslAtucPerfCurr15MinFailedFastREnt(mib, this);
                        this.adslAtucPerfCurr15MinSesL = new AdslAtucPerfCurr15MinSesLEnt(mib, this);
                        this.adslAtucPerfCurr15MinUasL = new AdslAtucPerfCurr15MinUasLEnt(mib, this);
                        this.adslAtucPerfCurr1DayFastR = new AdslAtucPerfCurr1DayFastREnt(mib, this);
                        this.adslAtucPerfCurr1DayFailedFastR = new AdslAtucPerfCurr1DayFailedFastREnt(mib, this);
                        this.adslAtucPerfCurr1DaySesL = new AdslAtucPerfCurr1DaySesLEnt(mib, this);
                        this.adslAtucPerfCurr1DayUasL = new AdslAtucPerfCurr1DayUasLEnt(mib, this);
                        this.adslAtucPerfPrev1DayFastR = new AdslAtucPerfPrev1DayFastREnt(mib, this);
                        this.adslAtucPerfPrev1DayFailedFastR = new AdslAtucPerfPrev1DayFailedFastREnt(mib, this);
                        this.adslAtucPerfPrev1DaySesL = new AdslAtucPerfPrev1DaySesLEnt(mib, this);
                        this.adslAtucPerfPrev1DayUasL = new AdslAtucPerfPrev1DayUasLEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucPerfStatFastR,
                            this.adslAtucPerfStatFailedFastR,
                            this.adslAtucPerfStatSesL,
                            this.adslAtucPerfStatUasL,
                            this.adslAtucPerfCurr15MinFastR,
                            this.adslAtucPerfCurr15MinFailedFastR,
                            this.adslAtucPerfCurr15MinSesL,
                            this.adslAtucPerfCurr15MinUasL,
                            this.adslAtucPerfCurr1DayFastR,
                            this.adslAtucPerfCurr1DayFailedFastR,
                            this.adslAtucPerfCurr1DaySesL,
                            this.adslAtucPerfCurr1DayUasL,
                            this.adslAtucPerfPrev1DayFastR,
                            this.adslAtucPerfPrev1DayFailedFastR,
                            this.adslAtucPerfPrev1DaySesL,
                            this.adslAtucPerfPrev1DayUasL
                        };
                    }
                    public static final class AdslAtucPerfStatFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfStatFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfStatFastR", "1.3.6.1.2.1.10.94.3.1.18.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfStatFailedFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfStatFailedFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfStatFailedFastR", "1.3.6.1.2.1.10.94.3.1.18.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfStatSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfStatSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfStatSesL", "1.3.6.1.2.1.10.94.3.1.18.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfStatUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfStatUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfStatUasL", "1.3.6.1.2.1.10.94.3.1.18.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr15MinFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr15MinFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr15MinFastR", "1.3.6.1.2.1.10.94.3.1.18.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr15MinFailedFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr15MinFailedFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr15MinFailedFastR", "1.3.6.1.2.1.10.94.3.1.18.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr15MinSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr15MinSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr15MinSesL", "1.3.6.1.2.1.10.94.3.1.18.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr15MinUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr15MinUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr15MinUasL", "1.3.6.1.2.1.10.94.3.1.18.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr1DayFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr1DayFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr1DayFastR", "1.3.6.1.2.1.10.94.3.1.18.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr1DayFailedFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr1DayFailedFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr1DayFailedFastR", "1.3.6.1.2.1.10.94.3.1.18.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr1DaySesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr1DaySesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr1DaySesL", "1.3.6.1.2.1.10.94.3.1.18.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfCurr1DayUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfCurr1DayUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfCurr1DayUasL", "1.3.6.1.2.1.10.94.3.1.18.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfPrev1DayFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfPrev1DayFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfPrev1DayFastR", "1.3.6.1.2.1.10.94.3.1.18.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfPrev1DayFailedFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfPrev1DayFailedFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfPrev1DayFailedFastR", "1.3.6.1.2.1.10.94.3.1.18.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfPrev1DaySesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfPrev1DaySesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfPrev1DaySesL", "1.3.6.1.2.1.10.94.3.1.18.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPerfPrev1DayUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucPerfPrev1DayUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfPrev1DayUasL", "1.3.6.1.2.1.10.94.3.1.18.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslAtucIntervalExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslAtucIntervalExtEntryEnt adslAtucIntervalExtEntry;

                private AdslAtucIntervalExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslAtucIntervalExtTable", "1.3.6.1.2.1.10.94.3.1.19", false, true, false, false);
                    this.adslAtucIntervalExtEntry = new AdslAtucIntervalExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslAtucIntervalExtEntry
                    };
                }
                public static final class AdslAtucIntervalExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslAtucIntervalFastREnt adslAtucIntervalFastR;

                    public final AdslAtucIntervalFailedFastREnt adslAtucIntervalFailedFastR;

                    public final AdslAtucIntervalSesLEnt adslAtucIntervalSesL;

                    public final AdslAtucIntervalUasLEnt adslAtucIntervalUasL;

                    private AdslAtucIntervalExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucIntervalExtEntry", "1.3.6.1.2.1.10.94.3.1.19.1", false, false, false, true);
                        this.adslAtucIntervalFastR = new AdslAtucIntervalFastREnt(mib, this);
                        this.adslAtucIntervalFailedFastR = new AdslAtucIntervalFailedFastREnt(mib, this);
                        this.adslAtucIntervalSesL = new AdslAtucIntervalSesLEnt(mib, this);
                        this.adslAtucIntervalUasL = new AdslAtucIntervalUasLEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucIntervalFastR,
                            this.adslAtucIntervalFailedFastR,
                            this.adslAtucIntervalSesL,
                            this.adslAtucIntervalUasL
                        };
                    }
                    public static final class AdslAtucIntervalFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucIntervalFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucIntervalFastR", "1.3.6.1.2.1.10.94.3.1.19.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucIntervalFailedFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucIntervalFailedFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucIntervalFailedFastR", "1.3.6.1.2.1.10.94.3.1.19.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucIntervalSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucIntervalSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucIntervalSesL", "1.3.6.1.2.1.10.94.3.1.19.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucIntervalUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucIntervalUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucIntervalUasL", "1.3.6.1.2.1.10.94.3.1.19.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslAturPerfDataExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslAturPerfDataExtEntryEnt adslAturPerfDataExtEntry;

                private AdslAturPerfDataExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslAturPerfDataExtTable", "1.3.6.1.2.1.10.94.3.1.20", false, true, false, false);
                    this.adslAturPerfDataExtEntry = new AdslAturPerfDataExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslAturPerfDataExtEntry
                    };
                }
                public static final class AdslAturPerfDataExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslAturPerfStatSesLEnt adslAturPerfStatSesL;

                    public final AdslAturPerfStatUasLEnt adslAturPerfStatUasL;

                    public final AdslAturPerfCurr15MinSesLEnt adslAturPerfCurr15MinSesL;

                    public final AdslAturPerfCurr15MinUasLEnt adslAturPerfCurr15MinUasL;

                    public final AdslAturPerfCurr1DaySesLEnt adslAturPerfCurr1DaySesL;

                    public final AdslAturPerfCurr1DayUasLEnt adslAturPerfCurr1DayUasL;

                    public final AdslAturPerfPrev1DaySesLEnt adslAturPerfPrev1DaySesL;

                    public final AdslAturPerfPrev1DayUasLEnt adslAturPerfPrev1DayUasL;

                    private AdslAturPerfDataExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslAturPerfDataExtEntry", "1.3.6.1.2.1.10.94.3.1.20.1", false, false, false, true);
                        this.adslAturPerfStatSesL = new AdslAturPerfStatSesLEnt(mib, this);
                        this.adslAturPerfStatUasL = new AdslAturPerfStatUasLEnt(mib, this);
                        this.adslAturPerfCurr15MinSesL = new AdslAturPerfCurr15MinSesLEnt(mib, this);
                        this.adslAturPerfCurr15MinUasL = new AdslAturPerfCurr15MinUasLEnt(mib, this);
                        this.adslAturPerfCurr1DaySesL = new AdslAturPerfCurr1DaySesLEnt(mib, this);
                        this.adslAturPerfCurr1DayUasL = new AdslAturPerfCurr1DayUasLEnt(mib, this);
                        this.adslAturPerfPrev1DaySesL = new AdslAturPerfPrev1DaySesLEnt(mib, this);
                        this.adslAturPerfPrev1DayUasL = new AdslAturPerfPrev1DayUasLEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturPerfStatSesL,
                            this.adslAturPerfStatUasL,
                            this.adslAturPerfCurr15MinSesL,
                            this.adslAturPerfCurr15MinUasL,
                            this.adslAturPerfCurr1DaySesL,
                            this.adslAturPerfCurr1DayUasL,
                            this.adslAturPerfPrev1DaySesL,
                            this.adslAturPerfPrev1DayUasL
                        };
                    }
                    public static final class AdslAturPerfStatSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfStatSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfStatSesL", "1.3.6.1.2.1.10.94.3.1.20.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfStatUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfStatUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfStatUasL", "1.3.6.1.2.1.10.94.3.1.20.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfCurr15MinSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfCurr15MinSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfCurr15MinSesL", "1.3.6.1.2.1.10.94.3.1.20.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfCurr15MinUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfCurr15MinUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfCurr15MinUasL", "1.3.6.1.2.1.10.94.3.1.20.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfCurr1DaySesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfCurr1DaySesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfCurr1DaySesL", "1.3.6.1.2.1.10.94.3.1.20.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfCurr1DayUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfCurr1DayUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfCurr1DayUasL", "1.3.6.1.2.1.10.94.3.1.20.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfPrev1DaySesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfPrev1DaySesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfPrev1DaySesL", "1.3.6.1.2.1.10.94.3.1.20.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPerfPrev1DayUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturPerfPrev1DayUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfPrev1DayUasL", "1.3.6.1.2.1.10.94.3.1.20.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslAturIntervalExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslAturIntervalExtEntryEnt adslAturIntervalExtEntry;

                private AdslAturIntervalExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslAturIntervalExtTable", "1.3.6.1.2.1.10.94.3.1.21", false, true, false, false);
                    this.adslAturIntervalExtEntry = new AdslAturIntervalExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslAturIntervalExtEntry
                    };
                }
                public static final class AdslAturIntervalExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslAturIntervalSesLEnt adslAturIntervalSesL;

                    public final AdslAturIntervalUasLEnt adslAturIntervalUasL;

                    private AdslAturIntervalExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslAturIntervalExtEntry", "1.3.6.1.2.1.10.94.3.1.21.1", false, false, false, true);
                        this.adslAturIntervalSesL = new AdslAturIntervalSesLEnt(mib, this);
                        this.adslAturIntervalUasL = new AdslAturIntervalUasLEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturIntervalSesL,
                            this.adslAturIntervalUasL
                        };
                    }
                    public static final class AdslAturIntervalSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturIntervalSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturIntervalSesL", "1.3.6.1.2.1.10.94.3.1.21.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturIntervalUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturIntervalUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturIntervalUasL", "1.3.6.1.2.1.10.94.3.1.21.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslConfProfileExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslConfProfileExtEntryEnt adslConfProfileExtEntry;

                private AdslConfProfileExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslConfProfileExtTable", "1.3.6.1.2.1.10.94.3.1.22", false, true, false, false);
                    this.adslConfProfileExtEntry = new AdslConfProfileExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslConfProfileExtEntry
                    };
                }
                public static final class AdslConfProfileExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslConfProfileLineTypeEnt adslConfProfileLineType;

                    private AdslConfProfileExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslConfProfileExtEntry", "1.3.6.1.2.1.10.94.3.1.22.1", false, false, false, true);
                        this.adslConfProfileLineType = new AdslConfProfileLineTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslConfProfileLineType
                        };
                    }
                    public static final class AdslConfProfileLineTypeEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslConfProfileLineTypeEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslConfProfileLineType", "1.3.6.1.2.1.10.94.3.1.22.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslAlarmConfProfileExtTableEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslAlarmConfProfileExtEntryEnt adslAlarmConfProfileExtEntry;

                private AdslAlarmConfProfileExtTableEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslAlarmConfProfileExtTable", "1.3.6.1.2.1.10.94.3.1.23", false, true, false, false);
                    this.adslAlarmConfProfileExtEntry = new AdslAlarmConfProfileExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslAlarmConfProfileExtEntry
                    };
                }
                public static final class AdslAlarmConfProfileExtEntryEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslAtucThreshold15MinFailedFastREnt adslAtucThreshold15MinFailedFastR;

                    public final AdslAtucThreshold15MinSesLEnt adslAtucThreshold15MinSesL;

                    public final AdslAtucThreshold15MinUasLEnt adslAtucThreshold15MinUasL;

                    public final AdslAturThreshold15MinSesLEnt adslAturThreshold15MinSesL;

                    public final AdslAturThreshold15MinUasLEnt adslAturThreshold15MinUasL;

                    private AdslAlarmConfProfileExtEntryEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslAlarmConfProfileExtEntry", "1.3.6.1.2.1.10.94.3.1.23.1", false, false, false, true);
                        this.adslAtucThreshold15MinFailedFastR = new AdslAtucThreshold15MinFailedFastREnt(mib, this);
                        this.adslAtucThreshold15MinSesL = new AdslAtucThreshold15MinSesLEnt(mib, this);
                        this.adslAtucThreshold15MinUasL = new AdslAtucThreshold15MinUasLEnt(mib, this);
                        this.adslAturThreshold15MinSesL = new AdslAturThreshold15MinSesLEnt(mib, this);
                        this.adslAturThreshold15MinUasL = new AdslAturThreshold15MinUasLEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucThreshold15MinFailedFastR,
                            this.adslAtucThreshold15MinSesL,
                            this.adslAtucThreshold15MinUasL,
                            this.adslAturThreshold15MinSesL,
                            this.adslAturThreshold15MinUasL
                        };
                    }
                    public static final class AdslAtucThreshold15MinFailedFastREnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucThreshold15MinFailedFastREnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucThreshold15MinFailedFastR", "1.3.6.1.2.1.10.94.3.1.23.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucThreshold15MinSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucThreshold15MinSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucThreshold15MinSesL", "1.3.6.1.2.1.10.94.3.1.23.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucThreshold15MinUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAtucThreshold15MinUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucThreshold15MinUasL", "1.3.6.1.2.1.10.94.3.1.23.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturThreshold15MinSesLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturThreshold15MinSesLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturThreshold15MinSesL", "1.3.6.1.2.1.10.94.3.1.23.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturThreshold15MinUasLEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        private AdslAturThreshold15MinUasLEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslAturThreshold15MinUasL", "1.3.6.1.2.1.10.94.3.1.23.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AdslExtTrapsEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                public final AdslExtAtucTrapsEnt adslExtAtucTraps;

                public final AdslExtAturTrapsEnt adslExtAturTraps;

                private AdslExtTrapsEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslExtTraps", "1.3.6.1.2.1.10.94.3.1.24", false, false, false, false);
                    this.adslExtAtucTraps = new AdslExtAtucTrapsEnt(mib, this);
                    this.adslExtAturTraps = new AdslExtAturTrapsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslExtAtucTraps,
                        this.adslExtAturTraps
                    };
                }
                public static final class AdslExtAtucTrapsEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslExtAtucTrapsPrefixEnt adslExtAtucTrapsPrefix;

                    private AdslExtAtucTrapsEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtAtucTraps", "1.3.6.1.2.1.10.94.3.1.24.1", false, false, false, false);
                        this.adslExtAtucTrapsPrefix = new AdslExtAtucTrapsPrefixEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslExtAtucTrapsPrefix
                        };
                    }
                    public static final class AdslExtAtucTrapsPrefixEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        public final AdslAtucFailedFastRThreshTrapEnt adslAtucFailedFastRThreshTrap;

                        public final AdslAtucSesLThreshTrapEnt adslAtucSesLThreshTrap;

                        public final AdslAtucUasLThreshTrapEnt adslAtucUasLThreshTrap;

                        private AdslExtAtucTrapsPrefixEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslExtAtucTrapsPrefix", "1.3.6.1.2.1.10.94.3.1.24.1.0", false, false, false, false);
                            this.adslAtucFailedFastRThreshTrap = new AdslAtucFailedFastRThreshTrapEnt(mib, this);
                            this.adslAtucSesLThreshTrap = new AdslAtucSesLThreshTrapEnt(mib, this);
                            this.adslAtucUasLThreshTrap = new AdslAtucUasLThreshTrapEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucFailedFastRThreshTrap,
                                this.adslAtucSesLThreshTrap,
                                this.adslAtucUasLThreshTrap
                            };
                        }
                        public static final class AdslAtucFailedFastRThreshTrapEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                        {
                            private AdslAtucFailedFastRThreshTrapEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucFailedFastRThreshTrap", "1.3.6.1.2.1.10.94.3.1.24.1.0.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucSesLThreshTrapEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                        {
                            private AdslAtucSesLThreshTrapEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucSesLThreshTrap", "1.3.6.1.2.1.10.94.3.1.24.1.0.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucUasLThreshTrapEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                        {
                            private AdslAtucUasLThreshTrapEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucUasLThreshTrap", "1.3.6.1.2.1.10.94.3.1.24.1.0.3", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslExtAturTrapsEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    public final AdslExtAturTrapsPrefixEnt adslExtAturTrapsPrefix;

                    private AdslExtAturTrapsEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtAturTraps", "1.3.6.1.2.1.10.94.3.1.24.2", false, false, false, false);
                        this.adslExtAturTrapsPrefix = new AdslExtAturTrapsPrefixEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslExtAturTrapsPrefix
                        };
                    }
                    public static final class AdslExtAturTrapsPrefixEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                    {
                        public final AdslAturSesLThreshTrapEnt adslAturSesLThreshTrap;

                        public final AdslAturUasLThreshTrapEnt adslAturUasLThreshTrap;

                        private AdslExtAturTrapsPrefixEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                        {
                            super(mib, parent, "adslExtAturTrapsPrefix", "1.3.6.1.2.1.10.94.3.1.24.2.0", false, false, false, false);
                            this.adslAturSesLThreshTrap = new AdslAturSesLThreshTrapEnt(mib, this);
                            this.adslAturUasLThreshTrap = new AdslAturUasLThreshTrapEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturSesLThreshTrap,
                                this.adslAturUasLThreshTrap
                            };
                        }
                        public static final class AdslAturSesLThreshTrapEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                        {
                            private AdslAturSesLThreshTrapEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                            {
                                super(mib, parent, "adslAturSesLThreshTrap", "1.3.6.1.2.1.10.94.3.1.24.2.0.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturUasLThreshTrapEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                        {
                            private AdslAturUasLThreshTrapEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                            {
                                super(mib, parent, "adslAturUasLThreshTrap", "1.3.6.1.2.1.10.94.3.1.24.2.0.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class AdslExtConformanceEnt extends MIBEntry<ADSLLINEEXTMIBDef>
        {
            public final AdslExtGroupsEnt adslExtGroups;

            public final AdslExtCompliancesEnt adslExtCompliances;

            private AdslExtConformanceEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
            {
                super(mib, parent, "adslExtConformance", "1.3.6.1.2.1.10.94.3.2", false, false, false, false);
                this.adslExtGroups = new AdslExtGroupsEnt(mib, this);
                this.adslExtCompliances = new AdslExtCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.adslExtGroups,
                    this.adslExtCompliances
                };
            }
            public static final class AdslExtGroupsEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                /** units of conformance*/
                public final AdslExtLineGroupEnt adslExtLineGroup;

                public final AdslExtAtucPhysPerfCounterGroupEnt adslExtAtucPhysPerfCounterGroup;

                public final AdslExtAturPhysPerfCounterGroupEnt adslExtAturPhysPerfCounterGroup;

                public final AdslExtLineConfProfileControlGroupEnt adslExtLineConfProfileControlGroup;

                public final AdslExtLineAlarmConfProfileGroupEnt adslExtLineAlarmConfProfileGroup;

                public final AdslExtNotificationsGroupEnt adslExtNotificationsGroup;

                private AdslExtGroupsEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslExtGroups", "1.3.6.1.2.1.10.94.3.2.1", false, false, false, false);
                    this.adslExtLineGroup = new AdslExtLineGroupEnt(mib, this);
                    this.adslExtAtucPhysPerfCounterGroup = new AdslExtAtucPhysPerfCounterGroupEnt(mib, this);
                    this.adslExtAturPhysPerfCounterGroup = new AdslExtAturPhysPerfCounterGroupEnt(mib, this);
                    this.adslExtLineConfProfileControlGroup = new AdslExtLineConfProfileControlGroupEnt(mib, this);
                    this.adslExtLineAlarmConfProfileGroup = new AdslExtLineAlarmConfProfileGroupEnt(mib, this);
                    this.adslExtNotificationsGroup = new AdslExtNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslExtLineGroup,
                        this.adslExtAtucPhysPerfCounterGroup,
                        this.adslExtAturPhysPerfCounterGroup,
                        this.adslExtLineConfProfileControlGroup,
                        this.adslExtLineAlarmConfProfileGroup,
                        this.adslExtNotificationsGroup
                    };
                }
                public static final class AdslExtLineGroupEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtLineGroupEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtLineGroup", "1.3.6.1.2.1.10.94.3.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AdslExtAtucPhysPerfCounterGroupEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtAtucPhysPerfCounterGroupEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtAtucPhysPerfCounterGroup", "1.3.6.1.2.1.10.94.3.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AdslExtAturPhysPerfCounterGroupEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtAturPhysPerfCounterGroupEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtAturPhysPerfCounterGroup", "1.3.6.1.2.1.10.94.3.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AdslExtLineConfProfileControlGroupEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtLineConfProfileControlGroupEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtLineConfProfileControlGroup", "1.3.6.1.2.1.10.94.3.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AdslExtLineAlarmConfProfileGroupEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtLineAlarmConfProfileGroupEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtLineAlarmConfProfileGroup", "1.3.6.1.2.1.10.94.3.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AdslExtNotificationsGroupEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtNotificationsGroupEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtNotificationsGroup", "1.3.6.1.2.1.10.94.3.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AdslExtCompliancesEnt extends MIBEntry<ADSLLINEEXTMIBDef>
            {
                /** ATU-C agent compliance statements*/
                public final AdslExtLineMibAtucComplianceEnt adslExtLineMibAtucCompliance;

                private AdslExtCompliancesEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                {
                    super(mib, parent, "adslExtCompliances", "1.3.6.1.2.1.10.94.3.2.2", false, false, false, false);
                    this.adslExtLineMibAtucCompliance = new AdslExtLineMibAtucComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslExtLineMibAtucCompliance
                    };
                }
                public static final class AdslExtLineMibAtucComplianceEnt extends MIBEntry<ADSLLINEEXTMIBDef>
                {
                    private AdslExtLineMibAtucComplianceEnt(ADSLLINEEXTMIBDef mib, MIBEntry<ADSLLINEEXTMIBDef> parent)
                    {
                        super(mib, parent, "adslExtLineMibAtucCompliance", "1.3.6.1.2.1.10.94.3.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
