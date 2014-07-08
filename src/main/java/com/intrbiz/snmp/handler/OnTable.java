package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.model.table.SNMPTable;

public interface OnTable
{
    void apply(SNMPTable table) throws IOException;
    
    public static class LoggingAdapter implements OnTable
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnTable next;
        
        public LoggingAdapter(OnTable next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(SNMPTable table) throws IOException
        {
            this.logger.info("Got table: " + table);
            if (this.next != null) this.next.apply(table);
        }
    }
}
