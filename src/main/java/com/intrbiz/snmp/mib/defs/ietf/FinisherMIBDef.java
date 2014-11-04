package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]
[RFC2790]
[RFC3805]
[RFC3805]*/
public final class FinisherMIBDef extends MIB
{
    public static final FinisherMIBDef FinisherMIB = new FinisherMIBDef();

    static { MIBs.getInstance().registerMIB(FinisherMIBDef.FinisherMIB); }

    public final FinisherMIBEnt finisherMIB;

    /** Finisher Device Group (Mandatory)A printer may support zero or more finishing subunits.  Afinishing device subunit may be associated with one or moreoutput subunits and one or more media path subunits.*/
    public final FinDeviceEnt finDevice;

    /** Finisher Supply Group (Mandatory)A finisher device, but not all finisher devices, may have one or moresupplies associated with it.  For example a finisher may use bothbinding tape and stitching wire supplies. A finisher may also havemore than one source for a given type of supply e.g., multiple supplysources of ink for imprinters.*/
    public final FinSupplyEnt finSupply;

    /** Finisher Supply, Media Input Group (Conditionally Mandatory)A finisher device may have one or more associated supply mediainputs.  Each entry in this table defines an input for asupply media type such as inserts, covers, etc.This group is mandatory only if the printer system contains afinisher device that requires a media supply used exclusively by afinishing process.  Examples are inserts or covers that are notsupplied by an input subunit that provides media to the marker.*/
    public final FinSupplyMediaInputEnt finSupplyMediaInput;

    /** Finisher Device Attribute Group (Mandatory)A finisher device subunit may have one or more parameters thatcannot be specified by any other objects in the MIB.  TheDevice Attribute group facilitates the definition of theseparameters.  The objects which define the attributes areread-write, to allow both Set and Get operations.At least one table entry must exist for each finisher device definedby the MIB.  If no other entry is possible for a finisher device, thedeviceName(3) attribute MUST be returned.*/
    public final FinDeviceAttributeEnt finDeviceAttribute;

    /** Conformance Information
compliance statements*/
    public final FinMIBComplianceEnt finMIBCompliance;

    public final FinMIBGroupsEnt finMIBGroups;

