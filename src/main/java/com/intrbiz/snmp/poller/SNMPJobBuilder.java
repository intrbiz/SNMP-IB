package com.intrbiz.snmp.poller;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.intrbiz.snmp.SNMPActionable;
import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.handler.OnCollatedTable;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnResponse;
import com.intrbiz.snmp.handler.OnTable;
import com.intrbiz.snmp.handler.OnValue;

/**
 * A fluent interface to construct SNMPJobs
 */
public abstract class SNMPJobBuilder implements SNMPActionable<SNMPJob>
{    
    protected long interval = -1;
    
    protected long after = 0;
    
    protected TimeUnit unit = TimeUnit.MINUTES;
    
    public SNMPJobBuilder()
    {
        super();
    }
    
    public SNMPJobBuilder after(long after)
    {
        if (after < 0) throw new IllegalArgumentException("Initial delay cannot be < 0");
        this.after = after;
        return this;
    }
    
    public SNMPJobBuilder every(long interval)
    {
        if (interval <= 0) throw new IllegalArgumentException("Interval cannot be <= 0");
        this.interval = interval;
        return this;
    }
    
    public SNMPJobBuilder unit(TimeUnit unit)
    {
        if (unit == null) throw new IllegalArgumentException("Time unit cannot be null");
        this.unit = unit;
        return this;
    }
    
    public SNMPJobBuilder milliseconds()
    {
        return this.unit(TimeUnit.MILLISECONDS);
    }
    
    public SNMPJobBuilder seconds()
    {
        return this.unit(TimeUnit.SECONDS);
    }
    
    public SNMPJobBuilder second()
    {
        return this.unit(TimeUnit.SECONDS);
    }
    
    public SNMPJobBuilder minutes()
    {
        return this.unit(TimeUnit.MINUTES);
    }
    
    public SNMPJobBuilder minute()
    {
        return this.unit(TimeUnit.MINUTES);
    }
    
    public SNMPJobBuilder hours()
    {
        return this.unit(TimeUnit.HOURS);
    }
    
    public SNMPJobBuilder hour()
    {
        return this.unit(TimeUnit.HOURS);
    }
    
    public SNMPJobBuilder days()
    {
        return this.unit(TimeUnit.DAYS);
    }
    
    public SNMPJobBuilder day()
    {
        return this.unit(TimeUnit.DAYS);
    }
    
    /**
     * Execute the given task
     */
    public SNMPJob run(SNMPTask task)
    {
        // create and submit the task
        this.validate();
        return this.submitJob(new SNMPJob(this.unit.toMillis(this.after), this.unit.toMillis(this.interval), this.context(), task));
    }
    
    // all the SNMP actions
    
