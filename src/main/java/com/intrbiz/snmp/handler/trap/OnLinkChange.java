package com.intrbiz.snmp.handler.trap;

import java.io.IOException;
import java.net.SocketAddress;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.handler.OnValue;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.TrapPDU;
import com.intrbiz.snmp.model.v2.VarBind;

public interface OnLinkChange
{
    public enum LinkEventType
    {
        UP,
        DOWN
    }
    
    public enum LinkState
    {
        UP,
        DOWN,
        TESTING,
        UNKNOWN,
        DORMANT,
        NOT_PRESENT,
        LOWER_LAYER_DOWN;
        
        public int getCode()
        {
            return this.ordinal() + 1;
        }
        
        public static LinkState valueOf(int code)
        {
            for (LinkState ls : LinkState.values())
            {
                if (ls.getCode() == code)
                    return ls;
            }
            return null;
        }
    }
    
    public class LinkEvent
    {
        private LinkEventType eventType;
        
        private int index;
        
        private String description;
        
        private LinkState adminState;
        
        private LinkState operationalState;
        
        private long timestamp;
        
        public LinkEvent()
        {
            super();
        }
        
        public LinkEvent(LinkEventType eventType, int index, String description, LinkState adminState, LinkState operationalState, long timestamp)
        {
            super();
            this.eventType = eventType;
            this.index = index;
            this.description = description;
            this.adminState = adminState;
            this.operationalState = operationalState;
            this.timestamp = timestamp;
        }



        public LinkEventType getEventType()
        {
            return eventType;
        }

        public void setEventType(LinkEventType eventType)
        {
            this.eventType = eventType;
        }

        public int getIndex()
        {
            return index;
        }

        public void setIndex(int index)
        {
            this.index = index;
        }

        public String getDescription()
        {
            return description;
        }

        public void setDescription(String description)
        {
            this.description = description;
        }

        public LinkState getAdminState()
        {
            return adminState;
        }

        public void setAdminState(LinkState adminState)
        {
            this.adminState = adminState;
        }

        public LinkState getOperationalState()
        {
            return operationalState;
        }

        public void setOperationalState(LinkState operationalState)
        {
            this.operationalState = operationalState;
        }

        public long getTimestamp()
        {
            return timestamp;
        }

        public void setTimestamp(long timestamp)
        {
            this.timestamp = timestamp;
        }
    }
    
    void apply(LinkEvent event) throws IOException;
    
    public static class LinkTrapAdapter implements OnTrap
    {
        private final OnLinkChange handler;
        
        public LinkTrapAdapter(OnLinkChange handler)
        {
            this.handler = handler;
        }
        
        public void apply(SNMPMessage message, SocketAddress from, SNMPContext<?> context) throws IOException
        {
            if (message.getPdu() instanceof TrapPDU && context != null)
            {
                final TrapPDU trap = message.getPdu();
                if (trap.isLinkUpTrap() || trap.isLinkDownTrap())
                {
                    final int index = trap.getTrapArgument(0).getIntValue();
                    // have we got an extended trap (3com: snmp-agent trap ifmib link extended) 
                    // which is helpful enough to give us the interface description
                    VarBind ifDescr = trap.getPrefix("1.3.6.1.2.1.2.2.1.2");
                    if (ifDescr != null && ifDescr.isStringValue() && ifDescr.getStringValue() != null && ifDescr.getStringValue().length() > 0)
                    {
                        handler.apply(new LinkEvent(
                                trap.isLinkDownTrap() ? LinkEventType.DOWN : LinkEventType.UP,
                                index,
                                ifDescr.getStringValue(),
                                LinkState.valueOf(trap.getTrapArgument(1).getIntValue()),
                                LinkState.valueOf(trap.getTrapArgument(2).getIntValue()),
                                trap.getAgentUptime().getTicksMillis()
                        ));
                    }
                    else
                    {
                        // query the device for useful interface information
                        // TODO: should we be looking up name and alias
                        context.getValue("1.3.6.1.2.1.2.2.1.2." + index, new OnValue()
                        {
                            public void apply(VarBind value) throws IOException
                            {
                                handler.apply(new LinkEvent(
                                        trap.isLinkDownTrap() ? LinkEventType.DOWN : LinkEventType.UP,
                                        index,
                                        value.getStringValue(),
                                        LinkState.valueOf(trap.getTrapArgument(1).getIntValue()),
                                        LinkState.valueOf(trap.getTrapArgument(2).getIntValue()),
                                        trap.getAgentUptime().getTicksMillis()
                                ));
                            }
                        });
                    }
                }
            }
        }
    }
    
    public static class LoggingAdapter implements OnLinkChange
    {
        private final Logger logger = Logger.getLogger(LoggingAdapter.class);
        
        private final OnLinkChange next;
        
        public LoggingAdapter(OnLinkChange next)
        {
            this.next = next;
        }
        
        public LoggingAdapter()
        {
           this(null);
        }
        
        public void apply(LinkEvent event) throws IOException
        {
            this.logger.info("Got Link State Change: " + event.getEventType() + " " + event.getDescription() + " " + event.getOperationalState() + " at " + event.getTimestamp());
            if (this.next != null) this.next.apply(event);
        }
    }
}
