package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ETHERCHIPSETMIBDef extends MIB
{
    public static final ETHERCHIPSETMIBDef ETHERCHIPSETMIB = new ETHERCHIPSETMIBDef();

    /** August 24, 199*/
    public final EtherChipsetMIBEnt etherChipsetMIB;

    public final Dot3ChipSetsEnt dot3ChipSets;

    private ETHERCHIPSETMIBDef()
    {
        super("ETHER-CHIPSET-MIB");
        this.etherChipsetMIB = new EtherChipsetMIBEnt(this, null);
        this.dot3ChipSets = new Dot3ChipSetsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.etherChipsetMIB,
            this.dot3ChipSets
        };
    }

    public static final class EtherChipsetMIBEnt extends MIBEntry<ETHERCHIPSETMIBDef>
    {
        private EtherChipsetMIBEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
        {
            super(mib, parent, "etherChipsetMIB", "1.3.6.1.2.1.70", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Dot3ChipSetsEnt extends MIBEntry<ETHERCHIPSETMIBDef>
    {
        public final Dot3ChipSetAMDEnt dot3ChipSetAMD;

        public final Dot3ChipSetIntelEnt dot3ChipSetIntel;

        public final Dot3ChipSetSeeqEnt dot3ChipSetSeeq;

        public final Dot3ChipSetNationalEnt dot3ChipSetNational;

        public final Dot3ChipSetFujitsuEnt dot3ChipSetFujitsu;

        public final Dot3ChipSetDigitalEnt dot3ChipSetDigital;

        public final Dot3ChipSetTIEnt dot3ChipSetTI;

        public final Dot3ChipSetToshibaEnt dot3ChipSetToshiba;

        public final Dot3ChipSetLucentEnt dot3ChipSetLucent;

        public final Dot3ChipSetGalileoEnt dot3ChipSetGalileo;

        public final Dot3ChipSetJatoEnt dot3ChipSetJato;

        public final Dot3ChipSetXaQtiEnt dot3ChipSetXaQti;

        private Dot3ChipSetsEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
        {
            super(mib, parent, "dot3ChipSets", "1.3.6.1.2.1.10.7.8", false, false, false, false);
            this.dot3ChipSetAMD = new Dot3ChipSetAMDEnt(mib, this);
            this.dot3ChipSetIntel = new Dot3ChipSetIntelEnt(mib, this);
            this.dot3ChipSetSeeq = new Dot3ChipSetSeeqEnt(mib, this);
            this.dot3ChipSetNational = new Dot3ChipSetNationalEnt(mib, this);
            this.dot3ChipSetFujitsu = new Dot3ChipSetFujitsuEnt(mib, this);
            this.dot3ChipSetDigital = new Dot3ChipSetDigitalEnt(mib, this);
            this.dot3ChipSetTI = new Dot3ChipSetTIEnt(mib, this);
            this.dot3ChipSetToshiba = new Dot3ChipSetToshibaEnt(mib, this);
            this.dot3ChipSetLucent = new Dot3ChipSetLucentEnt(mib, this);
            this.dot3ChipSetGalileo = new Dot3ChipSetGalileoEnt(mib, this);
            this.dot3ChipSetJato = new Dot3ChipSetJatoEnt(mib, this);
            this.dot3ChipSetXaQti = new Dot3ChipSetXaQtiEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3ChipSetAMD,
                this.dot3ChipSetIntel,
                this.dot3ChipSetSeeq,
                this.dot3ChipSetNational,
                this.dot3ChipSetFujitsu,
                this.dot3ChipSetDigital,
                this.dot3ChipSetTI,
                this.dot3ChipSetToshiba,
                this.dot3ChipSetLucent,
                this.dot3ChipSetGalileo,
                this.dot3ChipSetJato,
                this.dot3ChipSetXaQti
            };
        }
        public static final class Dot3ChipSetAMDEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetAMD7990Ent dot3ChipSetAMD7990;

            public final Dot3ChipSetAMD79900Ent dot3ChipSetAMD79900;

            public final Dot3ChipSetAMD79C940Ent dot3ChipSetAMD79C940;

            public final Dot3ChipSetAMD79C90Ent dot3ChipSetAMD79C90;

            public final Dot3ChipSetAMD79C960Ent dot3ChipSetAMD79C960;

            public final Dot3ChipSetAMD79C961Ent dot3ChipSetAMD79C961;

            public final Dot3ChipSetAMD79C961AEnt dot3ChipSetAMD79C961A;

            public final Dot3ChipSetAMD79C965Ent dot3ChipSetAMD79C965;

            public final Dot3ChipSetAMD79C970Ent dot3ChipSetAMD79C970;

            public final Dot3ChipSetAMD79C970AEnt dot3ChipSetAMD79C970A;

            public final Dot3ChipSetAMD79C971Ent dot3ChipSetAMD79C971;

            public final Dot3ChipSetAMD79C972Ent dot3ChipSetAMD79C972;

            private Dot3ChipSetAMDEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetAMD", "1.3.6.1.2.1.10.7.8.1", false, false, false, false);
                this.dot3ChipSetAMD7990 = new Dot3ChipSetAMD7990Ent(mib, this);
                this.dot3ChipSetAMD79900 = new Dot3ChipSetAMD79900Ent(mib, this);
                this.dot3ChipSetAMD79C940 = new Dot3ChipSetAMD79C940Ent(mib, this);
                this.dot3ChipSetAMD79C90 = new Dot3ChipSetAMD79C90Ent(mib, this);
                this.dot3ChipSetAMD79C960 = new Dot3ChipSetAMD79C960Ent(mib, this);
                this.dot3ChipSetAMD79C961 = new Dot3ChipSetAMD79C961Ent(mib, this);
                this.dot3ChipSetAMD79C961A = new Dot3ChipSetAMD79C961AEnt(mib, this);
                this.dot3ChipSetAMD79C965 = new Dot3ChipSetAMD79C965Ent(mib, this);
                this.dot3ChipSetAMD79C970 = new Dot3ChipSetAMD79C970Ent(mib, this);
                this.dot3ChipSetAMD79C970A = new Dot3ChipSetAMD79C970AEnt(mib, this);
                this.dot3ChipSetAMD79C971 = new Dot3ChipSetAMD79C971Ent(mib, this);
                this.dot3ChipSetAMD79C972 = new Dot3ChipSetAMD79C972Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetAMD7990,
                    this.dot3ChipSetAMD79900,
                    this.dot3ChipSetAMD79C940,
                    this.dot3ChipSetAMD79C90,
                    this.dot3ChipSetAMD79C960,
                    this.dot3ChipSetAMD79C961,
                    this.dot3ChipSetAMD79C961A,
                    this.dot3ChipSetAMD79C965,
                    this.dot3ChipSetAMD79C970,
                    this.dot3ChipSetAMD79C970A,
                    this.dot3ChipSetAMD79C971,
                    this.dot3ChipSetAMD79C972
                };
            }
            public static final class Dot3ChipSetAMD7990Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD7990Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD7990", "1.3.6.1.2.1.10.7.8.1.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79900Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79900Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79900", "1.3.6.1.2.1.10.7.8.1.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C940Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C940Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C940", "1.3.6.1.2.1.10.7.8.1.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C90Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C90Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C90", "1.3.6.1.2.1.10.7.8.1.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C960Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C960Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C960", "1.3.6.1.2.1.10.7.8.1.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C961Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C961Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C961", "1.3.6.1.2.1.10.7.8.1.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C961AEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C961AEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C961A", "1.3.6.1.2.1.10.7.8.1.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C965Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C965Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C965", "1.3.6.1.2.1.10.7.8.1.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C970Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C970Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C970", "1.3.6.1.2.1.10.7.8.1.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C970AEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C970AEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C970A", "1.3.6.1.2.1.10.7.8.1.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C971Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C971Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C971", "1.3.6.1.2.1.10.7.8.1.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79C972Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetAMD79C972Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79C972", "1.3.6.1.2.1.10.7.8.1.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetIntelEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetIntel82586Ent dot3ChipSetIntel82586;

            public final Dot3ChipSetIntel82596Ent dot3ChipSetIntel82596;

            public final Dot3ChipSetIntel82595Ent dot3ChipSetIntel82595;

            public final Dot3ChipSetIntel82557Ent dot3ChipSetIntel82557;

            public final Dot3ChipSetIntel82558Ent dot3ChipSetIntel82558;

            private Dot3ChipSetIntelEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetIntel", "1.3.6.1.2.1.10.7.8.2", false, false, false, false);
                this.dot3ChipSetIntel82586 = new Dot3ChipSetIntel82586Ent(mib, this);
                this.dot3ChipSetIntel82596 = new Dot3ChipSetIntel82596Ent(mib, this);
                this.dot3ChipSetIntel82595 = new Dot3ChipSetIntel82595Ent(mib, this);
                this.dot3ChipSetIntel82557 = new Dot3ChipSetIntel82557Ent(mib, this);
                this.dot3ChipSetIntel82558 = new Dot3ChipSetIntel82558Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetIntel82586,
                    this.dot3ChipSetIntel82596,
                    this.dot3ChipSetIntel82595,
                    this.dot3ChipSetIntel82557,
                    this.dot3ChipSetIntel82558
                };
            }
            public static final class Dot3ChipSetIntel82586Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetIntel82586Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82586", "1.3.6.1.2.1.10.7.8.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetIntel82596Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetIntel82596Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82596", "1.3.6.1.2.1.10.7.8.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetIntel82595Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetIntel82595Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82595", "1.3.6.1.2.1.10.7.8.2.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetIntel82557Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetIntel82557Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82557", "1.3.6.1.2.1.10.7.8.2.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetIntel82558Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetIntel82558Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82558", "1.3.6.1.2.1.10.7.8.2.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetSeeqEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetSeeq8003Ent dot3ChipSetSeeq8003;

            public final Dot3ChipSetSeeq80C03Ent dot3ChipSetSeeq80C03;

            public final Dot3ChipSetSeeq84C30Ent dot3ChipSetSeeq84C30;

            public final Dot3ChipSetSeeq8431Ent dot3ChipSetSeeq8431;

            public final Dot3ChipSetSeeq80C300Ent dot3ChipSetSeeq80C300;

            public final Dot3ChipSetSeeq84C300Ent dot3ChipSetSeeq84C300;

            public final Dot3ChipSetSeeq84301Ent dot3ChipSetSeeq84301;

            public final Dot3ChipSetSeeq84302Ent dot3ChipSetSeeq84302;

            public final Dot3ChipSetSeeq8100Ent dot3ChipSetSeeq8100;

            private Dot3ChipSetSeeqEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetSeeq", "1.3.6.1.2.1.10.7.8.3", false, false, false, false);
                this.dot3ChipSetSeeq8003 = new Dot3ChipSetSeeq8003Ent(mib, this);
                this.dot3ChipSetSeeq80C03 = new Dot3ChipSetSeeq80C03Ent(mib, this);
                this.dot3ChipSetSeeq84C30 = new Dot3ChipSetSeeq84C30Ent(mib, this);
                this.dot3ChipSetSeeq8431 = new Dot3ChipSetSeeq8431Ent(mib, this);
                this.dot3ChipSetSeeq80C300 = new Dot3ChipSetSeeq80C300Ent(mib, this);
                this.dot3ChipSetSeeq84C300 = new Dot3ChipSetSeeq84C300Ent(mib, this);
                this.dot3ChipSetSeeq84301 = new Dot3ChipSetSeeq84301Ent(mib, this);
                this.dot3ChipSetSeeq84302 = new Dot3ChipSetSeeq84302Ent(mib, this);
                this.dot3ChipSetSeeq8100 = new Dot3ChipSetSeeq8100Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetSeeq8003,
                    this.dot3ChipSetSeeq80C03,
                    this.dot3ChipSetSeeq84C30,
                    this.dot3ChipSetSeeq8431,
                    this.dot3ChipSetSeeq80C300,
                    this.dot3ChipSetSeeq84C300,
                    this.dot3ChipSetSeeq84301,
                    this.dot3ChipSetSeeq84302,
                    this.dot3ChipSetSeeq8100
                };
            }
            public static final class Dot3ChipSetSeeq8003Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq8003Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq8003", "1.3.6.1.2.1.10.7.8.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq80C03Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq80C03Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq80C03", "1.3.6.1.2.1.10.7.8.3.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq84C30Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq84C30Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq84C30", "1.3.6.1.2.1.10.7.8.3.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq8431Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq8431Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq8431", "1.3.6.1.2.1.10.7.8.3.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq80C300Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq80C300Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq80C300", "1.3.6.1.2.1.10.7.8.3.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq84C300Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq84C300Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq84C300", "1.3.6.1.2.1.10.7.8.3.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq84301Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq84301Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq84301", "1.3.6.1.2.1.10.7.8.3.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq84302Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq84302Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq84302", "1.3.6.1.2.1.10.7.8.3.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetSeeq8100Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetSeeq8100Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq8100", "1.3.6.1.2.1.10.7.8.3.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetNationalEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetNational8390Ent dot3ChipSetNational8390;

            public final Dot3ChipSetNationalSonicEnt dot3ChipSetNationalSonic;

            public final Dot3ChipSetNational83901Ent dot3ChipSetNational83901;

            public final Dot3ChipSetNational83902Ent dot3ChipSetNational83902;

            public final Dot3ChipSetNational83905Ent dot3ChipSetNational83905;

            public final Dot3ChipSetNational83907Ent dot3ChipSetNational83907;

            public final Dot3ChipSetNational83916Ent dot3ChipSetNational83916;

            public final Dot3ChipSetNational83934Ent dot3ChipSetNational83934;

            public final Dot3ChipSetNational83936Ent dot3ChipSetNational83936;

            private Dot3ChipSetNationalEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetNational", "1.3.6.1.2.1.10.7.8.4", false, false, false, false);
                this.dot3ChipSetNational8390 = new Dot3ChipSetNational8390Ent(mib, this);
                this.dot3ChipSetNationalSonic = new Dot3ChipSetNationalSonicEnt(mib, this);
                this.dot3ChipSetNational83901 = new Dot3ChipSetNational83901Ent(mib, this);
                this.dot3ChipSetNational83902 = new Dot3ChipSetNational83902Ent(mib, this);
                this.dot3ChipSetNational83905 = new Dot3ChipSetNational83905Ent(mib, this);
                this.dot3ChipSetNational83907 = new Dot3ChipSetNational83907Ent(mib, this);
                this.dot3ChipSetNational83916 = new Dot3ChipSetNational83916Ent(mib, this);
                this.dot3ChipSetNational83934 = new Dot3ChipSetNational83934Ent(mib, this);
                this.dot3ChipSetNational83936 = new Dot3ChipSetNational83936Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetNational8390,
                    this.dot3ChipSetNationalSonic,
                    this.dot3ChipSetNational83901,
                    this.dot3ChipSetNational83902,
                    this.dot3ChipSetNational83905,
                    this.dot3ChipSetNational83907,
                    this.dot3ChipSetNational83916,
                    this.dot3ChipSetNational83934,
                    this.dot3ChipSetNational83936
                };
            }
            public static final class Dot3ChipSetNational8390Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational8390Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational8390", "1.3.6.1.2.1.10.7.8.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNationalSonicEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNationalSonicEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNationalSonic", "1.3.6.1.2.1.10.7.8.4.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83901Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83901Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83901", "1.3.6.1.2.1.10.7.8.4.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83902Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83902Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83902", "1.3.6.1.2.1.10.7.8.4.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83905Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83905Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83905", "1.3.6.1.2.1.10.7.8.4.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83907Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83907Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83907", "1.3.6.1.2.1.10.7.8.4.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83916Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83916Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83916", "1.3.6.1.2.1.10.7.8.4.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83934Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83934Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83934", "1.3.6.1.2.1.10.7.8.4.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNational83936Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetNational83936Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational83936", "1.3.6.1.2.1.10.7.8.4.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetFujitsuEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetFujitsu86950Ent dot3ChipSetFujitsu86950;

            public final Dot3ChipSetFujitsu86960Ent dot3ChipSetFujitsu86960;

            public final Dot3ChipSetFujitsu86964Ent dot3ChipSetFujitsu86964;

            public final Dot3ChipSetFujitsu86965AEnt dot3ChipSetFujitsu86965A;

            public final Dot3ChipSetFujitsu86965BEnt dot3ChipSetFujitsu86965B;

            private Dot3ChipSetFujitsuEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetFujitsu", "1.3.6.1.2.1.10.7.8.5", false, false, false, false);
                this.dot3ChipSetFujitsu86950 = new Dot3ChipSetFujitsu86950Ent(mib, this);
                this.dot3ChipSetFujitsu86960 = new Dot3ChipSetFujitsu86960Ent(mib, this);
                this.dot3ChipSetFujitsu86964 = new Dot3ChipSetFujitsu86964Ent(mib, this);
                this.dot3ChipSetFujitsu86965A = new Dot3ChipSetFujitsu86965AEnt(mib, this);
                this.dot3ChipSetFujitsu86965B = new Dot3ChipSetFujitsu86965BEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetFujitsu86950,
                    this.dot3ChipSetFujitsu86960,
                    this.dot3ChipSetFujitsu86964,
                    this.dot3ChipSetFujitsu86965A,
                    this.dot3ChipSetFujitsu86965B
                };
            }
            public static final class Dot3ChipSetFujitsu86950Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetFujitsu86950Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86950", "1.3.6.1.2.1.10.7.8.5.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetFujitsu86960Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetFujitsu86960Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86960", "1.3.6.1.2.1.10.7.8.5.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetFujitsu86964Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetFujitsu86964Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86964", "1.3.6.1.2.1.10.7.8.5.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetFujitsu86965AEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetFujitsu86965AEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86965A", "1.3.6.1.2.1.10.7.8.5.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetFujitsu86965BEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetFujitsu86965BEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86965B", "1.3.6.1.2.1.10.7.8.5.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetDigitalEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetDigitalDC21040Ent dot3ChipSetDigitalDC21040;

            public final Dot3ChipSetDigital21041Ent dot3ChipSetDigital21041;

            public final Dot3ChipSetDigital21140Ent dot3ChipSetDigital21140;

            public final Dot3ChipSetDigital21143Ent dot3ChipSetDigital21143;

            public final Dot3ChipSetDigital21340Ent dot3ChipSetDigital21340;

            public final Dot3ChipSetDigital21440Ent dot3ChipSetDigital21440;

            public final Dot3ChipSetDigital21540Ent dot3ChipSetDigital21540;

            private Dot3ChipSetDigitalEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetDigital", "1.3.6.1.2.1.10.7.8.6", false, false, false, false);
                this.dot3ChipSetDigitalDC21040 = new Dot3ChipSetDigitalDC21040Ent(mib, this);
                this.dot3ChipSetDigital21041 = new Dot3ChipSetDigital21041Ent(mib, this);
                this.dot3ChipSetDigital21140 = new Dot3ChipSetDigital21140Ent(mib, this);
                this.dot3ChipSetDigital21143 = new Dot3ChipSetDigital21143Ent(mib, this);
                this.dot3ChipSetDigital21340 = new Dot3ChipSetDigital21340Ent(mib, this);
                this.dot3ChipSetDigital21440 = new Dot3ChipSetDigital21440Ent(mib, this);
                this.dot3ChipSetDigital21540 = new Dot3ChipSetDigital21540Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetDigitalDC21040,
                    this.dot3ChipSetDigital21041,
                    this.dot3ChipSetDigital21140,
                    this.dot3ChipSetDigital21143,
                    this.dot3ChipSetDigital21340,
                    this.dot3ChipSetDigital21440,
                    this.dot3ChipSetDigital21540
                };
            }
            public static final class Dot3ChipSetDigitalDC21040Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigitalDC21040Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigitalDC21040", "1.3.6.1.2.1.10.7.8.6.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetDigital21041Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigital21041Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigital21041", "1.3.6.1.2.1.10.7.8.6.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetDigital21140Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigital21140Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigital21140", "1.3.6.1.2.1.10.7.8.6.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetDigital21143Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigital21143Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigital21143", "1.3.6.1.2.1.10.7.8.6.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetDigital21340Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigital21340Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigital21340", "1.3.6.1.2.1.10.7.8.6.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetDigital21440Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigital21440Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigital21440", "1.3.6.1.2.1.10.7.8.6.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetDigital21540Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetDigital21540Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetDigital21540", "1.3.6.1.2.1.10.7.8.6.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetTIEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetTIE100Ent dot3ChipSetTIE100;

            public final Dot3ChipSetTIE110Ent dot3ChipSetTIE110;

            public final Dot3ChipSetTIX3100Ent dot3ChipSetTIX3100;

            public final Dot3ChipSetTIX3150Ent dot3ChipSetTIX3150;

            public final Dot3ChipSetTIX3270Ent dot3ChipSetTIX3270;

            private Dot3ChipSetTIEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetTI", "1.3.6.1.2.1.10.7.8.7", false, false, false, false);
                this.dot3ChipSetTIE100 = new Dot3ChipSetTIE100Ent(mib, this);
                this.dot3ChipSetTIE110 = new Dot3ChipSetTIE110Ent(mib, this);
                this.dot3ChipSetTIX3100 = new Dot3ChipSetTIX3100Ent(mib, this);
                this.dot3ChipSetTIX3150 = new Dot3ChipSetTIX3150Ent(mib, this);
                this.dot3ChipSetTIX3270 = new Dot3ChipSetTIX3270Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetTIE100,
                    this.dot3ChipSetTIE110,
                    this.dot3ChipSetTIX3100,
                    this.dot3ChipSetTIX3150,
                    this.dot3ChipSetTIX3270
                };
            }
            public static final class Dot3ChipSetTIE100Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetTIE100Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetTIE100", "1.3.6.1.2.1.10.7.8.7.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetTIE110Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetTIE110Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetTIE110", "1.3.6.1.2.1.10.7.8.7.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetTIX3100Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetTIX3100Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetTIX3100", "1.3.6.1.2.1.10.7.8.7.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetTIX3150Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetTIX3150Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetTIX3150", "1.3.6.1.2.1.10.7.8.7.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetTIX3270Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetTIX3270Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetTIX3270", "1.3.6.1.2.1.10.7.8.7.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetToshibaEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetToshibaTC35815FEnt dot3ChipSetToshibaTC35815F;

            private Dot3ChipSetToshibaEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetToshiba", "1.3.6.1.2.1.10.7.8.8", false, false, false, false);
                this.dot3ChipSetToshibaTC35815F = new Dot3ChipSetToshibaTC35815FEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetToshibaTC35815F
                };
            }
            public static final class Dot3ChipSetToshibaTC35815FEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetToshibaTC35815FEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetToshibaTC35815F", "1.3.6.1.2.1.10.7.8.8.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetLucentEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetLucentATT1MX10Ent dot3ChipSetLucentATT1MX10;

            public final Dot3ChipSetLucentLUC3M08Ent dot3ChipSetLucentLUC3M08;

            private Dot3ChipSetLucentEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetLucent", "1.3.6.1.2.1.10.7.8.9", false, false, false, false);
                this.dot3ChipSetLucentATT1MX10 = new Dot3ChipSetLucentATT1MX10Ent(mib, this);
                this.dot3ChipSetLucentLUC3M08 = new Dot3ChipSetLucentLUC3M08Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetLucentATT1MX10,
                    this.dot3ChipSetLucentLUC3M08
                };
            }
            public static final class Dot3ChipSetLucentATT1MX10Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetLucentATT1MX10Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetLucentATT1MX10", "1.3.6.1.2.1.10.7.8.9.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetLucentLUC3M08Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetLucentLUC3M08Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetLucentLUC3M08", "1.3.6.1.2.1.10.7.8.9.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetGalileoEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetGalileoGT48001Ent dot3ChipSetGalileoGT48001;

            public final Dot3ChipSetGalileoGT48002Ent dot3ChipSetGalileoGT48002;

            public final Dot3ChipSetGalileoGT48004Ent dot3ChipSetGalileoGT48004;

            public final Dot3ChipSetGalileoGT48207Ent dot3ChipSetGalileoGT48207;

            public final Dot3ChipSetGalileoGT48208Ent dot3ChipSetGalileoGT48208;

            public final Dot3ChipSetGalileoGT48212Ent dot3ChipSetGalileoGT48212;

            private Dot3ChipSetGalileoEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetGalileo", "1.3.6.1.2.1.10.7.8.10", false, false, false, false);
                this.dot3ChipSetGalileoGT48001 = new Dot3ChipSetGalileoGT48001Ent(mib, this);
                this.dot3ChipSetGalileoGT48002 = new Dot3ChipSetGalileoGT48002Ent(mib, this);
                this.dot3ChipSetGalileoGT48004 = new Dot3ChipSetGalileoGT48004Ent(mib, this);
                this.dot3ChipSetGalileoGT48207 = new Dot3ChipSetGalileoGT48207Ent(mib, this);
                this.dot3ChipSetGalileoGT48208 = new Dot3ChipSetGalileoGT48208Ent(mib, this);
                this.dot3ChipSetGalileoGT48212 = new Dot3ChipSetGalileoGT48212Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetGalileoGT48001,
                    this.dot3ChipSetGalileoGT48002,
                    this.dot3ChipSetGalileoGT48004,
                    this.dot3ChipSetGalileoGT48207,
                    this.dot3ChipSetGalileoGT48208,
                    this.dot3ChipSetGalileoGT48212
                };
            }
            public static final class Dot3ChipSetGalileoGT48001Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetGalileoGT48001Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetGalileoGT48001", "1.3.6.1.2.1.10.7.8.10.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetGalileoGT48002Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetGalileoGT48002Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetGalileoGT48002", "1.3.6.1.2.1.10.7.8.10.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetGalileoGT48004Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetGalileoGT48004Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetGalileoGT48004", "1.3.6.1.2.1.10.7.8.10.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetGalileoGT48207Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetGalileoGT48207Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetGalileoGT48207", "1.3.6.1.2.1.10.7.8.10.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetGalileoGT48208Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetGalileoGT48208Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetGalileoGT48208", "1.3.6.1.2.1.10.7.8.10.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetGalileoGT48212Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetGalileoGT48212Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetGalileoGT48212", "1.3.6.1.2.1.10.7.8.10.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetJatoEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetJatoJT1001Ent dot3ChipSetJatoJT1001;

            private Dot3ChipSetJatoEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetJato", "1.3.6.1.2.1.10.7.8.11", false, false, false, false);
                this.dot3ChipSetJatoJT1001 = new Dot3ChipSetJatoJT1001Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetJatoJT1001
                };
            }
            public static final class Dot3ChipSetJatoJT1001Ent extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetJatoJT1001Ent(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetJatoJT1001", "1.3.6.1.2.1.10.7.8.11.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetXaQtiEnt extends MIBEntry<ETHERCHIPSETMIBDef>
        {
            public final Dot3ChipSetXaQtiXQ11800FPEnt dot3ChipSetXaQtiXQ11800FP;

            public final Dot3ChipSetXaQtiXQ18110FPEnt dot3ChipSetXaQtiXQ18110FP;

            private Dot3ChipSetXaQtiEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetXaQti", "1.3.6.1.2.1.10.7.8.12", false, false, false, false);
                this.dot3ChipSetXaQtiXQ11800FP = new Dot3ChipSetXaQtiXQ11800FPEnt(mib, this);
                this.dot3ChipSetXaQtiXQ18110FP = new Dot3ChipSetXaQtiXQ18110FPEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetXaQtiXQ11800FP,
                    this.dot3ChipSetXaQtiXQ18110FP
                };
            }
            public static final class Dot3ChipSetXaQtiXQ11800FPEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetXaQtiXQ11800FPEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetXaQtiXQ11800FP", "1.3.6.1.2.1.10.7.8.12.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetXaQtiXQ18110FPEnt extends MIBEntry<ETHERCHIPSETMIBDef>
            {
                private Dot3ChipSetXaQtiXQ18110FPEnt(ETHERCHIPSETMIBDef mib, MIBEntry<ETHERCHIPSETMIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetXaQtiXQ18110FP", "1.3.6.1.2.1.10.7.8.12.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
