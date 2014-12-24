package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;

public final class IANAMAUMIBDef extends MIB
{
    public static final IANAMAUMIBDef IANAMAUMIB = new IANAMAUMIBDef();

    /** April 21, 2007*/
    public final IanaMauMIBEnt ianaMauMIB;

    /** OBJECT IDENTITIES for MAU types
(see rpMauType and ifMauType of MAU-MIB for usage)The following definitions has been moved from RFC 3636 andno longer appear in its revision.*/
    public final Dot3MauTypeEnt dot3MauType;

    private IANAMAUMIBDef()
    {
        super("IANA-MAU-MIB");
        this.ianaMauMIB = new IanaMauMIBEnt(this, null);
        this.dot3MauType = new Dot3MauTypeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaMauMIB,
            this.dot3MauType
        };
    }

    public static final class IanaMauMIBEnt extends MIBEntry<IANAMAUMIBDef>
    {
        private IanaMauMIBEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
        {
            super(mib, parent, "ianaMauMIB", "1.3.6.1.2.1.154", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Dot3MauTypeEnt extends MIBEntry<IANAMAUMIBDef>
    {
        public final Dot3MauTypeAUIEnt dot3MauTypeAUI;

        public final Dot3MauType10Base5Ent dot3MauType10Base5;

        public final Dot3MauTypeFoirlEnt dot3MauTypeFoirl;

        public final Dot3MauType10Base2Ent dot3MauType10Base2;

        public final Dot3MauType10BaseTEnt dot3MauType10BaseT;

        public final Dot3MauType10BaseFPEnt dot3MauType10BaseFP;

        public final Dot3MauType10BaseFBEnt dot3MauType10BaseFB;

        public final Dot3MauType10BaseFLEnt dot3MauType10BaseFL;

        public final Dot3MauType10Broad36Ent dot3MauType10Broad36;

        /** --new since RFC 1515:*/
        public final Dot3MauType10BaseTHDEnt dot3MauType10BaseTHD;

        public final Dot3MauType10BaseTFDEnt dot3MauType10BaseTFD;

        public final Dot3MauType10BaseFLHDEnt dot3MauType10BaseFLHD;

        public final Dot3MauType10BaseFLFDEnt dot3MauType10BaseFLFD;

        public final Dot3MauType100BaseT4Ent dot3MauType100BaseT4;

        public final Dot3MauType100BaseTXHDEnt dot3MauType100BaseTXHD;

        public final Dot3MauType100BaseTXFDEnt dot3MauType100BaseTXFD;

        public final Dot3MauType100BaseFXHDEnt dot3MauType100BaseFXHD;

        public final Dot3MauType100BaseFXFDEnt dot3MauType100BaseFXFD;

        public final Dot3MauType100BaseT2HDEnt dot3MauType100BaseT2HD;

        public final Dot3MauType100BaseT2FDEnt dot3MauType100BaseT2FD;

        /** --new since RFC 2239:*/
        public final Dot3MauType1000BaseXHDEnt dot3MauType1000BaseXHD;

        public final Dot3MauType1000BaseXFDEnt dot3MauType1000BaseXFD;

        public final Dot3MauType1000BaseLXHDEnt dot3MauType1000BaseLXHD;

        public final Dot3MauType1000BaseLXFDEnt dot3MauType1000BaseLXFD;

        public final Dot3MauType1000BaseSXHDEnt dot3MauType1000BaseSXHD;

        public final Dot3MauType1000BaseSXFDEnt dot3MauType1000BaseSXFD;

        public final Dot3MauType1000BaseCXHDEnt dot3MauType1000BaseCXHD;

        public final Dot3MauType1000BaseCXFDEnt dot3MauType1000BaseCXFD;

        public final Dot3MauType1000BaseTHDEnt dot3MauType1000BaseTHD;

        public final Dot3MauType1000BaseTFDEnt dot3MauType1000BaseTFD;

        /** --new since RFC 2668:*/
        public final Dot3MauType10GigBaseXEnt dot3MauType10GigBaseX;

        public final Dot3MauType10GigBaseLX4Ent dot3MauType10GigBaseLX4;

        public final Dot3MauType10GigBaseREnt dot3MauType10GigBaseR;

        public final Dot3MauType10GigBaseEREnt dot3MauType10GigBaseER;

        public final Dot3MauType10GigBaseLREnt dot3MauType10GigBaseLR;

        public final Dot3MauType10GigBaseSREnt dot3MauType10GigBaseSR;

        public final Dot3MauType10GigBaseWEnt dot3MauType10GigBaseW;

        public final Dot3MauType10GigBaseEWEnt dot3MauType10GigBaseEW;

        public final Dot3MauType10GigBaseLWEnt dot3MauType10GigBaseLW;

        public final Dot3MauType10GigBaseSWEnt dot3MauType10GigBaseSW;

        /** --new since RFC 3636:*/
        public final Dot3MauType10GigBaseCX4Ent dot3MauType10GigBaseCX4;

        public final Dot3MauType2BaseTLEnt dot3MauType2BaseTL;

        public final Dot3MauType10PassTSEnt dot3MauType10PassTS;

        public final Dot3MauType100BaseBX10DEnt dot3MauType100BaseBX10D;

        public final Dot3MauType100BaseBX10UEnt dot3MauType100BaseBX10U;

        public final Dot3MauType100BaseLX10Ent dot3MauType100BaseLX10;

        public final Dot3MauType1000BaseBX10DEnt dot3MauType1000BaseBX10D;

        public final Dot3MauType1000BaseBX10UEnt dot3MauType1000BaseBX10U;

        public final Dot3MauType1000BaseLX10Ent dot3MauType1000BaseLX10;

        public final Dot3MauType1000BasePX10DEnt dot3MauType1000BasePX10D;

        public final Dot3MauType1000BasePX10UEnt dot3MauType1000BasePX10U;

        public final Dot3MauType1000BasePX20DEnt dot3MauType1000BasePX20D;

        public final Dot3MauType1000BasePX20UEnt dot3MauType1000BasePX20U;

        private Dot3MauTypeEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
        {
            super(mib, parent, "dot3MauType", "1.3.6.1.2.1.26.4", false, false, false, false);
            this.dot3MauTypeAUI = new Dot3MauTypeAUIEnt(mib, this);
            this.dot3MauType10Base5 = new Dot3MauType10Base5Ent(mib, this);
            this.dot3MauTypeFoirl = new Dot3MauTypeFoirlEnt(mib, this);
            this.dot3MauType10Base2 = new Dot3MauType10Base2Ent(mib, this);
            this.dot3MauType10BaseT = new Dot3MauType10BaseTEnt(mib, this);
            this.dot3MauType10BaseFP = new Dot3MauType10BaseFPEnt(mib, this);
            this.dot3MauType10BaseFB = new Dot3MauType10BaseFBEnt(mib, this);
            this.dot3MauType10BaseFL = new Dot3MauType10BaseFLEnt(mib, this);
            this.dot3MauType10Broad36 = new Dot3MauType10Broad36Ent(mib, this);
            this.dot3MauType10BaseTHD = new Dot3MauType10BaseTHDEnt(mib, this);
            this.dot3MauType10BaseTFD = new Dot3MauType10BaseTFDEnt(mib, this);
            this.dot3MauType10BaseFLHD = new Dot3MauType10BaseFLHDEnt(mib, this);
            this.dot3MauType10BaseFLFD = new Dot3MauType10BaseFLFDEnt(mib, this);
            this.dot3MauType100BaseT4 = new Dot3MauType100BaseT4Ent(mib, this);
            this.dot3MauType100BaseTXHD = new Dot3MauType100BaseTXHDEnt(mib, this);
            this.dot3MauType100BaseTXFD = new Dot3MauType100BaseTXFDEnt(mib, this);
            this.dot3MauType100BaseFXHD = new Dot3MauType100BaseFXHDEnt(mib, this);
            this.dot3MauType100BaseFXFD = new Dot3MauType100BaseFXFDEnt(mib, this);
            this.dot3MauType100BaseT2HD = new Dot3MauType100BaseT2HDEnt(mib, this);
            this.dot3MauType100BaseT2FD = new Dot3MauType100BaseT2FDEnt(mib, this);
            this.dot3MauType1000BaseXHD = new Dot3MauType1000BaseXHDEnt(mib, this);
            this.dot3MauType1000BaseXFD = new Dot3MauType1000BaseXFDEnt(mib, this);
            this.dot3MauType1000BaseLXHD = new Dot3MauType1000BaseLXHDEnt(mib, this);
            this.dot3MauType1000BaseLXFD = new Dot3MauType1000BaseLXFDEnt(mib, this);
            this.dot3MauType1000BaseSXHD = new Dot3MauType1000BaseSXHDEnt(mib, this);
            this.dot3MauType1000BaseSXFD = new Dot3MauType1000BaseSXFDEnt(mib, this);
            this.dot3MauType1000BaseCXHD = new Dot3MauType1000BaseCXHDEnt(mib, this);
            this.dot3MauType1000BaseCXFD = new Dot3MauType1000BaseCXFDEnt(mib, this);
            this.dot3MauType1000BaseTHD = new Dot3MauType1000BaseTHDEnt(mib, this);
            this.dot3MauType1000BaseTFD = new Dot3MauType1000BaseTFDEnt(mib, this);
            this.dot3MauType10GigBaseX = new Dot3MauType10GigBaseXEnt(mib, this);
            this.dot3MauType10GigBaseLX4 = new Dot3MauType10GigBaseLX4Ent(mib, this);
            this.dot3MauType10GigBaseR = new Dot3MauType10GigBaseREnt(mib, this);
            this.dot3MauType10GigBaseER = new Dot3MauType10GigBaseEREnt(mib, this);
            this.dot3MauType10GigBaseLR = new Dot3MauType10GigBaseLREnt(mib, this);
            this.dot3MauType10GigBaseSR = new Dot3MauType10GigBaseSREnt(mib, this);
            this.dot3MauType10GigBaseW = new Dot3MauType10GigBaseWEnt(mib, this);
            this.dot3MauType10GigBaseEW = new Dot3MauType10GigBaseEWEnt(mib, this);
            this.dot3MauType10GigBaseLW = new Dot3MauType10GigBaseLWEnt(mib, this);
            this.dot3MauType10GigBaseSW = new Dot3MauType10GigBaseSWEnt(mib, this);
            this.dot3MauType10GigBaseCX4 = new Dot3MauType10GigBaseCX4Ent(mib, this);
            this.dot3MauType2BaseTL = new Dot3MauType2BaseTLEnt(mib, this);
            this.dot3MauType10PassTS = new Dot3MauType10PassTSEnt(mib, this);
            this.dot3MauType100BaseBX10D = new Dot3MauType100BaseBX10DEnt(mib, this);
            this.dot3MauType100BaseBX10U = new Dot3MauType100BaseBX10UEnt(mib, this);
            this.dot3MauType100BaseLX10 = new Dot3MauType100BaseLX10Ent(mib, this);
            this.dot3MauType1000BaseBX10D = new Dot3MauType1000BaseBX10DEnt(mib, this);
            this.dot3MauType1000BaseBX10U = new Dot3MauType1000BaseBX10UEnt(mib, this);
            this.dot3MauType1000BaseLX10 = new Dot3MauType1000BaseLX10Ent(mib, this);
            this.dot3MauType1000BasePX10D = new Dot3MauType1000BasePX10DEnt(mib, this);
            this.dot3MauType1000BasePX10U = new Dot3MauType1000BasePX10UEnt(mib, this);
            this.dot3MauType1000BasePX20D = new Dot3MauType1000BasePX20DEnt(mib, this);
            this.dot3MauType1000BasePX20U = new Dot3MauType1000BasePX20UEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3MauTypeAUI,
                this.dot3MauType10Base5,
                this.dot3MauTypeFoirl,
                this.dot3MauType10Base2,
                this.dot3MauType10BaseT,
                this.dot3MauType10BaseFP,
                this.dot3MauType10BaseFB,
                this.dot3MauType10BaseFL,
                this.dot3MauType10Broad36,
                this.dot3MauType10BaseTHD,
                this.dot3MauType10BaseTFD,
                this.dot3MauType10BaseFLHD,
                this.dot3MauType10BaseFLFD,
                this.dot3MauType100BaseT4,
                this.dot3MauType100BaseTXHD,
                this.dot3MauType100BaseTXFD,
                this.dot3MauType100BaseFXHD,
                this.dot3MauType100BaseFXFD,
                this.dot3MauType100BaseT2HD,
                this.dot3MauType100BaseT2FD,
                this.dot3MauType1000BaseXHD,
                this.dot3MauType1000BaseXFD,
                this.dot3MauType1000BaseLXHD,
                this.dot3MauType1000BaseLXFD,
                this.dot3MauType1000BaseSXHD,
                this.dot3MauType1000BaseSXFD,
                this.dot3MauType1000BaseCXHD,
                this.dot3MauType1000BaseCXFD,
                this.dot3MauType1000BaseTHD,
                this.dot3MauType1000BaseTFD,
                this.dot3MauType10GigBaseX,
                this.dot3MauType10GigBaseLX4,
                this.dot3MauType10GigBaseR,
                this.dot3MauType10GigBaseER,
                this.dot3MauType10GigBaseLR,
                this.dot3MauType10GigBaseSR,
                this.dot3MauType10GigBaseW,
                this.dot3MauType10GigBaseEW,
                this.dot3MauType10GigBaseLW,
                this.dot3MauType10GigBaseSW,
                this.dot3MauType10GigBaseCX4,
                this.dot3MauType2BaseTL,
                this.dot3MauType10PassTS,
                this.dot3MauType100BaseBX10D,
                this.dot3MauType100BaseBX10U,
                this.dot3MauType100BaseLX10,
                this.dot3MauType1000BaseBX10D,
                this.dot3MauType1000BaseBX10U,
                this.dot3MauType1000BaseLX10,
                this.dot3MauType1000BasePX10D,
                this.dot3MauType1000BasePX10U,
                this.dot3MauType1000BasePX20D,
                this.dot3MauType1000BasePX20U
            };
        }
        public static final class Dot3MauTypeAUIEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauTypeAUIEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauTypeAUI", "1.3.6.1.2.1.26.4.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10Base5Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10Base5Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10Base5", "1.3.6.1.2.1.26.4.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauTypeFoirlEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauTypeFoirlEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauTypeFoirl", "1.3.6.1.2.1.26.4.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10Base2Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10Base2Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10Base2", "1.3.6.1.2.1.26.4.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseTEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseTEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseT", "1.3.6.1.2.1.26.4.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseFPEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseFPEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseFP", "1.3.6.1.2.1.26.4.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseFBEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseFBEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseFB", "1.3.6.1.2.1.26.4.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseFLEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseFLEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseFL", "1.3.6.1.2.1.26.4.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10Broad36Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10Broad36Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10Broad36", "1.3.6.1.2.1.26.4.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseTHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseTHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseTHD", "1.3.6.1.2.1.26.4.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseTFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseTFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseTFD", "1.3.6.1.2.1.26.4.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseFLHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseFLHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseFLHD", "1.3.6.1.2.1.26.4.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10BaseFLFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10BaseFLFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10BaseFLFD", "1.3.6.1.2.1.26.4.13", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseT4Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseT4Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseT4", "1.3.6.1.2.1.26.4.14", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseTXHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseTXHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseTXHD", "1.3.6.1.2.1.26.4.15", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseTXFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseTXFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseTXFD", "1.3.6.1.2.1.26.4.16", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseFXHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseFXHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseFXHD", "1.3.6.1.2.1.26.4.17", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseFXFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseFXFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseFXFD", "1.3.6.1.2.1.26.4.18", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseT2HDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseT2HDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseT2HD", "1.3.6.1.2.1.26.4.19", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseT2FDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseT2FDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseT2FD", "1.3.6.1.2.1.26.4.20", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseXHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseXHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseXHD", "1.3.6.1.2.1.26.4.21", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseXFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseXFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseXFD", "1.3.6.1.2.1.26.4.22", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseLXHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseLXHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseLXHD", "1.3.6.1.2.1.26.4.23", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseLXFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseLXFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseLXFD", "1.3.6.1.2.1.26.4.24", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseSXHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseSXHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseSXHD", "1.3.6.1.2.1.26.4.25", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseSXFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseSXFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseSXFD", "1.3.6.1.2.1.26.4.26", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseCXHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseCXHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseCXHD", "1.3.6.1.2.1.26.4.27", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseCXFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseCXFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseCXFD", "1.3.6.1.2.1.26.4.28", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseTHDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseTHDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseTHD", "1.3.6.1.2.1.26.4.29", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseTFDEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseTFDEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseTFD", "1.3.6.1.2.1.26.4.30", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseXEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseXEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseX", "1.3.6.1.2.1.26.4.31", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseLX4Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseLX4Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseLX4", "1.3.6.1.2.1.26.4.32", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseREnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseREnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseR", "1.3.6.1.2.1.26.4.33", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseEREnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseEREnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseER", "1.3.6.1.2.1.26.4.34", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseLREnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseLREnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseLR", "1.3.6.1.2.1.26.4.35", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseSREnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseSREnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseSR", "1.3.6.1.2.1.26.4.36", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseWEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseWEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseW", "1.3.6.1.2.1.26.4.37", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseEWEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseEWEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseEW", "1.3.6.1.2.1.26.4.38", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseLWEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseLWEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseLW", "1.3.6.1.2.1.26.4.39", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseSWEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseSWEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseSW", "1.3.6.1.2.1.26.4.40", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10GigBaseCX4Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10GigBaseCX4Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10GigBaseCX4", "1.3.6.1.2.1.26.4.41", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType2BaseTLEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType2BaseTLEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType2BaseTL", "1.3.6.1.2.1.26.4.42", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType10PassTSEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType10PassTSEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType10PassTS", "1.3.6.1.2.1.26.4.43", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseBX10DEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseBX10DEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseBX10D", "1.3.6.1.2.1.26.4.44", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseBX10UEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseBX10UEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseBX10U", "1.3.6.1.2.1.26.4.45", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType100BaseLX10Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType100BaseLX10Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType100BaseLX10", "1.3.6.1.2.1.26.4.46", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseBX10DEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseBX10DEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseBX10D", "1.3.6.1.2.1.26.4.47", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseBX10UEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseBX10UEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseBX10U", "1.3.6.1.2.1.26.4.48", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BaseLX10Ent extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BaseLX10Ent(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BaseLX10", "1.3.6.1.2.1.26.4.49", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BasePX10DEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BasePX10DEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BasePX10D", "1.3.6.1.2.1.26.4.50", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BasePX10UEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BasePX10UEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BasePX10U", "1.3.6.1.2.1.26.4.51", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BasePX20DEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BasePX20DEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BasePX20D", "1.3.6.1.2.1.26.4.52", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot3MauType1000BasePX20UEnt extends MIBEntry<IANAMAUMIBDef>
        {
            private Dot3MauType1000BasePX20UEnt(IANAMAUMIBDef mib, MIBEntry<IANAMAUMIBDef> parent)
            {
                super(mib, parent, "dot3MauType1000BasePX20U", "1.3.6.1.2.1.26.4.53", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
