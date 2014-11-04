package example;

import static com.intrbiz.snmp.mib.defs.ietf.SNMPv2MIBDef.SNMPv2MIB;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.handler.OnResponse;
import com.intrbiz.snmp.poller.SNMPJob;
import com.intrbiz.snmp.poller.SNMPTask;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;

public class PollSysInfoV3
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open();
        
        // A context represents an Agent we are going to contact, or which is going to contact us
        SNMPV3Context sw3Agent    = transport.openV3Context("172.30.14.1", "8000002B0016E0357E406877").setUser("admin", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345");
        
        // poll the get every 5 minutes, with an initial execution immediately
        sw3Agent.poll().every(5).minutes().run(new SNMPTask() {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(new OnResponse.LoggingAdapter(), SNMPv2MIB.system.sysName.oid);
           }
        });
        
        // poll the agent every minute after an initial delay of 30 seconds
        sw3Agent.poll().after(30).every(60).seconds().get(new OnResponse.LoggingAdapter(), SNMPv2MIB.system.sysDescr.oid, SNMPv2MIB.system.sysLocation.oid);
        
        // poll the agent every 2 minutes after an initial delay of 15 seconds
        sw3Agent.poll().after(15).every(120).seconds().get(new String[] { SNMPv2MIB.system.sysContact.oid, SNMPv2MIB.system.sysName.oid }, new OnResponse.LoggingAdapter());
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
