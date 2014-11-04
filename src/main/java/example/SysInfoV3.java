package example;

import static com.intrbiz.snmp.mib.defs.IETF.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.handler.OnResponse;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;

public class SysInfoV3
{
    public static void main(String[] args) throws Exception
    {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.TRACE);
        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open();
        
        // A context represents an Agent we are going to contact, or which is going to contact us
        /*SNMPV3Context swAgent    = transport.openV3Context("172.30.12.1", "8000002B0016E0357E406877").setUser("admin", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345");*/
        
        /*SNMPV3Context sw2Agent    = transport.openV3Context("172.30.12.3", "8000002B0016E0357E406877").setUser("test3des", SNMPAuthMode.SHA1, SNMPPrivMode.NONE, "abcde12345");*/
        
        // 8000002B0016E0357E406877
        SNMPV3Context sw3Agent    = transport.openV3Context("172.30.14.1").setUser("testdes", SNMPAuthMode.SHA1, SNMPPrivMode.DES, "abcde12345");
        
        // 800069300308ea443ce700
        // SNMPV3Context apAgent    = transport.openV3Context("172.30.13.193").setUser("test", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345");
        
        // Use the context to send messages
        // The callback will be executed when a response to a request is received
        // swAgent.get(new ResponseHandler.LoggingHandler(), SNMPv2MIB.system.sysDescr.oid, SNMPv2MIB.system.sysUpTime.oid);
        /*sw2Agent.get(new ResponseHandler.LoggingHandler(), SNMPv2MIB.system.sysDescr.oid, SNMPv2MIB.system.sysUpTime.oid);*/
        
        sw3Agent.get(new OnResponse.LoggingAdapter(), SNMPv2MIB.system.sysDescr.oid, SNMPv2MIB.system.sysUpTime.oid);
        
        // apAgent.get(new OnResponse.LoggingAdapter(), new OnError.LoggingAdapter(), SNMPv2MIB.system.sysDescr.oid, SNMPv2MIB.system.sysUpTime.oid);
        
        // apAgent.getTableBulk("1.3.6.1.2.1.2.2.1.2", 100, new OnTable.LoggingAdapter(), new OnError.LoggingAdapter());
        
        // apAgent.getCollatedTableBulk(new String[] { "1.3.6.1.2.1.2.2.1.2", "1.3.6.1.2.1.2.2.1.10", "1.3.6.1.2.1.2.2.1.16" }, new OnCollatedTable.LoggingAdapter(), new OnError.LoggingAdapter());
        
        // Run our transport to send and receive messages
        transport.run();
    }
}
