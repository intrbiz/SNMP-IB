package com.intrbiz.snmp.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.asn1.ASNByteBuffer;
import com.intrbiz.snmp.model.asn1.Counter32;
import com.intrbiz.snmp.model.asn1.Counter64;
import com.intrbiz.snmp.model.asn1.EndOfMIBView;
import com.intrbiz.snmp.model.asn1.Gauge32;
import com.intrbiz.snmp.model.asn1.NoSuchInstance;
import com.intrbiz.snmp.model.asn1.NoSuchObject;
import com.intrbiz.snmp.model.asn1.TimeTicks;

public class SNMPUtil
{
    public static final Charset ASCII = Charset.forName("ASCII");
    
    public static final Charset UTF8 = Charset.forName("UTF-8");

    // string

    public static String decodeString(DEROctetString oct)
    {
        return new String(oct.getOctets(), UTF8);
    }

    public static DEROctetString encodeString(String str)
    {
        byte[] octets = str.getBytes(UTF8);
        return new DEROctetString(octets);
    }

    // integer

    public static int decodeInt(DERInteger val)
    {
        return val.getValue().intValue();
    }

    // byte string

    public static byte decodeSingleByteString(DEROctetString str)
    {
        return str.getOctets()[0];
    }

    public static byte[] decodeByteString(DEROctetString str)
    {
        return str.getOctets();
    }

    public static DEROctetString encodeByteString(byte[] octets)
    {
        return new DEROctetString(octets);
    }

    public static DEROctetString encodeSingleByteString(byte octet)
    {
        return new DEROctetString(new byte[] { octet });
    }

    // sequence helpers

    public static String decodeString(DERSequence seq, int index)
    {
        return decodeString((DEROctetString) seq.getObjectAt(index));
    }

    public static int decodeInt(DERSequence seq, int index)
    {
        return decodeInt((DERInteger) seq.getObjectAt(index));
    }

    public static ASN1ObjectIdentifier decodeOid(DERSequence seq, int index)
    {
        return (ASN1ObjectIdentifier) seq.getObjectAt(index);
    }

    public static DEREncodable decodeValue(DERSequence seq, int index)
    {
        return seq.getObjectAt(index);
    }

    public static byte decodeSingleByteString(DERSequence seq, int index)
    {
        return decodeSingleByteString((DEROctetString) seq.getObjectAt(index));
    }

    public static byte[] decodeByteString(DERSequence seq, int index)
    {
        return decodeByteString((DEROctetString) seq.getObjectAt(index));
    }

    // object helpers

    public static DERSequence getSequence(DERTaggedObject obj)
    {
        return (DERSequence) obj.getObject();
    }

    public static DERSequence getSequence(DERSequence seq, int index)
    {
        return (DERSequence) seq.getObjectAt(index);
    }

    public static DERTaggedObject getTaggedObject(DERSequence seq, int index)
    {
        return (DERTaggedObject) seq.getObjectAt(index);
    }

    // app specific

    public static DEREncodable decodeApplicationSpecific(DEREncodable enc)
    {
        // TODO
        if (enc instanceof DERApplicationSpecific)
        {
            DERApplicationSpecific app = (DERApplicationSpecific) enc;
            try
            {
                     if (app.getApplicationTag() == TimeTicks.APPLICATION_TAG) return TimeTicks.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == Counter32.APPLICATION_TAG) return Counter32.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == Gauge32.APPLICATION_TAG)   return Gauge32.fromApplicationSpecific(app);
                else if (app.getApplicationTag() == Counter64.APPLICATION_TAG) return Counter64.fromApplicationSpecific(app);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else if (enc instanceof DERTaggedObject)
        {
            DERTaggedObject obj = (DERTaggedObject) enc;
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

    public static DERObject parse(byte[] data) throws IOException
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
