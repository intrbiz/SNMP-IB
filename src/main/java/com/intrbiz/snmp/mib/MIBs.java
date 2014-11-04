package com.intrbiz.snmp.mib;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class MIBs
{
    public static final MIBs INSTANCE = new MIBs();
    
    public static final MIBs getInstance()
    {
        return INSTANCE;
    }
    
    private ConcurrentMap<String, MIB> mibs = new ConcurrentHashMap<String, MIB>();
    
    private MIBs()
    {
        super();
    }
    
    public void registerMIB(MIB mib)
    {
        this.mibs.put(mib.name().toLowerCase(), mib);
    }
    
    @SuppressWarnings("unchecked")
    public <T extends MIB> T getMIB(String name)
    {
        return (T) mibs.get(name.toLowerCase());
    }
    
    public Collection<MIB> getMIBs()
    {
        return Collections.unmodifiableCollection(this.mibs.values());
    }
}
