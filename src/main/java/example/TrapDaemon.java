package example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.handler.trap.OnLinkChange;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;

public class TrapDaemon
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open(8163).setGlobalTrapHandler(new OnTrap.LoggingAdapter());

        // register the agents which will send us trapsO
        transport.openV3Context("172.30.14.1", "8000002B0016E0357E406877")
            .setUser("admin", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345")
            .registerTrapHandler("link-state", new OnLinkChange.LinkTrapAdapter(new OnLinkChange.LoggingAdapter()));
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
