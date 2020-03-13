package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1TaggedObject;

public class GetResponsePDU extends VarBindPDU 
{
    public static final int TAG = 2;
    
    public GetResponsePDU()
    {
        super();
    }
    
    public GetResponsePDU(ASN1TaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    protected int _tag()
    {
        return TAG;
    }
}
