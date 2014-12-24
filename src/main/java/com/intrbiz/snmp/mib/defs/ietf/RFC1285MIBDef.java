package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**None defined at present
Chipsets may someday be
defined here*/
public final class RFC1285MIBDef extends MIB
{
    public static final RFC1285MIBDef RFC1285MIB = new RFC1285MIBDef();

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in [7].

this is the FDDI MIB module*/
    public final FddiEnt fddi;

    /** The representation of long MAC addresses as managementvalues is in the IEEE (ANSI/IEEE P802.1A) canonicalnotation for 48 bit addresses.  The canonical form is a6-octet string where the first octet contains the first 8bits of the address, with the I/G (Individual/Group)address bit as the least significant bit and the  U/L(Universal/Local) bit as the next more significant bit,and so on.  Note that the addresses in the SMT frames arerepresented in FDDI MAC order.
groups in the FDDI MIB module*/
    public final SnmpFddiSMTEnt snmpFddiSMT;

    public final SnmpFddiMACEnt snmpFddiMAC;

    public final SnmpFddiPATHEnt snmpFddiPATH;

    public final SnmpFddiPORTEnt snmpFddiPORT;

    public final SnmpFddiATTACHMENTEnt snmpFddiATTACHMENT;

    public final SnmpFddiChipSetsEnt snmpFddiChipSets;

