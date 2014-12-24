package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2578,
RFC2579,
RFC2580]
[RFC2819]
[RFC3291]
[RFC2863]
[RFC3729]*/
public final class SSPMMIBDef extends MIB
{
    public static final SSPMMIBDef SSPMMIB = new SSPMMIBDef();

    /** [RFC2287]

July 28, 2005*/
    public final SspmMIBEnt sspmMIB;

    private SSPMMIBDef()
    {
        super("SSPM-MIB");
        this.sspmMIB = new SspmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sspmMIB
        };
    }

    public static final class SspmMIBEnt extends MIBEntry<SSPMMIBDef>
    {
        /** Object Identifier Assignments*/
        public final SspmMIBObjectsEnt sspmMIBObjects;

        public final SspmMIBNotificationsEnt sspmMIBNotifications;

        public final SspmMIBConformanceEnt sspmMIBConformance;

        private SspmMIBEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
        {
            super(mib, parent, "sspmMIB", "1.3.6.1.2.1.16.28", false, false, false, false);
            this.sspmMIBObjects = new SspmMIBObjectsEnt(mib, this);
            this.sspmMIBNotifications = new SspmMIBNotificationsEnt(mib, this);
            this.sspmMIBConformance = new SspmMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sspmMIBObjects,
                this.sspmMIBNotifications,
                this.sspmMIBConformance
            };
        }
        public static final class SspmMIBObjectsEnt extends MIBEntry<SSPMMIBDef>
        {
            /** sspmGeneral*/
            public final SspmGeneralEnt sspmGeneral;

            /** sspmSourceContains the details of the source of theSynthetic Sources for Performance Monitoring algorithms.This information is split into two tables.  The first definesprofiles that can be applied to specific sources in thecontrol table.*/
            public final SspmSourceEnt sspmSource;

            /** sspmSinkTableContains attributes for configuration of SyntheticSources for Performance Monitoring sinks, i.e.,sinks for receipt of one-way delay measurements.*/
            public final SspmSinkEnt sspmSink;

            private SspmMIBObjectsEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
            {
                super(mib, parent, "sspmMIBObjects", "1.3.6.1.2.1.16.28.1", false, false, false, false);
                this.sspmGeneral = new SspmGeneralEnt(mib, this);
                this.sspmSource = new SspmSourceEnt(mib, this);
                this.sspmSink = new SspmSinkEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sspmGeneral,
                    this.sspmSource,
                    this.sspmSink
                };
            }
            public static final class SspmGeneralEnt extends MIBEntry<SSPMMIBDef>
            {
                /** UNITS       Microseconds*/
                public final SspmGeneralClockResolutionEnt sspmGeneralClockResolution;

                /** UNITS Seconds*/
                public final SspmGeneralClockMaxSkewEnt sspmGeneralClockMaxSkew;

                public final SspmGeneralClockSourceEnt sspmGeneralClockSource;

                /** units   MicroSeconds*/
                public final SspmGeneralMinFrequencyEnt sspmGeneralMinFrequency;

                /** sspmCapabilities


Describes the capabilities of the SSPM device.*/
                public final SspmCapabilitiesTableEnt sspmCapabilitiesTable;

                private SspmGeneralEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                {
                    super(mib, parent, "sspmGeneral", "1.3.6.1.2.1.16.28.1.1", false, false, false, false);
                    this.sspmGeneralClockResolution = new SspmGeneralClockResolutionEnt(mib, this);
                    this.sspmGeneralClockMaxSkew = new SspmGeneralClockMaxSkewEnt(mib, this);
                    this.sspmGeneralClockSource = new SspmGeneralClockSourceEnt(mib, this);
                    this.sspmGeneralMinFrequency = new SspmGeneralMinFrequencyEnt(mib, this);
                    this.sspmCapabilitiesTable = new SspmCapabilitiesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sspmGeneralClockResolution,
                        this.sspmGeneralClockMaxSkew,
                        this.sspmGeneralClockSource,
                        this.sspmGeneralMinFrequency,
                        this.sspmCapabilitiesTable
                    };
                }
                public static final class SspmGeneralClockResolutionEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmGeneralClockResolutionEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmGeneralClockResolution", "1.3.6.1.2.1.16.28.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmGeneralClockMaxSkewEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmGeneralClockMaxSkewEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmGeneralClockMaxSkew", "1.3.6.1.2.1.16.28.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmGeneralClockSourceEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmGeneralClockSourceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmGeneralClockSource", "1.3.6.1.2.1.16.28.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmGeneralMinFrequencyEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmGeneralMinFrequencyEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmGeneralMinFrequency", "1.3.6.1.2.1.16.28.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmCapabilitiesTableEnt extends MIBEntry<SSPMMIBDef>
                {
                    public final SspmCapabilitiesEntryEnt sspmCapabilitiesEntry;

                    private SspmCapabilitiesTableEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmCapabilitiesTable", "1.3.6.1.2.1.16.28.1.1.5", false, true, false, false);
                        this.sspmCapabilitiesEntry = new SspmCapabilitiesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sspmCapabilitiesEntry
                        };
                    }
                    public static final class SspmCapabilitiesEntryEnt extends MIBEntry<SSPMMIBDef>
                    {
                        public final SspmCapabilitiesInstanceEnt sspmCapabilitiesInstance;

                        private SspmCapabilitiesEntryEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                        {
                            super(mib, parent, "sspmCapabilitiesEntry", "1.3.6.1.2.1.16.28.1.1.5.1", false, false, false, true);
                            this.sspmCapabilitiesInstance = new SspmCapabilitiesInstanceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sspmCapabilitiesInstance
                            };
                        }
                        public static final class SspmCapabilitiesInstanceEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmCapabilitiesInstanceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmCapabilitiesInstance", "1.3.6.1.2.1.16.28.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SspmSourceEnt extends MIBEntry<SSPMMIBDef>
            {
                /** sspmSourceProfileTableDefines template profiles for measurements.*/
                public final SspmSourceProfileTableEnt sspmSourceProfileTable;

                /** sspmSourceControlTableDefines specific measurement instances based on templateprofiles in the sspmSourceProfileTable which must bepre-configured.*/
                public final SspmSourceControlTableEnt sspmSourceControlTable;

                private SspmSourceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                {
                    super(mib, parent, "sspmSource", "1.3.6.1.2.1.16.28.1.2", false, false, false, false);
                    this.sspmSourceProfileTable = new SspmSourceProfileTableEnt(mib, this);
                    this.sspmSourceControlTable = new SspmSourceControlTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sspmSourceProfileTable,
                        this.sspmSourceControlTable
                    };
                }
                public static final class SspmSourceProfileTableEnt extends MIBEntry<SSPMMIBDef>
                {
                    public final SspmSourceProfileEntryEnt sspmSourceProfileEntry;

                    private SspmSourceProfileTableEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSourceProfileTable", "1.3.6.1.2.1.16.28.1.2.1", false, true, false, false);
                        this.sspmSourceProfileEntry = new SspmSourceProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sspmSourceProfileEntry
                        };
                    }
                    public static final class SspmSourceProfileEntryEnt extends MIBEntry<SSPMMIBDef>
                    {
                        public final SspmSourceProfileInstanceEnt sspmSourceProfileInstance;

                        public final SspmSourceProfileTypeEnt sspmSourceProfileType;

                        public final SspmSourceProfilePacketSizeEnt sspmSourceProfilePacketSize;

                        public final SspmSourceProfilePacketFillTypeEnt sspmSourceProfilePacketFillType;

                        public final SspmSourceProfilePacketFillValueEnt sspmSourceProfilePacketFillValue;

                        public final SspmSourceProfileTOSEnt sspmSourceProfileTOS;

                        public final SspmSourceProfileFlowLabelEnt sspmSourceProfileFlowLabel;

                        public final SspmSourceProfileLooseSrcRteFillEnt sspmSourceProfileLooseSrcRteFill;

                        public final SspmSourceProfileLooseSrcRteLenEnt sspmSourceProfileLooseSrcRteLen;

                        public final SspmSourceProfileTTLEnt sspmSourceProfileTTL;

                        public final SspmSourceProfileNoFragEnt sspmSourceProfileNoFrag;

                        public final SspmSourceProfile8021TaggingEnt sspmSourceProfile8021Tagging;

                        public final SspmSourceProfileUsernameEnt sspmSourceProfileUsername;

                        public final SspmSourceProfilePasswordEnt sspmSourceProfilePassword;

                        public final SspmSourceProfileParameterEnt sspmSourceProfileParameter;

                        public final SspmSourceProfileOwnerEnt sspmSourceProfileOwner;

                        public final SspmSourceProfileStorageTypeEnt sspmSourceProfileStorageType;

                        public final SspmSourceProfileStatusEnt sspmSourceProfileStatus;

                        private SspmSourceProfileEntryEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                        {
                            super(mib, parent, "sspmSourceProfileEntry", "1.3.6.1.2.1.16.28.1.2.1.1", false, false, false, true);
                            this.sspmSourceProfileInstance = new SspmSourceProfileInstanceEnt(mib, this);
                            this.sspmSourceProfileType = new SspmSourceProfileTypeEnt(mib, this);
                            this.sspmSourceProfilePacketSize = new SspmSourceProfilePacketSizeEnt(mib, this);
                            this.sspmSourceProfilePacketFillType = new SspmSourceProfilePacketFillTypeEnt(mib, this);
                            this.sspmSourceProfilePacketFillValue = new SspmSourceProfilePacketFillValueEnt(mib, this);
                            this.sspmSourceProfileTOS = new SspmSourceProfileTOSEnt(mib, this);
                            this.sspmSourceProfileFlowLabel = new SspmSourceProfileFlowLabelEnt(mib, this);
                            this.sspmSourceProfileLooseSrcRteFill = new SspmSourceProfileLooseSrcRteFillEnt(mib, this);
                            this.sspmSourceProfileLooseSrcRteLen = new SspmSourceProfileLooseSrcRteLenEnt(mib, this);
                            this.sspmSourceProfileTTL = new SspmSourceProfileTTLEnt(mib, this);
                            this.sspmSourceProfileNoFrag = new SspmSourceProfileNoFragEnt(mib, this);
                            this.sspmSourceProfile8021Tagging = new SspmSourceProfile8021TaggingEnt(mib, this);
                            this.sspmSourceProfileUsername = new SspmSourceProfileUsernameEnt(mib, this);
                            this.sspmSourceProfilePassword = new SspmSourceProfilePasswordEnt(mib, this);
                            this.sspmSourceProfileParameter = new SspmSourceProfileParameterEnt(mib, this);
                            this.sspmSourceProfileOwner = new SspmSourceProfileOwnerEnt(mib, this);
                            this.sspmSourceProfileStorageType = new SspmSourceProfileStorageTypeEnt(mib, this);
                            this.sspmSourceProfileStatus = new SspmSourceProfileStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sspmSourceProfileInstance,
                                this.sspmSourceProfileType,
                                this.sspmSourceProfilePacketSize,
                                this.sspmSourceProfilePacketFillType,
                                this.sspmSourceProfilePacketFillValue,
                                this.sspmSourceProfileTOS,
                                this.sspmSourceProfileFlowLabel,
                                this.sspmSourceProfileLooseSrcRteFill,
                                this.sspmSourceProfileLooseSrcRteLen,
                                this.sspmSourceProfileTTL,
                                this.sspmSourceProfileNoFrag,
                                this.sspmSourceProfile8021Tagging,
                                this.sspmSourceProfileUsername,
                                this.sspmSourceProfilePassword,
                                this.sspmSourceProfileParameter,
                                this.sspmSourceProfileOwner,
                                this.sspmSourceProfileStorageType,
                                this.sspmSourceProfileStatus
                            };
                        }
                        public static final class SspmSourceProfileInstanceEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileInstanceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileInstance", "1.3.6.1.2.1.16.28.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileType", "1.3.6.1.2.1.16.28.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfilePacketSizeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfilePacketSizeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfilePacketSize", "1.3.6.1.2.1.16.28.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfilePacketFillTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfilePacketFillTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfilePacketFillType", "1.3.6.1.2.1.16.28.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfilePacketFillValueEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfilePacketFillValueEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfilePacketFillValue", "1.3.6.1.2.1.16.28.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileTOSEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileTOSEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileTOS", "1.3.6.1.2.1.16.28.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileFlowLabelEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileFlowLabelEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileFlowLabel", "1.3.6.1.2.1.16.28.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileLooseSrcRteFillEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileLooseSrcRteFillEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileLooseSrcRteFill", "1.3.6.1.2.1.16.28.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileLooseSrcRteLenEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileLooseSrcRteLenEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileLooseSrcRteLen", "1.3.6.1.2.1.16.28.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileTTLEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileTTLEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileTTL", "1.3.6.1.2.1.16.28.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileNoFragEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileNoFragEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileNoFrag", "1.3.6.1.2.1.16.28.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfile8021TaggingEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfile8021TaggingEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfile8021Tagging", "1.3.6.1.2.1.16.28.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileUsernameEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileUsernameEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileUsername", "1.3.6.1.2.1.16.28.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfilePasswordEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfilePasswordEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfilePassword", "1.3.6.1.2.1.16.28.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileParameterEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileParameterEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileParameter", "1.3.6.1.2.1.16.28.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileOwnerEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileOwnerEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileOwner", "1.3.6.1.2.1.16.28.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileStorageTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileStorageTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileStorageType", "1.3.6.1.2.1.16.28.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceProfileStatusEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceProfileStatusEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceProfileStatus", "1.3.6.1.2.1.16.28.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SspmSourceControlTableEnt extends MIBEntry<SSPMMIBDef>
                {
                    public final SspmSourceControlEntryEnt sspmSourceControlEntry;

                    private SspmSourceControlTableEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSourceControlTable", "1.3.6.1.2.1.16.28.1.2.2", false, true, false, false);
                        this.sspmSourceControlEntry = new SspmSourceControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sspmSourceControlEntry
                        };
                    }
                    public static final class SspmSourceControlEntryEnt extends MIBEntry<SSPMMIBDef>
                    {
                        public final SspmSourceControlInstanceEnt sspmSourceControlInstance;

                        public final SspmSourceControlProfileEnt sspmSourceControlProfile;

                        public final SspmSourceControlSrcEnt sspmSourceControlSrc;

                        public final SspmSourceControlDestAddrTypeEnt sspmSourceControlDestAddrType;

                        public final SspmSourceControlDestAddrEnt sspmSourceControlDestAddr;

                        public final SspmSourceControlEnabledEnt sspmSourceControlEnabled;

                        public final SspmSourceControlTimeOutEnt sspmSourceControlTimeOut;

                        public final SspmSourceControlSamplingDistEnt sspmSourceControlSamplingDist;

                        public final SspmSourceControlFrequencyEnt sspmSourceControlFrequency;

                        public final SspmSourceControlFirstSeqNumEnt sspmSourceControlFirstSeqNum;

                        public final SspmSourceControlLastSeqNumEnt sspmSourceControlLastSeqNum;

                        public final SspmSourceControlOwnerEnt sspmSourceControlOwner;

                        public final SspmSourceControlStorageTypeEnt sspmSourceControlStorageType;

                        public final SspmSourceControlStatusEnt sspmSourceControlStatus;

                        private SspmSourceControlEntryEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                        {
                            super(mib, parent, "sspmSourceControlEntry", "1.3.6.1.2.1.16.28.1.2.2.1", false, false, false, true);
                            this.sspmSourceControlInstance = new SspmSourceControlInstanceEnt(mib, this);
                            this.sspmSourceControlProfile = new SspmSourceControlProfileEnt(mib, this);
                            this.sspmSourceControlSrc = new SspmSourceControlSrcEnt(mib, this);
                            this.sspmSourceControlDestAddrType = new SspmSourceControlDestAddrTypeEnt(mib, this);
                            this.sspmSourceControlDestAddr = new SspmSourceControlDestAddrEnt(mib, this);
                            this.sspmSourceControlEnabled = new SspmSourceControlEnabledEnt(mib, this);
                            this.sspmSourceControlTimeOut = new SspmSourceControlTimeOutEnt(mib, this);
                            this.sspmSourceControlSamplingDist = new SspmSourceControlSamplingDistEnt(mib, this);
                            this.sspmSourceControlFrequency = new SspmSourceControlFrequencyEnt(mib, this);
                            this.sspmSourceControlFirstSeqNum = new SspmSourceControlFirstSeqNumEnt(mib, this);
                            this.sspmSourceControlLastSeqNum = new SspmSourceControlLastSeqNumEnt(mib, this);
                            this.sspmSourceControlOwner = new SspmSourceControlOwnerEnt(mib, this);
                            this.sspmSourceControlStorageType = new SspmSourceControlStorageTypeEnt(mib, this);
                            this.sspmSourceControlStatus = new SspmSourceControlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sspmSourceControlInstance,
                                this.sspmSourceControlProfile,
                                this.sspmSourceControlSrc,
                                this.sspmSourceControlDestAddrType,
                                this.sspmSourceControlDestAddr,
                                this.sspmSourceControlEnabled,
                                this.sspmSourceControlTimeOut,
                                this.sspmSourceControlSamplingDist,
                                this.sspmSourceControlFrequency,
                                this.sspmSourceControlFirstSeqNum,
                                this.sspmSourceControlLastSeqNum,
                                this.sspmSourceControlOwner,
                                this.sspmSourceControlStorageType,
                                this.sspmSourceControlStatus
                            };
                        }
                        public static final class SspmSourceControlInstanceEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlInstanceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlInstance", "1.3.6.1.2.1.16.28.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlProfileEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlProfileEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlProfile", "1.3.6.1.2.1.16.28.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlSrcEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlSrcEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlSrc", "1.3.6.1.2.1.16.28.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlDestAddrTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlDestAddrTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlDestAddrType", "1.3.6.1.2.1.16.28.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlDestAddrEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlDestAddrEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlDestAddr", "1.3.6.1.2.1.16.28.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlEnabledEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlEnabledEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlEnabled", "1.3.6.1.2.1.16.28.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlTimeOutEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlTimeOutEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlTimeOut", "1.3.6.1.2.1.16.28.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlSamplingDistEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlSamplingDistEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlSamplingDist", "1.3.6.1.2.1.16.28.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlFrequencyEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlFrequencyEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlFrequency", "1.3.6.1.2.1.16.28.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlFirstSeqNumEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlFirstSeqNumEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlFirstSeqNum", "1.3.6.1.2.1.16.28.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlLastSeqNumEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlLastSeqNumEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlLastSeqNum", "1.3.6.1.2.1.16.28.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlOwnerEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlOwnerEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlOwner", "1.3.6.1.2.1.16.28.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlStorageTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlStorageTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlStorageType", "1.3.6.1.2.1.16.28.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSourceControlStatusEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSourceControlStatusEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSourceControlStatus", "1.3.6.1.2.1.16.28.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SspmSinkEnt extends MIBEntry<SSPMMIBDef>
            {
                public final SspmSinkTableEnt sspmSinkTable;

                private SspmSinkEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                {
                    super(mib, parent, "sspmSink", "1.3.6.1.2.1.16.28.1.5", false, false, false, false);
                    this.sspmSinkTable = new SspmSinkTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sspmSinkTable
                    };
                }
                public static final class SspmSinkTableEnt extends MIBEntry<SSPMMIBDef>
                {
                    public final SspmSinkEntryEnt sspmSinkEntry;

                    private SspmSinkTableEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSinkTable", "1.3.6.1.2.1.16.28.1.5.1", false, true, false, false);
                        this.sspmSinkEntry = new SspmSinkEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sspmSinkEntry
                        };
                    }
                    public static final class SspmSinkEntryEnt extends MIBEntry<SSPMMIBDef>
                    {
                        public final SspmSinkInstanceEnt sspmSinkInstance;

                        public final SspmSinkTypeEnt sspmSinkType;

                        public final SspmSinkSourceAddressTypeEnt sspmSinkSourceAddressType;

                        public final SspmSinkSourceAddressEnt sspmSinkSourceAddress;

                        public final SspmSinkExpectedRateEnt sspmSinkExpectedRate;

                        public final SspmSinkEnableEnt sspmSinkEnable;

                        public final SspmSinkExpectedFirstSequenceNumEnt sspmSinkExpectedFirstSequenceNum;

                        public final SspmSinkLastSequenceNumberEnt sspmSinkLastSequenceNumber;

                        public final SspmSinkLastSequenceInvalidEnt sspmSinkLastSequenceInvalid;

                        public final SspmSinkStorageTypeEnt sspmSinkStorageType;

                        public final SspmSinkStatusEnt sspmSinkStatus;

                        private SspmSinkEntryEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                        {
                            super(mib, parent, "sspmSinkEntry", "1.3.6.1.2.1.16.28.1.5.1.1", false, false, false, true);
                            this.sspmSinkInstance = new SspmSinkInstanceEnt(mib, this);
                            this.sspmSinkType = new SspmSinkTypeEnt(mib, this);
                            this.sspmSinkSourceAddressType = new SspmSinkSourceAddressTypeEnt(mib, this);
                            this.sspmSinkSourceAddress = new SspmSinkSourceAddressEnt(mib, this);
                            this.sspmSinkExpectedRate = new SspmSinkExpectedRateEnt(mib, this);
                            this.sspmSinkEnable = new SspmSinkEnableEnt(mib, this);
                            this.sspmSinkExpectedFirstSequenceNum = new SspmSinkExpectedFirstSequenceNumEnt(mib, this);
                            this.sspmSinkLastSequenceNumber = new SspmSinkLastSequenceNumberEnt(mib, this);
                            this.sspmSinkLastSequenceInvalid = new SspmSinkLastSequenceInvalidEnt(mib, this);
                            this.sspmSinkStorageType = new SspmSinkStorageTypeEnt(mib, this);
                            this.sspmSinkStatus = new SspmSinkStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sspmSinkInstance,
                                this.sspmSinkType,
                                this.sspmSinkSourceAddressType,
                                this.sspmSinkSourceAddress,
                                this.sspmSinkExpectedRate,
                                this.sspmSinkEnable,
                                this.sspmSinkExpectedFirstSequenceNum,
                                this.sspmSinkLastSequenceNumber,
                                this.sspmSinkLastSequenceInvalid,
                                this.sspmSinkStorageType,
                                this.sspmSinkStatus
                            };
                        }
                        public static final class SspmSinkInstanceEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkInstanceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkInstance", "1.3.6.1.2.1.16.28.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkType", "1.3.6.1.2.1.16.28.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkSourceAddressTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkSourceAddressTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkSourceAddressType", "1.3.6.1.2.1.16.28.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkSourceAddressEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkSourceAddressEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkSourceAddress", "1.3.6.1.2.1.16.28.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkExpectedRateEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkExpectedRateEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkExpectedRate", "1.3.6.1.2.1.16.28.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkEnableEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkEnableEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkEnable", "1.3.6.1.2.1.16.28.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkExpectedFirstSequenceNumEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkExpectedFirstSequenceNumEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkExpectedFirstSequenceNum", "1.3.6.1.2.1.16.28.1.5.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkLastSequenceNumberEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkLastSequenceNumberEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkLastSequenceNumber", "1.3.6.1.2.1.16.28.1.5.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkLastSequenceInvalidEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkLastSequenceInvalidEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkLastSequenceInvalid", "1.3.6.1.2.1.16.28.1.5.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkStorageTypeEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkStorageTypeEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkStorageType", "1.3.6.1.2.1.16.28.1.5.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SspmSinkStatusEnt extends MIBEntry<SSPMMIBDef>
                        {
                            private SspmSinkStatusEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                            {
                                super(mib, parent, "sspmSinkStatus", "1.3.6.1.2.1.16.28.1.5.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SspmMIBNotificationsEnt extends MIBEntry<SSPMMIBDef>
        {
            private SspmMIBNotificationsEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
            {
                super(mib, parent, "sspmMIBNotifications", "1.3.6.1.2.1.16.28.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SspmMIBConformanceEnt extends MIBEntry<SSPMMIBDef>
        {
            /** Notifications
Conformance information*/
            public final SspmCompliancesEnt sspmCompliances;

            public final SspmGroupsEnt sspmGroups;

            private SspmMIBConformanceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
            {
                super(mib, parent, "sspmMIBConformance", "1.3.6.1.2.1.16.28.3", false, false, false, false);
                this.sspmCompliances = new SspmCompliancesEnt(mib, this);
                this.sspmGroups = new SspmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sspmCompliances,
                    this.sspmGroups
                };
            }
            public static final class SspmCompliancesEnt extends MIBEntry<SSPMMIBDef>
            {
                /** Compliance Statements*/
                public final SspmGeneralComplianceEnt sspmGeneralCompliance;

                /** SSPM Source Compliance*/
                public final SspmSourceFullComplianceEnt sspmSourceFullCompliance;

                /** SSPM Sink Compliance*/
                public final SspmSinkFullComplianceEnt sspmSinkFullCompliance;

                private SspmCompliancesEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                {
                    super(mib, parent, "sspmCompliances", "1.3.6.1.2.1.16.28.3.1", false, false, false, false);
                    this.sspmGeneralCompliance = new SspmGeneralComplianceEnt(mib, this);
                    this.sspmSourceFullCompliance = new SspmSourceFullComplianceEnt(mib, this);
                    this.sspmSinkFullCompliance = new SspmSinkFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sspmGeneralCompliance,
                        this.sspmSourceFullCompliance,
                        this.sspmSinkFullCompliance
                    };
                }
                public static final class SspmGeneralComplianceEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmGeneralComplianceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmGeneralCompliance", "1.3.6.1.2.1.16.28.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmSourceFullComplianceEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmSourceFullComplianceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSourceFullCompliance", "1.3.6.1.2.1.16.28.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmSinkFullComplianceEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmSinkFullComplianceEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSinkFullCompliance", "1.3.6.1.2.1.16.28.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SspmGroupsEnt extends MIBEntry<SSPMMIBDef>
            {
                /** Groups*/
                public final SspmGeneralGroupEnt sspmGeneralGroup;

                public final SspmSourceGroupEnt sspmSourceGroup;

                public final SspmUserPassGroupEnt sspmUserPassGroup;

                public final SspmSinkGroupEnt sspmSinkGroup;

                private SspmGroupsEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                {
                    super(mib, parent, "sspmGroups", "1.3.6.1.2.1.16.28.3.2", false, false, false, false);
                    this.sspmGeneralGroup = new SspmGeneralGroupEnt(mib, this);
                    this.sspmSourceGroup = new SspmSourceGroupEnt(mib, this);
                    this.sspmUserPassGroup = new SspmUserPassGroupEnt(mib, this);
                    this.sspmSinkGroup = new SspmSinkGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sspmGeneralGroup,
                        this.sspmSourceGroup,
                        this.sspmUserPassGroup,
                        this.sspmSinkGroup
                    };
                }
                public static final class SspmGeneralGroupEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmGeneralGroupEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmGeneralGroup", "1.3.6.1.2.1.16.28.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmSourceGroupEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmSourceGroupEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSourceGroup", "1.3.6.1.2.1.16.28.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmUserPassGroupEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmUserPassGroupEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmUserPassGroup", "1.3.6.1.2.1.16.28.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SspmSinkGroupEnt extends MIBEntry<SSPMMIBDef>
                {
                    private SspmSinkGroupEnt(SSPMMIBDef mib, MIBEntry<SSPMMIBDef> parent)
                    {
                        super(mib, parent, "sspmSinkGroup", "1.3.6.1.2.1.16.28.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
