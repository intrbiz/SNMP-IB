package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DIFFSERVMIBDef extends MIB
{
    public static final DIFFSERVMIBDef DIFFSERVMIB = new DIFFSERVMIBDef();

    public final DiffServMibEnt diffServMib;

    private DIFFSERVMIBDef()
    {
        super("DIFFSERV-MIB");
        this.diffServMib = new DiffServMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.diffServMib
        };
    }

    public static final class DiffServMibEnt extends MIBEntry<DIFFSERVMIBDef>
    {
        public final DiffServMIBObjectsEnt diffServMIBObjects;

        public final DiffServMIBConformanceEnt diffServMIBConformance;

        public final DiffServMIBAdminEnt diffServMIBAdmin;

        private DiffServMibEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
        {
            super(mib, parent, "diffServMib", "1.3.6.1.2.1.97", false, false, false, false);
            this.diffServMIBObjects = new DiffServMIBObjectsEnt(mib, this);
            this.diffServMIBConformance = new DiffServMIBConformanceEnt(mib, this);
            this.diffServMIBAdmin = new DiffServMIBAdminEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.diffServMIBObjects,
                this.diffServMIBConformance,
                this.diffServMIBAdmin
            };
        }
        public static final class DiffServMIBObjectsEnt extends MIBEntry<DIFFSERVMIBDef>
        {
            /** Data Path*/
            public final DiffServDataPathEnt diffServDataPath;

            /** Classifiers*/
            public final DiffServClassifierEnt diffServClassifier;

            /** Meters*/
            public final DiffServMeterEnt diffServMeter;

            /** Token Bucket Parameter Table*/
            public final DiffServTBParamEnt diffServTBParam;

            /** Actions*/
            public final DiffServActionEnt diffServAction;

            /** Algorithmic Drop Table*/
            public final DiffServAlgDropEnt diffServAlgDrop;

            /** Queue Table*/
            public final DiffServQueueEnt diffServQueue;

            /** Scheduler Table*/
            public final DiffServSchedulerEnt diffServScheduler;

            private DiffServMIBObjectsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
            {
                super(mib, parent, "diffServMIBObjects", "1.3.6.1.2.1.97.1", false, false, false, false);
                this.diffServDataPath = new DiffServDataPathEnt(mib, this);
                this.diffServClassifier = new DiffServClassifierEnt(mib, this);
                this.diffServMeter = new DiffServMeterEnt(mib, this);
                this.diffServTBParam = new DiffServTBParamEnt(mib, this);
                this.diffServAction = new DiffServActionEnt(mib, this);
                this.diffServAlgDrop = new DiffServAlgDropEnt(mib, this);
                this.diffServQueue = new DiffServQueueEnt(mib, this);
                this.diffServScheduler = new DiffServSchedulerEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.diffServDataPath,
                    this.diffServClassifier,
                    this.diffServMeter,
                    this.diffServTBParam,
                    this.diffServAction,
                    this.diffServAlgDrop,
                    this.diffServQueue,
                    this.diffServScheduler
                };
            }
            public static final class DiffServDataPathEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** Data Path TableThe Data Path Table enumerates the Differentiated ServicesFunctional Data Paths within this device.  Each entry in this tableis indexed by ifIndex and ifDirection.  Each entry provides thefirst Differentiated Services Functional Data Path Element toprocess data flowing along specific data path.  This table shouldhave at most two entries for each interface capable ofDifferentiated Services processing on this device: ingress andegress.
Note that Differentiated Services Functional Data Path Elementslinked together using their individual next pointers and anchored byan entry of the diffServDataPathTable constitute a functional datapath.*/
                public final DiffServDataPathTableEnt diffServDataPathTable;

                private DiffServDataPathEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServDataPath", "1.3.6.1.2.1.97.1.1", false, false, false, false);
                    this.diffServDataPathTable = new DiffServDataPathTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServDataPathTable
                    };
                }
                public static final class DiffServDataPathTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServDataPathEntryEnt diffServDataPathEntry;

                    private DiffServDataPathTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServDataPathTable", "1.3.6.1.2.1.97.1.1.1", false, true, false, false);
                        this.diffServDataPathEntry = new DiffServDataPathEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServDataPathEntry
                        };
                    }
                    public static final class DiffServDataPathEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServDataPathIfDirectionEnt diffServDataPathIfDirection;

                        public final DiffServDataPathStartEnt diffServDataPathStart;

                        public final DiffServDataPathStorageEnt diffServDataPathStorage;

                        public final DiffServDataPathStatusEnt diffServDataPathStatus;

                        private DiffServDataPathEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServDataPathEntry", "1.3.6.1.2.1.97.1.1.1.1", false, false, false, true);
                            this.diffServDataPathIfDirection = new DiffServDataPathIfDirectionEnt(mib, this);
                            this.diffServDataPathStart = new DiffServDataPathStartEnt(mib, this);
                            this.diffServDataPathStorage = new DiffServDataPathStorageEnt(mib, this);
                            this.diffServDataPathStatus = new DiffServDataPathStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServDataPathIfDirection,
                                this.diffServDataPathStart,
                                this.diffServDataPathStorage,
                                this.diffServDataPathStatus
                            };
                        }
                        public static final class DiffServDataPathIfDirectionEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServDataPathIfDirectionEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServDataPathIfDirection", "1.3.6.1.2.1.97.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServDataPathStartEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServDataPathStartEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServDataPathStart", "1.3.6.1.2.1.97.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServDataPathStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServDataPathStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServDataPathStorage", "1.3.6.1.2.1.97.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServDataPathStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServDataPathStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServDataPathStatus", "1.3.6.1.2.1.97.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServClassifierEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** Classifier TableThe Classifier Table allows multiple classifier elements, of same ordifferent types, to be used together. A classifier must completelyclassify all packets presented to it. This means that all trafficpresented to a classifier must match at least one classifier elementwithin the classifier, with the classifier element parametersspecified by a filter.
