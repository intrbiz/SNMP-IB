package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ADSLLINEMIBDef extends MIB
{
    public static final ADSLLINEMIBDef ADSLLINEMIB = new ADSLLINEMIBDef();

    public final AdslMIBEnt adslMIB;

    public final AdslAtucPerfLofsThreshTrapEnt adslAtucPerfLofsThreshTrap;

    public final AdslAtucPerfLossThreshTrapEnt adslAtucPerfLossThreshTrap;

    public final AdslAtucPerfLprsThreshTrapEnt adslAtucPerfLprsThreshTrap;

    public final AdslAtucPerfESsThreshTrapEnt adslAtucPerfESsThreshTrap;

    public final AdslAtucRateChangeTrapEnt adslAtucRateChangeTrap;

    public final AdslAtucPerfLolsThreshTrapEnt adslAtucPerfLolsThreshTrap;

    public final AdslAtucInitFailureTrapEnt adslAtucInitFailureTrap;

    public final AdslAturPerfLofsThreshTrapEnt adslAturPerfLofsThreshTrap;

    public final AdslAturPerfLossThreshTrapEnt adslAturPerfLossThreshTrap;

    public final AdslAturPerfLprsThreshTrapEnt adslAturPerfLprsThreshTrap;

    public final AdslAturPerfESsThreshTrapEnt adslAturPerfESsThreshTrap;

    public final AdslAturRateChangeTrapEnt adslAturRateChangeTrap;

    private ADSLLINEMIBDef()
    {
        super("ADSL-LINE-MIB");
        this.adslMIB = new AdslMIBEnt(this, null);
        this.adslAtucPerfLofsThreshTrap = new AdslAtucPerfLofsThreshTrapEnt(this, null);
        this.adslAtucPerfLossThreshTrap = new AdslAtucPerfLossThreshTrapEnt(this, null);
        this.adslAtucPerfLprsThreshTrap = new AdslAtucPerfLprsThreshTrapEnt(this, null);
        this.adslAtucPerfESsThreshTrap = new AdslAtucPerfESsThreshTrapEnt(this, null);
        this.adslAtucRateChangeTrap = new AdslAtucRateChangeTrapEnt(this, null);
        this.adslAtucPerfLolsThreshTrap = new AdslAtucPerfLolsThreshTrapEnt(this, null);
        this.adslAtucInitFailureTrap = new AdslAtucInitFailureTrapEnt(this, null);
        this.adslAturPerfLofsThreshTrap = new AdslAturPerfLofsThreshTrapEnt(this, null);
        this.adslAturPerfLossThreshTrap = new AdslAturPerfLossThreshTrapEnt(this, null);
        this.adslAturPerfLprsThreshTrap = new AdslAturPerfLprsThreshTrapEnt(this, null);
        this.adslAturPerfESsThreshTrap = new AdslAturPerfESsThreshTrapEnt(this, null);
        this.adslAturRateChangeTrap = new AdslAturRateChangeTrapEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.adslMIB,
            this.adslAtucPerfLofsThreshTrap,
            this.adslAtucPerfLossThreshTrap,
            this.adslAtucPerfLprsThreshTrap,
            this.adslAtucPerfESsThreshTrap,
            this.adslAtucRateChangeTrap,
            this.adslAtucPerfLolsThreshTrap,
            this.adslAtucInitFailureTrap,
            this.adslAturPerfLofsThreshTrap,
            this.adslAturPerfLossThreshTrap,
            this.adslAturPerfLprsThreshTrap,
            this.adslAturPerfESsThreshTrap,
            this.adslAturRateChangeTrap
        };
    }

    public static final class AdslMIBEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        public final AdslLineMibEnt adslLineMib;

        private AdslMIBEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslMIB", "1.3.6.1.2.1.10.94", false, false, false, false);
            this.adslLineMib = new AdslLineMibEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.adslLineMib
            };
        }
        public static final class AdslLineMibEnt extends MIBEntry<ADSLLINEMIBDef>
        {
            public final AdslMibObjectsEnt adslMibObjects;

            /** trap definitions*/
            public final AdslTrapsEnt adslTraps;

            /** no adslAturPerfLolsThreshTrap possible { 0 6 }
no adslAturInitFailureTrap possible { 0 7 }
conformance information*/
            public final AdslConformanceEnt adslConformance;

            private AdslLineMibEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
            {
                super(mib, parent, "adslLineMib", "1.3.6.1.2.1.10.94.1", false, false, false, false);
                this.adslMibObjects = new AdslMibObjectsEnt(mib, this);
                this.adslTraps = new AdslTrapsEnt(mib, this);
                this.adslConformance = new AdslConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.adslMibObjects,
                    this.adslTraps,
                    this.adslConformance
                };
            }
            public static final class AdslMibObjectsEnt extends MIBEntry<ADSLLINEMIBDef>
            {
                /** objects*/
                public final AdslLineTableEnt adslLineTable;

                public final AdslAtucPhysTableEnt adslAtucPhysTable;

                public final AdslAturPhysTableEnt adslAturPhysTable;

                public final AdslAtucChanTableEnt adslAtucChanTable;

                public final AdslAturChanTableEnt adslAturChanTable;

                public final AdslAtucPerfDataTableEnt adslAtucPerfDataTable;

                public final AdslAturPerfDataTableEnt adslAturPerfDataTable;

                public final AdslAtucIntervalTableEnt adslAtucIntervalTable;

                public final AdslAturIntervalTableEnt adslAturIntervalTable;

                public final AdslAtucChanPerfDataTableEnt adslAtucChanPerfDataTable;

                public final AdslAturChanPerfDataTableEnt adslAturChanPerfDataTable;

                public final AdslAtucChanIntervalTableEnt adslAtucChanIntervalTable;

                public final AdslAturChanIntervalTableEnt adslAturChanIntervalTable;

                /** Profile Group*/
                public final AdslLineConfProfileTableEnt adslLineConfProfileTable;

                public final AdslLineAlarmConfProfileTableEnt adslLineAlarmConfProfileTable;

                /** Line Code Specific Tables
These are place holders for the Line Code Specific MIBsonce they become available.*/
                public final AdslLCSMibEnt adslLCSMib;

                private AdslMibObjectsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                {
                    super(mib, parent, "adslMibObjects", "1.3.6.1.2.1.10.94.1.1", false, false, false, false);
                    this.adslLineTable = new AdslLineTableEnt(mib, this);
                    this.adslAtucPhysTable = new AdslAtucPhysTableEnt(mib, this);
                    this.adslAturPhysTable = new AdslAturPhysTableEnt(mib, this);
                    this.adslAtucChanTable = new AdslAtucChanTableEnt(mib, this);
                    this.adslAturChanTable = new AdslAturChanTableEnt(mib, this);
                    this.adslAtucPerfDataTable = new AdslAtucPerfDataTableEnt(mib, this);
                    this.adslAturPerfDataTable = new AdslAturPerfDataTableEnt(mib, this);
                    this.adslAtucIntervalTable = new AdslAtucIntervalTableEnt(mib, this);
                    this.adslAturIntervalTable = new AdslAturIntervalTableEnt(mib, this);
                    this.adslAtucChanPerfDataTable = new AdslAtucChanPerfDataTableEnt(mib, this);
                    this.adslAturChanPerfDataTable = new AdslAturChanPerfDataTableEnt(mib, this);
                    this.adslAtucChanIntervalTable = new AdslAtucChanIntervalTableEnt(mib, this);
                    this.adslAturChanIntervalTable = new AdslAturChanIntervalTableEnt(mib, this);
                    this.adslLineConfProfileTable = new AdslLineConfProfileTableEnt(mib, this);
                    this.adslLineAlarmConfProfileTable = new AdslLineAlarmConfProfileTableEnt(mib, this);
                    this.adslLCSMib = new AdslLCSMibEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslLineTable,
                        this.adslAtucPhysTable,
                        this.adslAturPhysTable,
                        this.adslAtucChanTable,
                        this.adslAturChanTable,
                        this.adslAtucPerfDataTable,
                        this.adslAturPerfDataTable,
                        this.adslAtucIntervalTable,
                        this.adslAturIntervalTable,
                        this.adslAtucChanPerfDataTable,
                        this.adslAturChanPerfDataTable,
                        this.adslAtucChanIntervalTable,
                        this.adslAturChanIntervalTable,
                        this.adslLineConfProfileTable,
                        this.adslLineAlarmConfProfileTable,
                        this.adslLCSMib
                    };
                }
                public static final class AdslLineTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslLineEntryEnt adslLineEntry;

                    private AdslLineTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslLineTable", "1.3.6.1.2.1.10.94.1.1.1", false, true, false, false);
                        this.adslLineEntry = new AdslLineEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslLineEntry
                        };
                    }
                    public static final class AdslLineEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslLineCodingEnt adslLineCoding;

                        public final AdslLineTypeEnt adslLineType;

                        public final AdslLineSpecificEnt adslLineSpecific;

                        public final AdslLineConfProfileEnt adslLineConfProfile;

                        public final AdslLineAlarmConfProfileEnt adslLineAlarmConfProfile;

                        private AdslLineEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineEntry", "1.3.6.1.2.1.10.94.1.1.1.1", false, false, false, true);
                            this.adslLineCoding = new AdslLineCodingEnt(mib, this);
                            this.adslLineType = new AdslLineTypeEnt(mib, this);
                            this.adslLineSpecific = new AdslLineSpecificEnt(mib, this);
                            this.adslLineConfProfile = new AdslLineConfProfileEnt(mib, this);
                            this.adslLineAlarmConfProfile = new AdslLineAlarmConfProfileEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslLineCoding,
                                this.adslLineType,
                                this.adslLineSpecific,
                                this.adslLineConfProfile,
                                this.adslLineAlarmConfProfile
                            };
                        }
                        public static final class AdslLineCodingEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineCodingEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineCoding", "1.3.6.1.2.1.10.94.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslLineTypeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineTypeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineType", "1.3.6.1.2.1.10.94.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslLineSpecificEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineSpecificEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineSpecific", "1.3.6.1.2.1.10.94.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslLineConfProfileEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineConfProfileEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineConfProfile", "1.3.6.1.2.1.10.94.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslLineAlarmConfProfileEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineAlarmConfProfileEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineAlarmConfProfile", "1.3.6.1.2.1.10.94.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAtucPhysTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAtucPhysEntryEnt adslAtucPhysEntry;

                    private AdslAtucPhysTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucPhysTable", "1.3.6.1.2.1.10.94.1.1.2", false, true, false, false);
                        this.adslAtucPhysEntry = new AdslAtucPhysEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucPhysEntry
                        };
                    }
                    public static final class AdslAtucPhysEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** inventory group
