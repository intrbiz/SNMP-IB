package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ATMTCMIBDef extends MIB
{
    public static final ATMTCMIBDef ATMTCMIB = new ATMTCMIBDef();

    static { MIBs.getInstance().registerMIB(ATMTCMIBDef.ATMTCMIB); }

    public final AtmTCMIBEnt atmTCMIB;

    /** OBJECT-IDENTITIES:
The following atmTrafficDescriptorTypes has been movedfrom RFC1695 and no longer appear in the revision ofRFC1695[3].*/
    public final AtmTrafficDescriptorTypesEnt atmTrafficDescriptorTypes;

    private ATMTCMIBDef()
    {
        super("ATM-TC-MIB");
        this.atmTCMIB = new AtmTCMIBEnt(this, null);
        this.atmTrafficDescriptorTypes = new AtmTrafficDescriptorTypesEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.atmTCMIB,
            this.atmTrafficDescriptorTypes
        };
    }

    public static final class AtmTCMIBEnt extends MIBEntry<ATMTCMIBDef>
    {
        /** atmMIBObjectsSee [3].
All other and new OBJECT IDENTITIESare defined under the following subtree:*/
        public final AtmObjectIdentitiesEnt atmObjectIdentities;

        private AtmTCMIBEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
        {
            super(mib, parent, "atmTCMIB", "1.3.6.1.2.1.37.3", false, false, false, false);
            this.atmObjectIdentities = new AtmObjectIdentitiesEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.atmObjectIdentities
            };
        }
        public static final class AtmObjectIdentitiesEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmObjectIdentitiesEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmObjectIdentities", "1.3.6.1.2.1.37.3.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class AtmTrafficDescriptorTypesEnt extends MIBEntry<ATMTCMIBDef>
    {
        /** The following values are defined for use aspossible values of the ATM traffic descriptor type.*/
        public final AtmNoTrafficDescriptorEnt atmNoTrafficDescriptor;

        public final AtmNoClpNoScrEnt atmNoClpNoScr;

        public final AtmClpNoTaggingNoScrEnt atmClpNoTaggingNoScr;

        public final AtmClpTaggingNoScrEnt atmClpTaggingNoScr;

        public final AtmNoClpScrEnt atmNoClpScr;

        public final AtmClpNoTaggingScrEnt atmClpNoTaggingScr;

        public final AtmClpTaggingScrEnt atmClpTaggingScr;

        public final AtmClpNoTaggingMcrEnt atmClpNoTaggingMcr;

        public final AtmClpTransparentNoScrEnt atmClpTransparentNoScr;

        public final AtmClpTransparentScrEnt atmClpTransparentScr;

        public final AtmNoClpTaggingNoScrEnt atmNoClpTaggingNoScr;

        public final AtmNoClpNoScrCdvtEnt atmNoClpNoScrCdvt;

        public final AtmNoClpScrCdvtEnt atmNoClpScrCdvt;

        public final AtmClpNoTaggingScrCdvtEnt atmClpNoTaggingScrCdvt;

        public final AtmClpTaggingScrCdvtEnt atmClpTaggingScrCdvt;

        private AtmTrafficDescriptorTypesEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
        {
            super(mib, parent, "atmTrafficDescriptorTypes", "1.3.6.1.2.1.37.1.1", false, false, false, false);
            this.atmNoTrafficDescriptor = new AtmNoTrafficDescriptorEnt(mib, this);
            this.atmNoClpNoScr = new AtmNoClpNoScrEnt(mib, this);
            this.atmClpNoTaggingNoScr = new AtmClpNoTaggingNoScrEnt(mib, this);
            this.atmClpTaggingNoScr = new AtmClpTaggingNoScrEnt(mib, this);
            this.atmNoClpScr = new AtmNoClpScrEnt(mib, this);
            this.atmClpNoTaggingScr = new AtmClpNoTaggingScrEnt(mib, this);
            this.atmClpTaggingScr = new AtmClpTaggingScrEnt(mib, this);
            this.atmClpNoTaggingMcr = new AtmClpNoTaggingMcrEnt(mib, this);
            this.atmClpTransparentNoScr = new AtmClpTransparentNoScrEnt(mib, this);
            this.atmClpTransparentScr = new AtmClpTransparentScrEnt(mib, this);
            this.atmNoClpTaggingNoScr = new AtmNoClpTaggingNoScrEnt(mib, this);
            this.atmNoClpNoScrCdvt = new AtmNoClpNoScrCdvtEnt(mib, this);
            this.atmNoClpScrCdvt = new AtmNoClpScrCdvtEnt(mib, this);
            this.atmClpNoTaggingScrCdvt = new AtmClpNoTaggingScrCdvtEnt(mib, this);
            this.atmClpTaggingScrCdvt = new AtmClpTaggingScrCdvtEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.atmNoTrafficDescriptor,
                this.atmNoClpNoScr,
                this.atmClpNoTaggingNoScr,
                this.atmClpTaggingNoScr,
                this.atmNoClpScr,
                this.atmClpNoTaggingScr,
                this.atmClpTaggingScr,
                this.atmClpNoTaggingMcr,
                this.atmClpTransparentNoScr,
                this.atmClpTransparentScr,
                this.atmNoClpTaggingNoScr,
                this.atmNoClpNoScrCdvt,
                this.atmNoClpScrCdvt,
                this.atmClpNoTaggingScrCdvt,
                this.atmClpTaggingScrCdvt
            };
        }
        public static final class AtmNoTrafficDescriptorEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmNoTrafficDescriptorEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmNoTrafficDescriptor", "1.3.6.1.2.1.37.1.1.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmNoClpNoScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmNoClpNoScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmNoClpNoScr", "1.3.6.1.2.1.37.1.1.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpNoTaggingNoScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpNoTaggingNoScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpNoTaggingNoScr", "1.3.6.1.2.1.37.1.1.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpTaggingNoScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpTaggingNoScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpTaggingNoScr", "1.3.6.1.2.1.37.1.1.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmNoClpScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmNoClpScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmNoClpScr", "1.3.6.1.2.1.37.1.1.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpNoTaggingScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpNoTaggingScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpNoTaggingScr", "1.3.6.1.2.1.37.1.1.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpTaggingScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpTaggingScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpTaggingScr", "1.3.6.1.2.1.37.1.1.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpNoTaggingMcrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpNoTaggingMcrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpNoTaggingMcr", "1.3.6.1.2.1.37.1.1.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpTransparentNoScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpTransparentNoScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpTransparentNoScr", "1.3.6.1.2.1.37.1.1.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpTransparentScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpTransparentScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpTransparentScr", "1.3.6.1.2.1.37.1.1.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmNoClpTaggingNoScrEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmNoClpTaggingNoScrEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmNoClpTaggingNoScr", "1.3.6.1.2.1.37.1.1.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmNoClpNoScrCdvtEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmNoClpNoScrCdvtEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmNoClpNoScrCdvt", "1.3.6.1.2.1.37.1.1.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmNoClpScrCdvtEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmNoClpScrCdvtEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmNoClpScrCdvt", "1.3.6.1.2.1.37.1.1.13", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpNoTaggingScrCdvtEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpNoTaggingScrCdvtEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpNoTaggingScrCdvt", "1.3.6.1.2.1.37.1.1.14", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AtmClpTaggingScrCdvtEnt extends MIBEntry<ATMTCMIBDef>
        {
            private AtmClpTaggingScrCdvtEnt(ATMTCMIBDef mib, MIBEntry<ATMTCMIBDef> parent)
            {
                super(mib, parent, "atmClpTaggingScrCdvt", "1.3.6.1.2.1.37.1.1.15", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
