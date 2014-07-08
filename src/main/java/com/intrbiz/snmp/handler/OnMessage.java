package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.model.SNMPMessage;


public interface OnMessage
{
    void apply(SNMPMessage response) throws IOException;
    
    public static class LoggingAdapter implements OnMessage
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnMessage next;
        
        public LoggingAdapter(OnMessage next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(SNMPMessage message) throws IOException
        {
            this.logger.info("Got message: " + message);
            if (this.next != null) this.next.apply(message);
        }
    }
}
