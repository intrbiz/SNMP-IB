package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DOCSIETFQOSMIBDef extends MIB
{
    public static final DOCSIETFQOSMIBDef DOCSIETFQOSMIB = new DOCSIETFQOSMIBDef();

    static { MIBs.getInstance().registerMIB(DOCSIETFQOSMIBDef.DOCSIETFQOSMIB); }

    /** January 23, 2006*/
    public final DocsIetfQosMIBEnt docsIetfQosMIB;

    private DOCSIETFQOSMIBDef()
    {
        super("DOCS-IETF-QOS-MIB");
        this.docsIetfQosMIB = new DocsIetfQosMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsIetfQosMIB
        };
    }

    public static final class DocsIetfQosMIBEnt extends MIBEntry<DOCSIETFQOSMIBDef>
    {
        /** Placeholder for notifications/traps.*/
        public final DocsIetfQosNotificationsEnt docsIetfQosNotifications;

        public final DocsIetfQosMIBObjectsEnt docsIetfQosMIBObjects;

        /** Conformance definitions*/
        public final DocsIetfQosConformanceEnt docsIetfQosConformance;

        private DocsIetfQosMIBEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
        {
            super(mib, parent, "docsIetfQosMIB", "1.3.6.1.2.1.127", false, false, false, false);
            this.docsIetfQosNotifications = new DocsIetfQosNotificationsEnt(mib, this);
            this.docsIetfQosMIBObjects = new DocsIetfQosMIBObjectsEnt(mib, this);
            this.docsIetfQosConformance = new DocsIetfQosConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsIetfQosNotifications,
                this.docsIetfQosMIBObjects,
                this.docsIetfQosConformance
            };
        }
        public static final class DocsIetfQosNotificationsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
        {
            private DocsIetfQosNotificationsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
            {
                super(mib, parent, "docsIetfQosNotifications", "1.3.6.1.2.1.127.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsIetfQosMIBObjectsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
        {
            /** -----------------------------------Packet Classifier Table*/
            public final DocsIetfQosPktClassTableEnt docsIetfQosPktClassTable;

            /** QOS Parameter Set Table*/
            public final DocsIetfQosParamSetTableEnt docsIetfQosParamSetTable;

            /** Service Flow Table*/
            public final DocsIetfQosServiceFlowTableEnt docsIetfQosServiceFlowTable;

            /** Service Flow Stats Table*/
            public final DocsIetfQosServiceFlowStatsTableEnt docsIetfQosServiceFlowStatsTable;

            /** Upstream Service Flow Stats Table (CMTS ONLY)*/
            public final DocsIetfQosUpstreamStatsTableEnt docsIetfQosUpstreamStatsTable;

            /** Dynamic Service Stats Table*/
            public final DocsIetfQosDynamicServiceStatsTableEnt docsIetfQosDynamicServiceStatsTable;

            /** Service Flow Log Table (CMTS ONLY)*/
            public final DocsIetfQosServiceFlowLogTableEnt docsIetfQosServiceFlowLogTable;

            /** Service Class Table (CMTS ONLY)*/
            public final DocsIetfQosServiceClassTableEnt docsIetfQosServiceClassTable;

            /** Service Class PolicyTable*/
            public final DocsIetfQosServiceClassPolicyTableEnt docsIetfQosServiceClassPolicyTable;

            /** Payload Header Suppression(PHS) Table*/
            public final DocsIetfQosPHSTableEnt docsIetfQosPHSTable;

            /** docsIetfQosCmtsMacToSrvFlowTable (CMTS Only)*/
            public final DocsIetfQosCmtsMacToSrvFlowTableEnt docsIetfQosCmtsMacToSrvFlowTable;

            private DocsIetfQosMIBObjectsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
            {
                super(mib, parent, "docsIetfQosMIBObjects", "1.3.6.1.2.1.127.1", false, false, false, false);
                this.docsIetfQosPktClassTable = new DocsIetfQosPktClassTableEnt(mib, this);
                this.docsIetfQosParamSetTable = new DocsIetfQosParamSetTableEnt(mib, this);
                this.docsIetfQosServiceFlowTable = new DocsIetfQosServiceFlowTableEnt(mib, this);
                this.docsIetfQosServiceFlowStatsTable = new DocsIetfQosServiceFlowStatsTableEnt(mib, this);
                this.docsIetfQosUpstreamStatsTable = new DocsIetfQosUpstreamStatsTableEnt(mib, this);
                this.docsIetfQosDynamicServiceStatsTable = new DocsIetfQosDynamicServiceStatsTableEnt(mib, this);
                this.docsIetfQosServiceFlowLogTable = new DocsIetfQosServiceFlowLogTableEnt(mib, this);
                this.docsIetfQosServiceClassTable = new DocsIetfQosServiceClassTableEnt(mib, this);
                this.docsIetfQosServiceClassPolicyTable = new DocsIetfQosServiceClassPolicyTableEnt(mib, this);
                this.docsIetfQosPHSTable = new DocsIetfQosPHSTableEnt(mib, this);
                this.docsIetfQosCmtsMacToSrvFlowTable = new DocsIetfQosCmtsMacToSrvFlowTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsIetfQosPktClassTable,
                    this.docsIetfQosParamSetTable,
                    this.docsIetfQosServiceFlowTable,
                    this.docsIetfQosServiceFlowStatsTable,
                    this.docsIetfQosUpstreamStatsTable,
                    this.docsIetfQosDynamicServiceStatsTable,
                    this.docsIetfQosServiceFlowLogTable,
                    this.docsIetfQosServiceClassTable,
                    this.docsIetfQosServiceClassPolicyTable,
                    this.docsIetfQosPHSTable,
                    this.docsIetfQosCmtsMacToSrvFlowTable
                };
            }
            public static final class DocsIetfQosPktClassTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosPktClassEntryEnt docsIetfQosPktClassEntry;

                private DocsIetfQosPktClassTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosPktClassTable", "1.3.6.1.2.1.127.1.1", false, true, false, false);
                    this.docsIetfQosPktClassEntry = new DocsIetfQosPktClassEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosPktClassEntry
                    };
                }
                public static final class DocsIetfQosPktClassEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosPktClassIdEnt docsIetfQosPktClassId;

                    public final DocsIetfQosPktClassDirectionEnt docsIetfQosPktClassDirection;

                    public final DocsIetfQosPktClassPriorityEnt docsIetfQosPktClassPriority;

                    public final DocsIetfQosPktClassIpTosLowEnt docsIetfQosPktClassIpTosLow;

                    public final DocsIetfQosPktClassIpTosHighEnt docsIetfQosPktClassIpTosHigh;

                    public final DocsIetfQosPktClassIpTosMaskEnt docsIetfQosPktClassIpTosMask;

                    public final DocsIetfQosPktClassIpProtocolEnt docsIetfQosPktClassIpProtocol;

                    public final DocsIetfQosPktClassInetAddressTypeEnt docsIetfQosPktClassInetAddressType;

                    public final DocsIetfQosPktClassInetSourceAddrEnt docsIetfQosPktClassInetSourceAddr;

                    public final DocsIetfQosPktClassInetSourceMaskEnt docsIetfQosPktClassInetSourceMask;

                    public final DocsIetfQosPktClassInetDestAddrEnt docsIetfQosPktClassInetDestAddr;

                    public final DocsIetfQosPktClassInetDestMaskEnt docsIetfQosPktClassInetDestMask;

                    public final DocsIetfQosPktClassSourcePortStartEnt docsIetfQosPktClassSourcePortStart;

                    public final DocsIetfQosPktClassSourcePortEndEnt docsIetfQosPktClassSourcePortEnd;

                    public final DocsIetfQosPktClassDestPortStartEnt docsIetfQosPktClassDestPortStart;

                    public final DocsIetfQosPktClassDestPortEndEnt docsIetfQosPktClassDestPortEnd;

                    public final DocsIetfQosPktClassDestMacAddrEnt docsIetfQosPktClassDestMacAddr;

                    public final DocsIetfQosPktClassDestMacMaskEnt docsIetfQosPktClassDestMacMask;

                    public final DocsIetfQosPktClassSourceMacAddrEnt docsIetfQosPktClassSourceMacAddr;

                    public final DocsIetfQosPktClassEnetProtocolTypeEnt docsIetfQosPktClassEnetProtocolType;

                    public final DocsIetfQosPktClassEnetProtocolEnt docsIetfQosPktClassEnetProtocol;

                    public final DocsIetfQosPktClassUserPriLowEnt docsIetfQosPktClassUserPriLow;

                    public final DocsIetfQosPktClassUserPriHighEnt docsIetfQosPktClassUserPriHigh;

                    public final DocsIetfQosPktClassVlanIdEnt docsIetfQosPktClassVlanId;

                    public final DocsIetfQosPktClassStateActiveEnt docsIetfQosPktClassStateActive;

                    public final DocsIetfQosPktClassPktsEnt docsIetfQosPktClassPkts;

                    public final DocsIetfQosPktClassBitMapEnt docsIetfQosPktClassBitMap;

                    private DocsIetfQosPktClassEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosPktClassEntry", "1.3.6.1.2.1.127.1.1.1", false, false, false, true);
                        this.docsIetfQosPktClassId = new DocsIetfQosPktClassIdEnt(mib, this);
                        this.docsIetfQosPktClassDirection = new DocsIetfQosPktClassDirectionEnt(mib, this);
                        this.docsIetfQosPktClassPriority = new DocsIetfQosPktClassPriorityEnt(mib, this);
                        this.docsIetfQosPktClassIpTosLow = new DocsIetfQosPktClassIpTosLowEnt(mib, this);
                        this.docsIetfQosPktClassIpTosHigh = new DocsIetfQosPktClassIpTosHighEnt(mib, this);
                        this.docsIetfQosPktClassIpTosMask = new DocsIetfQosPktClassIpTosMaskEnt(mib, this);
                        this.docsIetfQosPktClassIpProtocol = new DocsIetfQosPktClassIpProtocolEnt(mib, this);
                        this.docsIetfQosPktClassInetAddressType = new DocsIetfQosPktClassInetAddressTypeEnt(mib, this);
                        this.docsIetfQosPktClassInetSourceAddr = new DocsIetfQosPktClassInetSourceAddrEnt(mib, this);
                        this.docsIetfQosPktClassInetSourceMask = new DocsIetfQosPktClassInetSourceMaskEnt(mib, this);
                        this.docsIetfQosPktClassInetDestAddr = new DocsIetfQosPktClassInetDestAddrEnt(mib, this);
                        this.docsIetfQosPktClassInetDestMask = new DocsIetfQosPktClassInetDestMaskEnt(mib, this);
                        this.docsIetfQosPktClassSourcePortStart = new DocsIetfQosPktClassSourcePortStartEnt(mib, this);
                        this.docsIetfQosPktClassSourcePortEnd = new DocsIetfQosPktClassSourcePortEndEnt(mib, this);
                        this.docsIetfQosPktClassDestPortStart = new DocsIetfQosPktClassDestPortStartEnt(mib, this);
                        this.docsIetfQosPktClassDestPortEnd = new DocsIetfQosPktClassDestPortEndEnt(mib, this);
                        this.docsIetfQosPktClassDestMacAddr = new DocsIetfQosPktClassDestMacAddrEnt(mib, this);
                        this.docsIetfQosPktClassDestMacMask = new DocsIetfQosPktClassDestMacMaskEnt(mib, this);
                        this.docsIetfQosPktClassSourceMacAddr = new DocsIetfQosPktClassSourceMacAddrEnt(mib, this);
                        this.docsIetfQosPktClassEnetProtocolType = new DocsIetfQosPktClassEnetProtocolTypeEnt(mib, this);
                        this.docsIetfQosPktClassEnetProtocol = new DocsIetfQosPktClassEnetProtocolEnt(mib, this);
                        this.docsIetfQosPktClassUserPriLow = new DocsIetfQosPktClassUserPriLowEnt(mib, this);
                        this.docsIetfQosPktClassUserPriHigh = new DocsIetfQosPktClassUserPriHighEnt(mib, this);
                        this.docsIetfQosPktClassVlanId = new DocsIetfQosPktClassVlanIdEnt(mib, this);
                        this.docsIetfQosPktClassStateActive = new DocsIetfQosPktClassStateActiveEnt(mib, this);
                        this.docsIetfQosPktClassPkts = new DocsIetfQosPktClassPktsEnt(mib, this);
                        this.docsIetfQosPktClassBitMap = new DocsIetfQosPktClassBitMapEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosPktClassId,
                            this.docsIetfQosPktClassDirection,
                            this.docsIetfQosPktClassPriority,
                            this.docsIetfQosPktClassIpTosLow,
                            this.docsIetfQosPktClassIpTosHigh,
                            this.docsIetfQosPktClassIpTosMask,
                            this.docsIetfQosPktClassIpProtocol,
                            this.docsIetfQosPktClassInetAddressType,
                            this.docsIetfQosPktClassInetSourceAddr,
                            this.docsIetfQosPktClassInetSourceMask,
                            this.docsIetfQosPktClassInetDestAddr,
                            this.docsIetfQosPktClassInetDestMask,
                            this.docsIetfQosPktClassSourcePortStart,
                            this.docsIetfQosPktClassSourcePortEnd,
                            this.docsIetfQosPktClassDestPortStart,
                            this.docsIetfQosPktClassDestPortEnd,
                            this.docsIetfQosPktClassDestMacAddr,
                            this.docsIetfQosPktClassDestMacMask,
                            this.docsIetfQosPktClassSourceMacAddr,
                            this.docsIetfQosPktClassEnetProtocolType,
                            this.docsIetfQosPktClassEnetProtocol,
                            this.docsIetfQosPktClassUserPriLow,
                            this.docsIetfQosPktClassUserPriHigh,
                            this.docsIetfQosPktClassVlanId,
                            this.docsIetfQosPktClassStateActive,
                            this.docsIetfQosPktClassPkts,
                            this.docsIetfQosPktClassBitMap
                        };
                    }
                    public static final class DocsIetfQosPktClassIdEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassIdEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassId", "1.3.6.1.2.1.127.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassDirectionEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassDirectionEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassDirection", "1.3.6.1.2.1.127.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassPriorityEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassPriorityEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassPriority", "1.3.6.1.2.1.127.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassIpTosLowEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassIpTosLowEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassIpTosLow", "1.3.6.1.2.1.127.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassIpTosHighEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassIpTosHighEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassIpTosHigh", "1.3.6.1.2.1.127.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassIpTosMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassIpTosMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassIpTosMask", "1.3.6.1.2.1.127.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassIpProtocolEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassIpProtocolEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassIpProtocol", "1.3.6.1.2.1.127.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassInetAddressTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassInetAddressTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassInetAddressType", "1.3.6.1.2.1.127.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassInetSourceAddrEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassInetSourceAddrEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassInetSourceAddr", "1.3.6.1.2.1.127.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassInetSourceMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassInetSourceMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassInetSourceMask", "1.3.6.1.2.1.127.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassInetDestAddrEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassInetDestAddrEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassInetDestAddr", "1.3.6.1.2.1.127.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassInetDestMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassInetDestMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassInetDestMask", "1.3.6.1.2.1.127.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassSourcePortStartEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassSourcePortStartEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassSourcePortStart", "1.3.6.1.2.1.127.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassSourcePortEndEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassSourcePortEndEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassSourcePortEnd", "1.3.6.1.2.1.127.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassDestPortStartEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassDestPortStartEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassDestPortStart", "1.3.6.1.2.1.127.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassDestPortEndEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassDestPortEndEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassDestPortEnd", "1.3.6.1.2.1.127.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassDestMacAddrEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassDestMacAddrEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassDestMacAddr", "1.3.6.1.2.1.127.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassDestMacMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassDestMacMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassDestMacMask", "1.3.6.1.2.1.127.1.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassSourceMacAddrEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassSourceMacAddrEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassSourceMacAddr", "1.3.6.1.2.1.127.1.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassEnetProtocolTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassEnetProtocolTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassEnetProtocolType", "1.3.6.1.2.1.127.1.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassEnetProtocolEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassEnetProtocolEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassEnetProtocol", "1.3.6.1.2.1.127.1.1.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassUserPriLowEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassUserPriLowEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassUserPriLow", "1.3.6.1.2.1.127.1.1.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassUserPriHighEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassUserPriHighEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassUserPriHigh", "1.3.6.1.2.1.127.1.1.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassVlanIdEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassVlanIdEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassVlanId", "1.3.6.1.2.1.127.1.1.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassStateActiveEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassStateActiveEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassStateActive", "1.3.6.1.2.1.127.1.1.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassPkts", "1.3.6.1.2.1.127.1.1.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPktClassBitMapEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPktClassBitMapEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPktClassBitMap", "1.3.6.1.2.1.127.1.1.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosParamSetTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosParamSetEntryEnt docsIetfQosParamSetEntry;

                private DocsIetfQosParamSetTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosParamSetTable", "1.3.6.1.2.1.127.1.2", false, true, false, false);
                    this.docsIetfQosParamSetEntry = new DocsIetfQosParamSetEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosParamSetEntry
                    };
                }
                public static final class DocsIetfQosParamSetEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosParamSetServiceClassNameEnt docsIetfQosParamSetServiceClassName;

                    public final DocsIetfQosParamSetPriorityEnt docsIetfQosParamSetPriority;

                    public final DocsIetfQosParamSetMaxTrafficRateEnt docsIetfQosParamSetMaxTrafficRate;

                    public final DocsIetfQosParamSetMaxTrafficBurstEnt docsIetfQosParamSetMaxTrafficBurst;

                    public final DocsIetfQosParamSetMinReservedRateEnt docsIetfQosParamSetMinReservedRate;

                    public final DocsIetfQosParamSetMinReservedPktEnt docsIetfQosParamSetMinReservedPkt;

                    public final DocsIetfQosParamSetActiveTimeoutEnt docsIetfQosParamSetActiveTimeout;

                    public final DocsIetfQosParamSetAdmittedTimeoutEnt docsIetfQosParamSetAdmittedTimeout;

                    public final DocsIetfQosParamSetMaxConcatBurstEnt docsIetfQosParamSetMaxConcatBurst;

                    public final DocsIetfQosParamSetSchedulingTypeEnt docsIetfQosParamSetSchedulingType;

                    public final DocsIetfQosParamSetNomPollIntervalEnt docsIetfQosParamSetNomPollInterval;

                    public final DocsIetfQosParamSetTolPollJitterEnt docsIetfQosParamSetTolPollJitter;

                    public final DocsIetfQosParamSetUnsolicitGrantSizeEnt docsIetfQosParamSetUnsolicitGrantSize;

                    public final DocsIetfQosParamSetNomGrantIntervalEnt docsIetfQosParamSetNomGrantInterval;

                    public final DocsIetfQosParamSetTolGrantJitterEnt docsIetfQosParamSetTolGrantJitter;

                    public final DocsIetfQosParamSetGrantsPerIntervalEnt docsIetfQosParamSetGrantsPerInterval;

                    public final DocsIetfQosParamSetTosAndMaskEnt docsIetfQosParamSetTosAndMask;

                    public final DocsIetfQosParamSetTosOrMaskEnt docsIetfQosParamSetTosOrMask;

                    public final DocsIetfQosParamSetMaxLatencyEnt docsIetfQosParamSetMaxLatency;

                    public final DocsIetfQosParamSetTypeEnt docsIetfQosParamSetType;

                    /** A 32-bit mask represented most significant byte
first.  The 32-bit integer represented in this
manner equals the binary value of the referenced
integer parameter of the DOCSIS RFI
specification.
The BITS syntax is not used in order to avoid
the confusion caused by different bit-numbering
conventions.*/
                    public final DocsIetfQosParamSetRequestPolicyOctEnt docsIetfQosParamSetRequestPolicyOct;

                    public final DocsIetfQosParamSetBitMapEnt docsIetfQosParamSetBitMap;

                    private DocsIetfQosParamSetEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosParamSetEntry", "1.3.6.1.2.1.127.1.2.1", false, false, false, true);
                        this.docsIetfQosParamSetServiceClassName = new DocsIetfQosParamSetServiceClassNameEnt(mib, this);
                        this.docsIetfQosParamSetPriority = new DocsIetfQosParamSetPriorityEnt(mib, this);
                        this.docsIetfQosParamSetMaxTrafficRate = new DocsIetfQosParamSetMaxTrafficRateEnt(mib, this);
                        this.docsIetfQosParamSetMaxTrafficBurst = new DocsIetfQosParamSetMaxTrafficBurstEnt(mib, this);
                        this.docsIetfQosParamSetMinReservedRate = new DocsIetfQosParamSetMinReservedRateEnt(mib, this);
                        this.docsIetfQosParamSetMinReservedPkt = new DocsIetfQosParamSetMinReservedPktEnt(mib, this);
                        this.docsIetfQosParamSetActiveTimeout = new DocsIetfQosParamSetActiveTimeoutEnt(mib, this);
                        this.docsIetfQosParamSetAdmittedTimeout = new DocsIetfQosParamSetAdmittedTimeoutEnt(mib, this);
                        this.docsIetfQosParamSetMaxConcatBurst = new DocsIetfQosParamSetMaxConcatBurstEnt(mib, this);
                        this.docsIetfQosParamSetSchedulingType = new DocsIetfQosParamSetSchedulingTypeEnt(mib, this);
                        this.docsIetfQosParamSetNomPollInterval = new DocsIetfQosParamSetNomPollIntervalEnt(mib, this);
                        this.docsIetfQosParamSetTolPollJitter = new DocsIetfQosParamSetTolPollJitterEnt(mib, this);
                        this.docsIetfQosParamSetUnsolicitGrantSize = new DocsIetfQosParamSetUnsolicitGrantSizeEnt(mib, this);
                        this.docsIetfQosParamSetNomGrantInterval = new DocsIetfQosParamSetNomGrantIntervalEnt(mib, this);
                        this.docsIetfQosParamSetTolGrantJitter = new DocsIetfQosParamSetTolGrantJitterEnt(mib, this);
                        this.docsIetfQosParamSetGrantsPerInterval = new DocsIetfQosParamSetGrantsPerIntervalEnt(mib, this);
                        this.docsIetfQosParamSetTosAndMask = new DocsIetfQosParamSetTosAndMaskEnt(mib, this);
                        this.docsIetfQosParamSetTosOrMask = new DocsIetfQosParamSetTosOrMaskEnt(mib, this);
                        this.docsIetfQosParamSetMaxLatency = new DocsIetfQosParamSetMaxLatencyEnt(mib, this);
                        this.docsIetfQosParamSetType = new DocsIetfQosParamSetTypeEnt(mib, this);
                        this.docsIetfQosParamSetRequestPolicyOct = new DocsIetfQosParamSetRequestPolicyOctEnt(mib, this);
                        this.docsIetfQosParamSetBitMap = new DocsIetfQosParamSetBitMapEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosParamSetServiceClassName,
                            this.docsIetfQosParamSetPriority,
                            this.docsIetfQosParamSetMaxTrafficRate,
                            this.docsIetfQosParamSetMaxTrafficBurst,
                            this.docsIetfQosParamSetMinReservedRate,
                            this.docsIetfQosParamSetMinReservedPkt,
                            this.docsIetfQosParamSetActiveTimeout,
                            this.docsIetfQosParamSetAdmittedTimeout,
                            this.docsIetfQosParamSetMaxConcatBurst,
                            this.docsIetfQosParamSetSchedulingType,
                            this.docsIetfQosParamSetNomPollInterval,
                            this.docsIetfQosParamSetTolPollJitter,
                            this.docsIetfQosParamSetUnsolicitGrantSize,
                            this.docsIetfQosParamSetNomGrantInterval,
                            this.docsIetfQosParamSetTolGrantJitter,
                            this.docsIetfQosParamSetGrantsPerInterval,
                            this.docsIetfQosParamSetTosAndMask,
                            this.docsIetfQosParamSetTosOrMask,
                            this.docsIetfQosParamSetMaxLatency,
                            this.docsIetfQosParamSetType,
                            this.docsIetfQosParamSetRequestPolicyOct,
                            this.docsIetfQosParamSetBitMap
                        };
                    }
                    public static final class DocsIetfQosParamSetServiceClassNameEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetServiceClassNameEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetServiceClassName", "1.3.6.1.2.1.127.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetPriorityEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetPriorityEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetPriority", "1.3.6.1.2.1.127.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetMaxTrafficRateEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetMaxTrafficRateEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetMaxTrafficRate", "1.3.6.1.2.1.127.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetMaxTrafficBurstEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetMaxTrafficBurstEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetMaxTrafficBurst", "1.3.6.1.2.1.127.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetMinReservedRateEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetMinReservedRateEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetMinReservedRate", "1.3.6.1.2.1.127.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetMinReservedPktEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetMinReservedPktEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetMinReservedPkt", "1.3.6.1.2.1.127.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetActiveTimeoutEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetActiveTimeoutEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetActiveTimeout", "1.3.6.1.2.1.127.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetAdmittedTimeoutEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetAdmittedTimeoutEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetAdmittedTimeout", "1.3.6.1.2.1.127.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetMaxConcatBurstEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetMaxConcatBurstEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetMaxConcatBurst", "1.3.6.1.2.1.127.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetSchedulingTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetSchedulingTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetSchedulingType", "1.3.6.1.2.1.127.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetNomPollIntervalEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetNomPollIntervalEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetNomPollInterval", "1.3.6.1.2.1.127.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetTolPollJitterEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetTolPollJitterEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetTolPollJitter", "1.3.6.1.2.1.127.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetUnsolicitGrantSizeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetUnsolicitGrantSizeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetUnsolicitGrantSize", "1.3.6.1.2.1.127.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetNomGrantIntervalEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetNomGrantIntervalEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetNomGrantInterval", "1.3.6.1.2.1.127.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetTolGrantJitterEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetTolGrantJitterEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetTolGrantJitter", "1.3.6.1.2.1.127.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetGrantsPerIntervalEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetGrantsPerIntervalEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetGrantsPerInterval", "1.3.6.1.2.1.127.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetTosAndMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetTosAndMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetTosAndMask", "1.3.6.1.2.1.127.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetTosOrMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetTosOrMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetTosOrMask", "1.3.6.1.2.1.127.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetMaxLatencyEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetMaxLatencyEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetMaxLatency", "1.3.6.1.2.1.127.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetType", "1.3.6.1.2.1.127.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetRequestPolicyOctEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetRequestPolicyOctEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetRequestPolicyOct", "1.3.6.1.2.1.127.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosParamSetBitMapEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosParamSetBitMapEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosParamSetBitMap", "1.3.6.1.2.1.127.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosServiceFlowTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosServiceFlowEntryEnt docsIetfQosServiceFlowEntry;

                private DocsIetfQosServiceFlowTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosServiceFlowTable", "1.3.6.1.2.1.127.1.3", false, true, false, false);
                    this.docsIetfQosServiceFlowEntry = new DocsIetfQosServiceFlowEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosServiceFlowEntry
                    };
                }
                public static final class DocsIetfQosServiceFlowEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosServiceFlowIdEnt docsIetfQosServiceFlowId;

                    public final DocsIetfQosServiceFlowSIDEnt docsIetfQosServiceFlowSID;

                    public final DocsIetfQosServiceFlowDirectionEnt docsIetfQosServiceFlowDirection;

                    public final DocsIetfQosServiceFlowPrimaryEnt docsIetfQosServiceFlowPrimary;

                    private DocsIetfQosServiceFlowEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosServiceFlowEntry", "1.3.6.1.2.1.127.1.3.1", false, false, false, true);
                        this.docsIetfQosServiceFlowId = new DocsIetfQosServiceFlowIdEnt(mib, this);
                        this.docsIetfQosServiceFlowSID = new DocsIetfQosServiceFlowSIDEnt(mib, this);
                        this.docsIetfQosServiceFlowDirection = new DocsIetfQosServiceFlowDirectionEnt(mib, this);
                        this.docsIetfQosServiceFlowPrimary = new DocsIetfQosServiceFlowPrimaryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosServiceFlowId,
                            this.docsIetfQosServiceFlowSID,
                            this.docsIetfQosServiceFlowDirection,
                            this.docsIetfQosServiceFlowPrimary
                        };
                    }
                    public static final class DocsIetfQosServiceFlowIdEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowIdEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowId", "1.3.6.1.2.1.127.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowSIDEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowSIDEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowSID", "1.3.6.1.2.1.127.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowDirectionEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowDirectionEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowDirection", "1.3.6.1.2.1.127.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowPrimaryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowPrimaryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowPrimary", "1.3.6.1.2.1.127.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosServiceFlowStatsTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosServiceFlowStatsEntryEnt docsIetfQosServiceFlowStatsEntry;

                private DocsIetfQosServiceFlowStatsTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosServiceFlowStatsTable", "1.3.6.1.2.1.127.1.4", false, true, false, false);
                    this.docsIetfQosServiceFlowStatsEntry = new DocsIetfQosServiceFlowStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosServiceFlowStatsEntry
                    };
                }
                public static final class DocsIetfQosServiceFlowStatsEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosServiceFlowPktsEnt docsIetfQosServiceFlowPkts;

                    public final DocsIetfQosServiceFlowOctetsEnt docsIetfQosServiceFlowOctets;

                    public final DocsIetfQosServiceFlowTimeCreatedEnt docsIetfQosServiceFlowTimeCreated;

                    public final DocsIetfQosServiceFlowTimeActiveEnt docsIetfQosServiceFlowTimeActive;

                    public final DocsIetfQosServiceFlowPHSUnknownsEnt docsIetfQosServiceFlowPHSUnknowns;

                    public final DocsIetfQosServiceFlowPolicedDropPktsEnt docsIetfQosServiceFlowPolicedDropPkts;

                    public final DocsIetfQosServiceFlowPolicedDelayPktsEnt docsIetfQosServiceFlowPolicedDelayPkts;

                    private DocsIetfQosServiceFlowStatsEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosServiceFlowStatsEntry", "1.3.6.1.2.1.127.1.4.1", false, false, false, true);
                        this.docsIetfQosServiceFlowPkts = new DocsIetfQosServiceFlowPktsEnt(mib, this);
                        this.docsIetfQosServiceFlowOctets = new DocsIetfQosServiceFlowOctetsEnt(mib, this);
                        this.docsIetfQosServiceFlowTimeCreated = new DocsIetfQosServiceFlowTimeCreatedEnt(mib, this);
                        this.docsIetfQosServiceFlowTimeActive = new DocsIetfQosServiceFlowTimeActiveEnt(mib, this);
                        this.docsIetfQosServiceFlowPHSUnknowns = new DocsIetfQosServiceFlowPHSUnknownsEnt(mib, this);
                        this.docsIetfQosServiceFlowPolicedDropPkts = new DocsIetfQosServiceFlowPolicedDropPktsEnt(mib, this);
                        this.docsIetfQosServiceFlowPolicedDelayPkts = new DocsIetfQosServiceFlowPolicedDelayPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosServiceFlowPkts,
                            this.docsIetfQosServiceFlowOctets,
                            this.docsIetfQosServiceFlowTimeCreated,
                            this.docsIetfQosServiceFlowTimeActive,
                            this.docsIetfQosServiceFlowPHSUnknowns,
                            this.docsIetfQosServiceFlowPolicedDropPkts,
                            this.docsIetfQosServiceFlowPolicedDelayPkts
                        };
                    }
                    public static final class DocsIetfQosServiceFlowPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowPkts", "1.3.6.1.2.1.127.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowOctetsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowOctetsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowOctets", "1.3.6.1.2.1.127.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowTimeCreatedEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowTimeCreatedEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowTimeCreated", "1.3.6.1.2.1.127.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowTimeActiveEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowTimeActiveEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowTimeActive", "1.3.6.1.2.1.127.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowPHSUnknownsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowPHSUnknownsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowPHSUnknowns", "1.3.6.1.2.1.127.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowPolicedDropPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowPolicedDropPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowPolicedDropPkts", "1.3.6.1.2.1.127.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowPolicedDelayPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowPolicedDelayPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowPolicedDelayPkts", "1.3.6.1.2.1.127.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosUpstreamStatsTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosUpstreamStatsEntryEnt docsIetfQosUpstreamStatsEntry;

                private DocsIetfQosUpstreamStatsTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosUpstreamStatsTable", "1.3.6.1.2.1.127.1.5", false, true, false, false);
                    this.docsIetfQosUpstreamStatsEntry = new DocsIetfQosUpstreamStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosUpstreamStatsEntry
                    };
                }
                public static final class DocsIetfQosUpstreamStatsEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosSIDEnt docsIetfQosSID;

                    public final DocsIetfQosUpstreamFragmentsEnt docsIetfQosUpstreamFragments;

                    public final DocsIetfQosUpstreamFragDiscardsEnt docsIetfQosUpstreamFragDiscards;

                    public final DocsIetfQosUpstreamConcatBurstsEnt docsIetfQosUpstreamConcatBursts;

                    private DocsIetfQosUpstreamStatsEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosUpstreamStatsEntry", "1.3.6.1.2.1.127.1.5.1", false, false, false, true);
                        this.docsIetfQosSID = new DocsIetfQosSIDEnt(mib, this);
                        this.docsIetfQosUpstreamFragments = new DocsIetfQosUpstreamFragmentsEnt(mib, this);
                        this.docsIetfQosUpstreamFragDiscards = new DocsIetfQosUpstreamFragDiscardsEnt(mib, this);
                        this.docsIetfQosUpstreamConcatBursts = new DocsIetfQosUpstreamConcatBurstsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosSID,
                            this.docsIetfQosUpstreamFragments,
                            this.docsIetfQosUpstreamFragDiscards,
                            this.docsIetfQosUpstreamConcatBursts
                        };
                    }
                    public static final class DocsIetfQosSIDEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosSIDEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosSID", "1.3.6.1.2.1.127.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosUpstreamFragmentsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosUpstreamFragmentsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosUpstreamFragments", "1.3.6.1.2.1.127.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosUpstreamFragDiscardsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosUpstreamFragDiscardsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosUpstreamFragDiscards", "1.3.6.1.2.1.127.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosUpstreamConcatBurstsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosUpstreamConcatBurstsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosUpstreamConcatBursts", "1.3.6.1.2.1.127.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosDynamicServiceStatsTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosDynamicServiceStatsEntryEnt docsIetfQosDynamicServiceStatsEntry;

                private DocsIetfQosDynamicServiceStatsTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosDynamicServiceStatsTable", "1.3.6.1.2.1.127.1.6", false, true, false, false);
                    this.docsIetfQosDynamicServiceStatsEntry = new DocsIetfQosDynamicServiceStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosDynamicServiceStatsEntry
                    };
                }
                public static final class DocsIetfQosDynamicServiceStatsEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosIfDirectionEnt docsIetfQosIfDirection;

                    public final DocsIetfQosDSAReqsEnt docsIetfQosDSAReqs;

                    public final DocsIetfQosDSARspsEnt docsIetfQosDSARsps;

                    public final DocsIetfQosDSAAcksEnt docsIetfQosDSAAcks;

                    public final DocsIetfQosDSCReqsEnt docsIetfQosDSCReqs;

                    public final DocsIetfQosDSCRspsEnt docsIetfQosDSCRsps;

                    public final DocsIetfQosDSCAcksEnt docsIetfQosDSCAcks;

                    public final DocsIetfQosDSDReqsEnt docsIetfQosDSDReqs;

                    public final DocsIetfQosDSDRspsEnt docsIetfQosDSDRsps;

                    public final DocsIetfQosDynamicAddsEnt docsIetfQosDynamicAdds;

                    public final DocsIetfQosDynamicAddFailsEnt docsIetfQosDynamicAddFails;

                    public final DocsIetfQosDynamicChangesEnt docsIetfQosDynamicChanges;

                    public final DocsIetfQosDynamicChangeFailsEnt docsIetfQosDynamicChangeFails;

                    public final DocsIetfQosDynamicDeletesEnt docsIetfQosDynamicDeletes;

                    public final DocsIetfQosDynamicDeleteFailsEnt docsIetfQosDynamicDeleteFails;

                    public final DocsIetfQosDCCReqsEnt docsIetfQosDCCReqs;

                    public final DocsIetfQosDCCRspsEnt docsIetfQosDCCRsps;

                    public final DocsIetfQosDCCAcksEnt docsIetfQosDCCAcks;

                    public final DocsIetfQosDCCsEnt docsIetfQosDCCs;

                    public final DocsIetfQosDCCFailsEnt docsIetfQosDCCFails;

                    private DocsIetfQosDynamicServiceStatsEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosDynamicServiceStatsEntry", "1.3.6.1.2.1.127.1.6.1", false, false, false, true);
                        this.docsIetfQosIfDirection = new DocsIetfQosIfDirectionEnt(mib, this);
                        this.docsIetfQosDSAReqs = new DocsIetfQosDSAReqsEnt(mib, this);
                        this.docsIetfQosDSARsps = new DocsIetfQosDSARspsEnt(mib, this);
                        this.docsIetfQosDSAAcks = new DocsIetfQosDSAAcksEnt(mib, this);
                        this.docsIetfQosDSCReqs = new DocsIetfQosDSCReqsEnt(mib, this);
                        this.docsIetfQosDSCRsps = new DocsIetfQosDSCRspsEnt(mib, this);
                        this.docsIetfQosDSCAcks = new DocsIetfQosDSCAcksEnt(mib, this);
                        this.docsIetfQosDSDReqs = new DocsIetfQosDSDReqsEnt(mib, this);
                        this.docsIetfQosDSDRsps = new DocsIetfQosDSDRspsEnt(mib, this);
                        this.docsIetfQosDynamicAdds = new DocsIetfQosDynamicAddsEnt(mib, this);
                        this.docsIetfQosDynamicAddFails = new DocsIetfQosDynamicAddFailsEnt(mib, this);
                        this.docsIetfQosDynamicChanges = new DocsIetfQosDynamicChangesEnt(mib, this);
                        this.docsIetfQosDynamicChangeFails = new DocsIetfQosDynamicChangeFailsEnt(mib, this);
                        this.docsIetfQosDynamicDeletes = new DocsIetfQosDynamicDeletesEnt(mib, this);
                        this.docsIetfQosDynamicDeleteFails = new DocsIetfQosDynamicDeleteFailsEnt(mib, this);
                        this.docsIetfQosDCCReqs = new DocsIetfQosDCCReqsEnt(mib, this);
                        this.docsIetfQosDCCRsps = new DocsIetfQosDCCRspsEnt(mib, this);
                        this.docsIetfQosDCCAcks = new DocsIetfQosDCCAcksEnt(mib, this);
                        this.docsIetfQosDCCs = new DocsIetfQosDCCsEnt(mib, this);
                        this.docsIetfQosDCCFails = new DocsIetfQosDCCFailsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosIfDirection,
                            this.docsIetfQosDSAReqs,
                            this.docsIetfQosDSARsps,
                            this.docsIetfQosDSAAcks,
                            this.docsIetfQosDSCReqs,
                            this.docsIetfQosDSCRsps,
                            this.docsIetfQosDSCAcks,
                            this.docsIetfQosDSDReqs,
                            this.docsIetfQosDSDRsps,
                            this.docsIetfQosDynamicAdds,
                            this.docsIetfQosDynamicAddFails,
                            this.docsIetfQosDynamicChanges,
                            this.docsIetfQosDynamicChangeFails,
                            this.docsIetfQosDynamicDeletes,
                            this.docsIetfQosDynamicDeleteFails,
                            this.docsIetfQosDCCReqs,
                            this.docsIetfQosDCCRsps,
                            this.docsIetfQosDCCAcks,
                            this.docsIetfQosDCCs,
                            this.docsIetfQosDCCFails
                        };
                    }
                    public static final class DocsIetfQosIfDirectionEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosIfDirectionEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosIfDirection", "1.3.6.1.2.1.127.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSAReqsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSAReqsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSAReqs", "1.3.6.1.2.1.127.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSARspsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSARspsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSARsps", "1.3.6.1.2.1.127.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSAAcksEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSAAcksEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSAAcks", "1.3.6.1.2.1.127.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSCReqsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSCReqsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSCReqs", "1.3.6.1.2.1.127.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSCRspsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSCRspsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSCRsps", "1.3.6.1.2.1.127.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSCAcksEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSCAcksEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSCAcks", "1.3.6.1.2.1.127.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSDReqsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSDReqsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSDReqs", "1.3.6.1.2.1.127.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDSDRspsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDSDRspsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDSDRsps", "1.3.6.1.2.1.127.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDynamicAddsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDynamicAddsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDynamicAdds", "1.3.6.1.2.1.127.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDynamicAddFailsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDynamicAddFailsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDynamicAddFails", "1.3.6.1.2.1.127.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDynamicChangesEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDynamicChangesEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDynamicChanges", "1.3.6.1.2.1.127.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDynamicChangeFailsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDynamicChangeFailsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDynamicChangeFails", "1.3.6.1.2.1.127.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDynamicDeletesEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDynamicDeletesEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDynamicDeletes", "1.3.6.1.2.1.127.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDynamicDeleteFailsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDynamicDeleteFailsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDynamicDeleteFails", "1.3.6.1.2.1.127.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDCCReqsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDCCReqsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDCCReqs", "1.3.6.1.2.1.127.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDCCRspsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDCCRspsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDCCRsps", "1.3.6.1.2.1.127.1.6.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDCCAcksEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDCCAcksEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDCCAcks", "1.3.6.1.2.1.127.1.6.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDCCsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDCCsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDCCs", "1.3.6.1.2.1.127.1.6.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosDCCFailsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosDCCFailsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosDCCFails", "1.3.6.1.2.1.127.1.6.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosServiceFlowLogTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosServiceFlowLogEntryEnt docsIetfQosServiceFlowLogEntry;

                private DocsIetfQosServiceFlowLogTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosServiceFlowLogTable", "1.3.6.1.2.1.127.1.7", false, true, false, false);
                    this.docsIetfQosServiceFlowLogEntry = new DocsIetfQosServiceFlowLogEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosServiceFlowLogEntry
                    };
                }
                public static final class DocsIetfQosServiceFlowLogEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosServiceFlowLogIndexEnt docsIetfQosServiceFlowLogIndex;

                    public final DocsIetfQosServiceFlowLogIfIndexEnt docsIetfQosServiceFlowLogIfIndex;

                    public final DocsIetfQosServiceFlowLogSFIDEnt docsIetfQosServiceFlowLogSFID;

                    public final DocsIetfQosServiceFlowLogCmMacEnt docsIetfQosServiceFlowLogCmMac;

                    public final DocsIetfQosServiceFlowLogPktsEnt docsIetfQosServiceFlowLogPkts;

                    public final DocsIetfQosServiceFlowLogOctetsEnt docsIetfQosServiceFlowLogOctets;

                    public final DocsIetfQosServiceFlowLogTimeDeletedEnt docsIetfQosServiceFlowLogTimeDeleted;

                    public final DocsIetfQosServiceFlowLogTimeCreatedEnt docsIetfQosServiceFlowLogTimeCreated;

                    public final DocsIetfQosServiceFlowLogTimeActiveEnt docsIetfQosServiceFlowLogTimeActive;

                    public final DocsIetfQosServiceFlowLogDirectionEnt docsIetfQosServiceFlowLogDirection;

                    public final DocsIetfQosServiceFlowLogPrimaryEnt docsIetfQosServiceFlowLogPrimary;

                    public final DocsIetfQosServiceFlowLogServiceClassNameEnt docsIetfQosServiceFlowLogServiceClassName;

                    public final DocsIetfQosServiceFlowLogPolicedDropPktsEnt docsIetfQosServiceFlowLogPolicedDropPkts;

                    public final DocsIetfQosServiceFlowLogPolicedDelayPktsEnt docsIetfQosServiceFlowLogPolicedDelayPkts;

                    public final DocsIetfQosServiceFlowLogControlEnt docsIetfQosServiceFlowLogControl;

                    private DocsIetfQosServiceFlowLogEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosServiceFlowLogEntry", "1.3.6.1.2.1.127.1.7.1", false, false, false, true);
                        this.docsIetfQosServiceFlowLogIndex = new DocsIetfQosServiceFlowLogIndexEnt(mib, this);
                        this.docsIetfQosServiceFlowLogIfIndex = new DocsIetfQosServiceFlowLogIfIndexEnt(mib, this);
                        this.docsIetfQosServiceFlowLogSFID = new DocsIetfQosServiceFlowLogSFIDEnt(mib, this);
                        this.docsIetfQosServiceFlowLogCmMac = new DocsIetfQosServiceFlowLogCmMacEnt(mib, this);
                        this.docsIetfQosServiceFlowLogPkts = new DocsIetfQosServiceFlowLogPktsEnt(mib, this);
                        this.docsIetfQosServiceFlowLogOctets = new DocsIetfQosServiceFlowLogOctetsEnt(mib, this);
                        this.docsIetfQosServiceFlowLogTimeDeleted = new DocsIetfQosServiceFlowLogTimeDeletedEnt(mib, this);
                        this.docsIetfQosServiceFlowLogTimeCreated = new DocsIetfQosServiceFlowLogTimeCreatedEnt(mib, this);
                        this.docsIetfQosServiceFlowLogTimeActive = new DocsIetfQosServiceFlowLogTimeActiveEnt(mib, this);
                        this.docsIetfQosServiceFlowLogDirection = new DocsIetfQosServiceFlowLogDirectionEnt(mib, this);
                        this.docsIetfQosServiceFlowLogPrimary = new DocsIetfQosServiceFlowLogPrimaryEnt(mib, this);
                        this.docsIetfQosServiceFlowLogServiceClassName = new DocsIetfQosServiceFlowLogServiceClassNameEnt(mib, this);
                        this.docsIetfQosServiceFlowLogPolicedDropPkts = new DocsIetfQosServiceFlowLogPolicedDropPktsEnt(mib, this);
                        this.docsIetfQosServiceFlowLogPolicedDelayPkts = new DocsIetfQosServiceFlowLogPolicedDelayPktsEnt(mib, this);
                        this.docsIetfQosServiceFlowLogControl = new DocsIetfQosServiceFlowLogControlEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosServiceFlowLogIndex,
                            this.docsIetfQosServiceFlowLogIfIndex,
                            this.docsIetfQosServiceFlowLogSFID,
                            this.docsIetfQosServiceFlowLogCmMac,
                            this.docsIetfQosServiceFlowLogPkts,
                            this.docsIetfQosServiceFlowLogOctets,
                            this.docsIetfQosServiceFlowLogTimeDeleted,
                            this.docsIetfQosServiceFlowLogTimeCreated,
                            this.docsIetfQosServiceFlowLogTimeActive,
                            this.docsIetfQosServiceFlowLogDirection,
                            this.docsIetfQosServiceFlowLogPrimary,
                            this.docsIetfQosServiceFlowLogServiceClassName,
                            this.docsIetfQosServiceFlowLogPolicedDropPkts,
                            this.docsIetfQosServiceFlowLogPolicedDelayPkts,
                            this.docsIetfQosServiceFlowLogControl
                        };
                    }
                    public static final class DocsIetfQosServiceFlowLogIndexEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogIndexEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogIndex", "1.3.6.1.2.1.127.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogIfIndexEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogIfIndexEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogIfIndex", "1.3.6.1.2.1.127.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogSFIDEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogSFIDEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogSFID", "1.3.6.1.2.1.127.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogCmMacEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogCmMacEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogCmMac", "1.3.6.1.2.1.127.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogPkts", "1.3.6.1.2.1.127.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogOctetsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogOctetsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogOctets", "1.3.6.1.2.1.127.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogTimeDeletedEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogTimeDeletedEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogTimeDeleted", "1.3.6.1.2.1.127.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogTimeCreatedEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogTimeCreatedEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogTimeCreated", "1.3.6.1.2.1.127.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogTimeActiveEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogTimeActiveEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogTimeActive", "1.3.6.1.2.1.127.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogDirectionEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogDirectionEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogDirection", "1.3.6.1.2.1.127.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogPrimaryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogPrimaryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogPrimary", "1.3.6.1.2.1.127.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogServiceClassNameEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogServiceClassNameEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogServiceClassName", "1.3.6.1.2.1.127.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogPolicedDropPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogPolicedDropPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogPolicedDropPkts", "1.3.6.1.2.1.127.1.7.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogPolicedDelayPktsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogPolicedDelayPktsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogPolicedDelayPkts", "1.3.6.1.2.1.127.1.7.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceFlowLogControlEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceFlowLogControlEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceFlowLogControl", "1.3.6.1.2.1.127.1.7.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosServiceClassTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosServiceClassEntryEnt docsIetfQosServiceClassEntry;

                private DocsIetfQosServiceClassTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosServiceClassTable", "1.3.6.1.2.1.127.1.8", false, true, false, false);
                    this.docsIetfQosServiceClassEntry = new DocsIetfQosServiceClassEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosServiceClassEntry
                    };
                }
                public static final class DocsIetfQosServiceClassEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosServiceClassNameEnt docsIetfQosServiceClassName;

                    public final DocsIetfQosServiceClassStatusEnt docsIetfQosServiceClassStatus;

                    public final DocsIetfQosServiceClassPriorityEnt docsIetfQosServiceClassPriority;

                    public final DocsIetfQosServiceClassMaxTrafficRateEnt docsIetfQosServiceClassMaxTrafficRate;

                    public final DocsIetfQosServiceClassMaxTrafficBurstEnt docsIetfQosServiceClassMaxTrafficBurst;

                    public final DocsIetfQosServiceClassMinReservedRateEnt docsIetfQosServiceClassMinReservedRate;

                    public final DocsIetfQosServiceClassMinReservedPktEnt docsIetfQosServiceClassMinReservedPkt;

                    public final DocsIetfQosServiceClassMaxConcatBurstEnt docsIetfQosServiceClassMaxConcatBurst;

                    public final DocsIetfQosServiceClassNomPollIntervalEnt docsIetfQosServiceClassNomPollInterval;

                    public final DocsIetfQosServiceClassTolPollJitterEnt docsIetfQosServiceClassTolPollJitter;

                    public final DocsIetfQosServiceClassUnsolicitGrantSizeEnt docsIetfQosServiceClassUnsolicitGrantSize;

                    public final DocsIetfQosServiceClassNomGrantIntervalEnt docsIetfQosServiceClassNomGrantInterval;

                    public final DocsIetfQosServiceClassTolGrantJitterEnt docsIetfQosServiceClassTolGrantJitter;

                    public final DocsIetfQosServiceClassGrantsPerIntervalEnt docsIetfQosServiceClassGrantsPerInterval;

                    public final DocsIetfQosServiceClassMaxLatencyEnt docsIetfQosServiceClassMaxLatency;

                    public final DocsIetfQosServiceClassActiveTimeoutEnt docsIetfQosServiceClassActiveTimeout;

                    public final DocsIetfQosServiceClassAdmittedTimeoutEnt docsIetfQosServiceClassAdmittedTimeout;

                    public final DocsIetfQosServiceClassSchedulingTypeEnt docsIetfQosServiceClassSchedulingType;

                    /** no bits are set*/
                    public final DocsIetfQosServiceClassRequestPolicyEnt docsIetfQosServiceClassRequestPolicy;

                    public final DocsIetfQosServiceClassTosAndMaskEnt docsIetfQosServiceClassTosAndMask;

                    public final DocsIetfQosServiceClassTosOrMaskEnt docsIetfQosServiceClassTosOrMask;

                    public final DocsIetfQosServiceClassDirectionEnt docsIetfQosServiceClassDirection;

                    public final DocsIetfQosServiceClassStorageTypeEnt docsIetfQosServiceClassStorageType;

                    public final DocsIetfQosServiceClassDSCPOverwriteEnt docsIetfQosServiceClassDSCPOverwrite;

                    private DocsIetfQosServiceClassEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosServiceClassEntry", "1.3.6.1.2.1.127.1.8.1", false, false, false, true);
                        this.docsIetfQosServiceClassName = new DocsIetfQosServiceClassNameEnt(mib, this);
                        this.docsIetfQosServiceClassStatus = new DocsIetfQosServiceClassStatusEnt(mib, this);
                        this.docsIetfQosServiceClassPriority = new DocsIetfQosServiceClassPriorityEnt(mib, this);
                        this.docsIetfQosServiceClassMaxTrafficRate = new DocsIetfQosServiceClassMaxTrafficRateEnt(mib, this);
                        this.docsIetfQosServiceClassMaxTrafficBurst = new DocsIetfQosServiceClassMaxTrafficBurstEnt(mib, this);
                        this.docsIetfQosServiceClassMinReservedRate = new DocsIetfQosServiceClassMinReservedRateEnt(mib, this);
                        this.docsIetfQosServiceClassMinReservedPkt = new DocsIetfQosServiceClassMinReservedPktEnt(mib, this);
                        this.docsIetfQosServiceClassMaxConcatBurst = new DocsIetfQosServiceClassMaxConcatBurstEnt(mib, this);
                        this.docsIetfQosServiceClassNomPollInterval = new DocsIetfQosServiceClassNomPollIntervalEnt(mib, this);
                        this.docsIetfQosServiceClassTolPollJitter = new DocsIetfQosServiceClassTolPollJitterEnt(mib, this);
                        this.docsIetfQosServiceClassUnsolicitGrantSize = new DocsIetfQosServiceClassUnsolicitGrantSizeEnt(mib, this);
                        this.docsIetfQosServiceClassNomGrantInterval = new DocsIetfQosServiceClassNomGrantIntervalEnt(mib, this);
                        this.docsIetfQosServiceClassTolGrantJitter = new DocsIetfQosServiceClassTolGrantJitterEnt(mib, this);
                        this.docsIetfQosServiceClassGrantsPerInterval = new DocsIetfQosServiceClassGrantsPerIntervalEnt(mib, this);
                        this.docsIetfQosServiceClassMaxLatency = new DocsIetfQosServiceClassMaxLatencyEnt(mib, this);
                        this.docsIetfQosServiceClassActiveTimeout = new DocsIetfQosServiceClassActiveTimeoutEnt(mib, this);
                        this.docsIetfQosServiceClassAdmittedTimeout = new DocsIetfQosServiceClassAdmittedTimeoutEnt(mib, this);
                        this.docsIetfQosServiceClassSchedulingType = new DocsIetfQosServiceClassSchedulingTypeEnt(mib, this);
                        this.docsIetfQosServiceClassRequestPolicy = new DocsIetfQosServiceClassRequestPolicyEnt(mib, this);
                        this.docsIetfQosServiceClassTosAndMask = new DocsIetfQosServiceClassTosAndMaskEnt(mib, this);
                        this.docsIetfQosServiceClassTosOrMask = new DocsIetfQosServiceClassTosOrMaskEnt(mib, this);
                        this.docsIetfQosServiceClassDirection = new DocsIetfQosServiceClassDirectionEnt(mib, this);
                        this.docsIetfQosServiceClassStorageType = new DocsIetfQosServiceClassStorageTypeEnt(mib, this);
                        this.docsIetfQosServiceClassDSCPOverwrite = new DocsIetfQosServiceClassDSCPOverwriteEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosServiceClassName,
                            this.docsIetfQosServiceClassStatus,
                            this.docsIetfQosServiceClassPriority,
                            this.docsIetfQosServiceClassMaxTrafficRate,
                            this.docsIetfQosServiceClassMaxTrafficBurst,
                            this.docsIetfQosServiceClassMinReservedRate,
                            this.docsIetfQosServiceClassMinReservedPkt,
                            this.docsIetfQosServiceClassMaxConcatBurst,
                            this.docsIetfQosServiceClassNomPollInterval,
                            this.docsIetfQosServiceClassTolPollJitter,
                            this.docsIetfQosServiceClassUnsolicitGrantSize,
                            this.docsIetfQosServiceClassNomGrantInterval,
                            this.docsIetfQosServiceClassTolGrantJitter,
                            this.docsIetfQosServiceClassGrantsPerInterval,
                            this.docsIetfQosServiceClassMaxLatency,
                            this.docsIetfQosServiceClassActiveTimeout,
                            this.docsIetfQosServiceClassAdmittedTimeout,
                            this.docsIetfQosServiceClassSchedulingType,
                            this.docsIetfQosServiceClassRequestPolicy,
                            this.docsIetfQosServiceClassTosAndMask,
                            this.docsIetfQosServiceClassTosOrMask,
                            this.docsIetfQosServiceClassDirection,
                            this.docsIetfQosServiceClassStorageType,
                            this.docsIetfQosServiceClassDSCPOverwrite
                        };
                    }
                    public static final class DocsIetfQosServiceClassNameEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassNameEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassName", "1.3.6.1.2.1.127.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassStatusEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassStatusEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassStatus", "1.3.6.1.2.1.127.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassPriorityEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassPriorityEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassPriority", "1.3.6.1.2.1.127.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassMaxTrafficRateEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassMaxTrafficRateEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassMaxTrafficRate", "1.3.6.1.2.1.127.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassMaxTrafficBurstEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassMaxTrafficBurstEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassMaxTrafficBurst", "1.3.6.1.2.1.127.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassMinReservedRateEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassMinReservedRateEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassMinReservedRate", "1.3.6.1.2.1.127.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassMinReservedPktEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassMinReservedPktEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassMinReservedPkt", "1.3.6.1.2.1.127.1.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassMaxConcatBurstEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassMaxConcatBurstEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassMaxConcatBurst", "1.3.6.1.2.1.127.1.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassNomPollIntervalEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassNomPollIntervalEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassNomPollInterval", "1.3.6.1.2.1.127.1.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassTolPollJitterEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassTolPollJitterEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassTolPollJitter", "1.3.6.1.2.1.127.1.8.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassUnsolicitGrantSizeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassUnsolicitGrantSizeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassUnsolicitGrantSize", "1.3.6.1.2.1.127.1.8.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassNomGrantIntervalEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassNomGrantIntervalEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassNomGrantInterval", "1.3.6.1.2.1.127.1.8.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassTolGrantJitterEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassTolGrantJitterEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassTolGrantJitter", "1.3.6.1.2.1.127.1.8.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassGrantsPerIntervalEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassGrantsPerIntervalEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassGrantsPerInterval", "1.3.6.1.2.1.127.1.8.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassMaxLatencyEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassMaxLatencyEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassMaxLatency", "1.3.6.1.2.1.127.1.8.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassActiveTimeoutEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassActiveTimeoutEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassActiveTimeout", "1.3.6.1.2.1.127.1.8.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassAdmittedTimeoutEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassAdmittedTimeoutEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassAdmittedTimeout", "1.3.6.1.2.1.127.1.8.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassSchedulingTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassSchedulingTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassSchedulingType", "1.3.6.1.2.1.127.1.8.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassRequestPolicyEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassRequestPolicyEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassRequestPolicy", "1.3.6.1.2.1.127.1.8.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassTosAndMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassTosAndMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassTosAndMask", "1.3.6.1.2.1.127.1.8.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassTosOrMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassTosOrMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassTosOrMask", "1.3.6.1.2.1.127.1.8.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassDirectionEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassDirectionEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassDirection", "1.3.6.1.2.1.127.1.8.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassStorageTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassStorageTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassStorageType", "1.3.6.1.2.1.127.1.8.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassDSCPOverwriteEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassDSCPOverwriteEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassDSCPOverwrite", "1.3.6.1.2.1.127.1.8.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosServiceClassPolicyTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosServiceClassPolicyEntryEnt docsIetfQosServiceClassPolicyEntry;

                private DocsIetfQosServiceClassPolicyTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosServiceClassPolicyTable", "1.3.6.1.2.1.127.1.9", false, true, false, false);
                    this.docsIetfQosServiceClassPolicyEntry = new DocsIetfQosServiceClassPolicyEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosServiceClassPolicyEntry
                    };
                }
                public static final class DocsIetfQosServiceClassPolicyEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosServiceClassPolicyIndexEnt docsIetfQosServiceClassPolicyIndex;

                    public final DocsIetfQosServiceClassPolicyNameEnt docsIetfQosServiceClassPolicyName;

                    public final DocsIetfQosServiceClassPolicyRulePriorityEnt docsIetfQosServiceClassPolicyRulePriority;

                    public final DocsIetfQosServiceClassPolicyStatusEnt docsIetfQosServiceClassPolicyStatus;

                    public final DocsIetfQosServiceClassPolicyStorageTypeEnt docsIetfQosServiceClassPolicyStorageType;

                    private DocsIetfQosServiceClassPolicyEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosServiceClassPolicyEntry", "1.3.6.1.2.1.127.1.9.1", false, false, false, true);
                        this.docsIetfQosServiceClassPolicyIndex = new DocsIetfQosServiceClassPolicyIndexEnt(mib, this);
                        this.docsIetfQosServiceClassPolicyName = new DocsIetfQosServiceClassPolicyNameEnt(mib, this);
                        this.docsIetfQosServiceClassPolicyRulePriority = new DocsIetfQosServiceClassPolicyRulePriorityEnt(mib, this);
                        this.docsIetfQosServiceClassPolicyStatus = new DocsIetfQosServiceClassPolicyStatusEnt(mib, this);
                        this.docsIetfQosServiceClassPolicyStorageType = new DocsIetfQosServiceClassPolicyStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosServiceClassPolicyIndex,
                            this.docsIetfQosServiceClassPolicyName,
                            this.docsIetfQosServiceClassPolicyRulePriority,
                            this.docsIetfQosServiceClassPolicyStatus,
                            this.docsIetfQosServiceClassPolicyStorageType
                        };
                    }
                    public static final class DocsIetfQosServiceClassPolicyIndexEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassPolicyIndexEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassPolicyIndex", "1.3.6.1.2.1.127.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassPolicyNameEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassPolicyNameEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassPolicyName", "1.3.6.1.2.1.127.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassPolicyRulePriorityEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassPolicyRulePriorityEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassPolicyRulePriority", "1.3.6.1.2.1.127.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassPolicyStatusEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassPolicyStatusEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassPolicyStatus", "1.3.6.1.2.1.127.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosServiceClassPolicyStorageTypeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosServiceClassPolicyStorageTypeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosServiceClassPolicyStorageType", "1.3.6.1.2.1.127.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosPHSTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosPHSEntryEnt docsIetfQosPHSEntry;

                private DocsIetfQosPHSTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosPHSTable", "1.3.6.1.2.1.127.1.10", false, true, false, false);
                    this.docsIetfQosPHSEntry = new DocsIetfQosPHSEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosPHSEntry
                    };
                }
                public static final class DocsIetfQosPHSEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosPHSFieldEnt docsIetfQosPHSField;

                    public final DocsIetfQosPHSMaskEnt docsIetfQosPHSMask;

                    public final DocsIetfQosPHSSizeEnt docsIetfQosPHSSize;

                    public final DocsIetfQosPHSVerifyEnt docsIetfQosPHSVerify;

                    public final DocsIetfQosPHSIndexEnt docsIetfQosPHSIndex;

                    private DocsIetfQosPHSEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosPHSEntry", "1.3.6.1.2.1.127.1.10.1", false, false, false, true);
                        this.docsIetfQosPHSField = new DocsIetfQosPHSFieldEnt(mib, this);
                        this.docsIetfQosPHSMask = new DocsIetfQosPHSMaskEnt(mib, this);
                        this.docsIetfQosPHSSize = new DocsIetfQosPHSSizeEnt(mib, this);
                        this.docsIetfQosPHSVerify = new DocsIetfQosPHSVerifyEnt(mib, this);
                        this.docsIetfQosPHSIndex = new DocsIetfQosPHSIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosPHSField,
                            this.docsIetfQosPHSMask,
                            this.docsIetfQosPHSSize,
                            this.docsIetfQosPHSVerify,
                            this.docsIetfQosPHSIndex
                        };
                    }
                    public static final class DocsIetfQosPHSFieldEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPHSFieldEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPHSField", "1.3.6.1.2.1.127.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPHSMaskEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPHSMaskEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPHSMask", "1.3.6.1.2.1.127.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPHSSizeEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPHSSizeEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPHSSize", "1.3.6.1.2.1.127.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPHSVerifyEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPHSVerifyEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPHSVerify", "1.3.6.1.2.1.127.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosPHSIndexEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosPHSIndexEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosPHSIndex", "1.3.6.1.2.1.127.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsIetfQosCmtsMacToSrvFlowTableEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosCmtsMacToSrvFlowEntryEnt docsIetfQosCmtsMacToSrvFlowEntry;

                private DocsIetfQosCmtsMacToSrvFlowTableEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosCmtsMacToSrvFlowTable", "1.3.6.1.2.1.127.1.11", false, true, false, false);
                    this.docsIetfQosCmtsMacToSrvFlowEntry = new DocsIetfQosCmtsMacToSrvFlowEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosCmtsMacToSrvFlowEntry
                    };
                }
                public static final class DocsIetfQosCmtsMacToSrvFlowEntryEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    public final DocsIetfQosCmtsCmMacEnt docsIetfQosCmtsCmMac;

                    public final DocsIetfQosCmtsServiceFlowIdEnt docsIetfQosCmtsServiceFlowId;

                    public final DocsIetfQosCmtsIfIndexEnt docsIetfQosCmtsIfIndex;

                    private DocsIetfQosCmtsMacToSrvFlowEntryEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosCmtsMacToSrvFlowEntry", "1.3.6.1.2.1.127.1.11.1", false, false, false, true);
                        this.docsIetfQosCmtsCmMac = new DocsIetfQosCmtsCmMacEnt(mib, this);
                        this.docsIetfQosCmtsServiceFlowId = new DocsIetfQosCmtsServiceFlowIdEnt(mib, this);
                        this.docsIetfQosCmtsIfIndex = new DocsIetfQosCmtsIfIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIetfQosCmtsCmMac,
                            this.docsIetfQosCmtsServiceFlowId,
                            this.docsIetfQosCmtsIfIndex
                        };
                    }
                    public static final class DocsIetfQosCmtsCmMacEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosCmtsCmMacEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosCmtsCmMac", "1.3.6.1.2.1.127.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosCmtsServiceFlowIdEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosCmtsServiceFlowIdEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosCmtsServiceFlowId", "1.3.6.1.2.1.127.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsIetfQosCmtsIfIndexEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                    {
                        private DocsIetfQosCmtsIfIndexEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                        {
                            super(mib, parent, "docsIetfQosCmtsIfIndex", "1.3.6.1.2.1.127.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class DocsIetfQosConformanceEnt extends MIBEntry<DOCSIETFQOSMIBDef>
        {
            public final DocsIetfQosGroupsEnt docsIetfQosGroups;

            public final DocsIetfQosCompliancesEnt docsIetfQosCompliances;

            private DocsIetfQosConformanceEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
            {
                super(mib, parent, "docsIetfQosConformance", "1.3.6.1.2.1.127.2", false, false, false, false);
                this.docsIetfQosGroups = new DocsIetfQosGroupsEnt(mib, this);
                this.docsIetfQosCompliances = new DocsIetfQosCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsIetfQosGroups,
                    this.docsIetfQosCompliances
                };
            }
            public static final class DocsIetfQosGroupsEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosBaseGroupEnt docsIetfQosBaseGroup;

                public final DocsIetfQosParamSetGroupEnt docsIetfQosParamSetGroup;

                /** docsIetfQosCmtsMacToSrvFlowTable required*/
                public final DocsIetfQosCmtsGroupEnt docsIetfQosCmtsGroup;

                public final DocsIetfQosSrvClassPolicyGroupEnt docsIetfQosSrvClassPolicyGroup;

                public final DocsIetfQosServiceClassGroupEnt docsIetfQosServiceClassGroup;

                private DocsIetfQosGroupsEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosGroups", "1.3.6.1.2.1.127.2.1", false, false, false, false);
                    this.docsIetfQosBaseGroup = new DocsIetfQosBaseGroupEnt(mib, this);
                    this.docsIetfQosParamSetGroup = new DocsIetfQosParamSetGroupEnt(mib, this);
                    this.docsIetfQosCmtsGroup = new DocsIetfQosCmtsGroupEnt(mib, this);
                    this.docsIetfQosSrvClassPolicyGroup = new DocsIetfQosSrvClassPolicyGroupEnt(mib, this);
                    this.docsIetfQosServiceClassGroup = new DocsIetfQosServiceClassGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosBaseGroup,
                        this.docsIetfQosParamSetGroup,
                        this.docsIetfQosCmtsGroup,
                        this.docsIetfQosSrvClassPolicyGroup,
                        this.docsIetfQosServiceClassGroup
                    };
                }
                public static final class DocsIetfQosBaseGroupEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    private DocsIetfQosBaseGroupEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosBaseGroup", "1.3.6.1.2.1.127.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIetfQosParamSetGroupEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    private DocsIetfQosParamSetGroupEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosParamSetGroup", "1.3.6.1.2.1.127.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIetfQosCmtsGroupEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    private DocsIetfQosCmtsGroupEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosCmtsGroup", "1.3.6.1.2.1.127.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIetfQosSrvClassPolicyGroupEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    private DocsIetfQosSrvClassPolicyGroupEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosSrvClassPolicyGroup", "1.3.6.1.2.1.127.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIetfQosServiceClassGroupEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    private DocsIetfQosServiceClassGroupEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosServiceClassGroup", "1.3.6.1.2.1.127.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsIetfQosCompliancesEnt extends MIBEntry<DOCSIETFQOSMIBDef>
            {
                public final DocsIetfQosComplianceEnt docsIetfQosCompliance;

                private DocsIetfQosCompliancesEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                {
                    super(mib, parent, "docsIetfQosCompliances", "1.3.6.1.2.1.127.2.2", false, false, false, false);
                    this.docsIetfQosCompliance = new DocsIetfQosComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIetfQosCompliance
                    };
                }
                public static final class DocsIetfQosComplianceEnt extends MIBEntry<DOCSIETFQOSMIBDef>
                {
                    private DocsIetfQosComplianceEnt(DOCSIETFQOSMIBDef mib, MIBEntry<DOCSIETFQOSMIBDef> parent)
                    {
                        super(mib, parent, "docsIetfQosCompliance", "1.3.6.1.2.1.127.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
