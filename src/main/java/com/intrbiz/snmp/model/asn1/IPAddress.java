package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.net.InetAddress;

import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;

/**
 * An IPv4 Address
 */
public class IPAddress implements ASN1Encodable
{
    public static final int APPLICATION_TAG = 0;

    private InetAddress value;

    public IPAddress()
    {
        super();
    }

    public IPAddress(InetAddress value)
    {
        super();
        this.value = value;
    }

    public InetAddress getValue()
    {
        return value;
    }

    public void setValue(InetAddress value)
    {
        this.value = value;
    }

    @Override
    public ASN1Primitive toASN1Primitive()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new DEROctetString(value.getAddress()));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static IPAddress fromApplicationSpecific(ASN1ApplicationSpecific app) throws IOException
    {
        DEROctetString addr = (DEROctetString) app.getObject(BERTags.OCTET_STRING);
        return new IPAddress(InetAddress.getByAddress(addr.getOctets()));
    }

    public String toString()
    {
        return this.value.getHostAddress();
    }
}
