package com.intrbiz.snmp.model.v2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.util.SNMPUtil;

public abstract class VarBindPDU extends GenericPDU implements Iterable<VarBind>
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
    
    public VarBind get(String OID)
    {
        return this.getVarBind(OID);
    }
    
    public VarBind getPrefix(String OIDPrefix)
    {
        for (VarBind vb : this.varBinds)
        {
            if (vb.getObjectName().startsWith(OIDPrefix))
                return vb;
        }
        return null;
    }
    
    public boolean containsPrefix(String OIDPrefix)
    {
        return this.getPrefix(OIDPrefix) != null;
    }
    
    public boolean contains(String OID)
    {
        return this.get(OID) != null;
    }
    
    public VarBind get()
    {
        if (this.varBinds.size() > 0) return this.varBinds.get(0);
        return null;
    }
    
    public VarBind index(int index)
    {
        return this.varBinds.get(index);
    }
    
    public int size()
    {
        return this.varBinds.size();
    }
    
    @Override
    public Iterator<VarBind> iterator()
    {
        return this.varBinds.iterator();
    }

    @Override
    protected void _encode(ASN1EncodableVector vec)
    {
        ASN1EncodableVector vbvec = new ASN1EncodableVector();
        for (VarBind vb : this.varBinds)
        {
            vbvec.add(vb.encode());
        }
        vec.add(new DERSequence(vbvec));
    }

    @Override
    protected void _decode(DERSequence seq)
    {
        DERSequence binds = SNMPUtil.getSequence(seq, 3);
        Enumeration<?> objs = binds.getObjects();
        while (objs.hasMoreElements())
        {
            VarBind vb = new VarBind();
            vb.decode((DERSequence) objs.nextElement());
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
