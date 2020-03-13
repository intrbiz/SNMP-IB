package com.intrbiz.snmp.model.v1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.model.PDU;
import com.intrbiz.snmp.model.asn1.IPAddress;
import com.intrbiz.snmp.model.asn1.TimeTicks;
import com.intrbiz.snmp.model.v2.VarBind;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * SNMP V1 has a different Trap PDU than V2
 */
public class TrapPDUV1 extends PDU implements Iterable<VarBind>
{
    public static final int TAG = 4;
    
    private String enterprise;

    private IPAddress agentAddr;

    private GenericTrap genericTrap;

    private int specificTrap;

    private TimeTicks timestamp;

    protected List<VarBind> varBinds = new LinkedList<VarBind>();

    public TrapPDUV1()
    {
        super();
    }

    public TrapPDUV1(DERTaggedObject val)
    {
        this();
        this.decode(val);
    }

    protected int _tag()
    {
        return TAG;
    }

    public ASN1TaggedObject encode()
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new ASN1ObjectIdentifier(this.enterprise));
        vec.add(this.agentAddr.toASN1Primitive());
        vec.add(new ASN1Integer(this.genericTrap.ordinal()));
        vec.add(new ASN1Integer(this.specificTrap));
        vec.add(this.timestamp.toASN1Primitive());
        ASN1EncodableVector vbvec = new ASN1EncodableVector();
        for (VarBind vb : this.varBinds)
        {
            vbvec.add(vb.encode());
        }
        return new DERTaggedObject(false, this._tag(), new DERSequence(vec));
    }

    public void decode(ASN1TaggedObject val)
    {
        ASN1Sequence seq = SNMPUtil.getSequence(val);
        this.enterprise = SNMPUtil.decodeOid(seq, 0).getId();
        this.agentAddr = (IPAddress) SNMPUtil.decodeApplicationSpecific(SNMPUtil.decodeValue(seq, 1));
        this.genericTrap = GenericTrap.valueOf(SNMPUtil.decodeInt(seq, 2));
        this.specificTrap = SNMPUtil.decodeInt(seq, 3);
        this.timestamp = (TimeTicks) SNMPUtil.decodeApplicationSpecific(SNMPUtil.decodeValue(seq, 4));
        ASN1Sequence binds = SNMPUtil.getSequence(seq, 5);
        Enumeration<?> objs = binds.getObjects();
        while (objs.hasMoreElements())
        {
            VarBind vb = new VarBind();
            vb.decode((DERSequence) objs.nextElement());
            this.varBinds.add(vb);
        }
    }

    public int getRequestId()
    {
        return -1;
    }

    public String getEnterprise()
    {
        return enterprise;
    }

    public void setEnterprise(String enterprise)
    {
        this.enterprise = enterprise;
    }

    public IPAddress getAgentAddr()
    {
        return agentAddr;
    }

    public void setAgentAddr(IPAddress agentAddr)
    {
        this.agentAddr = agentAddr;
    }

    public GenericTrap getGenericTrap()
    {
        return genericTrap;
    }

    public void setGenericTrap(GenericTrap genericTrap)
    {
        this.genericTrap = genericTrap;
    }

    public int getSpecificTrap()
    {
        return specificTrap;
    }

    public void setSpecificTrap(int specificTrap)
    {
        this.specificTrap = specificTrap;
    }

    public TimeTicks getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(TimeTicks timestamp)
    {
        this.timestamp = timestamp;
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

    public void addVarBind(String oid, ASN1Encodable val)
    {
        this.addVarBind(new VarBind(oid, val));
    }

    public void addVarBind(String oid)
    {
        this.addVarBind(new VarBind(oid, DERNull.INSTANCE));
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
            if (OID.equals(vb.getObjectName())) return vb;
        }
        return null;
    }

    public VarBind get(String OID)
    {
        return this.getVarBind(OID);
    }

    public VarBind get()
    {
        if (this.varBinds.size() > 0) return this.varBinds.get(0);
        return null;
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

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(" " + this.getClass().getSimpleName() + "[\n");
        sb.append("  enterprise: ").append(this.getEnterprise()).append(";\n");
        sb.append("  agentAddr: ").append(this.getAgentAddr()).append(";\n");
        sb.append("  genericTrap: ").append(this.getGenericTrap()).append(";\n");
        sb.append("  specificTrap: ").append(this.getSpecificTrap()).append(";\n");
        sb.append("  timestamp: ").append(this.getTimestamp()).append(";\n");
        for (VarBind vb : this.varBinds)
        {
            sb.append("  ").append(vb.toString()).append("\n");
        }
        sb.append(" ]");
        return sb.toString();
    }
}
