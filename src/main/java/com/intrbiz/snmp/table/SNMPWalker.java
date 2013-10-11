package com.intrbiz.snmp.table;

import java.io.IOException;
import java.net.SocketAddress;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.handler.TableHandler;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.asn1.EndOfMIBView;
import com.intrbiz.snmp.model.asn1.NoSuchInstance;
import com.intrbiz.snmp.model.asn1.NoSuchObject;
import com.intrbiz.snmp.model.table.SNMPTable;
import com.intrbiz.snmp.model.v2.GetResponsePDU;
import com.intrbiz.snmp.model.v2.VarBind;

public class SNMPWalker implements ResponseHandler
{
    private boolean bulk = true;

    private int max;

    private final String base;

    private String last;

    private boolean complete = false;

    private final SNMPTable table;

    private final TableHandler handler;

    public SNMPWalker(boolean bulk, int max, String base, TableHandler handler)
    {
        super();
        this.bulk = bulk;
        this.max = max;
        this.base = base;
        this.handler = handler;
        this.table = new SNMPTable(this.base);
    }

    @Override
    public void handleResponse(SNMPMessage response, SocketAddress from, SNMPMessage request, SNMPContext context) throws IOException
    {
        if (!this.complete)
        {
            // add all varbinds to the table
            for (VarBind bind : ((GetResponsePDU) response.getPdu()).getVarBinds())
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
                this.handler.handleTable(this.table, context);
            }
            else
            {
                if (this.bulk) context.getBulk(this.max, this.last, this);
                else           context.getNext(this.last, this);
            }
        }
    }

    @Override
    public void handleTimeout(SNMPMessage request, SocketAddress target, SNMPContext context) throws IOException
    {
        this.handler.handleTimeout(this.base, context);
    }

}
