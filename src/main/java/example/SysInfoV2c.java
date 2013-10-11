package example;

import java.net.InetAddress;

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
        SNMPV2Context lcAgent = new SNMPV2Context(InetAddress.getByName("127.0.0.1"));
        SNMPV2Context swAgent = new SNMPV2Context(InetAddress.getByName("172.30.12.1"));
        
        // Register the context with the transport so we can send messages
        lcAgent.register(transport);
        swAgent.register(transport);
        
        // Use the context to send messages
        // The callback will be executed when a response to a request is received
        lcAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        swAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
