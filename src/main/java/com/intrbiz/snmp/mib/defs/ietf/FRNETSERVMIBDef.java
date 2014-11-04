package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class FRNETSERVMIBDef extends MIB
{
    public static final FRNETSERVMIBDef FRNETSERVMIB = new FRNETSERVMIBDef();

    static { MIBs.getInstance().registerMIB(FRNETSERVMIBDef.FRNETSERVMIB); }

    /** September 28, 2000*/
    public final FrnetservMIBEnt frnetservMIB;

    private FRNETSERVMIBDef()
    {
        super("FRNETSERV-MIB");
        this.frnetservMIB = new FrnetservMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.frnetservMIB
        };
    }

    public static final class FrnetservMIBEnt extends MIBEntry<FRNETSERVMIBDef>
    {
        public final FrnetservObjectsEnt frnetservObjects;

        public final FrnetservTrapsEnt frnetservTraps;

        /** Conformance Information*/
        public final FrnetservConformanceEnt frnetservConformance;

        private FrnetservMIBEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
        {
            super(mib, parent, "frnetservMIB", "1.3.6.1.2.1.10.44", false, false, false, false);
            this.frnetservObjects = new FrnetservObjectsEnt(mib, this);
            this.frnetservTraps = new FrnetservTrapsEnt(mib, this);
            this.frnetservConformance = new FrnetservConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.frnetservObjects,
                this.frnetservTraps,
                this.frnetservConformance
            };
        }
        public static final class FrnetservObjectsEnt extends MIBEntry<FRNETSERVMIBDef>
        {
            /** The Frame Relay Service Logical Port*/
            public final FrLportTableEnt frLportTable;

            /** Frame Relay Management VC Signaling*/
            public final FrMgtVCSigTableEnt frMgtVCSigTable;

            /** Frame Relay PVC End-points*/
            public final FrPVCEndptTableEnt frPVCEndptTable;

            /** Frame Relay PVC Connections*/
            public final FrPVCConnectIndexValueEnt frPVCConnectIndexValue;

            public final FrPVCConnectTableEnt frPVCConnectTable;

            /** The Frame Relay Accounting*/
            public final FrAccountPVCTableEnt frAccountPVCTable;

            /** Accounting on a Frame Relay Logical Port*/
            public final FrAccountLportTableEnt frAccountLportTable;

            private FrnetservObjectsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
            {
                super(mib, parent, "frnetservObjects", "1.3.6.1.2.1.10.44.1", false, false, false, false);
                this.frLportTable = new FrLportTableEnt(mib, this);
                this.frMgtVCSigTable = new FrMgtVCSigTableEnt(mib, this);
                this.frPVCEndptTable = new FrPVCEndptTableEnt(mib, this);
                this.frPVCConnectIndexValue = new FrPVCConnectIndexValueEnt(mib, this);
                this.frPVCConnectTable = new FrPVCConnectTableEnt(mib, this);
                this.frAccountPVCTable = new FrAccountPVCTableEnt(mib, this);
                this.frAccountLportTable = new FrAccountLportTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frLportTable,
                    this.frMgtVCSigTable,
                    this.frPVCEndptTable,
                    this.frPVCConnectIndexValue,
                    this.frPVCConnectTable,
                    this.frAccountPVCTable,
                    this.frAccountLportTable
                };
            }
            public static final class FrLportTableEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrLportEntryEnt frLportEntry;

                private FrLportTableEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frLportTable", "1.3.6.1.2.1.10.44.1.1", false, true, false, false);
                    this.frLportEntry = new FrLportEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frLportEntry
                    };
                }
                public static final class FrLportEntryEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    public final FrLportNumPlanEnt frLportNumPlan;

                    public final FrLportContactEnt frLportContact;

                    public final FrLportLocationEnt frLportLocation;

                    public final FrLportTypeEnt frLportType;

                    public final FrLportAddrDLCILenEnt frLportAddrDLCILen;

                    public final FrLportVCSigProtocolEnt frLportVCSigProtocol;

                    public final FrLportVCSigPointerEnt frLportVCSigPointer;

                    public final FrLportDLCIIndexValueEnt frLportDLCIIndexValue;

                    public final FrLportTypeAdminEnt frLportTypeAdmin;

                    public final FrLportVCSigProtocolAdminEnt frLportVCSigProtocolAdmin;

                    public final FrLportFragControlEnt frLportFragControl;

                    public final FrLportFragSizeEnt frLportFragSize;

                    private FrLportEntryEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frLportEntry", "1.3.6.1.2.1.10.44.1.1.1", false, false, false, true);
                        this.frLportNumPlan = new FrLportNumPlanEnt(mib, this);
                        this.frLportContact = new FrLportContactEnt(mib, this);
                        this.frLportLocation = new FrLportLocationEnt(mib, this);
                        this.frLportType = new FrLportTypeEnt(mib, this);
                        this.frLportAddrDLCILen = new FrLportAddrDLCILenEnt(mib, this);
                        this.frLportVCSigProtocol = new FrLportVCSigProtocolEnt(mib, this);
                        this.frLportVCSigPointer = new FrLportVCSigPointerEnt(mib, this);
                        this.frLportDLCIIndexValue = new FrLportDLCIIndexValueEnt(mib, this);
                        this.frLportTypeAdmin = new FrLportTypeAdminEnt(mib, this);
                        this.frLportVCSigProtocolAdmin = new FrLportVCSigProtocolAdminEnt(mib, this);
                        this.frLportFragControl = new FrLportFragControlEnt(mib, this);
                        this.frLportFragSize = new FrLportFragSizeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frLportNumPlan,
                            this.frLportContact,
                            this.frLportLocation,
                            this.frLportType,
                            this.frLportAddrDLCILen,
                            this.frLportVCSigProtocol,
                            this.frLportVCSigPointer,
                            this.frLportDLCIIndexValue,
                            this.frLportTypeAdmin,
                            this.frLportVCSigProtocolAdmin,
                            this.frLportFragControl,
                            this.frLportFragSize
                        };
                    }
                    public static final class FrLportNumPlanEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportNumPlanEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportNumPlan", "1.3.6.1.2.1.10.44.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportContactEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportContactEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportContact", "1.3.6.1.2.1.10.44.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportLocationEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportLocationEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportLocation", "1.3.6.1.2.1.10.44.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportTypeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportTypeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportType", "1.3.6.1.2.1.10.44.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportAddrDLCILenEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportAddrDLCILenEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportAddrDLCILen", "1.3.6.1.2.1.10.44.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportVCSigProtocolEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportVCSigProtocolEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportVCSigProtocol", "1.3.6.1.2.1.10.44.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportVCSigPointerEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportVCSigPointerEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportVCSigPointer", "1.3.6.1.2.1.10.44.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportDLCIIndexValueEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportDLCIIndexValueEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportDLCIIndexValue", "1.3.6.1.2.1.10.44.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportTypeAdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportTypeAdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportTypeAdmin", "1.3.6.1.2.1.10.44.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportVCSigProtocolAdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportVCSigProtocolAdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportVCSigProtocolAdmin", "1.3.6.1.2.1.10.44.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportFragControlEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportFragControlEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportFragControl", "1.3.6.1.2.1.10.44.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrLportFragSizeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrLportFragSizeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frLportFragSize", "1.3.6.1.2.1.10.44.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrMgtVCSigTableEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrMgtVCSigEntryEnt frMgtVCSigEntry;

                private FrMgtVCSigTableEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frMgtVCSigTable", "1.3.6.1.2.1.10.44.1.2", false, true, false, false);
                    this.frMgtVCSigEntry = new FrMgtVCSigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frMgtVCSigEntry
                    };
                }
                public static final class FrMgtVCSigEntryEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    public final FrMgtVCSigProcedEnt frMgtVCSigProced;

                    public final FrMgtVCSigUserN391Ent frMgtVCSigUserN391;

                    public final FrMgtVCSigUserN392Ent frMgtVCSigUserN392;

                    public final FrMgtVCSigUserN393Ent frMgtVCSigUserN393;

                    public final FrMgtVCSigUserT391Ent frMgtVCSigUserT391;

                    public final FrMgtVCSigNetN392Ent frMgtVCSigNetN392;

                    public final FrMgtVCSigNetN393Ent frMgtVCSigNetN393;

                    public final FrMgtVCSigNetT392Ent frMgtVCSigNetT392;

                    public final FrMgtVCSigNetnN4Ent frMgtVCSigNetnN4;

                    public final FrMgtVCSigNetnT3Ent frMgtVCSigNetnT3;

                    public final FrMgtVCSigUserLinkRelErrorsEnt frMgtVCSigUserLinkRelErrors;

                    public final FrMgtVCSigUserProtErrorsEnt frMgtVCSigUserProtErrors;

                    public final FrMgtVCSigUserChanInactiveEnt frMgtVCSigUserChanInactive;

                    public final FrMgtVCSigNetLinkRelErrorsEnt frMgtVCSigNetLinkRelErrors;

                    public final FrMgtVCSigNetProtErrorsEnt frMgtVCSigNetProtErrors;

                    public final FrMgtVCSigNetChanInactiveEnt frMgtVCSigNetChanInactive;

                    public final FrMgtVCSigProcedAdminEnt frMgtVCSigProcedAdmin;

                    public final FrMgtVCSigUserN391AdminEnt frMgtVCSigUserN391Admin;

                    public final FrMgtVCSigUserN392AdminEnt frMgtVCSigUserN392Admin;

                    public final FrMgtVCSigUserN393AdminEnt frMgtVCSigUserN393Admin;

                    public final FrMgtVCSigUserT391AdminEnt frMgtVCSigUserT391Admin;

                    public final FrMgtVCSigNetN392AdminEnt frMgtVCSigNetN392Admin;

                    public final FrMgtVCSigNetN393AdminEnt frMgtVCSigNetN393Admin;

                    public final FrMgtVCSigNetT392AdminEnt frMgtVCSigNetT392Admin;

                    public final FrMgtVCSigNetnT3AdminEnt frMgtVCSigNetnT3Admin;

                    private FrMgtVCSigEntryEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frMgtVCSigEntry", "1.3.6.1.2.1.10.44.1.2.1", false, false, false, true);
                        this.frMgtVCSigProced = new FrMgtVCSigProcedEnt(mib, this);
                        this.frMgtVCSigUserN391 = new FrMgtVCSigUserN391Ent(mib, this);
                        this.frMgtVCSigUserN392 = new FrMgtVCSigUserN392Ent(mib, this);
                        this.frMgtVCSigUserN393 = new FrMgtVCSigUserN393Ent(mib, this);
                        this.frMgtVCSigUserT391 = new FrMgtVCSigUserT391Ent(mib, this);
                        this.frMgtVCSigNetN392 = new FrMgtVCSigNetN392Ent(mib, this);
                        this.frMgtVCSigNetN393 = new FrMgtVCSigNetN393Ent(mib, this);
                        this.frMgtVCSigNetT392 = new FrMgtVCSigNetT392Ent(mib, this);
                        this.frMgtVCSigNetnN4 = new FrMgtVCSigNetnN4Ent(mib, this);
                        this.frMgtVCSigNetnT3 = new FrMgtVCSigNetnT3Ent(mib, this);
                        this.frMgtVCSigUserLinkRelErrors = new FrMgtVCSigUserLinkRelErrorsEnt(mib, this);
                        this.frMgtVCSigUserProtErrors = new FrMgtVCSigUserProtErrorsEnt(mib, this);
                        this.frMgtVCSigUserChanInactive = new FrMgtVCSigUserChanInactiveEnt(mib, this);
                        this.frMgtVCSigNetLinkRelErrors = new FrMgtVCSigNetLinkRelErrorsEnt(mib, this);
                        this.frMgtVCSigNetProtErrors = new FrMgtVCSigNetProtErrorsEnt(mib, this);
                        this.frMgtVCSigNetChanInactive = new FrMgtVCSigNetChanInactiveEnt(mib, this);
                        this.frMgtVCSigProcedAdmin = new FrMgtVCSigProcedAdminEnt(mib, this);
                        this.frMgtVCSigUserN391Admin = new FrMgtVCSigUserN391AdminEnt(mib, this);
                        this.frMgtVCSigUserN392Admin = new FrMgtVCSigUserN392AdminEnt(mib, this);
                        this.frMgtVCSigUserN393Admin = new FrMgtVCSigUserN393AdminEnt(mib, this);
                        this.frMgtVCSigUserT391Admin = new FrMgtVCSigUserT391AdminEnt(mib, this);
                        this.frMgtVCSigNetN392Admin = new FrMgtVCSigNetN392AdminEnt(mib, this);
                        this.frMgtVCSigNetN393Admin = new FrMgtVCSigNetN393AdminEnt(mib, this);
                        this.frMgtVCSigNetT392Admin = new FrMgtVCSigNetT392AdminEnt(mib, this);
                        this.frMgtVCSigNetnT3Admin = new FrMgtVCSigNetnT3AdminEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frMgtVCSigProced,
                            this.frMgtVCSigUserN391,
                            this.frMgtVCSigUserN392,
                            this.frMgtVCSigUserN393,
                            this.frMgtVCSigUserT391,
                            this.frMgtVCSigNetN392,
                            this.frMgtVCSigNetN393,
                            this.frMgtVCSigNetT392,
                            this.frMgtVCSigNetnN4,
                            this.frMgtVCSigNetnT3,
                            this.frMgtVCSigUserLinkRelErrors,
                            this.frMgtVCSigUserProtErrors,
                            this.frMgtVCSigUserChanInactive,
                            this.frMgtVCSigNetLinkRelErrors,
                            this.frMgtVCSigNetProtErrors,
                            this.frMgtVCSigNetChanInactive,
                            this.frMgtVCSigProcedAdmin,
                            this.frMgtVCSigUserN391Admin,
                            this.frMgtVCSigUserN392Admin,
                            this.frMgtVCSigUserN393Admin,
                            this.frMgtVCSigUserT391Admin,
                            this.frMgtVCSigNetN392Admin,
                            this.frMgtVCSigNetN393Admin,
                            this.frMgtVCSigNetT392Admin,
                            this.frMgtVCSigNetnT3Admin
                        };
                    }
                    public static final class FrMgtVCSigProcedEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigProcedEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigProced", "1.3.6.1.2.1.10.44.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserN391Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserN391Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserN391", "1.3.6.1.2.1.10.44.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserN392Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserN392Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserN392", "1.3.6.1.2.1.10.44.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserN393Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserN393Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserN393", "1.3.6.1.2.1.10.44.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserT391Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserT391Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserT391", "1.3.6.1.2.1.10.44.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetN392Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetN392Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetN392", "1.3.6.1.2.1.10.44.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetN393Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetN393Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetN393", "1.3.6.1.2.1.10.44.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetT392Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetT392Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetT392", "1.3.6.1.2.1.10.44.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetnN4Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetnN4Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetnN4", "1.3.6.1.2.1.10.44.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetnT3Ent extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetnT3Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetnT3", "1.3.6.1.2.1.10.44.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserLinkRelErrorsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserLinkRelErrorsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserLinkRelErrors", "1.3.6.1.2.1.10.44.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserProtErrorsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserProtErrorsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserProtErrors", "1.3.6.1.2.1.10.44.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserChanInactiveEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserChanInactiveEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserChanInactive", "1.3.6.1.2.1.10.44.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetLinkRelErrorsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetLinkRelErrorsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetLinkRelErrors", "1.3.6.1.2.1.10.44.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetProtErrorsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetProtErrorsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetProtErrors", "1.3.6.1.2.1.10.44.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetChanInactiveEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetChanInactiveEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetChanInactive", "1.3.6.1.2.1.10.44.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigProcedAdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigProcedAdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigProcedAdmin", "1.3.6.1.2.1.10.44.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserN391AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserN391AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserN391Admin", "1.3.6.1.2.1.10.44.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserN392AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserN392AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserN392Admin", "1.3.6.1.2.1.10.44.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserN393AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserN393AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserN393Admin", "1.3.6.1.2.1.10.44.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigUserT391AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigUserT391AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigUserT391Admin", "1.3.6.1.2.1.10.44.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetN392AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetN392AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetN392Admin", "1.3.6.1.2.1.10.44.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetN393AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetN393AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetN393Admin", "1.3.6.1.2.1.10.44.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetT392AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetT392AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetT392Admin", "1.3.6.1.2.1.10.44.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrMgtVCSigNetnT3AdminEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrMgtVCSigNetnT3AdminEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frMgtVCSigNetnT3Admin", "1.3.6.1.2.1.10.44.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrPVCEndptTableEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrPVCEndptEntryEnt frPVCEndptEntry;

                private FrPVCEndptTableEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frPVCEndptTable", "1.3.6.1.2.1.10.44.1.3", false, true, false, false);
                    this.frPVCEndptEntry = new FrPVCEndptEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frPVCEndptEntry
                    };
                }
                public static final class FrPVCEndptEntryEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    public final FrPVCEndptDLCIIndexEnt frPVCEndptDLCIIndex;

                    public final FrPVCEndptInMaxFrameSizeEnt frPVCEndptInMaxFrameSize;

                    public final FrPVCEndptInBcEnt frPVCEndptInBc;

                    public final FrPVCEndptInBeEnt frPVCEndptInBe;

                    public final FrPVCEndptInCIREnt frPVCEndptInCIR;

                    public final FrPVCEndptOutMaxFrameSizeEnt frPVCEndptOutMaxFrameSize;

                    public final FrPVCEndptOutBcEnt frPVCEndptOutBc;

                    public final FrPVCEndptOutBeEnt frPVCEndptOutBe;

                    public final FrPVCEndptOutCIREnt frPVCEndptOutCIR;

                    public final FrPVCEndptConnectIdentifierEnt frPVCEndptConnectIdentifier;

                    public final FrPVCEndptRowStatusEnt frPVCEndptRowStatus;

                    public final FrPVCEndptRcvdSigStatusEnt frPVCEndptRcvdSigStatus;

                    public final FrPVCEndptInFramesEnt frPVCEndptInFrames;

                    public final FrPVCEndptOutFramesEnt frPVCEndptOutFrames;

                    public final FrPVCEndptInDEFramesEnt frPVCEndptInDEFrames;

                    public final FrPVCEndptInExcessFramesEnt frPVCEndptInExcessFrames;

                    public final FrPVCEndptOutExcessFramesEnt frPVCEndptOutExcessFrames;

                    public final FrPVCEndptInDiscardsEnt frPVCEndptInDiscards;

                    public final FrPVCEndptInOctetsEnt frPVCEndptInOctets;

                    public final FrPVCEndptOutOctetsEnt frPVCEndptOutOctets;

                    public final FrPVCEndptInDiscardsDESetEnt frPVCEndptInDiscardsDESet;

                    public final FrPVCEndptInFramesFECNSetEnt frPVCEndptInFramesFECNSet;

                    public final FrPVCEndptOutFramesFECNSetEnt frPVCEndptOutFramesFECNSet;

                    public final FrPVCEndptInFramesBECNSetEnt frPVCEndptInFramesBECNSet;

                    public final FrPVCEndptOutFramesBECNSetEnt frPVCEndptOutFramesBECNSet;

                    public final FrPVCEndptInCongDiscardsEnt frPVCEndptInCongDiscards;

                    public final FrPVCEndptInDECongDiscardsEnt frPVCEndptInDECongDiscards;

                    public final FrPVCEndptOutCongDiscardsEnt frPVCEndptOutCongDiscards;

                    public final FrPVCEndptOutDECongDiscardsEnt frPVCEndptOutDECongDiscards;

                    public final FrPVCEndptOutDEFramesEnt frPVCEndptOutDEFrames;

                    public final FrPVCEndptAtmIwfConnIndexEnt frPVCEndptAtmIwfConnIndex;

                    private FrPVCEndptEntryEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frPVCEndptEntry", "1.3.6.1.2.1.10.44.1.3.1", false, false, false, true);
                        this.frPVCEndptDLCIIndex = new FrPVCEndptDLCIIndexEnt(mib, this);
                        this.frPVCEndptInMaxFrameSize = new FrPVCEndptInMaxFrameSizeEnt(mib, this);
                        this.frPVCEndptInBc = new FrPVCEndptInBcEnt(mib, this);
                        this.frPVCEndptInBe = new FrPVCEndptInBeEnt(mib, this);
                        this.frPVCEndptInCIR = new FrPVCEndptInCIREnt(mib, this);
                        this.frPVCEndptOutMaxFrameSize = new FrPVCEndptOutMaxFrameSizeEnt(mib, this);
                        this.frPVCEndptOutBc = new FrPVCEndptOutBcEnt(mib, this);
                        this.frPVCEndptOutBe = new FrPVCEndptOutBeEnt(mib, this);
                        this.frPVCEndptOutCIR = new FrPVCEndptOutCIREnt(mib, this);
                        this.frPVCEndptConnectIdentifier = new FrPVCEndptConnectIdentifierEnt(mib, this);
                        this.frPVCEndptRowStatus = new FrPVCEndptRowStatusEnt(mib, this);
                        this.frPVCEndptRcvdSigStatus = new FrPVCEndptRcvdSigStatusEnt(mib, this);
                        this.frPVCEndptInFrames = new FrPVCEndptInFramesEnt(mib, this);
                        this.frPVCEndptOutFrames = new FrPVCEndptOutFramesEnt(mib, this);
                        this.frPVCEndptInDEFrames = new FrPVCEndptInDEFramesEnt(mib, this);
                        this.frPVCEndptInExcessFrames = new FrPVCEndptInExcessFramesEnt(mib, this);
                        this.frPVCEndptOutExcessFrames = new FrPVCEndptOutExcessFramesEnt(mib, this);
                        this.frPVCEndptInDiscards = new FrPVCEndptInDiscardsEnt(mib, this);
                        this.frPVCEndptInOctets = new FrPVCEndptInOctetsEnt(mib, this);
                        this.frPVCEndptOutOctets = new FrPVCEndptOutOctetsEnt(mib, this);
                        this.frPVCEndptInDiscardsDESet = new FrPVCEndptInDiscardsDESetEnt(mib, this);
                        this.frPVCEndptInFramesFECNSet = new FrPVCEndptInFramesFECNSetEnt(mib, this);
                        this.frPVCEndptOutFramesFECNSet = new FrPVCEndptOutFramesFECNSetEnt(mib, this);
                        this.frPVCEndptInFramesBECNSet = new FrPVCEndptInFramesBECNSetEnt(mib, this);
                        this.frPVCEndptOutFramesBECNSet = new FrPVCEndptOutFramesBECNSetEnt(mib, this);
                        this.frPVCEndptInCongDiscards = new FrPVCEndptInCongDiscardsEnt(mib, this);
                        this.frPVCEndptInDECongDiscards = new FrPVCEndptInDECongDiscardsEnt(mib, this);
                        this.frPVCEndptOutCongDiscards = new FrPVCEndptOutCongDiscardsEnt(mib, this);
                        this.frPVCEndptOutDECongDiscards = new FrPVCEndptOutDECongDiscardsEnt(mib, this);
                        this.frPVCEndptOutDEFrames = new FrPVCEndptOutDEFramesEnt(mib, this);
                        this.frPVCEndptAtmIwfConnIndex = new FrPVCEndptAtmIwfConnIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frPVCEndptDLCIIndex,
                            this.frPVCEndptInMaxFrameSize,
                            this.frPVCEndptInBc,
                            this.frPVCEndptInBe,
                            this.frPVCEndptInCIR,
                            this.frPVCEndptOutMaxFrameSize,
                            this.frPVCEndptOutBc,
                            this.frPVCEndptOutBe,
                            this.frPVCEndptOutCIR,
                            this.frPVCEndptConnectIdentifier,
                            this.frPVCEndptRowStatus,
                            this.frPVCEndptRcvdSigStatus,
                            this.frPVCEndptInFrames,
                            this.frPVCEndptOutFrames,
                            this.frPVCEndptInDEFrames,
                            this.frPVCEndptInExcessFrames,
                            this.frPVCEndptOutExcessFrames,
                            this.frPVCEndptInDiscards,
                            this.frPVCEndptInOctets,
                            this.frPVCEndptOutOctets,
                            this.frPVCEndptInDiscardsDESet,
                            this.frPVCEndptInFramesFECNSet,
                            this.frPVCEndptOutFramesFECNSet,
                            this.frPVCEndptInFramesBECNSet,
                            this.frPVCEndptOutFramesBECNSet,
                            this.frPVCEndptInCongDiscards,
                            this.frPVCEndptInDECongDiscards,
                            this.frPVCEndptOutCongDiscards,
                            this.frPVCEndptOutDECongDiscards,
                            this.frPVCEndptOutDEFrames,
                            this.frPVCEndptAtmIwfConnIndex
                        };
                    }
                    public static final class FrPVCEndptDLCIIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptDLCIIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptDLCIIndex", "1.3.6.1.2.1.10.44.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInMaxFrameSizeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInMaxFrameSizeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInMaxFrameSize", "1.3.6.1.2.1.10.44.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInBcEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInBcEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInBc", "1.3.6.1.2.1.10.44.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInBeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInBeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInBe", "1.3.6.1.2.1.10.44.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInCIREnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInCIREnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInCIR", "1.3.6.1.2.1.10.44.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutMaxFrameSizeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutMaxFrameSizeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutMaxFrameSize", "1.3.6.1.2.1.10.44.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutBcEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutBcEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutBc", "1.3.6.1.2.1.10.44.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutBeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutBeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutBe", "1.3.6.1.2.1.10.44.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutCIREnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutCIREnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutCIR", "1.3.6.1.2.1.10.44.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptConnectIdentifierEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptConnectIdentifierEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptConnectIdentifier", "1.3.6.1.2.1.10.44.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptRowStatusEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptRowStatusEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptRowStatus", "1.3.6.1.2.1.10.44.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptRcvdSigStatusEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptRcvdSigStatusEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptRcvdSigStatus", "1.3.6.1.2.1.10.44.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInFramesEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInFramesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInFrames", "1.3.6.1.2.1.10.44.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutFramesEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutFramesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutFrames", "1.3.6.1.2.1.10.44.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInDEFramesEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInDEFramesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInDEFrames", "1.3.6.1.2.1.10.44.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInExcessFramesEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInExcessFramesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInExcessFrames", "1.3.6.1.2.1.10.44.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutExcessFramesEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutExcessFramesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutExcessFrames", "1.3.6.1.2.1.10.44.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInDiscardsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInDiscardsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInDiscards", "1.3.6.1.2.1.10.44.1.3.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInOctetsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInOctetsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInOctets", "1.3.6.1.2.1.10.44.1.3.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutOctetsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutOctetsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutOctets", "1.3.6.1.2.1.10.44.1.3.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInDiscardsDESetEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInDiscardsDESetEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInDiscardsDESet", "1.3.6.1.2.1.10.44.1.3.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInFramesFECNSetEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInFramesFECNSetEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInFramesFECNSet", "1.3.6.1.2.1.10.44.1.3.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutFramesFECNSetEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutFramesFECNSetEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutFramesFECNSet", "1.3.6.1.2.1.10.44.1.3.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInFramesBECNSetEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInFramesBECNSetEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInFramesBECNSet", "1.3.6.1.2.1.10.44.1.3.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutFramesBECNSetEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutFramesBECNSetEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutFramesBECNSet", "1.3.6.1.2.1.10.44.1.3.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInCongDiscardsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInCongDiscardsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInCongDiscards", "1.3.6.1.2.1.10.44.1.3.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptInDECongDiscardsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptInDECongDiscardsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptInDECongDiscards", "1.3.6.1.2.1.10.44.1.3.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutCongDiscardsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutCongDiscardsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutCongDiscards", "1.3.6.1.2.1.10.44.1.3.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutDECongDiscardsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutDECongDiscardsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutDECongDiscards", "1.3.6.1.2.1.10.44.1.3.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptOutDEFramesEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptOutDEFramesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptOutDEFrames", "1.3.6.1.2.1.10.44.1.3.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCEndptAtmIwfConnIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCEndptAtmIwfConnIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCEndptAtmIwfConnIndex", "1.3.6.1.2.1.10.44.1.3.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrPVCConnectIndexValueEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                private FrPVCConnectIndexValueEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frPVCConnectIndexValue", "1.3.6.1.2.1.10.44.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrPVCConnectTableEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrPVCConnectEntryEnt frPVCConnectEntry;

                private FrPVCConnectTableEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frPVCConnectTable", "1.3.6.1.2.1.10.44.1.5", false, true, false, false);
                    this.frPVCConnectEntry = new FrPVCConnectEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frPVCConnectEntry
                    };
                }
                public static final class FrPVCConnectEntryEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    public final FrPVCConnectIndexEnt frPVCConnectIndex;

                    public final FrPVCConnectLowIfIndexEnt frPVCConnectLowIfIndex;

                    public final FrPVCConnectLowDLCIIndexEnt frPVCConnectLowDLCIIndex;

                    public final FrPVCConnectHighIfIndexEnt frPVCConnectHighIfIndex;

                    public final FrPVCConnectHighDLCIIndexEnt frPVCConnectHighDLCIIndex;

                    public final FrPVCConnectAdminStatusEnt frPVCConnectAdminStatus;

                    public final FrPVCConnectL2hOperStatusEnt frPVCConnectL2hOperStatus;

                    public final FrPVCConnectH2lOperStatusEnt frPVCConnectH2lOperStatus;

                    public final FrPVCConnectL2hLastChangeEnt frPVCConnectL2hLastChange;

                    public final FrPVCConnectH2lLastChangeEnt frPVCConnectH2lLastChange;

                    public final FrPVCConnectRowStatusEnt frPVCConnectRowStatus;

                    public final FrPVCConnectUserNameEnt frPVCConnectUserName;

                    public final FrPVCConnectProviderNameEnt frPVCConnectProviderName;

                    private FrPVCConnectEntryEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frPVCConnectEntry", "1.3.6.1.2.1.10.44.1.5.1", false, false, false, true);
                        this.frPVCConnectIndex = new FrPVCConnectIndexEnt(mib, this);
                        this.frPVCConnectLowIfIndex = new FrPVCConnectLowIfIndexEnt(mib, this);
                        this.frPVCConnectLowDLCIIndex = new FrPVCConnectLowDLCIIndexEnt(mib, this);
                        this.frPVCConnectHighIfIndex = new FrPVCConnectHighIfIndexEnt(mib, this);
                        this.frPVCConnectHighDLCIIndex = new FrPVCConnectHighDLCIIndexEnt(mib, this);
                        this.frPVCConnectAdminStatus = new FrPVCConnectAdminStatusEnt(mib, this);
                        this.frPVCConnectL2hOperStatus = new FrPVCConnectL2hOperStatusEnt(mib, this);
                        this.frPVCConnectH2lOperStatus = new FrPVCConnectH2lOperStatusEnt(mib, this);
                        this.frPVCConnectL2hLastChange = new FrPVCConnectL2hLastChangeEnt(mib, this);
                        this.frPVCConnectH2lLastChange = new FrPVCConnectH2lLastChangeEnt(mib, this);
                        this.frPVCConnectRowStatus = new FrPVCConnectRowStatusEnt(mib, this);
                        this.frPVCConnectUserName = new FrPVCConnectUserNameEnt(mib, this);
                        this.frPVCConnectProviderName = new FrPVCConnectProviderNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frPVCConnectIndex,
                            this.frPVCConnectLowIfIndex,
                            this.frPVCConnectLowDLCIIndex,
                            this.frPVCConnectHighIfIndex,
                            this.frPVCConnectHighDLCIIndex,
                            this.frPVCConnectAdminStatus,
                            this.frPVCConnectL2hOperStatus,
                            this.frPVCConnectH2lOperStatus,
                            this.frPVCConnectL2hLastChange,
                            this.frPVCConnectH2lLastChange,
                            this.frPVCConnectRowStatus,
                            this.frPVCConnectUserName,
                            this.frPVCConnectProviderName
                        };
                    }
                    public static final class FrPVCConnectIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectIndex", "1.3.6.1.2.1.10.44.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectLowIfIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectLowIfIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectLowIfIndex", "1.3.6.1.2.1.10.44.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectLowDLCIIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectLowDLCIIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectLowDLCIIndex", "1.3.6.1.2.1.10.44.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectHighIfIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectHighIfIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectHighIfIndex", "1.3.6.1.2.1.10.44.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectHighDLCIIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectHighDLCIIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectHighDLCIIndex", "1.3.6.1.2.1.10.44.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectAdminStatusEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectAdminStatusEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectAdminStatus", "1.3.6.1.2.1.10.44.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectL2hOperStatusEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectL2hOperStatusEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectL2hOperStatus", "1.3.6.1.2.1.10.44.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectH2lOperStatusEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectH2lOperStatusEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectH2lOperStatus", "1.3.6.1.2.1.10.44.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectL2hLastChangeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectL2hLastChangeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectL2hLastChange", "1.3.6.1.2.1.10.44.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectH2lLastChangeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectH2lLastChangeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectH2lLastChange", "1.3.6.1.2.1.10.44.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectRowStatusEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectRowStatusEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectRowStatus", "1.3.6.1.2.1.10.44.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectUserNameEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectUserNameEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectUserName", "1.3.6.1.2.1.10.44.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrPVCConnectProviderNameEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrPVCConnectProviderNameEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frPVCConnectProviderName", "1.3.6.1.2.1.10.44.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrAccountPVCTableEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrAccountPVCEntryEnt frAccountPVCEntry;

                private FrAccountPVCTableEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frAccountPVCTable", "1.3.6.1.2.1.10.44.1.6", false, true, false, false);
                    this.frAccountPVCEntry = new FrAccountPVCEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAccountPVCEntry
                    };
                }
                public static final class FrAccountPVCEntryEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    public final FrAccountPVCDLCIIndexEnt frAccountPVCDLCIIndex;

                    public final FrAccountPVCSegmentSizeEnt frAccountPVCSegmentSize;

                    public final FrAccountPVCInSegmentsEnt frAccountPVCInSegments;

                    public final FrAccountPVCOutSegmentsEnt frAccountPVCOutSegments;

                    private FrAccountPVCEntryEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frAccountPVCEntry", "1.3.6.1.2.1.10.44.1.6.1", false, false, false, true);
                        this.frAccountPVCDLCIIndex = new FrAccountPVCDLCIIndexEnt(mib, this);
                        this.frAccountPVCSegmentSize = new FrAccountPVCSegmentSizeEnt(mib, this);
                        this.frAccountPVCInSegments = new FrAccountPVCInSegmentsEnt(mib, this);
                        this.frAccountPVCOutSegments = new FrAccountPVCOutSegmentsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frAccountPVCDLCIIndex,
                            this.frAccountPVCSegmentSize,
                            this.frAccountPVCInSegments,
                            this.frAccountPVCOutSegments
                        };
                    }
                    public static final class FrAccountPVCDLCIIndexEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountPVCDLCIIndexEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountPVCDLCIIndex", "1.3.6.1.2.1.10.44.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAccountPVCSegmentSizeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountPVCSegmentSizeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountPVCSegmentSize", "1.3.6.1.2.1.10.44.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAccountPVCInSegmentsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountPVCInSegmentsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountPVCInSegments", "1.3.6.1.2.1.10.44.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAccountPVCOutSegmentsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountPVCOutSegmentsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountPVCOutSegments", "1.3.6.1.2.1.10.44.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrAccountLportTableEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrAccountLportEntryEnt frAccountLportEntry;

                private FrAccountLportTableEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frAccountLportTable", "1.3.6.1.2.1.10.44.1.7", false, true, false, false);
                    this.frAccountLportEntry = new FrAccountLportEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAccountLportEntry
                    };
                }
                public static final class FrAccountLportEntryEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    public final FrAccountLportSegmentSizeEnt frAccountLportSegmentSize;

                    public final FrAccountLportInSegmentsEnt frAccountLportInSegments;

                    public final FrAccountLportOutSegmentsEnt frAccountLportOutSegments;

                    private FrAccountLportEntryEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frAccountLportEntry", "1.3.6.1.2.1.10.44.1.7.1", false, false, false, true);
                        this.frAccountLportSegmentSize = new FrAccountLportSegmentSizeEnt(mib, this);
                        this.frAccountLportInSegments = new FrAccountLportInSegmentsEnt(mib, this);
                        this.frAccountLportOutSegments = new FrAccountLportOutSegmentsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frAccountLportSegmentSize,
                            this.frAccountLportInSegments,
                            this.frAccountLportOutSegments
                        };
                    }
                    public static final class FrAccountLportSegmentSizeEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountLportSegmentSizeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountLportSegmentSize", "1.3.6.1.2.1.10.44.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAccountLportInSegmentsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountLportInSegmentsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountLportInSegments", "1.3.6.1.2.1.10.44.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAccountLportOutSegmentsEnt extends MIBEntry<FRNETSERVMIBDef>
                    {
                        private FrAccountLportOutSegmentsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                        {
                            super(mib, parent, "frAccountLportOutSegments", "1.3.6.1.2.1.10.44.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FrnetservTrapsEnt extends MIBEntry<FRNETSERVMIBDef>
        {
            public final FrnetservTrapsPrefixEnt frnetservTrapsPrefix;

            /** Frame Relay Network Service Notifications*/
            public final FrPVCConnectStatusChangeEnt frPVCConnectStatusChange;

            private FrnetservTrapsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
            {
                super(mib, parent, "frnetservTraps", "1.3.6.1.2.1.10.44.2", false, false, false, false);
                this.frnetservTrapsPrefix = new FrnetservTrapsPrefixEnt(mib, this);
                this.frPVCConnectStatusChange = new FrPVCConnectStatusChangeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frnetservTrapsPrefix,
                    this.frPVCConnectStatusChange
                };
            }
            public static final class FrnetservTrapsPrefixEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                public final FrPVCConnectStatusNotifEnt frPVCConnectStatusNotif;

                private FrnetservTrapsPrefixEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frnetservTrapsPrefix", "1.3.6.1.2.1.10.44.2.0", false, false, false, false);
                    this.frPVCConnectStatusNotif = new FrPVCConnectStatusNotifEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frPVCConnectStatusNotif
                    };
                }
                public static final class FrPVCConnectStatusNotifEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrPVCConnectStatusNotifEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frPVCConnectStatusNotif", "1.3.6.1.2.1.10.44.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FrPVCConnectStatusChangeEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                private FrPVCConnectStatusChangeEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frPVCConnectStatusChange", "1.3.6.1.2.1.10.44.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class FrnetservConformanceEnt extends MIBEntry<FRNETSERVMIBDef>
        {
            public final FrnetservGroupsEnt frnetservGroups;

            public final FrnetservCompliancesEnt frnetservCompliances;

            private FrnetservConformanceEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
            {
                super(mib, parent, "frnetservConformance", "1.3.6.1.2.1.10.44.3", false, false, false, false);
                this.frnetservGroups = new FrnetservGroupsEnt(mib, this);
                this.frnetservCompliances = new FrnetservCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frnetservGroups,
                    this.frnetservCompliances
                };
            }
            public static final class FrnetservGroupsEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                /** Frame Relay Service MIB Object Groups*/
                public final FrnetservLportGroupEnt frnetservLportGroup;

                public final FrnetservMgtVCSigGroupEnt frnetservMgtVCSigGroup;

                public final FrnetservPVCEndptGroupEnt frnetservPVCEndptGroup;

                public final FrnetservPVCConnectGroupEnt frnetservPVCConnectGroup;

                public final FrnetservAccountPVCGroupEnt frnetservAccountPVCGroup;

                public final FrnetservAccountLportGroupEnt frnetservAccountLportGroup;

                public final FrnetservLportGroup2Ent frnetservLportGroup2;

                public final FrnetservPVCEndptGroup2Ent frnetservPVCEndptGroup2;

                public final FrnetservPVCConnectNamesGroupEnt frnetservPVCConnectNamesGroup;

                public final FrnetservLportAdminGroupEnt frnetservLportAdminGroup;

                public final FrnetservMgtVCSigAdminGroupEnt frnetservMgtVCSigAdminGroup;

                public final FrnetservPVCNotifGroupEnt frnetservPVCNotifGroup;

                public final FrnetservPVCNotifGroup2Ent frnetservPVCNotifGroup2;

                private FrnetservGroupsEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frnetservGroups", "1.3.6.1.2.1.10.44.3.1", false, false, false, false);
                    this.frnetservLportGroup = new FrnetservLportGroupEnt(mib, this);
                    this.frnetservMgtVCSigGroup = new FrnetservMgtVCSigGroupEnt(mib, this);
                    this.frnetservPVCEndptGroup = new FrnetservPVCEndptGroupEnt(mib, this);
                    this.frnetservPVCConnectGroup = new FrnetservPVCConnectGroupEnt(mib, this);
                    this.frnetservAccountPVCGroup = new FrnetservAccountPVCGroupEnt(mib, this);
                    this.frnetservAccountLportGroup = new FrnetservAccountLportGroupEnt(mib, this);
                    this.frnetservLportGroup2 = new FrnetservLportGroup2Ent(mib, this);
                    this.frnetservPVCEndptGroup2 = new FrnetservPVCEndptGroup2Ent(mib, this);
                    this.frnetservPVCConnectNamesGroup = new FrnetservPVCConnectNamesGroupEnt(mib, this);
                    this.frnetservLportAdminGroup = new FrnetservLportAdminGroupEnt(mib, this);
                    this.frnetservMgtVCSigAdminGroup = new FrnetservMgtVCSigAdminGroupEnt(mib, this);
                    this.frnetservPVCNotifGroup = new FrnetservPVCNotifGroupEnt(mib, this);
                    this.frnetservPVCNotifGroup2 = new FrnetservPVCNotifGroup2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frnetservLportGroup,
                        this.frnetservMgtVCSigGroup,
                        this.frnetservPVCEndptGroup,
                        this.frnetservPVCConnectGroup,
                        this.frnetservAccountPVCGroup,
                        this.frnetservAccountLportGroup,
                        this.frnetservLportGroup2,
                        this.frnetservPVCEndptGroup2,
                        this.frnetservPVCConnectNamesGroup,
                        this.frnetservLportAdminGroup,
                        this.frnetservMgtVCSigAdminGroup,
                        this.frnetservPVCNotifGroup,
                        this.frnetservPVCNotifGroup2
                    };
                }
                public static final class FrnetservLportGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservLportGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservLportGroup", "1.3.6.1.2.1.10.44.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservMgtVCSigGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservMgtVCSigGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservMgtVCSigGroup", "1.3.6.1.2.1.10.44.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservPVCEndptGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservPVCEndptGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservPVCEndptGroup", "1.3.6.1.2.1.10.44.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservPVCConnectGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservPVCConnectGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservPVCConnectGroup", "1.3.6.1.2.1.10.44.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservAccountPVCGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservAccountPVCGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservAccountPVCGroup", "1.3.6.1.2.1.10.44.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservAccountLportGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservAccountLportGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservAccountLportGroup", "1.3.6.1.2.1.10.44.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservLportGroup2Ent extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservLportGroup2Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservLportGroup2", "1.3.6.1.2.1.10.44.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservPVCEndptGroup2Ent extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservPVCEndptGroup2Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservPVCEndptGroup2", "1.3.6.1.2.1.10.44.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservPVCConnectNamesGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservPVCConnectNamesGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservPVCConnectNamesGroup", "1.3.6.1.2.1.10.44.3.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservLportAdminGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservLportAdminGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservLportAdminGroup", "1.3.6.1.2.1.10.44.3.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservMgtVCSigAdminGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservMgtVCSigAdminGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservMgtVCSigAdminGroup", "1.3.6.1.2.1.10.44.3.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservPVCNotifGroupEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservPVCNotifGroupEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservPVCNotifGroup", "1.3.6.1.2.1.10.44.3.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservPVCNotifGroup2Ent extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservPVCNotifGroup2Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservPVCNotifGroup2", "1.3.6.1.2.1.10.44.3.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FrnetservCompliancesEnt extends MIBEntry<FRNETSERVMIBDef>
            {
                /** Service (Read-only) Modules*/
                public final FrnetservCompliance2Ent frnetservCompliance2;

                /** Switch (Configuration) Compliance*/
                public final FrnetSwitchComplianceEnt frnetSwitchCompliance;

                /** Historical RFC 1604 Compliance Modules*/
                public final FrnetservComplianceEnt frnetservCompliance;

                private FrnetservCompliancesEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                {
                    super(mib, parent, "frnetservCompliances", "1.3.6.1.2.1.10.44.3.2", false, false, false, false);
                    this.frnetservCompliance2 = new FrnetservCompliance2Ent(mib, this);
                    this.frnetSwitchCompliance = new FrnetSwitchComplianceEnt(mib, this);
                    this.frnetservCompliance = new FrnetservComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frnetservCompliance2,
                        this.frnetSwitchCompliance,
                        this.frnetservCompliance
                    };
                }
                public static final class FrnetservCompliance2Ent extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservCompliance2Ent(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservCompliance2", "1.3.6.1.2.1.10.44.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetSwitchComplianceEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetSwitchComplianceEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetSwitchCompliance", "1.3.6.1.2.1.10.44.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrnetservComplianceEnt extends MIBEntry<FRNETSERVMIBDef>
                {
                    private FrnetservComplianceEnt(FRNETSERVMIBDef mib, MIBEntry<FRNETSERVMIBDef> parent)
                    {
                        super(mib, parent, "frnetservCompliance", "1.3.6.1.2.1.10.44.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
