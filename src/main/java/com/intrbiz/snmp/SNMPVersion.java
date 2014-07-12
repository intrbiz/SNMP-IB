package com.intrbiz.snmp;

public enum SNMPVersion
{
    V1(1,0), V2C(2,1), V3(3,3);
    
    private final int version;
    private final int tag;
    
    private SNMPVersion(int version, int tag)
    {
        this.version = version;
        this.tag = tag;
    }
    
    public final int getVersion()
    {
        return this.version;
    }
    
    /**
     * The version tag used within the SNMP protocol
     */
    public final int getTag()
    {
        return this.tag;
    }
    
    public static final SNMPVersion fromVersion(int version)
    {
        if (version == V1.version)  return V1;
        if (version == V2C.version) return V2C;
        if (version == V3.version)  return V3;
        return null;
    }
    
    public static final SNMPVersion fromTag(int tag)
    {
        if (tag == V1.tag)  return V1;
        if (tag == V2C.tag) return V2C;
        if (tag == V3.tag)  return V3;
        return null;        
    }
    
    public static SNMPVersion parse(String version)
    {
        switch (version)
        {
            case "1":  return V1;
            case "2":  return V2C;
            case "2c": return V2C;
            case "3":  return V3;
        }
        return null;
    }
}
