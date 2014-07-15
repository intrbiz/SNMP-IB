package com.intrbiz.snmp.model.v1;

public enum GenericTrap
{
    COLD_START,
    WARM_START,
    LINK_DOWN,
    LINK_UP,
    AUTHENTICATION_FAILURE,
    EGP_NEIGHBOR_LOSS,
    ENTERPRISE_SPECIFIC;
    
    public int getCode()
    {
        return this.ordinal();
    }
    
    public static GenericTrap valueOf(int code)
    {
        for (GenericTrap gt : GenericTrap.values())
        {
            if (gt.getCode() == code) return gt;
        }
        return null;
    }
}