package com.intrbiz.snmp;

import java.net.SocketAddress;
import java.util.Arrays;

import com.intrbiz.snmp.util.SNMPUtil;

/**
 * The unique identifier of an SNMP Context.  This uses the 
 * transport address and the SNMP Engine ID (if applicable).
 */
public final class SNMPContextId
{
    private final SocketAddress address;

    private final byte[] engineId;

    public SNMPContextId(SocketAddress address, byte[] engineId)
    {
        this.address = address;
        this.engineId = engineId == null ? new byte[0] : engineId;
    }
    
    public SNMPContextId(SocketAddress address)
    {
        this(address, new byte[0]);
    }

    public SocketAddress getAddress()
    {
        return address;
    }

    public byte[] getEngineId()
    {
        return engineId;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + Arrays.hashCode(engineId);
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        SNMPContextId other = (SNMPContextId) obj;
        if (address == null)
        {
            if (other.address != null) return false;
        }
        else if (!address.equals(other.address)) return false;
        if (!Arrays.equals(engineId, other.engineId)) return false;
        return true;
    }
    
    public String toString()
    {
        return "SNMPContextId[" + this.address.toString() + ((this.engineId == null && this.engineId.length > 0) ? "" : "::" + SNMPUtil.toHex(this.engineId)) + "]";
    }
}
