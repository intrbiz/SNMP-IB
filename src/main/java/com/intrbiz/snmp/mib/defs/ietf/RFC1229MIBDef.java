package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**Extensions to MIB-II's Generic Interface Table*/
public final class RFC1229MIBDef extends MIB
{
    public static final RFC1229MIBDef RFC1229MIB = new RFC1229MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1229MIBDef.RFC1229MIB); }

    public final IfExtensionsEnt ifExtensions;

    private RFC1229MIBDef()
    {
        super("RFC1229-MIB");
        this.ifExtensions = new IfExtensionsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ifExtensions
        };
    }

    public static final class IfExtensionsEnt extends MIBEntry<RFC1229MIBDef>
    {
        /** Generic Interface Extension TableThis group of objects is mandatory for all types ofsubnetwork interface.*/
        public final IfExtnsTableEnt ifExtnsTable;

        /** Generic Interface Test TableThis group of objects is optional, but if the table isimplemented, all objects in the table must be implemented.*/
        public final IfExtnsTestTableEnt ifExtnsTestTable;

        public final WellKnownTestsEnt wellKnownTests;

        /** Generic Receive Address TableThis group of objects is mandatory for all types ofinterfaces which can receive packets/frames addressed tomore than one address.*/
        public final IfExtnsRcvAddrTableEnt ifExtnsRcvAddrTable;

        private IfExtensionsEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
        {
            super(mib, parent, "ifExtensions", "1.3.6.1.3.6", false, false, false, false);
            this.ifExtnsTable = new IfExtnsTableEnt(mib, this);
            this.ifExtnsTestTable = new IfExtnsTestTableEnt(mib, this);
            this.wellKnownTests = new WellKnownTestsEnt(mib, this);
            this.ifExtnsRcvAddrTable = new IfExtnsRcvAddrTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifExtnsTable,
                this.ifExtnsTestTable,
                this.wellKnownTests,
                this.ifExtnsRcvAddrTable
            };
        }
        public static final class IfExtnsTableEnt extends MIBEntry<RFC1229MIBDef>
        {
            public final IfExtnsEntryEnt ifExtnsEntry;

            private IfExtnsTableEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
            {
                super(mib, parent, "ifExtnsTable", "1.3.6.1.3.6.1", false, true, false, false);
                this.ifExtnsEntry = new IfExtnsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifExtnsEntry
                };
            }
            public static final class IfExtnsEntryEnt extends MIBEntry<RFC1229MIBDef>
            {
                public final IfExtnsIfIndexEnt ifExtnsIfIndex;

                public final IfExtnsChipSetEnt ifExtnsChipSet;

                public final IfExtnsRevWareEnt ifExtnsRevWare;

                public final IfExtnsMulticastsTransmittedOksEnt ifExtnsMulticastsTransmittedOks;

                public final IfExtnsBroadcastsTransmittedOksEnt ifExtnsBroadcastsTransmittedOks;

                public final IfExtnsMulticastsReceivedOksEnt ifExtnsMulticastsReceivedOks;

                public final IfExtnsBroadcastsReceivedOksEnt ifExtnsBroadcastsReceivedOks;

                /** Note: agent implementors are
encouraged to extend this
access to read-write if that
makes sense in their agent.*/
                public final IfExtnsPromiscuousEnt ifExtnsPromiscuous;

                private IfExtnsEntryEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                {
                    super(mib, parent, "ifExtnsEntry", "1.3.6.1.3.6.1.1", false, false, false, true);
                    this.ifExtnsIfIndex = new IfExtnsIfIndexEnt(mib, this);
                    this.ifExtnsChipSet = new IfExtnsChipSetEnt(mib, this);
                    this.ifExtnsRevWare = new IfExtnsRevWareEnt(mib, this);
                    this.ifExtnsMulticastsTransmittedOks = new IfExtnsMulticastsTransmittedOksEnt(mib, this);
                    this.ifExtnsBroadcastsTransmittedOks = new IfExtnsBroadcastsTransmittedOksEnt(mib, this);
                    this.ifExtnsMulticastsReceivedOks = new IfExtnsMulticastsReceivedOksEnt(mib, this);
                    this.ifExtnsBroadcastsReceivedOks = new IfExtnsBroadcastsReceivedOksEnt(mib, this);
                    this.ifExtnsPromiscuous = new IfExtnsPromiscuousEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifExtnsIfIndex,
                        this.ifExtnsChipSet,
                        this.ifExtnsRevWare,
                        this.ifExtnsMulticastsTransmittedOks,
                        this.ifExtnsBroadcastsTransmittedOks,
                        this.ifExtnsMulticastsReceivedOks,
                        this.ifExtnsBroadcastsReceivedOks,
                        this.ifExtnsPromiscuous
                    };
                }
                public static final class IfExtnsIfIndexEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsIfIndexEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsIfIndex", "1.3.6.1.3.6.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsChipSetEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsChipSetEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsChipSet", "1.3.6.1.3.6.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsRevWareEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsRevWareEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsRevWare", "1.3.6.1.3.6.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsMulticastsTransmittedOksEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsMulticastsTransmittedOksEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsMulticastsTransmittedOks", "1.3.6.1.3.6.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsBroadcastsTransmittedOksEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsBroadcastsTransmittedOksEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsBroadcastsTransmittedOks", "1.3.6.1.3.6.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsMulticastsReceivedOksEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsMulticastsReceivedOksEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsMulticastsReceivedOks", "1.3.6.1.3.6.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsBroadcastsReceivedOksEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsBroadcastsReceivedOksEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsBroadcastsReceivedOks", "1.3.6.1.3.6.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsPromiscuousEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsPromiscuousEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsPromiscuous", "1.3.6.1.3.6.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IfExtnsTestTableEnt extends MIBEntry<RFC1229MIBDef>
        {
            public final IfExtnsTestEntryEnt ifExtnsTestEntry;

            private IfExtnsTestTableEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
            {
                super(mib, parent, "ifExtnsTestTable", "1.3.6.1.3.6.2", false, true, false, false);
                this.ifExtnsTestEntry = new IfExtnsTestEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifExtnsTestEntry
                };
            }
            public static final class IfExtnsTestEntryEnt extends MIBEntry<RFC1229MIBDef>
            {
                public final IfExtnsTestIfIndexEnt ifExtnsTestIfIndex;

                public final IfExtnsTestCommunityEnt ifExtnsTestCommunity;

                public final IfExtnsTestRequestIdEnt ifExtnsTestRequestId;

                public final IfExtnsTestTypeEnt ifExtnsTestType;

                public final IfExtnsTestResultEnt ifExtnsTestResult;

                public final IfExtnsTestCodeEnt ifExtnsTestCode;

                private IfExtnsTestEntryEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                {
                    super(mib, parent, "ifExtnsTestEntry", "1.3.6.1.3.6.2.1", false, false, false, true);
                    this.ifExtnsTestIfIndex = new IfExtnsTestIfIndexEnt(mib, this);
                    this.ifExtnsTestCommunity = new IfExtnsTestCommunityEnt(mib, this);
                    this.ifExtnsTestRequestId = new IfExtnsTestRequestIdEnt(mib, this);
                    this.ifExtnsTestType = new IfExtnsTestTypeEnt(mib, this);
                    this.ifExtnsTestResult = new IfExtnsTestResultEnt(mib, this);
                    this.ifExtnsTestCode = new IfExtnsTestCodeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifExtnsTestIfIndex,
                        this.ifExtnsTestCommunity,
                        this.ifExtnsTestRequestId,
                        this.ifExtnsTestType,
                        this.ifExtnsTestResult,
                        this.ifExtnsTestCode
                    };
                }
                public static final class IfExtnsTestIfIndexEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsTestIfIndexEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsTestIfIndex", "1.3.6.1.3.6.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsTestCommunityEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsTestCommunityEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsTestCommunity", "1.3.6.1.3.6.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsTestRequestIdEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsTestRequestIdEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsTestRequestId", "1.3.6.1.3.6.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsTestTypeEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsTestTypeEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsTestType", "1.3.6.1.3.6.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsTestResultEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsTestResultEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsTestResult", "1.3.6.1.3.6.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsTestCodeEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsTestCodeEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsTestCode", "1.3.6.1.3.6.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class WellKnownTestsEnt extends MIBEntry<RFC1229MIBDef>
        {
            /** full-duplex loopback test*/
            public final TestFullDuplexLoopBackEnt testFullDuplexLoopBack;

            private WellKnownTestsEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
            {
                super(mib, parent, "wellKnownTests", "1.3.6.1.3.6.4", false, false, false, false);
                this.testFullDuplexLoopBack = new TestFullDuplexLoopBackEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.testFullDuplexLoopBack
                };
            }
            public static final class TestFullDuplexLoopBackEnt extends MIBEntry<RFC1229MIBDef>
            {
                private TestFullDuplexLoopBackEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                {
                    super(mib, parent, "testFullDuplexLoopBack", "1.3.6.1.3.6.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class IfExtnsRcvAddrTableEnt extends MIBEntry<RFC1229MIBDef>
        {
            public final IfExtnsRcvAddrEntryEnt ifExtnsRcvAddrEntry;

            private IfExtnsRcvAddrTableEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
            {
                super(mib, parent, "ifExtnsRcvAddrTable", "1.3.6.1.3.6.3", false, true, false, false);
                this.ifExtnsRcvAddrEntry = new IfExtnsRcvAddrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifExtnsRcvAddrEntry
                };
            }
            public static final class IfExtnsRcvAddrEntryEnt extends MIBEntry<RFC1229MIBDef>
            {
                public final IfExtnsRcvAddrIfIndexEnt ifExtnsRcvAddrIfIndex;

                public final IfExtnsRcvAddressEnt ifExtnsRcvAddress;

                public final IfExtnsRcvAddrStatusEnt ifExtnsRcvAddrStatus;

                private IfExtnsRcvAddrEntryEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                {
                    super(mib, parent, "ifExtnsRcvAddrEntry", "1.3.6.1.3.6.3.1", false, false, false, true);
                    this.ifExtnsRcvAddrIfIndex = new IfExtnsRcvAddrIfIndexEnt(mib, this);
                    this.ifExtnsRcvAddress = new IfExtnsRcvAddressEnt(mib, this);
                    this.ifExtnsRcvAddrStatus = new IfExtnsRcvAddrStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifExtnsRcvAddrIfIndex,
                        this.ifExtnsRcvAddress,
                        this.ifExtnsRcvAddrStatus
                    };
                }
                public static final class IfExtnsRcvAddrIfIndexEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsRcvAddrIfIndexEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsRcvAddrIfIndex", "1.3.6.1.3.6.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsRcvAddressEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsRcvAddressEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsRcvAddress", "1.3.6.1.3.6.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfExtnsRcvAddrStatusEnt extends MIBEntry<RFC1229MIBDef>
                {
                    private IfExtnsRcvAddrStatusEnt(RFC1229MIBDef mib, MIBEntry<RFC1229MIBDef> parent)
                    {
                        super(mib, parent, "ifExtnsRcvAddrStatus", "1.3.6.1.3.6.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
