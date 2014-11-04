package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ENTITYMIBDef extends MIB
{
    public static final ENTITYMIBDef ENTITYMIB = new ENTITYMIBDef();

    static { MIBs.getInstance().registerMIB(ENTITYMIBDef.ENTITYMIB); }

    public final EntityMIBEnt entityMIB;

    private ENTITYMIBDef()
    {
        super("ENTITY-MIB");
        this.entityMIB = new EntityMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.entityMIB
        };
    }

    public static final class EntityMIBEnt extends MIBEntry<ENTITYMIBDef>
    {
        public final EntityMIBObjectsEnt entityMIBObjects;

        /** Entity MIB Trap Definitions*/
        public final EntityMIBTrapsEnt entityMIBTraps;

        /** conformance information*/
        public final EntityConformanceEnt entityConformance;

        private EntityMIBEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
        {
            super(mib, parent, "entityMIB", "1.3.6.1.2.1.47", false, false, false, false);
            this.entityMIBObjects = new EntityMIBObjectsEnt(mib, this);
            this.entityMIBTraps = new EntityMIBTrapsEnt(mib, this);
            this.entityConformance = new EntityConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.entityMIBObjects,
                this.entityMIBTraps,
                this.entityConformance
            };
        }
        public static final class EntityMIBObjectsEnt extends MIBEntry<ENTITYMIBDef>
        {
            /** MIB contains four groups*/
            public final EntityPhysicalEnt entityPhysical;

            public final EntityLogicalEnt entityLogical;

            public final EntityMappingEnt entityMapping;

            public final EntityGeneralEnt entityGeneral;

            private EntityMIBObjectsEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
            {
                super(mib, parent, "entityMIBObjects", "1.3.6.1.2.1.47.1", false, false, false, false);
                this.entityPhysical = new EntityPhysicalEnt(mib, this);
                this.entityLogical = new EntityLogicalEnt(mib, this);
                this.entityMapping = new EntityMappingEnt(mib, this);
                this.entityGeneral = new EntityGeneralEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entityPhysical,
                    this.entityLogical,
                    this.entityMapping,
                    this.entityGeneral
                };
            }
            public static final class EntityPhysicalEnt extends MIBEntry<ENTITYMIBDef>
            {
                /** empty string or SnmpEngineID

The Physical Entity Table*/
                public final EntPhysicalTableEnt entPhysicalTable;

                private EntityPhysicalEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityPhysical", "1.3.6.1.2.1.47.1.1", false, false, false, false);
                    this.entPhysicalTable = new EntPhysicalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entPhysicalTable
                    };
                }
                public static final class EntPhysicalTableEnt extends MIBEntry<ENTITYMIBDef>
                {
                    public final EntPhysicalEntryEnt entPhysicalEntry;

                    private EntPhysicalTableEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entPhysicalTable", "1.3.6.1.2.1.47.1.1.1", false, true, false, false);
                        this.entPhysicalEntry = new EntPhysicalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entPhysicalEntry
                        };
                    }
                    public static final class EntPhysicalEntryEnt extends MIBEntry<ENTITYMIBDef>
                    {
                        public final EntPhysicalIndexEnt entPhysicalIndex;

                        public final EntPhysicalDescrEnt entPhysicalDescr;

                        public final EntPhysicalVendorTypeEnt entPhysicalVendorType;

                        public final EntPhysicalContainedInEnt entPhysicalContainedIn;

                        public final EntPhysicalClassEnt entPhysicalClass;

                        public final EntPhysicalParentRelPosEnt entPhysicalParentRelPos;

                        public final EntPhysicalNameEnt entPhysicalName;

                        public final EntPhysicalHardwareRevEnt entPhysicalHardwareRev;

                        public final EntPhysicalFirmwareRevEnt entPhysicalFirmwareRev;

                        public final EntPhysicalSoftwareRevEnt entPhysicalSoftwareRev;

                        public final EntPhysicalSerialNumEnt entPhysicalSerialNum;

                        public final EntPhysicalMfgNameEnt entPhysicalMfgName;

                        public final EntPhysicalModelNameEnt entPhysicalModelName;

                        public final EntPhysicalAliasEnt entPhysicalAlias;

                        public final EntPhysicalAssetIDEnt entPhysicalAssetID;

                        public final EntPhysicalIsFRUEnt entPhysicalIsFRU;

                        public final EntPhysicalMfgDateEnt entPhysicalMfgDate;

                        public final EntPhysicalUrisEnt entPhysicalUris;

                        private EntPhysicalEntryEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                        {
                            super(mib, parent, "entPhysicalEntry", "1.3.6.1.2.1.47.1.1.1.1", false, false, false, true);
                            this.entPhysicalIndex = new EntPhysicalIndexEnt(mib, this);
                            this.entPhysicalDescr = new EntPhysicalDescrEnt(mib, this);
                            this.entPhysicalVendorType = new EntPhysicalVendorTypeEnt(mib, this);
                            this.entPhysicalContainedIn = new EntPhysicalContainedInEnt(mib, this);
                            this.entPhysicalClass = new EntPhysicalClassEnt(mib, this);
                            this.entPhysicalParentRelPos = new EntPhysicalParentRelPosEnt(mib, this);
                            this.entPhysicalName = new EntPhysicalNameEnt(mib, this);
                            this.entPhysicalHardwareRev = new EntPhysicalHardwareRevEnt(mib, this);
                            this.entPhysicalFirmwareRev = new EntPhysicalFirmwareRevEnt(mib, this);
                            this.entPhysicalSoftwareRev = new EntPhysicalSoftwareRevEnt(mib, this);
                            this.entPhysicalSerialNum = new EntPhysicalSerialNumEnt(mib, this);
                            this.entPhysicalMfgName = new EntPhysicalMfgNameEnt(mib, this);
                            this.entPhysicalModelName = new EntPhysicalModelNameEnt(mib, this);
                            this.entPhysicalAlias = new EntPhysicalAliasEnt(mib, this);
                            this.entPhysicalAssetID = new EntPhysicalAssetIDEnt(mib, this);
                            this.entPhysicalIsFRU = new EntPhysicalIsFRUEnt(mib, this);
                            this.entPhysicalMfgDate = new EntPhysicalMfgDateEnt(mib, this);
                            this.entPhysicalUris = new EntPhysicalUrisEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.entPhysicalIndex,
                                this.entPhysicalDescr,
                                this.entPhysicalVendorType,
                                this.entPhysicalContainedIn,
                                this.entPhysicalClass,
                                this.entPhysicalParentRelPos,
                                this.entPhysicalName,
                                this.entPhysicalHardwareRev,
                                this.entPhysicalFirmwareRev,
                                this.entPhysicalSoftwareRev,
                                this.entPhysicalSerialNum,
                                this.entPhysicalMfgName,
                                this.entPhysicalModelName,
                                this.entPhysicalAlias,
                                this.entPhysicalAssetID,
                                this.entPhysicalIsFRU,
                                this.entPhysicalMfgDate,
                                this.entPhysicalUris
                            };
                        }
                        public static final class EntPhysicalIndexEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalIndexEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalIndex", "1.3.6.1.2.1.47.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalDescrEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalDescrEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalDescr", "1.3.6.1.2.1.47.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalVendorTypeEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalVendorTypeEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalVendorType", "1.3.6.1.2.1.47.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalContainedInEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalContainedInEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalContainedIn", "1.3.6.1.2.1.47.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalClassEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalClassEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalClass", "1.3.6.1.2.1.47.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalParentRelPosEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalParentRelPosEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalParentRelPos", "1.3.6.1.2.1.47.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalNameEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalNameEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalName", "1.3.6.1.2.1.47.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalHardwareRevEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalHardwareRevEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalHardwareRev", "1.3.6.1.2.1.47.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalFirmwareRevEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalFirmwareRevEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalFirmwareRev", "1.3.6.1.2.1.47.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalSoftwareRevEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalSoftwareRevEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalSoftwareRev", "1.3.6.1.2.1.47.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalSerialNumEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalSerialNumEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalSerialNum", "1.3.6.1.2.1.47.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalMfgNameEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalMfgNameEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalMfgName", "1.3.6.1.2.1.47.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalModelNameEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalModelNameEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalModelName", "1.3.6.1.2.1.47.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalAliasEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalAliasEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalAlias", "1.3.6.1.2.1.47.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalAssetIDEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalAssetIDEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalAssetID", "1.3.6.1.2.1.47.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalIsFRUEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalIsFRUEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalIsFRU", "1.3.6.1.2.1.47.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalMfgDateEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalMfgDateEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalMfgDate", "1.3.6.1.2.1.47.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntPhysicalUrisEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalUrisEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalUris", "1.3.6.1.2.1.47.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EntityLogicalEnt extends MIBEntry<ENTITYMIBDef>
            {
                /** The Logical Entity Table*/
                public final EntLogicalTableEnt entLogicalTable;

                private EntityLogicalEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityLogical", "1.3.6.1.2.1.47.1.2", false, false, false, false);
                    this.entLogicalTable = new EntLogicalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entLogicalTable
                    };
                }
                public static final class EntLogicalTableEnt extends MIBEntry<ENTITYMIBDef>
                {
                    public final EntLogicalEntryEnt entLogicalEntry;

                    private EntLogicalTableEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entLogicalTable", "1.3.6.1.2.1.47.1.2.1", false, true, false, false);
                        this.entLogicalEntry = new EntLogicalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entLogicalEntry
                        };
                    }
                    public static final class EntLogicalEntryEnt extends MIBEntry<ENTITYMIBDef>
                    {
                        public final EntLogicalIndexEnt entLogicalIndex;

                        public final EntLogicalDescrEnt entLogicalDescr;

                        public final EntLogicalTypeEnt entLogicalType;

                        public final EntLogicalCommunityEnt entLogicalCommunity;

                        public final EntLogicalTAddressEnt entLogicalTAddress;

                        public final EntLogicalTDomainEnt entLogicalTDomain;

                        public final EntLogicalContextEngineIDEnt entLogicalContextEngineID;

                        public final EntLogicalContextNameEnt entLogicalContextName;

                        private EntLogicalEntryEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                        {
                            super(mib, parent, "entLogicalEntry", "1.3.6.1.2.1.47.1.2.1.1", false, false, false, true);
                            this.entLogicalIndex = new EntLogicalIndexEnt(mib, this);
                            this.entLogicalDescr = new EntLogicalDescrEnt(mib, this);
                            this.entLogicalType = new EntLogicalTypeEnt(mib, this);
                            this.entLogicalCommunity = new EntLogicalCommunityEnt(mib, this);
                            this.entLogicalTAddress = new EntLogicalTAddressEnt(mib, this);
                            this.entLogicalTDomain = new EntLogicalTDomainEnt(mib, this);
                            this.entLogicalContextEngineID = new EntLogicalContextEngineIDEnt(mib, this);
                            this.entLogicalContextName = new EntLogicalContextNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.entLogicalIndex,
                                this.entLogicalDescr,
                                this.entLogicalType,
                                this.entLogicalCommunity,
                                this.entLogicalTAddress,
                                this.entLogicalTDomain,
                                this.entLogicalContextEngineID,
                                this.entLogicalContextName
                            };
                        }
                        public static final class EntLogicalIndexEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalIndexEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalIndex", "1.3.6.1.2.1.47.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalDescrEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalDescrEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalDescr", "1.3.6.1.2.1.47.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalTypeEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalTypeEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalType", "1.3.6.1.2.1.47.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalCommunityEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalCommunityEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalCommunity", "1.3.6.1.2.1.47.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalTAddressEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalTAddressEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalTAddress", "1.3.6.1.2.1.47.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalTDomainEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalTDomainEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalTDomain", "1.3.6.1.2.1.47.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalContextEngineIDEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalContextEngineIDEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalContextEngineID", "1.3.6.1.2.1.47.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntLogicalContextNameEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLogicalContextNameEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLogicalContextName", "1.3.6.1.2.1.47.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EntityMappingEnt extends MIBEntry<ENTITYMIBDef>
            {
                public final EntLPMappingTableEnt entLPMappingTable;

                /** logical entity/component to alias table*/
                public final EntAliasMappingTableEnt entAliasMappingTable;

                /** physical mapping table*/
                public final EntPhysicalContainsTableEnt entPhysicalContainsTable;

                private EntityMappingEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityMapping", "1.3.6.1.2.1.47.1.3", false, false, false, false);
                    this.entLPMappingTable = new EntLPMappingTableEnt(mib, this);
                    this.entAliasMappingTable = new EntAliasMappingTableEnt(mib, this);
                    this.entPhysicalContainsTable = new EntPhysicalContainsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entLPMappingTable,
                        this.entAliasMappingTable,
                        this.entPhysicalContainsTable
                    };
                }
                public static final class EntLPMappingTableEnt extends MIBEntry<ENTITYMIBDef>
                {
                    public final EntLPMappingEntryEnt entLPMappingEntry;

                    private EntLPMappingTableEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entLPMappingTable", "1.3.6.1.2.1.47.1.3.1", false, true, false, false);
                        this.entLPMappingEntry = new EntLPMappingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entLPMappingEntry
                        };
                    }
                    public static final class EntLPMappingEntryEnt extends MIBEntry<ENTITYMIBDef>
                    {
                        public final EntLPPhysicalIndexEnt entLPPhysicalIndex;

                        private EntLPMappingEntryEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                        {
                            super(mib, parent, "entLPMappingEntry", "1.3.6.1.2.1.47.1.3.1.1", false, false, false, true);
                            this.entLPPhysicalIndex = new EntLPPhysicalIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.entLPPhysicalIndex
                            };
                        }
                        public static final class EntLPPhysicalIndexEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntLPPhysicalIndexEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entLPPhysicalIndex", "1.3.6.1.2.1.47.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EntAliasMappingTableEnt extends MIBEntry<ENTITYMIBDef>
                {
                    public final EntAliasMappingEntryEnt entAliasMappingEntry;

                    private EntAliasMappingTableEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entAliasMappingTable", "1.3.6.1.2.1.47.1.3.2", false, true, false, false);
                        this.entAliasMappingEntry = new EntAliasMappingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entAliasMappingEntry
                        };
                    }
                    public static final class EntAliasMappingEntryEnt extends MIBEntry<ENTITYMIBDef>
                    {
                        public final EntAliasLogicalIndexOrZeroEnt entAliasLogicalIndexOrZero;

                        public final EntAliasMappingIdentifierEnt entAliasMappingIdentifier;

                        private EntAliasMappingEntryEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                        {
                            super(mib, parent, "entAliasMappingEntry", "1.3.6.1.2.1.47.1.3.2.1", false, false, false, true);
                            this.entAliasLogicalIndexOrZero = new EntAliasLogicalIndexOrZeroEnt(mib, this);
                            this.entAliasMappingIdentifier = new EntAliasMappingIdentifierEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.entAliasLogicalIndexOrZero,
                                this.entAliasMappingIdentifier
                            };
                        }
                        public static final class EntAliasLogicalIndexOrZeroEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntAliasLogicalIndexOrZeroEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entAliasLogicalIndexOrZero", "1.3.6.1.2.1.47.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EntAliasMappingIdentifierEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntAliasMappingIdentifierEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entAliasMappingIdentifier", "1.3.6.1.2.1.47.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EntPhysicalContainsTableEnt extends MIBEntry<ENTITYMIBDef>
                {
                    public final EntPhysicalContainsEntryEnt entPhysicalContainsEntry;

                    private EntPhysicalContainsTableEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entPhysicalContainsTable", "1.3.6.1.2.1.47.1.3.3", false, true, false, false);
                        this.entPhysicalContainsEntry = new EntPhysicalContainsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entPhysicalContainsEntry
                        };
                    }
                    public static final class EntPhysicalContainsEntryEnt extends MIBEntry<ENTITYMIBDef>
                    {
                        public final EntPhysicalChildIndexEnt entPhysicalChildIndex;

                        private EntPhysicalContainsEntryEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                        {
                            super(mib, parent, "entPhysicalContainsEntry", "1.3.6.1.2.1.47.1.3.3.1", false, false, false, true);
                            this.entPhysicalChildIndex = new EntPhysicalChildIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.entPhysicalChildIndex
                            };
                        }
                        public static final class EntPhysicalChildIndexEnt extends MIBEntry<ENTITYMIBDef>
                        {
                            private EntPhysicalChildIndexEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                            {
                                super(mib, parent, "entPhysicalChildIndex", "1.3.6.1.2.1.47.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EntityGeneralEnt extends MIBEntry<ENTITYMIBDef>
            {
                /** last change time stamp for the whole MIB*/
                public final EntLastChangeTimeEnt entLastChangeTime;

                private EntityGeneralEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityGeneral", "1.3.6.1.2.1.47.1.4", false, false, false, false);
                    this.entLastChangeTime = new EntLastChangeTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entLastChangeTime
                    };
                }
                public static final class EntLastChangeTimeEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntLastChangeTimeEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entLastChangeTime", "1.3.6.1.2.1.47.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class EntityMIBTrapsEnt extends MIBEntry<ENTITYMIBDef>
        {
            public final EntityMIBTrapPrefixEnt entityMIBTrapPrefix;

            private EntityMIBTrapsEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
            {
                super(mib, parent, "entityMIBTraps", "1.3.6.1.2.1.47.2", false, false, false, false);
                this.entityMIBTrapPrefix = new EntityMIBTrapPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entityMIBTrapPrefix
                };
            }
            public static final class EntityMIBTrapPrefixEnt extends MIBEntry<ENTITYMIBDef>
            {
                public final EntConfigChangeEnt entConfigChange;

                private EntityMIBTrapPrefixEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityMIBTrapPrefix", "1.3.6.1.2.1.47.2.0", false, false, false, false);
                    this.entConfigChange = new EntConfigChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entConfigChange
                    };
                }
                public static final class EntConfigChangeEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntConfigChangeEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entConfigChange", "1.3.6.1.2.1.47.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class EntityConformanceEnt extends MIBEntry<ENTITYMIBDef>
        {
            public final EntityCompliancesEnt entityCompliances;

            public final EntityGroupsEnt entityGroups;

            private EntityConformanceEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
            {
                super(mib, parent, "entityConformance", "1.3.6.1.2.1.47.3", false, false, false, false);
                this.entityCompliances = new EntityCompliancesEnt(mib, this);
                this.entityGroups = new EntityGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entityCompliances,
                    this.entityGroups
                };
            }
            public static final class EntityCompliancesEnt extends MIBEntry<ENTITYMIBDef>
            {
                /** compliance statements*/
                public final EntityComplianceEnt entityCompliance;

                public final Entity2ComplianceEnt entity2Compliance;

                public final Entity3ComplianceEnt entity3Compliance;

                private EntityCompliancesEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityCompliances", "1.3.6.1.2.1.47.3.1", false, false, false, false);
                    this.entityCompliance = new EntityComplianceEnt(mib, this);
                    this.entity2Compliance = new Entity2ComplianceEnt(mib, this);
                    this.entity3Compliance = new Entity3ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entityCompliance,
                        this.entity2Compliance,
                        this.entity3Compliance
                    };
                }
                public static final class EntityComplianceEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityComplianceEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityCompliance", "1.3.6.1.2.1.47.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Entity2ComplianceEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private Entity2ComplianceEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entity2Compliance", "1.3.6.1.2.1.47.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Entity3ComplianceEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private Entity3ComplianceEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entity3Compliance", "1.3.6.1.2.1.47.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EntityGroupsEnt extends MIBEntry<ENTITYMIBDef>
            {
                /** MIB groupings*/
                public final EntityPhysicalGroupEnt entityPhysicalGroup;

                public final EntityLogicalGroupEnt entityLogicalGroup;

                public final EntityMappingGroupEnt entityMappingGroup;

                public final EntityGeneralGroupEnt entityGeneralGroup;

                public final EntityNotificationsGroupEnt entityNotificationsGroup;

                public final EntityPhysical2GroupEnt entityPhysical2Group;

                public final EntityLogical2GroupEnt entityLogical2Group;

                public final EntityPhysical3GroupEnt entityPhysical3Group;

                private EntityGroupsEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                {
                    super(mib, parent, "entityGroups", "1.3.6.1.2.1.47.3.2", false, false, false, false);
                    this.entityPhysicalGroup = new EntityPhysicalGroupEnt(mib, this);
                    this.entityLogicalGroup = new EntityLogicalGroupEnt(mib, this);
                    this.entityMappingGroup = new EntityMappingGroupEnt(mib, this);
                    this.entityGeneralGroup = new EntityGeneralGroupEnt(mib, this);
                    this.entityNotificationsGroup = new EntityNotificationsGroupEnt(mib, this);
                    this.entityPhysical2Group = new EntityPhysical2GroupEnt(mib, this);
                    this.entityLogical2Group = new EntityLogical2GroupEnt(mib, this);
                    this.entityPhysical3Group = new EntityPhysical3GroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entityPhysicalGroup,
                        this.entityLogicalGroup,
                        this.entityMappingGroup,
                        this.entityGeneralGroup,
                        this.entityNotificationsGroup,
                        this.entityPhysical2Group,
                        this.entityLogical2Group,
                        this.entityPhysical3Group
                    };
                }
                public static final class EntityPhysicalGroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityPhysicalGroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityPhysicalGroup", "1.3.6.1.2.1.47.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityLogicalGroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityLogicalGroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityLogicalGroup", "1.3.6.1.2.1.47.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityMappingGroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityMappingGroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityMappingGroup", "1.3.6.1.2.1.47.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityGeneralGroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityGeneralGroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityGeneralGroup", "1.3.6.1.2.1.47.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityNotificationsGroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityNotificationsGroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityNotificationsGroup", "1.3.6.1.2.1.47.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityPhysical2GroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityPhysical2GroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityPhysical2Group", "1.3.6.1.2.1.47.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityLogical2GroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityLogical2GroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityLogical2Group", "1.3.6.1.2.1.47.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntityPhysical3GroupEnt extends MIBEntry<ENTITYMIBDef>
                {
                    private EntityPhysical3GroupEnt(ENTITYMIBDef mib, MIBEntry<ENTITYMIBDef> parent)
                    {
                        super(mib, parent, "entityPhysical3Group", "1.3.6.1.2.1.47.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
