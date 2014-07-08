    package com.intrbiz.snmp.handler;

import java.io.IOException;

import org.apache.log4j.Logger;

public interface OnError
{
    void apply(Throwable error) throws IOException;
    
    public static class LoggingAdapter implements OnError
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnError next;
        
        public LoggingAdapter(OnError next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(Throwable error) throws IOException
        {
            this.logger.warn("Got error: " + error);
            if (this.next != null) this.next.apply(error);
        }
    }
}
