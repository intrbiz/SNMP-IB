package com.intrbiz.snmp.model.asn1;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.DERApplicationSpecific;

public class Gauge32 implements ASN1Encodable
{
    public static final int APPLICATION_TAG = 2;

    private long value;

    public Gauge32()
    {
        super();
    }

    public Gauge32(long value)
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

    public static Gauge32 fromApplicationSpecific(ASN1ApplicationSpecific app) throws IOException
    {
        ASN1Integer i = (ASN1Integer) app.getObject(BERTags.INTEGER);
        return new Gauge32(i.getValue().longValue());
    }
    
    public String toString()
    {
        return String.valueOf(this.value);
    }
}
