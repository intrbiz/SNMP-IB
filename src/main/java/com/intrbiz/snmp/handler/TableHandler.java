package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.table.SNMPTable;

public interface TableHandler
{
    void handleTable(SNMPTable table, SNMPContext context) throws IOException;
    
    void handleTimeout(String baseOid, SNMPContext context) throws IOException;
    
    public static class LoggingHandler implements TableHandler
    {
        private Logger logger = Logger.getLogger(LoggingHandler.class);
        
        public void handleTable(SNMPTable table, SNMPContext context)
        {
            logger.info("Table:\n" + table.toString());
        }
        
        public void handleTimeout(String baseOid, SNMPContext context)
        {
            logger.debug("Timeout while getting table " + baseOid);
        }
    }
}