If there is ambiguity between classifier elements of differentclassifier, classifier linkage order indicates their precedence; thefirst classifier in the link is applied to the traffic first.
Entries in the classifier element table serves as the anchor foreach classification pattern, defined in filter table entries.  Eachclassifier element table entry also specifies the subsequentdownstream Differentiated Services Functional Data Path Element whenthe classification pattern is satisfied. Each entry in theclassifier element table describes one branch of the fan-outcharacteristic of a classifier indicated in the InformalDifferentiated Services Model section 4.1.  A classifier is composedof one or more classifier elements.*/
                public final DiffServClfrNextFreeEnt diffServClfrNextFree;

                public final DiffServClfrTableEnt diffServClfrTable;

                /** Classifier Element Table*/
                public final DiffServClfrElementNextFreeEnt diffServClfrElementNextFree;

                public final DiffServClfrElementTableEnt diffServClfrElementTable;

                /** IP Multi-field Classification TableClassification based on six different fields in the IP header.Functional Data Paths may share definitions by using the same entry.*/
                public final DiffServMultiFieldClfrNextFreeEnt diffServMultiFieldClfrNextFree;

                public final DiffServMultiFieldClfrTableEnt diffServMultiFieldClfrTable;

                private DiffServClassifierEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServClassifier", "1.3.6.1.2.1.97.1.2", false, false, false, false);
                    this.diffServClfrNextFree = new DiffServClfrNextFreeEnt(mib, this);
                    this.diffServClfrTable = new DiffServClfrTableEnt(mib, this);
                    this.diffServClfrElementNextFree = new DiffServClfrElementNextFreeEnt(mib, this);
                    this.diffServClfrElementTable = new DiffServClfrElementTableEnt(mib, this);
                    this.diffServMultiFieldClfrNextFree = new DiffServMultiFieldClfrNextFreeEnt(mib, this);
                    this.diffServMultiFieldClfrTable = new DiffServMultiFieldClfrTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServClfrNextFree,
                        this.diffServClfrTable,
                        this.diffServClfrElementNextFree,
                        this.diffServClfrElementTable,
                        this.diffServMultiFieldClfrNextFree,
                        this.diffServMultiFieldClfrTable
                    };
                }
                public static final class DiffServClfrNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServClfrNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServClfrNextFree", "1.3.6.1.2.1.97.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServClfrTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServClfrEntryEnt diffServClfrEntry;

                    private DiffServClfrTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServClfrTable", "1.3.6.1.2.1.97.1.2.2", false, true, false, false);
                        this.diffServClfrEntry = new DiffServClfrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServClfrEntry
                        };
                    }
                    public static final class DiffServClfrEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServClfrIdEnt diffServClfrId;

                        public final DiffServClfrStorageEnt diffServClfrStorage;

                        public final DiffServClfrStatusEnt diffServClfrStatus;

                        private DiffServClfrEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServClfrEntry", "1.3.6.1.2.1.97.1.2.2.1", false, false, false, true);
                            this.diffServClfrId = new DiffServClfrIdEnt(mib, this);
                            this.diffServClfrStorage = new DiffServClfrStorageEnt(mib, this);
                            this.diffServClfrStatus = new DiffServClfrStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServClfrId,
                                this.diffServClfrStorage,
                                this.diffServClfrStatus
                            };
                        }
                        public static final class DiffServClfrIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrId", "1.3.6.1.2.1.97.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrStorage", "1.3.6.1.2.1.97.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrStatus", "1.3.6.1.2.1.97.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServClfrElementNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServClfrElementNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServClfrElementNextFree", "1.3.6.1.2.1.97.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServClfrElementTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServClfrElementEntryEnt diffServClfrElementEntry;

                    private DiffServClfrElementTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServClfrElementTable", "1.3.6.1.2.1.97.1.2.4", false, true, false, false);
                        this.diffServClfrElementEntry = new DiffServClfrElementEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServClfrElementEntry
                        };
                    }
                    public static final class DiffServClfrElementEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServClfrElementIdEnt diffServClfrElementId;

                        public final DiffServClfrElementPrecedenceEnt diffServClfrElementPrecedence;

                        public final DiffServClfrElementNextEnt diffServClfrElementNext;

                        public final DiffServClfrElementSpecificEnt diffServClfrElementSpecific;

                        public final DiffServClfrElementStorageEnt diffServClfrElementStorage;

                        public final DiffServClfrElementStatusEnt diffServClfrElementStatus;

                        private DiffServClfrElementEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServClfrElementEntry", "1.3.6.1.2.1.97.1.2.4.1", false, false, false, true);
                            this.diffServClfrElementId = new DiffServClfrElementIdEnt(mib, this);
                            this.diffServClfrElementPrecedence = new DiffServClfrElementPrecedenceEnt(mib, this);
                            this.diffServClfrElementNext = new DiffServClfrElementNextEnt(mib, this);
                            this.diffServClfrElementSpecific = new DiffServClfrElementSpecificEnt(mib, this);
                            this.diffServClfrElementStorage = new DiffServClfrElementStorageEnt(mib, this);
                            this.diffServClfrElementStatus = new DiffServClfrElementStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServClfrElementId,
                                this.diffServClfrElementPrecedence,
                                this.diffServClfrElementNext,
                                this.diffServClfrElementSpecific,
                                this.diffServClfrElementStorage,
                                this.diffServClfrElementStatus
                            };
                        }
                        public static final class DiffServClfrElementIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrElementIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrElementId", "1.3.6.1.2.1.97.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrElementPrecedenceEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrElementPrecedenceEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrElementPrecedence", "1.3.6.1.2.1.97.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrElementNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrElementNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrElementNext", "1.3.6.1.2.1.97.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrElementSpecificEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrElementSpecificEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrElementSpecific", "1.3.6.1.2.1.97.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrElementStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrElementStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrElementStorage", "1.3.6.1.2.1.97.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServClfrElementStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServClfrElementStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServClfrElementStatus", "1.3.6.1.2.1.97.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServMultiFieldClfrNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMultiFieldClfrNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMultiFieldClfrNextFree", "1.3.6.1.2.1.97.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMultiFieldClfrTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServMultiFieldClfrEntryEnt diffServMultiFieldClfrEntry;

                    private DiffServMultiFieldClfrTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMultiFieldClfrTable", "1.3.6.1.2.1.97.1.2.6", false, true, false, false);
                        this.diffServMultiFieldClfrEntry = new DiffServMultiFieldClfrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServMultiFieldClfrEntry
                        };
                    }
                    public static final class DiffServMultiFieldClfrEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServMultiFieldClfrIdEnt diffServMultiFieldClfrId;

                        public final DiffServMultiFieldClfrAddrTypeEnt diffServMultiFieldClfrAddrType;

                        public final DiffServMultiFieldClfrDstAddrEnt diffServMultiFieldClfrDstAddr;

                        public final DiffServMultiFieldClfrDstPrefixLengthEnt diffServMultiFieldClfrDstPrefixLength;

                        public final DiffServMultiFieldClfrSrcAddrEnt diffServMultiFieldClfrSrcAddr;

                        public final DiffServMultiFieldClfrSrcPrefixLengthEnt diffServMultiFieldClfrSrcPrefixLength;

                        public final DiffServMultiFieldClfrDscpEnt diffServMultiFieldClfrDscp;

                        public final DiffServMultiFieldClfrFlowIdEnt diffServMultiFieldClfrFlowId;

                        public final DiffServMultiFieldClfrProtocolEnt diffServMultiFieldClfrProtocol;

                        public final DiffServMultiFieldClfrDstL4PortMinEnt diffServMultiFieldClfrDstL4PortMin;

                        public final DiffServMultiFieldClfrDstL4PortMaxEnt diffServMultiFieldClfrDstL4PortMax;

                        public final DiffServMultiFieldClfrSrcL4PortMinEnt diffServMultiFieldClfrSrcL4PortMin;

                        public final DiffServMultiFieldClfrSrcL4PortMaxEnt diffServMultiFieldClfrSrcL4PortMax;

                        public final DiffServMultiFieldClfrStorageEnt diffServMultiFieldClfrStorage;

                        public final DiffServMultiFieldClfrStatusEnt diffServMultiFieldClfrStatus;

                        private DiffServMultiFieldClfrEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServMultiFieldClfrEntry", "1.3.6.1.2.1.97.1.2.6.1", false, false, false, true);
                            this.diffServMultiFieldClfrId = new DiffServMultiFieldClfrIdEnt(mib, this);
                            this.diffServMultiFieldClfrAddrType = new DiffServMultiFieldClfrAddrTypeEnt(mib, this);
                            this.diffServMultiFieldClfrDstAddr = new DiffServMultiFieldClfrDstAddrEnt(mib, this);
                            this.diffServMultiFieldClfrDstPrefixLength = new DiffServMultiFieldClfrDstPrefixLengthEnt(mib, this);
                            this.diffServMultiFieldClfrSrcAddr = new DiffServMultiFieldClfrSrcAddrEnt(mib, this);
                            this.diffServMultiFieldClfrSrcPrefixLength = new DiffServMultiFieldClfrSrcPrefixLengthEnt(mib, this);
                            this.diffServMultiFieldClfrDscp = new DiffServMultiFieldClfrDscpEnt(mib, this);
                            this.diffServMultiFieldClfrFlowId = new DiffServMultiFieldClfrFlowIdEnt(mib, this);
                            this.diffServMultiFieldClfrProtocol = new DiffServMultiFieldClfrProtocolEnt(mib, this);
                            this.diffServMultiFieldClfrDstL4PortMin = new DiffServMultiFieldClfrDstL4PortMinEnt(mib, this);
                            this.diffServMultiFieldClfrDstL4PortMax = new DiffServMultiFieldClfrDstL4PortMaxEnt(mib, this);
                            this.diffServMultiFieldClfrSrcL4PortMin = new DiffServMultiFieldClfrSrcL4PortMinEnt(mib, this);
                            this.diffServMultiFieldClfrSrcL4PortMax = new DiffServMultiFieldClfrSrcL4PortMaxEnt(mib, this);
                            this.diffServMultiFieldClfrStorage = new DiffServMultiFieldClfrStorageEnt(mib, this);
                            this.diffServMultiFieldClfrStatus = new DiffServMultiFieldClfrStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServMultiFieldClfrId,
                                this.diffServMultiFieldClfrAddrType,
                                this.diffServMultiFieldClfrDstAddr,
                                this.diffServMultiFieldClfrDstPrefixLength,
                                this.diffServMultiFieldClfrSrcAddr,
                                this.diffServMultiFieldClfrSrcPrefixLength,
                                this.diffServMultiFieldClfrDscp,
                                this.diffServMultiFieldClfrFlowId,
                                this.diffServMultiFieldClfrProtocol,
                                this.diffServMultiFieldClfrDstL4PortMin,
                                this.diffServMultiFieldClfrDstL4PortMax,
                                this.diffServMultiFieldClfrSrcL4PortMin,
                                this.diffServMultiFieldClfrSrcL4PortMax,
                                this.diffServMultiFieldClfrStorage,
                                this.diffServMultiFieldClfrStatus
                            };
                        }
                        public static final class DiffServMultiFieldClfrIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrId", "1.3.6.1.2.1.97.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrAddrTypeEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrAddrTypeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrAddrType", "1.3.6.1.2.1.97.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrDstAddrEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrDstAddrEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrDstAddr", "1.3.6.1.2.1.97.1.2.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrDstPrefixLengthEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrDstPrefixLengthEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrDstPrefixLength", "1.3.6.1.2.1.97.1.2.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrSrcAddrEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrSrcAddrEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrSrcAddr", "1.3.6.1.2.1.97.1.2.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrSrcPrefixLengthEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrSrcPrefixLengthEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrSrcPrefixLength", "1.3.6.1.2.1.97.1.2.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrDscpEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrDscpEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrDscp", "1.3.6.1.2.1.97.1.2.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrFlowIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrFlowIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrFlowId", "1.3.6.1.2.1.97.1.2.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrProtocolEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrProtocolEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrProtocol", "1.3.6.1.2.1.97.1.2.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrDstL4PortMinEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrDstL4PortMinEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrDstL4PortMin", "1.3.6.1.2.1.97.1.2.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrDstL4PortMaxEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrDstL4PortMaxEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrDstL4PortMax", "1.3.6.1.2.1.97.1.2.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrSrcL4PortMinEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrSrcL4PortMinEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrSrcL4PortMin", "1.3.6.1.2.1.97.1.2.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrSrcL4PortMaxEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrSrcL4PortMaxEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrSrcL4PortMax", "1.3.6.1.2.1.97.1.2.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrStorage", "1.3.6.1.2.1.97.1.2.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMultiFieldClfrStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMultiFieldClfrStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMultiFieldClfrStatus", "1.3.6.1.2.1.97.1.2.6.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServMeterEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** This MIB supports a variety of Meters.  It includes a specificdefinition for Token Bucket Meter, which are but one type ofspecification. Other metering parameter sets can be defined in otherMIBs.
