package com.intrbiz.snmp.security;

public enum SNMPPrivMode {
    NONE, AES128, DES;
    
    public static SNMPPrivMode parse(String mode)
    {
        if ("none".equalsIgnoreCase(mode)) return NONE;
        if ("aes128".equalsIgnoreCase(mode) || "aes".equalsIgnoreCase(mode)) return AES128;
        if ("des".equalsIgnoreCase(mode)) return DES;
        return null;
    }
}
