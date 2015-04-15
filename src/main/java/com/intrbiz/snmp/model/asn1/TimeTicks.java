package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTags;

/**
 * A representation of the SNMP TimeTicks unit
 * 
 * A TimeTick is the number of 1/100s of a second since an epoch
 * 
 */
public class TimeTicks implements DEREncodable
{
    public static final int APPLICATION_TAG = 3;

    private long ticks;

    public TimeTicks()
    {
        super();
    }

    public TimeTicks(long ticks)
    {
        super();
        this.ticks = ticks;
    }

    /**
     * Get the time ticks, these are ticks of 1/100s of a second
     */
    public long getTicks()
    {
        return ticks;
    }

    /**
     * Set the time ticks, these are ticks of 1/100s of a second
     */
    public void setTicks(int ticks)
    {
        this.ticks = ticks;
    }

    /**
     * Get the ticks converted to milliseconds
     */
    public long getTicksMillis()
    {
        // 10 milliseconds in a 1/100 of a second
        return ((long) this.ticks) * 10;
    }

    /**
     * Set the ticks as milliseconds which are converted 1/100s of a second
     * 
     * @param millis
     */
    public void setTicksMillis(long millis)
    {
        this.ticks = (int) (millis / 10);
    }

    /**
     * Get the ticks converted to the given unit
     */
    public long getTicks(TimeUnit unit)
    {
        return unit.convert(this.getTicksMillis(), TimeUnit.MILLISECONDS);
    }

    /**
     * Set the tick using the given unit which are then converted to 1/100s of a second
     * 
     * @param time
     * @param unit
     */
    public void setTicks(long time, TimeUnit unit)
    {
        this.setTicksMillis(unit.toMillis(time));
    }
    
    /**
     * Get the TimeTicks as an interval of time: days:hours:minutes:seconds.milliseconds
     * @return the Interval of this TimeTicks
     */
    public Interval toInterval()
    {
        return new Interval(this.getTicksMillis());
    }

    @Override
    public DERObject getDERObject()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new DERInteger(BigInteger.valueOf(this.ticks)));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static TimeTicks fromApplicationSpecific(DERApplicationSpecific app) throws IOException
    {
        DERInteger i = (DERInteger) app.getObject(DERTags.INTEGER);
        return new TimeTicks(i.getPositiveValue().longValue());
    }

    public String toString()
    {
        return this.toInterval().toString();
    }

    public static class Interval
    {
        private static DecimalFormat DF = new DecimalFormat("00");

        private final long days;

        private final long hours;

        private final long minutes;

        private final long seconds;

        private final long milliseconds;

        public Interval(long millis)
        {
            this.milliseconds =  millis % 1000L;
            this.seconds      = (millis / 1000L) % 60L;
            this.minutes      = (millis / 60_000L) % 60L;
            this.hours        = (millis / 3600_000L) % 24L;
            this.days         =  millis / 86_400_000L;
        }

        public long getDays()
        {
            return days;
        }

        public long getHours()
        {
            return hours;
        }

        public long getMinutes()
        {
            return minutes;
        }

        public long getSeconds()
        {
            return seconds;
        }

        public long getMilliseconds()
        {
            return milliseconds;
        }

        public String toString()
        {
            return DF.format(this.days) + ":" + DF.format(this.hours) + ":" + DF.format(this.minutes) + ":" + DF.format(this.seconds) + "." + DF.format(this.milliseconds);
        }
    }
}
