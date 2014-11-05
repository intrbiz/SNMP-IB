package com.intrbiz.snmp.transport;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.model.SNMPMessage;

/**
 * A sub implementation of AsyncUDPTransport which uses 
 * a thread pool for executing callbacks.  This allows 
 * callbacks to take as long as they need to execute 
 * without impacting the IO thread.
 */
public class DispatchingAsyncUDPTransport extends AsyncUDPTransport
{
    private ExecutorService executor;
    
    private final Logger logger = Logger.getLogger(DispatchingAsyncUDPTransport.class);
    
    public DispatchingAsyncUDPTransport(ExecutorService executor) throws IOException
    {
        super();
        this.executor = executor;
    }

    public DispatchingAsyncUDPTransport(int port, ExecutorService executor) throws IOException
    {
        super(port);
        this.executor = executor;
    }
    
    public DispatchingAsyncUDPTransport() throws IOException
    {
        super();
        this.executor = Executors.newCachedThreadPool();
    }

    public DispatchingAsyncUDPTransport(int port) throws IOException
    {
        super(port);
        this.executor = Executors.newCachedThreadPool();
    }
    
    public ExecutorService getExecutor()
    {
        return this.executor;
    }
    
    /**
     * Execute the response callback in a thread pool
     */
    protected void invokeResponseCallback(final OnMessage callback, final SNMPMessage response)
    {
        this.executor.execute(new Runnable()
        {
            public void run()
            {
                try
                {
                    if (callback != null)  callback.apply(response);
                }
                catch (Exception e)
                {
                    logger.warn("Error during response handler", e);
                }
            }
        });
    }
    
    /**
     * Execute the timeout callback in a thread pool
     */
    protected void invokeTimeoutCallback(final OnError callback, final Throwable error)
    {
        this.executor.execute(new Runnable()
        {
            public void run()
            {
                try
                {
                    if (callback != null)  callback.apply(error);
                }
                catch (Exception ee)
                {
                    logger.warn("Error executing timeout handler", ee);
                }
            }
        });
    }
}
