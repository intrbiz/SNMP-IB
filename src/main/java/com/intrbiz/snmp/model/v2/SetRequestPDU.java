package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.DERTaggedObject;

public class SetRequestPDU extends VarBindPDU
{
    public static final int TAG = 3;

    public SetRequestPDU()
    {
        super();
    }

    public SetRequestPDU(DERTaggedObject val)
    {
        this();
        this.decode(val);
    }

    protected int _tag()
    {
        return TAG;
    }
}
