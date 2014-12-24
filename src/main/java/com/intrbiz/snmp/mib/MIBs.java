package com.intrbiz.snmp.mib;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.mib.MIB.MIBEntry;

public final class MIBs
{
    public static final MIBs INSTANCE = new MIBs();

    public static final MIBs getInstance()
    {
        return INSTANCE;
    }

    private ConcurrentMap<String, MIBInfo> mibs = new ConcurrentHashMap<String, MIBInfo>();

    private ConcurrentMap<String, MIBInfo> aliases = new ConcurrentHashMap<String, MIBInfo>();

    private ConcurrentMap<String, MIBInfo> oids = new ConcurrentHashMap<String, MIBInfo>();

    private MIBs()
    {
        super();
        // load default MIB packs
        try
        {
            this.registerMIBPackage("iana");
            this.registerMIBPackage("ietf");
        }
        catch (Exception e)
        {
            Logger.getLogger(MIBs.class).error("Failed to load default MIB indexes", e);
        }
    }

    public void registerMIBPackage(String pack) throws IOException
    {
        InputStream stream = MIBs.class.getResourceAsStream("/com/intrbiz/snmp/mib/defs/" + pack + "/index.xml");
        if (stream != null) this.registerMIBs(stream);
    }

    public void registerMIBs(InputStream indexStream) throws IOException
    {
        try
        {
            JAXBContext ctx = JAXBContext.newInstance(MIBIndex.class, MIBInfo.class);
            Unmarshaller u = ctx.createUnmarshaller();
            MIBIndex index = (MIBIndex) u.unmarshal(indexStream);
            this.registerMIBs(index);
        }
        catch (JAXBException e)
        {
            throw new IOException("Failed to load MIB index", e);
        }
    }

    public void registerMIBs(MIBIndex index)
    {
        // sort the mibs by revision
        // try to add the last updated MIB last
        Collections.sort(index.getMibs(), new Comparator<MIBInfo>() {
            @Override
            public int compare(MIBInfo o1, MIBInfo o2)
            {
                String r1 = o1.getRevision() == null ? "" : o1.getRevision();
                String r2 = o2.getRevision() == null ? "" : o2.getRevision();
                return r1.compareTo(r2);
            }
        });
        // register the mibs
        for (MIBInfo mib : index.getMibs())
        {
            this.registerMIB(mib);
        }
    }

    public void registerMIB(MIBInfo mib)
    {
        this.mibs.put(mib.getName(), mib);
        // aliases
        for (String alias : mib.getAliases())
        {
            this.aliases.put(alias, mib);
        }
        // oid
        this.oids.put(mib.getOid(), mib);
        for (String oid : mib.getOids())
        {
            this.oids.put(oid, mib);
        }
    }

    public <T extends MIB> T getMIB(String name)
    {
        MIBInfo info = this.mibs.get(name);
        if (info == null) return null;
        return info.load();
    }

    public Collection<MIBInfo> getMIBs()
    {
        return Collections.unmodifiableCollection(this.mibs.values());
    }

    public MIBInfo lookupMIB(String oid)
    {
        return this.oids.get(oid);
    }

    public MIBInfo lookupMIBForObject(String oid)
    {
        // strip the last index off the oid
        String rawOid = oid.substring(0, oid.lastIndexOf("."));
        return this.oids.get(rawOid);
    }

    public MIBEntry<?> lookupEntry(String oid)
    {
        // get the mib
        MIBInfo mib = this.lookupMIBForObject(oid);
        if (mib == null) return null;
        MIB theMib = mib.load();
        if (theMib == null) return null;
        // lookup the entry
        return theMib.findEntryForOID(oid);
    }

    /**
     * Information about a MIB
     * 
     * This hold the actual MIB class at arms length, to avoid the MIB class being loaded by the JVM unless it is actually needed.
     * 
     */
    @XmlType(name = "mib")
    @XmlRootElement(name = "mib")
    public final static class MIBInfo
    {
        private String name;

        private List<String> aliases = new LinkedList<String>();

