package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.math.BigInteger;

import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.DERApplicationSpecific;

/**
 * A 64bit SNMP counter
 */
public class Counter64 implements ASN1Encodable, Counter
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
    public long getUnsignedLongValue()
    {
        return this.value.longValue();
    }

    @Override
    public long getLongValue()
    {
        return this.value.longValue() & 0x7FFFFFFFFFFFFFFFL;
    }

    @Override
    public BigInteger getBigIntValue()
    {
        return this.value;
    }

    @Override
    public ASN1Primitive toASN1Primitive()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new ASN1Integer(this.value));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static Counter64 fromApplicationSpecific(ASN1ApplicationSpecific app) throws IOException
    {
        ASN1Integer i = (ASN1Integer) app.getObject(BERTags.INTEGER);
        return new Counter64(i.getValue());
    }

    public String toString()
    {
        return String.valueOf(this.value);
    }
}
