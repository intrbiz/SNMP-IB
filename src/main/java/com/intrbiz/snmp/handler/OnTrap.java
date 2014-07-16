package com.intrbiz.snmp.handler;

import java.io.IOException;
import java.net.SocketAddress;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.SNMPMessage;

public interface OnTrap
{
    void apply(SNMPMessage message, SocketAddress from, SNMPContext<?> context) throws IOException;
    
    public static class LoggingAdapter implements OnTrap
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnTrap next;
        
        public LoggingAdapter(OnTrap next)
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
    
    public static class IgnoreV1Traps implements OnTrap
    {   
        private final OnTrap next;
        
        public IgnoreV1Traps(OnTrap next)
        {
            this.next = next;
        }
        
        public void apply(SNMPMessage message, SocketAddress from, SNMPContext<?> context) throws IOException
        {
            if (message.getVersion() != SNMPVersion.V1) this.next.apply(message, from, context);
        }
    }
}
