package com.intrbiz.snmp.model.table;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.intrbiz.snmp.model.v2.VarBind;

public class SNMPCollatedTable
{
    private final List<String> baseOids = new ArrayList<String>();
    
    private LinkedHashMap<String, LinkedHashMap<String, VarBind>> values = new LinkedHashMap<String, LinkedHashMap<String, VarBind>>();
    
    public SNMPCollatedTable(SNMPTable[] tables)
    {
        super();
        for (SNMPTable table : tables)
        {
            baseOids.add(table.getBaseOid());
        }
        for (Entry<String, VarBind> keyEntry : tables[0].byIndex().entrySet())
        {
            String key = keyEntry.getValue().valueToString();
            LinkedHashMap<String, VarBind> row = new LinkedHashMap<String, VarBind>();
            for (int i = 1; i < tables.length; i++)
            {
                row.put(tables[i].getBaseOid(), tables[i].getByIndex(keyEntry.getKey()));
            }
            this.values.put(key, row);
        }
    }
    
    public SNMPCollatedTable(String[] baseOids, Map<String, SNMPTable> tables)
    {
        this(buildTableArray(baseOids, tables));
    }
    
    private static SNMPTable[] buildTableArray(String[] baseOids, Map<String, SNMPTable> tables)
    {
        SNMPTable[] tableArray = new SNMPTable[baseOids.length];
        for (int i = 0; i < tableArray.length; i ++)
        {
            tableArray[i] = tables.get(baseOids[i]);
        }
        return tableArray;
    }
    
    /**
     * Get the base OID which is used as the source of the key of this table
     */
    public String getKeyBaseOid()
    {
        return this.baseOids.get(0);
    }
    
    /**
     * Get the base OIDs of the columns of this table, the first base OID will be the key
     * @return
     */
    public List<String> getBaseOids()
    {
        return this.baseOids;
    }
    
    /**
     * Get the keys of this table, in order
     */
    public List<String> getKeys()
    {
        return new ArrayList<String>(this.values.keySet());
    }
    
    /**
     * Get a row of this table by key
     */
    public List<Entry<String, VarBind>> getRow(String key)
    {
        LinkedHashMap<String, VarBind> row = this.values.get(key);
        if (row == null) return null;
        return new ArrayList<Entry<String, VarBind>>(row.entrySet());
    }
    
    /**
     * Get the value of the given cell
     * @param key the row key
     * @param columnBaseOid the column base OID
     */
    public VarBind get(String key, String columnBaseOid)
    {
        LinkedHashMap<String, VarBind> row = this.values.get(key);
        if (row == null) return null;
        return row.get(columnBaseOid);
    }
    
    /**
     * Get the value of the given cell using the columnIndex (zero indexed, where zero is the first column and not the row key)
     * @param key the row key
     * @param columnIndex the column index
     */
    public VarBind get(String key, int columnIndex)
    {
        return this.get(key, this.baseOids.get(columnIndex + 1));
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("SNMPCollatedTable {\n");
        for (String key : this.getKeys())
        {
            sb.append("  ").append(key).append(" => [");
            boolean ns = false;
            for (Entry<String, VarBind> cell : this.getRow(key))
            {
                if (ns) sb.append(", ");
                sb.append(cell.getKey() + " => " + cell.getValue().valueToString());
                ns = true;
            }
            sb.append("]\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
