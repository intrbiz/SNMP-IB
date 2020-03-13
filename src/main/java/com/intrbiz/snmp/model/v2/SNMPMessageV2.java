package com.intrbiz.snmp.model.v2;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.PDU;
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

    public SNMPMessageV2(byte[] data, SNMPContextResolver res) throws IOException
    {
        super(data, res);
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
    @SuppressWarnings("unchecked")
    public <T extends PDU> T getPdu()
    {
        return (T) pdu;
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
    public ASN1Encodable encode(SNMPContext<?> ctx)
    {
        this.context = ctx;
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new ASN1Integer(this.version.getTag()));
        vec.add(SNMPUtil.encodeString(this.community));
        vec.add(this.pdu.encode());
        return new DERSequence(vec);
    }

    @Override
    public void decode(ASN1Primitive obj, SNMPContextResolver res) throws IOException
    {
        // decode
        ASN1Sequence seq = (ASN1Sequence) obj;
        this.version = SNMPVersion.fromTag(SNMPUtil.decodeInt(seq, 0));
        this.community = SNMPUtil.decodeString(seq, 1);
        // decode the PDU
        ASN1TaggedObject pduObj = SNMPUtil.getTaggedObject(seq, 2);
        this.pdu = PDU.newPdu(this.version, pduObj.getTagNo());
        this.pdu.decode(pduObj);
        // load the context
        this.context = res.lookupContext(this.getId(), null);
        if (this.context == null) throw new IOException("Failed to resolve SNMP V2c context, cannot continue to decode the message");
    }

    public String toString()
    {
        return "SNMPMessage[\n" + " version: " + this.version + ";\n" + " community: " + this.community + ";\n" + this.pdu + "\n" + "]";
    }
}
