package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2790]
[RFC2863]*/
public final class PrinterMIBDef extends MIB
{
    public static final PrinterMIBDef PrinterMIB = new PrinterMIBDef();

    public final PrintmibEnt printmib;

    private PrinterMIBDef()
    {
        super("Printer-MIB");
        this.printmib = new PrintmibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.printmib
        };
    }

    public static final class PrintmibEnt extends MIBEntry<PrinterMIBDef>
    {
        /** The General Printer GroupThe general printer sub-unit is responsible for the overallcontrol and status of the printer.  There is exactly onegeneral printer sub-unit in a printer.*/
        public final PrtGeneralEnt prtGeneral;

        /** The Cover TableThe cover portion of the General print sub-unit describes thecovers and interlocks of the printer.  The Cover Table has anentry for each cover and interlock.*/
        public final PrtCoverEnt prtCover;

        /** The Localization TableThe localization portion of the General printer sub-unit isresponsible for identifying the natural language, country, andcharacter set in which character strings are expressed.  Theremay be one or more localizations supported per printer.  Theavailable localizations are represented by the Localizationtable.*/
        public final PrtLocalizationEnt prtLocalization;

        /** The Input GroupInput sub-units are managed as a tabular, indexed collectionof possible devices capable of providing media for input tothe printing process.  Input sub-units typically have alocation, a type, an identifier, a set of constraints onpossible media sizes and potentially other mediacharacteristics, and may be capable of indicating currentstatus or capacity.*/
        public final PrtInputEnt prtInput;

        /** The Output GroupOutput sub-units are managed as a tabular, indexed collectionof possible devices capable of receiving media delivered fromthe printing process.  Output sub-units typically have alocation, a type, an identifier, a set of constraints onpossible media sizes and potentially other characteristics,and may be capable of indicating current status or capacity.*/
        public final PrtOutputEnt prtOutput;

        /** The Marker GroupA marker is the mechanism that produces marks on the printmedia.  The marker sub-units and their associated supplies arerepresented by the Marker Group in the model.  A printer cancontain one or more marking mechanisms.  Some examples ofmultiple marker sub-units are: a printerwith separate markers for normal and magnetic ink or animagesetter that can output to both a proofing device andfinal film.  Each marking device can have its own set ofcharacteristics associated with it, such as marking technologyand resolution.*/
        public final PrtMarkerEnt prtMarker;

        /** The Marker Supplies Group*/
        public final PrtMarkerSuppliesEnt prtMarkerSupplies;

        /** The Marker Colorant Group*/
        public final PrtMarkerColorantEnt prtMarkerColorant;

        /** The Media Path GroupThe media paths encompass the mechanisms in the printer thatmove the media through the printer and connect all other mediarelated sub-units: inputs, outputs, markers and finishers.  Aprinter contains one or more media paths.  These arerepresented by the Media Path Group in the model.*/
        public final PrtMediaPathEnt prtMediaPath;

        /** The Print Job Delivery Channel GroupPrint Job Delivery Channels are independent sources of printdata.  Here, print data is the term used for the informationthat is used to construct printed pages and may have both dataand control aspects.  The output of a channel is in a formsuitable for input to one of the interpreters as astream.  A channel may be independently enabled (allowingprint data to flow) or disabled (stopping the flow ofprint data).  A printer may have one or more channels.The Print Job Delivery Channel table describes thecapabilities of the printer and not what is currently beingperformed by the printerBasically, the print job delivery channel abstractiondescribes the final processing step of getting the print datato an interpreter.  It might include some level ofdecompression or decoding of print stream data.channel.  All of these aspects are hidden in the channelabstraction.There are many kinds of print job delivery channels; some ofwhich are based on networks and others which are not.  Forexample, a channel can be a serial (or parallel) connection;it can be a service, such as the UNIX Line Printer Daemon(LPD), offering services over a network connection; orit could be a disk drive into which a floppy disk withthe print data is inserted.  Each print job delivery channel isidentified by the electronic path and/or service protocolused to deliver print data to a print data interpreter.Channel example                   Implementationserial port channel            bi-directional data channel


parallel port channel          often uni-directional channelIEEE 1284 port channel         bi-directional channelSCSI port channel              bi-directionalApple PAP channel              may be based on LocalTalk,Ethernet or TokentalkLPD Server channel             TCP/IP based, port 515Netware Remote Printer         SPX/IPX based channelNetware Print Server           SPX/IPX based channelIt is easy to note that this is a mixed bag.  There aresome physical connections over which no (or very meager)protocols are run (e.g., the serial or old parallel ports)and there are services which often have elaborateprotocols that run over a number of protocol stacks.  Inthe end, what is important is the delivery of print datathrough the channel.The print job delivery channel sub-units are represented bythe Print Job Delivery Channel Group in the Model.  It has acurrent print job control language, which can be used tospecify which interpreter is to be used for the print data andto query and change environment variables used by theinterpreters (and Management Applications).  There is also adefault interpreter that is to be used if an interpreter isnot explicitly specified using the Control Language.
The first seven items in the Print Job Delivery Channel Tabledefine the "channel" itself.  A channel typically depends onother protocols and interfaces to provide the data that flowsthrough the channel.Control of a print job delivery channel is largely limited toenabling or disabling the entire channel itself.  It is likelythat more control of the process of accessing print datawill be needed over time.  Thus, the ChannelType willallow type-specific data to be associated with eachchannel (using ChannelType specific groups in a fashionanalogous to the media specific MIBs that are associatedwith the IANAIfType in the Interfaces Table).  As a firststep in this direction, each channel will identify theunderlying Interface on which it is based.  This is theeighth object in each row of the table.








The Print Job Delivery Channel Table*/
        public final PrtChannelEnt prtChannel;

        /** The Interpreter GroupThe interpreter sub-units are responsible for the conversionof a description of intended print instances into images thatare to be marked on the media.  A printer may have one or moreinterpreters.  The interpreter sub-units are represented by theInterpreter Group in the Model.  Each interpreter is generallyimplemented with software running on the System Controllersub-unit.  The Interpreter Table has one entry per interpreterwhere the interpreters include both Page Description Language(PDL) Interpreters and Control Language Interpreters.*/
        public final PrtInterpreterEnt prtInterpreter;

        /** The Console GroupMany printers have a console on the printer, the operatorconsole, that is used to display and modify the state of theprinter.  The console can be as simple as a few indicators andswitches or as complicated as full screen displays andkeyboards.  There can be at most one such console.
The Display Buffer Table*/
        public final PrtConsoleDisplayBufferEnt prtConsoleDisplayBuffer;

        /** The Console Light Table*/
        public final PrtConsoleLightsEnt prtConsoleLights;

        /** The Alerts GroupThe table contains information on the severity, component,detail location within the component, alert code anddescription of each critical alert that is currently activewithin the printer.  See 2.2.13 for a more completedescription of the alerts table and its management.Each parameter in the Trap PDU is a full OID which itself isindexed by the host resources MIB "hrDeviceIndex" object.  Inorder for a management station to obtain the correct"hrDeviceIndex" associated with a particular Trap PDU, the"hrDeviceIndex" value can be extracted from the returned OIDvalue in the Trap PDU when the PDU is received by theManagement station.*/
        public final PrtAlertEnt prtAlert;

        /** Note that the SNMPv2 to SNMPv1 translation rules dictate thatthe preceding structure will result in SNMPv1 traps of thefollowing form:printerAlert TRAP-TYPEENTERPRISE printerV1AlertVARIABLES { prtAlertIndex, prtAlertSeverityLevel,prtAlertGroup, prtAlertGroupIndex,prtAlertLocation, prtAlertCode }DESCRIPTION"This trap is sent whenever a critical event is addedto the prtAlertTable."::= 1
Conformance Information*/
        public final PrtMIBConformanceEnt prtMIBConformance;

        private PrintmibEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
        {
            super(mib, parent, "printmib", "1.3.6.1.2.1.43", false, false, false, false);
            this.prtGeneral = new PrtGeneralEnt(mib, this);
            this.prtCover = new PrtCoverEnt(mib, this);
            this.prtLocalization = new PrtLocalizationEnt(mib, this);
            this.prtInput = new PrtInputEnt(mib, this);
            this.prtOutput = new PrtOutputEnt(mib, this);
            this.prtMarker = new PrtMarkerEnt(mib, this);
            this.prtMarkerSupplies = new PrtMarkerSuppliesEnt(mib, this);
            this.prtMarkerColorant = new PrtMarkerColorantEnt(mib, this);
            this.prtMediaPath = new PrtMediaPathEnt(mib, this);
            this.prtChannel = new PrtChannelEnt(mib, this);
            this.prtInterpreter = new PrtInterpreterEnt(mib, this);
            this.prtConsoleDisplayBuffer = new PrtConsoleDisplayBufferEnt(mib, this);
            this.prtConsoleLights = new PrtConsoleLightsEnt(mib, this);
            this.prtAlert = new PrtAlertEnt(mib, this);
            this.prtMIBConformance = new PrtMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.prtGeneral,
                this.prtCover,
                this.prtLocalization,
                this.prtInput,
                this.prtOutput,
                this.prtMarker,
                this.prtMarkerSupplies,
                this.prtMarkerColorant,
                this.prtMediaPath,
                this.prtChannel,
                this.prtInterpreter,
                this.prtConsoleDisplayBuffer,
                this.prtConsoleLights,
                this.prtAlert,
                this.prtMIBConformance
            };
        }
        public static final class PrtGeneralEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtGeneralTableEnt prtGeneralTable;

            /** The System Resources TablesThe Printer MIB makes use of the Host Resources MIB todefine system resources by referencing the storageand device groups of the print group.*/
            public final PrtStorageRefTableEnt prtStorageRefTable;

            public final PrtDeviceRefTableEnt prtDeviceRefTable;

            private PrtGeneralEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtGeneral", "1.3.6.1.2.1.43.5", false, false, false, false);
                this.prtGeneralTable = new PrtGeneralTableEnt(mib, this);
                this.prtStorageRefTable = new PrtStorageRefTableEnt(mib, this);
                this.prtDeviceRefTable = new PrtDeviceRefTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtGeneralTable,
                    this.prtStorageRefTable,
                    this.prtDeviceRefTable
                };
            }
            public static final class PrtGeneralTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtGeneralEntryEnt prtGeneralEntry;

                private PrtGeneralTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtGeneralTable", "1.3.6.1.2.1.43.5.1", false, true, false, false);
                    this.prtGeneralEntry = new PrtGeneralEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtGeneralEntry
                    };
                }
                public static final class PrtGeneralEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtGeneralConfigChangesEnt prtGeneralConfigChanges;

                    public final PrtGeneralCurrentLocalizationEnt prtGeneralCurrentLocalization;

                    public final PrtGeneralResetEnt prtGeneralReset;

                    /** The Responsible Party group*/
                    public final PrtGeneralCurrentOperatorEnt prtGeneralCurrentOperator;

                    public final PrtGeneralServicePersonEnt prtGeneralServicePerson;

                    /** Default indexes sectionThe following four objects are used to specify the indexes ofcertain subunits used as defaults during the printing process.*/
                    public final PrtInputDefaultIndexEnt prtInputDefaultIndex;

                    public final PrtOutputDefaultIndexEnt prtOutputDefaultIndex;

                    public final PrtMarkerDefaultIndexEnt prtMarkerDefaultIndex;

                    public final PrtMediaPathDefaultIndexEnt prtMediaPathDefaultIndex;

                    /** Console general sectionThe following four objects describe overall parameters of theprinter console subsystem.*/
                    public final PrtConsoleLocalizationEnt prtConsoleLocalization;

                    public final PrtConsoleNumberOfDisplayLinesEnt prtConsoleNumberOfDisplayLines;

                    public final PrtConsoleNumberOfDisplayCharsEnt prtConsoleNumberOfDisplayChars;

                    public final PrtConsoleDisableEnt prtConsoleDisable;

                    /** The Auxiliary Sheet GroupThe auxiliary sheet group allows the administrator to controlthe production of auxiliary sheets by the printer.  This groupcontains only the "prtAuxiliarySheetStartupPage" and"prtAuxiliarySheetBannerPage" objects.*/
                    public final PrtAuxiliarySheetStartupPageEnt prtAuxiliarySheetStartupPage;

                    public final PrtAuxiliarySheetBannerPageEnt prtAuxiliarySheetBannerPage;

                    /** Administrative section  (The General V2 Group)The following two objects are used to specify administrativeinformation assigned to the printer.*/
                    public final PrtGeneralPrinterNameEnt prtGeneralPrinterName;

                    public final PrtGeneralSerialNumberEnt prtGeneralSerialNumber;

                    /** General alert table section  (Alert Table V2 Group)The following two objects are used to specify countersassociated with the Alert Table.*/
                    public final PrtAlertCriticalEventsEnt prtAlertCriticalEvents;

                    public final PrtAlertAllEventsEnt prtAlertAllEvents;

                    private PrtGeneralEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtGeneralEntry", "1.3.6.1.2.1.43.5.1.1", false, false, false, true);
                        this.prtGeneralConfigChanges = new PrtGeneralConfigChangesEnt(mib, this);
                        this.prtGeneralCurrentLocalization = new PrtGeneralCurrentLocalizationEnt(mib, this);
                        this.prtGeneralReset = new PrtGeneralResetEnt(mib, this);
                        this.prtGeneralCurrentOperator = new PrtGeneralCurrentOperatorEnt(mib, this);
                        this.prtGeneralServicePerson = new PrtGeneralServicePersonEnt(mib, this);
                        this.prtInputDefaultIndex = new PrtInputDefaultIndexEnt(mib, this);
                        this.prtOutputDefaultIndex = new PrtOutputDefaultIndexEnt(mib, this);
                        this.prtMarkerDefaultIndex = new PrtMarkerDefaultIndexEnt(mib, this);
                        this.prtMediaPathDefaultIndex = new PrtMediaPathDefaultIndexEnt(mib, this);
                        this.prtConsoleLocalization = new PrtConsoleLocalizationEnt(mib, this);
                        this.prtConsoleNumberOfDisplayLines = new PrtConsoleNumberOfDisplayLinesEnt(mib, this);
                        this.prtConsoleNumberOfDisplayChars = new PrtConsoleNumberOfDisplayCharsEnt(mib, this);
                        this.prtConsoleDisable = new PrtConsoleDisableEnt(mib, this);
                        this.prtAuxiliarySheetStartupPage = new PrtAuxiliarySheetStartupPageEnt(mib, this);
                        this.prtAuxiliarySheetBannerPage = new PrtAuxiliarySheetBannerPageEnt(mib, this);
                        this.prtGeneralPrinterName = new PrtGeneralPrinterNameEnt(mib, this);
                        this.prtGeneralSerialNumber = new PrtGeneralSerialNumberEnt(mib, this);
                        this.prtAlertCriticalEvents = new PrtAlertCriticalEventsEnt(mib, this);
                        this.prtAlertAllEvents = new PrtAlertAllEventsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtGeneralConfigChanges,
                            this.prtGeneralCurrentLocalization,
                            this.prtGeneralReset,
                            this.prtGeneralCurrentOperator,
                            this.prtGeneralServicePerson,
                            this.prtInputDefaultIndex,
                            this.prtOutputDefaultIndex,
                            this.prtMarkerDefaultIndex,
                            this.prtMediaPathDefaultIndex,
                            this.prtConsoleLocalization,
                            this.prtConsoleNumberOfDisplayLines,
                            this.prtConsoleNumberOfDisplayChars,
                            this.prtConsoleDisable,
                            this.prtAuxiliarySheetStartupPage,
                            this.prtAuxiliarySheetBannerPage,
                            this.prtGeneralPrinterName,
                            this.prtGeneralSerialNumber,
                            this.prtAlertCriticalEvents,
                            this.prtAlertAllEvents
                        };
                    }
                    public static final class PrtGeneralConfigChangesEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralConfigChangesEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralConfigChanges", "1.3.6.1.2.1.43.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtGeneralCurrentLocalizationEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralCurrentLocalizationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralCurrentLocalization", "1.3.6.1.2.1.43.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtGeneralResetEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralResetEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralReset", "1.3.6.1.2.1.43.5.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtGeneralCurrentOperatorEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralCurrentOperatorEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralCurrentOperator", "1.3.6.1.2.1.43.5.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtGeneralServicePersonEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralServicePersonEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralServicePerson", "1.3.6.1.2.1.43.5.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputDefaultIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputDefaultIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputDefaultIndex", "1.3.6.1.2.1.43.5.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputDefaultIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputDefaultIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputDefaultIndex", "1.3.6.1.2.1.43.5.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerDefaultIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerDefaultIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerDefaultIndex", "1.3.6.1.2.1.43.5.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathDefaultIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathDefaultIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathDefaultIndex", "1.3.6.1.2.1.43.5.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleLocalizationEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleLocalizationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleLocalization", "1.3.6.1.2.1.43.5.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleNumberOfDisplayLinesEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleNumberOfDisplayLinesEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleNumberOfDisplayLines", "1.3.6.1.2.1.43.5.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleNumberOfDisplayCharsEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleNumberOfDisplayCharsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleNumberOfDisplayChars", "1.3.6.1.2.1.43.5.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleDisableEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleDisableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleDisable", "1.3.6.1.2.1.43.5.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAuxiliarySheetStartupPageEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAuxiliarySheetStartupPageEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAuxiliarySheetStartupPage", "1.3.6.1.2.1.43.5.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAuxiliarySheetBannerPageEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAuxiliarySheetBannerPageEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAuxiliarySheetBannerPage", "1.3.6.1.2.1.43.5.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtGeneralPrinterNameEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralPrinterNameEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralPrinterName", "1.3.6.1.2.1.43.5.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtGeneralSerialNumberEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtGeneralSerialNumberEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtGeneralSerialNumber", "1.3.6.1.2.1.43.5.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertCriticalEventsEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertCriticalEventsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertCriticalEvents", "1.3.6.1.2.1.43.5.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertAllEventsEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertAllEventsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertAllEvents", "1.3.6.1.2.1.43.5.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PrtStorageRefTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtStorageRefEntryEnt prtStorageRefEntry;

                private PrtStorageRefTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtStorageRefTable", "1.3.6.1.2.1.43.5.2", false, true, false, false);
                    this.prtStorageRefEntry = new PrtStorageRefEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtStorageRefEntry
                    };
                }
                public static final class PrtStorageRefEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtStorageRefSeqNumberEnt prtStorageRefSeqNumber;

                    public final PrtStorageRefIndexEnt prtStorageRefIndex;

                    private PrtStorageRefEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtStorageRefEntry", "1.3.6.1.2.1.43.5.2.1", false, false, false, true);
                        this.prtStorageRefSeqNumber = new PrtStorageRefSeqNumberEnt(mib, this);
                        this.prtStorageRefIndex = new PrtStorageRefIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtStorageRefSeqNumber,
                            this.prtStorageRefIndex
                        };
                    }
                    public static final class PrtStorageRefSeqNumberEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtStorageRefSeqNumberEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtStorageRefSeqNumber", "1.3.6.1.2.1.43.5.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtStorageRefIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtStorageRefIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtStorageRefIndex", "1.3.6.1.2.1.43.5.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PrtDeviceRefTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtDeviceRefEntryEnt prtDeviceRefEntry;

                private PrtDeviceRefTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtDeviceRefTable", "1.3.6.1.2.1.43.5.3", false, true, false, false);
                    this.prtDeviceRefEntry = new PrtDeviceRefEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtDeviceRefEntry
                    };
                }
                public static final class PrtDeviceRefEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtDeviceRefSeqNumberEnt prtDeviceRefSeqNumber;

                    public final PrtDeviceRefIndexEnt prtDeviceRefIndex;

                    private PrtDeviceRefEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtDeviceRefEntry", "1.3.6.1.2.1.43.5.3.1", false, false, false, true);
                        this.prtDeviceRefSeqNumber = new PrtDeviceRefSeqNumberEnt(mib, this);
                        this.prtDeviceRefIndex = new PrtDeviceRefIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtDeviceRefSeqNumber,
                            this.prtDeviceRefIndex
                        };
                    }
                    public static final class PrtDeviceRefSeqNumberEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtDeviceRefSeqNumberEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtDeviceRefSeqNumber", "1.3.6.1.2.1.43.5.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtDeviceRefIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtDeviceRefIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtDeviceRefIndex", "1.3.6.1.2.1.43.5.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtCoverEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtCoverTableEnt prtCoverTable;

            private PrtCoverEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtCover", "1.3.6.1.2.1.43.6", false, false, false, false);
                this.prtCoverTable = new PrtCoverTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtCoverTable
                };
            }
            public static final class PrtCoverTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtCoverEntryEnt prtCoverEntry;

                private PrtCoverTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtCoverTable", "1.3.6.1.2.1.43.6.1", false, true, false, false);
                    this.prtCoverEntry = new PrtCoverEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtCoverEntry
                    };
                }
                public static final class PrtCoverEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtCoverIndexEnt prtCoverIndex;

                    public final PrtCoverDescriptionEnt prtCoverDescription;

                    public final PrtCoverStatusEnt prtCoverStatus;

                    private PrtCoverEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtCoverEntry", "1.3.6.1.2.1.43.6.1.1", false, false, false, true);
                        this.prtCoverIndex = new PrtCoverIndexEnt(mib, this);
                        this.prtCoverDescription = new PrtCoverDescriptionEnt(mib, this);
                        this.prtCoverStatus = new PrtCoverStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtCoverIndex,
                            this.prtCoverDescription,
                            this.prtCoverStatus
                        };
                    }
                    public static final class PrtCoverIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtCoverIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtCoverIndex", "1.3.6.1.2.1.43.6.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtCoverDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtCoverDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtCoverDescription", "1.3.6.1.2.1.43.6.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtCoverStatusEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtCoverStatusEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtCoverStatus", "1.3.6.1.2.1.43.6.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtLocalizationEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtLocalizationTableEnt prtLocalizationTable;

            private PrtLocalizationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtLocalization", "1.3.6.1.2.1.43.7", false, false, false, false);
                this.prtLocalizationTable = new PrtLocalizationTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtLocalizationTable
                };
            }
            public static final class PrtLocalizationTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtLocalizationEntryEnt prtLocalizationEntry;

                private PrtLocalizationTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtLocalizationTable", "1.3.6.1.2.1.43.7.1", false, true, false, false);
                    this.prtLocalizationEntry = new PrtLocalizationEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtLocalizationEntry
                    };
                }
                public static final class PrtLocalizationEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtLocalizationIndexEnt prtLocalizationIndex;

                    public final PrtLocalizationLanguageEnt prtLocalizationLanguage;

                    public final PrtLocalizationCountryEnt prtLocalizationCountry;

                    public final PrtLocalizationCharacterSetEnt prtLocalizationCharacterSet;

                    private PrtLocalizationEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtLocalizationEntry", "1.3.6.1.2.1.43.7.1.1", false, false, false, true);
                        this.prtLocalizationIndex = new PrtLocalizationIndexEnt(mib, this);
                        this.prtLocalizationLanguage = new PrtLocalizationLanguageEnt(mib, this);
                        this.prtLocalizationCountry = new PrtLocalizationCountryEnt(mib, this);
                        this.prtLocalizationCharacterSet = new PrtLocalizationCharacterSetEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtLocalizationIndex,
                            this.prtLocalizationLanguage,
                            this.prtLocalizationCountry,
                            this.prtLocalizationCharacterSet
                        };
                    }
                    public static final class PrtLocalizationIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtLocalizationIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtLocalizationIndex", "1.3.6.1.2.1.43.7.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtLocalizationLanguageEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtLocalizationLanguageEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtLocalizationLanguage", "1.3.6.1.2.1.43.7.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtLocalizationCountryEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtLocalizationCountryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtLocalizationCountry", "1.3.6.1.2.1.43.7.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtLocalizationCharacterSetEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtLocalizationCharacterSetEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtLocalizationCharacterSet", "1.3.6.1.2.1.43.7.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtInputEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtInputTableEnt prtInputTable;

            private PrtInputEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtInput", "1.3.6.1.2.1.43.8", false, false, false, false);
                this.prtInputTable = new PrtInputTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtInputTable
                };
            }
            public static final class PrtInputTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtInputEntryEnt prtInputEntry;

                private PrtInputTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtInputTable", "1.3.6.1.2.1.43.8.2", false, true, false, false);
                    this.prtInputEntry = new PrtInputEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtInputEntry
                    };
                }
                public static final class PrtInputEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtInputIndexEnt prtInputIndex;

                    public final PrtInputTypeEnt prtInputType;

                    public final PrtInputDimUnitEnt prtInputDimUnit;

                    public final PrtInputMediaDimFeedDirDeclaredEnt prtInputMediaDimFeedDirDeclared;

                    public final PrtInputMediaDimXFeedDirDeclaredEnt prtInputMediaDimXFeedDirDeclared;

                    public final PrtInputMediaDimFeedDirChosenEnt prtInputMediaDimFeedDirChosen;

                    public final PrtInputMediaDimXFeedDirChosenEnt prtInputMediaDimXFeedDirChosen;

                    public final PrtInputCapacityUnitEnt prtInputCapacityUnit;

                    public final PrtInputMaxCapacityEnt prtInputMaxCapacity;

                    public final PrtInputCurrentLevelEnt prtInputCurrentLevel;

                    public final PrtInputStatusEnt prtInputStatus;

                    /** The following reference was not included in RFC 1759.*/
                    public final PrtInputMediaNameEnt prtInputMediaName;

                    /** INPUT MEASUREMENT_______ |               |^      |               ||      |               |                 ||      |_ _ _ _ _ _ _ _| _______________ |direction|      |               |      ^          vMaxCapacity |    Sheets     |      ||      |     left      | CurrentLevel|      |      in       |      |v      |     tray      |      v_______ +_______________+ _______
The Extended Input Group*/
                    public final PrtInputNameEnt prtInputName;

                    public final PrtInputVendorNameEnt prtInputVendorName;

                    public final PrtInputModelEnt prtInputModel;

                    public final PrtInputVersionEnt prtInputVersion;

                    public final PrtInputSerialNumberEnt prtInputSerialNumber;

                    public final PrtInputDescriptionEnt prtInputDescription;

                    public final PrtInputSecurityEnt prtInputSecurity;

                    /** The Input Media GroupThe Input Media Group supports identification of mediainstalled or available for use on a printing device.


Medium resources are identified by name, and include acollection of characteristic attributes that may further beused for selection and management of them.The Input Media group consists of a set of optional"columns" in the Input Table.  In this manner, a minimallyconforming implementation may choose to not support reportingof media resources if it cannot do so.*/
                    public final PrtInputMediaWeightEnt prtInputMediaWeight;

                    /** The following reference was not included in RFC 1759.*/
                    public final PrtInputMediaTypeEnt prtInputMediaType;

                    /** The following reference was not included in RFC 1759.*/
                    public final PrtInputMediaColorEnt prtInputMediaColor;

                    public final PrtInputMediaFormPartsEnt prtInputMediaFormParts;

                    /** The Input Switching GroupThe input switching group allows the administrator to set theinput subunit time-out for the printer and to control theautomatic input subunit switching by the printer when an inputsubunit becomes empty.*/
                    public final PrtInputMediaLoadTimeoutEnt prtInputMediaLoadTimeout;

                    public final PrtInputNextIndexEnt prtInputNextIndex;

                    private PrtInputEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtInputEntry", "1.3.6.1.2.1.43.8.2.1", false, false, false, true);
                        this.prtInputIndex = new PrtInputIndexEnt(mib, this);
                        this.prtInputType = new PrtInputTypeEnt(mib, this);
                        this.prtInputDimUnit = new PrtInputDimUnitEnt(mib, this);
                        this.prtInputMediaDimFeedDirDeclared = new PrtInputMediaDimFeedDirDeclaredEnt(mib, this);
                        this.prtInputMediaDimXFeedDirDeclared = new PrtInputMediaDimXFeedDirDeclaredEnt(mib, this);
                        this.prtInputMediaDimFeedDirChosen = new PrtInputMediaDimFeedDirChosenEnt(mib, this);
                        this.prtInputMediaDimXFeedDirChosen = new PrtInputMediaDimXFeedDirChosenEnt(mib, this);
                        this.prtInputCapacityUnit = new PrtInputCapacityUnitEnt(mib, this);
                        this.prtInputMaxCapacity = new PrtInputMaxCapacityEnt(mib, this);
                        this.prtInputCurrentLevel = new PrtInputCurrentLevelEnt(mib, this);
                        this.prtInputStatus = new PrtInputStatusEnt(mib, this);
                        this.prtInputMediaName = new PrtInputMediaNameEnt(mib, this);
                        this.prtInputName = new PrtInputNameEnt(mib, this);
                        this.prtInputVendorName = new PrtInputVendorNameEnt(mib, this);
                        this.prtInputModel = new PrtInputModelEnt(mib, this);
                        this.prtInputVersion = new PrtInputVersionEnt(mib, this);
                        this.prtInputSerialNumber = new PrtInputSerialNumberEnt(mib, this);
                        this.prtInputDescription = new PrtInputDescriptionEnt(mib, this);
                        this.prtInputSecurity = new PrtInputSecurityEnt(mib, this);
                        this.prtInputMediaWeight = new PrtInputMediaWeightEnt(mib, this);
                        this.prtInputMediaType = new PrtInputMediaTypeEnt(mib, this);
                        this.prtInputMediaColor = new PrtInputMediaColorEnt(mib, this);
                        this.prtInputMediaFormParts = new PrtInputMediaFormPartsEnt(mib, this);
                        this.prtInputMediaLoadTimeout = new PrtInputMediaLoadTimeoutEnt(mib, this);
                        this.prtInputNextIndex = new PrtInputNextIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtInputIndex,
                            this.prtInputType,
                            this.prtInputDimUnit,
                            this.prtInputMediaDimFeedDirDeclared,
                            this.prtInputMediaDimXFeedDirDeclared,
                            this.prtInputMediaDimFeedDirChosen,
                            this.prtInputMediaDimXFeedDirChosen,
                            this.prtInputCapacityUnit,
                            this.prtInputMaxCapacity,
                            this.prtInputCurrentLevel,
                            this.prtInputStatus,
                            this.prtInputMediaName,
                            this.prtInputName,
                            this.prtInputVendorName,
                            this.prtInputModel,
                            this.prtInputVersion,
                            this.prtInputSerialNumber,
                            this.prtInputDescription,
                            this.prtInputSecurity,
                            this.prtInputMediaWeight,
                            this.prtInputMediaType,
                            this.prtInputMediaColor,
                            this.prtInputMediaFormParts,
                            this.prtInputMediaLoadTimeout,
                            this.prtInputNextIndex
                        };
                    }
                    public static final class PrtInputIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputIndex", "1.3.6.1.2.1.43.8.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputTypeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputTypeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputType", "1.3.6.1.2.1.43.8.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputDimUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputDimUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputDimUnit", "1.3.6.1.2.1.43.8.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaDimFeedDirDeclaredEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaDimFeedDirDeclaredEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaDimFeedDirDeclared", "1.3.6.1.2.1.43.8.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaDimXFeedDirDeclaredEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaDimXFeedDirDeclaredEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaDimXFeedDirDeclared", "1.3.6.1.2.1.43.8.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaDimFeedDirChosenEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaDimFeedDirChosenEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaDimFeedDirChosen", "1.3.6.1.2.1.43.8.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaDimXFeedDirChosenEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaDimXFeedDirChosenEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaDimXFeedDirChosen", "1.3.6.1.2.1.43.8.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputCapacityUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputCapacityUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputCapacityUnit", "1.3.6.1.2.1.43.8.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMaxCapacityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMaxCapacityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMaxCapacity", "1.3.6.1.2.1.43.8.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputCurrentLevelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputCurrentLevelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputCurrentLevel", "1.3.6.1.2.1.43.8.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputStatusEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputStatusEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputStatus", "1.3.6.1.2.1.43.8.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaNameEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaNameEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaName", "1.3.6.1.2.1.43.8.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputNameEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputNameEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputName", "1.3.6.1.2.1.43.8.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputVendorNameEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputVendorNameEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputVendorName", "1.3.6.1.2.1.43.8.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputModelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputModelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputModel", "1.3.6.1.2.1.43.8.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputVersionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputVersionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputVersion", "1.3.6.1.2.1.43.8.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputSerialNumberEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputSerialNumberEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputSerialNumber", "1.3.6.1.2.1.43.8.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputDescription", "1.3.6.1.2.1.43.8.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputSecurityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputSecurityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputSecurity", "1.3.6.1.2.1.43.8.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaWeightEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaWeightEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaWeight", "1.3.6.1.2.1.43.8.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaTypeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaTypeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaType", "1.3.6.1.2.1.43.8.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaColorEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaColorEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaColor", "1.3.6.1.2.1.43.8.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaFormPartsEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaFormPartsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaFormParts", "1.3.6.1.2.1.43.8.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputMediaLoadTimeoutEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputMediaLoadTimeoutEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputMediaLoadTimeout", "1.3.6.1.2.1.43.8.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInputNextIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInputNextIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInputNextIndex", "1.3.6.1.2.1.43.8.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtOutputEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtOutputTableEnt prtOutputTable;

            private PrtOutputEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtOutput", "1.3.6.1.2.1.43.9", false, false, false, false);
                this.prtOutputTable = new PrtOutputTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtOutputTable
                };
            }
            public static final class PrtOutputTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtOutputEntryEnt prtOutputEntry;

                private PrtOutputTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtOutputTable", "1.3.6.1.2.1.43.9.2", false, true, false, false);
                    this.prtOutputEntry = new PrtOutputEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtOutputEntry
                    };
                }
                public static final class PrtOutputEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtOutputIndexEnt prtOutputIndex;

                    public final PrtOutputTypeEnt prtOutputType;

                    public final PrtOutputCapacityUnitEnt prtOutputCapacityUnit;

                    public final PrtOutputMaxCapacityEnt prtOutputMaxCapacity;

                    public final PrtOutputRemainingCapacityEnt prtOutputRemainingCapacity;

                    public final PrtOutputStatusEnt prtOutputStatus;

                    /** OUTPUT MEASUREMENT_______  |                | ________^     |                |     ^|     |                |     ||     |                |RemainingCapacityMaxCapacity|                |     ||     |                |     v           ^|     |_ _ _ _ _ _ _ _ | _______________ |direction|     |    Sheets      |                 ||     |      in        |v     |    Output      |_______  +________________+
The Extended Output Group*/
                    public final PrtOutputNameEnt prtOutputName;

                    public final PrtOutputVendorNameEnt prtOutputVendorName;

                    public final PrtOutputModelEnt prtOutputModel;

                    public final PrtOutputVersionEnt prtOutputVersion;

                    public final PrtOutputSerialNumberEnt prtOutputSerialNumber;

                    public final PrtOutputDescriptionEnt prtOutputDescription;

                    public final PrtOutputSecurityEnt prtOutputSecurity;

                    /** The Output Dimensions Group*/
                    public final PrtOutputDimUnitEnt prtOutputDimUnit;

                    public final PrtOutputMaxDimFeedDirEnt prtOutputMaxDimFeedDir;

                    public final PrtOutputMaxDimXFeedDirEnt prtOutputMaxDimXFeedDir;

                    public final PrtOutputMinDimFeedDirEnt prtOutputMinDimFeedDir;

                    public final PrtOutputMinDimXFeedDirEnt prtOutputMinDimXFeedDir;

                    /** The Output Features Group*/
                    public final PrtOutputStackingOrderEnt prtOutputStackingOrder;

                    public final PrtOutputPageDeliveryOrientationEnt prtOutputPageDeliveryOrientation;

                    public final PrtOutputBurstingEnt prtOutputBursting;

                    public final PrtOutputDecollatingEnt prtOutputDecollating;

                    public final PrtOutputPageCollatedEnt prtOutputPageCollated;

                    public final PrtOutputOffsetStackingEnt prtOutputOffsetStacking;

                    private PrtOutputEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtOutputEntry", "1.3.6.1.2.1.43.9.2.1", false, false, false, true);
                        this.prtOutputIndex = new PrtOutputIndexEnt(mib, this);
                        this.prtOutputType = new PrtOutputTypeEnt(mib, this);
                        this.prtOutputCapacityUnit = new PrtOutputCapacityUnitEnt(mib, this);
                        this.prtOutputMaxCapacity = new PrtOutputMaxCapacityEnt(mib, this);
                        this.prtOutputRemainingCapacity = new PrtOutputRemainingCapacityEnt(mib, this);
                        this.prtOutputStatus = new PrtOutputStatusEnt(mib, this);
                        this.prtOutputName = new PrtOutputNameEnt(mib, this);
                        this.prtOutputVendorName = new PrtOutputVendorNameEnt(mib, this);
                        this.prtOutputModel = new PrtOutputModelEnt(mib, this);
                        this.prtOutputVersion = new PrtOutputVersionEnt(mib, this);
                        this.prtOutputSerialNumber = new PrtOutputSerialNumberEnt(mib, this);
                        this.prtOutputDescription = new PrtOutputDescriptionEnt(mib, this);
                        this.prtOutputSecurity = new PrtOutputSecurityEnt(mib, this);
                        this.prtOutputDimUnit = new PrtOutputDimUnitEnt(mib, this);
                        this.prtOutputMaxDimFeedDir = new PrtOutputMaxDimFeedDirEnt(mib, this);
                        this.prtOutputMaxDimXFeedDir = new PrtOutputMaxDimXFeedDirEnt(mib, this);
                        this.prtOutputMinDimFeedDir = new PrtOutputMinDimFeedDirEnt(mib, this);
                        this.prtOutputMinDimXFeedDir = new PrtOutputMinDimXFeedDirEnt(mib, this);
                        this.prtOutputStackingOrder = new PrtOutputStackingOrderEnt(mib, this);
                        this.prtOutputPageDeliveryOrientation = new PrtOutputPageDeliveryOrientationEnt(mib, this);
                        this.prtOutputBursting = new PrtOutputBurstingEnt(mib, this);
                        this.prtOutputDecollating = new PrtOutputDecollatingEnt(mib, this);
                        this.prtOutputPageCollated = new PrtOutputPageCollatedEnt(mib, this);
                        this.prtOutputOffsetStacking = new PrtOutputOffsetStackingEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtOutputIndex,
                            this.prtOutputType,
                            this.prtOutputCapacityUnit,
                            this.prtOutputMaxCapacity,
                            this.prtOutputRemainingCapacity,
                            this.prtOutputStatus,
                            this.prtOutputName,
                            this.prtOutputVendorName,
                            this.prtOutputModel,
                            this.prtOutputVersion,
                            this.prtOutputSerialNumber,
                            this.prtOutputDescription,
                            this.prtOutputSecurity,
                            this.prtOutputDimUnit,
                            this.prtOutputMaxDimFeedDir,
                            this.prtOutputMaxDimXFeedDir,
                            this.prtOutputMinDimFeedDir,
                            this.prtOutputMinDimXFeedDir,
                            this.prtOutputStackingOrder,
                            this.prtOutputPageDeliveryOrientation,
                            this.prtOutputBursting,
                            this.prtOutputDecollating,
                            this.prtOutputPageCollated,
                            this.prtOutputOffsetStacking
                        };
                    }
                    public static final class PrtOutputIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputIndex", "1.3.6.1.2.1.43.9.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputTypeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputTypeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputType", "1.3.6.1.2.1.43.9.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputCapacityUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputCapacityUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputCapacityUnit", "1.3.6.1.2.1.43.9.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputMaxCapacityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputMaxCapacityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputMaxCapacity", "1.3.6.1.2.1.43.9.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputRemainingCapacityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputRemainingCapacityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputRemainingCapacity", "1.3.6.1.2.1.43.9.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputStatusEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputStatusEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputStatus", "1.3.6.1.2.1.43.9.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputNameEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputNameEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputName", "1.3.6.1.2.1.43.9.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputVendorNameEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputVendorNameEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputVendorName", "1.3.6.1.2.1.43.9.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputModelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputModelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputModel", "1.3.6.1.2.1.43.9.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputVersionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputVersionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputVersion", "1.3.6.1.2.1.43.9.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputSerialNumberEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputSerialNumberEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputSerialNumber", "1.3.6.1.2.1.43.9.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputDescription", "1.3.6.1.2.1.43.9.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputSecurityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputSecurityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputSecurity", "1.3.6.1.2.1.43.9.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputDimUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputDimUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputDimUnit", "1.3.6.1.2.1.43.9.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputMaxDimFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputMaxDimFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputMaxDimFeedDir", "1.3.6.1.2.1.43.9.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputMaxDimXFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputMaxDimXFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputMaxDimXFeedDir", "1.3.6.1.2.1.43.9.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputMinDimFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputMinDimFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputMinDimFeedDir", "1.3.6.1.2.1.43.9.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputMinDimXFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputMinDimXFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputMinDimXFeedDir", "1.3.6.1.2.1.43.9.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputStackingOrderEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputStackingOrderEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputStackingOrder", "1.3.6.1.2.1.43.9.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputPageDeliveryOrientationEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputPageDeliveryOrientationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputPageDeliveryOrientation", "1.3.6.1.2.1.43.9.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputBurstingEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputBurstingEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputBursting", "1.3.6.1.2.1.43.9.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputDecollatingEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputDecollatingEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputDecollating", "1.3.6.1.2.1.43.9.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputPageCollatedEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputPageCollatedEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputPageCollated", "1.3.6.1.2.1.43.9.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtOutputOffsetStackingEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtOutputOffsetStackingEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtOutputOffsetStacking", "1.3.6.1.2.1.43.9.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtMarkerEnt extends MIBEntry<PrinterMIBDef>
        {
            /** The printable area margins as listed below define an area ofthe print media which is guaranteed to be printable for allcombinations of input, media paths, and interpreters for thismarker.*/
            public final PrtMarkerTableEnt prtMarkerTable;

            private PrtMarkerEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtMarker", "1.3.6.1.2.1.43.10", false, false, false, false);
                this.prtMarkerTable = new PrtMarkerTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtMarkerTable
                };
            }
            public static final class PrtMarkerTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtMarkerEntryEnt prtMarkerEntry;

                private PrtMarkerTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMarkerTable", "1.3.6.1.2.1.43.10.2", false, true, false, false);
                    this.prtMarkerEntry = new PrtMarkerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtMarkerEntry
                    };
                }
                public static final class PrtMarkerEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtMarkerIndexEnt prtMarkerIndex;

                    public final PrtMarkerMarkTechEnt prtMarkerMarkTech;

                    public final PrtMarkerCounterUnitEnt prtMarkerCounterUnit;

                    public final PrtMarkerLifeCountEnt prtMarkerLifeCount;

                    public final PrtMarkerPowerOnCountEnt prtMarkerPowerOnCount;

                    public final PrtMarkerProcessColorantsEnt prtMarkerProcessColorants;

                    public final PrtMarkerSpotColorantsEnt prtMarkerSpotColorants;

                    public final PrtMarkerAddressabilityUnitEnt prtMarkerAddressabilityUnit;

                    public final PrtMarkerAddressabilityFeedDirEnt prtMarkerAddressabilityFeedDir;

                    public final PrtMarkerAddressabilityXFeedDirEnt prtMarkerAddressabilityXFeedDir;

                    public final PrtMarkerNorthMarginEnt prtMarkerNorthMargin;

                    public final PrtMarkerSouthMarginEnt prtMarkerSouthMargin;

                    public final PrtMarkerWestMarginEnt prtMarkerWestMargin;

                    public final PrtMarkerEastMarginEnt prtMarkerEastMargin;

                    public final PrtMarkerStatusEnt prtMarkerStatus;

                    private PrtMarkerEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMarkerEntry", "1.3.6.1.2.1.43.10.2.1", false, false, false, true);
                        this.prtMarkerIndex = new PrtMarkerIndexEnt(mib, this);
                        this.prtMarkerMarkTech = new PrtMarkerMarkTechEnt(mib, this);
                        this.prtMarkerCounterUnit = new PrtMarkerCounterUnitEnt(mib, this);
                        this.prtMarkerLifeCount = new PrtMarkerLifeCountEnt(mib, this);
                        this.prtMarkerPowerOnCount = new PrtMarkerPowerOnCountEnt(mib, this);
                        this.prtMarkerProcessColorants = new PrtMarkerProcessColorantsEnt(mib, this);
                        this.prtMarkerSpotColorants = new PrtMarkerSpotColorantsEnt(mib, this);
                        this.prtMarkerAddressabilityUnit = new PrtMarkerAddressabilityUnitEnt(mib, this);
                        this.prtMarkerAddressabilityFeedDir = new PrtMarkerAddressabilityFeedDirEnt(mib, this);
                        this.prtMarkerAddressabilityXFeedDir = new PrtMarkerAddressabilityXFeedDirEnt(mib, this);
                        this.prtMarkerNorthMargin = new PrtMarkerNorthMarginEnt(mib, this);
                        this.prtMarkerSouthMargin = new PrtMarkerSouthMarginEnt(mib, this);
                        this.prtMarkerWestMargin = new PrtMarkerWestMarginEnt(mib, this);
                        this.prtMarkerEastMargin = new PrtMarkerEastMarginEnt(mib, this);
                        this.prtMarkerStatus = new PrtMarkerStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtMarkerIndex,
                            this.prtMarkerMarkTech,
                            this.prtMarkerCounterUnit,
                            this.prtMarkerLifeCount,
                            this.prtMarkerPowerOnCount,
                            this.prtMarkerProcessColorants,
                            this.prtMarkerSpotColorants,
                            this.prtMarkerAddressabilityUnit,
                            this.prtMarkerAddressabilityFeedDir,
                            this.prtMarkerAddressabilityXFeedDir,
                            this.prtMarkerNorthMargin,
                            this.prtMarkerSouthMargin,
                            this.prtMarkerWestMargin,
                            this.prtMarkerEastMargin,
                            this.prtMarkerStatus
                        };
                    }
                    public static final class PrtMarkerIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerIndex", "1.3.6.1.2.1.43.10.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerMarkTechEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerMarkTechEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerMarkTech", "1.3.6.1.2.1.43.10.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerCounterUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerCounterUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerCounterUnit", "1.3.6.1.2.1.43.10.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerLifeCountEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerLifeCountEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerLifeCount", "1.3.6.1.2.1.43.10.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerPowerOnCountEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerPowerOnCountEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerPowerOnCount", "1.3.6.1.2.1.43.10.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerProcessColorantsEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerProcessColorantsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerProcessColorants", "1.3.6.1.2.1.43.10.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSpotColorantsEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSpotColorantsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSpotColorants", "1.3.6.1.2.1.43.10.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerAddressabilityUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerAddressabilityUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerAddressabilityUnit", "1.3.6.1.2.1.43.10.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerAddressabilityFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerAddressabilityFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerAddressabilityFeedDir", "1.3.6.1.2.1.43.10.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerAddressabilityXFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerAddressabilityXFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerAddressabilityXFeedDir", "1.3.6.1.2.1.43.10.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerNorthMarginEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerNorthMarginEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerNorthMargin", "1.3.6.1.2.1.43.10.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSouthMarginEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSouthMarginEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSouthMargin", "1.3.6.1.2.1.43.10.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerWestMarginEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerWestMarginEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerWestMargin", "1.3.6.1.2.1.43.10.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerEastMarginEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerEastMarginEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerEastMargin", "1.3.6.1.2.1.43.10.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerStatusEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerStatusEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerStatus", "1.3.6.1.2.1.43.10.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtMarkerSuppliesEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtMarkerSuppliesTableEnt prtMarkerSuppliesTable;

            private PrtMarkerSuppliesEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtMarkerSupplies", "1.3.6.1.2.1.43.11", false, false, false, false);
                this.prtMarkerSuppliesTable = new PrtMarkerSuppliesTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtMarkerSuppliesTable
                };
            }
            public static final class PrtMarkerSuppliesTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtMarkerSuppliesEntryEnt prtMarkerSuppliesEntry;

                private PrtMarkerSuppliesTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMarkerSuppliesTable", "1.3.6.1.2.1.43.11.1", false, true, false, false);
                    this.prtMarkerSuppliesEntry = new PrtMarkerSuppliesEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtMarkerSuppliesEntry
                    };
                }
                public static final class PrtMarkerSuppliesEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtMarkerSuppliesIndexEnt prtMarkerSuppliesIndex;

                    public final PrtMarkerSuppliesMarkerIndexEnt prtMarkerSuppliesMarkerIndex;

                    public final PrtMarkerSuppliesColorantIndexEnt prtMarkerSuppliesColorantIndex;

                    public final PrtMarkerSuppliesClassEnt prtMarkerSuppliesClass;

                    public final PrtMarkerSuppliesTypeEnt prtMarkerSuppliesType;

                    public final PrtMarkerSuppliesDescriptionEnt prtMarkerSuppliesDescription;

                    public final PrtMarkerSuppliesSupplyUnitEnt prtMarkerSuppliesSupplyUnit;

                    public final PrtMarkerSuppliesMaxCapacityEnt prtMarkerSuppliesMaxCapacity;

                    public final PrtMarkerSuppliesLevelEnt prtMarkerSuppliesLevel;

                    private PrtMarkerSuppliesEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMarkerSuppliesEntry", "1.3.6.1.2.1.43.11.1.1", false, false, false, true);
                        this.prtMarkerSuppliesIndex = new PrtMarkerSuppliesIndexEnt(mib, this);
                        this.prtMarkerSuppliesMarkerIndex = new PrtMarkerSuppliesMarkerIndexEnt(mib, this);
                        this.prtMarkerSuppliesColorantIndex = new PrtMarkerSuppliesColorantIndexEnt(mib, this);
                        this.prtMarkerSuppliesClass = new PrtMarkerSuppliesClassEnt(mib, this);
                        this.prtMarkerSuppliesType = new PrtMarkerSuppliesTypeEnt(mib, this);
                        this.prtMarkerSuppliesDescription = new PrtMarkerSuppliesDescriptionEnt(mib, this);
                        this.prtMarkerSuppliesSupplyUnit = new PrtMarkerSuppliesSupplyUnitEnt(mib, this);
                        this.prtMarkerSuppliesMaxCapacity = new PrtMarkerSuppliesMaxCapacityEnt(mib, this);
                        this.prtMarkerSuppliesLevel = new PrtMarkerSuppliesLevelEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtMarkerSuppliesIndex,
                            this.prtMarkerSuppliesMarkerIndex,
                            this.prtMarkerSuppliesColorantIndex,
                            this.prtMarkerSuppliesClass,
                            this.prtMarkerSuppliesType,
                            this.prtMarkerSuppliesDescription,
                            this.prtMarkerSuppliesSupplyUnit,
                            this.prtMarkerSuppliesMaxCapacity,
                            this.prtMarkerSuppliesLevel
                        };
                    }
                    public static final class PrtMarkerSuppliesIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesIndex", "1.3.6.1.2.1.43.11.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesMarkerIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesMarkerIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesMarkerIndex", "1.3.6.1.2.1.43.11.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesColorantIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesColorantIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesColorantIndex", "1.3.6.1.2.1.43.11.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesClassEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesClassEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesClass", "1.3.6.1.2.1.43.11.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesTypeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesTypeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesType", "1.3.6.1.2.1.43.11.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesDescription", "1.3.6.1.2.1.43.11.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesSupplyUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesSupplyUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesSupplyUnit", "1.3.6.1.2.1.43.11.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesMaxCapacityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesMaxCapacityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesMaxCapacity", "1.3.6.1.2.1.43.11.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerSuppliesLevelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerSuppliesLevelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerSuppliesLevel", "1.3.6.1.2.1.43.11.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtMarkerColorantEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtMarkerColorantTableEnt prtMarkerColorantTable;

            private PrtMarkerColorantEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtMarkerColorant", "1.3.6.1.2.1.43.12", false, false, false, false);
                this.prtMarkerColorantTable = new PrtMarkerColorantTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtMarkerColorantTable
                };
            }
            public static final class PrtMarkerColorantTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtMarkerColorantEntryEnt prtMarkerColorantEntry;

                private PrtMarkerColorantTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMarkerColorantTable", "1.3.6.1.2.1.43.12.1", false, true, false, false);
                    this.prtMarkerColorantEntry = new PrtMarkerColorantEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtMarkerColorantEntry
                    };
                }
                public static final class PrtMarkerColorantEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtMarkerColorantIndexEnt prtMarkerColorantIndex;

                    public final PrtMarkerColorantMarkerIndexEnt prtMarkerColorantMarkerIndex;

                    public final PrtMarkerColorantRoleEnt prtMarkerColorantRole;

                    public final PrtMarkerColorantValueEnt prtMarkerColorantValue;

                    public final PrtMarkerColorantTonalityEnt prtMarkerColorantTonality;

                    private PrtMarkerColorantEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMarkerColorantEntry", "1.3.6.1.2.1.43.12.1.1", false, false, false, true);
                        this.prtMarkerColorantIndex = new PrtMarkerColorantIndexEnt(mib, this);
                        this.prtMarkerColorantMarkerIndex = new PrtMarkerColorantMarkerIndexEnt(mib, this);
                        this.prtMarkerColorantRole = new PrtMarkerColorantRoleEnt(mib, this);
                        this.prtMarkerColorantValue = new PrtMarkerColorantValueEnt(mib, this);
                        this.prtMarkerColorantTonality = new PrtMarkerColorantTonalityEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtMarkerColorantIndex,
                            this.prtMarkerColorantMarkerIndex,
                            this.prtMarkerColorantRole,
                            this.prtMarkerColorantValue,
                            this.prtMarkerColorantTonality
                        };
                    }
                    public static final class PrtMarkerColorantIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerColorantIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerColorantIndex", "1.3.6.1.2.1.43.12.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerColorantMarkerIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerColorantMarkerIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerColorantMarkerIndex", "1.3.6.1.2.1.43.12.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerColorantRoleEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerColorantRoleEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerColorantRole", "1.3.6.1.2.1.43.12.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerColorantValueEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerColorantValueEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerColorantValue", "1.3.6.1.2.1.43.12.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMarkerColorantTonalityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMarkerColorantTonalityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMarkerColorantTonality", "1.3.6.1.2.1.43.12.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtMediaPathEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtMediaPathTableEnt prtMediaPathTable;

            private PrtMediaPathEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtMediaPath", "1.3.6.1.2.1.43.13", false, false, false, false);
                this.prtMediaPathTable = new PrtMediaPathTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtMediaPathTable
                };
            }
            public static final class PrtMediaPathTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtMediaPathEntryEnt prtMediaPathEntry;

                private PrtMediaPathTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMediaPathTable", "1.3.6.1.2.1.43.13.4", false, true, false, false);
                    this.prtMediaPathEntry = new PrtMediaPathEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtMediaPathEntry
                    };
                }
                public static final class PrtMediaPathEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtMediaPathIndexEnt prtMediaPathIndex;

                    public final PrtMediaPathMaxSpeedPrintUnitEnt prtMediaPathMaxSpeedPrintUnit;

                    public final PrtMediaPathMediaSizeUnitEnt prtMediaPathMediaSizeUnit;

                    public final PrtMediaPathMaxSpeedEnt prtMediaPathMaxSpeed;

                    public final PrtMediaPathMaxMediaFeedDirEnt prtMediaPathMaxMediaFeedDir;

                    public final PrtMediaPathMaxMediaXFeedDirEnt prtMediaPathMaxMediaXFeedDir;

                    public final PrtMediaPathMinMediaFeedDirEnt prtMediaPathMinMediaFeedDir;

                    public final PrtMediaPathMinMediaXFeedDirEnt prtMediaPathMinMediaXFeedDir;

                    public final PrtMediaPathTypeEnt prtMediaPathType;

                    public final PrtMediaPathDescriptionEnt prtMediaPathDescription;

                    public final PrtMediaPathStatusEnt prtMediaPathStatus;

                    private PrtMediaPathEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMediaPathEntry", "1.3.6.1.2.1.43.13.4.1", false, false, false, true);
                        this.prtMediaPathIndex = new PrtMediaPathIndexEnt(mib, this);
                        this.prtMediaPathMaxSpeedPrintUnit = new PrtMediaPathMaxSpeedPrintUnitEnt(mib, this);
                        this.prtMediaPathMediaSizeUnit = new PrtMediaPathMediaSizeUnitEnt(mib, this);
                        this.prtMediaPathMaxSpeed = new PrtMediaPathMaxSpeedEnt(mib, this);
                        this.prtMediaPathMaxMediaFeedDir = new PrtMediaPathMaxMediaFeedDirEnt(mib, this);
                        this.prtMediaPathMaxMediaXFeedDir = new PrtMediaPathMaxMediaXFeedDirEnt(mib, this);
                        this.prtMediaPathMinMediaFeedDir = new PrtMediaPathMinMediaFeedDirEnt(mib, this);
                        this.prtMediaPathMinMediaXFeedDir = new PrtMediaPathMinMediaXFeedDirEnt(mib, this);
                        this.prtMediaPathType = new PrtMediaPathTypeEnt(mib, this);
                        this.prtMediaPathDescription = new PrtMediaPathDescriptionEnt(mib, this);
                        this.prtMediaPathStatus = new PrtMediaPathStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtMediaPathIndex,
                            this.prtMediaPathMaxSpeedPrintUnit,
                            this.prtMediaPathMediaSizeUnit,
                            this.prtMediaPathMaxSpeed,
                            this.prtMediaPathMaxMediaFeedDir,
                            this.prtMediaPathMaxMediaXFeedDir,
                            this.prtMediaPathMinMediaFeedDir,
                            this.prtMediaPathMinMediaXFeedDir,
                            this.prtMediaPathType,
                            this.prtMediaPathDescription,
                            this.prtMediaPathStatus
                        };
                    }
                    public static final class PrtMediaPathIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathIndex", "1.3.6.1.2.1.43.13.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMaxSpeedPrintUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMaxSpeedPrintUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMaxSpeedPrintUnit", "1.3.6.1.2.1.43.13.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMediaSizeUnitEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMediaSizeUnitEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMediaSizeUnit", "1.3.6.1.2.1.43.13.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMaxSpeedEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMaxSpeedEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMaxSpeed", "1.3.6.1.2.1.43.13.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMaxMediaFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMaxMediaFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMaxMediaFeedDir", "1.3.6.1.2.1.43.13.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMaxMediaXFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMaxMediaXFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMaxMediaXFeedDir", "1.3.6.1.2.1.43.13.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMinMediaFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMinMediaFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMinMediaFeedDir", "1.3.6.1.2.1.43.13.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathMinMediaXFeedDirEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathMinMediaXFeedDirEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathMinMediaXFeedDir", "1.3.6.1.2.1.43.13.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathTypeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathTypeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathType", "1.3.6.1.2.1.43.13.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathDescription", "1.3.6.1.2.1.43.13.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtMediaPathStatusEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtMediaPathStatusEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtMediaPathStatus", "1.3.6.1.2.1.43.13.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtChannelEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtChannelTableEnt prtChannelTable;

            private PrtChannelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtChannel", "1.3.6.1.2.1.43.14", false, false, false, false);
                this.prtChannelTable = new PrtChannelTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtChannelTable
                };
            }
            public static final class PrtChannelTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtChannelEntryEnt prtChannelEntry;

                private PrtChannelTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtChannelTable", "1.3.6.1.2.1.43.14.1", false, true, false, false);
                    this.prtChannelEntry = new PrtChannelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtChannelEntry
                    };
                }
                public static final class PrtChannelEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtChannelIndexEnt prtChannelIndex;

                    public final PrtChannelTypeEnt prtChannelType;

                    public final PrtChannelProtocolVersionEnt prtChannelProtocolVersion;

                    public final PrtChannelCurrentJobCntlLangIndexEnt prtChannelCurrentJobCntlLangIndex;

                    public final PrtChannelDefaultPageDescLangIndexEnt prtChannelDefaultPageDescLangIndex;

                    public final PrtChannelStateEnt prtChannelState;

                    public final PrtChannelIfIndexEnt prtChannelIfIndex;

                    public final PrtChannelStatusEnt prtChannelStatus;

                    public final PrtChannelInformationEnt prtChannelInformation;

                    private PrtChannelEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtChannelEntry", "1.3.6.1.2.1.43.14.1.1", false, false, false, true);
                        this.prtChannelIndex = new PrtChannelIndexEnt(mib, this);
                        this.prtChannelType = new PrtChannelTypeEnt(mib, this);
                        this.prtChannelProtocolVersion = new PrtChannelProtocolVersionEnt(mib, this);
                        this.prtChannelCurrentJobCntlLangIndex = new PrtChannelCurrentJobCntlLangIndexEnt(mib, this);
                        this.prtChannelDefaultPageDescLangIndex = new PrtChannelDefaultPageDescLangIndexEnt(mib, this);
                        this.prtChannelState = new PrtChannelStateEnt(mib, this);
                        this.prtChannelIfIndex = new PrtChannelIfIndexEnt(mib, this);
                        this.prtChannelStatus = new PrtChannelStatusEnt(mib, this);
                        this.prtChannelInformation = new PrtChannelInformationEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtChannelIndex,
                            this.prtChannelType,
                            this.prtChannelProtocolVersion,
                            this.prtChannelCurrentJobCntlLangIndex,
                            this.prtChannelDefaultPageDescLangIndex,
                            this.prtChannelState,
                            this.prtChannelIfIndex,
                            this.prtChannelStatus,
                            this.prtChannelInformation
                        };
                    }
                    public static final class PrtChannelIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelIndex", "1.3.6.1.2.1.43.14.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelTypeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelTypeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelType", "1.3.6.1.2.1.43.14.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelProtocolVersionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelProtocolVersionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelProtocolVersion", "1.3.6.1.2.1.43.14.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelCurrentJobCntlLangIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelCurrentJobCntlLangIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelCurrentJobCntlLangIndex", "1.3.6.1.2.1.43.14.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelDefaultPageDescLangIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelDefaultPageDescLangIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelDefaultPageDescLangIndex", "1.3.6.1.2.1.43.14.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelStateEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelStateEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelState", "1.3.6.1.2.1.43.14.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelIfIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelIfIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelIfIndex", "1.3.6.1.2.1.43.14.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelStatusEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelStatusEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelStatus", "1.3.6.1.2.1.43.14.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtChannelInformationEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtChannelInformationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtChannelInformation", "1.3.6.1.2.1.43.14.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtInterpreterEnt extends MIBEntry<PrinterMIBDef>
        {
            /** Interpreter Table*/
            public final PrtInterpreterTableEnt prtInterpreterTable;

            private PrtInterpreterEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtInterpreter", "1.3.6.1.2.1.43.15", false, false, false, false);
                this.prtInterpreterTable = new PrtInterpreterTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtInterpreterTable
                };
            }
            public static final class PrtInterpreterTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtInterpreterEntryEnt prtInterpreterEntry;

                private PrtInterpreterTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtInterpreterTable", "1.3.6.1.2.1.43.15.1", false, true, false, false);
                    this.prtInterpreterEntry = new PrtInterpreterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtInterpreterEntry
                    };
                }
                public static final class PrtInterpreterEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtInterpreterIndexEnt prtInterpreterIndex;

                    public final PrtInterpreterLangFamilyEnt prtInterpreterLangFamily;

                    public final PrtInterpreterLangLevelEnt prtInterpreterLangLevel;

                    public final PrtInterpreterLangVersionEnt prtInterpreterLangVersion;

                    public final PrtInterpreterDescriptionEnt prtInterpreterDescription;

                    public final PrtInterpreterVersionEnt prtInterpreterVersion;

                    public final PrtInterpreterDefaultOrientationEnt prtInterpreterDefaultOrientation;

                    public final PrtInterpreterFeedAddressabilityEnt prtInterpreterFeedAddressability;

                    public final PrtInterpreterXFeedAddressabilityEnt prtInterpreterXFeedAddressability;

                    public final PrtInterpreterDefaultCharSetInEnt prtInterpreterDefaultCharSetIn;

                    public final PrtInterpreterDefaultCharSetOutEnt prtInterpreterDefaultCharSetOut;

                    public final PrtInterpreterTwoWayEnt prtInterpreterTwoWay;

                    private PrtInterpreterEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtInterpreterEntry", "1.3.6.1.2.1.43.15.1.1", false, false, false, true);
                        this.prtInterpreterIndex = new PrtInterpreterIndexEnt(mib, this);
                        this.prtInterpreterLangFamily = new PrtInterpreterLangFamilyEnt(mib, this);
                        this.prtInterpreterLangLevel = new PrtInterpreterLangLevelEnt(mib, this);
                        this.prtInterpreterLangVersion = new PrtInterpreterLangVersionEnt(mib, this);
                        this.prtInterpreterDescription = new PrtInterpreterDescriptionEnt(mib, this);
                        this.prtInterpreterVersion = new PrtInterpreterVersionEnt(mib, this);
                        this.prtInterpreterDefaultOrientation = new PrtInterpreterDefaultOrientationEnt(mib, this);
                        this.prtInterpreterFeedAddressability = new PrtInterpreterFeedAddressabilityEnt(mib, this);
                        this.prtInterpreterXFeedAddressability = new PrtInterpreterXFeedAddressabilityEnt(mib, this);
                        this.prtInterpreterDefaultCharSetIn = new PrtInterpreterDefaultCharSetInEnt(mib, this);
                        this.prtInterpreterDefaultCharSetOut = new PrtInterpreterDefaultCharSetOutEnt(mib, this);
                        this.prtInterpreterTwoWay = new PrtInterpreterTwoWayEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtInterpreterIndex,
                            this.prtInterpreterLangFamily,
                            this.prtInterpreterLangLevel,
                            this.prtInterpreterLangVersion,
                            this.prtInterpreterDescription,
                            this.prtInterpreterVersion,
                            this.prtInterpreterDefaultOrientation,
                            this.prtInterpreterFeedAddressability,
                            this.prtInterpreterXFeedAddressability,
                            this.prtInterpreterDefaultCharSetIn,
                            this.prtInterpreterDefaultCharSetOut,
                            this.prtInterpreterTwoWay
                        };
                    }
                    public static final class PrtInterpreterIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterIndex", "1.3.6.1.2.1.43.15.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterLangFamilyEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterLangFamilyEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterLangFamily", "1.3.6.1.2.1.43.15.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterLangLevelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterLangLevelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterLangLevel", "1.3.6.1.2.1.43.15.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterLangVersionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterLangVersionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterLangVersion", "1.3.6.1.2.1.43.15.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterDescription", "1.3.6.1.2.1.43.15.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterVersionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterVersionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterVersion", "1.3.6.1.2.1.43.15.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterDefaultOrientationEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterDefaultOrientationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterDefaultOrientation", "1.3.6.1.2.1.43.15.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterFeedAddressabilityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterFeedAddressabilityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterFeedAddressability", "1.3.6.1.2.1.43.15.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterXFeedAddressabilityEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterXFeedAddressabilityEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterXFeedAddressability", "1.3.6.1.2.1.43.15.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterDefaultCharSetInEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterDefaultCharSetInEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterDefaultCharSetIn", "1.3.6.1.2.1.43.15.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterDefaultCharSetOutEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterDefaultCharSetOutEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterDefaultCharSetOut", "1.3.6.1.2.1.43.15.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtInterpreterTwoWayEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtInterpreterTwoWayEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtInterpreterTwoWay", "1.3.6.1.2.1.43.15.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtConsoleDisplayBufferEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtConsoleDisplayBufferTableEnt prtConsoleDisplayBufferTable;

            private PrtConsoleDisplayBufferEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtConsoleDisplayBuffer", "1.3.6.1.2.1.43.16", false, false, false, false);
                this.prtConsoleDisplayBufferTable = new PrtConsoleDisplayBufferTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtConsoleDisplayBufferTable
                };
            }
            public static final class PrtConsoleDisplayBufferTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtConsoleDisplayBufferEntryEnt prtConsoleDisplayBufferEntry;

                private PrtConsoleDisplayBufferTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtConsoleDisplayBufferTable", "1.3.6.1.2.1.43.16.5", false, true, false, false);
                    this.prtConsoleDisplayBufferEntry = new PrtConsoleDisplayBufferEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtConsoleDisplayBufferEntry
                    };
                }
                public static final class PrtConsoleDisplayBufferEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtConsoleDisplayBufferIndexEnt prtConsoleDisplayBufferIndex;

                    public final PrtConsoleDisplayBufferTextEnt prtConsoleDisplayBufferText;

                    private PrtConsoleDisplayBufferEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtConsoleDisplayBufferEntry", "1.3.6.1.2.1.43.16.5.1", false, false, false, true);
                        this.prtConsoleDisplayBufferIndex = new PrtConsoleDisplayBufferIndexEnt(mib, this);
                        this.prtConsoleDisplayBufferText = new PrtConsoleDisplayBufferTextEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtConsoleDisplayBufferIndex,
                            this.prtConsoleDisplayBufferText
                        };
                    }
                    public static final class PrtConsoleDisplayBufferIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleDisplayBufferIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleDisplayBufferIndex", "1.3.6.1.2.1.43.16.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleDisplayBufferTextEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleDisplayBufferTextEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleDisplayBufferText", "1.3.6.1.2.1.43.16.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtConsoleLightsEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtConsoleLightTableEnt prtConsoleLightTable;

            private PrtConsoleLightsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtConsoleLights", "1.3.6.1.2.1.43.17", false, false, false, false);
                this.prtConsoleLightTable = new PrtConsoleLightTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtConsoleLightTable
                };
            }
            public static final class PrtConsoleLightTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtConsoleLightEntryEnt prtConsoleLightEntry;

                private PrtConsoleLightTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtConsoleLightTable", "1.3.6.1.2.1.43.17.6", false, true, false, false);
                    this.prtConsoleLightEntry = new PrtConsoleLightEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtConsoleLightEntry
                    };
                }
                public static final class PrtConsoleLightEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtConsoleLightIndexEnt prtConsoleLightIndex;

                    public final PrtConsoleOnTimeEnt prtConsoleOnTime;

                    public final PrtConsoleOffTimeEnt prtConsoleOffTime;

                    public final PrtConsoleColorEnt prtConsoleColor;

                    public final PrtConsoleDescriptionEnt prtConsoleDescription;

                    private PrtConsoleLightEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtConsoleLightEntry", "1.3.6.1.2.1.43.17.6.1", false, false, false, true);
                        this.prtConsoleLightIndex = new PrtConsoleLightIndexEnt(mib, this);
                        this.prtConsoleOnTime = new PrtConsoleOnTimeEnt(mib, this);
                        this.prtConsoleOffTime = new PrtConsoleOffTimeEnt(mib, this);
                        this.prtConsoleColor = new PrtConsoleColorEnt(mib, this);
                        this.prtConsoleDescription = new PrtConsoleDescriptionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtConsoleLightIndex,
                            this.prtConsoleOnTime,
                            this.prtConsoleOffTime,
                            this.prtConsoleColor,
                            this.prtConsoleDescription
                        };
                    }
                    public static final class PrtConsoleLightIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleLightIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleLightIndex", "1.3.6.1.2.1.43.17.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleOnTimeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleOnTimeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleOnTime", "1.3.6.1.2.1.43.17.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleOffTimeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleOffTimeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleOffTime", "1.3.6.1.2.1.43.17.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleColorEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleColorEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleColor", "1.3.6.1.2.1.43.17.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtConsoleDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtConsoleDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtConsoleDescription", "1.3.6.1.2.1.43.17.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtAlertEnt extends MIBEntry<PrinterMIBDef>
        {
            public final PrtAlertTableEnt prtAlertTable;

            public final PrinterV1AlertEnt printerV1Alert;

            private PrtAlertEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtAlert", "1.3.6.1.2.1.43.18", false, false, false, false);
                this.prtAlertTable = new PrtAlertTableEnt(mib, this);
                this.printerV1Alert = new PrinterV1AlertEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtAlertTable,
                    this.printerV1Alert
                };
            }
            public static final class PrtAlertTableEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrtAlertEntryEnt prtAlertEntry;

                private PrtAlertTableEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtAlertTable", "1.3.6.1.2.1.43.18.1", false, true, false, false);
                    this.prtAlertEntry = new PrtAlertEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtAlertEntry
                    };
                }
                public static final class PrtAlertEntryEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrtAlertIndexEnt prtAlertIndex;

                    public final PrtAlertSeverityLevelEnt prtAlertSeverityLevel;

                    public final PrtAlertTrainingLevelEnt prtAlertTrainingLevel;

                    public final PrtAlertGroupEnt prtAlertGroup;

                    public final PrtAlertGroupIndexEnt prtAlertGroupIndex;

                    public final PrtAlertLocationEnt prtAlertLocation;

                    public final PrtAlertCodeEnt prtAlertCode;

                    public final PrtAlertDescriptionEnt prtAlertDescription;

                    public final PrtAlertTimeEnt prtAlertTime;

                    private PrtAlertEntryEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtAlertEntry", "1.3.6.1.2.1.43.18.1.1", false, false, false, true);
                        this.prtAlertIndex = new PrtAlertIndexEnt(mib, this);
                        this.prtAlertSeverityLevel = new PrtAlertSeverityLevelEnt(mib, this);
                        this.prtAlertTrainingLevel = new PrtAlertTrainingLevelEnt(mib, this);
                        this.prtAlertGroup = new PrtAlertGroupEnt(mib, this);
                        this.prtAlertGroupIndex = new PrtAlertGroupIndexEnt(mib, this);
                        this.prtAlertLocation = new PrtAlertLocationEnt(mib, this);
                        this.prtAlertCode = new PrtAlertCodeEnt(mib, this);
                        this.prtAlertDescription = new PrtAlertDescriptionEnt(mib, this);
                        this.prtAlertTime = new PrtAlertTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.prtAlertIndex,
                            this.prtAlertSeverityLevel,
                            this.prtAlertTrainingLevel,
                            this.prtAlertGroup,
                            this.prtAlertGroupIndex,
                            this.prtAlertLocation,
                            this.prtAlertCode,
                            this.prtAlertDescription,
                            this.prtAlertTime
                        };
                    }
                    public static final class PrtAlertIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertIndex", "1.3.6.1.2.1.43.18.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertSeverityLevelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertSeverityLevelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertSeverityLevel", "1.3.6.1.2.1.43.18.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertTrainingLevelEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertTrainingLevelEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertTrainingLevel", "1.3.6.1.2.1.43.18.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertGroupEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertGroup", "1.3.6.1.2.1.43.18.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertGroupIndexEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertGroupIndexEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertGroupIndex", "1.3.6.1.2.1.43.18.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertLocationEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertLocationEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertLocation", "1.3.6.1.2.1.43.18.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertCodeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertCodeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertCode", "1.3.6.1.2.1.43.18.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertDescriptionEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertDescriptionEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertDescription", "1.3.6.1.2.1.43.18.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PrtAlertTimeEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrtAlertTimeEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "prtAlertTime", "1.3.6.1.2.1.43.18.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PrinterV1AlertEnt extends MIBEntry<PrinterMIBDef>
            {
                public final PrinterV2AlertPrefixEnt printerV2AlertPrefix;

                private PrinterV1AlertEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "printerV1Alert", "1.3.6.1.2.1.43.18.2", false, false, false, false);
                    this.printerV2AlertPrefix = new PrinterV2AlertPrefixEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.printerV2AlertPrefix
                    };
                }
                public static final class PrinterV2AlertPrefixEnt extends MIBEntry<PrinterMIBDef>
                {
                    public final PrinterV2AlertEnt printerV2Alert;

                    private PrinterV2AlertPrefixEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "printerV2AlertPrefix", "1.3.6.1.2.1.43.18.2.0", false, false, false, false);
                        this.printerV2Alert = new PrinterV2AlertEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.printerV2Alert
                        };
                    }
                    public static final class PrinterV2AlertEnt extends MIBEntry<PrinterMIBDef>
                    {
                        private PrinterV2AlertEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                        {
                            super(mib, parent, "printerV2Alert", "1.3.6.1.2.1.43.18.2.0.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PrtMIBConformanceEnt extends MIBEntry<PrinterMIBDef>
        {
            /** compliance statements*/
            public final PrtMIBComplianceEnt prtMIBCompliance;

            public final PrtMIB2ComplianceEnt prtMIB2Compliance;

            public final PrtMIBGroupsEnt prtMIBGroups;

            public final PrtMIB2GroupsEnt prtMIB2Groups;

            private PrtMIBConformanceEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
            {
                super(mib, parent, "prtMIBConformance", "1.3.6.1.2.1.43.2", false, false, false, false);
                this.prtMIBCompliance = new PrtMIBComplianceEnt(mib, this);
                this.prtMIB2Compliance = new PrtMIB2ComplianceEnt(mib, this);
                this.prtMIBGroups = new PrtMIBGroupsEnt(mib, this);
                this.prtMIB2Groups = new PrtMIB2GroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.prtMIBCompliance,
                    this.prtMIB2Compliance,
                    this.prtMIBGroups,
                    this.prtMIB2Groups
                };
            }
            public static final class PrtMIBComplianceEnt extends MIBEntry<PrinterMIBDef>
            {
                private PrtMIBComplianceEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMIBCompliance", "1.3.6.1.2.1.43.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PrtMIB2ComplianceEnt extends MIBEntry<PrinterMIBDef>
            {
                private PrtMIB2ComplianceEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMIB2Compliance", "1.3.6.1.2.1.43.2.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PrtMIBGroupsEnt extends MIBEntry<PrinterMIBDef>
            {
                /** These groups are from RFC 1759 and are applicable to Printer MIB V2*/
                public final PrtGeneralGroupEnt prtGeneralGroup;

                public final PrtResponsiblePartyGroupEnt prtResponsiblePartyGroup;

                public final PrtInputGroupEnt prtInputGroup;

                public final PrtExtendedInputGroupEnt prtExtendedInputGroup;

                public final PrtInputMediaGroupEnt prtInputMediaGroup;

                public final PrtOutputGroupEnt prtOutputGroup;

                public final PrtExtendedOutputGroupEnt prtExtendedOutputGroup;

                public final PrtOutputDimensionsGroupEnt prtOutputDimensionsGroup;

                public final PrtOutputFeaturesGroupEnt prtOutputFeaturesGroup;

                public final PrtMarkerGroupEnt prtMarkerGroup;

                public final PrtMarkerSuppliesGroupEnt prtMarkerSuppliesGroup;

                public final PrtMarkerColorantGroupEnt prtMarkerColorantGroup;

                public final PrtMediaPathGroupEnt prtMediaPathGroup;

                public final PrtChannelGroupEnt prtChannelGroup;

                public final PrtInterpreterGroupEnt prtInterpreterGroup;

                public final PrtConsoleGroupEnt prtConsoleGroup;

                public final PrtAlertTableGroupEnt prtAlertTableGroup;

                public final PrtAlertTimeGroupEnt prtAlertTimeGroup;

                /** These groups are unique to Printer MIB V2*/
                public final PrtAuxiliarySheetGroupEnt prtAuxiliarySheetGroup;

                public final PrtInputSwitchingGroupEnt prtInputSwitchingGroup;

                public final PrtGeneralV2GroupEnt prtGeneralV2Group;

                public final PrtAlertTableV2GroupEnt prtAlertTableV2Group;

                public final PrtChannelV2GroupEnt prtChannelV2Group;

                public final PrtAlertTrapGroupEnt prtAlertTrapGroup;

                private PrtMIBGroupsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMIBGroups", "1.3.6.1.2.1.43.2.2", false, false, false, false);
                    this.prtGeneralGroup = new PrtGeneralGroupEnt(mib, this);
                    this.prtResponsiblePartyGroup = new PrtResponsiblePartyGroupEnt(mib, this);
                    this.prtInputGroup = new PrtInputGroupEnt(mib, this);
                    this.prtExtendedInputGroup = new PrtExtendedInputGroupEnt(mib, this);
                    this.prtInputMediaGroup = new PrtInputMediaGroupEnt(mib, this);
                    this.prtOutputGroup = new PrtOutputGroupEnt(mib, this);
                    this.prtExtendedOutputGroup = new PrtExtendedOutputGroupEnt(mib, this);
                    this.prtOutputDimensionsGroup = new PrtOutputDimensionsGroupEnt(mib, this);
                    this.prtOutputFeaturesGroup = new PrtOutputFeaturesGroupEnt(mib, this);
                    this.prtMarkerGroup = new PrtMarkerGroupEnt(mib, this);
                    this.prtMarkerSuppliesGroup = new PrtMarkerSuppliesGroupEnt(mib, this);
                    this.prtMarkerColorantGroup = new PrtMarkerColorantGroupEnt(mib, this);
                    this.prtMediaPathGroup = new PrtMediaPathGroupEnt(mib, this);
                    this.prtChannelGroup = new PrtChannelGroupEnt(mib, this);
                    this.prtInterpreterGroup = new PrtInterpreterGroupEnt(mib, this);
                    this.prtConsoleGroup = new PrtConsoleGroupEnt(mib, this);
                    this.prtAlertTableGroup = new PrtAlertTableGroupEnt(mib, this);
                    this.prtAlertTimeGroup = new PrtAlertTimeGroupEnt(mib, this);
                    this.prtAuxiliarySheetGroup = new PrtAuxiliarySheetGroupEnt(mib, this);
                    this.prtInputSwitchingGroup = new PrtInputSwitchingGroupEnt(mib, this);
                    this.prtGeneralV2Group = new PrtGeneralV2GroupEnt(mib, this);
                    this.prtAlertTableV2Group = new PrtAlertTableV2GroupEnt(mib, this);
                    this.prtChannelV2Group = new PrtChannelV2GroupEnt(mib, this);
                    this.prtAlertTrapGroup = new PrtAlertTrapGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.prtGeneralGroup,
                        this.prtResponsiblePartyGroup,
                        this.prtInputGroup,
                        this.prtExtendedInputGroup,
                        this.prtInputMediaGroup,
                        this.prtOutputGroup,
                        this.prtExtendedOutputGroup,
                        this.prtOutputDimensionsGroup,
                        this.prtOutputFeaturesGroup,
                        this.prtMarkerGroup,
                        this.prtMarkerSuppliesGroup,
                        this.prtMarkerColorantGroup,
                        this.prtMediaPathGroup,
                        this.prtChannelGroup,
                        this.prtInterpreterGroup,
                        this.prtConsoleGroup,
                        this.prtAlertTableGroup,
                        this.prtAlertTimeGroup,
                        this.prtAuxiliarySheetGroup,
                        this.prtInputSwitchingGroup,
                        this.prtGeneralV2Group,
                        this.prtAlertTableV2Group,
                        this.prtChannelV2Group,
                        this.prtAlertTrapGroup
                    };
                }
                public static final class PrtGeneralGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtGeneralGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtGeneralGroup", "1.3.6.1.2.1.43.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtResponsiblePartyGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtResponsiblePartyGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtResponsiblePartyGroup", "1.3.6.1.2.1.43.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtInputGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtInputGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtInputGroup", "1.3.6.1.2.1.43.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtExtendedInputGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtExtendedInputGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtExtendedInputGroup", "1.3.6.1.2.1.43.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtInputMediaGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtInputMediaGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtInputMediaGroup", "1.3.6.1.2.1.43.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtOutputGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtOutputGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtOutputGroup", "1.3.6.1.2.1.43.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtExtendedOutputGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtExtendedOutputGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtExtendedOutputGroup", "1.3.6.1.2.1.43.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtOutputDimensionsGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtOutputDimensionsGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtOutputDimensionsGroup", "1.3.6.1.2.1.43.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtOutputFeaturesGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtOutputFeaturesGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtOutputFeaturesGroup", "1.3.6.1.2.1.43.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtMarkerGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtMarkerGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMarkerGroup", "1.3.6.1.2.1.43.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtMarkerSuppliesGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtMarkerSuppliesGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMarkerSuppliesGroup", "1.3.6.1.2.1.43.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtMarkerColorantGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtMarkerColorantGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMarkerColorantGroup", "1.3.6.1.2.1.43.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtMediaPathGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtMediaPathGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtMediaPathGroup", "1.3.6.1.2.1.43.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtChannelGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtChannelGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtChannelGroup", "1.3.6.1.2.1.43.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtInterpreterGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtInterpreterGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtInterpreterGroup", "1.3.6.1.2.1.43.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtConsoleGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtConsoleGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtConsoleGroup", "1.3.6.1.2.1.43.2.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtAlertTableGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtAlertTableGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtAlertTableGroup", "1.3.6.1.2.1.43.2.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtAlertTimeGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtAlertTimeGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtAlertTimeGroup", "1.3.6.1.2.1.43.2.2.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtAuxiliarySheetGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtAuxiliarySheetGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtAuxiliarySheetGroup", "1.3.6.1.2.1.43.2.2.19", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtInputSwitchingGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtInputSwitchingGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtInputSwitchingGroup", "1.3.6.1.2.1.43.2.2.20", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtGeneralV2GroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtGeneralV2GroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtGeneralV2Group", "1.3.6.1.2.1.43.2.2.21", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtAlertTableV2GroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtAlertTableV2GroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtAlertTableV2Group", "1.3.6.1.2.1.43.2.2.22", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtChannelV2GroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtChannelV2GroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtChannelV2Group", "1.3.6.1.2.1.43.2.2.23", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrtAlertTrapGroupEnt extends MIBEntry<PrinterMIBDef>
                {
                    private PrtAlertTrapGroupEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                    {
                        super(mib, parent, "prtAlertTrapGroup", "1.3.6.1.2.1.43.2.2.24", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PrtMIB2GroupsEnt extends MIBEntry<PrinterMIBDef>
            {
                private PrtMIB2GroupsEnt(PrinterMIBDef mib, MIBEntry<PrinterMIBDef> parent)
                {
                    super(mib, parent, "prtMIB2Groups", "1.3.6.1.2.1.43.2.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
