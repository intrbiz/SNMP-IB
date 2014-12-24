package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;

public final class IANAADDRESSFAMILYNUMBERSMIBDef extends MIB
{
    public static final IANAADDRESSFAMILYNUMBERSMIBDef IANAADDRESSFAMILYNUMBERSMIB = new IANAADDRESSFAMILYNUMBERSMIBDef();

    /** March 14, 2002*/
    public final IanaAddressFamilyNumbersEnt ianaAddressFamilyNumbers;

    private IANAADDRESSFAMILYNUMBERSMIBDef()
    {
        super("IANA-ADDRESS-FAMILY-NUMBERS-MIB");
        this.ianaAddressFamilyNumbers = new IanaAddressFamilyNumbersEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaAddressFamilyNumbers
        };
    }

    public static final class IanaAddressFamilyNumbersEnt extends MIBEntry<IANAADDRESSFAMILYNUMBERSMIBDef>
    {
        private IanaAddressFamilyNumbersEnt(IANAADDRESSFAMILYNUMBERSMIBDef mib, MIBEntry<IANAADDRESSFAMILYNUMBERSMIBDef> parent)
        {
            super(mib, parent, "ianaAddressFamilyNumbers", "1.3.6.1.2.1.72", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
