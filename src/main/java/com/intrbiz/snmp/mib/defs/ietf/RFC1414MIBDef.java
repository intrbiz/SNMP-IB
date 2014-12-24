package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class RFC1414MIBDef extends MIB
{
    public static final RFC1414MIBDef RFC1414MIB = new RFC1414MIBDef();

    public final IdentEnt ident;

    private RFC1414MIBDef()
    {
        super("RFC1414-MIB");
        this.ident = new IdentEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ident
        };
    }

    public static final class IdentEnt extends MIBEntry<RFC1414MIBDef>
    {
        /** conformance groups*/
        public final IdentInfoEnt identInfo;

        private IdentEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
        {
            super(mib, parent, "ident", "1.3.6.1.2.1.24", false, false, false, false);
            this.identInfo = new IdentInfoEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.identInfo
            };
        }
        public static final class IdentInfoEnt extends MIBEntry<RFC1414MIBDef>
        {
            /** textual conventions
none
the ident information system groupimplementation of this group is mandatory*/
            public final IdentTableEnt identTable;

            private IdentInfoEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
            {
                super(mib, parent, "identInfo", "1.3.6.1.2.1.24.1", false, false, false, false);
                this.identTable = new IdentTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.identTable
                };
            }
            public static final class IdentTableEnt extends MIBEntry<RFC1414MIBDef>
            {
                public final IdentEntryEnt identEntry;

                private IdentTableEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                {
                    super(mib, parent, "identTable", "1.3.6.1.2.1.24.1.1", false, true, false, false);
                    this.identEntry = new IdentEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.identEntry
                    };
                }
                public static final class IdentEntryEnt extends MIBEntry<RFC1414MIBDef>
                {
                    public final IdentStatusEnt identStatus;

                    public final IdentOpSysEnt identOpSys;

                    public final IdentCharsetEnt identCharset;

                    public final IdentUseridEnt identUserid;

                    public final IdentMiscEnt identMisc;

                    private IdentEntryEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                    {
                        super(mib, parent, "identEntry", "1.3.6.1.2.1.24.1.1.1", false, false, false, true);
                        this.identStatus = new IdentStatusEnt(mib, this);
                        this.identOpSys = new IdentOpSysEnt(mib, this);
                        this.identCharset = new IdentCharsetEnt(mib, this);
                        this.identUserid = new IdentUseridEnt(mib, this);
                        this.identMisc = new IdentMiscEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.identStatus,
                            this.identOpSys,
                            this.identCharset,
                            this.identUserid,
                            this.identMisc
                        };
                    }
                    public static final class IdentStatusEnt extends MIBEntry<RFC1414MIBDef>
                    {
                        private IdentStatusEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                        {
                            super(mib, parent, "identStatus", "1.3.6.1.2.1.24.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IdentOpSysEnt extends MIBEntry<RFC1414MIBDef>
                    {
                        private IdentOpSysEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                        {
                            super(mib, parent, "identOpSys", "1.3.6.1.2.1.24.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IdentCharsetEnt extends MIBEntry<RFC1414MIBDef>
                    {
                        private IdentCharsetEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                        {
                            super(mib, parent, "identCharset", "1.3.6.1.2.1.24.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IdentUseridEnt extends MIBEntry<RFC1414MIBDef>
                    {
                        private IdentUseridEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                        {
                            super(mib, parent, "identUserid", "1.3.6.1.2.1.24.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IdentMiscEnt extends MIBEntry<RFC1414MIBDef>
                    {
                        private IdentMiscEnt(RFC1414MIBDef mib, MIBEntry<RFC1414MIBDef> parent)
                        {
                            super(mib, parent, "identMisc", "1.3.6.1.2.1.24.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
