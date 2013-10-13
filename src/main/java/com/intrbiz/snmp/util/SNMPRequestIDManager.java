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
        // For V3 the request ID cannot be < 0
        return ((random.nextInt() & 0x7FFF) << 16) | (idSequence.incrementAndGet() & 0xFFFF);
    }
}