These items should describe the lowest level identifiablecomponent, be it a stand-alone modem, a card in a rack,a child-board, etc.*/
                        public final AdslAtucInvSerialNumberEnt adslAtucInvSerialNumber;

                        public final AdslAtucInvVendorIDEnt adslAtucInvVendorID;

                        public final AdslAtucInvVersionNumberEnt adslAtucInvVersionNumber;

                        /** current status group*/
                        public final AdslAtucCurrSnrMgnEnt adslAtucCurrSnrMgn;

                        public final AdslAtucCurrAtnEnt adslAtucCurrAtn;

                        public final AdslAtucCurrStatusEnt adslAtucCurrStatus;

                        public final AdslAtucCurrOutputPwrEnt adslAtucCurrOutputPwr;

                        public final AdslAtucCurrAttainableRateEnt adslAtucCurrAttainableRate;

                        private AdslAtucPhysEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPhysEntry", "1.3.6.1.2.1.10.94.1.1.2.1", false, false, false, true);
                            this.adslAtucInvSerialNumber = new AdslAtucInvSerialNumberEnt(mib, this);
                            this.adslAtucInvVendorID = new AdslAtucInvVendorIDEnt(mib, this);
                            this.adslAtucInvVersionNumber = new AdslAtucInvVersionNumberEnt(mib, this);
                            this.adslAtucCurrSnrMgn = new AdslAtucCurrSnrMgnEnt(mib, this);
                            this.adslAtucCurrAtn = new AdslAtucCurrAtnEnt(mib, this);
                            this.adslAtucCurrStatus = new AdslAtucCurrStatusEnt(mib, this);
                            this.adslAtucCurrOutputPwr = new AdslAtucCurrOutputPwrEnt(mib, this);
                            this.adslAtucCurrAttainableRate = new AdslAtucCurrAttainableRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucInvSerialNumber,
                                this.adslAtucInvVendorID,
                                this.adslAtucInvVersionNumber,
                                this.adslAtucCurrSnrMgn,
                                this.adslAtucCurrAtn,
                                this.adslAtucCurrStatus,
                                this.adslAtucCurrOutputPwr,
                                this.adslAtucCurrAttainableRate
                            };
                        }
                        public static final class AdslAtucInvSerialNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucInvSerialNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucInvSerialNumber", "1.3.6.1.2.1.10.94.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucInvVendorIDEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucInvVendorIDEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucInvVendorID", "1.3.6.1.2.1.10.94.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucInvVersionNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucInvVersionNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucInvVersionNumber", "1.3.6.1.2.1.10.94.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucCurrSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucCurrSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucCurrSnrMgn", "1.3.6.1.2.1.10.94.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucCurrAtnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucCurrAtnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucCurrAtn", "1.3.6.1.2.1.10.94.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucCurrStatusEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucCurrStatusEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucCurrStatus", "1.3.6.1.2.1.10.94.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucCurrOutputPwrEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucCurrOutputPwrEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucCurrOutputPwr", "1.3.6.1.2.1.10.94.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucCurrAttainableRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucCurrAttainableRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucCurrAttainableRate", "1.3.6.1.2.1.10.94.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAturPhysTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAturPhysEntryEnt adslAturPhysEntry;

                    private AdslAturPhysTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturPhysTable", "1.3.6.1.2.1.10.94.1.1.3", false, true, false, false);
                        this.adslAturPhysEntry = new AdslAturPhysEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturPhysEntry
                        };
                    }
                    public static final class AdslAturPhysEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** inventory group*/
                        public final AdslAturInvSerialNumberEnt adslAturInvSerialNumber;

                        public final AdslAturInvVendorIDEnt adslAturInvVendorID;

                        public final AdslAturInvVersionNumberEnt adslAturInvVersionNumber;

                        /** current status group*/
                        public final AdslAturCurrSnrMgnEnt adslAturCurrSnrMgn;

                        public final AdslAturCurrAtnEnt adslAturCurrAtn;

                        public final AdslAturCurrStatusEnt adslAturCurrStatus;

                        public final AdslAturCurrOutputPwrEnt adslAturCurrOutputPwr;

                        public final AdslAturCurrAttainableRateEnt adslAturCurrAttainableRate;

                        private AdslAturPhysEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPhysEntry", "1.3.6.1.2.1.10.94.1.1.3.1", false, false, false, true);
                            this.adslAturInvSerialNumber = new AdslAturInvSerialNumberEnt(mib, this);
                            this.adslAturInvVendorID = new AdslAturInvVendorIDEnt(mib, this);
                            this.adslAturInvVersionNumber = new AdslAturInvVersionNumberEnt(mib, this);
                            this.adslAturCurrSnrMgn = new AdslAturCurrSnrMgnEnt(mib, this);
                            this.adslAturCurrAtn = new AdslAturCurrAtnEnt(mib, this);
                            this.adslAturCurrStatus = new AdslAturCurrStatusEnt(mib, this);
                            this.adslAturCurrOutputPwr = new AdslAturCurrOutputPwrEnt(mib, this);
                            this.adslAturCurrAttainableRate = new AdslAturCurrAttainableRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturInvSerialNumber,
                                this.adslAturInvVendorID,
                                this.adslAturInvVersionNumber,
                                this.adslAturCurrSnrMgn,
                                this.adslAturCurrAtn,
                                this.adslAturCurrStatus,
                                this.adslAturCurrOutputPwr,
                                this.adslAturCurrAttainableRate
                            };
                        }
                        public static final class AdslAturInvSerialNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturInvSerialNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturInvSerialNumber", "1.3.6.1.2.1.10.94.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturInvVendorIDEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturInvVendorIDEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturInvVendorID", "1.3.6.1.2.1.10.94.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturInvVersionNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturInvVersionNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturInvVersionNumber", "1.3.6.1.2.1.10.94.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturCurrSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturCurrSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturCurrSnrMgn", "1.3.6.1.2.1.10.94.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturCurrAtnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturCurrAtnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturCurrAtn", "1.3.6.1.2.1.10.94.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturCurrStatusEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturCurrStatusEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturCurrStatus", "1.3.6.1.2.1.10.94.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturCurrOutputPwrEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturCurrOutputPwrEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturCurrOutputPwr", "1.3.6.1.2.1.10.94.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturCurrAttainableRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturCurrAttainableRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturCurrAttainableRate", "1.3.6.1.2.1.10.94.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAtucChanTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAtucChanEntryEnt adslAtucChanEntry;

                    private AdslAtucChanTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucChanTable", "1.3.6.1.2.1.10.94.1.1.4", false, true, false, false);
                        this.adslAtucChanEntry = new AdslAtucChanEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucChanEntry
                        };
                    }
                    public static final class AdslAtucChanEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** current group*/
                        public final AdslAtucChanInterleaveDelayEnt adslAtucChanInterleaveDelay;

                        public final AdslAtucChanCurrTxRateEnt adslAtucChanCurrTxRate;

                        public final AdslAtucChanPrevTxRateEnt adslAtucChanPrevTxRate;

                        public final AdslAtucChanCrcBlockLengthEnt adslAtucChanCrcBlockLength;

                        private AdslAtucChanEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucChanEntry", "1.3.6.1.2.1.10.94.1.1.4.1", false, false, false, true);
                            this.adslAtucChanInterleaveDelay = new AdslAtucChanInterleaveDelayEnt(mib, this);
                            this.adslAtucChanCurrTxRate = new AdslAtucChanCurrTxRateEnt(mib, this);
                            this.adslAtucChanPrevTxRate = new AdslAtucChanPrevTxRateEnt(mib, this);
                            this.adslAtucChanCrcBlockLength = new AdslAtucChanCrcBlockLengthEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucChanInterleaveDelay,
                                this.adslAtucChanCurrTxRate,
                                this.adslAtucChanPrevTxRate,
                                this.adslAtucChanCrcBlockLength
                            };
                        }
                        public static final class AdslAtucChanInterleaveDelayEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanInterleaveDelayEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanInterleaveDelay", "1.3.6.1.2.1.10.94.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanCurrTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanCurrTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanCurrTxRate", "1.3.6.1.2.1.10.94.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPrevTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPrevTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPrevTxRate", "1.3.6.1.2.1.10.94.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanCrcBlockLengthEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanCrcBlockLengthEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanCrcBlockLength", "1.3.6.1.2.1.10.94.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAturChanTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAturChanEntryEnt adslAturChanEntry;

                    private AdslAturChanTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturChanTable", "1.3.6.1.2.1.10.94.1.1.5", false, true, false, false);
                        this.adslAturChanEntry = new AdslAturChanEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturChanEntry
                        };
                    }
                    public static final class AdslAturChanEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** current group*/
                        public final AdslAturChanInterleaveDelayEnt adslAturChanInterleaveDelay;

                        public final AdslAturChanCurrTxRateEnt adslAturChanCurrTxRate;

                        public final AdslAturChanPrevTxRateEnt adslAturChanPrevTxRate;

                        public final AdslAturChanCrcBlockLengthEnt adslAturChanCrcBlockLength;

                        private AdslAturChanEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturChanEntry", "1.3.6.1.2.1.10.94.1.1.5.1", false, false, false, true);
                            this.adslAturChanInterleaveDelay = new AdslAturChanInterleaveDelayEnt(mib, this);
                            this.adslAturChanCurrTxRate = new AdslAturChanCurrTxRateEnt(mib, this);
                            this.adslAturChanPrevTxRate = new AdslAturChanPrevTxRateEnt(mib, this);
                            this.adslAturChanCrcBlockLength = new AdslAturChanCrcBlockLengthEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturChanInterleaveDelay,
                                this.adslAturChanCurrTxRate,
                                this.adslAturChanPrevTxRate,
                                this.adslAturChanCrcBlockLength
                            };
                        }
                        public static final class AdslAturChanInterleaveDelayEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanInterleaveDelayEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanInterleaveDelay", "1.3.6.1.2.1.10.94.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanCurrTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanCurrTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanCurrTxRate", "1.3.6.1.2.1.10.94.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPrevTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPrevTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPrevTxRate", "1.3.6.1.2.1.10.94.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanCrcBlockLengthEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanCrcBlockLengthEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanCrcBlockLength", "1.3.6.1.2.1.10.94.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAtucPerfDataTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAtucPerfDataEntryEnt adslAtucPerfDataEntry;

                    private AdslAtucPerfDataTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucPerfDataTable", "1.3.6.1.2.1.10.94.1.1.6", false, true, false, false);
                        this.adslAtucPerfDataEntry = new AdslAtucPerfDataEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucPerfDataEntry
                        };
                    }
                    public static final class AdslAtucPerfDataEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** Event CountersAlso see adslAtucIntervalTable for 15 minute intervalelapsed counters.*/
                        public final AdslAtucPerfLofsEnt adslAtucPerfLofs;

                        public final AdslAtucPerfLossEnt adslAtucPerfLoss;

                        public final AdslAtucPerfLolsEnt adslAtucPerfLols;

                        public final AdslAtucPerfLprsEnt adslAtucPerfLprs;

                        public final AdslAtucPerfESsEnt adslAtucPerfESs;

                        public final AdslAtucPerfInitsEnt adslAtucPerfInits;

                        /** general 15 min interval information*/
                        public final AdslAtucPerfValidIntervalsEnt adslAtucPerfValidIntervals;

                        public final AdslAtucPerfInvalidIntervalsEnt adslAtucPerfInvalidIntervals;

                        /** 15 min current performance group*/
                        public final AdslAtucPerfCurr15MinTimeElapsedEnt adslAtucPerfCurr15MinTimeElapsed;

                        public final AdslAtucPerfCurr15MinLofsEnt adslAtucPerfCurr15MinLofs;

                        public final AdslAtucPerfCurr15MinLossEnt adslAtucPerfCurr15MinLoss;

                        public final AdslAtucPerfCurr15MinLolsEnt adslAtucPerfCurr15MinLols;

                        public final AdslAtucPerfCurr15MinLprsEnt adslAtucPerfCurr15MinLprs;

                        public final AdslAtucPerfCurr15MinESsEnt adslAtucPerfCurr15MinESs;

                        public final AdslAtucPerfCurr15MinInitsEnt adslAtucPerfCurr15MinInits;

                        /** 1-day current and previous performance group*/
                        public final AdslAtucPerfCurr1DayTimeElapsedEnt adslAtucPerfCurr1DayTimeElapsed;

                        public final AdslAtucPerfCurr1DayLofsEnt adslAtucPerfCurr1DayLofs;

                        public final AdslAtucPerfCurr1DayLossEnt adslAtucPerfCurr1DayLoss;

                        public final AdslAtucPerfCurr1DayLolsEnt adslAtucPerfCurr1DayLols;

                        public final AdslAtucPerfCurr1DayLprsEnt adslAtucPerfCurr1DayLprs;

                        public final AdslAtucPerfCurr1DayESsEnt adslAtucPerfCurr1DayESs;

                        public final AdslAtucPerfCurr1DayInitsEnt adslAtucPerfCurr1DayInits;

                        public final AdslAtucPerfPrev1DayMoniSecsEnt adslAtucPerfPrev1DayMoniSecs;

                        public final AdslAtucPerfPrev1DayLofsEnt adslAtucPerfPrev1DayLofs;

                        public final AdslAtucPerfPrev1DayLossEnt adslAtucPerfPrev1DayLoss;

                        public final AdslAtucPerfPrev1DayLolsEnt adslAtucPerfPrev1DayLols;

                        public final AdslAtucPerfPrev1DayLprsEnt adslAtucPerfPrev1DayLprs;

                        public final AdslAtucPerfPrev1DayESsEnt adslAtucPerfPrev1DayESs;

                        public final AdslAtucPerfPrev1DayInitsEnt adslAtucPerfPrev1DayInits;

                        private AdslAtucPerfDataEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPerfDataEntry", "1.3.6.1.2.1.10.94.1.1.6.1", false, false, false, true);
                            this.adslAtucPerfLofs = new AdslAtucPerfLofsEnt(mib, this);
                            this.adslAtucPerfLoss = new AdslAtucPerfLossEnt(mib, this);
                            this.adslAtucPerfLols = new AdslAtucPerfLolsEnt(mib, this);
                            this.adslAtucPerfLprs = new AdslAtucPerfLprsEnt(mib, this);
                            this.adslAtucPerfESs = new AdslAtucPerfESsEnt(mib, this);
                            this.adslAtucPerfInits = new AdslAtucPerfInitsEnt(mib, this);
                            this.adslAtucPerfValidIntervals = new AdslAtucPerfValidIntervalsEnt(mib, this);
                            this.adslAtucPerfInvalidIntervals = new AdslAtucPerfInvalidIntervalsEnt(mib, this);
                            this.adslAtucPerfCurr15MinTimeElapsed = new AdslAtucPerfCurr15MinTimeElapsedEnt(mib, this);
                            this.adslAtucPerfCurr15MinLofs = new AdslAtucPerfCurr15MinLofsEnt(mib, this);
                            this.adslAtucPerfCurr15MinLoss = new AdslAtucPerfCurr15MinLossEnt(mib, this);
                            this.adslAtucPerfCurr15MinLols = new AdslAtucPerfCurr15MinLolsEnt(mib, this);
                            this.adslAtucPerfCurr15MinLprs = new AdslAtucPerfCurr15MinLprsEnt(mib, this);
                            this.adslAtucPerfCurr15MinESs = new AdslAtucPerfCurr15MinESsEnt(mib, this);
                            this.adslAtucPerfCurr15MinInits = new AdslAtucPerfCurr15MinInitsEnt(mib, this);
                            this.adslAtucPerfCurr1DayTimeElapsed = new AdslAtucPerfCurr1DayTimeElapsedEnt(mib, this);
                            this.adslAtucPerfCurr1DayLofs = new AdslAtucPerfCurr1DayLofsEnt(mib, this);
                            this.adslAtucPerfCurr1DayLoss = new AdslAtucPerfCurr1DayLossEnt(mib, this);
                            this.adslAtucPerfCurr1DayLols = new AdslAtucPerfCurr1DayLolsEnt(mib, this);
                            this.adslAtucPerfCurr1DayLprs = new AdslAtucPerfCurr1DayLprsEnt(mib, this);
                            this.adslAtucPerfCurr1DayESs = new AdslAtucPerfCurr1DayESsEnt(mib, this);
                            this.adslAtucPerfCurr1DayInits = new AdslAtucPerfCurr1DayInitsEnt(mib, this);
                            this.adslAtucPerfPrev1DayMoniSecs = new AdslAtucPerfPrev1DayMoniSecsEnt(mib, this);
                            this.adslAtucPerfPrev1DayLofs = new AdslAtucPerfPrev1DayLofsEnt(mib, this);
                            this.adslAtucPerfPrev1DayLoss = new AdslAtucPerfPrev1DayLossEnt(mib, this);
                            this.adslAtucPerfPrev1DayLols = new AdslAtucPerfPrev1DayLolsEnt(mib, this);
                            this.adslAtucPerfPrev1DayLprs = new AdslAtucPerfPrev1DayLprsEnt(mib, this);
                            this.adslAtucPerfPrev1DayESs = new AdslAtucPerfPrev1DayESsEnt(mib, this);
                            this.adslAtucPerfPrev1DayInits = new AdslAtucPerfPrev1DayInitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucPerfLofs,
                                this.adslAtucPerfLoss,
                                this.adslAtucPerfLols,
                                this.adslAtucPerfLprs,
                                this.adslAtucPerfESs,
                                this.adslAtucPerfInits,
                                this.adslAtucPerfValidIntervals,
                                this.adslAtucPerfInvalidIntervals,
                                this.adslAtucPerfCurr15MinTimeElapsed,
                                this.adslAtucPerfCurr15MinLofs,
                                this.adslAtucPerfCurr15MinLoss,
                                this.adslAtucPerfCurr15MinLols,
                                this.adslAtucPerfCurr15MinLprs,
                                this.adslAtucPerfCurr15MinESs,
                                this.adslAtucPerfCurr15MinInits,
                                this.adslAtucPerfCurr1DayTimeElapsed,
                                this.adslAtucPerfCurr1DayLofs,
                                this.adslAtucPerfCurr1DayLoss,
                                this.adslAtucPerfCurr1DayLols,
                                this.adslAtucPerfCurr1DayLprs,
                                this.adslAtucPerfCurr1DayESs,
                                this.adslAtucPerfCurr1DayInits,
                                this.adslAtucPerfPrev1DayMoniSecs,
                                this.adslAtucPerfPrev1DayLofs,
                                this.adslAtucPerfPrev1DayLoss,
                                this.adslAtucPerfPrev1DayLols,
                                this.adslAtucPerfPrev1DayLprs,
                                this.adslAtucPerfPrev1DayESs,
                                this.adslAtucPerfPrev1DayInits
                            };
                        }
                        public static final class AdslAtucPerfLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfLofs", "1.3.6.1.2.1.10.94.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfLoss", "1.3.6.1.2.1.10.94.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfLolsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfLolsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfLols", "1.3.6.1.2.1.10.94.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfLprs", "1.3.6.1.2.1.10.94.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfESs", "1.3.6.1.2.1.10.94.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfInitsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfInitsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfInits", "1.3.6.1.2.1.10.94.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfValidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfValidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfValidIntervals", "1.3.6.1.2.1.10.94.1.1.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfInvalidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfInvalidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfInvalidIntervals", "1.3.6.1.2.1.10.94.1.1.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinTimeElapsed", "1.3.6.1.2.1.10.94.1.1.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinLofs", "1.3.6.1.2.1.10.94.1.1.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinLoss", "1.3.6.1.2.1.10.94.1.1.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinLolsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinLolsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinLols", "1.3.6.1.2.1.10.94.1.1.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinLprs", "1.3.6.1.2.1.10.94.1.1.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinESs", "1.3.6.1.2.1.10.94.1.1.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr15MinInitsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr15MinInitsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr15MinInits", "1.3.6.1.2.1.10.94.1.1.6.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayTimeElapsed", "1.3.6.1.2.1.10.94.1.1.6.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayLofs", "1.3.6.1.2.1.10.94.1.1.6.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayLoss", "1.3.6.1.2.1.10.94.1.1.6.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayLolsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayLolsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayLols", "1.3.6.1.2.1.10.94.1.1.6.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayLprs", "1.3.6.1.2.1.10.94.1.1.6.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayESs", "1.3.6.1.2.1.10.94.1.1.6.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfCurr1DayInitsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfCurr1DayInitsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfCurr1DayInits", "1.3.6.1.2.1.10.94.1.1.6.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayMoniSecsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayMoniSecsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayMoniSecs", "1.3.6.1.2.1.10.94.1.1.6.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayLofs", "1.3.6.1.2.1.10.94.1.1.6.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayLoss", "1.3.6.1.2.1.10.94.1.1.6.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayLolsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayLolsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayLols", "1.3.6.1.2.1.10.94.1.1.6.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayLprs", "1.3.6.1.2.1.10.94.1.1.6.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayESs", "1.3.6.1.2.1.10.94.1.1.6.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucPerfPrev1DayInitsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucPerfPrev1DayInitsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucPerfPrev1DayInits", "1.3.6.1.2.1.10.94.1.1.6.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAturPerfDataTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAturPerfDataEntryEnt adslAturPerfDataEntry;

                    private AdslAturPerfDataTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturPerfDataTable", "1.3.6.1.2.1.10.94.1.1.7", false, true, false, false);
                        this.adslAturPerfDataEntry = new AdslAturPerfDataEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturPerfDataEntry
                        };
                    }
                    public static final class AdslAturPerfDataEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** Event (Raw) CountersAlso see adslAturIntervalTable for 15 minute intervalelapsed counters.*/
                        public final AdslAturPerfLofsEnt adslAturPerfLofs;

                        public final AdslAturPerfLossEnt adslAturPerfLoss;

                        public final AdslAturPerfLprsEnt adslAturPerfLprs;

                        public final AdslAturPerfESsEnt adslAturPerfESs;

                        /** general 15 min interval information*/
                        public final AdslAturPerfValidIntervalsEnt adslAturPerfValidIntervals;

                        public final AdslAturPerfInvalidIntervalsEnt adslAturPerfInvalidIntervals;

                        /** 15 min current performance group*/
                        public final AdslAturPerfCurr15MinTimeElapsedEnt adslAturPerfCurr15MinTimeElapsed;

                        public final AdslAturPerfCurr15MinLofsEnt adslAturPerfCurr15MinLofs;

                        public final AdslAturPerfCurr15MinLossEnt adslAturPerfCurr15MinLoss;

                        public final AdslAturPerfCurr15MinLprsEnt adslAturPerfCurr15MinLprs;

                        public final AdslAturPerfCurr15MinESsEnt adslAturPerfCurr15MinESs;

                        /** 1-day current and previous performance group*/
                        public final AdslAturPerfCurr1DayTimeElapsedEnt adslAturPerfCurr1DayTimeElapsed;

                        public final AdslAturPerfCurr1DayLofsEnt adslAturPerfCurr1DayLofs;

                        public final AdslAturPerfCurr1DayLossEnt adslAturPerfCurr1DayLoss;

                        public final AdslAturPerfCurr1DayLprsEnt adslAturPerfCurr1DayLprs;

                        public final AdslAturPerfCurr1DayESsEnt adslAturPerfCurr1DayESs;

                        public final AdslAturPerfPrev1DayMoniSecsEnt adslAturPerfPrev1DayMoniSecs;

                        public final AdslAturPerfPrev1DayLofsEnt adslAturPerfPrev1DayLofs;

                        public final AdslAturPerfPrev1DayLossEnt adslAturPerfPrev1DayLoss;

                        public final AdslAturPerfPrev1DayLprsEnt adslAturPerfPrev1DayLprs;

                        public final AdslAturPerfPrev1DayESsEnt adslAturPerfPrev1DayESs;

                        private AdslAturPerfDataEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPerfDataEntry", "1.3.6.1.2.1.10.94.1.1.7.1", false, false, false, true);
                            this.adslAturPerfLofs = new AdslAturPerfLofsEnt(mib, this);
                            this.adslAturPerfLoss = new AdslAturPerfLossEnt(mib, this);
                            this.adslAturPerfLprs = new AdslAturPerfLprsEnt(mib, this);
                            this.adslAturPerfESs = new AdslAturPerfESsEnt(mib, this);
                            this.adslAturPerfValidIntervals = new AdslAturPerfValidIntervalsEnt(mib, this);
                            this.adslAturPerfInvalidIntervals = new AdslAturPerfInvalidIntervalsEnt(mib, this);
                            this.adslAturPerfCurr15MinTimeElapsed = new AdslAturPerfCurr15MinTimeElapsedEnt(mib, this);
                            this.adslAturPerfCurr15MinLofs = new AdslAturPerfCurr15MinLofsEnt(mib, this);
                            this.adslAturPerfCurr15MinLoss = new AdslAturPerfCurr15MinLossEnt(mib, this);
                            this.adslAturPerfCurr15MinLprs = new AdslAturPerfCurr15MinLprsEnt(mib, this);
                            this.adslAturPerfCurr15MinESs = new AdslAturPerfCurr15MinESsEnt(mib, this);
                            this.adslAturPerfCurr1DayTimeElapsed = new AdslAturPerfCurr1DayTimeElapsedEnt(mib, this);
                            this.adslAturPerfCurr1DayLofs = new AdslAturPerfCurr1DayLofsEnt(mib, this);
                            this.adslAturPerfCurr1DayLoss = new AdslAturPerfCurr1DayLossEnt(mib, this);
                            this.adslAturPerfCurr1DayLprs = new AdslAturPerfCurr1DayLprsEnt(mib, this);
                            this.adslAturPerfCurr1DayESs = new AdslAturPerfCurr1DayESsEnt(mib, this);
                            this.adslAturPerfPrev1DayMoniSecs = new AdslAturPerfPrev1DayMoniSecsEnt(mib, this);
                            this.adslAturPerfPrev1DayLofs = new AdslAturPerfPrev1DayLofsEnt(mib, this);
                            this.adslAturPerfPrev1DayLoss = new AdslAturPerfPrev1DayLossEnt(mib, this);
                            this.adslAturPerfPrev1DayLprs = new AdslAturPerfPrev1DayLprsEnt(mib, this);
                            this.adslAturPerfPrev1DayESs = new AdslAturPerfPrev1DayESsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturPerfLofs,
                                this.adslAturPerfLoss,
                                this.adslAturPerfLprs,
                                this.adslAturPerfESs,
                                this.adslAturPerfValidIntervals,
                                this.adslAturPerfInvalidIntervals,
                                this.adslAturPerfCurr15MinTimeElapsed,
                                this.adslAturPerfCurr15MinLofs,
                                this.adslAturPerfCurr15MinLoss,
                                this.adslAturPerfCurr15MinLprs,
                                this.adslAturPerfCurr15MinESs,
                                this.adslAturPerfCurr1DayTimeElapsed,
                                this.adslAturPerfCurr1DayLofs,
                                this.adslAturPerfCurr1DayLoss,
                                this.adslAturPerfCurr1DayLprs,
                                this.adslAturPerfCurr1DayESs,
                                this.adslAturPerfPrev1DayMoniSecs,
                                this.adslAturPerfPrev1DayLofs,
                                this.adslAturPerfPrev1DayLoss,
                                this.adslAturPerfPrev1DayLprs,
                                this.adslAturPerfPrev1DayESs
                            };
                        }
                        public static final class AdslAturPerfLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfLofs", "1.3.6.1.2.1.10.94.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfLoss", "1.3.6.1.2.1.10.94.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfLprs", "1.3.6.1.2.1.10.94.1.1.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfESs", "1.3.6.1.2.1.10.94.1.1.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfValidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfValidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfValidIntervals", "1.3.6.1.2.1.10.94.1.1.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfInvalidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfInvalidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfInvalidIntervals", "1.3.6.1.2.1.10.94.1.1.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr15MinTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr15MinTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr15MinTimeElapsed", "1.3.6.1.2.1.10.94.1.1.7.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr15MinLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr15MinLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr15MinLofs", "1.3.6.1.2.1.10.94.1.1.7.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr15MinLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr15MinLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr15MinLoss", "1.3.6.1.2.1.10.94.1.1.7.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr15MinLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr15MinLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr15MinLprs", "1.3.6.1.2.1.10.94.1.1.7.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr15MinESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr15MinESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr15MinESs", "1.3.6.1.2.1.10.94.1.1.7.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr1DayTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr1DayTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr1DayTimeElapsed", "1.3.6.1.2.1.10.94.1.1.7.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr1DayLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr1DayLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr1DayLofs", "1.3.6.1.2.1.10.94.1.1.7.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr1DayLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr1DayLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr1DayLoss", "1.3.6.1.2.1.10.94.1.1.7.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr1DayLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr1DayLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr1DayLprs", "1.3.6.1.2.1.10.94.1.1.7.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfCurr1DayESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfCurr1DayESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfCurr1DayESs", "1.3.6.1.2.1.10.94.1.1.7.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfPrev1DayMoniSecsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfPrev1DayMoniSecsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfPrev1DayMoniSecs", "1.3.6.1.2.1.10.94.1.1.7.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfPrev1DayLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfPrev1DayLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfPrev1DayLofs", "1.3.6.1.2.1.10.94.1.1.7.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfPrev1DayLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfPrev1DayLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfPrev1DayLoss", "1.3.6.1.2.1.10.94.1.1.7.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfPrev1DayLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfPrev1DayLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfPrev1DayLprs", "1.3.6.1.2.1.10.94.1.1.7.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturPerfPrev1DayESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturPerfPrev1DayESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturPerfPrev1DayESs", "1.3.6.1.2.1.10.94.1.1.7.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAtucIntervalTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAtucIntervalEntryEnt adslAtucIntervalEntry;

                    private AdslAtucIntervalTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucIntervalTable", "1.3.6.1.2.1.10.94.1.1.8", false, true, false, false);
                        this.adslAtucIntervalEntry = new AdslAtucIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucIntervalEntry
                        };
                    }
                    public static final class AdslAtucIntervalEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslAtucIntervalNumberEnt adslAtucIntervalNumber;

                        public final AdslAtucIntervalLofsEnt adslAtucIntervalLofs;

                        public final AdslAtucIntervalLossEnt adslAtucIntervalLoss;

                        public final AdslAtucIntervalLolsEnt adslAtucIntervalLols;

                        public final AdslAtucIntervalLprsEnt adslAtucIntervalLprs;

                        public final AdslAtucIntervalESsEnt adslAtucIntervalESs;

                        public final AdslAtucIntervalInitsEnt adslAtucIntervalInits;

                        public final AdslAtucIntervalValidDataEnt adslAtucIntervalValidData;

                        private AdslAtucIntervalEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucIntervalEntry", "1.3.6.1.2.1.10.94.1.1.8.1", false, false, false, true);
                            this.adslAtucIntervalNumber = new AdslAtucIntervalNumberEnt(mib, this);
                            this.adslAtucIntervalLofs = new AdslAtucIntervalLofsEnt(mib, this);
                            this.adslAtucIntervalLoss = new AdslAtucIntervalLossEnt(mib, this);
                            this.adslAtucIntervalLols = new AdslAtucIntervalLolsEnt(mib, this);
                            this.adslAtucIntervalLprs = new AdslAtucIntervalLprsEnt(mib, this);
                            this.adslAtucIntervalESs = new AdslAtucIntervalESsEnt(mib, this);
                            this.adslAtucIntervalInits = new AdslAtucIntervalInitsEnt(mib, this);
                            this.adslAtucIntervalValidData = new AdslAtucIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucIntervalNumber,
                                this.adslAtucIntervalLofs,
                                this.adslAtucIntervalLoss,
                                this.adslAtucIntervalLols,
                                this.adslAtucIntervalLprs,
                                this.adslAtucIntervalESs,
                                this.adslAtucIntervalInits,
                                this.adslAtucIntervalValidData
                            };
                        }
                        public static final class AdslAtucIntervalNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalNumber", "1.3.6.1.2.1.10.94.1.1.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalLofs", "1.3.6.1.2.1.10.94.1.1.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalLoss", "1.3.6.1.2.1.10.94.1.1.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalLolsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalLolsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalLols", "1.3.6.1.2.1.10.94.1.1.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalLprs", "1.3.6.1.2.1.10.94.1.1.8.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalESs", "1.3.6.1.2.1.10.94.1.1.8.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalInitsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalInitsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalInits", "1.3.6.1.2.1.10.94.1.1.8.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucIntervalValidDataEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucIntervalValidDataEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucIntervalValidData", "1.3.6.1.2.1.10.94.1.1.8.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAturIntervalTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAturIntervalEntryEnt adslAturIntervalEntry;

                    private AdslAturIntervalTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturIntervalTable", "1.3.6.1.2.1.10.94.1.1.9", false, true, false, false);
                        this.adslAturIntervalEntry = new AdslAturIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturIntervalEntry
                        };
                    }
                    public static final class AdslAturIntervalEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslAturIntervalNumberEnt adslAturIntervalNumber;

                        public final AdslAturIntervalLofsEnt adslAturIntervalLofs;

                        public final AdslAturIntervalLossEnt adslAturIntervalLoss;

                        public final AdslAturIntervalLprsEnt adslAturIntervalLprs;

                        public final AdslAturIntervalESsEnt adslAturIntervalESs;

                        public final AdslAturIntervalValidDataEnt adslAturIntervalValidData;

                        private AdslAturIntervalEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturIntervalEntry", "1.3.6.1.2.1.10.94.1.1.9.1", false, false, false, true);
                            this.adslAturIntervalNumber = new AdslAturIntervalNumberEnt(mib, this);
                            this.adslAturIntervalLofs = new AdslAturIntervalLofsEnt(mib, this);
                            this.adslAturIntervalLoss = new AdslAturIntervalLossEnt(mib, this);
                            this.adslAturIntervalLprs = new AdslAturIntervalLprsEnt(mib, this);
                            this.adslAturIntervalESs = new AdslAturIntervalESsEnt(mib, this);
                            this.adslAturIntervalValidData = new AdslAturIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturIntervalNumber,
                                this.adslAturIntervalLofs,
                                this.adslAturIntervalLoss,
                                this.adslAturIntervalLprs,
                                this.adslAturIntervalESs,
                                this.adslAturIntervalValidData
                            };
                        }
                        public static final class AdslAturIntervalNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturIntervalNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturIntervalNumber", "1.3.6.1.2.1.10.94.1.1.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturIntervalLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturIntervalLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturIntervalLofs", "1.3.6.1.2.1.10.94.1.1.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturIntervalLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturIntervalLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturIntervalLoss", "1.3.6.1.2.1.10.94.1.1.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturIntervalLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturIntervalLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturIntervalLprs", "1.3.6.1.2.1.10.94.1.1.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturIntervalESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturIntervalESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturIntervalESs", "1.3.6.1.2.1.10.94.1.1.9.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturIntervalValidDataEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturIntervalValidDataEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturIntervalValidData", "1.3.6.1.2.1.10.94.1.1.9.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAtucChanPerfDataTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAtucChanPerfDataEntryEnt adslAtucChanPerfDataEntry;

                    private AdslAtucChanPerfDataTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucChanPerfDataTable", "1.3.6.1.2.1.10.94.1.1.10", false, true, false, false);
                        this.adslAtucChanPerfDataEntry = new AdslAtucChanPerfDataEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucChanPerfDataEntry
                        };
                    }
                    public static final class AdslAtucChanPerfDataEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** performance group
