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

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPVersion;

public abstract class SNMPMessage
{
    private byte[] decodedFrom;
    
    protected SNMPContext<?> context;
    
    protected Object userContext;
    
    protected SNMPMessage()
    {
        super();
    }

    public SNMPMessage(byte[] data, SNMPContextResolver res) throws IOException
    {
        super();
        this.decodeFromBytes(data, res);
    }
    
    public SNMPContext<?> getSNMPContext()
    {
        return this.context;
    }
    
    protected void setSNMPContext(SNMPContext<?> context)
    {
        this.context = context;
    }
    
    public byte[] getDecodedFrom()
    {
        return this.decodedFrom;
    }

    public abstract SNMPVersion getVersion();
    
    public abstract <T extends PDU> T getPdu();
    
    public abstract int getId();
    
    /**
     * Get the user context which is related to this message
     */
    public Object getUserContext()
    {
        return this.userContext;
    }
    
    /**
     * Set the user context which is related to this message
     */
    public void setUserContext(Object userContext)
    {
        this.userContext = userContext;
    }
    
    // encode
    
    public byte[] encodeToBytes(SNMPContext<?> context) throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.encodeToStream(out, context);
        return out.toByteArray();
    }

    public void encodeToStream(OutputStream out, SNMPContext<?> context) throws IOException
    {
        ASN1OutputStream aout = ASN1OutputStream.create(out, ASN1Encoding.DER);
        try
        {
            ASN1Encodable obj = this.encode(context);
            aout.writeObject(obj);
        }
        finally
        {
            aout.close();
        }
    }
    
    public abstract ASN1Encodable encode(SNMPContext<?> context) throws IOException;
    
    // decode

    public void decodeFromBytes(byte[] in, SNMPContextResolver res) throws IOException
    {
        this.decodedFrom = in;
        this.decodeFromStream(new ByteArrayInputStream(in, 0, in.length), res);
    }

    public void decodeFromBytes(byte[] in, int offset, int len, SNMPContextResolver res) throws IOException
    {
        this.decodedFrom = new byte[len];
        System.arraycopy(in, offset, decodedFrom, 0, len);
        this.decodeFromStream(new ByteArrayInputStream(in, offset, len), res);
    }

    protected void decodeFromStream(InputStream in, SNMPContextResolver res) throws IOException
    {
        try (ASN1InputStream ain = new ASN1InputStream(in))
        {
            this.decode(ain.readObject(), res);
        }
    }

    public abstract void decode(ASN1Primitive seq, SNMPContextResolver res) throws IOException;
}
