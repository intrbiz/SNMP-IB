package com.intrbiz.snmp.model.v2;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.util.SNMPUtil;

public abstract class VarBindPDU extends PDU
{
    protected List<VarBind> varBinds = new LinkedList<VarBind>();

    public VarBindPDU()
    {
        super();
    }

    public List<VarBind> getVarBinds()
    {
        return varBinds;
    }

    public void setVarBinds(List<VarBind> varBinds)
    {
        this.varBinds = varBinds;
    }
    
    public void addVarBind(VarBind vb)
    {
        this.varBinds.add(vb);
    }
    
    public void addVarBind(String oid, DEREncodable val)
    {
        this.addVarBind(new VarBind(oid, val));
    }
    
    public void addVarBind(String oid)
    {
        this.addVarBind(new VarBind(oid, new DERNull()));
    }
    
    public void addVarBind(String oid, String val)
    {
        this.addVarBind(new VarBind(oid, val));
    }
    
    public void addVarBind(String oid, int val)
    {
        this.addVarBind(new VarBind(oid, val));
    }
    
    public VarBind getVarBind(String OID)
    {
        for (VarBind vb : this.varBinds)
        {
            if (OID.equals(vb.getObjectName()))
                return vb;
        }
        return null;
    }
    
    @Override
    protected void _encode(ASN1EncodableVector vec, SNMPContext ctx)
    {
        ASN1EncodableVector vbvec = new ASN1EncodableVector();
        for (VarBind vb : this.varBinds)
        {
            vbvec.add(vb.encode(ctx));
        }
        vec.add(new DERSequence(vbvec));
    }

    @Override
    protected void _decode(DERSequence seq, SNMPContext ctx)
    {
        DERSequence binds = SNMPUtil.getSequence(seq, 3);
        Enumeration<?> objs = binds.getObjects();
        while (objs.hasMoreElements())
        {
            VarBind vb = new VarBind();
            vb.decode((DERSequence) objs.nextElement(), ctx);
            this.varBinds.add(vb);
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(" " + this.getClass().getSimpleName() + "[\n");
        sb.append("  requestId: ").append(Integer.toHexString(this.requestId)).append(";\n");
        sb.append("  errorStatus: ").append(this.errorStatus).append(";\n");
        sb.append("  errorIndex: ").append(this.errorIndex).append(";\n");
        for (VarBind vb : this.varBinds)
        {
            sb.append("  ").append(vb.toString()).append("\n");
        }
        sb.append(" ]");
        return sb.toString();
    }
}
