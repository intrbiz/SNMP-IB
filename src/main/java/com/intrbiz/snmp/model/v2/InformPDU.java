package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.DERTaggedObject;

public class InformPDU extends VarBindPDU 
{
    public static final int TAG = 6;
    
    public InformPDU()
    {
        super();
    }
    
    public InformPDU(DERTaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    protected int _tag()
    {
        return TAG;
    }
}
