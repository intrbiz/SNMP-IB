package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class AGENTXMIBDef extends MIB
{
    public static final AGENTXMIBDef AGENTXMIB = new AGENTXMIBDef();

    /** Midnight 10 January 2000*/
    public final AgentxMIBEnt agentxMIB;

    private AGENTXMIBDef()
    {
        super("AGENTX-MIB");
        this.agentxMIB = new AgentxMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.agentxMIB
        };
    }

    public static final class AgentxMIBEnt extends MIBEntry<AGENTXMIBDef>
    {
        /** Administrative assignments*/
        public final AgentxObjectsEnt agentxObjects;

        /** Conformance Statements for AgentX*/
        public final AgentxConformanceEnt agentxConformance;

        private AgentxMIBEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
        {
            super(mib, parent, "agentxMIB", "1.3.6.1.2.1.74", false, false, false, false);
            this.agentxObjects = new AgentxObjectsEnt(mib, this);
            this.agentxConformance = new AgentxConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.agentxObjects,
                this.agentxConformance
            };
        }
        public static final class AgentxObjectsEnt extends MIBEntry<AGENTXMIBDef>
        {
            public final AgentxGeneralEnt agentxGeneral;

            public final AgentxConnectionEnt agentxConnection;

            public final AgentxSessionEnt agentxSession;

            public final AgentxRegistrationEnt agentxRegistration;

            private AgentxObjectsEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
            {
                super(mib, parent, "agentxObjects", "1.3.6.1.2.1.74.1", false, false, false, false);
                this.agentxGeneral = new AgentxGeneralEnt(mib, this);
                this.agentxConnection = new AgentxConnectionEnt(mib, this);
                this.agentxSession = new AgentxSessionEnt(mib, this);
                this.agentxRegistration = new AgentxRegistrationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.agentxGeneral,
                    this.agentxConnection,
                    this.agentxSession,
                    this.agentxRegistration
                };
            }
            public static final class AgentxGeneralEnt extends MIBEntry<AGENTXMIBDef>
            {
                public final AgentxDefaultTimeoutEnt agentxDefaultTimeout;

                public final AgentxMasterAgentXVerEnt agentxMasterAgentXVer;

                private AgentxGeneralEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                {
                    super(mib, parent, "agentxGeneral", "1.3.6.1.2.1.74.1.1", false, false, false, false);
                    this.agentxDefaultTimeout = new AgentxDefaultTimeoutEnt(mib, this);
                    this.agentxMasterAgentXVer = new AgentxMasterAgentXVerEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentxDefaultTimeout,
                        this.agentxMasterAgentXVer
                    };
                }
                public static final class AgentxDefaultTimeoutEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxDefaultTimeoutEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxDefaultTimeout", "1.3.6.1.2.1.74.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentxMasterAgentXVerEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxMasterAgentXVerEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxMasterAgentXVer", "1.3.6.1.2.1.74.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AgentxConnectionEnt extends MIBEntry<AGENTXMIBDef>
            {
                /** The AgentX Subagent Connection Group*/
                public final AgentxConnTableLastChangeEnt agentxConnTableLastChange;

                public final AgentxConnectionTableEnt agentxConnectionTable;

                private AgentxConnectionEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                {
                    super(mib, parent, "agentxConnection", "1.3.6.1.2.1.74.1.2", false, false, false, false);
                    this.agentxConnTableLastChange = new AgentxConnTableLastChangeEnt(mib, this);
                    this.agentxConnectionTable = new AgentxConnectionTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentxConnTableLastChange,
                        this.agentxConnectionTable
                    };
                }
                public static final class AgentxConnTableLastChangeEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxConnTableLastChangeEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxConnTableLastChange", "1.3.6.1.2.1.74.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentxConnectionTableEnt extends MIBEntry<AGENTXMIBDef>
                {
                    public final AgentxConnectionEntryEnt agentxConnectionEntry;

                    private AgentxConnectionTableEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxConnectionTable", "1.3.6.1.2.1.74.1.2.2", false, true, false, false);
                        this.agentxConnectionEntry = new AgentxConnectionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.agentxConnectionEntry
                        };
                    }
                    public static final class AgentxConnectionEntryEnt extends MIBEntry<AGENTXMIBDef>
                    {
                        public final AgentxConnIndexEnt agentxConnIndex;

                        public final AgentxConnOpenTimeEnt agentxConnOpenTime;

                        public final AgentxConnTransportDomainEnt agentxConnTransportDomain;

                        public final AgentxConnTransportAddressEnt agentxConnTransportAddress;

                        private AgentxConnectionEntryEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                        {
                            super(mib, parent, "agentxConnectionEntry", "1.3.6.1.2.1.74.1.2.2.1", false, false, false, true);
                            this.agentxConnIndex = new AgentxConnIndexEnt(mib, this);
                            this.agentxConnOpenTime = new AgentxConnOpenTimeEnt(mib, this);
                            this.agentxConnTransportDomain = new AgentxConnTransportDomainEnt(mib, this);
                            this.agentxConnTransportAddress = new AgentxConnTransportAddressEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.agentxConnIndex,
                                this.agentxConnOpenTime,
                                this.agentxConnTransportDomain,
                                this.agentxConnTransportAddress
                            };
                        }
                        public static final class AgentxConnIndexEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxConnIndexEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxConnIndex", "1.3.6.1.2.1.74.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxConnOpenTimeEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxConnOpenTimeEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxConnOpenTime", "1.3.6.1.2.1.74.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxConnTransportDomainEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxConnTransportDomainEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxConnTransportDomain", "1.3.6.1.2.1.74.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxConnTransportAddressEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxConnTransportAddressEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxConnTransportAddress", "1.3.6.1.2.1.74.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AgentxSessionEnt extends MIBEntry<AGENTXMIBDef>
            {
                /** The AgentX Subagent Session Group*/
                public final AgentxSessionTableLastChangeEnt agentxSessionTableLastChange;

                public final AgentxSessionTableEnt agentxSessionTable;

                private AgentxSessionEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                {
                    super(mib, parent, "agentxSession", "1.3.6.1.2.1.74.1.3", false, false, false, false);
                    this.agentxSessionTableLastChange = new AgentxSessionTableLastChangeEnt(mib, this);
                    this.agentxSessionTable = new AgentxSessionTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentxSessionTableLastChange,
                        this.agentxSessionTable
                    };
                }
                public static final class AgentxSessionTableLastChangeEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxSessionTableLastChangeEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxSessionTableLastChange", "1.3.6.1.2.1.74.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentxSessionTableEnt extends MIBEntry<AGENTXMIBDef>
                {
                    public final AgentxSessionEntryEnt agentxSessionEntry;

                    private AgentxSessionTableEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxSessionTable", "1.3.6.1.2.1.74.1.3.2", false, true, false, false);
                        this.agentxSessionEntry = new AgentxSessionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.agentxSessionEntry
                        };
                    }
                    public static final class AgentxSessionEntryEnt extends MIBEntry<AGENTXMIBDef>
                    {
                        public final AgentxSessionIndexEnt agentxSessionIndex;

                        public final AgentxSessionObjectIDEnt agentxSessionObjectID;

                        public final AgentxSessionDescrEnt agentxSessionDescr;

                        public final AgentxSessionAdminStatusEnt agentxSessionAdminStatus;

                        public final AgentxSessionOpenTimeEnt agentxSessionOpenTime;

                        public final AgentxSessionAgentXVerEnt agentxSessionAgentXVer;

                        public final AgentxSessionTimeoutEnt agentxSessionTimeout;

                        private AgentxSessionEntryEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                        {
                            super(mib, parent, "agentxSessionEntry", "1.3.6.1.2.1.74.1.3.2.1", false, false, false, true);
                            this.agentxSessionIndex = new AgentxSessionIndexEnt(mib, this);
                            this.agentxSessionObjectID = new AgentxSessionObjectIDEnt(mib, this);
                            this.agentxSessionDescr = new AgentxSessionDescrEnt(mib, this);
                            this.agentxSessionAdminStatus = new AgentxSessionAdminStatusEnt(mib, this);
                            this.agentxSessionOpenTime = new AgentxSessionOpenTimeEnt(mib, this);
                            this.agentxSessionAgentXVer = new AgentxSessionAgentXVerEnt(mib, this);
                            this.agentxSessionTimeout = new AgentxSessionTimeoutEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.agentxSessionIndex,
                                this.agentxSessionObjectID,
                                this.agentxSessionDescr,
                                this.agentxSessionAdminStatus,
                                this.agentxSessionOpenTime,
                                this.agentxSessionAgentXVer,
                                this.agentxSessionTimeout
                            };
                        }
                        public static final class AgentxSessionIndexEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionIndexEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionIndex", "1.3.6.1.2.1.74.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxSessionObjectIDEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionObjectIDEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionObjectID", "1.3.6.1.2.1.74.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxSessionDescrEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionDescrEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionDescr", "1.3.6.1.2.1.74.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxSessionAdminStatusEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionAdminStatusEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionAdminStatus", "1.3.6.1.2.1.74.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxSessionOpenTimeEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionOpenTimeEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionOpenTime", "1.3.6.1.2.1.74.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxSessionAgentXVerEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionAgentXVerEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionAgentXVer", "1.3.6.1.2.1.74.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxSessionTimeoutEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxSessionTimeoutEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxSessionTimeout", "1.3.6.1.2.1.74.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AgentxRegistrationEnt extends MIBEntry<AGENTXMIBDef>
            {
                /** The AgentX Registration Group*/
                public final AgentxRegistrationTableLastChangeEnt agentxRegistrationTableLastChange;

                public final AgentxRegistrationTableEnt agentxRegistrationTable;

                private AgentxRegistrationEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                {
                    super(mib, parent, "agentxRegistration", "1.3.6.1.2.1.74.1.4", false, false, false, false);
                    this.agentxRegistrationTableLastChange = new AgentxRegistrationTableLastChangeEnt(mib, this);
                    this.agentxRegistrationTable = new AgentxRegistrationTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentxRegistrationTableLastChange,
                        this.agentxRegistrationTable
                    };
                }
                public static final class AgentxRegistrationTableLastChangeEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxRegistrationTableLastChangeEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxRegistrationTableLastChange", "1.3.6.1.2.1.74.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentxRegistrationTableEnt extends MIBEntry<AGENTXMIBDef>
                {
                    public final AgentxRegistrationEntryEnt agentxRegistrationEntry;

                    private AgentxRegistrationTableEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxRegistrationTable", "1.3.6.1.2.1.74.1.4.2", false, true, false, false);
                        this.agentxRegistrationEntry = new AgentxRegistrationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.agentxRegistrationEntry
                        };
                    }
                    public static final class AgentxRegistrationEntryEnt extends MIBEntry<AGENTXMIBDef>
                    {
                        public final AgentxRegIndexEnt agentxRegIndex;

                        public final AgentxRegContextEnt agentxRegContext;

                        public final AgentxRegStartEnt agentxRegStart;

                        public final AgentxRegRangeSubIdEnt agentxRegRangeSubId;

                        public final AgentxRegUpperBoundEnt agentxRegUpperBound;

                        public final AgentxRegPriorityEnt agentxRegPriority;

                        public final AgentxRegTimeoutEnt agentxRegTimeout;

                        public final AgentxRegInstanceEnt agentxRegInstance;

                        private AgentxRegistrationEntryEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                        {
                            super(mib, parent, "agentxRegistrationEntry", "1.3.6.1.2.1.74.1.4.2.1", false, false, false, true);
                            this.agentxRegIndex = new AgentxRegIndexEnt(mib, this);
                            this.agentxRegContext = new AgentxRegContextEnt(mib, this);
                            this.agentxRegStart = new AgentxRegStartEnt(mib, this);
                            this.agentxRegRangeSubId = new AgentxRegRangeSubIdEnt(mib, this);
                            this.agentxRegUpperBound = new AgentxRegUpperBoundEnt(mib, this);
                            this.agentxRegPriority = new AgentxRegPriorityEnt(mib, this);
                            this.agentxRegTimeout = new AgentxRegTimeoutEnt(mib, this);
                            this.agentxRegInstance = new AgentxRegInstanceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.agentxRegIndex,
                                this.agentxRegContext,
                                this.agentxRegStart,
                                this.agentxRegRangeSubId,
                                this.agentxRegUpperBound,
                                this.agentxRegPriority,
                                this.agentxRegTimeout,
                                this.agentxRegInstance
                            };
                        }
                        public static final class AgentxRegIndexEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegIndexEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegIndex", "1.3.6.1.2.1.74.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegContextEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegContextEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegContext", "1.3.6.1.2.1.74.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegStartEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegStartEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegStart", "1.3.6.1.2.1.74.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegRangeSubIdEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegRangeSubIdEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegRangeSubId", "1.3.6.1.2.1.74.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegUpperBoundEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegUpperBoundEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegUpperBound", "1.3.6.1.2.1.74.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegPriorityEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegPriorityEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegPriority", "1.3.6.1.2.1.74.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegTimeoutEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegTimeoutEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegTimeout", "1.3.6.1.2.1.74.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AgentxRegInstanceEnt extends MIBEntry<AGENTXMIBDef>
                        {
                            private AgentxRegInstanceEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                            {
                                super(mib, parent, "agentxRegInstance", "1.3.6.1.2.1.74.1.4.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class AgentxConformanceEnt extends MIBEntry<AGENTXMIBDef>
        {
            public final AgentxMIBGroupsEnt agentxMIBGroups;

            public final AgentxMIBCompliancesEnt agentxMIBCompliances;

            private AgentxConformanceEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
            {
                super(mib, parent, "agentxConformance", "1.3.6.1.2.1.74.2", false, false, false, false);
                this.agentxMIBGroups = new AgentxMIBGroupsEnt(mib, this);
                this.agentxMIBCompliances = new AgentxMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.agentxMIBGroups,
                    this.agentxMIBCompliances
                };
            }
            public static final class AgentxMIBGroupsEnt extends MIBEntry<AGENTXMIBDef>
            {
                public final AgentxMIBGroupEnt agentxMIBGroup;

                private AgentxMIBGroupsEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                {
                    super(mib, parent, "agentxMIBGroups", "1.3.6.1.2.1.74.2.1", false, false, false, false);
                    this.agentxMIBGroup = new AgentxMIBGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentxMIBGroup
                    };
                }
                public static final class AgentxMIBGroupEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxMIBGroupEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxMIBGroup", "1.3.6.1.2.1.74.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AgentxMIBCompliancesEnt extends MIBEntry<AGENTXMIBDef>
            {
                /** Compliance Statements for AgentX*/
                public final AgentxMIBComplianceEnt agentxMIBCompliance;

                private AgentxMIBCompliancesEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                {
                    super(mib, parent, "agentxMIBCompliances", "1.3.6.1.2.1.74.2.2", false, false, false, false);
                    this.agentxMIBCompliance = new AgentxMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentxMIBCompliance
                    };
                }
                public static final class AgentxMIBComplianceEnt extends MIBEntry<AGENTXMIBDef>
                {
                    private AgentxMIBComplianceEnt(AGENTXMIBDef mib, MIBEntry<AGENTXMIBDef> parent)
                    {
                        super(mib, parent, "agentxMIBCompliance", "1.3.6.1.2.1.74.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
