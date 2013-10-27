package com.intrbiz.snmp.model.asn1;

import java.math.BigInteger;

/**
 * A SNMP Counter type which is implemented as a 32bit or 64bit counter
 */
public interface Counter
{
    /**
     * Get the counter value as an unsigned 64bit value of the counter
     */
    long getUnsignedLongValue();
    
    /**
     * Get the counter value as a signed 64bit value of the counter
     */
    long getLongValue();
    
    /**
     * Get the counter value as a BigInteger
     */
    BigInteger getBigIntValue();
}
