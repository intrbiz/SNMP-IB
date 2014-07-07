package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

import com.intrbiz.snmp.handler.ReceiveHandler;
import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.handler.TableHandler;
import com.intrbiz.snmp.handler.TrapHandler;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.GetBulkRequestPDU;
import com.intrbiz.snmp.model.v2.GetNextRequestPDU;
import com.intrbiz.snmp.model.v2.GetRequestPDU;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.table.SNMPWalker;

public abstract class SNMPContext<T extends SNMPContext<T>>
{
    protected final SNMPVersion version;

    protected final InetAddress agent;

    protected final int port;

    protected TrapHandler trapHandler;

    protected ReceiveHandler receiveHandler;

    protected long timeOut = TimeUnit.SECONDS.toMillis(5);

    protected int resendCount = 3;

    protected Object userContext;

    // error counters

    protected int timeoutCount = 0;

    protected int errorCount = 0;

    protected int decodeErrorCount = 0;

    protected boolean naughtyDevice = false;

    //

    protected SNMPContext(SNMPVersion version, InetAddress agent, int port)
    {
        super();
        this.version = version;
        this.agent = agent;
        this.port = port;
    }

    public final SNMPVersion getVersion()
    {
        return this.version;
    }

    public final boolean isVersion1()
    {
        return this.version == SNMPVersion.V1;
    }

    public final boolean isVersion2()
    {
        return this.version == SNMPVersion.V2C;
    }

    public final boolean isVersion3()
    {
        return this.version == SNMPVersion.V3;
    }

    public final InetAddress getAgent()
    {
        return agent;
    }

    public final SocketAddress getAgentSocketAddress()
    {
        return new InetSocketAddress(this.agent, this.port);
    }
    
    public abstract SNMPContextId getContextId();

    public final int getPort()
    {
        return port;
    }

    public final long getTimeOut()
    {
        return timeOut;
    }

    @SuppressWarnings("unchecked")
    public final T setTimeOut(long timeOut)
    {
        this.timeOut = timeOut;
        return (T) this;
    }

    public final int getResendCount()
    {
        return resendCount;
    }

    @SuppressWarnings("unchecked")
    public final T setResendCount(int resendCount)
    {
        this.resendCount = resendCount;
        return (T) this;
    }

    public final TrapHandler getTrapHandler()
    {
        return trapHandler;
    }

    @SuppressWarnings("unchecked")
    public final T setTrapHandler(TrapHandler trapHandler)
    {
        this.trapHandler = trapHandler;
        return (T) this;
    }

    public final ReceiveHandler getReceiveHandler()
    {
        return receiveHandler;
    }

    @SuppressWarnings("unchecked")
    public final T setReceiveHandler(ReceiveHandler receiveHandler)
    {
        this.receiveHandler = receiveHandler;
        return (T) this;
    }

    public final Object getUserContext()
    {
        return userContext;
    }

    @SuppressWarnings("unchecked")
    public final T setUserContext(Object userContext)
    {
        this.userContext = userContext;
        return (T) this;
    }

    //

    public final int getTimeoutCount()
    {
        return timeoutCount;
    }

    public final void setTimeoutCount(int timeoutCount)
    {
        this.timeoutCount = timeoutCount;
    }

    public final int getErrorCount()
    {
        return errorCount;
    }

    public final void setErrorCount(int errorCount)
    {
        this.errorCount = errorCount;
    }

    public final int getDecodeErrorCount()
    {
        return decodeErrorCount;
    }

    public final void setDecodeErrorCount(int decodeErrorCount)
    {
        this.decodeErrorCount = decodeErrorCount;
    }

    public final boolean isNaughtyDevice()
    {
        return naughtyDevice;
    }

    public final void setNaughtyDevice(boolean naughtyDevice)
    {
        this.naughtyDevice = naughtyDevice;
    }
    
    // Friendly properties
    
    /**
     * Does this context have any level of authentication.
     */
    public boolean isAuthenticated()
    {
        return false;
    }
    
    /**
     * Does this context have any level of encryption.
     */
    public boolean isEncrypted()
    {
        return false;
    }
    
    /**
     * Is this context authenticated and encrypted.
     * Note: a context is only considered secure when it 
     * is strongly authenticated and encrypted.
     */
    public boolean isSecure()
    {
        return false;
    }

    // Internal

    // Actions

    // send the message, implemented by the transport
    protected abstract void send(SNMPMessage message, SNMPContext<?> context, ResponseHandler callback) throws IOException;

    // assemble the message
    public abstract void send(PDU pdu, ResponseHandler callback) throws IOException;

    // Get

    public void get(ResponseHandler handler, String... OIDs) throws IOException
    {
        this.send(new GetRequestPDU(OIDs), handler);
    }

    public void get(String oid, ResponseHandler handler) throws IOException
    {
        this.send(new GetRequestPDU(oid), handler);
    }

    public void get(String[] oids, ResponseHandler handler) throws IOException
    {
        this.send(new GetRequestPDU(oids), handler);
    }

    // Get Next

    public void getNext(ResponseHandler handler, String... OIDs) throws IOException
    {
        this.send(new GetNextRequestPDU(OIDs), handler);
    }

    public void getNext(String oid, ResponseHandler handler) throws IOException
    {
        this.send(new GetNextRequestPDU(oid), handler);
    }

    public void getNext(String[] oids, ResponseHandler handler) throws IOException
    {
        this.send(new GetNextRequestPDU(oids), handler);
    }

    // Get Bulk

    public void getBulk(ResponseHandler handler, String... OIDs) throws IOException
    {
        this.send(new GetBulkRequestPDU(OIDs), handler);
    }

    public void getBulk(String oid, ResponseHandler handler) throws IOException
    {
        this.send(new GetBulkRequestPDU(oid), handler);
    }

    public void getBulk(String[] oids, ResponseHandler handler) throws IOException
    {
        this.send(new GetBulkRequestPDU(oids), handler);
    }

    public void getBulk(ResponseHandler handler, int maxRepetitions, String... OIDs) throws IOException
    {
        this.send(new GetBulkRequestPDU(maxRepetitions, OIDs), handler);
    }

    public void getBulk(int maxRepetitions, String oid, ResponseHandler handler) throws IOException
    {
        this.send(new GetBulkRequestPDU(maxRepetitions, oid), handler);
    }

    public void getBulk(int maxRepetitions, String[] oids, ResponseHandler handler) throws IOException
    {
        this.send(new GetBulkRequestPDU(maxRepetitions, oids), handler);
    }

    public void getBulk(ResponseHandler handler, int nonRepeaters, int maxRepetitions, String... OIDs) throws IOException
    {
        this.send(new GetBulkRequestPDU(nonRepeaters, maxRepetitions, OIDs), handler);
    }

    public void getBulk(int nonRepeaters, int maxRepetitions, String[] oids, ResponseHandler handler) throws IOException
    {
        this.send(new GetBulkRequestPDU(nonRepeaters, maxRepetitions, oids), handler);
    }

    // walk

    public void getTableBulk(String baseOid, int maxRepetitions, TableHandler handler) throws IOException
    {
        this.getBulk(maxRepetitions, baseOid, new SNMPWalker(true, maxRepetitions, baseOid, handler));
    }

    public void getTableBulk(String baseOid, TableHandler handler) throws IOException
    {
        this.getBulk(10, baseOid, new SNMPWalker(true, 10, baseOid, handler));
    }

    public void getTable(String baseOid, TableHandler handler) throws IOException
    {
        this.getNext(baseOid, new SNMPWalker(false, 1, baseOid, handler));
    }
}
