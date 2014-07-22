package com.intrbiz.snmp.poller;

import java.io.IOException;

import com.intrbiz.snmp.SNMPContext;

/**
 * The SNMP-IB equivalent of Runnable
 */
public interface SNMPTask
{
    /**
     * Execute the job
     * @param job the SNMPJob that represents this task, can be used to control this task
     * @param context the SNMPContext that this task is registered against
     * @throws IOException
     */
    public void run(SNMPJob job, SNMPContext<?> context) throws IOException;
}
