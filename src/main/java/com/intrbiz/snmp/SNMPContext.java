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
import com.intrbiz.snmp.model.v2.GetBulkRequestPDU;
import com.intrbiz.snmp.model.v2.GetNextRequestPDU;
import com.intrbiz.snmp.model.v2.GetRequestPDU;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.table.SNMPWalker;

public abstract class SNMPContext
{
    protected final SNMPVersion version;

    protected final InetAddress agent;

    protected final int port;

    protected final SNMPTransport transport;

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

    protected SNMPContext(SNMPVersion version, SNMPTransport transport, InetAddress agent, int port)
    {
        super();
        this.version = version;
        this.transport = transport;
        this.agent = agent;
        this.port = port;
    }

    public SNMPVersion getVersion()
    {
        return this.version;
    }

    public boolean isVersion1()
    {
        return this.version == SNMPVersion.V1;
    }

    public boolean isVersion2()
    {
        return this.version == SNMPVersion.V2C;
    }

    public boolean isVersion3()
    {
        return this.version == SNMPVersion.V3;
    }

    public InetAddress getAgent()
    {
        return agent;
    }

    public SocketAddress getAgentSocketAddress()
    {
        return new InetSocketAddress(this.agent, this.port);
    }

    public int getPort()
    {
        return port;
    }

    public long getTimeOut()
    {
        return timeOut;
    }

    public SNMPContext setTimeOut(long timeOut)
    {
        this.timeOut = timeOut;
        return this;
    }

    public int getResendCount()
    {
        return resendCount;
    }

    public SNMPContext setResendCount(int resendCount)
    {
        this.resendCount = resendCount;
        return this;
    }

    public TrapHandler getTrapHandler()
    {
        return trapHandler;
    }

    public SNMPContext setTrapHandler(TrapHandler trapHandler)
    {
        this.trapHandler = trapHandler;
        return this;
    }

    public ReceiveHandler getReceiveHandler()
    {
        return receiveHandler;
    }

    public SNMPContext setReceiveHandler(ReceiveHandler receiveHandler)
    {
        this.receiveHandler = receiveHandler;
        return this;
    }

    public Object getUserContext()
    {
        return userContext;
    }

    public SNMPContext setUserContext(Object userContext)
    {
        this.userContext = userContext;
        return this;
    }

    //

    public int getTimeoutCount()
    {
        return timeoutCount;
    }

    public void setTimeoutCount(int timeoutCount)
    {
        this.timeoutCount = timeoutCount;
    }

    public int getErrorCount()
    {
        return errorCount;
    }

    public void setErrorCount(int errorCount)
    {
        this.errorCount = errorCount;
    }

    public int getDecodeErrorCount()
    {
        return decodeErrorCount;
    }

    public void setDecodeErrorCount(int decodeErrorCount)
    {
        this.decodeErrorCount = decodeErrorCount;
    }

    public boolean isNaughtyDevice()
    {
        return naughtyDevice;
    }

    public void setNaughtyDevice(boolean naughtyDevice)
    {
        this.naughtyDevice = naughtyDevice;
    }

    public SNMPTransport getTransport()
    {
        return this.transport;
    }

    // Internal

    // Actions

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
