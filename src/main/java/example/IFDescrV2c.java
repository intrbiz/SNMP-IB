package example;

import org.apache.log4j.BasicConfigurator;

import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.SNMPV2Context;
import com.intrbiz.snmp.handler.TableHandler;

public class IFDescrV2c
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open();
        
        // A context represents an Agent we are going to contact, or which is going to contact us
        // SNMPV2Context lhAgent  = transport.openV2Context("127.0.0.1").setCommunity("public");
        // SNMPV2Context swAgent  = transport.openV2Context("172.30.12.1").setCommunity("public");
        // SNMPV2Context sw2Agent = transport.openV2Context("172.30.12.3").setCommunity("public");
        
        SNMPV2Context sw3Agent = transport.openV2Context("10.10.10.250").setCommunity("public");
        
        // Use the context to send messages
        // The callback will be executed when a response to a request is received
        // lhAgent.getTableBulk("1.3.6.1.2.1.2.2.1.2", 100, new TableHandler.LoggingHandler());
        //  swAgent.getTableBulk("1.3.6.1.2.1.2.2.1.2", 100, new TableHandler.LoggingHandler());
        // sw2Agent.getTableBulk("1.3.6.1.2.1.2.2.1.2", 100, new TableHandler.LoggingHandler());
        // sw2Agent.getTableBulk("1.3.6.1.2.1.31.1.1.1.10", 100, new TableHandler.LoggingHandler());
        // sw2Agent.getTableBulk("1.3.6.1.2.1.2.2.1.16", 100, new TableHandler.LoggingHandler());
        
        sw3Agent.getTableBulk("1.3.6.1.2.1.2.2.1.2", 100, new TableHandler.LoggingHandler());
        
        // swAgent.getTableBulk("1.3.6.1.2.1.2.2", 100, new TableHandler.LoggingHandler());
        
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
