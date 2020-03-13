package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1TaggedObject;

public class GetRequestPDU extends VarBindPDU
{
    public static final int TAG = 0;

    public GetRequestPDU()
    {
        super();
    }

    public GetRequestPDU(ASN1TaggedObject val)
    {
        this();
        this.decode(val);
    }    
    
    public GetRequestPDU(String... oids)
    {
        super();
        this.addOids(oids);
    }

    protected int _tag()
    {
        return TAG;
    }
    
    public GetRequestPDU addOid(String oid)
    {
        this.addVarBind(oid);
        return this;
    }
    
    public GetRequestPDU addOids(String... oids)
    {
        for (String oid : oids)
        {
            this.addVarBind(oid);
        }
        return this;
    }
}
