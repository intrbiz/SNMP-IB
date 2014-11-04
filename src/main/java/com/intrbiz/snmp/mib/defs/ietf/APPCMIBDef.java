package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**end of conformance statement*/
public final class APPCMIBDef extends MIB
{
    public static final APPCMIBDef APPCMIB = new APPCMIBDef();

    static { MIBs.getInstance().registerMIB(APPCMIBDef.APPCMIB); }

    public final AppcMIBEnt appcMIB;

    private APPCMIBDef()
    {
        super("APPC-MIB");
        this.appcMIB = new AppcMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.appcMIB
        };
    }

    public static final class AppcMIBEnt extends MIBEntry<APPCMIBDef>
    {
        public final AppcObjectsEnt appcObjects;

        /** ***************************************************************Conformance information****************************************************************/
        public final AppcConformanceEnt appcConformance;

        private AppcMIBEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
        {
            super(mib, parent, "appcMIB", "1.3.6.1.2.1.34.3", false, false, false, false);
            this.appcObjects = new AppcObjectsEnt(mib, this);
            this.appcConformance = new AppcConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.appcObjects,
                this.appcConformance
            };
        }
        public static final class AppcObjectsEnt extends MIBEntry<APPCMIBDef>
        {
            public final AppcGlobalEnt appcGlobal;

            public final AppcLuEnt appcLu;

            public final AppcTpEnt appcTp;

            public final AppcSessionEnt appcSession;

            public final AppcConversationEnt appcConversation;

            public final AppcCPICEnt appcCPIC;

            private AppcObjectsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
            {
                super(mib, parent, "appcObjects", "1.3.6.1.2.1.34.3.1", false, false, false, false);
                this.appcGlobal = new AppcGlobalEnt(mib, this);
                this.appcLu = new AppcLuEnt(mib, this);
                this.appcTp = new AppcTpEnt(mib, this);
                this.appcSession = new AppcSessionEnt(mib, this);
                this.appcConversation = new AppcConversationEnt(mib, this);
                this.appcCPIC = new AppcCPICEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.appcGlobal,
                    this.appcLu,
                    this.appcTp,
                    this.appcSession,
                    this.appcConversation,
                    this.appcCPIC
                };
            }
            public static final class AppcGlobalEnt extends MIBEntry<APPCMIBDef>
            {
                /** *********************************************************************APPC Control Objects-----------------------------------The following objects allow:* the collection of APPC Session information countersto be started and stopped* the collection of APPC Session RSCVsto be started and stopped* the collection of APPC tracing information to be started andstoppedThese objects are for implementations that wish to providethis level of operational control.  This group isconditionally mandatory in the conformance section of the MIB.*********************************************************************
*********************************************************************Control AdminThese objects contain the desired states for the controls.The actual states are in the Oper objects.**********************************************************************/
                public final AppcCntrlAdminGroupEnt appcCntrlAdminGroup;

                /** *********************************************************************
Control OperThese objects contain the actual states of the controls.**********************************************************************/
                public final AppcCntrlOperGroupEnt appcCntrlOperGroup;

                /** ******************************************************************
APPC global settings*******************************************************************/
                public final AppcGlobalObjectsEnt appcGlobalObjects;

                /** ******************************************************************APPC CNOS controlThis group contains objects for issuing APPC Change-Number-of-Session(CNOS) commands to a specific mode.  Specifically, the commandssupported are:INITIALIZE_SESSION_LIMITCHANGE_SESSION_LIMITRESET_SESSION_LIMIT*******************************************************************/
                public final AppcCnosControlEnt appcCnosControl;

                private AppcGlobalEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcGlobal", "1.3.6.1.2.1.34.3.1.1", false, false, false, false);
                    this.appcCntrlAdminGroup = new AppcCntrlAdminGroupEnt(mib, this);
                    this.appcCntrlOperGroup = new AppcCntrlOperGroupEnt(mib, this);
                    this.appcGlobalObjects = new AppcGlobalObjectsEnt(mib, this);
                    this.appcCnosControl = new AppcCnosControlEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcCntrlAdminGroup,
                        this.appcCntrlOperGroup,
                        this.appcGlobalObjects,
                        this.appcCnosControl
                    };
                }
                public static final class AppcCntrlAdminGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcCntrlAdminStatEnt appcCntrlAdminStat;

                    public final AppcCntrlAdminRscvEnt appcCntrlAdminRscv;

                    public final AppcCntrlAdminTraceEnt appcCntrlAdminTrace;

                    public final AppcCntrlAdminTraceParmEnt appcCntrlAdminTraceParm;

                    private AppcCntrlAdminGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCntrlAdminGroup", "1.3.6.1.2.1.34.3.1.1.1", false, false, false, false);
                        this.appcCntrlAdminStat = new AppcCntrlAdminStatEnt(mib, this);
                        this.appcCntrlAdminRscv = new AppcCntrlAdminRscvEnt(mib, this);
                        this.appcCntrlAdminTrace = new AppcCntrlAdminTraceEnt(mib, this);
                        this.appcCntrlAdminTraceParm = new AppcCntrlAdminTraceParmEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcCntrlAdminStat,
                            this.appcCntrlAdminRscv,
                            this.appcCntrlAdminTrace,
                            this.appcCntrlAdminTraceParm
                        };
                    }
                    public static final class AppcCntrlAdminStatEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlAdminStatEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlAdminStat", "1.3.6.1.2.1.34.3.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlAdminRscvEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlAdminRscvEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlAdminRscv", "1.3.6.1.2.1.34.3.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlAdminTraceEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlAdminTraceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlAdminTrace", "1.3.6.1.2.1.34.3.1.1.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlAdminTraceParmEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlAdminTraceParmEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlAdminTraceParm", "1.3.6.1.2.1.34.3.1.1.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppcCntrlOperGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcCntrlOperStatEnt appcCntrlOperStat;

                    public final AppcCntrlOperStatTimeEnt appcCntrlOperStatTime;

                    public final AppcCntrlOperRscvEnt appcCntrlOperRscv;

                    public final AppcCntrlOperRscvTimeEnt appcCntrlOperRscvTime;

                    public final AppcCntrlOperTraceEnt appcCntrlOperTrace;

                    public final AppcCntrlOperTraceTimeEnt appcCntrlOperTraceTime;

                    public final AppcCntrlOperTraceParmEnt appcCntrlOperTraceParm;

                    private AppcCntrlOperGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCntrlOperGroup", "1.3.6.1.2.1.34.3.1.1.2", false, false, false, false);
                        this.appcCntrlOperStat = new AppcCntrlOperStatEnt(mib, this);
                        this.appcCntrlOperStatTime = new AppcCntrlOperStatTimeEnt(mib, this);
                        this.appcCntrlOperRscv = new AppcCntrlOperRscvEnt(mib, this);
                        this.appcCntrlOperRscvTime = new AppcCntrlOperRscvTimeEnt(mib, this);
                        this.appcCntrlOperTrace = new AppcCntrlOperTraceEnt(mib, this);
                        this.appcCntrlOperTraceTime = new AppcCntrlOperTraceTimeEnt(mib, this);
                        this.appcCntrlOperTraceParm = new AppcCntrlOperTraceParmEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcCntrlOperStat,
                            this.appcCntrlOperStatTime,
                            this.appcCntrlOperRscv,
                            this.appcCntrlOperRscvTime,
                            this.appcCntrlOperTrace,
                            this.appcCntrlOperTraceTime,
                            this.appcCntrlOperTraceParm
                        };
                    }
                    public static final class AppcCntrlOperStatEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperStatEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperStat", "1.3.6.1.2.1.34.3.1.1.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlOperStatTimeEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperStatTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperStatTime", "1.3.6.1.2.1.34.3.1.1.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlOperRscvEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperRscvEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperRscv", "1.3.6.1.2.1.34.3.1.1.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlOperRscvTimeEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperRscvTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperRscvTime", "1.3.6.1.2.1.34.3.1.1.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlOperTraceEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperTraceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperTrace", "1.3.6.1.2.1.34.3.1.1.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlOperTraceTimeEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperTraceTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperTraceTime", "1.3.6.1.2.1.34.3.1.1.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCntrlOperTraceParmEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCntrlOperTraceParmEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCntrlOperTraceParm", "1.3.6.1.2.1.34.3.1.1.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppcGlobalObjectsEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcUpTimeEnt appcUpTime;

                    public final AppcDefaultModeNameEnt appcDefaultModeName;

                    public final AppcDefaultLuNameEnt appcDefaultLuName;

                    public final AppcDefaultImplInbndPluEnt appcDefaultImplInbndPlu;

                    public final AppcDefaultMaxMcLlSndSizeEnt appcDefaultMaxMcLlSndSize;

                    public final AppcDefaultFileSpecEnt appcDefaultFileSpec;

                    public final AppcDefaultTpOperationEnt appcDefaultTpOperation;

                    public final AppcDefaultTpConvSecRqdEnt appcDefaultTpConvSecRqd;

                    public final AppcLocalCpNameEnt appcLocalCpName;

                    public final AppcActiveSessionsEnt appcActiveSessions;

                    public final AppcActiveHprSessionsEnt appcActiveHprSessions;

                    private AppcGlobalObjectsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcGlobalObjects", "1.3.6.1.2.1.34.3.1.1.3", false, false, false, false);
                        this.appcUpTime = new AppcUpTimeEnt(mib, this);
                        this.appcDefaultModeName = new AppcDefaultModeNameEnt(mib, this);
                        this.appcDefaultLuName = new AppcDefaultLuNameEnt(mib, this);
                        this.appcDefaultImplInbndPlu = new AppcDefaultImplInbndPluEnt(mib, this);
                        this.appcDefaultMaxMcLlSndSize = new AppcDefaultMaxMcLlSndSizeEnt(mib, this);
                        this.appcDefaultFileSpec = new AppcDefaultFileSpecEnt(mib, this);
                        this.appcDefaultTpOperation = new AppcDefaultTpOperationEnt(mib, this);
                        this.appcDefaultTpConvSecRqd = new AppcDefaultTpConvSecRqdEnt(mib, this);
                        this.appcLocalCpName = new AppcLocalCpNameEnt(mib, this);
                        this.appcActiveSessions = new AppcActiveSessionsEnt(mib, this);
                        this.appcActiveHprSessions = new AppcActiveHprSessionsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcUpTime,
                            this.appcDefaultModeName,
                            this.appcDefaultLuName,
                            this.appcDefaultImplInbndPlu,
                            this.appcDefaultMaxMcLlSndSize,
                            this.appcDefaultFileSpec,
                            this.appcDefaultTpOperation,
                            this.appcDefaultTpConvSecRqd,
                            this.appcLocalCpName,
                            this.appcActiveSessions,
                            this.appcActiveHprSessions
                        };
                    }
                    public static final class AppcUpTimeEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcUpTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcUpTime", "1.3.6.1.2.1.34.3.1.1.3.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultModeNameEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultModeName", "1.3.6.1.2.1.34.3.1.1.3.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultLuNameEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultLuName", "1.3.6.1.2.1.34.3.1.1.3.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultImplInbndPluEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultImplInbndPluEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultImplInbndPlu", "1.3.6.1.2.1.34.3.1.1.3.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultMaxMcLlSndSizeEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultMaxMcLlSndSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultMaxMcLlSndSize", "1.3.6.1.2.1.34.3.1.1.3.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultFileSpecEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultFileSpecEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultFileSpec", "1.3.6.1.2.1.34.3.1.1.3.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultTpOperationEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultTpOperationEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultTpOperation", "1.3.6.1.2.1.34.3.1.1.3.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcDefaultTpConvSecRqdEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcDefaultTpConvSecRqdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcDefaultTpConvSecRqd", "1.3.6.1.2.1.34.3.1.1.3.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcLocalCpNameEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcLocalCpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcLocalCpName", "1.3.6.1.2.1.34.3.1.1.3.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcActiveSessionsEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcActiveSessionsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcActiveSessions", "1.3.6.1.2.1.34.3.1.1.3.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcActiveHprSessionsEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcActiveHprSessionsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcActiveHprSessions", "1.3.6.1.2.1.34.3.1.1.3.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppcCnosControlEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcCnosCommandEnt appcCnosCommand;

                    public final AppcCnosMaxSessLimitEnt appcCnosMaxSessLimit;

                    public final AppcCnosMinCwinLimitEnt appcCnosMinCwinLimit;

                    public final AppcCnosMinClosLimitEnt appcCnosMinClosLimit;

                    public final AppcCnosDrainSelfEnt appcCnosDrainSelf;

                    public final AppcCnosDrainPartEnt appcCnosDrainPart;

                    public final AppcCnosResponsibleEnt appcCnosResponsible;

                    public final AppcCnosForceEnt appcCnosForce;

                    public final AppcCnosTargetLocLuNameEnt appcCnosTargetLocLuName;

                    public final AppcCnosTargetParLuNameEnt appcCnosTargetParLuName;

                    public final AppcCnosTargetModeNameEnt appcCnosTargetModeName;

                    private AppcCnosControlEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCnosControl", "1.3.6.1.2.1.34.3.1.1.4", false, false, false, false);
                        this.appcCnosCommand = new AppcCnosCommandEnt(mib, this);
                        this.appcCnosMaxSessLimit = new AppcCnosMaxSessLimitEnt(mib, this);
                        this.appcCnosMinCwinLimit = new AppcCnosMinCwinLimitEnt(mib, this);
                        this.appcCnosMinClosLimit = new AppcCnosMinClosLimitEnt(mib, this);
                        this.appcCnosDrainSelf = new AppcCnosDrainSelfEnt(mib, this);
                        this.appcCnosDrainPart = new AppcCnosDrainPartEnt(mib, this);
                        this.appcCnosResponsible = new AppcCnosResponsibleEnt(mib, this);
                        this.appcCnosForce = new AppcCnosForceEnt(mib, this);
                        this.appcCnosTargetLocLuName = new AppcCnosTargetLocLuNameEnt(mib, this);
                        this.appcCnosTargetParLuName = new AppcCnosTargetParLuNameEnt(mib, this);
                        this.appcCnosTargetModeName = new AppcCnosTargetModeNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcCnosCommand,
                            this.appcCnosMaxSessLimit,
                            this.appcCnosMinCwinLimit,
                            this.appcCnosMinClosLimit,
                            this.appcCnosDrainSelf,
                            this.appcCnosDrainPart,
                            this.appcCnosResponsible,
                            this.appcCnosForce,
                            this.appcCnosTargetLocLuName,
                            this.appcCnosTargetParLuName,
                            this.appcCnosTargetModeName
                        };
                    }
                    public static final class AppcCnosCommandEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosCommandEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosCommand", "1.3.6.1.2.1.34.3.1.1.4.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosMaxSessLimitEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosMaxSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosMaxSessLimit", "1.3.6.1.2.1.34.3.1.1.4.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosMinCwinLimitEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosMinCwinLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosMinCwinLimit", "1.3.6.1.2.1.34.3.1.1.4.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosMinClosLimitEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosMinClosLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosMinClosLimit", "1.3.6.1.2.1.34.3.1.1.4.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosDrainSelfEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosDrainSelfEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosDrainSelf", "1.3.6.1.2.1.34.3.1.1.4.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosDrainPartEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosDrainPartEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosDrainPart", "1.3.6.1.2.1.34.3.1.1.4.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosResponsibleEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosResponsibleEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosResponsible", "1.3.6.1.2.1.34.3.1.1.4.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosForceEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosForceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosForce", "1.3.6.1.2.1.34.3.1.1.4.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosTargetLocLuNameEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosTargetLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosTargetLocLuName", "1.3.6.1.2.1.34.3.1.1.4.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosTargetParLuNameEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosTargetParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosTargetParLuName", "1.3.6.1.2.1.34.3.1.1.4.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppcCnosTargetModeNameEnt extends MIBEntry<APPCMIBDef>
                    {
                        private AppcCnosTargetModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCnosTargetModeName", "1.3.6.1.2.1.34.3.1.1.4.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AppcLuEnt extends MIBEntry<APPCMIBDef>
            {
                /** *********************************************************************APPC LU information-----------------------------------Local LUPartner LUMode*********************************************************************
*********************************************************************APPC Local LUThe entries in the following tables provide information forindependent and dependent LU 6.2.*********************************************************************
*********************************************************************APPC Local LU Admin TableObjects in this table contain default or expected configurationvalues for local 6.2 LUs.**********************************************************************/
                public final AppcLluAdminTableEnt appcLluAdminTable;

                /** *********************************************************************APPC Local LU Oper Table
Objects in this table contain current operational values, suchas state values or negotiated parameters, for local 6.2 LUs.**********************************************************************/
                public final AppcLluOperTableEnt appcLluOperTable;

                /** *********************************************************************APPC LU Pair Admin TableObjects in this table contain default or expected configurationvalues for 6.2 LU pairs.  An LU pair consists of a local LU anda partner LU, which may or may not be local.**********************************************************************/
                public final AppcLuPairAdminTableEnt appcLuPairAdminTable;

                /** *********************************************************************APPC LU Pair Oper TableObjects in this table contain current operational values, suchas state values or negotiated parameters, for 6.2 LU pairs.**********************************************************************/
                public final AppcLuPairOperTableEnt appcLuPairOperTable;

                /** *********************************************************************APPC Mode Admin TableObjects in this table contain default or expected configurationvalues for session modes.Modes that have active sessions appear in the appcModeOperTable.**********************************************************************/
                public final AppcModeAdminTableEnt appcModeAdminTable;

                /** *********************************************************************APPC Mode Oper TableObjects in this table contain current operational values, suchas state values or negotiated parameters, for session modes.**********************************************************************/
                public final AppcModeOperTableEnt appcModeOperTable;

                private AppcLuEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcLu", "1.3.6.1.2.1.34.3.1.2", false, false, false, false);
                    this.appcLluAdminTable = new AppcLluAdminTableEnt(mib, this);
                    this.appcLluOperTable = new AppcLluOperTableEnt(mib, this);
                    this.appcLuPairAdminTable = new AppcLuPairAdminTableEnt(mib, this);
                    this.appcLuPairOperTable = new AppcLuPairOperTableEnt(mib, this);
                    this.appcModeAdminTable = new AppcModeAdminTableEnt(mib, this);
                    this.appcModeOperTable = new AppcModeOperTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcLluAdminTable,
                        this.appcLluOperTable,
                        this.appcLuPairAdminTable,
                        this.appcLuPairOperTable,
                        this.appcModeAdminTable,
                        this.appcModeOperTable
                    };
                }
                public static final class AppcLluAdminTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcLluAdminEntryEnt appcLluAdminEntry;

                    private AppcLluAdminTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcLluAdminTable", "1.3.6.1.2.1.34.3.1.2.1", false, true, false, false);
                        this.appcLluAdminEntry = new AppcLluAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcLluAdminEntry
                        };
                    }
                    public static final class AppcLluAdminEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcLluAdminNameEnt appcLluAdminName;

                        public final AppcLluAdminDepTypeEnt appcLluAdminDepType;

                        public final AppcLluAdminLocalAddressEnt appcLluAdminLocalAddress;

                        public final AppcLluAdminSessLimitEnt appcLluAdminSessLimit;

                        public final AppcLluAdminBindRspMayQEnt appcLluAdminBindRspMayQ;

                        public final AppcLluAdminCompressionEnt appcLluAdminCompression;

                        public final AppcLluAdminInBoundCompLevelEnt appcLluAdminInBoundCompLevel;

                        public final AppcLluAdminOutBoundCompLevelEnt appcLluAdminOutBoundCompLevel;

                        public final AppcLluAdminCompRleBeforeLZEnt appcLluAdminCompRleBeforeLZ;

                        public final AppcLluAdminAliasEnt appcLluAdminAlias;

                        private AppcLluAdminEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcLluAdminEntry", "1.3.6.1.2.1.34.3.1.2.1.1", false, false, false, true);
                            this.appcLluAdminName = new AppcLluAdminNameEnt(mib, this);
                            this.appcLluAdminDepType = new AppcLluAdminDepTypeEnt(mib, this);
                            this.appcLluAdminLocalAddress = new AppcLluAdminLocalAddressEnt(mib, this);
                            this.appcLluAdminSessLimit = new AppcLluAdminSessLimitEnt(mib, this);
                            this.appcLluAdminBindRspMayQ = new AppcLluAdminBindRspMayQEnt(mib, this);
                            this.appcLluAdminCompression = new AppcLluAdminCompressionEnt(mib, this);
                            this.appcLluAdminInBoundCompLevel = new AppcLluAdminInBoundCompLevelEnt(mib, this);
                            this.appcLluAdminOutBoundCompLevel = new AppcLluAdminOutBoundCompLevelEnt(mib, this);
                            this.appcLluAdminCompRleBeforeLZ = new AppcLluAdminCompRleBeforeLZEnt(mib, this);
                            this.appcLluAdminAlias = new AppcLluAdminAliasEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcLluAdminName,
                                this.appcLluAdminDepType,
                                this.appcLluAdminLocalAddress,
                                this.appcLluAdminSessLimit,
                                this.appcLluAdminBindRspMayQ,
                                this.appcLluAdminCompression,
                                this.appcLluAdminInBoundCompLevel,
                                this.appcLluAdminOutBoundCompLevel,
                                this.appcLluAdminCompRleBeforeLZ,
                                this.appcLluAdminAlias
                            };
                        }
                        public static final class AppcLluAdminNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminName", "1.3.6.1.2.1.34.3.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminDepTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminDepTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminDepType", "1.3.6.1.2.1.34.3.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminLocalAddressEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminLocalAddressEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminLocalAddress", "1.3.6.1.2.1.34.3.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminSessLimit", "1.3.6.1.2.1.34.3.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminBindRspMayQEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminBindRspMayQEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminBindRspMayQ", "1.3.6.1.2.1.34.3.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminCompressionEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminCompressionEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminCompression", "1.3.6.1.2.1.34.3.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminInBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminInBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminInBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminOutBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminOutBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminOutBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminCompRleBeforeLZEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminCompRleBeforeLZEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminCompRleBeforeLZ", "1.3.6.1.2.1.34.3.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluAdminAliasEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluAdminAliasEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluAdminAlias", "1.3.6.1.2.1.34.3.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcLluOperTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcLluOperEntryEnt appcLluOperEntry;

                    private AppcLluOperTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcLluOperTable", "1.3.6.1.2.1.34.3.1.2.2", false, true, false, false);
                        this.appcLluOperEntry = new AppcLluOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcLluOperEntry
                        };
                    }
                    public static final class AppcLluOperEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcLluOperNameEnt appcLluOperName;

                        public final AppcLluOperDepTypeEnt appcLluOperDepType;

                        public final AppcLluOperLocalAddressEnt appcLluOperLocalAddress;

                        public final AppcLluOperSessLimitEnt appcLluOperSessLimit;

                        public final AppcLluOperBindRspMayQEnt appcLluOperBindRspMayQ;

                        public final AppcLluOperCompressionEnt appcLluOperCompression;

                        public final AppcLluOperInBoundCompLevelEnt appcLluOperInBoundCompLevel;

                        public final AppcLluOperOutBoundCompLevelEnt appcLluOperOutBoundCompLevel;

                        public final AppcLluOperCompRleBeforeLZEnt appcLluOperCompRleBeforeLZ;

                        public final AppcLluOperAliasEnt appcLluOperAlias;

                        public final AppcLluOperActiveSessionsEnt appcLluOperActiveSessions;

                        private AppcLluOperEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcLluOperEntry", "1.3.6.1.2.1.34.3.1.2.2.1", false, false, false, true);
                            this.appcLluOperName = new AppcLluOperNameEnt(mib, this);
                            this.appcLluOperDepType = new AppcLluOperDepTypeEnt(mib, this);
                            this.appcLluOperLocalAddress = new AppcLluOperLocalAddressEnt(mib, this);
                            this.appcLluOperSessLimit = new AppcLluOperSessLimitEnt(mib, this);
                            this.appcLluOperBindRspMayQ = new AppcLluOperBindRspMayQEnt(mib, this);
                            this.appcLluOperCompression = new AppcLluOperCompressionEnt(mib, this);
                            this.appcLluOperInBoundCompLevel = new AppcLluOperInBoundCompLevelEnt(mib, this);
                            this.appcLluOperOutBoundCompLevel = new AppcLluOperOutBoundCompLevelEnt(mib, this);
                            this.appcLluOperCompRleBeforeLZ = new AppcLluOperCompRleBeforeLZEnt(mib, this);
                            this.appcLluOperAlias = new AppcLluOperAliasEnt(mib, this);
                            this.appcLluOperActiveSessions = new AppcLluOperActiveSessionsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcLluOperName,
                                this.appcLluOperDepType,
                                this.appcLluOperLocalAddress,
                                this.appcLluOperSessLimit,
                                this.appcLluOperBindRspMayQ,
                                this.appcLluOperCompression,
                                this.appcLluOperInBoundCompLevel,
                                this.appcLluOperOutBoundCompLevel,
                                this.appcLluOperCompRleBeforeLZ,
                                this.appcLluOperAlias,
                                this.appcLluOperActiveSessions
                            };
                        }
                        public static final class AppcLluOperNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperName", "1.3.6.1.2.1.34.3.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperDepTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperDepTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperDepType", "1.3.6.1.2.1.34.3.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperLocalAddressEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperLocalAddressEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperLocalAddress", "1.3.6.1.2.1.34.3.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperSessLimit", "1.3.6.1.2.1.34.3.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperBindRspMayQEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperBindRspMayQEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperBindRspMayQ", "1.3.6.1.2.1.34.3.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperCompressionEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperCompressionEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperCompression", "1.3.6.1.2.1.34.3.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperInBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperInBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperInBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperOutBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperOutBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperOutBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperCompRleBeforeLZEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperCompRleBeforeLZEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperCompRleBeforeLZ", "1.3.6.1.2.1.34.3.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperAliasEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperAliasEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperAlias", "1.3.6.1.2.1.34.3.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLluOperActiveSessionsEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLluOperActiveSessionsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLluOperActiveSessions", "1.3.6.1.2.1.34.3.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcLuPairAdminTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcLuPairAdminEntryEnt appcLuPairAdminEntry;

                    private AppcLuPairAdminTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcLuPairAdminTable", "1.3.6.1.2.1.34.3.1.2.3", false, true, false, false);
                        this.appcLuPairAdminEntry = new AppcLuPairAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcLuPairAdminEntry
                        };
                    }
                    public static final class AppcLuPairAdminEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcLuPairAdminLocLuNameEnt appcLuPairAdminLocLuName;

                        public final AppcLuPairAdminParLuNameEnt appcLuPairAdminParLuName;

                        public final AppcLuPairAdminParLuAliasEnt appcLuPairAdminParLuAlias;

                        public final AppcLuPairAdminSessLimitEnt appcLuPairAdminSessLimit;

                        public final AppcLuPairAdminSessSecEnt appcLuPairAdminSessSec;

                        public final AppcLuPairAdminSecAcceptEnt appcLuPairAdminSecAccept;

                        public final AppcLuPairAdminLinkObjIdEnt appcLuPairAdminLinkObjId;

                        public final AppcLuPairAdminParaSessSupEnt appcLuPairAdminParaSessSup;

                        private AppcLuPairAdminEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcLuPairAdminEntry", "1.3.6.1.2.1.34.3.1.2.3.1", false, false, false, true);
                            this.appcLuPairAdminLocLuName = new AppcLuPairAdminLocLuNameEnt(mib, this);
                            this.appcLuPairAdminParLuName = new AppcLuPairAdminParLuNameEnt(mib, this);
                            this.appcLuPairAdminParLuAlias = new AppcLuPairAdminParLuAliasEnt(mib, this);
                            this.appcLuPairAdminSessLimit = new AppcLuPairAdminSessLimitEnt(mib, this);
                            this.appcLuPairAdminSessSec = new AppcLuPairAdminSessSecEnt(mib, this);
                            this.appcLuPairAdminSecAccept = new AppcLuPairAdminSecAcceptEnt(mib, this);
                            this.appcLuPairAdminLinkObjId = new AppcLuPairAdminLinkObjIdEnt(mib, this);
                            this.appcLuPairAdminParaSessSup = new AppcLuPairAdminParaSessSupEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcLuPairAdminLocLuName,
                                this.appcLuPairAdminParLuName,
                                this.appcLuPairAdminParLuAlias,
                                this.appcLuPairAdminSessLimit,
                                this.appcLuPairAdminSessSec,
                                this.appcLuPairAdminSecAccept,
                                this.appcLuPairAdminLinkObjId,
                                this.appcLuPairAdminParaSessSup
                            };
                        }
                        public static final class AppcLuPairAdminLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminLocLuName", "1.3.6.1.2.1.34.3.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminParLuName", "1.3.6.1.2.1.34.3.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminParLuAliasEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminParLuAliasEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminParLuAlias", "1.3.6.1.2.1.34.3.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminSessLimit", "1.3.6.1.2.1.34.3.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminSessSecEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminSessSecEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminSessSec", "1.3.6.1.2.1.34.3.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminSecAcceptEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminSecAcceptEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminSecAccept", "1.3.6.1.2.1.34.3.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminLinkObjIdEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminLinkObjIdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminLinkObjId", "1.3.6.1.2.1.34.3.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairAdminParaSessSupEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairAdminParaSessSupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairAdminParaSessSup", "1.3.6.1.2.1.34.3.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcLuPairOperTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcLuPairOperEntryEnt appcLuPairOperEntry;

                    private AppcLuPairOperTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcLuPairOperTable", "1.3.6.1.2.1.34.3.1.2.4", false, true, false, false);
                        this.appcLuPairOperEntry = new AppcLuPairOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcLuPairOperEntry
                        };
                    }
                    public static final class AppcLuPairOperEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcLuPairOperLocLuNameEnt appcLuPairOperLocLuName;

                        public final AppcLuPairOperParLuNameEnt appcLuPairOperParLuName;

                        public final AppcLuPairOperParLuAliasEnt appcLuPairOperParLuAlias;

                        public final AppcLuPairOperSessLimitEnt appcLuPairOperSessLimit;

                        public final AppcLuPairOperSessSecEnt appcLuPairOperSessSec;

                        public final AppcLuPairOperSecAcceptEnt appcLuPairOperSecAccept;

                        public final AppcLuPairOperLinkObjIdEnt appcLuPairOperLinkObjId;

                        public final AppcLuPairOperParaSessSupEnt appcLuPairOperParaSessSup;

                        public final AppcLuPairOperParaSessSupLSEnt appcLuPairOperParaSessSupLS;

                        public final AppcLuPairOperStateEnt appcLuPairOperState;

                        private AppcLuPairOperEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcLuPairOperEntry", "1.3.6.1.2.1.34.3.1.2.4.1", false, false, false, true);
                            this.appcLuPairOperLocLuName = new AppcLuPairOperLocLuNameEnt(mib, this);
                            this.appcLuPairOperParLuName = new AppcLuPairOperParLuNameEnt(mib, this);
                            this.appcLuPairOperParLuAlias = new AppcLuPairOperParLuAliasEnt(mib, this);
                            this.appcLuPairOperSessLimit = new AppcLuPairOperSessLimitEnt(mib, this);
                            this.appcLuPairOperSessSec = new AppcLuPairOperSessSecEnt(mib, this);
                            this.appcLuPairOperSecAccept = new AppcLuPairOperSecAcceptEnt(mib, this);
                            this.appcLuPairOperLinkObjId = new AppcLuPairOperLinkObjIdEnt(mib, this);
                            this.appcLuPairOperParaSessSup = new AppcLuPairOperParaSessSupEnt(mib, this);
                            this.appcLuPairOperParaSessSupLS = new AppcLuPairOperParaSessSupLSEnt(mib, this);
                            this.appcLuPairOperState = new AppcLuPairOperStateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcLuPairOperLocLuName,
                                this.appcLuPairOperParLuName,
                                this.appcLuPairOperParLuAlias,
                                this.appcLuPairOperSessLimit,
                                this.appcLuPairOperSessSec,
                                this.appcLuPairOperSecAccept,
                                this.appcLuPairOperLinkObjId,
                                this.appcLuPairOperParaSessSup,
                                this.appcLuPairOperParaSessSupLS,
                                this.appcLuPairOperState
                            };
                        }
                        public static final class AppcLuPairOperLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperLocLuName", "1.3.6.1.2.1.34.3.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperParLuName", "1.3.6.1.2.1.34.3.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperParLuAliasEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperParLuAliasEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperParLuAlias", "1.3.6.1.2.1.34.3.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperSessLimit", "1.3.6.1.2.1.34.3.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperSessSecEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperSessSecEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperSessSec", "1.3.6.1.2.1.34.3.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperSecAcceptEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperSecAcceptEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperSecAccept", "1.3.6.1.2.1.34.3.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperLinkObjIdEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperLinkObjIdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperLinkObjId", "1.3.6.1.2.1.34.3.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperParaSessSupEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperParaSessSupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperParaSessSup", "1.3.6.1.2.1.34.3.1.2.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperParaSessSupLSEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperParaSessSupLSEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperParaSessSupLS", "1.3.6.1.2.1.34.3.1.2.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcLuPairOperStateEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcLuPairOperStateEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcLuPairOperState", "1.3.6.1.2.1.34.3.1.2.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcModeAdminTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcModeAdminEntryEnt appcModeAdminEntry;

                    private AppcModeAdminTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcModeAdminTable", "1.3.6.1.2.1.34.3.1.2.5", false, true, false, false);
                        this.appcModeAdminEntry = new AppcModeAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcModeAdminEntry
                        };
                    }
                    public static final class AppcModeAdminEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcModeAdminLocLuNameEnt appcModeAdminLocLuName;

                        public final AppcModeAdminParLuNameEnt appcModeAdminParLuName;

                        public final AppcModeAdminModeNameEnt appcModeAdminModeName;

                        public final AppcModeAdminCosNameEnt appcModeAdminCosName;

                        public final AppcModeAdminSessEndTpNameEnt appcModeAdminSessEndTpName;

                        public final AppcModeAdminMaxSessLimitEnt appcModeAdminMaxSessLimit;

                        public final AppcModeAdminMinCwinLimitEnt appcModeAdminMinCwinLimit;

                        public final AppcModeAdminMinClosLimitEnt appcModeAdminMinClosLimit;

                        public final AppcModeAdminConWinAutoActLmtEnt appcModeAdminConWinAutoActLmt;

                        public final AppcModeAdminRecvPacWinSzEnt appcModeAdminRecvPacWinSz;

                        public final AppcModeAdminSendPacWinSzEnt appcModeAdminSendPacWinSz;

                        public final AppcModeAdminPrefRecvRuSzEnt appcModeAdminPrefRecvRuSz;

                        public final AppcModeAdminPrefSendRuSzEnt appcModeAdminPrefSendRuSz;

                        public final AppcModeAdminRecvRuSzUpBndEnt appcModeAdminRecvRuSzUpBnd;

                        public final AppcModeAdminSendRuSzUpBndEnt appcModeAdminSendRuSzUpBnd;

                        public final AppcModeAdminRecvRuSzLoBndEnt appcModeAdminRecvRuSzLoBnd;

                        public final AppcModeAdminSendRuSzLoBndEnt appcModeAdminSendRuSzLoBnd;

                        public final AppcModeAdminSingSessReinitEnt appcModeAdminSingSessReinit;

                        public final AppcModeAdminCompressionEnt appcModeAdminCompression;

                        public final AppcModeAdminInBoundCompLevelEnt appcModeAdminInBoundCompLevel;

                        public final AppcModeAdminOutBoundCompLevelEnt appcModeAdminOutBoundCompLevel;

                        public final AppcModeAdminCompRleBeforeLZEnt appcModeAdminCompRleBeforeLZ;

                        public final AppcModeAdminSyncLvlEnt appcModeAdminSyncLvl;

                        public final AppcModeAdminCryptoEnt appcModeAdminCrypto;

                        private AppcModeAdminEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcModeAdminEntry", "1.3.6.1.2.1.34.3.1.2.5.1", false, false, false, true);
                            this.appcModeAdminLocLuName = new AppcModeAdminLocLuNameEnt(mib, this);
                            this.appcModeAdminParLuName = new AppcModeAdminParLuNameEnt(mib, this);
                            this.appcModeAdminModeName = new AppcModeAdminModeNameEnt(mib, this);
                            this.appcModeAdminCosName = new AppcModeAdminCosNameEnt(mib, this);
                            this.appcModeAdminSessEndTpName = new AppcModeAdminSessEndTpNameEnt(mib, this);
                            this.appcModeAdminMaxSessLimit = new AppcModeAdminMaxSessLimitEnt(mib, this);
                            this.appcModeAdminMinCwinLimit = new AppcModeAdminMinCwinLimitEnt(mib, this);
                            this.appcModeAdminMinClosLimit = new AppcModeAdminMinClosLimitEnt(mib, this);
                            this.appcModeAdminConWinAutoActLmt = new AppcModeAdminConWinAutoActLmtEnt(mib, this);
                            this.appcModeAdminRecvPacWinSz = new AppcModeAdminRecvPacWinSzEnt(mib, this);
                            this.appcModeAdminSendPacWinSz = new AppcModeAdminSendPacWinSzEnt(mib, this);
                            this.appcModeAdminPrefRecvRuSz = new AppcModeAdminPrefRecvRuSzEnt(mib, this);
                            this.appcModeAdminPrefSendRuSz = new AppcModeAdminPrefSendRuSzEnt(mib, this);
                            this.appcModeAdminRecvRuSzUpBnd = new AppcModeAdminRecvRuSzUpBndEnt(mib, this);
                            this.appcModeAdminSendRuSzUpBnd = new AppcModeAdminSendRuSzUpBndEnt(mib, this);
                            this.appcModeAdminRecvRuSzLoBnd = new AppcModeAdminRecvRuSzLoBndEnt(mib, this);
                            this.appcModeAdminSendRuSzLoBnd = new AppcModeAdminSendRuSzLoBndEnt(mib, this);
                            this.appcModeAdminSingSessReinit = new AppcModeAdminSingSessReinitEnt(mib, this);
                            this.appcModeAdminCompression = new AppcModeAdminCompressionEnt(mib, this);
                            this.appcModeAdminInBoundCompLevel = new AppcModeAdminInBoundCompLevelEnt(mib, this);
                            this.appcModeAdminOutBoundCompLevel = new AppcModeAdminOutBoundCompLevelEnt(mib, this);
                            this.appcModeAdminCompRleBeforeLZ = new AppcModeAdminCompRleBeforeLZEnt(mib, this);
                            this.appcModeAdminSyncLvl = new AppcModeAdminSyncLvlEnt(mib, this);
                            this.appcModeAdminCrypto = new AppcModeAdminCryptoEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcModeAdminLocLuName,
                                this.appcModeAdminParLuName,
                                this.appcModeAdminModeName,
                                this.appcModeAdminCosName,
                                this.appcModeAdminSessEndTpName,
                                this.appcModeAdminMaxSessLimit,
                                this.appcModeAdminMinCwinLimit,
                                this.appcModeAdminMinClosLimit,
                                this.appcModeAdminConWinAutoActLmt,
                                this.appcModeAdminRecvPacWinSz,
                                this.appcModeAdminSendPacWinSz,
                                this.appcModeAdminPrefRecvRuSz,
                                this.appcModeAdminPrefSendRuSz,
                                this.appcModeAdminRecvRuSzUpBnd,
                                this.appcModeAdminSendRuSzUpBnd,
                                this.appcModeAdminRecvRuSzLoBnd,
                                this.appcModeAdminSendRuSzLoBnd,
                                this.appcModeAdminSingSessReinit,
                                this.appcModeAdminCompression,
                                this.appcModeAdminInBoundCompLevel,
                                this.appcModeAdminOutBoundCompLevel,
                                this.appcModeAdminCompRleBeforeLZ,
                                this.appcModeAdminSyncLvl,
                                this.appcModeAdminCrypto
                            };
                        }
                        public static final class AppcModeAdminLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminLocLuName", "1.3.6.1.2.1.34.3.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminParLuName", "1.3.6.1.2.1.34.3.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminModeName", "1.3.6.1.2.1.34.3.1.2.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminCosNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminCosNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminCosName", "1.3.6.1.2.1.34.3.1.2.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminSessEndTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminSessEndTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminSessEndTpName", "1.3.6.1.2.1.34.3.1.2.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminMaxSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminMaxSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminMaxSessLimit", "1.3.6.1.2.1.34.3.1.2.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminMinCwinLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminMinCwinLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminMinCwinLimit", "1.3.6.1.2.1.34.3.1.2.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminMinClosLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminMinClosLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminMinClosLimit", "1.3.6.1.2.1.34.3.1.2.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminConWinAutoActLmtEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminConWinAutoActLmtEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminConWinAutoActLmt", "1.3.6.1.2.1.34.3.1.2.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminRecvPacWinSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminRecvPacWinSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminRecvPacWinSz", "1.3.6.1.2.1.34.3.1.2.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminSendPacWinSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminSendPacWinSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminSendPacWinSz", "1.3.6.1.2.1.34.3.1.2.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminPrefRecvRuSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminPrefRecvRuSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminPrefRecvRuSz", "1.3.6.1.2.1.34.3.1.2.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminPrefSendRuSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminPrefSendRuSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminPrefSendRuSz", "1.3.6.1.2.1.34.3.1.2.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminRecvRuSzUpBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminRecvRuSzUpBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminRecvRuSzUpBnd", "1.3.6.1.2.1.34.3.1.2.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminSendRuSzUpBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminSendRuSzUpBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminSendRuSzUpBnd", "1.3.6.1.2.1.34.3.1.2.5.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminRecvRuSzLoBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminRecvRuSzLoBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminRecvRuSzLoBnd", "1.3.6.1.2.1.34.3.1.2.5.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminSendRuSzLoBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminSendRuSzLoBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminSendRuSzLoBnd", "1.3.6.1.2.1.34.3.1.2.5.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminSingSessReinitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminSingSessReinitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminSingSessReinit", "1.3.6.1.2.1.34.3.1.2.5.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminCompressionEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminCompressionEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminCompression", "1.3.6.1.2.1.34.3.1.2.5.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminInBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminInBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminInBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.5.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminOutBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminOutBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminOutBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.5.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminCompRleBeforeLZEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminCompRleBeforeLZEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminCompRleBeforeLZ", "1.3.6.1.2.1.34.3.1.2.5.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminSyncLvlEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminSyncLvlEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminSyncLvl", "1.3.6.1.2.1.34.3.1.2.5.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeAdminCryptoEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeAdminCryptoEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeAdminCrypto", "1.3.6.1.2.1.34.3.1.2.5.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcModeOperTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcModeOperEntryEnt appcModeOperEntry;

                    private AppcModeOperTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcModeOperTable", "1.3.6.1.2.1.34.3.1.2.6", false, true, false, false);
                        this.appcModeOperEntry = new AppcModeOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcModeOperEntry
                        };
                    }
                    public static final class AppcModeOperEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcModeOperLocLuNameEnt appcModeOperLocLuName;

                        public final AppcModeOperParLuNameEnt appcModeOperParLuName;

                        public final AppcModeOperModeNameEnt appcModeOperModeName;

                        public final AppcModeOperCosNameEnt appcModeOperCosName;

                        public final AppcModeOperSessEndTpNameEnt appcModeOperSessEndTpName;

                        public final AppcModeOperSessLimitEnt appcModeOperSessLimit;

                        public final AppcModeOperMaxSessLimitEnt appcModeOperMaxSessLimit;

                        public final AppcModeOperMinCwinLimitEnt appcModeOperMinCwinLimit;

                        public final AppcModeOperMinClosLimitEnt appcModeOperMinClosLimit;

                        public final AppcModeOperConWinAutoActLmtEnt appcModeOperConWinAutoActLmt;

                        public final AppcModeOperRecvPacWinSzEnt appcModeOperRecvPacWinSz;

                        public final AppcModeOperSendPacWinSzEnt appcModeOperSendPacWinSz;

                        public final AppcModeOperPrefRecvRuSzEnt appcModeOperPrefRecvRuSz;

                        public final AppcModeOperPrefSendRuSzEnt appcModeOperPrefSendRuSz;

                        public final AppcModeOperRecvRuSzUpBndEnt appcModeOperRecvRuSzUpBnd;

                        public final AppcModeOperSendRuSzUpBndEnt appcModeOperSendRuSzUpBnd;

                        public final AppcModeOperRecvRuSzLoBndEnt appcModeOperRecvRuSzLoBnd;

                        public final AppcModeOperSendRuSzLoBndEnt appcModeOperSendRuSzLoBnd;

                        public final AppcModeOperSingSessReinitEnt appcModeOperSingSessReinit;

                        public final AppcModeOperCompressionEnt appcModeOperCompression;

                        public final AppcModeOperInBoundCompLevelEnt appcModeOperInBoundCompLevel;

                        public final AppcModeOperOutBoundCompLevelEnt appcModeOperOutBoundCompLevel;

                        public final AppcModeOperCompRleBeforeLZEnt appcModeOperCompRleBeforeLZ;

                        public final AppcModeOperSyncLvlEnt appcModeOperSyncLvl;

                        public final AppcModeOperCryptoEnt appcModeOperCrypto;

                        public final AppcModeOperSyncLvlLastStartEnt appcModeOperSyncLvlLastStart;

                        public final AppcModeOperCryptoLastStartEnt appcModeOperCryptoLastStart;

                        public final AppcModeOperCNOSNegEnt appcModeOperCNOSNeg;

                        public final AppcModeOperActCwinEnt appcModeOperActCwin;

                        public final AppcModeOperActClosEnt appcModeOperActClos;

                        public final AppcModeOperPndCwinEnt appcModeOperPndCwin;

                        public final AppcModeOperPndClosEnt appcModeOperPndClos;

                        public final AppcModeOperPtmCwinEnt appcModeOperPtmCwin;

                        public final AppcModeOperPtmClosEnt appcModeOperPtmClos;

                        public final AppcModeOperDrainSelfEnt appcModeOperDrainSelf;

                        public final AppcModeOperDrainPartEnt appcModeOperDrainPart;

                        private AppcModeOperEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcModeOperEntry", "1.3.6.1.2.1.34.3.1.2.6.1", false, false, false, true);
                            this.appcModeOperLocLuName = new AppcModeOperLocLuNameEnt(mib, this);
                            this.appcModeOperParLuName = new AppcModeOperParLuNameEnt(mib, this);
                            this.appcModeOperModeName = new AppcModeOperModeNameEnt(mib, this);
                            this.appcModeOperCosName = new AppcModeOperCosNameEnt(mib, this);
                            this.appcModeOperSessEndTpName = new AppcModeOperSessEndTpNameEnt(mib, this);
                            this.appcModeOperSessLimit = new AppcModeOperSessLimitEnt(mib, this);
                            this.appcModeOperMaxSessLimit = new AppcModeOperMaxSessLimitEnt(mib, this);
                            this.appcModeOperMinCwinLimit = new AppcModeOperMinCwinLimitEnt(mib, this);
                            this.appcModeOperMinClosLimit = new AppcModeOperMinClosLimitEnt(mib, this);
                            this.appcModeOperConWinAutoActLmt = new AppcModeOperConWinAutoActLmtEnt(mib, this);
                            this.appcModeOperRecvPacWinSz = new AppcModeOperRecvPacWinSzEnt(mib, this);
                            this.appcModeOperSendPacWinSz = new AppcModeOperSendPacWinSzEnt(mib, this);
                            this.appcModeOperPrefRecvRuSz = new AppcModeOperPrefRecvRuSzEnt(mib, this);
                            this.appcModeOperPrefSendRuSz = new AppcModeOperPrefSendRuSzEnt(mib, this);
                            this.appcModeOperRecvRuSzUpBnd = new AppcModeOperRecvRuSzUpBndEnt(mib, this);
                            this.appcModeOperSendRuSzUpBnd = new AppcModeOperSendRuSzUpBndEnt(mib, this);
                            this.appcModeOperRecvRuSzLoBnd = new AppcModeOperRecvRuSzLoBndEnt(mib, this);
                            this.appcModeOperSendRuSzLoBnd = new AppcModeOperSendRuSzLoBndEnt(mib, this);
                            this.appcModeOperSingSessReinit = new AppcModeOperSingSessReinitEnt(mib, this);
                            this.appcModeOperCompression = new AppcModeOperCompressionEnt(mib, this);
                            this.appcModeOperInBoundCompLevel = new AppcModeOperInBoundCompLevelEnt(mib, this);
                            this.appcModeOperOutBoundCompLevel = new AppcModeOperOutBoundCompLevelEnt(mib, this);
                            this.appcModeOperCompRleBeforeLZ = new AppcModeOperCompRleBeforeLZEnt(mib, this);
                            this.appcModeOperSyncLvl = new AppcModeOperSyncLvlEnt(mib, this);
                            this.appcModeOperCrypto = new AppcModeOperCryptoEnt(mib, this);
                            this.appcModeOperSyncLvlLastStart = new AppcModeOperSyncLvlLastStartEnt(mib, this);
                            this.appcModeOperCryptoLastStart = new AppcModeOperCryptoLastStartEnt(mib, this);
                            this.appcModeOperCNOSNeg = new AppcModeOperCNOSNegEnt(mib, this);
                            this.appcModeOperActCwin = new AppcModeOperActCwinEnt(mib, this);
                            this.appcModeOperActClos = new AppcModeOperActClosEnt(mib, this);
                            this.appcModeOperPndCwin = new AppcModeOperPndCwinEnt(mib, this);
                            this.appcModeOperPndClos = new AppcModeOperPndClosEnt(mib, this);
                            this.appcModeOperPtmCwin = new AppcModeOperPtmCwinEnt(mib, this);
                            this.appcModeOperPtmClos = new AppcModeOperPtmClosEnt(mib, this);
                            this.appcModeOperDrainSelf = new AppcModeOperDrainSelfEnt(mib, this);
                            this.appcModeOperDrainPart = new AppcModeOperDrainPartEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcModeOperLocLuName,
                                this.appcModeOperParLuName,
                                this.appcModeOperModeName,
                                this.appcModeOperCosName,
                                this.appcModeOperSessEndTpName,
                                this.appcModeOperSessLimit,
                                this.appcModeOperMaxSessLimit,
                                this.appcModeOperMinCwinLimit,
                                this.appcModeOperMinClosLimit,
                                this.appcModeOperConWinAutoActLmt,
                                this.appcModeOperRecvPacWinSz,
                                this.appcModeOperSendPacWinSz,
                                this.appcModeOperPrefRecvRuSz,
                                this.appcModeOperPrefSendRuSz,
                                this.appcModeOperRecvRuSzUpBnd,
                                this.appcModeOperSendRuSzUpBnd,
                                this.appcModeOperRecvRuSzLoBnd,
                                this.appcModeOperSendRuSzLoBnd,
                                this.appcModeOperSingSessReinit,
                                this.appcModeOperCompression,
                                this.appcModeOperInBoundCompLevel,
                                this.appcModeOperOutBoundCompLevel,
                                this.appcModeOperCompRleBeforeLZ,
                                this.appcModeOperSyncLvl,
                                this.appcModeOperCrypto,
                                this.appcModeOperSyncLvlLastStart,
                                this.appcModeOperCryptoLastStart,
                                this.appcModeOperCNOSNeg,
                                this.appcModeOperActCwin,
                                this.appcModeOperActClos,
                                this.appcModeOperPndCwin,
                                this.appcModeOperPndClos,
                                this.appcModeOperPtmCwin,
                                this.appcModeOperPtmClos,
                                this.appcModeOperDrainSelf,
                                this.appcModeOperDrainPart
                            };
                        }
                        public static final class AppcModeOperLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperLocLuName", "1.3.6.1.2.1.34.3.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperParLuName", "1.3.6.1.2.1.34.3.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperModeName", "1.3.6.1.2.1.34.3.1.2.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperCosNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperCosNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperCosName", "1.3.6.1.2.1.34.3.1.2.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSessEndTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSessEndTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSessEndTpName", "1.3.6.1.2.1.34.3.1.2.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSessLimit", "1.3.6.1.2.1.34.3.1.2.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperMaxSessLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperMaxSessLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperMaxSessLimit", "1.3.6.1.2.1.34.3.1.2.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperMinCwinLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperMinCwinLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperMinCwinLimit", "1.3.6.1.2.1.34.3.1.2.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperMinClosLimitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperMinClosLimitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperMinClosLimit", "1.3.6.1.2.1.34.3.1.2.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperConWinAutoActLmtEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperConWinAutoActLmtEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperConWinAutoActLmt", "1.3.6.1.2.1.34.3.1.2.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperRecvPacWinSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperRecvPacWinSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperRecvPacWinSz", "1.3.6.1.2.1.34.3.1.2.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSendPacWinSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSendPacWinSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSendPacWinSz", "1.3.6.1.2.1.34.3.1.2.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperPrefRecvRuSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperPrefRecvRuSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperPrefRecvRuSz", "1.3.6.1.2.1.34.3.1.2.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperPrefSendRuSzEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperPrefSendRuSzEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperPrefSendRuSz", "1.3.6.1.2.1.34.3.1.2.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperRecvRuSzUpBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperRecvRuSzUpBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperRecvRuSzUpBnd", "1.3.6.1.2.1.34.3.1.2.6.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSendRuSzUpBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSendRuSzUpBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSendRuSzUpBnd", "1.3.6.1.2.1.34.3.1.2.6.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperRecvRuSzLoBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperRecvRuSzLoBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperRecvRuSzLoBnd", "1.3.6.1.2.1.34.3.1.2.6.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSendRuSzLoBndEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSendRuSzLoBndEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSendRuSzLoBnd", "1.3.6.1.2.1.34.3.1.2.6.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSingSessReinitEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSingSessReinitEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSingSessReinit", "1.3.6.1.2.1.34.3.1.2.6.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperCompressionEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperCompressionEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperCompression", "1.3.6.1.2.1.34.3.1.2.6.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperInBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperInBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperInBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.6.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperOutBoundCompLevelEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperOutBoundCompLevelEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperOutBoundCompLevel", "1.3.6.1.2.1.34.3.1.2.6.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperCompRleBeforeLZEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperCompRleBeforeLZEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperCompRleBeforeLZ", "1.3.6.1.2.1.34.3.1.2.6.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSyncLvlEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSyncLvlEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSyncLvl", "1.3.6.1.2.1.34.3.1.2.6.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperCryptoEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperCryptoEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperCrypto", "1.3.6.1.2.1.34.3.1.2.6.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperSyncLvlLastStartEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperSyncLvlLastStartEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperSyncLvlLastStart", "1.3.6.1.2.1.34.3.1.2.6.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperCryptoLastStartEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperCryptoLastStartEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperCryptoLastStart", "1.3.6.1.2.1.34.3.1.2.6.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperCNOSNegEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperCNOSNegEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperCNOSNeg", "1.3.6.1.2.1.34.3.1.2.6.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperActCwinEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperActCwinEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperActCwin", "1.3.6.1.2.1.34.3.1.2.6.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperActClosEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperActClosEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperActClos", "1.3.6.1.2.1.34.3.1.2.6.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperPndCwinEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperPndCwinEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperPndCwin", "1.3.6.1.2.1.34.3.1.2.6.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperPndClosEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperPndClosEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperPndClos", "1.3.6.1.2.1.34.3.1.2.6.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperPtmCwinEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperPtmCwinEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperPtmCwin", "1.3.6.1.2.1.34.3.1.2.6.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperPtmClosEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperPtmClosEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperPtmClos", "1.3.6.1.2.1.34.3.1.2.6.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperDrainSelfEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperDrainSelfEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperDrainSelf", "1.3.6.1.2.1.34.3.1.2.6.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcModeOperDrainPartEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcModeOperDrainPartEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcModeOperDrainPart", "1.3.6.1.2.1.34.3.1.2.6.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppcTpEnt extends MIBEntry<APPCMIBDef>
            {
                /** *********************************************************************APPC TP Admin TableObjects in this table contain default or expected configurationvalues for remotely attachable transaction programs.**********************************************************************/
                public final AppcTpAdminTableEnt appcTpAdminTable;

                private AppcTpEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcTp", "1.3.6.1.2.1.34.3.1.3", false, false, false, false);
                    this.appcTpAdminTable = new AppcTpAdminTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcTpAdminTable
                    };
                }
                public static final class AppcTpAdminTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcTpAdminEntryEnt appcTpAdminEntry;

                    private AppcTpAdminTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcTpAdminTable", "1.3.6.1.2.1.34.3.1.3.1", false, true, false, false);
                        this.appcTpAdminEntry = new AppcTpAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcTpAdminEntry
                        };
                    }
                    public static final class AppcTpAdminEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcTpAdminLocLuNameEnt appcTpAdminLocLuName;

                        public final AppcTpAdminTpNameEnt appcTpAdminTpName;

                        public final AppcTpAdminFileSpecEnt appcTpAdminFileSpec;

                        public final AppcTpAdminStartParmEnt appcTpAdminStartParm;

                        public final AppcTpAdminTpOperationEnt appcTpAdminTpOperation;

                        public final AppcTpAdminInAttachTimeoutEnt appcTpAdminInAttachTimeout;

                        public final AppcTpAdminRcvAllocTimeoutEnt appcTpAdminRcvAllocTimeout;

                        public final AppcTpAdminSyncLvlEnt appcTpAdminSyncLvl;

                        public final AppcTpAdminInstLmtEnt appcTpAdminInstLmt;

                        public final AppcTpAdminStatusEnt appcTpAdminStatus;

                        public final AppcTpAdminLongRunEnt appcTpAdminLongRun;

                        public final AppcTpAdminConvTypeEnt appcTpAdminConvType;

                        public final AppcTpAdminConvDuplexEnt appcTpAdminConvDuplex;

                        public final AppcTpAdminConvSecReqEnt appcTpAdminConvSecReq;

                        public final AppcTpAdminVerPipEnt appcTpAdminVerPip;

                        public final AppcTpAdminPipSubNumEnt appcTpAdminPipSubNum;

                        private AppcTpAdminEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcTpAdminEntry", "1.3.6.1.2.1.34.3.1.3.1.1", false, false, false, true);
                            this.appcTpAdminLocLuName = new AppcTpAdminLocLuNameEnt(mib, this);
                            this.appcTpAdminTpName = new AppcTpAdminTpNameEnt(mib, this);
                            this.appcTpAdminFileSpec = new AppcTpAdminFileSpecEnt(mib, this);
                            this.appcTpAdminStartParm = new AppcTpAdminStartParmEnt(mib, this);
                            this.appcTpAdminTpOperation = new AppcTpAdminTpOperationEnt(mib, this);
                            this.appcTpAdminInAttachTimeout = new AppcTpAdminInAttachTimeoutEnt(mib, this);
                            this.appcTpAdminRcvAllocTimeout = new AppcTpAdminRcvAllocTimeoutEnt(mib, this);
                            this.appcTpAdminSyncLvl = new AppcTpAdminSyncLvlEnt(mib, this);
                            this.appcTpAdminInstLmt = new AppcTpAdminInstLmtEnt(mib, this);
                            this.appcTpAdminStatus = new AppcTpAdminStatusEnt(mib, this);
                            this.appcTpAdminLongRun = new AppcTpAdminLongRunEnt(mib, this);
                            this.appcTpAdminConvType = new AppcTpAdminConvTypeEnt(mib, this);
                            this.appcTpAdminConvDuplex = new AppcTpAdminConvDuplexEnt(mib, this);
                            this.appcTpAdminConvSecReq = new AppcTpAdminConvSecReqEnt(mib, this);
                            this.appcTpAdminVerPip = new AppcTpAdminVerPipEnt(mib, this);
                            this.appcTpAdminPipSubNum = new AppcTpAdminPipSubNumEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcTpAdminLocLuName,
                                this.appcTpAdminTpName,
                                this.appcTpAdminFileSpec,
                                this.appcTpAdminStartParm,
                                this.appcTpAdminTpOperation,
                                this.appcTpAdminInAttachTimeout,
                                this.appcTpAdminRcvAllocTimeout,
                                this.appcTpAdminSyncLvl,
                                this.appcTpAdminInstLmt,
                                this.appcTpAdminStatus,
                                this.appcTpAdminLongRun,
                                this.appcTpAdminConvType,
                                this.appcTpAdminConvDuplex,
                                this.appcTpAdminConvSecReq,
                                this.appcTpAdminVerPip,
                                this.appcTpAdminPipSubNum
                            };
                        }
                        public static final class AppcTpAdminLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminLocLuName", "1.3.6.1.2.1.34.3.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminTpName", "1.3.6.1.2.1.34.3.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminFileSpecEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminFileSpecEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminFileSpec", "1.3.6.1.2.1.34.3.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminStartParmEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminStartParmEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminStartParm", "1.3.6.1.2.1.34.3.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminTpOperationEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminTpOperationEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminTpOperation", "1.3.6.1.2.1.34.3.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminInAttachTimeoutEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminInAttachTimeoutEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminInAttachTimeout", "1.3.6.1.2.1.34.3.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminRcvAllocTimeoutEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminRcvAllocTimeoutEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminRcvAllocTimeout", "1.3.6.1.2.1.34.3.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminSyncLvlEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminSyncLvlEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminSyncLvl", "1.3.6.1.2.1.34.3.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminInstLmtEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminInstLmtEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminInstLmt", "1.3.6.1.2.1.34.3.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminStatusEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminStatusEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminStatus", "1.3.6.1.2.1.34.3.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminLongRunEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminLongRunEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminLongRun", "1.3.6.1.2.1.34.3.1.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminConvTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminConvTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminConvType", "1.3.6.1.2.1.34.3.1.3.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminConvDuplexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminConvDuplexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminConvDuplex", "1.3.6.1.2.1.34.3.1.3.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminConvSecReqEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminConvSecReqEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminConvSecReq", "1.3.6.1.2.1.34.3.1.3.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminVerPipEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminVerPipEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminVerPip", "1.3.6.1.2.1.34.3.1.3.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcTpAdminPipSubNumEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcTpAdminPipSubNumEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcTpAdminPipSubNum", "1.3.6.1.2.1.34.3.1.3.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppcSessionEnt extends MIBEntry<APPCMIBDef>
            {
                /** *********************************************************************APPC Active Session Table-----------------------------------This table contains information about active APPC sessions.**********************************************************************/
                public final AppcActSessTableEnt appcActSessTable;

                /** ***************************************************************The following table contains session statistics for APPC sessions.****************************************************************/
                public final AppcSessStatsTableEnt appcSessStatsTable;

                /** *********************************************************************APPC Historical Session Table-----------------------------------This table contains historical information about APPC sessions thatterminated abnormally.   It is an implementation choice how long toretain information on a given session.**********************************************************************/
                public final AppcHistSessTableEnt appcHistSessTable;

                /** *********************************************************************APPC Session RTP Connection Table-----------------------------------
This table contains information on APPC sessions that are beingtransported on RTP connections by High Performance Routing (HPR).**********************************************************************/
                public final AppcSessRtpTableEnt appcSessRtpTable;

                private AppcSessionEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcSession", "1.3.6.1.2.1.34.3.1.4", false, false, false, false);
                    this.appcActSessTable = new AppcActSessTableEnt(mib, this);
                    this.appcSessStatsTable = new AppcSessStatsTableEnt(mib, this);
                    this.appcHistSessTable = new AppcHistSessTableEnt(mib, this);
                    this.appcSessRtpTable = new AppcSessRtpTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcActSessTable,
                        this.appcSessStatsTable,
                        this.appcHistSessTable,
                        this.appcSessRtpTable
                    };
                }
                public static final class AppcActSessTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcActSessEntryEnt appcActSessEntry;

                    private AppcActSessTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcActSessTable", "1.3.6.1.2.1.34.3.1.4.1", false, true, false, false);
                        this.appcActSessEntry = new AppcActSessEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcActSessEntry
                        };
                    }
                    public static final class AppcActSessEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcActSessLocLuNameEnt appcActSessLocLuName;

                        public final AppcActSessParLuNameEnt appcActSessParLuName;

                        public final AppcActSessIndexEnt appcActSessIndex;

                        public final AppcActSessPcidCpNameEnt appcActSessPcidCpName;

                        public final AppcActSessPcidEnt appcActSessPcid;

                        public final AppcActSessPluIndicatorEnt appcActSessPluIndicator;

                        public final AppcActSessModeNameEnt appcActSessModeName;

                        public final AppcActSessCosNameEnt appcActSessCosName;

                        public final AppcActSessTransPriorityEnt appcActSessTransPriority;

                        public final AppcActSessEnhanceSecSupEnt appcActSessEnhanceSecSup;

                        public final AppcActSessSendPacingTypeEnt appcActSessSendPacingType;

                        public final AppcActSessSendRpcEnt appcActSessSendRpc;

                        public final AppcActSessSendNxWndwSizeEnt appcActSessSendNxWndwSize;

                        public final AppcActSessRecvPacingTypeEnt appcActSessRecvPacingType;

                        public final AppcActSessRecvRpcEnt appcActSessRecvRpc;

                        public final AppcActSessRecvNxWndwSizeEnt appcActSessRecvNxWndwSize;

                        public final AppcActSessRscvEnt appcActSessRscv;

                        public final AppcActSessInUseEnt appcActSessInUse;

                        public final AppcActSessMaxSndRuSizeEnt appcActSessMaxSndRuSize;

                        public final AppcActSessMaxRcvRuSizeEnt appcActSessMaxRcvRuSize;

                        public final AppcActSessSndPacingSizeEnt appcActSessSndPacingSize;

                        public final AppcActSessRcvPacingSizeEnt appcActSessRcvPacingSize;

                        public final AppcActSessOperStateEnt appcActSessOperState;

                        public final AppcActSessUpTimeEnt appcActSessUpTime;

                        public final AppcActSessRtpNceIdEnt appcActSessRtpNceId;

                        public final AppcActSessRtpTcidEnt appcActSessRtpTcid;

                        public final AppcActSessLinkIndexEnt appcActSessLinkIndex;

                        private AppcActSessEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcActSessEntry", "1.3.6.1.2.1.34.3.1.4.1.1", false, false, false, true);
                            this.appcActSessLocLuName = new AppcActSessLocLuNameEnt(mib, this);
                            this.appcActSessParLuName = new AppcActSessParLuNameEnt(mib, this);
                            this.appcActSessIndex = new AppcActSessIndexEnt(mib, this);
                            this.appcActSessPcidCpName = new AppcActSessPcidCpNameEnt(mib, this);
                            this.appcActSessPcid = new AppcActSessPcidEnt(mib, this);
                            this.appcActSessPluIndicator = new AppcActSessPluIndicatorEnt(mib, this);
                            this.appcActSessModeName = new AppcActSessModeNameEnt(mib, this);
                            this.appcActSessCosName = new AppcActSessCosNameEnt(mib, this);
                            this.appcActSessTransPriority = new AppcActSessTransPriorityEnt(mib, this);
                            this.appcActSessEnhanceSecSup = new AppcActSessEnhanceSecSupEnt(mib, this);
                            this.appcActSessSendPacingType = new AppcActSessSendPacingTypeEnt(mib, this);
                            this.appcActSessSendRpc = new AppcActSessSendRpcEnt(mib, this);
                            this.appcActSessSendNxWndwSize = new AppcActSessSendNxWndwSizeEnt(mib, this);
                            this.appcActSessRecvPacingType = new AppcActSessRecvPacingTypeEnt(mib, this);
                            this.appcActSessRecvRpc = new AppcActSessRecvRpcEnt(mib, this);
                            this.appcActSessRecvNxWndwSize = new AppcActSessRecvNxWndwSizeEnt(mib, this);
                            this.appcActSessRscv = new AppcActSessRscvEnt(mib, this);
                            this.appcActSessInUse = new AppcActSessInUseEnt(mib, this);
                            this.appcActSessMaxSndRuSize = new AppcActSessMaxSndRuSizeEnt(mib, this);
                            this.appcActSessMaxRcvRuSize = new AppcActSessMaxRcvRuSizeEnt(mib, this);
                            this.appcActSessSndPacingSize = new AppcActSessSndPacingSizeEnt(mib, this);
                            this.appcActSessRcvPacingSize = new AppcActSessRcvPacingSizeEnt(mib, this);
                            this.appcActSessOperState = new AppcActSessOperStateEnt(mib, this);
                            this.appcActSessUpTime = new AppcActSessUpTimeEnt(mib, this);
                            this.appcActSessRtpNceId = new AppcActSessRtpNceIdEnt(mib, this);
                            this.appcActSessRtpTcid = new AppcActSessRtpTcidEnt(mib, this);
                            this.appcActSessLinkIndex = new AppcActSessLinkIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcActSessLocLuName,
                                this.appcActSessParLuName,
                                this.appcActSessIndex,
                                this.appcActSessPcidCpName,
                                this.appcActSessPcid,
                                this.appcActSessPluIndicator,
                                this.appcActSessModeName,
                                this.appcActSessCosName,
                                this.appcActSessTransPriority,
                                this.appcActSessEnhanceSecSup,
                                this.appcActSessSendPacingType,
                                this.appcActSessSendRpc,
                                this.appcActSessSendNxWndwSize,
                                this.appcActSessRecvPacingType,
                                this.appcActSessRecvRpc,
                                this.appcActSessRecvNxWndwSize,
                                this.appcActSessRscv,
                                this.appcActSessInUse,
                                this.appcActSessMaxSndRuSize,
                                this.appcActSessMaxRcvRuSize,
                                this.appcActSessSndPacingSize,
                                this.appcActSessRcvPacingSize,
                                this.appcActSessOperState,
                                this.appcActSessUpTime,
                                this.appcActSessRtpNceId,
                                this.appcActSessRtpTcid,
                                this.appcActSessLinkIndex
                            };
                        }
                        public static final class AppcActSessLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessLocLuName", "1.3.6.1.2.1.34.3.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessParLuName", "1.3.6.1.2.1.34.3.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessIndexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessIndexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessIndex", "1.3.6.1.2.1.34.3.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessPcidCpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessPcidCpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessPcidCpName", "1.3.6.1.2.1.34.3.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessPcidEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessPcidEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessPcid", "1.3.6.1.2.1.34.3.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessPluIndicatorEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessPluIndicatorEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessPluIndicator", "1.3.6.1.2.1.34.3.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessModeName", "1.3.6.1.2.1.34.3.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessCosNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessCosNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessCosName", "1.3.6.1.2.1.34.3.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessTransPriorityEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessTransPriorityEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessTransPriority", "1.3.6.1.2.1.34.3.1.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessEnhanceSecSupEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessEnhanceSecSupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessEnhanceSecSup", "1.3.6.1.2.1.34.3.1.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessSendPacingTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessSendPacingTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessSendPacingType", "1.3.6.1.2.1.34.3.1.4.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessSendRpcEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessSendRpcEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessSendRpc", "1.3.6.1.2.1.34.3.1.4.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessSendNxWndwSizeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessSendNxWndwSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessSendNxWndwSize", "1.3.6.1.2.1.34.3.1.4.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRecvPacingTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRecvPacingTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRecvPacingType", "1.3.6.1.2.1.34.3.1.4.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRecvRpcEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRecvRpcEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRecvRpc", "1.3.6.1.2.1.34.3.1.4.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRecvNxWndwSizeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRecvNxWndwSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRecvNxWndwSize", "1.3.6.1.2.1.34.3.1.4.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRscvEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRscvEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRscv", "1.3.6.1.2.1.34.3.1.4.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessInUseEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessInUseEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessInUse", "1.3.6.1.2.1.34.3.1.4.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessMaxSndRuSizeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessMaxSndRuSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessMaxSndRuSize", "1.3.6.1.2.1.34.3.1.4.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessMaxRcvRuSizeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessMaxRcvRuSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessMaxRcvRuSize", "1.3.6.1.2.1.34.3.1.4.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessSndPacingSizeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessSndPacingSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessSndPacingSize", "1.3.6.1.2.1.34.3.1.4.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRcvPacingSizeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRcvPacingSizeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRcvPacingSize", "1.3.6.1.2.1.34.3.1.4.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessOperStateEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessOperStateEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessOperState", "1.3.6.1.2.1.34.3.1.4.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessUpTimeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessUpTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessUpTime", "1.3.6.1.2.1.34.3.1.4.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRtpNceIdEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRtpNceIdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRtpNceId", "1.3.6.1.2.1.34.3.1.4.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessRtpTcidEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessRtpTcidEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessRtpTcid", "1.3.6.1.2.1.34.3.1.4.1.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActSessLinkIndexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActSessLinkIndexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActSessLinkIndex", "1.3.6.1.2.1.34.3.1.4.1.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcSessStatsTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcSessStatsEntryEnt appcSessStatsEntry;

                    private AppcSessStatsTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcSessStatsTable", "1.3.6.1.2.1.34.3.1.4.2", false, true, false, false);
                        this.appcSessStatsEntry = new AppcSessStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcSessStatsEntry
                        };
                    }
                    public static final class AppcSessStatsEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcSessStatsLocLuNameEnt appcSessStatsLocLuName;

                        public final AppcSessStatsParLuNameEnt appcSessStatsParLuName;

                        public final AppcSessStatsSessIndexEnt appcSessStatsSessIndex;

                        public final AppcSessStatsSentFmdBytesEnt appcSessStatsSentFmdBytes;

                        public final AppcSessStatsSentNonFmdBytesEnt appcSessStatsSentNonFmdBytes;

                        public final AppcSessStatsRcvdFmdBytesEnt appcSessStatsRcvdFmdBytes;

                        public final AppcSessStatsRcvdNonFmdBytesEnt appcSessStatsRcvdNonFmdBytes;

                        public final AppcSessStatsSentFmdRusEnt appcSessStatsSentFmdRus;

                        public final AppcSessStatsSentNonFmdRusEnt appcSessStatsSentNonFmdRus;

                        public final AppcSessStatsRcvdFmdRusEnt appcSessStatsRcvdFmdRus;

                        public final AppcSessStatsRcvdNonFmdRusEnt appcSessStatsRcvdNonFmdRus;

                        public final AppcSessStatsCtrUpTimeEnt appcSessStatsCtrUpTime;

                        private AppcSessStatsEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcSessStatsEntry", "1.3.6.1.2.1.34.3.1.4.2.1", false, false, false, true);
                            this.appcSessStatsLocLuName = new AppcSessStatsLocLuNameEnt(mib, this);
                            this.appcSessStatsParLuName = new AppcSessStatsParLuNameEnt(mib, this);
                            this.appcSessStatsSessIndex = new AppcSessStatsSessIndexEnt(mib, this);
                            this.appcSessStatsSentFmdBytes = new AppcSessStatsSentFmdBytesEnt(mib, this);
                            this.appcSessStatsSentNonFmdBytes = new AppcSessStatsSentNonFmdBytesEnt(mib, this);
                            this.appcSessStatsRcvdFmdBytes = new AppcSessStatsRcvdFmdBytesEnt(mib, this);
                            this.appcSessStatsRcvdNonFmdBytes = new AppcSessStatsRcvdNonFmdBytesEnt(mib, this);
                            this.appcSessStatsSentFmdRus = new AppcSessStatsSentFmdRusEnt(mib, this);
                            this.appcSessStatsSentNonFmdRus = new AppcSessStatsSentNonFmdRusEnt(mib, this);
                            this.appcSessStatsRcvdFmdRus = new AppcSessStatsRcvdFmdRusEnt(mib, this);
                            this.appcSessStatsRcvdNonFmdRus = new AppcSessStatsRcvdNonFmdRusEnt(mib, this);
                            this.appcSessStatsCtrUpTime = new AppcSessStatsCtrUpTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcSessStatsLocLuName,
                                this.appcSessStatsParLuName,
                                this.appcSessStatsSessIndex,
                                this.appcSessStatsSentFmdBytes,
                                this.appcSessStatsSentNonFmdBytes,
                                this.appcSessStatsRcvdFmdBytes,
                                this.appcSessStatsRcvdNonFmdBytes,
                                this.appcSessStatsSentFmdRus,
                                this.appcSessStatsSentNonFmdRus,
                                this.appcSessStatsRcvdFmdRus,
                                this.appcSessStatsRcvdNonFmdRus,
                                this.appcSessStatsCtrUpTime
                            };
                        }
                        public static final class AppcSessStatsLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsLocLuName", "1.3.6.1.2.1.34.3.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsParLuName", "1.3.6.1.2.1.34.3.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsSessIndexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsSessIndexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsSessIndex", "1.3.6.1.2.1.34.3.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsSentFmdBytesEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsSentFmdBytesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsSentFmdBytes", "1.3.6.1.2.1.34.3.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsSentNonFmdBytesEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsSentNonFmdBytesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsSentNonFmdBytes", "1.3.6.1.2.1.34.3.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsRcvdFmdBytesEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsRcvdFmdBytesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsRcvdFmdBytes", "1.3.6.1.2.1.34.3.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsRcvdNonFmdBytesEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsRcvdNonFmdBytesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsRcvdNonFmdBytes", "1.3.6.1.2.1.34.3.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsSentFmdRusEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsSentFmdRusEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsSentFmdRus", "1.3.6.1.2.1.34.3.1.4.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsSentNonFmdRusEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsSentNonFmdRusEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsSentNonFmdRus", "1.3.6.1.2.1.34.3.1.4.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsRcvdFmdRusEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsRcvdFmdRusEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsRcvdFmdRus", "1.3.6.1.2.1.34.3.1.4.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsRcvdNonFmdRusEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsRcvdNonFmdRusEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsRcvdNonFmdRus", "1.3.6.1.2.1.34.3.1.4.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessStatsCtrUpTimeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessStatsCtrUpTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessStatsCtrUpTime", "1.3.6.1.2.1.34.3.1.4.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcHistSessTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcHistSessEntryEnt appcHistSessEntry;

                    private AppcHistSessTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcHistSessTable", "1.3.6.1.2.1.34.3.1.4.3", false, true, false, false);
                        this.appcHistSessEntry = new AppcHistSessEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcHistSessEntry
                        };
                    }
                    public static final class AppcHistSessEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcHistSessIndexEnt appcHistSessIndex;

                        public final AppcHistSessTimeEnt appcHistSessTime;

                        public final AppcHistSessTypeEnt appcHistSessType;

                        public final AppcHistSessLocLuNameEnt appcHistSessLocLuName;

                        public final AppcHistSessParLuNameEnt appcHistSessParLuName;

                        public final AppcHistSessModeNameEnt appcHistSessModeName;

                        public final AppcHistSessUnbindTypeEnt appcHistSessUnbindType;

                        public final AppcHistSessSenseDataEnt appcHistSessSenseData;

                        public final AppcHistSessComponentIdEnt appcHistSessComponentId;

                        public final AppcHistSessDetectModuleEnt appcHistSessDetectModule;

                        private AppcHistSessEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcHistSessEntry", "1.3.6.1.2.1.34.3.1.4.3.1", false, false, false, true);
                            this.appcHistSessIndex = new AppcHistSessIndexEnt(mib, this);
                            this.appcHistSessTime = new AppcHistSessTimeEnt(mib, this);
                            this.appcHistSessType = new AppcHistSessTypeEnt(mib, this);
                            this.appcHistSessLocLuName = new AppcHistSessLocLuNameEnt(mib, this);
                            this.appcHistSessParLuName = new AppcHistSessParLuNameEnt(mib, this);
                            this.appcHistSessModeName = new AppcHistSessModeNameEnt(mib, this);
                            this.appcHistSessUnbindType = new AppcHistSessUnbindTypeEnt(mib, this);
                            this.appcHistSessSenseData = new AppcHistSessSenseDataEnt(mib, this);
                            this.appcHistSessComponentId = new AppcHistSessComponentIdEnt(mib, this);
                            this.appcHistSessDetectModule = new AppcHistSessDetectModuleEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcHistSessIndex,
                                this.appcHistSessTime,
                                this.appcHistSessType,
                                this.appcHistSessLocLuName,
                                this.appcHistSessParLuName,
                                this.appcHistSessModeName,
                                this.appcHistSessUnbindType,
                                this.appcHistSessSenseData,
                                this.appcHistSessComponentId,
                                this.appcHistSessDetectModule
                            };
                        }
                        public static final class AppcHistSessIndexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessIndexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessIndex", "1.3.6.1.2.1.34.3.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessTimeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessTime", "1.3.6.1.2.1.34.3.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessType", "1.3.6.1.2.1.34.3.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessLocLuName", "1.3.6.1.2.1.34.3.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessParLuName", "1.3.6.1.2.1.34.3.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessModeName", "1.3.6.1.2.1.34.3.1.4.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessUnbindTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessUnbindTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessUnbindType", "1.3.6.1.2.1.34.3.1.4.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessSenseDataEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessSenseDataEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessSenseData", "1.3.6.1.2.1.34.3.1.4.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessComponentIdEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessComponentIdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessComponentId", "1.3.6.1.2.1.34.3.1.4.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistSessDetectModuleEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistSessDetectModuleEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistSessDetectModule", "1.3.6.1.2.1.34.3.1.4.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcSessRtpTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcSessRtpEntryEnt appcSessRtpEntry;

                    private AppcSessRtpTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcSessRtpTable", "1.3.6.1.2.1.34.3.1.4.4", false, true, false, false);
                        this.appcSessRtpEntry = new AppcSessRtpEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcSessRtpEntry
                        };
                    }
                    public static final class AppcSessRtpEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcSessRtpNceIdEnt appcSessRtpNceId;

                        public final AppcSessRtpTcidEnt appcSessRtpTcid;

                        public final AppcSessRtpSessionsEnt appcSessRtpSessions;

                        private AppcSessRtpEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcSessRtpEntry", "1.3.6.1.2.1.34.3.1.4.4.1", false, false, false, true);
                            this.appcSessRtpNceId = new AppcSessRtpNceIdEnt(mib, this);
                            this.appcSessRtpTcid = new AppcSessRtpTcidEnt(mib, this);
                            this.appcSessRtpSessions = new AppcSessRtpSessionsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcSessRtpNceId,
                                this.appcSessRtpTcid,
                                this.appcSessRtpSessions
                            };
                        }
                        public static final class AppcSessRtpNceIdEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessRtpNceIdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessRtpNceId", "1.3.6.1.2.1.34.3.1.4.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessRtpTcidEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessRtpTcidEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessRtpTcid", "1.3.6.1.2.1.34.3.1.4.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcSessRtpSessionsEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcSessRtpSessionsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcSessRtpSessions", "1.3.6.1.2.1.34.3.1.4.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppcConversationEnt extends MIBEntry<APPCMIBDef>
            {
                /** *********************************************************************APPC Active Conversation TableThis table contains information about active APPC conversations.**********************************************************************/
                public final AppcActiveConvTableEnt appcActiveConvTable;

                /** *********************************************************************APPC Historical Conversation TableThis table contains historical information about APPCconversations that ended abnormally.  It is an implementationchoice how long to retain information on a given conversation.**********************************************************************/
                public final AppcHistConvTableEnt appcHistConvTable;

                private AppcConversationEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcConversation", "1.3.6.1.2.1.34.3.1.5", false, false, false, false);
                    this.appcActiveConvTable = new AppcActiveConvTableEnt(mib, this);
                    this.appcHistConvTable = new AppcHistConvTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcActiveConvTable,
                        this.appcHistConvTable
                    };
                }
                public static final class AppcActiveConvTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcActiveConvEntryEnt appcActiveConvEntry;

                    private AppcActiveConvTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcActiveConvTable", "1.3.6.1.2.1.34.3.1.5.1", false, true, false, false);
                        this.appcActiveConvEntry = new AppcActiveConvEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcActiveConvEntry
                        };
                    }
                    public static final class AppcActiveConvEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcActiveConvLocLuNameEnt appcActiveConvLocLuName;

                        public final AppcActiveConvParLuNameEnt appcActiveConvParLuName;

                        public final AppcActiveConvSessIndexEnt appcActiveConvSessIndex;

                        public final AppcActiveConvIdEnt appcActiveConvId;

                        public final AppcActiveConvStateEnt appcActiveConvState;

                        public final AppcActiveConvTypeEnt appcActiveConvType;

                        public final AppcActiveConvCorrelatorEnt appcActiveConvCorrelator;

                        public final AppcActiveConvSyncLvlEnt appcActiveConvSyncLvl;

                        public final AppcActiveConvSourceEnt appcActiveConvSource;

                        public final AppcActiveConvDuplexEnt appcActiveConvDuplex;

                        public final AppcActiveConvUpTimeEnt appcActiveConvUpTime;

                        public final AppcActiveConvSendBytesEnt appcActiveConvSendBytes;

                        public final AppcActiveConvRcvBytesEnt appcActiveConvRcvBytes;

                        public final AppcActiveConvUseridEnt appcActiveConvUserid;

                        public final AppcActiveConvPcidNauNameEnt appcActiveConvPcidNauName;

                        public final AppcActiveConvPcidEnt appcActiveConvPcid;

                        public final AppcActiveConvModeNameEnt appcActiveConvModeName;

                        public final AppcActiveConvLuwIdNameEnt appcActiveConvLuwIdName;

                        public final AppcActiveConvLuwIdInstanceEnt appcActiveConvLuwIdInstance;

                        public final AppcActiveConvLuwIdSequenceEnt appcActiveConvLuwIdSequence;

                        public final AppcActiveConvTpNameEnt appcActiveConvTpName;

                        private AppcActiveConvEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcActiveConvEntry", "1.3.6.1.2.1.34.3.1.5.1.1", false, false, false, true);
                            this.appcActiveConvLocLuName = new AppcActiveConvLocLuNameEnt(mib, this);
                            this.appcActiveConvParLuName = new AppcActiveConvParLuNameEnt(mib, this);
                            this.appcActiveConvSessIndex = new AppcActiveConvSessIndexEnt(mib, this);
                            this.appcActiveConvId = new AppcActiveConvIdEnt(mib, this);
                            this.appcActiveConvState = new AppcActiveConvStateEnt(mib, this);
                            this.appcActiveConvType = new AppcActiveConvTypeEnt(mib, this);
                            this.appcActiveConvCorrelator = new AppcActiveConvCorrelatorEnt(mib, this);
                            this.appcActiveConvSyncLvl = new AppcActiveConvSyncLvlEnt(mib, this);
                            this.appcActiveConvSource = new AppcActiveConvSourceEnt(mib, this);
                            this.appcActiveConvDuplex = new AppcActiveConvDuplexEnt(mib, this);
                            this.appcActiveConvUpTime = new AppcActiveConvUpTimeEnt(mib, this);
                            this.appcActiveConvSendBytes = new AppcActiveConvSendBytesEnt(mib, this);
                            this.appcActiveConvRcvBytes = new AppcActiveConvRcvBytesEnt(mib, this);
                            this.appcActiveConvUserid = new AppcActiveConvUseridEnt(mib, this);
                            this.appcActiveConvPcidNauName = new AppcActiveConvPcidNauNameEnt(mib, this);
                            this.appcActiveConvPcid = new AppcActiveConvPcidEnt(mib, this);
                            this.appcActiveConvModeName = new AppcActiveConvModeNameEnt(mib, this);
                            this.appcActiveConvLuwIdName = new AppcActiveConvLuwIdNameEnt(mib, this);
                            this.appcActiveConvLuwIdInstance = new AppcActiveConvLuwIdInstanceEnt(mib, this);
                            this.appcActiveConvLuwIdSequence = new AppcActiveConvLuwIdSequenceEnt(mib, this);
                            this.appcActiveConvTpName = new AppcActiveConvTpNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcActiveConvLocLuName,
                                this.appcActiveConvParLuName,
                                this.appcActiveConvSessIndex,
                                this.appcActiveConvId,
                                this.appcActiveConvState,
                                this.appcActiveConvType,
                                this.appcActiveConvCorrelator,
                                this.appcActiveConvSyncLvl,
                                this.appcActiveConvSource,
                                this.appcActiveConvDuplex,
                                this.appcActiveConvUpTime,
                                this.appcActiveConvSendBytes,
                                this.appcActiveConvRcvBytes,
                                this.appcActiveConvUserid,
                                this.appcActiveConvPcidNauName,
                                this.appcActiveConvPcid,
                                this.appcActiveConvModeName,
                                this.appcActiveConvLuwIdName,
                                this.appcActiveConvLuwIdInstance,
                                this.appcActiveConvLuwIdSequence,
                                this.appcActiveConvTpName
                            };
                        }
                        public static final class AppcActiveConvLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvLocLuName", "1.3.6.1.2.1.34.3.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvParLuName", "1.3.6.1.2.1.34.3.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvSessIndexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvSessIndexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvSessIndex", "1.3.6.1.2.1.34.3.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvIdEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvIdEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvId", "1.3.6.1.2.1.34.3.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvStateEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvStateEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvState", "1.3.6.1.2.1.34.3.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvType", "1.3.6.1.2.1.34.3.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvCorrelatorEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvCorrelatorEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvCorrelator", "1.3.6.1.2.1.34.3.1.5.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvSyncLvlEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvSyncLvlEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvSyncLvl", "1.3.6.1.2.1.34.3.1.5.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvSourceEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvSourceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvSource", "1.3.6.1.2.1.34.3.1.5.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvDuplexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvDuplexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvDuplex", "1.3.6.1.2.1.34.3.1.5.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvUpTimeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvUpTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvUpTime", "1.3.6.1.2.1.34.3.1.5.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvSendBytesEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvSendBytesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvSendBytes", "1.3.6.1.2.1.34.3.1.5.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvRcvBytesEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvRcvBytesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvRcvBytes", "1.3.6.1.2.1.34.3.1.5.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvUseridEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvUseridEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvUserid", "1.3.6.1.2.1.34.3.1.5.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvPcidNauNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvPcidNauNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvPcidNauName", "1.3.6.1.2.1.34.3.1.5.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvPcidEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvPcidEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvPcid", "1.3.6.1.2.1.34.3.1.5.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvModeName", "1.3.6.1.2.1.34.3.1.5.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvLuwIdNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvLuwIdNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvLuwIdName", "1.3.6.1.2.1.34.3.1.5.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvLuwIdInstanceEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvLuwIdInstanceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvLuwIdInstance", "1.3.6.1.2.1.34.3.1.5.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvLuwIdSequenceEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvLuwIdSequenceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvLuwIdSequence", "1.3.6.1.2.1.34.3.1.5.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcActiveConvTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcActiveConvTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcActiveConvTpName", "1.3.6.1.2.1.34.3.1.5.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcHistConvTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcHistConvEntryEnt appcHistConvEntry;

                    private AppcHistConvTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcHistConvTable", "1.3.6.1.2.1.34.3.1.5.2", false, true, false, false);
                        this.appcHistConvEntry = new AppcHistConvEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcHistConvEntry
                        };
                    }
                    public static final class AppcHistConvEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcHistConvIndexEnt appcHistConvIndex;

                        public final AppcHistConvEndTimeEnt appcHistConvEndTime;

                        public final AppcHistConvLocLuNameEnt appcHistConvLocLuName;

                        public final AppcHistConvParLuNameEnt appcHistConvParLuName;

                        public final AppcHistConvTpNameEnt appcHistConvTpName;

                        public final AppcHistConvPcidNauNameEnt appcHistConvPcidNauName;

                        public final AppcHistConvPcidEnt appcHistConvPcid;

                        public final AppcHistConvSenseDataEnt appcHistConvSenseData;

                        public final AppcHistConvLogDataEnt appcHistConvLogData;

                        public final AppcHistConvEndedByEnt appcHistConvEndedBy;

                        private AppcHistConvEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcHistConvEntry", "1.3.6.1.2.1.34.3.1.5.2.1", false, false, false, true);
                            this.appcHistConvIndex = new AppcHistConvIndexEnt(mib, this);
                            this.appcHistConvEndTime = new AppcHistConvEndTimeEnt(mib, this);
                            this.appcHistConvLocLuName = new AppcHistConvLocLuNameEnt(mib, this);
                            this.appcHistConvParLuName = new AppcHistConvParLuNameEnt(mib, this);
                            this.appcHistConvTpName = new AppcHistConvTpNameEnt(mib, this);
                            this.appcHistConvPcidNauName = new AppcHistConvPcidNauNameEnt(mib, this);
                            this.appcHistConvPcid = new AppcHistConvPcidEnt(mib, this);
                            this.appcHistConvSenseData = new AppcHistConvSenseDataEnt(mib, this);
                            this.appcHistConvLogData = new AppcHistConvLogDataEnt(mib, this);
                            this.appcHistConvEndedBy = new AppcHistConvEndedByEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcHistConvIndex,
                                this.appcHistConvEndTime,
                                this.appcHistConvLocLuName,
                                this.appcHistConvParLuName,
                                this.appcHistConvTpName,
                                this.appcHistConvPcidNauName,
                                this.appcHistConvPcid,
                                this.appcHistConvSenseData,
                                this.appcHistConvLogData,
                                this.appcHistConvEndedBy
                            };
                        }
                        public static final class AppcHistConvIndexEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvIndexEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvIndex", "1.3.6.1.2.1.34.3.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvEndTimeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvEndTimeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvEndTime", "1.3.6.1.2.1.34.3.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvLocLuName", "1.3.6.1.2.1.34.3.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvParLuName", "1.3.6.1.2.1.34.3.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvTpName", "1.3.6.1.2.1.34.3.1.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvPcidNauNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvPcidNauNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvPcidNauName", "1.3.6.1.2.1.34.3.1.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvPcidEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvPcidEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvPcid", "1.3.6.1.2.1.34.3.1.5.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvSenseDataEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvSenseDataEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvSenseData", "1.3.6.1.2.1.34.3.1.5.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvLogDataEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvLogDataEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvLogData", "1.3.6.1.2.1.34.3.1.5.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcHistConvEndedByEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcHistConvEndedByEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcHistConvEndedBy", "1.3.6.1.2.1.34.3.1.5.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppcCPICEnt extends MIBEntry<APPCMIBDef>
            {
                /** *********************************************************************APPC CPIC Admin TableObjects in this table contain default or expected configurationvalues for CPI-C side information.**********************************************************************/
                public final AppcCpicAdminTableEnt appcCpicAdminTable;

                /** *********************************************************************APPC CPIC Oper TableObjects in this table contain current operational values, suchas state values or negotiated parameters, for CPI-C sideinformation.**********************************************************************/
                public final AppcCpicOperTableEnt appcCpicOperTable;

                private AppcCPICEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcCPIC", "1.3.6.1.2.1.34.3.1.6", false, false, false, false);
                    this.appcCpicAdminTable = new AppcCpicAdminTableEnt(mib, this);
                    this.appcCpicOperTable = new AppcCpicOperTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcCpicAdminTable,
                        this.appcCpicOperTable
                    };
                }
                public static final class AppcCpicAdminTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcCpicAdminEntryEnt appcCpicAdminEntry;

                    private AppcCpicAdminTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCpicAdminTable", "1.3.6.1.2.1.34.3.1.6.1", false, true, false, false);
                        this.appcCpicAdminEntry = new AppcCpicAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcCpicAdminEntry
                        };
                    }
                    public static final class AppcCpicAdminEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcCpicAdminLocLuNameEnt appcCpicAdminLocLuName;

                        public final AppcCpicAdminSymbDestNameEnt appcCpicAdminSymbDestName;

                        public final AppcCpicAdminParLuAliasEnt appcCpicAdminParLuAlias;

                        public final AppcCpicAdminParLuNameEnt appcCpicAdminParLuName;

                        public final AppcCpicAdminModeNameEnt appcCpicAdminModeName;

                        public final AppcCpicAdminTpNameTypeEnt appcCpicAdminTpNameType;

                        public final AppcCpicAdminTpNameEnt appcCpicAdminTpName;

                        public final AppcCpicAdminUseridEnt appcCpicAdminUserid;

                        public final AppcCpicAdminSecurityEnt appcCpicAdminSecurity;

                        private AppcCpicAdminEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCpicAdminEntry", "1.3.6.1.2.1.34.3.1.6.1.1", false, false, false, true);
                            this.appcCpicAdminLocLuName = new AppcCpicAdminLocLuNameEnt(mib, this);
                            this.appcCpicAdminSymbDestName = new AppcCpicAdminSymbDestNameEnt(mib, this);
                            this.appcCpicAdminParLuAlias = new AppcCpicAdminParLuAliasEnt(mib, this);
                            this.appcCpicAdminParLuName = new AppcCpicAdminParLuNameEnt(mib, this);
                            this.appcCpicAdminModeName = new AppcCpicAdminModeNameEnt(mib, this);
                            this.appcCpicAdminTpNameType = new AppcCpicAdminTpNameTypeEnt(mib, this);
                            this.appcCpicAdminTpName = new AppcCpicAdminTpNameEnt(mib, this);
                            this.appcCpicAdminUserid = new AppcCpicAdminUseridEnt(mib, this);
                            this.appcCpicAdminSecurity = new AppcCpicAdminSecurityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcCpicAdminLocLuName,
                                this.appcCpicAdminSymbDestName,
                                this.appcCpicAdminParLuAlias,
                                this.appcCpicAdminParLuName,
                                this.appcCpicAdminModeName,
                                this.appcCpicAdminTpNameType,
                                this.appcCpicAdminTpName,
                                this.appcCpicAdminUserid,
                                this.appcCpicAdminSecurity
                            };
                        }
                        public static final class AppcCpicAdminLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminLocLuName", "1.3.6.1.2.1.34.3.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminSymbDestNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminSymbDestNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminSymbDestName", "1.3.6.1.2.1.34.3.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminParLuAliasEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminParLuAliasEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminParLuAlias", "1.3.6.1.2.1.34.3.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminParLuName", "1.3.6.1.2.1.34.3.1.6.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminModeName", "1.3.6.1.2.1.34.3.1.6.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminTpNameTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminTpNameTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminTpNameType", "1.3.6.1.2.1.34.3.1.6.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminTpName", "1.3.6.1.2.1.34.3.1.6.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminUseridEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminUseridEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminUserid", "1.3.6.1.2.1.34.3.1.6.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicAdminSecurityEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicAdminSecurityEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicAdminSecurity", "1.3.6.1.2.1.34.3.1.6.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppcCpicOperTableEnt extends MIBEntry<APPCMIBDef>
                {
                    public final AppcCpicOperEntryEnt appcCpicOperEntry;

                    private AppcCpicOperTableEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCpicOperTable", "1.3.6.1.2.1.34.3.1.6.2", false, true, false, false);
                        this.appcCpicOperEntry = new AppcCpicOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appcCpicOperEntry
                        };
                    }
                    public static final class AppcCpicOperEntryEnt extends MIBEntry<APPCMIBDef>
                    {
                        public final AppcCpicOperLocLuNameEnt appcCpicOperLocLuName;

                        public final AppcCpicOperSymbDestNameEnt appcCpicOperSymbDestName;

                        public final AppcCpicOperParLuAliasEnt appcCpicOperParLuAlias;

                        public final AppcCpicOperParLuNameEnt appcCpicOperParLuName;

                        public final AppcCpicOperModeNameEnt appcCpicOperModeName;

                        public final AppcCpicOperTpNameTypeEnt appcCpicOperTpNameType;

                        public final AppcCpicOperTpNameEnt appcCpicOperTpName;

                        public final AppcCpicOperUseridEnt appcCpicOperUserid;

                        public final AppcCpicOperSecurityEnt appcCpicOperSecurity;

                        private AppcCpicOperEntryEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                        {
                            super(mib, parent, "appcCpicOperEntry", "1.3.6.1.2.1.34.3.1.6.2.1", false, false, false, true);
                            this.appcCpicOperLocLuName = new AppcCpicOperLocLuNameEnt(mib, this);
                            this.appcCpicOperSymbDestName = new AppcCpicOperSymbDestNameEnt(mib, this);
                            this.appcCpicOperParLuAlias = new AppcCpicOperParLuAliasEnt(mib, this);
                            this.appcCpicOperParLuName = new AppcCpicOperParLuNameEnt(mib, this);
                            this.appcCpicOperModeName = new AppcCpicOperModeNameEnt(mib, this);
                            this.appcCpicOperTpNameType = new AppcCpicOperTpNameTypeEnt(mib, this);
                            this.appcCpicOperTpName = new AppcCpicOperTpNameEnt(mib, this);
                            this.appcCpicOperUserid = new AppcCpicOperUseridEnt(mib, this);
                            this.appcCpicOperSecurity = new AppcCpicOperSecurityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appcCpicOperLocLuName,
                                this.appcCpicOperSymbDestName,
                                this.appcCpicOperParLuAlias,
                                this.appcCpicOperParLuName,
                                this.appcCpicOperModeName,
                                this.appcCpicOperTpNameType,
                                this.appcCpicOperTpName,
                                this.appcCpicOperUserid,
                                this.appcCpicOperSecurity
                            };
                        }
                        public static final class AppcCpicOperLocLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperLocLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperLocLuName", "1.3.6.1.2.1.34.3.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperSymbDestNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperSymbDestNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperSymbDestName", "1.3.6.1.2.1.34.3.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperParLuAliasEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperParLuAliasEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperParLuAlias", "1.3.6.1.2.1.34.3.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperParLuNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperParLuNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperParLuName", "1.3.6.1.2.1.34.3.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperModeNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperModeNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperModeName", "1.3.6.1.2.1.34.3.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperTpNameTypeEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperTpNameTypeEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperTpNameType", "1.3.6.1.2.1.34.3.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperTpNameEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperTpNameEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperTpName", "1.3.6.1.2.1.34.3.1.6.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperUseridEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperUseridEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperUserid", "1.3.6.1.2.1.34.3.1.6.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppcCpicOperSecurityEnt extends MIBEntry<APPCMIBDef>
                        {
                            private AppcCpicOperSecurityEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                            {
                                super(mib, parent, "appcCpicOperSecurity", "1.3.6.1.2.1.34.3.1.6.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class AppcConformanceEnt extends MIBEntry<APPCMIBDef>
        {
            public final AppcCompliancesEnt appcCompliances;

            public final AppcGroupsEnt appcGroups;

            private AppcConformanceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
            {
                super(mib, parent, "appcConformance", "1.3.6.1.2.1.34.3.2", false, false, false, false);
                this.appcCompliances = new AppcCompliancesEnt(mib, this);
                this.appcGroups = new AppcGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.appcCompliances,
                    this.appcGroups
                };
            }
            public static final class AppcCompliancesEnt extends MIBEntry<APPCMIBDef>
            {
                /** Compliance statements*/
                public final AppcComplianceEnt appcCompliance;

                private AppcCompliancesEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcCompliances", "1.3.6.1.2.1.34.3.2.1", false, false, false, false);
                    this.appcCompliance = new AppcComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcCompliance
                    };
                }
                public static final class AppcComplianceEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcComplianceEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCompliance", "1.3.6.1.2.1.34.3.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AppcGroupsEnt extends MIBEntry<APPCMIBDef>
            {
                /** Units of conformance*/
                public final AppcGlobalConfGroupEnt appcGlobalConfGroup;

                public final AppcLluConfGroupEnt appcLluConfGroup;

                public final AppcParLuConfGroupEnt appcParLuConfGroup;

                public final AppcModeConfGroupEnt appcModeConfGroup;

                public final AppcTpConfGroupEnt appcTpConfGroup;

                public final AppcSessionConfGroupEnt appcSessionConfGroup;

                public final AppcControlConfGroupEnt appcControlConfGroup;

                public final AppcCnosConfGroupEnt appcCnosConfGroup;

                public final AppcCpicConfGroupEnt appcCpicConfGroup;

                public final AppcConversationConfGroupEnt appcConversationConfGroup;

                private AppcGroupsEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                {
                    super(mib, parent, "appcGroups", "1.3.6.1.2.1.34.3.2.2", false, false, false, false);
                    this.appcGlobalConfGroup = new AppcGlobalConfGroupEnt(mib, this);
                    this.appcLluConfGroup = new AppcLluConfGroupEnt(mib, this);
                    this.appcParLuConfGroup = new AppcParLuConfGroupEnt(mib, this);
                    this.appcModeConfGroup = new AppcModeConfGroupEnt(mib, this);
                    this.appcTpConfGroup = new AppcTpConfGroupEnt(mib, this);
                    this.appcSessionConfGroup = new AppcSessionConfGroupEnt(mib, this);
                    this.appcControlConfGroup = new AppcControlConfGroupEnt(mib, this);
                    this.appcCnosConfGroup = new AppcCnosConfGroupEnt(mib, this);
                    this.appcCpicConfGroup = new AppcCpicConfGroupEnt(mib, this);
                    this.appcConversationConfGroup = new AppcConversationConfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appcGlobalConfGroup,
                        this.appcLluConfGroup,
                        this.appcParLuConfGroup,
                        this.appcModeConfGroup,
                        this.appcTpConfGroup,
                        this.appcSessionConfGroup,
                        this.appcControlConfGroup,
                        this.appcCnosConfGroup,
                        this.appcCpicConfGroup,
                        this.appcConversationConfGroup
                    };
                }
                public static final class AppcGlobalConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcGlobalConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcGlobalConfGroup", "1.3.6.1.2.1.34.3.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcLluConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcLluConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcLluConfGroup", "1.3.6.1.2.1.34.3.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcParLuConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcParLuConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcParLuConfGroup", "1.3.6.1.2.1.34.3.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcModeConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcModeConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcModeConfGroup", "1.3.6.1.2.1.34.3.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcTpConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcTpConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcTpConfGroup", "1.3.6.1.2.1.34.3.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcSessionConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcSessionConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcSessionConfGroup", "1.3.6.1.2.1.34.3.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcControlConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcControlConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcControlConfGroup", "1.3.6.1.2.1.34.3.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcCnosConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcCnosConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCnosConfGroup", "1.3.6.1.2.1.34.3.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcCpicConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcCpicConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcCpicConfGroup", "1.3.6.1.2.1.34.3.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppcConversationConfGroupEnt extends MIBEntry<APPCMIBDef>
                {
                    private AppcConversationConfGroupEnt(APPCMIBDef mib, MIBEntry<APPCMIBDef> parent)
                    {
                        super(mib, parent, "appcConversationConfGroup", "1.3.6.1.2.1.34.3.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
