package com.intrbiz.snmp.table;

import java.io.IOException;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnResponse;
import com.intrbiz.snmp.handler.OnTable;
import com.intrbiz.snmp.model.asn1.EndOfMIBView;
import com.intrbiz.snmp.model.asn1.NoSuchInstance;
import com.intrbiz.snmp.model.asn1.NoSuchObject;
import com.intrbiz.snmp.model.table.SNMPTable;
import com.intrbiz.snmp.model.v2.GetResponsePDU;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v2.VarBind;

public class SNMPWalker implements OnResponse
{
    private boolean bulk = true;

    private int max;

    private final String base;

    private String last;

    private boolean complete = false;

    private final SNMPTable table;

    private final OnTable handler;
    
    private final SNMPContext<?> context;
    
    private final OnError error;

    public SNMPWalker(SNMPContext<?> context, boolean bulk, int max, String base, OnTable handler, OnError error)
    {
        super();
        this.context = context;
        this.bulk = bulk;
        this.max = max;
        this.base = base;
        this.handler = handler;
        this.error = error;
        this.table = new SNMPTable(this.base);
    }

    @Override
    public void apply(PDU pdu) throws IOException
    {
        if (!this.complete)
        {
            // add all varbinds to the table
            for (VarBind bind : ((GetResponsePDU) pdu))
            {
                // stop if we hit any error
                if (bind.getObjectValue() instanceof EndOfMIBView || bind.getObjectValue() instanceof NoSuchObject || bind.getObjectValue() instanceof NoSuchInstance)
                {
                    this.complete = true;
                    break;
                }
                else
                {
                    // compare the next varbind to the base
                    this.last = bind.getObjectName();
                    if (this.last.startsWith(this.base) && (!this.base.equals(this.last)))
                    {
                        this.table.add(bind);
                    }
                    else
                    {
                        this.complete = true;
                        break;
                    }
                }
            }
            // get the next batch if needed
            if (this.complete)
            {
                this.handler.apply(this.table);
            }
            else
            {
                if (this.bulk) context.getBulk(this.max, this.last, this, this.error);
                else           context.getNext(this.last, this, this.error);
            }
        }
    }
}