        private String oid;

        private List<String> oids = new LinkedList<String>();

        private String className;

        private String fieldName;

        private String description;
        
        private String revision;

        private transient MIB mibCache;

        public MIBInfo()
        {
            super();
        }

        public MIBInfo(String name, String[] aliases, String oid, String revision, String className, String fieldName, String description)
        {
            this();
            this.name = name;
            for (String alias : aliases)
            {
                this.aliases.add(alias);
            }
            this.oid = oid;
            this.revision = revision;
            this.className = className;
            this.fieldName = fieldName;
            this.description = description;
        }

        @XmlAttribute(name = "name")
        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        @XmlElement(name = "alias")
        public List<String> getAliases()
        {
            return aliases;
        }

        public void setAliases(List<String> aliases)
        {
            this.aliases = aliases;
        }

        @XmlAttribute(name = "oid")
        public String getOid()
        {
            return oid;
        }

        public void setOid(String oid)
        {
            this.oid = oid;
        }

        @XmlAttribute(name = "revision")
        public String getRevision()
        {
            return revision;
        }

        public void setRevision(String revision)
        {
            this.revision = revision;
        }

        @XmlElement(name = "oid")
        public List<String> getOids()
        {
            return oids;
        }

        public void setOids(List<String> oids)
        {
            this.oids = oids;
        }

        @XmlAttribute(name = "class-name")
        public String getClassName()
        {
            return className;
        }

        public void setClassName(String className)
        {
            this.className = className;
        }

        @XmlAttribute(name = "field-name")
        public String getFieldName()
        {
            return fieldName;
        }

        public void setFieldName(String fieldName)
        {
            this.fieldName = fieldName;
        }

        @XmlElement(name = "description")
        public String getDescription()
        {
            return description;
        }

        public void setDescription(String description)
        {
            this.description = description;
        }

        public String toString()
        {
            try
            {
                JAXBContext ctx = JAXBContext.newInstance(MIBInfo.class);
                Marshaller m = ctx.createMarshaller();
                m.setProperty(Marshaller.JAXB_FRAGMENT, true);
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter sw = new StringWriter();
                m.marshal(this, sw);
                return sw.toString();
            }
            catch (JAXBException e)
            {
            }
            return null;
        }

        @SuppressWarnings("unchecked")
        public <T extends MIB> T load()
        {
            if (this.mibCache == null)
            {
                try
                {
                    Class<?> cls = Class.forName(this.getClassName());
                    Field field = cls.getField(this.getFieldName());
                    this.mibCache = (MIB) field.get(null);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    Logger.getLogger(MIBs.class).error("Failed to load MIB class: " + this.getClassName());
                }
            }
            return (T) mibCache;
        }
    }

    @XmlType(name = "mib-index")
    @XmlRootElement(name = "mib-index")
    public final static class MIBIndex
    {
        private List<MIBInfo> mibs = new LinkedList<MIBInfo>();

        public MIBIndex()
        {
            super();
        }

        public void addMIB(MIBInfo info)
        {
            this.mibs.add(info);
        }

        @XmlElementRef(type = MIBInfo.class)
        public List<MIBInfo> getMibs()
        {
            return mibs;
        }

        public void setMibs(List<MIBInfo> mibs)
        {
            this.mibs = mibs;
        }

        public String toString()
        {
            try
            {
                JAXBContext ctx = JAXBContext.newInstance(MIBIndex.class, MIBInfo.class);
                Marshaller m = ctx.createMarshaller();
                m.setProperty(Marshaller.JAXB_FRAGMENT, true);
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter sw = new StringWriter();
                m.marshal(this, sw);
                return sw.toString();
            }
            catch (JAXBException e)
            {
            }
            return null;
        }
    }

    public static int[] parseOID(String oid)
    {
        String[] parts = oid.split("\\.");
        int[] oidInt = new int[parts.length];
        for (int i = 0; i < parts.length; i++)
        {
            oidInt[i] = Integer.parseInt(parts[i]);
        }
        return oidInt;
    }
}
