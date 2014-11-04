package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ATMACCOUNTINGINFORMATIONMIBDef extends MIB
{
    public static final ATMACCOUNTINGINFORMATIONMIBDef ATMACCOUNTINGINFORMATIONMIB = new ATMACCOUNTINGINFORMATIONMIBDef();

    static { MIBs.getInstance().registerMIB(ATMACCOUNTINGINFORMATIONMIBDef.ATMACCOUNTINGINFORMATIONMIB); }

    public final AtmAccountingInformationMIBEnt atmAccountingInformationMIB;

    private ATMACCOUNTINGINFORMATIONMIBDef()
    {
        super("ATM-ACCOUNTING-INFORMATION-MIB");
        this.atmAccountingInformationMIB = new AtmAccountingInformationMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.atmAccountingInformationMIB
        };
    }

    public static final class AtmAccountingInformationMIBEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
    {
        public final AtmAcctngMIBObjectsEnt atmAcctngMIBObjects;

        private AtmAccountingInformationMIBEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
        {
            super(mib, parent, "atmAccountingInformationMIB", "1.3.6.1.2.1.59", false, false, false, false);
            this.atmAcctngMIBObjects = new AtmAcctngMIBObjectsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.atmAcctngMIBObjects
            };
        }
        public static final class AtmAcctngMIBObjectsEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
        {
            /** Definitions of objects for use in specifying ATM accountingdata to be collected*/
            public final AtmAcctngDataObjectsEnt atmAcctngDataObjects;

            private AtmAcctngMIBObjectsEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
            {
                super(mib, parent, "atmAcctngMIBObjects", "1.3.6.1.2.1.59.1", false, false, false, false);
                this.atmAcctngDataObjects = new AtmAcctngDataObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atmAcctngDataObjects
                };
            }
            public static final class AtmAcctngDataObjectsEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
            {
                /** Objects defined under the atmAcctngDataObjects subtreeIn each case the semantics of the object are interpreted withrespect to the creation/storage of an accounting record for aparticular connection on a particular interface.*/
                public final AtmAcctngConnectionTypeEnt atmAcctngConnectionType;

                public final AtmAcctngCastTypeEnt atmAcctngCastType;

                public final AtmAcctngIfNameEnt atmAcctngIfName;

                public final AtmAcctngIfAliasEnt atmAcctngIfAlias;

                public final AtmAcctngVpiEnt atmAcctngVpi;

                public final AtmAcctngVciEnt atmAcctngVci;

                public final AtmAcctngCallingPartyEnt atmAcctngCallingParty;

                public final AtmAcctngCalledPartyEnt atmAcctngCalledParty;

                public final AtmAcctngCallReferenceEnt atmAcctngCallReference;

                public final AtmAcctngStartTimeEnt atmAcctngStartTime;

                public final AtmAcctngCollectionTimeEnt atmAcctngCollectionTime;

                public final AtmAcctngCollectModeEnt atmAcctngCollectMode;

                public final AtmAcctngReleaseCauseEnt atmAcctngReleaseCause;

                public final AtmAcctngServiceCategoryEnt atmAcctngServiceCategory;

                public final AtmAcctngTransmittedCellsEnt atmAcctngTransmittedCells;

                public final AtmAcctngTransmittedClp0CellsEnt atmAcctngTransmittedClp0Cells;

                public final AtmAcctngReceivedCellsEnt atmAcctngReceivedCells;

                public final AtmAcctngReceivedClp0CellsEnt atmAcctngReceivedClp0Cells;

                public final AtmAcctngTransmitTrafficDescriptorTypeEnt atmAcctngTransmitTrafficDescriptorType;

                public final AtmAcctngTransmitTrafficDescriptorParam1Ent atmAcctngTransmitTrafficDescriptorParam1;

                public final AtmAcctngTransmitTrafficDescriptorParam2Ent atmAcctngTransmitTrafficDescriptorParam2;

                public final AtmAcctngTransmitTrafficDescriptorParam3Ent atmAcctngTransmitTrafficDescriptorParam3;

                public final AtmAcctngTransmitTrafficDescriptorParam4Ent atmAcctngTransmitTrafficDescriptorParam4;

                public final AtmAcctngTransmitTrafficDescriptorParam5Ent atmAcctngTransmitTrafficDescriptorParam5;

                public final AtmAcctngReceiveTrafficDescriptorTypeEnt atmAcctngReceiveTrafficDescriptorType;

                public final AtmAcctngReceiveTrafficDescriptorParam1Ent atmAcctngReceiveTrafficDescriptorParam1;

                public final AtmAcctngReceiveTrafficDescriptorParam2Ent atmAcctngReceiveTrafficDescriptorParam2;

                public final AtmAcctngReceiveTrafficDescriptorParam3Ent atmAcctngReceiveTrafficDescriptorParam3;

                public final AtmAcctngReceiveTrafficDescriptorParam4Ent atmAcctngReceiveTrafficDescriptorParam4;

                public final AtmAcctngReceiveTrafficDescriptorParam5Ent atmAcctngReceiveTrafficDescriptorParam5;

                public final AtmAcctngCallingPartySubAddressEnt atmAcctngCallingPartySubAddress;

                public final AtmAcctngCalledPartySubAddressEnt atmAcctngCalledPartySubAddress;

                public final AtmAcctngRecordCrc16Ent atmAcctngRecordCrc16;

                private AtmAcctngDataObjectsEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                {
                    super(mib, parent, "atmAcctngDataObjects", "1.3.6.1.2.1.59.1.1", false, false, false, false);
                    this.atmAcctngConnectionType = new AtmAcctngConnectionTypeEnt(mib, this);
                    this.atmAcctngCastType = new AtmAcctngCastTypeEnt(mib, this);
                    this.atmAcctngIfName = new AtmAcctngIfNameEnt(mib, this);
                    this.atmAcctngIfAlias = new AtmAcctngIfAliasEnt(mib, this);
                    this.atmAcctngVpi = new AtmAcctngVpiEnt(mib, this);
                    this.atmAcctngVci = new AtmAcctngVciEnt(mib, this);
                    this.atmAcctngCallingParty = new AtmAcctngCallingPartyEnt(mib, this);
                    this.atmAcctngCalledParty = new AtmAcctngCalledPartyEnt(mib, this);
                    this.atmAcctngCallReference = new AtmAcctngCallReferenceEnt(mib, this);
                    this.atmAcctngStartTime = new AtmAcctngStartTimeEnt(mib, this);
                    this.atmAcctngCollectionTime = new AtmAcctngCollectionTimeEnt(mib, this);
                    this.atmAcctngCollectMode = new AtmAcctngCollectModeEnt(mib, this);
                    this.atmAcctngReleaseCause = new AtmAcctngReleaseCauseEnt(mib, this);
                    this.atmAcctngServiceCategory = new AtmAcctngServiceCategoryEnt(mib, this);
                    this.atmAcctngTransmittedCells = new AtmAcctngTransmittedCellsEnt(mib, this);
                    this.atmAcctngTransmittedClp0Cells = new AtmAcctngTransmittedClp0CellsEnt(mib, this);
                    this.atmAcctngReceivedCells = new AtmAcctngReceivedCellsEnt(mib, this);
                    this.atmAcctngReceivedClp0Cells = new AtmAcctngReceivedClp0CellsEnt(mib, this);
                    this.atmAcctngTransmitTrafficDescriptorType = new AtmAcctngTransmitTrafficDescriptorTypeEnt(mib, this);
                    this.atmAcctngTransmitTrafficDescriptorParam1 = new AtmAcctngTransmitTrafficDescriptorParam1Ent(mib, this);
                    this.atmAcctngTransmitTrafficDescriptorParam2 = new AtmAcctngTransmitTrafficDescriptorParam2Ent(mib, this);
                    this.atmAcctngTransmitTrafficDescriptorParam3 = new AtmAcctngTransmitTrafficDescriptorParam3Ent(mib, this);
                    this.atmAcctngTransmitTrafficDescriptorParam4 = new AtmAcctngTransmitTrafficDescriptorParam4Ent(mib, this);
                    this.atmAcctngTransmitTrafficDescriptorParam5 = new AtmAcctngTransmitTrafficDescriptorParam5Ent(mib, this);
                    this.atmAcctngReceiveTrafficDescriptorType = new AtmAcctngReceiveTrafficDescriptorTypeEnt(mib, this);
                    this.atmAcctngReceiveTrafficDescriptorParam1 = new AtmAcctngReceiveTrafficDescriptorParam1Ent(mib, this);
                    this.atmAcctngReceiveTrafficDescriptorParam2 = new AtmAcctngReceiveTrafficDescriptorParam2Ent(mib, this);
                    this.atmAcctngReceiveTrafficDescriptorParam3 = new AtmAcctngReceiveTrafficDescriptorParam3Ent(mib, this);
                    this.atmAcctngReceiveTrafficDescriptorParam4 = new AtmAcctngReceiveTrafficDescriptorParam4Ent(mib, this);
                    this.atmAcctngReceiveTrafficDescriptorParam5 = new AtmAcctngReceiveTrafficDescriptorParam5Ent(mib, this);
                    this.atmAcctngCallingPartySubAddress = new AtmAcctngCallingPartySubAddressEnt(mib, this);
                    this.atmAcctngCalledPartySubAddress = new AtmAcctngCalledPartySubAddressEnt(mib, this);
                    this.atmAcctngRecordCrc16 = new AtmAcctngRecordCrc16Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmAcctngConnectionType,
                        this.atmAcctngCastType,
                        this.atmAcctngIfName,
                        this.atmAcctngIfAlias,
                        this.atmAcctngVpi,
                        this.atmAcctngVci,
                        this.atmAcctngCallingParty,
                        this.atmAcctngCalledParty,
                        this.atmAcctngCallReference,
                        this.atmAcctngStartTime,
                        this.atmAcctngCollectionTime,
                        this.atmAcctngCollectMode,
                        this.atmAcctngReleaseCause,
                        this.atmAcctngServiceCategory,
                        this.atmAcctngTransmittedCells,
                        this.atmAcctngTransmittedClp0Cells,
                        this.atmAcctngReceivedCells,
                        this.atmAcctngReceivedClp0Cells,
                        this.atmAcctngTransmitTrafficDescriptorType,
                        this.atmAcctngTransmitTrafficDescriptorParam1,
                        this.atmAcctngTransmitTrafficDescriptorParam2,
                        this.atmAcctngTransmitTrafficDescriptorParam3,
                        this.atmAcctngTransmitTrafficDescriptorParam4,
                        this.atmAcctngTransmitTrafficDescriptorParam5,
                        this.atmAcctngReceiveTrafficDescriptorType,
                        this.atmAcctngReceiveTrafficDescriptorParam1,
                        this.atmAcctngReceiveTrafficDescriptorParam2,
                        this.atmAcctngReceiveTrafficDescriptorParam3,
                        this.atmAcctngReceiveTrafficDescriptorParam4,
                        this.atmAcctngReceiveTrafficDescriptorParam5,
                        this.atmAcctngCallingPartySubAddress,
                        this.atmAcctngCalledPartySubAddress,
                        this.atmAcctngRecordCrc16
                    };
                }
                public static final class AtmAcctngConnectionTypeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngConnectionTypeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngConnectionType", "1.3.6.1.2.1.59.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCastTypeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCastTypeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCastType", "1.3.6.1.2.1.59.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngIfNameEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngIfNameEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngIfName", "1.3.6.1.2.1.59.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngIfAliasEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngIfAliasEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngIfAlias", "1.3.6.1.2.1.59.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngVpiEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngVpiEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngVpi", "1.3.6.1.2.1.59.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngVciEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngVciEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngVci", "1.3.6.1.2.1.59.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCallingPartyEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCallingPartyEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCallingParty", "1.3.6.1.2.1.59.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCalledPartyEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCalledPartyEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCalledParty", "1.3.6.1.2.1.59.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCallReferenceEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCallReferenceEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCallReference", "1.3.6.1.2.1.59.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngStartTimeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngStartTimeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngStartTime", "1.3.6.1.2.1.59.1.1.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCollectionTimeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCollectionTimeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCollectionTime", "1.3.6.1.2.1.59.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCollectModeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCollectModeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCollectMode", "1.3.6.1.2.1.59.1.1.12", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReleaseCauseEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReleaseCauseEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReleaseCause", "1.3.6.1.2.1.59.1.1.13", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngServiceCategoryEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngServiceCategoryEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngServiceCategory", "1.3.6.1.2.1.59.1.1.14", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmittedCellsEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmittedCellsEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmittedCells", "1.3.6.1.2.1.59.1.1.15", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmittedClp0CellsEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmittedClp0CellsEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmittedClp0Cells", "1.3.6.1.2.1.59.1.1.16", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceivedCellsEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceivedCellsEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceivedCells", "1.3.6.1.2.1.59.1.1.17", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceivedClp0CellsEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceivedClp0CellsEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceivedClp0Cells", "1.3.6.1.2.1.59.1.1.18", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmitTrafficDescriptorTypeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmitTrafficDescriptorTypeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmitTrafficDescriptorType", "1.3.6.1.2.1.59.1.1.19", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmitTrafficDescriptorParam1Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmitTrafficDescriptorParam1Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmitTrafficDescriptorParam1", "1.3.6.1.2.1.59.1.1.20", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmitTrafficDescriptorParam2Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmitTrafficDescriptorParam2Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmitTrafficDescriptorParam2", "1.3.6.1.2.1.59.1.1.21", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmitTrafficDescriptorParam3Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmitTrafficDescriptorParam3Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmitTrafficDescriptorParam3", "1.3.6.1.2.1.59.1.1.22", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmitTrafficDescriptorParam4Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmitTrafficDescriptorParam4Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmitTrafficDescriptorParam4", "1.3.6.1.2.1.59.1.1.23", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngTransmitTrafficDescriptorParam5Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngTransmitTrafficDescriptorParam5Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngTransmitTrafficDescriptorParam5", "1.3.6.1.2.1.59.1.1.24", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceiveTrafficDescriptorTypeEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceiveTrafficDescriptorTypeEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceiveTrafficDescriptorType", "1.3.6.1.2.1.59.1.1.25", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceiveTrafficDescriptorParam1Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceiveTrafficDescriptorParam1Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceiveTrafficDescriptorParam1", "1.3.6.1.2.1.59.1.1.26", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceiveTrafficDescriptorParam2Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceiveTrafficDescriptorParam2Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceiveTrafficDescriptorParam2", "1.3.6.1.2.1.59.1.1.27", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceiveTrafficDescriptorParam3Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceiveTrafficDescriptorParam3Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceiveTrafficDescriptorParam3", "1.3.6.1.2.1.59.1.1.28", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceiveTrafficDescriptorParam4Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceiveTrafficDescriptorParam4Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceiveTrafficDescriptorParam4", "1.3.6.1.2.1.59.1.1.29", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngReceiveTrafficDescriptorParam5Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngReceiveTrafficDescriptorParam5Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngReceiveTrafficDescriptorParam5", "1.3.6.1.2.1.59.1.1.30", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCallingPartySubAddressEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCallingPartySubAddressEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCallingPartySubAddress", "1.3.6.1.2.1.59.1.1.31", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngCalledPartySubAddressEnt extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngCalledPartySubAddressEnt(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngCalledPartySubAddress", "1.3.6.1.2.1.59.1.1.32", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmAcctngRecordCrc16Ent extends MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef>
                {
                    private AtmAcctngRecordCrc16Ent(ATMACCOUNTINGINFORMATIONMIBDef mib, MIBEntry<ATMACCOUNTINGINFORMATIONMIBDef> parent)
                    {
                        super(mib, parent, "atmAcctngRecordCrc16", "1.3.6.1.2.1.59.1.1.33", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
