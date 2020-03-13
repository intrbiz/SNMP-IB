package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.model.PDU;
import com.intrbiz.snmp.util.SNMPRequestIDManager;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * A generic V1 and V2 PDU which is the basis for all V1 and V2 PDUs except for the V1 trap PDU
 */
public abstract class GenericPDU extends PDU
{
    protected int requestId   = SNMPRequestIDManager.getInstance().nextId();

    protected int errorStatus = 0;

    protected int errorIndex  = 0;

    public GenericPDU()
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

    public ErrorStatus getErrorStatus()
    {
        return ErrorStatus.valueOf(this.errorStatus);
    }

    public void setErrorStatus(ErrorStatus errorStatus)
    {
        this.errorStatus = errorStatus.getCode();
    }

    public int getErrorIndex()
    {
        return errorIndex;
    }

    public void setErrorIndex(int errorIndex)
    {
        this.errorIndex = errorIndex;
    }

    public ASN1TaggedObject encode()
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

    public void decode(ASN1TaggedObject val)
    {
        ASN1Sequence seq  = SNMPUtil.getSequence(val);
        this.requestId   = SNMPUtil.decodeInt(seq, 0);
        this.errorStatus = SNMPUtil.decodeInt(seq, 1);
        this.errorIndex  = SNMPUtil.decodeInt(seq, 2);
        this._decode(seq);
    }
    
    protected void _decode(ASN1Sequence seq)
    {
    }
}
