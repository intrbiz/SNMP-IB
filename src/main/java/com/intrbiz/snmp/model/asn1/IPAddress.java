package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.net.InetAddress;

import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTags;

/**
 * An IPv4 Address
 */
public class IPAddress implements DEREncodable
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
    public DERObject getDERObject()
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

    public static IPAddress fromApplicationSpecific(DERApplicationSpecific app) throws IOException
    {
        DEROctetString addr = (DEROctetString) app.getObject(DERTags.OCTET_STRING);
        return new IPAddress(InetAddress.getByAddress(addr.getOctets()));
    }

    public String toString()
    {
        return this.value.getHostAddress();
    }
}
