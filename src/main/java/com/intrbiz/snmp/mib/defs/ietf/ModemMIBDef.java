package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ModemMIBDef extends MIB
{
    public static final ModemMIBDef ModemMIB = new ModemMIBDef();

    static { MIBs.getInstance().registerMIB(ModemMIBDef.ModemMIB); }

    public final MdmMibEnt mdmMib;

    private ModemMIBDef()
    {
        super("Modem-MIB");
        this.mdmMib = new MdmMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mdmMib
        };
    }

    public static final class MdmMibEnt extends MIBEntry<ModemMIBDef>
    {
        public final MdmMIBEnt mdmMIB;

        private MdmMibEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
        {
            super(mib, parent, "mdmMib", "1.3.6.1.2.1.38", false, false, false, false);
            this.mdmMIB = new MdmMIBEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mdmMIB
            };
        }
        public static final class MdmMIBEnt extends MIBEntry<ModemMIBDef>
        {
            public final MdmMIBObjectsEnt mdmMIBObjects;

            /** conformance information*/
            public final MdmConformanceEnt mdmConformance;

            private MdmMIBEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
            {
                super(mib, parent, "mdmMIB", "1.3.6.1.2.1.38.1", false, false, false, false);
                this.mdmMIBObjects = new MdmMIBObjectsEnt(mib, this);
                this.mdmConformance = new MdmConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mdmMIBObjects,
                    this.mdmConformance
                };
            }
            public static final class MdmMIBObjectsEnt extends MIBEntry<ModemMIBDef>
            {
                public final MdmNumberEnt mdmNumber;

                /** The modem ID table.*/
                public final MdmIDTableEnt mdmIDTable;

                /** The modem Line Interface Table*/
                public final MdmLineTableEnt mdmLineTable;

                public final MdmLineCapabilitiesTableEnt mdmLineCapabilitiesTable;

                public final MdmLineCapabilitiesEnt mdmLineCapabilities;

                /** DTE Interface Table*/
                public final MdmDTEInterfaceTableEnt mdmDTEInterfaceTable;

                /** The Call Control Table*/
                public final MdmCallControlTableEnt mdmCallControlTable;

                /** The Stored Dial String table*/
                public final MdmCCStoredDialStringTableEnt mdmCCStoredDialStringTable;

                /** The modem Error Correcting Group*/
                public final MdmECTableEnt mdmECTable;

                /** The modem Data Compression Group*/
                public final MdmDCTableEnt mdmDCTable;

                /** The modem Signal Convertor Group*/
                public final MdmSCTableEnt mdmSCTable;

                /** The Modem Statistics Table*/
                public final MdmStatsTableEnt mdmStatsTable;

                private MdmMIBObjectsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                {
                    super(mib, parent, "mdmMIBObjects", "1.3.6.1.2.1.38.1.1", false, false, false, false);
                    this.mdmNumber = new MdmNumberEnt(mib, this);
                    this.mdmIDTable = new MdmIDTableEnt(mib, this);
                    this.mdmLineTable = new MdmLineTableEnt(mib, this);
                    this.mdmLineCapabilitiesTable = new MdmLineCapabilitiesTableEnt(mib, this);
                    this.mdmLineCapabilities = new MdmLineCapabilitiesEnt(mib, this);
                    this.mdmDTEInterfaceTable = new MdmDTEInterfaceTableEnt(mib, this);
                    this.mdmCallControlTable = new MdmCallControlTableEnt(mib, this);
                    this.mdmCCStoredDialStringTable = new MdmCCStoredDialStringTableEnt(mib, this);
                    this.mdmECTable = new MdmECTableEnt(mib, this);
                    this.mdmDCTable = new MdmDCTableEnt(mib, this);
                    this.mdmSCTable = new MdmSCTableEnt(mib, this);
                    this.mdmStatsTable = new MdmStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mdmNumber,
                        this.mdmIDTable,
                        this.mdmLineTable,
                        this.mdmLineCapabilitiesTable,
                        this.mdmLineCapabilities,
                        this.mdmDTEInterfaceTable,
                        this.mdmCallControlTable,
                        this.mdmCCStoredDialStringTable,
                        this.mdmECTable,
                        this.mdmDCTable,
                        this.mdmSCTable,
                        this.mdmStatsTable
                    };
                }
                public static final class MdmNumberEnt extends MIBEntry<ModemMIBDef>
                {
                    private MdmNumberEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmNumber", "1.3.6.1.2.1.38.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MdmIDTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmIDEntryEnt mdmIDEntry;

                    private MdmIDTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmIDTable", "1.3.6.1.2.1.38.1.1.2", false, true, false, false);
                        this.mdmIDEntry = new MdmIDEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmIDEntry
                        };
                    }
                    public static final class MdmIDEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmIndexEnt mdmIndex;

                        public final MdmIDManufacturerOIDEnt mdmIDManufacturerOID;

                        public final MdmIDProductDetailsEnt mdmIDProductDetails;

                        private MdmIDEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmIDEntry", "1.3.6.1.2.1.38.1.1.2.1", false, false, false, true);
                            this.mdmIndex = new MdmIndexEnt(mib, this);
                            this.mdmIDManufacturerOID = new MdmIDManufacturerOIDEnt(mib, this);
                            this.mdmIDProductDetails = new MdmIDProductDetailsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmIndex,
                                this.mdmIDManufacturerOID,
                                this.mdmIDProductDetails
                            };
                        }
                        public static final class MdmIndexEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmIndexEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmIndex", "1.3.6.1.2.1.38.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmIDManufacturerOIDEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmIDManufacturerOIDEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmIDManufacturerOID", "1.3.6.1.2.1.38.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmIDProductDetailsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmIDProductDetailsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmIDProductDetails", "1.3.6.1.2.1.38.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmLineTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmLineEntryEnt mdmLineEntry;

                    private MdmLineTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmLineTable", "1.3.6.1.2.1.38.1.1.3", false, true, false, false);
                        this.mdmLineEntry = new MdmLineEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmLineEntry
                        };
                    }
                    public static final class MdmLineEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmLineCarrierLossTimeEnt mdmLineCarrierLossTime;

                        public final MdmLineStateEnt mdmLineState;

                        private MdmLineEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineEntry", "1.3.6.1.2.1.38.1.1.3.1", false, false, false, true);
                            this.mdmLineCarrierLossTime = new MdmLineCarrierLossTimeEnt(mib, this);
                            this.mdmLineState = new MdmLineStateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmLineCarrierLossTime,
                                this.mdmLineState
                            };
                        }
                        public static final class MdmLineCarrierLossTimeEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmLineCarrierLossTimeEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmLineCarrierLossTime", "1.3.6.1.2.1.38.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmLineStateEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmLineStateEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmLineState", "1.3.6.1.2.1.38.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmLineCapabilitiesTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmLineCapabilitiesEntryEnt mdmLineCapabilitiesEntry;

                    private MdmLineCapabilitiesTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmLineCapabilitiesTable", "1.3.6.1.2.1.38.1.1.4", false, true, false, false);
                        this.mdmLineCapabilitiesEntry = new MdmLineCapabilitiesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmLineCapabilitiesEntry
                        };
                    }
                    public static final class MdmLineCapabilitiesEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmLineCapabilitiesIndexEnt mdmLineCapabilitiesIndex;

                        public final MdmLineCapabilitiesIDEnt mdmLineCapabilitiesID;

                        public final MdmLineCapabilitiesEnableRequestedEnt mdmLineCapabilitiesEnableRequested;

                        public final MdmLineCapabilitiesEnableGrantedEnt mdmLineCapabilitiesEnableGranted;

                        private MdmLineCapabilitiesEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesEntry", "1.3.6.1.2.1.38.1.1.4.1", false, false, false, true);
                            this.mdmLineCapabilitiesIndex = new MdmLineCapabilitiesIndexEnt(mib, this);
                            this.mdmLineCapabilitiesID = new MdmLineCapabilitiesIDEnt(mib, this);
                            this.mdmLineCapabilitiesEnableRequested = new MdmLineCapabilitiesEnableRequestedEnt(mib, this);
                            this.mdmLineCapabilitiesEnableGranted = new MdmLineCapabilitiesEnableGrantedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmLineCapabilitiesIndex,
                                this.mdmLineCapabilitiesID,
                                this.mdmLineCapabilitiesEnableRequested,
                                this.mdmLineCapabilitiesEnableGranted
                            };
                        }
                        public static final class MdmLineCapabilitiesIndexEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmLineCapabilitiesIndexEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmLineCapabilitiesIndex", "1.3.6.1.2.1.38.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmLineCapabilitiesIDEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmLineCapabilitiesIDEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmLineCapabilitiesID", "1.3.6.1.2.1.38.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmLineCapabilitiesEnableRequestedEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmLineCapabilitiesEnableRequestedEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmLineCapabilitiesEnableRequested", "1.3.6.1.2.1.38.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmLineCapabilitiesEnableGrantedEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmLineCapabilitiesEnableGrantedEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmLineCapabilitiesEnableGranted", "1.3.6.1.2.1.38.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmLineCapabilitiesEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmLineCapabilitiesV21Ent mdmLineCapabilitiesV21;

                    public final MdmLineCapabilitiesV22Ent mdmLineCapabilitiesV22;

                    public final MdmLineCapabilitiesV22bisEnt mdmLineCapabilitiesV22bis;

                    public final MdmLineCapabilitiesV23CCEnt mdmLineCapabilitiesV23CC;

                    public final MdmLineCapabilitiesV23SCEnt mdmLineCapabilitiesV23SC;

                    public final MdmLineCapabilitiesV25bisEnt mdmLineCapabilitiesV25bis;

                    public final MdmLineCapabilitiesV26bisEnt mdmLineCapabilitiesV26bis;

                    public final MdmLineCapabilitiesV26terEnt mdmLineCapabilitiesV26ter;

                    public final MdmLineCapabilitiesV27terEnt mdmLineCapabilitiesV27ter;

                    public final MdmLineCapabilitiesV32Ent mdmLineCapabilitiesV32;

                    public final MdmLineCapabilitiesV32bisEnt mdmLineCapabilitiesV32bis;

                    public final MdmLineCapabilitiesV32terboEnt mdmLineCapabilitiesV32terbo;

                    public final MdmLineCapabilitiesVFCEnt mdmLineCapabilitiesVFC;

                    public final MdmLineCapabilitiesV34Ent mdmLineCapabilitiesV34;

                    public final MdmLineCapabilitiesV42Ent mdmLineCapabilitiesV42;

                    public final MdmLineCapabilitiesV42bisEnt mdmLineCapabilitiesV42bis;

                    public final MdmLineCapabilitiesMNP1Ent mdmLineCapabilitiesMNP1;

                    public final MdmLineCapabilitiesMNP2Ent mdmLineCapabilitiesMNP2;

                    public final MdmLineCapabilitiesMNP3Ent mdmLineCapabilitiesMNP3;

                    public final MdmLineCapabilitiesMNP4Ent mdmLineCapabilitiesMNP4;

                    public final MdmLineCapabilitiesMNP5Ent mdmLineCapabilitiesMNP5;

                    public final MdmLineCapabilitiesMNP6Ent mdmLineCapabilitiesMNP6;

                    public final MdmLineCapabilitiesMNP7Ent mdmLineCapabilitiesMNP7;

                    public final MdmLineCapabilitiesMNP8Ent mdmLineCapabilitiesMNP8;

                    public final MdmLineCapabilitiesMNP9Ent mdmLineCapabilitiesMNP9;

                    public final MdmLineCapabilitiesMNP10Ent mdmLineCapabilitiesMNP10;

                    public final MdmLineCapabilitiesV29Ent mdmLineCapabilitiesV29;

                    public final MdmLineCapabilitiesV33Ent mdmLineCapabilitiesV33;

                    public final MdmLineCapabilitiesBell208Ent mdmLineCapabilitiesBell208;

                    private MdmLineCapabilitiesEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmLineCapabilities", "1.3.6.1.2.1.38.1.1.5", false, false, false, false);
                        this.mdmLineCapabilitiesV21 = new MdmLineCapabilitiesV21Ent(mib, this);
                        this.mdmLineCapabilitiesV22 = new MdmLineCapabilitiesV22Ent(mib, this);
                        this.mdmLineCapabilitiesV22bis = new MdmLineCapabilitiesV22bisEnt(mib, this);
                        this.mdmLineCapabilitiesV23CC = new MdmLineCapabilitiesV23CCEnt(mib, this);
                        this.mdmLineCapabilitiesV23SC = new MdmLineCapabilitiesV23SCEnt(mib, this);
                        this.mdmLineCapabilitiesV25bis = new MdmLineCapabilitiesV25bisEnt(mib, this);
                        this.mdmLineCapabilitiesV26bis = new MdmLineCapabilitiesV26bisEnt(mib, this);
                        this.mdmLineCapabilitiesV26ter = new MdmLineCapabilitiesV26terEnt(mib, this);
                        this.mdmLineCapabilitiesV27ter = new MdmLineCapabilitiesV27terEnt(mib, this);
                        this.mdmLineCapabilitiesV32 = new MdmLineCapabilitiesV32Ent(mib, this);
                        this.mdmLineCapabilitiesV32bis = new MdmLineCapabilitiesV32bisEnt(mib, this);
                        this.mdmLineCapabilitiesV32terbo = new MdmLineCapabilitiesV32terboEnt(mib, this);
                        this.mdmLineCapabilitiesVFC = new MdmLineCapabilitiesVFCEnt(mib, this);
                        this.mdmLineCapabilitiesV34 = new MdmLineCapabilitiesV34Ent(mib, this);
                        this.mdmLineCapabilitiesV42 = new MdmLineCapabilitiesV42Ent(mib, this);
                        this.mdmLineCapabilitiesV42bis = new MdmLineCapabilitiesV42bisEnt(mib, this);
                        this.mdmLineCapabilitiesMNP1 = new MdmLineCapabilitiesMNP1Ent(mib, this);
                        this.mdmLineCapabilitiesMNP2 = new MdmLineCapabilitiesMNP2Ent(mib, this);
                        this.mdmLineCapabilitiesMNP3 = new MdmLineCapabilitiesMNP3Ent(mib, this);
                        this.mdmLineCapabilitiesMNP4 = new MdmLineCapabilitiesMNP4Ent(mib, this);
                        this.mdmLineCapabilitiesMNP5 = new MdmLineCapabilitiesMNP5Ent(mib, this);
                        this.mdmLineCapabilitiesMNP6 = new MdmLineCapabilitiesMNP6Ent(mib, this);
                        this.mdmLineCapabilitiesMNP7 = new MdmLineCapabilitiesMNP7Ent(mib, this);
                        this.mdmLineCapabilitiesMNP8 = new MdmLineCapabilitiesMNP8Ent(mib, this);
                        this.mdmLineCapabilitiesMNP9 = new MdmLineCapabilitiesMNP9Ent(mib, this);
                        this.mdmLineCapabilitiesMNP10 = new MdmLineCapabilitiesMNP10Ent(mib, this);
                        this.mdmLineCapabilitiesV29 = new MdmLineCapabilitiesV29Ent(mib, this);
                        this.mdmLineCapabilitiesV33 = new MdmLineCapabilitiesV33Ent(mib, this);
                        this.mdmLineCapabilitiesBell208 = new MdmLineCapabilitiesBell208Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmLineCapabilitiesV21,
                            this.mdmLineCapabilitiesV22,
                            this.mdmLineCapabilitiesV22bis,
                            this.mdmLineCapabilitiesV23CC,
                            this.mdmLineCapabilitiesV23SC,
                            this.mdmLineCapabilitiesV25bis,
                            this.mdmLineCapabilitiesV26bis,
                            this.mdmLineCapabilitiesV26ter,
                            this.mdmLineCapabilitiesV27ter,
                            this.mdmLineCapabilitiesV32,
                            this.mdmLineCapabilitiesV32bis,
                            this.mdmLineCapabilitiesV32terbo,
                            this.mdmLineCapabilitiesVFC,
                            this.mdmLineCapabilitiesV34,
                            this.mdmLineCapabilitiesV42,
                            this.mdmLineCapabilitiesV42bis,
                            this.mdmLineCapabilitiesMNP1,
                            this.mdmLineCapabilitiesMNP2,
                            this.mdmLineCapabilitiesMNP3,
                            this.mdmLineCapabilitiesMNP4,
                            this.mdmLineCapabilitiesMNP5,
                            this.mdmLineCapabilitiesMNP6,
                            this.mdmLineCapabilitiesMNP7,
                            this.mdmLineCapabilitiesMNP8,
                            this.mdmLineCapabilitiesMNP9,
                            this.mdmLineCapabilitiesMNP10,
                            this.mdmLineCapabilitiesV29,
                            this.mdmLineCapabilitiesV33,
                            this.mdmLineCapabilitiesBell208
                        };
                    }
                    public static final class MdmLineCapabilitiesV21Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV21Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV21", "1.3.6.1.2.1.38.1.1.5.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV22Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV22Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV22", "1.3.6.1.2.1.38.1.1.5.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV22bisEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV22bisEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV22bis", "1.3.6.1.2.1.38.1.1.5.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV23CCEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV23CCEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV23CC", "1.3.6.1.2.1.38.1.1.5.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV23SCEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV23SCEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV23SC", "1.3.6.1.2.1.38.1.1.5.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV25bisEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV25bisEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV25bis", "1.3.6.1.2.1.38.1.1.5.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV26bisEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV26bisEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV26bis", "1.3.6.1.2.1.38.1.1.5.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV26terEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV26terEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV26ter", "1.3.6.1.2.1.38.1.1.5.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV27terEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV27terEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV27ter", "1.3.6.1.2.1.38.1.1.5.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV32Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV32Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV32", "1.3.6.1.2.1.38.1.1.5.10", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV32bisEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV32bisEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV32bis", "1.3.6.1.2.1.38.1.1.5.11", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV32terboEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV32terboEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV32terbo", "1.3.6.1.2.1.38.1.1.5.12", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesVFCEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesVFCEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesVFC", "1.3.6.1.2.1.38.1.1.5.13", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV34Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV34Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV34", "1.3.6.1.2.1.38.1.1.5.14", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV42Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV42Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV42", "1.3.6.1.2.1.38.1.1.5.15", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV42bisEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV42bisEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV42bis", "1.3.6.1.2.1.38.1.1.5.16", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP1Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP1Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP1", "1.3.6.1.2.1.38.1.1.5.17", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP2Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP2Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP2", "1.3.6.1.2.1.38.1.1.5.18", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP3Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP3Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP3", "1.3.6.1.2.1.38.1.1.5.19", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP4Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP4Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP4", "1.3.6.1.2.1.38.1.1.5.20", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP5Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP5Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP5", "1.3.6.1.2.1.38.1.1.5.21", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP6Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP6Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP6", "1.3.6.1.2.1.38.1.1.5.22", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP7Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP7Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP7", "1.3.6.1.2.1.38.1.1.5.23", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP8Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP8Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP8", "1.3.6.1.2.1.38.1.1.5.24", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP9Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP9Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP9", "1.3.6.1.2.1.38.1.1.5.25", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesMNP10Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesMNP10Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesMNP10", "1.3.6.1.2.1.38.1.1.5.26", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV29Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV29Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV29", "1.3.6.1.2.1.38.1.1.5.27", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesV33Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesV33Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesV33", "1.3.6.1.2.1.38.1.1.5.28", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineCapabilitiesBell208Ent extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineCapabilitiesBell208Ent(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineCapabilitiesBell208", "1.3.6.1.2.1.38.1.1.5.29", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MdmDTEInterfaceTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmDTEInterfaceEntryEnt mdmDTEInterfaceEntry;

                    private MdmDTEInterfaceTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmDTEInterfaceTable", "1.3.6.1.2.1.38.1.1.6", false, true, false, false);
                        this.mdmDTEInterfaceEntry = new MdmDTEInterfaceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmDTEInterfaceEntry
                        };
                    }
                    public static final class MdmDTEInterfaceEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmDTEActionDTROnToOffEnt mdmDTEActionDTROnToOff;

                        public final MdmDTEActionDTROffToOnEnt mdmDTEActionDTROffToOn;

                        public final MdmDTESyncTimingSourceEnt mdmDTESyncTimingSource;

                        public final MdmDTESyncAsyncModeEnt mdmDTESyncAsyncMode;

                        public final MdmDTEInactivityTimeoutEnt mdmDTEInactivityTimeout;

                        private MdmDTEInterfaceEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmDTEInterfaceEntry", "1.3.6.1.2.1.38.1.1.6.1", false, false, false, true);
                            this.mdmDTEActionDTROnToOff = new MdmDTEActionDTROnToOffEnt(mib, this);
                            this.mdmDTEActionDTROffToOn = new MdmDTEActionDTROffToOnEnt(mib, this);
                            this.mdmDTESyncTimingSource = new MdmDTESyncTimingSourceEnt(mib, this);
                            this.mdmDTESyncAsyncMode = new MdmDTESyncAsyncModeEnt(mib, this);
                            this.mdmDTEInactivityTimeout = new MdmDTEInactivityTimeoutEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmDTEActionDTROnToOff,
                                this.mdmDTEActionDTROffToOn,
                                this.mdmDTESyncTimingSource,
                                this.mdmDTESyncAsyncMode,
                                this.mdmDTEInactivityTimeout
                            };
                        }
                        public static final class MdmDTEActionDTROnToOffEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmDTEActionDTROnToOffEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmDTEActionDTROnToOff", "1.3.6.1.2.1.38.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmDTEActionDTROffToOnEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmDTEActionDTROffToOnEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmDTEActionDTROffToOn", "1.3.6.1.2.1.38.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmDTESyncTimingSourceEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmDTESyncTimingSourceEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmDTESyncTimingSource", "1.3.6.1.2.1.38.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmDTESyncAsyncModeEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmDTESyncAsyncModeEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmDTESyncAsyncMode", "1.3.6.1.2.1.38.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmDTEInactivityTimeoutEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmDTEInactivityTimeoutEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmDTEInactivityTimeout", "1.3.6.1.2.1.38.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmCallControlTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmCallControlEntryEnt mdmCallControlEntry;

                    private MdmCallControlTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmCallControlTable", "1.3.6.1.2.1.38.1.1.7", false, true, false, false);
                        this.mdmCallControlEntry = new MdmCallControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmCallControlEntry
                        };
                    }
                    public static final class MdmCallControlEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmCCRingsBeforeAnswerEnt mdmCCRingsBeforeAnswer;

                        public final MdmCCCallSetUpFailTimerEnt mdmCCCallSetUpFailTimer;

                        public final MdmCCResultCodeEnableEnt mdmCCResultCodeEnable;

                        public final MdmCCEscapeActionEnt mdmCCEscapeAction;

                        /** Call status portion of the call control table*/
                        public final MdmCCCallDurationEnt mdmCCCallDuration;

                        public final MdmCCConnectionFailReasonEnt mdmCCConnectionFailReason;

                        private MdmCallControlEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmCallControlEntry", "1.3.6.1.2.1.38.1.1.7.1", false, false, false, true);
                            this.mdmCCRingsBeforeAnswer = new MdmCCRingsBeforeAnswerEnt(mib, this);
                            this.mdmCCCallSetUpFailTimer = new MdmCCCallSetUpFailTimerEnt(mib, this);
                            this.mdmCCResultCodeEnable = new MdmCCResultCodeEnableEnt(mib, this);
                            this.mdmCCEscapeAction = new MdmCCEscapeActionEnt(mib, this);
                            this.mdmCCCallDuration = new MdmCCCallDurationEnt(mib, this);
                            this.mdmCCConnectionFailReason = new MdmCCConnectionFailReasonEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmCCRingsBeforeAnswer,
                                this.mdmCCCallSetUpFailTimer,
                                this.mdmCCResultCodeEnable,
                                this.mdmCCEscapeAction,
                                this.mdmCCCallDuration,
                                this.mdmCCConnectionFailReason
                            };
                        }
                        public static final class MdmCCRingsBeforeAnswerEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCRingsBeforeAnswerEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCRingsBeforeAnswer", "1.3.6.1.2.1.38.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmCCCallSetUpFailTimerEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCCallSetUpFailTimerEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCCallSetUpFailTimer", "1.3.6.1.2.1.38.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmCCResultCodeEnableEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCResultCodeEnableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCResultCodeEnable", "1.3.6.1.2.1.38.1.1.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmCCEscapeActionEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCEscapeActionEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCEscapeAction", "1.3.6.1.2.1.38.1.1.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmCCCallDurationEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCCallDurationEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCCallDuration", "1.3.6.1.2.1.38.1.1.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmCCConnectionFailReasonEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCConnectionFailReasonEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCConnectionFailReason", "1.3.6.1.2.1.38.1.1.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmCCStoredDialStringTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmCCStoredDialStringEntryEnt mdmCCStoredDialStringEntry;

                    private MdmCCStoredDialStringTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmCCStoredDialStringTable", "1.3.6.1.2.1.38.1.1.8", false, true, false, false);
                        this.mdmCCStoredDialStringEntry = new MdmCCStoredDialStringEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmCCStoredDialStringEntry
                        };
                    }
                    public static final class MdmCCStoredDialStringEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmCCStoredDialStringIndexEnt mdmCCStoredDialStringIndex;

                        public final MdmCCStoredDialStringEnt mdmCCStoredDialString;

                        private MdmCCStoredDialStringEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmCCStoredDialStringEntry", "1.3.6.1.2.1.38.1.1.8.1", false, false, false, true);
                            this.mdmCCStoredDialStringIndex = new MdmCCStoredDialStringIndexEnt(mib, this);
                            this.mdmCCStoredDialString = new MdmCCStoredDialStringEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmCCStoredDialStringIndex,
                                this.mdmCCStoredDialString
                            };
                        }
                        public static final class MdmCCStoredDialStringIndexEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCStoredDialStringIndexEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCStoredDialStringIndex", "1.3.6.1.2.1.38.1.1.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmCCStoredDialStringEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmCCStoredDialStringEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmCCStoredDialString", "1.3.6.1.2.1.38.1.1.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmECTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmECEntryEnt mdmECEntry;

                    private MdmECTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmECTable", "1.3.6.1.2.1.38.1.1.9", false, true, false, false);
                        this.mdmECEntry = new MdmECEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmECEntry
                        };
                    }
                    public static final class MdmECEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmECErrorControlUsedEnt mdmECErrorControlUsed;

                        private MdmECEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmECEntry", "1.3.6.1.2.1.38.1.1.9.1", false, false, false, true);
                            this.mdmECErrorControlUsed = new MdmECErrorControlUsedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmECErrorControlUsed
                            };
                        }
                        public static final class MdmECErrorControlUsedEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmECErrorControlUsedEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmECErrorControlUsed", "1.3.6.1.2.1.38.1.1.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmDCTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmDCEntryEnt mdmDCEntry;

                    private MdmDCTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmDCTable", "1.3.6.1.2.1.38.1.1.10", false, true, false, false);
                        this.mdmDCEntry = new MdmDCEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmDCEntry
                        };
                    }
                    public static final class MdmDCEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmDCCompressionTypeUsedEnt mdmDCCompressionTypeUsed;

                        private MdmDCEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmDCEntry", "1.3.6.1.2.1.38.1.1.10.1", false, false, false, true);
                            this.mdmDCCompressionTypeUsed = new MdmDCCompressionTypeUsedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmDCCompressionTypeUsed
                            };
                        }
                        public static final class MdmDCCompressionTypeUsedEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmDCCompressionTypeUsedEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmDCCompressionTypeUsed", "1.3.6.1.2.1.38.1.1.10.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmSCTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmSCEntryEnt mdmSCEntry;

                    private MdmSCTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmSCTable", "1.3.6.1.2.1.38.1.1.11", false, true, false, false);
                        this.mdmSCEntry = new MdmSCEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmSCEntry
                        };
                    }
                    public static final class MdmSCEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmSCCurrentLineTransmitRateEnt mdmSCCurrentLineTransmitRate;

                        public final MdmSCCurrentLineReceiveRateEnt mdmSCCurrentLineReceiveRate;

                        public final MdmSCInitialLineTransmitRateEnt mdmSCInitialLineTransmitRate;

                        public final MdmSCInitialLineReceiveRateEnt mdmSCInitialLineReceiveRate;

                        public final MdmSCModulationSchemeUsedEnt mdmSCModulationSchemeUsed;

                        private MdmSCEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmSCEntry", "1.3.6.1.2.1.38.1.1.11.1", false, false, false, true);
                            this.mdmSCCurrentLineTransmitRate = new MdmSCCurrentLineTransmitRateEnt(mib, this);
                            this.mdmSCCurrentLineReceiveRate = new MdmSCCurrentLineReceiveRateEnt(mib, this);
                            this.mdmSCInitialLineTransmitRate = new MdmSCInitialLineTransmitRateEnt(mib, this);
                            this.mdmSCInitialLineReceiveRate = new MdmSCInitialLineReceiveRateEnt(mib, this);
                            this.mdmSCModulationSchemeUsed = new MdmSCModulationSchemeUsedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmSCCurrentLineTransmitRate,
                                this.mdmSCCurrentLineReceiveRate,
                                this.mdmSCInitialLineTransmitRate,
                                this.mdmSCInitialLineReceiveRate,
                                this.mdmSCModulationSchemeUsed
                            };
                        }
                        public static final class MdmSCCurrentLineTransmitRateEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmSCCurrentLineTransmitRateEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmSCCurrentLineTransmitRate", "1.3.6.1.2.1.38.1.1.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmSCCurrentLineReceiveRateEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmSCCurrentLineReceiveRateEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmSCCurrentLineReceiveRate", "1.3.6.1.2.1.38.1.1.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmSCInitialLineTransmitRateEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmSCInitialLineTransmitRateEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmSCInitialLineTransmitRate", "1.3.6.1.2.1.38.1.1.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmSCInitialLineReceiveRateEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmSCInitialLineReceiveRateEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmSCInitialLineReceiveRate", "1.3.6.1.2.1.38.1.1.11.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmSCModulationSchemeUsedEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmSCModulationSchemeUsedEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmSCModulationSchemeUsed", "1.3.6.1.2.1.38.1.1.11.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MdmStatsTableEnt extends MIBEntry<ModemMIBDef>
                {
                    public final MdmStatsEntryEnt mdmStatsEntry;

                    private MdmStatsTableEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmStatsTable", "1.3.6.1.2.1.38.1.1.12", false, true, false, false);
                        this.mdmStatsEntry = new MdmStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmStatsEntry
                        };
                    }
                    public static final class MdmStatsEntryEnt extends MIBEntry<ModemMIBDef>
                    {
                        public final MdmStatsRingNoAnswersEnt mdmStatsRingNoAnswers;

                        public final MdmStatsIncomingConnectionFailuresEnt mdmStatsIncomingConnectionFailures;

                        public final MdmStatsIncomingConnectionCompletionsEnt mdmStatsIncomingConnectionCompletions;

                        public final MdmStatsFailedDialAttemptsEnt mdmStatsFailedDialAttempts;

                        public final MdmStatsOutgoingConnectionFailuresEnt mdmStatsOutgoingConnectionFailures;

                        public final MdmStatsOutgoingConnectionCompletionsEnt mdmStatsOutgoingConnectionCompletions;

                        public final MdmStatsRetrainsEnt mdmStatsRetrains;

                        /** Utilization counters*/
                        public final MdmStats2400OrLessConnectionsEnt mdmStats2400OrLessConnections;

                        public final MdmStats2400To14400ConnectionsEnt mdmStats2400To14400Connections;

                        public final MdmStatsGreaterThan14400ConnectionsEnt mdmStatsGreaterThan14400Connections;

                        public final MdmStatsErrorControlledConnectionsEnt mdmStatsErrorControlledConnections;

                        public final MdmStatsCompressedConnectionsEnt mdmStatsCompressedConnections;

                        public final MdmStatsCompressionEfficiencyEnt mdmStatsCompressionEfficiency;

                        public final MdmStatsSentOctetsEnt mdmStatsSentOctets;

                        public final MdmStatsReceivedOctetsEnt mdmStatsReceivedOctets;

                        public final MdmStatsSentDataFramesEnt mdmStatsSentDataFrames;

                        public final MdmStatsReceivedDataFramesEnt mdmStatsReceivedDataFrames;

                        public final MdmStatsResentFramesEnt mdmStatsResentFrames;

                        public final MdmStatsErrorFramesEnt mdmStatsErrorFrames;

                        private MdmStatsEntryEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmStatsEntry", "1.3.6.1.2.1.38.1.1.12.1", false, false, false, true);
                            this.mdmStatsRingNoAnswers = new MdmStatsRingNoAnswersEnt(mib, this);
                            this.mdmStatsIncomingConnectionFailures = new MdmStatsIncomingConnectionFailuresEnt(mib, this);
                            this.mdmStatsIncomingConnectionCompletions = new MdmStatsIncomingConnectionCompletionsEnt(mib, this);
                            this.mdmStatsFailedDialAttempts = new MdmStatsFailedDialAttemptsEnt(mib, this);
                            this.mdmStatsOutgoingConnectionFailures = new MdmStatsOutgoingConnectionFailuresEnt(mib, this);
                            this.mdmStatsOutgoingConnectionCompletions = new MdmStatsOutgoingConnectionCompletionsEnt(mib, this);
                            this.mdmStatsRetrains = new MdmStatsRetrainsEnt(mib, this);
                            this.mdmStats2400OrLessConnections = new MdmStats2400OrLessConnectionsEnt(mib, this);
                            this.mdmStats2400To14400Connections = new MdmStats2400To14400ConnectionsEnt(mib, this);
                            this.mdmStatsGreaterThan14400Connections = new MdmStatsGreaterThan14400ConnectionsEnt(mib, this);
                            this.mdmStatsErrorControlledConnections = new MdmStatsErrorControlledConnectionsEnt(mib, this);
                            this.mdmStatsCompressedConnections = new MdmStatsCompressedConnectionsEnt(mib, this);
                            this.mdmStatsCompressionEfficiency = new MdmStatsCompressionEfficiencyEnt(mib, this);
                            this.mdmStatsSentOctets = new MdmStatsSentOctetsEnt(mib, this);
                            this.mdmStatsReceivedOctets = new MdmStatsReceivedOctetsEnt(mib, this);
                            this.mdmStatsSentDataFrames = new MdmStatsSentDataFramesEnt(mib, this);
                            this.mdmStatsReceivedDataFrames = new MdmStatsReceivedDataFramesEnt(mib, this);
                            this.mdmStatsResentFrames = new MdmStatsResentFramesEnt(mib, this);
                            this.mdmStatsErrorFrames = new MdmStatsErrorFramesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mdmStatsRingNoAnswers,
                                this.mdmStatsIncomingConnectionFailures,
                                this.mdmStatsIncomingConnectionCompletions,
                                this.mdmStatsFailedDialAttempts,
                                this.mdmStatsOutgoingConnectionFailures,
                                this.mdmStatsOutgoingConnectionCompletions,
                                this.mdmStatsRetrains,
                                this.mdmStats2400OrLessConnections,
                                this.mdmStats2400To14400Connections,
                                this.mdmStatsGreaterThan14400Connections,
                                this.mdmStatsErrorControlledConnections,
                                this.mdmStatsCompressedConnections,
                                this.mdmStatsCompressionEfficiency,
                                this.mdmStatsSentOctets,
                                this.mdmStatsReceivedOctets,
                                this.mdmStatsSentDataFrames,
                                this.mdmStatsReceivedDataFrames,
                                this.mdmStatsResentFrames,
                                this.mdmStatsErrorFrames
                            };
                        }
                        public static final class MdmStatsRingNoAnswersEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsRingNoAnswersEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsRingNoAnswers", "1.3.6.1.2.1.38.1.1.12.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsIncomingConnectionFailuresEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsIncomingConnectionFailuresEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsIncomingConnectionFailures", "1.3.6.1.2.1.38.1.1.12.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsIncomingConnectionCompletionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsIncomingConnectionCompletionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsIncomingConnectionCompletions", "1.3.6.1.2.1.38.1.1.12.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsFailedDialAttemptsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsFailedDialAttemptsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsFailedDialAttempts", "1.3.6.1.2.1.38.1.1.12.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsOutgoingConnectionFailuresEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsOutgoingConnectionFailuresEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsOutgoingConnectionFailures", "1.3.6.1.2.1.38.1.1.12.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsOutgoingConnectionCompletionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsOutgoingConnectionCompletionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsOutgoingConnectionCompletions", "1.3.6.1.2.1.38.1.1.12.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsRetrainsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsRetrainsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsRetrains", "1.3.6.1.2.1.38.1.1.12.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStats2400OrLessConnectionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStats2400OrLessConnectionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStats2400OrLessConnections", "1.3.6.1.2.1.38.1.1.12.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStats2400To14400ConnectionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStats2400To14400ConnectionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStats2400To14400Connections", "1.3.6.1.2.1.38.1.1.12.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsGreaterThan14400ConnectionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsGreaterThan14400ConnectionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsGreaterThan14400Connections", "1.3.6.1.2.1.38.1.1.12.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsErrorControlledConnectionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsErrorControlledConnectionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsErrorControlledConnections", "1.3.6.1.2.1.38.1.1.12.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsCompressedConnectionsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsCompressedConnectionsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsCompressedConnections", "1.3.6.1.2.1.38.1.1.12.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsCompressionEfficiencyEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsCompressionEfficiencyEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsCompressionEfficiency", "1.3.6.1.2.1.38.1.1.12.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsSentOctetsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsSentOctetsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsSentOctets", "1.3.6.1.2.1.38.1.1.12.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsReceivedOctetsEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsReceivedOctetsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsReceivedOctets", "1.3.6.1.2.1.38.1.1.12.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsSentDataFramesEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsSentDataFramesEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsSentDataFrames", "1.3.6.1.2.1.38.1.1.12.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsReceivedDataFramesEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsReceivedDataFramesEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsReceivedDataFrames", "1.3.6.1.2.1.38.1.1.12.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsResentFramesEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsResentFramesEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsResentFrames", "1.3.6.1.2.1.38.1.1.12.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MdmStatsErrorFramesEnt extends MIBEntry<ModemMIBDef>
                        {
                            private MdmStatsErrorFramesEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                            {
                                super(mib, parent, "mdmStatsErrorFrames", "1.3.6.1.2.1.38.1.1.12.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MdmConformanceEnt extends MIBEntry<ModemMIBDef>
            {
                public final MdmCompliancesEnt mdmCompliances;

                public final MdmGroupsEnt mdmGroups;

                private MdmConformanceEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                {
                    super(mib, parent, "mdmConformance", "1.3.6.1.2.1.38.1.2", false, false, false, false);
                    this.mdmCompliances = new MdmCompliancesEnt(mib, this);
                    this.mdmGroups = new MdmGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mdmCompliances,
                        this.mdmGroups
                    };
                }
                public static final class MdmCompliancesEnt extends MIBEntry<ModemMIBDef>
                {
                    /** compliance statements*/
                    public final MdmComplianceEnt mdmCompliance;

                    private MdmCompliancesEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmCompliances", "1.3.6.1.2.1.38.1.2.1", false, false, false, false);
                        this.mdmCompliance = new MdmComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmCompliance
                        };
                    }
                    public static final class MdmComplianceEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmComplianceEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmCompliance", "1.3.6.1.2.1.38.1.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MdmGroupsEnt extends MIBEntry<ModemMIBDef>
                {
                    /** units of conformance*/
                    public final MdmIDGroupEnt mdmIDGroup;

                    public final MdmLineInterfaceGroupEnt mdmLineInterfaceGroup;

                    public final MdmDTEInterfaceGroupEnt mdmDTEInterfaceGroup;

                    public final MdmCallControlGroupEnt mdmCallControlGroup;

                    public final MdmErrorControlGroupEnt mdmErrorControlGroup;

                    public final MdmDataCompressionGroupEnt mdmDataCompressionGroup;

                    public final MdmSignalConvertorGroupEnt mdmSignalConvertorGroup;

                    public final MdmStatisticsGroupEnt mdmStatisticsGroup;

                    private MdmGroupsEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                    {
                        super(mib, parent, "mdmGroups", "1.3.6.1.2.1.38.1.2.2", false, false, false, false);
                        this.mdmIDGroup = new MdmIDGroupEnt(mib, this);
                        this.mdmLineInterfaceGroup = new MdmLineInterfaceGroupEnt(mib, this);
                        this.mdmDTEInterfaceGroup = new MdmDTEInterfaceGroupEnt(mib, this);
                        this.mdmCallControlGroup = new MdmCallControlGroupEnt(mib, this);
                        this.mdmErrorControlGroup = new MdmErrorControlGroupEnt(mib, this);
                        this.mdmDataCompressionGroup = new MdmDataCompressionGroupEnt(mib, this);
                        this.mdmSignalConvertorGroup = new MdmSignalConvertorGroupEnt(mib, this);
                        this.mdmStatisticsGroup = new MdmStatisticsGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mdmIDGroup,
                            this.mdmLineInterfaceGroup,
                            this.mdmDTEInterfaceGroup,
                            this.mdmCallControlGroup,
                            this.mdmErrorControlGroup,
                            this.mdmDataCompressionGroup,
                            this.mdmSignalConvertorGroup,
                            this.mdmStatisticsGroup
                        };
                    }
                    public static final class MdmIDGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmIDGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmIDGroup", "1.3.6.1.2.1.38.1.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmLineInterfaceGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmLineInterfaceGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmLineInterfaceGroup", "1.3.6.1.2.1.38.1.2.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmDTEInterfaceGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmDTEInterfaceGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmDTEInterfaceGroup", "1.3.6.1.2.1.38.1.2.2.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmCallControlGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmCallControlGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmCallControlGroup", "1.3.6.1.2.1.38.1.2.2.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmErrorControlGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmErrorControlGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmErrorControlGroup", "1.3.6.1.2.1.38.1.2.2.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmDataCompressionGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmDataCompressionGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmDataCompressionGroup", "1.3.6.1.2.1.38.1.2.2.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmSignalConvertorGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmSignalConvertorGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmSignalConvertorGroup", "1.3.6.1.2.1.38.1.2.2.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MdmStatisticsGroupEnt extends MIBEntry<ModemMIBDef>
                    {
                        private MdmStatisticsGroupEnt(ModemMIBDef mib, MIBEntry<ModemMIBDef> parent)
                        {
                            super(mib, parent, "mdmStatisticsGroup", "1.3.6.1.2.1.38.1.2.2.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
