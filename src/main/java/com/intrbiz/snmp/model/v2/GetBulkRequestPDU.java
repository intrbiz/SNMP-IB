package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1TaggedObject;

public class GetBulkRequestPDU extends VarBindPDU
{
    public static final int TAG = 5;

    public GetBulkRequestPDU()
    {
        super();
        this.setNonRepeaters(0);
        this.setMaxRepetitions(10);
    }

    public GetBulkRequestPDU(ASN1TaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    public GetBulkRequestPDU(String... oids)
    {
        super();
        this.setNonRepeaters(0);
        this.setMaxRepetitions(10);
        this.addOids(oids);
    }
    
    public GetBulkRequestPDU(int maxRepetitions, String... oids)
    {
        super();
        this.setNonRepeaters(0);
        this.setMaxRepetitions(maxRepetitions);
        this.addOids(oids);
    }
    
    public GetBulkRequestPDU(int nonRepeaters, int maxRepetitions, String... oids)
    {
        super();
        this.setNonRepeaters(nonRepeaters);
        this.setMaxRepetitions(maxRepetitions);
        this.addOids(oids);
    }

    protected int _tag()
    {
        return TAG;
    }
    
    public GetBulkRequestPDU addOid(String oid)
    {
        this.addVarBind(oid);
        return this;
    }
    
    public GetBulkRequestPDU addOids(String... oids)
    {
        for (String oid : oids)
        {
            this.addVarBind(oid);
        }
        return this;
    }
    
    public int getNonRepeaters()
    {
        return this.errorStatus;
    }
    
    public void setNonRepeaters(int nonRepeaters)
    {
        this.errorStatus = nonRepeaters;
    }
    
    public int getMaxRepetitions()
    {
        return this.errorIndex;
    }
    
    public void setMaxRepetitions(int maxRepetitions)
    {
        this.errorIndex = maxRepetitions;
    }
}