    private FinisherMIBDef()
    {
        super("Finisher-MIB");
        this.finisherMIB = new FinisherMIBEnt(this, null);
        this.finDevice = new FinDeviceEnt(this, null);
        this.finSupply = new FinSupplyEnt(this, null);
        this.finSupplyMediaInput = new FinSupplyMediaInputEnt(this, null);
        this.finDeviceAttribute = new FinDeviceAttributeEnt(this, null);
        this.finMIBCompliance = new FinMIBComplianceEnt(this, null);
        this.finMIBGroups = new FinMIBGroupsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.finisherMIB,
            this.finDevice,
            this.finSupply,
            this.finSupplyMediaInput,
            this.finDeviceAttribute,
            this.finMIBCompliance,
            this.finMIBGroups
        };
    }

    public static final class FinisherMIBEnt extends MIBEntry<FinisherMIBDef>
    {
        private FinisherMIBEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finisherMIB", "1.3.6.1.2.1.111", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class FinDeviceEnt extends MIBEntry<FinisherMIBDef>
    {
        public final FinDeviceTableEnt finDeviceTable;

        private FinDeviceEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finDevice", "1.3.6.1.2.1.43.30", false, false, false, false);
            this.finDeviceTable = new FinDeviceTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.finDeviceTable
            };
        }
        public static final class FinDeviceTableEnt extends MIBEntry<FinisherMIBDef>
        {
            public final FinDeviceEntryEnt finDeviceEntry;

            private FinDeviceTableEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finDeviceTable", "1.3.6.1.2.1.43.30.1", false, true, false, false);
                this.finDeviceEntry = new FinDeviceEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.finDeviceEntry
                };
            }
            public static final class FinDeviceEntryEnt extends MIBEntry<FinisherMIBDef>
            {
                public final FinDeviceIndexEnt finDeviceIndex;

                public final FinDeviceTypeEnt finDeviceType;

                public final FinDevicePresentOnOffEnt finDevicePresentOnOff;

                public final FinDeviceCapacityUnitEnt finDeviceCapacityUnit;

                /** unknown*/
                public final FinDeviceMaxCapacityEnt finDeviceMaxCapacity;

                /** unknown*/
                public final FinDeviceCurrentCapacityEnt finDeviceCurrentCapacity;

                public final FinDeviceAssociatedMediaPathsEnt finDeviceAssociatedMediaPaths;

                public final FinDeviceAssociatedOutputsEnt finDeviceAssociatedOutputs;

                /** unknown*/
                public final FinDeviceStatusEnt finDeviceStatus;

                public final FinDeviceDescriptionEnt finDeviceDescription;

                private FinDeviceEntryEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                {
                    super(mib, parent, "finDeviceEntry", "1.3.6.1.2.1.43.30.1.1", false, false, false, true);
                    this.finDeviceIndex = new FinDeviceIndexEnt(mib, this);
                    this.finDeviceType = new FinDeviceTypeEnt(mib, this);
                    this.finDevicePresentOnOff = new FinDevicePresentOnOffEnt(mib, this);
                    this.finDeviceCapacityUnit = new FinDeviceCapacityUnitEnt(mib, this);
                    this.finDeviceMaxCapacity = new FinDeviceMaxCapacityEnt(mib, this);
                    this.finDeviceCurrentCapacity = new FinDeviceCurrentCapacityEnt(mib, this);
                    this.finDeviceAssociatedMediaPaths = new FinDeviceAssociatedMediaPathsEnt(mib, this);
                    this.finDeviceAssociatedOutputs = new FinDeviceAssociatedOutputsEnt(mib, this);
                    this.finDeviceStatus = new FinDeviceStatusEnt(mib, this);
                    this.finDeviceDescription = new FinDeviceDescriptionEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.finDeviceIndex,
                        this.finDeviceType,
                        this.finDevicePresentOnOff,
                        this.finDeviceCapacityUnit,
                        this.finDeviceMaxCapacity,
                        this.finDeviceCurrentCapacity,
                        this.finDeviceAssociatedMediaPaths,
                        this.finDeviceAssociatedOutputs,
                        this.finDeviceStatus,
                        this.finDeviceDescription
                    };
                }
                public static final class FinDeviceIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceIndex", "1.3.6.1.2.1.43.30.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceTypeEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceTypeEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceType", "1.3.6.1.2.1.43.30.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDevicePresentOnOffEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDevicePresentOnOffEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDevicePresentOnOff", "1.3.6.1.2.1.43.30.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceCapacityUnitEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceCapacityUnitEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceCapacityUnit", "1.3.6.1.2.1.43.30.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceMaxCapacityEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceMaxCapacityEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceMaxCapacity", "1.3.6.1.2.1.43.30.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceCurrentCapacityEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceCurrentCapacityEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceCurrentCapacity", "1.3.6.1.2.1.43.30.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceAssociatedMediaPathsEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceAssociatedMediaPathsEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceAssociatedMediaPaths", "1.3.6.1.2.1.43.30.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceAssociatedOutputsEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceAssociatedOutputsEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceAssociatedOutputs", "1.3.6.1.2.1.43.30.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceStatusEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceStatusEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceStatus", "1.3.6.1.2.1.43.30.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceDescriptionEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceDescriptionEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceDescription", "1.3.6.1.2.1.43.30.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class FinSupplyEnt extends MIBEntry<FinisherMIBDef>
    {
        public final FinSupplyTableEnt finSupplyTable;

        private FinSupplyEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finSupply", "1.3.6.1.2.1.43.31", false, false, false, false);
            this.finSupplyTable = new FinSupplyTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.finSupplyTable
            };
        }
        public static final class FinSupplyTableEnt extends MIBEntry<FinisherMIBDef>
        {
            public final FinSupplyEntryEnt finSupplyEntry;

            private FinSupplyTableEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finSupplyTable", "1.3.6.1.2.1.43.31.1", false, true, false, false);
                this.finSupplyEntry = new FinSupplyEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.finSupplyEntry
                };
            }
            public static final class FinSupplyEntryEnt extends MIBEntry<FinisherMIBDef>
            {
                public final FinSupplyIndexEnt finSupplyIndex;

                public final FinSupplyDeviceIndexEnt finSupplyDeviceIndex;

                public final FinSupplyClassEnt finSupplyClass;

                public final FinSupplyTypeEnt finSupplyType;

                public final FinSupplyDescriptionEnt finSupplyDescription;

                public final FinSupplyUnitEnt finSupplyUnit;

                /** unknown*/
                public final FinSupplyMaxCapacityEnt finSupplyMaxCapacity;

                /** unknown*/
                public final FinSupplyCurrentLevelEnt finSupplyCurrentLevel;

                /** Capacity Attribute RelationshipsMEDIA INPUT MEASUREMENT_______ |                   ||      |                   ||      |                   |                   ||      |_ _ _ _ _ _ _ _ _ _| ________________  |direction|      |                   |      |            vMaxCapacity |                   |      ||      | Sheets remaining  | CurrentLevel|      |                   |      |v      |                   |      v_______ +___________________+ _______*/
                public final FinSupplyColorNameEnt finSupplyColorName;

                private FinSupplyEntryEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                {
                    super(mib, parent, "finSupplyEntry", "1.3.6.1.2.1.43.31.1.1", false, false, false, true);
                    this.finSupplyIndex = new FinSupplyIndexEnt(mib, this);
                    this.finSupplyDeviceIndex = new FinSupplyDeviceIndexEnt(mib, this);
                    this.finSupplyClass = new FinSupplyClassEnt(mib, this);
                    this.finSupplyType = new FinSupplyTypeEnt(mib, this);
                    this.finSupplyDescription = new FinSupplyDescriptionEnt(mib, this);
                    this.finSupplyUnit = new FinSupplyUnitEnt(mib, this);
                    this.finSupplyMaxCapacity = new FinSupplyMaxCapacityEnt(mib, this);
                    this.finSupplyCurrentLevel = new FinSupplyCurrentLevelEnt(mib, this);
                    this.finSupplyColorName = new FinSupplyColorNameEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.finSupplyIndex,
                        this.finSupplyDeviceIndex,
                        this.finSupplyClass,
                        this.finSupplyType,
                        this.finSupplyDescription,
                        this.finSupplyUnit,
                        this.finSupplyMaxCapacity,
                        this.finSupplyCurrentLevel,
                        this.finSupplyColorName
                    };
                }
                public static final class FinSupplyIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyIndex", "1.3.6.1.2.1.43.31.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyDeviceIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyDeviceIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyDeviceIndex", "1.3.6.1.2.1.43.31.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyClassEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyClassEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyClass", "1.3.6.1.2.1.43.31.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyTypeEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyTypeEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyType", "1.3.6.1.2.1.43.31.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyDescriptionEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyDescriptionEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyDescription", "1.3.6.1.2.1.43.31.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyUnitEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyUnitEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyUnit", "1.3.6.1.2.1.43.31.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMaxCapacityEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMaxCapacityEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMaxCapacity", "1.3.6.1.2.1.43.31.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyCurrentLevelEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyCurrentLevelEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyCurrentLevel", "1.3.6.1.2.1.43.31.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyColorNameEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyColorNameEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyColorName", "1.3.6.1.2.1.43.31.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class FinSupplyMediaInputEnt extends MIBEntry<FinisherMIBDef>
    {
        public final FinSupplyMediaInputTableEnt finSupplyMediaInputTable;

        private FinSupplyMediaInputEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finSupplyMediaInput", "1.3.6.1.2.1.43.32", false, false, false, false);
            this.finSupplyMediaInputTable = new FinSupplyMediaInputTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.finSupplyMediaInputTable
            };
        }
        public static final class FinSupplyMediaInputTableEnt extends MIBEntry<FinisherMIBDef>
        {
            public final FinSupplyMediaInputEntryEnt finSupplyMediaInputEntry;

            private FinSupplyMediaInputTableEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finSupplyMediaInputTable", "1.3.6.1.2.1.43.32.1", false, true, false, false);
                this.finSupplyMediaInputEntry = new FinSupplyMediaInputEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.finSupplyMediaInputEntry
                };
            }
            public static final class FinSupplyMediaInputEntryEnt extends MIBEntry<FinisherMIBDef>
            {
                public final FinSupplyMediaInputIndexEnt finSupplyMediaInputIndex;

                public final FinSupplyMediaInputDeviceIndexEnt finSupplyMediaInputDeviceIndex;

                public final FinSupplyMediaInputSupplyIndexEnt finSupplyMediaInputSupplyIndex;

                public final FinSupplyMediaInputTypeEnt finSupplyMediaInputType;

                public final FinSupplyMediaInputDimUnitEnt finSupplyMediaInputDimUnit;

                public final FinSupplyMediaInputMediaDimFeedDirEnt finSupplyMediaInputMediaDimFeedDir;

                public final FinSupplyMediaInputMediaDimXFeedDirEnt finSupplyMediaInputMediaDimXFeedDir;

                /** unknown*/
                public final FinSupplyMediaInputStatusEnt finSupplyMediaInputStatus;

                public final FinSupplyMediaInputMediaNameEnt finSupplyMediaInputMediaName;

                public final FinSupplyMediaInputNameEnt finSupplyMediaInputName;

                public final FinSupplyMediaInputDescriptionEnt finSupplyMediaInputDescription;

                public final FinSupplyMediaInputSecurityEnt finSupplyMediaInputSecurity;

                public final FinSupplyMediaInputMediaWeightEnt finSupplyMediaInputMediaWeight;

                public final FinSupplyMediaInputMediaThicknessEnt finSupplyMediaInputMediaThickness;

                public final FinSupplyMediaInputMediaTypeEnt finSupplyMediaInputMediaType;

                private FinSupplyMediaInputEntryEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                {
                    super(mib, parent, "finSupplyMediaInputEntry", "1.3.6.1.2.1.43.32.1.1", false, false, false, true);
                    this.finSupplyMediaInputIndex = new FinSupplyMediaInputIndexEnt(mib, this);
                    this.finSupplyMediaInputDeviceIndex = new FinSupplyMediaInputDeviceIndexEnt(mib, this);
                    this.finSupplyMediaInputSupplyIndex = new FinSupplyMediaInputSupplyIndexEnt(mib, this);
                    this.finSupplyMediaInputType = new FinSupplyMediaInputTypeEnt(mib, this);
                    this.finSupplyMediaInputDimUnit = new FinSupplyMediaInputDimUnitEnt(mib, this);
                    this.finSupplyMediaInputMediaDimFeedDir = new FinSupplyMediaInputMediaDimFeedDirEnt(mib, this);
                    this.finSupplyMediaInputMediaDimXFeedDir = new FinSupplyMediaInputMediaDimXFeedDirEnt(mib, this);
                    this.finSupplyMediaInputStatus = new FinSupplyMediaInputStatusEnt(mib, this);
                    this.finSupplyMediaInputMediaName = new FinSupplyMediaInputMediaNameEnt(mib, this);
                    this.finSupplyMediaInputName = new FinSupplyMediaInputNameEnt(mib, this);
                    this.finSupplyMediaInputDescription = new FinSupplyMediaInputDescriptionEnt(mib, this);
                    this.finSupplyMediaInputSecurity = new FinSupplyMediaInputSecurityEnt(mib, this);
                    this.finSupplyMediaInputMediaWeight = new FinSupplyMediaInputMediaWeightEnt(mib, this);
                    this.finSupplyMediaInputMediaThickness = new FinSupplyMediaInputMediaThicknessEnt(mib, this);
                    this.finSupplyMediaInputMediaType = new FinSupplyMediaInputMediaTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.finSupplyMediaInputIndex,
                        this.finSupplyMediaInputDeviceIndex,
                        this.finSupplyMediaInputSupplyIndex,
                        this.finSupplyMediaInputType,
                        this.finSupplyMediaInputDimUnit,
                        this.finSupplyMediaInputMediaDimFeedDir,
                        this.finSupplyMediaInputMediaDimXFeedDir,
                        this.finSupplyMediaInputStatus,
                        this.finSupplyMediaInputMediaName,
                        this.finSupplyMediaInputName,
                        this.finSupplyMediaInputDescription,
                        this.finSupplyMediaInputSecurity,
                        this.finSupplyMediaInputMediaWeight,
                        this.finSupplyMediaInputMediaThickness,
                        this.finSupplyMediaInputMediaType
                    };
                }
                public static final class FinSupplyMediaInputIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputIndex", "1.3.6.1.2.1.43.32.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputDeviceIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputDeviceIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputDeviceIndex", "1.3.6.1.2.1.43.32.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputSupplyIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputSupplyIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputSupplyIndex", "1.3.6.1.2.1.43.32.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputTypeEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputTypeEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputType", "1.3.6.1.2.1.43.32.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputDimUnitEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputDimUnitEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputDimUnit", "1.3.6.1.2.1.43.32.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputMediaDimFeedDirEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputMediaDimFeedDirEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputMediaDimFeedDir", "1.3.6.1.2.1.43.32.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputMediaDimXFeedDirEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputMediaDimXFeedDirEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputMediaDimXFeedDir", "1.3.6.1.2.1.43.32.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputStatusEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputStatusEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputStatus", "1.3.6.1.2.1.43.32.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputMediaNameEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputMediaNameEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputMediaName", "1.3.6.1.2.1.43.32.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputNameEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputNameEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputName", "1.3.6.1.2.1.43.32.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputDescriptionEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputDescriptionEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputDescription", "1.3.6.1.2.1.43.32.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputSecurityEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputSecurityEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputSecurity", "1.3.6.1.2.1.43.32.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputMediaWeightEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputMediaWeightEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputMediaWeight", "1.3.6.1.2.1.43.32.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputMediaThicknessEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputMediaThicknessEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputMediaThickness", "1.3.6.1.2.1.43.32.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinSupplyMediaInputMediaTypeEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinSupplyMediaInputMediaTypeEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finSupplyMediaInputMediaType", "1.3.6.1.2.1.43.32.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class FinDeviceAttributeEnt extends MIBEntry<FinisherMIBDef>
    {
        public final FinDeviceAttributeTableEnt finDeviceAttributeTable;

        private FinDeviceAttributeEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finDeviceAttribute", "1.3.6.1.2.1.43.33", false, false, false, false);
            this.finDeviceAttributeTable = new FinDeviceAttributeTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.finDeviceAttributeTable
            };
        }
        public static final class FinDeviceAttributeTableEnt extends MIBEntry<FinisherMIBDef>
        {
            public final FinDeviceAttributeEntryEnt finDeviceAttributeEntry;

            private FinDeviceAttributeTableEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finDeviceAttributeTable", "1.3.6.1.2.1.43.33.1", false, true, false, false);
                this.finDeviceAttributeEntry = new FinDeviceAttributeEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.finDeviceAttributeEntry
                };
            }
            public static final class FinDeviceAttributeEntryEnt extends MIBEntry<FinisherMIBDef>
            {
                public final FinDeviceAttributeTypeIndexEnt finDeviceAttributeTypeIndex;

                public final FinDeviceAttributeInstanceIndexEnt finDeviceAttributeInstanceIndex;

                /** unknown*/
                public final FinDeviceAttributeValueAsIntegerEnt finDeviceAttributeValueAsInteger;

                /** empty string*/
                public final FinDeviceAttributeValueAsOctetsEnt finDeviceAttributeValueAsOctets;

                private FinDeviceAttributeEntryEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                {
                    super(mib, parent, "finDeviceAttributeEntry", "1.3.6.1.2.1.43.33.1.1", false, false, false, true);
                    this.finDeviceAttributeTypeIndex = new FinDeviceAttributeTypeIndexEnt(mib, this);
                    this.finDeviceAttributeInstanceIndex = new FinDeviceAttributeInstanceIndexEnt(mib, this);
                    this.finDeviceAttributeValueAsInteger = new FinDeviceAttributeValueAsIntegerEnt(mib, this);
                    this.finDeviceAttributeValueAsOctets = new FinDeviceAttributeValueAsOctetsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.finDeviceAttributeTypeIndex,
                        this.finDeviceAttributeInstanceIndex,
                        this.finDeviceAttributeValueAsInteger,
                        this.finDeviceAttributeValueAsOctets
                    };
                }
                public static final class FinDeviceAttributeTypeIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceAttributeTypeIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceAttributeTypeIndex", "1.3.6.1.2.1.43.33.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceAttributeInstanceIndexEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceAttributeInstanceIndexEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceAttributeInstanceIndex", "1.3.6.1.2.1.43.33.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceAttributeValueAsIntegerEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceAttributeValueAsIntegerEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceAttributeValueAsInteger", "1.3.6.1.2.1.43.33.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FinDeviceAttributeValueAsOctetsEnt extends MIBEntry<FinisherMIBDef>
                {
                    private FinDeviceAttributeValueAsOctetsEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
                    {
                        super(mib, parent, "finDeviceAttributeValueAsOctets", "1.3.6.1.2.1.43.33.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class FinMIBComplianceEnt extends MIBEntry<FinisherMIBDef>
    {
        private FinMIBComplianceEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finMIBCompliance", "1.3.6.1.2.1.43.2.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class FinMIBGroupsEnt extends MIBEntry<FinisherMIBDef>
    {
        public final FinDeviceGroupEnt finDeviceGroup;

        public final FinSupplyGroupEnt finSupplyGroup;

        public final FinSupplyMediaInputGroupEnt finSupplyMediaInputGroup;

        public final FinDeviceAttributeGroupEnt finDeviceAttributeGroup;

        private FinMIBGroupsEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
        {
            super(mib, parent, "finMIBGroups", "1.3.6.1.2.1.43.2.6", false, false, false, false);
            this.finDeviceGroup = new FinDeviceGroupEnt(mib, this);
            this.finSupplyGroup = new FinSupplyGroupEnt(mib, this);
            this.finSupplyMediaInputGroup = new FinSupplyMediaInputGroupEnt(mib, this);
            this.finDeviceAttributeGroup = new FinDeviceAttributeGroupEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.finDeviceGroup,
                this.finSupplyGroup,
                this.finSupplyMediaInputGroup,
                this.finDeviceAttributeGroup
            };
        }
        public static final class FinDeviceGroupEnt extends MIBEntry<FinisherMIBDef>
        {
            private FinDeviceGroupEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finDeviceGroup", "1.3.6.1.2.1.43.2.6.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class FinSupplyGroupEnt extends MIBEntry<FinisherMIBDef>
        {
            private FinSupplyGroupEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finSupplyGroup", "1.3.6.1.2.1.43.2.6.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class FinSupplyMediaInputGroupEnt extends MIBEntry<FinisherMIBDef>
        {
            private FinSupplyMediaInputGroupEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finSupplyMediaInputGroup", "1.3.6.1.2.1.43.2.6.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class FinDeviceAttributeGroupEnt extends MIBEntry<FinisherMIBDef>
        {
            private FinDeviceAttributeGroupEnt(FinisherMIBDef mib, MIBEntry<FinisherMIBDef> parent)
            {
                super(mib, parent, "finDeviceAttributeGroup", "1.3.6.1.2.1.43.2.6.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
