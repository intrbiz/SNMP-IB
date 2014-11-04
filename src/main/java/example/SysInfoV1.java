package example;

import static com.intrbiz.snmp.mib.defs.IETF.*;

import org.apache.log4j.BasicConfigurator;

import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.SNMPV1Context;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnResponse;

public class SysInfoV1
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open();
        
        // A context represents an Agent we are going to contact, or which is going to contact us
        // V2c is pretty much identical to V1, so we tell version 2 to pretend to be version 1
        SNMPV1Context agent  = transport.openV1Context("172.30.13.20").setCommunity("public");
        
        // Use the context to send messages
        // The callback will be executed when a response to a request is received
        agent.get(new OnResponse.LoggingAdapter(), new OnError.LoggingAdapter(), SNMPv2MIB.system.sysDescr.oid, SNMPv2MIB.system.sysUpTime.oid);
        
        // Run our transport to send and receive messages
        transport.run();        
    }
}
