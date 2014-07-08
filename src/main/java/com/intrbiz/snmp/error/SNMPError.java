package com.intrbiz.snmp.error;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPMessage;

public class SNMPError extends Exception
{
    private static final long serialVersionUID = 1L;

    private SNMPContext<?> context;

    private SNMPMessage request;

    public SNMPError()
    {
        super();
    }

    public SNMPError(SNMPContext<?> context, SNMPMessage request, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public SNMPError(SNMPContext<?> context, SNMPMessage request, String message, Throwable cause)
    {
        super(message, cause);
    }

    public SNMPError(SNMPContext<?> context, SNMPMessage request, String message)
    {
        super(message);
    }

    public SNMPError(SNMPContext<?> context, SNMPMessage request, Throwable cause)
    {
        super(cause);
        this.context = context;
        this.request = request;
    }

    public SNMPContext<?> getContext()
    {
        return context;
    }

    public SNMPMessage getRequest()
    {
        return request;
    }

    public boolean isTimeout()
    {
        return false;
    }
}
