package com.intrbiz.snmp.model.v2;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.mib.MIB.MIBEntry;
import com.intrbiz.snmp.mib.MIBs;
import com.intrbiz.snmp.model.asn1.Counter32;
import com.intrbiz.snmp.model.asn1.Counter64;
import com.intrbiz.snmp.model.asn1.TimeTicks;
import com.intrbiz.snmp.util.SNMPUtil;

public class VarBind
{
    private String objectName;

    private DEREncodable objectValue;

    public VarBind()
    {
        super();
    }
    
    public VarBind(String name)
    {
        super();
        this.objectName = name;
    }
    
    public VarBind(String name, DEREncodable value)
    {
        super();
        this.objectName = name;
        this.objectValue = value;
    }
    
    public VarBind(String name, String str)
    {
        super();
        this.objectName = name;
        this.setStringValue(str);
    }
    
    public VarBind(String name, int val)
    {
        super();
        this.objectName = name;
        this.setIntValue(val);
    }
    
    public String getName()
    {
        return this.objectName;
    }
    
    public String name()
    {
        return this.objectName;
    }
    
    public Object getValue()
    {
        if (this.isStringValue())
        {
            return this.getStringValue();
        }
        else if (this.isOIDValue())
        {
            return this.getOIDValue();
        }
        else if (this.isIntValue())
        {
            return this.getIntValue();
        }
        else if (this.isTimeTicksValue())
        {
            return this.getTimeTicksValue();
        }
        else if (this.isCounter32Value())
        {
            return this.getCounter32Value();
        }
        else if (this.isCounter64Value())
        {
            return this.getCounter64Value();
        }
        return this.objectValue;
    }
    
    public Object value()
    {
        return this.getValue();
    }

    public String getObjectName()
    {
        return objectName;
    }

    public void setObjectName(String objectName)
    {
        this.objectName = objectName;
    }

    public DEREncodable getObjectValue()
    {
        return objectValue;
    }

    public void setObjectValue(DEREncodable objectValue)
    {
        this.objectValue = objectValue;
    }
    
    public void setStringValue(String str)
    {
        this.objectValue = SNMPUtil.encodeString(str);
    }
    
    public void setIntValue(int val)
    {
        this.objectValue = new DERInteger(val);
    }
    
    public String getStringValue()
    {
        return SNMPUtil.decodeString((DEROctetString) this.objectValue);
    }
    
    public boolean isStringValue()
    {
        return this.objectValue instanceof DEROctetString;
    }
    
    public int getIntValue()
    {
        return SNMPUtil.decodeInt((DERInteger) this.objectValue);
    }
    
    public boolean isIntValue()
    {
        return this.objectValue instanceof DERInteger;
    }
    
    public boolean isTimeTicksValue()
    {
        return this.objectValue instanceof TimeTicks;
    }
    
    public TimeTicks getTimeTicksValue()
    {
        return (TimeTicks) this.objectValue;
    }
    
    public boolean isCounter32Value()
    {
        return this.objectValue instanceof Counter32;
    }
    
    public Counter32 getCounter32Value()
    {
        return (Counter32) this.objectValue;
    }
    
    public boolean isCounter64Value()
    {
        return this.objectValue instanceof Counter64;
    }
    
    public Counter64 getCounter64Value()
    {
        return (Counter64) this.objectValue;
    }
    
    public String getOIDValue()
    {
        return ((ASN1ObjectIdentifier) this.objectValue).getId();
    }
    
    public boolean isOIDValue()
    {
        return this.objectValue instanceof ASN1ObjectIdentifier;
    }
    
    //

    public String valueToString()
    {
        return String.valueOf(this.getValue());
    }
    
    //
    
    public DEREncodable encode()
    {
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new ASN1ObjectIdentifier(this.objectName));
        vec.add(this.objectValue);
        return new DERSequence(vec);
    }

    public void decode(DERSequence seq)
    {
        this.objectName  = SNMPUtil.decodeOid(seq, 0).getId();
        this.objectValue = SNMPUtil.decodeApplicationSpecific(SNMPUtil.decodeValue(seq, 1));
    }
    
    public MIBEntry<?> lookupEntry()
    {
        return MIBs.getInstance().lookupEntry(this.getObjectName());
    }

    public String toString()
    {
        MIBEntry<?> entry = this.lookupEntry();
        return "VarBind[\n" + 
               "   objectName: " + this.objectName + (entry == null ? "" : " (" + entry.qualifiedName + ")") + ";\n" + 
               "   objectValue: " + this.valueToString() + ";\n" + 
               "  ]";
    }
}
