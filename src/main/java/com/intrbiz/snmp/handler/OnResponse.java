package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.model.PDU;
import com.intrbiz.snmp.model.SNMPMessage;

public interface OnResponse
{
    void apply(PDU pdu) throws IOException;
    
    public static class MessageAdapter implements OnMessage
    {
        private final OnResponse pdu;
        
        @SuppressWarnings("unused")
        private final OnError error;
        
        public MessageAdapter(OnResponse pdu, OnError error)
        {
            this.pdu = pdu;
            this.error = error;
        }
        
        public MessageAdapter(OnResponse pdu)
        {
            this(pdu, null);
        }
        
        public void apply(SNMPMessage message) throws IOException
        {
            if (this.pdu != null) this.pdu.apply(message.getPdu());
        }
    }
    
    public static class LoggingAdapter implements OnResponse
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnResponse next;
        
        public LoggingAdapter(OnResponse next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(PDU pdu) throws IOException
        {
            this.logger.info("Got response: " + pdu);
            if (this.next != null) this.next.apply(pdu);
        }
    }
}
