package com.intrbiz.snmp.asn1;

public class ASNTag
{
    public static final int CLASS_MASK        = 0xC0;
    public static final int CONSTRUCTED_MASK  = 0x20;
    public static final int TAG_MASK          = 0x1F;
    //
    public static final int APPLICATION       = 0x40;
    public static final int CONTEXT           = 0x80;
    public static final int PRIVATE           = 0xC0;
    //
    public static final int CONSTRUCTED       = 0x20;
    //
    public static final int BOOLEAN           = 0x01;
    public static final int INTEGER           = 0x02;
    public static final int BIT_STRING        = 0x03;
    public static final int OCTET_STRING      = 0x04;
    public static final int NULL              = 0x05;
    public static final int OID               = 0x06;
    public static final int OBJECT_DESCRIPTOR = 0x07;
    public static final int EXTERNAL          = 0x08;
    public static final int REAL              = 0x09;
    public static final int ENUMERATED        = 0xA;
    public static final int EMBEDDED_PDV      = 0xB;
    public static final int UTF8_STRING       = 0xC;
    public static final int RELATIVE_OID      = 0xD;
    public static final int SEQUENCE          = 0x10;
    public static final int SET               = 0x11;
    
    //
    
    protected final int tag;
    
    public ASNTag(int tag)
    {
        this.tag = tag;
    }
    
    public int getTag()
    {
        return this.tag;
    }
    
    //
    
    public void assume(boolean assumption, String message)
    {
        if (! assumption) throw new RuntimeException(message);
    }
    
    // class
    
    public boolean isUniversal()
    {
        return (tag & CLASS_MASK) == 0;
    }
    
    public boolean isApplication()
    {
        return (tag & CLASS_MASK) == APPLICATION;
    }
    
    public boolean isContext()
    {
        return (tag & CLASS_MASK) == CONTEXT;
    }
    
    public boolean isPrivate()
    {
        return (tag & CLASS_MASK) == PRIVATE;
    }
    
    // constructed
    
    public boolean isConstructed()
    {
        return (tag & CONSTRUCTED) == CONSTRUCTED;
    }
    
    // types
    
    public boolean isBoolean()
    {
        return (tag & BOOLEAN) == BOOLEAN;
    }
    
    public boolean isInteger()
    {
        return (tag & INTEGER) == INTEGER;
    }
    
    public boolean isBitString()
    {
        return (tag & BIT_STRING) == BIT_STRING;
    }
    
    public boolean isOctetString()
    {
        return (tag & OCTET_STRING) == OCTET_STRING;
    }
    
    public boolean isNull()
    {
        return (tag & NULL) == NULL;
    }
    
    public boolean isOID()
    {
        return (tag & OID) == OID;
    }
    
    public boolean isReal()
    {
        return (tag & REAL) == REAL;
    }
    
    public boolean isSequence()
    {
        return (tag & SEQUENCE) == SEQUENCE;
    }
    
    public boolean isSet()
    {
        return (tag & SET) == SET;
    }
    
    //
    
    public String getType()
    {
        if (this.isBoolean())
            return "boolean";
        else if (this.isInteger())
            return "integer";
        else if (this.isBitString())
            return "bit string";
        else if (this.isOctetString())
            return "octet string";
        else if (this.isNull())
            return "null";
        else if (this.isOID())
            return "oid";
        else if (this.isSequence())
            return "sequence";
        else if (this.isSet())
            return "set";
        return "unknown";
    }
    
    //
    
    public String toString()
    {
        return "ASNTag(" + Integer.toHexString(this.tag) + ";c=" + this.isConstructed() + ";" + this.getType() + ")";
    }
}
