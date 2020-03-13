package com.intrbiz.snmp.model;

import org.bouncycastle.asn1.ASN1TaggedObject;

import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.v1.TrapPDUV1;
import com.intrbiz.snmp.model.v2.GetBulkRequestPDU;
import com.intrbiz.snmp.model.v2.GetNextRequestPDU;
import com.intrbiz.snmp.model.v2.GetRequestPDU;
import com.intrbiz.snmp.model.v2.GetResponsePDU;
import com.intrbiz.snmp.model.v2.InformPDU;
import com.intrbiz.snmp.model.v2.SetRequestPDU;
import com.intrbiz.snmp.model.v2.TrapPDU;
import com.intrbiz.snmp.model.v3.ReportPDU;

public abstract class PDU
{
    public PDU()
    {
        super();
    }

    public abstract ASN1TaggedObject encode();
    
    protected abstract int _tag();
    
    public abstract void decode(ASN1TaggedObject val);
    
    public abstract int getRequestId();
    
    // util
    
    public static PDU newPdu(SNMPVersion version, int tag)
    {
        switch (tag)
        {
            case GetRequestPDU.TAG:     return new GetRequestPDU();
            case GetNextRequestPDU.TAG: return new GetNextRequestPDU();
            case GetResponsePDU.TAG:    return new GetResponsePDU();
            case SetRequestPDU.TAG:     return new SetRequestPDU();
            case TrapPDUV1.TAG:         return new TrapPDUV1();
            case GetBulkRequestPDU.TAG: return new GetBulkRequestPDU();
            case InformPDU.TAG:         return new InformPDU();
            case TrapPDU.TAG:           return new TrapPDU();
            case ReportPDU.TAG:         return new ReportPDU();
            default:                    throw new RuntimeException("Unknown PDU tag: " + tag);
        }
    }
}
