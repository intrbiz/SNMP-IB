package com.intrbiz.snmp.asn1;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Minimalist ASN1 (BER) buffer
 * 
 * Currently only used to stamp in the message auth hash
 * 
 * Going forward I'd like this to be used to do the encoding and decoding
 * 
 */
public class ASNByteBuffer
{
    private final ByteBuffer buffer;
    
    private int tagPosition = 0;
    
    private ASNTag tag;
    
    private int length;

    private ASNByteBuffer(ByteBuffer buffer)
    {
        super();
        this.buffer = buffer;
    }
    
    //
    
    public int getCurrentTagPosition()
    {
        return this.tagPosition;
    }
    
    public ASNTag getCurrentTag()
    {
        return this.tag;
    }
    
    public int getCurrentLength()
    {
        return this.length;
    }

    //

    public final int capacity()
    {
        return buffer.capacity();
    }

    public final int position()
    {
        return buffer.position();
    }

    public final Buffer position(int newPosition)
    {
        return buffer.position(newPosition);
    }

    public final int limit()
    {
        return buffer.limit();
    }

    public final Buffer limit(int newLimit)
    {
        return buffer.limit(newLimit);
    }

    public final int remaining()
    {
        return buffer.remaining();
    }

    public final boolean hasRemaining()
    {
        return buffer.hasRemaining();
    }

    public final byte[] array()
    {
        return buffer.array();
    }

    public final int arrayOffset()
    {
        return buffer.arrayOffset();
    }
    
    //

    public int getInt()
    {
        return this.buffer.getInt();
    }

    public void putInt(int i)
    {
        this.buffer.putInt(i);
    }

    //

    public ASNTag nextTag()
    {
        this.tagPosition = this.buffer.position();
        this.tag = new ASNTag(this.buffer.get() & 0xFF);
        this.length = this.getASNLength();
        return this.tag;
    }
    
    public void skip()
    {
        if (this.tag != null)
        {
            this.buffer.position(this.buffer.position() + this.length);
        }
    }

    //

    protected int getASNLength()
    {
        int len = 0;
        int first = this.buffer.get() & 0xFF;
        if ((first & 0x80) == 0)
        {
            len = first & 0x7F;
        }
        else
        {
            for (int i = 0, l = (first & 0x7F); i < l; i++)
            {
                len = len << (i * 8);
                len = len | (this.buffer.get() & 0xFF);
            }
        }
        return len;
    }

    //

    public void nextASNSequence()
    {
        ASNTag tag = this.nextTag();
        tag.assume(tag.isConstructed() && tag.isSequence(), "Was expecting a constructed sequence got " + tag);
    }
    
    public void nextASNOctetString()
    {
        ASNTag tag = this.nextTag();
        tag.assume(tag.isOctetString(), "Was expecting an octet string got " + tag);
    }

    public void nextASNInt()
    {
        ASNTag tag = this.nextTag();
        tag.assume(tag.isInteger(), "Was expecting an integer got " + tag);
    }
    
    public void nextASNBoolean()
    {
        ASNTag tag = this.nextTag();
        tag.assume(tag.isBoolean(), "Was expecting an boolean got " + tag);
    }
    
    public void nextASNNull()
    {
        ASNTag tag = this.nextTag();
        tag.assume(tag.isNull(), "Was expecting an null got " + tag);
    }
    
    public void nextASNOID()
    {
        ASNTag tag = this.nextTag();
        tag.assume(tag.isOID(), "Was expecting an OID got " + tag);
    }
    
    //
    
    public int getASNInt()
    {
        this.nextASNInt();
        return this.intValue();
    }

    //
    
    public int intValue()
    {
        int val = 0;
        for (int i = 0; i < this.length; i++)
        {
            val = val << (i * 8);
            val = val | (this.buffer.get() & 0xFF);
        }
        return val;
    }
    
    public String stringValue()
    {
        return new String(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position(), this.length, SNMPUtil.ASCII);
    }
    
    public byte[] copiedBytesValue()
    {
        byte[] b = new byte[this.length];
        this.buffer.get(b);
        return b;
    }
    
    public ByteBuffer bytesValue()
    {
        return ByteBuffer.wrap(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position(), this.length);
    }
    
    public ASNByteBuffer asnValue()
    {
        return new ASNByteBuffer(this.bytesValue());
    }
    
    //
    
    public void putBytes(byte[] b)
    {
        this.buffer.put(b);
    }

    //

    public static ASNByteBuffer allocate(int capacity)
    {
        return new ASNByteBuffer(ByteBuffer.allocate(capacity));
    }

    public static ASNByteBuffer wrap(ByteBuffer buffer)
    {
        return new ASNByteBuffer(buffer);
    }

    public static ASNByteBuffer wrap(byte[] buffer)
    {
        return new ASNByteBuffer(ByteBuffer.wrap(buffer));
    }

    public static ASNByteBuffer wrap(byte[] buffer, int offset, int length)
    {
        return new ASNByteBuffer(ByteBuffer.wrap(buffer, offset, length));
    }
}
