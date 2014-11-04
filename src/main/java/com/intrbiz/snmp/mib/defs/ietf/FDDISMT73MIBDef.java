package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class FDDISMT73MIBDef extends MIB
{
    public static final FDDISMT73MIBDef FDDISMT73MIB = new FDDISMT73MIBDef();

    static { MIBs.getInstance().registerMIB(FDDISMT73MIBDef.FDDISMT73MIB); }

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in [7].

this is the FDDI MIB module*/
    public final FddiEnt fddi;

    private FDDISMT73MIBDef()
    {
        super("FDDI-SMT73-MIB");
        this.fddi = new FddiEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.fddi
        };
    }

    public static final class FddiEnt extends MIBEntry<FDDISMT73MIBDef>
    {
        public final FddimibEnt fddimib;

        private FddiEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
        {
            super(mib, parent, "fddi", "1.3.6.1.2.1.10.15", false, false, false, false);
            this.fddimib = new FddimibEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.fddimib
            };
        }
        public static final class FddimibEnt extends MIBEntry<FDDISMT73MIBDef>
        {
            /** The representation of long MAC addresses as managementvalues is in the IEEE (ANSI/IEEE P802.1A) canonicalnotation for 48 bit addresses.  The canonical form is a6-octet string where the first octet contains the first 8bits of the address, with the I/G (Individual/Group)address bit as the least significant bit and the  U/L(Universal/Local) bit as the next more significant bit,and so on.  Note that the addresses in the SMT frames arerepresented in FDDI MAC order.

groups in the FDDI MIB module*/
            public final FddimibSMTEnt fddimibSMT;

            public final FddimibMACEnt fddimibMAC;

            public final FddimibMACCountersEnt fddimibMACCounters;

            public final FddimibPATHEnt fddimibPATH;

            public final FddimibPORTEnt fddimibPORT;

            private FddimibEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
            {
                super(mib, parent, "fddimib", "1.3.6.1.2.1.10.15.73", false, false, false, false);
                this.fddimibSMT = new FddimibSMTEnt(mib, this);
                this.fddimibMAC = new FddimibMACEnt(mib, this);
                this.fddimibMACCounters = new FddimibMACCountersEnt(mib, this);
                this.fddimibPATH = new FddimibPATHEnt(mib, this);
                this.fddimibPORT = new FddimibPORTEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fddimibSMT,
                    this.fddimibMAC,
                    this.fddimibMACCounters,
                    this.fddimibPATH,
                    this.fddimibPORT
                };
            }
            public static final class FddimibSMTEnt extends MIBEntry<FDDISMT73MIBDef>
            {
                /** the SMT groupImplementation of the SMT group is mandatory for allsystems which implement manageable FDDI subsystems.*/
                public final FddimibSMTNumberEnt fddimibSMTNumber;

                /** the SMT table*/
                public final FddimibSMTTableEnt fddimibSMTTable;

                private FddimibSMTEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                {
                    super(mib, parent, "fddimibSMT", "1.3.6.1.2.1.10.15.73.1", false, false, false, false);
                    this.fddimibSMTNumber = new FddimibSMTNumberEnt(mib, this);
                    this.fddimibSMTTable = new FddimibSMTTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fddimibSMTNumber,
                        this.fddimibSMTTable
                    };
                }
                public static final class FddimibSMTNumberEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    private FddimibSMTNumberEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibSMTNumber", "1.3.6.1.2.1.10.15.73.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FddimibSMTTableEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    public final FddimibSMTEntryEnt fddimibSMTEntry;

                    private FddimibSMTTableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibSMTTable", "1.3.6.1.2.1.10.15.73.1.2", false, true, false, false);
                        this.fddimibSMTEntry = new FddimibSMTEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fddimibSMTEntry
                        };
                    }
                    public static final class FddimibSMTEntryEnt extends MIBEntry<FDDISMT73MIBDef>
                    {
                        public final FddimibSMTIndexEnt fddimibSMTIndex;

                        public final FddimibSMTStationIdEnt fddimibSMTStationId;

                        public final FddimibSMTOpVersionIdEnt fddimibSMTOpVersionId;

                        public final FddimibSMTHiVersionIdEnt fddimibSMTHiVersionId;

                        public final FddimibSMTLoVersionIdEnt fddimibSMTLoVersionId;

                        public final FddimibSMTUserDataEnt fddimibSMTUserData;

                        public final FddimibSMTMIBVersionIdEnt fddimibSMTMIBVersionId;

                        public final FddimibSMTMACCtsEnt fddimibSMTMACCts;

                        public final FddimibSMTNonMasterCtsEnt fddimibSMTNonMasterCts;

                        public final FddimibSMTMasterCtsEnt fddimibSMTMasterCts;

                        public final FddimibSMTAvailablePathsEnt fddimibSMTAvailablePaths;

                        public final FddimibSMTConfigCapabilitiesEnt fddimibSMTConfigCapabilities;

                        public final FddimibSMTConfigPolicyEnt fddimibSMTConfigPolicy;

                        public final FddimibSMTConnectionPolicyEnt fddimibSMTConnectionPolicy;

                        public final FddimibSMTTNotifyEnt fddimibSMTTNotify;

                        public final FddimibSMTStatRptPolicyEnt fddimibSMTStatRptPolicy;

                        public final FddimibSMTTraceMaxExpirationEnt fddimibSMTTraceMaxExpiration;

                        public final FddimibSMTBypassPresentEnt fddimibSMTBypassPresent;

                        public final FddimibSMTECMStateEnt fddimibSMTECMState;

                        public final FddimibSMTCFStateEnt fddimibSMTCFState;

                        public final FddimibSMTRemoteDisconnectFlagEnt fddimibSMTRemoteDisconnectFlag;

                        public final FddimibSMTStationStatusEnt fddimibSMTStationStatus;

                        public final FddimibSMTPeerWrapFlagEnt fddimibSMTPeerWrapFlag;

                        public final FddimibSMTTimeStampEnt fddimibSMTTimeStamp;

                        public final FddimibSMTTransitionTimeStampEnt fddimibSMTTransitionTimeStamp;

                        public final FddimibSMTStationActionEnt fddimibSMTStationAction;

                        private FddimibSMTEntryEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                        {
                            super(mib, parent, "fddimibSMTEntry", "1.3.6.1.2.1.10.15.73.1.2.1", false, false, false, true);
                            this.fddimibSMTIndex = new FddimibSMTIndexEnt(mib, this);
                            this.fddimibSMTStationId = new FddimibSMTStationIdEnt(mib, this);
                            this.fddimibSMTOpVersionId = new FddimibSMTOpVersionIdEnt(mib, this);
                            this.fddimibSMTHiVersionId = new FddimibSMTHiVersionIdEnt(mib, this);
                            this.fddimibSMTLoVersionId = new FddimibSMTLoVersionIdEnt(mib, this);
                            this.fddimibSMTUserData = new FddimibSMTUserDataEnt(mib, this);
                            this.fddimibSMTMIBVersionId = new FddimibSMTMIBVersionIdEnt(mib, this);
                            this.fddimibSMTMACCts = new FddimibSMTMACCtsEnt(mib, this);
                            this.fddimibSMTNonMasterCts = new FddimibSMTNonMasterCtsEnt(mib, this);
                            this.fddimibSMTMasterCts = new FddimibSMTMasterCtsEnt(mib, this);
                            this.fddimibSMTAvailablePaths = new FddimibSMTAvailablePathsEnt(mib, this);
                            this.fddimibSMTConfigCapabilities = new FddimibSMTConfigCapabilitiesEnt(mib, this);
                            this.fddimibSMTConfigPolicy = new FddimibSMTConfigPolicyEnt(mib, this);
                            this.fddimibSMTConnectionPolicy = new FddimibSMTConnectionPolicyEnt(mib, this);
                            this.fddimibSMTTNotify = new FddimibSMTTNotifyEnt(mib, this);
                            this.fddimibSMTStatRptPolicy = new FddimibSMTStatRptPolicyEnt(mib, this);
                            this.fddimibSMTTraceMaxExpiration = new FddimibSMTTraceMaxExpirationEnt(mib, this);
                            this.fddimibSMTBypassPresent = new FddimibSMTBypassPresentEnt(mib, this);
                            this.fddimibSMTECMState = new FddimibSMTECMStateEnt(mib, this);
                            this.fddimibSMTCFState = new FddimibSMTCFStateEnt(mib, this);
                            this.fddimibSMTRemoteDisconnectFlag = new FddimibSMTRemoteDisconnectFlagEnt(mib, this);
                            this.fddimibSMTStationStatus = new FddimibSMTStationStatusEnt(mib, this);
                            this.fddimibSMTPeerWrapFlag = new FddimibSMTPeerWrapFlagEnt(mib, this);
                            this.fddimibSMTTimeStamp = new FddimibSMTTimeStampEnt(mib, this);
                            this.fddimibSMTTransitionTimeStamp = new FddimibSMTTransitionTimeStampEnt(mib, this);
                            this.fddimibSMTStationAction = new FddimibSMTStationActionEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fddimibSMTIndex,
                                this.fddimibSMTStationId,
                                this.fddimibSMTOpVersionId,
                                this.fddimibSMTHiVersionId,
                                this.fddimibSMTLoVersionId,
                                this.fddimibSMTUserData,
                                this.fddimibSMTMIBVersionId,
                                this.fddimibSMTMACCts,
                                this.fddimibSMTNonMasterCts,
                                this.fddimibSMTMasterCts,
                                this.fddimibSMTAvailablePaths,
                                this.fddimibSMTConfigCapabilities,
                                this.fddimibSMTConfigPolicy,
                                this.fddimibSMTConnectionPolicy,
                                this.fddimibSMTTNotify,
                                this.fddimibSMTStatRptPolicy,
                                this.fddimibSMTTraceMaxExpiration,
                                this.fddimibSMTBypassPresent,
                                this.fddimibSMTECMState,
                                this.fddimibSMTCFState,
                                this.fddimibSMTRemoteDisconnectFlag,
                                this.fddimibSMTStationStatus,
                                this.fddimibSMTPeerWrapFlag,
                                this.fddimibSMTTimeStamp,
                                this.fddimibSMTTransitionTimeStamp,
                                this.fddimibSMTStationAction
                            };
                        }
                        public static final class FddimibSMTIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTIndex", "1.3.6.1.2.1.10.15.73.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTStationIdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTStationIdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTStationId", "1.3.6.1.2.1.10.15.73.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTOpVersionIdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTOpVersionIdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTOpVersionId", "1.3.6.1.2.1.10.15.73.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTHiVersionIdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTHiVersionIdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTHiVersionId", "1.3.6.1.2.1.10.15.73.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTLoVersionIdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTLoVersionIdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTLoVersionId", "1.3.6.1.2.1.10.15.73.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTUserDataEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTUserDataEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTUserData", "1.3.6.1.2.1.10.15.73.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTMIBVersionIdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTMIBVersionIdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTMIBVersionId", "1.3.6.1.2.1.10.15.73.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTMACCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTMACCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTMACCts", "1.3.6.1.2.1.10.15.73.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTNonMasterCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTNonMasterCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTNonMasterCts", "1.3.6.1.2.1.10.15.73.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTMasterCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTMasterCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTMasterCts", "1.3.6.1.2.1.10.15.73.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTAvailablePathsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTAvailablePathsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTAvailablePaths", "1.3.6.1.2.1.10.15.73.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTConfigCapabilitiesEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTConfigCapabilitiesEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTConfigCapabilities", "1.3.6.1.2.1.10.15.73.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTConfigPolicyEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTConfigPolicyEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTConfigPolicy", "1.3.6.1.2.1.10.15.73.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTConnectionPolicyEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTConnectionPolicyEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTConnectionPolicy", "1.3.6.1.2.1.10.15.73.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTTNotifyEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTTNotifyEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTTNotify", "1.3.6.1.2.1.10.15.73.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTStatRptPolicyEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTStatRptPolicyEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTStatRptPolicy", "1.3.6.1.2.1.10.15.73.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTTraceMaxExpirationEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTTraceMaxExpirationEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTTraceMaxExpiration", "1.3.6.1.2.1.10.15.73.1.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTBypassPresentEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTBypassPresentEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTBypassPresent", "1.3.6.1.2.1.10.15.73.1.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTECMStateEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTECMStateEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTECMState", "1.3.6.1.2.1.10.15.73.1.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTCFStateEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTCFStateEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTCFState", "1.3.6.1.2.1.10.15.73.1.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTRemoteDisconnectFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTRemoteDisconnectFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTRemoteDisconnectFlag", "1.3.6.1.2.1.10.15.73.1.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTStationStatusEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTStationStatusEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTStationStatus", "1.3.6.1.2.1.10.15.73.1.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTPeerWrapFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTPeerWrapFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTPeerWrapFlag", "1.3.6.1.2.1.10.15.73.1.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTTimeStampEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTTimeStampEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTTimeStamp", "1.3.6.1.2.1.10.15.73.1.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTTransitionTimeStampEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTTransitionTimeStampEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTTransitionTimeStamp", "1.3.6.1.2.1.10.15.73.1.2.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibSMTStationActionEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibSMTStationActionEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibSMTStationAction", "1.3.6.1.2.1.10.15.73.1.2.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FddimibMACEnt extends MIBEntry<FDDISMT73MIBDef>
            {
                /** the MAC groupImplementation of the MAC Group is mandatory for allsystems which implement manageable FDDI subsystems.*/
                public final FddimibMACNumberEnt fddimibMACNumber;

                /** the MAC table*/
                public final FddimibMACTableEnt fddimibMACTable;

                private FddimibMACEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                {
                    super(mib, parent, "fddimibMAC", "1.3.6.1.2.1.10.15.73.2", false, false, false, false);
                    this.fddimibMACNumber = new FddimibMACNumberEnt(mib, this);
                    this.fddimibMACTable = new FddimibMACTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fddimibMACNumber,
                        this.fddimibMACTable
                    };
                }
                public static final class FddimibMACNumberEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    private FddimibMACNumberEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibMACNumber", "1.3.6.1.2.1.10.15.73.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FddimibMACTableEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    public final FddimibMACEntryEnt fddimibMACEntry;

                    private FddimibMACTableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibMACTable", "1.3.6.1.2.1.10.15.73.2.2", false, true, false, false);
                        this.fddimibMACEntry = new FddimibMACEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fddimibMACEntry
                        };
                    }
                    public static final class FddimibMACEntryEnt extends MIBEntry<FDDISMT73MIBDef>
                    {
                        public final FddimibMACSMTIndexEnt fddimibMACSMTIndex;

                        public final FddimibMACIndexEnt fddimibMACIndex;

                        public final FddimibMACIfIndexEnt fddimibMACIfIndex;

                        public final FddimibMACFrameStatusFunctionsEnt fddimibMACFrameStatusFunctions;

                        public final FddimibMACTMaxCapabilityEnt fddimibMACTMaxCapability;

                        public final FddimibMACTVXCapabilityEnt fddimibMACTVXCapability;

                        public final FddimibMACAvailablePathsEnt fddimibMACAvailablePaths;

                        public final FddimibMACCurrentPathEnt fddimibMACCurrentPath;

                        public final FddimibMACUpstreamNbrEnt fddimibMACUpstreamNbr;

                        public final FddimibMACDownstreamNbrEnt fddimibMACDownstreamNbr;

                        public final FddimibMACOldUpstreamNbrEnt fddimibMACOldUpstreamNbr;

                        public final FddimibMACOldDownstreamNbrEnt fddimibMACOldDownstreamNbr;

                        public final FddimibMACDupAddressTestEnt fddimibMACDupAddressTest;

                        public final FddimibMACRequestedPathsEnt fddimibMACRequestedPaths;

                        public final FddimibMACDownstreamPORTTypeEnt fddimibMACDownstreamPORTType;

                        public final FddimibMACSMTAddressEnt fddimibMACSMTAddress;

                        public final FddimibMACTReqEnt fddimibMACTReq;

                        public final FddimibMACTNegEnt fddimibMACTNeg;

                        public final FddimibMACTMaxEnt fddimibMACTMax;

                        public final FddimibMACTvxValueEnt fddimibMACTvxValue;

                        public final FddimibMACFrameCtsEnt fddimibMACFrameCts;

                        public final FddimibMACCopiedCtsEnt fddimibMACCopiedCts;

                        public final FddimibMACTransmitCtsEnt fddimibMACTransmitCts;

                        public final FddimibMACErrorCtsEnt fddimibMACErrorCts;

                        public final FddimibMACLostCtsEnt fddimibMACLostCts;

                        public final FddimibMACFrameErrorThresholdEnt fddimibMACFrameErrorThreshold;

                        public final FddimibMACFrameErrorRatioEnt fddimibMACFrameErrorRatio;

                        public final FddimibMACRMTStateEnt fddimibMACRMTState;

                        public final FddimibMACDaFlagEnt fddimibMACDaFlag;

                        public final FddimibMACUnaDaFlagEnt fddimibMACUnaDaFlag;

                        public final FddimibMACFrameErrorFlagEnt fddimibMACFrameErrorFlag;

                        public final FddimibMACMAUnitdataAvailableEnt fddimibMACMAUnitdataAvailable;

                        public final FddimibMACHardwarePresentEnt fddimibMACHardwarePresent;

                        public final FddimibMACMAUnitdataEnableEnt fddimibMACMAUnitdataEnable;

                        private FddimibMACEntryEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                        {
                            super(mib, parent, "fddimibMACEntry", "1.3.6.1.2.1.10.15.73.2.2.1", false, false, false, true);
                            this.fddimibMACSMTIndex = new FddimibMACSMTIndexEnt(mib, this);
                            this.fddimibMACIndex = new FddimibMACIndexEnt(mib, this);
                            this.fddimibMACIfIndex = new FddimibMACIfIndexEnt(mib, this);
                            this.fddimibMACFrameStatusFunctions = new FddimibMACFrameStatusFunctionsEnt(mib, this);
                            this.fddimibMACTMaxCapability = new FddimibMACTMaxCapabilityEnt(mib, this);
                            this.fddimibMACTVXCapability = new FddimibMACTVXCapabilityEnt(mib, this);
                            this.fddimibMACAvailablePaths = new FddimibMACAvailablePathsEnt(mib, this);
                            this.fddimibMACCurrentPath = new FddimibMACCurrentPathEnt(mib, this);
                            this.fddimibMACUpstreamNbr = new FddimibMACUpstreamNbrEnt(mib, this);
                            this.fddimibMACDownstreamNbr = new FddimibMACDownstreamNbrEnt(mib, this);
                            this.fddimibMACOldUpstreamNbr = new FddimibMACOldUpstreamNbrEnt(mib, this);
                            this.fddimibMACOldDownstreamNbr = new FddimibMACOldDownstreamNbrEnt(mib, this);
                            this.fddimibMACDupAddressTest = new FddimibMACDupAddressTestEnt(mib, this);
                            this.fddimibMACRequestedPaths = new FddimibMACRequestedPathsEnt(mib, this);
                            this.fddimibMACDownstreamPORTType = new FddimibMACDownstreamPORTTypeEnt(mib, this);
                            this.fddimibMACSMTAddress = new FddimibMACSMTAddressEnt(mib, this);
                            this.fddimibMACTReq = new FddimibMACTReqEnt(mib, this);
                            this.fddimibMACTNeg = new FddimibMACTNegEnt(mib, this);
                            this.fddimibMACTMax = new FddimibMACTMaxEnt(mib, this);
                            this.fddimibMACTvxValue = new FddimibMACTvxValueEnt(mib, this);
                            this.fddimibMACFrameCts = new FddimibMACFrameCtsEnt(mib, this);
                            this.fddimibMACCopiedCts = new FddimibMACCopiedCtsEnt(mib, this);
                            this.fddimibMACTransmitCts = new FddimibMACTransmitCtsEnt(mib, this);
                            this.fddimibMACErrorCts = new FddimibMACErrorCtsEnt(mib, this);
                            this.fddimibMACLostCts = new FddimibMACLostCtsEnt(mib, this);
                            this.fddimibMACFrameErrorThreshold = new FddimibMACFrameErrorThresholdEnt(mib, this);
                            this.fddimibMACFrameErrorRatio = new FddimibMACFrameErrorRatioEnt(mib, this);
                            this.fddimibMACRMTState = new FddimibMACRMTStateEnt(mib, this);
                            this.fddimibMACDaFlag = new FddimibMACDaFlagEnt(mib, this);
                            this.fddimibMACUnaDaFlag = new FddimibMACUnaDaFlagEnt(mib, this);
                            this.fddimibMACFrameErrorFlag = new FddimibMACFrameErrorFlagEnt(mib, this);
                            this.fddimibMACMAUnitdataAvailable = new FddimibMACMAUnitdataAvailableEnt(mib, this);
                            this.fddimibMACHardwarePresent = new FddimibMACHardwarePresentEnt(mib, this);
                            this.fddimibMACMAUnitdataEnable = new FddimibMACMAUnitdataEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fddimibMACSMTIndex,
                                this.fddimibMACIndex,
                                this.fddimibMACIfIndex,
                                this.fddimibMACFrameStatusFunctions,
                                this.fddimibMACTMaxCapability,
                                this.fddimibMACTVXCapability,
                                this.fddimibMACAvailablePaths,
                                this.fddimibMACCurrentPath,
                                this.fddimibMACUpstreamNbr,
                                this.fddimibMACDownstreamNbr,
                                this.fddimibMACOldUpstreamNbr,
                                this.fddimibMACOldDownstreamNbr,
                                this.fddimibMACDupAddressTest,
                                this.fddimibMACRequestedPaths,
                                this.fddimibMACDownstreamPORTType,
                                this.fddimibMACSMTAddress,
                                this.fddimibMACTReq,
                                this.fddimibMACTNeg,
                                this.fddimibMACTMax,
                                this.fddimibMACTvxValue,
                                this.fddimibMACFrameCts,
                                this.fddimibMACCopiedCts,
                                this.fddimibMACTransmitCts,
                                this.fddimibMACErrorCts,
                                this.fddimibMACLostCts,
                                this.fddimibMACFrameErrorThreshold,
                                this.fddimibMACFrameErrorRatio,
                                this.fddimibMACRMTState,
                                this.fddimibMACDaFlag,
                                this.fddimibMACUnaDaFlag,
                                this.fddimibMACFrameErrorFlag,
                                this.fddimibMACMAUnitdataAvailable,
                                this.fddimibMACHardwarePresent,
                                this.fddimibMACMAUnitdataEnable
                            };
                        }
                        public static final class FddimibMACSMTIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACSMTIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACSMTIndex", "1.3.6.1.2.1.10.15.73.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACIndex", "1.3.6.1.2.1.10.15.73.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACIfIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACIfIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACIfIndex", "1.3.6.1.2.1.10.15.73.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACFrameStatusFunctionsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACFrameStatusFunctionsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACFrameStatusFunctions", "1.3.6.1.2.1.10.15.73.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTMaxCapabilityEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTMaxCapabilityEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTMaxCapability", "1.3.6.1.2.1.10.15.73.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTVXCapabilityEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTVXCapabilityEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTVXCapability", "1.3.6.1.2.1.10.15.73.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACAvailablePathsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACAvailablePathsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACAvailablePaths", "1.3.6.1.2.1.10.15.73.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACCurrentPathEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACCurrentPathEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACCurrentPath", "1.3.6.1.2.1.10.15.73.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACUpstreamNbrEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACUpstreamNbrEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACUpstreamNbr", "1.3.6.1.2.1.10.15.73.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACDownstreamNbrEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACDownstreamNbrEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACDownstreamNbr", "1.3.6.1.2.1.10.15.73.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACOldUpstreamNbrEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACOldUpstreamNbrEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACOldUpstreamNbr", "1.3.6.1.2.1.10.15.73.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACOldDownstreamNbrEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACOldDownstreamNbrEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACOldDownstreamNbr", "1.3.6.1.2.1.10.15.73.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACDupAddressTestEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACDupAddressTestEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACDupAddressTest", "1.3.6.1.2.1.10.15.73.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACRequestedPathsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACRequestedPathsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACRequestedPaths", "1.3.6.1.2.1.10.15.73.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACDownstreamPORTTypeEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACDownstreamPORTTypeEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACDownstreamPORTType", "1.3.6.1.2.1.10.15.73.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACSMTAddressEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACSMTAddressEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACSMTAddress", "1.3.6.1.2.1.10.15.73.2.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTReqEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTReqEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTReq", "1.3.6.1.2.1.10.15.73.2.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTNegEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTNegEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTNeg", "1.3.6.1.2.1.10.15.73.2.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTMaxEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTMaxEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTMax", "1.3.6.1.2.1.10.15.73.2.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTvxValueEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTvxValueEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTvxValue", "1.3.6.1.2.1.10.15.73.2.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACFrameCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACFrameCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACFrameCts", "1.3.6.1.2.1.10.15.73.2.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACCopiedCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACCopiedCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACCopiedCts", "1.3.6.1.2.1.10.15.73.2.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTransmitCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTransmitCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTransmitCts", "1.3.6.1.2.1.10.15.73.2.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACErrorCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACErrorCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACErrorCts", "1.3.6.1.2.1.10.15.73.2.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACLostCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACLostCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACLostCts", "1.3.6.1.2.1.10.15.73.2.2.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACFrameErrorThresholdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACFrameErrorThresholdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACFrameErrorThreshold", "1.3.6.1.2.1.10.15.73.2.2.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACFrameErrorRatioEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACFrameErrorRatioEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACFrameErrorRatio", "1.3.6.1.2.1.10.15.73.2.2.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACRMTStateEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACRMTStateEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACRMTState", "1.3.6.1.2.1.10.15.73.2.2.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACDaFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACDaFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACDaFlag", "1.3.6.1.2.1.10.15.73.2.2.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACUnaDaFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACUnaDaFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACUnaDaFlag", "1.3.6.1.2.1.10.15.73.2.2.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACFrameErrorFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACFrameErrorFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACFrameErrorFlag", "1.3.6.1.2.1.10.15.73.2.2.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACMAUnitdataAvailableEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACMAUnitdataAvailableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACMAUnitdataAvailable", "1.3.6.1.2.1.10.15.73.2.2.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACHardwarePresentEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACHardwarePresentEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACHardwarePresent", "1.3.6.1.2.1.10.15.73.2.2.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACMAUnitdataEnableEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACMAUnitdataEnableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACMAUnitdataEnable", "1.3.6.1.2.1.10.15.73.2.2.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FddimibMACCountersEnt extends MIBEntry<FDDISMT73MIBDef>
            {
                /** the Enhanced MAC Counters groupImplementation of this Group is optional, but systemsclaiming support must implement all variables in thisgroup

the MAC Counters table*/
                public final FddimibMACCountersTableEnt fddimibMACCountersTable;

                private FddimibMACCountersEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                {
                    super(mib, parent, "fddimibMACCounters", "1.3.6.1.2.1.10.15.73.3", false, false, false, false);
                    this.fddimibMACCountersTable = new FddimibMACCountersTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fddimibMACCountersTable
                    };
                }
                public static final class FddimibMACCountersTableEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    public final FddimibMACCountersEntryEnt fddimibMACCountersEntry;

                    private FddimibMACCountersTableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibMACCountersTable", "1.3.6.1.2.1.10.15.73.3.1", false, true, false, false);
                        this.fddimibMACCountersEntry = new FddimibMACCountersEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fddimibMACCountersEntry
                        };
                    }
                    public static final class FddimibMACCountersEntryEnt extends MIBEntry<FDDISMT73MIBDef>
                    {
                        public final FddimibMACTokenCtsEnt fddimibMACTokenCts;

                        public final FddimibMACTvxExpiredCtsEnt fddimibMACTvxExpiredCts;

                        public final FddimibMACNotCopiedCtsEnt fddimibMACNotCopiedCts;

                        public final FddimibMACLateCtsEnt fddimibMACLateCts;

                        public final FddimibMACRingOpCtsEnt fddimibMACRingOpCts;

                        public final FddimibMACNotCopiedRatioEnt fddimibMACNotCopiedRatio;

                        public final FddimibMACNotCopiedFlagEnt fddimibMACNotCopiedFlag;

                        public final FddimibMACNotCopiedThresholdEnt fddimibMACNotCopiedThreshold;

                        private FddimibMACCountersEntryEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                        {
                            super(mib, parent, "fddimibMACCountersEntry", "1.3.6.1.2.1.10.15.73.3.1.1", false, false, false, true);
                            this.fddimibMACTokenCts = new FddimibMACTokenCtsEnt(mib, this);
                            this.fddimibMACTvxExpiredCts = new FddimibMACTvxExpiredCtsEnt(mib, this);
                            this.fddimibMACNotCopiedCts = new FddimibMACNotCopiedCtsEnt(mib, this);
                            this.fddimibMACLateCts = new FddimibMACLateCtsEnt(mib, this);
                            this.fddimibMACRingOpCts = new FddimibMACRingOpCtsEnt(mib, this);
                            this.fddimibMACNotCopiedRatio = new FddimibMACNotCopiedRatioEnt(mib, this);
                            this.fddimibMACNotCopiedFlag = new FddimibMACNotCopiedFlagEnt(mib, this);
                            this.fddimibMACNotCopiedThreshold = new FddimibMACNotCopiedThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fddimibMACTokenCts,
                                this.fddimibMACTvxExpiredCts,
                                this.fddimibMACNotCopiedCts,
                                this.fddimibMACLateCts,
                                this.fddimibMACRingOpCts,
                                this.fddimibMACNotCopiedRatio,
                                this.fddimibMACNotCopiedFlag,
                                this.fddimibMACNotCopiedThreshold
                            };
                        }
                        public static final class FddimibMACTokenCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTokenCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTokenCts", "1.3.6.1.2.1.10.15.73.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACTvxExpiredCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACTvxExpiredCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACTvxExpiredCts", "1.3.6.1.2.1.10.15.73.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACNotCopiedCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACNotCopiedCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACNotCopiedCts", "1.3.6.1.2.1.10.15.73.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACLateCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACLateCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACLateCts", "1.3.6.1.2.1.10.15.73.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACRingOpCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACRingOpCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACRingOpCts", "1.3.6.1.2.1.10.15.73.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACNotCopiedRatioEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACNotCopiedRatioEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACNotCopiedRatio", "1.3.6.1.2.1.10.15.73.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACNotCopiedFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACNotCopiedFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACNotCopiedFlag", "1.3.6.1.2.1.10.15.73.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibMACNotCopiedThresholdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibMACNotCopiedThresholdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibMACNotCopiedThreshold", "1.3.6.1.2.1.10.15.73.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FddimibPATHEnt extends MIBEntry<FDDISMT73MIBDef>
            {
                /** the PATH groupImplementation of the PATH group is mandatory for allsystems which implement manageable FDDI subsystems.*/
                public final FddimibPATHNumberEnt fddimibPATHNumber;

                /** the PATH table*/
                public final FddimibPATHTableEnt fddimibPATHTable;

                /** the PATH Configuration table*/
                public final FddimibPATHConfigTableEnt fddimibPATHConfigTable;

                private FddimibPATHEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                {
                    super(mib, parent, "fddimibPATH", "1.3.6.1.2.1.10.15.73.4", false, false, false, false);
                    this.fddimibPATHNumber = new FddimibPATHNumberEnt(mib, this);
                    this.fddimibPATHTable = new FddimibPATHTableEnt(mib, this);
                    this.fddimibPATHConfigTable = new FddimibPATHConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fddimibPATHNumber,
                        this.fddimibPATHTable,
                        this.fddimibPATHConfigTable
                    };
                }
                public static final class FddimibPATHNumberEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    private FddimibPATHNumberEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibPATHNumber", "1.3.6.1.2.1.10.15.73.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FddimibPATHTableEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    public final FddimibPATHEntryEnt fddimibPATHEntry;

                    private FddimibPATHTableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibPATHTable", "1.3.6.1.2.1.10.15.73.4.2", false, true, false, false);
                        this.fddimibPATHEntry = new FddimibPATHEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fddimibPATHEntry
                        };
                    }
                    public static final class FddimibPATHEntryEnt extends MIBEntry<FDDISMT73MIBDef>
                    {
                        public final FddimibPATHSMTIndexEnt fddimibPATHSMTIndex;

                        public final FddimibPATHIndexEnt fddimibPATHIndex;

                        public final FddimibPATHTVXLowerBoundEnt fddimibPATHTVXLowerBound;

                        public final FddimibPATHTMaxLowerBoundEnt fddimibPATHTMaxLowerBound;

                        public final FddimibPATHMaxTReqEnt fddimibPATHMaxTReq;

                        private FddimibPATHEntryEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                        {
                            super(mib, parent, "fddimibPATHEntry", "1.3.6.1.2.1.10.15.73.4.2.1", false, false, false, true);
                            this.fddimibPATHSMTIndex = new FddimibPATHSMTIndexEnt(mib, this);
                            this.fddimibPATHIndex = new FddimibPATHIndexEnt(mib, this);
                            this.fddimibPATHTVXLowerBound = new FddimibPATHTVXLowerBoundEnt(mib, this);
                            this.fddimibPATHTMaxLowerBound = new FddimibPATHTMaxLowerBoundEnt(mib, this);
                            this.fddimibPATHMaxTReq = new FddimibPATHMaxTReqEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fddimibPATHSMTIndex,
                                this.fddimibPATHIndex,
                                this.fddimibPATHTVXLowerBound,
                                this.fddimibPATHTMaxLowerBound,
                                this.fddimibPATHMaxTReq
                            };
                        }
                        public static final class FddimibPATHSMTIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHSMTIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHSMTIndex", "1.3.6.1.2.1.10.15.73.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHIndex", "1.3.6.1.2.1.10.15.73.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHTVXLowerBoundEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHTVXLowerBoundEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHTVXLowerBound", "1.3.6.1.2.1.10.15.73.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHTMaxLowerBoundEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHTMaxLowerBoundEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHTMaxLowerBound", "1.3.6.1.2.1.10.15.73.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHMaxTReqEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHMaxTReqEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHMaxTReq", "1.3.6.1.2.1.10.15.73.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FddimibPATHConfigTableEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    public final FddimibPATHConfigEntryEnt fddimibPATHConfigEntry;

                    private FddimibPATHConfigTableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibPATHConfigTable", "1.3.6.1.2.1.10.15.73.4.3", false, true, false, false);
                        this.fddimibPATHConfigEntry = new FddimibPATHConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fddimibPATHConfigEntry
                        };
                    }
                    public static final class FddimibPATHConfigEntryEnt extends MIBEntry<FDDISMT73MIBDef>
                    {
                        public final FddimibPATHConfigSMTIndexEnt fddimibPATHConfigSMTIndex;

                        public final FddimibPATHConfigPATHIndexEnt fddimibPATHConfigPATHIndex;

                        public final FddimibPATHConfigTokenOrderEnt fddimibPATHConfigTokenOrder;

                        public final FddimibPATHConfigResourceTypeEnt fddimibPATHConfigResourceType;

                        public final FddimibPATHConfigResourceIndexEnt fddimibPATHConfigResourceIndex;

                        public final FddimibPATHConfigCurrentPathEnt fddimibPATHConfigCurrentPath;

                        private FddimibPATHConfigEntryEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                        {
                            super(mib, parent, "fddimibPATHConfigEntry", "1.3.6.1.2.1.10.15.73.4.3.1", false, false, false, true);
                            this.fddimibPATHConfigSMTIndex = new FddimibPATHConfigSMTIndexEnt(mib, this);
                            this.fddimibPATHConfigPATHIndex = new FddimibPATHConfigPATHIndexEnt(mib, this);
                            this.fddimibPATHConfigTokenOrder = new FddimibPATHConfigTokenOrderEnt(mib, this);
                            this.fddimibPATHConfigResourceType = new FddimibPATHConfigResourceTypeEnt(mib, this);
                            this.fddimibPATHConfigResourceIndex = new FddimibPATHConfigResourceIndexEnt(mib, this);
                            this.fddimibPATHConfigCurrentPath = new FddimibPATHConfigCurrentPathEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fddimibPATHConfigSMTIndex,
                                this.fddimibPATHConfigPATHIndex,
                                this.fddimibPATHConfigTokenOrder,
                                this.fddimibPATHConfigResourceType,
                                this.fddimibPATHConfigResourceIndex,
                                this.fddimibPATHConfigCurrentPath
                            };
                        }
                        public static final class FddimibPATHConfigSMTIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHConfigSMTIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHConfigSMTIndex", "1.3.6.1.2.1.10.15.73.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHConfigPATHIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHConfigPATHIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHConfigPATHIndex", "1.3.6.1.2.1.10.15.73.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHConfigTokenOrderEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHConfigTokenOrderEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHConfigTokenOrder", "1.3.6.1.2.1.10.15.73.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHConfigResourceTypeEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHConfigResourceTypeEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHConfigResourceType", "1.3.6.1.2.1.10.15.73.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHConfigResourceIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHConfigResourceIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHConfigResourceIndex", "1.3.6.1.2.1.10.15.73.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPATHConfigCurrentPathEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPATHConfigCurrentPathEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPATHConfigCurrentPath", "1.3.6.1.2.1.10.15.73.4.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FddimibPORTEnt extends MIBEntry<FDDISMT73MIBDef>
            {
                /** the PORT groupImplementation of the PORT group is mandatory for allsystems which implement manageable FDDI subsystems.*/
                public final FddimibPORTNumberEnt fddimibPORTNumber;

                /** the PORT table*/
                public final FddimibPORTTableEnt fddimibPORTTable;

                private FddimibPORTEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                {
                    super(mib, parent, "fddimibPORT", "1.3.6.1.2.1.10.15.73.5", false, false, false, false);
                    this.fddimibPORTNumber = new FddimibPORTNumberEnt(mib, this);
                    this.fddimibPORTTable = new FddimibPORTTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fddimibPORTNumber,
                        this.fddimibPORTTable
                    };
                }
                public static final class FddimibPORTNumberEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    private FddimibPORTNumberEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibPORTNumber", "1.3.6.1.2.1.10.15.73.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FddimibPORTTableEnt extends MIBEntry<FDDISMT73MIBDef>
                {
                    public final FddimibPORTEntryEnt fddimibPORTEntry;

                    private FddimibPORTTableEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                    {
                        super(mib, parent, "fddimibPORTTable", "1.3.6.1.2.1.10.15.73.5.2", false, true, false, false);
                        this.fddimibPORTEntry = new FddimibPORTEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fddimibPORTEntry
                        };
                    }
                    public static final class FddimibPORTEntryEnt extends MIBEntry<FDDISMT73MIBDef>
                    {
                        public final FddimibPORTSMTIndexEnt fddimibPORTSMTIndex;

                        public final FddimibPORTIndexEnt fddimibPORTIndex;

                        public final FddimibPORTMyTypeEnt fddimibPORTMyType;

                        public final FddimibPORTNeighborTypeEnt fddimibPORTNeighborType;

                        public final FddimibPORTConnectionPoliciesEnt fddimibPORTConnectionPolicies;

                        public final FddimibPORTMACIndicatedEnt fddimibPORTMACIndicated;

                        public final FddimibPORTCurrentPathEnt fddimibPORTCurrentPath;

                        public final FddimibPORTRequestedPathsEnt fddimibPORTRequestedPaths;

                        public final FddimibPORTMACPlacementEnt fddimibPORTMACPlacement;

                        public final FddimibPORTAvailablePathsEnt fddimibPORTAvailablePaths;

                        public final FddimibPORTPMDClassEnt fddimibPORTPMDClass;

                        public final FddimibPORTConnectionCapabilitiesEnt fddimibPORTConnectionCapabilities;

                        public final FddimibPORTBSFlagEnt fddimibPORTBSFlag;

                        public final FddimibPORTLCTFailCtsEnt fddimibPORTLCTFailCts;

                        public final FddimibPORTLerEstimateEnt fddimibPORTLerEstimate;

                        public final FddimibPORTLemRejectCtsEnt fddimibPORTLemRejectCts;

                        public final FddimibPORTLemCtsEnt fddimibPORTLemCts;

                        public final FddimibPORTLerCutoffEnt fddimibPORTLerCutoff;

                        public final FddimibPORTLerAlarmEnt fddimibPORTLerAlarm;

                        public final FddimibPORTConnectStateEnt fddimibPORTConnectState;

                        public final FddimibPORTPCMStateEnt fddimibPORTPCMState;

                        public final FddimibPORTPCWithholdEnt fddimibPORTPCWithhold;

                        public final FddimibPORTLerFlagEnt fddimibPORTLerFlag;

                        public final FddimibPORTHardwarePresentEnt fddimibPORTHardwarePresent;

                        public final FddimibPORTActionEnt fddimibPORTAction;

                        private FddimibPORTEntryEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                        {
                            super(mib, parent, "fddimibPORTEntry", "1.3.6.1.2.1.10.15.73.5.2.1", false, false, false, true);
                            this.fddimibPORTSMTIndex = new FddimibPORTSMTIndexEnt(mib, this);
                            this.fddimibPORTIndex = new FddimibPORTIndexEnt(mib, this);
                            this.fddimibPORTMyType = new FddimibPORTMyTypeEnt(mib, this);
                            this.fddimibPORTNeighborType = new FddimibPORTNeighborTypeEnt(mib, this);
                            this.fddimibPORTConnectionPolicies = new FddimibPORTConnectionPoliciesEnt(mib, this);
                            this.fddimibPORTMACIndicated = new FddimibPORTMACIndicatedEnt(mib, this);
                            this.fddimibPORTCurrentPath = new FddimibPORTCurrentPathEnt(mib, this);
                            this.fddimibPORTRequestedPaths = new FddimibPORTRequestedPathsEnt(mib, this);
                            this.fddimibPORTMACPlacement = new FddimibPORTMACPlacementEnt(mib, this);
                            this.fddimibPORTAvailablePaths = new FddimibPORTAvailablePathsEnt(mib, this);
                            this.fddimibPORTPMDClass = new FddimibPORTPMDClassEnt(mib, this);
                            this.fddimibPORTConnectionCapabilities = new FddimibPORTConnectionCapabilitiesEnt(mib, this);
                            this.fddimibPORTBSFlag = new FddimibPORTBSFlagEnt(mib, this);
                            this.fddimibPORTLCTFailCts = new FddimibPORTLCTFailCtsEnt(mib, this);
                            this.fddimibPORTLerEstimate = new FddimibPORTLerEstimateEnt(mib, this);
                            this.fddimibPORTLemRejectCts = new FddimibPORTLemRejectCtsEnt(mib, this);
                            this.fddimibPORTLemCts = new FddimibPORTLemCtsEnt(mib, this);
                            this.fddimibPORTLerCutoff = new FddimibPORTLerCutoffEnt(mib, this);
                            this.fddimibPORTLerAlarm = new FddimibPORTLerAlarmEnt(mib, this);
                            this.fddimibPORTConnectState = new FddimibPORTConnectStateEnt(mib, this);
                            this.fddimibPORTPCMState = new FddimibPORTPCMStateEnt(mib, this);
                            this.fddimibPORTPCWithhold = new FddimibPORTPCWithholdEnt(mib, this);
                            this.fddimibPORTLerFlag = new FddimibPORTLerFlagEnt(mib, this);
                            this.fddimibPORTHardwarePresent = new FddimibPORTHardwarePresentEnt(mib, this);
                            this.fddimibPORTAction = new FddimibPORTActionEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fddimibPORTSMTIndex,
                                this.fddimibPORTIndex,
                                this.fddimibPORTMyType,
                                this.fddimibPORTNeighborType,
                                this.fddimibPORTConnectionPolicies,
                                this.fddimibPORTMACIndicated,
                                this.fddimibPORTCurrentPath,
                                this.fddimibPORTRequestedPaths,
                                this.fddimibPORTMACPlacement,
                                this.fddimibPORTAvailablePaths,
                                this.fddimibPORTPMDClass,
                                this.fddimibPORTConnectionCapabilities,
                                this.fddimibPORTBSFlag,
                                this.fddimibPORTLCTFailCts,
                                this.fddimibPORTLerEstimate,
                                this.fddimibPORTLemRejectCts,
                                this.fddimibPORTLemCts,
                                this.fddimibPORTLerCutoff,
                                this.fddimibPORTLerAlarm,
                                this.fddimibPORTConnectState,
                                this.fddimibPORTPCMState,
                                this.fddimibPORTPCWithhold,
                                this.fddimibPORTLerFlag,
                                this.fddimibPORTHardwarePresent,
                                this.fddimibPORTAction
                            };
                        }
                        public static final class FddimibPORTSMTIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTSMTIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTSMTIndex", "1.3.6.1.2.1.10.15.73.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTIndexEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTIndexEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTIndex", "1.3.6.1.2.1.10.15.73.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTMyTypeEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTMyTypeEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTMyType", "1.3.6.1.2.1.10.15.73.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTNeighborTypeEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTNeighborTypeEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTNeighborType", "1.3.6.1.2.1.10.15.73.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTConnectionPoliciesEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTConnectionPoliciesEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTConnectionPolicies", "1.3.6.1.2.1.10.15.73.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTMACIndicatedEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTMACIndicatedEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTMACIndicated", "1.3.6.1.2.1.10.15.73.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTCurrentPathEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTCurrentPathEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTCurrentPath", "1.3.6.1.2.1.10.15.73.5.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTRequestedPathsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTRequestedPathsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTRequestedPaths", "1.3.6.1.2.1.10.15.73.5.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTMACPlacementEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTMACPlacementEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTMACPlacement", "1.3.6.1.2.1.10.15.73.5.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTAvailablePathsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTAvailablePathsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTAvailablePaths", "1.3.6.1.2.1.10.15.73.5.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTPMDClassEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTPMDClassEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTPMDClass", "1.3.6.1.2.1.10.15.73.5.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTConnectionCapabilitiesEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTConnectionCapabilitiesEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTConnectionCapabilities", "1.3.6.1.2.1.10.15.73.5.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTBSFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTBSFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTBSFlag", "1.3.6.1.2.1.10.15.73.5.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLCTFailCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLCTFailCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLCTFailCts", "1.3.6.1.2.1.10.15.73.5.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLerEstimateEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLerEstimateEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLerEstimate", "1.3.6.1.2.1.10.15.73.5.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLemRejectCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLemRejectCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLemRejectCts", "1.3.6.1.2.1.10.15.73.5.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLemCtsEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLemCtsEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLemCts", "1.3.6.1.2.1.10.15.73.5.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLerCutoffEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLerCutoffEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLerCutoff", "1.3.6.1.2.1.10.15.73.5.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLerAlarmEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLerAlarmEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLerAlarm", "1.3.6.1.2.1.10.15.73.5.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTConnectStateEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTConnectStateEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTConnectState", "1.3.6.1.2.1.10.15.73.5.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTPCMStateEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTPCMStateEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTPCMState", "1.3.6.1.2.1.10.15.73.5.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTPCWithholdEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTPCWithholdEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTPCWithhold", "1.3.6.1.2.1.10.15.73.5.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTLerFlagEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTLerFlagEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTLerFlag", "1.3.6.1.2.1.10.15.73.5.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTHardwarePresentEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTHardwarePresentEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTHardwarePresent", "1.3.6.1.2.1.10.15.73.5.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FddimibPORTActionEnt extends MIBEntry<FDDISMT73MIBDef>
                        {
                            private FddimibPORTActionEnt(FDDISMT73MIBDef mib, MIBEntry<FDDISMT73MIBDef> parent)
                            {
                                super(mib, parent, "fddimibPORTAction", "1.3.6.1.2.1.10.15.73.5.2.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

    }

}
