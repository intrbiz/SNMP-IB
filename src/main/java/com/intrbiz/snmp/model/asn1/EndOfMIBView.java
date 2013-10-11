package com.intrbiz.snmp.model.asn1;

import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class EndOfMIBView implements DEREncodable
{
    public static int TAG = 2;
    
    public EndOfMIBView()
    {
        super();
    }

    @Override
    public DERObject getDERObject()
    {
        return new DERTaggedObject(false, TAG, new DERSequence());
    }
}
