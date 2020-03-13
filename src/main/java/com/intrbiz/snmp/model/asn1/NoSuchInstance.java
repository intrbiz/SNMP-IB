package com.intrbiz.snmp.model.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class NoSuchInstance implements ASN1Encodable
{
    public static int TAG = 1;
    
    public NoSuchInstance()
    {
        super();
    }

    @Override
    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(false, TAG, new DERSequence());
    }
}