    private RFC1285MIBDef()
    {
        super("RFC1285-MIB");
        this.fddi = new FddiEnt(this, null);
        this.snmpFddiSMT = new SnmpFddiSMTEnt(this, null);
        this.snmpFddiMAC = new SnmpFddiMACEnt(this, null);
        this.snmpFddiPATH = new SnmpFddiPATHEnt(this, null);
        this.snmpFddiPORT = new SnmpFddiPORTEnt(this, null);
        this.snmpFddiATTACHMENT = new SnmpFddiATTACHMENTEnt(this, null);
        this.snmpFddiChipSets = new SnmpFddiChipSetsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.fddi,
            this.snmpFddiSMT,
            this.snmpFddiMAC,
            this.snmpFddiPATH,
            this.snmpFddiPORT,
            this.snmpFddiATTACHMENT,
            this.snmpFddiChipSets
        };
    }

    public static final class FddiEnt extends MIBEntry<RFC1285MIBDef>
    {
        private FddiEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "fddi", "1.3.6.1.2.1.10.15", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpFddiSMTEnt extends MIBEntry<RFC1285MIBDef>
    {
        /** the SMT groupImplementation of the SMT group is mandatory for allsystems which implement manageable FDDI subsystems.*/
        public final SnmpFddiSMTNumberEnt snmpFddiSMTNumber;

        /** the SMT table*/
        public final SnmpFddiSMTTableEnt snmpFddiSMTTable;

        private SnmpFddiSMTEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "snmpFddiSMT", "1.3.6.1.2.1.10.15.1", false, false, false, false);
            this.snmpFddiSMTNumber = new SnmpFddiSMTNumberEnt(mib, this);
            this.snmpFddiSMTTable = new SnmpFddiSMTTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpFddiSMTNumber,
                this.snmpFddiSMTTable
            };
        }
        public static final class SnmpFddiSMTNumberEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiSMTNumberEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiSMTNumber", "1.3.6.1.2.1.10.15.1.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpFddiSMTTableEnt extends MIBEntry<RFC1285MIBDef>
        {
            public final SnmpFddiSMTEntryEnt snmpFddiSMTEntry;

            private SnmpFddiSMTTableEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiSMTTable", "1.3.6.1.2.1.10.15.1.2", false, true, false, false);
                this.snmpFddiSMTEntry = new SnmpFddiSMTEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpFddiSMTEntry
                };
            }
            public static final class SnmpFddiSMTEntryEnt extends MIBEntry<RFC1285MIBDef>
            {
                public final SnmpFddiSMTIndexEnt snmpFddiSMTIndex;

                public final SnmpFddiSMTStationIdEnt snmpFddiSMTStationId;

                public final SnmpFddiSMTOpVersionIdEnt snmpFddiSMTOpVersionId;

                public final SnmpFddiSMTHiVersionIdEnt snmpFddiSMTHiVersionId;

                public final SnmpFddiSMTLoVersionIdEnt snmpFddiSMTLoVersionId;

                public final SnmpFddiSMTMACCtEnt snmpFddiSMTMACCt;

                public final SnmpFddiSMTNonMasterCtEnt snmpFddiSMTNonMasterCt;

                public final SnmpFddiSMTMasterCtEnt snmpFddiSMTMasterCt;

                public final SnmpFddiSMTPathsAvailableEnt snmpFddiSMTPathsAvailable;

                public final SnmpFddiSMTConfigCapabilitiesEnt snmpFddiSMTConfigCapabilities;

                public final SnmpFddiSMTConfigPolicyEnt snmpFddiSMTConfigPolicy;

                public final SnmpFddiSMTConnectionPolicyEnt snmpFddiSMTConnectionPolicy;

                public final SnmpFddiSMTTNotifyEnt snmpFddiSMTTNotify;

                public final SnmpFddiSMTStatusReportingEnt snmpFddiSMTStatusReporting;

                public final SnmpFddiSMTECMStateEnt snmpFddiSMTECMState;

                public final SnmpFddiSMTCFStateEnt snmpFddiSMTCFState;

                public final SnmpFddiSMTHoldStateEnt snmpFddiSMTHoldState;

                public final SnmpFddiSMTRemoteDisconnectFlagEnt snmpFddiSMTRemoteDisconnectFlag;

                public final SnmpFddiSMTStationActionEnt snmpFddiSMTStationAction;

                private SnmpFddiSMTEntryEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                {
                    super(mib, parent, "snmpFddiSMTEntry", "1.3.6.1.2.1.10.15.1.2.1", false, false, false, true);
                    this.snmpFddiSMTIndex = new SnmpFddiSMTIndexEnt(mib, this);
                    this.snmpFddiSMTStationId = new SnmpFddiSMTStationIdEnt(mib, this);
                    this.snmpFddiSMTOpVersionId = new SnmpFddiSMTOpVersionIdEnt(mib, this);
                    this.snmpFddiSMTHiVersionId = new SnmpFddiSMTHiVersionIdEnt(mib, this);
                    this.snmpFddiSMTLoVersionId = new SnmpFddiSMTLoVersionIdEnt(mib, this);
                    this.snmpFddiSMTMACCt = new SnmpFddiSMTMACCtEnt(mib, this);
                    this.snmpFddiSMTNonMasterCt = new SnmpFddiSMTNonMasterCtEnt(mib, this);
                    this.snmpFddiSMTMasterCt = new SnmpFddiSMTMasterCtEnt(mib, this);
                    this.snmpFddiSMTPathsAvailable = new SnmpFddiSMTPathsAvailableEnt(mib, this);
                    this.snmpFddiSMTConfigCapabilities = new SnmpFddiSMTConfigCapabilitiesEnt(mib, this);
                    this.snmpFddiSMTConfigPolicy = new SnmpFddiSMTConfigPolicyEnt(mib, this);
                    this.snmpFddiSMTConnectionPolicy = new SnmpFddiSMTConnectionPolicyEnt(mib, this);
                    this.snmpFddiSMTTNotify = new SnmpFddiSMTTNotifyEnt(mib, this);
                    this.snmpFddiSMTStatusReporting = new SnmpFddiSMTStatusReportingEnt(mib, this);
                    this.snmpFddiSMTECMState = new SnmpFddiSMTECMStateEnt(mib, this);
                    this.snmpFddiSMTCFState = new SnmpFddiSMTCFStateEnt(mib, this);
                    this.snmpFddiSMTHoldState = new SnmpFddiSMTHoldStateEnt(mib, this);
                    this.snmpFddiSMTRemoteDisconnectFlag = new SnmpFddiSMTRemoteDisconnectFlagEnt(mib, this);
                    this.snmpFddiSMTStationAction = new SnmpFddiSMTStationActionEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpFddiSMTIndex,
                        this.snmpFddiSMTStationId,
                        this.snmpFddiSMTOpVersionId,
                        this.snmpFddiSMTHiVersionId,
                        this.snmpFddiSMTLoVersionId,
                        this.snmpFddiSMTMACCt,
                        this.snmpFddiSMTNonMasterCt,
                        this.snmpFddiSMTMasterCt,
                        this.snmpFddiSMTPathsAvailable,
                        this.snmpFddiSMTConfigCapabilities,
                        this.snmpFddiSMTConfigPolicy,
                        this.snmpFddiSMTConnectionPolicy,
                        this.snmpFddiSMTTNotify,
                        this.snmpFddiSMTStatusReporting,
                        this.snmpFddiSMTECMState,
                        this.snmpFddiSMTCFState,
                        this.snmpFddiSMTHoldState,
                        this.snmpFddiSMTRemoteDisconnectFlag,
                        this.snmpFddiSMTStationAction
                    };
                }
                public static final class SnmpFddiSMTIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTIndex", "1.3.6.1.2.1.10.15.1.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTStationIdEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTStationIdEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTStationId", "1.3.6.1.2.1.10.15.1.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTOpVersionIdEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTOpVersionIdEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTOpVersionId", "1.3.6.1.2.1.10.15.1.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTHiVersionIdEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTHiVersionIdEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTHiVersionId", "1.3.6.1.2.1.10.15.1.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTLoVersionIdEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTLoVersionIdEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTLoVersionId", "1.3.6.1.2.1.10.15.1.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTMACCtEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTMACCtEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTMACCt", "1.3.6.1.2.1.10.15.1.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTNonMasterCtEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTNonMasterCtEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTNonMasterCt", "1.3.6.1.2.1.10.15.1.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTMasterCtEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTMasterCtEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTMasterCt", "1.3.6.1.2.1.10.15.1.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTPathsAvailableEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTPathsAvailableEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTPathsAvailable", "1.3.6.1.2.1.10.15.1.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTConfigCapabilitiesEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTConfigCapabilitiesEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTConfigCapabilities", "1.3.6.1.2.1.10.15.1.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTConfigPolicyEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTConfigPolicyEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTConfigPolicy", "1.3.6.1.2.1.10.15.1.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTConnectionPolicyEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTConnectionPolicyEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTConnectionPolicy", "1.3.6.1.2.1.10.15.1.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTTNotifyEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTTNotifyEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTTNotify", "1.3.6.1.2.1.10.15.1.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTStatusReportingEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTStatusReportingEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTStatusReporting", "1.3.6.1.2.1.10.15.1.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTECMStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTECMStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTECMState", "1.3.6.1.2.1.10.15.1.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTCFStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTCFStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTCFState", "1.3.6.1.2.1.10.15.1.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTHoldStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTHoldStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTHoldState", "1.3.6.1.2.1.10.15.1.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTRemoteDisconnectFlagEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTRemoteDisconnectFlagEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTRemoteDisconnectFlag", "1.3.6.1.2.1.10.15.1.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiSMTStationActionEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiSMTStationActionEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiSMTStationAction", "1.3.6.1.2.1.10.15.1.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SnmpFddiMACEnt extends MIBEntry<RFC1285MIBDef>
    {
        /** the MAC groupImplementation of the MAC Group is mandatory for allsystems which implement manageable FDDI subsystems.*/
        public final SnmpFddiMACNumberEnt snmpFddiMACNumber;

        /** the MAC table*/
        public final SnmpFddiMACTableEnt snmpFddiMACTable;

        private SnmpFddiMACEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "snmpFddiMAC", "1.3.6.1.2.1.10.15.2", false, false, false, false);
            this.snmpFddiMACNumber = new SnmpFddiMACNumberEnt(mib, this);
            this.snmpFddiMACTable = new SnmpFddiMACTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpFddiMACNumber,
                this.snmpFddiMACTable
            };
        }
        public static final class SnmpFddiMACNumberEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiMACNumberEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiMACNumber", "1.3.6.1.2.1.10.15.2.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpFddiMACTableEnt extends MIBEntry<RFC1285MIBDef>
        {
            public final SnmpFddiMACEntryEnt snmpFddiMACEntry;

            private SnmpFddiMACTableEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiMACTable", "1.3.6.1.2.1.10.15.2.2", false, true, false, false);
                this.snmpFddiMACEntry = new SnmpFddiMACEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpFddiMACEntry
                };
            }
            public static final class SnmpFddiMACEntryEnt extends MIBEntry<RFC1285MIBDef>
            {
                public final SnmpFddiMACSMTIndexEnt snmpFddiMACSMTIndex;

                public final SnmpFddiMACIndexEnt snmpFddiMACIndex;

                public final SnmpFddiMACFrameStatusCapabilitiesEnt snmpFddiMACFrameStatusCapabilities;

                public final SnmpFddiMACTMaxGreatestLowerBoundEnt snmpFddiMACTMaxGreatestLowerBound;

                public final SnmpFddiMACTVXGreatestLowerBoundEnt snmpFddiMACTVXGreatestLowerBound;

                public final SnmpFddiMACPathsAvailableEnt snmpFddiMACPathsAvailable;

                public final SnmpFddiMACCurrentPathEnt snmpFddiMACCurrentPath;

                public final SnmpFddiMACUpstreamNbrEnt snmpFddiMACUpstreamNbr;

                public final SnmpFddiMACOldUpstreamNbrEnt snmpFddiMACOldUpstreamNbr;

                public final SnmpFddiMACDupAddrTestEnt snmpFddiMACDupAddrTest;

                public final SnmpFddiMACPathsRequestedEnt snmpFddiMACPathsRequested;

                public final SnmpFddiMACDownstreamPORTTypeEnt snmpFddiMACDownstreamPORTType;

                public final SnmpFddiMACSMTAddressEnt snmpFddiMACSMTAddress;

                public final SnmpFddiMACTReqEnt snmpFddiMACTReq;

                public final SnmpFddiMACTNegEnt snmpFddiMACTNeg;

                public final SnmpFddiMACTMaxEnt snmpFddiMACTMax;

                public final SnmpFddiMACTvxValueEnt snmpFddiMACTvxValue;

                public final SnmpFddiMACTMinEnt snmpFddiMACTMin;

                public final SnmpFddiMACCurrentFrameStatusEnt snmpFddiMACCurrentFrameStatus;

                public final SnmpFddiMACFrameCtsEnt snmpFddiMACFrameCts;

                public final SnmpFddiMACErrorCtsEnt snmpFddiMACErrorCts;

                public final SnmpFddiMACLostCtsEnt snmpFddiMACLostCts;

                public final SnmpFddiMACFrameErrorThresholdEnt snmpFddiMACFrameErrorThreshold;

                public final SnmpFddiMACFrameErrorRatioEnt snmpFddiMACFrameErrorRatio;

                public final SnmpFddiMACRMTStateEnt snmpFddiMACRMTState;

                public final SnmpFddiMACDaFlagEnt snmpFddiMACDaFlag;

                public final SnmpFddiMACUnaDaFlagEnt snmpFddiMACUnaDaFlag;

                public final SnmpFddiMACFrameConditionEnt snmpFddiMACFrameCondition;

                public final SnmpFddiMACChipSetEnt snmpFddiMACChipSet;

                public final SnmpFddiMACActionEnt snmpFddiMACAction;

                private SnmpFddiMACEntryEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                {
                    super(mib, parent, "snmpFddiMACEntry", "1.3.6.1.2.1.10.15.2.2.1", false, false, false, true);
                    this.snmpFddiMACSMTIndex = new SnmpFddiMACSMTIndexEnt(mib, this);
                    this.snmpFddiMACIndex = new SnmpFddiMACIndexEnt(mib, this);
                    this.snmpFddiMACFrameStatusCapabilities = new SnmpFddiMACFrameStatusCapabilitiesEnt(mib, this);
                    this.snmpFddiMACTMaxGreatestLowerBound = new SnmpFddiMACTMaxGreatestLowerBoundEnt(mib, this);
                    this.snmpFddiMACTVXGreatestLowerBound = new SnmpFddiMACTVXGreatestLowerBoundEnt(mib, this);
                    this.snmpFddiMACPathsAvailable = new SnmpFddiMACPathsAvailableEnt(mib, this);
                    this.snmpFddiMACCurrentPath = new SnmpFddiMACCurrentPathEnt(mib, this);
                    this.snmpFddiMACUpstreamNbr = new SnmpFddiMACUpstreamNbrEnt(mib, this);
                    this.snmpFddiMACOldUpstreamNbr = new SnmpFddiMACOldUpstreamNbrEnt(mib, this);
                    this.snmpFddiMACDupAddrTest = new SnmpFddiMACDupAddrTestEnt(mib, this);
                    this.snmpFddiMACPathsRequested = new SnmpFddiMACPathsRequestedEnt(mib, this);
                    this.snmpFddiMACDownstreamPORTType = new SnmpFddiMACDownstreamPORTTypeEnt(mib, this);
                    this.snmpFddiMACSMTAddress = new SnmpFddiMACSMTAddressEnt(mib, this);
                    this.snmpFddiMACTReq = new SnmpFddiMACTReqEnt(mib, this);
                    this.snmpFddiMACTNeg = new SnmpFddiMACTNegEnt(mib, this);
                    this.snmpFddiMACTMax = new SnmpFddiMACTMaxEnt(mib, this);
                    this.snmpFddiMACTvxValue = new SnmpFddiMACTvxValueEnt(mib, this);
                    this.snmpFddiMACTMin = new SnmpFddiMACTMinEnt(mib, this);
                    this.snmpFddiMACCurrentFrameStatus = new SnmpFddiMACCurrentFrameStatusEnt(mib, this);
                    this.snmpFddiMACFrameCts = new SnmpFddiMACFrameCtsEnt(mib, this);
                    this.snmpFddiMACErrorCts = new SnmpFddiMACErrorCtsEnt(mib, this);
                    this.snmpFddiMACLostCts = new SnmpFddiMACLostCtsEnt(mib, this);
                    this.snmpFddiMACFrameErrorThreshold = new SnmpFddiMACFrameErrorThresholdEnt(mib, this);
                    this.snmpFddiMACFrameErrorRatio = new SnmpFddiMACFrameErrorRatioEnt(mib, this);
                    this.snmpFddiMACRMTState = new SnmpFddiMACRMTStateEnt(mib, this);
                    this.snmpFddiMACDaFlag = new SnmpFddiMACDaFlagEnt(mib, this);
                    this.snmpFddiMACUnaDaFlag = new SnmpFddiMACUnaDaFlagEnt(mib, this);
                    this.snmpFddiMACFrameCondition = new SnmpFddiMACFrameConditionEnt(mib, this);
                    this.snmpFddiMACChipSet = new SnmpFddiMACChipSetEnt(mib, this);
                    this.snmpFddiMACAction = new SnmpFddiMACActionEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpFddiMACSMTIndex,
                        this.snmpFddiMACIndex,
                        this.snmpFddiMACFrameStatusCapabilities,
                        this.snmpFddiMACTMaxGreatestLowerBound,
                        this.snmpFddiMACTVXGreatestLowerBound,
                        this.snmpFddiMACPathsAvailable,
                        this.snmpFddiMACCurrentPath,
                        this.snmpFddiMACUpstreamNbr,
                        this.snmpFddiMACOldUpstreamNbr,
                        this.snmpFddiMACDupAddrTest,
                        this.snmpFddiMACPathsRequested,
                        this.snmpFddiMACDownstreamPORTType,
                        this.snmpFddiMACSMTAddress,
                        this.snmpFddiMACTReq,
                        this.snmpFddiMACTNeg,
                        this.snmpFddiMACTMax,
                        this.snmpFddiMACTvxValue,
                        this.snmpFddiMACTMin,
                        this.snmpFddiMACCurrentFrameStatus,
                        this.snmpFddiMACFrameCts,
                        this.snmpFddiMACErrorCts,
                        this.snmpFddiMACLostCts,
                        this.snmpFddiMACFrameErrorThreshold,
                        this.snmpFddiMACFrameErrorRatio,
                        this.snmpFddiMACRMTState,
                        this.snmpFddiMACDaFlag,
                        this.snmpFddiMACUnaDaFlag,
                        this.snmpFddiMACFrameCondition,
                        this.snmpFddiMACChipSet,
                        this.snmpFddiMACAction
                    };
                }
                public static final class SnmpFddiMACSMTIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACSMTIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACSMTIndex", "1.3.6.1.2.1.10.15.2.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACIndex", "1.3.6.1.2.1.10.15.2.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACFrameStatusCapabilitiesEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACFrameStatusCapabilitiesEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACFrameStatusCapabilities", "1.3.6.1.2.1.10.15.2.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTMaxGreatestLowerBoundEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTMaxGreatestLowerBoundEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTMaxGreatestLowerBound", "1.3.6.1.2.1.10.15.2.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTVXGreatestLowerBoundEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTVXGreatestLowerBoundEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTVXGreatestLowerBound", "1.3.6.1.2.1.10.15.2.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACPathsAvailableEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACPathsAvailableEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACPathsAvailable", "1.3.6.1.2.1.10.15.2.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACCurrentPathEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACCurrentPathEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACCurrentPath", "1.3.6.1.2.1.10.15.2.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACUpstreamNbrEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACUpstreamNbrEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACUpstreamNbr", "1.3.6.1.2.1.10.15.2.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACOldUpstreamNbrEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACOldUpstreamNbrEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACOldUpstreamNbr", "1.3.6.1.2.1.10.15.2.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACDupAddrTestEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACDupAddrTestEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACDupAddrTest", "1.3.6.1.2.1.10.15.2.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACPathsRequestedEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACPathsRequestedEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACPathsRequested", "1.3.6.1.2.1.10.15.2.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACDownstreamPORTTypeEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACDownstreamPORTTypeEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACDownstreamPORTType", "1.3.6.1.2.1.10.15.2.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACSMTAddressEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACSMTAddressEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACSMTAddress", "1.3.6.1.2.1.10.15.2.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTReqEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTReqEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTReq", "1.3.6.1.2.1.10.15.2.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTNegEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTNegEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTNeg", "1.3.6.1.2.1.10.15.2.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTMaxEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTMaxEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTMax", "1.3.6.1.2.1.10.15.2.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTvxValueEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTvxValueEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTvxValue", "1.3.6.1.2.1.10.15.2.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACTMinEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACTMinEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACTMin", "1.3.6.1.2.1.10.15.2.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACCurrentFrameStatusEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACCurrentFrameStatusEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACCurrentFrameStatus", "1.3.6.1.2.1.10.15.2.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACFrameCtsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACFrameCtsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACFrameCts", "1.3.6.1.2.1.10.15.2.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACErrorCtsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACErrorCtsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACErrorCts", "1.3.6.1.2.1.10.15.2.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACLostCtsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACLostCtsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACLostCts", "1.3.6.1.2.1.10.15.2.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACFrameErrorThresholdEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACFrameErrorThresholdEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACFrameErrorThreshold", "1.3.6.1.2.1.10.15.2.2.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACFrameErrorRatioEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACFrameErrorRatioEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACFrameErrorRatio", "1.3.6.1.2.1.10.15.2.2.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACRMTStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACRMTStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACRMTState", "1.3.6.1.2.1.10.15.2.2.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACDaFlagEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACDaFlagEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACDaFlag", "1.3.6.1.2.1.10.15.2.2.1.26", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACUnaDaFlagEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACUnaDaFlagEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACUnaDaFlag", "1.3.6.1.2.1.10.15.2.2.1.27", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACFrameConditionEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACFrameConditionEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACFrameCondition", "1.3.6.1.2.1.10.15.2.2.1.28", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACChipSetEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACChipSetEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACChipSet", "1.3.6.1.2.1.10.15.2.2.1.29", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiMACActionEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiMACActionEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiMACAction", "1.3.6.1.2.1.10.15.2.2.1.30", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SnmpFddiPATHEnt extends MIBEntry<RFC1285MIBDef>
    {
        private SnmpFddiPATHEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "snmpFddiPATH", "1.3.6.1.2.1.10.15.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpFddiPORTEnt extends MIBEntry<RFC1285MIBDef>
    {
        /** the PATH group
the PATH group is empty for now and shall remain so untilthe ANSI community sorts out their PATH group

the PORT groupImplementation of the PORT group is mandatory for all
systems which implement manageable FDDI subsystems.*/
        public final SnmpFddiPORTNumberEnt snmpFddiPORTNumber;

        /** the PORT table*/
        public final SnmpFddiPORTTableEnt snmpFddiPORTTable;

        private SnmpFddiPORTEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "snmpFddiPORT", "1.3.6.1.2.1.10.15.4", false, false, false, false);
            this.snmpFddiPORTNumber = new SnmpFddiPORTNumberEnt(mib, this);
            this.snmpFddiPORTTable = new SnmpFddiPORTTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpFddiPORTNumber,
                this.snmpFddiPORTTable
            };
        }
        public static final class SnmpFddiPORTNumberEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiPORTNumberEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiPORTNumber", "1.3.6.1.2.1.10.15.4.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpFddiPORTTableEnt extends MIBEntry<RFC1285MIBDef>
        {
            public final SnmpFddiPORTEntryEnt snmpFddiPORTEntry;

            private SnmpFddiPORTTableEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiPORTTable", "1.3.6.1.2.1.10.15.4.2", false, true, false, false);
                this.snmpFddiPORTEntry = new SnmpFddiPORTEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpFddiPORTEntry
                };
            }
            public static final class SnmpFddiPORTEntryEnt extends MIBEntry<RFC1285MIBDef>
            {
                public final SnmpFddiPORTSMTIndexEnt snmpFddiPORTSMTIndex;

                public final SnmpFddiPORTIndexEnt snmpFddiPORTIndex;

                public final SnmpFddiPORTPCTypeEnt snmpFddiPORTPCType;

                public final SnmpFddiPORTPCNeighborEnt snmpFddiPORTPCNeighbor;

                public final SnmpFddiPORTConnectionPoliciesEnt snmpFddiPORTConnectionPolicies;

                public final SnmpFddiPORTRemoteMACIndicatedEnt snmpFddiPORTRemoteMACIndicated;

                public final SnmpFddiPORTCEStateEnt snmpFddiPORTCEState;

                public final SnmpFddiPORTPathsRequestedEnt snmpFddiPORTPathsRequested;

                public final SnmpFddiPORTMACPlacementEnt snmpFddiPORTMACPlacement;

                public final SnmpFddiPORTAvailablePathsEnt snmpFddiPORTAvailablePaths;

                public final SnmpFddiPORTMACLoopTimeEnt snmpFddiPORTMACLoopTime;

                public final SnmpFddiPORTTBMaxEnt snmpFddiPORTTBMax;

                public final SnmpFddiPORTBSFlagEnt snmpFddiPORTBSFlag;

                public final SnmpFddiPORTLCTFailCtsEnt snmpFddiPORTLCTFailCts;

                public final SnmpFddiPORTLerEstimateEnt snmpFddiPORTLerEstimate;

                public final SnmpFddiPORTLemRejectCtsEnt snmpFddiPORTLemRejectCts;

                public final SnmpFddiPORTLemCtsEnt snmpFddiPORTLemCts;

                public final SnmpFddiPORTLerCutoffEnt snmpFddiPORTLerCutoff;

                public final SnmpFddiPORTLerAlarmEnt snmpFddiPORTLerAlarm;

                public final SnmpFddiPORTConnectStateEnt snmpFddiPORTConnectState;

                public final SnmpFddiPORTPCMStateEnt snmpFddiPORTPCMState;

                public final SnmpFddiPORTPCWithholdEnt snmpFddiPORTPCWithhold;

                public final SnmpFddiPORTLerConditionEnt snmpFddiPORTLerCondition;

                public final SnmpFddiPORTChipSetEnt snmpFddiPORTChipSet;

                public final SnmpFddiPORTActionEnt snmpFddiPORTAction;

                private SnmpFddiPORTEntryEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                {
                    super(mib, parent, "snmpFddiPORTEntry", "1.3.6.1.2.1.10.15.4.2.1", false, false, false, true);
                    this.snmpFddiPORTSMTIndex = new SnmpFddiPORTSMTIndexEnt(mib, this);
                    this.snmpFddiPORTIndex = new SnmpFddiPORTIndexEnt(mib, this);
                    this.snmpFddiPORTPCType = new SnmpFddiPORTPCTypeEnt(mib, this);
                    this.snmpFddiPORTPCNeighbor = new SnmpFddiPORTPCNeighborEnt(mib, this);
                    this.snmpFddiPORTConnectionPolicies = new SnmpFddiPORTConnectionPoliciesEnt(mib, this);
                    this.snmpFddiPORTRemoteMACIndicated = new SnmpFddiPORTRemoteMACIndicatedEnt(mib, this);
                    this.snmpFddiPORTCEState = new SnmpFddiPORTCEStateEnt(mib, this);
                    this.snmpFddiPORTPathsRequested = new SnmpFddiPORTPathsRequestedEnt(mib, this);
                    this.snmpFddiPORTMACPlacement = new SnmpFddiPORTMACPlacementEnt(mib, this);
                    this.snmpFddiPORTAvailablePaths = new SnmpFddiPORTAvailablePathsEnt(mib, this);
                    this.snmpFddiPORTMACLoopTime = new SnmpFddiPORTMACLoopTimeEnt(mib, this);
                    this.snmpFddiPORTTBMax = new SnmpFddiPORTTBMaxEnt(mib, this);
                    this.snmpFddiPORTBSFlag = new SnmpFddiPORTBSFlagEnt(mib, this);
                    this.snmpFddiPORTLCTFailCts = new SnmpFddiPORTLCTFailCtsEnt(mib, this);
                    this.snmpFddiPORTLerEstimate = new SnmpFddiPORTLerEstimateEnt(mib, this);
                    this.snmpFddiPORTLemRejectCts = new SnmpFddiPORTLemRejectCtsEnt(mib, this);
                    this.snmpFddiPORTLemCts = new SnmpFddiPORTLemCtsEnt(mib, this);
                    this.snmpFddiPORTLerCutoff = new SnmpFddiPORTLerCutoffEnt(mib, this);
                    this.snmpFddiPORTLerAlarm = new SnmpFddiPORTLerAlarmEnt(mib, this);
                    this.snmpFddiPORTConnectState = new SnmpFddiPORTConnectStateEnt(mib, this);
                    this.snmpFddiPORTPCMState = new SnmpFddiPORTPCMStateEnt(mib, this);
                    this.snmpFddiPORTPCWithhold = new SnmpFddiPORTPCWithholdEnt(mib, this);
                    this.snmpFddiPORTLerCondition = new SnmpFddiPORTLerConditionEnt(mib, this);
                    this.snmpFddiPORTChipSet = new SnmpFddiPORTChipSetEnt(mib, this);
                    this.snmpFddiPORTAction = new SnmpFddiPORTActionEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpFddiPORTSMTIndex,
                        this.snmpFddiPORTIndex,
                        this.snmpFddiPORTPCType,
                        this.snmpFddiPORTPCNeighbor,
                        this.snmpFddiPORTConnectionPolicies,
                        this.snmpFddiPORTRemoteMACIndicated,
                        this.snmpFddiPORTCEState,
                        this.snmpFddiPORTPathsRequested,
                        this.snmpFddiPORTMACPlacement,
                        this.snmpFddiPORTAvailablePaths,
                        this.snmpFddiPORTMACLoopTime,
                        this.snmpFddiPORTTBMax,
                        this.snmpFddiPORTBSFlag,
                        this.snmpFddiPORTLCTFailCts,
                        this.snmpFddiPORTLerEstimate,
                        this.snmpFddiPORTLemRejectCts,
                        this.snmpFddiPORTLemCts,
                        this.snmpFddiPORTLerCutoff,
                        this.snmpFddiPORTLerAlarm,
                        this.snmpFddiPORTConnectState,
                        this.snmpFddiPORTPCMState,
                        this.snmpFddiPORTPCWithhold,
                        this.snmpFddiPORTLerCondition,
                        this.snmpFddiPORTChipSet,
                        this.snmpFddiPORTAction
                    };
                }
                public static final class SnmpFddiPORTSMTIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTSMTIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTSMTIndex", "1.3.6.1.2.1.10.15.4.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTIndex", "1.3.6.1.2.1.10.15.4.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTPCTypeEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTPCTypeEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTPCType", "1.3.6.1.2.1.10.15.4.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTPCNeighborEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTPCNeighborEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTPCNeighbor", "1.3.6.1.2.1.10.15.4.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTConnectionPoliciesEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTConnectionPoliciesEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTConnectionPolicies", "1.3.6.1.2.1.10.15.4.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTRemoteMACIndicatedEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTRemoteMACIndicatedEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTRemoteMACIndicated", "1.3.6.1.2.1.10.15.4.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTCEStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTCEStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTCEState", "1.3.6.1.2.1.10.15.4.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTPathsRequestedEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTPathsRequestedEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTPathsRequested", "1.3.6.1.2.1.10.15.4.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTMACPlacementEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTMACPlacementEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTMACPlacement", "1.3.6.1.2.1.10.15.4.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTAvailablePathsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTAvailablePathsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTAvailablePaths", "1.3.6.1.2.1.10.15.4.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTMACLoopTimeEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTMACLoopTimeEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTMACLoopTime", "1.3.6.1.2.1.10.15.4.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTTBMaxEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTTBMaxEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTTBMax", "1.3.6.1.2.1.10.15.4.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTBSFlagEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTBSFlagEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTBSFlag", "1.3.6.1.2.1.10.15.4.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLCTFailCtsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLCTFailCtsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLCTFailCts", "1.3.6.1.2.1.10.15.4.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLerEstimateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLerEstimateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLerEstimate", "1.3.6.1.2.1.10.15.4.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLemRejectCtsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLemRejectCtsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLemRejectCts", "1.3.6.1.2.1.10.15.4.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLemCtsEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLemCtsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLemCts", "1.3.6.1.2.1.10.15.4.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLerCutoffEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLerCutoffEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLerCutoff", "1.3.6.1.2.1.10.15.4.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLerAlarmEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLerAlarmEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLerAlarm", "1.3.6.1.2.1.10.15.4.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTConnectStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTConnectStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTConnectState", "1.3.6.1.2.1.10.15.4.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTPCMStateEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTPCMStateEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTPCMState", "1.3.6.1.2.1.10.15.4.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTPCWithholdEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTPCWithholdEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTPCWithhold", "1.3.6.1.2.1.10.15.4.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTLerConditionEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTLerConditionEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTLerCondition", "1.3.6.1.2.1.10.15.4.2.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTChipSetEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTChipSetEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTChipSet", "1.3.6.1.2.1.10.15.4.2.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiPORTActionEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiPORTActionEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiPORTAction", "1.3.6.1.2.1.10.15.4.2.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SnmpFddiATTACHMENTEnt extends MIBEntry<RFC1285MIBDef>
    {
        /** the ATTACHMENT groupImplementation of the ATTACHMENT group is mandatory forall systems which implement manageable FDDI subsystems.*/
        public final SnmpFddiATTACHMENTNumberEnt snmpFddiATTACHMENTNumber;

        /** the ATTACHMENT table*/
        public final SnmpFddiATTACHMENTTableEnt snmpFddiATTACHMENTTable;

        private SnmpFddiATTACHMENTEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "snmpFddiATTACHMENT", "1.3.6.1.2.1.10.15.5", false, false, false, false);
            this.snmpFddiATTACHMENTNumber = new SnmpFddiATTACHMENTNumberEnt(mib, this);
            this.snmpFddiATTACHMENTTable = new SnmpFddiATTACHMENTTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpFddiATTACHMENTNumber,
                this.snmpFddiATTACHMENTTable
            };
        }
        public static final class SnmpFddiATTACHMENTNumberEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiATTACHMENTNumberEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiATTACHMENTNumber", "1.3.6.1.2.1.10.15.5.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpFddiATTACHMENTTableEnt extends MIBEntry<RFC1285MIBDef>
        {
            public final SnmpFddiATTACHMENTEntryEnt snmpFddiATTACHMENTEntry;

            private SnmpFddiATTACHMENTTableEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiATTACHMENTTable", "1.3.6.1.2.1.10.15.5.2", false, true, false, false);
                this.snmpFddiATTACHMENTEntry = new SnmpFddiATTACHMENTEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpFddiATTACHMENTEntry
                };
            }
            public static final class SnmpFddiATTACHMENTEntryEnt extends MIBEntry<RFC1285MIBDef>
            {
                public final SnmpFddiATTACHMENTSMTIndexEnt snmpFddiATTACHMENTSMTIndex;

                public final SnmpFddiATTACHMENTIndexEnt snmpFddiATTACHMENTIndex;

                public final SnmpFddiATTACHMENTClassEnt snmpFddiATTACHMENTClass;

                public final SnmpFddiATTACHMENTOpticalBypassPresentEnt snmpFddiATTACHMENTOpticalBypassPresent;

                public final SnmpFddiATTACHMENTIMaxExpirationEnt snmpFddiATTACHMENTIMaxExpiration;

                public final SnmpFddiATTACHMENTInsertedStatusEnt snmpFddiATTACHMENTInsertedStatus;

                public final SnmpFddiATTACHMENTInsertPolicyEnt snmpFddiATTACHMENTInsertPolicy;

                private SnmpFddiATTACHMENTEntryEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                {
                    super(mib, parent, "snmpFddiATTACHMENTEntry", "1.3.6.1.2.1.10.15.5.2.1", false, false, false, true);
                    this.snmpFddiATTACHMENTSMTIndex = new SnmpFddiATTACHMENTSMTIndexEnt(mib, this);
                    this.snmpFddiATTACHMENTIndex = new SnmpFddiATTACHMENTIndexEnt(mib, this);
                    this.snmpFddiATTACHMENTClass = new SnmpFddiATTACHMENTClassEnt(mib, this);
                    this.snmpFddiATTACHMENTOpticalBypassPresent = new SnmpFddiATTACHMENTOpticalBypassPresentEnt(mib, this);
                    this.snmpFddiATTACHMENTIMaxExpiration = new SnmpFddiATTACHMENTIMaxExpirationEnt(mib, this);
                    this.snmpFddiATTACHMENTInsertedStatus = new SnmpFddiATTACHMENTInsertedStatusEnt(mib, this);
                    this.snmpFddiATTACHMENTInsertPolicy = new SnmpFddiATTACHMENTInsertPolicyEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpFddiATTACHMENTSMTIndex,
                        this.snmpFddiATTACHMENTIndex,
                        this.snmpFddiATTACHMENTClass,
                        this.snmpFddiATTACHMENTOpticalBypassPresent,
                        this.snmpFddiATTACHMENTIMaxExpiration,
                        this.snmpFddiATTACHMENTInsertedStatus,
                        this.snmpFddiATTACHMENTInsertPolicy
                    };
                }
                public static final class SnmpFddiATTACHMENTSMTIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTSMTIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTSMTIndex", "1.3.6.1.2.1.10.15.5.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiATTACHMENTIndexEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTIndexEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTIndex", "1.3.6.1.2.1.10.15.5.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiATTACHMENTClassEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTClassEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTClass", "1.3.6.1.2.1.10.15.5.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiATTACHMENTOpticalBypassPresentEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTOpticalBypassPresentEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTOpticalBypassPresent", "1.3.6.1.2.1.10.15.5.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiATTACHMENTIMaxExpirationEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTIMaxExpirationEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTIMaxExpiration", "1.3.6.1.2.1.10.15.5.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiATTACHMENTInsertedStatusEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTInsertedStatusEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTInsertedStatus", "1.3.6.1.2.1.10.15.5.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpFddiATTACHMENTInsertPolicyEnt extends MIBEntry<RFC1285MIBDef>
                {
                    private SnmpFddiATTACHMENTInsertPolicyEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
                    {
                        super(mib, parent, "snmpFddiATTACHMENTInsertPolicy", "1.3.6.1.2.1.10.15.5.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SnmpFddiChipSetsEnt extends MIBEntry<RFC1285MIBDef>
    {
        /** the Chip Set groupThe following object identifiers are allocated for usewith the snmpFddiMACChipSet and snmpFddiPORTChipSetvariables.

Chips primarily responsible
for implementing the PHY
function.*/
        public final SnmpFddiPHYChipSetsEnt snmpFddiPHYChipSets;

        /** None defined at presentChipsets may someday bedefined here

Chips primarily responsible
for implementing the
MAC function.*/
        public final SnmpFddiMACChipSetsEnt snmpFddiMACChipSets;

        /** None defined at presentChipsets may someday bedefined here

Chips which implement both
the PHY and MAC functions*/
        public final SnmpFddiPHYMACChipSetsEnt snmpFddiPHYMACChipSets;

        private SnmpFddiChipSetsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
        {
            super(mib, parent, "snmpFddiChipSets", "1.3.6.1.2.1.10.15.6", false, false, false, false);
            this.snmpFddiPHYChipSets = new SnmpFddiPHYChipSetsEnt(mib, this);
            this.snmpFddiMACChipSets = new SnmpFddiMACChipSetsEnt(mib, this);
            this.snmpFddiPHYMACChipSets = new SnmpFddiPHYMACChipSetsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpFddiPHYChipSets,
                this.snmpFddiMACChipSets,
                this.snmpFddiPHYMACChipSets
            };
        }
        public static final class SnmpFddiPHYChipSetsEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiPHYChipSetsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiPHYChipSets", "1.3.6.1.2.1.10.15.6.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpFddiMACChipSetsEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiMACChipSetsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiMACChipSets", "1.3.6.1.2.1.10.15.6.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpFddiPHYMACChipSetsEnt extends MIBEntry<RFC1285MIBDef>
        {
            private SnmpFddiPHYMACChipSetsEnt(RFC1285MIBDef mib, MIBEntry<RFC1285MIBDef> parent)
            {
                super(mib, parent, "snmpFddiPHYMACChipSets", "1.3.6.1.2.1.10.15.6.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
