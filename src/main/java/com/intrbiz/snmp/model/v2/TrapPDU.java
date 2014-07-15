package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.model.asn1.TimeTicks;

public class TrapPDU extends VarBindPDU 
{
    public static final int TAG = 7;
    
    public TrapPDU()
    {
        super();
    }
    
    public TrapPDU(DERTaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    protected int _tag()
    {
        return TAG;
    }
    
    /**
     * Get the uptime of the agent when the trap was generated
     */
    public TimeTicks getAgentUptime()
    {
        VarBind trapUptime = this.index(0);
        if (! "1.3.6.1.2.1.1.3.0".equals(trapUptime.getObjectName())) throw new IllegalStateException("Malformed TrapPDU, failed to get agent uptime");
        return trapUptime.getTimeTicksValue();
    }
    
    /**
     * Get the OID of the trap
     */
    public String getTrapOID()
    {
        VarBind trapOid = this.index(1);
        if (! "1.3.6.1.6.3.1.1.4.1.0".equals(trapOid.getObjectName())) throw new IllegalStateException("Malformed TrapPDU, failed to get trap OID");
        return trapOid.getOIDValue();
    }
    
    /**
     * Get the value of a specific trap argument, zero indexed
     * @param index - the argument index, starting from zero
     * @return the VarBind value of the argument
     */
    public VarBind getTrapArgument(int index)
    {
        return this.index(index + 2);
    }
    
    /**
     * The number of arguments this trap has
     * @return
     */
    public int getNumberOfTrapArguments()
    {
        return this.size() - 2;
    }
    
    // friendly helpers for common stuff
    
    /**
     * Is this a Link Down trap
     */
    public boolean isLinkDownTrap()
    {
        return "1.3.6.1.6.3.1.1.5.3".equals(this.getTrapOID());
    }
    
    /**
     * Is this a Link Up Trap
     */
    public boolean isLinkUpTrap()
    {
        return "1.3.6.1.6.3.1.1.5.4".equals(this.getTrapOID());
    }
}
