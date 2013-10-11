package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.math.BigInteger;

import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTags;

public class Counter64 implements DEREncodable
{
    public static final int APPLICATION_TAG = 6;

    private BigInteger value;

    public Counter64()
    {
        super();
    }

    public Counter64(BigInteger value)
    {
        super();
        this.value = value;
    }

    public BigInteger getValue()
    {
        return value;
    }

    public void setValue(BigInteger value)
    {
        this.value = value;
    }

    @Override
    public DERObject getDERObject()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new DERInteger(this.value));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static Counter64 fromApplicationSpecific(DERApplicationSpecific app) throws IOException
    {
        DERInteger i = (DERInteger) app.getObject(DERTags.INTEGER);
        return new Counter64(i.getValue());
    }

    public String toString()
    {
        return String.valueOf(this.value);
    }
}
