package com.intrbiz.snmp.handler;

import java.io.IOException;
import java.net.SocketAddress;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPMessage;

public interface ResponseHandler
{
    void handleResponse(SNMPMessage response, SocketAddress from, SNMPMessage request, SNMPContext context) throws IOException;

    void handleTimeout(SNMPMessage request, SocketAddress target, SNMPContext context) throws IOException;

    public static class LoggingHandler implements ResponseHandler
    {
        private Logger logger = Logger.getLogger(LoggingHandler.class);
        
        @Override
        public void handleResponse(SNMPMessage response, SocketAddress from, SNMPMessage request, SNMPContext context)
        {
            logger.info("Received from " + from + " message:\n" + response.toString());
        }

        @Override
        public void handleTimeout(SNMPMessage request, SocketAddress target, SNMPContext context)
        {
            logger.debug("Timeout while waiting for response");
        }
    }
}