Multiple meter elements may be logically cascaded using theirdiffServMeterSucceedNext and diffServMeterFailNext pointers ifrequired. One example of this might be for an AF PHB implementationthat uses multiple level conformance meters.
Cascading of individual meter elements in the MIB is intended to befunctionally equivalent to multiple level conformance determinationof a packet.  The sequential nature of the representation is merelya notational convenience for this MIB.
srTCM meters (RFC 2697) can be specified using two sets ofdiffServMeterEntry and diffServTBParamEntry. The first set specifiesthe Committed Information Rate and Committed Burst Sizetoken-bucket.  The second set specifies the Excess Burst Sizetoken-bucket.
trTCM meters (RFC 2698) can be specified using two sets ofdiffServMeterEntry and diffServTBParamEntry. The first set specifiesthe Committed Information Rate and Committed Burst Sizetoken-bucket.  The second set specifies the Peak Information Rateand Peak Burst Size token-bucket.
tswTCM meters (RFC 2859) can be specified using two sets ofdiffServMeterEntry and diffServTBParamEntry. The first set specifiesthe Committed Target Rate token-bucket.  The second set specifies


the Peak Target Rate token-bucket. diffServTBParamInterval in eachtoken bucket reflects the Average Interval.*/
                public final DiffServMeterNextFreeEnt diffServMeterNextFree;

                public final DiffServMeterTableEnt diffServMeterTable;

                private DiffServMeterEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServMeter", "1.3.6.1.2.1.97.1.3", false, false, false, false);
                    this.diffServMeterNextFree = new DiffServMeterNextFreeEnt(mib, this);
                    this.diffServMeterTable = new DiffServMeterTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServMeterNextFree,
                        this.diffServMeterTable
                    };
                }
                public static final class DiffServMeterNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMeterNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMeterNextFree", "1.3.6.1.2.1.97.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMeterTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServMeterEntryEnt diffServMeterEntry;

                    private DiffServMeterTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMeterTable", "1.3.6.1.2.1.97.1.3.2", false, true, false, false);
                        this.diffServMeterEntry = new DiffServMeterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServMeterEntry
                        };
                    }
                    public static final class DiffServMeterEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServMeterIdEnt diffServMeterId;

                        public final DiffServMeterSucceedNextEnt diffServMeterSucceedNext;

                        public final DiffServMeterFailNextEnt diffServMeterFailNext;

                        public final DiffServMeterSpecificEnt diffServMeterSpecific;

                        public final DiffServMeterStorageEnt diffServMeterStorage;

                        public final DiffServMeterStatusEnt diffServMeterStatus;

                        private DiffServMeterEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServMeterEntry", "1.3.6.1.2.1.97.1.3.2.1", false, false, false, true);
                            this.diffServMeterId = new DiffServMeterIdEnt(mib, this);
                            this.diffServMeterSucceedNext = new DiffServMeterSucceedNextEnt(mib, this);
                            this.diffServMeterFailNext = new DiffServMeterFailNextEnt(mib, this);
                            this.diffServMeterSpecific = new DiffServMeterSpecificEnt(mib, this);
                            this.diffServMeterStorage = new DiffServMeterStorageEnt(mib, this);
                            this.diffServMeterStatus = new DiffServMeterStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServMeterId,
                                this.diffServMeterSucceedNext,
                                this.diffServMeterFailNext,
                                this.diffServMeterSpecific,
                                this.diffServMeterStorage,
                                this.diffServMeterStatus
                            };
                        }
                        public static final class DiffServMeterIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMeterIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMeterId", "1.3.6.1.2.1.97.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMeterSucceedNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMeterSucceedNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMeterSucceedNext", "1.3.6.1.2.1.97.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMeterFailNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMeterFailNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMeterFailNext", "1.3.6.1.2.1.97.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMeterSpecificEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMeterSpecificEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMeterSpecific", "1.3.6.1.2.1.97.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMeterStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMeterStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMeterStorage", "1.3.6.1.2.1.97.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMeterStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMeterStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMeterStatus", "1.3.6.1.2.1.97.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServTBParamEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** Each entry in the Token Bucket Parameter Table parameterize a singletoken bucket.  Multiple token buckets can be used together toparameterize multiple levels of conformance.
