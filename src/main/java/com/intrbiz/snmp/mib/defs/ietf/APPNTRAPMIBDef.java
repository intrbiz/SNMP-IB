package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class APPNTRAPMIBDef extends MIB
{
    public static final APPNTRAPMIBDef APPNTRAPMIB = new APPNTRAPMIBDef();

    static { MIBs.getInstance().registerMIB(APPNTRAPMIBDef.APPNTRAPMIB); }

    /** August 31, 1998*/
    public final AppnTrapMIBEnt appnTrapMIB;

    /** *********************************************************************Supporting Objects**********************************************************************/
    public final AppnTrapObjectsEnt appnTrapObjects;

    /** *********************************************************************Conformance information*********************************************************************
Tie into the conformance structure in the APPN MIB:appnConformance       OBJECT IDENTIFIER ::= {appnMIB 3 }appnCompliances       OBJECT IDENTIFIER ::= {appnConformance 1 }appnGroups            OBJECT IDENTIFIER ::= {appnConformance 2 }
Compliance statement*/
    public final AppnTrapMibComplianceEnt appnTrapMibCompliance;

    /** Units of conformance*/
    public final AppnTrapMibIsrNotifGroupEnt appnTrapMibIsrNotifGroup;

    public final AppnTrapMibTopoConfGroupEnt appnTrapMibTopoConfGroup;

    public final AppnTrapMibTopoNotifGroupEnt appnTrapMibTopoNotifGroup;

    public final AppnTrapMibDlurConfGroupEnt appnTrapMibDlurConfGroup;

    public final AppnTrapMibDlurNotifGroupEnt appnTrapMibDlurNotifGroup;

    private APPNTRAPMIBDef()
    {
        super("APPN-TRAP-MIB");
        this.appnTrapMIB = new AppnTrapMIBEnt(this, null);
        this.appnTrapObjects = new AppnTrapObjectsEnt(this, null);
        this.appnTrapMibCompliance = new AppnTrapMibComplianceEnt(this, null);
        this.appnTrapMibIsrNotifGroup = new AppnTrapMibIsrNotifGroupEnt(this, null);
        this.appnTrapMibTopoConfGroup = new AppnTrapMibTopoConfGroupEnt(this, null);
        this.appnTrapMibTopoNotifGroup = new AppnTrapMibTopoNotifGroupEnt(this, null);
        this.appnTrapMibDlurConfGroup = new AppnTrapMibDlurConfGroupEnt(this, null);
        this.appnTrapMibDlurNotifGroup = new AppnTrapMibDlurNotifGroupEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.appnTrapMIB,
            this.appnTrapObjects,
            this.appnTrapMibCompliance,
            this.appnTrapMibIsrNotifGroup,
            this.appnTrapMibTopoConfGroup,
            this.appnTrapMibTopoNotifGroup,
            this.appnTrapMibDlurConfGroup,
            this.appnTrapMibDlurNotifGroup
        };
    }

    public static final class AppnTrapMIBEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        /** *********************************************************************Notifications**********************************************************************/
        public final AppnIsrAccountingDataTrapEnt appnIsrAccountingDataTrap;

        public final AppnLocalTgOperStateChangeTrapEnt appnLocalTgOperStateChangeTrap;

        public final AppnLocalTgCpCpChangeTrapEnt appnLocalTgCpCpChangeTrap;

        public final AppnPortOperStateChangeTrapEnt appnPortOperStateChangeTrap;

        public final AppnLsOperStateChangeTrapEnt appnLsOperStateChangeTrap;

        public final DlurDlusStateChangeTrapEnt dlurDlusStateChangeTrap;

        private AppnTrapMIBEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMIB", "1.3.6.1.2.1.34.4.0", false, false, false, false);
            this.appnIsrAccountingDataTrap = new AppnIsrAccountingDataTrapEnt(mib, this);
            this.appnLocalTgOperStateChangeTrap = new AppnLocalTgOperStateChangeTrapEnt(mib, this);
            this.appnLocalTgCpCpChangeTrap = new AppnLocalTgCpCpChangeTrapEnt(mib, this);
            this.appnPortOperStateChangeTrap = new AppnPortOperStateChangeTrapEnt(mib, this);
            this.appnLsOperStateChangeTrap = new AppnLsOperStateChangeTrapEnt(mib, this);
            this.dlurDlusStateChangeTrap = new DlurDlusStateChangeTrapEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.appnIsrAccountingDataTrap,
                this.appnLocalTgOperStateChangeTrap,
                this.appnLocalTgCpCpChangeTrap,
                this.appnPortOperStateChangeTrap,
                this.appnLsOperStateChangeTrap,
                this.dlurDlusStateChangeTrap
            };
        }
        public static final class AppnIsrAccountingDataTrapEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnIsrAccountingDataTrapEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnIsrAccountingDataTrap", "1.3.6.1.2.1.34.4.0.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnLocalTgOperStateChangeTrapEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnLocalTgOperStateChangeTrapEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnLocalTgOperStateChangeTrap", "1.3.6.1.2.1.34.4.0.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnLocalTgCpCpChangeTrapEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnLocalTgCpCpChangeTrapEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnLocalTgCpCpChangeTrap", "1.3.6.1.2.1.34.4.0.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnPortOperStateChangeTrapEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnPortOperStateChangeTrapEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnPortOperStateChangeTrap", "1.3.6.1.2.1.34.4.0.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnLsOperStateChangeTrapEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnLsOperStateChangeTrapEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnLsOperStateChangeTrap", "1.3.6.1.2.1.34.4.0.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DlurDlusStateChangeTrapEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private DlurDlusStateChangeTrapEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "dlurDlusStateChangeTrap", "1.3.6.1.2.1.34.4.0.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class AppnTrapObjectsEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        public final AppnTrapControlEnt appnTrapControl;

        public final AppnLocalTgTableChangesEnt appnLocalTgTableChanges;

        public final AppnPortTableChangesEnt appnPortTableChanges;

        public final AppnLsTableChangesEnt appnLsTableChanges;

        public final DlurDlusTableChangesEnt dlurDlusTableChanges;

        private AppnTrapObjectsEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapObjects", "1.3.6.1.2.1.34.4.1.7", false, false, false, false);
            this.appnTrapControl = new AppnTrapControlEnt(mib, this);
            this.appnLocalTgTableChanges = new AppnLocalTgTableChangesEnt(mib, this);
            this.appnPortTableChanges = new AppnPortTableChangesEnt(mib, this);
            this.appnLsTableChanges = new AppnLsTableChangesEnt(mib, this);
            this.dlurDlusTableChanges = new DlurDlusTableChangesEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.appnTrapControl,
                this.appnLocalTgTableChanges,
                this.appnPortTableChanges,
                this.appnLsTableChanges,
                this.dlurDlusTableChanges
            };
        }
        public static final class AppnTrapControlEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnTrapControlEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnTrapControl", "1.3.6.1.2.1.34.4.1.7.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnLocalTgTableChangesEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnLocalTgTableChangesEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnLocalTgTableChanges", "1.3.6.1.2.1.34.4.1.7.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnPortTableChangesEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnPortTableChangesEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnPortTableChanges", "1.3.6.1.2.1.34.4.1.7.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AppnLsTableChangesEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private AppnLsTableChangesEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "appnLsTableChanges", "1.3.6.1.2.1.34.4.1.7.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DlurDlusTableChangesEnt extends MIBEntry<APPNTRAPMIBDef>
        {
            private DlurDlusTableChangesEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
            {
                super(mib, parent, "dlurDlusTableChanges", "1.3.6.1.2.1.34.4.1.7.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class AppnTrapMibComplianceEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        private AppnTrapMibComplianceEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMibCompliance", "1.3.6.1.2.1.34.4.3.1.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AppnTrapMibIsrNotifGroupEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        private AppnTrapMibIsrNotifGroupEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMibIsrNotifGroup", "1.3.6.1.2.1.34.4.3.2.21", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AppnTrapMibTopoConfGroupEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        private AppnTrapMibTopoConfGroupEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMibTopoConfGroup", "1.3.6.1.2.1.34.4.3.2.22", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AppnTrapMibTopoNotifGroupEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        private AppnTrapMibTopoNotifGroupEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMibTopoNotifGroup", "1.3.6.1.2.1.34.4.3.2.23", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AppnTrapMibDlurConfGroupEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        private AppnTrapMibDlurConfGroupEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMibDlurConfGroup", "1.3.6.1.2.1.34.4.3.2.24", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class AppnTrapMibDlurNotifGroupEnt extends MIBEntry<APPNTRAPMIBDef>
    {
        private AppnTrapMibDlurNotifGroupEnt(APPNTRAPMIBDef mib, MIBEntry<APPNTRAPMIBDef> parent)
        {
            super(mib, parent, "appnTrapMibDlurNotifGroup", "1.3.6.1.2.1.34.4.3.2.25", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
