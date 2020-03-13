package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1TaggedObject;

public class InformPDU extends VarBindPDU 
{
    public static final int TAG = 6;
    
    public InformPDU()
    {
        super();
    }
    
    public InformPDU(ASN1TaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    protected int _tag()
    {
        return TAG;
    }
}
