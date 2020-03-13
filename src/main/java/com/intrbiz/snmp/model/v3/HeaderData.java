package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.model.SNMPTranscodable;
import com.intrbiz.snmp.util.SNMPRequestIDManager;
import com.intrbiz.snmp.util.SNMPUtil;

public class HeaderData extends SNMPTranscodable
{
    public static byte FLAG_AUTH   = 0x01;
    public static byte FLAG_PRIV   = 0x02;
    public static byte FLAG_REPORT = 0x04;
    
    public static int DEFAULT_MAX_MESSAGE_SIZE = 1500;
    
    private int id;

    private int maxSize;

    private byte flags;

    private int securityModel;

    public HeaderData()
    {
        super();
        this.id = SNMPRequestIDManager.getInstance().nextId();
        this.maxSize = DEFAULT_MAX_MESSAGE_SIZE;
        this.flags = FLAG_REPORT;
        this.securityModel = USMSecurityParameters.SECURITY_MODEL;
    }

    public HeaderData(byte[] data) throws IOException
    {
        super(data);
    }

    public HeaderData(ASN1Primitive obj)
    {
        super();
        this.decode(obj);
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
        return (this.flags & FLAG_AUTH) != 0;
    }
    
    public void setAuth()
    {
        this.flags = (byte) (this.flags | FLAG_AUTH);
    }

    public boolean isPriv()
    {
        return (this.flags & FLAG_PRIV) != 0;
    }
    
    public void setPriv()
    {
        this.flags = (byte) (this.flags | FLAG_PRIV);
    }

    public boolean isReportable()
    {
        return (this.flags & FLAG_REPORT) != 0;
    }
    
    public void setReportable()
    {
        this.flags = (byte) (this.flags | FLAG_REPORT);
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
    
    public boolean isUserSecurityModel()
    {
        return this.securityModel == USMSecurityParameters.SECURITY_MODEL;
    }

    public ASN1Encodable encode()
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new ASN1Integer(this.id));
        vec.add(new ASN1Integer(this.maxSize));
        vec.add(SNMPUtil.encodeSingleByteString(this.flags));
        vec.add(new ASN1Integer(this.securityModel));
        return new DERSequence(vec);
    }

    public void decode(ASN1Primitive obj)
    {
        ASN1Sequence seq = (ASN1Sequence) obj;
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
