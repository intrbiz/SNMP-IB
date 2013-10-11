package com.intrbiz.snmp.model.v2;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.util.SNMPUtil;

public class SNMPMessageV2 extends SNMPMessage
{
    private SNMPVersion version;

    private String community;

    private PDU pdu;

    public SNMPMessageV2()
    {
        super();
        this.version = SNMPVersion.V2C;
    }

    public SNMPMessageV2(SNMPVersion version, String community, PDU pdu)
    {
        super();
        this.version = version;
        this.community = community;
        this.pdu = pdu;
    }

    public SNMPMessageV2(byte[] data, SNMPContext ctx) throws IOException
    {
        super(data, ctx);
    }

    @Override
    public SNMPVersion getVersion()
    {
        return version;
    }

    public void setVersion(SNMPVersion version)
    {
        this.version = version;
    }

    public String getCommunity()
    {
        return community;
    }

    public void setCommunity(String community)
    {
        this.community = community;
    }

    @Override
    public PDU getPdu()
    {
        return pdu;
    }

    public void setPdu(PDU pdu)
    {
        this.pdu = pdu;
    }
    
    @Override
    public int getId()
    {
        return this.pdu.getRequestId();
    }

    @Override
    public DEREncodable encode(SNMPContext ctx)
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new DERInteger(this.version.getTag()));
        vec.add(SNMPUtil.encodeString(this.community));
        vec.add(this.pdu.encode(ctx));
        return new DERSequence(vec);
    }

    @Override
    public void decode(DERObject obj, SNMPContext ctx)
    {
        DERSequence seq = (DERSequence) obj;
        this.version = SNMPVersion.fromTag(SNMPUtil.decodeInt(seq, 0));
        this.community = SNMPUtil.decodeString(seq, 1);
        // decode the PDU
        DERTaggedObject pduObj = SNMPUtil.getTaggedObject(seq, 2);
        this.pdu = PDU.newPdu(pduObj.getTagNo());
        this.pdu.decode(pduObj, ctx);
    }

    public String toString()
    {
        return "SNMPMessage[\n" + " version: " + this.version + ";\n" + " community: " + this.community + ";\n" + this.pdu + "\n" + "]";
    }
}
