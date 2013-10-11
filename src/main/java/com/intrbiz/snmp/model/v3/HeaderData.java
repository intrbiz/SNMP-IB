package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPTranscodable;
import com.intrbiz.snmp.util.SNMPRequestIDManager;
import com.intrbiz.snmp.util.SNMPUtil;

public class HeaderData extends SNMPTranscodable
{
    private int id;

    private int maxSize;

    private byte flags;

    private int securityModel;

    public HeaderData()
    {
        super();
        this.id = SNMPRequestIDManager.getInstance().nextId();
        this.maxSize = 1500;
        this.flags = 0x03;
        this.securityModel = 3;
    }

    public HeaderData(byte[] data, SNMPContext ctx) throws IOException
    {
        super(data, ctx);
    }

    public HeaderData(DERObject obj, SNMPContext ctx)
    {
        super();
        this.decode(obj, ctx);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getMaxSize()
    {
        return maxSize;
    }

    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }

    public byte getFlags()
    {
        return flags;
    }

    public boolean isAuth()
    {
        return (this.flags & 0x01) != 0;
    }
    
    public void setAuth()
    {
        this.flags = (byte) (this.flags | 0x01);
    }

    public boolean isPriv()
    {
        return (this.flags & 0x02) != 0;
    }
    
    public void setPriv()
    {
        this.flags = (byte) (this.flags | 0x02);
    }

    public boolean isReportable()
    {
        return (this.flags & 0x04) != 0;
    }
    
    public void setReportable()
    {
        this.flags = (byte) (this.flags | 0x04);
    }

    public void setFlags(byte flags)
    {
        this.flags = flags;
    }

    public int getSecurityModel()
    {
        return securityModel;
    }

    public void setSecurityModel(int securityModel)
    {
        this.securityModel = securityModel;
    }

    public DEREncodable encode(SNMPContext ctx)
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new DERInteger(this.id));
        vec.add(new DERInteger(this.maxSize));
        vec.add(SNMPUtil.encodeSingleByteString(this.flags));
        vec.add(new DERInteger(this.securityModel));
        return new DERSequence(vec);
    }

    public void decode(DERObject obj, SNMPContext ctx)
    {
        DERSequence seq = (DERSequence) obj;
        this.id = SNMPUtil.decodeInt(seq, 0);
        this.maxSize = SNMPUtil.decodeInt(seq, 1);
        this.flags = SNMPUtil.decodeSingleByteString(seq, 2);
        this.securityModel = SNMPUtil.decodeInt(seq, 3);
    }

    public String toString()
    {
        return " HeaderData[\n" + "  id: " + Integer.toHexString(this.id) + ";\n" + "  maxSize: " + this.maxSize + ";\n" + "  flags: " + this.flags + ";\n" + "  securityModel: " + this.securityModel + ";\n" + " ]";
    }
}
