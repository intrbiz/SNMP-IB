package com.intrbiz.snmp.table;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.intrbiz.snmp.handler.OnTable;
import com.intrbiz.snmp.handler.OnCollatedTable;
import com.intrbiz.snmp.model.table.SNMPCollatedTable;
import com.intrbiz.snmp.model.table.SNMPTable;

public class TableGrouper implements OnTable
{
    private final String[] baseOids;
    
    private final Map<String, SNMPTable> tables = new HashMap<String, SNMPTable>();
    
    private OnCollatedTable complete;
    
    private boolean completed;
    
    public TableGrouper(String[] baseOids, OnCollatedTable complete)
    {
        this.baseOids = baseOids;
        this.complete = complete;
    }

    @Override
    public void apply(SNMPTable table) throws IOException
    {
        if (! this.completed)
        {
            this.tables.put(table.getBaseOid(), table);
            if (this.tables.size() == this.baseOids.length)
            {
                this.completed = true;
                this.complete.apply(new SNMPCollatedTable(this.baseOids, this.tables));
            }
        }
    }
}
