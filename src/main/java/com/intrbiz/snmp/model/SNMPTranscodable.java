package com.intrbiz.snmp.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;


public abstract class SNMPTranscodable
{
    private byte[] decodedFrom;
    
    public SNMPTranscodable()
    {
        super();
    }
    
    public SNMPTranscodable(byte[] data) throws IOException
    {
        super();
        this.decodeFromBytes(data);
    }
    
    public byte[] getDecodedFrom()
    {
        return this.decodedFrom;
    }
    
    // encode
    
    public byte[] encodeToBytes() throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.encodeToStream(out);
        return out.toByteArray();
    }

    public void encodeToStream(OutputStream out) throws IOException
    {
        ASN1OutputStream aout = ASN1OutputStream.create(out, ASN1Encoding.DER);
        try
        {
            ASN1Encodable obj = this.encode();
            aout.writeObject(obj);
        }
        finally
        {
            aout.close();
        }
    }
    
    public abstract ASN1Encodable encode() throws IOException;
    
    // decode

    public void decodeFromBytes(byte[] in) throws IOException
    {
        this.decodedFrom = in;
        this.decodeFromStream(new ByteArrayInputStream(in, 0, in.length));
    }

    public void decodeFromBytes(byte[] in, int offset, int len) throws IOException
    {
        this.decodedFrom = new byte[len];
        System.arraycopy(in, offset, decodedFrom, 0, len);
        this.decodeFromStream(new ByteArrayInputStream(in, offset, len));
    }

    protected void decodeFromStream(InputStream in) throws IOException
    {
        try (ASN1InputStream ain = new ASN1InputStream(in))
        {
            this.decode(ain.readObject());
        }
    }

    public abstract void decode(ASN1Primitive seq) throws IOException;
}