Note: block is intended to be the length of the channeldata-block on which the CRC operates. SeeadslAtucChanCrcBlockLength for more information.*/
                        public final AdslAtucChanReceivedBlksEnt adslAtucChanReceivedBlks;

                        public final AdslAtucChanTransmittedBlksEnt adslAtucChanTransmittedBlks;

                        public final AdslAtucChanCorrectedBlksEnt adslAtucChanCorrectedBlks;

                        public final AdslAtucChanUncorrectBlksEnt adslAtucChanUncorrectBlks;

                        /** general 15 min interval information*/
                        public final AdslAtucChanPerfValidIntervalsEnt adslAtucChanPerfValidIntervals;

                        public final AdslAtucChanPerfInvalidIntervalsEnt adslAtucChanPerfInvalidIntervals;

                        /** 15 min current performance group*/
                        public final AdslAtucChanPerfCurr15MinTimeElapsedEnt adslAtucChanPerfCurr15MinTimeElapsed;

                        public final AdslAtucChanPerfCurr15MinReceivedBlksEnt adslAtucChanPerfCurr15MinReceivedBlks;

                        public final AdslAtucChanPerfCurr15MinTransmittedBlksEnt adslAtucChanPerfCurr15MinTransmittedBlks;

                        public final AdslAtucChanPerfCurr15MinCorrectedBlksEnt adslAtucChanPerfCurr15MinCorrectedBlks;

                        public final AdslAtucChanPerfCurr15MinUncorrectBlksEnt adslAtucChanPerfCurr15MinUncorrectBlks;

                        /** 1-day current and previous performance group*/
                        public final AdslAtucChanPerfCurr1DayTimeElapsedEnt adslAtucChanPerfCurr1DayTimeElapsed;

                        public final AdslAtucChanPerfCurr1DayReceivedBlksEnt adslAtucChanPerfCurr1DayReceivedBlks;

                        public final AdslAtucChanPerfCurr1DayTransmittedBlksEnt adslAtucChanPerfCurr1DayTransmittedBlks;

                        public final AdslAtucChanPerfCurr1DayCorrectedBlksEnt adslAtucChanPerfCurr1DayCorrectedBlks;

                        public final AdslAtucChanPerfCurr1DayUncorrectBlksEnt adslAtucChanPerfCurr1DayUncorrectBlks;

                        public final AdslAtucChanPerfPrev1DayMoniSecsEnt adslAtucChanPerfPrev1DayMoniSecs;

                        public final AdslAtucChanPerfPrev1DayReceivedBlksEnt adslAtucChanPerfPrev1DayReceivedBlks;

                        public final AdslAtucChanPerfPrev1DayTransmittedBlksEnt adslAtucChanPerfPrev1DayTransmittedBlks;

                        public final AdslAtucChanPerfPrev1DayCorrectedBlksEnt adslAtucChanPerfPrev1DayCorrectedBlks;

                        public final AdslAtucChanPerfPrev1DayUncorrectBlksEnt adslAtucChanPerfPrev1DayUncorrectBlks;

                        private AdslAtucChanPerfDataEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucChanPerfDataEntry", "1.3.6.1.2.1.10.94.1.1.10.1", false, false, false, true);
                            this.adslAtucChanReceivedBlks = new AdslAtucChanReceivedBlksEnt(mib, this);
                            this.adslAtucChanTransmittedBlks = new AdslAtucChanTransmittedBlksEnt(mib, this);
                            this.adslAtucChanCorrectedBlks = new AdslAtucChanCorrectedBlksEnt(mib, this);
                            this.adslAtucChanUncorrectBlks = new AdslAtucChanUncorrectBlksEnt(mib, this);
                            this.adslAtucChanPerfValidIntervals = new AdslAtucChanPerfValidIntervalsEnt(mib, this);
                            this.adslAtucChanPerfInvalidIntervals = new AdslAtucChanPerfInvalidIntervalsEnt(mib, this);
                            this.adslAtucChanPerfCurr15MinTimeElapsed = new AdslAtucChanPerfCurr15MinTimeElapsedEnt(mib, this);
                            this.adslAtucChanPerfCurr15MinReceivedBlks = new AdslAtucChanPerfCurr15MinReceivedBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr15MinTransmittedBlks = new AdslAtucChanPerfCurr15MinTransmittedBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr15MinCorrectedBlks = new AdslAtucChanPerfCurr15MinCorrectedBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr15MinUncorrectBlks = new AdslAtucChanPerfCurr15MinUncorrectBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr1DayTimeElapsed = new AdslAtucChanPerfCurr1DayTimeElapsedEnt(mib, this);
                            this.adslAtucChanPerfCurr1DayReceivedBlks = new AdslAtucChanPerfCurr1DayReceivedBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr1DayTransmittedBlks = new AdslAtucChanPerfCurr1DayTransmittedBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr1DayCorrectedBlks = new AdslAtucChanPerfCurr1DayCorrectedBlksEnt(mib, this);
                            this.adslAtucChanPerfCurr1DayUncorrectBlks = new AdslAtucChanPerfCurr1DayUncorrectBlksEnt(mib, this);
                            this.adslAtucChanPerfPrev1DayMoniSecs = new AdslAtucChanPerfPrev1DayMoniSecsEnt(mib, this);
                            this.adslAtucChanPerfPrev1DayReceivedBlks = new AdslAtucChanPerfPrev1DayReceivedBlksEnt(mib, this);
                            this.adslAtucChanPerfPrev1DayTransmittedBlks = new AdslAtucChanPerfPrev1DayTransmittedBlksEnt(mib, this);
                            this.adslAtucChanPerfPrev1DayCorrectedBlks = new AdslAtucChanPerfPrev1DayCorrectedBlksEnt(mib, this);
                            this.adslAtucChanPerfPrev1DayUncorrectBlks = new AdslAtucChanPerfPrev1DayUncorrectBlksEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucChanReceivedBlks,
                                this.adslAtucChanTransmittedBlks,
                                this.adslAtucChanCorrectedBlks,
                                this.adslAtucChanUncorrectBlks,
                                this.adslAtucChanPerfValidIntervals,
                                this.adslAtucChanPerfInvalidIntervals,
                                this.adslAtucChanPerfCurr15MinTimeElapsed,
                                this.adslAtucChanPerfCurr15MinReceivedBlks,
                                this.adslAtucChanPerfCurr15MinTransmittedBlks,
                                this.adslAtucChanPerfCurr15MinCorrectedBlks,
                                this.adslAtucChanPerfCurr15MinUncorrectBlks,
                                this.adslAtucChanPerfCurr1DayTimeElapsed,
                                this.adslAtucChanPerfCurr1DayReceivedBlks,
                                this.adslAtucChanPerfCurr1DayTransmittedBlks,
                                this.adslAtucChanPerfCurr1DayCorrectedBlks,
                                this.adslAtucChanPerfCurr1DayUncorrectBlks,
                                this.adslAtucChanPerfPrev1DayMoniSecs,
                                this.adslAtucChanPerfPrev1DayReceivedBlks,
                                this.adslAtucChanPerfPrev1DayTransmittedBlks,
                                this.adslAtucChanPerfPrev1DayCorrectedBlks,
                                this.adslAtucChanPerfPrev1DayUncorrectBlks
                            };
                        }
                        public static final class AdslAtucChanReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanReceivedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.10.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfValidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfValidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfValidIntervals", "1.3.6.1.2.1.10.94.1.1.10.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfInvalidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfInvalidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfInvalidIntervals", "1.3.6.1.2.1.10.94.1.1.10.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr15MinTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr15MinTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr15MinTimeElapsed", "1.3.6.1.2.1.10.94.1.1.10.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr15MinReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr15MinReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr15MinReceivedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr15MinTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr15MinTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr15MinTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr15MinCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr15MinCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr15MinCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr15MinUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr15MinUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr15MinUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.10.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr1DayTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr1DayTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr1DayTimeElapsed", "1.3.6.1.2.1.10.94.1.1.10.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr1DayReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr1DayReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr1DayReceivedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr1DayTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr1DayTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr1DayTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr1DayCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr1DayCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr1DayCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfCurr1DayUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfCurr1DayUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfCurr1DayUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.10.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfPrev1DayMoniSecsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfPrev1DayMoniSecsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfPrev1DayMoniSecs", "1.3.6.1.2.1.10.94.1.1.10.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfPrev1DayReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfPrev1DayReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfPrev1DayReceivedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfPrev1DayTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfPrev1DayTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfPrev1DayTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfPrev1DayCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfPrev1DayCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfPrev1DayCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.10.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanPerfPrev1DayUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanPerfPrev1DayUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanPerfPrev1DayUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.10.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAturChanPerfDataTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAturChanPerfDataEntryEnt adslAturChanPerfDataEntry;

                    private AdslAturChanPerfDataTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturChanPerfDataTable", "1.3.6.1.2.1.10.94.1.1.11", false, true, false, false);
                        this.adslAturChanPerfDataEntry = new AdslAturChanPerfDataEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturChanPerfDataEntry
                        };
                    }
                    public static final class AdslAturChanPerfDataEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        /** performance groupNote: block is intended to be the length of the channeldata-block on which the CRC operates. SeeadslAturChanCrcBlockLength for more information.*/
                        public final AdslAturChanReceivedBlksEnt adslAturChanReceivedBlks;

                        public final AdslAturChanTransmittedBlksEnt adslAturChanTransmittedBlks;

                        public final AdslAturChanCorrectedBlksEnt adslAturChanCorrectedBlks;

                        public final AdslAturChanUncorrectBlksEnt adslAturChanUncorrectBlks;

                        /** general 15 min interval information*/
                        public final AdslAturChanPerfValidIntervalsEnt adslAturChanPerfValidIntervals;

                        public final AdslAturChanPerfInvalidIntervalsEnt adslAturChanPerfInvalidIntervals;

                        /** 15 min current performance group*/
                        public final AdslAturChanPerfCurr15MinTimeElapsedEnt adslAturChanPerfCurr15MinTimeElapsed;

                        public final AdslAturChanPerfCurr15MinReceivedBlksEnt adslAturChanPerfCurr15MinReceivedBlks;

                        public final AdslAturChanPerfCurr15MinTransmittedBlksEnt adslAturChanPerfCurr15MinTransmittedBlks;

                        public final AdslAturChanPerfCurr15MinCorrectedBlksEnt adslAturChanPerfCurr15MinCorrectedBlks;

                        public final AdslAturChanPerfCurr15MinUncorrectBlksEnt adslAturChanPerfCurr15MinUncorrectBlks;

                        /** 1-day current and previous performance group*/
                        public final AdslAturChanPerfCurr1DayTimeElapsedEnt adslAturChanPerfCurr1DayTimeElapsed;

                        public final AdslAturChanPerfCurr1DayReceivedBlksEnt adslAturChanPerfCurr1DayReceivedBlks;

                        public final AdslAturChanPerfCurr1DayTransmittedBlksEnt adslAturChanPerfCurr1DayTransmittedBlks;

                        public final AdslAturChanPerfCurr1DayCorrectedBlksEnt adslAturChanPerfCurr1DayCorrectedBlks;

                        public final AdslAturChanPerfCurr1DayUncorrectBlksEnt adslAturChanPerfCurr1DayUncorrectBlks;

                        public final AdslAturChanPerfPrev1DayMoniSecsEnt adslAturChanPerfPrev1DayMoniSecs;

                        public final AdslAturChanPerfPrev1DayReceivedBlksEnt adslAturChanPerfPrev1DayReceivedBlks;

                        public final AdslAturChanPerfPrev1DayTransmittedBlksEnt adslAturChanPerfPrev1DayTransmittedBlks;

                        public final AdslAturChanPerfPrev1DayCorrectedBlksEnt adslAturChanPerfPrev1DayCorrectedBlks;

                        public final AdslAturChanPerfPrev1DayUncorrectBlksEnt adslAturChanPerfPrev1DayUncorrectBlks;

                        private AdslAturChanPerfDataEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturChanPerfDataEntry", "1.3.6.1.2.1.10.94.1.1.11.1", false, false, false, true);
                            this.adslAturChanReceivedBlks = new AdslAturChanReceivedBlksEnt(mib, this);
                            this.adslAturChanTransmittedBlks = new AdslAturChanTransmittedBlksEnt(mib, this);
                            this.adslAturChanCorrectedBlks = new AdslAturChanCorrectedBlksEnt(mib, this);
                            this.adslAturChanUncorrectBlks = new AdslAturChanUncorrectBlksEnt(mib, this);
                            this.adslAturChanPerfValidIntervals = new AdslAturChanPerfValidIntervalsEnt(mib, this);
                            this.adslAturChanPerfInvalidIntervals = new AdslAturChanPerfInvalidIntervalsEnt(mib, this);
                            this.adslAturChanPerfCurr15MinTimeElapsed = new AdslAturChanPerfCurr15MinTimeElapsedEnt(mib, this);
                            this.adslAturChanPerfCurr15MinReceivedBlks = new AdslAturChanPerfCurr15MinReceivedBlksEnt(mib, this);
                            this.adslAturChanPerfCurr15MinTransmittedBlks = new AdslAturChanPerfCurr15MinTransmittedBlksEnt(mib, this);
                            this.adslAturChanPerfCurr15MinCorrectedBlks = new AdslAturChanPerfCurr15MinCorrectedBlksEnt(mib, this);
                            this.adslAturChanPerfCurr15MinUncorrectBlks = new AdslAturChanPerfCurr15MinUncorrectBlksEnt(mib, this);
                            this.adslAturChanPerfCurr1DayTimeElapsed = new AdslAturChanPerfCurr1DayTimeElapsedEnt(mib, this);
                            this.adslAturChanPerfCurr1DayReceivedBlks = new AdslAturChanPerfCurr1DayReceivedBlksEnt(mib, this);
                            this.adslAturChanPerfCurr1DayTransmittedBlks = new AdslAturChanPerfCurr1DayTransmittedBlksEnt(mib, this);
                            this.adslAturChanPerfCurr1DayCorrectedBlks = new AdslAturChanPerfCurr1DayCorrectedBlksEnt(mib, this);
                            this.adslAturChanPerfCurr1DayUncorrectBlks = new AdslAturChanPerfCurr1DayUncorrectBlksEnt(mib, this);
                            this.adslAturChanPerfPrev1DayMoniSecs = new AdslAturChanPerfPrev1DayMoniSecsEnt(mib, this);
                            this.adslAturChanPerfPrev1DayReceivedBlks = new AdslAturChanPerfPrev1DayReceivedBlksEnt(mib, this);
                            this.adslAturChanPerfPrev1DayTransmittedBlks = new AdslAturChanPerfPrev1DayTransmittedBlksEnt(mib, this);
                            this.adslAturChanPerfPrev1DayCorrectedBlks = new AdslAturChanPerfPrev1DayCorrectedBlksEnt(mib, this);
                            this.adslAturChanPerfPrev1DayUncorrectBlks = new AdslAturChanPerfPrev1DayUncorrectBlksEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturChanReceivedBlks,
                                this.adslAturChanTransmittedBlks,
                                this.adslAturChanCorrectedBlks,
                                this.adslAturChanUncorrectBlks,
                                this.adslAturChanPerfValidIntervals,
                                this.adslAturChanPerfInvalidIntervals,
                                this.adslAturChanPerfCurr15MinTimeElapsed,
                                this.adslAturChanPerfCurr15MinReceivedBlks,
                                this.adslAturChanPerfCurr15MinTransmittedBlks,
                                this.adslAturChanPerfCurr15MinCorrectedBlks,
                                this.adslAturChanPerfCurr15MinUncorrectBlks,
                                this.adslAturChanPerfCurr1DayTimeElapsed,
                                this.adslAturChanPerfCurr1DayReceivedBlks,
                                this.adslAturChanPerfCurr1DayTransmittedBlks,
                                this.adslAturChanPerfCurr1DayCorrectedBlks,
                                this.adslAturChanPerfCurr1DayUncorrectBlks,
                                this.adslAturChanPerfPrev1DayMoniSecs,
                                this.adslAturChanPerfPrev1DayReceivedBlks,
                                this.adslAturChanPerfPrev1DayTransmittedBlks,
                                this.adslAturChanPerfPrev1DayCorrectedBlks,
                                this.adslAturChanPerfPrev1DayUncorrectBlks
                            };
                        }
                        public static final class AdslAturChanReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanReceivedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.11.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfValidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfValidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfValidIntervals", "1.3.6.1.2.1.10.94.1.1.11.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfInvalidIntervalsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfInvalidIntervalsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfInvalidIntervals", "1.3.6.1.2.1.10.94.1.1.11.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr15MinTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr15MinTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr15MinTimeElapsed", "1.3.6.1.2.1.10.94.1.1.11.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr15MinReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr15MinReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr15MinReceivedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr15MinTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr15MinTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr15MinTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr15MinCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr15MinCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr15MinCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr15MinUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr15MinUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr15MinUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.11.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr1DayTimeElapsedEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr1DayTimeElapsedEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr1DayTimeElapsed", "1.3.6.1.2.1.10.94.1.1.11.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr1DayReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr1DayReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr1DayReceivedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr1DayTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr1DayTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr1DayTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr1DayCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr1DayCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr1DayCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfCurr1DayUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfCurr1DayUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfCurr1DayUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.11.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfPrev1DayMoniSecsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfPrev1DayMoniSecsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfPrev1DayMoniSecs", "1.3.6.1.2.1.10.94.1.1.11.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfPrev1DayReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfPrev1DayReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfPrev1DayReceivedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfPrev1DayTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfPrev1DayTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfPrev1DayTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfPrev1DayCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfPrev1DayCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfPrev1DayCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.11.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanPerfPrev1DayUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanPerfPrev1DayUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanPerfPrev1DayUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.11.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAtucChanIntervalTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAtucChanIntervalEntryEnt adslAtucChanIntervalEntry;

                    private AdslAtucChanIntervalTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucChanIntervalTable", "1.3.6.1.2.1.10.94.1.1.12", false, true, false, false);
                        this.adslAtucChanIntervalEntry = new AdslAtucChanIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAtucChanIntervalEntry
                        };
                    }
                    public static final class AdslAtucChanIntervalEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslAtucChanIntervalNumberEnt adslAtucChanIntervalNumber;

                        public final AdslAtucChanIntervalReceivedBlksEnt adslAtucChanIntervalReceivedBlks;

                        public final AdslAtucChanIntervalTransmittedBlksEnt adslAtucChanIntervalTransmittedBlks;

                        public final AdslAtucChanIntervalCorrectedBlksEnt adslAtucChanIntervalCorrectedBlks;

                        public final AdslAtucChanIntervalUncorrectBlksEnt adslAtucChanIntervalUncorrectBlks;

                        public final AdslAtucChanIntervalValidDataEnt adslAtucChanIntervalValidData;

                        private AdslAtucChanIntervalEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucChanIntervalEntry", "1.3.6.1.2.1.10.94.1.1.12.1", false, false, false, true);
                            this.adslAtucChanIntervalNumber = new AdslAtucChanIntervalNumberEnt(mib, this);
                            this.adslAtucChanIntervalReceivedBlks = new AdslAtucChanIntervalReceivedBlksEnt(mib, this);
                            this.adslAtucChanIntervalTransmittedBlks = new AdslAtucChanIntervalTransmittedBlksEnt(mib, this);
                            this.adslAtucChanIntervalCorrectedBlks = new AdslAtucChanIntervalCorrectedBlksEnt(mib, this);
                            this.adslAtucChanIntervalUncorrectBlks = new AdslAtucChanIntervalUncorrectBlksEnt(mib, this);
                            this.adslAtucChanIntervalValidData = new AdslAtucChanIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAtucChanIntervalNumber,
                                this.adslAtucChanIntervalReceivedBlks,
                                this.adslAtucChanIntervalTransmittedBlks,
                                this.adslAtucChanIntervalCorrectedBlks,
                                this.adslAtucChanIntervalUncorrectBlks,
                                this.adslAtucChanIntervalValidData
                            };
                        }
                        public static final class AdslAtucChanIntervalNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanIntervalNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanIntervalNumber", "1.3.6.1.2.1.10.94.1.1.12.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanIntervalReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanIntervalReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanIntervalReceivedBlks", "1.3.6.1.2.1.10.94.1.1.12.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanIntervalTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanIntervalTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanIntervalTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.12.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanIntervalCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanIntervalCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanIntervalCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.12.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanIntervalUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanIntervalUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanIntervalUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.12.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanIntervalValidDataEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanIntervalValidDataEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanIntervalValidData", "1.3.6.1.2.1.10.94.1.1.12.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslAturChanIntervalTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslAturChanIntervalEntryEnt adslAturChanIntervalEntry;

                    private AdslAturChanIntervalTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturChanIntervalTable", "1.3.6.1.2.1.10.94.1.1.13", false, true, false, false);
                        this.adslAturChanIntervalEntry = new AdslAturChanIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslAturChanIntervalEntry
                        };
                    }
                    public static final class AdslAturChanIntervalEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslAturChanIntervalNumberEnt adslAturChanIntervalNumber;

                        public final AdslAturChanIntervalReceivedBlksEnt adslAturChanIntervalReceivedBlks;

                        public final AdslAturChanIntervalTransmittedBlksEnt adslAturChanIntervalTransmittedBlks;

                        public final AdslAturChanIntervalCorrectedBlksEnt adslAturChanIntervalCorrectedBlks;

                        public final AdslAturChanIntervalUncorrectBlksEnt adslAturChanIntervalUncorrectBlks;

                        public final AdslAturChanIntervalValidDataEnt adslAturChanIntervalValidData;

                        private AdslAturChanIntervalEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturChanIntervalEntry", "1.3.6.1.2.1.10.94.1.1.13.1", false, false, false, true);
                            this.adslAturChanIntervalNumber = new AdslAturChanIntervalNumberEnt(mib, this);
                            this.adslAturChanIntervalReceivedBlks = new AdslAturChanIntervalReceivedBlksEnt(mib, this);
                            this.adslAturChanIntervalTransmittedBlks = new AdslAturChanIntervalTransmittedBlksEnt(mib, this);
                            this.adslAturChanIntervalCorrectedBlks = new AdslAturChanIntervalCorrectedBlksEnt(mib, this);
                            this.adslAturChanIntervalUncorrectBlks = new AdslAturChanIntervalUncorrectBlksEnt(mib, this);
                            this.adslAturChanIntervalValidData = new AdslAturChanIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslAturChanIntervalNumber,
                                this.adslAturChanIntervalReceivedBlks,
                                this.adslAturChanIntervalTransmittedBlks,
                                this.adslAturChanIntervalCorrectedBlks,
                                this.adslAturChanIntervalUncorrectBlks,
                                this.adslAturChanIntervalValidData
                            };
                        }
                        public static final class AdslAturChanIntervalNumberEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanIntervalNumberEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanIntervalNumber", "1.3.6.1.2.1.10.94.1.1.13.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanIntervalReceivedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanIntervalReceivedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanIntervalReceivedBlks", "1.3.6.1.2.1.10.94.1.1.13.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanIntervalTransmittedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanIntervalTransmittedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanIntervalTransmittedBlks", "1.3.6.1.2.1.10.94.1.1.13.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanIntervalCorrectedBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanIntervalCorrectedBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanIntervalCorrectedBlks", "1.3.6.1.2.1.10.94.1.1.13.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanIntervalUncorrectBlksEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanIntervalUncorrectBlksEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanIntervalUncorrectBlks", "1.3.6.1.2.1.10.94.1.1.13.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanIntervalValidDataEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanIntervalValidDataEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanIntervalValidData", "1.3.6.1.2.1.10.94.1.1.13.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslLineConfProfileTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslLineConfProfileEntryEnt adslLineConfProfileEntry;

                    private AdslLineConfProfileTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslLineConfProfileTable", "1.3.6.1.2.1.10.94.1.1.14", false, true, false, false);
                        this.adslLineConfProfileEntry = new AdslLineConfProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslLineConfProfileEntry
                        };
                    }
                    public static final class AdslLineConfProfileEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslLineConfProfileNameEnt adslLineConfProfileName;

                        public final AdslAtucConfRateModeEnt adslAtucConfRateMode;

                        public final AdslAtucConfRateChanRatioEnt adslAtucConfRateChanRatio;

                        public final AdslAtucConfTargetSnrMgnEnt adslAtucConfTargetSnrMgn;

                        public final AdslAtucConfMaxSnrMgnEnt adslAtucConfMaxSnrMgn;

                        public final AdslAtucConfMinSnrMgnEnt adslAtucConfMinSnrMgn;

                        public final AdslAtucConfDownshiftSnrMgnEnt adslAtucConfDownshiftSnrMgn;

                        public final AdslAtucConfUpshiftSnrMgnEnt adslAtucConfUpshiftSnrMgn;

                        public final AdslAtucConfMinUpshiftTimeEnt adslAtucConfMinUpshiftTime;

                        public final AdslAtucConfMinDownshiftTimeEnt adslAtucConfMinDownshiftTime;

                        public final AdslAtucChanConfFastMinTxRateEnt adslAtucChanConfFastMinTxRate;

                        public final AdslAtucChanConfInterleaveMinTxRateEnt adslAtucChanConfInterleaveMinTxRate;

                        public final AdslAtucChanConfFastMaxTxRateEnt adslAtucChanConfFastMaxTxRate;

                        public final AdslAtucChanConfInterleaveMaxTxRateEnt adslAtucChanConfInterleaveMaxTxRate;

                        public final AdslAtucChanConfMaxInterleaveDelayEnt adslAtucChanConfMaxInterleaveDelay;

                        public final AdslAturConfRateModeEnt adslAturConfRateMode;

                        public final AdslAturConfRateChanRatioEnt adslAturConfRateChanRatio;

                        public final AdslAturConfTargetSnrMgnEnt adslAturConfTargetSnrMgn;

                        public final AdslAturConfMaxSnrMgnEnt adslAturConfMaxSnrMgn;

                        public final AdslAturConfMinSnrMgnEnt adslAturConfMinSnrMgn;

                        public final AdslAturConfDownshiftSnrMgnEnt adslAturConfDownshiftSnrMgn;

                        public final AdslAturConfUpshiftSnrMgnEnt adslAturConfUpshiftSnrMgn;

                        public final AdslAturConfMinUpshiftTimeEnt adslAturConfMinUpshiftTime;

                        public final AdslAturConfMinDownshiftTimeEnt adslAturConfMinDownshiftTime;

                        public final AdslAturChanConfFastMinTxRateEnt adslAturChanConfFastMinTxRate;

                        public final AdslAturChanConfInterleaveMinTxRateEnt adslAturChanConfInterleaveMinTxRate;

                        public final AdslAturChanConfFastMaxTxRateEnt adslAturChanConfFastMaxTxRate;

                        public final AdslAturChanConfInterleaveMaxTxRateEnt adslAturChanConfInterleaveMaxTxRate;

                        public final AdslAturChanConfMaxInterleaveDelayEnt adslAturChanConfMaxInterleaveDelay;

                        public final AdslLineConfProfileRowStatusEnt adslLineConfProfileRowStatus;

                        private AdslLineConfProfileEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineConfProfileEntry", "1.3.6.1.2.1.10.94.1.1.14.1", false, false, false, true);
                            this.adslLineConfProfileName = new AdslLineConfProfileNameEnt(mib, this);
                            this.adslAtucConfRateMode = new AdslAtucConfRateModeEnt(mib, this);
                            this.adslAtucConfRateChanRatio = new AdslAtucConfRateChanRatioEnt(mib, this);
                            this.adslAtucConfTargetSnrMgn = new AdslAtucConfTargetSnrMgnEnt(mib, this);
                            this.adslAtucConfMaxSnrMgn = new AdslAtucConfMaxSnrMgnEnt(mib, this);
                            this.adslAtucConfMinSnrMgn = new AdslAtucConfMinSnrMgnEnt(mib, this);
                            this.adslAtucConfDownshiftSnrMgn = new AdslAtucConfDownshiftSnrMgnEnt(mib, this);
                            this.adslAtucConfUpshiftSnrMgn = new AdslAtucConfUpshiftSnrMgnEnt(mib, this);
                            this.adslAtucConfMinUpshiftTime = new AdslAtucConfMinUpshiftTimeEnt(mib, this);
                            this.adslAtucConfMinDownshiftTime = new AdslAtucConfMinDownshiftTimeEnt(mib, this);
                            this.adslAtucChanConfFastMinTxRate = new AdslAtucChanConfFastMinTxRateEnt(mib, this);
                            this.adslAtucChanConfInterleaveMinTxRate = new AdslAtucChanConfInterleaveMinTxRateEnt(mib, this);
                            this.adslAtucChanConfFastMaxTxRate = new AdslAtucChanConfFastMaxTxRateEnt(mib, this);
                            this.adslAtucChanConfInterleaveMaxTxRate = new AdslAtucChanConfInterleaveMaxTxRateEnt(mib, this);
                            this.adslAtucChanConfMaxInterleaveDelay = new AdslAtucChanConfMaxInterleaveDelayEnt(mib, this);
                            this.adslAturConfRateMode = new AdslAturConfRateModeEnt(mib, this);
                            this.adslAturConfRateChanRatio = new AdslAturConfRateChanRatioEnt(mib, this);
                            this.adslAturConfTargetSnrMgn = new AdslAturConfTargetSnrMgnEnt(mib, this);
                            this.adslAturConfMaxSnrMgn = new AdslAturConfMaxSnrMgnEnt(mib, this);
                            this.adslAturConfMinSnrMgn = new AdslAturConfMinSnrMgnEnt(mib, this);
                            this.adslAturConfDownshiftSnrMgn = new AdslAturConfDownshiftSnrMgnEnt(mib, this);
                            this.adslAturConfUpshiftSnrMgn = new AdslAturConfUpshiftSnrMgnEnt(mib, this);
                            this.adslAturConfMinUpshiftTime = new AdslAturConfMinUpshiftTimeEnt(mib, this);
                            this.adslAturConfMinDownshiftTime = new AdslAturConfMinDownshiftTimeEnt(mib, this);
                            this.adslAturChanConfFastMinTxRate = new AdslAturChanConfFastMinTxRateEnt(mib, this);
                            this.adslAturChanConfInterleaveMinTxRate = new AdslAturChanConfInterleaveMinTxRateEnt(mib, this);
                            this.adslAturChanConfFastMaxTxRate = new AdslAturChanConfFastMaxTxRateEnt(mib, this);
                            this.adslAturChanConfInterleaveMaxTxRate = new AdslAturChanConfInterleaveMaxTxRateEnt(mib, this);
                            this.adslAturChanConfMaxInterleaveDelay = new AdslAturChanConfMaxInterleaveDelayEnt(mib, this);
                            this.adslLineConfProfileRowStatus = new AdslLineConfProfileRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslLineConfProfileName,
                                this.adslAtucConfRateMode,
                                this.adslAtucConfRateChanRatio,
                                this.adslAtucConfTargetSnrMgn,
                                this.adslAtucConfMaxSnrMgn,
                                this.adslAtucConfMinSnrMgn,
                                this.adslAtucConfDownshiftSnrMgn,
                                this.adslAtucConfUpshiftSnrMgn,
                                this.adslAtucConfMinUpshiftTime,
                                this.adslAtucConfMinDownshiftTime,
                                this.adslAtucChanConfFastMinTxRate,
                                this.adslAtucChanConfInterleaveMinTxRate,
                                this.adslAtucChanConfFastMaxTxRate,
                                this.adslAtucChanConfInterleaveMaxTxRate,
                                this.adslAtucChanConfMaxInterleaveDelay,
                                this.adslAturConfRateMode,
                                this.adslAturConfRateChanRatio,
                                this.adslAturConfTargetSnrMgn,
                                this.adslAturConfMaxSnrMgn,
                                this.adslAturConfMinSnrMgn,
                                this.adslAturConfDownshiftSnrMgn,
                                this.adslAturConfUpshiftSnrMgn,
                                this.adslAturConfMinUpshiftTime,
                                this.adslAturConfMinDownshiftTime,
                                this.adslAturChanConfFastMinTxRate,
                                this.adslAturChanConfInterleaveMinTxRate,
                                this.adslAturChanConfFastMaxTxRate,
                                this.adslAturChanConfInterleaveMaxTxRate,
                                this.adslAturChanConfMaxInterleaveDelay,
                                this.adslLineConfProfileRowStatus
                            };
                        }
                        public static final class AdslLineConfProfileNameEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineConfProfileNameEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineConfProfileName", "1.3.6.1.2.1.10.94.1.1.14.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfRateModeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfRateModeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfRateMode", "1.3.6.1.2.1.10.94.1.1.14.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfRateChanRatioEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfRateChanRatioEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfRateChanRatio", "1.3.6.1.2.1.10.94.1.1.14.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfTargetSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfTargetSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfTargetSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfMaxSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfMaxSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfMaxSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfMinSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfMinSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfMinSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfDownshiftSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfDownshiftSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfDownshiftSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfUpshiftSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfUpshiftSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfUpshiftSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfMinUpshiftTimeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfMinUpshiftTimeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfMinUpshiftTime", "1.3.6.1.2.1.10.94.1.1.14.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucConfMinDownshiftTimeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucConfMinDownshiftTimeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucConfMinDownshiftTime", "1.3.6.1.2.1.10.94.1.1.14.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanConfFastMinTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanConfFastMinTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanConfFastMinTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanConfInterleaveMinTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanConfInterleaveMinTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanConfInterleaveMinTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanConfFastMaxTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanConfFastMaxTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanConfFastMaxTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanConfInterleaveMaxTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanConfInterleaveMaxTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanConfInterleaveMaxTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucChanConfMaxInterleaveDelayEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucChanConfMaxInterleaveDelayEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucChanConfMaxInterleaveDelay", "1.3.6.1.2.1.10.94.1.1.14.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfRateModeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfRateModeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfRateMode", "1.3.6.1.2.1.10.94.1.1.14.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfRateChanRatioEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfRateChanRatioEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfRateChanRatio", "1.3.6.1.2.1.10.94.1.1.14.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfTargetSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfTargetSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfTargetSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfMaxSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfMaxSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfMaxSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfMinSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfMinSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfMinSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfDownshiftSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfDownshiftSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfDownshiftSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfUpshiftSnrMgnEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfUpshiftSnrMgnEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfUpshiftSnrMgn", "1.3.6.1.2.1.10.94.1.1.14.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfMinUpshiftTimeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfMinUpshiftTimeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfMinUpshiftTime", "1.3.6.1.2.1.10.94.1.1.14.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturConfMinDownshiftTimeEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturConfMinDownshiftTimeEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturConfMinDownshiftTime", "1.3.6.1.2.1.10.94.1.1.14.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanConfFastMinTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanConfFastMinTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanConfFastMinTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanConfInterleaveMinTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanConfInterleaveMinTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanConfInterleaveMinTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanConfFastMaxTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanConfFastMaxTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanConfFastMaxTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanConfInterleaveMaxTxRateEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanConfInterleaveMaxTxRateEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanConfInterleaveMaxTxRate", "1.3.6.1.2.1.10.94.1.1.14.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturChanConfMaxInterleaveDelayEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturChanConfMaxInterleaveDelayEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturChanConfMaxInterleaveDelay", "1.3.6.1.2.1.10.94.1.1.14.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslLineConfProfileRowStatusEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineConfProfileRowStatusEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineConfProfileRowStatus", "1.3.6.1.2.1.10.94.1.1.14.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslLineAlarmConfProfileTableEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    public final AdslLineAlarmConfProfileEntryEnt adslLineAlarmConfProfileEntry;

                    private AdslLineAlarmConfProfileTableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslLineAlarmConfProfileTable", "1.3.6.1.2.1.10.94.1.1.15", false, true, false, false);
                        this.adslLineAlarmConfProfileEntry = new AdslLineAlarmConfProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslLineAlarmConfProfileEntry
                        };
                    }
                    public static final class AdslLineAlarmConfProfileEntryEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        public final AdslLineAlarmConfProfileNameEnt adslLineAlarmConfProfileName;

                        public final AdslAtucThresh15MinLofsEnt adslAtucThresh15MinLofs;

                        public final AdslAtucThresh15MinLossEnt adslAtucThresh15MinLoss;

                        public final AdslAtucThresh15MinLolsEnt adslAtucThresh15MinLols;

                        public final AdslAtucThresh15MinLprsEnt adslAtucThresh15MinLprs;

                        public final AdslAtucThresh15MinESsEnt adslAtucThresh15MinESs;

                        public final AdslAtucThreshFastRateUpEnt adslAtucThreshFastRateUp;

                        public final AdslAtucThreshInterleaveRateUpEnt adslAtucThreshInterleaveRateUp;

                        public final AdslAtucThreshFastRateDownEnt adslAtucThreshFastRateDown;

                        public final AdslAtucThreshInterleaveRateDownEnt adslAtucThreshInterleaveRateDown;

                        public final AdslAtucInitFailureTrapEnableEnt adslAtucInitFailureTrapEnable;

                        public final AdslAturThresh15MinLofsEnt adslAturThresh15MinLofs;

                        public final AdslAturThresh15MinLossEnt adslAturThresh15MinLoss;

                        public final AdslAturThresh15MinLprsEnt adslAturThresh15MinLprs;

                        public final AdslAturThresh15MinESsEnt adslAturThresh15MinESs;

                        public final AdslAturThreshFastRateUpEnt adslAturThreshFastRateUp;

                        public final AdslAturThreshInterleaveRateUpEnt adslAturThreshInterleaveRateUp;

                        public final AdslAturThreshFastRateDownEnt adslAturThreshFastRateDown;

                        public final AdslAturThreshInterleaveRateDownEnt adslAturThreshInterleaveRateDown;

                        public final AdslLineAlarmConfProfileRowStatusEnt adslLineAlarmConfProfileRowStatus;

                        private AdslLineAlarmConfProfileEntryEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineAlarmConfProfileEntry", "1.3.6.1.2.1.10.94.1.1.15.1", false, false, false, true);
                            this.adslLineAlarmConfProfileName = new AdslLineAlarmConfProfileNameEnt(mib, this);
                            this.adslAtucThresh15MinLofs = new AdslAtucThresh15MinLofsEnt(mib, this);
                            this.adslAtucThresh15MinLoss = new AdslAtucThresh15MinLossEnt(mib, this);
                            this.adslAtucThresh15MinLols = new AdslAtucThresh15MinLolsEnt(mib, this);
                            this.adslAtucThresh15MinLprs = new AdslAtucThresh15MinLprsEnt(mib, this);
                            this.adslAtucThresh15MinESs = new AdslAtucThresh15MinESsEnt(mib, this);
                            this.adslAtucThreshFastRateUp = new AdslAtucThreshFastRateUpEnt(mib, this);
                            this.adslAtucThreshInterleaveRateUp = new AdslAtucThreshInterleaveRateUpEnt(mib, this);
                            this.adslAtucThreshFastRateDown = new AdslAtucThreshFastRateDownEnt(mib, this);
                            this.adslAtucThreshInterleaveRateDown = new AdslAtucThreshInterleaveRateDownEnt(mib, this);
                            this.adslAtucInitFailureTrapEnable = new AdslAtucInitFailureTrapEnableEnt(mib, this);
                            this.adslAturThresh15MinLofs = new AdslAturThresh15MinLofsEnt(mib, this);
                            this.adslAturThresh15MinLoss = new AdslAturThresh15MinLossEnt(mib, this);
                            this.adslAturThresh15MinLprs = new AdslAturThresh15MinLprsEnt(mib, this);
                            this.adslAturThresh15MinESs = new AdslAturThresh15MinESsEnt(mib, this);
                            this.adslAturThreshFastRateUp = new AdslAturThreshFastRateUpEnt(mib, this);
                            this.adslAturThreshInterleaveRateUp = new AdslAturThreshInterleaveRateUpEnt(mib, this);
                            this.adslAturThreshFastRateDown = new AdslAturThreshFastRateDownEnt(mib, this);
                            this.adslAturThreshInterleaveRateDown = new AdslAturThreshInterleaveRateDownEnt(mib, this);
                            this.adslLineAlarmConfProfileRowStatus = new AdslLineAlarmConfProfileRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.adslLineAlarmConfProfileName,
                                this.adslAtucThresh15MinLofs,
                                this.adslAtucThresh15MinLoss,
                                this.adslAtucThresh15MinLols,
                                this.adslAtucThresh15MinLprs,
                                this.adslAtucThresh15MinESs,
                                this.adslAtucThreshFastRateUp,
                                this.adslAtucThreshInterleaveRateUp,
                                this.adslAtucThreshFastRateDown,
                                this.adslAtucThreshInterleaveRateDown,
                                this.adslAtucInitFailureTrapEnable,
                                this.adslAturThresh15MinLofs,
                                this.adslAturThresh15MinLoss,
                                this.adslAturThresh15MinLprs,
                                this.adslAturThresh15MinESs,
                                this.adslAturThreshFastRateUp,
                                this.adslAturThreshInterleaveRateUp,
                                this.adslAturThreshFastRateDown,
                                this.adslAturThreshInterleaveRateDown,
                                this.adslLineAlarmConfProfileRowStatus
                            };
                        }
                        public static final class AdslLineAlarmConfProfileNameEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineAlarmConfProfileNameEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineAlarmConfProfileName", "1.3.6.1.2.1.10.94.1.1.15.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThresh15MinLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThresh15MinLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThresh15MinLofs", "1.3.6.1.2.1.10.94.1.1.15.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThresh15MinLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThresh15MinLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThresh15MinLoss", "1.3.6.1.2.1.10.94.1.1.15.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThresh15MinLolsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThresh15MinLolsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThresh15MinLols", "1.3.6.1.2.1.10.94.1.1.15.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThresh15MinLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThresh15MinLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThresh15MinLprs", "1.3.6.1.2.1.10.94.1.1.15.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThresh15MinESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThresh15MinESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThresh15MinESs", "1.3.6.1.2.1.10.94.1.1.15.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThreshFastRateUpEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThreshFastRateUpEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThreshFastRateUp", "1.3.6.1.2.1.10.94.1.1.15.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThreshInterleaveRateUpEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThreshInterleaveRateUpEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThreshInterleaveRateUp", "1.3.6.1.2.1.10.94.1.1.15.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThreshFastRateDownEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThreshFastRateDownEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThreshFastRateDown", "1.3.6.1.2.1.10.94.1.1.15.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucThreshInterleaveRateDownEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucThreshInterleaveRateDownEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucThreshInterleaveRateDown", "1.3.6.1.2.1.10.94.1.1.15.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAtucInitFailureTrapEnableEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAtucInitFailureTrapEnableEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAtucInitFailureTrapEnable", "1.3.6.1.2.1.10.94.1.1.15.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThresh15MinLofsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThresh15MinLofsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThresh15MinLofs", "1.3.6.1.2.1.10.94.1.1.15.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThresh15MinLossEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThresh15MinLossEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThresh15MinLoss", "1.3.6.1.2.1.10.94.1.1.15.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThresh15MinLprsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThresh15MinLprsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThresh15MinLprs", "1.3.6.1.2.1.10.94.1.1.15.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThresh15MinESsEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThresh15MinESsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThresh15MinESs", "1.3.6.1.2.1.10.94.1.1.15.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThreshFastRateUpEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThreshFastRateUpEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThreshFastRateUp", "1.3.6.1.2.1.10.94.1.1.15.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThreshInterleaveRateUpEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThreshInterleaveRateUpEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThreshInterleaveRateUp", "1.3.6.1.2.1.10.94.1.1.15.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThreshFastRateDownEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThreshFastRateDownEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThreshFastRateDown", "1.3.6.1.2.1.10.94.1.1.15.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslAturThreshInterleaveRateDownEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslAturThreshInterleaveRateDownEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslAturThreshInterleaveRateDown", "1.3.6.1.2.1.10.94.1.1.15.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AdslLineAlarmConfProfileRowStatusEnt extends MIBEntry<ADSLLINEMIBDef>
                        {
                            private AdslLineAlarmConfProfileRowStatusEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "adslLineAlarmConfProfileRowStatus", "1.3.6.1.2.1.10.94.1.1.15.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AdslLCSMibEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    private AdslLCSMibEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslLCSMib", "1.3.6.1.2.1.10.94.1.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AdslTrapsEnt extends MIBEntry<ADSLLINEMIBDef>
            {
                public final AdslAtucTrapsEnt adslAtucTraps;

                public final AdslAturTrapsEnt adslAturTraps;

                private AdslTrapsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                {
                    super(mib, parent, "adslTraps", "1.3.6.1.2.1.10.94.1.2", false, false, false, false);
                    this.adslAtucTraps = new AdslAtucTrapsEnt(mib, this);
                    this.adslAturTraps = new AdslAturTrapsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslAtucTraps,
                        this.adslAturTraps
                    };
                }
                public static final class AdslAtucTrapsEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    private AdslAtucTrapsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAtucTraps", "1.3.6.1.2.1.10.94.1.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AdslAturTrapsEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    private AdslAturTrapsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslAturTraps", "1.3.6.1.2.1.10.94.1.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AdslConformanceEnt extends MIBEntry<ADSLLINEMIBDef>
            {
                public final AdslGroupsEnt adslGroups;

                public final AdslCompliancesEnt adslCompliances;

                private AdslConformanceEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                {
                    super(mib, parent, "adslConformance", "1.3.6.1.2.1.10.94.1.3", false, false, false, false);
                    this.adslGroups = new AdslGroupsEnt(mib, this);
                    this.adslCompliances = new AdslCompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adslGroups,
                        this.adslCompliances
                    };
                }
                public static final class AdslGroupsEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    /** units of conformance*/
                    public final AdslLineGroupEnt adslLineGroup;

                    public final AdslPhysicalGroupEnt adslPhysicalGroup;

                    public final AdslChannelGroupEnt adslChannelGroup;

                    public final AdslAtucPhysPerfRawCounterGroupEnt adslAtucPhysPerfRawCounterGroup;

                    public final AdslAtucPhysPerfIntervalGroupEnt adslAtucPhysPerfIntervalGroup;

                    public final AdslAturPhysPerfRawCounterGroupEnt adslAturPhysPerfRawCounterGroup;

                    public final AdslAturPhysPerfIntervalGroupEnt adslAturPhysPerfIntervalGroup;

                    public final AdslAtucChanPerformanceGroupEnt adslAtucChanPerformanceGroup;

                    public final AdslAturChanPerformanceGroupEnt adslAturChanPerformanceGroup;

                    public final AdslLineConfProfileGroupEnt adslLineConfProfileGroup;

                    public final AdslLineAlarmConfProfileGroupEnt adslLineAlarmConfProfileGroup;

                    public final AdslLineConfProfileControlGroupEnt adslLineConfProfileControlGroup;

                    public final AdslNotificationsGroupEnt adslNotificationsGroup;

                    /** units of conformance for ATU-R agent*/
                    public final AdslAturLineGroupEnt adslAturLineGroup;

                    public final AdslAturPhysicalGroupEnt adslAturPhysicalGroup;

                    public final AdslAturChannelGroupEnt adslAturChannelGroup;

                    public final AdslAturAtucPhysPerfRawCounterGroupEnt adslAturAtucPhysPerfRawCounterGroup;

                    public final AdslAturAtucPhysPerfIntervalGroupEnt adslAturAtucPhysPerfIntervalGroup;

                    public final AdslAturAturPhysPerfRawCounterGroupEnt adslAturAturPhysPerfRawCounterGroup;

                    public final AdslAturAturPhysPerfIntervalGroupEnt adslAturAturPhysPerfIntervalGroup;

                    public final AdslAturAtucChanPerformanceGroupEnt adslAturAtucChanPerformanceGroup;

                    public final AdslAturAturChanPerformanceGroupEnt adslAturAturChanPerformanceGroup;

                    public final AdslAturLineAlarmConfProfileGroupEnt adslAturLineAlarmConfProfileGroup;

                    public final AdslAturLineConfProfileControlGroupEnt adslAturLineConfProfileControlGroup;

                    public final AdslAturNotificationsGroupEnt adslAturNotificationsGroup;

                    private AdslGroupsEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslGroups", "1.3.6.1.2.1.10.94.1.3.1", false, false, false, false);
                        this.adslLineGroup = new AdslLineGroupEnt(mib, this);
                        this.adslPhysicalGroup = new AdslPhysicalGroupEnt(mib, this);
                        this.adslChannelGroup = new AdslChannelGroupEnt(mib, this);
                        this.adslAtucPhysPerfRawCounterGroup = new AdslAtucPhysPerfRawCounterGroupEnt(mib, this);
                        this.adslAtucPhysPerfIntervalGroup = new AdslAtucPhysPerfIntervalGroupEnt(mib, this);
                        this.adslAturPhysPerfRawCounterGroup = new AdslAturPhysPerfRawCounterGroupEnt(mib, this);
                        this.adslAturPhysPerfIntervalGroup = new AdslAturPhysPerfIntervalGroupEnt(mib, this);
                        this.adslAtucChanPerformanceGroup = new AdslAtucChanPerformanceGroupEnt(mib, this);
                        this.adslAturChanPerformanceGroup = new AdslAturChanPerformanceGroupEnt(mib, this);
                        this.adslLineConfProfileGroup = new AdslLineConfProfileGroupEnt(mib, this);
                        this.adslLineAlarmConfProfileGroup = new AdslLineAlarmConfProfileGroupEnt(mib, this);
                        this.adslLineConfProfileControlGroup = new AdslLineConfProfileControlGroupEnt(mib, this);
                        this.adslNotificationsGroup = new AdslNotificationsGroupEnt(mib, this);
                        this.adslAturLineGroup = new AdslAturLineGroupEnt(mib, this);
                        this.adslAturPhysicalGroup = new AdslAturPhysicalGroupEnt(mib, this);
                        this.adslAturChannelGroup = new AdslAturChannelGroupEnt(mib, this);
                        this.adslAturAtucPhysPerfRawCounterGroup = new AdslAturAtucPhysPerfRawCounterGroupEnt(mib, this);
                        this.adslAturAtucPhysPerfIntervalGroup = new AdslAturAtucPhysPerfIntervalGroupEnt(mib, this);
                        this.adslAturAturPhysPerfRawCounterGroup = new AdslAturAturPhysPerfRawCounterGroupEnt(mib, this);
                        this.adslAturAturPhysPerfIntervalGroup = new AdslAturAturPhysPerfIntervalGroupEnt(mib, this);
                        this.adslAturAtucChanPerformanceGroup = new AdslAturAtucChanPerformanceGroupEnt(mib, this);
                        this.adslAturAturChanPerformanceGroup = new AdslAturAturChanPerformanceGroupEnt(mib, this);
                        this.adslAturLineAlarmConfProfileGroup = new AdslAturLineAlarmConfProfileGroupEnt(mib, this);
                        this.adslAturLineConfProfileControlGroup = new AdslAturLineConfProfileControlGroupEnt(mib, this);
                        this.adslAturNotificationsGroup = new AdslAturNotificationsGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslLineGroup,
                            this.adslPhysicalGroup,
                            this.adslChannelGroup,
                            this.adslAtucPhysPerfRawCounterGroup,
                            this.adslAtucPhysPerfIntervalGroup,
                            this.adslAturPhysPerfRawCounterGroup,
                            this.adslAturPhysPerfIntervalGroup,
                            this.adslAtucChanPerformanceGroup,
                            this.adslAturChanPerformanceGroup,
                            this.adslLineConfProfileGroup,
                            this.adslLineAlarmConfProfileGroup,
                            this.adslLineConfProfileControlGroup,
                            this.adslNotificationsGroup,
                            this.adslAturLineGroup,
                            this.adslAturPhysicalGroup,
                            this.adslAturChannelGroup,
                            this.adslAturAtucPhysPerfRawCounterGroup,
                            this.adslAturAtucPhysPerfIntervalGroup,
                            this.adslAturAturPhysPerfRawCounterGroup,
                            this.adslAturAturPhysPerfIntervalGroup,
                            this.adslAturAtucChanPerformanceGroup,
                            this.adslAturAturChanPerformanceGroup,
                            this.adslAturLineAlarmConfProfileGroup,
                            this.adslAturLineConfProfileControlGroup,
                            this.adslAturNotificationsGroup
                        };
                    }
                    public static final class AdslLineGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslLineGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineGroup", "1.3.6.1.2.1.10.94.1.3.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslPhysicalGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslPhysicalGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslPhysicalGroup", "1.3.6.1.2.1.10.94.1.3.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslChannelGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslChannelGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslChannelGroup", "1.3.6.1.2.1.10.94.1.3.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPhysPerfRawCounterGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAtucPhysPerfRawCounterGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPhysPerfRawCounterGroup", "1.3.6.1.2.1.10.94.1.3.1.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucPhysPerfIntervalGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAtucPhysPerfIntervalGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucPhysPerfIntervalGroup", "1.3.6.1.2.1.10.94.1.3.1.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPhysPerfRawCounterGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturPhysPerfRawCounterGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPhysPerfRawCounterGroup", "1.3.6.1.2.1.10.94.1.3.1.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPhysPerfIntervalGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturPhysPerfIntervalGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPhysPerfIntervalGroup", "1.3.6.1.2.1.10.94.1.3.1.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAtucChanPerformanceGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAtucChanPerformanceGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAtucChanPerformanceGroup", "1.3.6.1.2.1.10.94.1.3.1.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturChanPerformanceGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturChanPerformanceGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturChanPerformanceGroup", "1.3.6.1.2.1.10.94.1.3.1.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineConfProfileGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslLineConfProfileGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineConfProfileGroup", "1.3.6.1.2.1.10.94.1.3.1.10", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineAlarmConfProfileGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslLineAlarmConfProfileGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineAlarmConfProfileGroup", "1.3.6.1.2.1.10.94.1.3.1.11", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineConfProfileControlGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslLineConfProfileControlGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineConfProfileControlGroup", "1.3.6.1.2.1.10.94.1.3.1.12", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslNotificationsGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslNotificationsGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslNotificationsGroup", "1.3.6.1.2.1.10.94.1.3.1.13", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturLineGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturLineGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturLineGroup", "1.3.6.1.2.1.10.94.1.3.1.14", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturPhysicalGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturPhysicalGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturPhysicalGroup", "1.3.6.1.2.1.10.94.1.3.1.15", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturChannelGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturChannelGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturChannelGroup", "1.3.6.1.2.1.10.94.1.3.1.16", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturAtucPhysPerfRawCounterGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturAtucPhysPerfRawCounterGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturAtucPhysPerfRawCounterGroup", "1.3.6.1.2.1.10.94.1.3.1.17", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturAtucPhysPerfIntervalGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturAtucPhysPerfIntervalGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturAtucPhysPerfIntervalGroup", "1.3.6.1.2.1.10.94.1.3.1.18", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturAturPhysPerfRawCounterGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturAturPhysPerfRawCounterGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturAturPhysPerfRawCounterGroup", "1.3.6.1.2.1.10.94.1.3.1.19", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturAturPhysPerfIntervalGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturAturPhysPerfIntervalGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturAturPhysPerfIntervalGroup", "1.3.6.1.2.1.10.94.1.3.1.20", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturAtucChanPerformanceGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturAtucChanPerformanceGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturAtucChanPerformanceGroup", "1.3.6.1.2.1.10.94.1.3.1.21", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturAturChanPerformanceGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturAturChanPerformanceGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturAturChanPerformanceGroup", "1.3.6.1.2.1.10.94.1.3.1.22", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturLineAlarmConfProfileGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturLineAlarmConfProfileGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturLineAlarmConfProfileGroup", "1.3.6.1.2.1.10.94.1.3.1.23", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturLineConfProfileControlGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturLineConfProfileControlGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturLineConfProfileControlGroup", "1.3.6.1.2.1.10.94.1.3.1.24", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslAturNotificationsGroupEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslAturNotificationsGroupEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslAturNotificationsGroup", "1.3.6.1.2.1.10.94.1.3.1.25", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AdslCompliancesEnt extends MIBEntry<ADSLLINEMIBDef>
                {
                    /** ATU-C agent compliance statements*/
                    public final AdslLineMibAtucComplianceEnt adslLineMibAtucCompliance;

                    /** ATU-R agent compliance statements*/
                    public final AdslLineMibAturComplianceEnt adslLineMibAturCompliance;

                    private AdslCompliancesEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "adslCompliances", "1.3.6.1.2.1.10.94.1.3.2", false, false, false, false);
                        this.adslLineMibAtucCompliance = new AdslLineMibAtucComplianceEnt(mib, this);
                        this.adslLineMibAturCompliance = new AdslLineMibAturComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adslLineMibAtucCompliance,
                            this.adslLineMibAturCompliance
                        };
                    }
                    public static final class AdslLineMibAtucComplianceEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslLineMibAtucComplianceEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineMibAtucCompliance", "1.3.6.1.2.1.10.94.1.3.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdslLineMibAturComplianceEnt extends MIBEntry<ADSLLINEMIBDef>
                    {
                        private AdslLineMibAturComplianceEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "adslLineMibAturCompliance", "1.3.6.1.2.1.10.94.1.3.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

    public static final class AdslAtucPerfLofsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucPerfLofsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucPerfLofsThreshTrap", "1.3.6.1.2.1.10.94.1.2.1.0.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAtucPerfLossThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucPerfLossThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucPerfLossThreshTrap", "1.3.6.1.2.1.10.94.1.2.1.0.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAtucPerfLprsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucPerfLprsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucPerfLprsThreshTrap", "1.3.6.1.2.1.10.94.1.2.1.0.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAtucPerfESsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucPerfESsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucPerfESsThreshTrap", "1.3.6.1.2.1.10.94.1.2.1.0.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAtucRateChangeTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucRateChangeTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucRateChangeTrap", "1.3.6.1.2.1.10.94.1.2.1.0.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAtucPerfLolsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucPerfLolsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucPerfLolsThreshTrap", "1.3.6.1.2.1.10.94.1.2.1.0.6", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAtucInitFailureTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAtucInitFailureTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAtucInitFailureTrap", "1.3.6.1.2.1.10.94.1.2.1.0.7", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAturPerfLofsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAturPerfLofsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAturPerfLofsThreshTrap", "1.3.6.1.2.1.10.94.1.2.2.0.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAturPerfLossThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAturPerfLossThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAturPerfLossThreshTrap", "1.3.6.1.2.1.10.94.1.2.2.0.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAturPerfLprsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAturPerfLprsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAturPerfLprsThreshTrap", "1.3.6.1.2.1.10.94.1.2.2.0.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAturPerfESsThreshTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAturPerfESsThreshTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAturPerfESsThreshTrap", "1.3.6.1.2.1.10.94.1.2.2.0.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AdslAturRateChangeTrapEnt extends MIBEntry<ADSLLINEMIBDef>
    {
        private AdslAturRateChangeTrapEnt(ADSLLINEMIBDef mib, MIBEntry<ADSLLINEMIBDef> parent)
        {
            super(mib, parent, "adslAturRateChangeTrap", "1.3.6.1.2.1.10.94.1.2.2.0.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
