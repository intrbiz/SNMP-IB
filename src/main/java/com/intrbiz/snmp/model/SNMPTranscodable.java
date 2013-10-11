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

import com.intrbiz.snmp.SNMPContext;


public abstract class SNMPTranscodable
{
    private byte[] decodedFrom;
    
    public SNMPTranscodable()
    {
        super();
    }
    
    public SNMPTranscodable(byte[] data, SNMPContext ctx) throws IOException
    {
        super();
        this.decodeFromBytes(data, ctx);
    }
    
    public byte[] getDecodedFrom()
    {
        return this.decodedFrom;
    }
    
    public byte[] encodeToBytes(SNMPContext ctx) throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.encodeToStream(out, ctx);
        return out.toByteArray();
    }

    protected void encodeToStream(OutputStream out, SNMPContext ctx) throws IOException
    {
        try (BEROutputStream aout = new BEROutputStream(out))
        {
            DEREncodable obj = this.encode(ctx);
            aout.writeObject(obj);
        }
    }

    public void decodeFromBytes(byte[] in, SNMPContext ctx) throws IOException
    {
        this.decodedFrom = in;
        this.decodeFromStream(new ByteArrayInputStream(in, 0, in.length), ctx);
    }

    public void decodeFromBytes(byte[] in, int offset, int len, SNMPContext ctx) throws IOException
    {
        this.decodedFrom = new byte[len];
        System.arraycopy(in, offset, decodedFrom, 0, len);
        this.decodeFromStream(new ByteArrayInputStream(in, offset, len), ctx);
    }

    protected void decodeFromStream(InputStream in, SNMPContext ctx) throws IOException
    {
        try (ASN1InputStream ain = new ASN1InputStream(in))
        {
            this.decode(ain.readObject(), ctx);
        }
    }
    
    public abstract DEREncodable encode(SNMPContext ctx) throws IOException;

    public abstract void decode(DERObject seq, SNMPContext ctx) throws IOException;
}
