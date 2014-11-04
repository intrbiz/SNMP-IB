package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DS0MIBDef extends MIB
{
    public static final DS0MIBDef DS0MIB = new DS0MIBDef();

    static { MIBs.getInstance().registerMIB(DS0MIBDef.DS0MIB); }

    /** This is the MIB module for the DS0 Interface objects.*/
    public final Ds0Ent ds0;

    private DS0MIBDef()
    {
        super("DS0-MIB");
        this.ds0 = new Ds0Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ds0
        };
    }

    public static final class Ds0Ent extends MIBEntry<DS0MIBDef>
    {
        /** The DS0 Config Group
Implementation of this group is mandatory for allsystems that use a DS0 Interface.
The DS0 Config Group consists of two tables:DS0 Configuration TableDS0 Channel Mapping Table
The DS0 Configuration Table*/
        public final Dsx0ConfigTableEnt dsx0ConfigTable;

        /** The DS0 Channel Mapping Table*/
        public final Dsx0ChanMappingTableEnt dsx0ChanMappingTable;

        /** conformance information*/
        public final Ds0ConformanceEnt ds0Conformance;

        private Ds0Ent(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
        {
            super(mib, parent, "ds0", "1.3.6.1.2.1.10.81", false, false, false, false);
            this.dsx0ConfigTable = new Dsx0ConfigTableEnt(mib, this);
            this.dsx0ChanMappingTable = new Dsx0ChanMappingTableEnt(mib, this);
            this.ds0Conformance = new Ds0ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsx0ConfigTable,
                this.dsx0ChanMappingTable,
                this.ds0Conformance
            };
        }
        public static final class Dsx0ConfigTableEnt extends MIBEntry<DS0MIBDef>
        {
            public final Dsx0ConfigEntryEnt dsx0ConfigEntry;

            private Dsx0ConfigTableEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
            {
                super(mib, parent, "dsx0ConfigTable", "1.3.6.1.2.1.10.81.1", false, true, false, false);
                this.dsx0ConfigEntry = new Dsx0ConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx0ConfigEntry
                };
            }
            public static final class Dsx0ConfigEntryEnt extends MIBEntry<DS0MIBDef>
            {
                public final Dsx0Ds0ChannelNumberEnt dsx0Ds0ChannelNumber;

                public final Dsx0RobbedBitSignallingEnt dsx0RobbedBitSignalling;

                public final Dsx0CircuitIdentifierEnt dsx0CircuitIdentifier;

                public final Dsx0IdleCodeEnt dsx0IdleCode;

                public final Dsx0SeizedCodeEnt dsx0SeizedCode;

                public final Dsx0ReceivedCodeEnt dsx0ReceivedCode;

                public final Dsx0TransmitCodesEnableEnt dsx0TransmitCodesEnable;

                public final Dsx0Ds0BundleMappedIfIndexEnt dsx0Ds0BundleMappedIfIndex;

                private Dsx0ConfigEntryEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                {
                    super(mib, parent, "dsx0ConfigEntry", "1.3.6.1.2.1.10.81.1.1", false, false, false, true);
                    this.dsx0Ds0ChannelNumber = new Dsx0Ds0ChannelNumberEnt(mib, this);
                    this.dsx0RobbedBitSignalling = new Dsx0RobbedBitSignallingEnt(mib, this);
                    this.dsx0CircuitIdentifier = new Dsx0CircuitIdentifierEnt(mib, this);
                    this.dsx0IdleCode = new Dsx0IdleCodeEnt(mib, this);
                    this.dsx0SeizedCode = new Dsx0SeizedCodeEnt(mib, this);
                    this.dsx0ReceivedCode = new Dsx0ReceivedCodeEnt(mib, this);
                    this.dsx0TransmitCodesEnable = new Dsx0TransmitCodesEnableEnt(mib, this);
                    this.dsx0Ds0BundleMappedIfIndex = new Dsx0Ds0BundleMappedIfIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx0Ds0ChannelNumber,
                        this.dsx0RobbedBitSignalling,
                        this.dsx0CircuitIdentifier,
                        this.dsx0IdleCode,
                        this.dsx0SeizedCode,
                        this.dsx0ReceivedCode,
                        this.dsx0TransmitCodesEnable,
                        this.dsx0Ds0BundleMappedIfIndex
                    };
                }
                public static final class Dsx0Ds0ChannelNumberEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0Ds0ChannelNumberEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0Ds0ChannelNumber", "1.3.6.1.2.1.10.81.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0RobbedBitSignallingEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0RobbedBitSignallingEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0RobbedBitSignalling", "1.3.6.1.2.1.10.81.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0CircuitIdentifierEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0CircuitIdentifierEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0CircuitIdentifier", "1.3.6.1.2.1.10.81.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0IdleCodeEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0IdleCodeEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0IdleCode", "1.3.6.1.2.1.10.81.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0SeizedCodeEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0SeizedCodeEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0SeizedCode", "1.3.6.1.2.1.10.81.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0ReceivedCodeEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0ReceivedCodeEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0ReceivedCode", "1.3.6.1.2.1.10.81.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0TransmitCodesEnableEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0TransmitCodesEnableEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0TransmitCodesEnable", "1.3.6.1.2.1.10.81.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0Ds0BundleMappedIfIndexEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0Ds0BundleMappedIfIndexEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0Ds0BundleMappedIfIndex", "1.3.6.1.2.1.10.81.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx0ChanMappingTableEnt extends MIBEntry<DS0MIBDef>
        {
            public final Dsx0ChanMappingEntryEnt dsx0ChanMappingEntry;

            private Dsx0ChanMappingTableEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
            {
                super(mib, parent, "dsx0ChanMappingTable", "1.3.6.1.2.1.10.81.3", false, true, false, false);
                this.dsx0ChanMappingEntry = new Dsx0ChanMappingEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx0ChanMappingEntry
                };
            }
            public static final class Dsx0ChanMappingEntryEnt extends MIBEntry<DS0MIBDef>
            {
                public final Dsx0ChanMappedIfIndexEnt dsx0ChanMappedIfIndex;

                private Dsx0ChanMappingEntryEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                {
                    super(mib, parent, "dsx0ChanMappingEntry", "1.3.6.1.2.1.10.81.3.1", false, false, false, true);
                    this.dsx0ChanMappedIfIndex = new Dsx0ChanMappedIfIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx0ChanMappedIfIndex
                    };
                }
                public static final class Dsx0ChanMappedIfIndexEnt extends MIBEntry<DS0MIBDef>
                {
                    private Dsx0ChanMappedIfIndexEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "dsx0ChanMappedIfIndex", "1.3.6.1.2.1.10.81.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Ds0ConformanceEnt extends MIBEntry<DS0MIBDef>
        {
            public final Ds0GroupsEnt ds0Groups;

            public final Ds0CompliancesEnt ds0Compliances;

            private Ds0ConformanceEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
            {
                super(mib, parent, "ds0Conformance", "1.3.6.1.2.1.10.81.2", false, false, false, false);
                this.ds0Groups = new Ds0GroupsEnt(mib, this);
                this.ds0Compliances = new Ds0CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ds0Groups,
                    this.ds0Compliances
                };
            }
            public static final class Ds0GroupsEnt extends MIBEntry<DS0MIBDef>
            {
                /** units of conformance*/
                public final Ds0ConfigGroupEnt ds0ConfigGroup;

                private Ds0GroupsEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                {
                    super(mib, parent, "ds0Groups", "1.3.6.1.2.1.10.81.2.1", false, false, false, false);
                    this.ds0ConfigGroup = new Ds0ConfigGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds0ConfigGroup
                    };
                }
                public static final class Ds0ConfigGroupEnt extends MIBEntry<DS0MIBDef>
                {
                    private Ds0ConfigGroupEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "ds0ConfigGroup", "1.3.6.1.2.1.10.81.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ds0CompliancesEnt extends MIBEntry<DS0MIBDef>
            {
                /** compliance statements*/
                public final Ds0ComplianceEnt ds0Compliance;

                private Ds0CompliancesEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                {
                    super(mib, parent, "ds0Compliances", "1.3.6.1.2.1.10.81.2.2", false, false, false, false);
                    this.ds0Compliance = new Ds0ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds0Compliance
                    };
                }
                public static final class Ds0ComplianceEnt extends MIBEntry<DS0MIBDef>
                {
                    private Ds0ComplianceEnt(DS0MIBDef mib, MIBEntry<DS0MIBDef> parent)
                    {
                        super(mib, parent, "ds0Compliance", "1.3.6.1.2.1.10.81.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