Note that an entry in the Token Bucket Parameter Table can be sharedby multiple diffServMeterTable entries.*/
                public final DiffServTBParamNextFreeEnt diffServTBParamNextFree;

                public final DiffServTBParamTableEnt diffServTBParamTable;

                private DiffServTBParamEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServTBParam", "1.3.6.1.2.1.97.1.4", false, false, false, false);
                    this.diffServTBParamNextFree = new DiffServTBParamNextFreeEnt(mib, this);
                    this.diffServTBParamTable = new DiffServTBParamTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServTBParamNextFree,
                        this.diffServTBParamTable
                    };
                }
                public static final class DiffServTBParamNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamNextFree", "1.3.6.1.2.1.97.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServTBParamEntryEnt diffServTBParamEntry;

                    private DiffServTBParamTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamTable", "1.3.6.1.2.1.97.1.4.2", false, true, false, false);
                        this.diffServTBParamEntry = new DiffServTBParamEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServTBParamEntry
                        };
                    }
                    public static final class DiffServTBParamEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServTBParamIdEnt diffServTBParamId;

                        public final DiffServTBParamTypeEnt diffServTBParamType;

                        public final DiffServTBParamRateEnt diffServTBParamRate;

                        public final DiffServTBParamBurstSizeEnt diffServTBParamBurstSize;

                        public final DiffServTBParamIntervalEnt diffServTBParamInterval;

                        public final DiffServTBParamStorageEnt diffServTBParamStorage;

                        public final DiffServTBParamStatusEnt diffServTBParamStatus;

                        private DiffServTBParamEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServTBParamEntry", "1.3.6.1.2.1.97.1.4.2.1", false, false, false, true);
                            this.diffServTBParamId = new DiffServTBParamIdEnt(mib, this);
                            this.diffServTBParamType = new DiffServTBParamTypeEnt(mib, this);
                            this.diffServTBParamRate = new DiffServTBParamRateEnt(mib, this);
                            this.diffServTBParamBurstSize = new DiffServTBParamBurstSizeEnt(mib, this);
                            this.diffServTBParamInterval = new DiffServTBParamIntervalEnt(mib, this);
                            this.diffServTBParamStorage = new DiffServTBParamStorageEnt(mib, this);
                            this.diffServTBParamStatus = new DiffServTBParamStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServTBParamId,
                                this.diffServTBParamType,
                                this.diffServTBParamRate,
                                this.diffServTBParamBurstSize,
                                this.diffServTBParamInterval,
                                this.diffServTBParamStorage,
                                this.diffServTBParamStatus
                            };
                        }
                        public static final class DiffServTBParamIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamId", "1.3.6.1.2.1.97.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServTBParamTypeEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamTypeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamType", "1.3.6.1.2.1.97.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServTBParamRateEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamRate", "1.3.6.1.2.1.97.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServTBParamBurstSizeEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamBurstSizeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamBurstSize", "1.3.6.1.2.1.97.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServTBParamIntervalEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamIntervalEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamInterval", "1.3.6.1.2.1.97.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServTBParamStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamStorage", "1.3.6.1.2.1.97.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServTBParamStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServTBParamStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServTBParamStatus", "1.3.6.1.2.1.97.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServActionEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** The Action Table allows enumeration of the different types ofactions to be applied to a traffic flow.*/
                public final DiffServActionNextFreeEnt diffServActionNextFree;

                public final DiffServActionTableEnt diffServActionTable;

                /** DSCP Mark Action TableRows of this table are pointed to by diffServActionSpecific toprovide detailed parameters specific to the DSCP Mark action.A single entry in this table can be shared by multiple


diffServActionTable entries.*/
                public final DiffServDscpMarkActTableEnt diffServDscpMarkActTable;

                /** Count Action TableBecause the MIB structure allows multiple cascadingdiffServActionEntry be used to describe multiple actions for a datapath, the counter became an optional action type.  In normalimplementation, either a data path has counters or it does not, asopposed to being configurable. The management entity may choose to


read the counter or not.  Hence it is recommended for implementationthat have counters to always configure the count action as the firstof multiple actions.*/
                public final DiffServCountActNextFreeEnt diffServCountActNextFree;

                public final DiffServCountActTableEnt diffServCountActTable;

                private DiffServActionEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServAction", "1.3.6.1.2.1.97.1.5", false, false, false, false);
                    this.diffServActionNextFree = new DiffServActionNextFreeEnt(mib, this);
                    this.diffServActionTable = new DiffServActionTableEnt(mib, this);
                    this.diffServDscpMarkActTable = new DiffServDscpMarkActTableEnt(mib, this);
                    this.diffServCountActNextFree = new DiffServCountActNextFreeEnt(mib, this);
                    this.diffServCountActTable = new DiffServCountActTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServActionNextFree,
                        this.diffServActionTable,
                        this.diffServDscpMarkActTable,
                        this.diffServCountActNextFree,
                        this.diffServCountActTable
                    };
                }
                public static final class DiffServActionNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServActionNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServActionNextFree", "1.3.6.1.2.1.97.1.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServActionTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServActionEntryEnt diffServActionEntry;

                    private DiffServActionTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServActionTable", "1.3.6.1.2.1.97.1.5.2", false, true, false, false);
                        this.diffServActionEntry = new DiffServActionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServActionEntry
                        };
                    }
                    public static final class DiffServActionEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServActionIdEnt diffServActionId;

                        public final DiffServActionInterfaceEnt diffServActionInterface;

                        public final DiffServActionNextEnt diffServActionNext;

                        public final DiffServActionSpecificEnt diffServActionSpecific;

                        public final DiffServActionStorageEnt diffServActionStorage;

                        public final DiffServActionStatusEnt diffServActionStatus;

                        private DiffServActionEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServActionEntry", "1.3.6.1.2.1.97.1.5.2.1", false, false, false, true);
                            this.diffServActionId = new DiffServActionIdEnt(mib, this);
                            this.diffServActionInterface = new DiffServActionInterfaceEnt(mib, this);
                            this.diffServActionNext = new DiffServActionNextEnt(mib, this);
                            this.diffServActionSpecific = new DiffServActionSpecificEnt(mib, this);
                            this.diffServActionStorage = new DiffServActionStorageEnt(mib, this);
                            this.diffServActionStatus = new DiffServActionStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServActionId,
                                this.diffServActionInterface,
                                this.diffServActionNext,
                                this.diffServActionSpecific,
                                this.diffServActionStorage,
                                this.diffServActionStatus
                            };
                        }
                        public static final class DiffServActionIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServActionIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServActionId", "1.3.6.1.2.1.97.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServActionInterfaceEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServActionInterfaceEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServActionInterface", "1.3.6.1.2.1.97.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServActionNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServActionNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServActionNext", "1.3.6.1.2.1.97.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServActionSpecificEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServActionSpecificEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServActionSpecific", "1.3.6.1.2.1.97.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServActionStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServActionStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServActionStorage", "1.3.6.1.2.1.97.1.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServActionStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServActionStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServActionStatus", "1.3.6.1.2.1.97.1.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServDscpMarkActTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServDscpMarkActEntryEnt diffServDscpMarkActEntry;

                    private DiffServDscpMarkActTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServDscpMarkActTable", "1.3.6.1.2.1.97.1.5.3", false, true, false, false);
                        this.diffServDscpMarkActEntry = new DiffServDscpMarkActEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServDscpMarkActEntry
                        };
                    }
                    public static final class DiffServDscpMarkActEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServDscpMarkActDscpEnt diffServDscpMarkActDscp;

                        private DiffServDscpMarkActEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServDscpMarkActEntry", "1.3.6.1.2.1.97.1.5.3.1", false, false, false, true);
                            this.diffServDscpMarkActDscp = new DiffServDscpMarkActDscpEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServDscpMarkActDscp
                            };
                        }
                        public static final class DiffServDscpMarkActDscpEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServDscpMarkActDscpEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServDscpMarkActDscp", "1.3.6.1.2.1.97.1.5.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServCountActNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServCountActNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServCountActNextFree", "1.3.6.1.2.1.97.1.5.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServCountActTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServCountActEntryEnt diffServCountActEntry;

                    private DiffServCountActTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServCountActTable", "1.3.6.1.2.1.97.1.5.5", false, true, false, false);
                        this.diffServCountActEntry = new DiffServCountActEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServCountActEntry
                        };
                    }
                    public static final class DiffServCountActEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServCountActIdEnt diffServCountActId;

                        public final DiffServCountActOctetsEnt diffServCountActOctets;

                        public final DiffServCountActPktsEnt diffServCountActPkts;

                        public final DiffServCountActStorageEnt diffServCountActStorage;

                        public final DiffServCountActStatusEnt diffServCountActStatus;

                        private DiffServCountActEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServCountActEntry", "1.3.6.1.2.1.97.1.5.5.1", false, false, false, true);
                            this.diffServCountActId = new DiffServCountActIdEnt(mib, this);
                            this.diffServCountActOctets = new DiffServCountActOctetsEnt(mib, this);
                            this.diffServCountActPkts = new DiffServCountActPktsEnt(mib, this);
                            this.diffServCountActStorage = new DiffServCountActStorageEnt(mib, this);
                            this.diffServCountActStatus = new DiffServCountActStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServCountActId,
                                this.diffServCountActOctets,
                                this.diffServCountActPkts,
                                this.diffServCountActStorage,
                                this.diffServCountActStatus
                            };
                        }
                        public static final class DiffServCountActIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServCountActIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServCountActId", "1.3.6.1.2.1.97.1.5.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServCountActOctetsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServCountActOctetsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServCountActOctets", "1.3.6.1.2.1.97.1.5.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServCountActPktsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServCountActPktsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServCountActPkts", "1.3.6.1.2.1.97.1.5.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServCountActStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServCountActStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServCountActStorage", "1.3.6.1.2.1.97.1.5.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServCountActStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServCountActStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServCountActStatus", "1.3.6.1.2.1.97.1.5.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServAlgDropEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                public final DiffServAlgDropNextFreeEnt diffServAlgDropNextFree;

                public final DiffServAlgDropTableEnt diffServAlgDropTable;

                /** Random Drop Table*/
                public final DiffServRandomDropNextFreeEnt diffServRandomDropNextFree;

                public final DiffServRandomDropTableEnt diffServRandomDropTable;

                private DiffServAlgDropEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServAlgDrop", "1.3.6.1.2.1.97.1.6", false, false, false, false);
                    this.diffServAlgDropNextFree = new DiffServAlgDropNextFreeEnt(mib, this);
                    this.diffServAlgDropTable = new DiffServAlgDropTableEnt(mib, this);
                    this.diffServRandomDropNextFree = new DiffServRandomDropNextFreeEnt(mib, this);
                    this.diffServRandomDropTable = new DiffServRandomDropTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServAlgDropNextFree,
                        this.diffServAlgDropTable,
                        this.diffServRandomDropNextFree,
                        this.diffServRandomDropTable
                    };
                }
                public static final class DiffServAlgDropNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServAlgDropNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServAlgDropNextFree", "1.3.6.1.2.1.97.1.6.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServAlgDropTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServAlgDropEntryEnt diffServAlgDropEntry;

                    private DiffServAlgDropTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServAlgDropTable", "1.3.6.1.2.1.97.1.6.2", false, true, false, false);
                        this.diffServAlgDropEntry = new DiffServAlgDropEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServAlgDropEntry
                        };
                    }
                    public static final class DiffServAlgDropEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServAlgDropIdEnt diffServAlgDropId;

                        public final DiffServAlgDropTypeEnt diffServAlgDropType;

                        public final DiffServAlgDropNextEnt diffServAlgDropNext;

                        public final DiffServAlgDropQMeasureEnt diffServAlgDropQMeasure;

                        public final DiffServAlgDropQThresholdEnt diffServAlgDropQThreshold;

                        public final DiffServAlgDropSpecificEnt diffServAlgDropSpecific;

                        public final DiffServAlgDropOctetsEnt diffServAlgDropOctets;

                        public final DiffServAlgDropPktsEnt diffServAlgDropPkts;

                        public final DiffServAlgRandomDropOctetsEnt diffServAlgRandomDropOctets;

                        public final DiffServAlgRandomDropPktsEnt diffServAlgRandomDropPkts;

                        public final DiffServAlgDropStorageEnt diffServAlgDropStorage;

                        public final DiffServAlgDropStatusEnt diffServAlgDropStatus;

                        private DiffServAlgDropEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServAlgDropEntry", "1.3.6.1.2.1.97.1.6.2.1", false, false, false, true);
                            this.diffServAlgDropId = new DiffServAlgDropIdEnt(mib, this);
                            this.diffServAlgDropType = new DiffServAlgDropTypeEnt(mib, this);
                            this.diffServAlgDropNext = new DiffServAlgDropNextEnt(mib, this);
                            this.diffServAlgDropQMeasure = new DiffServAlgDropQMeasureEnt(mib, this);
                            this.diffServAlgDropQThreshold = new DiffServAlgDropQThresholdEnt(mib, this);
                            this.diffServAlgDropSpecific = new DiffServAlgDropSpecificEnt(mib, this);
                            this.diffServAlgDropOctets = new DiffServAlgDropOctetsEnt(mib, this);
                            this.diffServAlgDropPkts = new DiffServAlgDropPktsEnt(mib, this);
                            this.diffServAlgRandomDropOctets = new DiffServAlgRandomDropOctetsEnt(mib, this);
                            this.diffServAlgRandomDropPkts = new DiffServAlgRandomDropPktsEnt(mib, this);
                            this.diffServAlgDropStorage = new DiffServAlgDropStorageEnt(mib, this);
                            this.diffServAlgDropStatus = new DiffServAlgDropStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServAlgDropId,
                                this.diffServAlgDropType,
                                this.diffServAlgDropNext,
                                this.diffServAlgDropQMeasure,
                                this.diffServAlgDropQThreshold,
                                this.diffServAlgDropSpecific,
                                this.diffServAlgDropOctets,
                                this.diffServAlgDropPkts,
                                this.diffServAlgRandomDropOctets,
                                this.diffServAlgRandomDropPkts,
                                this.diffServAlgDropStorage,
                                this.diffServAlgDropStatus
                            };
                        }
                        public static final class DiffServAlgDropIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropId", "1.3.6.1.2.1.97.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropTypeEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropTypeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropType", "1.3.6.1.2.1.97.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropNext", "1.3.6.1.2.1.97.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropQMeasureEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropQMeasureEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropQMeasure", "1.3.6.1.2.1.97.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropQThresholdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropQThresholdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropQThreshold", "1.3.6.1.2.1.97.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropSpecificEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropSpecificEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropSpecific", "1.3.6.1.2.1.97.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropOctetsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropOctetsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropOctets", "1.3.6.1.2.1.97.1.6.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropPktsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropPktsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropPkts", "1.3.6.1.2.1.97.1.6.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgRandomDropOctetsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgRandomDropOctetsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgRandomDropOctets", "1.3.6.1.2.1.97.1.6.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgRandomDropPktsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgRandomDropPktsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgRandomDropPkts", "1.3.6.1.2.1.97.1.6.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropStorage", "1.3.6.1.2.1.97.1.6.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServAlgDropStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServAlgDropStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServAlgDropStatus", "1.3.6.1.2.1.97.1.6.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServRandomDropNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServRandomDropNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServRandomDropNextFree", "1.3.6.1.2.1.97.1.6.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServRandomDropTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServRandomDropEntryEnt diffServRandomDropEntry;

                    private DiffServRandomDropTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServRandomDropTable", "1.3.6.1.2.1.97.1.6.4", false, true, false, false);
                        this.diffServRandomDropEntry = new DiffServRandomDropEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServRandomDropEntry
                        };
                    }
                    public static final class DiffServRandomDropEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServRandomDropIdEnt diffServRandomDropId;

                        public final DiffServRandomDropMinThreshBytesEnt diffServRandomDropMinThreshBytes;

                        public final DiffServRandomDropMinThreshPktsEnt diffServRandomDropMinThreshPkts;

                        public final DiffServRandomDropMaxThreshBytesEnt diffServRandomDropMaxThreshBytes;

                        public final DiffServRandomDropMaxThreshPktsEnt diffServRandomDropMaxThreshPkts;

                        public final DiffServRandomDropProbMaxEnt diffServRandomDropProbMax;

                        public final DiffServRandomDropWeightEnt diffServRandomDropWeight;

                        public final DiffServRandomDropSamplingRateEnt diffServRandomDropSamplingRate;

                        public final DiffServRandomDropStorageEnt diffServRandomDropStorage;

                        public final DiffServRandomDropStatusEnt diffServRandomDropStatus;

                        private DiffServRandomDropEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServRandomDropEntry", "1.3.6.1.2.1.97.1.6.4.1", false, false, false, true);
                            this.diffServRandomDropId = new DiffServRandomDropIdEnt(mib, this);
                            this.diffServRandomDropMinThreshBytes = new DiffServRandomDropMinThreshBytesEnt(mib, this);
                            this.diffServRandomDropMinThreshPkts = new DiffServRandomDropMinThreshPktsEnt(mib, this);
                            this.diffServRandomDropMaxThreshBytes = new DiffServRandomDropMaxThreshBytesEnt(mib, this);
                            this.diffServRandomDropMaxThreshPkts = new DiffServRandomDropMaxThreshPktsEnt(mib, this);
                            this.diffServRandomDropProbMax = new DiffServRandomDropProbMaxEnt(mib, this);
                            this.diffServRandomDropWeight = new DiffServRandomDropWeightEnt(mib, this);
                            this.diffServRandomDropSamplingRate = new DiffServRandomDropSamplingRateEnt(mib, this);
                            this.diffServRandomDropStorage = new DiffServRandomDropStorageEnt(mib, this);
                            this.diffServRandomDropStatus = new DiffServRandomDropStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServRandomDropId,
                                this.diffServRandomDropMinThreshBytes,
                                this.diffServRandomDropMinThreshPkts,
                                this.diffServRandomDropMaxThreshBytes,
                                this.diffServRandomDropMaxThreshPkts,
                                this.diffServRandomDropProbMax,
                                this.diffServRandomDropWeight,
                                this.diffServRandomDropSamplingRate,
                                this.diffServRandomDropStorage,
                                this.diffServRandomDropStatus
                            };
                        }
                        public static final class DiffServRandomDropIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropId", "1.3.6.1.2.1.97.1.6.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropMinThreshBytesEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropMinThreshBytesEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropMinThreshBytes", "1.3.6.1.2.1.97.1.6.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropMinThreshPktsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropMinThreshPktsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropMinThreshPkts", "1.3.6.1.2.1.97.1.6.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropMaxThreshBytesEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropMaxThreshBytesEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropMaxThreshBytes", "1.3.6.1.2.1.97.1.6.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropMaxThreshPktsEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropMaxThreshPktsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropMaxThreshPkts", "1.3.6.1.2.1.97.1.6.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropProbMaxEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropProbMaxEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropProbMax", "1.3.6.1.2.1.97.1.6.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropWeightEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropWeightEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropWeight", "1.3.6.1.2.1.97.1.6.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropSamplingRateEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropSamplingRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropSamplingRate", "1.3.6.1.2.1.97.1.6.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropStorage", "1.3.6.1.2.1.97.1.6.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServRandomDropStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServRandomDropStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServRandomDropStatus", "1.3.6.1.2.1.97.1.6.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServQueueEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** An entry of diffServQTable represents a FIFO queue DifferentiatedServices Functional Data Path element as described in the InformalDifferentiated Services Model section 7.1.1. Note that thespecification of scheduling parameters for a queue as part of theinput to a scheduler functional data path element as described inthe Informal Differentiated Services Model section 7.1.2. Thisallows building of hierarchical queuing/scheduling. A queuetherefore has these attributes:1. Which scheduler will service this queue, diffServQNext.2. How the scheduler will service this queue, with respectto all the other queues the same scheduler needs to service,diffServQMinRate.Note that upstream Differentiated Services Functional Data Pathelements may point to a shared diffServQTable entry as describedin the Informal Differentiated Services Model section 7.1.1.*/
                public final DiffServQNextFreeEnt diffServQNextFree;

                public final DiffServQTableEnt diffServQTable;

                private DiffServQueueEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServQueue", "1.3.6.1.2.1.97.1.7", false, false, false, false);
                    this.diffServQNextFree = new DiffServQNextFreeEnt(mib, this);
                    this.diffServQTable = new DiffServQTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServQNextFree,
                        this.diffServQTable
                    };
                }
                public static final class DiffServQNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServQNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServQNextFree", "1.3.6.1.2.1.97.1.7.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServQTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServQEntryEnt diffServQEntry;

                    private DiffServQTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServQTable", "1.3.6.1.2.1.97.1.7.2", false, true, false, false);
                        this.diffServQEntry = new DiffServQEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServQEntry
                        };
                    }
                    public static final class DiffServQEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServQIdEnt diffServQId;

                        public final DiffServQNextEnt diffServQNext;

                        public final DiffServQMinRateEnt diffServQMinRate;

                        public final DiffServQMaxRateEnt diffServQMaxRate;

                        public final DiffServQStorageEnt diffServQStorage;

                        public final DiffServQStatusEnt diffServQStatus;

                        private DiffServQEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServQEntry", "1.3.6.1.2.1.97.1.7.2.1", false, false, false, true);
                            this.diffServQId = new DiffServQIdEnt(mib, this);
                            this.diffServQNext = new DiffServQNextEnt(mib, this);
                            this.diffServQMinRate = new DiffServQMinRateEnt(mib, this);
                            this.diffServQMaxRate = new DiffServQMaxRateEnt(mib, this);
                            this.diffServQStorage = new DiffServQStorageEnt(mib, this);
                            this.diffServQStatus = new DiffServQStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServQId,
                                this.diffServQNext,
                                this.diffServQMinRate,
                                this.diffServQMaxRate,
                                this.diffServQStorage,
                                this.diffServQStatus
                            };
                        }
                        public static final class DiffServQIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServQIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServQId", "1.3.6.1.2.1.97.1.7.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServQNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServQNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServQNext", "1.3.6.1.2.1.97.1.7.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServQMinRateEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServQMinRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServQMinRate", "1.3.6.1.2.1.97.1.7.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServQMaxRateEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServQMaxRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServQMaxRate", "1.3.6.1.2.1.97.1.7.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServQStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServQStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServQStorage", "1.3.6.1.2.1.97.1.7.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServQStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServQStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServQStatus", "1.3.6.1.2.1.97.1.7.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DiffServSchedulerEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** A Scheduler Entry represents a packet scheduler, such as a priorityscheduler or a WFQ scheduler. It provides flexibility for multiplescheduling algorithms, each servicing multiple queues, to be used onthe same logical/physical interface.Note that upstream queues or schedulers specify several of thescheduler's parameters. These must be properly specified if thescheduler is to behave as expected.The diffServSchedulerMaxRate attribute specifies the parameters whena scheduler's output is sent to another scheduler. This is used inbuilding hierarchical queues or schedulers.


