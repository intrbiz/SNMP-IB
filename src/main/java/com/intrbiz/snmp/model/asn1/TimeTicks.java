package com.intrbiz.snmp.model.asn1;

import java.io.IOException;
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

    private int ticks;

    public TimeTicks()
    {
        super();
    }

    public TimeTicks(int ticks)
    {
        super();
        this.ticks = ticks;
    }

    /**
     * Get the time ticks, these are ticks of 1/100s of a second
     */
    public int getTicks()
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
     * @param time
     * @param unit
     */
    public void setTicks(long time, TimeUnit unit)
    {
        this.setTicksMillis(unit.toMillis(time));
    }

    @Override
    public DERObject getDERObject()
    {
        try
        {
            return new DERApplicationSpecific(false, APPLICATION_TAG, new DERInteger(this.ticks));
        }
        catch (IOException e)
        {
        }
        return null;
    }

    public static TimeTicks fromApplicationSpecific(DERApplicationSpecific app) throws IOException
    {
        DERInteger i = (DERInteger) app.getObject(DERTags.INTEGER);
        return new TimeTicks(i.getValue().intValue());
    }
    
    public String toString()
    {
        return this.getTicks(TimeUnit.SECONDS) + "s";
    }
}
