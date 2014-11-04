package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**{atmMIB 3} has been used by [19].*/
public final class ATMMIBDef extends MIB
{
    public static final ATMMIBDef ATMMIB = new ATMMIBDef();

    static { MIBs.getInstance().registerMIB(ATMMIBDef.ATMMIB); }

    public final AtmMIBEnt atmMIB;

    private ATMMIBDef()
    {
        super("ATM-MIB");
        this.atmMIB = new AtmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.atmMIB
        };
    }

    public static final class AtmMIBEnt extends MIBEntry<ATMMIBDef>
    {
        public final AtmMIBObjectsEnt atmMIBObjects;

        /** Conformance Information*/
        public final AtmMIBConformanceEnt atmMIBConformance;

        private AtmMIBEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
        {
            super(mib, parent, "atmMIB", "1.3.6.1.2.1.37", false, false, false, false);
            this.atmMIBObjects = new AtmMIBObjectsEnt(mib, this);
            this.atmMIBConformance = new AtmMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.atmMIBObjects,
                this.atmMIBConformance
            };
        }
        public static final class AtmMIBObjectsEnt extends MIBEntry<ATMMIBDef>
        {
            /** {atmMIBObjects 1} has been moved to a separatespecification [19].

This ATM MIB Module consists of the following tables:(1) ATM Interface configuration table(2) ATM Interface DS3 PLCP table(3) ATM Interface TC Sublayer table
(4) Atm Traffic Descriptor table(5) ATM Interface VPL configuration table(6) ATM Interface VCL configuration table(7) ATM VP Cross Connect table (for PVCs)(8) ATM VC Cross Connect table (for PVCs)(9) ATM Interface AAL5 VCC performance statisticstable
ATM Interface Configuration Parameters Table
This table contains ATM specificconfiguration information associated withan ATM interface beyond thosesupported using the ifTable.*/
            public final AtmInterfaceConfTableEnt atmInterfaceConfTable;

            /** The ATM Interface DS3 PLCP Table
This table contains the DS3 PLCP configuration andstate parameters of those ATM interfaceswhich use DS3 PLCP for carrying ATM cells over DS3.*/
            public final AtmInterfaceDs3PlcpTableEnt atmInterfaceDs3PlcpTable;

            /** The ATM Interface TC Sublayer Table
This table contains TC sublayer configuration andstate parameters of those ATM interfaceswhich use TC sublayer for carrying ATM cells overSONET/SDH or DS3.*/
            public final AtmInterfaceTCTableEnt atmInterfaceTCTable;

            /** ATM Traffic Descriptor Parameter Table
This table contains a set of self-consistentATM traffic parameters including theATM traffic service category.
The ATM virtual link tables (i.e., VPL and VCL tables)will use this ATM Traffic Descriptor tableto assign traffic parameters and service categoryto the receive and transmit directions ofthe ATM virtual links (i.e., VPLs and VCLs).The ATM VPL or VCL table will indicate a rowin the atmTrafficDescrParamTableusing its atmTrafficDescrParamIndex value.
The management application can then compare a set ofATM traffic parameters with a single value.
If no suitable row(s) in the atmTrafficDescrParamTableexists, the manager must create a new row(s) in thistable. If such a row is created, agent checks thesanity of that set of ATM traffic parameter values.
The manager may use atmTrafficDescrParamIndexNextin order to obtain a free atmTrafficDescrParamIndexvalue.
When creating a new row, the parameter valueswill be checked for self-consistency.Predefined/template rows may be supported.
A row in the atmTrafficDescrParamTable is deletedby setting the atmTrafficDescrRowStatus to destroy(6).The agent will check whether this row is still in useby any entry of the atmVplTable or atmVclTable.The agent denies the request if the row is still inuse.
The ATM Traffic Descriptor Parameter Table*/
            public final AtmTrafficDescrParamTableEnt atmTrafficDescrParamTable;

            /** ATM Interface Virtual Path Link (VPL) Table
This table contains configuration and stateinformation of a bi-directional Virtual Path Link(VPL)
This table can be used to create, delete or modifya VPL that is terminated in an ATM host or switch.This table can also be used to create, delete ormodify a VPL which is cross-connected to anotherVPL.
In the example below, the traffic flows on the receiveand transmit directions of the VPLs are characterizedby atmVplReceiveTrafficDescrIndex andatmVplTransmitTrafficDescrIndex respectively.The cross-connected VPLs are identified byatmVplCrossConnectIdentifier.


________________________________|                              |VPL      | ATM Host, Switch, or Network |   VPLreceive   |                              |  receive========> X                              X <=======<======== X                              X ========>transmit  |                              |  transmit|______________________________|


The ATM Interface VPL Table*/
            public final AtmVplTableEnt atmVplTable;

            /** ATM Interface Virtual Channel Link (VCL) Table
This table contains configuration and stateinformation of a bi-directional Virtual ChannelLink (VCL) at an ATM interface.
This table can be used to create, delete or modifya VCL that is terminated in an ATM host or switch.This table can also beused to create, delete or modify a VCL that iscross-connected to another VCL.

The ATM Interface VCL Table*/
            public final AtmVclTableEnt atmVclTable;

            /** ATM Virtual Path (VP) Cross Connect Table
This table contains configuration and stateinformation of point-to-point,point-to-multipoint, or multipoint-to-multipointVP cross-connects for PVCs.
This table has read-create access and can be usedto cross-connect the VPLs together in an ATM switchor network. The atmVpCrossConnectIndexis used to associate the relatedVPLs that are cross-connected together.
The ATM VP Cross Connect Tablemodels each bi-directional VPCcross-connect as a set of entries inthe atmVpCrossConnectTable. Apoint-to-point VPC cross-connect is modeledas one entry; a point-to-multipoint (N leafs) VPCcross-connect as N entries in this table; anda multipoint-to-multipoint (N parties) VPC cross-connect as N(N-1)/2 entries in this table.In the latter cases, all the N (or N(N-1)/2) entriesare associated with a single VPC cross-connect byhaving the same value of atmVpCrossConnectIndex.

_________________________________________|                                       |Low |         ATM Switch or Network         | Highport|                                       | port_____|>> from low to high VPC traffic flow >>|______|<< from high to low VPC traffic flow <<||                                       ||_______________________________________|
The terms low and high are chosen to representnumerical ordering of the two interfaces associatedwith a VPC cross-connect. That is, the ATM interfacewith the lower value of ifIndex is termed 'low',while the other ATM interface associated with theVPC cross-connect is termed 'high'. This terminology
is used to provide directional information; forexample, the atmVpCrossConnectL2HOperStatus appliesto the low->high direction, andatmVpCrossConnectH2LOperStatus applies to thehigh->low  direction, as illustrated above.*/
            public final AtmVpCrossConnectIndexNextEnt atmVpCrossConnectIndexNext;

            /** The ATM VP Cross Connect Table*/
            public final AtmVpCrossConnectTableEnt atmVpCrossConnectTable;

            /** ATM Virtual Channel (VC) Cross Connect Table
This table contains configuration and stateinformation of point-to-point,point-to-multipoint or multipoint-to-multipointVC cross-connects for PVCs.
This table has read-create access and is usedto cross-connect the VCLs together in an ATM switchor network that belong to a VC connection.The atmVcCrossConnectIndex is used to associatethe related VCLs that are cross-connected together.


The model using step-wise procedures described for settingup a VP cross-connect is also used for setting upa VC cross-connect.*/
            public final AtmVcCrossConnectIndexNextEnt atmVcCrossConnectIndexNext;

            /** The ATM VC Cross Connect Table*/
            public final AtmVcCrossConnectTableEnt atmVcCrossConnectTable;

            /** AAL5 Virtual Channel Connection Performance Statistics
Table
This table contains the AAL5performance statistics of a VCC at theinterface associated with an AAL5 entity in an ATMhost or ATM switch.*/
            public final Aal5VccTableEnt aal5VccTable;

            /** The following object may be used in conjunction withthe atmTrafficDescrParamTable for the creation of
new table entries.*/
            public final AtmTrafficDescrParamIndexNextEnt atmTrafficDescrParamIndexNext;

            private AtmMIBObjectsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
            {
                super(mib, parent, "atmMIBObjects", "1.3.6.1.2.1.37.1", false, false, false, false);
                this.atmInterfaceConfTable = new AtmInterfaceConfTableEnt(mib, this);
                this.atmInterfaceDs3PlcpTable = new AtmInterfaceDs3PlcpTableEnt(mib, this);
                this.atmInterfaceTCTable = new AtmInterfaceTCTableEnt(mib, this);
                this.atmTrafficDescrParamTable = new AtmTrafficDescrParamTableEnt(mib, this);
                this.atmVplTable = new AtmVplTableEnt(mib, this);
                this.atmVclTable = new AtmVclTableEnt(mib, this);
                this.atmVpCrossConnectIndexNext = new AtmVpCrossConnectIndexNextEnt(mib, this);
                this.atmVpCrossConnectTable = new AtmVpCrossConnectTableEnt(mib, this);
                this.atmVcCrossConnectIndexNext = new AtmVcCrossConnectIndexNextEnt(mib, this);
                this.atmVcCrossConnectTable = new AtmVcCrossConnectTableEnt(mib, this);
                this.aal5VccTable = new Aal5VccTableEnt(mib, this);
                this.atmTrafficDescrParamIndexNext = new AtmTrafficDescrParamIndexNextEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atmInterfaceConfTable,
                    this.atmInterfaceDs3PlcpTable,
                    this.atmInterfaceTCTable,
                    this.atmTrafficDescrParamTable,
                    this.atmVplTable,
                    this.atmVclTable,
                    this.atmVpCrossConnectIndexNext,
                    this.atmVpCrossConnectTable,
                    this.atmVcCrossConnectIndexNext,
                    this.atmVcCrossConnectTable,
                    this.aal5VccTable,
                    this.atmTrafficDescrParamIndexNext
                };
            }
            public static final class AtmInterfaceConfTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmInterfaceConfEntryEnt atmInterfaceConfEntry;

                private AtmInterfaceConfTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmInterfaceConfTable", "1.3.6.1.2.1.37.1.2", false, true, false, false);
                    this.atmInterfaceConfEntry = new AtmInterfaceConfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmInterfaceConfEntry
                    };
                }
                public static final class AtmInterfaceConfEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmInterfaceMaxVpcsEnt atmInterfaceMaxVpcs;

                    public final AtmInterfaceMaxVccsEnt atmInterfaceMaxVccs;

                    public final AtmInterfaceConfVpcsEnt atmInterfaceConfVpcs;

                    public final AtmInterfaceConfVccsEnt atmInterfaceConfVccs;

                    public final AtmInterfaceMaxActiveVpiBitsEnt atmInterfaceMaxActiveVpiBits;

                    public final AtmInterfaceMaxActiveVciBitsEnt atmInterfaceMaxActiveVciBits;

                    public final AtmInterfaceIlmiVpiEnt atmInterfaceIlmiVpi;

                    public final AtmInterfaceIlmiVciEnt atmInterfaceIlmiVci;

                    public final AtmInterfaceAddressTypeEnt atmInterfaceAddressType;

                    /** The atmInterfaceAdminAddress object has been replaced byatmInterfaceSubscrAddress.*/
                    public final AtmInterfaceAdminAddressEnt atmInterfaceAdminAddress;

                    public final AtmInterfaceMyNeighborIpAddressEnt atmInterfaceMyNeighborIpAddress;

                    public final AtmInterfaceMyNeighborIfNameEnt atmInterfaceMyNeighborIfName;

                    public final AtmInterfaceCurrentMaxVpiBitsEnt atmInterfaceCurrentMaxVpiBits;

                    public final AtmInterfaceCurrentMaxVciBitsEnt atmInterfaceCurrentMaxVciBits;

                    public final AtmInterfaceSubscrAddressEnt atmInterfaceSubscrAddress;

                    private AtmInterfaceConfEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceConfEntry", "1.3.6.1.2.1.37.1.2.1", false, false, false, true);
                        this.atmInterfaceMaxVpcs = new AtmInterfaceMaxVpcsEnt(mib, this);
                        this.atmInterfaceMaxVccs = new AtmInterfaceMaxVccsEnt(mib, this);
                        this.atmInterfaceConfVpcs = new AtmInterfaceConfVpcsEnt(mib, this);
                        this.atmInterfaceConfVccs = new AtmInterfaceConfVccsEnt(mib, this);
                        this.atmInterfaceMaxActiveVpiBits = new AtmInterfaceMaxActiveVpiBitsEnt(mib, this);
                        this.atmInterfaceMaxActiveVciBits = new AtmInterfaceMaxActiveVciBitsEnt(mib, this);
                        this.atmInterfaceIlmiVpi = new AtmInterfaceIlmiVpiEnt(mib, this);
                        this.atmInterfaceIlmiVci = new AtmInterfaceIlmiVciEnt(mib, this);
                        this.atmInterfaceAddressType = new AtmInterfaceAddressTypeEnt(mib, this);
                        this.atmInterfaceAdminAddress = new AtmInterfaceAdminAddressEnt(mib, this);
                        this.atmInterfaceMyNeighborIpAddress = new AtmInterfaceMyNeighborIpAddressEnt(mib, this);
                        this.atmInterfaceMyNeighborIfName = new AtmInterfaceMyNeighborIfNameEnt(mib, this);
                        this.atmInterfaceCurrentMaxVpiBits = new AtmInterfaceCurrentMaxVpiBitsEnt(mib, this);
                        this.atmInterfaceCurrentMaxVciBits = new AtmInterfaceCurrentMaxVciBitsEnt(mib, this);
                        this.atmInterfaceSubscrAddress = new AtmInterfaceSubscrAddressEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmInterfaceMaxVpcs,
                            this.atmInterfaceMaxVccs,
                            this.atmInterfaceConfVpcs,
                            this.atmInterfaceConfVccs,
                            this.atmInterfaceMaxActiveVpiBits,
                            this.atmInterfaceMaxActiveVciBits,
                            this.atmInterfaceIlmiVpi,
                            this.atmInterfaceIlmiVci,
                            this.atmInterfaceAddressType,
                            this.atmInterfaceAdminAddress,
                            this.atmInterfaceMyNeighborIpAddress,
                            this.atmInterfaceMyNeighborIfName,
                            this.atmInterfaceCurrentMaxVpiBits,
                            this.atmInterfaceCurrentMaxVciBits,
                            this.atmInterfaceSubscrAddress
                        };
                    }
                    public static final class AtmInterfaceMaxVpcsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceMaxVpcsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceMaxVpcs", "1.3.6.1.2.1.37.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceMaxVccsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceMaxVccsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceMaxVccs", "1.3.6.1.2.1.37.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceConfVpcsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceConfVpcsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceConfVpcs", "1.3.6.1.2.1.37.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceConfVccsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceConfVccsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceConfVccs", "1.3.6.1.2.1.37.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceMaxActiveVpiBitsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceMaxActiveVpiBitsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceMaxActiveVpiBits", "1.3.6.1.2.1.37.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceMaxActiveVciBitsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceMaxActiveVciBitsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceMaxActiveVciBits", "1.3.6.1.2.1.37.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceIlmiVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceIlmiVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceIlmiVpi", "1.3.6.1.2.1.37.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceIlmiVciEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceIlmiVciEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceIlmiVci", "1.3.6.1.2.1.37.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceAddressTypeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceAddressTypeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceAddressType", "1.3.6.1.2.1.37.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceAdminAddressEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceAdminAddressEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceAdminAddress", "1.3.6.1.2.1.37.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceMyNeighborIpAddressEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceMyNeighborIpAddressEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceMyNeighborIpAddress", "1.3.6.1.2.1.37.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceMyNeighborIfNameEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceMyNeighborIfNameEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceMyNeighborIfName", "1.3.6.1.2.1.37.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceCurrentMaxVpiBitsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceCurrentMaxVpiBitsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceCurrentMaxVpiBits", "1.3.6.1.2.1.37.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceCurrentMaxVciBitsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceCurrentMaxVciBitsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceCurrentMaxVciBits", "1.3.6.1.2.1.37.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceSubscrAddressEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceSubscrAddressEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceSubscrAddress", "1.3.6.1.2.1.37.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmInterfaceDs3PlcpTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmInterfaceDs3PlcpEntryEnt atmInterfaceDs3PlcpEntry;

                private AtmInterfaceDs3PlcpTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmInterfaceDs3PlcpTable", "1.3.6.1.2.1.37.1.3", false, true, false, false);
                    this.atmInterfaceDs3PlcpEntry = new AtmInterfaceDs3PlcpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmInterfaceDs3PlcpEntry
                    };
                }
                public static final class AtmInterfaceDs3PlcpEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmInterfaceDs3PlcpSEFSsEnt atmInterfaceDs3PlcpSEFSs;

                    public final AtmInterfaceDs3PlcpAlarmStateEnt atmInterfaceDs3PlcpAlarmState;

                    public final AtmInterfaceDs3PlcpUASsEnt atmInterfaceDs3PlcpUASs;

                    private AtmInterfaceDs3PlcpEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceDs3PlcpEntry", "1.3.6.1.2.1.37.1.3.1", false, false, false, true);
                        this.atmInterfaceDs3PlcpSEFSs = new AtmInterfaceDs3PlcpSEFSsEnt(mib, this);
                        this.atmInterfaceDs3PlcpAlarmState = new AtmInterfaceDs3PlcpAlarmStateEnt(mib, this);
                        this.atmInterfaceDs3PlcpUASs = new AtmInterfaceDs3PlcpUASsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmInterfaceDs3PlcpSEFSs,
                            this.atmInterfaceDs3PlcpAlarmState,
                            this.atmInterfaceDs3PlcpUASs
                        };
                    }
                    public static final class AtmInterfaceDs3PlcpSEFSsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceDs3PlcpSEFSsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceDs3PlcpSEFSs", "1.3.6.1.2.1.37.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceDs3PlcpAlarmStateEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceDs3PlcpAlarmStateEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceDs3PlcpAlarmState", "1.3.6.1.2.1.37.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceDs3PlcpUASsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceDs3PlcpUASsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceDs3PlcpUASs", "1.3.6.1.2.1.37.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmInterfaceTCTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmInterfaceTCEntryEnt atmInterfaceTCEntry;

                private AtmInterfaceTCTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmInterfaceTCTable", "1.3.6.1.2.1.37.1.4", false, true, false, false);
                    this.atmInterfaceTCEntry = new AtmInterfaceTCEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmInterfaceTCEntry
                    };
                }
                public static final class AtmInterfaceTCEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmInterfaceOCDEventsEnt atmInterfaceOCDEvents;

                    public final AtmInterfaceTCAlarmStateEnt atmInterfaceTCAlarmState;

                    private AtmInterfaceTCEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceTCEntry", "1.3.6.1.2.1.37.1.4.1", false, false, false, true);
                        this.atmInterfaceOCDEvents = new AtmInterfaceOCDEventsEnt(mib, this);
                        this.atmInterfaceTCAlarmState = new AtmInterfaceTCAlarmStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmInterfaceOCDEvents,
                            this.atmInterfaceTCAlarmState
                        };
                    }
                    public static final class AtmInterfaceOCDEventsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceOCDEventsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceOCDEvents", "1.3.6.1.2.1.37.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceTCAlarmStateEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmInterfaceTCAlarmStateEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceTCAlarmState", "1.3.6.1.2.1.37.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmTrafficDescrParamTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmTrafficDescrParamEntryEnt atmTrafficDescrParamEntry;

                private AtmTrafficDescrParamTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmTrafficDescrParamTable", "1.3.6.1.2.1.37.1.5", false, true, false, false);
                    this.atmTrafficDescrParamEntry = new AtmTrafficDescrParamEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmTrafficDescrParamEntry
                    };
                }
                public static final class AtmTrafficDescrParamEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmTrafficDescrParamIndexEnt atmTrafficDescrParamIndex;

                    public final AtmTrafficDescrTypeEnt atmTrafficDescrType;

                    public final AtmTrafficDescrParam1Ent atmTrafficDescrParam1;

                    public final AtmTrafficDescrParam2Ent atmTrafficDescrParam2;

                    public final AtmTrafficDescrParam3Ent atmTrafficDescrParam3;

                    public final AtmTrafficDescrParam4Ent atmTrafficDescrParam4;

                    public final AtmTrafficDescrParam5Ent atmTrafficDescrParam5;

                    public final AtmTrafficQoSClassEnt atmTrafficQoSClass;

                    public final AtmTrafficDescrRowStatusEnt atmTrafficDescrRowStatus;

                    public final AtmServiceCategoryEnt atmServiceCategory;

                    public final AtmTrafficFrameDiscardEnt atmTrafficFrameDiscard;

                    private AtmTrafficDescrParamEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmTrafficDescrParamEntry", "1.3.6.1.2.1.37.1.5.1", false, false, false, true);
                        this.atmTrafficDescrParamIndex = new AtmTrafficDescrParamIndexEnt(mib, this);
                        this.atmTrafficDescrType = new AtmTrafficDescrTypeEnt(mib, this);
                        this.atmTrafficDescrParam1 = new AtmTrafficDescrParam1Ent(mib, this);
                        this.atmTrafficDescrParam2 = new AtmTrafficDescrParam2Ent(mib, this);
                        this.atmTrafficDescrParam3 = new AtmTrafficDescrParam3Ent(mib, this);
                        this.atmTrafficDescrParam4 = new AtmTrafficDescrParam4Ent(mib, this);
                        this.atmTrafficDescrParam5 = new AtmTrafficDescrParam5Ent(mib, this);
                        this.atmTrafficQoSClass = new AtmTrafficQoSClassEnt(mib, this);
                        this.atmTrafficDescrRowStatus = new AtmTrafficDescrRowStatusEnt(mib, this);
                        this.atmServiceCategory = new AtmServiceCategoryEnt(mib, this);
                        this.atmTrafficFrameDiscard = new AtmTrafficFrameDiscardEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmTrafficDescrParamIndex,
                            this.atmTrafficDescrType,
                            this.atmTrafficDescrParam1,
                            this.atmTrafficDescrParam2,
                            this.atmTrafficDescrParam3,
                            this.atmTrafficDescrParam4,
                            this.atmTrafficDescrParam5,
                            this.atmTrafficQoSClass,
                            this.atmTrafficDescrRowStatus,
                            this.atmServiceCategory,
                            this.atmTrafficFrameDiscard
                        };
                    }
                    public static final class AtmTrafficDescrParamIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrParamIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrParamIndex", "1.3.6.1.2.1.37.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrTypeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrTypeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrType", "1.3.6.1.2.1.37.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrParam1Ent extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrParam1Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrParam1", "1.3.6.1.2.1.37.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrParam2Ent extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrParam2Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrParam2", "1.3.6.1.2.1.37.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrParam3Ent extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrParam3Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrParam3", "1.3.6.1.2.1.37.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrParam4Ent extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrParam4Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrParam4", "1.3.6.1.2.1.37.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrParam5Ent extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrParam5Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrParam5", "1.3.6.1.2.1.37.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficQoSClassEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficQoSClassEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficQoSClass", "1.3.6.1.2.1.37.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficDescrRowStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficDescrRowStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficDescrRowStatus", "1.3.6.1.2.1.37.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmServiceCategoryEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmServiceCategoryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmServiceCategory", "1.3.6.1.2.1.37.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmTrafficFrameDiscardEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmTrafficFrameDiscardEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmTrafficFrameDiscard", "1.3.6.1.2.1.37.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVplTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmVplEntryEnt atmVplEntry;

                private AtmVplTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmVplTable", "1.3.6.1.2.1.37.1.6", false, true, false, false);
                    this.atmVplEntry = new AtmVplEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVplEntry
                    };
                }
                public static final class AtmVplEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmVplVpiEnt atmVplVpi;

                    public final AtmVplAdminStatusEnt atmVplAdminStatus;

                    public final AtmVplOperStatusEnt atmVplOperStatus;

                    public final AtmVplLastChangeEnt atmVplLastChange;

                    public final AtmVplReceiveTrafficDescrIndexEnt atmVplReceiveTrafficDescrIndex;

                    public final AtmVplTransmitTrafficDescrIndexEnt atmVplTransmitTrafficDescrIndex;

                    public final AtmVplCrossConnectIdentifierEnt atmVplCrossConnectIdentifier;

                    public final AtmVplRowStatusEnt atmVplRowStatus;

                    public final AtmVplCastTypeEnt atmVplCastType;

                    public final AtmVplConnKindEnt atmVplConnKind;

                    private AtmVplEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVplEntry", "1.3.6.1.2.1.37.1.6.1", false, false, false, true);
                        this.atmVplVpi = new AtmVplVpiEnt(mib, this);
                        this.atmVplAdminStatus = new AtmVplAdminStatusEnt(mib, this);
                        this.atmVplOperStatus = new AtmVplOperStatusEnt(mib, this);
                        this.atmVplLastChange = new AtmVplLastChangeEnt(mib, this);
                        this.atmVplReceiveTrafficDescrIndex = new AtmVplReceiveTrafficDescrIndexEnt(mib, this);
                        this.atmVplTransmitTrafficDescrIndex = new AtmVplTransmitTrafficDescrIndexEnt(mib, this);
                        this.atmVplCrossConnectIdentifier = new AtmVplCrossConnectIdentifierEnt(mib, this);
                        this.atmVplRowStatus = new AtmVplRowStatusEnt(mib, this);
                        this.atmVplCastType = new AtmVplCastTypeEnt(mib, this);
                        this.atmVplConnKind = new AtmVplConnKindEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVplVpi,
                            this.atmVplAdminStatus,
                            this.atmVplOperStatus,
                            this.atmVplLastChange,
                            this.atmVplReceiveTrafficDescrIndex,
                            this.atmVplTransmitTrafficDescrIndex,
                            this.atmVplCrossConnectIdentifier,
                            this.atmVplRowStatus,
                            this.atmVplCastType,
                            this.atmVplConnKind
                        };
                    }
                    public static final class AtmVplVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplVpi", "1.3.6.1.2.1.37.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplAdminStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplAdminStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplAdminStatus", "1.3.6.1.2.1.37.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplOperStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplOperStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplOperStatus", "1.3.6.1.2.1.37.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplLastChangeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplLastChangeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplLastChange", "1.3.6.1.2.1.37.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplReceiveTrafficDescrIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplReceiveTrafficDescrIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplReceiveTrafficDescrIndex", "1.3.6.1.2.1.37.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplTransmitTrafficDescrIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplTransmitTrafficDescrIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplTransmitTrafficDescrIndex", "1.3.6.1.2.1.37.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplCrossConnectIdentifierEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplCrossConnectIdentifierEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplCrossConnectIdentifier", "1.3.6.1.2.1.37.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplRowStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplRowStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplRowStatus", "1.3.6.1.2.1.37.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplCastTypeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplCastTypeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplCastType", "1.3.6.1.2.1.37.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplConnKindEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVplConnKindEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVplConnKind", "1.3.6.1.2.1.37.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVclTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmVclEntryEnt atmVclEntry;

                private AtmVclTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmVclTable", "1.3.6.1.2.1.37.1.7", false, true, false, false);
                    this.atmVclEntry = new AtmVclEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVclEntry
                    };
                }
                public static final class AtmVclEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmVclVpiEnt atmVclVpi;

                    public final AtmVclVciEnt atmVclVci;

                    public final AtmVclAdminStatusEnt atmVclAdminStatus;

                    public final AtmVclOperStatusEnt atmVclOperStatus;

                    public final AtmVclLastChangeEnt atmVclLastChange;

                    public final AtmVclReceiveTrafficDescrIndexEnt atmVclReceiveTrafficDescrIndex;

                    public final AtmVclTransmitTrafficDescrIndexEnt atmVclTransmitTrafficDescrIndex;

                    public final AtmVccAalTypeEnt atmVccAalType;

                    public final AtmVccAal5CpcsTransmitSduSizeEnt atmVccAal5CpcsTransmitSduSize;

                    public final AtmVccAal5CpcsReceiveSduSizeEnt atmVccAal5CpcsReceiveSduSize;

                    public final AtmVccAal5EncapsTypeEnt atmVccAal5EncapsType;

                    public final AtmVclCrossConnectIdentifierEnt atmVclCrossConnectIdentifier;

                    public final AtmVclRowStatusEnt atmVclRowStatus;

                    public final AtmVclCastTypeEnt atmVclCastType;

                    public final AtmVclConnKindEnt atmVclConnKind;

                    private AtmVclEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVclEntry", "1.3.6.1.2.1.37.1.7.1", false, false, false, true);
                        this.atmVclVpi = new AtmVclVpiEnt(mib, this);
                        this.atmVclVci = new AtmVclVciEnt(mib, this);
                        this.atmVclAdminStatus = new AtmVclAdminStatusEnt(mib, this);
                        this.atmVclOperStatus = new AtmVclOperStatusEnt(mib, this);
                        this.atmVclLastChange = new AtmVclLastChangeEnt(mib, this);
                        this.atmVclReceiveTrafficDescrIndex = new AtmVclReceiveTrafficDescrIndexEnt(mib, this);
                        this.atmVclTransmitTrafficDescrIndex = new AtmVclTransmitTrafficDescrIndexEnt(mib, this);
                        this.atmVccAalType = new AtmVccAalTypeEnt(mib, this);
                        this.atmVccAal5CpcsTransmitSduSize = new AtmVccAal5CpcsTransmitSduSizeEnt(mib, this);
                        this.atmVccAal5CpcsReceiveSduSize = new AtmVccAal5CpcsReceiveSduSizeEnt(mib, this);
                        this.atmVccAal5EncapsType = new AtmVccAal5EncapsTypeEnt(mib, this);
                        this.atmVclCrossConnectIdentifier = new AtmVclCrossConnectIdentifierEnt(mib, this);
                        this.atmVclRowStatus = new AtmVclRowStatusEnt(mib, this);
                        this.atmVclCastType = new AtmVclCastTypeEnt(mib, this);
                        this.atmVclConnKind = new AtmVclConnKindEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVclVpi,
                            this.atmVclVci,
                            this.atmVclAdminStatus,
                            this.atmVclOperStatus,
                            this.atmVclLastChange,
                            this.atmVclReceiveTrafficDescrIndex,
                            this.atmVclTransmitTrafficDescrIndex,
                            this.atmVccAalType,
                            this.atmVccAal5CpcsTransmitSduSize,
                            this.atmVccAal5CpcsReceiveSduSize,
                            this.atmVccAal5EncapsType,
                            this.atmVclCrossConnectIdentifier,
                            this.atmVclRowStatus,
                            this.atmVclCastType,
                            this.atmVclConnKind
                        };
                    }
                    public static final class AtmVclVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclVpi", "1.3.6.1.2.1.37.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclVciEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclVciEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclVci", "1.3.6.1.2.1.37.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclAdminStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclAdminStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclAdminStatus", "1.3.6.1.2.1.37.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclOperStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclOperStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclOperStatus", "1.3.6.1.2.1.37.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclLastChangeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclLastChangeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclLastChange", "1.3.6.1.2.1.37.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclReceiveTrafficDescrIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclReceiveTrafficDescrIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclReceiveTrafficDescrIndex", "1.3.6.1.2.1.37.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclTransmitTrafficDescrIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclTransmitTrafficDescrIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclTransmitTrafficDescrIndex", "1.3.6.1.2.1.37.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVccAalTypeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVccAalTypeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVccAalType", "1.3.6.1.2.1.37.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVccAal5CpcsTransmitSduSizeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVccAal5CpcsTransmitSduSizeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVccAal5CpcsTransmitSduSize", "1.3.6.1.2.1.37.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVccAal5CpcsReceiveSduSizeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVccAal5CpcsReceiveSduSizeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVccAal5CpcsReceiveSduSize", "1.3.6.1.2.1.37.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVccAal5EncapsTypeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVccAal5EncapsTypeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVccAal5EncapsType", "1.3.6.1.2.1.37.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclCrossConnectIdentifierEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclCrossConnectIdentifierEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclCrossConnectIdentifier", "1.3.6.1.2.1.37.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclRowStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclRowStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclRowStatus", "1.3.6.1.2.1.37.1.7.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclCastTypeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclCastTypeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclCastType", "1.3.6.1.2.1.37.1.7.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclConnKindEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVclConnKindEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVclConnKind", "1.3.6.1.2.1.37.1.7.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVpCrossConnectIndexNextEnt extends MIBEntry<ATMMIBDef>
            {
                private AtmVpCrossConnectIndexNextEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmVpCrossConnectIndexNext", "1.3.6.1.2.1.37.1.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtmVpCrossConnectTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmVpCrossConnectEntryEnt atmVpCrossConnectEntry;

                private AtmVpCrossConnectTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmVpCrossConnectTable", "1.3.6.1.2.1.37.1.9", false, true, false, false);
                    this.atmVpCrossConnectEntry = new AtmVpCrossConnectEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVpCrossConnectEntry
                    };
                }
                public static final class AtmVpCrossConnectEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmVpCrossConnectIndexEnt atmVpCrossConnectIndex;

                    public final AtmVpCrossConnectLowIfIndexEnt atmVpCrossConnectLowIfIndex;

                    public final AtmVpCrossConnectLowVpiEnt atmVpCrossConnectLowVpi;

                    public final AtmVpCrossConnectHighIfIndexEnt atmVpCrossConnectHighIfIndex;

                    public final AtmVpCrossConnectHighVpiEnt atmVpCrossConnectHighVpi;

                    public final AtmVpCrossConnectAdminStatusEnt atmVpCrossConnectAdminStatus;

                    public final AtmVpCrossConnectL2HOperStatusEnt atmVpCrossConnectL2HOperStatus;

                    public final AtmVpCrossConnectH2LOperStatusEnt atmVpCrossConnectH2LOperStatus;

                    public final AtmVpCrossConnectL2HLastChangeEnt atmVpCrossConnectL2HLastChange;

                    public final AtmVpCrossConnectH2LLastChangeEnt atmVpCrossConnectH2LLastChange;

                    public final AtmVpCrossConnectRowStatusEnt atmVpCrossConnectRowStatus;

                    private AtmVpCrossConnectEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVpCrossConnectEntry", "1.3.6.1.2.1.37.1.9.1", false, false, false, true);
                        this.atmVpCrossConnectIndex = new AtmVpCrossConnectIndexEnt(mib, this);
                        this.atmVpCrossConnectLowIfIndex = new AtmVpCrossConnectLowIfIndexEnt(mib, this);
                        this.atmVpCrossConnectLowVpi = new AtmVpCrossConnectLowVpiEnt(mib, this);
                        this.atmVpCrossConnectHighIfIndex = new AtmVpCrossConnectHighIfIndexEnt(mib, this);
                        this.atmVpCrossConnectHighVpi = new AtmVpCrossConnectHighVpiEnt(mib, this);
                        this.atmVpCrossConnectAdminStatus = new AtmVpCrossConnectAdminStatusEnt(mib, this);
                        this.atmVpCrossConnectL2HOperStatus = new AtmVpCrossConnectL2HOperStatusEnt(mib, this);
                        this.atmVpCrossConnectH2LOperStatus = new AtmVpCrossConnectH2LOperStatusEnt(mib, this);
                        this.atmVpCrossConnectL2HLastChange = new AtmVpCrossConnectL2HLastChangeEnt(mib, this);
                        this.atmVpCrossConnectH2LLastChange = new AtmVpCrossConnectH2LLastChangeEnt(mib, this);
                        this.atmVpCrossConnectRowStatus = new AtmVpCrossConnectRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVpCrossConnectIndex,
                            this.atmVpCrossConnectLowIfIndex,
                            this.atmVpCrossConnectLowVpi,
                            this.atmVpCrossConnectHighIfIndex,
                            this.atmVpCrossConnectHighVpi,
                            this.atmVpCrossConnectAdminStatus,
                            this.atmVpCrossConnectL2HOperStatus,
                            this.atmVpCrossConnectH2LOperStatus,
                            this.atmVpCrossConnectL2HLastChange,
                            this.atmVpCrossConnectH2LLastChange,
                            this.atmVpCrossConnectRowStatus
                        };
                    }
                    public static final class AtmVpCrossConnectIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectIndex", "1.3.6.1.2.1.37.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectLowIfIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectLowIfIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectLowIfIndex", "1.3.6.1.2.1.37.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectLowVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectLowVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectLowVpi", "1.3.6.1.2.1.37.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectHighIfIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectHighIfIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectHighIfIndex", "1.3.6.1.2.1.37.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectHighVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectHighVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectHighVpi", "1.3.6.1.2.1.37.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectAdminStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectAdminStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectAdminStatus", "1.3.6.1.2.1.37.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectL2HOperStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectL2HOperStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectL2HOperStatus", "1.3.6.1.2.1.37.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectH2LOperStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectH2LOperStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectH2LOperStatus", "1.3.6.1.2.1.37.1.9.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectL2HLastChangeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectL2HLastChangeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectL2HLastChange", "1.3.6.1.2.1.37.1.9.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectH2LLastChangeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectH2LLastChangeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectH2LLastChange", "1.3.6.1.2.1.37.1.9.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectRowStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVpCrossConnectRowStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectRowStatus", "1.3.6.1.2.1.37.1.9.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVcCrossConnectIndexNextEnt extends MIBEntry<ATMMIBDef>
            {
                private AtmVcCrossConnectIndexNextEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmVcCrossConnectIndexNext", "1.3.6.1.2.1.37.1.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AtmVcCrossConnectTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final AtmVcCrossConnectEntryEnt atmVcCrossConnectEntry;

                private AtmVcCrossConnectTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmVcCrossConnectTable", "1.3.6.1.2.1.37.1.11", false, true, false, false);
                    this.atmVcCrossConnectEntry = new AtmVcCrossConnectEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVcCrossConnectEntry
                    };
                }
                public static final class AtmVcCrossConnectEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final AtmVcCrossConnectIndexEnt atmVcCrossConnectIndex;

                    public final AtmVcCrossConnectLowIfIndexEnt atmVcCrossConnectLowIfIndex;

                    public final AtmVcCrossConnectLowVpiEnt atmVcCrossConnectLowVpi;

                    public final AtmVcCrossConnectLowVciEnt atmVcCrossConnectLowVci;

                    public final AtmVcCrossConnectHighIfIndexEnt atmVcCrossConnectHighIfIndex;

                    public final AtmVcCrossConnectHighVpiEnt atmVcCrossConnectHighVpi;

                    public final AtmVcCrossConnectHighVciEnt atmVcCrossConnectHighVci;

                    public final AtmVcCrossConnectAdminStatusEnt atmVcCrossConnectAdminStatus;

                    public final AtmVcCrossConnectL2HOperStatusEnt atmVcCrossConnectL2HOperStatus;

                    public final AtmVcCrossConnectH2LOperStatusEnt atmVcCrossConnectH2LOperStatus;

                    public final AtmVcCrossConnectL2HLastChangeEnt atmVcCrossConnectL2HLastChange;

                    public final AtmVcCrossConnectH2LLastChangeEnt atmVcCrossConnectH2LLastChange;

                    public final AtmVcCrossConnectRowStatusEnt atmVcCrossConnectRowStatus;

                    private AtmVcCrossConnectEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVcCrossConnectEntry", "1.3.6.1.2.1.37.1.11.1", false, false, false, true);
                        this.atmVcCrossConnectIndex = new AtmVcCrossConnectIndexEnt(mib, this);
                        this.atmVcCrossConnectLowIfIndex = new AtmVcCrossConnectLowIfIndexEnt(mib, this);
                        this.atmVcCrossConnectLowVpi = new AtmVcCrossConnectLowVpiEnt(mib, this);
                        this.atmVcCrossConnectLowVci = new AtmVcCrossConnectLowVciEnt(mib, this);
                        this.atmVcCrossConnectHighIfIndex = new AtmVcCrossConnectHighIfIndexEnt(mib, this);
                        this.atmVcCrossConnectHighVpi = new AtmVcCrossConnectHighVpiEnt(mib, this);
                        this.atmVcCrossConnectHighVci = new AtmVcCrossConnectHighVciEnt(mib, this);
                        this.atmVcCrossConnectAdminStatus = new AtmVcCrossConnectAdminStatusEnt(mib, this);
                        this.atmVcCrossConnectL2HOperStatus = new AtmVcCrossConnectL2HOperStatusEnt(mib, this);
                        this.atmVcCrossConnectH2LOperStatus = new AtmVcCrossConnectH2LOperStatusEnt(mib, this);
                        this.atmVcCrossConnectL2HLastChange = new AtmVcCrossConnectL2HLastChangeEnt(mib, this);
                        this.atmVcCrossConnectH2LLastChange = new AtmVcCrossConnectH2LLastChangeEnt(mib, this);
                        this.atmVcCrossConnectRowStatus = new AtmVcCrossConnectRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVcCrossConnectIndex,
                            this.atmVcCrossConnectLowIfIndex,
                            this.atmVcCrossConnectLowVpi,
                            this.atmVcCrossConnectLowVci,
                            this.atmVcCrossConnectHighIfIndex,
                            this.atmVcCrossConnectHighVpi,
                            this.atmVcCrossConnectHighVci,
                            this.atmVcCrossConnectAdminStatus,
                            this.atmVcCrossConnectL2HOperStatus,
                            this.atmVcCrossConnectH2LOperStatus,
                            this.atmVcCrossConnectL2HLastChange,
                            this.atmVcCrossConnectH2LLastChange,
                            this.atmVcCrossConnectRowStatus
                        };
                    }
                    public static final class AtmVcCrossConnectIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectIndex", "1.3.6.1.2.1.37.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectLowIfIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectLowIfIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectLowIfIndex", "1.3.6.1.2.1.37.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectLowVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectLowVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectLowVpi", "1.3.6.1.2.1.37.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectLowVciEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectLowVciEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectLowVci", "1.3.6.1.2.1.37.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectHighIfIndexEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectHighIfIndexEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectHighIfIndex", "1.3.6.1.2.1.37.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectHighVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectHighVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectHighVpi", "1.3.6.1.2.1.37.1.11.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectHighVciEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectHighVciEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectHighVci", "1.3.6.1.2.1.37.1.11.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectAdminStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectAdminStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectAdminStatus", "1.3.6.1.2.1.37.1.11.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectL2HOperStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectL2HOperStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectL2HOperStatus", "1.3.6.1.2.1.37.1.11.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectH2LOperStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectH2LOperStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectH2LOperStatus", "1.3.6.1.2.1.37.1.11.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectL2HLastChangeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectL2HLastChangeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectL2HLastChange", "1.3.6.1.2.1.37.1.11.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectH2LLastChangeEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectH2LLastChangeEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectH2LLastChange", "1.3.6.1.2.1.37.1.11.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectRowStatusEnt extends MIBEntry<ATMMIBDef>
                    {
                        private AtmVcCrossConnectRowStatusEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectRowStatus", "1.3.6.1.2.1.37.1.11.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Aal5VccTableEnt extends MIBEntry<ATMMIBDef>
            {
                public final Aal5VccEntryEnt aal5VccEntry;

                private Aal5VccTableEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "aal5VccTable", "1.3.6.1.2.1.37.1.12", false, true, false, false);
                    this.aal5VccEntry = new Aal5VccEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aal5VccEntry
                    };
                }
                public static final class Aal5VccEntryEnt extends MIBEntry<ATMMIBDef>
                {
                    public final Aal5VccVpiEnt aal5VccVpi;

                    public final Aal5VccVciEnt aal5VccVci;

                    public final Aal5VccCrcErrorsEnt aal5VccCrcErrors;

                    public final Aal5VccSarTimeOutsEnt aal5VccSarTimeOuts;

                    public final Aal5VccOverSizedSDUsEnt aal5VccOverSizedSDUs;

                    private Aal5VccEntryEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "aal5VccEntry", "1.3.6.1.2.1.37.1.12.1", false, false, false, true);
                        this.aal5VccVpi = new Aal5VccVpiEnt(mib, this);
                        this.aal5VccVci = new Aal5VccVciEnt(mib, this);
                        this.aal5VccCrcErrors = new Aal5VccCrcErrorsEnt(mib, this);
                        this.aal5VccSarTimeOuts = new Aal5VccSarTimeOutsEnt(mib, this);
                        this.aal5VccOverSizedSDUs = new Aal5VccOverSizedSDUsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.aal5VccVpi,
                            this.aal5VccVci,
                            this.aal5VccCrcErrors,
                            this.aal5VccSarTimeOuts,
                            this.aal5VccOverSizedSDUs
                        };
                    }
                    public static final class Aal5VccVpiEnt extends MIBEntry<ATMMIBDef>
                    {
                        private Aal5VccVpiEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "aal5VccVpi", "1.3.6.1.2.1.37.1.12.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Aal5VccVciEnt extends MIBEntry<ATMMIBDef>
                    {
                        private Aal5VccVciEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "aal5VccVci", "1.3.6.1.2.1.37.1.12.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Aal5VccCrcErrorsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private Aal5VccCrcErrorsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "aal5VccCrcErrors", "1.3.6.1.2.1.37.1.12.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Aal5VccSarTimeOutsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private Aal5VccSarTimeOutsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "aal5VccSarTimeOuts", "1.3.6.1.2.1.37.1.12.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Aal5VccOverSizedSDUsEnt extends MIBEntry<ATMMIBDef>
                    {
                        private Aal5VccOverSizedSDUsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                        {
                            super(mib, parent, "aal5VccOverSizedSDUs", "1.3.6.1.2.1.37.1.12.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmTrafficDescrParamIndexNextEnt extends MIBEntry<ATMMIBDef>
            {
                private AtmTrafficDescrParamIndexNextEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmTrafficDescrParamIndexNext", "1.3.6.1.2.1.37.1.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class AtmMIBConformanceEnt extends MIBEntry<ATMMIBDef>
        {
            public final AtmMIBGroupsEnt atmMIBGroups;

            public final AtmMIBCompliancesEnt atmMIBCompliances;

            private AtmMIBConformanceEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
            {
                super(mib, parent, "atmMIBConformance", "1.3.6.1.2.1.37.2", false, false, false, false);
                this.atmMIBGroups = new AtmMIBGroupsEnt(mib, this);
                this.atmMIBCompliances = new AtmMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atmMIBGroups,
                    this.atmMIBCompliances
                };
            }
            public static final class AtmMIBGroupsEnt extends MIBEntry<ATMMIBDef>
            {
                /** Units of Conformance*/
                public final AtmInterfaceDs3PlcpGroupEnt atmInterfaceDs3PlcpGroup;

                public final AtmInterfaceTCGroupEnt atmInterfaceTCGroup;

                public final Aal5VccGroupEnt aal5VccGroup;

                public final AtmInterfaceConfGroup2Ent atmInterfaceConfGroup2;

                public final AtmTrafficDescrGroup2Ent atmTrafficDescrGroup2;

                public final AtmVpcTerminationGroup2Ent atmVpcTerminationGroup2;

                public final AtmVccTerminationGroup2Ent atmVccTerminationGroup2;

                public final AtmVplCrossConnectGroupEnt atmVplCrossConnectGroup;

                public final AtmVpPvcCrossConnectGroupEnt atmVpPvcCrossConnectGroup;

                public final AtmVclCrossConnectGroupEnt atmVclCrossConnectGroup;

                public final AtmVcPvcCrossConnectGroupEnt atmVcPvcCrossConnectGroup;

                /** Deprecated Definitions - Groups*/
                public final AtmInterfaceConfGroupEnt atmInterfaceConfGroup;

                public final AtmTrafficDescrGroupEnt atmTrafficDescrGroup;

                public final AtmVpcTerminationGroupEnt atmVpcTerminationGroup;

                public final AtmVccTerminationGroupEnt atmVccTerminationGroup;

                public final AtmVpCrossConnectGroupEnt atmVpCrossConnectGroup;

                public final AtmVcCrossConnectGroupEnt atmVcCrossConnectGroup;

                private AtmMIBGroupsEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmMIBGroups", "1.3.6.1.2.1.37.2.1", false, false, false, false);
                    this.atmInterfaceDs3PlcpGroup = new AtmInterfaceDs3PlcpGroupEnt(mib, this);
                    this.atmInterfaceTCGroup = new AtmInterfaceTCGroupEnt(mib, this);
                    this.aal5VccGroup = new Aal5VccGroupEnt(mib, this);
                    this.atmInterfaceConfGroup2 = new AtmInterfaceConfGroup2Ent(mib, this);
                    this.atmTrafficDescrGroup2 = new AtmTrafficDescrGroup2Ent(mib, this);
                    this.atmVpcTerminationGroup2 = new AtmVpcTerminationGroup2Ent(mib, this);
                    this.atmVccTerminationGroup2 = new AtmVccTerminationGroup2Ent(mib, this);
                    this.atmVplCrossConnectGroup = new AtmVplCrossConnectGroupEnt(mib, this);
                    this.atmVpPvcCrossConnectGroup = new AtmVpPvcCrossConnectGroupEnt(mib, this);
                    this.atmVclCrossConnectGroup = new AtmVclCrossConnectGroupEnt(mib, this);
                    this.atmVcPvcCrossConnectGroup = new AtmVcPvcCrossConnectGroupEnt(mib, this);
                    this.atmInterfaceConfGroup = new AtmInterfaceConfGroupEnt(mib, this);
                    this.atmTrafficDescrGroup = new AtmTrafficDescrGroupEnt(mib, this);
                    this.atmVpcTerminationGroup = new AtmVpcTerminationGroupEnt(mib, this);
                    this.atmVccTerminationGroup = new AtmVccTerminationGroupEnt(mib, this);
                    this.atmVpCrossConnectGroup = new AtmVpCrossConnectGroupEnt(mib, this);
                    this.atmVcCrossConnectGroup = new AtmVcCrossConnectGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmInterfaceDs3PlcpGroup,
                        this.atmInterfaceTCGroup,
                        this.aal5VccGroup,
                        this.atmInterfaceConfGroup2,
                        this.atmTrafficDescrGroup2,
                        this.atmVpcTerminationGroup2,
                        this.atmVccTerminationGroup2,
                        this.atmVplCrossConnectGroup,
                        this.atmVpPvcCrossConnectGroup,
                        this.atmVclCrossConnectGroup,
                        this.atmVcPvcCrossConnectGroup,
                        this.atmInterfaceConfGroup,
                        this.atmTrafficDescrGroup,
                        this.atmVpcTerminationGroup,
                        this.atmVccTerminationGroup,
                        this.atmVpCrossConnectGroup,
                        this.atmVcCrossConnectGroup
                    };
                }
                public static final class AtmInterfaceDs3PlcpGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmInterfaceDs3PlcpGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceDs3PlcpGroup", "1.3.6.1.2.1.37.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmInterfaceTCGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmInterfaceTCGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceTCGroup", "1.3.6.1.2.1.37.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Aal5VccGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private Aal5VccGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "aal5VccGroup", "1.3.6.1.2.1.37.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmInterfaceConfGroup2Ent extends MIBEntry<ATMMIBDef>
                {
                    private AtmInterfaceConfGroup2Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceConfGroup2", "1.3.6.1.2.1.37.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmTrafficDescrGroup2Ent extends MIBEntry<ATMMIBDef>
                {
                    private AtmTrafficDescrGroup2Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmTrafficDescrGroup2", "1.3.6.1.2.1.37.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVpcTerminationGroup2Ent extends MIBEntry<ATMMIBDef>
                {
                    private AtmVpcTerminationGroup2Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVpcTerminationGroup2", "1.3.6.1.2.1.37.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVccTerminationGroup2Ent extends MIBEntry<ATMMIBDef>
                {
                    private AtmVccTerminationGroup2Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVccTerminationGroup2", "1.3.6.1.2.1.37.2.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVplCrossConnectGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVplCrossConnectGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVplCrossConnectGroup", "1.3.6.1.2.1.37.2.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVpPvcCrossConnectGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVpPvcCrossConnectGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVpPvcCrossConnectGroup", "1.3.6.1.2.1.37.2.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVclCrossConnectGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVclCrossConnectGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVclCrossConnectGroup", "1.3.6.1.2.1.37.2.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVcPvcCrossConnectGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVcPvcCrossConnectGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVcPvcCrossConnectGroup", "1.3.6.1.2.1.37.2.1.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmInterfaceConfGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmInterfaceConfGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceConfGroup", "1.3.6.1.2.1.37.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmTrafficDescrGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmTrafficDescrGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmTrafficDescrGroup", "1.3.6.1.2.1.37.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVpcTerminationGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVpcTerminationGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVpcTerminationGroup", "1.3.6.1.2.1.37.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVccTerminationGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVccTerminationGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVccTerminationGroup", "1.3.6.1.2.1.37.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVpCrossConnectGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVpCrossConnectGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVpCrossConnectGroup", "1.3.6.1.2.1.37.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmVcCrossConnectGroupEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmVcCrossConnectGroupEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmVcCrossConnectGroup", "1.3.6.1.2.1.37.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AtmMIBCompliancesEnt extends MIBEntry<ATMMIBDef>
            {
                /** Compliance Statements*/
                public final AtmMIBCompliance2Ent atmMIBCompliance2;

                /** Deprecated Definitions - Objects
atmInterfaceAddressTypeatmTrafficQoSClass

Deprecated Definitions - Compliance*/
                public final AtmMIBComplianceEnt atmMIBCompliance;

                private AtmMIBCompliancesEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                {
                    super(mib, parent, "atmMIBCompliances", "1.3.6.1.2.1.37.2.2", false, false, false, false);
                    this.atmMIBCompliance2 = new AtmMIBCompliance2Ent(mib, this);
                    this.atmMIBCompliance = new AtmMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmMIBCompliance2,
                        this.atmMIBCompliance
                    };
                }
                public static final class AtmMIBCompliance2Ent extends MIBEntry<ATMMIBDef>
                {
                    private AtmMIBCompliance2Ent(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmMIBCompliance2", "1.3.6.1.2.1.37.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmMIBComplianceEnt extends MIBEntry<ATMMIBDef>
                {
                    private AtmMIBComplianceEnt(ATMMIBDef mib, MIBEntry<ATMMIBDef> parent)
                    {
                        super(mib, parent, "atmMIBCompliance", "1.3.6.1.2.1.37.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
