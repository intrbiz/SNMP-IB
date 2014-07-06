package com.intrbiz.snmp.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;


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
        try (BEROutputStream aout = new BEROutputStream(out))
        {
            DEREncodable obj = this.encode();
            aout.writeObject(obj);
        }
    }
    
    public abstract DEREncodable encode() throws IOException;
    
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

    public abstract void decode(DERObject seq) throws IOException;
}
