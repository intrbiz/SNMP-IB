package com.intrbiz.snmp.mib.defs;

import com.intrbiz.snmp.mib.MIB;

public class SampleMIBDefinition extends MIB
{
    public static final SampleMIBDefinition TestMIB = new SampleMIBDefinition();
    
    public static final SampleMIBDefinition TestMIB() { return TestMIB; }
    
    public final SystemEntry system;
    
    private SampleMIBDefinition()
    {
        super("TEST-MIB");
        // init the enties
        this.system = new SystemEntry(this, null);
        // setup the children
        this.entries = new MIBEntry[] {
                this.system
        };
    }
    
    public final SystemEntry system()
    {
        return this.system;
    }
    
    public static class SystemEntry extends MIBEntry<SampleMIBDefinition>
    {
        public final SysUptimeEntry sysUptime;
        
        public final SysContactEntry sysContact;
        
        private SystemEntry(SampleMIBDefinition mib, MIBEntry<SampleMIBDefinition> parent)
        {
            super(mib, parent, "system", "1.3.6.1.2.1.1", true, false, false, false);
            this.sysUptime = new SysUptimeEntry(mib, this);
            this.sysContact = new SysContactEntry(mib, this);
            this.entries = new MIBEntry<?>[] {
                    this.sysUptime,
                    this.sysContact
            };
        }
        
        public final SysUptimeEntry sysUptime()
        {
            return sysUptime;
        }
        
        public final SysContactEntry sysContact()
        {
            return this.sysContact;
        }
        
        public static class SysUptimeEntry extends MIBEntry<SampleMIBDefinition>
        {
            private SysUptimeEntry(SampleMIBDefinition mib, MIBEntry<SampleMIBDefinition> parent)
            {
                super(mib, parent, "sysUpTime", "1.3.6.1.2.1.1.3", true, false, false, false);
            }
        }
        
        public static class SysContactEntry extends MIBEntry<SampleMIBDefinition>
        {
            private SysContactEntry(SampleMIBDefinition mib, MIBEntry<SampleMIBDefinition> parent)
            {
                super(mib, parent, "sysContact", "1.3.6.1.2.1.1.4", true, false, false, false);
            }
        }
    }
    
}
