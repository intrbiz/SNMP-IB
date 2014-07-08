package com.intrbiz.snmp.model.table;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.intrbiz.snmp.model.v2.VarBind;

/**
 * A SNMP Table
 */
public class SNMPTable
{
    private final String baseOid;

    private LinkedHashMap<String,VarBind> byIndex = new LinkedHashMap<String, VarBind>();
    
    private LinkedHashMap<String,VarBind> byName = new LinkedHashMap<String, VarBind>();

    public SNMPTable(String baseOid)
    {
        super();
        this.baseOid = baseOid;
    }
    
    /**
     * The number of entries in this table
     */
    public int size()
    {
        return this.byIndex.size();
    }
    
    /**
     * Remove all entries from this table
     */
    public void clear()
    {
        this.byIndex.clear();
        this.byName.clear();
    }
    
    /**
     * Add an entry to this table
     */
    public void add(VarBind bind)
    {
        String idx = bind.getObjectName().substring(this.baseOid.length() + 1);
        this.byIndex.put(idx, bind);
        this.byName.put(idx, bind);
    }
    
    /**
     * Get a variable by its index within the table. 
     */
    public VarBind getByIndex(String index)
    {
        return this.byIndex.get(index);
    }
    
    /**
     * Get a variable by its Object Name (OID)
     */
    public VarBind getByName(String name)
    {
        return this.byName.get(name);
    }
    
    /**
     * Get a variable by either its index or name
     */
    public VarBind get(String indexOrName)
    {
        VarBind vb = this.getByIndex(indexOrName);
        if (vb != null) return vb;
        return this.getByName(indexOrName);
    }
    
    /**
     * Get the variables in this table
     */
    public List<VarBind> values()
    {
        return new ArrayList<VarBind>(this.byIndex.values());
    }
    
    /**
     * Get the indexes in this table
     */
    public List<String> indexes()
    {
        return new ArrayList<String>(this.byIndex.keySet());
    }
    
    /**
     * Get the Object Names in this table
     */
    public List<String> names()
    {
        return new ArrayList<String>(this.byName.keySet());
    }

    /**
     * Get the base OID for this table
     * 
     * Note: baseOid + index = objectName
     */
    public String getBaseOid()
    {
        return baseOid;
    }
    
    /**
     * Get the table as a map by name
     */
    public Map<String, VarBind> byName()
    {
        return this.byName;
    }
    
    /**
     * Get the table as a map by index
     */
    public Map<String, VarBind> byIndex()
    {
        return this.byIndex;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder("SNMPTable(baseOid: ").append(this.baseOid).append(")[\n");
        for (VarBind bind : this.byIndex.values())
        {
            sb.append(" ").append(bind.toString()).append(";\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
