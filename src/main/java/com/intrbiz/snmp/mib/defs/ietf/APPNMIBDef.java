package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class APPNMIBDef extends MIB
{
    public static final APPNMIBDef APPNMIB = new APPNMIBDef();

    static { MIBs.getInstance().registerMIB(APPNMIBDef.APPNMIB); }

    /** July 15, 1998*/
    public final AppnMIBEnt appnMIB;

    private APPNMIBDef()
    {
        super("APPN-MIB");
        this.appnMIB = new AppnMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.appnMIB
        };
    }

    public static final class AppnMIBEnt extends MIBEntry<APPNMIBDef>
    {
        /** **********************************************************************/
        public final AppnObjectsEnt appnObjects;

        /** **********************************************************************/
        public final AppnTrapsEnt appnTraps;

        /** *********************************************************************Conformance information**********************************************************************/
        public final AppnConformanceEnt appnConformance;

        private AppnMIBEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
        {
            super(mib, parent, "appnMIB", "1.3.6.1.2.1.34.4", false, false, false, false);
            this.appnObjects = new AppnObjectsEnt(mib, this);
            this.appnTraps = new AppnTrapsEnt(mib, this);
            this.appnConformance = new AppnConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.appnObjects,
                this.appnTraps,
                this.appnConformance
            };
        }
        public static final class AppnObjectsEnt extends MIBEntry<APPNMIBDef>
        {
            /** *********************************************************************
******************** The APPN Node Group *****************************/
            public final AppnNodeEnt appnNode;

            /** ************** The APPN Topology Group *******************************/
            public final AppnNnEnt appnNn;

            /** ************** The APPN Local Topology Group ************************This MIB Group represents the local topology maintained inAPPN network nodes, end nodes, and branch network nodes.  It consistsof two tables:- a table containing information about all of the TGs ownedby this node, which is implemented by all node types.- a table containing all of the information known to this nodeabout the TGs owned by its end nodes, which is implemented onlyby network nodes.*/
            public final AppnLocalTopologyEnt appnLocalTopology;

            /** ************** The APPN Directory Group ******************************/
            public final AppnDirEnt appnDir;

            /** ************** The APPN Class of Service Group ***********************/
            public final AppnCosEnt appnCos;

            /** *********************************************************************Intermediate Session Information**********************************************************************/
            public final AppnSessIntermediateEnt appnSessIntermediate;

            private AppnObjectsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
            {
                super(mib, parent, "appnObjects", "1.3.6.1.2.1.34.4.1", false, false, false, false);
                this.appnNode = new AppnNodeEnt(mib, this);
                this.appnNn = new AppnNnEnt(mib, this);
                this.appnLocalTopology = new AppnLocalTopologyEnt(mib, this);
                this.appnDir = new AppnDirEnt(mib, this);
                this.appnCos = new AppnCosEnt(mib, this);
                this.appnSessIntermediate = new AppnSessIntermediateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.appnNode,
                    this.appnNn,
                    this.appnLocalTopology,
                    this.appnDir,
                    this.appnCos,
                    this.appnSessIntermediate
                };
            }
            public static final class AppnNodeEnt extends MIBEntry<APPNMIBDef>
            {
                public final AppnGeneralInfoAndCapsEnt appnGeneralInfoAndCaps;

                public final AppnNnUniqueInfoAndCapsEnt appnNnUniqueInfoAndCaps;

                public final AppnEnUniqueCapsEnt appnEnUniqueCaps;

                public final AppnPortInformationEnt appnPortInformation;

                public final AppnLinkStationInformationEnt appnLinkStationInformation;

                public final AppnVrnInfoEnt appnVrnInfo;

                private AppnNodeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnNode", "1.3.6.1.2.1.34.4.1.1", false, false, false, false);
                    this.appnGeneralInfoAndCaps = new AppnGeneralInfoAndCapsEnt(mib, this);
                    this.appnNnUniqueInfoAndCaps = new AppnNnUniqueInfoAndCapsEnt(mib, this);
                    this.appnEnUniqueCaps = new AppnEnUniqueCapsEnt(mib, this);
                    this.appnPortInformation = new AppnPortInformationEnt(mib, this);
                    this.appnLinkStationInformation = new AppnLinkStationInformationEnt(mib, this);
                    this.appnVrnInfo = new AppnVrnInfoEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnGeneralInfoAndCaps,
                        this.appnNnUniqueInfoAndCaps,
                        this.appnEnUniqueCaps,
                        this.appnPortInformation,
                        this.appnLinkStationInformation,
                        this.appnVrnInfo
                    };
                }
                public static final class AppnGeneralInfoAndCapsEnt extends MIBEntry<APPNMIBDef>
                {
                    /** This group provides global information about an APPN network node,an APPN end node, an APPN branch network node, or an LEN node.
APPN General InformationThis section applies to APPN network nodes, end nodes, and branchnetwork nodes, as well as to LEN end nodes.*/
                    public final AppnNodeCpNameEnt appnNodeCpName;

                    /** appnNodeMibVersion OBJECT-TYPE (deprecated:  moved to end of module)*/
                    public final AppnNodeIdEnt appnNodeId;

                    public final AppnNodeTypeEnt appnNodeType;

                    public final AppnNodeUpTimeEnt appnNodeUpTime;

                    public final AppnNodeParallelTgEnt appnNodeParallelTg;

                    public final AppnNodeAdaptiveBindPacingEnt appnNodeAdaptiveBindPacing;

                    public final AppnNodeHprSupportEnt appnNodeHprSupport;

                    public final AppnNodeMaxSessPerRtpConnEnt appnNodeMaxSessPerRtpConn;

                    public final AppnNodeHprIntRteSetupsEnt appnNodeHprIntRteSetups;

                    public final AppnNodeHprIntRteRejectsEnt appnNodeHprIntRteRejects;

                    public final AppnNodeHprOrgRteSetupsEnt appnNodeHprOrgRteSetups;

                    public final AppnNodeHprOrgRteRejectsEnt appnNodeHprOrgRteRejects;

                    public final AppnNodeHprEndRteSetupsEnt appnNodeHprEndRteSetups;

                    public final AppnNodeHprEndRteRejectsEnt appnNodeHprEndRteRejects;

                    public final AppnNodeCounterDisconTimeEnt appnNodeCounterDisconTime;

                    public final AppnNodeLsCounterTypeEnt appnNodeLsCounterType;

                    public final AppnNodeBrNnEnt appnNodeBrNn;

                    /** *********************************************************************Deprecated definitions**********************************************************************/
                    public final AppnNodeMibVersionEnt appnNodeMibVersion;

                    private AppnGeneralInfoAndCapsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnGeneralInfoAndCaps", "1.3.6.1.2.1.34.4.1.1.1", false, false, false, false);
                        this.appnNodeCpName = new AppnNodeCpNameEnt(mib, this);
                        this.appnNodeId = new AppnNodeIdEnt(mib, this);
                        this.appnNodeType = new AppnNodeTypeEnt(mib, this);
                        this.appnNodeUpTime = new AppnNodeUpTimeEnt(mib, this);
                        this.appnNodeParallelTg = new AppnNodeParallelTgEnt(mib, this);
                        this.appnNodeAdaptiveBindPacing = new AppnNodeAdaptiveBindPacingEnt(mib, this);
                        this.appnNodeHprSupport = new AppnNodeHprSupportEnt(mib, this);
                        this.appnNodeMaxSessPerRtpConn = new AppnNodeMaxSessPerRtpConnEnt(mib, this);
                        this.appnNodeHprIntRteSetups = new AppnNodeHprIntRteSetupsEnt(mib, this);
                        this.appnNodeHprIntRteRejects = new AppnNodeHprIntRteRejectsEnt(mib, this);
                        this.appnNodeHprOrgRteSetups = new AppnNodeHprOrgRteSetupsEnt(mib, this);
                        this.appnNodeHprOrgRteRejects = new AppnNodeHprOrgRteRejectsEnt(mib, this);
                        this.appnNodeHprEndRteSetups = new AppnNodeHprEndRteSetupsEnt(mib, this);
                        this.appnNodeHprEndRteRejects = new AppnNodeHprEndRteRejectsEnt(mib, this);
                        this.appnNodeCounterDisconTime = new AppnNodeCounterDisconTimeEnt(mib, this);
                        this.appnNodeLsCounterType = new AppnNodeLsCounterTypeEnt(mib, this);
                        this.appnNodeBrNn = new AppnNodeBrNnEnt(mib, this);
                        this.appnNodeMibVersion = new AppnNodeMibVersionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnNodeCpName,
                            this.appnNodeId,
                            this.appnNodeType,
                            this.appnNodeUpTime,
                            this.appnNodeParallelTg,
                            this.appnNodeAdaptiveBindPacing,
                            this.appnNodeHprSupport,
                            this.appnNodeMaxSessPerRtpConn,
                            this.appnNodeHprIntRteSetups,
                            this.appnNodeHprIntRteRejects,
                            this.appnNodeHprOrgRteSetups,
                            this.appnNodeHprOrgRteRejects,
                            this.appnNodeHprEndRteSetups,
                            this.appnNodeHprEndRteRejects,
                            this.appnNodeCounterDisconTime,
                            this.appnNodeLsCounterType,
                            this.appnNodeBrNn,
                            this.appnNodeMibVersion
                        };
                    }
                    public static final class AppnNodeCpNameEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeCpNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeCpName", "1.3.6.1.2.1.34.4.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeIdEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeId", "1.3.6.1.2.1.34.4.1.1.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeTypeEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeType", "1.3.6.1.2.1.34.4.1.1.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeUpTimeEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeUpTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeUpTime", "1.3.6.1.2.1.34.4.1.1.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeParallelTgEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeParallelTgEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeParallelTg", "1.3.6.1.2.1.34.4.1.1.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeAdaptiveBindPacingEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeAdaptiveBindPacingEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeAdaptiveBindPacing", "1.3.6.1.2.1.34.4.1.1.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprSupportEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprSupportEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprSupport", "1.3.6.1.2.1.34.4.1.1.1.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeMaxSessPerRtpConnEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeMaxSessPerRtpConnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeMaxSessPerRtpConn", "1.3.6.1.2.1.34.4.1.1.1.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprIntRteSetupsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprIntRteSetupsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprIntRteSetups", "1.3.6.1.2.1.34.4.1.1.1.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprIntRteRejectsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprIntRteRejectsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprIntRteRejects", "1.3.6.1.2.1.34.4.1.1.1.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprOrgRteSetupsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprOrgRteSetupsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprOrgRteSetups", "1.3.6.1.2.1.34.4.1.1.1.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprOrgRteRejectsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprOrgRteRejectsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprOrgRteRejects", "1.3.6.1.2.1.34.4.1.1.1.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprEndRteSetupsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprEndRteSetupsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprEndRteSetups", "1.3.6.1.2.1.34.4.1.1.1.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeHprEndRteRejectsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeHprEndRteRejectsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeHprEndRteRejects", "1.3.6.1.2.1.34.4.1.1.1.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeCounterDisconTimeEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeCounterDisconTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeCounterDisconTime", "1.3.6.1.2.1.34.4.1.1.1.16", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeLsCounterTypeEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeLsCounterTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeLsCounterType", "1.3.6.1.2.1.34.4.1.1.1.17", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeBrNnEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeBrNnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeBrNn", "1.3.6.1.2.1.34.4.1.1.1.18", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeMibVersionEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeMibVersionEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeMibVersion", "1.3.6.1.2.1.34.4.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppnNnUniqueInfoAndCapsEnt extends MIBEntry<APPNMIBDef>
                {
                    /** *********************************************************************APPN Network Node InformationThis section provides global information about an APPN network node.**********************************************************************/
                    public final AppnNodeNnCentralDirectoryEnt appnNodeNnCentralDirectory;

                    public final AppnNodeNnTreeCacheEnt appnNodeNnTreeCache;

                    public final AppnNodeNnRouteAddResistEnt appnNodeNnRouteAddResist;

                    public final AppnNodeNnIsrEnt appnNodeNnIsr;

                    public final AppnNodeNnFrsnEnt appnNodeNnFrsn;

                    public final AppnNodeNnPeriBorderSupEnt appnNodeNnPeriBorderSup;

                    public final AppnNodeNnInterchangeSupEnt appnNodeNnInterchangeSup;

                    public final AppnNodeNnExteBorderSupEnt appnNodeNnExteBorderSup;

                    public final AppnNodeNnSafeStoreFreqEnt appnNodeNnSafeStoreFreq;

                    public final AppnNodeNnRsnEnt appnNodeNnRsn;

                    public final AppnNodeNnCongestedEnt appnNodeNnCongested;

                    public final AppnNodeNnIsrDepletedEnt appnNodeNnIsrDepleted;

                    public final AppnNodeNnQuiescingEnt appnNodeNnQuiescing;

                    public final AppnNodeNnGatewayEnt appnNodeNnGateway;

                    private AppnNnUniqueInfoAndCapsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnNnUniqueInfoAndCaps", "1.3.6.1.2.1.34.4.1.1.2", false, false, false, false);
                        this.appnNodeNnCentralDirectory = new AppnNodeNnCentralDirectoryEnt(mib, this);
                        this.appnNodeNnTreeCache = new AppnNodeNnTreeCacheEnt(mib, this);
                        this.appnNodeNnRouteAddResist = new AppnNodeNnRouteAddResistEnt(mib, this);
                        this.appnNodeNnIsr = new AppnNodeNnIsrEnt(mib, this);
                        this.appnNodeNnFrsn = new AppnNodeNnFrsnEnt(mib, this);
                        this.appnNodeNnPeriBorderSup = new AppnNodeNnPeriBorderSupEnt(mib, this);
                        this.appnNodeNnInterchangeSup = new AppnNodeNnInterchangeSupEnt(mib, this);
                        this.appnNodeNnExteBorderSup = new AppnNodeNnExteBorderSupEnt(mib, this);
                        this.appnNodeNnSafeStoreFreq = new AppnNodeNnSafeStoreFreqEnt(mib, this);
                        this.appnNodeNnRsn = new AppnNodeNnRsnEnt(mib, this);
                        this.appnNodeNnCongested = new AppnNodeNnCongestedEnt(mib, this);
                        this.appnNodeNnIsrDepleted = new AppnNodeNnIsrDepletedEnt(mib, this);
                        this.appnNodeNnQuiescing = new AppnNodeNnQuiescingEnt(mib, this);
                        this.appnNodeNnGateway = new AppnNodeNnGatewayEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnNodeNnCentralDirectory,
                            this.appnNodeNnTreeCache,
                            this.appnNodeNnRouteAddResist,
                            this.appnNodeNnIsr,
                            this.appnNodeNnFrsn,
                            this.appnNodeNnPeriBorderSup,
                            this.appnNodeNnInterchangeSup,
                            this.appnNodeNnExteBorderSup,
                            this.appnNodeNnSafeStoreFreq,
                            this.appnNodeNnRsn,
                            this.appnNodeNnCongested,
                            this.appnNodeNnIsrDepleted,
                            this.appnNodeNnQuiescing,
                            this.appnNodeNnGateway
                        };
                    }
                    public static final class AppnNodeNnCentralDirectoryEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnCentralDirectoryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnCentralDirectory", "1.3.6.1.2.1.34.4.1.1.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnTreeCacheEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnTreeCacheEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnTreeCache", "1.3.6.1.2.1.34.4.1.1.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnRouteAddResistEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnRouteAddResistEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnRouteAddResist", "1.3.6.1.2.1.34.4.1.1.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnIsrEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnIsrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnIsr", "1.3.6.1.2.1.34.4.1.1.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnFrsnEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnFrsnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnFrsn", "1.3.6.1.2.1.34.4.1.1.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnPeriBorderSupEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnPeriBorderSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnPeriBorderSup", "1.3.6.1.2.1.34.4.1.1.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnInterchangeSupEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnInterchangeSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnInterchangeSup", "1.3.6.1.2.1.34.4.1.1.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnExteBorderSupEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnExteBorderSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnExteBorderSup", "1.3.6.1.2.1.34.4.1.1.2.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnSafeStoreFreqEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnSafeStoreFreqEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnSafeStoreFreq", "1.3.6.1.2.1.34.4.1.1.2.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnRsnEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnRsnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnRsn", "1.3.6.1.2.1.34.4.1.1.2.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnCongestedEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnCongestedEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnCongested", "1.3.6.1.2.1.34.4.1.1.2.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnIsrDepletedEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnIsrDepletedEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnIsrDepleted", "1.3.6.1.2.1.34.4.1.1.2.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnQuiescingEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnQuiescingEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnQuiescing", "1.3.6.1.2.1.34.4.1.1.2.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeNnGatewayEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeNnGatewayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeNnGateway", "1.3.6.1.2.1.34.4.1.1.2.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppnEnUniqueCapsEnt extends MIBEntry<APPNMIBDef>
                {
                    /** *********************************************************************
APPN End Node InformationThis section provides global information about an APPN end node.  Twoof the objects are also implemented by a branch network node.**********************************************************************/
                    public final AppnNodeEnModeCosMapEnt appnNodeEnModeCosMap;

                    public final AppnNodeEnNnServerEnt appnNodeEnNnServer;

                    public final AppnNodeEnLuSearchEnt appnNodeEnLuSearch;

                    private AppnEnUniqueCapsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnEnUniqueCaps", "1.3.6.1.2.1.34.4.1.1.3", false, false, false, false);
                        this.appnNodeEnModeCosMap = new AppnNodeEnModeCosMapEnt(mib, this);
                        this.appnNodeEnNnServer = new AppnNodeEnNnServerEnt(mib, this);
                        this.appnNodeEnLuSearch = new AppnNodeEnLuSearchEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnNodeEnModeCosMap,
                            this.appnNodeEnNnServer,
                            this.appnNodeEnLuSearch
                        };
                    }
                    public static final class AppnNodeEnModeCosMapEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeEnModeCosMapEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeEnModeCosMap", "1.3.6.1.2.1.34.4.1.1.3.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeEnNnServerEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeEnNnServerEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeEnNnServer", "1.3.6.1.2.1.34.4.1.1.3.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNodeEnLuSearchEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNodeEnLuSearchEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNodeEnLuSearch", "1.3.6.1.2.1.34.4.1.1.3.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppnPortInformationEnt extends MIBEntry<APPNMIBDef>
                {
                    /** *********************************************************************APPN Port informationThis section provides information about an APPN node's ports.**********************************************************************/
                    public final AppnPortTableEnt appnPortTable;

                    private AppnPortInformationEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnPortInformation", "1.3.6.1.2.1.34.4.1.1.4", false, false, false, false);
                        this.appnPortTable = new AppnPortTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnPortTable
                        };
                    }
                    public static final class AppnPortTableEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnPortEntryEnt appnPortEntry;

                        private AppnPortTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnPortTable", "1.3.6.1.2.1.34.4.1.1.4.1", false, true, false, false);
                            this.appnPortEntry = new AppnPortEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnPortEntry
                            };
                        }
                        public static final class AppnPortEntryEnt extends MIBEntry<APPNMIBDef>
                        {
                            public final AppnPortNameEnt appnPortName;

                            public final AppnPortCommandEnt appnPortCommand;

                            public final AppnPortOperStateEnt appnPortOperState;

                            public final AppnPortDlcTypeEnt appnPortDlcType;

                            public final AppnPortPortTypeEnt appnPortPortType;

                            public final AppnPortSIMRIMEnt appnPortSIMRIM;

                            public final AppnPortLsRoleEnt appnPortLsRole;

                            public final AppnPortNegotLsEnt appnPortNegotLs;

                            public final AppnPortDynamicLinkSupportEnt appnPortDynamicLinkSupport;

                            public final AppnPortMaxRcvBtuSizeEnt appnPortMaxRcvBtuSize;

                            public final AppnPortMaxIframeWindowEnt appnPortMaxIframeWindow;

                            public final AppnPortDefLsGoodXidsEnt appnPortDefLsGoodXids;

                            public final AppnPortDefLsBadXidsEnt appnPortDefLsBadXids;

                            public final AppnPortDynLsGoodXidsEnt appnPortDynLsGoodXids;

                            public final AppnPortDynLsBadXidsEnt appnPortDynLsBadXids;

                            public final AppnPortSpecificEnt appnPortSpecific;

                            public final AppnPortDlcLocalAddrEnt appnPortDlcLocalAddr;

                            public final AppnPortCounterDisconTimeEnt appnPortCounterDisconTime;

                            private AppnPortEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnPortEntry", "1.3.6.1.2.1.34.4.1.1.4.1.1", false, false, false, true);
                                this.appnPortName = new AppnPortNameEnt(mib, this);
                                this.appnPortCommand = new AppnPortCommandEnt(mib, this);
                                this.appnPortOperState = new AppnPortOperStateEnt(mib, this);
                                this.appnPortDlcType = new AppnPortDlcTypeEnt(mib, this);
                                this.appnPortPortType = new AppnPortPortTypeEnt(mib, this);
                                this.appnPortSIMRIM = new AppnPortSIMRIMEnt(mib, this);
                                this.appnPortLsRole = new AppnPortLsRoleEnt(mib, this);
                                this.appnPortNegotLs = new AppnPortNegotLsEnt(mib, this);
                                this.appnPortDynamicLinkSupport = new AppnPortDynamicLinkSupportEnt(mib, this);
                                this.appnPortMaxRcvBtuSize = new AppnPortMaxRcvBtuSizeEnt(mib, this);
                                this.appnPortMaxIframeWindow = new AppnPortMaxIframeWindowEnt(mib, this);
                                this.appnPortDefLsGoodXids = new AppnPortDefLsGoodXidsEnt(mib, this);
                                this.appnPortDefLsBadXids = new AppnPortDefLsBadXidsEnt(mib, this);
                                this.appnPortDynLsGoodXids = new AppnPortDynLsGoodXidsEnt(mib, this);
                                this.appnPortDynLsBadXids = new AppnPortDynLsBadXidsEnt(mib, this);
                                this.appnPortSpecific = new AppnPortSpecificEnt(mib, this);
                                this.appnPortDlcLocalAddr = new AppnPortDlcLocalAddrEnt(mib, this);
                                this.appnPortCounterDisconTime = new AppnPortCounterDisconTimeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.appnPortName,
                                    this.appnPortCommand,
                                    this.appnPortOperState,
                                    this.appnPortDlcType,
                                    this.appnPortPortType,
                                    this.appnPortSIMRIM,
                                    this.appnPortLsRole,
                                    this.appnPortNegotLs,
                                    this.appnPortDynamicLinkSupport,
                                    this.appnPortMaxRcvBtuSize,
                                    this.appnPortMaxIframeWindow,
                                    this.appnPortDefLsGoodXids,
                                    this.appnPortDefLsBadXids,
                                    this.appnPortDynLsGoodXids,
                                    this.appnPortDynLsBadXids,
                                    this.appnPortSpecific,
                                    this.appnPortDlcLocalAddr,
                                    this.appnPortCounterDisconTime
                                };
                            }
                            public static final class AppnPortNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortName", "1.3.6.1.2.1.34.4.1.1.4.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortCommandEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortCommandEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortCommand", "1.3.6.1.2.1.34.4.1.1.4.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortOperStateEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortOperStateEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortOperState", "1.3.6.1.2.1.34.4.1.1.4.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDlcTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDlcTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDlcType", "1.3.6.1.2.1.34.4.1.1.4.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortPortTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortPortTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortPortType", "1.3.6.1.2.1.34.4.1.1.4.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortSIMRIMEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortSIMRIMEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortSIMRIM", "1.3.6.1.2.1.34.4.1.1.4.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortLsRoleEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortLsRoleEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortLsRole", "1.3.6.1.2.1.34.4.1.1.4.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortNegotLsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortNegotLsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortNegotLs", "1.3.6.1.2.1.34.4.1.1.4.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDynamicLinkSupportEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDynamicLinkSupportEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDynamicLinkSupport", "1.3.6.1.2.1.34.4.1.1.4.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortMaxRcvBtuSizeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortMaxRcvBtuSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortMaxRcvBtuSize", "1.3.6.1.2.1.34.4.1.1.4.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortMaxIframeWindowEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortMaxIframeWindowEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortMaxIframeWindow", "1.3.6.1.2.1.34.4.1.1.4.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDefLsGoodXidsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDefLsGoodXidsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDefLsGoodXids", "1.3.6.1.2.1.34.4.1.1.4.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDefLsBadXidsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDefLsBadXidsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDefLsBadXids", "1.3.6.1.2.1.34.4.1.1.4.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDynLsGoodXidsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDynLsGoodXidsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDynLsGoodXids", "1.3.6.1.2.1.34.4.1.1.4.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDynLsBadXidsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDynLsBadXidsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDynLsBadXids", "1.3.6.1.2.1.34.4.1.1.4.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortSpecificEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortSpecificEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortSpecific", "1.3.6.1.2.1.34.4.1.1.4.1.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortDlcLocalAddrEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortDlcLocalAddrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortDlcLocalAddr", "1.3.6.1.2.1.34.4.1.1.4.1.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnPortCounterDisconTimeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnPortCounterDisconTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnPortCounterDisconTime", "1.3.6.1.2.1.34.4.1.1.4.1.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class AppnLinkStationInformationEnt extends MIBEntry<APPNMIBDef>
                {
                    /** *********************************************************************APPN Link Station InformationThis section provides information about an APPN node's link stations.**********************************************************************/
                    public final AppnLsTableEnt appnLsTable;

                    /** ********************************************************************This table provides information about errors this node encounteredwith connections to adjacent nodes.  Entries are added for exceptionalconditions encountered establishing connections, and for exceptionalconditions that resulted in termination of a connection.  It is animplementation option when entries are removed from this table.*********************************************************************/
                    public final AppnLsStatusTableEnt appnLsStatusTable;

                    private AppnLinkStationInformationEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLinkStationInformation", "1.3.6.1.2.1.34.4.1.1.5", false, false, false, false);
                        this.appnLsTable = new AppnLsTableEnt(mib, this);
                        this.appnLsStatusTable = new AppnLsStatusTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnLsTable,
                            this.appnLsStatusTable
                        };
                    }
                    public static final class AppnLsTableEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnLsEntryEnt appnLsEntry;

                        private AppnLsTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnLsTable", "1.3.6.1.2.1.34.4.1.1.5.1", false, true, false, false);
                            this.appnLsEntry = new AppnLsEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnLsEntry
                            };
                        }
                        public static final class AppnLsEntryEnt extends MIBEntry<APPNMIBDef>
                        {
                            public final AppnLsNameEnt appnLsName;

                            public final AppnLsCommandEnt appnLsCommand;

                            public final AppnLsOperStateEnt appnLsOperState;

                            public final AppnLsPortNameEnt appnLsPortName;

                            public final AppnLsDlcTypeEnt appnLsDlcType;

                            public final AppnLsDynamicEnt appnLsDynamic;

                            public final AppnLsAdjCpNameEnt appnLsAdjCpName;

                            public final AppnLsAdjNodeTypeEnt appnLsAdjNodeType;

                            public final AppnLsTgNumEnt appnLsTgNum;

                            public final AppnLsLimResourceEnt appnLsLimResource;

                            public final AppnLsActOnDemandEnt appnLsActOnDemand;

                            public final AppnLsMigrationEnt appnLsMigration;

                            public final AppnLsPartnerNodeIdEnt appnLsPartnerNodeId;

                            public final AppnLsCpCpSessionSupportEnt appnLsCpCpSessionSupport;

                            public final AppnLsMaxSendBtuSizeEnt appnLsMaxSendBtuSize;

                            public final AppnLsInXidBytesEnt appnLsInXidBytes;

                            public final AppnLsInMsgBytesEnt appnLsInMsgBytes;

                            public final AppnLsInXidFramesEnt appnLsInXidFrames;

                            public final AppnLsInMsgFramesEnt appnLsInMsgFrames;

                            public final AppnLsOutXidBytesEnt appnLsOutXidBytes;

                            public final AppnLsOutMsgBytesEnt appnLsOutMsgBytes;

                            public final AppnLsOutXidFramesEnt appnLsOutXidFrames;

                            public final AppnLsOutMsgFramesEnt appnLsOutMsgFrames;

                            public final AppnLsEchoRspsEnt appnLsEchoRsps;

                            public final AppnLsCurrentDelayEnt appnLsCurrentDelay;

                            public final AppnLsMaxDelayEnt appnLsMaxDelay;

                            public final AppnLsMinDelayEnt appnLsMinDelay;

                            public final AppnLsMaxDelayTimeEnt appnLsMaxDelayTime;

                            public final AppnLsGoodXidsEnt appnLsGoodXids;

                            public final AppnLsBadXidsEnt appnLsBadXids;

                            public final AppnLsSpecificEnt appnLsSpecific;

                            public final AppnLsActiveTimeEnt appnLsActiveTime;

                            public final AppnLsCurrentStateTimeEnt appnLsCurrentStateTime;

                            public final AppnLsHprSupEnt appnLsHprSup;

                            public final AppnLsErrRecoSupEnt appnLsErrRecoSup;

                            public final AppnLsForAnrLabelEnt appnLsForAnrLabel;

                            public final AppnLsRevAnrLabelEnt appnLsRevAnrLabel;

                            public final AppnLsCpCpNceIdEnt appnLsCpCpNceId;

                            public final AppnLsRouteNceIdEnt appnLsRouteNceId;

                            public final AppnLsBfNceIdEnt appnLsBfNceId;

                            public final AppnLsLocalAddrEnt appnLsLocalAddr;

                            public final AppnLsRemoteAddrEnt appnLsRemoteAddr;

                            public final AppnLsRemoteLsNameEnt appnLsRemoteLsName;

                            public final AppnLsCounterDisconTimeEnt appnLsCounterDisconTime;

                            public final AppnLsMltgMemberEnt appnLsMltgMember;

                            private AppnLsEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLsEntry", "1.3.6.1.2.1.34.4.1.1.5.1.1", false, false, false, true);
                                this.appnLsName = new AppnLsNameEnt(mib, this);
                                this.appnLsCommand = new AppnLsCommandEnt(mib, this);
                                this.appnLsOperState = new AppnLsOperStateEnt(mib, this);
                                this.appnLsPortName = new AppnLsPortNameEnt(mib, this);
                                this.appnLsDlcType = new AppnLsDlcTypeEnt(mib, this);
                                this.appnLsDynamic = new AppnLsDynamicEnt(mib, this);
                                this.appnLsAdjCpName = new AppnLsAdjCpNameEnt(mib, this);
                                this.appnLsAdjNodeType = new AppnLsAdjNodeTypeEnt(mib, this);
                                this.appnLsTgNum = new AppnLsTgNumEnt(mib, this);
                                this.appnLsLimResource = new AppnLsLimResourceEnt(mib, this);
                                this.appnLsActOnDemand = new AppnLsActOnDemandEnt(mib, this);
                                this.appnLsMigration = new AppnLsMigrationEnt(mib, this);
                                this.appnLsPartnerNodeId = new AppnLsPartnerNodeIdEnt(mib, this);
                                this.appnLsCpCpSessionSupport = new AppnLsCpCpSessionSupportEnt(mib, this);
                                this.appnLsMaxSendBtuSize = new AppnLsMaxSendBtuSizeEnt(mib, this);
                                this.appnLsInXidBytes = new AppnLsInXidBytesEnt(mib, this);
                                this.appnLsInMsgBytes = new AppnLsInMsgBytesEnt(mib, this);
                                this.appnLsInXidFrames = new AppnLsInXidFramesEnt(mib, this);
                                this.appnLsInMsgFrames = new AppnLsInMsgFramesEnt(mib, this);
                                this.appnLsOutXidBytes = new AppnLsOutXidBytesEnt(mib, this);
                                this.appnLsOutMsgBytes = new AppnLsOutMsgBytesEnt(mib, this);
                                this.appnLsOutXidFrames = new AppnLsOutXidFramesEnt(mib, this);
                                this.appnLsOutMsgFrames = new AppnLsOutMsgFramesEnt(mib, this);
                                this.appnLsEchoRsps = new AppnLsEchoRspsEnt(mib, this);
                                this.appnLsCurrentDelay = new AppnLsCurrentDelayEnt(mib, this);
                                this.appnLsMaxDelay = new AppnLsMaxDelayEnt(mib, this);
                                this.appnLsMinDelay = new AppnLsMinDelayEnt(mib, this);
                                this.appnLsMaxDelayTime = new AppnLsMaxDelayTimeEnt(mib, this);
                                this.appnLsGoodXids = new AppnLsGoodXidsEnt(mib, this);
                                this.appnLsBadXids = new AppnLsBadXidsEnt(mib, this);
                                this.appnLsSpecific = new AppnLsSpecificEnt(mib, this);
                                this.appnLsActiveTime = new AppnLsActiveTimeEnt(mib, this);
                                this.appnLsCurrentStateTime = new AppnLsCurrentStateTimeEnt(mib, this);
                                this.appnLsHprSup = new AppnLsHprSupEnt(mib, this);
                                this.appnLsErrRecoSup = new AppnLsErrRecoSupEnt(mib, this);
                                this.appnLsForAnrLabel = new AppnLsForAnrLabelEnt(mib, this);
                                this.appnLsRevAnrLabel = new AppnLsRevAnrLabelEnt(mib, this);
                                this.appnLsCpCpNceId = new AppnLsCpCpNceIdEnt(mib, this);
                                this.appnLsRouteNceId = new AppnLsRouteNceIdEnt(mib, this);
                                this.appnLsBfNceId = new AppnLsBfNceIdEnt(mib, this);
                                this.appnLsLocalAddr = new AppnLsLocalAddrEnt(mib, this);
                                this.appnLsRemoteAddr = new AppnLsRemoteAddrEnt(mib, this);
                                this.appnLsRemoteLsName = new AppnLsRemoteLsNameEnt(mib, this);
                                this.appnLsCounterDisconTime = new AppnLsCounterDisconTimeEnt(mib, this);
                                this.appnLsMltgMember = new AppnLsMltgMemberEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.appnLsName,
                                    this.appnLsCommand,
                                    this.appnLsOperState,
                                    this.appnLsPortName,
                                    this.appnLsDlcType,
                                    this.appnLsDynamic,
                                    this.appnLsAdjCpName,
                                    this.appnLsAdjNodeType,
                                    this.appnLsTgNum,
                                    this.appnLsLimResource,
                                    this.appnLsActOnDemand,
                                    this.appnLsMigration,
                                    this.appnLsPartnerNodeId,
                                    this.appnLsCpCpSessionSupport,
                                    this.appnLsMaxSendBtuSize,
                                    this.appnLsInXidBytes,
                                    this.appnLsInMsgBytes,
                                    this.appnLsInXidFrames,
                                    this.appnLsInMsgFrames,
                                    this.appnLsOutXidBytes,
                                    this.appnLsOutMsgBytes,
                                    this.appnLsOutXidFrames,
                                    this.appnLsOutMsgFrames,
                                    this.appnLsEchoRsps,
                                    this.appnLsCurrentDelay,
                                    this.appnLsMaxDelay,
                                    this.appnLsMinDelay,
                                    this.appnLsMaxDelayTime,
                                    this.appnLsGoodXids,
                                    this.appnLsBadXids,
                                    this.appnLsSpecific,
                                    this.appnLsActiveTime,
                                    this.appnLsCurrentStateTime,
                                    this.appnLsHprSup,
                                    this.appnLsErrRecoSup,
                                    this.appnLsForAnrLabel,
                                    this.appnLsRevAnrLabel,
                                    this.appnLsCpCpNceId,
                                    this.appnLsRouteNceId,
                                    this.appnLsBfNceId,
                                    this.appnLsLocalAddr,
                                    this.appnLsRemoteAddr,
                                    this.appnLsRemoteLsName,
                                    this.appnLsCounterDisconTime,
                                    this.appnLsMltgMember
                                };
                            }
                            public static final class AppnLsNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsName", "1.3.6.1.2.1.34.4.1.1.5.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsCommandEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsCommandEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsCommand", "1.3.6.1.2.1.34.4.1.1.5.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsOperStateEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsOperStateEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsOperState", "1.3.6.1.2.1.34.4.1.1.5.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsPortNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsPortNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsPortName", "1.3.6.1.2.1.34.4.1.1.5.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsDlcTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsDlcTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsDlcType", "1.3.6.1.2.1.34.4.1.1.5.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsDynamicEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsDynamicEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsDynamic", "1.3.6.1.2.1.34.4.1.1.5.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsAdjCpNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsAdjCpNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsAdjCpName", "1.3.6.1.2.1.34.4.1.1.5.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsAdjNodeTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsAdjNodeTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsAdjNodeType", "1.3.6.1.2.1.34.4.1.1.5.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsTgNumEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsTgNum", "1.3.6.1.2.1.34.4.1.1.5.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsLimResourceEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsLimResourceEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsLimResource", "1.3.6.1.2.1.34.4.1.1.5.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsActOnDemandEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsActOnDemandEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsActOnDemand", "1.3.6.1.2.1.34.4.1.1.5.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsMigrationEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsMigrationEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsMigration", "1.3.6.1.2.1.34.4.1.1.5.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsPartnerNodeIdEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsPartnerNodeIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsPartnerNodeId", "1.3.6.1.2.1.34.4.1.1.5.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsCpCpSessionSupportEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsCpCpSessionSupportEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsCpCpSessionSupport", "1.3.6.1.2.1.34.4.1.1.5.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsMaxSendBtuSizeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsMaxSendBtuSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsMaxSendBtuSize", "1.3.6.1.2.1.34.4.1.1.5.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsInXidBytesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsInXidBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsInXidBytes", "1.3.6.1.2.1.34.4.1.1.5.1.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsInMsgBytesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsInMsgBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsInMsgBytes", "1.3.6.1.2.1.34.4.1.1.5.1.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsInXidFramesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsInXidFramesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsInXidFrames", "1.3.6.1.2.1.34.4.1.1.5.1.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsInMsgFramesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsInMsgFramesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsInMsgFrames", "1.3.6.1.2.1.34.4.1.1.5.1.1.19", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsOutXidBytesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsOutXidBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsOutXidBytes", "1.3.6.1.2.1.34.4.1.1.5.1.1.20", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsOutMsgBytesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsOutMsgBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsOutMsgBytes", "1.3.6.1.2.1.34.4.1.1.5.1.1.21", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsOutXidFramesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsOutXidFramesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsOutXidFrames", "1.3.6.1.2.1.34.4.1.1.5.1.1.22", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsOutMsgFramesEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsOutMsgFramesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsOutMsgFrames", "1.3.6.1.2.1.34.4.1.1.5.1.1.23", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsEchoRspsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsEchoRspsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsEchoRsps", "1.3.6.1.2.1.34.4.1.1.5.1.1.24", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsCurrentDelayEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsCurrentDelayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsCurrentDelay", "1.3.6.1.2.1.34.4.1.1.5.1.1.25", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsMaxDelayEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsMaxDelayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsMaxDelay", "1.3.6.1.2.1.34.4.1.1.5.1.1.26", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsMinDelayEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsMinDelayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsMinDelay", "1.3.6.1.2.1.34.4.1.1.5.1.1.27", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsMaxDelayTimeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsMaxDelayTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsMaxDelayTime", "1.3.6.1.2.1.34.4.1.1.5.1.1.28", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsGoodXidsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsGoodXidsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsGoodXids", "1.3.6.1.2.1.34.4.1.1.5.1.1.29", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsBadXidsEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsBadXidsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsBadXids", "1.3.6.1.2.1.34.4.1.1.5.1.1.30", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsSpecificEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsSpecificEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsSpecific", "1.3.6.1.2.1.34.4.1.1.5.1.1.31", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsActiveTimeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsActiveTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsActiveTime", "1.3.6.1.2.1.34.4.1.1.5.1.1.32", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsCurrentStateTimeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsCurrentStateTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsCurrentStateTime", "1.3.6.1.2.1.34.4.1.1.5.1.1.33", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsHprSupEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsHprSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsHprSup", "1.3.6.1.2.1.34.4.1.1.5.1.1.34", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsErrRecoSupEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsErrRecoSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsErrRecoSup", "1.3.6.1.2.1.34.4.1.1.5.1.1.35", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsForAnrLabelEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsForAnrLabelEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsForAnrLabel", "1.3.6.1.2.1.34.4.1.1.5.1.1.36", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsRevAnrLabelEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsRevAnrLabelEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsRevAnrLabel", "1.3.6.1.2.1.34.4.1.1.5.1.1.37", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsCpCpNceIdEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsCpCpNceIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsCpCpNceId", "1.3.6.1.2.1.34.4.1.1.5.1.1.38", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsRouteNceIdEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsRouteNceIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsRouteNceId", "1.3.6.1.2.1.34.4.1.1.5.1.1.39", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsBfNceIdEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsBfNceIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsBfNceId", "1.3.6.1.2.1.34.4.1.1.5.1.1.40", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsLocalAddrEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsLocalAddrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsLocalAddr", "1.3.6.1.2.1.34.4.1.1.5.1.1.41", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsRemoteAddrEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsRemoteAddrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsRemoteAddr", "1.3.6.1.2.1.34.4.1.1.5.1.1.42", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsRemoteLsNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsRemoteLsNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsRemoteLsName", "1.3.6.1.2.1.34.4.1.1.5.1.1.43", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsCounterDisconTimeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsCounterDisconTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsCounterDisconTime", "1.3.6.1.2.1.34.4.1.1.5.1.1.44", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsMltgMemberEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsMltgMemberEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsMltgMember", "1.3.6.1.2.1.34.4.1.1.5.1.1.45", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class AppnLsStatusTableEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnLsStatusEntryEnt appnLsStatusEntry;

                        private AppnLsStatusTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnLsStatusTable", "1.3.6.1.2.1.34.4.1.1.5.2", false, true, false, false);
                            this.appnLsStatusEntry = new AppnLsStatusEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnLsStatusEntry
                            };
                        }
                        public static final class AppnLsStatusEntryEnt extends MIBEntry<APPNMIBDef>
                        {
                            public final AppnLsStatusIndexEnt appnLsStatusIndex;

                            public final AppnLsStatusTimeEnt appnLsStatusTime;

                            public final AppnLsStatusLsNameEnt appnLsStatusLsName;

                            public final AppnLsStatusCpNameEnt appnLsStatusCpName;

                            public final AppnLsStatusPartnerIdEnt appnLsStatusPartnerId;

                            public final AppnLsStatusTgNumEnt appnLsStatusTgNum;

                            public final AppnLsStatusGeneralSenseEnt appnLsStatusGeneralSense;

                            public final AppnLsStatusRetryEnt appnLsStatusRetry;

                            public final AppnLsStatusEndSenseEnt appnLsStatusEndSense;

                            public final AppnLsStatusXidLocalSenseEnt appnLsStatusXidLocalSense;

                            public final AppnLsStatusXidRemoteSenseEnt appnLsStatusXidRemoteSense;

                            public final AppnLsStatusXidByteInErrorEnt appnLsStatusXidByteInError;

                            public final AppnLsStatusXidBitInErrorEnt appnLsStatusXidBitInError;

                            public final AppnLsStatusDlcTypeEnt appnLsStatusDlcType;

                            public final AppnLsStatusLocalAddrEnt appnLsStatusLocalAddr;

                            public final AppnLsStatusRemoteAddrEnt appnLsStatusRemoteAddr;

                            private AppnLsStatusEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLsStatusEntry", "1.3.6.1.2.1.34.4.1.1.5.2.1", false, false, false, true);
                                this.appnLsStatusIndex = new AppnLsStatusIndexEnt(mib, this);
                                this.appnLsStatusTime = new AppnLsStatusTimeEnt(mib, this);
                                this.appnLsStatusLsName = new AppnLsStatusLsNameEnt(mib, this);
                                this.appnLsStatusCpName = new AppnLsStatusCpNameEnt(mib, this);
                                this.appnLsStatusPartnerId = new AppnLsStatusPartnerIdEnt(mib, this);
                                this.appnLsStatusTgNum = new AppnLsStatusTgNumEnt(mib, this);
                                this.appnLsStatusGeneralSense = new AppnLsStatusGeneralSenseEnt(mib, this);
                                this.appnLsStatusRetry = new AppnLsStatusRetryEnt(mib, this);
                                this.appnLsStatusEndSense = new AppnLsStatusEndSenseEnt(mib, this);
                                this.appnLsStatusXidLocalSense = new AppnLsStatusXidLocalSenseEnt(mib, this);
                                this.appnLsStatusXidRemoteSense = new AppnLsStatusXidRemoteSenseEnt(mib, this);
                                this.appnLsStatusXidByteInError = new AppnLsStatusXidByteInErrorEnt(mib, this);
                                this.appnLsStatusXidBitInError = new AppnLsStatusXidBitInErrorEnt(mib, this);
                                this.appnLsStatusDlcType = new AppnLsStatusDlcTypeEnt(mib, this);
                                this.appnLsStatusLocalAddr = new AppnLsStatusLocalAddrEnt(mib, this);
                                this.appnLsStatusRemoteAddr = new AppnLsStatusRemoteAddrEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.appnLsStatusIndex,
                                    this.appnLsStatusTime,
                                    this.appnLsStatusLsName,
                                    this.appnLsStatusCpName,
                                    this.appnLsStatusPartnerId,
                                    this.appnLsStatusTgNum,
                                    this.appnLsStatusGeneralSense,
                                    this.appnLsStatusRetry,
                                    this.appnLsStatusEndSense,
                                    this.appnLsStatusXidLocalSense,
                                    this.appnLsStatusXidRemoteSense,
                                    this.appnLsStatusXidByteInError,
                                    this.appnLsStatusXidBitInError,
                                    this.appnLsStatusDlcType,
                                    this.appnLsStatusLocalAddr,
                                    this.appnLsStatusRemoteAddr
                                };
                            }
                            public static final class AppnLsStatusIndexEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusIndexEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusIndex", "1.3.6.1.2.1.34.4.1.1.5.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusTimeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusTime", "1.3.6.1.2.1.34.4.1.1.5.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusLsNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusLsNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusLsName", "1.3.6.1.2.1.34.4.1.1.5.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusCpNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusCpNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusCpName", "1.3.6.1.2.1.34.4.1.1.5.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusPartnerIdEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusPartnerIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusPartnerId", "1.3.6.1.2.1.34.4.1.1.5.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusTgNumEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusTgNum", "1.3.6.1.2.1.34.4.1.1.5.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusGeneralSenseEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusGeneralSenseEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusGeneralSense", "1.3.6.1.2.1.34.4.1.1.5.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusRetryEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusRetryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusRetry", "1.3.6.1.2.1.34.4.1.1.5.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusEndSenseEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusEndSenseEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusEndSense", "1.3.6.1.2.1.34.4.1.1.5.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusXidLocalSenseEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusXidLocalSenseEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusXidLocalSense", "1.3.6.1.2.1.34.4.1.1.5.2.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusXidRemoteSenseEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusXidRemoteSenseEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusXidRemoteSense", "1.3.6.1.2.1.34.4.1.1.5.2.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusXidByteInErrorEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusXidByteInErrorEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusXidByteInError", "1.3.6.1.2.1.34.4.1.1.5.2.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusXidBitInErrorEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusXidBitInErrorEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusXidBitInError", "1.3.6.1.2.1.34.4.1.1.5.2.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusDlcTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusDlcTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusDlcType", "1.3.6.1.2.1.34.4.1.1.5.2.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusLocalAddrEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusLocalAddrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusLocalAddr", "1.3.6.1.2.1.34.4.1.1.5.2.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnLsStatusRemoteAddrEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnLsStatusRemoteAddrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnLsStatusRemoteAddr", "1.3.6.1.2.1.34.4.1.1.5.2.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class AppnVrnInfoEnt extends MIBEntry<APPNMIBDef>
                {
                    /** *********************************************************************APPN Virtual Routing Node InformationThis section provides information relating a virtual routing node toan APPN port.**********************************************************************/
                    public final AppnVrnTableEnt appnVrnTable;

                    private AppnVrnInfoEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnVrnInfo", "1.3.6.1.2.1.34.4.1.1.6", false, false, false, false);
                        this.appnVrnTable = new AppnVrnTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnVrnTable
                        };
                    }
                    public static final class AppnVrnTableEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnVrnEntryEnt appnVrnEntry;

                        private AppnVrnTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnVrnTable", "1.3.6.1.2.1.34.4.1.1.6.1", false, true, false, false);
                            this.appnVrnEntry = new AppnVrnEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnVrnEntry
                            };
                        }
                        public static final class AppnVrnEntryEnt extends MIBEntry<APPNMIBDef>
                        {
                            public final AppnVrnNameEnt appnVrnName;

                            public final AppnVrnTgNumEnt appnVrnTgNum;

                            public final AppnVrnPortNameEnt appnVrnPortName;

                            private AppnVrnEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnVrnEntry", "1.3.6.1.2.1.34.4.1.1.6.1.1", false, false, false, true);
                                this.appnVrnName = new AppnVrnNameEnt(mib, this);
                                this.appnVrnTgNum = new AppnVrnTgNumEnt(mib, this);
                                this.appnVrnPortName = new AppnVrnPortNameEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.appnVrnName,
                                    this.appnVrnTgNum,
                                    this.appnVrnPortName
                                };
                            }
                            public static final class AppnVrnNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnVrnNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnVrnName", "1.3.6.1.2.1.34.4.1.1.6.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnVrnTgNumEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnVrnTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnVrnTgNum", "1.3.6.1.2.1.34.4.1.1.6.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnVrnPortNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnVrnPortNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnVrnPortName", "1.3.6.1.2.1.34.4.1.1.6.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class AppnNnEnt extends MIBEntry<APPNMIBDef>
            {
                public final AppnNnTopoEnt appnNnTopo;

                public final AppnNnTopologyEnt appnNnTopology;

                private AppnNnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnNn", "1.3.6.1.2.1.34.4.1.2", false, false, false, false);
                    this.appnNnTopo = new AppnNnTopoEnt(mib, this);
                    this.appnNnTopology = new AppnNnTopologyEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnNnTopo,
                        this.appnNnTopology
                    };
                }
                public static final class AppnNnTopoEnt extends MIBEntry<APPNMIBDef>
                {
                    /** This group is used to represent the entire APPN network-node topologyincluding network nodes, virtual routing nodes and all TGs associatedwith these nodes, including intersubnetwork TGs (ISTGs) and branch TGs.
Network nodesThe APPN topology database consists of information about every APPNnetwork node in this network node's topology subnetwork.  Thisinformation is learned over time as each network node exchangestopology information with the network nodes adjacent to it.  Thedatabase consists of information about each node, and informationabout all of the transmission groups used by these nodes.Virtual routing nodesInformation about virtual routing nodes (representing connectionnetworks) is treated in the same way as information about networknodes, and is replicated at each network node.  The FRSN, node name,and node type are the only meaningful fields for a virtual routingnode.  The other node objects return unspecified values.  Eachnode that has defined a TG with this virtual routing node as thedestination also defines a TG on this virtual routing node.  Thereis a TG record for each node that uses this virtual routing node.The APPN node table represents node information from the APPN topologydatabase, with the FRSN and APPN fully qualified CP name serving asthe index.  The FRSN is the agent's relative time stamp of an updateto the network topology database.  After collecting the entire databaseonce, a management application can issue GET NEXT commands startingfrom the last rows it has retrieved from the appnNnTopologyFRTable andfrom the appnNnTgTopologyFRTable.  When the response to either of theseGET NEXT commands returns another row of its respective table, thisindicates a change to the agent's topology database.  The managementapplication can then retrieve only the updates to the table, usingGET NEXT commands starting from the last retrieved node or TG entry.The format of the actual APPN topology database is as follows:Node table (entry for each node in network)TG table (entry for each TG owned by node)Due to SNMP's ASN.1 limitations, we cannot represent the TG tablewithin the node table in this way.  We define separate tables fornodes and TGs, adding the node name to each TG entry to provide ameans of correlating the TG with its originating node.*/
                    public final AppnNnTopoMaxNodesEnt appnNnTopoMaxNodes;

                    public final AppnNnTopoCurNumNodesEnt appnNnTopoCurNumNodes;

                    public final AppnNnTopoNodePurgesEnt appnNnTopoNodePurges;

                    public final AppnNnTopoTgPurgesEnt appnNnTopoTgPurges;

                    public final AppnNnTopoTotalTduWarsEnt appnNnTopoTotalTduWars;

                    private AppnNnTopoEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnNnTopo", "1.3.6.1.2.1.34.4.1.2.1", false, false, false, false);
                        this.appnNnTopoMaxNodes = new AppnNnTopoMaxNodesEnt(mib, this);
                        this.appnNnTopoCurNumNodes = new AppnNnTopoCurNumNodesEnt(mib, this);
                        this.appnNnTopoNodePurges = new AppnNnTopoNodePurgesEnt(mib, this);
                        this.appnNnTopoTgPurges = new AppnNnTopoTgPurgesEnt(mib, this);
                        this.appnNnTopoTotalTduWars = new AppnNnTopoTotalTduWarsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnNnTopoMaxNodes,
                            this.appnNnTopoCurNumNodes,
                            this.appnNnTopoNodePurges,
                            this.appnNnTopoTgPurges,
                            this.appnNnTopoTotalTduWars
                        };
                    }
                    public static final class AppnNnTopoMaxNodesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNnTopoMaxNodesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTopoMaxNodes", "1.3.6.1.2.1.34.4.1.2.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNnTopoCurNumNodesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNnTopoCurNumNodesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTopoCurNumNodes", "1.3.6.1.2.1.34.4.1.2.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNnTopoNodePurgesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNnTopoNodePurgesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTopoNodePurges", "1.3.6.1.2.1.34.4.1.2.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNnTopoTgPurgesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNnTopoTgPurgesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTopoTgPurges", "1.3.6.1.2.1.34.4.1.2.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnNnTopoTotalTduWarsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnNnTopoTotalTduWarsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTopoTotalTduWars", "1.3.6.1.2.1.34.4.1.2.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppnNnTopologyEnt extends MIBEntry<APPNMIBDef>
                {
                    /** APPN network node topology table (using FRSN and name as index)
This table describes every APPN network node and virtual routing noderepresented in this node's topology database.*/
                    public final AppnNnTopologyFRTableEnt appnNnTopologyFRTable;

                    /** APPN transmission group (TG) table
This table describes the TGs associated with all the APPN networknodes known to this node.   The originating (owning) node for eachTG is repeated here to provide a means of correlating the TGs withthe nodes.*/
                    public final AppnNnTgTopologyFRTableEnt appnNnTgTopologyFRTable;

                    private AppnNnTopologyEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnNnTopology", "1.3.6.1.2.1.34.4.1.2.2", false, false, false, false);
                        this.appnNnTopologyFRTable = new AppnNnTopologyFRTableEnt(mib, this);
                        this.appnNnTgTopologyFRTable = new AppnNnTgTopologyFRTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnNnTopologyFRTable,
                            this.appnNnTgTopologyFRTable
                        };
                    }
                    public static final class AppnNnTopologyFRTableEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnNnTopologyFREntryEnt appnNnTopologyFREntry;

                        private AppnNnTopologyFRTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTopologyFRTable", "1.3.6.1.2.1.34.4.1.2.2.3", false, true, false, false);
                            this.appnNnTopologyFREntry = new AppnNnTopologyFREntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnNnTopologyFREntry
                            };
                        }
                        public static final class AppnNnTopologyFREntryEnt extends MIBEntry<APPNMIBDef>
                        {
                            public final AppnNnNodeFRFrsnEnt appnNnNodeFRFrsn;

                            public final AppnNnNodeFRNameEnt appnNnNodeFRName;

                            public final AppnNnNodeFREntryTimeLeftEnt appnNnNodeFREntryTimeLeft;

                            public final AppnNnNodeFRTypeEnt appnNnNodeFRType;

                            public final AppnNnNodeFRRsnEnt appnNnNodeFRRsn;

                            public final AppnNnNodeFRRouteAddResistEnt appnNnNodeFRRouteAddResist;

                            public final AppnNnNodeFRCongestedEnt appnNnNodeFRCongested;

                            public final AppnNnNodeFRIsrDepletedEnt appnNnNodeFRIsrDepleted;

                            public final AppnNnNodeFRQuiescingEnt appnNnNodeFRQuiescing;

                            public final AppnNnNodeFRGatewayEnt appnNnNodeFRGateway;

                            public final AppnNnNodeFRCentralDirectoryEnt appnNnNodeFRCentralDirectory;

                            public final AppnNnNodeFRIsrEnt appnNnNodeFRIsr;

                            public final AppnNnNodeFRGarbageCollectEnt appnNnNodeFRGarbageCollect;

                            public final AppnNnNodeFRHprSupportEnt appnNnNodeFRHprSupport;

                            public final AppnNnNodeFRPeriBorderSupEnt appnNnNodeFRPeriBorderSup;

                            public final AppnNnNodeFRInterchangeSupEnt appnNnNodeFRInterchangeSup;

                            public final AppnNnNodeFRExteBorderSupEnt appnNnNodeFRExteBorderSup;

                            public final AppnNnNodeFRBranchAwarenessEnt appnNnNodeFRBranchAwareness;

                            private AppnNnTopologyFREntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnNnTopologyFREntry", "1.3.6.1.2.1.34.4.1.2.2.3.1", false, false, false, true);
                                this.appnNnNodeFRFrsn = new AppnNnNodeFRFrsnEnt(mib, this);
                                this.appnNnNodeFRName = new AppnNnNodeFRNameEnt(mib, this);
                                this.appnNnNodeFREntryTimeLeft = new AppnNnNodeFREntryTimeLeftEnt(mib, this);
                                this.appnNnNodeFRType = new AppnNnNodeFRTypeEnt(mib, this);
                                this.appnNnNodeFRRsn = new AppnNnNodeFRRsnEnt(mib, this);
                                this.appnNnNodeFRRouteAddResist = new AppnNnNodeFRRouteAddResistEnt(mib, this);
                                this.appnNnNodeFRCongested = new AppnNnNodeFRCongestedEnt(mib, this);
                                this.appnNnNodeFRIsrDepleted = new AppnNnNodeFRIsrDepletedEnt(mib, this);
                                this.appnNnNodeFRQuiescing = new AppnNnNodeFRQuiescingEnt(mib, this);
                                this.appnNnNodeFRGateway = new AppnNnNodeFRGatewayEnt(mib, this);
                                this.appnNnNodeFRCentralDirectory = new AppnNnNodeFRCentralDirectoryEnt(mib, this);
                                this.appnNnNodeFRIsr = new AppnNnNodeFRIsrEnt(mib, this);
                                this.appnNnNodeFRGarbageCollect = new AppnNnNodeFRGarbageCollectEnt(mib, this);
                                this.appnNnNodeFRHprSupport = new AppnNnNodeFRHprSupportEnt(mib, this);
                                this.appnNnNodeFRPeriBorderSup = new AppnNnNodeFRPeriBorderSupEnt(mib, this);
                                this.appnNnNodeFRInterchangeSup = new AppnNnNodeFRInterchangeSupEnt(mib, this);
                                this.appnNnNodeFRExteBorderSup = new AppnNnNodeFRExteBorderSupEnt(mib, this);
                                this.appnNnNodeFRBranchAwareness = new AppnNnNodeFRBranchAwarenessEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.appnNnNodeFRFrsn,
                                    this.appnNnNodeFRName,
                                    this.appnNnNodeFREntryTimeLeft,
                                    this.appnNnNodeFRType,
                                    this.appnNnNodeFRRsn,
                                    this.appnNnNodeFRRouteAddResist,
                                    this.appnNnNodeFRCongested,
                                    this.appnNnNodeFRIsrDepleted,
                                    this.appnNnNodeFRQuiescing,
                                    this.appnNnNodeFRGateway,
                                    this.appnNnNodeFRCentralDirectory,
                                    this.appnNnNodeFRIsr,
                                    this.appnNnNodeFRGarbageCollect,
                                    this.appnNnNodeFRHprSupport,
                                    this.appnNnNodeFRPeriBorderSup,
                                    this.appnNnNodeFRInterchangeSup,
                                    this.appnNnNodeFRExteBorderSup,
                                    this.appnNnNodeFRBranchAwareness
                                };
                            }
                            public static final class AppnNnNodeFRFrsnEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRFrsnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRFrsn", "1.3.6.1.2.1.34.4.1.2.2.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRNameEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRName", "1.3.6.1.2.1.34.4.1.2.2.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFREntryTimeLeftEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFREntryTimeLeftEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFREntryTimeLeft", "1.3.6.1.2.1.34.4.1.2.2.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRType", "1.3.6.1.2.1.34.4.1.2.2.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRRsnEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRRsnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRRsn", "1.3.6.1.2.1.34.4.1.2.2.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRRouteAddResistEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRRouteAddResistEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRRouteAddResist", "1.3.6.1.2.1.34.4.1.2.2.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRCongestedEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRCongestedEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRCongested", "1.3.6.1.2.1.34.4.1.2.2.3.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRIsrDepletedEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRIsrDepletedEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRIsrDepleted", "1.3.6.1.2.1.34.4.1.2.2.3.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRQuiescingEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRQuiescingEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRQuiescing", "1.3.6.1.2.1.34.4.1.2.2.3.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRGatewayEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRGatewayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRGateway", "1.3.6.1.2.1.34.4.1.2.2.3.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRCentralDirectoryEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRCentralDirectoryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRCentralDirectory", "1.3.6.1.2.1.34.4.1.2.2.3.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRIsrEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRIsrEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRIsr", "1.3.6.1.2.1.34.4.1.2.2.3.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRGarbageCollectEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRGarbageCollectEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRGarbageCollect", "1.3.6.1.2.1.34.4.1.2.2.3.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRHprSupportEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRHprSupportEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRHprSupport", "1.3.6.1.2.1.34.4.1.2.2.3.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRPeriBorderSupEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRPeriBorderSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRPeriBorderSup", "1.3.6.1.2.1.34.4.1.2.2.3.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRInterchangeSupEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRInterchangeSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRInterchangeSup", "1.3.6.1.2.1.34.4.1.2.2.3.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRExteBorderSupEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRExteBorderSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRExteBorderSup", "1.3.6.1.2.1.34.4.1.2.2.3.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnNodeFRBranchAwarenessEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnNodeFRBranchAwarenessEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnNodeFRBranchAwareness", "1.3.6.1.2.1.34.4.1.2.2.3.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class AppnNnTgTopologyFRTableEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnNnTgTopologyFREntryEnt appnNnTgTopologyFREntry;

                        private AppnNnTgTopologyFRTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnNnTgTopologyFRTable", "1.3.6.1.2.1.34.4.1.2.2.4", false, true, false, false);
                            this.appnNnTgTopologyFREntry = new AppnNnTgTopologyFREntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnNnTgTopologyFREntry
                            };
                        }
                        public static final class AppnNnTgTopologyFREntryEnt extends MIBEntry<APPNMIBDef>
                        {
                            public final AppnNnTgFRFrsnEnt appnNnTgFRFrsn;

                            public final AppnNnTgFROwnerEnt appnNnTgFROwner;

                            public final AppnNnTgFRDestEnt appnNnTgFRDest;

                            public final AppnNnTgFRNumEnt appnNnTgFRNum;

                            public final AppnNnTgFREntryTimeLeftEnt appnNnTgFREntryTimeLeft;

                            public final AppnNnTgFRDestVirtualEnt appnNnTgFRDestVirtual;

                            public final AppnNnTgFRDlcDataEnt appnNnTgFRDlcData;

                            public final AppnNnTgFRRsnEnt appnNnTgFRRsn;

                            public final AppnNnTgFROperationalEnt appnNnTgFROperational;

                            public final AppnNnTgFRQuiescingEnt appnNnTgFRQuiescing;

                            public final AppnNnTgFRCpCpSessionEnt appnNnTgFRCpCpSession;

                            public final AppnNnTgFREffCapEnt appnNnTgFREffCap;

                            public final AppnNnTgFRConnCostEnt appnNnTgFRConnCost;

                            public final AppnNnTgFRByteCostEnt appnNnTgFRByteCost;

                            public final AppnNnTgFRSecurityEnt appnNnTgFRSecurity;

                            public final AppnNnTgFRDelayEnt appnNnTgFRDelay;

                            public final AppnNnTgFRUsr1Ent appnNnTgFRUsr1;

                            public final AppnNnTgFRUsr2Ent appnNnTgFRUsr2;

                            public final AppnNnTgFRUsr3Ent appnNnTgFRUsr3;

                            public final AppnNnTgFRGarbageCollectEnt appnNnTgFRGarbageCollect;

                            public final AppnNnTgFRSubareaNumEnt appnNnTgFRSubareaNum;

                            public final AppnNnTgFRHprSupEnt appnNnTgFRHprSup;

                            public final AppnNnTgFRDestHprTransEnt appnNnTgFRDestHprTrans;

                            public final AppnNnTgFRTypeIndicatorEnt appnNnTgFRTypeIndicator;

                            public final AppnNnTgFRIntersubnetEnt appnNnTgFRIntersubnet;

                            public final AppnNnTgFRMltgLinkTypeEnt appnNnTgFRMltgLinkType;

                            public final AppnNnTgFRBranchTgEnt appnNnTgFRBranchTg;

                            private AppnNnTgTopologyFREntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnNnTgTopologyFREntry", "1.3.6.1.2.1.34.4.1.2.2.4.1", false, false, false, true);
                                this.appnNnTgFRFrsn = new AppnNnTgFRFrsnEnt(mib, this);
                                this.appnNnTgFROwner = new AppnNnTgFROwnerEnt(mib, this);
                                this.appnNnTgFRDest = new AppnNnTgFRDestEnt(mib, this);
                                this.appnNnTgFRNum = new AppnNnTgFRNumEnt(mib, this);
                                this.appnNnTgFREntryTimeLeft = new AppnNnTgFREntryTimeLeftEnt(mib, this);
                                this.appnNnTgFRDestVirtual = new AppnNnTgFRDestVirtualEnt(mib, this);
                                this.appnNnTgFRDlcData = new AppnNnTgFRDlcDataEnt(mib, this);
                                this.appnNnTgFRRsn = new AppnNnTgFRRsnEnt(mib, this);
                                this.appnNnTgFROperational = new AppnNnTgFROperationalEnt(mib, this);
                                this.appnNnTgFRQuiescing = new AppnNnTgFRQuiescingEnt(mib, this);
                                this.appnNnTgFRCpCpSession = new AppnNnTgFRCpCpSessionEnt(mib, this);
                                this.appnNnTgFREffCap = new AppnNnTgFREffCapEnt(mib, this);
                                this.appnNnTgFRConnCost = new AppnNnTgFRConnCostEnt(mib, this);
                                this.appnNnTgFRByteCost = new AppnNnTgFRByteCostEnt(mib, this);
                                this.appnNnTgFRSecurity = new AppnNnTgFRSecurityEnt(mib, this);
                                this.appnNnTgFRDelay = new AppnNnTgFRDelayEnt(mib, this);
                                this.appnNnTgFRUsr1 = new AppnNnTgFRUsr1Ent(mib, this);
                                this.appnNnTgFRUsr2 = new AppnNnTgFRUsr2Ent(mib, this);
                                this.appnNnTgFRUsr3 = new AppnNnTgFRUsr3Ent(mib, this);
                                this.appnNnTgFRGarbageCollect = new AppnNnTgFRGarbageCollectEnt(mib, this);
                                this.appnNnTgFRSubareaNum = new AppnNnTgFRSubareaNumEnt(mib, this);
                                this.appnNnTgFRHprSup = new AppnNnTgFRHprSupEnt(mib, this);
                                this.appnNnTgFRDestHprTrans = new AppnNnTgFRDestHprTransEnt(mib, this);
                                this.appnNnTgFRTypeIndicator = new AppnNnTgFRTypeIndicatorEnt(mib, this);
                                this.appnNnTgFRIntersubnet = new AppnNnTgFRIntersubnetEnt(mib, this);
                                this.appnNnTgFRMltgLinkType = new AppnNnTgFRMltgLinkTypeEnt(mib, this);
                                this.appnNnTgFRBranchTg = new AppnNnTgFRBranchTgEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.appnNnTgFRFrsn,
                                    this.appnNnTgFROwner,
                                    this.appnNnTgFRDest,
                                    this.appnNnTgFRNum,
                                    this.appnNnTgFREntryTimeLeft,
                                    this.appnNnTgFRDestVirtual,
                                    this.appnNnTgFRDlcData,
                                    this.appnNnTgFRRsn,
                                    this.appnNnTgFROperational,
                                    this.appnNnTgFRQuiescing,
                                    this.appnNnTgFRCpCpSession,
                                    this.appnNnTgFREffCap,
                                    this.appnNnTgFRConnCost,
                                    this.appnNnTgFRByteCost,
                                    this.appnNnTgFRSecurity,
                                    this.appnNnTgFRDelay,
                                    this.appnNnTgFRUsr1,
                                    this.appnNnTgFRUsr2,
                                    this.appnNnTgFRUsr3,
                                    this.appnNnTgFRGarbageCollect,
                                    this.appnNnTgFRSubareaNum,
                                    this.appnNnTgFRHprSup,
                                    this.appnNnTgFRDestHprTrans,
                                    this.appnNnTgFRTypeIndicator,
                                    this.appnNnTgFRIntersubnet,
                                    this.appnNnTgFRMltgLinkType,
                                    this.appnNnTgFRBranchTg
                                };
                            }
                            public static final class AppnNnTgFRFrsnEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRFrsnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRFrsn", "1.3.6.1.2.1.34.4.1.2.2.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFROwnerEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFROwnerEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFROwner", "1.3.6.1.2.1.34.4.1.2.2.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRDestEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRDestEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRDest", "1.3.6.1.2.1.34.4.1.2.2.4.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRNumEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRNum", "1.3.6.1.2.1.34.4.1.2.2.4.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFREntryTimeLeftEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFREntryTimeLeftEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFREntryTimeLeft", "1.3.6.1.2.1.34.4.1.2.2.4.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRDestVirtualEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRDestVirtualEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRDestVirtual", "1.3.6.1.2.1.34.4.1.2.2.4.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRDlcDataEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRDlcDataEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRDlcData", "1.3.6.1.2.1.34.4.1.2.2.4.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRRsnEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRRsnEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRRsn", "1.3.6.1.2.1.34.4.1.2.2.4.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFROperationalEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFROperationalEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFROperational", "1.3.6.1.2.1.34.4.1.2.2.4.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRQuiescingEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRQuiescingEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRQuiescing", "1.3.6.1.2.1.34.4.1.2.2.4.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRCpCpSessionEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRCpCpSessionEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRCpCpSession", "1.3.6.1.2.1.34.4.1.2.2.4.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFREffCapEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFREffCapEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFREffCap", "1.3.6.1.2.1.34.4.1.2.2.4.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRConnCostEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRConnCostEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRConnCost", "1.3.6.1.2.1.34.4.1.2.2.4.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRByteCostEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRByteCostEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRByteCost", "1.3.6.1.2.1.34.4.1.2.2.4.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRSecurityEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRSecurityEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRSecurity", "1.3.6.1.2.1.34.4.1.2.2.4.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRDelayEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRDelayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRDelay", "1.3.6.1.2.1.34.4.1.2.2.4.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRUsr1Ent extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRUsr1Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRUsr1", "1.3.6.1.2.1.34.4.1.2.2.4.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRUsr2Ent extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRUsr2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRUsr2", "1.3.6.1.2.1.34.4.1.2.2.4.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRUsr3Ent extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRUsr3Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRUsr3", "1.3.6.1.2.1.34.4.1.2.2.4.1.19", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRGarbageCollectEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRGarbageCollectEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRGarbageCollect", "1.3.6.1.2.1.34.4.1.2.2.4.1.20", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRSubareaNumEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRSubareaNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRSubareaNum", "1.3.6.1.2.1.34.4.1.2.2.4.1.21", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRHprSupEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRHprSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRHprSup", "1.3.6.1.2.1.34.4.1.2.2.4.1.22", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRDestHprTransEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRDestHprTransEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRDestHprTrans", "1.3.6.1.2.1.34.4.1.2.2.4.1.23", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRTypeIndicatorEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRTypeIndicatorEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRTypeIndicator", "1.3.6.1.2.1.34.4.1.2.2.4.1.24", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRIntersubnetEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRIntersubnetEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRIntersubnet", "1.3.6.1.2.1.34.4.1.2.2.4.1.25", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRMltgLinkTypeEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRMltgLinkTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRMltgLinkType", "1.3.6.1.2.1.34.4.1.2.2.4.1.26", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class AppnNnTgFRBranchTgEnt extends MIBEntry<APPNMIBDef>
                            {
                                private AppnNnTgFRBranchTgEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                                {
                                    super(mib, parent, "appnNnTgFRBranchTg", "1.3.6.1.2.1.34.4.1.2.2.4.1.27", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class AppnLocalTopologyEnt extends MIBEntry<APPNMIBDef>
            {
                /** APPN Local Transmission Group (TG) tableThis table describes the TGs associated with this node only.*/
                public final AppnLocalTgTableEnt appnLocalTgTable;

                /** APPN Local End Node Transmission Group (TG) tableThis table describes the TGs associated with all of the end nodesknown to this node.*/
                public final AppnLocalEnTgTableEnt appnLocalEnTgTable;

                private AppnLocalTopologyEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnLocalTopology", "1.3.6.1.2.1.34.4.1.3", false, false, false, false);
                    this.appnLocalTgTable = new AppnLocalTgTableEnt(mib, this);
                    this.appnLocalEnTgTable = new AppnLocalEnTgTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnLocalTgTable,
                        this.appnLocalEnTgTable
                    };
                }
                public static final class AppnLocalTgTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnLocalTgEntryEnt appnLocalTgEntry;

                    private AppnLocalTgTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalTgTable", "1.3.6.1.2.1.34.4.1.3.1", false, true, false, false);
                        this.appnLocalTgEntry = new AppnLocalTgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnLocalTgEntry
                        };
                    }
                    public static final class AppnLocalTgEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnLocalTgDestEnt appnLocalTgDest;

                        public final AppnLocalTgNumEnt appnLocalTgNum;

                        public final AppnLocalTgDestVirtualEnt appnLocalTgDestVirtual;

                        public final AppnLocalTgDlcDataEnt appnLocalTgDlcData;

                        public final AppnLocalTgPortNameEnt appnLocalTgPortName;

                        public final AppnLocalTgQuiescingEnt appnLocalTgQuiescing;

                        public final AppnLocalTgOperationalEnt appnLocalTgOperational;

                        public final AppnLocalTgCpCpSessionEnt appnLocalTgCpCpSession;

                        public final AppnLocalTgEffCapEnt appnLocalTgEffCap;

                        public final AppnLocalTgConnCostEnt appnLocalTgConnCost;

                        public final AppnLocalTgByteCostEnt appnLocalTgByteCost;

                        public final AppnLocalTgSecurityEnt appnLocalTgSecurity;

                        public final AppnLocalTgDelayEnt appnLocalTgDelay;

                        public final AppnLocalTgUsr1Ent appnLocalTgUsr1;

                        public final AppnLocalTgUsr2Ent appnLocalTgUsr2;

                        public final AppnLocalTgUsr3Ent appnLocalTgUsr3;

                        public final AppnLocalTgHprSupEnt appnLocalTgHprSup;

                        public final AppnLocalTgIntersubnetEnt appnLocalTgIntersubnet;

                        public final AppnLocalTgMltgLinkTypeEnt appnLocalTgMltgLinkType;

                        public final AppnLocalTgBranchLinkTypeEnt appnLocalTgBranchLinkType;

                        private AppnLocalTgEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnLocalTgEntry", "1.3.6.1.2.1.34.4.1.3.1.1", false, false, false, true);
                            this.appnLocalTgDest = new AppnLocalTgDestEnt(mib, this);
                            this.appnLocalTgNum = new AppnLocalTgNumEnt(mib, this);
                            this.appnLocalTgDestVirtual = new AppnLocalTgDestVirtualEnt(mib, this);
                            this.appnLocalTgDlcData = new AppnLocalTgDlcDataEnt(mib, this);
                            this.appnLocalTgPortName = new AppnLocalTgPortNameEnt(mib, this);
                            this.appnLocalTgQuiescing = new AppnLocalTgQuiescingEnt(mib, this);
                            this.appnLocalTgOperational = new AppnLocalTgOperationalEnt(mib, this);
                            this.appnLocalTgCpCpSession = new AppnLocalTgCpCpSessionEnt(mib, this);
                            this.appnLocalTgEffCap = new AppnLocalTgEffCapEnt(mib, this);
                            this.appnLocalTgConnCost = new AppnLocalTgConnCostEnt(mib, this);
                            this.appnLocalTgByteCost = new AppnLocalTgByteCostEnt(mib, this);
                            this.appnLocalTgSecurity = new AppnLocalTgSecurityEnt(mib, this);
                            this.appnLocalTgDelay = new AppnLocalTgDelayEnt(mib, this);
                            this.appnLocalTgUsr1 = new AppnLocalTgUsr1Ent(mib, this);
                            this.appnLocalTgUsr2 = new AppnLocalTgUsr2Ent(mib, this);
                            this.appnLocalTgUsr3 = new AppnLocalTgUsr3Ent(mib, this);
                            this.appnLocalTgHprSup = new AppnLocalTgHprSupEnt(mib, this);
                            this.appnLocalTgIntersubnet = new AppnLocalTgIntersubnetEnt(mib, this);
                            this.appnLocalTgMltgLinkType = new AppnLocalTgMltgLinkTypeEnt(mib, this);
                            this.appnLocalTgBranchLinkType = new AppnLocalTgBranchLinkTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnLocalTgDest,
                                this.appnLocalTgNum,
                                this.appnLocalTgDestVirtual,
                                this.appnLocalTgDlcData,
                                this.appnLocalTgPortName,
                                this.appnLocalTgQuiescing,
                                this.appnLocalTgOperational,
                                this.appnLocalTgCpCpSession,
                                this.appnLocalTgEffCap,
                                this.appnLocalTgConnCost,
                                this.appnLocalTgByteCost,
                                this.appnLocalTgSecurity,
                                this.appnLocalTgDelay,
                                this.appnLocalTgUsr1,
                                this.appnLocalTgUsr2,
                                this.appnLocalTgUsr3,
                                this.appnLocalTgHprSup,
                                this.appnLocalTgIntersubnet,
                                this.appnLocalTgMltgLinkType,
                                this.appnLocalTgBranchLinkType
                            };
                        }
                        public static final class AppnLocalTgDestEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgDestEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgDest", "1.3.6.1.2.1.34.4.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgNumEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgNum", "1.3.6.1.2.1.34.4.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgDestVirtualEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgDestVirtualEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgDestVirtual", "1.3.6.1.2.1.34.4.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgDlcDataEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgDlcDataEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgDlcData", "1.3.6.1.2.1.34.4.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgPortNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgPortNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgPortName", "1.3.6.1.2.1.34.4.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgQuiescingEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgQuiescingEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgQuiescing", "1.3.6.1.2.1.34.4.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgOperationalEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgOperationalEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgOperational", "1.3.6.1.2.1.34.4.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgCpCpSessionEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgCpCpSessionEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgCpCpSession", "1.3.6.1.2.1.34.4.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgEffCapEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgEffCapEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgEffCap", "1.3.6.1.2.1.34.4.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgConnCostEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgConnCostEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgConnCost", "1.3.6.1.2.1.34.4.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgByteCostEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgByteCostEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgByteCost", "1.3.6.1.2.1.34.4.1.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgSecurityEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgSecurityEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgSecurity", "1.3.6.1.2.1.34.4.1.3.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgDelayEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgDelayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgDelay", "1.3.6.1.2.1.34.4.1.3.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgUsr1Ent extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgUsr1Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgUsr1", "1.3.6.1.2.1.34.4.1.3.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgUsr2Ent extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgUsr2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgUsr2", "1.3.6.1.2.1.34.4.1.3.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgUsr3Ent extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgUsr3Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgUsr3", "1.3.6.1.2.1.34.4.1.3.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgHprSupEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgHprSupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgHprSup", "1.3.6.1.2.1.34.4.1.3.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgIntersubnetEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgIntersubnetEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgIntersubnet", "1.3.6.1.2.1.34.4.1.3.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgMltgLinkTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgMltgLinkTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgMltgLinkType", "1.3.6.1.2.1.34.4.1.3.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalTgBranchLinkTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalTgBranchLinkTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalTgBranchLinkType", "1.3.6.1.2.1.34.4.1.3.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppnLocalEnTgTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnLocalEnTgEntryEnt appnLocalEnTgEntry;

                    private AppnLocalEnTgTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalEnTgTable", "1.3.6.1.2.1.34.4.1.3.2", false, true, false, false);
                        this.appnLocalEnTgEntry = new AppnLocalEnTgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnLocalEnTgEntry
                        };
                    }
                    public static final class AppnLocalEnTgEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnLocalEnTgOriginEnt appnLocalEnTgOrigin;

                        public final AppnLocalEnTgDestEnt appnLocalEnTgDest;

                        public final AppnLocalEnTgNumEnt appnLocalEnTgNum;

                        public final AppnLocalEnTgEntryTimeLeftEnt appnLocalEnTgEntryTimeLeft;

                        public final AppnLocalEnTgDestVirtualEnt appnLocalEnTgDestVirtual;

                        public final AppnLocalEnTgDlcDataEnt appnLocalEnTgDlcData;

                        public final AppnLocalEnTgOperationalEnt appnLocalEnTgOperational;

                        public final AppnLocalEnTgCpCpSessionEnt appnLocalEnTgCpCpSession;

                        public final AppnLocalEnTgEffCapEnt appnLocalEnTgEffCap;

                        public final AppnLocalEnTgConnCostEnt appnLocalEnTgConnCost;

                        public final AppnLocalEnTgByteCostEnt appnLocalEnTgByteCost;

                        public final AppnLocalEnTgSecurityEnt appnLocalEnTgSecurity;

                        public final AppnLocalEnTgDelayEnt appnLocalEnTgDelay;

                        public final AppnLocalEnTgUsr1Ent appnLocalEnTgUsr1;

                        public final AppnLocalEnTgUsr2Ent appnLocalEnTgUsr2;

                        public final AppnLocalEnTgUsr3Ent appnLocalEnTgUsr3;

                        public final AppnLocalEnTgMltgLinkTypeEnt appnLocalEnTgMltgLinkType;

                        private AppnLocalEnTgEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnLocalEnTgEntry", "1.3.6.1.2.1.34.4.1.3.2.1", false, false, false, true);
                            this.appnLocalEnTgOrigin = new AppnLocalEnTgOriginEnt(mib, this);
                            this.appnLocalEnTgDest = new AppnLocalEnTgDestEnt(mib, this);
                            this.appnLocalEnTgNum = new AppnLocalEnTgNumEnt(mib, this);
                            this.appnLocalEnTgEntryTimeLeft = new AppnLocalEnTgEntryTimeLeftEnt(mib, this);
                            this.appnLocalEnTgDestVirtual = new AppnLocalEnTgDestVirtualEnt(mib, this);
                            this.appnLocalEnTgDlcData = new AppnLocalEnTgDlcDataEnt(mib, this);
                            this.appnLocalEnTgOperational = new AppnLocalEnTgOperationalEnt(mib, this);
                            this.appnLocalEnTgCpCpSession = new AppnLocalEnTgCpCpSessionEnt(mib, this);
                            this.appnLocalEnTgEffCap = new AppnLocalEnTgEffCapEnt(mib, this);
                            this.appnLocalEnTgConnCost = new AppnLocalEnTgConnCostEnt(mib, this);
                            this.appnLocalEnTgByteCost = new AppnLocalEnTgByteCostEnt(mib, this);
                            this.appnLocalEnTgSecurity = new AppnLocalEnTgSecurityEnt(mib, this);
                            this.appnLocalEnTgDelay = new AppnLocalEnTgDelayEnt(mib, this);
                            this.appnLocalEnTgUsr1 = new AppnLocalEnTgUsr1Ent(mib, this);
                            this.appnLocalEnTgUsr2 = new AppnLocalEnTgUsr2Ent(mib, this);
                            this.appnLocalEnTgUsr3 = new AppnLocalEnTgUsr3Ent(mib, this);
                            this.appnLocalEnTgMltgLinkType = new AppnLocalEnTgMltgLinkTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnLocalEnTgOrigin,
                                this.appnLocalEnTgDest,
                                this.appnLocalEnTgNum,
                                this.appnLocalEnTgEntryTimeLeft,
                                this.appnLocalEnTgDestVirtual,
                                this.appnLocalEnTgDlcData,
                                this.appnLocalEnTgOperational,
                                this.appnLocalEnTgCpCpSession,
                                this.appnLocalEnTgEffCap,
                                this.appnLocalEnTgConnCost,
                                this.appnLocalEnTgByteCost,
                                this.appnLocalEnTgSecurity,
                                this.appnLocalEnTgDelay,
                                this.appnLocalEnTgUsr1,
                                this.appnLocalEnTgUsr2,
                                this.appnLocalEnTgUsr3,
                                this.appnLocalEnTgMltgLinkType
                            };
                        }
                        public static final class AppnLocalEnTgOriginEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgOriginEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgOrigin", "1.3.6.1.2.1.34.4.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgDestEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgDestEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgDest", "1.3.6.1.2.1.34.4.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgNumEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgNum", "1.3.6.1.2.1.34.4.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgEntryTimeLeftEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgEntryTimeLeftEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgEntryTimeLeft", "1.3.6.1.2.1.34.4.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgDestVirtualEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgDestVirtualEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgDestVirtual", "1.3.6.1.2.1.34.4.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgDlcDataEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgDlcDataEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgDlcData", "1.3.6.1.2.1.34.4.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgOperationalEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgOperationalEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgOperational", "1.3.6.1.2.1.34.4.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgCpCpSessionEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgCpCpSessionEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgCpCpSession", "1.3.6.1.2.1.34.4.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgEffCapEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgEffCapEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgEffCap", "1.3.6.1.2.1.34.4.1.3.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgConnCostEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgConnCostEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgConnCost", "1.3.6.1.2.1.34.4.1.3.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgByteCostEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgByteCostEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgByteCost", "1.3.6.1.2.1.34.4.1.3.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgSecurityEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgSecurityEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgSecurity", "1.3.6.1.2.1.34.4.1.3.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgDelayEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgDelayEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgDelay", "1.3.6.1.2.1.34.4.1.3.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgUsr1Ent extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgUsr1Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgUsr1", "1.3.6.1.2.1.34.4.1.3.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgUsr2Ent extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgUsr2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgUsr2", "1.3.6.1.2.1.34.4.1.3.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgUsr3Ent extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgUsr3Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgUsr3", "1.3.6.1.2.1.34.4.1.3.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnLocalEnTgMltgLinkTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnLocalEnTgMltgLinkTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnLocalEnTgMltgLinkType", "1.3.6.1.2.1.34.4.1.3.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppnDirEnt extends MIBEntry<APPNMIBDef>
            {
                public final AppnDirPerfEnt appnDirPerf;

                /** APPN Directory table
This table contains information about all known LUs.*/
                public final AppnDirTableEnt appnDirTable;

                private AppnDirEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnDir", "1.3.6.1.2.1.34.4.1.4", false, false, false, false);
                    this.appnDirPerf = new AppnDirPerfEnt(mib, this);
                    this.appnDirTable = new AppnDirTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnDirPerf,
                        this.appnDirTable
                    };
                }
                public static final class AppnDirPerfEnt extends MIBEntry<APPNMIBDef>
                {
                    /** The APPN Directory Group
The APPN Directory Database
Each APPN network node and branch network node maintains directoriescontaining information on which LUs (applications) are available andwhere they are located.  LUs can be located in an APPN network node,in any of its attached end nodes or branch network nodes, or in anyof the nodes below one of its attached branch network nodes.*/
                    public final AppnDirMaxCachesEnt appnDirMaxCaches;

                    public final AppnDirCurCachesEnt appnDirCurCaches;

                    public final AppnDirCurHomeEntriesEnt appnDirCurHomeEntries;

                    public final AppnDirRegEntriesEnt appnDirRegEntries;

                    public final AppnDirInLocatesEnt appnDirInLocates;

                    public final AppnDirInBcastLocatesEnt appnDirInBcastLocates;

                    public final AppnDirOutLocatesEnt appnDirOutLocates;

                    public final AppnDirOutBcastLocatesEnt appnDirOutBcastLocates;

                    public final AppnDirNotFoundLocatesEnt appnDirNotFoundLocates;

                    public final AppnDirNotFoundBcastLocatesEnt appnDirNotFoundBcastLocates;

                    public final AppnDirLocateOutstandsEnt appnDirLocateOutstands;

                    private AppnDirPerfEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnDirPerf", "1.3.6.1.2.1.34.4.1.4.1", false, false, false, false);
                        this.appnDirMaxCaches = new AppnDirMaxCachesEnt(mib, this);
                        this.appnDirCurCaches = new AppnDirCurCachesEnt(mib, this);
                        this.appnDirCurHomeEntries = new AppnDirCurHomeEntriesEnt(mib, this);
                        this.appnDirRegEntries = new AppnDirRegEntriesEnt(mib, this);
                        this.appnDirInLocates = new AppnDirInLocatesEnt(mib, this);
                        this.appnDirInBcastLocates = new AppnDirInBcastLocatesEnt(mib, this);
                        this.appnDirOutLocates = new AppnDirOutLocatesEnt(mib, this);
                        this.appnDirOutBcastLocates = new AppnDirOutBcastLocatesEnt(mib, this);
                        this.appnDirNotFoundLocates = new AppnDirNotFoundLocatesEnt(mib, this);
                        this.appnDirNotFoundBcastLocates = new AppnDirNotFoundBcastLocatesEnt(mib, this);
                        this.appnDirLocateOutstands = new AppnDirLocateOutstandsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnDirMaxCaches,
                            this.appnDirCurCaches,
                            this.appnDirCurHomeEntries,
                            this.appnDirRegEntries,
                            this.appnDirInLocates,
                            this.appnDirInBcastLocates,
                            this.appnDirOutLocates,
                            this.appnDirOutBcastLocates,
                            this.appnDirNotFoundLocates,
                            this.appnDirNotFoundBcastLocates,
                            this.appnDirLocateOutstands
                        };
                    }
                    public static final class AppnDirMaxCachesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirMaxCachesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirMaxCaches", "1.3.6.1.2.1.34.4.1.4.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirCurCachesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirCurCachesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirCurCaches", "1.3.6.1.2.1.34.4.1.4.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirCurHomeEntriesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirCurHomeEntriesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirCurHomeEntries", "1.3.6.1.2.1.34.4.1.4.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirRegEntriesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirRegEntriesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirRegEntries", "1.3.6.1.2.1.34.4.1.4.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirInLocatesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirInLocatesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirInLocates", "1.3.6.1.2.1.34.4.1.4.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirInBcastLocatesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirInBcastLocatesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirInBcastLocates", "1.3.6.1.2.1.34.4.1.4.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirOutLocatesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirOutLocatesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirOutLocates", "1.3.6.1.2.1.34.4.1.4.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirOutBcastLocatesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirOutBcastLocatesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirOutBcastLocates", "1.3.6.1.2.1.34.4.1.4.1.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirNotFoundLocatesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirNotFoundLocatesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirNotFoundLocates", "1.3.6.1.2.1.34.4.1.4.1.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirNotFoundBcastLocatesEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirNotFoundBcastLocatesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirNotFoundBcastLocates", "1.3.6.1.2.1.34.4.1.4.1.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnDirLocateOutstandsEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnDirLocateOutstandsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirLocateOutstands", "1.3.6.1.2.1.34.4.1.4.1.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppnDirTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnDirEntryEnt appnDirEntry;

                    private AppnDirTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnDirTable", "1.3.6.1.2.1.34.4.1.4.2", false, true, false, false);
                        this.appnDirEntry = new AppnDirEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnDirEntry
                        };
                    }
                    public static final class AppnDirEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnDirLuNameEnt appnDirLuName;

                        public final AppnDirNnServerNameEnt appnDirNnServerName;

                        public final AppnDirLuOwnerNameEnt appnDirLuOwnerName;

                        public final AppnDirLuLocationEnt appnDirLuLocation;

                        public final AppnDirTypeEnt appnDirType;

                        public final AppnDirApparentLuOwnerNameEnt appnDirApparentLuOwnerName;

                        private AppnDirEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnDirEntry", "1.3.6.1.2.1.34.4.1.4.2.1", false, false, false, true);
                            this.appnDirLuName = new AppnDirLuNameEnt(mib, this);
                            this.appnDirNnServerName = new AppnDirNnServerNameEnt(mib, this);
                            this.appnDirLuOwnerName = new AppnDirLuOwnerNameEnt(mib, this);
                            this.appnDirLuLocation = new AppnDirLuLocationEnt(mib, this);
                            this.appnDirType = new AppnDirTypeEnt(mib, this);
                            this.appnDirApparentLuOwnerName = new AppnDirApparentLuOwnerNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnDirLuName,
                                this.appnDirNnServerName,
                                this.appnDirLuOwnerName,
                                this.appnDirLuLocation,
                                this.appnDirType,
                                this.appnDirApparentLuOwnerName
                            };
                        }
                        public static final class AppnDirLuNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnDirLuNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnDirLuName", "1.3.6.1.2.1.34.4.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnDirNnServerNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnDirNnServerNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnDirNnServerName", "1.3.6.1.2.1.34.4.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnDirLuOwnerNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnDirLuOwnerNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnDirLuOwnerName", "1.3.6.1.2.1.34.4.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnDirLuLocationEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnDirLuLocationEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnDirLuLocation", "1.3.6.1.2.1.34.4.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnDirTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnDirTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnDirType", "1.3.6.1.2.1.34.4.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnDirApparentLuOwnerNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnDirApparentLuOwnerNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnDirApparentLuOwnerName", "1.3.6.1.2.1.34.4.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppnCosEnt extends MIBEntry<APPNMIBDef>
            {
                /** The APPN Class of Service (COS)
Class of Service is a means of expressing the quality of routes andthe transmission priority of traffic that flows on these routes.The quality of routes is specified by two tables, a COS weight tablefor TGs and a COS weight table for nodes.  Values in these COS tablesare administratively assigned at each APPN node, with seven defaulttables specified by the APPN architecture.**********************************************************************/
                public final AppnCosModeTableEnt appnCosModeTable;

                /** **********************************************************************/
                public final AppnCosNameTableEnt appnCosNameTable;

                /** **********************************************************************/
                public final AppnCosNodeRowTableEnt appnCosNodeRowTable;

                /** **********************************************************************/
                public final AppnCosTgRowTableEnt appnCosTgRowTable;

                private AppnCosEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnCos", "1.3.6.1.2.1.34.4.1.5", false, false, false, false);
                    this.appnCosModeTable = new AppnCosModeTableEnt(mib, this);
                    this.appnCosNameTable = new AppnCosNameTableEnt(mib, this);
                    this.appnCosNodeRowTable = new AppnCosNodeRowTableEnt(mib, this);
                    this.appnCosTgRowTable = new AppnCosTgRowTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnCosModeTable,
                        this.appnCosNameTable,
                        this.appnCosNodeRowTable,
                        this.appnCosTgRowTable
                    };
                }
                public static final class AppnCosModeTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnCosModeEntryEnt appnCosModeEntry;

                    private AppnCosModeTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCosModeTable", "1.3.6.1.2.1.34.4.1.5.1", false, true, false, false);
                        this.appnCosModeEntry = new AppnCosModeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnCosModeEntry
                        };
                    }
                    public static final class AppnCosModeEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnCosModeNameEnt appnCosModeName;

                        public final AppnCosModeCosNameEnt appnCosModeCosName;

                        private AppnCosModeEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnCosModeEntry", "1.3.6.1.2.1.34.4.1.5.1.1", false, false, false, true);
                            this.appnCosModeName = new AppnCosModeNameEnt(mib, this);
                            this.appnCosModeCosName = new AppnCosModeCosNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnCosModeName,
                                this.appnCosModeCosName
                            };
                        }
                        public static final class AppnCosModeNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosModeNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosModeName", "1.3.6.1.2.1.34.4.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosModeCosNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosModeCosNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosModeCosName", "1.3.6.1.2.1.34.4.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppnCosNameTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnCosNameEntryEnt appnCosNameEntry;

                    private AppnCosNameTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCosNameTable", "1.3.6.1.2.1.34.4.1.5.2", false, true, false, false);
                        this.appnCosNameEntry = new AppnCosNameEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnCosNameEntry
                        };
                    }
                    public static final class AppnCosNameEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnCosNameEnt appnCosName;

                        public final AppnCosTransPriorityEnt appnCosTransPriority;

                        private AppnCosNameEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnCosNameEntry", "1.3.6.1.2.1.34.4.1.5.2.1", false, false, false, true);
                            this.appnCosName = new AppnCosNameEnt(mib, this);
                            this.appnCosTransPriority = new AppnCosTransPriorityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnCosName,
                                this.appnCosTransPriority
                            };
                        }
                        public static final class AppnCosNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosName", "1.3.6.1.2.1.34.4.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTransPriorityEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTransPriorityEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTransPriority", "1.3.6.1.2.1.34.4.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppnCosNodeRowTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnCosNodeRowEntryEnt appnCosNodeRowEntry;

                    private AppnCosNodeRowTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCosNodeRowTable", "1.3.6.1.2.1.34.4.1.5.3", false, true, false, false);
                        this.appnCosNodeRowEntry = new AppnCosNodeRowEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnCosNodeRowEntry
                        };
                    }
                    public static final class AppnCosNodeRowEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnCosNodeRowNameEnt appnCosNodeRowName;

                        public final AppnCosNodeRowIndexEnt appnCosNodeRowIndex;

                        public final AppnCosNodeRowWgtEnt appnCosNodeRowWgt;

                        public final AppnCosNodeRowResistMinEnt appnCosNodeRowResistMin;

                        public final AppnCosNodeRowResistMaxEnt appnCosNodeRowResistMax;

                        public final AppnCosNodeRowMinCongestAllowEnt appnCosNodeRowMinCongestAllow;

                        public final AppnCosNodeRowMaxCongestAllowEnt appnCosNodeRowMaxCongestAllow;

                        private AppnCosNodeRowEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnCosNodeRowEntry", "1.3.6.1.2.1.34.4.1.5.3.1", false, false, false, true);
                            this.appnCosNodeRowName = new AppnCosNodeRowNameEnt(mib, this);
                            this.appnCosNodeRowIndex = new AppnCosNodeRowIndexEnt(mib, this);
                            this.appnCosNodeRowWgt = new AppnCosNodeRowWgtEnt(mib, this);
                            this.appnCosNodeRowResistMin = new AppnCosNodeRowResistMinEnt(mib, this);
                            this.appnCosNodeRowResistMax = new AppnCosNodeRowResistMaxEnt(mib, this);
                            this.appnCosNodeRowMinCongestAllow = new AppnCosNodeRowMinCongestAllowEnt(mib, this);
                            this.appnCosNodeRowMaxCongestAllow = new AppnCosNodeRowMaxCongestAllowEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnCosNodeRowName,
                                this.appnCosNodeRowIndex,
                                this.appnCosNodeRowWgt,
                                this.appnCosNodeRowResistMin,
                                this.appnCosNodeRowResistMax,
                                this.appnCosNodeRowMinCongestAllow,
                                this.appnCosNodeRowMaxCongestAllow
                            };
                        }
                        public static final class AppnCosNodeRowNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowName", "1.3.6.1.2.1.34.4.1.5.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosNodeRowIndexEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowIndexEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowIndex", "1.3.6.1.2.1.34.4.1.5.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosNodeRowWgtEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowWgtEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowWgt", "1.3.6.1.2.1.34.4.1.5.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosNodeRowResistMinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowResistMinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowResistMin", "1.3.6.1.2.1.34.4.1.5.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosNodeRowResistMaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowResistMaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowResistMax", "1.3.6.1.2.1.34.4.1.5.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosNodeRowMinCongestAllowEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowMinCongestAllowEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowMinCongestAllow", "1.3.6.1.2.1.34.4.1.5.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosNodeRowMaxCongestAllowEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosNodeRowMaxCongestAllowEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosNodeRowMaxCongestAllow", "1.3.6.1.2.1.34.4.1.5.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppnCosTgRowTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnCosTgRowEntryEnt appnCosTgRowEntry;

                    private AppnCosTgRowTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCosTgRowTable", "1.3.6.1.2.1.34.4.1.5.4", false, true, false, false);
                        this.appnCosTgRowEntry = new AppnCosTgRowEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnCosTgRowEntry
                        };
                    }
                    public static final class AppnCosTgRowEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnCosTgRowNameEnt appnCosTgRowName;

                        public final AppnCosTgRowIndexEnt appnCosTgRowIndex;

                        public final AppnCosTgRowWgtEnt appnCosTgRowWgt;

                        public final AppnCosTgRowEffCapMinEnt appnCosTgRowEffCapMin;

                        public final AppnCosTgRowEffCapMaxEnt appnCosTgRowEffCapMax;

                        public final AppnCosTgRowConnCostMinEnt appnCosTgRowConnCostMin;

                        public final AppnCosTgRowConnCostMaxEnt appnCosTgRowConnCostMax;

                        public final AppnCosTgRowByteCostMinEnt appnCosTgRowByteCostMin;

                        public final AppnCosTgRowByteCostMaxEnt appnCosTgRowByteCostMax;

                        public final AppnCosTgRowSecurityMinEnt appnCosTgRowSecurityMin;

                        public final AppnCosTgRowSecurityMaxEnt appnCosTgRowSecurityMax;

                        public final AppnCosTgRowDelayMinEnt appnCosTgRowDelayMin;

                        public final AppnCosTgRowDelayMaxEnt appnCosTgRowDelayMax;

                        public final AppnCosTgRowUsr1MinEnt appnCosTgRowUsr1Min;

                        public final AppnCosTgRowUsr1MaxEnt appnCosTgRowUsr1Max;

                        public final AppnCosTgRowUsr2MinEnt appnCosTgRowUsr2Min;

                        public final AppnCosTgRowUsr2MaxEnt appnCosTgRowUsr2Max;

                        public final AppnCosTgRowUsr3MinEnt appnCosTgRowUsr3Min;

                        public final AppnCosTgRowUsr3MaxEnt appnCosTgRowUsr3Max;

                        private AppnCosTgRowEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnCosTgRowEntry", "1.3.6.1.2.1.34.4.1.5.4.1", false, false, false, true);
                            this.appnCosTgRowName = new AppnCosTgRowNameEnt(mib, this);
                            this.appnCosTgRowIndex = new AppnCosTgRowIndexEnt(mib, this);
                            this.appnCosTgRowWgt = new AppnCosTgRowWgtEnt(mib, this);
                            this.appnCosTgRowEffCapMin = new AppnCosTgRowEffCapMinEnt(mib, this);
                            this.appnCosTgRowEffCapMax = new AppnCosTgRowEffCapMaxEnt(mib, this);
                            this.appnCosTgRowConnCostMin = new AppnCosTgRowConnCostMinEnt(mib, this);
                            this.appnCosTgRowConnCostMax = new AppnCosTgRowConnCostMaxEnt(mib, this);
                            this.appnCosTgRowByteCostMin = new AppnCosTgRowByteCostMinEnt(mib, this);
                            this.appnCosTgRowByteCostMax = new AppnCosTgRowByteCostMaxEnt(mib, this);
                            this.appnCosTgRowSecurityMin = new AppnCosTgRowSecurityMinEnt(mib, this);
                            this.appnCosTgRowSecurityMax = new AppnCosTgRowSecurityMaxEnt(mib, this);
                            this.appnCosTgRowDelayMin = new AppnCosTgRowDelayMinEnt(mib, this);
                            this.appnCosTgRowDelayMax = new AppnCosTgRowDelayMaxEnt(mib, this);
                            this.appnCosTgRowUsr1Min = new AppnCosTgRowUsr1MinEnt(mib, this);
                            this.appnCosTgRowUsr1Max = new AppnCosTgRowUsr1MaxEnt(mib, this);
                            this.appnCosTgRowUsr2Min = new AppnCosTgRowUsr2MinEnt(mib, this);
                            this.appnCosTgRowUsr2Max = new AppnCosTgRowUsr2MaxEnt(mib, this);
                            this.appnCosTgRowUsr3Min = new AppnCosTgRowUsr3MinEnt(mib, this);
                            this.appnCosTgRowUsr3Max = new AppnCosTgRowUsr3MaxEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnCosTgRowName,
                                this.appnCosTgRowIndex,
                                this.appnCosTgRowWgt,
                                this.appnCosTgRowEffCapMin,
                                this.appnCosTgRowEffCapMax,
                                this.appnCosTgRowConnCostMin,
                                this.appnCosTgRowConnCostMax,
                                this.appnCosTgRowByteCostMin,
                                this.appnCosTgRowByteCostMax,
                                this.appnCosTgRowSecurityMin,
                                this.appnCosTgRowSecurityMax,
                                this.appnCosTgRowDelayMin,
                                this.appnCosTgRowDelayMax,
                                this.appnCosTgRowUsr1Min,
                                this.appnCosTgRowUsr1Max,
                                this.appnCosTgRowUsr2Min,
                                this.appnCosTgRowUsr2Max,
                                this.appnCosTgRowUsr3Min,
                                this.appnCosTgRowUsr3Max
                            };
                        }
                        public static final class AppnCosTgRowNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowName", "1.3.6.1.2.1.34.4.1.5.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowIndexEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowIndexEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowIndex", "1.3.6.1.2.1.34.4.1.5.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowWgtEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowWgtEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowWgt", "1.3.6.1.2.1.34.4.1.5.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowEffCapMinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowEffCapMinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowEffCapMin", "1.3.6.1.2.1.34.4.1.5.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowEffCapMaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowEffCapMaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowEffCapMax", "1.3.6.1.2.1.34.4.1.5.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowConnCostMinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowConnCostMinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowConnCostMin", "1.3.6.1.2.1.34.4.1.5.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowConnCostMaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowConnCostMaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowConnCostMax", "1.3.6.1.2.1.34.4.1.5.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowByteCostMinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowByteCostMinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowByteCostMin", "1.3.6.1.2.1.34.4.1.5.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowByteCostMaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowByteCostMaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowByteCostMax", "1.3.6.1.2.1.34.4.1.5.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowSecurityMinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowSecurityMinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowSecurityMin", "1.3.6.1.2.1.34.4.1.5.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowSecurityMaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowSecurityMaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowSecurityMax", "1.3.6.1.2.1.34.4.1.5.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowDelayMinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowDelayMinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowDelayMin", "1.3.6.1.2.1.34.4.1.5.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowDelayMaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowDelayMaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowDelayMax", "1.3.6.1.2.1.34.4.1.5.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowUsr1MinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowUsr1MinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowUsr1Min", "1.3.6.1.2.1.34.4.1.5.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowUsr1MaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowUsr1MaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowUsr1Max", "1.3.6.1.2.1.34.4.1.5.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowUsr2MinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowUsr2MinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowUsr2Min", "1.3.6.1.2.1.34.4.1.5.4.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowUsr2MaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowUsr2MaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowUsr2Max", "1.3.6.1.2.1.34.4.1.5.4.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowUsr3MinEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowUsr3MinEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowUsr3Min", "1.3.6.1.2.1.34.4.1.5.4.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnCosTgRowUsr3MaxEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnCosTgRowUsr3MaxEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnCosTgRowUsr3Max", "1.3.6.1.2.1.34.4.1.5.4.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AppnSessIntermediateEnt extends MIBEntry<APPNMIBDef>
            {
                /** *********************************************************************Intermediate Session Information Global Objects*********************************************************************The following simple objects allow the collection of intermediatesession Information to be started and stopped.**********************************************************************/
                public final AppnIsInGlobalEnt appnIsInGlobal;

                /** *********************************************************************Intermediate Session Information Table*********************************************************************This table contains information on intermediate sessionswhich are currently active.**********************************************************************/
                public final AppnIsInTableEnt appnIsInTable;

                /** *********************************************************************Intermediate Session RTP Table*********************************************************************This table contains information on intermediate sessions that arebeing transported on Rapid Transport Protocol (RTP) connections byHigh Performance Routing (HPR).**********************************************************************/
                public final AppnIsRtpTableEnt appnIsRtpTable;

                private AppnSessIntermediateEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnSessIntermediate", "1.3.6.1.2.1.34.4.1.6", false, false, false, false);
                    this.appnIsInGlobal = new AppnIsInGlobalEnt(mib, this);
                    this.appnIsInTable = new AppnIsInTableEnt(mib, this);
                    this.appnIsRtpTable = new AppnIsRtpTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnIsInGlobal,
                        this.appnIsInTable,
                        this.appnIsRtpTable
                    };
                }
                public static final class AppnIsInGlobalEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnIsInGlobeCtrAdminStatusEnt appnIsInGlobeCtrAdminStatus;

                    public final AppnIsInGlobeCtrOperStatusEnt appnIsInGlobeCtrOperStatus;

                    public final AppnIsInGlobeCtrStatusTimeEnt appnIsInGlobeCtrStatusTime;

                    public final AppnIsInGlobeRscvEnt appnIsInGlobeRscv;

                    public final AppnIsInGlobeRscvTimeEnt appnIsInGlobeRscvTime;

                    public final AppnIsInGlobeActSessEnt appnIsInGlobeActSess;

                    public final AppnIsInGlobeHprBfActSessEnt appnIsInGlobeHprBfActSess;

                    private AppnIsInGlobalEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnIsInGlobal", "1.3.6.1.2.1.34.4.1.6.1", false, false, false, false);
                        this.appnIsInGlobeCtrAdminStatus = new AppnIsInGlobeCtrAdminStatusEnt(mib, this);
                        this.appnIsInGlobeCtrOperStatus = new AppnIsInGlobeCtrOperStatusEnt(mib, this);
                        this.appnIsInGlobeCtrStatusTime = new AppnIsInGlobeCtrStatusTimeEnt(mib, this);
                        this.appnIsInGlobeRscv = new AppnIsInGlobeRscvEnt(mib, this);
                        this.appnIsInGlobeRscvTime = new AppnIsInGlobeRscvTimeEnt(mib, this);
                        this.appnIsInGlobeActSess = new AppnIsInGlobeActSessEnt(mib, this);
                        this.appnIsInGlobeHprBfActSess = new AppnIsInGlobeHprBfActSessEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnIsInGlobeCtrAdminStatus,
                            this.appnIsInGlobeCtrOperStatus,
                            this.appnIsInGlobeCtrStatusTime,
                            this.appnIsInGlobeRscv,
                            this.appnIsInGlobeRscvTime,
                            this.appnIsInGlobeActSess,
                            this.appnIsInGlobeHprBfActSess
                        };
                    }
                    public static final class AppnIsInGlobeCtrAdminStatusEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeCtrAdminStatusEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeCtrAdminStatus", "1.3.6.1.2.1.34.4.1.6.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnIsInGlobeCtrOperStatusEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeCtrOperStatusEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeCtrOperStatus", "1.3.6.1.2.1.34.4.1.6.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnIsInGlobeCtrStatusTimeEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeCtrStatusTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeCtrStatusTime", "1.3.6.1.2.1.34.4.1.6.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnIsInGlobeRscvEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeRscvEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeRscv", "1.3.6.1.2.1.34.4.1.6.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnIsInGlobeRscvTimeEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeRscvTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeRscvTime", "1.3.6.1.2.1.34.4.1.6.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnIsInGlobeActSessEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeActSessEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeActSess", "1.3.6.1.2.1.34.4.1.6.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AppnIsInGlobeHprBfActSessEnt extends MIBEntry<APPNMIBDef>
                    {
                        private AppnIsInGlobeHprBfActSessEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInGlobeHprBfActSess", "1.3.6.1.2.1.34.4.1.6.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class AppnIsInTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnIsInEntryEnt appnIsInEntry;

                    private AppnIsInTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnIsInTable", "1.3.6.1.2.1.34.4.1.6.2", false, true, false, false);
                        this.appnIsInEntry = new AppnIsInEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnIsInEntry
                        };
                    }
                    public static final class AppnIsInEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnIsInFqCpNameEnt appnIsInFqCpName;

                        public final AppnIsInPcidEnt appnIsInPcid;

                        public final AppnIsInSessStateEnt appnIsInSessState;

                        public final AppnIsInPriLuNameEnt appnIsInPriLuName;

                        public final AppnIsInSecLuNameEnt appnIsInSecLuName;

                        public final AppnIsInModeNameEnt appnIsInModeName;

                        public final AppnIsInCosNameEnt appnIsInCosName;

                        public final AppnIsInTransPriorityEnt appnIsInTransPriority;

                        public final AppnIsInSessTypeEnt appnIsInSessType;

                        public final AppnIsInSessUpTimeEnt appnIsInSessUpTime;

                        public final AppnIsInCtrUpTimeEnt appnIsInCtrUpTime;

                        public final AppnIsInP2SFmdPiusEnt appnIsInP2SFmdPius;

                        public final AppnIsInS2PFmdPiusEnt appnIsInS2PFmdPius;

                        public final AppnIsInP2SNonFmdPiusEnt appnIsInP2SNonFmdPius;

                        public final AppnIsInS2PNonFmdPiusEnt appnIsInS2PNonFmdPius;

                        public final AppnIsInP2SFmdBytesEnt appnIsInP2SFmdBytes;

                        public final AppnIsInS2PFmdBytesEnt appnIsInS2PFmdBytes;

                        public final AppnIsInP2SNonFmdBytesEnt appnIsInP2SNonFmdBytes;

                        public final AppnIsInS2PNonFmdBytesEnt appnIsInS2PNonFmdBytes;

                        public final AppnIsInPsAdjCpNameEnt appnIsInPsAdjCpName;

                        public final AppnIsInPsAdjTgNumEnt appnIsInPsAdjTgNum;

                        public final AppnIsInPsSendMaxBtuSizeEnt appnIsInPsSendMaxBtuSize;

                        public final AppnIsInPsSendPacingTypeEnt appnIsInPsSendPacingType;

                        public final AppnIsInPsSendRpcEnt appnIsInPsSendRpc;

                        public final AppnIsInPsSendNxWndwSizeEnt appnIsInPsSendNxWndwSize;

                        public final AppnIsInPsRecvPacingTypeEnt appnIsInPsRecvPacingType;

                        public final AppnIsInPsRecvRpcEnt appnIsInPsRecvRpc;

                        public final AppnIsInPsRecvNxWndwSizeEnt appnIsInPsRecvNxWndwSize;

                        public final AppnIsInSsAdjCpNameEnt appnIsInSsAdjCpName;

                        public final AppnIsInSsAdjTgNumEnt appnIsInSsAdjTgNum;

                        public final AppnIsInSsSendMaxBtuSizeEnt appnIsInSsSendMaxBtuSize;

                        public final AppnIsInSsSendPacingTypeEnt appnIsInSsSendPacingType;

                        public final AppnIsInSsSendRpcEnt appnIsInSsSendRpc;

                        public final AppnIsInSsSendNxWndwSizeEnt appnIsInSsSendNxWndwSize;

                        public final AppnIsInSsRecvPacingTypeEnt appnIsInSsRecvPacingType;

                        public final AppnIsInSsRecvRpcEnt appnIsInSsRecvRpc;

                        public final AppnIsInSsRecvNxWndwSizeEnt appnIsInSsRecvNxWndwSize;

                        public final AppnIsInRouteInfoEnt appnIsInRouteInfo;

                        public final AppnIsInRtpNceIdEnt appnIsInRtpNceId;

                        public final AppnIsInRtpTcidEnt appnIsInRtpTcid;

                        private AppnIsInEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsInEntry", "1.3.6.1.2.1.34.4.1.6.2.1", false, false, false, true);
                            this.appnIsInFqCpName = new AppnIsInFqCpNameEnt(mib, this);
                            this.appnIsInPcid = new AppnIsInPcidEnt(mib, this);
                            this.appnIsInSessState = new AppnIsInSessStateEnt(mib, this);
                            this.appnIsInPriLuName = new AppnIsInPriLuNameEnt(mib, this);
                            this.appnIsInSecLuName = new AppnIsInSecLuNameEnt(mib, this);
                            this.appnIsInModeName = new AppnIsInModeNameEnt(mib, this);
                            this.appnIsInCosName = new AppnIsInCosNameEnt(mib, this);
                            this.appnIsInTransPriority = new AppnIsInTransPriorityEnt(mib, this);
                            this.appnIsInSessType = new AppnIsInSessTypeEnt(mib, this);
                            this.appnIsInSessUpTime = new AppnIsInSessUpTimeEnt(mib, this);
                            this.appnIsInCtrUpTime = new AppnIsInCtrUpTimeEnt(mib, this);
                            this.appnIsInP2SFmdPius = new AppnIsInP2SFmdPiusEnt(mib, this);
                            this.appnIsInS2PFmdPius = new AppnIsInS2PFmdPiusEnt(mib, this);
                            this.appnIsInP2SNonFmdPius = new AppnIsInP2SNonFmdPiusEnt(mib, this);
                            this.appnIsInS2PNonFmdPius = new AppnIsInS2PNonFmdPiusEnt(mib, this);
                            this.appnIsInP2SFmdBytes = new AppnIsInP2SFmdBytesEnt(mib, this);
                            this.appnIsInS2PFmdBytes = new AppnIsInS2PFmdBytesEnt(mib, this);
                            this.appnIsInP2SNonFmdBytes = new AppnIsInP2SNonFmdBytesEnt(mib, this);
                            this.appnIsInS2PNonFmdBytes = new AppnIsInS2PNonFmdBytesEnt(mib, this);
                            this.appnIsInPsAdjCpName = new AppnIsInPsAdjCpNameEnt(mib, this);
                            this.appnIsInPsAdjTgNum = new AppnIsInPsAdjTgNumEnt(mib, this);
                            this.appnIsInPsSendMaxBtuSize = new AppnIsInPsSendMaxBtuSizeEnt(mib, this);
                            this.appnIsInPsSendPacingType = new AppnIsInPsSendPacingTypeEnt(mib, this);
                            this.appnIsInPsSendRpc = new AppnIsInPsSendRpcEnt(mib, this);
                            this.appnIsInPsSendNxWndwSize = new AppnIsInPsSendNxWndwSizeEnt(mib, this);
                            this.appnIsInPsRecvPacingType = new AppnIsInPsRecvPacingTypeEnt(mib, this);
                            this.appnIsInPsRecvRpc = new AppnIsInPsRecvRpcEnt(mib, this);
                            this.appnIsInPsRecvNxWndwSize = new AppnIsInPsRecvNxWndwSizeEnt(mib, this);
                            this.appnIsInSsAdjCpName = new AppnIsInSsAdjCpNameEnt(mib, this);
                            this.appnIsInSsAdjTgNum = new AppnIsInSsAdjTgNumEnt(mib, this);
                            this.appnIsInSsSendMaxBtuSize = new AppnIsInSsSendMaxBtuSizeEnt(mib, this);
                            this.appnIsInSsSendPacingType = new AppnIsInSsSendPacingTypeEnt(mib, this);
                            this.appnIsInSsSendRpc = new AppnIsInSsSendRpcEnt(mib, this);
                            this.appnIsInSsSendNxWndwSize = new AppnIsInSsSendNxWndwSizeEnt(mib, this);
                            this.appnIsInSsRecvPacingType = new AppnIsInSsRecvPacingTypeEnt(mib, this);
                            this.appnIsInSsRecvRpc = new AppnIsInSsRecvRpcEnt(mib, this);
                            this.appnIsInSsRecvNxWndwSize = new AppnIsInSsRecvNxWndwSizeEnt(mib, this);
                            this.appnIsInRouteInfo = new AppnIsInRouteInfoEnt(mib, this);
                            this.appnIsInRtpNceId = new AppnIsInRtpNceIdEnt(mib, this);
                            this.appnIsInRtpTcid = new AppnIsInRtpTcidEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnIsInFqCpName,
                                this.appnIsInPcid,
                                this.appnIsInSessState,
                                this.appnIsInPriLuName,
                                this.appnIsInSecLuName,
                                this.appnIsInModeName,
                                this.appnIsInCosName,
                                this.appnIsInTransPriority,
                                this.appnIsInSessType,
                                this.appnIsInSessUpTime,
                                this.appnIsInCtrUpTime,
                                this.appnIsInP2SFmdPius,
                                this.appnIsInS2PFmdPius,
                                this.appnIsInP2SNonFmdPius,
                                this.appnIsInS2PNonFmdPius,
                                this.appnIsInP2SFmdBytes,
                                this.appnIsInS2PFmdBytes,
                                this.appnIsInP2SNonFmdBytes,
                                this.appnIsInS2PNonFmdBytes,
                                this.appnIsInPsAdjCpName,
                                this.appnIsInPsAdjTgNum,
                                this.appnIsInPsSendMaxBtuSize,
                                this.appnIsInPsSendPacingType,
                                this.appnIsInPsSendRpc,
                                this.appnIsInPsSendNxWndwSize,
                                this.appnIsInPsRecvPacingType,
                                this.appnIsInPsRecvRpc,
                                this.appnIsInPsRecvNxWndwSize,
                                this.appnIsInSsAdjCpName,
                                this.appnIsInSsAdjTgNum,
                                this.appnIsInSsSendMaxBtuSize,
                                this.appnIsInSsSendPacingType,
                                this.appnIsInSsSendRpc,
                                this.appnIsInSsSendNxWndwSize,
                                this.appnIsInSsRecvPacingType,
                                this.appnIsInSsRecvRpc,
                                this.appnIsInSsRecvNxWndwSize,
                                this.appnIsInRouteInfo,
                                this.appnIsInRtpNceId,
                                this.appnIsInRtpTcid
                            };
                        }
                        public static final class AppnIsInFqCpNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInFqCpNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInFqCpName", "1.3.6.1.2.1.34.4.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPcidEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPcidEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPcid", "1.3.6.1.2.1.34.4.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSessStateEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSessStateEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSessState", "1.3.6.1.2.1.34.4.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPriLuNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPriLuNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPriLuName", "1.3.6.1.2.1.34.4.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSecLuNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSecLuNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSecLuName", "1.3.6.1.2.1.34.4.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInModeNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInModeNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInModeName", "1.3.6.1.2.1.34.4.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInCosNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInCosNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInCosName", "1.3.6.1.2.1.34.4.1.6.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInTransPriorityEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInTransPriorityEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInTransPriority", "1.3.6.1.2.1.34.4.1.6.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSessTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSessTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSessType", "1.3.6.1.2.1.34.4.1.6.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSessUpTimeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSessUpTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSessUpTime", "1.3.6.1.2.1.34.4.1.6.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInCtrUpTimeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInCtrUpTimeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInCtrUpTime", "1.3.6.1.2.1.34.4.1.6.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInP2SFmdPiusEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInP2SFmdPiusEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInP2SFmdPius", "1.3.6.1.2.1.34.4.1.6.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInS2PFmdPiusEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInS2PFmdPiusEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInS2PFmdPius", "1.3.6.1.2.1.34.4.1.6.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInP2SNonFmdPiusEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInP2SNonFmdPiusEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInP2SNonFmdPius", "1.3.6.1.2.1.34.4.1.6.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInS2PNonFmdPiusEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInS2PNonFmdPiusEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInS2PNonFmdPius", "1.3.6.1.2.1.34.4.1.6.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInP2SFmdBytesEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInP2SFmdBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInP2SFmdBytes", "1.3.6.1.2.1.34.4.1.6.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInS2PFmdBytesEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInS2PFmdBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInS2PFmdBytes", "1.3.6.1.2.1.34.4.1.6.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInP2SNonFmdBytesEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInP2SNonFmdBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInP2SNonFmdBytes", "1.3.6.1.2.1.34.4.1.6.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInS2PNonFmdBytesEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInS2PNonFmdBytesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInS2PNonFmdBytes", "1.3.6.1.2.1.34.4.1.6.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsAdjCpNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsAdjCpNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsAdjCpName", "1.3.6.1.2.1.34.4.1.6.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsAdjTgNumEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsAdjTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsAdjTgNum", "1.3.6.1.2.1.34.4.1.6.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsSendMaxBtuSizeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsSendMaxBtuSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsSendMaxBtuSize", "1.3.6.1.2.1.34.4.1.6.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsSendPacingTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsSendPacingTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsSendPacingType", "1.3.6.1.2.1.34.4.1.6.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsSendRpcEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsSendRpcEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsSendRpc", "1.3.6.1.2.1.34.4.1.6.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsSendNxWndwSizeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsSendNxWndwSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsSendNxWndwSize", "1.3.6.1.2.1.34.4.1.6.2.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsRecvPacingTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsRecvPacingTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsRecvPacingType", "1.3.6.1.2.1.34.4.1.6.2.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsRecvRpcEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsRecvRpcEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsRecvRpc", "1.3.6.1.2.1.34.4.1.6.2.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInPsRecvNxWndwSizeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInPsRecvNxWndwSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInPsRecvNxWndwSize", "1.3.6.1.2.1.34.4.1.6.2.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsAdjCpNameEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsAdjCpNameEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsAdjCpName", "1.3.6.1.2.1.34.4.1.6.2.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsAdjTgNumEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsAdjTgNumEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsAdjTgNum", "1.3.6.1.2.1.34.4.1.6.2.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsSendMaxBtuSizeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsSendMaxBtuSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsSendMaxBtuSize", "1.3.6.1.2.1.34.4.1.6.2.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsSendPacingTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsSendPacingTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsSendPacingType", "1.3.6.1.2.1.34.4.1.6.2.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsSendRpcEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsSendRpcEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsSendRpc", "1.3.6.1.2.1.34.4.1.6.2.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsSendNxWndwSizeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsSendNxWndwSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsSendNxWndwSize", "1.3.6.1.2.1.34.4.1.6.2.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsRecvPacingTypeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsRecvPacingTypeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsRecvPacingType", "1.3.6.1.2.1.34.4.1.6.2.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsRecvRpcEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsRecvRpcEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsRecvRpc", "1.3.6.1.2.1.34.4.1.6.2.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInSsRecvNxWndwSizeEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInSsRecvNxWndwSizeEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInSsRecvNxWndwSize", "1.3.6.1.2.1.34.4.1.6.2.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInRouteInfoEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInRouteInfoEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInRouteInfo", "1.3.6.1.2.1.34.4.1.6.2.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInRtpNceIdEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInRtpNceIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInRtpNceId", "1.3.6.1.2.1.34.4.1.6.2.1.39", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsInRtpTcidEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsInRtpTcidEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsInRtpTcid", "1.3.6.1.2.1.34.4.1.6.2.1.40", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AppnIsRtpTableEnt extends MIBEntry<APPNMIBDef>
                {
                    public final AppnIsRtpEntryEnt appnIsRtpEntry;

                    private AppnIsRtpTableEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnIsRtpTable", "1.3.6.1.2.1.34.4.1.6.3", false, true, false, false);
                        this.appnIsRtpEntry = new AppnIsRtpEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.appnIsRtpEntry
                        };
                    }
                    public static final class AppnIsRtpEntryEnt extends MIBEntry<APPNMIBDef>
                    {
                        public final AppnIsRtpNceIdEnt appnIsRtpNceId;

                        public final AppnIsRtpTcidEnt appnIsRtpTcid;

                        public final AppnIsRtpSessionsEnt appnIsRtpSessions;

                        private AppnIsRtpEntryEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                        {
                            super(mib, parent, "appnIsRtpEntry", "1.3.6.1.2.1.34.4.1.6.3.1", false, false, false, true);
                            this.appnIsRtpNceId = new AppnIsRtpNceIdEnt(mib, this);
                            this.appnIsRtpTcid = new AppnIsRtpTcidEnt(mib, this);
                            this.appnIsRtpSessions = new AppnIsRtpSessionsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.appnIsRtpNceId,
                                this.appnIsRtpTcid,
                                this.appnIsRtpSessions
                            };
                        }
                        public static final class AppnIsRtpNceIdEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsRtpNceIdEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsRtpNceId", "1.3.6.1.2.1.34.4.1.6.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsRtpTcidEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsRtpTcidEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsRtpTcid", "1.3.6.1.2.1.34.4.1.6.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AppnIsRtpSessionsEnt extends MIBEntry<APPNMIBDef>
                        {
                            private AppnIsRtpSessionsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                            {
                                super(mib, parent, "appnIsRtpSessions", "1.3.6.1.2.1.34.4.1.6.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class AppnTrapsEnt extends MIBEntry<APPNMIBDef>
        {
            /** **********************************************************************/
            public final AlertTrapEnt alertTrap;

            public final AlertIdNumberEnt alertIdNumber;

            public final AffectedObjectEnt affectedObject;

            private AppnTrapsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
            {
                super(mib, parent, "appnTraps", "1.3.6.1.2.1.34.4.2", false, false, false, false);
                this.alertTrap = new AlertTrapEnt(mib, this);
                this.alertIdNumber = new AlertIdNumberEnt(mib, this);
                this.affectedObject = new AffectedObjectEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alertTrap,
                    this.alertIdNumber,
                    this.affectedObject
                };
            }
            public static final class AlertTrapEnt extends MIBEntry<APPNMIBDef>
            {
                private AlertTrapEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "alertTrap", "1.3.6.1.2.1.34.4.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlertIdNumberEnt extends MIBEntry<APPNMIBDef>
            {
                private AlertIdNumberEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "alertIdNumber", "1.3.6.1.2.1.34.4.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AffectedObjectEnt extends MIBEntry<APPNMIBDef>
            {
                private AffectedObjectEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "affectedObject", "1.3.6.1.2.1.34.4.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class AppnConformanceEnt extends MIBEntry<APPNMIBDef>
        {
            public final AppnCompliancesEnt appnCompliances;

            public final AppnGroupsEnt appnGroups;

            private AppnConformanceEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
            {
                super(mib, parent, "appnConformance", "1.3.6.1.2.1.34.4.3", false, false, false, false);
                this.appnCompliances = new AppnCompliancesEnt(mib, this);
                this.appnGroups = new AppnGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.appnCompliances,
                    this.appnGroups
                };
            }
            public static final class AppnCompliancesEnt extends MIBEntry<APPNMIBDef>
            {
                /** Compliance statements
appnCompliance  MODULE-COMPLIANCE (deprecated:  moved to end of module)*/
                public final AppnCompliance2Ent appnCompliance2;

                public final AppnComplianceEnt appnCompliance;

                private AppnCompliancesEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnCompliances", "1.3.6.1.2.1.34.4.3.1", false, false, false, false);
                    this.appnCompliance2 = new AppnCompliance2Ent(mib, this);
                    this.appnCompliance = new AppnComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnCompliance2,
                        this.appnCompliance
                    };
                }
                public static final class AppnCompliance2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnCompliance2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCompliance2", "1.3.6.1.2.1.34.4.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnComplianceEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnComplianceEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCompliance", "1.3.6.1.2.1.34.4.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AppnGroupsEnt extends MIBEntry<APPNMIBDef>
            {
                /** { appnCompliances 2 } is used by the APPN-TRAP-MIB
Units of conformance*/
                public final AppnGeneralConfGroup2Ent appnGeneralConfGroup2;

                /** { appnGroups 21 - 25 } are used by the APPN-TRAP-MIB*/
                public final AppnPortConfGroupEnt appnPortConfGroup;

                public final AppnLinkConfGroup2Ent appnLinkConfGroup2;

                public final AppnLocalTgConfGroup2Ent appnLocalTgConfGroup2;

                public final AppnDirTableConfGroup2Ent appnDirTableConfGroup2;

                public final AppnNnUniqueConfGroupEnt appnNnUniqueConfGroup;

                public final AppnEnUniqueConfGroupEnt appnEnUniqueConfGroup;

                public final AppnVrnConfGroupEnt appnVrnConfGroup;

                public final AppnNnTopoConfGroup2Ent appnNnTopoConfGroup2;

                public final AppnLocalEnTopoConfGroup2Ent appnLocalEnTopoConfGroup2;

                public final AppnLocalDirPerfConfGroupEnt appnLocalDirPerfConfGroup;

                public final AppnCosConfGroupEnt appnCosConfGroup;

                public final AppnIntSessConfGroupEnt appnIntSessConfGroup;

                public final AppnHprBaseConfGroupEnt appnHprBaseConfGroup;

                public final AppnHprRtpConfGroupEnt appnHprRtpConfGroup;

                public final AppnHprCtrlFlowsRtpConfGroupEnt appnHprCtrlFlowsRtpConfGroup;

                public final AppnHprBfConfGroupEnt appnHprBfConfGroup;

                public final AppnTrapConfGroupEnt appnTrapConfGroup;

                public final AppnTrapNotifGroupEnt appnTrapNotifGroup;

                public final AppnBrNnConfGroupEnt appnBrNnConfGroup;

                public final AppnGeneralConfGroupEnt appnGeneralConfGroup;

                public final AppnLinkConfGroupEnt appnLinkConfGroup;

                public final AppnLocalTgConfGroupEnt appnLocalTgConfGroup;

                public final AppnDirTableConfGroupEnt appnDirTableConfGroup;

                public final AppnNnTopoConfGroupEnt appnNnTopoConfGroup;

                public final AppnLocalEnTopoConfGroupEnt appnLocalEnTopoConfGroup;

                private AppnGroupsEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                {
                    super(mib, parent, "appnGroups", "1.3.6.1.2.1.34.4.3.2", false, false, false, false);
                    this.appnGeneralConfGroup2 = new AppnGeneralConfGroup2Ent(mib, this);
                    this.appnPortConfGroup = new AppnPortConfGroupEnt(mib, this);
                    this.appnLinkConfGroup2 = new AppnLinkConfGroup2Ent(mib, this);
                    this.appnLocalTgConfGroup2 = new AppnLocalTgConfGroup2Ent(mib, this);
                    this.appnDirTableConfGroup2 = new AppnDirTableConfGroup2Ent(mib, this);
                    this.appnNnUniqueConfGroup = new AppnNnUniqueConfGroupEnt(mib, this);
                    this.appnEnUniqueConfGroup = new AppnEnUniqueConfGroupEnt(mib, this);
                    this.appnVrnConfGroup = new AppnVrnConfGroupEnt(mib, this);
                    this.appnNnTopoConfGroup2 = new AppnNnTopoConfGroup2Ent(mib, this);
                    this.appnLocalEnTopoConfGroup2 = new AppnLocalEnTopoConfGroup2Ent(mib, this);
                    this.appnLocalDirPerfConfGroup = new AppnLocalDirPerfConfGroupEnt(mib, this);
                    this.appnCosConfGroup = new AppnCosConfGroupEnt(mib, this);
                    this.appnIntSessConfGroup = new AppnIntSessConfGroupEnt(mib, this);
                    this.appnHprBaseConfGroup = new AppnHprBaseConfGroupEnt(mib, this);
                    this.appnHprRtpConfGroup = new AppnHprRtpConfGroupEnt(mib, this);
                    this.appnHprCtrlFlowsRtpConfGroup = new AppnHprCtrlFlowsRtpConfGroupEnt(mib, this);
                    this.appnHprBfConfGroup = new AppnHprBfConfGroupEnt(mib, this);
                    this.appnTrapConfGroup = new AppnTrapConfGroupEnt(mib, this);
                    this.appnTrapNotifGroup = new AppnTrapNotifGroupEnt(mib, this);
                    this.appnBrNnConfGroup = new AppnBrNnConfGroupEnt(mib, this);
                    this.appnGeneralConfGroup = new AppnGeneralConfGroupEnt(mib, this);
                    this.appnLinkConfGroup = new AppnLinkConfGroupEnt(mib, this);
                    this.appnLocalTgConfGroup = new AppnLocalTgConfGroupEnt(mib, this);
                    this.appnDirTableConfGroup = new AppnDirTableConfGroupEnt(mib, this);
                    this.appnNnTopoConfGroup = new AppnNnTopoConfGroupEnt(mib, this);
                    this.appnLocalEnTopoConfGroup = new AppnLocalEnTopoConfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.appnGeneralConfGroup2,
                        this.appnPortConfGroup,
                        this.appnLinkConfGroup2,
                        this.appnLocalTgConfGroup2,
                        this.appnDirTableConfGroup2,
                        this.appnNnUniqueConfGroup,
                        this.appnEnUniqueConfGroup,
                        this.appnVrnConfGroup,
                        this.appnNnTopoConfGroup2,
                        this.appnLocalEnTopoConfGroup2,
                        this.appnLocalDirPerfConfGroup,
                        this.appnCosConfGroup,
                        this.appnIntSessConfGroup,
                        this.appnHprBaseConfGroup,
                        this.appnHprRtpConfGroup,
                        this.appnHprCtrlFlowsRtpConfGroup,
                        this.appnHprBfConfGroup,
                        this.appnTrapConfGroup,
                        this.appnTrapNotifGroup,
                        this.appnBrNnConfGroup,
                        this.appnGeneralConfGroup,
                        this.appnLinkConfGroup,
                        this.appnLocalTgConfGroup,
                        this.appnDirTableConfGroup,
                        this.appnNnTopoConfGroup,
                        this.appnLocalEnTopoConfGroup
                    };
                }
                public static final class AppnGeneralConfGroup2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnGeneralConfGroup2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnGeneralConfGroup2", "1.3.6.1.2.1.34.4.3.2.26", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnPortConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnPortConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnPortConfGroup", "1.3.6.1.2.1.34.4.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLinkConfGroup2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnLinkConfGroup2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLinkConfGroup2", "1.3.6.1.2.1.34.4.3.2.27", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLocalTgConfGroup2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnLocalTgConfGroup2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalTgConfGroup2", "1.3.6.1.2.1.34.4.3.2.28", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnDirTableConfGroup2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnDirTableConfGroup2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnDirTableConfGroup2", "1.3.6.1.2.1.34.4.3.2.29", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnNnUniqueConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnNnUniqueConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnNnUniqueConfGroup", "1.3.6.1.2.1.34.4.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnEnUniqueConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnEnUniqueConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnEnUniqueConfGroup", "1.3.6.1.2.1.34.4.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnVrnConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnVrnConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnVrnConfGroup", "1.3.6.1.2.1.34.4.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnNnTopoConfGroup2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnNnTopoConfGroup2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnNnTopoConfGroup2", "1.3.6.1.2.1.34.4.3.2.30", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLocalEnTopoConfGroup2Ent extends MIBEntry<APPNMIBDef>
                {
                    private AppnLocalEnTopoConfGroup2Ent(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalEnTopoConfGroup2", "1.3.6.1.2.1.34.4.3.2.31", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLocalDirPerfConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnLocalDirPerfConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalDirPerfConfGroup", "1.3.6.1.2.1.34.4.3.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnCosConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnCosConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnCosConfGroup", "1.3.6.1.2.1.34.4.3.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnIntSessConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnIntSessConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnIntSessConfGroup", "1.3.6.1.2.1.34.4.3.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnHprBaseConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnHprBaseConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnHprBaseConfGroup", "1.3.6.1.2.1.34.4.3.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnHprRtpConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnHprRtpConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnHprRtpConfGroup", "1.3.6.1.2.1.34.4.3.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnHprCtrlFlowsRtpConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnHprCtrlFlowsRtpConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnHprCtrlFlowsRtpConfGroup", "1.3.6.1.2.1.34.4.3.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnHprBfConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnHprBfConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnHprBfConfGroup", "1.3.6.1.2.1.34.4.3.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnTrapConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnTrapConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnTrapConfGroup", "1.3.6.1.2.1.34.4.3.2.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnTrapNotifGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnTrapNotifGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnTrapNotifGroup", "1.3.6.1.2.1.34.4.3.2.19", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnBrNnConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnBrNnConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnBrNnConfGroup", "1.3.6.1.2.1.34.4.3.2.20", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnGeneralConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnGeneralConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnGeneralConfGroup", "1.3.6.1.2.1.34.4.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLinkConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnLinkConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLinkConfGroup", "1.3.6.1.2.1.34.4.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLocalTgConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnLocalTgConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalTgConfGroup", "1.3.6.1.2.1.34.4.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnDirTableConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnDirTableConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnDirTableConfGroup", "1.3.6.1.2.1.34.4.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnNnTopoConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnNnTopoConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnNnTopoConfGroup", "1.3.6.1.2.1.34.4.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AppnLocalEnTopoConfGroupEnt extends MIBEntry<APPNMIBDef>
                {
                    private AppnLocalEnTopoConfGroupEnt(APPNMIBDef mib, MIBEntry<APPNMIBDef> parent)
                    {
                        super(mib, parent, "appnLocalEnTopoConfGroup", "1.3.6.1.2.1.34.4.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
