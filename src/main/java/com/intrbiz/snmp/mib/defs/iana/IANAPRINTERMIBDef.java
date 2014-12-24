package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;

/**http://www.iana.org/assignments/ianaprinter-mib
[RFC2578]*/
public final class IANAPRINTERMIBDef extends MIB
{
    public static final IANAPRINTERMIBDef IANAPRINTERMIB = new IANAPRINTERMIBDef();

    /** [RFC2579]

September 14, 2005*/
    public final IanaPrinterMIBEnt ianaPrinterMIB;

    private IANAPRINTERMIBDef()
    {
        super("IANA-PRINTER-MIB");
        this.ianaPrinterMIB = new IanaPrinterMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaPrinterMIB
        };
    }

    public static final class IanaPrinterMIBEnt extends MIBEntry<IANAPRINTERMIBDef>
    {
        private IanaPrinterMIBEnt(IANAPRINTERMIBDef mib, MIBEntry<IANAPRINTERMIBDef> parent)
        {
            super(mib, parent, "ianaPrinterMIB", "1.3.6.1.2.1.109", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
