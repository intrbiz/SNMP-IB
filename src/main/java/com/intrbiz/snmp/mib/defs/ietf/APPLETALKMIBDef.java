package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class APPLETALKMIBDef extends MIB
{
    public static final APPLETALKMIBDef APPLETALKMIB = new APPLETALKMIBDef();

    static { MIBs.getInstance().registerMIB(APPLETALKMIBDef.APPLETALKMIB); }

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in RFC-1212.
The following reference is used in this MIB:[Inside AppleTalk]This refers to Gursharan S. Sidhu, Richard F. Andrews, andAlan B. Oppenheimer, Inside AppleTalk, Second Edition,Addison Wesley, (1990).


AppleTalk MIB*/
    public final AppletalkEnt appletalk;

    private APPLETALKMIBDef()
    {
        super("APPLETALK-MIB");
        this.appletalk = new AppletalkEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.appletalk
        };
    }

    public static final class AppletalkEnt extends MIBEntry<APPLETALKMIBDef>
    {
        public final LlapEnt llap;

        public final AarpEnt aarp;

        public final AtportEnt atport;

        public final DdpEnt ddp;

        public final RtmpEnt rtmp;

        public final KipEnt kip;

        public final ZipRouterEnt zipRouter;

        public final NbpEnt nbp;

        public final AtechoEnt atecho;

        public final AtpEnt atp;

        public final PapEnt pap;

        public final AspEnt asp;

        public final AdspEnt adsp;

        public final AtportptopEnt atportptop;

        public final RtmpStubEnt rtmpStub;

        public final ZipEndNodeEnt zipEndNode;

        public final PerPortEnt perPort;

        private AppletalkEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
        {
            super(mib, parent, "appletalk", "1.3.6.1.2.1.13", false, false, false, false);
            this.llap = new LlapEnt(mib, this);
            this.aarp = new AarpEnt(mib, this);
            this.atport = new AtportEnt(mib, this);
            this.ddp = new DdpEnt(mib, this);
            this.rtmp = new RtmpEnt(mib, this);
            this.kip = new KipEnt(mib, this);
            this.zipRouter = new ZipRouterEnt(mib, this);
            this.nbp = new NbpEnt(mib, this);
            this.atecho = new AtechoEnt(mib, this);
            this.atp = new AtpEnt(mib, this);
            this.pap = new PapEnt(mib, this);
            this.asp = new AspEnt(mib, this);
            this.adsp = new AdspEnt(mib, this);
            this.atportptop = new AtportptopEnt(mib, this);
            this.rtmpStub = new RtmpStubEnt(mib, this);
            this.zipEndNode = new ZipEndNodeEnt(mib, this);
            this.perPort = new PerPortEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.llap,
                this.aarp,
                this.atport,
                this.ddp,
                this.rtmp,
                this.kip,
                this.zipRouter,
                this.nbp,
                this.atecho,
                this.atp,
                this.pap,
                this.asp,
                this.adsp,
                this.atportptop,
                this.rtmpStub,
                this.zipEndNode,
                this.perPort
            };
        }
        public static final class LlapEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The LLAP GroupImplementation of this group is mandatory for allentities that implement LLAPNotes for the interfaces groupWhen implementing the Interfaces Group of MIB-II, it issuggested that the following values be used for anyLocalTalk interfaces:ifMtu: 600ifSpeed: 230000ifPhysAddress: the one octet node number for theparticular interfaceNote also that LLAP control packets should not beincluded in the Interfaces Group packet or octetcounters.*/
            public final LlapTableEnt llapTable;

            private LlapEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "llap", "1.3.6.1.2.1.13.1", false, false, false, false);
                this.llapTable = new LlapTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.llapTable
                };
            }
            public static final class LlapTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final LlapEntryEnt llapEntry;

                private LlapTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "llapTable", "1.3.6.1.2.1.13.1.1", false, true, false, false);
                    this.llapEntry = new LlapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.llapEntry
                    };
                }
                public static final class LlapEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final LlapIfIndexEnt llapIfIndex;

                    /** this object has been deprecated because it duplicates thesum of the MIB-II variables ifInUcastPkts andifInNUcastPkts*/
                    public final LlapInPktsEnt llapInPkts;

                    /** this object has been deprecated because it duplicates thesum of the MIB-II variables ifOutUcastPkts andifOutNUcastPkts*/
                    public final LlapOutPktsEnt llapOutPkts;

                    /** this object has been deprecated because it duplicates theMIB-II variable ifInUnknownProtos*/
                    public final LlapInNoHandlersEnt llapInNoHandlers;

                    public final LlapInLengthErrorsEnt llapInLengthErrors;

                    /** this object has been deprecated because it duplicates theMIB-II variable ifInErrors*/
                    public final LlapInErrorsEnt llapInErrors;

                    public final LlapCollisionsEnt llapCollisions;

                    public final LlapDefersEnt llapDefers;

                    public final LlapNoDataErrorsEnt llapNoDataErrors;

                    public final LlapRandomCTSErrorsEnt llapRandomCTSErrors;

                    public final LlapFCSErrorsEnt llapFCSErrors;

                    private LlapEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "llapEntry", "1.3.6.1.2.1.13.1.1.1", false, false, false, true);
                        this.llapIfIndex = new LlapIfIndexEnt(mib, this);
                        this.llapInPkts = new LlapInPktsEnt(mib, this);
                        this.llapOutPkts = new LlapOutPktsEnt(mib, this);
                        this.llapInNoHandlers = new LlapInNoHandlersEnt(mib, this);
                        this.llapInLengthErrors = new LlapInLengthErrorsEnt(mib, this);
                        this.llapInErrors = new LlapInErrorsEnt(mib, this);
                        this.llapCollisions = new LlapCollisionsEnt(mib, this);
                        this.llapDefers = new LlapDefersEnt(mib, this);
                        this.llapNoDataErrors = new LlapNoDataErrorsEnt(mib, this);
                        this.llapRandomCTSErrors = new LlapRandomCTSErrorsEnt(mib, this);
                        this.llapFCSErrors = new LlapFCSErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.llapIfIndex,
                            this.llapInPkts,
                            this.llapOutPkts,
                            this.llapInNoHandlers,
                            this.llapInLengthErrors,
                            this.llapInErrors,
                            this.llapCollisions,
                            this.llapDefers,
                            this.llapNoDataErrors,
                            this.llapRandomCTSErrors,
                            this.llapFCSErrors
                        };
                    }
                    public static final class LlapIfIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapIfIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapIfIndex", "1.3.6.1.2.1.13.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapInPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapInPkts", "1.3.6.1.2.1.13.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapOutPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapOutPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapOutPkts", "1.3.6.1.2.1.13.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInNoHandlersEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapInNoHandlersEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapInNoHandlers", "1.3.6.1.2.1.13.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInLengthErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapInLengthErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapInLengthErrors", "1.3.6.1.2.1.13.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapInErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapInErrors", "1.3.6.1.2.1.13.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapCollisionsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapCollisionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapCollisions", "1.3.6.1.2.1.13.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapDefersEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapDefersEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapDefers", "1.3.6.1.2.1.13.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapNoDataErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapNoDataErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapNoDataErrors", "1.3.6.1.2.1.13.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapRandomCTSErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapRandomCTSErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapRandomCTSErrors", "1.3.6.1.2.1.13.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapFCSErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private LlapFCSErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "llapFCSErrors", "1.3.6.1.2.1.13.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AarpEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The AARP GroupImplementation of this group is mandatory for all entitiesthat implement AARP*/
            public final AarpTableEnt aarpTable;

            public final AarpLookupsEnt aarpLookups;

            public final AarpHitsEnt aarpHits;

            private AarpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "aarp", "1.3.6.1.2.1.13.2", false, false, false, false);
                this.aarpTable = new AarpTableEnt(mib, this);
                this.aarpLookups = new AarpLookupsEnt(mib, this);
                this.aarpHits = new AarpHitsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aarpTable,
                    this.aarpLookups,
                    this.aarpHits
                };
            }
            public static final class AarpTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AarpEntryEnt aarpEntry;

                private AarpTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aarpTable", "1.3.6.1.2.1.13.2.1", false, true, false, false);
                    this.aarpEntry = new AarpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aarpEntry
                    };
                }
                public static final class AarpEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AarpIfIndexEnt aarpIfIndex;

                    public final AarpPhysAddressEnt aarpPhysAddress;

                    public final AarpNetAddressEnt aarpNetAddress;

                    public final AarpStatusEnt aarpStatus;

                    private AarpEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "aarpEntry", "1.3.6.1.2.1.13.2.1.1", false, false, false, true);
                        this.aarpIfIndex = new AarpIfIndexEnt(mib, this);
                        this.aarpPhysAddress = new AarpPhysAddressEnt(mib, this);
                        this.aarpNetAddress = new AarpNetAddressEnt(mib, this);
                        this.aarpStatus = new AarpStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.aarpIfIndex,
                            this.aarpPhysAddress,
                            this.aarpNetAddress,
                            this.aarpStatus
                        };
                    }
                    public static final class AarpIfIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AarpIfIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aarpIfIndex", "1.3.6.1.2.1.13.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AarpPhysAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AarpPhysAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aarpPhysAddress", "1.3.6.1.2.1.13.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AarpNetAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AarpNetAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aarpNetAddress", "1.3.6.1.2.1.13.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AarpStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AarpStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aarpStatus", "1.3.6.1.2.1.13.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AarpLookupsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AarpLookupsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aarpLookups", "1.3.6.1.2.1.13.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AarpHitsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AarpHitsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aarpHits", "1.3.6.1.2.1.13.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class AtportEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ATPort GroupImplementation of this group is mandatory for all entitiesthat implement AppleTalk portsNote that to be compliant with this group, all variablesthat have read-write access must be implemented asread-write.*/
            public final AtportTableEnt atportTable;

            /** The atportZoneTable stores information about the zonesassociated with each port.  The default zone for eachport is stored in the port's atportZoneDefault variable;all other zones for the port are listed in this table.If a port only has one zone, it should be stored in theport's atportZoneDefault variable, and this table shouldbe empty.One of the indexes for this table is atportZoneName.Even though AppleTalk zone name matches arecase-insensitive, this table will store zone namesregardless of case.  SNMP Get, GetNext and Set operationsare performed on these (potentially) mixed case stringsaccording to the normal SNMP rules with the followingcaveat: in processing a SET request, the agent shallperform a case-insensitive search and a case-sensitivesearch.  If the case-insensitive search matches and thecase-sensitive search does not match, the "equivalent"zone name exists in another entry with a differentcapitalization and the SET request shall fail dueto the name being inconsistent (SNMPv1 should return agenErr.) This insures that only one version of a zonename will appear in each agent, at the expense of forcinga management station to query using that exact name.*/
            public final AtportZoneTableEnt atportZoneTable;

            private AtportEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "atport", "1.3.6.1.2.1.13.3", false, false, false, false);
                this.atportTable = new AtportTableEnt(mib, this);
                this.atportZoneTable = new AtportZoneTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atportTable,
                    this.atportZoneTable
                };
            }
            public static final class AtportTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AtportEntryEnt atportEntry;

                private AtportTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atportTable", "1.3.6.1.2.1.13.3.1", false, true, false, false);
                    this.atportEntry = new AtportEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atportEntry
                    };
                }
                public static final class AtportEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AtportIndexEnt atportIndex;

                    public final AtportDescrEnt atportDescr;

                    /** Several objects throughout the MIB key off of atportType todetermine the format of OCTET STRING addresses of peers.The address formats are as follows:localtalk, ethertalk1, ethertalk2, tokentalk, iptalk,fdditalk, smdstalk, arctalk, and virtual take theformat of DdpNodeAddressserialPPP: null OCTET STRINGserialNonstandard: vendor specificaurp: see AURP MIB to determine formatframeRelay: 32 bit DLCI in network byte order(OCTET STRING (SIZE (4)))x25: X121Address (see RFC 1382)ip: IP address (OCTET STRING (SIZE (4)))osi: NSAP (OCTET STRING (SIZE (3..20)))decnetIV: 6 bit area, 10 bit host in network byte order(OCTET STRING (SIZE (2)))arap: ???nonAppleTalk3Com: based on ifTypeipx: 32 bit network number in network byte orderfollowed by datalink address of hostarns: 32 bit ARNS headerhdlc: DdpNodeAddress or null OCTET STRING*/
                    public final AtportTypeEnt atportType;

                    public final AtportNetStartEnt atportNetStart;

                    public final AtportNetEndEnt atportNetEnd;

                    public final AtportNetAddressEnt atportNetAddress;

                    public final AtportStatusEnt atportStatus;

                    public final AtportNetConfigEnt atportNetConfig;

                    public final AtportZoneConfigEnt atportZoneConfig;

                    public final AtportZoneDefaultEnt atportZoneDefault;

                    public final AtportIfIndexEnt atportIfIndex;

                    public final AtportNetFromEnt atportNetFrom;

                    public final AtportZoneFromEnt atportZoneFrom;

                    public final AtportInPktsEnt atportInPkts;

                    public final AtportOutPktsEnt atportOutPkts;

                    public final AtportHomeEnt atportHome;

                    public final AtportCurrentZoneEnt atportCurrentZone;

                    public final AtportConflictPhysAddrEnt atportConflictPhysAddr;

                    private AtportEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "atportEntry", "1.3.6.1.2.1.13.3.1.1", false, false, false, true);
                        this.atportIndex = new AtportIndexEnt(mib, this);
                        this.atportDescr = new AtportDescrEnt(mib, this);
                        this.atportType = new AtportTypeEnt(mib, this);
                        this.atportNetStart = new AtportNetStartEnt(mib, this);
                        this.atportNetEnd = new AtportNetEndEnt(mib, this);
                        this.atportNetAddress = new AtportNetAddressEnt(mib, this);
                        this.atportStatus = new AtportStatusEnt(mib, this);
                        this.atportNetConfig = new AtportNetConfigEnt(mib, this);
                        this.atportZoneConfig = new AtportZoneConfigEnt(mib, this);
                        this.atportZoneDefault = new AtportZoneDefaultEnt(mib, this);
                        this.atportIfIndex = new AtportIfIndexEnt(mib, this);
                        this.atportNetFrom = new AtportNetFromEnt(mib, this);
                        this.atportZoneFrom = new AtportZoneFromEnt(mib, this);
                        this.atportInPkts = new AtportInPktsEnt(mib, this);
                        this.atportOutPkts = new AtportOutPktsEnt(mib, this);
                        this.atportHome = new AtportHomeEnt(mib, this);
                        this.atportCurrentZone = new AtportCurrentZoneEnt(mib, this);
                        this.atportConflictPhysAddr = new AtportConflictPhysAddrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atportIndex,
                            this.atportDescr,
                            this.atportType,
                            this.atportNetStart,
                            this.atportNetEnd,
                            this.atportNetAddress,
                            this.atportStatus,
                            this.atportNetConfig,
                            this.atportZoneConfig,
                            this.atportZoneDefault,
                            this.atportIfIndex,
                            this.atportNetFrom,
                            this.atportZoneFrom,
                            this.atportInPkts,
                            this.atportOutPkts,
                            this.atportHome,
                            this.atportCurrentZone,
                            this.atportConflictPhysAddr
                        };
                    }
                    public static final class AtportIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportIndex", "1.3.6.1.2.1.13.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportDescrEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportDescrEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportDescr", "1.3.6.1.2.1.13.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportTypeEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportTypeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportType", "1.3.6.1.2.1.13.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetStartEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportNetStartEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportNetStart", "1.3.6.1.2.1.13.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetEndEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportNetEndEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportNetEnd", "1.3.6.1.2.1.13.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportNetAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportNetAddress", "1.3.6.1.2.1.13.3.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportStatus", "1.3.6.1.2.1.13.3.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetConfigEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportNetConfigEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportNetConfig", "1.3.6.1.2.1.13.3.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneConfigEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportZoneConfigEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportZoneConfig", "1.3.6.1.2.1.13.3.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneDefaultEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportZoneDefaultEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportZoneDefault", "1.3.6.1.2.1.13.3.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportIfIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportIfIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportIfIndex", "1.3.6.1.2.1.13.3.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetFromEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportNetFromEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportNetFrom", "1.3.6.1.2.1.13.3.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneFromEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportZoneFromEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportZoneFrom", "1.3.6.1.2.1.13.3.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportInPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportInPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportInPkts", "1.3.6.1.2.1.13.3.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportOutPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportOutPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportOutPkts", "1.3.6.1.2.1.13.3.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportHomeEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportHomeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportHome", "1.3.6.1.2.1.13.3.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportCurrentZoneEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportCurrentZoneEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportCurrentZone", "1.3.6.1.2.1.13.3.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportConflictPhysAddrEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportConflictPhysAddrEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportConflictPhysAddr", "1.3.6.1.2.1.13.3.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtportZoneTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AtportZoneEntryEnt atportZoneEntry;

                private AtportZoneTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atportZoneTable", "1.3.6.1.2.1.13.3.2", false, true, false, false);
                    this.atportZoneEntry = new AtportZoneEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atportZoneEntry
                    };
                }
                public static final class AtportZoneEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AtportZonePortEnt atportZonePort;

                    public final AtportZoneNameEnt atportZoneName;

                    public final AtportZoneStatusEnt atportZoneStatus;

                    private AtportZoneEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "atportZoneEntry", "1.3.6.1.2.1.13.3.2.1", false, false, false, true);
                        this.atportZonePort = new AtportZonePortEnt(mib, this);
                        this.atportZoneName = new AtportZoneNameEnt(mib, this);
                        this.atportZoneStatus = new AtportZoneStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atportZonePort,
                            this.atportZoneName,
                            this.atportZoneStatus
                        };
                    }
                    public static final class AtportZonePortEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportZonePortEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportZonePort", "1.3.6.1.2.1.13.3.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneNameEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportZoneNameEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportZoneName", "1.3.6.1.2.1.13.3.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportZoneStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportZoneStatus", "1.3.6.1.2.1.13.3.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class DdpEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The DDP GroupImplementation of this group is mandatory for allentities that implement DDPThis group consists of DDP variables that would beimplemented by either a router or an end node.  Thefollowing variables are included:ddpOutRequestsddpOutShortsddpOutLongsddpInReceivesddpInLocalDatagramsddpNoProtocolHandlersddpTooShortErrorsddpTooLongErrorsddpShortDDPErrorsddpChecksumErrorsddpListenerTableNote that the variables in this group are not numberedsequentially.  This was done so that it was not necessaryto deprecate variables from RFC 1243.*/
            public final DdpOutRequestsEnt ddpOutRequests;

            public final DdpOutShortsEnt ddpOutShorts;

            public final DdpOutLongsEnt ddpOutLongs;

            public final DdpInReceivesEnt ddpInReceives;

            public final DdpInLocalDatagramsEnt ddpInLocalDatagrams;

            public final DdpNoProtocolHandlersEnt ddpNoProtocolHandlers;

            public final DdpTooShortErrorsEnt ddpTooShortErrors;

            public final DdpTooLongErrorsEnt ddpTooLongErrors;

            public final DdpShortDDPErrorsEnt ddpShortDDPErrors;

            public final DdpChecksumErrorsEnt ddpChecksumErrors;

            public final DdpListenerTableEnt ddpListenerTable;

            /** The DDP Router GroupImplementation of this group is required for all routerswhich implement DDPThis group consists of DDP variables that only a routerwould implement.  The following variables are included:ddpForwRequestsddpOutNoRoutesddpBroadcastErrorsddpHopCountErrorsddpForwardingTableNote that the variables in this group are not numberedsequentially.  This was done so that variables fromRFC 1243 did not need to be deprecated.*/
            public final DdpForwRequestsEnt ddpForwRequests;

            public final DdpOutNoRoutesEnt ddpOutNoRoutes;

            public final DdpBroadcastErrorsEnt ddpBroadcastErrors;

            public final DdpHopCountErrorsEnt ddpHopCountErrors;

            /** The ddpForwardingTable is a read-only table which shows thenext hop that a datagram will take when being routed to aspecific network.  If a manager wishes to change data inthis table via SNMP, he must change it in the MIB for therouting protocol itself (by incrementing hop counts,etc), rather than in this table.  This table is derivedby the managed entity from the information it receivesfrom the routing protocols that it supports.This table also shows the routing table from which the nexthop was derived.  When a MIB is written for an AppleTalkrouting protocol, it should include the definition of anobject identifier which will be used in theddpForwardingProto variable defined here.  (For example,a value for RTMP is defined as { ddp-forw-proto-oids 1 }
below.)To look for a specific net N in this table, it is suggestedthat the management station perform a get-next query forddpForwardingNetEnd.(N-1).  This will retrieve the correctrow if it exists in the table.*/
            public final DdpForwardingTableEnt ddpForwardingTable;

            public final DdpForwProtoOidsEnt ddpForwProtoOids;

            public final DdpForwardingTableOverflowsEnt ddpForwardingTableOverflows;

            private DdpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "ddp", "1.3.6.1.2.1.13.4", false, false, false, false);
                this.ddpOutRequests = new DdpOutRequestsEnt(mib, this);
                this.ddpOutShorts = new DdpOutShortsEnt(mib, this);
                this.ddpOutLongs = new DdpOutLongsEnt(mib, this);
                this.ddpInReceives = new DdpInReceivesEnt(mib, this);
                this.ddpInLocalDatagrams = new DdpInLocalDatagramsEnt(mib, this);
                this.ddpNoProtocolHandlers = new DdpNoProtocolHandlersEnt(mib, this);
                this.ddpTooShortErrors = new DdpTooShortErrorsEnt(mib, this);
                this.ddpTooLongErrors = new DdpTooLongErrorsEnt(mib, this);
                this.ddpShortDDPErrors = new DdpShortDDPErrorsEnt(mib, this);
                this.ddpChecksumErrors = new DdpChecksumErrorsEnt(mib, this);
                this.ddpListenerTable = new DdpListenerTableEnt(mib, this);
                this.ddpForwRequests = new DdpForwRequestsEnt(mib, this);
                this.ddpOutNoRoutes = new DdpOutNoRoutesEnt(mib, this);
                this.ddpBroadcastErrors = new DdpBroadcastErrorsEnt(mib, this);
                this.ddpHopCountErrors = new DdpHopCountErrorsEnt(mib, this);
                this.ddpForwardingTable = new DdpForwardingTableEnt(mib, this);
                this.ddpForwProtoOids = new DdpForwProtoOidsEnt(mib, this);
                this.ddpForwardingTableOverflows = new DdpForwardingTableOverflowsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ddpOutRequests,
                    this.ddpOutShorts,
                    this.ddpOutLongs,
                    this.ddpInReceives,
                    this.ddpInLocalDatagrams,
                    this.ddpNoProtocolHandlers,
                    this.ddpTooShortErrors,
                    this.ddpTooLongErrors,
                    this.ddpShortDDPErrors,
                    this.ddpChecksumErrors,
                    this.ddpListenerTable,
                    this.ddpForwRequests,
                    this.ddpOutNoRoutes,
                    this.ddpBroadcastErrors,
                    this.ddpHopCountErrors,
                    this.ddpForwardingTable,
                    this.ddpForwProtoOids,
                    this.ddpForwardingTableOverflows
                };
            }
            public static final class DdpOutRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpOutRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpOutRequests", "1.3.6.1.2.1.13.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpOutShortsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpOutShortsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpOutShorts", "1.3.6.1.2.1.13.4.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpOutLongsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpOutLongsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpOutLongs", "1.3.6.1.2.1.13.4.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpInReceivesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpInReceivesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpInReceives", "1.3.6.1.2.1.13.4.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpInLocalDatagramsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpInLocalDatagramsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpInLocalDatagrams", "1.3.6.1.2.1.13.4.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpNoProtocolHandlersEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpNoProtocolHandlersEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpNoProtocolHandlers", "1.3.6.1.2.1.13.4.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpTooShortErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpTooShortErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpTooShortErrors", "1.3.6.1.2.1.13.4.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpTooLongErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpTooLongErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpTooLongErrors", "1.3.6.1.2.1.13.4.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpShortDDPErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpShortDDPErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpShortDDPErrors", "1.3.6.1.2.1.13.4.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpChecksumErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpChecksumErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpChecksumErrors", "1.3.6.1.2.1.13.4.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpListenerTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final DdpListenerEntryEnt ddpListenerEntry;

                private DdpListenerTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpListenerTable", "1.3.6.1.2.1.13.4.15", false, true, false, false);
                    this.ddpListenerEntry = new DdpListenerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ddpListenerEntry
                    };
                }
                public static final class DdpListenerEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final DdpListenerAddressEnt ddpListenerAddress;

                    public final DdpListenerInPktsEnt ddpListenerInPkts;

                    public final DdpListenerStatusEnt ddpListenerStatus;

                    private DdpListenerEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "ddpListenerEntry", "1.3.6.1.2.1.13.4.15.1", false, false, false, true);
                        this.ddpListenerAddress = new DdpListenerAddressEnt(mib, this);
                        this.ddpListenerInPkts = new DdpListenerInPktsEnt(mib, this);
                        this.ddpListenerStatus = new DdpListenerStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ddpListenerAddress,
                            this.ddpListenerInPkts,
                            this.ddpListenerStatus
                        };
                    }
                    public static final class DdpListenerAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpListenerAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpListenerAddress", "1.3.6.1.2.1.13.4.15.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpListenerInPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpListenerInPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpListenerInPkts", "1.3.6.1.2.1.13.4.15.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpListenerStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpListenerStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpListenerStatus", "1.3.6.1.2.1.13.4.15.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DdpForwRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpForwRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpForwRequests", "1.3.6.1.2.1.13.4.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpOutNoRoutesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpOutNoRoutesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpOutNoRoutes", "1.3.6.1.2.1.13.4.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpBroadcastErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpBroadcastErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpBroadcastErrors", "1.3.6.1.2.1.13.4.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpHopCountErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpHopCountErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpHopCountErrors", "1.3.6.1.2.1.13.4.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpForwardingTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final DdpForwardingEntryEnt ddpForwardingEntry;

                private DdpForwardingTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpForwardingTable", "1.3.6.1.2.1.13.4.16", false, true, false, false);
                    this.ddpForwardingEntry = new DdpForwardingEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ddpForwardingEntry
                    };
                }
                public static final class DdpForwardingEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final DdpForwardingNetEndEnt ddpForwardingNetEnd;

                    public final DdpForwardingNetStartEnt ddpForwardingNetStart;

                    public final DdpForwardingNextHopEnt ddpForwardingNextHop;

                    public final DdpForwardingProtoEnt ddpForwardingProto;

                    public final DdpForwardingModifiedTimeEnt ddpForwardingModifiedTime;

                    public final DdpForwardingUseCountsEnt ddpForwardingUseCounts;

                    public final DdpForwardingPortEnt ddpForwardingPort;

                    private DdpForwardingEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "ddpForwardingEntry", "1.3.6.1.2.1.13.4.16.1", false, false, false, true);
                        this.ddpForwardingNetEnd = new DdpForwardingNetEndEnt(mib, this);
                        this.ddpForwardingNetStart = new DdpForwardingNetStartEnt(mib, this);
                        this.ddpForwardingNextHop = new DdpForwardingNextHopEnt(mib, this);
                        this.ddpForwardingProto = new DdpForwardingProtoEnt(mib, this);
                        this.ddpForwardingModifiedTime = new DdpForwardingModifiedTimeEnt(mib, this);
                        this.ddpForwardingUseCounts = new DdpForwardingUseCountsEnt(mib, this);
                        this.ddpForwardingPort = new DdpForwardingPortEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ddpForwardingNetEnd,
                            this.ddpForwardingNetStart,
                            this.ddpForwardingNextHop,
                            this.ddpForwardingProto,
                            this.ddpForwardingModifiedTime,
                            this.ddpForwardingUseCounts,
                            this.ddpForwardingPort
                        };
                    }
                    public static final class DdpForwardingNetEndEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingNetEndEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingNetEnd", "1.3.6.1.2.1.13.4.16.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpForwardingNetStartEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingNetStartEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingNetStart", "1.3.6.1.2.1.13.4.16.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpForwardingNextHopEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingNextHopEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingNextHop", "1.3.6.1.2.1.13.4.16.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpForwardingProtoEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingProtoEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingProto", "1.3.6.1.2.1.13.4.16.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpForwardingModifiedTimeEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingModifiedTimeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingModifiedTime", "1.3.6.1.2.1.13.4.16.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpForwardingUseCountsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingUseCountsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingUseCounts", "1.3.6.1.2.1.13.4.16.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DdpForwardingPortEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private DdpForwardingPortEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "ddpForwardingPort", "1.3.6.1.2.1.13.4.16.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DdpForwProtoOidsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                /** The value to be assigned to ddpForwardingProto when therouting protocol is RTMP.*/
                public final RtmpRoutingProtoEnt rtmpRoutingProto;

                /** The value to be assigned to ddpForwardingProto when therouting protocol is KIP.*/
                public final KipRoutingProtoEnt kipRoutingProto;

                private DdpForwProtoOidsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpForwProtoOids", "1.3.6.1.2.1.13.4.17", false, false, false, false);
                    this.rtmpRoutingProto = new RtmpRoutingProtoEnt(mib, this);
                    this.kipRoutingProto = new KipRoutingProtoEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtmpRoutingProto,
                        this.kipRoutingProto
                    };
                }
                public static final class RtmpRoutingProtoEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private RtmpRoutingProtoEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "rtmpRoutingProto", "1.3.6.1.2.1.13.4.17.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class KipRoutingProtoEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private KipRoutingProtoEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "kipRoutingProto", "1.3.6.1.2.1.13.4.17.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DdpForwardingTableOverflowsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private DdpForwardingTableOverflowsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "ddpForwardingTableOverflows", "1.3.6.1.2.1.13.4.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class RtmpEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The RTMP GroupImplementation of this group is required for all routerswhich implement RTMP*/
            public final RtmpTableEnt rtmpTable;

            public final RtmpInDataPktsEnt rtmpInDataPkts;

            public final RtmpOutDataPktsEnt rtmpOutDataPkts;

            public final RtmpInRequestPktsEnt rtmpInRequestPkts;

            public final RtmpNextIREqualChangesEnt rtmpNextIREqualChanges;

            public final RtmpNextIRLessChangesEnt rtmpNextIRLessChanges;

            public final RtmpRouteDeletesEnt rtmpRouteDeletes;

            public final RtmpRoutingTableOverflowsEnt rtmpRoutingTableOverflows;

            private RtmpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "rtmp", "1.3.6.1.2.1.13.5", false, false, false, false);
                this.rtmpTable = new RtmpTableEnt(mib, this);
                this.rtmpInDataPkts = new RtmpInDataPktsEnt(mib, this);
                this.rtmpOutDataPkts = new RtmpOutDataPktsEnt(mib, this);
                this.rtmpInRequestPkts = new RtmpInRequestPktsEnt(mib, this);
                this.rtmpNextIREqualChanges = new RtmpNextIREqualChangesEnt(mib, this);
                this.rtmpNextIRLessChanges = new RtmpNextIRLessChangesEnt(mib, this);
                this.rtmpRouteDeletes = new RtmpRouteDeletesEnt(mib, this);
                this.rtmpRoutingTableOverflows = new RtmpRoutingTableOverflowsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rtmpTable,
                    this.rtmpInDataPkts,
                    this.rtmpOutDataPkts,
                    this.rtmpInRequestPkts,
                    this.rtmpNextIREqualChanges,
                    this.rtmpNextIRLessChanges,
                    this.rtmpRouteDeletes,
                    this.rtmpRoutingTableOverflows
                };
            }
            public static final class RtmpTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final RtmpEntryEnt rtmpEntry;

                private RtmpTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpTable", "1.3.6.1.2.1.13.5.1", false, true, false, false);
                    this.rtmpEntry = new RtmpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtmpEntry
                    };
                }
                public static final class RtmpEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final RtmpRangeStartEnt rtmpRangeStart;

                    public final RtmpRangeEndEnt rtmpRangeEnd;

                    public final RtmpNextHopEnt rtmpNextHop;

                    public final RtmpTypeEnt rtmpType;

                    public final RtmpPortEnt rtmpPort;

                    public final RtmpHopsEnt rtmpHops;

                    public final RtmpStateEnt rtmpState;

                    private RtmpEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "rtmpEntry", "1.3.6.1.2.1.13.5.1.1", false, false, false, true);
                        this.rtmpRangeStart = new RtmpRangeStartEnt(mib, this);
                        this.rtmpRangeEnd = new RtmpRangeEndEnt(mib, this);
                        this.rtmpNextHop = new RtmpNextHopEnt(mib, this);
                        this.rtmpType = new RtmpTypeEnt(mib, this);
                        this.rtmpPort = new RtmpPortEnt(mib, this);
                        this.rtmpHops = new RtmpHopsEnt(mib, this);
                        this.rtmpState = new RtmpStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtmpRangeStart,
                            this.rtmpRangeEnd,
                            this.rtmpNextHop,
                            this.rtmpType,
                            this.rtmpPort,
                            this.rtmpHops,
                            this.rtmpState
                        };
                    }
                    public static final class RtmpRangeStartEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpRangeStartEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpRangeStart", "1.3.6.1.2.1.13.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpRangeEndEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpRangeEndEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpRangeEnd", "1.3.6.1.2.1.13.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpNextHopEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpNextHopEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpNextHop", "1.3.6.1.2.1.13.5.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpTypeEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpTypeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpType", "1.3.6.1.2.1.13.5.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpPortEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpPortEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpPort", "1.3.6.1.2.1.13.5.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpHopsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpHopsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpHops", "1.3.6.1.2.1.13.5.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private RtmpStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "rtmpState", "1.3.6.1.2.1.13.5.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RtmpInDataPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpInDataPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpInDataPkts", "1.3.6.1.2.1.13.5.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpOutDataPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpOutDataPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpOutDataPkts", "1.3.6.1.2.1.13.5.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpInRequestPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpInRequestPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpInRequestPkts", "1.3.6.1.2.1.13.5.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpNextIREqualChangesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpNextIREqualChangesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpNextIREqualChanges", "1.3.6.1.2.1.13.5.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpNextIRLessChangesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpNextIRLessChangesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpNextIRLessChanges", "1.3.6.1.2.1.13.5.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpRouteDeletesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpRouteDeletesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpRouteDeletes", "1.3.6.1.2.1.13.5.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpRoutingTableOverflowsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpRoutingTableOverflowsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpRoutingTableOverflows", "1.3.6.1.2.1.13.5.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class KipEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The KIP GroupImplementation of this group is mandatory for allentities that implement KIP*/
            public final KipTableEnt kipTable;

            private KipEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "kip", "1.3.6.1.2.1.13.6", false, false, false, false);
                this.kipTable = new KipTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.kipTable
                };
            }
            public static final class KipTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final KipEntryEnt kipEntry;

                private KipTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "kipTable", "1.3.6.1.2.1.13.6.1", false, true, false, false);
                    this.kipEntry = new KipEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.kipEntry
                    };
                }
                public static final class KipEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final KipNetStartEnt kipNetStart;

                    public final KipNetEndEnt kipNetEnd;

                    public final KipNextHopEnt kipNextHop;

                    public final KipHopCountEnt kipHopCount;

                    public final KipBCastAddrEnt kipBCastAddr;

                    public final KipCoreEnt kipCore;

                    public final KipTypeEnt kipType;

                    public final KipStateEnt kipState;

                    public final KipShareEnt kipShare;

                    public final KipFromEnt kipFrom;

                    private KipEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "kipEntry", "1.3.6.1.2.1.13.6.1.1", false, false, false, true);
                        this.kipNetStart = new KipNetStartEnt(mib, this);
                        this.kipNetEnd = new KipNetEndEnt(mib, this);
                        this.kipNextHop = new KipNextHopEnt(mib, this);
                        this.kipHopCount = new KipHopCountEnt(mib, this);
                        this.kipBCastAddr = new KipBCastAddrEnt(mib, this);
                        this.kipCore = new KipCoreEnt(mib, this);
                        this.kipType = new KipTypeEnt(mib, this);
                        this.kipState = new KipStateEnt(mib, this);
                        this.kipShare = new KipShareEnt(mib, this);
                        this.kipFrom = new KipFromEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.kipNetStart,
                            this.kipNetEnd,
                            this.kipNextHop,
                            this.kipHopCount,
                            this.kipBCastAddr,
                            this.kipCore,
                            this.kipType,
                            this.kipState,
                            this.kipShare,
                            this.kipFrom
                        };
                    }
                    public static final class KipNetStartEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipNetStartEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipNetStart", "1.3.6.1.2.1.13.6.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipNetEndEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipNetEndEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipNetEnd", "1.3.6.1.2.1.13.6.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipNextHopEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipNextHopEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipNextHop", "1.3.6.1.2.1.13.6.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipHopCountEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipHopCountEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipHopCount", "1.3.6.1.2.1.13.6.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipBCastAddrEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipBCastAddrEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipBCastAddr", "1.3.6.1.2.1.13.6.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipCoreEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipCoreEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipCore", "1.3.6.1.2.1.13.6.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipTypeEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipTypeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipType", "1.3.6.1.2.1.13.6.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipState", "1.3.6.1.2.1.13.6.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipShareEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipShareEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipShare", "1.3.6.1.2.1.13.6.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipFromEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private KipFromEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "kipFrom", "1.3.6.1.2.1.13.6.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class ZipRouterEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ZIP Router GroupImplementation of this group is required for all routerswhich implement ZIPThis group consists of ZIP variables that would beimplemented by a router.*/
            public final ZipTableEnt zipTable;

            public final ZipInZipQueriesEnt zipInZipQueries;

            public final ZipInZipRepliesEnt zipInZipReplies;

            public final ZipInZipExtendedRepliesEnt zipInZipExtendedReplies;

            public final ZipZoneConflictErrorsEnt zipZoneConflictErrors;

            public final ZipInObsoletesEnt zipInObsoletes;

            /** The zipRouterNetInfoTable is used to record informationabout zipGetNetInfo and zipGetNetInfo Reply packets thatwere received on each port for a router.  This tableaugments the atportTable.*/
            public final ZipRouterNetInfoTableEnt zipRouterNetInfoTable;

            private ZipRouterEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "zipRouter", "1.3.6.1.2.1.13.7", false, false, false, false);
                this.zipTable = new ZipTableEnt(mib, this);
                this.zipInZipQueries = new ZipInZipQueriesEnt(mib, this);
                this.zipInZipReplies = new ZipInZipRepliesEnt(mib, this);
                this.zipInZipExtendedReplies = new ZipInZipExtendedRepliesEnt(mib, this);
                this.zipZoneConflictErrors = new ZipZoneConflictErrorsEnt(mib, this);
                this.zipInObsoletes = new ZipInObsoletesEnt(mib, this);
                this.zipRouterNetInfoTable = new ZipRouterNetInfoTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.zipTable,
                    this.zipInZipQueries,
                    this.zipInZipReplies,
                    this.zipInZipExtendedReplies,
                    this.zipZoneConflictErrors,
                    this.zipInObsoletes,
                    this.zipRouterNetInfoTable
                };
            }
            public static final class ZipTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final ZipEntryEnt zipEntry;

                private ZipTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipTable", "1.3.6.1.2.1.13.7.1", false, true, false, false);
                    this.zipEntry = new ZipEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.zipEntry
                    };
                }
                public static final class ZipEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final ZipZoneNameEnt zipZoneName;

                    public final ZipZoneIndexEnt zipZoneIndex;

                    public final ZipZoneNetStartEnt zipZoneNetStart;

                    public final ZipZoneNetEndEnt zipZoneNetEnd;

                    public final ZipZoneStateEnt zipZoneState;

                    public final ZipZoneFromEnt zipZoneFrom;

                    public final ZipZonePortEnt zipZonePort;

                    private ZipEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "zipEntry", "1.3.6.1.2.1.13.7.1.1", false, false, false, true);
                        this.zipZoneName = new ZipZoneNameEnt(mib, this);
                        this.zipZoneIndex = new ZipZoneIndexEnt(mib, this);
                        this.zipZoneNetStart = new ZipZoneNetStartEnt(mib, this);
                        this.zipZoneNetEnd = new ZipZoneNetEndEnt(mib, this);
                        this.zipZoneState = new ZipZoneStateEnt(mib, this);
                        this.zipZoneFrom = new ZipZoneFromEnt(mib, this);
                        this.zipZonePort = new ZipZonePortEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.zipZoneName,
                            this.zipZoneIndex,
                            this.zipZoneNetStart,
                            this.zipZoneNetEnd,
                            this.zipZoneState,
                            this.zipZoneFrom,
                            this.zipZonePort
                        };
                    }
                    public static final class ZipZoneNameEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneNameEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneName", "1.3.6.1.2.1.13.7.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneIndex", "1.3.6.1.2.1.13.7.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneNetStartEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneNetStartEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneNetStart", "1.3.6.1.2.1.13.7.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneNetEndEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneNetEndEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneNetEnd", "1.3.6.1.2.1.13.7.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneState", "1.3.6.1.2.1.13.7.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneFromEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneFromEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneFrom", "1.3.6.1.2.1.13.7.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZonePortEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZonePortEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZonePort", "1.3.6.1.2.1.13.7.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ZipInZipQueriesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private ZipInZipQueriesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipInZipQueries", "1.3.6.1.2.1.13.7.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ZipInZipRepliesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private ZipInZipRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipInZipReplies", "1.3.6.1.2.1.13.7.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ZipInZipExtendedRepliesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private ZipInZipExtendedRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipInZipExtendedReplies", "1.3.6.1.2.1.13.7.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ZipZoneConflictErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private ZipZoneConflictErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipZoneConflictErrors", "1.3.6.1.2.1.13.7.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ZipInObsoletesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private ZipInObsoletesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipInObsoletes", "1.3.6.1.2.1.13.7.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ZipRouterNetInfoTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final ZipRouterNetInfoEntryEnt zipRouterNetInfoEntry;

                private ZipRouterNetInfoTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipRouterNetInfoTable", "1.3.6.1.2.1.13.7.7", false, true, false, false);
                    this.zipRouterNetInfoEntry = new ZipRouterNetInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.zipRouterNetInfoEntry
                    };
                }
                public static final class ZipRouterNetInfoEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final ZipInGetNetInfosEnt zipInGetNetInfos;

                    public final ZipOutGetNetInfoRepliesEnt zipOutGetNetInfoReplies;

                    public final ZipZoneOutInvalidsEnt zipZoneOutInvalids;

                    public final ZipAddressInvalidsEnt zipAddressInvalids;

                    private ZipRouterNetInfoEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "zipRouterNetInfoEntry", "1.3.6.1.2.1.13.7.7.1", false, false, false, true);
                        this.zipInGetNetInfos = new ZipInGetNetInfosEnt(mib, this);
                        this.zipOutGetNetInfoReplies = new ZipOutGetNetInfoRepliesEnt(mib, this);
                        this.zipZoneOutInvalids = new ZipZoneOutInvalidsEnt(mib, this);
                        this.zipAddressInvalids = new ZipAddressInvalidsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.zipInGetNetInfos,
                            this.zipOutGetNetInfoReplies,
                            this.zipZoneOutInvalids,
                            this.zipAddressInvalids
                        };
                    }
                    public static final class ZipInGetNetInfosEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipInGetNetInfosEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipInGetNetInfos", "1.3.6.1.2.1.13.7.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipOutGetNetInfoRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipOutGetNetInfoRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipOutGetNetInfoReplies", "1.3.6.1.2.1.13.7.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneOutInvalidsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneOutInvalidsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneOutInvalids", "1.3.6.1.2.1.13.7.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipAddressInvalidsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipAddressInvalidsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipAddressInvalids", "1.3.6.1.2.1.13.7.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class NbpEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The NBP GroupImplementation of this group is mandatory for all entitiesthat implement NBP*/
            public final NbpTableEnt nbpTable;

            public final NbpInLookUpRequestsEnt nbpInLookUpRequests;

            public final NbpInLookUpRepliesEnt nbpInLookUpReplies;

            public final NbpInBroadcastRequestsEnt nbpInBroadcastRequests;

            public final NbpInForwardRequestsEnt nbpInForwardRequests;

            public final NbpOutLookUpRepliesEnt nbpOutLookUpReplies;

            public final NbpRegistrationFailuresEnt nbpRegistrationFailures;

            public final NbpInErrorsEnt nbpInErrors;

            private NbpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "nbp", "1.3.6.1.2.1.13.8", false, false, false, false);
                this.nbpTable = new NbpTableEnt(mib, this);
                this.nbpInLookUpRequests = new NbpInLookUpRequestsEnt(mib, this);
                this.nbpInLookUpReplies = new NbpInLookUpRepliesEnt(mib, this);
                this.nbpInBroadcastRequests = new NbpInBroadcastRequestsEnt(mib, this);
                this.nbpInForwardRequests = new NbpInForwardRequestsEnt(mib, this);
                this.nbpOutLookUpReplies = new NbpOutLookUpRepliesEnt(mib, this);
                this.nbpRegistrationFailures = new NbpRegistrationFailuresEnt(mib, this);
                this.nbpInErrors = new NbpInErrorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nbpTable,
                    this.nbpInLookUpRequests,
                    this.nbpInLookUpReplies,
                    this.nbpInBroadcastRequests,
                    this.nbpInForwardRequests,
                    this.nbpOutLookUpReplies,
                    this.nbpRegistrationFailures,
                    this.nbpInErrors
                };
            }
            public static final class NbpTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final NbpEntryEnt nbpEntry;

                private NbpTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpTable", "1.3.6.1.2.1.13.8.1", false, true, false, false);
                    this.nbpEntry = new NbpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nbpEntry
                    };
                }
                public static final class NbpEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final NbpIndexEnt nbpIndex;

                    public final NbpObjectEnt nbpObject;

                    public final NbpTypeEnt nbpType;

                    public final NbpZoneEnt nbpZone;

                    public final NbpStateEnt nbpState;

                    public final NbpAddressEnt nbpAddress;

                    public final NbpEnumeratorEnt nbpEnumerator;

                    private NbpEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "nbpEntry", "1.3.6.1.2.1.13.8.1.1", false, false, false, true);
                        this.nbpIndex = new NbpIndexEnt(mib, this);
                        this.nbpObject = new NbpObjectEnt(mib, this);
                        this.nbpType = new NbpTypeEnt(mib, this);
                        this.nbpZone = new NbpZoneEnt(mib, this);
                        this.nbpState = new NbpStateEnt(mib, this);
                        this.nbpAddress = new NbpAddressEnt(mib, this);
                        this.nbpEnumerator = new NbpEnumeratorEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nbpIndex,
                            this.nbpObject,
                            this.nbpType,
                            this.nbpZone,
                            this.nbpState,
                            this.nbpAddress,
                            this.nbpEnumerator
                        };
                    }
                    public static final class NbpIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpIndex", "1.3.6.1.2.1.13.8.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpObjectEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpObjectEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpObject", "1.3.6.1.2.1.13.8.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpTypeEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpTypeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpType", "1.3.6.1.2.1.13.8.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpZoneEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpZoneEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpZone", "1.3.6.1.2.1.13.8.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpState", "1.3.6.1.2.1.13.8.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpAddress", "1.3.6.1.2.1.13.8.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpEnumeratorEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private NbpEnumeratorEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "nbpEnumerator", "1.3.6.1.2.1.13.8.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class NbpInLookUpRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpInLookUpRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpInLookUpRequests", "1.3.6.1.2.1.13.8.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NbpInLookUpRepliesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpInLookUpRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpInLookUpReplies", "1.3.6.1.2.1.13.8.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NbpInBroadcastRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpInBroadcastRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpInBroadcastRequests", "1.3.6.1.2.1.13.8.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NbpInForwardRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpInForwardRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpInForwardRequests", "1.3.6.1.2.1.13.8.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NbpOutLookUpRepliesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpOutLookUpRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpOutLookUpReplies", "1.3.6.1.2.1.13.8.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NbpRegistrationFailuresEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpRegistrationFailuresEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpRegistrationFailures", "1.3.6.1.2.1.13.8.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NbpInErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private NbpInErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "nbpInErrors", "1.3.6.1.2.1.13.8.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class AtechoEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ATEcho GroupImplementation of this group is mandatory for allentities that implement ATEcho*/
            public final AtechoRequestsEnt atechoRequests;

            public final AtechoRepliesEnt atechoReplies;

            public final AtechoOutRequestsEnt atechoOutRequests;

            public final AtechoInRepliesEnt atechoInReplies;

            private AtechoEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "atecho", "1.3.6.1.2.1.13.9", false, false, false, false);
                this.atechoRequests = new AtechoRequestsEnt(mib, this);
                this.atechoReplies = new AtechoRepliesEnt(mib, this);
                this.atechoOutRequests = new AtechoOutRequestsEnt(mib, this);
                this.atechoInReplies = new AtechoInRepliesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atechoRequests,
                    this.atechoReplies,
                    this.atechoOutRequests,
                    this.atechoInReplies
                };
            }
            public static final class AtechoRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtechoRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atechoRequests", "1.3.6.1.2.1.13.9.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtechoRepliesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtechoRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atechoReplies", "1.3.6.1.2.1.13.9.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtechoOutRequestsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtechoOutRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atechoOutRequests", "1.3.6.1.2.1.13.9.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtechoInRepliesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtechoInRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atechoInReplies", "1.3.6.1.2.1.13.9.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class AtpEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ATP GroupImplementation of this group is mandatory for all entitiesthat implement ATP*/
            public final AtpInPktsEnt atpInPkts;

            public final AtpOutPktsEnt atpOutPkts;

            public final AtpTRequestRetransmissionsEnt atpTRequestRetransmissions;

            public final AtpTResponseRetransmissionsEnt atpTResponseRetransmissions;

            public final AtpReleaseTimerExpiredCountsEnt atpReleaseTimerExpiredCounts;

            public final AtpRetryCountExceededsEnt atpRetryCountExceededs;

            public final AtpListenerTableEnt atpListenerTable;

            private AtpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "atp", "1.3.6.1.2.1.13.10", false, false, false, false);
                this.atpInPkts = new AtpInPktsEnt(mib, this);
                this.atpOutPkts = new AtpOutPktsEnt(mib, this);
                this.atpTRequestRetransmissions = new AtpTRequestRetransmissionsEnt(mib, this);
                this.atpTResponseRetransmissions = new AtpTResponseRetransmissionsEnt(mib, this);
                this.atpReleaseTimerExpiredCounts = new AtpReleaseTimerExpiredCountsEnt(mib, this);
                this.atpRetryCountExceededs = new AtpRetryCountExceededsEnt(mib, this);
                this.atpListenerTable = new AtpListenerTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atpInPkts,
                    this.atpOutPkts,
                    this.atpTRequestRetransmissions,
                    this.atpTResponseRetransmissions,
                    this.atpReleaseTimerExpiredCounts,
                    this.atpRetryCountExceededs,
                    this.atpListenerTable
                };
            }
            public static final class AtpInPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtpInPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpInPkts", "1.3.6.1.2.1.13.10.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtpOutPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtpOutPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpOutPkts", "1.3.6.1.2.1.13.10.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtpTRequestRetransmissionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtpTRequestRetransmissionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpTRequestRetransmissions", "1.3.6.1.2.1.13.10.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtpTResponseRetransmissionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtpTResponseRetransmissionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpTResponseRetransmissions", "1.3.6.1.2.1.13.10.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtpReleaseTimerExpiredCountsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtpReleaseTimerExpiredCountsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpReleaseTimerExpiredCounts", "1.3.6.1.2.1.13.10.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtpRetryCountExceededsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AtpRetryCountExceededsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpRetryCountExceededs", "1.3.6.1.2.1.13.10.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtpListenerTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AtpListenerEntryEnt atpListenerEntry;

                private AtpListenerTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atpListenerTable", "1.3.6.1.2.1.13.10.7", false, true, false, false);
                    this.atpListenerEntry = new AtpListenerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atpListenerEntry
                    };
                }
                public static final class AtpListenerEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AtpListenerAddressEnt atpListenerAddress;

                    public final AtpListenerStatusEnt atpListenerStatus;

                    private AtpListenerEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "atpListenerEntry", "1.3.6.1.2.1.13.10.7.1", false, false, false, true);
                        this.atpListenerAddress = new AtpListenerAddressEnt(mib, this);
                        this.atpListenerStatus = new AtpListenerStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atpListenerAddress,
                            this.atpListenerStatus
                        };
                    }
                    public static final class AtpListenerAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtpListenerAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atpListenerAddress", "1.3.6.1.2.1.13.10.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtpListenerStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtpListenerStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atpListenerStatus", "1.3.6.1.2.1.13.10.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PapEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The PAP groupImplementation of this group is mandatory for all entitiesthat implement PAP*/
            public final PapInOpenConnsEnt papInOpenConns;

            public final PapOutOpenConnsEnt papOutOpenConns;

            public final PapInDatasEnt papInDatas;

            public final PapOutDatasEnt papOutDatas;

            public final PapInCloseConnsEnt papInCloseConns;

            public final PapOutCloseConnsEnt papOutCloseConns;

            public final PapTickleTimeoutClosesEnt papTickleTimeoutCloses;

            public final PapServerTableEnt papServerTable;

            private PapEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "pap", "1.3.6.1.2.1.13.11", false, false, false, false);
                this.papInOpenConns = new PapInOpenConnsEnt(mib, this);
                this.papOutOpenConns = new PapOutOpenConnsEnt(mib, this);
                this.papInDatas = new PapInDatasEnt(mib, this);
                this.papOutDatas = new PapOutDatasEnt(mib, this);
                this.papInCloseConns = new PapInCloseConnsEnt(mib, this);
                this.papOutCloseConns = new PapOutCloseConnsEnt(mib, this);
                this.papTickleTimeoutCloses = new PapTickleTimeoutClosesEnt(mib, this);
                this.papServerTable = new PapServerTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.papInOpenConns,
                    this.papOutOpenConns,
                    this.papInDatas,
                    this.papOutDatas,
                    this.papInCloseConns,
                    this.papOutCloseConns,
                    this.papTickleTimeoutCloses,
                    this.papServerTable
                };
            }
            public static final class PapInOpenConnsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapInOpenConnsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papInOpenConns", "1.3.6.1.2.1.13.11.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapOutOpenConnsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapOutOpenConnsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papOutOpenConns", "1.3.6.1.2.1.13.11.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapInDatasEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapInDatasEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papInDatas", "1.3.6.1.2.1.13.11.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapOutDatasEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapOutDatasEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papOutDatas", "1.3.6.1.2.1.13.11.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapInCloseConnsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapInCloseConnsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papInCloseConns", "1.3.6.1.2.1.13.11.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapOutCloseConnsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapOutCloseConnsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papOutCloseConns", "1.3.6.1.2.1.13.11.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapTickleTimeoutClosesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private PapTickleTimeoutClosesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papTickleTimeoutCloses", "1.3.6.1.2.1.13.11.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PapServerTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final PapServerEntryEnt papServerEntry;

                private PapServerTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "papServerTable", "1.3.6.1.2.1.13.11.8", false, true, false, false);
                    this.papServerEntry = new PapServerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.papServerEntry
                    };
                }
                public static final class PapServerEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final PapServerIndexEnt papServerIndex;

                    public final PapServerListeningSocketEnt papServerListeningSocket;

                    public final PapServerStatusEnt papServerStatus;

                    public final PapServerCompletedJobsEnt papServerCompletedJobs;

                    public final PapServerBusyJobsEnt papServerBusyJobs;

                    public final PapServerFreeJobsEnt papServerFreeJobs;

                    public final PapServerAuthenticationFailuresEnt papServerAuthenticationFailures;

                    public final PapServerAccountingFailuresEnt papServerAccountingFailures;

                    public final PapServerGeneralFailuresEnt papServerGeneralFailures;

                    public final PapServerStateEnt papServerState;

                    public final PapServerLastStatusMsgEnt papServerLastStatusMsg;

                    private PapServerEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "papServerEntry", "1.3.6.1.2.1.13.11.8.1", false, false, false, true);
                        this.papServerIndex = new PapServerIndexEnt(mib, this);
                        this.papServerListeningSocket = new PapServerListeningSocketEnt(mib, this);
                        this.papServerStatus = new PapServerStatusEnt(mib, this);
                        this.papServerCompletedJobs = new PapServerCompletedJobsEnt(mib, this);
                        this.papServerBusyJobs = new PapServerBusyJobsEnt(mib, this);
                        this.papServerFreeJobs = new PapServerFreeJobsEnt(mib, this);
                        this.papServerAuthenticationFailures = new PapServerAuthenticationFailuresEnt(mib, this);
                        this.papServerAccountingFailures = new PapServerAccountingFailuresEnt(mib, this);
                        this.papServerGeneralFailures = new PapServerGeneralFailuresEnt(mib, this);
                        this.papServerState = new PapServerStateEnt(mib, this);
                        this.papServerLastStatusMsg = new PapServerLastStatusMsgEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.papServerIndex,
                            this.papServerListeningSocket,
                            this.papServerStatus,
                            this.papServerCompletedJobs,
                            this.papServerBusyJobs,
                            this.papServerFreeJobs,
                            this.papServerAuthenticationFailures,
                            this.papServerAccountingFailures,
                            this.papServerGeneralFailures,
                            this.papServerState,
                            this.papServerLastStatusMsg
                        };
                    }
                    public static final class PapServerIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerIndex", "1.3.6.1.2.1.13.11.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerListeningSocketEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerListeningSocketEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerListeningSocket", "1.3.6.1.2.1.13.11.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerStatus", "1.3.6.1.2.1.13.11.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerCompletedJobsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerCompletedJobsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerCompletedJobs", "1.3.6.1.2.1.13.11.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerBusyJobsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerBusyJobsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerBusyJobs", "1.3.6.1.2.1.13.11.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerFreeJobsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerFreeJobsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerFreeJobs", "1.3.6.1.2.1.13.11.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerAuthenticationFailuresEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerAuthenticationFailuresEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerAuthenticationFailures", "1.3.6.1.2.1.13.11.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerAccountingFailuresEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerAccountingFailuresEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerAccountingFailures", "1.3.6.1.2.1.13.11.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerGeneralFailuresEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerGeneralFailuresEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerGeneralFailures", "1.3.6.1.2.1.13.11.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerState", "1.3.6.1.2.1.13.11.8.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PapServerLastStatusMsgEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PapServerLastStatusMsgEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "papServerLastStatusMsg", "1.3.6.1.2.1.13.11.8.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AspEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ASP GroupImplementation of this group is mandatory for all entitiesthat implement ASP*/
            public final AspInputTransactionsEnt aspInputTransactions;

            public final AspOutputTransactionsEnt aspOutputTransactions;

            public final AspInOpenSessionsEnt aspInOpenSessions;

            public final AspOutOpenSessionsEnt aspOutOpenSessions;

            public final AspInCloseSessionsEnt aspInCloseSessions;

            public final AspOutCloseSessionsEnt aspOutCloseSessions;

            public final AspNoMoreSessionsErrorsEnt aspNoMoreSessionsErrors;

            public final AspTickleTimeOutClosesEnt aspTickleTimeOutCloses;

            public final AspConnTableEnt aspConnTable;

            private AspEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "asp", "1.3.6.1.2.1.13.12", false, false, false, false);
                this.aspInputTransactions = new AspInputTransactionsEnt(mib, this);
                this.aspOutputTransactions = new AspOutputTransactionsEnt(mib, this);
                this.aspInOpenSessions = new AspInOpenSessionsEnt(mib, this);
                this.aspOutOpenSessions = new AspOutOpenSessionsEnt(mib, this);
                this.aspInCloseSessions = new AspInCloseSessionsEnt(mib, this);
                this.aspOutCloseSessions = new AspOutCloseSessionsEnt(mib, this);
                this.aspNoMoreSessionsErrors = new AspNoMoreSessionsErrorsEnt(mib, this);
                this.aspTickleTimeOutCloses = new AspTickleTimeOutClosesEnt(mib, this);
                this.aspConnTable = new AspConnTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aspInputTransactions,
                    this.aspOutputTransactions,
                    this.aspInOpenSessions,
                    this.aspOutOpenSessions,
                    this.aspInCloseSessions,
                    this.aspOutCloseSessions,
                    this.aspNoMoreSessionsErrors,
                    this.aspTickleTimeOutCloses,
                    this.aspConnTable
                };
            }
            public static final class AspInputTransactionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspInputTransactionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspInputTransactions", "1.3.6.1.2.1.13.12.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspOutputTransactionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspOutputTransactionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspOutputTransactions", "1.3.6.1.2.1.13.12.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspInOpenSessionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspInOpenSessionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspInOpenSessions", "1.3.6.1.2.1.13.12.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspOutOpenSessionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspOutOpenSessionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspOutOpenSessions", "1.3.6.1.2.1.13.12.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspInCloseSessionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspInCloseSessionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspInCloseSessions", "1.3.6.1.2.1.13.12.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspOutCloseSessionsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspOutCloseSessionsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspOutCloseSessions", "1.3.6.1.2.1.13.12.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspNoMoreSessionsErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspNoMoreSessionsErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspNoMoreSessionsErrors", "1.3.6.1.2.1.13.12.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspTickleTimeOutClosesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AspTickleTimeOutClosesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspTickleTimeOutCloses", "1.3.6.1.2.1.13.12.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AspConnTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AspConnEntryEnt aspConnEntry;

                private AspConnTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "aspConnTable", "1.3.6.1.2.1.13.12.9", false, true, false, false);
                    this.aspConnEntry = new AspConnEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aspConnEntry
                    };
                }
                public static final class AspConnEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AspConnLocalAddressEnt aspConnLocalAddress;

                    public final AspConnRemoteAddressEnt aspConnRemoteAddress;

                    public final AspConnIDEnt aspConnID;

                    public final AspConnLastReqNumEnt aspConnLastReqNum;

                    public final AspConnServerEndEnt aspConnServerEnd;

                    public final AspConnStateEnt aspConnState;

                    private AspConnEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "aspConnEntry", "1.3.6.1.2.1.13.12.9.1", false, false, false, true);
                        this.aspConnLocalAddress = new AspConnLocalAddressEnt(mib, this);
                        this.aspConnRemoteAddress = new AspConnRemoteAddressEnt(mib, this);
                        this.aspConnID = new AspConnIDEnt(mib, this);
                        this.aspConnLastReqNum = new AspConnLastReqNumEnt(mib, this);
                        this.aspConnServerEnd = new AspConnServerEndEnt(mib, this);
                        this.aspConnState = new AspConnStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.aspConnLocalAddress,
                            this.aspConnRemoteAddress,
                            this.aspConnID,
                            this.aspConnLastReqNum,
                            this.aspConnServerEnd,
                            this.aspConnState
                        };
                    }
                    public static final class AspConnLocalAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AspConnLocalAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aspConnLocalAddress", "1.3.6.1.2.1.13.12.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AspConnRemoteAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AspConnRemoteAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aspConnRemoteAddress", "1.3.6.1.2.1.13.12.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AspConnIDEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AspConnIDEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aspConnID", "1.3.6.1.2.1.13.12.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AspConnLastReqNumEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AspConnLastReqNumEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aspConnLastReqNum", "1.3.6.1.2.1.13.12.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AspConnServerEndEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AspConnServerEndEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aspConnServerEnd", "1.3.6.1.2.1.13.12.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AspConnStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AspConnStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "aspConnState", "1.3.6.1.2.1.13.12.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AdspEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ADSP GroupImplementation of this group is mandatory for all entitiesthat implement ADSP*/
            public final AdspInPktsEnt adspInPkts;

            public final AdspOutPktsEnt adspOutPkts;

            public final AdspInOctetsEnt adspInOctets;

            public final AdspOutOctetsEnt adspOutOctets;

            public final AdspInDataPktsEnt adspInDataPkts;

            public final AdspOutDataPktsEnt adspOutDataPkts;

            public final AdspTimeoutErrorsEnt adspTimeoutErrors;

            public final AdspTimeoutCloseErrorsEnt adspTimeoutCloseErrors;

            public final AdspConnTableEnt adspConnTable;

            private AdspEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "adsp", "1.3.6.1.2.1.13.13", false, false, false, false);
                this.adspInPkts = new AdspInPktsEnt(mib, this);
                this.adspOutPkts = new AdspOutPktsEnt(mib, this);
                this.adspInOctets = new AdspInOctetsEnt(mib, this);
                this.adspOutOctets = new AdspOutOctetsEnt(mib, this);
                this.adspInDataPkts = new AdspInDataPktsEnt(mib, this);
                this.adspOutDataPkts = new AdspOutDataPktsEnt(mib, this);
                this.adspTimeoutErrors = new AdspTimeoutErrorsEnt(mib, this);
                this.adspTimeoutCloseErrors = new AdspTimeoutCloseErrorsEnt(mib, this);
                this.adspConnTable = new AdspConnTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.adspInPkts,
                    this.adspOutPkts,
                    this.adspInOctets,
                    this.adspOutOctets,
                    this.adspInDataPkts,
                    this.adspOutDataPkts,
                    this.adspTimeoutErrors,
                    this.adspTimeoutCloseErrors,
                    this.adspConnTable
                };
            }
            public static final class AdspInPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspInPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspInPkts", "1.3.6.1.2.1.13.13.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspOutPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspOutPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspOutPkts", "1.3.6.1.2.1.13.13.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspInOctetsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspInOctetsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspInOctets", "1.3.6.1.2.1.13.13.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspOutOctetsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspOutOctetsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspOutOctets", "1.3.6.1.2.1.13.13.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspInDataPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspInDataPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspInDataPkts", "1.3.6.1.2.1.13.13.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspOutDataPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspOutDataPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspOutDataPkts", "1.3.6.1.2.1.13.13.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspTimeoutErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspTimeoutErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspTimeoutErrors", "1.3.6.1.2.1.13.13.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspTimeoutCloseErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private AdspTimeoutCloseErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspTimeoutCloseErrors", "1.3.6.1.2.1.13.13.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AdspConnTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AdspConnEntryEnt adspConnEntry;

                private AdspConnTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "adspConnTable", "1.3.6.1.2.1.13.13.9", false, true, false, false);
                    this.adspConnEntry = new AdspConnEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.adspConnEntry
                    };
                }
                public static final class AdspConnEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AdspConnLocalAddressEnt adspConnLocalAddress;

                    public final AdspConnLocalConnIDEnt adspConnLocalConnID;

                    public final AdspConnRemoteAddressEnt adspConnRemoteAddress;

                    public final AdspConnRemoteConnIDEnt adspConnRemoteConnID;

                    public final AdspConnStateEnt adspConnState;

                    private AdspConnEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "adspConnEntry", "1.3.6.1.2.1.13.13.9.1", false, false, false, true);
                        this.adspConnLocalAddress = new AdspConnLocalAddressEnt(mib, this);
                        this.adspConnLocalConnID = new AdspConnLocalConnIDEnt(mib, this);
                        this.adspConnRemoteAddress = new AdspConnRemoteAddressEnt(mib, this);
                        this.adspConnRemoteConnID = new AdspConnRemoteConnIDEnt(mib, this);
                        this.adspConnState = new AdspConnStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.adspConnLocalAddress,
                            this.adspConnLocalConnID,
                            this.adspConnRemoteAddress,
                            this.adspConnRemoteConnID,
                            this.adspConnState
                        };
                    }
                    public static final class AdspConnLocalAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AdspConnLocalAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "adspConnLocalAddress", "1.3.6.1.2.1.13.13.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdspConnLocalConnIDEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AdspConnLocalConnIDEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "adspConnLocalConnID", "1.3.6.1.2.1.13.13.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdspConnRemoteAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AdspConnRemoteAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "adspConnRemoteAddress", "1.3.6.1.2.1.13.13.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdspConnRemoteConnIDEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AdspConnRemoteConnIDEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "adspConnRemoteConnID", "1.3.6.1.2.1.13.13.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AdspConnStateEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AdspConnStateEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "adspConnState", "1.3.6.1.2.1.13.13.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AtportptopEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ATPortPtoP GroupImplementation of this group is mandatory for all entitiesthat implement AppleTalk point-to-point links*/
            public final AtportPtoPTableEnt atportPtoPTable;

            public final AtportPtoPProtoOidsEnt atportPtoPProtoOids;

            private AtportptopEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "atportptop", "1.3.6.1.2.1.13.14", false, false, false, false);
                this.atportPtoPTable = new AtportPtoPTableEnt(mib, this);
                this.atportPtoPProtoOids = new AtportPtoPProtoOidsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atportPtoPTable,
                    this.atportPtoPProtoOids
                };
            }
            public static final class AtportPtoPTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final AtportPtoPEntryEnt atportPtoPEntry;

                private AtportPtoPTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atportPtoPTable", "1.3.6.1.2.1.13.14.1", false, true, false, false);
                    this.atportPtoPEntry = new AtportPtoPEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atportPtoPEntry
                    };
                }
                public static final class AtportPtoPEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final AtportPtoPIndexEnt atportPtoPIndex;

                    public final AtportPtoPProtocolEnt atportPtoPProtocol;

                    public final AtportPtoPRemoteNameEnt atportPtoPRemoteName;

                    public final AtportPtoPRemoteAddressEnt atportPtoPRemoteAddress;

                    public final AtportPtoPPortIndexEnt atportPtoPPortIndex;

                    public final AtportPtoPStatusEnt atportPtoPStatus;

                    private AtportPtoPEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "atportPtoPEntry", "1.3.6.1.2.1.13.14.1.1", false, false, false, true);
                        this.atportPtoPIndex = new AtportPtoPIndexEnt(mib, this);
                        this.atportPtoPProtocol = new AtportPtoPProtocolEnt(mib, this);
                        this.atportPtoPRemoteName = new AtportPtoPRemoteNameEnt(mib, this);
                        this.atportPtoPRemoteAddress = new AtportPtoPRemoteAddressEnt(mib, this);
                        this.atportPtoPPortIndex = new AtportPtoPPortIndexEnt(mib, this);
                        this.atportPtoPStatus = new AtportPtoPStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atportPtoPIndex,
                            this.atportPtoPProtocol,
                            this.atportPtoPRemoteName,
                            this.atportPtoPRemoteAddress,
                            this.atportPtoPPortIndex,
                            this.atportPtoPStatus
                        };
                    }
                    public static final class AtportPtoPIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportPtoPIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportPtoPIndex", "1.3.6.1.2.1.13.14.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportPtoPProtocolEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportPtoPProtocolEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportPtoPProtocol", "1.3.6.1.2.1.13.14.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportPtoPRemoteNameEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportPtoPRemoteNameEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportPtoPRemoteName", "1.3.6.1.2.1.13.14.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportPtoPRemoteAddressEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportPtoPRemoteAddressEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportPtoPRemoteAddress", "1.3.6.1.2.1.13.14.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportPtoPPortIndexEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportPtoPPortIndexEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportPtoPPortIndex", "1.3.6.1.2.1.13.14.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportPtoPStatusEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private AtportPtoPStatusEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "atportPtoPStatus", "1.3.6.1.2.1.13.14.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtportPtoPProtoOidsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                /** A list of values to be used for the atportPtoPProtocolvariable.When new protocols are defined, their oids may be definedin separate MIB documents in different branches of the tree.*/
                public final PToPProtoOtherEnt pToPProtoOther;

                public final PToPProtoAurpEnt pToPProtoAurp;

                public final PToPProtoCaymanUdpEnt pToPProtoCaymanUdp;

                public final PToPProtoAtkvmsDecnetIVEnt pToPProtoAtkvmsDecnetIV;

                public final PToPProtoLiaisonUdpEnt pToPProtoLiaisonUdp;

                public final PToPProtoIpxEnt pToPProtoIpx;

                public final PToPProtoShivaIpEnt pToPProtoShivaIp;

                private AtportPtoPProtoOidsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "atportPtoPProtoOids", "1.3.6.1.2.1.13.14.2", false, false, false, false);
                    this.pToPProtoOther = new PToPProtoOtherEnt(mib, this);
                    this.pToPProtoAurp = new PToPProtoAurpEnt(mib, this);
                    this.pToPProtoCaymanUdp = new PToPProtoCaymanUdpEnt(mib, this);
                    this.pToPProtoAtkvmsDecnetIV = new PToPProtoAtkvmsDecnetIVEnt(mib, this);
                    this.pToPProtoLiaisonUdp = new PToPProtoLiaisonUdpEnt(mib, this);
                    this.pToPProtoIpx = new PToPProtoIpxEnt(mib, this);
                    this.pToPProtoShivaIp = new PToPProtoShivaIpEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pToPProtoOther,
                        this.pToPProtoAurp,
                        this.pToPProtoCaymanUdp,
                        this.pToPProtoAtkvmsDecnetIV,
                        this.pToPProtoLiaisonUdp,
                        this.pToPProtoIpx,
                        this.pToPProtoShivaIp
                    };
                }
                public static final class PToPProtoOtherEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoOtherEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoOther", "1.3.6.1.2.1.13.14.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PToPProtoAurpEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoAurpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoAurp", "1.3.6.1.2.1.13.14.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PToPProtoCaymanUdpEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoCaymanUdpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoCaymanUdp", "1.3.6.1.2.1.13.14.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PToPProtoAtkvmsDecnetIVEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoAtkvmsDecnetIVEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoAtkvmsDecnetIV", "1.3.6.1.2.1.13.14.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PToPProtoLiaisonUdpEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoLiaisonUdpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoLiaisonUdp", "1.3.6.1.2.1.13.14.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PToPProtoIpxEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoIpxEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoIpx", "1.3.6.1.2.1.13.14.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PToPProtoShivaIpEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    private PToPProtoShivaIpEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "pToPProtoShivaIp", "1.3.6.1.2.1.13.14.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RtmpStubEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The RTMP Stub GroupImplementation of this group is mandatory for allentities that implement RTMPIt is intended that this group be implemented by routersand end nodes.*/
            public final RtmpOutRequestPktsEnt rtmpOutRequestPkts;

            public final RtmpInVersionMismatchesEnt rtmpInVersionMismatches;

            public final RtmpInErrorsEnt rtmpInErrors;

            private RtmpStubEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "rtmpStub", "1.3.6.1.2.1.13.16", false, false, false, false);
                this.rtmpOutRequestPkts = new RtmpOutRequestPktsEnt(mib, this);
                this.rtmpInVersionMismatches = new RtmpInVersionMismatchesEnt(mib, this);
                this.rtmpInErrors = new RtmpInErrorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rtmpOutRequestPkts,
                    this.rtmpInVersionMismatches,
                    this.rtmpInErrors
                };
            }
            public static final class RtmpOutRequestPktsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpOutRequestPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpOutRequestPkts", "1.3.6.1.2.1.13.16.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpInVersionMismatchesEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpInVersionMismatchesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpInVersionMismatches", "1.3.6.1.2.1.13.16.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtmpInErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private RtmpInErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "rtmpInErrors", "1.3.6.1.2.1.13.16.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class ZipEndNodeEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The ZIP End Node GroupImplementation of this group is mandatory for all entitiesthat implement ZIPThis group consists of ZIP variables that would beimplemented by either a router or an end node.
