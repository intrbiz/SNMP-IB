package com.intrbiz.snmp.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;

import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.asn1.ASNByteBuffer;
import com.intrbiz.snmp.model.asn1.Counter32;
import com.intrbiz.snmp.model.asn1.Counter64;
import com.intrbiz.snmp.model.asn1.EndOfMIBView;
import com.intrbiz.snmp.model.asn1.Gauge32;
import com.intrbiz.snmp.model.asn1.IPAddress;
import com.intrbiz.snmp.model.asn1.NoSuchInstance;
import com.intrbiz.snmp.model.asn1.NoSuchObject;
import com.intrbiz.snmp.model.asn1.TimeTicks;

public class SNMPUtil
{
    public static final Charset ASCII = Charset.forName("ASCII");
    
    public static final Charset UTF8 = Charset.forName("UTF-8");

    // string

    public static String decodeString(ASN1OctetString oct)
    {
        return new String(oct.getOctets(), UTF8);
    }

    public static ASN1OctetString encodeString(String str)
    {
        byte[] octets = str.getBytes(UTF8);
        return new DEROctetString(octets);
    }

    // integer

    public static int decodeInt(ASN1Integer val)
    {
        return val.getValue().intValue();
    }

    // byte string

    public static byte decodeSingleByteString(ASN1OctetString str)
    {
        return str.getOctets()[0];
    }

    public static byte[] decodeByteString(ASN1OctetString str)
    {
        return str.getOctets();
    }

    public static ASN1OctetString encodeByteString(byte[] octets)
    {
        return new DEROctetString(octets);
    }

    public static ASN1OctetString encodeSingleByteString(byte octet)
    {
        return new DEROctetString(new byte[] { octet });
    }

    // sequence helpers

    public static String decodeString(ASN1Sequence seq, int index)
    {
        return decodeString((ASN1OctetString) seq.getObjectAt(index));
    }

    public static int decodeInt(ASN1Sequence seq, int index)
    {
        return decodeInt((ASN1Integer) seq.getObjectAt(index));
    }

    public static ASN1ObjectIdentifier decodeOid(ASN1Sequence seq, int index)
    {
        return (ASN1ObjectIdentifier) seq.getObjectAt(index);
    }

    public static ASN1Encodable decodeValue(ASN1Sequence seq, int index)
    {
        return seq.getObjectAt(index);
    }

    public static byte decodeSingleByteString(ASN1Sequence seq, int index)
    {
        return decodeSingleByteString((ASN1OctetString) seq.getObjectAt(index));
    }

    public static byte[] decodeByteString(ASN1Sequence seq, int index)
    {
        return decodeByteString((ASN1OctetString) seq.getObjectAt(index));
    }

    // object helpers

    public static ASN1Sequence getSequence(ASN1TaggedObject obj)
    {
        return (ASN1Sequence) obj.getObject();
    }

    public static ASN1Sequence getSequence(ASN1Sequence seq, int index)
    {
        return (ASN1Sequence) seq.getObjectAt(index);
    }

    public static ASN1TaggedObject getTaggedObject(ASN1Sequence seq, int index)
    {
        return (ASN1TaggedObject) seq.getObjectAt(index);
    }

    // app specific

    public static ASN1Encodable decodeApplicationSpecific(ASN1Encodable enc)
    {
        // TODO
        if (enc instanceof ASN1ApplicationSpecific)
        {
            ASN1ApplicationSpecific app = (ASN1ApplicationSpecific) enc;
            try
            {
                     if (app.getApplicationTag() == IPAddress.APPLICATION_TAG) return IPAddress.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == TimeTicks.APPLICATION_TAG) return TimeTicks.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == Counter32.APPLICATION_TAG) return Counter32.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == Gauge32.APPLICATION_TAG)   return Gauge32.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == Counter64.APPLICATION_TAG) return Counter64.fromApplicationSpecific(app);
            }
            catch (Exception e)
            {
                throw new RuntimeException("Failed to decode application specific entity", e);
            }
        }
        else if (enc instanceof ASN1TaggedObject)
        {
            ASN1TaggedObject obj = (ASN1TaggedObject) enc;
                 if (obj.getTagNo() == NoSuchObject.TAG)   return new NoSuchObject();
            else if (obj.getTagNo() == NoSuchInstance.TAG) return new NoSuchInstance();
            else if (obj.getTagNo() == EndOfMIBView.TAG)   return new EndOfMIBView();
        }
        return enc;
    }

    // number stuff

    public BigInteger fromLong(long value)
    {
        return null;
    }

    // parse

    public static ASN1Primitive parse(byte[] data) throws IOException
    {
        try (ASN1InputStream in = new ASN1InputStream(new ByteArrayInputStream(data)))
        {
            return in.readObject();
        }
    }

    // array
    
    public static byte[] cloneBytes(byte[] buffer)
    {
        byte[] ret = new byte[buffer.length];
        System.arraycopy(buffer, 0, ret, 0, buffer.length);
        return ret;
    }

    /*public static boolean byteReplace(byte[] buffer, byte[] pattern, byte[] replacement)
    {
        assert pattern.length == replacement.length;
        assert buffer.length > pattern.length;
        //
        outer: for (int i = 0; i < buffer.length; i++)
        {
            if (buffer[i] == pattern[0])
            {
                for (int j = 1; j < pattern.length; j++)
                {
                    if (buffer[i + j] != pattern[j]) continue outer;
                }
                // replace
                for (int j = 0; j < replacement.length; j++)
                {
                    buffer[i + j] = replacement[j];
                }
                return true;
            }
        }
        return false;
    }*/

    // dump

    public static String dumpArray(byte[] b)
    {
        StringBuilder sb = new StringBuilder("byte[" + b.length + "]={");
        for (int i = 0; i < b.length; i++)
        {
            if (i > 0) sb.append(",");
            sb.append("0x");
            if ((b[i] & 0xF0) == 0) sb.append("0");
            sb.append(Integer.toHexString(b[i] & 0xFF).toUpperCase());
        }
        sb.append("}");
        return sb.toString();
    }

    public static byte[] fromHex(String hex)
    {
        byte[] b = new byte[hex.length() / 2];
        for (int i = 0; i < b.length; i++)
        {
            b[i] = (byte) (Integer.parseInt(hex.substring((i * 2), (i * 2) + 2), 16) & 0xFF);
        }
        return b;
    }
    
    public static String toHex(byte[] b)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
        {
            if ((b[i] & 0xF0) == 0) sb.append("0");
            sb.append(Integer.toHexString(b[i] & 0xFF));
        }
        return sb.toString();
    }
    
    public static SNMPVersion peekVersion(byte[] message, int ofs, int lim)
    {
        ASNByteBuffer buffer = ASNByteBuffer.wrap(message, ofs, lim);
        buffer.nextASNSequence();
        buffer.nextASNInt();
        return SNMPVersion.fromTag(buffer.intValue());
    }
    
    public static void replaceAuthenticationHash(byte[] message, byte[] hash)
    {
        ASNByteBuffer b = ASNByteBuffer.wrap(message);
        b.nextASNSequence();
        b.nextASNInt();
        b.skip();
        b.nextASNSequence();
        b.skip();
        b.nextASNOctetString();
        ASNByteBuffer usm = b.asnValue();
        usm.nextASNSequence();
        usm.nextASNOctetString();
        usm.skip();
        usm.nextASNInt();
        usm.skip();
        usm.nextASNInt();
        usm.skip();
        usm.nextASNOctetString();
        usm.skip();
        usm.nextASNOctetString();
        // write the hash in
        usm.putBytes(hash);
    }
}
