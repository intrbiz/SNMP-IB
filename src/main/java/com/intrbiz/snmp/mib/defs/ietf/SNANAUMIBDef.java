package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**This MIB module contains objects necessary
for management of the following SNA devices: PU types 1.0, 2.0, 2.1
and LU types 0, 1, 2, 3, 4, 7.  It also contains generic objects
which can be used to manage LU 6.2.
Naming conventions in this document:
The following names are used in object descriptors according to
SNA conventions.
The name 'PU' or 'Node' is used to describe Node type 1.0, 2.0 or
2.1.
The name 'LU' is used to describe Logical Unit of type 0,1,2,3,
4,7 or 6.2.
end of conformance statement*/
public final class SNANAUMIBDef extends MIB
{
    public static final SNANAUMIBDef SNANAUMIB = new SNANAUMIBDef();

    static { MIBs.getInstance().registerMIB(SNANAUMIBDef.SNANAUMIB); }

    public final SnanauMIBEnt snanauMIB;

    private SNANAUMIBDef()
    {
        super("SNA-NAU-MIB");
        this.snanauMIB = new SnanauMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snanauMIB
        };
    }

    public static final class SnanauMIBEnt extends MIBEntry<SNANAUMIBDef>
    {
        /** The SNANAU MIB module contains an objects part and a conformance part.Objects are organized into the following groups:(1)snaNode group,(2)snaLU group,(3)snaMgtTools group.*/
        public final SnanauObjectsEnt snanauObjects;

        /** ***************************************************************Conformance information****************************************************************/
        public final SnanauConformanceEnt snanauConformance;

        private SnanauMIBEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
        {
            super(mib, parent, "snanauMIB", "1.3.6.1.2.1.34", false, false, false, false);
            this.snanauObjects = new SnanauObjectsEnt(mib, this);
            this.snanauConformance = new SnanauConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snanauObjects,
                this.snanauConformance
            };
        }
        public static final class SnanauObjectsEnt extends MIBEntry<SNANAUMIBDef>
        {
            public final SnaNodeEnt snaNode;

            public final SnaLuEnt snaLu;

            public final SnaMgtToolsEnt snaMgtTools;

            private SnanauObjectsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
            {
                super(mib, parent, "snanauObjects", "1.3.6.1.2.1.34.1", false, false, false, false);
                this.snaNode = new SnaNodeEnt(mib, this);
                this.snaLu = new SnaLuEnt(mib, this);
                this.snaMgtTools = new SnaMgtToolsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snaNode,
                    this.snaLu,
                    this.snaMgtTools
                };
            }
            public static final class SnaNodeEnt extends MIBEntry<SNANAUMIBDef>
            {
                /** ***************************************************************snaNode groupIt contains Managed Objects related to any type of Node andsome specific objects for Node Type 2.0.***************************************************************

***************************************************************The following table contains generic Node configurationparameters.****************************************************************/
                public final SnaNodeAdminTableEnt snaNodeAdminTable;

                /** ***************************************************************The following object is updated when there is a change tothe value of any object in the snaNodeAdminTable.****************************************************************/
                public final SnaNodeAdminTableLastChangeEnt snaNodeAdminTableLastChange;

                /** ***************************************************************The following table contains Node operational parameters.****************************************************************/
                public final SnaNodeOperTableEnt snaNodeOperTable;

                /** ***************************************************************The following object is updated when there is a change tothe value of snaNodeOperState in any row or a row isadded/deleted from the snaNodeOperTable via the snaNodeAdminTable.****************************************************************/
                public final SnaNodeOperTableLastChangeEnt snaNodeOperTableLastChange;

                /** ***************************************************************The following table contains PU 2.0 statistics dynamic parameters.****************************************************************/
                public final SnaPu20StatsTableEnt snaPu20StatsTable;

                /** ***************************************************************The following table contains the association between Nodes andlink identifiers.It is used for configuration purposes.****************************************************************/
                public final SnaNodeLinkAdminTableEnt snaNodeLinkAdminTable;

                /** ***************************************************************The following object is updated when there is a change tothe value of any object in the snaNodeLinkAdminTable.****************************************************************/
                public final SnaNodeLinkAdminTableLastChangeEnt snaNodeLinkAdminTableLastChange;

                /** ***************************************************************The following table contains the association betweenNodes and link identifiers.It provides the current status.****************************************************************/
                public final SnaNodeLinkOperTableEnt snaNodeLinkOperTable;

                /** ***************************************************************The following object is updated when a row is added/deletedfrom the snaNodeLinkOperTable.****************************************************************/
                public final SnaNodeLinkOperTableLastChangeEnt snaNodeLinkOperTableLastChange;

                /** ***************************************************************Traps****************************************************************/
                public final SnaNodeTrapsEnt snaNodeTraps;

                private SnaNodeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                {
                    super(mib, parent, "snaNode", "1.3.6.1.2.1.34.1.1", false, false, false, false);
                    this.snaNodeAdminTable = new SnaNodeAdminTableEnt(mib, this);
                    this.snaNodeAdminTableLastChange = new SnaNodeAdminTableLastChangeEnt(mib, this);
                    this.snaNodeOperTable = new SnaNodeOperTableEnt(mib, this);
                    this.snaNodeOperTableLastChange = new SnaNodeOperTableLastChangeEnt(mib, this);
                    this.snaPu20StatsTable = new SnaPu20StatsTableEnt(mib, this);
                    this.snaNodeLinkAdminTable = new SnaNodeLinkAdminTableEnt(mib, this);
                    this.snaNodeLinkAdminTableLastChange = new SnaNodeLinkAdminTableLastChangeEnt(mib, this);
                    this.snaNodeLinkOperTable = new SnaNodeLinkOperTableEnt(mib, this);
                    this.snaNodeLinkOperTableLastChange = new SnaNodeLinkOperTableLastChangeEnt(mib, this);
                    this.snaNodeTraps = new SnaNodeTrapsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snaNodeAdminTable,
                        this.snaNodeAdminTableLastChange,
                        this.snaNodeOperTable,
                        this.snaNodeOperTableLastChange,
                        this.snaPu20StatsTable,
                        this.snaNodeLinkAdminTable,
                        this.snaNodeLinkAdminTableLastChange,
                        this.snaNodeLinkOperTable,
                        this.snaNodeLinkOperTableLastChange,
                        this.snaNodeTraps
                    };
                }
                public static final class SnaNodeAdminTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaNodeAdminEntryEnt snaNodeAdminEntry;

                    private SnaNodeAdminTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeAdminTable", "1.3.6.1.2.1.34.1.1.1", false, true, false, false);
                        this.snaNodeAdminEntry = new SnaNodeAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaNodeAdminEntry
                        };
                    }
                    public static final class SnaNodeAdminEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaNodeAdminIndexEnt snaNodeAdminIndex;

                        public final SnaNodeAdminNameEnt snaNodeAdminName;

                        public final SnaNodeAdminTypeEnt snaNodeAdminType;

                        public final SnaNodeAdminXidFormatEnt snaNodeAdminXidFormat;

                        public final SnaNodeAdminBlockNumEnt snaNodeAdminBlockNum;

                        public final SnaNodeAdminIdNumEnt snaNodeAdminIdNum;

                        public final SnaNodeAdminEnablingMethodEnt snaNodeAdminEnablingMethod;

                        public final SnaNodeAdminLuTermDefaultEnt snaNodeAdminLuTermDefault;

                        public final SnaNodeAdminMaxLuEnt snaNodeAdminMaxLu;

                        public final SnaNodeAdminHostDescriptionEnt snaNodeAdminHostDescription;

                        public final SnaNodeAdminStopMethodEnt snaNodeAdminStopMethod;

                        public final SnaNodeAdminStateEnt snaNodeAdminState;

                        public final SnaNodeAdminRowStatusEnt snaNodeAdminRowStatus;

                        private SnaNodeAdminEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaNodeAdminEntry", "1.3.6.1.2.1.34.1.1.1.1", false, false, false, true);
                            this.snaNodeAdminIndex = new SnaNodeAdminIndexEnt(mib, this);
                            this.snaNodeAdminName = new SnaNodeAdminNameEnt(mib, this);
                            this.snaNodeAdminType = new SnaNodeAdminTypeEnt(mib, this);
                            this.snaNodeAdminXidFormat = new SnaNodeAdminXidFormatEnt(mib, this);
                            this.snaNodeAdminBlockNum = new SnaNodeAdminBlockNumEnt(mib, this);
                            this.snaNodeAdminIdNum = new SnaNodeAdminIdNumEnt(mib, this);
                            this.snaNodeAdminEnablingMethod = new SnaNodeAdminEnablingMethodEnt(mib, this);
                            this.snaNodeAdminLuTermDefault = new SnaNodeAdminLuTermDefaultEnt(mib, this);
                            this.snaNodeAdminMaxLu = new SnaNodeAdminMaxLuEnt(mib, this);
                            this.snaNodeAdminHostDescription = new SnaNodeAdminHostDescriptionEnt(mib, this);
                            this.snaNodeAdminStopMethod = new SnaNodeAdminStopMethodEnt(mib, this);
                            this.snaNodeAdminState = new SnaNodeAdminStateEnt(mib, this);
                            this.snaNodeAdminRowStatus = new SnaNodeAdminRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaNodeAdminIndex,
                                this.snaNodeAdminName,
                                this.snaNodeAdminType,
                                this.snaNodeAdminXidFormat,
                                this.snaNodeAdminBlockNum,
                                this.snaNodeAdminIdNum,
                                this.snaNodeAdminEnablingMethod,
                                this.snaNodeAdminLuTermDefault,
                                this.snaNodeAdminMaxLu,
                                this.snaNodeAdminHostDescription,
                                this.snaNodeAdminStopMethod,
                                this.snaNodeAdminState,
                                this.snaNodeAdminRowStatus
                            };
                        }
                        public static final class SnaNodeAdminIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminIndex", "1.3.6.1.2.1.34.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminName", "1.3.6.1.2.1.34.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminType", "1.3.6.1.2.1.34.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminXidFormatEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminXidFormatEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminXidFormat", "1.3.6.1.2.1.34.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminBlockNumEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminBlockNumEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminBlockNum", "1.3.6.1.2.1.34.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminIdNumEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminIdNumEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminIdNum", "1.3.6.1.2.1.34.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminEnablingMethodEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminEnablingMethodEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminEnablingMethod", "1.3.6.1.2.1.34.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminLuTermDefaultEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminLuTermDefaultEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminLuTermDefault", "1.3.6.1.2.1.34.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminMaxLuEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminMaxLuEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminMaxLu", "1.3.6.1.2.1.34.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminHostDescriptionEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminHostDescriptionEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminHostDescription", "1.3.6.1.2.1.34.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminStopMethodEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminStopMethodEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminStopMethod", "1.3.6.1.2.1.34.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminStateEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminStateEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminState", "1.3.6.1.2.1.34.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeAdminRowStatusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeAdminRowStatusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeAdminRowStatus", "1.3.6.1.2.1.34.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaNodeAdminTableLastChangeEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaNodeAdminTableLastChangeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeAdminTableLastChange", "1.3.6.1.2.1.34.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaNodeOperTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaNodeOperEntryEnt snaNodeOperEntry;

                    private SnaNodeOperTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeOperTable", "1.3.6.1.2.1.34.1.1.3", false, true, false, false);
                        this.snaNodeOperEntry = new SnaNodeOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaNodeOperEntry
                        };
                    }
                    public static final class SnaNodeOperEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaNodeOperNameEnt snaNodeOperName;

                        public final SnaNodeOperTypeEnt snaNodeOperType;

                        public final SnaNodeOperXidFormatEnt snaNodeOperXidFormat;

                        public final SnaNodeOperBlockNumEnt snaNodeOperBlockNum;

                        public final SnaNodeOperIdNumEnt snaNodeOperIdNum;

                        public final SnaNodeOperEnablingMethodEnt snaNodeOperEnablingMethod;

                        public final SnaNodeOperLuTermDefaultEnt snaNodeOperLuTermDefault;

                        public final SnaNodeOperMaxLuEnt snaNodeOperMaxLu;

                        public final SnaNodeOperHostDescriptionEnt snaNodeOperHostDescription;

                        public final SnaNodeOperStopMethodEnt snaNodeOperStopMethod;

                        public final SnaNodeOperStateEnt snaNodeOperState;

                        public final SnaNodeOperHostSscpIdEnt snaNodeOperHostSscpId;

                        public final SnaNodeOperStartTimeEnt snaNodeOperStartTime;

                        public final SnaNodeOperLastStateChangeEnt snaNodeOperLastStateChange;

                        public final SnaNodeOperActFailuresEnt snaNodeOperActFailures;

                        public final SnaNodeOperActFailureReasonEnt snaNodeOperActFailureReason;

                        private SnaNodeOperEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaNodeOperEntry", "1.3.6.1.2.1.34.1.1.3.1", false, false, false, true);
                            this.snaNodeOperName = new SnaNodeOperNameEnt(mib, this);
                            this.snaNodeOperType = new SnaNodeOperTypeEnt(mib, this);
                            this.snaNodeOperXidFormat = new SnaNodeOperXidFormatEnt(mib, this);
                            this.snaNodeOperBlockNum = new SnaNodeOperBlockNumEnt(mib, this);
                            this.snaNodeOperIdNum = new SnaNodeOperIdNumEnt(mib, this);
                            this.snaNodeOperEnablingMethod = new SnaNodeOperEnablingMethodEnt(mib, this);
                            this.snaNodeOperLuTermDefault = new SnaNodeOperLuTermDefaultEnt(mib, this);
                            this.snaNodeOperMaxLu = new SnaNodeOperMaxLuEnt(mib, this);
                            this.snaNodeOperHostDescription = new SnaNodeOperHostDescriptionEnt(mib, this);
                            this.snaNodeOperStopMethod = new SnaNodeOperStopMethodEnt(mib, this);
                            this.snaNodeOperState = new SnaNodeOperStateEnt(mib, this);
                            this.snaNodeOperHostSscpId = new SnaNodeOperHostSscpIdEnt(mib, this);
                            this.snaNodeOperStartTime = new SnaNodeOperStartTimeEnt(mib, this);
                            this.snaNodeOperLastStateChange = new SnaNodeOperLastStateChangeEnt(mib, this);
                            this.snaNodeOperActFailures = new SnaNodeOperActFailuresEnt(mib, this);
                            this.snaNodeOperActFailureReason = new SnaNodeOperActFailureReasonEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaNodeOperName,
                                this.snaNodeOperType,
                                this.snaNodeOperXidFormat,
                                this.snaNodeOperBlockNum,
                                this.snaNodeOperIdNum,
                                this.snaNodeOperEnablingMethod,
                                this.snaNodeOperLuTermDefault,
                                this.snaNodeOperMaxLu,
                                this.snaNodeOperHostDescription,
                                this.snaNodeOperStopMethod,
                                this.snaNodeOperState,
                                this.snaNodeOperHostSscpId,
                                this.snaNodeOperStartTime,
                                this.snaNodeOperLastStateChange,
                                this.snaNodeOperActFailures,
                                this.snaNodeOperActFailureReason
                            };
                        }
                        public static final class SnaNodeOperNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperName", "1.3.6.1.2.1.34.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperType", "1.3.6.1.2.1.34.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperXidFormatEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperXidFormatEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperXidFormat", "1.3.6.1.2.1.34.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperBlockNumEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperBlockNumEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperBlockNum", "1.3.6.1.2.1.34.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperIdNumEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperIdNumEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperIdNum", "1.3.6.1.2.1.34.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperEnablingMethodEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperEnablingMethodEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperEnablingMethod", "1.3.6.1.2.1.34.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperLuTermDefaultEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperLuTermDefaultEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperLuTermDefault", "1.3.6.1.2.1.34.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperMaxLuEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperMaxLuEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperMaxLu", "1.3.6.1.2.1.34.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperHostDescriptionEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperHostDescriptionEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperHostDescription", "1.3.6.1.2.1.34.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperStopMethodEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperStopMethodEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperStopMethod", "1.3.6.1.2.1.34.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperStateEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperStateEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperState", "1.3.6.1.2.1.34.1.1.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperHostSscpIdEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperHostSscpIdEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperHostSscpId", "1.3.6.1.2.1.34.1.1.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperStartTimeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperStartTimeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperStartTime", "1.3.6.1.2.1.34.1.1.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperLastStateChangeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperLastStateChangeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperLastStateChange", "1.3.6.1.2.1.34.1.1.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperActFailuresEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperActFailuresEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperActFailures", "1.3.6.1.2.1.34.1.1.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeOperActFailureReasonEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeOperActFailureReasonEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeOperActFailureReason", "1.3.6.1.2.1.34.1.1.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaNodeOperTableLastChangeEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaNodeOperTableLastChangeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeOperTableLastChange", "1.3.6.1.2.1.34.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaPu20StatsTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaPu20StatsEntryEnt snaPu20StatsEntry;

                    private SnaPu20StatsTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaPu20StatsTable", "1.3.6.1.2.1.34.1.1.5", false, true, false, false);
                        this.snaPu20StatsEntry = new SnaPu20StatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaPu20StatsEntry
                        };
                    }
                    public static final class SnaPu20StatsEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaPu20StatsSentBytesEnt snaPu20StatsSentBytes;

                        public final SnaPu20StatsReceivedBytesEnt snaPu20StatsReceivedBytes;

                        public final SnaPu20StatsSentPiusEnt snaPu20StatsSentPius;

                        public final SnaPu20StatsReceivedPiusEnt snaPu20StatsReceivedPius;

                        public final SnaPu20StatsSentNegativeRespsEnt snaPu20StatsSentNegativeResps;

                        public final SnaPu20StatsReceivedNegativeRespsEnt snaPu20StatsReceivedNegativeResps;

                        public final SnaPu20StatsActLusEnt snaPu20StatsActLus;

                        public final SnaPu20StatsInActLusEnt snaPu20StatsInActLus;

                        public final SnaPu20StatsBindLusEnt snaPu20StatsBindLus;

                        private SnaPu20StatsEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaPu20StatsEntry", "1.3.6.1.2.1.34.1.1.5.1", false, false, false, true);
                            this.snaPu20StatsSentBytes = new SnaPu20StatsSentBytesEnt(mib, this);
                            this.snaPu20StatsReceivedBytes = new SnaPu20StatsReceivedBytesEnt(mib, this);
                            this.snaPu20StatsSentPius = new SnaPu20StatsSentPiusEnt(mib, this);
                            this.snaPu20StatsReceivedPius = new SnaPu20StatsReceivedPiusEnt(mib, this);
                            this.snaPu20StatsSentNegativeResps = new SnaPu20StatsSentNegativeRespsEnt(mib, this);
                            this.snaPu20StatsReceivedNegativeResps = new SnaPu20StatsReceivedNegativeRespsEnt(mib, this);
                            this.snaPu20StatsActLus = new SnaPu20StatsActLusEnt(mib, this);
                            this.snaPu20StatsInActLus = new SnaPu20StatsInActLusEnt(mib, this);
                            this.snaPu20StatsBindLus = new SnaPu20StatsBindLusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaPu20StatsSentBytes,
                                this.snaPu20StatsReceivedBytes,
                                this.snaPu20StatsSentPius,
                                this.snaPu20StatsReceivedPius,
                                this.snaPu20StatsSentNegativeResps,
                                this.snaPu20StatsReceivedNegativeResps,
                                this.snaPu20StatsActLus,
                                this.snaPu20StatsInActLus,
                                this.snaPu20StatsBindLus
                            };
                        }
                        public static final class SnaPu20StatsSentBytesEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsSentBytesEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsSentBytes", "1.3.6.1.2.1.34.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsReceivedBytesEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsReceivedBytesEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsReceivedBytes", "1.3.6.1.2.1.34.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsSentPiusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsSentPiusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsSentPius", "1.3.6.1.2.1.34.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsReceivedPiusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsReceivedPiusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsReceivedPius", "1.3.6.1.2.1.34.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsSentNegativeRespsEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsSentNegativeRespsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsSentNegativeResps", "1.3.6.1.2.1.34.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsReceivedNegativeRespsEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsReceivedNegativeRespsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsReceivedNegativeResps", "1.3.6.1.2.1.34.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsActLusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsActLusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsActLus", "1.3.6.1.2.1.34.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsInActLusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsInActLusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsInActLus", "1.3.6.1.2.1.34.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaPu20StatsBindLusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaPu20StatsBindLusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaPu20StatsBindLus", "1.3.6.1.2.1.34.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaNodeLinkAdminTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaNodeLinkAdminEntryEnt snaNodeLinkAdminEntry;

                    private SnaNodeLinkAdminTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeLinkAdminTable", "1.3.6.1.2.1.34.1.1.6", false, true, false, false);
                        this.snaNodeLinkAdminEntry = new SnaNodeLinkAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaNodeLinkAdminEntry
                        };
                    }
                    public static final class SnaNodeLinkAdminEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaNodeLinkAdminIndexEnt snaNodeLinkAdminIndex;

                        public final SnaNodeLinkAdminSpecificEnt snaNodeLinkAdminSpecific;

                        public final SnaNodeLinkAdminMaxPiuEnt snaNodeLinkAdminMaxPiu;

                        public final SnaNodeLinkAdminRowStatusEnt snaNodeLinkAdminRowStatus;

                        private SnaNodeLinkAdminEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaNodeLinkAdminEntry", "1.3.6.1.2.1.34.1.1.6.1", false, false, false, true);
                            this.snaNodeLinkAdminIndex = new SnaNodeLinkAdminIndexEnt(mib, this);
                            this.snaNodeLinkAdminSpecific = new SnaNodeLinkAdminSpecificEnt(mib, this);
                            this.snaNodeLinkAdminMaxPiu = new SnaNodeLinkAdminMaxPiuEnt(mib, this);
                            this.snaNodeLinkAdminRowStatus = new SnaNodeLinkAdminRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaNodeLinkAdminIndex,
                                this.snaNodeLinkAdminSpecific,
                                this.snaNodeLinkAdminMaxPiu,
                                this.snaNodeLinkAdminRowStatus
                            };
                        }
                        public static final class SnaNodeLinkAdminIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeLinkAdminIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeLinkAdminIndex", "1.3.6.1.2.1.34.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeLinkAdminSpecificEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeLinkAdminSpecificEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeLinkAdminSpecific", "1.3.6.1.2.1.34.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeLinkAdminMaxPiuEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeLinkAdminMaxPiuEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeLinkAdminMaxPiu", "1.3.6.1.2.1.34.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeLinkAdminRowStatusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeLinkAdminRowStatusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeLinkAdminRowStatus", "1.3.6.1.2.1.34.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaNodeLinkAdminTableLastChangeEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaNodeLinkAdminTableLastChangeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeLinkAdminTableLastChange", "1.3.6.1.2.1.34.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaNodeLinkOperTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaNodeLinkOperEntryEnt snaNodeLinkOperEntry;

                    private SnaNodeLinkOperTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeLinkOperTable", "1.3.6.1.2.1.34.1.1.8", false, true, false, false);
                        this.snaNodeLinkOperEntry = new SnaNodeLinkOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaNodeLinkOperEntry
                        };
                    }
                    public static final class SnaNodeLinkOperEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaNodeLinkOperSpecificEnt snaNodeLinkOperSpecific;

                        public final SnaNodeLinkOperMaxPiuEnt snaNodeLinkOperMaxPiu;

                        private SnaNodeLinkOperEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaNodeLinkOperEntry", "1.3.6.1.2.1.34.1.1.8.1", false, false, false, true);
                            this.snaNodeLinkOperSpecific = new SnaNodeLinkOperSpecificEnt(mib, this);
                            this.snaNodeLinkOperMaxPiu = new SnaNodeLinkOperMaxPiuEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaNodeLinkOperSpecific,
                                this.snaNodeLinkOperMaxPiu
                            };
                        }
                        public static final class SnaNodeLinkOperSpecificEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeLinkOperSpecificEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeLinkOperSpecific", "1.3.6.1.2.1.34.1.1.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaNodeLinkOperMaxPiuEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaNodeLinkOperMaxPiuEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaNodeLinkOperMaxPiu", "1.3.6.1.2.1.34.1.1.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaNodeLinkOperTableLastChangeEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaNodeLinkOperTableLastChangeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeLinkOperTableLastChange", "1.3.6.1.2.1.34.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaNodeTrapsEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaNodeStateChangeTrapEnt snaNodeStateChangeTrap;

                    public final SnaNodeActFailTrapEnt snaNodeActFailTrap;

                    private SnaNodeTrapsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeTraps", "1.3.6.1.2.1.34.1.1.10", false, false, false, false);
                        this.snaNodeStateChangeTrap = new SnaNodeStateChangeTrapEnt(mib, this);
                        this.snaNodeActFailTrap = new SnaNodeActFailTrapEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaNodeStateChangeTrap,
                            this.snaNodeActFailTrap
                        };
                    }
                    public static final class SnaNodeStateChangeTrapEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        private SnaNodeStateChangeTrapEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaNodeStateChangeTrap", "1.3.6.1.2.1.34.1.1.10.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnaNodeActFailTrapEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        private SnaNodeActFailTrapEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaNodeActFailTrap", "1.3.6.1.2.1.34.1.1.10.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnaLuEnt extends MIBEntry<SNANAUMIBDef>
            {
                /** ***************************************************************snaLu groupIt contains Managed Objects related to LUs in general and somespecific for LUs of type 0, 1, 2, 3.***************************************************************

***************************************************************The following table contains LU configuration parameters.****************************************************************/
                public final SnaLuAdminTableEnt snaLuAdminTable;

                /** ***************************************************************The following table contains LU state dynamic parameters.****************************************************************/
                public final SnaLuOperTableEnt snaLuOperTable;

                /** ***************************************************************The following table contains LU session status parameters.****************************************************************/
                public final SnaLuSessnTableEnt snaLuSessnTable;

                /** ***************************************************************The following table contains LU sessions statistics dynamicparameters.****************************************************************/
                public final SnaLuSessnStatsTableEnt snaLuSessnStatsTable;

                /** ***************************************************************Traps****************************************************************/
                public final SnaLuTrapsEnt snaLuTraps;

                private SnaLuEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                {
                    super(mib, parent, "snaLu", "1.3.6.1.2.1.34.1.2", false, false, false, false);
                    this.snaLuAdminTable = new SnaLuAdminTableEnt(mib, this);
                    this.snaLuOperTable = new SnaLuOperTableEnt(mib, this);
                    this.snaLuSessnTable = new SnaLuSessnTableEnt(mib, this);
                    this.snaLuSessnStatsTable = new SnaLuSessnStatsTableEnt(mib, this);
                    this.snaLuTraps = new SnaLuTrapsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snaLuAdminTable,
                        this.snaLuOperTable,
                        this.snaLuSessnTable,
                        this.snaLuSessnStatsTable,
                        this.snaLuTraps
                    };
                }
                public static final class SnaLuAdminTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaLuAdminEntryEnt snaLuAdminEntry;

                    private SnaLuAdminTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuAdminTable", "1.3.6.1.2.1.34.1.2.1", false, true, false, false);
                        this.snaLuAdminEntry = new SnaLuAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaLuAdminEntry
                        };
                    }
                    public static final class SnaLuAdminEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaLuAdminLuIndexEnt snaLuAdminLuIndex;

                        public final SnaLuAdminNameEnt snaLuAdminName;

                        public final SnaLuAdminSnaNameEnt snaLuAdminSnaName;

                        public final SnaLuAdminTypeEnt snaLuAdminType;

                        public final SnaLuAdminDepTypeEnt snaLuAdminDepType;

                        public final SnaLuAdminLocalAddressEnt snaLuAdminLocalAddress;

                        public final SnaLuAdminDisplayModelEnt snaLuAdminDisplayModel;

                        public final SnaLuAdminTermEnt snaLuAdminTerm;

                        public final SnaLuAdminRowStatusEnt snaLuAdminRowStatus;

                        private SnaLuAdminEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuAdminEntry", "1.3.6.1.2.1.34.1.2.1.1", false, false, false, true);
                            this.snaLuAdminLuIndex = new SnaLuAdminLuIndexEnt(mib, this);
                            this.snaLuAdminName = new SnaLuAdminNameEnt(mib, this);
                            this.snaLuAdminSnaName = new SnaLuAdminSnaNameEnt(mib, this);
                            this.snaLuAdminType = new SnaLuAdminTypeEnt(mib, this);
                            this.snaLuAdminDepType = new SnaLuAdminDepTypeEnt(mib, this);
                            this.snaLuAdminLocalAddress = new SnaLuAdminLocalAddressEnt(mib, this);
                            this.snaLuAdminDisplayModel = new SnaLuAdminDisplayModelEnt(mib, this);
                            this.snaLuAdminTerm = new SnaLuAdminTermEnt(mib, this);
                            this.snaLuAdminRowStatus = new SnaLuAdminRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaLuAdminLuIndex,
                                this.snaLuAdminName,
                                this.snaLuAdminSnaName,
                                this.snaLuAdminType,
                                this.snaLuAdminDepType,
                                this.snaLuAdminLocalAddress,
                                this.snaLuAdminDisplayModel,
                                this.snaLuAdminTerm,
                                this.snaLuAdminRowStatus
                            };
                        }
                        public static final class SnaLuAdminLuIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminLuIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminLuIndex", "1.3.6.1.2.1.34.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminName", "1.3.6.1.2.1.34.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminSnaNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminSnaNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminSnaName", "1.3.6.1.2.1.34.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminType", "1.3.6.1.2.1.34.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminDepTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminDepTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminDepType", "1.3.6.1.2.1.34.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminLocalAddressEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminLocalAddressEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminLocalAddress", "1.3.6.1.2.1.34.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminDisplayModelEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminDisplayModelEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminDisplayModel", "1.3.6.1.2.1.34.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminTermEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminTermEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminTerm", "1.3.6.1.2.1.34.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuAdminRowStatusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuAdminRowStatusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuAdminRowStatus", "1.3.6.1.2.1.34.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaLuOperTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaLuOperEntryEnt snaLuOperEntry;

                    private SnaLuOperTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuOperTable", "1.3.6.1.2.1.34.1.2.2", false, true, false, false);
                        this.snaLuOperEntry = new SnaLuOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaLuOperEntry
                        };
                    }
                    public static final class SnaLuOperEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaLuOperNameEnt snaLuOperName;

                        public final SnaLuOperSnaNameEnt snaLuOperSnaName;

                        public final SnaLuOperTypeEnt snaLuOperType;

                        public final SnaLuOperDepTypeEnt snaLuOperDepType;

                        public final SnaLuOperLocalAddressEnt snaLuOperLocalAddress;

                        public final SnaLuOperDisplayModelEnt snaLuOperDisplayModel;

                        public final SnaLuOperTermEnt snaLuOperTerm;

                        public final SnaLuOperStateEnt snaLuOperState;

                        public final SnaLuOperSessnCountEnt snaLuOperSessnCount;

                        private SnaLuOperEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuOperEntry", "1.3.6.1.2.1.34.1.2.2.1", false, false, false, true);
                            this.snaLuOperName = new SnaLuOperNameEnt(mib, this);
                            this.snaLuOperSnaName = new SnaLuOperSnaNameEnt(mib, this);
                            this.snaLuOperType = new SnaLuOperTypeEnt(mib, this);
                            this.snaLuOperDepType = new SnaLuOperDepTypeEnt(mib, this);
                            this.snaLuOperLocalAddress = new SnaLuOperLocalAddressEnt(mib, this);
                            this.snaLuOperDisplayModel = new SnaLuOperDisplayModelEnt(mib, this);
                            this.snaLuOperTerm = new SnaLuOperTermEnt(mib, this);
                            this.snaLuOperState = new SnaLuOperStateEnt(mib, this);
                            this.snaLuOperSessnCount = new SnaLuOperSessnCountEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaLuOperName,
                                this.snaLuOperSnaName,
                                this.snaLuOperType,
                                this.snaLuOperDepType,
                                this.snaLuOperLocalAddress,
                                this.snaLuOperDisplayModel,
                                this.snaLuOperTerm,
                                this.snaLuOperState,
                                this.snaLuOperSessnCount
                            };
                        }
                        public static final class SnaLuOperNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperName", "1.3.6.1.2.1.34.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperSnaNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperSnaNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperSnaName", "1.3.6.1.2.1.34.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperType", "1.3.6.1.2.1.34.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperDepTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperDepTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperDepType", "1.3.6.1.2.1.34.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperLocalAddressEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperLocalAddressEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperLocalAddress", "1.3.6.1.2.1.34.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperDisplayModelEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperDisplayModelEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperDisplayModel", "1.3.6.1.2.1.34.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperTermEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperTermEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperTerm", "1.3.6.1.2.1.34.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperStateEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperStateEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperState", "1.3.6.1.2.1.34.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuOperSessnCountEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuOperSessnCountEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuOperSessnCount", "1.3.6.1.2.1.34.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaLuSessnTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaLuSessnEntryEnt snaLuSessnEntry;

                    private SnaLuSessnTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuSessnTable", "1.3.6.1.2.1.34.1.2.3", false, true, false, false);
                        this.snaLuSessnEntry = new SnaLuSessnEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaLuSessnEntry
                        };
                    }
                    public static final class SnaLuSessnEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaLuSessnRluIndexEnt snaLuSessnRluIndex;

                        public final SnaLuSessnIndexEnt snaLuSessnIndex;

                        public final SnaLuSessnLocalApplNameEnt snaLuSessnLocalApplName;

                        public final SnaLuSessnRemoteLuNameEnt snaLuSessnRemoteLuName;

                        public final SnaLuSessnMaxSndRuSizeEnt snaLuSessnMaxSndRuSize;

                        public final SnaLuSessnMaxRcvRuSizeEnt snaLuSessnMaxRcvRuSize;

                        public final SnaLuSessnSndPacingSizeEnt snaLuSessnSndPacingSize;

                        public final SnaLuSessnRcvPacingSizeEnt snaLuSessnRcvPacingSize;

                        public final SnaLuSessnActiveTimeEnt snaLuSessnActiveTime;

                        public final SnaLuSessnAdminStateEnt snaLuSessnAdminState;

                        public final SnaLuSessnOperStateEnt snaLuSessnOperState;

                        public final SnaLuSessnSenseDataEnt snaLuSessnSenseData;

                        public final SnaLuSessnTerminationRuEnt snaLuSessnTerminationRu;

                        public final SnaLuSessnUnbindTypeEnt snaLuSessnUnbindType;

                        public final SnaLuSessnLinkIndexEnt snaLuSessnLinkIndex;

                        private SnaLuSessnEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuSessnEntry", "1.3.6.1.2.1.34.1.2.3.1", false, false, false, true);
                            this.snaLuSessnRluIndex = new SnaLuSessnRluIndexEnt(mib, this);
                            this.snaLuSessnIndex = new SnaLuSessnIndexEnt(mib, this);
                            this.snaLuSessnLocalApplName = new SnaLuSessnLocalApplNameEnt(mib, this);
                            this.snaLuSessnRemoteLuName = new SnaLuSessnRemoteLuNameEnt(mib, this);
                            this.snaLuSessnMaxSndRuSize = new SnaLuSessnMaxSndRuSizeEnt(mib, this);
                            this.snaLuSessnMaxRcvRuSize = new SnaLuSessnMaxRcvRuSizeEnt(mib, this);
                            this.snaLuSessnSndPacingSize = new SnaLuSessnSndPacingSizeEnt(mib, this);
                            this.snaLuSessnRcvPacingSize = new SnaLuSessnRcvPacingSizeEnt(mib, this);
                            this.snaLuSessnActiveTime = new SnaLuSessnActiveTimeEnt(mib, this);
                            this.snaLuSessnAdminState = new SnaLuSessnAdminStateEnt(mib, this);
                            this.snaLuSessnOperState = new SnaLuSessnOperStateEnt(mib, this);
                            this.snaLuSessnSenseData = new SnaLuSessnSenseDataEnt(mib, this);
                            this.snaLuSessnTerminationRu = new SnaLuSessnTerminationRuEnt(mib, this);
                            this.snaLuSessnUnbindType = new SnaLuSessnUnbindTypeEnt(mib, this);
                            this.snaLuSessnLinkIndex = new SnaLuSessnLinkIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaLuSessnRluIndex,
                                this.snaLuSessnIndex,
                                this.snaLuSessnLocalApplName,
                                this.snaLuSessnRemoteLuName,
                                this.snaLuSessnMaxSndRuSize,
                                this.snaLuSessnMaxRcvRuSize,
                                this.snaLuSessnSndPacingSize,
                                this.snaLuSessnRcvPacingSize,
                                this.snaLuSessnActiveTime,
                                this.snaLuSessnAdminState,
                                this.snaLuSessnOperState,
                                this.snaLuSessnSenseData,
                                this.snaLuSessnTerminationRu,
                                this.snaLuSessnUnbindType,
                                this.snaLuSessnLinkIndex
                            };
                        }
                        public static final class SnaLuSessnRluIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnRluIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnRluIndex", "1.3.6.1.2.1.34.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnIndex", "1.3.6.1.2.1.34.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnLocalApplNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnLocalApplNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnLocalApplName", "1.3.6.1.2.1.34.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnRemoteLuNameEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnRemoteLuNameEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnRemoteLuName", "1.3.6.1.2.1.34.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnMaxSndRuSizeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnMaxSndRuSizeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnMaxSndRuSize", "1.3.6.1.2.1.34.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnMaxRcvRuSizeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnMaxRcvRuSizeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnMaxRcvRuSize", "1.3.6.1.2.1.34.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnSndPacingSizeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnSndPacingSizeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnSndPacingSize", "1.3.6.1.2.1.34.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnRcvPacingSizeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnRcvPacingSizeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnRcvPacingSize", "1.3.6.1.2.1.34.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnActiveTimeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnActiveTimeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnActiveTime", "1.3.6.1.2.1.34.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnAdminStateEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnAdminStateEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnAdminState", "1.3.6.1.2.1.34.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnOperStateEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnOperStateEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnOperState", "1.3.6.1.2.1.34.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnSenseDataEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnSenseDataEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnSenseData", "1.3.6.1.2.1.34.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnTerminationRuEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnTerminationRuEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnTerminationRu", "1.3.6.1.2.1.34.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnUnbindTypeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnUnbindTypeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnUnbindType", "1.3.6.1.2.1.34.1.2.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnLinkIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnLinkIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnLinkIndex", "1.3.6.1.2.1.34.1.2.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaLuSessnStatsTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaLuSessnStatsEntryEnt snaLuSessnStatsEntry;

                    private SnaLuSessnStatsTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuSessnStatsTable", "1.3.6.1.2.1.34.1.2.4", false, true, false, false);
                        this.snaLuSessnStatsEntry = new SnaLuSessnStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaLuSessnStatsEntry
                        };
                    }
                    public static final class SnaLuSessnStatsEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaLuSessnStatsSentBytesEnt snaLuSessnStatsSentBytes;

                        public final SnaLuSessnStatsReceivedBytesEnt snaLuSessnStatsReceivedBytes;

                        public final SnaLuSessnStatsSentRusEnt snaLuSessnStatsSentRus;

                        public final SnaLuSessnStatsReceivedRusEnt snaLuSessnStatsReceivedRus;

                        public final SnaLuSessnStatsSentNegativeRespsEnt snaLuSessnStatsSentNegativeResps;

                        public final SnaLuSessnStatsReceivedNegativeRespsEnt snaLuSessnStatsReceivedNegativeResps;

                        private SnaLuSessnStatsEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuSessnStatsEntry", "1.3.6.1.2.1.34.1.2.4.1", false, false, false, true);
                            this.snaLuSessnStatsSentBytes = new SnaLuSessnStatsSentBytesEnt(mib, this);
                            this.snaLuSessnStatsReceivedBytes = new SnaLuSessnStatsReceivedBytesEnt(mib, this);
                            this.snaLuSessnStatsSentRus = new SnaLuSessnStatsSentRusEnt(mib, this);
                            this.snaLuSessnStatsReceivedRus = new SnaLuSessnStatsReceivedRusEnt(mib, this);
                            this.snaLuSessnStatsSentNegativeResps = new SnaLuSessnStatsSentNegativeRespsEnt(mib, this);
                            this.snaLuSessnStatsReceivedNegativeResps = new SnaLuSessnStatsReceivedNegativeRespsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaLuSessnStatsSentBytes,
                                this.snaLuSessnStatsReceivedBytes,
                                this.snaLuSessnStatsSentRus,
                                this.snaLuSessnStatsReceivedRus,
                                this.snaLuSessnStatsSentNegativeResps,
                                this.snaLuSessnStatsReceivedNegativeResps
                            };
                        }
                        public static final class SnaLuSessnStatsSentBytesEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnStatsSentBytesEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnStatsSentBytes", "1.3.6.1.2.1.34.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnStatsReceivedBytesEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnStatsReceivedBytesEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnStatsReceivedBytes", "1.3.6.1.2.1.34.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnStatsSentRusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnStatsSentRusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnStatsSentRus", "1.3.6.1.2.1.34.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnStatsReceivedRusEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnStatsReceivedRusEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnStatsReceivedRus", "1.3.6.1.2.1.34.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnStatsSentNegativeRespsEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnStatsSentNegativeRespsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnStatsSentNegativeResps", "1.3.6.1.2.1.34.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuSessnStatsReceivedNegativeRespsEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuSessnStatsReceivedNegativeRespsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuSessnStatsReceivedNegativeResps", "1.3.6.1.2.1.34.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SnaLuTrapsEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaLuStateChangeTrapEnt snaLuStateChangeTrap;

                    public final SnaLuSessnBindFailTrapEnt snaLuSessnBindFailTrap;

                    private SnaLuTrapsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuTraps", "1.3.6.1.2.1.34.1.2.5", false, false, false, false);
                        this.snaLuStateChangeTrap = new SnaLuStateChangeTrapEnt(mib, this);
                        this.snaLuSessnBindFailTrap = new SnaLuSessnBindFailTrapEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaLuStateChangeTrap,
                            this.snaLuSessnBindFailTrap
                        };
                    }
                    public static final class SnaLuStateChangeTrapEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        private SnaLuStateChangeTrapEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuStateChangeTrap", "1.3.6.1.2.1.34.1.2.5.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnaLuSessnBindFailTrapEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        private SnaLuSessnBindFailTrapEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuSessnBindFailTrap", "1.3.6.1.2.1.34.1.2.5.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnaMgtToolsEnt extends MIBEntry<SNANAUMIBDef>
            {
                /** ***************************************************************snaMgtTools groupCurrently this group contains only one table.***************************************************************

***************************************************************The following table contains Response Time Monitoring (RTM)configuration information and statistics for LU Type 2s.RTM supports the capability to measure and report end-userresponse times for dependent LUs. When the RTM state of an LUis 'on', response times for each LU transaction are monitored.A set of ranges is defined (e.g., Range 1 includes the number oftransactions with response times less than 1 second) using the"boundary" definitions (e.g., boundary #2 is defined as 3 seconds).A set of counters (one per range) identifiesthe number of transactions within each response time range.****************************************************************/
                public final SnaLuRtmTableEnt snaLuRtmTable;

                private SnaMgtToolsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                {
                    super(mib, parent, "snaMgtTools", "1.3.6.1.2.1.34.1.3", false, false, false, false);
                    this.snaLuRtmTable = new SnaLuRtmTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snaLuRtmTable
                    };
                }
                public static final class SnaLuRtmTableEnt extends MIBEntry<SNANAUMIBDef>
                {
                    public final SnaLuRtmEntryEnt snaLuRtmEntry;

                    private SnaLuRtmTableEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuRtmTable", "1.3.6.1.2.1.34.1.3.1", false, true, false, false);
                        this.snaLuRtmEntry = new SnaLuRtmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snaLuRtmEntry
                        };
                    }
                    public static final class SnaLuRtmEntryEnt extends MIBEntry<SNANAUMIBDef>
                    {
                        public final SnaLuRtmPuIndexEnt snaLuRtmPuIndex;

                        public final SnaLuRtmLuIndexEnt snaLuRtmLuIndex;

                        public final SnaLuRtmStateEnt snaLuRtmState;

                        public final SnaLuRtmStateTimeEnt snaLuRtmStateTime;

                        public final SnaLuRtmDefEnt snaLuRtmDef;

                        public final SnaLuRtmBoundary1Ent snaLuRtmBoundary1;

                        public final SnaLuRtmBoundary2Ent snaLuRtmBoundary2;

                        public final SnaLuRtmBoundary3Ent snaLuRtmBoundary3;

                        public final SnaLuRtmBoundary4Ent snaLuRtmBoundary4;

                        public final SnaLuRtmCounter1Ent snaLuRtmCounter1;

                        public final SnaLuRtmCounter2Ent snaLuRtmCounter2;

                        public final SnaLuRtmCounter3Ent snaLuRtmCounter3;

                        public final SnaLuRtmCounter4Ent snaLuRtmCounter4;

                        public final SnaLuRtmOverFlowsEnt snaLuRtmOverFlows;

                        public final SnaLuRtmObjPercentEnt snaLuRtmObjPercent;

                        public final SnaLuRtmObjRangeEnt snaLuRtmObjRange;

                        public final SnaLuRtmNumTransEnt snaLuRtmNumTrans;

                        public final SnaLuRtmLastRspTimeEnt snaLuRtmLastRspTime;

                        public final SnaLuRtmAvgRspTimeEnt snaLuRtmAvgRspTime;

                        private SnaLuRtmEntryEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                        {
                            super(mib, parent, "snaLuRtmEntry", "1.3.6.1.2.1.34.1.3.1.1", false, false, false, true);
                            this.snaLuRtmPuIndex = new SnaLuRtmPuIndexEnt(mib, this);
                            this.snaLuRtmLuIndex = new SnaLuRtmLuIndexEnt(mib, this);
                            this.snaLuRtmState = new SnaLuRtmStateEnt(mib, this);
                            this.snaLuRtmStateTime = new SnaLuRtmStateTimeEnt(mib, this);
                            this.snaLuRtmDef = new SnaLuRtmDefEnt(mib, this);
                            this.snaLuRtmBoundary1 = new SnaLuRtmBoundary1Ent(mib, this);
                            this.snaLuRtmBoundary2 = new SnaLuRtmBoundary2Ent(mib, this);
                            this.snaLuRtmBoundary3 = new SnaLuRtmBoundary3Ent(mib, this);
                            this.snaLuRtmBoundary4 = new SnaLuRtmBoundary4Ent(mib, this);
                            this.snaLuRtmCounter1 = new SnaLuRtmCounter1Ent(mib, this);
                            this.snaLuRtmCounter2 = new SnaLuRtmCounter2Ent(mib, this);
                            this.snaLuRtmCounter3 = new SnaLuRtmCounter3Ent(mib, this);
                            this.snaLuRtmCounter4 = new SnaLuRtmCounter4Ent(mib, this);
                            this.snaLuRtmOverFlows = new SnaLuRtmOverFlowsEnt(mib, this);
                            this.snaLuRtmObjPercent = new SnaLuRtmObjPercentEnt(mib, this);
                            this.snaLuRtmObjRange = new SnaLuRtmObjRangeEnt(mib, this);
                            this.snaLuRtmNumTrans = new SnaLuRtmNumTransEnt(mib, this);
                            this.snaLuRtmLastRspTime = new SnaLuRtmLastRspTimeEnt(mib, this);
                            this.snaLuRtmAvgRspTime = new SnaLuRtmAvgRspTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.snaLuRtmPuIndex,
                                this.snaLuRtmLuIndex,
                                this.snaLuRtmState,
                                this.snaLuRtmStateTime,
                                this.snaLuRtmDef,
                                this.snaLuRtmBoundary1,
                                this.snaLuRtmBoundary2,
                                this.snaLuRtmBoundary3,
                                this.snaLuRtmBoundary4,
                                this.snaLuRtmCounter1,
                                this.snaLuRtmCounter2,
                                this.snaLuRtmCounter3,
                                this.snaLuRtmCounter4,
                                this.snaLuRtmOverFlows,
                                this.snaLuRtmObjPercent,
                                this.snaLuRtmObjRange,
                                this.snaLuRtmNumTrans,
                                this.snaLuRtmLastRspTime,
                                this.snaLuRtmAvgRspTime
                            };
                        }
                        public static final class SnaLuRtmPuIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmPuIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmPuIndex", "1.3.6.1.2.1.34.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmLuIndexEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmLuIndexEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmLuIndex", "1.3.6.1.2.1.34.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmStateEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmStateEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmState", "1.3.6.1.2.1.34.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmStateTimeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmStateTimeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmStateTime", "1.3.6.1.2.1.34.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmDefEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmDefEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmDef", "1.3.6.1.2.1.34.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmBoundary1Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmBoundary1Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmBoundary1", "1.3.6.1.2.1.34.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmBoundary2Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmBoundary2Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmBoundary2", "1.3.6.1.2.1.34.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmBoundary3Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmBoundary3Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmBoundary3", "1.3.6.1.2.1.34.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmBoundary4Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmBoundary4Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmBoundary4", "1.3.6.1.2.1.34.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmCounter1Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmCounter1Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmCounter1", "1.3.6.1.2.1.34.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmCounter2Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmCounter2Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmCounter2", "1.3.6.1.2.1.34.1.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmCounter3Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmCounter3Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmCounter3", "1.3.6.1.2.1.34.1.3.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmCounter4Ent extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmCounter4Ent(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmCounter4", "1.3.6.1.2.1.34.1.3.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmOverFlowsEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmOverFlowsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmOverFlows", "1.3.6.1.2.1.34.1.3.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmObjPercentEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmObjPercentEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmObjPercent", "1.3.6.1.2.1.34.1.3.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmObjRangeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmObjRangeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmObjRange", "1.3.6.1.2.1.34.1.3.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmNumTransEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmNumTransEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmNumTrans", "1.3.6.1.2.1.34.1.3.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmLastRspTimeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmLastRspTimeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmLastRspTime", "1.3.6.1.2.1.34.1.3.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SnaLuRtmAvgRspTimeEnt extends MIBEntry<SNANAUMIBDef>
                        {
                            private SnaLuRtmAvgRspTimeEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                            {
                                super(mib, parent, "snaLuRtmAvgRspTime", "1.3.6.1.2.1.34.1.3.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SnanauConformanceEnt extends MIBEntry<SNANAUMIBDef>
        {
            public final SnanauCompliancesEnt snanauCompliances;

            public final SnanauGroupsEnt snanauGroups;

            private SnanauConformanceEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
            {
                super(mib, parent, "snanauConformance", "1.3.6.1.2.1.34.2", false, false, false, false);
                this.snanauCompliances = new SnanauCompliancesEnt(mib, this);
                this.snanauGroups = new SnanauGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snanauCompliances,
                    this.snanauGroups
                };
            }
            public static final class SnanauCompliancesEnt extends MIBEntry<SNANAUMIBDef>
            {
                /** Compliance statements*/
                public final SnanauComplianceEnt snanauCompliance;

                private SnanauCompliancesEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                {
                    super(mib, parent, "snanauCompliances", "1.3.6.1.2.1.34.2.1", false, false, false, false);
                    this.snanauCompliance = new SnanauComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snanauCompliance
                    };
                }
                public static final class SnanauComplianceEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnanauComplianceEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snanauCompliance", "1.3.6.1.2.1.34.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnanauGroupsEnt extends MIBEntry<SNANAUMIBDef>
            {
                /** Units of conformance*/
                public final SnaNodeGroupEnt snaNodeGroup;

                public final SnaLuGroupEnt snaLuGroup;

                public final SnaSessionGroupEnt snaSessionGroup;

                public final SnaPu20GroupEnt snaPu20Group;

                public final SnaMgtToolsRtmGroupEnt snaMgtToolsRtmGroup;

                private SnanauGroupsEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                {
                    super(mib, parent, "snanauGroups", "1.3.6.1.2.1.34.2.2", false, false, false, false);
                    this.snaNodeGroup = new SnaNodeGroupEnt(mib, this);
                    this.snaLuGroup = new SnaLuGroupEnt(mib, this);
                    this.snaSessionGroup = new SnaSessionGroupEnt(mib, this);
                    this.snaPu20Group = new SnaPu20GroupEnt(mib, this);
                    this.snaMgtToolsRtmGroup = new SnaMgtToolsRtmGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snaNodeGroup,
                        this.snaLuGroup,
                        this.snaSessionGroup,
                        this.snaPu20Group,
                        this.snaMgtToolsRtmGroup
                    };
                }
                public static final class SnaNodeGroupEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaNodeGroupEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaNodeGroup", "1.3.6.1.2.1.34.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaLuGroupEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaLuGroupEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaLuGroup", "1.3.6.1.2.1.34.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaSessionGroupEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaSessionGroupEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaSessionGroup", "1.3.6.1.2.1.34.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaPu20GroupEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaPu20GroupEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaPu20Group", "1.3.6.1.2.1.34.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnaMgtToolsRtmGroupEnt extends MIBEntry<SNANAUMIBDef>
                {
                    private SnaMgtToolsRtmGroupEnt(SNANAUMIBDef mib, MIBEntry<SNANAUMIBDef> parent)
                    {
                        super(mib, parent, "snaMgtToolsRtmGroup", "1.3.6.1.2.1.34.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
