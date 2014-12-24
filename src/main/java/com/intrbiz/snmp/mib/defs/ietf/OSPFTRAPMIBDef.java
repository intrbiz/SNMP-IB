package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class OSPFTRAPMIBDef extends MIB
{
    public static final OSPFTRAPMIBDef OSPFTRAPMIB = new OSPFTRAPMIBDef();

    /** November 10, 2006 00:00:00 EST*/
    public final OspfTrapEnt ospfTrap;

    private OSPFTRAPMIBDef()
    {
        super("OSPF-TRAP-MIB");
        this.ospfTrap = new OspfTrapEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ospfTrap
        };
    }

    public static final class OspfTrapEnt extends MIBEntry<OSPFTRAPMIBDef>
    {
        /** Trap Support Objects
The following are support objects for the OSPF traps.*/
        public final OspfTrapControlEnt ospfTrapControl;

        public final OspfTrapsEnt ospfTraps;

        /** conformance information*/
        public final OspfTrapConformanceEnt ospfTrapConformance;

        private OspfTrapEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
        {
            super(mib, parent, "ospfTrap", "1.3.6.1.2.1.14.16", false, false, false, false);
            this.ospfTrapControl = new OspfTrapControlEnt(mib, this);
            this.ospfTraps = new OspfTrapsEnt(mib, this);
            this.ospfTrapConformance = new OspfTrapConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ospfTrapControl,
                this.ospfTraps,
                this.ospfTrapConformance
            };
        }
        public static final class OspfTrapControlEnt extends MIBEntry<OSPFTRAPMIBDef>
        {
            public final OspfSetTrapEnt ospfSetTrap;

            public final OspfConfigErrorTypeEnt ospfConfigErrorType;

            public final OspfPacketTypeEnt ospfPacketType;

            public final OspfPacketSrcEnt ospfPacketSrc;

            private OspfTrapControlEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
            {
                super(mib, parent, "ospfTrapControl", "1.3.6.1.2.1.14.16.1", false, false, false, false);
                this.ospfSetTrap = new OspfSetTrapEnt(mib, this);
                this.ospfConfigErrorType = new OspfConfigErrorTypeEnt(mib, this);
                this.ospfPacketType = new OspfPacketTypeEnt(mib, this);
                this.ospfPacketSrc = new OspfPacketSrcEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfSetTrap,
                    this.ospfConfigErrorType,
                    this.ospfPacketType,
                    this.ospfPacketSrc
                };
            }
            public static final class OspfSetTrapEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfSetTrapEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfSetTrap", "1.3.6.1.2.1.14.16.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfConfigErrorTypeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfConfigErrorTypeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfConfigErrorType", "1.3.6.1.2.1.14.16.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfPacketTypeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfPacketTypeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfPacketType", "1.3.6.1.2.1.14.16.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfPacketSrcEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfPacketSrcEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfPacketSrc", "1.3.6.1.2.1.14.16.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class OspfTrapsEnt extends MIBEntry<OSPFTRAPMIBDef>
        {
            /** Traps

The originator of the trap
The new state*/
            public final OspfVirtIfStateChangeEnt ospfVirtIfStateChange;

            /** The originator of the trap
The new state*/
            public final OspfNbrStateChangeEnt ospfNbrStateChange;

            /** The originator of the trap
The new state*/
            public final OspfVirtNbrStateChangeEnt ospfVirtNbrStateChange;

            /** The originator of the trap
The source IP address
Type of error*/
            public final OspfIfConfigErrorEnt ospfIfConfigError;

            /** The originator of the trap
Type of error*/
            public final OspfVirtIfConfigErrorEnt ospfVirtIfConfigError;

            /** The originator of the trap
The source IP address
authTypeMismatch or
authFailure*/
            public final OspfIfAuthFailureEnt ospfIfAuthFailure;

            /** The originator of the trap
authTypeMismatch or
authFailure*/
            public final OspfVirtIfAuthFailureEnt ospfVirtIfAuthFailure;

            /** The originator of the trap
The source IP address*/
            public final OspfIfRxBadPacketEnt ospfIfRxBadPacket;

            /** The originator of the trap*/
            public final OspfVirtIfRxBadPacketEnt ospfVirtIfRxBadPacket;

            /** The originator of the trap
Destination*/
            public final OspfTxRetransmitEnt ospfTxRetransmit;

            /** The originator of the trap*/
            public final OspfVirtIfTxRetransmitEnt ospfVirtIfTxRetransmit;

            /** The originator of the trap
0.0.0.0 for AS Externals*/
            public final OspfOriginateLsaEnt ospfOriginateLsa;

            /** The originator of the trap
0.0.0.0 for AS Externals*/
            public final OspfMaxAgeLsaEnt ospfMaxAgeLsa;

            /** The originator of the trap*/
            public final OspfLsdbOverflowEnt ospfLsdbOverflow;

            /** The originator of the trap*/
            public final OspfLsdbApproachingOverflowEnt ospfLsdbApproachingOverflow;

            /** The originator of the trap
The new state*/
            public final OspfIfStateChangeEnt ospfIfStateChange;

            /** The originator of the trap
The current translation
status*/
            public final OspfNssaTranslatorStatusChangeEnt ospfNssaTranslatorStatusChange;

            /** The originator of the trap*/
            public final OspfRestartStatusChangeEnt ospfRestartStatusChange;

            /** The originator of the trap*/
            public final OspfNbrRestartHelperStatusChangeEnt ospfNbrRestartHelperStatusChange;

            /** The originator of the trap*/
            public final OspfVirtNbrRestartHelperStatusChangeEnt ospfVirtNbrRestartHelperStatusChange;

            private OspfTrapsEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
            {
                super(mib, parent, "ospfTraps", "1.3.6.1.2.1.14.16.2", false, false, false, false);
                this.ospfVirtIfStateChange = new OspfVirtIfStateChangeEnt(mib, this);
                this.ospfNbrStateChange = new OspfNbrStateChangeEnt(mib, this);
                this.ospfVirtNbrStateChange = new OspfVirtNbrStateChangeEnt(mib, this);
                this.ospfIfConfigError = new OspfIfConfigErrorEnt(mib, this);
                this.ospfVirtIfConfigError = new OspfVirtIfConfigErrorEnt(mib, this);
                this.ospfIfAuthFailure = new OspfIfAuthFailureEnt(mib, this);
                this.ospfVirtIfAuthFailure = new OspfVirtIfAuthFailureEnt(mib, this);
                this.ospfIfRxBadPacket = new OspfIfRxBadPacketEnt(mib, this);
                this.ospfVirtIfRxBadPacket = new OspfVirtIfRxBadPacketEnt(mib, this);
                this.ospfTxRetransmit = new OspfTxRetransmitEnt(mib, this);
                this.ospfVirtIfTxRetransmit = new OspfVirtIfTxRetransmitEnt(mib, this);
                this.ospfOriginateLsa = new OspfOriginateLsaEnt(mib, this);
                this.ospfMaxAgeLsa = new OspfMaxAgeLsaEnt(mib, this);
                this.ospfLsdbOverflow = new OspfLsdbOverflowEnt(mib, this);
                this.ospfLsdbApproachingOverflow = new OspfLsdbApproachingOverflowEnt(mib, this);
                this.ospfIfStateChange = new OspfIfStateChangeEnt(mib, this);
                this.ospfNssaTranslatorStatusChange = new OspfNssaTranslatorStatusChangeEnt(mib, this);
                this.ospfRestartStatusChange = new OspfRestartStatusChangeEnt(mib, this);
                this.ospfNbrRestartHelperStatusChange = new OspfNbrRestartHelperStatusChangeEnt(mib, this);
                this.ospfVirtNbrRestartHelperStatusChange = new OspfVirtNbrRestartHelperStatusChangeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfVirtIfStateChange,
                    this.ospfNbrStateChange,
                    this.ospfVirtNbrStateChange,
                    this.ospfIfConfigError,
                    this.ospfVirtIfConfigError,
                    this.ospfIfAuthFailure,
                    this.ospfVirtIfAuthFailure,
                    this.ospfIfRxBadPacket,
                    this.ospfVirtIfRxBadPacket,
                    this.ospfTxRetransmit,
                    this.ospfVirtIfTxRetransmit,
                    this.ospfOriginateLsa,
                    this.ospfMaxAgeLsa,
                    this.ospfLsdbOverflow,
                    this.ospfLsdbApproachingOverflow,
                    this.ospfIfStateChange,
                    this.ospfNssaTranslatorStatusChange,
                    this.ospfRestartStatusChange,
                    this.ospfNbrRestartHelperStatusChange,
                    this.ospfVirtNbrRestartHelperStatusChange
                };
            }
            public static final class OspfVirtIfStateChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtIfStateChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtIfStateChange", "1.3.6.1.2.1.14.16.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfNbrStateChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfNbrStateChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfNbrStateChange", "1.3.6.1.2.1.14.16.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVirtNbrStateChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtNbrStateChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtNbrStateChange", "1.3.6.1.2.1.14.16.2.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfIfConfigErrorEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfIfConfigErrorEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfIfConfigError", "1.3.6.1.2.1.14.16.2.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVirtIfConfigErrorEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtIfConfigErrorEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtIfConfigError", "1.3.6.1.2.1.14.16.2.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfIfAuthFailureEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfIfAuthFailureEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfIfAuthFailure", "1.3.6.1.2.1.14.16.2.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVirtIfAuthFailureEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtIfAuthFailureEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtIfAuthFailure", "1.3.6.1.2.1.14.16.2.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfIfRxBadPacketEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfIfRxBadPacketEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfIfRxBadPacket", "1.3.6.1.2.1.14.16.2.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVirtIfRxBadPacketEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtIfRxBadPacketEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtIfRxBadPacket", "1.3.6.1.2.1.14.16.2.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfTxRetransmitEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfTxRetransmitEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfTxRetransmit", "1.3.6.1.2.1.14.16.2.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVirtIfTxRetransmitEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtIfTxRetransmitEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtIfTxRetransmit", "1.3.6.1.2.1.14.16.2.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfOriginateLsaEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfOriginateLsaEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfOriginateLsa", "1.3.6.1.2.1.14.16.2.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfMaxAgeLsaEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfMaxAgeLsaEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfMaxAgeLsa", "1.3.6.1.2.1.14.16.2.13", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfLsdbOverflowEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfLsdbOverflowEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfLsdbOverflow", "1.3.6.1.2.1.14.16.2.14", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfLsdbApproachingOverflowEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfLsdbApproachingOverflowEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfLsdbApproachingOverflow", "1.3.6.1.2.1.14.16.2.15", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfIfStateChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfIfStateChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfIfStateChange", "1.3.6.1.2.1.14.16.2.16", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfNssaTranslatorStatusChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfNssaTranslatorStatusChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfNssaTranslatorStatusChange", "1.3.6.1.2.1.14.16.2.17", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartStatusChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfRestartStatusChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartStatusChange", "1.3.6.1.2.1.14.16.2.18", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfNbrRestartHelperStatusChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfNbrRestartHelperStatusChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfNbrRestartHelperStatusChange", "1.3.6.1.2.1.14.16.2.19", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVirtNbrRestartHelperStatusChangeEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                private OspfVirtNbrRestartHelperStatusChangeEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtNbrRestartHelperStatusChange", "1.3.6.1.2.1.14.16.2.20", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class OspfTrapConformanceEnt extends MIBEntry<OSPFTRAPMIBDef>
        {
            public final OspfTrapGroupsEnt ospfTrapGroups;

            public final OspfTrapCompliancesEnt ospfTrapCompliances;

            private OspfTrapConformanceEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
            {
                super(mib, parent, "ospfTrapConformance", "1.3.6.1.2.1.14.16.3", false, false, false, false);
                this.ospfTrapGroups = new OspfTrapGroupsEnt(mib, this);
                this.ospfTrapCompliances = new OspfTrapCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfTrapGroups,
                    this.ospfTrapCompliances
                };
            }
            public static final class OspfTrapGroupsEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                /** units of conformance*/
                public final OspfTrapControlGroupEnt ospfTrapControlGroup;

                public final OspfTrapEventGroupEnt ospfTrapEventGroup;

                private OspfTrapGroupsEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfTrapGroups", "1.3.6.1.2.1.14.16.3.1", false, false, false, false);
                    this.ospfTrapControlGroup = new OspfTrapControlGroupEnt(mib, this);
                    this.ospfTrapEventGroup = new OspfTrapEventGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfTrapControlGroup,
                        this.ospfTrapEventGroup
                    };
                }
                public static final class OspfTrapControlGroupEnt extends MIBEntry<OSPFTRAPMIBDef>
                {
                    private OspfTrapControlGroupEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                    {
                        super(mib, parent, "ospfTrapControlGroup", "1.3.6.1.2.1.14.16.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfTrapEventGroupEnt extends MIBEntry<OSPFTRAPMIBDef>
                {
                    private OspfTrapEventGroupEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                    {
                        super(mib, parent, "ospfTrapEventGroup", "1.3.6.1.2.1.14.16.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class OspfTrapCompliancesEnt extends MIBEntry<OSPFTRAPMIBDef>
            {
                /** compliance statements*/
                public final OspfTrapComplianceEnt ospfTrapCompliance;

                public final OspfTrapCompliance2Ent ospfTrapCompliance2;

                private OspfTrapCompliancesEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                {
                    super(mib, parent, "ospfTrapCompliances", "1.3.6.1.2.1.14.16.3.2", false, false, false, false);
                    this.ospfTrapCompliance = new OspfTrapComplianceEnt(mib, this);
                    this.ospfTrapCompliance2 = new OspfTrapCompliance2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfTrapCompliance,
                        this.ospfTrapCompliance2
                    };
                }
                public static final class OspfTrapComplianceEnt extends MIBEntry<OSPFTRAPMIBDef>
                {
                    private OspfTrapComplianceEnt(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                    {
                        super(mib, parent, "ospfTrapCompliance", "1.3.6.1.2.1.14.16.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfTrapCompliance2Ent extends MIBEntry<OSPFTRAPMIBDef>
                {
                    private OspfTrapCompliance2Ent(OSPFTRAPMIBDef mib, MIBEntry<OSPFTRAPMIBDef> parent)
                    {
                        super(mib, parent, "ospfTrapCompliance2", "1.3.6.1.2.1.14.16.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
