package com.intrbiz.snmp.poller;

import java.io.IOException;
import java.util.TimerTask;
import java.util.UUID;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;

public class SNMPJob extends TimerTask
{
    /**
     * The id of this job
     */
    private final UUID id = UUID.randomUUID();
    
    /**
     * The poll interval in milliseconds
     */
    private final long interval;
    
    /**
     * The initial delay in milliseconds 
     */
    private final long initial; 
    
    /**
     * The context this job belongs to
     */
    private final SNMPContext<?> context;
    
    /**
     * The task
     */
    private final SNMPTask task;
    
    public SNMPJob(long initial, long interval, SNMPContext<?> context, SNMPTask task)
    {
        super();
        this.initial = initial;
        this.interval = interval;
        this.context = context;
        this.task = task;
    }

    public UUID getId()
    {
        return id;
    }
    
    public long getInitial()
    {
        return this.initial;
    }

    public long getInterval()
    {
        return interval;
    }
    
    public SNMPContext<?> getContext()
    {
        return this.context;
    }

    public SNMPTask getTask()
    {
        return task;
    }
    
    public void run()
    {
        // run the job
        try
        {
            this.task.run(this, this.context);
        }
        catch (IOException e)
        {
            // TODO better error handling
            Logger.getLogger(SNMPJob.class).error("Error executing SNMPJob: " + this.getId(), e);
        }
    }
}
