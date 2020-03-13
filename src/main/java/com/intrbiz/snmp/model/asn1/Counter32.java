package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;

import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.DERApplicationSpecific;

/**
 * A 32bit SNMP counter
 */
public class Counter32 implements ASN1Encodable, Counter
{
    public static final int APPLICATION_TAG = 1;

    private long value;

    public Counter32()
    {
        super();
    }

    public Counter32(long value)
    {
        super();
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }

    public void setValue(long value)
    {
        this.value = value;
    }

    @Override
    public long getUnsignedLongValue()
    {
        return this.value;
    }

    @Override
    public long getLongValue()
    {
        return this.value & 0x7FFFFFFFFFFFFFFFL;
    }

    @Override
    public BigInteger getBigIntValue()
    {
        byte[] b = new byte[8];
        ByteBuffer.wrap(b).putLong(this.value);
        return new BigInteger(b);
    }

    @Override
    public ASN1Primitive toASN1Primitive()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new ASN1Integer((int) this.value));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static Counter32 fromApplicationSpecific(ASN1ApplicationSpecific app) throws IOException
    {
        ASN1Integer i = (ASN1Integer) app.getObject(BERTags.INTEGER);
        return new Counter32(i.getValue().longValue());
    }

    public String toString()
    {
        return String.valueOf(this.value);
    }
}
