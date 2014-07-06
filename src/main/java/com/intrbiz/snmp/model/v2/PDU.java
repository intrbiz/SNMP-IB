package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.model.v3.ReportPDU;
import com.intrbiz.snmp.util.SNMPRequestIDManager;
import com.intrbiz.snmp.util.SNMPUtil;

public abstract class PDU
{
    protected int requestId   = SNMPRequestIDManager.getInstance().nextId();

    protected int errorStatus = 0;

    protected int errorIndex  = 0;

    public PDU()
    {
        super();
    }

    public int getRequestId()
    {
        return requestId;
    }

    public void setRequestId(int requestId)
    {
        this.requestId = requestId;
    }

    public int getErrorStatus()
    {
        return errorStatus;
    }

    public void setErrorStatus(int errorStatus)
    {
        this.errorStatus = errorStatus;
    }

    public int getErrorIndex()
    {
        return errorIndex;
    }

    public void setErrorIndex(int errorIndex)
    {
        this.errorIndex = errorIndex;
    }

    public DERTaggedObject encode()
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new ASN1Integer(this.requestId));
        vec.add(new ASN1Integer(this.errorStatus));
        vec.add(new ASN1Integer(this.errorIndex));
        this._encode(vec);
        return new DERTaggedObject(false, this._tag(), new DERSequence(vec));
    }
    
    protected abstract int _tag();
    
    protected void _encode(ASN1EncodableVector vec)
    {
    }

    public void decode(DERTaggedObject val)
    {
        DERSequence seq  = SNMPUtil.getSequence(val);
        this.requestId   = SNMPUtil.decodeInt(seq, 0);
        this.errorStatus = SNMPUtil.decodeInt(seq, 1);
        this.errorIndex  = SNMPUtil.decodeInt(seq, 2);
        this._decode(seq);
    }
    
    protected void _decode(DERSequence seq)
    {
    }
    
    public static PDU newPdu(int tag)
    {
        switch (tag)
        {
            case GetRequestPDU.TAG:     return new GetRequestPDU();
            case GetNextRequestPDU.TAG: return new GetNextRequestPDU();
            case GetResponsePDU.TAG:    return new GetResponsePDU();
            case SetRequestPDU.TAG:     return new SetRequestPDU();
            case GetBulkRequestPDU.TAG: return new GetBulkRequestPDU();
            case ReportPDU.TAG:         return new ReportPDU();
            default:                    return null;
        }
    }
}
