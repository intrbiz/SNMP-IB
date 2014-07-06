package example;

import org.apache.log4j.BasicConfigurator;

import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.SNMPV2Context;
import com.intrbiz.snmp.handler.ResponseHandler;

public class SysInfoV2c
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open();
        
        // A context represents an Agent we are going to contact, or which is going to contact us
        SNMPV2Context lcAgent  = transport.openV2Context("127.0.0.1").setCommunity("public");
        SNMPV2Context swAgent  = transport.openV2Context("172.30.12.1").setCommunity("public");
        // SNMPV2Context sw2Agent = transport.openV2Context("172.30.12.2").setCommunity("public");
        //
        // SNMPV2Context apAgent = transport.openV2Context("172.30.13.193").setCommunity("public");
        
        // Use the context to send messages
        // The callback will be executed when a response to a request is received
        lcAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        swAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        // sw2Agent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        
        // apAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
