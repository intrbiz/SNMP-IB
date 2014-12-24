package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ENTITYSTATETCMIBDef extends MIB
{
    public static final ENTITYSTATETCMIBDef ENTITYSTATETCMIB = new ENTITYSTATETCMIBDef();

    public final EntityStateTcEnt entityStateTc;

    private ENTITYSTATETCMIBDef()
    {
        super("ENTITY-STATE-TC-MIB");
        this.entityStateTc = new EntityStateTcEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.entityStateTc
        };
    }

    public static final class EntityStateTcEnt extends MIBEntry<ENTITYSTATETCMIBDef>
    {
        private EntityStateTcEnt(ENTITYSTATETCMIBDef mib, MIBEntry<ENTITYSTATETCMIBDef> parent)
        {
            super(mib, parent, "entityStateTc", "1.3.6.1.2.1.130", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
