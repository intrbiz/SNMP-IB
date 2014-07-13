package com.intrbiz.snmp.security;

public enum SNMPAuthMode {
    NONE, MD5, SHA1;
    
    public static SNMPAuthMode parse(String mode)
    {
        if ("none".equalsIgnoreCase(mode)) return NONE;
        if ("md5".equalsIgnoreCase(mode)) return MD5;
        if ("sha1".equalsIgnoreCase(mode) || "sha".equalsIgnoreCase(mode)) return SHA1;
        return null;
    }
}