The zipNetInfoTable is used to record information aboutzipGetNetInfo and zipGetNetInfo Reply packets that werereceived on each port of an entity.  This table augmentsthe atportTable.*/
            public final ZipNetInfoTableEnt zipNetInfoTable;

            public final ZipInErrorsEnt zipInErrors;

            private ZipEndNodeEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "zipEndNode", "1.3.6.1.2.1.13.17", false, false, false, false);
                this.zipNetInfoTable = new ZipNetInfoTableEnt(mib, this);
                this.zipInErrors = new ZipInErrorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.zipNetInfoTable,
                    this.zipInErrors
                };
            }
            public static final class ZipNetInfoTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final ZipNetInfoEntryEnt zipNetInfoEntry;

                private ZipNetInfoTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipNetInfoTable", "1.3.6.1.2.1.13.17.1", false, true, false, false);
                    this.zipNetInfoEntry = new ZipNetInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.zipNetInfoEntry
                    };
                }
                public static final class ZipNetInfoEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final ZipOutGetNetInfosEnt zipOutGetNetInfos;

                    public final ZipInGetNetInfoRepliesEnt zipInGetNetInfoReplies;

                    public final ZipZoneInInvalidsEnt zipZoneInInvalids;

                    private ZipNetInfoEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "zipNetInfoEntry", "1.3.6.1.2.1.13.17.1.1", false, false, false, true);
                        this.zipOutGetNetInfos = new ZipOutGetNetInfosEnt(mib, this);
                        this.zipInGetNetInfoReplies = new ZipInGetNetInfoRepliesEnt(mib, this);
                        this.zipZoneInInvalids = new ZipZoneInInvalidsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.zipOutGetNetInfos,
                            this.zipInGetNetInfoReplies,
                            this.zipZoneInInvalids
                        };
                    }
                    public static final class ZipOutGetNetInfosEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipOutGetNetInfosEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipOutGetNetInfos", "1.3.6.1.2.1.13.17.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipInGetNetInfoRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipInGetNetInfoRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipInGetNetInfoReplies", "1.3.6.1.2.1.13.17.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneInInvalidsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private ZipZoneInInvalidsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "zipZoneInInvalids", "1.3.6.1.2.1.13.17.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ZipInErrorsEnt extends MIBEntry<APPLETALKMIBDef>
            {
                private ZipInErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "zipInErrors", "1.3.6.1.2.1.13.17.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PerPortEnt extends MIBEntry<APPLETALKMIBDef>
        {
            /** The Per Port Counters GroupImplementation of this group is optional.*/
            public final PerPortTableEnt perPortTable;

            private PerPortEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
            {
                super(mib, parent, "perPort", "1.3.6.1.2.1.13.18", false, false, false, false);
                this.perPortTable = new PerPortTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.perPortTable
                };
            }
            public static final class PerPortTableEnt extends MIBEntry<APPLETALKMIBDef>
            {
                public final PerPortEntryEnt perPortEntry;

                private PerPortTableEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                {
                    super(mib, parent, "perPortTable", "1.3.6.1.2.1.13.18.1", false, true, false, false);
                    this.perPortEntry = new PerPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.perPortEntry
                    };
                }
                public static final class PerPortEntryEnt extends MIBEntry<APPLETALKMIBDef>
                {
                    public final PerPortAarpInProbesEnt perPortAarpInProbes;

                    public final PerPortAarpOutProbesEnt perPortAarpOutProbes;

                    public final PerPortAarpInReqsEnt perPortAarpInReqs;

                    public final PerPortAarpOutReqsEnt perPortAarpOutReqs;

                    public final PerPortAarpInRspsEnt perPortAarpInRsps;

                    public final PerPortAarpOutRspsEnt perPortAarpOutRsps;

                    public final PerPortDdpInReceivesEnt perPortDdpInReceives;

                    public final PerPortDdpInLocalDatagramsEnt perPortDdpInLocalDatagrams;

                    public final PerPortDdpNoProtocolHandlersEnt perPortDdpNoProtocolHandlers;

                    public final PerPortDdpTooShortErrorsEnt perPortDdpTooShortErrors;

                    public final PerPortDdpTooLongErrorsEnt perPortDdpTooLongErrors;

                    public final PerPortDdpChecksumErrorsEnt perPortDdpChecksumErrors;

                    public final PerPortDdpForwRequestsEnt perPortDdpForwRequests;

                    public final PerPortRtmpInDataPktsEnt perPortRtmpInDataPkts;

                    public final PerPortRtmpOutDataPktsEnt perPortRtmpOutDataPkts;

                    public final PerPortRtmpInRequestPktsEnt perPortRtmpInRequestPkts;

                    public final PerPortRtmpRouteDeletesEnt perPortRtmpRouteDeletes;

                    public final PerPortZipInZipQueriesEnt perPortZipInZipQueries;

                    public final PerPortZipInZipRepliesEnt perPortZipInZipReplies;

                    public final PerPortZipInZipExtendedRepliesEnt perPortZipInZipExtendedReplies;

                    public final PerPortZipZoneConflictErrorsEnt perPortZipZoneConflictErrors;

                    public final PerPortZipInErrorsEnt perPortZipInErrors;

                    public final PerPortNbpInLookUpRequestsEnt perPortNbpInLookUpRequests;

                    public final PerPortNbpInLookUpRepliesEnt perPortNbpInLookUpReplies;

                    public final PerPortNbpInBroadcastRequestsEnt perPortNbpInBroadcastRequests;

                    public final PerPortNbpInForwardRequestsEnt perPortNbpInForwardRequests;

                    public final PerPortNbpOutLookUpRepliesEnt perPortNbpOutLookUpReplies;

                    public final PerPortNbpRegistrationFailuresEnt perPortNbpRegistrationFailures;

                    public final PerPortNbpInErrorsEnt perPortNbpInErrors;

                    public final PerPortEchoRequestsEnt perPortEchoRequests;

                    public final PerPortEchoRepliesEnt perPortEchoReplies;

                    private PerPortEntryEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                    {
                        super(mib, parent, "perPortEntry", "1.3.6.1.2.1.13.18.1.1", false, false, false, true);
                        this.perPortAarpInProbes = new PerPortAarpInProbesEnt(mib, this);
                        this.perPortAarpOutProbes = new PerPortAarpOutProbesEnt(mib, this);
                        this.perPortAarpInReqs = new PerPortAarpInReqsEnt(mib, this);
                        this.perPortAarpOutReqs = new PerPortAarpOutReqsEnt(mib, this);
                        this.perPortAarpInRsps = new PerPortAarpInRspsEnt(mib, this);
                        this.perPortAarpOutRsps = new PerPortAarpOutRspsEnt(mib, this);
                        this.perPortDdpInReceives = new PerPortDdpInReceivesEnt(mib, this);
                        this.perPortDdpInLocalDatagrams = new PerPortDdpInLocalDatagramsEnt(mib, this);
                        this.perPortDdpNoProtocolHandlers = new PerPortDdpNoProtocolHandlersEnt(mib, this);
                        this.perPortDdpTooShortErrors = new PerPortDdpTooShortErrorsEnt(mib, this);
                        this.perPortDdpTooLongErrors = new PerPortDdpTooLongErrorsEnt(mib, this);
                        this.perPortDdpChecksumErrors = new PerPortDdpChecksumErrorsEnt(mib, this);
                        this.perPortDdpForwRequests = new PerPortDdpForwRequestsEnt(mib, this);
                        this.perPortRtmpInDataPkts = new PerPortRtmpInDataPktsEnt(mib, this);
                        this.perPortRtmpOutDataPkts = new PerPortRtmpOutDataPktsEnt(mib, this);
                        this.perPortRtmpInRequestPkts = new PerPortRtmpInRequestPktsEnt(mib, this);
                        this.perPortRtmpRouteDeletes = new PerPortRtmpRouteDeletesEnt(mib, this);
                        this.perPortZipInZipQueries = new PerPortZipInZipQueriesEnt(mib, this);
                        this.perPortZipInZipReplies = new PerPortZipInZipRepliesEnt(mib, this);
                        this.perPortZipInZipExtendedReplies = new PerPortZipInZipExtendedRepliesEnt(mib, this);
                        this.perPortZipZoneConflictErrors = new PerPortZipZoneConflictErrorsEnt(mib, this);
                        this.perPortZipInErrors = new PerPortZipInErrorsEnt(mib, this);
                        this.perPortNbpInLookUpRequests = new PerPortNbpInLookUpRequestsEnt(mib, this);
                        this.perPortNbpInLookUpReplies = new PerPortNbpInLookUpRepliesEnt(mib, this);
                        this.perPortNbpInBroadcastRequests = new PerPortNbpInBroadcastRequestsEnt(mib, this);
                        this.perPortNbpInForwardRequests = new PerPortNbpInForwardRequestsEnt(mib, this);
                        this.perPortNbpOutLookUpReplies = new PerPortNbpOutLookUpRepliesEnt(mib, this);
                        this.perPortNbpRegistrationFailures = new PerPortNbpRegistrationFailuresEnt(mib, this);
                        this.perPortNbpInErrors = new PerPortNbpInErrorsEnt(mib, this);
                        this.perPortEchoRequests = new PerPortEchoRequestsEnt(mib, this);
                        this.perPortEchoReplies = new PerPortEchoRepliesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.perPortAarpInProbes,
                            this.perPortAarpOutProbes,
                            this.perPortAarpInReqs,
                            this.perPortAarpOutReqs,
                            this.perPortAarpInRsps,
                            this.perPortAarpOutRsps,
                            this.perPortDdpInReceives,
                            this.perPortDdpInLocalDatagrams,
                            this.perPortDdpNoProtocolHandlers,
                            this.perPortDdpTooShortErrors,
                            this.perPortDdpTooLongErrors,
                            this.perPortDdpChecksumErrors,
                            this.perPortDdpForwRequests,
                            this.perPortRtmpInDataPkts,
                            this.perPortRtmpOutDataPkts,
                            this.perPortRtmpInRequestPkts,
                            this.perPortRtmpRouteDeletes,
                            this.perPortZipInZipQueries,
                            this.perPortZipInZipReplies,
                            this.perPortZipInZipExtendedReplies,
                            this.perPortZipZoneConflictErrors,
                            this.perPortZipInErrors,
                            this.perPortNbpInLookUpRequests,
                            this.perPortNbpInLookUpReplies,
                            this.perPortNbpInBroadcastRequests,
                            this.perPortNbpInForwardRequests,
                            this.perPortNbpOutLookUpReplies,
                            this.perPortNbpRegistrationFailures,
                            this.perPortNbpInErrors,
                            this.perPortEchoRequests,
                            this.perPortEchoReplies
                        };
                    }
                    public static final class PerPortAarpInProbesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortAarpInProbesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortAarpInProbes", "1.3.6.1.2.1.13.18.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortAarpOutProbesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortAarpOutProbesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortAarpOutProbes", "1.3.6.1.2.1.13.18.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortAarpInReqsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortAarpInReqsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortAarpInReqs", "1.3.6.1.2.1.13.18.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortAarpOutReqsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortAarpOutReqsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortAarpOutReqs", "1.3.6.1.2.1.13.18.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortAarpInRspsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortAarpInRspsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortAarpInRsps", "1.3.6.1.2.1.13.18.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortAarpOutRspsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortAarpOutRspsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortAarpOutRsps", "1.3.6.1.2.1.13.18.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpInReceivesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpInReceivesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpInReceives", "1.3.6.1.2.1.13.18.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpInLocalDatagramsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpInLocalDatagramsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpInLocalDatagrams", "1.3.6.1.2.1.13.18.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpNoProtocolHandlersEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpNoProtocolHandlersEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpNoProtocolHandlers", "1.3.6.1.2.1.13.18.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpTooShortErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpTooShortErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpTooShortErrors", "1.3.6.1.2.1.13.18.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpTooLongErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpTooLongErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpTooLongErrors", "1.3.6.1.2.1.13.18.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpChecksumErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpChecksumErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpChecksumErrors", "1.3.6.1.2.1.13.18.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortDdpForwRequestsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortDdpForwRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortDdpForwRequests", "1.3.6.1.2.1.13.18.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortRtmpInDataPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortRtmpInDataPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortRtmpInDataPkts", "1.3.6.1.2.1.13.18.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortRtmpOutDataPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortRtmpOutDataPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortRtmpOutDataPkts", "1.3.6.1.2.1.13.18.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortRtmpInRequestPktsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortRtmpInRequestPktsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortRtmpInRequestPkts", "1.3.6.1.2.1.13.18.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortRtmpRouteDeletesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortRtmpRouteDeletesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortRtmpRouteDeletes", "1.3.6.1.2.1.13.18.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortZipInZipQueriesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortZipInZipQueriesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortZipInZipQueries", "1.3.6.1.2.1.13.18.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortZipInZipRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortZipInZipRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortZipInZipReplies", "1.3.6.1.2.1.13.18.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortZipInZipExtendedRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortZipInZipExtendedRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortZipInZipExtendedReplies", "1.3.6.1.2.1.13.18.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortZipZoneConflictErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortZipZoneConflictErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortZipZoneConflictErrors", "1.3.6.1.2.1.13.18.1.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortZipInErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortZipInErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortZipInErrors", "1.3.6.1.2.1.13.18.1.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpInLookUpRequestsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpInLookUpRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpInLookUpRequests", "1.3.6.1.2.1.13.18.1.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpInLookUpRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpInLookUpRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpInLookUpReplies", "1.3.6.1.2.1.13.18.1.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpInBroadcastRequestsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpInBroadcastRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpInBroadcastRequests", "1.3.6.1.2.1.13.18.1.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpInForwardRequestsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpInForwardRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpInForwardRequests", "1.3.6.1.2.1.13.18.1.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpOutLookUpRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpOutLookUpRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpOutLookUpReplies", "1.3.6.1.2.1.13.18.1.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpRegistrationFailuresEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpRegistrationFailuresEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpRegistrationFailures", "1.3.6.1.2.1.13.18.1.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortNbpInErrorsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortNbpInErrorsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortNbpInErrors", "1.3.6.1.2.1.13.18.1.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortEchoRequestsEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortEchoRequestsEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortEchoRequests", "1.3.6.1.2.1.13.18.1.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PerPortEchoRepliesEnt extends MIBEntry<APPLETALKMIBDef>
                    {
                        private PerPortEchoRepliesEnt(APPLETALKMIBDef mib, MIBEntry<APPLETALKMIBDef> parent)
                        {
                            super(mib, parent, "perPortEchoReplies", "1.3.6.1.2.1.13.18.1.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
