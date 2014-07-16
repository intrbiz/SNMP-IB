package example;

import java.net.SocketAddress;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.TrapPDU;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;

public class TrapDaemon
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.FATAL);
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open(8163).setGlobalTrapHandler(new OnTrap.IgnoreV1Traps(new OnTrap()
        {
            @Override
            public void apply(SNMPMessage message, SocketAddress from, SNMPContext<?> context)
            {
                TrapPDU trap = message.getPdu();
                if (trap.isLinkDownTrap())
                {
                    System.out.println("Got Link Down Trap: " + trap.getTrapArgument(0).valueToString() + ", " + trap.getTrapArgument(1).valueToString() + ", " + trap.getTrapArgument(2).valueToString());
                }
                else if (trap.isLinkUpTrap())
                {
                    System.out.println("Got Link Up Trap: " + trap.getTrapArgument(0).valueToString() + ", " + trap.getTrapArgument(1).valueToString() + ", " + trap.getTrapArgument(2).valueToString());
                }
            }
        }));

        // register the agents which will send us trapsO
        transport.openV3Context("172.30.14.1", "8000002B0016E0357E406877").setUser("admin", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345");
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
