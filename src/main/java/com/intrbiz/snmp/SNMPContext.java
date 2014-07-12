package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

import com.intrbiz.snmp.handler.OnCollatedTable;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.handler.OnResponse;
import com.intrbiz.snmp.handler.OnTable;
import com.intrbiz.snmp.handler.OnValue;
import com.intrbiz.snmp.handler.ReceiveHandler;
import com.intrbiz.snmp.handler.TrapHandler;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.GetBulkRequestPDU;
import com.intrbiz.snmp.model.v2.GetNextRequestPDU;
import com.intrbiz.snmp.model.v2.GetRequestPDU;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.table.SNMPWalker;
import com.intrbiz.snmp.table.TableGrouper;

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
    
    // default error handler for this context
    
    protected OnError defaultErrorHandler = new OnError.LoggingAdapter();

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
    
    // default error handler
    
    
    public OnError getDefaultErrorHandler()
    {
        return defaultErrorHandler;
    }

    public void setDefaultErrorHandler(OnError defaultErrorHandler)
    {
        if (defaultErrorHandler == null) throw new IllegalArgumentException("The default error handler cannot be null!");
        this.defaultErrorHandler = defaultErrorHandler;
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
    protected abstract void send(SNMPMessage message, SNMPContext<?> context, OnMessage messageCallback, OnError errorCallback) throws IOException;

    // assemble the message
    public abstract void send(PDU pdu, OnMessage messageCallback, OnError errorCallback) throws IOException;

    // Get

    public void get(OnResponse pduCallback, String... OIDs) throws IOException
    {
        this.get(pduCallback, this.defaultErrorHandler, OIDs);
    }
    
    public void get(OnResponse pduCallback, OnError errorCallback, String... OIDs) throws IOException
    {
        this.get(OIDs, pduCallback, errorCallback);
    }
    
    public void getValue(String oid, OnValue valueCallback) throws IOException
    {
        this.getValue(oid, valueCallback, this.defaultErrorHandler);
    }
    
    public void getValue(String OIDs, OnValue valueCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetRequestPDU(OIDs), new OnValue.MessageAdapter(valueCallback), errorCallback);
    }

    public void get(String OID, OnResponse pduCallback) throws IOException
    {
        this.get(OID, pduCallback, this.defaultErrorHandler);
    }
    
    public void get(String OID, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetRequestPDU(OID), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void get(String[] OIDs, OnResponse pduCallback) throws IOException
    {
        this.get(OIDs, pduCallback, this.defaultErrorHandler);
    }

    public void get(String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetRequestPDU(OIDs), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }

    // Get Next
    
    public void getNext(OnResponse pduCallback, String... OIDs) throws IOException
    {
        this.getNext(pduCallback, this.defaultErrorHandler, OIDs);
    }

    public void getNext(OnResponse pduCallback, OnError errorCallback, String... OIDs) throws IOException
    {
        this.getNext(OIDs, pduCallback, errorCallback);
    }
    
    public void getNext(String OID, OnResponse pduCallback) throws IOException
    {
        this.getNext(OID, pduCallback, this.defaultErrorHandler);
    }

    public void getNext(String OID, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetNextRequestPDU(OID), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void getNext(String[] OIDs, OnResponse pduCallback) throws IOException
    {
        this.getNext(OIDs, pduCallback, this.defaultErrorHandler);
    }

    public void getNext(String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetNextRequestPDU(OIDs), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }

    // Get Bulk
    
    public void getBulk(OnResponse pduCallback, String... OIDs) throws IOException
    {
        this.getBulk(pduCallback, this.defaultErrorHandler, OIDs);
    }

    public void getBulk(OnResponse pduCallback, OnError errorCallback, String... OIDs) throws IOException
    {
        this.getBulk(OIDs, pduCallback, errorCallback);
    }
    
    public void getBulk(String OID, OnResponse pduCallback) throws IOException
    {
        this.getBulk(OID, pduCallback, this.defaultErrorHandler);
    }

    public void getBulk(String OID, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetBulkRequestPDU(OID), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void getBulk(String[] OIDs, OnResponse pduCallback) throws IOException
    {
        this.getBulk(OIDs, pduCallback, this.defaultErrorHandler);
    }

    public void getBulk(String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetBulkRequestPDU(OIDs), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void getBulk(OnResponse pduCallback, int maxRepetitions, String... OIDs) throws IOException
    {
        this.getBulk(pduCallback, this.defaultErrorHandler, maxRepetitions, OIDs);
    }

    public void getBulk(OnResponse pduCallback, OnError errorCallback, int maxRepetitions, String... OIDs) throws IOException
    {
        this.getBulk(maxRepetitions, OIDs, pduCallback, errorCallback);
    }
    
    public void getBulk(int maxRepetitions, String OID, OnResponse pduCallback) throws IOException
    {
        this.getBulk(maxRepetitions, OID, pduCallback, this.defaultErrorHandler);
    }

    public void getBulk(int maxRepetitions, String OID, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetBulkRequestPDU(maxRepetitions, OID), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void getBulk(int maxRepetitions, String[] OIDs, OnResponse pduCallback) throws IOException
    {
        this.getBulk(maxRepetitions, OIDs, pduCallback, this.defaultErrorHandler);
    }

    public void getBulk(int maxRepetitions, String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetBulkRequestPDU(maxRepetitions, OIDs), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void getBulk(OnResponse pduCallback, int nonRepeaters, int maxRepetitions, String... OIDs) throws IOException
    {
        this.getBulk(pduCallback, this.defaultErrorHandler, nonRepeaters, maxRepetitions, OIDs);
    }

    public void getBulk(OnResponse pduCallback, OnError errorCallback, int nonRepeaters, int maxRepetitions, String... OIDs) throws IOException
    {
        this.send(new GetBulkRequestPDU(nonRepeaters, maxRepetitions, OIDs), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }
    
    public void getBulk(int nonRepeaters, int maxRepetitions, String[] OIDs, OnResponse pduCallback) throws IOException
    {
        this.getBulk(nonRepeaters, maxRepetitions, OIDs, pduCallback, this.defaultErrorHandler);
    }

    public void getBulk(int nonRepeaters, int maxRepetitions, String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException
    {
        this.send(new GetBulkRequestPDU(nonRepeaters, maxRepetitions, OIDs), new OnResponse.MessageAdapter(pduCallback), errorCallback);
    }

    // walk
    
    public void getTableBulk(String baseOID, int maxRepetitions, OnTable tableCallback) throws IOException
    {
        this.getTableBulk(baseOID, tableCallback, this.defaultErrorHandler);
    }

    public void getTableBulk(String baseOID, int maxRepetitions, OnTable tableCallback, OnError errorCallback) throws IOException
    {
        this.getBulk(maxRepetitions, baseOID, new SNMPWalker(this, true, maxRepetitions, baseOID, tableCallback, errorCallback), errorCallback);
    }
    
    public void getTableBulk(String baseOID, OnTable tableCallback) throws IOException
    {
        this.getTableBulk(baseOID, tableCallback, this.defaultErrorHandler);
    }

    public void getTableBulk(String baseOID, OnTable tableCallback, OnError errorCallback) throws IOException
    {
        this.getBulk(10, baseOID, new SNMPWalker(this, true, this.isNaughtyDevice() ? 10 : 100, baseOID, tableCallback, errorCallback), errorCallback);
    }
    
    public void getTable(String baseOID, OnTable tableCallback) throws IOException
    {
        this.getTable(baseOID, tableCallback, this.defaultErrorHandler);
    }

    public void getTable(String baseOID, OnTable tableCallback, OnError errorCallback) throws IOException
    {
        this.getNext(baseOID, new SNMPWalker(this, false, 1, baseOID, tableCallback, errorCallback), errorCallback);
    }
    
    //
    
    public void getCollatedTableBulk(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback) throws IOException
    {
        this.getCollatedTable(baseOIDs, maxRepetitions, tablesCallback, this.defaultErrorHandler);
    }
    
    public void getCollatedTableBulk(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback, OnError errorCallback) throws IOException
    {
        TableGrouper grouper = new TableGrouper(baseOIDs, tablesCallback);
        for (String baseOid : baseOIDs)
        {
            this.getTableBulk(baseOid, maxRepetitions, grouper, errorCallback);
        }
    }
    
    public void getCollatedTableBulk(String[] baseOIDs, OnCollatedTable tablesCallback) throws IOException
    {
        this.getCollatedTableBulk(baseOIDs, tablesCallback, this.defaultErrorHandler);
    }
    
    public void getCollatedTableBulk(String[] baseOIDs, OnCollatedTable tablesCallback, OnError errorCallback) throws IOException
    {
        this.getCollatedTableBulk(baseOIDs, this.isNaughtyDevice() ? 10 : 100, tablesCallback, errorCallback);
    }
    
    public void getCollatedTable(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback) throws IOException
    {
        this.getCollatedTable(baseOIDs, maxRepetitions, tablesCallback, this.defaultErrorHandler);
    }
    
    public void getCollatedTable(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback, OnError errorCallback) throws IOException
    {
        TableGrouper grouper = new TableGrouper(baseOIDs, tablesCallback);
        // send the get table queries
        for (String baseOid : baseOIDs)
        {
            this.getTable(baseOid, grouper, errorCallback);
        }
    }
}
