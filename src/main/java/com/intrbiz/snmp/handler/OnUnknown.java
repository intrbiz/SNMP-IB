package com.intrbiz.snmp.handler;

import java.io.IOException;
import java.net.SocketAddress;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPMessage;

public interface OnUnknown
{
    void apply(SNMPMessage message, SocketAddress from, SNMPContext<?> context) throws IOException;
    
    public static class LoggingAdapter implements OnUnknown
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnUnknown next;
        
        public LoggingAdapter(OnUnknown next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(SNMPMessage message, SocketAddress from, SNMPContext<?> context) throws IOException
        {
            this.logger.info("Got response: " + message);
            if (this.next != null) this.next.apply(message, from, context);
        }
    }
}
