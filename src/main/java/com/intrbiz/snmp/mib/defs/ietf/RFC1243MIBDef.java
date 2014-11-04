package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RFC1243MIBDef extends MIB
{
    public static final RFC1243MIBDef RFC1243MIB = new RFC1243MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1243MIBDef.RFC1243MIB); }

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in RFC-1212.
The following reference is used in this MIB:[Inside AppleTalk]This refers to Gursharan S. Sidhu, Richard F. Andrews, andAlan B. Oppenheimer, Inside AppleTalk, Second Edition,Addison Wesley, (1990).


AppleTalk MIB*/
    public final AppletalkEnt appletalk;

    private RFC1243MIBDef()
    {
        super("RFC1243-MIB");
        this.appletalk = new AppletalkEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.appletalk
        };
    }

    public static final class AppletalkEnt extends MIBEntry<RFC1243MIBDef>
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

        private AppletalkEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
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
            this.entries = new MIBEntry<?>[] {
                this.llap,
                this.aarp,
                this.atport,
                this.ddp,
                this.rtmp,
                this.kip,
                this.zipRouter,
                this.nbp,
                this.atecho
            };
        }
        public static final class LlapEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The LLAP GroupImplementation of this group is mandatory for allentities that implement LLAPNotes for the interfaces groupWhen implementing the Interfaces Group of MIB-II, it issuggested that the following values be used for anyLocalTalk interfaces:ifMtu: 600ifSpeed: 230000ifPhysAddress: the one octet node number for theparticular interfaceNote also that LLAP control packets should not beincluded in the Interfaces Group packet or octetcounters.*/
            public final LlapTableEnt llapTable;

            private LlapEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "llap", "1.3.6.1.2.1.13.1", false, false, false, false);
                this.llapTable = new LlapTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.llapTable
                };
            }
            public static final class LlapTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final LlapEntryEnt llapEntry;

                private LlapTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "llapTable", "1.3.6.1.2.1.13.1.1", false, true, false, false);
                    this.llapEntry = new LlapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.llapEntry
                    };
                }
                public static final class LlapEntryEnt extends MIBEntry<RFC1243MIBDef>
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

                    private LlapEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
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
                    public static final class LlapIfIndexEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapIfIndexEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapIfIndex", "1.3.6.1.2.1.13.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInPktsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapInPktsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapInPkts", "1.3.6.1.2.1.13.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapOutPktsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapOutPktsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapOutPkts", "1.3.6.1.2.1.13.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInNoHandlersEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapInNoHandlersEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapInNoHandlers", "1.3.6.1.2.1.13.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInLengthErrorsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapInLengthErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapInLengthErrors", "1.3.6.1.2.1.13.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapInErrorsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapInErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapInErrors", "1.3.6.1.2.1.13.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapCollisionsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapCollisionsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapCollisions", "1.3.6.1.2.1.13.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapDefersEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapDefersEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapDefers", "1.3.6.1.2.1.13.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapNoDataErrorsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapNoDataErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapNoDataErrors", "1.3.6.1.2.1.13.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapRandomCTSErrorsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapRandomCTSErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapRandomCTSErrors", "1.3.6.1.2.1.13.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LlapFCSErrorsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private LlapFCSErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "llapFCSErrors", "1.3.6.1.2.1.13.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AarpEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The AARP GroupImplementation of this group is mandatory for all entitiesthat implement AARP*/
            public final AarpTableEnt aarpTable;

            private AarpEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "aarp", "1.3.6.1.2.1.13.2", false, false, false, false);
                this.aarpTable = new AarpTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aarpTable
                };
            }
            public static final class AarpTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final AarpEntryEnt aarpEntry;

                private AarpTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "aarpTable", "1.3.6.1.2.1.13.2.1", false, true, false, false);
                    this.aarpEntry = new AarpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aarpEntry
                    };
                }
                public static final class AarpEntryEnt extends MIBEntry<RFC1243MIBDef>
                {
                    public final AarpIfIndexEnt aarpIfIndex;

                    public final AarpPhysAddressEnt aarpPhysAddress;

                    public final AarpNetAddressEnt aarpNetAddress;

                    private AarpEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                    {
                        super(mib, parent, "aarpEntry", "1.3.6.1.2.1.13.2.1.1", false, false, false, true);
                        this.aarpIfIndex = new AarpIfIndexEnt(mib, this);
                        this.aarpPhysAddress = new AarpPhysAddressEnt(mib, this);
                        this.aarpNetAddress = new AarpNetAddressEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.aarpIfIndex,
                            this.aarpPhysAddress,
                            this.aarpNetAddress
                        };
                    }
                    public static final class AarpIfIndexEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AarpIfIndexEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "aarpIfIndex", "1.3.6.1.2.1.13.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AarpPhysAddressEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AarpPhysAddressEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "aarpPhysAddress", "1.3.6.1.2.1.13.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AarpNetAddressEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AarpNetAddressEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "aarpNetAddress", "1.3.6.1.2.1.13.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AtportEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The ATPort GroupImplementation of this group is mandatory for all entitiesthat implement AppleTalk portsNote that to be compliant with this group, all variablesthat have read-write access must be implemented asread-write.*/
            public final AtportTableEnt atportTable;

            private AtportEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "atport", "1.3.6.1.2.1.13.3", false, false, false, false);
                this.atportTable = new AtportTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atportTable
                };
            }
            public static final class AtportTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final AtportEntryEnt atportEntry;

                private AtportTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "atportTable", "1.3.6.1.2.1.13.3.1", false, true, false, false);
                    this.atportEntry = new AtportEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atportEntry
                    };
                }
                public static final class AtportEntryEnt extends MIBEntry<RFC1243MIBDef>
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

                    private AtportEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
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
                            this.atportIfIndex
                        };
                    }
                    public static final class AtportIndexEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportIndexEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportIndex", "1.3.6.1.2.1.13.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportDescrEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportDescrEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportDescr", "1.3.6.1.2.1.13.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportTypeEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportTypeEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportType", "1.3.6.1.2.1.13.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetStartEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportNetStartEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportNetStart", "1.3.6.1.2.1.13.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetEndEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportNetEndEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportNetEnd", "1.3.6.1.2.1.13.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetAddressEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportNetAddressEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportNetAddress", "1.3.6.1.2.1.13.3.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportStatusEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportStatusEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportStatus", "1.3.6.1.2.1.13.3.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportNetConfigEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportNetConfigEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportNetConfig", "1.3.6.1.2.1.13.3.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneConfigEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportZoneConfigEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportZoneConfig", "1.3.6.1.2.1.13.3.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportZoneDefaultEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportZoneDefaultEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportZoneDefault", "1.3.6.1.2.1.13.3.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtportIfIndexEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private AtportIfIndexEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "atportIfIndex", "1.3.6.1.2.1.13.3.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class DdpEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The DDP GroupImplementation of this group is mandatory for allentities that implement DDPThis group consists of DDP variables that would beimplemented by either a router or an end node.  Thefollowing variables are included:ddpOutRequestsddpOutShortsddpOutLongsddpInReceivesddpInLocalDatagramsddpNoProtocolHandlersddpTooShortErrorsddpTooLongErrorsddpShortDDPErrorsddpChecksumErrorsddpListenerTableNote that the variables in this group are not numberedsequentially.  This was done so that it was not necessaryto deprecate variables from RFC 1243.*/
            public final DdpOutRequestsEnt ddpOutRequests;

            public final DdpOutShortsEnt ddpOutShorts;

            public final DdpOutLongsEnt ddpOutLongs;

            public final DdpInReceivesEnt ddpInReceives;

            /** The DDP Router GroupImplementation of this group is required for all routerswhich implement DDPThis group consists of DDP variables that only a routerwould implement.  The following variables are included:ddpForwRequestsddpOutNoRoutesddpBroadcastErrorsddpHopCountErrorsddpForwardingTableNote that the variables in this group are not numberedsequentially.  This was done so that variables fromRFC 1243 did not need to be deprecated.*/
            public final DdpForwRequestsEnt ddpForwRequests;

            public final DdpInLocalDatagramsEnt ddpInLocalDatagrams;

            public final DdpNoProtocolHandlersEnt ddpNoProtocolHandlers;

            public final DdpOutNoRoutesEnt ddpOutNoRoutes;

            public final DdpTooShortErrorsEnt ddpTooShortErrors;

            public final DdpTooLongErrorsEnt ddpTooLongErrors;

            public final DdpBroadcastErrorsEnt ddpBroadcastErrors;

            public final DdpShortDDPErrorsEnt ddpShortDDPErrors;

            public final DdpHopCountErrorsEnt ddpHopCountErrors;

            public final DdpChecksumErrorsEnt ddpChecksumErrors;

            private DdpEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "ddp", "1.3.6.1.2.1.13.4", false, false, false, false);
                this.ddpOutRequests = new DdpOutRequestsEnt(mib, this);
                this.ddpOutShorts = new DdpOutShortsEnt(mib, this);
                this.ddpOutLongs = new DdpOutLongsEnt(mib, this);
                this.ddpInReceives = new DdpInReceivesEnt(mib, this);
                this.ddpForwRequests = new DdpForwRequestsEnt(mib, this);
                this.ddpInLocalDatagrams = new DdpInLocalDatagramsEnt(mib, this);
                this.ddpNoProtocolHandlers = new DdpNoProtocolHandlersEnt(mib, this);
                this.ddpOutNoRoutes = new DdpOutNoRoutesEnt(mib, this);
                this.ddpTooShortErrors = new DdpTooShortErrorsEnt(mib, this);
                this.ddpTooLongErrors = new DdpTooLongErrorsEnt(mib, this);
                this.ddpBroadcastErrors = new DdpBroadcastErrorsEnt(mib, this);
                this.ddpShortDDPErrors = new DdpShortDDPErrorsEnt(mib, this);
                this.ddpHopCountErrors = new DdpHopCountErrorsEnt(mib, this);
                this.ddpChecksumErrors = new DdpChecksumErrorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ddpOutRequests,
                    this.ddpOutShorts,
                    this.ddpOutLongs,
                    this.ddpInReceives,
                    this.ddpForwRequests,
                    this.ddpInLocalDatagrams,
                    this.ddpNoProtocolHandlers,
                    this.ddpOutNoRoutes,
                    this.ddpTooShortErrors,
                    this.ddpTooLongErrors,
                    this.ddpBroadcastErrors,
                    this.ddpShortDDPErrors,
                    this.ddpHopCountErrors,
                    this.ddpChecksumErrors
                };
            }
            public static final class DdpOutRequestsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpOutRequestsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpOutRequests", "1.3.6.1.2.1.13.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpOutShortsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpOutShortsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpOutShorts", "1.3.6.1.2.1.13.4.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpOutLongsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpOutLongsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpOutLongs", "1.3.6.1.2.1.13.4.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpInReceivesEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpInReceivesEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpInReceives", "1.3.6.1.2.1.13.4.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpForwRequestsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpForwRequestsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpForwRequests", "1.3.6.1.2.1.13.4.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpInLocalDatagramsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpInLocalDatagramsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpInLocalDatagrams", "1.3.6.1.2.1.13.4.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpNoProtocolHandlersEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpNoProtocolHandlersEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpNoProtocolHandlers", "1.3.6.1.2.1.13.4.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpOutNoRoutesEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpOutNoRoutesEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpOutNoRoutes", "1.3.6.1.2.1.13.4.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpTooShortErrorsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpTooShortErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpTooShortErrors", "1.3.6.1.2.1.13.4.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpTooLongErrorsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpTooLongErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpTooLongErrors", "1.3.6.1.2.1.13.4.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpBroadcastErrorsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpBroadcastErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpBroadcastErrors", "1.3.6.1.2.1.13.4.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpShortDDPErrorsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpShortDDPErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpShortDDPErrors", "1.3.6.1.2.1.13.4.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpHopCountErrorsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpHopCountErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpHopCountErrors", "1.3.6.1.2.1.13.4.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DdpChecksumErrorsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private DdpChecksumErrorsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "ddpChecksumErrors", "1.3.6.1.2.1.13.4.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class RtmpEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The RTMP GroupImplementation of this group is required for all routerswhich implement RTMP*/
            public final RtmpTableEnt rtmpTable;

            private RtmpEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "rtmp", "1.3.6.1.2.1.13.5", false, false, false, false);
                this.rtmpTable = new RtmpTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rtmpTable
                };
            }
            public static final class RtmpTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final RtmpEntryEnt rtmpEntry;

                private RtmpTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "rtmpTable", "1.3.6.1.2.1.13.5.1", false, true, false, false);
                    this.rtmpEntry = new RtmpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtmpEntry
                    };
                }
                public static final class RtmpEntryEnt extends MIBEntry<RFC1243MIBDef>
                {
                    public final RtmpRangeStartEnt rtmpRangeStart;

                    public final RtmpRangeEndEnt rtmpRangeEnd;

                    public final RtmpNextHopEnt rtmpNextHop;

                    public final RtmpTypeEnt rtmpType;

                    public final RtmpPortEnt rtmpPort;

                    public final RtmpHopsEnt rtmpHops;

                    public final RtmpStateEnt rtmpState;

                    private RtmpEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
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
                    public static final class RtmpRangeStartEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpRangeStartEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpRangeStart", "1.3.6.1.2.1.13.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpRangeEndEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpRangeEndEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpRangeEnd", "1.3.6.1.2.1.13.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpNextHopEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpNextHopEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpNextHop", "1.3.6.1.2.1.13.5.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpTypeEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpTypeEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpType", "1.3.6.1.2.1.13.5.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpPortEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpPortEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpPort", "1.3.6.1.2.1.13.5.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpHopsEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpHopsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpHops", "1.3.6.1.2.1.13.5.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtmpStateEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private RtmpStateEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "rtmpState", "1.3.6.1.2.1.13.5.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class KipEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The KIP GroupImplementation of this group is mandatory for allentities that implement KIP*/
            public final KipTableEnt kipTable;

            private KipEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "kip", "1.3.6.1.2.1.13.6", false, false, false, false);
                this.kipTable = new KipTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.kipTable
                };
            }
            public static final class KipTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final KipEntryEnt kipEntry;

                private KipTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "kipTable", "1.3.6.1.2.1.13.6.1", false, true, false, false);
                    this.kipEntry = new KipEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.kipEntry
                    };
                }
                public static final class KipEntryEnt extends MIBEntry<RFC1243MIBDef>
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

                    private KipEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
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
                        this.entries = new MIBEntry<?>[] {
                            this.kipNetStart,
                            this.kipNetEnd,
                            this.kipNextHop,
                            this.kipHopCount,
                            this.kipBCastAddr,
                            this.kipCore,
                            this.kipType,
                            this.kipState,
                            this.kipShare
                        };
                    }
                    public static final class KipNetStartEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipNetStartEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipNetStart", "1.3.6.1.2.1.13.6.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipNetEndEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipNetEndEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipNetEnd", "1.3.6.1.2.1.13.6.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipNextHopEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipNextHopEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipNextHop", "1.3.6.1.2.1.13.6.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipHopCountEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipHopCountEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipHopCount", "1.3.6.1.2.1.13.6.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipBCastAddrEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipBCastAddrEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipBCastAddr", "1.3.6.1.2.1.13.6.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipCoreEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipCoreEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipCore", "1.3.6.1.2.1.13.6.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipTypeEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipTypeEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipType", "1.3.6.1.2.1.13.6.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipStateEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipStateEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipState", "1.3.6.1.2.1.13.6.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class KipShareEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private KipShareEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "kipShare", "1.3.6.1.2.1.13.6.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class ZipRouterEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The ZIP Router GroupImplementation of this group is required for all routerswhich implement ZIPThis group consists of ZIP variables that would beimplemented by a router.*/
            public final ZipTableEnt zipTable;

            private ZipRouterEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "zipRouter", "1.3.6.1.2.1.13.7", false, false, false, false);
                this.zipTable = new ZipTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.zipTable
                };
            }
            public static final class ZipTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final ZipEntryEnt zipEntry;

                private ZipTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "zipTable", "1.3.6.1.2.1.13.7.1", false, true, false, false);
                    this.zipEntry = new ZipEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.zipEntry
                    };
                }
                public static final class ZipEntryEnt extends MIBEntry<RFC1243MIBDef>
                {
                    public final ZipZoneNameEnt zipZoneName;

                    public final ZipZoneIndexEnt zipZoneIndex;

                    public final ZipZoneNetStartEnt zipZoneNetStart;

                    public final ZipZoneNetEndEnt zipZoneNetEnd;

                    public final ZipZoneStateEnt zipZoneState;

                    private ZipEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                    {
                        super(mib, parent, "zipEntry", "1.3.6.1.2.1.13.7.1.1", false, false, false, true);
                        this.zipZoneName = new ZipZoneNameEnt(mib, this);
                        this.zipZoneIndex = new ZipZoneIndexEnt(mib, this);
                        this.zipZoneNetStart = new ZipZoneNetStartEnt(mib, this);
                        this.zipZoneNetEnd = new ZipZoneNetEndEnt(mib, this);
                        this.zipZoneState = new ZipZoneStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.zipZoneName,
                            this.zipZoneIndex,
                            this.zipZoneNetStart,
                            this.zipZoneNetEnd,
                            this.zipZoneState
                        };
                    }
                    public static final class ZipZoneNameEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private ZipZoneNameEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "zipZoneName", "1.3.6.1.2.1.13.7.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneIndexEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private ZipZoneIndexEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "zipZoneIndex", "1.3.6.1.2.1.13.7.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneNetStartEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private ZipZoneNetStartEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "zipZoneNetStart", "1.3.6.1.2.1.13.7.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneNetEndEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private ZipZoneNetEndEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "zipZoneNetEnd", "1.3.6.1.2.1.13.7.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ZipZoneStateEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private ZipZoneStateEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "zipZoneState", "1.3.6.1.2.1.13.7.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class NbpEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The NBP GroupImplementation of this group is mandatory for all entitiesthat implement NBP*/
            public final NbpTableEnt nbpTable;

            private NbpEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "nbp", "1.3.6.1.2.1.13.8", false, false, false, false);
                this.nbpTable = new NbpTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nbpTable
                };
            }
            public static final class NbpTableEnt extends MIBEntry<RFC1243MIBDef>
            {
                public final NbpEntryEnt nbpEntry;

                private NbpTableEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "nbpTable", "1.3.6.1.2.1.13.8.1", false, true, false, false);
                    this.nbpEntry = new NbpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nbpEntry
                    };
                }
                public static final class NbpEntryEnt extends MIBEntry<RFC1243MIBDef>
                {
                    public final NbpIndexEnt nbpIndex;

                    public final NbpObjectEnt nbpObject;

                    public final NbpTypeEnt nbpType;

                    public final NbpZoneEnt nbpZone;

                    public final NbpStateEnt nbpState;

                    private NbpEntryEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                    {
                        super(mib, parent, "nbpEntry", "1.3.6.1.2.1.13.8.1.1", false, false, false, true);
                        this.nbpIndex = new NbpIndexEnt(mib, this);
                        this.nbpObject = new NbpObjectEnt(mib, this);
                        this.nbpType = new NbpTypeEnt(mib, this);
                        this.nbpZone = new NbpZoneEnt(mib, this);
                        this.nbpState = new NbpStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nbpIndex,
                            this.nbpObject,
                            this.nbpType,
                            this.nbpZone,
                            this.nbpState
                        };
                    }
                    public static final class NbpIndexEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private NbpIndexEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "nbpIndex", "1.3.6.1.2.1.13.8.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpObjectEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private NbpObjectEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "nbpObject", "1.3.6.1.2.1.13.8.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpTypeEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private NbpTypeEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "nbpType", "1.3.6.1.2.1.13.8.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpZoneEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private NbpZoneEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "nbpZone", "1.3.6.1.2.1.13.8.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NbpStateEnt extends MIBEntry<RFC1243MIBDef>
                    {
                        private NbpStateEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                        {
                            super(mib, parent, "nbpState", "1.3.6.1.2.1.13.8.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AtechoEnt extends MIBEntry<RFC1243MIBDef>
        {
            /** The ATEcho GroupImplementation of this group is mandatory for allentities that implement ATEcho*/
            public final AtechoRequestsEnt atechoRequests;

            public final AtechoRepliesEnt atechoReplies;

            private AtechoEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
            {
                super(mib, parent, "atecho", "1.3.6.1.2.1.13.9", false, false, false, false);
                this.atechoRequests = new AtechoRequestsEnt(mib, this);
                this.atechoReplies = new AtechoRepliesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atechoRequests,
                    this.atechoReplies
                };
            }
            public static final class AtechoRequestsEnt extends MIBEntry<RFC1243MIBDef>
            {
                private AtechoRequestsEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "atechoRequests", "1.3.6.1.2.1.13.9.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtechoRepliesEnt extends MIBEntry<RFC1243MIBDef>
            {
                private AtechoRepliesEnt(RFC1243MIBDef mib, MIBEntry<RFC1243MIBDef> parent)
                {
                    super(mib, parent, "atechoReplies", "1.3.6.1.2.1.13.9.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