More discussion of the scheduler functional data path element is inthe Informal Differentiated Services Model section 7.1.2.*/
                public final DiffServSchedulerNextFreeEnt diffServSchedulerNextFree;

                public final DiffServSchedulerTableEnt diffServSchedulerTable;

                /** Minimum Rate Parameters TableThe parameters used by a scheduler for its inputs or outputs aremaintained separately from the Queue or Scheduler table entries forreusability reasons and so that they may be used by both queues andschedulers.  This follows the approach for separation of data pathelements from parameterization that is used throughout this MIB.Use of these Minimum Rate Parameter Table entries by Queues andSchedulers allows the modeling of hierarchical scheduling systems.Specifically, a Scheduler has one or more inputs and one output.Any queue feeding a scheduler, or any scheduler which feeds a secondscheduler, might specify a minimum transfer rate by pointing to anMinimum Rate Parameter Table entry.The diffServMinRatePriority/Abs/Rel attributes are used asparameters to the work-conserving portion of a scheduler:"work-conserving" implies that the scheduler can continue to emitdata as long as there is data available at its input(s).  This hasthe effect of guaranteeing a certain priority relative to otherscheduler inputs and/or a certain minimum proportion of theavailable output bandwidth. Properly configured, this means acertain minimum rate, which may be exceeded should traffic beavailable should there be spare bandwidth after all other classeshave had opportunities to consume their own minimum rates.*/
                public final DiffServMinRateNextFreeEnt diffServMinRateNextFree;

                public final DiffServMinRateTableEnt diffServMinRateTable;

                /** Maximum Rate Parameter TableThe parameters used by a scheduler for its inputs or outputs aremaintained separately from the Queue or Scheduler table entries forreusability reasons and so that they may be used by both queues andschedulers.  This follows the approach for separation of data pathelements from parameterization that is used throughout this MIB.Use of these Maximum Rate Parameter Table entries by Queues andSchedulers allows the modeling of hierarchical scheduling systems.Specifically, a Scheduler has one or more inputs and one output.Any queue feeding a scheduler, or any scheduler which feeds a secondscheduler, might specify a maximum transfer rate by pointing to aMaximum Rate Parameter Table entry. Multi-rate shapers, such as a


Dual Leaky Bucket algorithm, specify their rates using multipleMaximum Rate Parameter Entries with the same diffServMaxRateId butdifferent diffServMaxRateLevels.The diffServMaxRateLevel/Abs/Rel attributes are used asparameters to the non-work-conserving portion of a scheduler:non-work-conserving implies that the scheduler may sometimes notemit a packet, even if there is data available at its input(s).This has the effect of limiting the servicing of the queue/schedulerinput or output, in effect performing shaping of the packet streampassing through the queue/scheduler, as described in the InformalDifferentiated Services Model section 7.2.*/
                public final DiffServMaxRateNextFreeEnt diffServMaxRateNextFree;

                public final DiffServMaxRateTableEnt diffServMaxRateTable;

                private DiffServSchedulerEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServScheduler", "1.3.6.1.2.1.97.1.8", false, false, false, false);
                    this.diffServSchedulerNextFree = new DiffServSchedulerNextFreeEnt(mib, this);
                    this.diffServSchedulerTable = new DiffServSchedulerTableEnt(mib, this);
                    this.diffServMinRateNextFree = new DiffServMinRateNextFreeEnt(mib, this);
                    this.diffServMinRateTable = new DiffServMinRateTableEnt(mib, this);
                    this.diffServMaxRateNextFree = new DiffServMaxRateNextFreeEnt(mib, this);
                    this.diffServMaxRateTable = new DiffServMaxRateTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServSchedulerNextFree,
                        this.diffServSchedulerTable,
                        this.diffServMinRateNextFree,
                        this.diffServMinRateTable,
                        this.diffServMaxRateNextFree,
                        this.diffServMaxRateTable
                    };
                }
                public static final class DiffServSchedulerNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServSchedulerNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServSchedulerNextFree", "1.3.6.1.2.1.97.1.8.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServSchedulerTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServSchedulerEntryEnt diffServSchedulerEntry;

                    private DiffServSchedulerTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServSchedulerTable", "1.3.6.1.2.1.97.1.8.2", false, true, false, false);
                        this.diffServSchedulerEntry = new DiffServSchedulerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServSchedulerEntry
                        };
                    }
                    public static final class DiffServSchedulerEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServSchedulerIdEnt diffServSchedulerId;

                        public final DiffServSchedulerNextEnt diffServSchedulerNext;

                        public final DiffServSchedulerMethodEnt diffServSchedulerMethod;

                        public final DiffServSchedulerMinRateEnt diffServSchedulerMinRate;

                        public final DiffServSchedulerMaxRateEnt diffServSchedulerMaxRate;

                        public final DiffServSchedulerStorageEnt diffServSchedulerStorage;

                        public final DiffServSchedulerStatusEnt diffServSchedulerStatus;

                        private DiffServSchedulerEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServSchedulerEntry", "1.3.6.1.2.1.97.1.8.2.1", false, false, false, true);
                            this.diffServSchedulerId = new DiffServSchedulerIdEnt(mib, this);
                            this.diffServSchedulerNext = new DiffServSchedulerNextEnt(mib, this);
                            this.diffServSchedulerMethod = new DiffServSchedulerMethodEnt(mib, this);
                            this.diffServSchedulerMinRate = new DiffServSchedulerMinRateEnt(mib, this);
                            this.diffServSchedulerMaxRate = new DiffServSchedulerMaxRateEnt(mib, this);
                            this.diffServSchedulerStorage = new DiffServSchedulerStorageEnt(mib, this);
                            this.diffServSchedulerStatus = new DiffServSchedulerStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServSchedulerId,
                                this.diffServSchedulerNext,
                                this.diffServSchedulerMethod,
                                this.diffServSchedulerMinRate,
                                this.diffServSchedulerMaxRate,
                                this.diffServSchedulerStorage,
                                this.diffServSchedulerStatus
                            };
                        }
                        public static final class DiffServSchedulerIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerId", "1.3.6.1.2.1.97.1.8.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServSchedulerNextEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerNextEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerNext", "1.3.6.1.2.1.97.1.8.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServSchedulerMethodEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerMethodEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerMethod", "1.3.6.1.2.1.97.1.8.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServSchedulerMinRateEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerMinRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerMinRate", "1.3.6.1.2.1.97.1.8.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServSchedulerMaxRateEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerMaxRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerMaxRate", "1.3.6.1.2.1.97.1.8.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServSchedulerStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerStorage", "1.3.6.1.2.1.97.1.8.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServSchedulerStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServSchedulerStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServSchedulerStatus", "1.3.6.1.2.1.97.1.8.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServMinRateNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMinRateNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMinRateNextFree", "1.3.6.1.2.1.97.1.8.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMinRateTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServMinRateEntryEnt diffServMinRateEntry;

                    private DiffServMinRateTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMinRateTable", "1.3.6.1.2.1.97.1.8.4", false, true, false, false);
                        this.diffServMinRateEntry = new DiffServMinRateEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServMinRateEntry
                        };
                    }
                    public static final class DiffServMinRateEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServMinRateIdEnt diffServMinRateId;

                        public final DiffServMinRatePriorityEnt diffServMinRatePriority;

                        public final DiffServMinRateAbsoluteEnt diffServMinRateAbsolute;

                        public final DiffServMinRateRelativeEnt diffServMinRateRelative;

                        public final DiffServMinRateStorageEnt diffServMinRateStorage;

                        public final DiffServMinRateStatusEnt diffServMinRateStatus;

                        private DiffServMinRateEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServMinRateEntry", "1.3.6.1.2.1.97.1.8.4.1", false, false, false, true);
                            this.diffServMinRateId = new DiffServMinRateIdEnt(mib, this);
                            this.diffServMinRatePriority = new DiffServMinRatePriorityEnt(mib, this);
                            this.diffServMinRateAbsolute = new DiffServMinRateAbsoluteEnt(mib, this);
                            this.diffServMinRateRelative = new DiffServMinRateRelativeEnt(mib, this);
                            this.diffServMinRateStorage = new DiffServMinRateStorageEnt(mib, this);
                            this.diffServMinRateStatus = new DiffServMinRateStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServMinRateId,
                                this.diffServMinRatePriority,
                                this.diffServMinRateAbsolute,
                                this.diffServMinRateRelative,
                                this.diffServMinRateStorage,
                                this.diffServMinRateStatus
                            };
                        }
                        public static final class DiffServMinRateIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMinRateIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMinRateId", "1.3.6.1.2.1.97.1.8.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMinRatePriorityEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMinRatePriorityEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMinRatePriority", "1.3.6.1.2.1.97.1.8.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMinRateAbsoluteEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMinRateAbsoluteEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMinRateAbsolute", "1.3.6.1.2.1.97.1.8.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMinRateRelativeEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMinRateRelativeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMinRateRelative", "1.3.6.1.2.1.97.1.8.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMinRateStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMinRateStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMinRateStorage", "1.3.6.1.2.1.97.1.8.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMinRateStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMinRateStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMinRateStatus", "1.3.6.1.2.1.97.1.8.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DiffServMaxRateNextFreeEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMaxRateNextFreeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMaxRateNextFree", "1.3.6.1.2.1.97.1.8.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMaxRateTableEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    public final DiffServMaxRateEntryEnt diffServMaxRateEntry;

                    private DiffServMaxRateTableEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMaxRateTable", "1.3.6.1.2.1.97.1.8.6", false, true, false, false);
                        this.diffServMaxRateEntry = new DiffServMaxRateEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServMaxRateEntry
                        };
                    }
                    public static final class DiffServMaxRateEntryEnt extends MIBEntry<DIFFSERVMIBDef>
                    {
                        public final DiffServMaxRateIdEnt diffServMaxRateId;

                        public final DiffServMaxRateLevelEnt diffServMaxRateLevel;

                        public final DiffServMaxRateAbsoluteEnt diffServMaxRateAbsolute;

                        public final DiffServMaxRateRelativeEnt diffServMaxRateRelative;

                        public final DiffServMaxRateThresholdEnt diffServMaxRateThreshold;

                        public final DiffServMaxRateStorageEnt diffServMaxRateStorage;

                        public final DiffServMaxRateStatusEnt diffServMaxRateStatus;

                        private DiffServMaxRateEntryEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                        {
                            super(mib, parent, "diffServMaxRateEntry", "1.3.6.1.2.1.97.1.8.6.1", false, false, false, true);
                            this.diffServMaxRateId = new DiffServMaxRateIdEnt(mib, this);
                            this.diffServMaxRateLevel = new DiffServMaxRateLevelEnt(mib, this);
                            this.diffServMaxRateAbsolute = new DiffServMaxRateAbsoluteEnt(mib, this);
                            this.diffServMaxRateRelative = new DiffServMaxRateRelativeEnt(mib, this);
                            this.diffServMaxRateThreshold = new DiffServMaxRateThresholdEnt(mib, this);
                            this.diffServMaxRateStorage = new DiffServMaxRateStorageEnt(mib, this);
                            this.diffServMaxRateStatus = new DiffServMaxRateStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.diffServMaxRateId,
                                this.diffServMaxRateLevel,
                                this.diffServMaxRateAbsolute,
                                this.diffServMaxRateRelative,
                                this.diffServMaxRateThreshold,
                                this.diffServMaxRateStorage,
                                this.diffServMaxRateStatus
                            };
                        }
                        public static final class DiffServMaxRateIdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateIdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateId", "1.3.6.1.2.1.97.1.8.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMaxRateLevelEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateLevelEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateLevel", "1.3.6.1.2.1.97.1.8.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMaxRateAbsoluteEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateAbsoluteEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateAbsolute", "1.3.6.1.2.1.97.1.8.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMaxRateRelativeEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateRelativeEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateRelative", "1.3.6.1.2.1.97.1.8.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMaxRateThresholdEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateThresholdEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateThreshold", "1.3.6.1.2.1.97.1.8.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMaxRateStorageEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateStorageEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateStorage", "1.3.6.1.2.1.97.1.8.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DiffServMaxRateStatusEnt extends MIBEntry<DIFFSERVMIBDef>
                        {
                            private DiffServMaxRateStatusEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                            {
                                super(mib, parent, "diffServMaxRateStatus", "1.3.6.1.2.1.97.1.8.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DiffServMIBConformanceEnt extends MIBEntry<DIFFSERVMIBDef>
        {
            /** MIB Compliance statements.*/
            public final DiffServMIBCompliancesEnt diffServMIBCompliances;

            public final DiffServMIBGroupsEnt diffServMIBGroups;

            private DiffServMIBConformanceEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
            {
                super(mib, parent, "diffServMIBConformance", "1.3.6.1.2.1.97.2", false, false, false, false);
                this.diffServMIBCompliances = new DiffServMIBCompliancesEnt(mib, this);
                this.diffServMIBGroups = new DiffServMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.diffServMIBCompliances,
                    this.diffServMIBGroups
                };
            }
            public static final class DiffServMIBCompliancesEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                /** The interfaces MIB, RFC2863*/
                public final DiffServMIBFullComplianceEnt diffServMIBFullCompliance;

                /** Read-Only Compliance

The interfaces MIB, RFC2863*/
                public final DiffServMIBReadOnlyComplianceEnt diffServMIBReadOnlyCompliance;

                private DiffServMIBCompliancesEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServMIBCompliances", "1.3.6.1.2.1.97.2.1", false, false, false, false);
                    this.diffServMIBFullCompliance = new DiffServMIBFullComplianceEnt(mib, this);
                    this.diffServMIBReadOnlyCompliance = new DiffServMIBReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServMIBFullCompliance,
                        this.diffServMIBReadOnlyCompliance
                    };
                }
                public static final class DiffServMIBFullComplianceEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBFullComplianceEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBFullCompliance", "1.3.6.1.2.1.97.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBReadOnlyComplianceEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBReadOnlyComplianceEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBReadOnlyCompliance", "1.3.6.1.2.1.97.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DiffServMIBGroupsEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                public final DiffServMIBDataPathGroupEnt diffServMIBDataPathGroup;

                public final DiffServMIBClfrGroupEnt diffServMIBClfrGroup;

                public final DiffServMIBClfrElementGroupEnt diffServMIBClfrElementGroup;

                public final DiffServMIBMultiFieldClfrGroupEnt diffServMIBMultiFieldClfrGroup;

                public final DiffServMIBMeterGroupEnt diffServMIBMeterGroup;

                public final DiffServMIBTBParamGroupEnt diffServMIBTBParamGroup;

                public final DiffServMIBActionGroupEnt diffServMIBActionGroup;

                public final DiffServMIBDscpMarkActGroupEnt diffServMIBDscpMarkActGroup;

                public final DiffServMIBCounterGroupEnt diffServMIBCounterGroup;

                public final DiffServMIBAlgDropGroupEnt diffServMIBAlgDropGroup;

                public final DiffServMIBRandomDropGroupEnt diffServMIBRandomDropGroup;

                public final DiffServMIBQGroupEnt diffServMIBQGroup;

                public final DiffServMIBSchedulerGroupEnt diffServMIBSchedulerGroup;

                public final DiffServMIBMinRateGroupEnt diffServMIBMinRateGroup;

                public final DiffServMIBMaxRateGroupEnt diffServMIBMaxRateGroup;

                private DiffServMIBGroupsEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServMIBGroups", "1.3.6.1.2.1.97.2.2", false, false, false, false);
                    this.diffServMIBDataPathGroup = new DiffServMIBDataPathGroupEnt(mib, this);
                    this.diffServMIBClfrGroup = new DiffServMIBClfrGroupEnt(mib, this);
                    this.diffServMIBClfrElementGroup = new DiffServMIBClfrElementGroupEnt(mib, this);
                    this.diffServMIBMultiFieldClfrGroup = new DiffServMIBMultiFieldClfrGroupEnt(mib, this);
                    this.diffServMIBMeterGroup = new DiffServMIBMeterGroupEnt(mib, this);
                    this.diffServMIBTBParamGroup = new DiffServMIBTBParamGroupEnt(mib, this);
                    this.diffServMIBActionGroup = new DiffServMIBActionGroupEnt(mib, this);
                    this.diffServMIBDscpMarkActGroup = new DiffServMIBDscpMarkActGroupEnt(mib, this);
                    this.diffServMIBCounterGroup = new DiffServMIBCounterGroupEnt(mib, this);
                    this.diffServMIBAlgDropGroup = new DiffServMIBAlgDropGroupEnt(mib, this);
                    this.diffServMIBRandomDropGroup = new DiffServMIBRandomDropGroupEnt(mib, this);
                    this.diffServMIBQGroup = new DiffServMIBQGroupEnt(mib, this);
                    this.diffServMIBSchedulerGroup = new DiffServMIBSchedulerGroupEnt(mib, this);
                    this.diffServMIBMinRateGroup = new DiffServMIBMinRateGroupEnt(mib, this);
                    this.diffServMIBMaxRateGroup = new DiffServMIBMaxRateGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServMIBDataPathGroup,
                        this.diffServMIBClfrGroup,
                        this.diffServMIBClfrElementGroup,
                        this.diffServMIBMultiFieldClfrGroup,
                        this.diffServMIBMeterGroup,
                        this.diffServMIBTBParamGroup,
                        this.diffServMIBActionGroup,
                        this.diffServMIBDscpMarkActGroup,
                        this.diffServMIBCounterGroup,
                        this.diffServMIBAlgDropGroup,
                        this.diffServMIBRandomDropGroup,
                        this.diffServMIBQGroup,
                        this.diffServMIBSchedulerGroup,
                        this.diffServMIBMinRateGroup,
                        this.diffServMIBMaxRateGroup
                    };
                }
                public static final class DiffServMIBDataPathGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBDataPathGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBDataPathGroup", "1.3.6.1.2.1.97.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBClfrGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBClfrGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBClfrGroup", "1.3.6.1.2.1.97.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBClfrElementGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBClfrElementGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBClfrElementGroup", "1.3.6.1.2.1.97.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBMultiFieldClfrGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBMultiFieldClfrGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBMultiFieldClfrGroup", "1.3.6.1.2.1.97.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBMeterGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBMeterGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBMeterGroup", "1.3.6.1.2.1.97.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBTBParamGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBTBParamGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBTBParamGroup", "1.3.6.1.2.1.97.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBActionGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBActionGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBActionGroup", "1.3.6.1.2.1.97.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBDscpMarkActGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBDscpMarkActGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBDscpMarkActGroup", "1.3.6.1.2.1.97.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBCounterGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBCounterGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBCounterGroup", "1.3.6.1.2.1.97.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBAlgDropGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBAlgDropGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBAlgDropGroup", "1.3.6.1.2.1.97.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBRandomDropGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBRandomDropGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBRandomDropGroup", "1.3.6.1.2.1.97.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBQGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBQGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBQGroup", "1.3.6.1.2.1.97.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBSchedulerGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBSchedulerGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBSchedulerGroup", "1.3.6.1.2.1.97.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBMinRateGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBMinRateGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBMinRateGroup", "1.3.6.1.2.1.97.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServMIBMaxRateGroupEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServMIBMaxRateGroupEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServMIBMaxRateGroup", "1.3.6.1.2.1.97.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DiffServMIBAdminEnt extends MIBEntry<DIFFSERVMIBDef>
        {
            /** OIDs for diffServTBParamType definitions.*/
            public final DiffServTBMetersEnt diffServTBMeters;

            /** OIDs for diffServTBParamType definitions.*/
            public final DiffServSchedulersEnt diffServSchedulers;

            private DiffServMIBAdminEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
            {
                super(mib, parent, "diffServMIBAdmin", "1.3.6.1.2.1.97.3", false, false, false, false);
                this.diffServTBMeters = new DiffServTBMetersEnt(mib, this);
                this.diffServSchedulers = new DiffServSchedulersEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.diffServTBMeters,
                    this.diffServSchedulers
                };
            }
            public static final class DiffServTBMetersEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                public final DiffServTBParamSimpleTokenBucketEnt diffServTBParamSimpleTokenBucket;

                public final DiffServTBParamAvgRateEnt diffServTBParamAvgRate;

                public final DiffServTBParamSrTCMBlindEnt diffServTBParamSrTCMBlind;

                public final DiffServTBParamSrTCMAwareEnt diffServTBParamSrTCMAware;

                public final DiffServTBParamTrTCMBlindEnt diffServTBParamTrTCMBlind;

                public final DiffServTBParamTrTCMAwareEnt diffServTBParamTrTCMAware;

                public final DiffServTBParamTswTCMEnt diffServTBParamTswTCM;

                private DiffServTBMetersEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServTBMeters", "1.3.6.1.2.1.97.3.1", false, false, false, false);
                    this.diffServTBParamSimpleTokenBucket = new DiffServTBParamSimpleTokenBucketEnt(mib, this);
                    this.diffServTBParamAvgRate = new DiffServTBParamAvgRateEnt(mib, this);
                    this.diffServTBParamSrTCMBlind = new DiffServTBParamSrTCMBlindEnt(mib, this);
                    this.diffServTBParamSrTCMAware = new DiffServTBParamSrTCMAwareEnt(mib, this);
                    this.diffServTBParamTrTCMBlind = new DiffServTBParamTrTCMBlindEnt(mib, this);
                    this.diffServTBParamTrTCMAware = new DiffServTBParamTrTCMAwareEnt(mib, this);
                    this.diffServTBParamTswTCM = new DiffServTBParamTswTCMEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServTBParamSimpleTokenBucket,
                        this.diffServTBParamAvgRate,
                        this.diffServTBParamSrTCMBlind,
                        this.diffServTBParamSrTCMAware,
                        this.diffServTBParamTrTCMBlind,
                        this.diffServTBParamTrTCMAware,
                        this.diffServTBParamTswTCM
                    };
                }
                public static final class DiffServTBParamSimpleTokenBucketEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamSimpleTokenBucketEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamSimpleTokenBucket", "1.3.6.1.2.1.97.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamAvgRateEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamAvgRateEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamAvgRate", "1.3.6.1.2.1.97.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamSrTCMBlindEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamSrTCMBlindEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamSrTCMBlind", "1.3.6.1.2.1.97.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamSrTCMAwareEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamSrTCMAwareEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamSrTCMAware", "1.3.6.1.2.1.97.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamTrTCMBlindEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamTrTCMBlindEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamTrTCMBlind", "1.3.6.1.2.1.97.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamTrTCMAwareEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamTrTCMAwareEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamTrTCMAware", "1.3.6.1.2.1.97.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServTBParamTswTCMEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServTBParamTswTCMEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServTBParamTswTCM", "1.3.6.1.2.1.97.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DiffServSchedulersEnt extends MIBEntry<DIFFSERVMIBDef>
            {
                public final DiffServSchedulerPriorityEnt diffServSchedulerPriority;

                public final DiffServSchedulerWRREnt diffServSchedulerWRR;

                public final DiffServSchedulerWFQEnt diffServSchedulerWFQ;

                private DiffServSchedulersEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                {
                    super(mib, parent, "diffServSchedulers", "1.3.6.1.2.1.97.3.2", false, false, false, false);
                    this.diffServSchedulerPriority = new DiffServSchedulerPriorityEnt(mib, this);
                    this.diffServSchedulerWRR = new DiffServSchedulerWRREnt(mib, this);
                    this.diffServSchedulerWFQ = new DiffServSchedulerWFQEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServSchedulerPriority,
                        this.diffServSchedulerWRR,
                        this.diffServSchedulerWFQ
                    };
                }
                public static final class DiffServSchedulerPriorityEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServSchedulerPriorityEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServSchedulerPriority", "1.3.6.1.2.1.97.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServSchedulerWRREnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServSchedulerWRREnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServSchedulerWRR", "1.3.6.1.2.1.97.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DiffServSchedulerWFQEnt extends MIBEntry<DIFFSERVMIBDef>
                {
                    private DiffServSchedulerWFQEnt(DIFFSERVMIBDef mib, MIBEntry<DIFFSERVMIBDef> parent)
                    {
                        super(mib, parent, "diffServSchedulerWFQ", "1.3.6.1.2.1.97.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
