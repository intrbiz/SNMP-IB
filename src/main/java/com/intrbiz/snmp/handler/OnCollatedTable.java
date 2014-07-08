package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.model.table.SNMPCollatedTable;

public interface OnCollatedTable
{
    void apply(SNMPCollatedTable collated) throws IOException;
    
    public static class LoggingAdapter implements OnCollatedTable
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnCollatedTable next;
        
        public LoggingAdapter(OnCollatedTable next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(SNMPCollatedTable collated) throws IOException
        {
            this.logger.info("Got tables: " + collated);
            if (this.next != null) this.next.apply(collated);
        }
    }
}
