package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.PDU;
import com.intrbiz.snmp.model.SNMPTranscodable;
import com.intrbiz.snmp.util.SNMPUtil;

public class ScopedPDU extends SNMPTranscodable
{
    private byte[] contextEngineId;

    private String contextName;

    private PDU pdu;

    public ScopedPDU()
    {
        super();
        this.contextName = "";
    }

    public ScopedPDU(byte[] data) throws IOException
    {
        super(data);
    }
    
    public ScopedPDU(ASN1Primitive obj) throws IOException
    {
        super();
        this.decode(obj);
    }

    public byte[] getContextEngineId()
    {
        return contextEngineId;
    }

    public void setContextEngineId(byte[] contextEngineId)
    {
        this.contextEngineId = contextEngineId;
    }

    public String getContextName()
    {
        return contextName;
    }

    public void setContextName(String contextName)
    {
        this.contextName = contextName;
    }

    public PDU getPdu()
    {
        return pdu;
    }

    public void setPdu(PDU pdu)
    {
        this.pdu = pdu;
    }

    public ASN1Encodable encode() throws IOException
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(SNMPUtil.encodeByteString(this.contextEngineId));
        vec.add(SNMPUtil.encodeString(this.contextName));
        vec.add(this.pdu.encode());
        return new DERSequence(vec);
    }

    public void decode(ASN1Primitive obj) throws IOException
    {
        ASN1Sequence seq = (ASN1Sequence) obj;
        this.contextEngineId = SNMPUtil.decodeByteString(seq, 0);
        this.contextName = SNMPUtil.decodeString(seq, 1);
        // decode the PDU
        ASN1TaggedObject pduObj = SNMPUtil.getTaggedObject(seq, 2);
        this.pdu = PDU.newPdu(SNMPVersion.V3, pduObj.getTagNo());
        if (this.pdu != null) this.pdu.decode(pduObj);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder(" ScoppedPDU[\n");
        sb.append("  contextEngineId: ").append(SNMPUtil.dumpArray(this.contextEngineId)).append(";\n");
        sb.append("  contextName: ").append(this.contextName).append(";\n");
        sb.append("  ").append(this.pdu).append(";\n");
        sb.append(" ]");
        return sb.toString();
    }
}
