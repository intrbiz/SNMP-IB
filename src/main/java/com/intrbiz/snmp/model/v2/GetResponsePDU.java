package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.SNMPContext;

public class GetResponsePDU extends VarBindPDU 
{
    public static final int TAG = 2;
    
    public GetResponsePDU()
    {
        super();
    }
    
    public GetResponsePDU(DERTaggedObject val, SNMPContext ctx)
    {
        this();
        this.decode(val, ctx);
    }
    
    protected int _tag()
    {
        return TAG;
    }
}
