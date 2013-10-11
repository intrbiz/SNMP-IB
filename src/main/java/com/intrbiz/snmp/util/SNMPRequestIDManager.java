package com.intrbiz.snmp.util;

import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class SNMPRequestIDManager
{
    private static final SNMPRequestIDManager US = new SNMPRequestIDManager();
    
    public static final SNMPRequestIDManager getInstance()
    {
        return US;
    }
    
    private SecureRandom random = new SecureRandom();
    
    private AtomicInteger idSequence = new AtomicInteger();
    
    private SNMPRequestIDManager()
    {
        super();
    }
    
    public int nextId()
    {
        return ((random.nextInt() & 0xFFFF) << 16) | (idSequence.incrementAndGet() & 0xFFFF);
    }
}
