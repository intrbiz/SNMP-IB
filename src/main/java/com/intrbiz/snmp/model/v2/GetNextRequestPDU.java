package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1TaggedObject;

public class GetNextRequestPDU extends VarBindPDU
{
    public static final int TAG = 1;

    public GetNextRequestPDU()
    {
        super();
    }

    public GetNextRequestPDU(ASN1TaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    public GetNextRequestPDU(String... oids)
    {
        super();
        this.addOids(oids);
    }

    protected int _tag()
    {
        return TAG;
    }
    
    public GetNextRequestPDU addOid(String oid)
    {
        this.addVarBind(oid);
        return this;
    }
    
    public GetNextRequestPDU addOids(String... oids)
    {
        for (String oid : oids)
        {
            this.addVarBind(oid);
        }
        return this;
    }
}