    public SNMPJob get(final OnResponse pduCallback, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(pduCallback, OIDs);
           }
        });
    }
    
    @Override
    public SNMPJob get(final OnResponse pduCallback, final OnError errorCallback, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(pduCallback, errorCallback, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getValue(final String oid, final OnValue valueCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getValue(oid, valueCallback);
           }
        });
    }

    @Override
    public SNMPJob getValue(final String OIDs, final OnValue valueCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getValue(OIDs, valueCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob get(final String OID, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(OID, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob get(final String OID, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(OID, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob get(final String[] OIDs, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(OIDs, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob get(final String[] OIDs, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.get(OIDs, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getNext(final OnResponse pduCallback, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getNext(pduCallback, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getNext(final OnResponse pduCallback, final OnError errorCallback, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getNext(pduCallback, errorCallback, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getNext(final String OID, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getNext(OID, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getNext(final String OID, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getNext(OID, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getNext(final String[] OIDs, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getNext(OIDs, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getNext(final String[] OIDs, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getNext(OIDs, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final OnResponse pduCallback, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(pduCallback, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final OnResponse pduCallback, final OnError errorCallback, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(pduCallback, errorCallback, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final String OID, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(OID, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final String OID, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(OID, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final String[] OIDs, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(OIDs, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final String[] OIDs, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(OIDs, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final OnResponse pduCallback, final int maxRepetitions, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(pduCallback, maxRepetitions, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final OnResponse pduCallback, final OnError errorCallback, final int maxRepetitions, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(pduCallback, errorCallback, maxRepetitions, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final int maxRepetitions, final String OID, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(maxRepetitions, OID, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final int maxRepetitions, final String OID, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(maxRepetitions, OID, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final int maxRepetitions, final String[] OIDs, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(maxRepetitions, OIDs, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final int maxRepetitions, final String[] OIDs, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(maxRepetitions, OIDs, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final OnResponse pduCallback, final int nonRepeaters, final int maxRepetitions, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(pduCallback, nonRepeaters, maxRepetitions, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final OnResponse pduCallback, final OnError errorCallback, final int nonRepeaters, final int maxRepetitions, final String... OIDs) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(pduCallback, errorCallback, nonRepeaters, maxRepetitions, OIDs);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final int nonRepeaters, final int maxRepetitions, final String[] OIDs, final OnResponse pduCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(nonRepeaters, maxRepetitions, OIDs, pduCallback);
           }
        });
    }

    @Override
    public SNMPJob getBulk(final int nonRepeaters, final int maxRepetitions, final String[] OIDs, final OnResponse pduCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getBulk(nonRepeaters, maxRepetitions, OIDs, pduCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getTableBulk(final String baseOID, final int maxRepetitions, final OnTable tableCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getTableBulk(baseOID, maxRepetitions, tableCallback);
           }
        });
    }

    @Override
    public SNMPJob getTableBulk(final String baseOID, final int maxRepetitions, final OnTable tableCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getTableBulk(baseOID, maxRepetitions, tableCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getTableBulk(final String baseOID, final OnTable tableCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getTableBulk(baseOID, tableCallback);
           }
        });
    }

    @Override
    public SNMPJob getTableBulk(final String baseOID, final OnTable tableCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getTableBulk(baseOID, tableCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getTable(final String baseOID, final OnTable tableCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getTable(baseOID, tableCallback);
           }
        });
    }

    @Override
    public SNMPJob getTable(final String baseOID, final OnTable tableCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getTable(baseOID, tableCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getCollatedTableBulk(final String[] baseOIDs, final int maxRepetitions, final OnCollatedTable tablesCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getCollatedTableBulk(baseOIDs, maxRepetitions, tablesCallback);
           }
        });
    }

    @Override
    public SNMPJob getCollatedTableBulk(final String[] baseOIDs, final int maxRepetitions, final OnCollatedTable tablesCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getCollatedTable(baseOIDs, maxRepetitions, tablesCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getCollatedTableBulk(final String[] baseOIDs, final OnCollatedTable tablesCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getCollatedTableBulk(baseOIDs, tablesCallback);
           }
        });
    }

    @Override
    public SNMPJob getCollatedTableBulk(final String[] baseOIDs, final OnCollatedTable tablesCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getCollatedTableBulk(baseOIDs, tablesCallback, errorCallback);
           }
        });
    }

    @Override
    public SNMPJob getCollatedTable(final String[] baseOIDs, final int maxRepetitions, final OnCollatedTable tablesCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getCollatedTable(baseOIDs, maxRepetitions, tablesCallback);
           }
        });
    }

    @Override
    public SNMPJob getCollatedTable(final String[] baseOIDs, final int maxRepetitions, final OnCollatedTable tablesCallback, final OnError errorCallback) throws IOException
    {
        return this.run(new SNMPTask()
        {
           @Override
           public void run(SNMPJob job, SNMPContext<?> context) throws IOException
           {
               context.getCollatedTable(baseOIDs, maxRepetitions, tablesCallback, errorCallback);
           }
        });
    }
    
    // submit

    protected void validate()
    {
        if (this.after < 0) throw new IllegalArgumentException("Initial delay cannot be < 0");
        if (this.interval <= 0) throw new IllegalArgumentException("Interval cannot be <= 0");
        if (this.unit == null) throw new IllegalArgumentException("Time unit cannot be null");
    }
    
    protected abstract SNMPJob submitJob(SNMPJob job);
    
    protected abstract SNMPContext<?> context();
}
