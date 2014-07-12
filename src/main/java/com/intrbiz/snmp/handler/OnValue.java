package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.VarBind;
import com.intrbiz.snmp.model.v2.VarBindPDU;

public interface OnValue
{
    void apply(VarBind varbind) throws IOException;
    
    public static class MessageAdapter implements OnMessage
    {
        private final OnValue next;
        
        @SuppressWarnings("unused")
        private final OnError error;
        
        public MessageAdapter(OnValue next, OnError error)
        {
            this.next = next;
            this.error = error;
        }
        
        public MessageAdapter(OnValue next)
        {
            this(next, null);
        }
        
        public void apply(SNMPMessage message) throws IOException
        {
            if (this.next != null) this.next.apply(((VarBindPDU) message.getPdu()).get());
        }
    }
    
    public static class LoggingAdapter implements OnValue
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnValue next;
        
        public LoggingAdapter(OnValue next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(VarBind varBind) throws IOException
        {
            this.logger.info("Got response: " + varBind);
            if (this.next != null) this.next.apply(varBind);
        }
    }
}
