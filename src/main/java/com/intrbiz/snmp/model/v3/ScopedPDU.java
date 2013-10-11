package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPTranscodable;
import com.intrbiz.snmp.model.v2.PDU;
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

    public ScopedPDU(byte[] data, SNMPContext ctx) throws IOException
    {
        super(data, ctx);
    }
    
    public ScopedPDU(DERObject obj, SNMPContext ctx) throws IOException
    {
        super();
        this.decode(obj, ctx);
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

    public DEREncodable encode(SNMPContext ctx) throws IOException
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(SNMPUtil.encodeByteString(this.contextEngineId));
        vec.add(SNMPUtil.encodeString(this.contextName));
        vec.add(this.pdu.encode(ctx));
        return new DERSequence(vec);
    }

    public void decode(DERObject obj, SNMPContext ctx) throws IOException
    {
        DERSequence seq = (DERSequence) obj;
        this.contextEngineId = SNMPUtil.decodeByteString(seq, 0);
        this.contextName = SNMPUtil.decodeString(seq, 1);
        // decode the PDU
        DERTaggedObject pduObj = SNMPUtil.getTaggedObject(seq, 2);
        this.pdu = PDU.newPdu(pduObj.getTagNo());
        if (this.pdu != null) this.pdu.decode(pduObj, ctx);
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
