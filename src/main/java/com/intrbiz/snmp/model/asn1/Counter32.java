package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;

import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTags;

/**
 * A 32bit SNMP counter
 */
public class Counter32 implements DEREncodable, Counter
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
    public DERObject getDERObject()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new DERInteger((int) this.value));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static Counter32 fromApplicationSpecific(DERApplicationSpecific app) throws IOException
    {
        DERInteger i = (DERInteger) app.getObject(DERTags.INTEGER);
        return new Counter32(i.getValue().longValue());
    }

    public String toString()
    {
        return String.valueOf(this.value);
    }
}
