package com.intrbiz.snmp.error;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPMessage;

public class SNMPTimeout extends SNMPError
{
    private static final long serialVersionUID = 1L;

    public SNMPTimeout()
    {
        super();
    }

    public SNMPTimeout(SNMPContext<?> context, SNMPMessage request, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(context, request, message, cause, enableSuppression, writableStackTrace);
    }

    public SNMPTimeout(SNMPContext<?> context, SNMPMessage request, String message, Throwable cause)
    {
        super(context, request, message, cause);
    }

    public SNMPTimeout(SNMPContext<?> context, SNMPMessage request, String message)
    {
        super(context, request, message);
    }

    public SNMPTimeout(SNMPContext<?> context, SNMPMessage request, Throwable cause)
    {
        super(context, request, cause);
    }

    @Override
    public boolean isTimeout()
    {
        return false;
    }
}
