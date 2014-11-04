package com.intrbiz.snmp.mib;

import java.util.Arrays;
import java.util.Collection;

public abstract class MIB
{
    public final String name;
    
    protected MIBEntry<?>[] entries;
    
    protected MIB(String name)
    {
        super();
        this.name = name;
    }
    
    public final String name()
    {
        return name;
    }
    
    public final Collection<MIBEntry<?>> children()
    {
        return Arrays.asList(this.entries);
    }
    
    @SuppressWarnings("unchecked")
    public final <E extends MIBEntry<?>> E getByName(String name)
    {
        for (MIBEntry<?> e : this.entries)
        {
            if (name.equals(e.name))
                return (E) e;
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    public final <E extends MIBEntry<?>> E getByOID(String oid)
    {
        for (MIBEntry<?> e : this.entries)
        {
            if (oid.equals(e.oid))
                return (E) e;
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    public final <E extends MIBEntry<?>> E getByOIDPrefix(String oidPrefix)
    {
        for (MIBEntry<?> e : this.entries)
        {
            if (e.oid.startsWith(oidPrefix))
                return (E) e;
        }
        return null;
    }
    
    public String toString()
    {
        return this.name;
    }
    
    public abstract static class MIBEntry<M extends MIB>
    {
        public final M mib;
        
        public final MIBEntry<M> parent;
        
        public final String qualifiedName;
        
        public final String name;
        
        public final String oid;
        
        public final boolean scalar;
        
        public final boolean table;
        
        public final boolean tableColumn;
        
        public final boolean tableRow;
        
        protected MIBEntry<?>[] entries;
        
        protected MIBEntry(M mib, MIBEntry<M> parent, String name, String oid, boolean scalar, boolean table, boolean tableColumn, boolean tableRow)
        {
            super();
            this.mib    = mib;
            this.parent = parent;
            this.name   = name;
            this.oid    = scalar ? oid + ".0" : oid;
            this.scalar = scalar;
            this.table = table;
            this.tableColumn = tableColumn;
            this.tableRow = tableRow;
            this.qualifiedName = this.parent == null ? this.mib.name + "." + this.name : this.parent.qualifiedName + "." + this.name;
        }
        
        public final String name()
        {
            return this.name;
        }
        
        public final String qualifiedName()
        {
            return this.qualifiedName;
        }
        
        public final String oid()
        {
            return this.oid;
        }
        
        public final boolean scalar()
        {
            return this.scalar;
        }
        public final Collection<MIBEntry<?>> children()
        {
            return Arrays.asList(this.entries);
        }
        
        @SuppressWarnings("unchecked")
        public final <E extends MIBEntry<?>> E getByName(String name)
        {
            for (MIBEntry<?> e : this.entries)
            {
                if (name.equals(e.name))
                    return (E) e;
            }
            return null;
        }
        
        @SuppressWarnings("unchecked")
        public final <E extends MIBEntry<?>> E getByOID(String oid)
        {
            for (MIBEntry<?> e : this.entries)
            {
                if (oid.equals(e.oid))
                    return (E) e;
            }
            return null;
        }
        
        @SuppressWarnings("unchecked")
        public final <E extends MIBEntry<?>> E getByOIDPrefix(String oidPrefix)
        {
            for (MIBEntry<?> e : this.entries)
            {
                if (e.oid.startsWith(oidPrefix))
                    return (E) e;
            }
            return null;
        }
        
        public final M mib()
        {
            return this.mib;
        }
        
        public final MIBEntry<M> parent()
        {
            return this.parent;
        }
        
        public String toString()
        {
            return this.name + " => " + this.oid;
        }
    }
}
