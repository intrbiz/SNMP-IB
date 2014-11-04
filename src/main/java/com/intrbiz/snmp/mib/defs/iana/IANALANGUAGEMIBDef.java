package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IANALANGUAGEMIBDef extends MIB
{
    public static final IANALANGUAGEMIBDef IANALANGUAGEMIB = new IANALANGUAGEMIBDef();

    static { MIBs.getInstance().registerMIB(IANALANGUAGEMIBDef.IANALANGUAGEMIB); }

    /** May 10, 2000*/
    public final IanaLanguagesEnt ianaLanguages;

    private IANALANGUAGEMIBDef()
    {
        super("IANA-LANGUAGE-MIB");
        this.ianaLanguages = new IanaLanguagesEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaLanguages
        };
    }

    public static final class IanaLanguagesEnt extends MIBEntry<IANALANGUAGEMIBDef>
    {
        public final IanaLangJavaByteCodeEnt ianaLangJavaByteCode;

        public final IanaLangTclEnt ianaLangTcl;

        public final IanaLangPerlEnt ianaLangPerl;

        public final IanaLangSchemeEnt ianaLangScheme;

        public final IanaLangSRSLEnt ianaLangSRSL;

        public final IanaLangPSLEnt ianaLangPSL;

        public final IanaLangSMSLEnt ianaLangSMSL;

        private IanaLanguagesEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
        {
            super(mib, parent, "ianaLanguages", "1.3.6.1.2.1.73", false, false, false, false);
            this.ianaLangJavaByteCode = new IanaLangJavaByteCodeEnt(mib, this);
            this.ianaLangTcl = new IanaLangTclEnt(mib, this);
            this.ianaLangPerl = new IanaLangPerlEnt(mib, this);
            this.ianaLangScheme = new IanaLangSchemeEnt(mib, this);
            this.ianaLangSRSL = new IanaLangSRSLEnt(mib, this);
            this.ianaLangPSL = new IanaLangPSLEnt(mib, this);
            this.ianaLangSMSL = new IanaLangSMSLEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ianaLangJavaByteCode,
                this.ianaLangTcl,
                this.ianaLangPerl,
                this.ianaLangScheme,
                this.ianaLangSRSL,
                this.ianaLangPSL,
                this.ianaLangSMSL
            };
        }
        public static final class IanaLangJavaByteCodeEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangJavaByteCodeEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangJavaByteCode", "1.3.6.1.2.1.73.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IanaLangTclEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangTclEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangTcl", "1.3.6.1.2.1.73.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IanaLangPerlEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangPerlEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangPerl", "1.3.6.1.2.1.73.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IanaLangSchemeEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangSchemeEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangScheme", "1.3.6.1.2.1.73.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IanaLangSRSLEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangSRSLEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangSRSL", "1.3.6.1.2.1.73.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IanaLangPSLEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangPSLEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangPSL", "1.3.6.1.2.1.73.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IanaLangSMSLEnt extends MIBEntry<IANALANGUAGEMIBDef>
        {
            private IanaLangSMSLEnt(IANALANGUAGEMIBDef mib, MIBEntry<IANALANGUAGEMIBDef> parent)
            {
                super(mib, parent, "ianaLangSMSL", "1.3.6.1.2.1.73.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
