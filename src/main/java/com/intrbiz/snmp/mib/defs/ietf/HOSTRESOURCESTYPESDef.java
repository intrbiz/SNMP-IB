package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class HOSTRESOURCESTYPESDef extends MIB
{
    public static final HOSTRESOURCESTYPESDef HOSTRESOURCESTYPES = new HOSTRESOURCESTYPESDef();

    /** 6 March, 2000*/
    public final HostResourcesTypesModuleEnt hostResourcesTypesModule;

    public final HostEnt host;

    public final HrStorageOtherEnt hrStorageOther;

    public final HrStorageRamEnt hrStorageRam;

    public final HrStorageVirtualMemoryEnt hrStorageVirtualMemory;

    public final HrStorageFixedDiskEnt hrStorageFixedDisk;

    public final HrStorageRemovableDiskEnt hrStorageRemovableDisk;

    public final HrStorageFloppyDiskEnt hrStorageFloppyDisk;

    public final HrStorageCompactDiscEnt hrStorageCompactDisc;

    public final HrStorageRamDiskEnt hrStorageRamDisk;

    public final HrStorageFlashMemoryEnt hrStorageFlashMemory;

    public final HrStorageNetworkDiskEnt hrStorageNetworkDisk;

    public final HrDeviceOtherEnt hrDeviceOther;

    public final HrDeviceUnknownEnt hrDeviceUnknown;

    public final HrDeviceProcessorEnt hrDeviceProcessor;

    public final HrDeviceNetworkEnt hrDeviceNetwork;

    public final HrDevicePrinterEnt hrDevicePrinter;

    public final HrDeviceDiskStorageEnt hrDeviceDiskStorage;

    public final HrDeviceVideoEnt hrDeviceVideo;

    public final HrDeviceAudioEnt hrDeviceAudio;

    public final HrDeviceCoprocessorEnt hrDeviceCoprocessor;

    public final HrDeviceKeyboardEnt hrDeviceKeyboard;

    public final HrDeviceModemEnt hrDeviceModem;

    public final HrDeviceParallelPortEnt hrDeviceParallelPort;

    public final HrDevicePointingEnt hrDevicePointing;

    public final HrDeviceSerialPortEnt hrDeviceSerialPort;

    public final HrDeviceTapeEnt hrDeviceTape;

    public final HrDeviceClockEnt hrDeviceClock;

    public final HrDeviceVolatileMemoryEnt hrDeviceVolatileMemory;

    public final HrDeviceNonVolatileMemoryEnt hrDeviceNonVolatileMemory;

    public final HrFSOtherEnt hrFSOther;

    public final HrFSUnknownEnt hrFSUnknown;

    public final HrFSBerkeleyFFSEnt hrFSBerkeleyFFS;

    public final HrFSSys5FSEnt hrFSSys5FS;

    public final HrFSFatEnt hrFSFat;

    public final HrFSHPFSEnt hrFSHPFS;

    public final HrFSHFSEnt hrFSHFS;

    public final HrFSMFSEnt hrFSMFS;

    public final HrFSNTFSEnt hrFSNTFS;

    public final HrFSVNodeEnt hrFSVNode;

    public final HrFSJournaledEnt hrFSJournaled;

    public final HrFSiso9660Ent hrFSiso9660;

    public final HrFSRockRidgeEnt hrFSRockRidge;

    public final HrFSNFSEnt hrFSNFS;

    public final HrFSNetwareEnt hrFSNetware;

    public final HrFSAFSEnt hrFSAFS;

    public final HrFSDFSEnt hrFSDFS;

    public final HrFSAppleshareEnt hrFSAppleshare;

    public final HrFSRFSEnt hrFSRFS;

    public final HrFSDGCFSEnt hrFSDGCFS;

    public final HrFSBFSEnt hrFSBFS;

    public final HrFSFAT32Ent hrFSFAT32;

    public final HrFSLinuxExt2Ent hrFSLinuxExt2;

    private HOSTRESOURCESTYPESDef()
    {
        super("HOST-RESOURCES-TYPES");
        this.hostResourcesTypesModule = new HostResourcesTypesModuleEnt(this, null);
        this.host = new HostEnt(this, null);
        this.hrStorageOther = new HrStorageOtherEnt(this, null);
        this.hrStorageRam = new HrStorageRamEnt(this, null);
        this.hrStorageVirtualMemory = new HrStorageVirtualMemoryEnt(this, null);
        this.hrStorageFixedDisk = new HrStorageFixedDiskEnt(this, null);
        this.hrStorageRemovableDisk = new HrStorageRemovableDiskEnt(this, null);
        this.hrStorageFloppyDisk = new HrStorageFloppyDiskEnt(this, null);
        this.hrStorageCompactDisc = new HrStorageCompactDiscEnt(this, null);
        this.hrStorageRamDisk = new HrStorageRamDiskEnt(this, null);
        this.hrStorageFlashMemory = new HrStorageFlashMemoryEnt(this, null);
        this.hrStorageNetworkDisk = new HrStorageNetworkDiskEnt(this, null);
        this.hrDeviceOther = new HrDeviceOtherEnt(this, null);
        this.hrDeviceUnknown = new HrDeviceUnknownEnt(this, null);
        this.hrDeviceProcessor = new HrDeviceProcessorEnt(this, null);
        this.hrDeviceNetwork = new HrDeviceNetworkEnt(this, null);
        this.hrDevicePrinter = new HrDevicePrinterEnt(this, null);
        this.hrDeviceDiskStorage = new HrDeviceDiskStorageEnt(this, null);
        this.hrDeviceVideo = new HrDeviceVideoEnt(this, null);
        this.hrDeviceAudio = new HrDeviceAudioEnt(this, null);
        this.hrDeviceCoprocessor = new HrDeviceCoprocessorEnt(this, null);
        this.hrDeviceKeyboard = new HrDeviceKeyboardEnt(this, null);
        this.hrDeviceModem = new HrDeviceModemEnt(this, null);
        this.hrDeviceParallelPort = new HrDeviceParallelPortEnt(this, null);
        this.hrDevicePointing = new HrDevicePointingEnt(this, null);
        this.hrDeviceSerialPort = new HrDeviceSerialPortEnt(this, null);
        this.hrDeviceTape = new HrDeviceTapeEnt(this, null);
        this.hrDeviceClock = new HrDeviceClockEnt(this, null);
        this.hrDeviceVolatileMemory = new HrDeviceVolatileMemoryEnt(this, null);
        this.hrDeviceNonVolatileMemory = new HrDeviceNonVolatileMemoryEnt(this, null);
        this.hrFSOther = new HrFSOtherEnt(this, null);
        this.hrFSUnknown = new HrFSUnknownEnt(this, null);
        this.hrFSBerkeleyFFS = new HrFSBerkeleyFFSEnt(this, null);
        this.hrFSSys5FS = new HrFSSys5FSEnt(this, null);
        this.hrFSFat = new HrFSFatEnt(this, null);
        this.hrFSHPFS = new HrFSHPFSEnt(this, null);
        this.hrFSHFS = new HrFSHFSEnt(this, null);
        this.hrFSMFS = new HrFSMFSEnt(this, null);
        this.hrFSNTFS = new HrFSNTFSEnt(this, null);
        this.hrFSVNode = new HrFSVNodeEnt(this, null);
        this.hrFSJournaled = new HrFSJournaledEnt(this, null);
        this.hrFSiso9660 = new HrFSiso9660Ent(this, null);
        this.hrFSRockRidge = new HrFSRockRidgeEnt(this, null);
        this.hrFSNFS = new HrFSNFSEnt(this, null);
        this.hrFSNetware = new HrFSNetwareEnt(this, null);
        this.hrFSAFS = new HrFSAFSEnt(this, null);
        this.hrFSDFS = new HrFSDFSEnt(this, null);
        this.hrFSAppleshare = new HrFSAppleshareEnt(this, null);
        this.hrFSRFS = new HrFSRFSEnt(this, null);
        this.hrFSDGCFS = new HrFSDGCFSEnt(this, null);
        this.hrFSBFS = new HrFSBFSEnt(this, null);
        this.hrFSFAT32 = new HrFSFAT32Ent(this, null);
        this.hrFSLinuxExt2 = new HrFSLinuxExt2Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hostResourcesTypesModule,
            this.host,
            this.hrStorageOther,
            this.hrStorageRam,
            this.hrStorageVirtualMemory,
            this.hrStorageFixedDisk,
            this.hrStorageRemovableDisk,
            this.hrStorageFloppyDisk,
            this.hrStorageCompactDisc,
            this.hrStorageRamDisk,
            this.hrStorageFlashMemory,
            this.hrStorageNetworkDisk,
            this.hrDeviceOther,
            this.hrDeviceUnknown,
            this.hrDeviceProcessor,
            this.hrDeviceNetwork,
            this.hrDevicePrinter,
            this.hrDeviceDiskStorage,
            this.hrDeviceVideo,
            this.hrDeviceAudio,
            this.hrDeviceCoprocessor,
            this.hrDeviceKeyboard,
            this.hrDeviceModem,
            this.hrDeviceParallelPort,
            this.hrDevicePointing,
            this.hrDeviceSerialPort,
            this.hrDeviceTape,
            this.hrDeviceClock,
            this.hrDeviceVolatileMemory,
            this.hrDeviceNonVolatileMemory,
            this.hrFSOther,
            this.hrFSUnknown,
            this.hrFSBerkeleyFFS,
            this.hrFSSys5FS,
            this.hrFSFat,
            this.hrFSHPFS,
            this.hrFSHFS,
            this.hrFSMFS,
            this.hrFSNTFS,
            this.hrFSVNode,
            this.hrFSJournaled,
            this.hrFSiso9660,
            this.hrFSRockRidge,
            this.hrFSNFS,
            this.hrFSNetware,
            this.hrFSAFS,
            this.hrFSDFS,
            this.hrFSAppleshare,
            this.hrFSRFS,
            this.hrFSDGCFS,
            this.hrFSBFS,
            this.hrFSFAT32,
            this.hrFSLinuxExt2
        };
    }

    public static final class HostResourcesTypesModuleEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HostResourcesTypesModuleEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hostResourcesTypesModule", "1.3.6.1.2.1.25.7.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HostEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        public final HrStorageEnt hrStorage;

        public final HrDeviceEnt hrDevice;

        private HostEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "host", "1.3.6.1.2.1.25", false, false, false, false);
            this.hrStorage = new HrStorageEnt(mib, this);
            this.hrDevice = new HrDeviceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hrStorage,
                this.hrDevice
            };
        }
        public static final class HrStorageEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
        {
            /** The Host Resources Storage Group
Registration point for storage types, for use with hrStorageType.These are defined in the HOST-RESOURCES-TYPES module.*/
            public final HrStorageTypesEnt hrStorageTypes;

            private HrStorageEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
            {
                super(mib, parent, "hrStorage", "1.3.6.1.2.1.25.2", false, false, false, false);
                this.hrStorageTypes = new HrStorageTypesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrStorageTypes
                };
            }
            public static final class HrStorageTypesEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
            {
                private HrStorageTypesEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
                {
                    super(mib, parent, "hrStorageTypes", "1.3.6.1.2.1.25.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class HrDeviceEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
        {
            /** The Host Resources Device GroupThe device group is useful for identifying and diagnosing thedevices on a system.  The hrDeviceTable contains commoninformation for any type of device.  In addition, some deviceshave device-specific tables for more detailed information.  Moresuch tables may be defined in the future for other device types.
Registration point for device types, for use with hrDeviceType.
These are defined in the HOST-RESOURCES-TYPES module.*/
            public final HrDeviceTypesEnt hrDeviceTypes;

            /** The File System Table
Registration point for popular File System types,for use with hrFSType. These are defined in theHOST-RESOURCES-TYPES module.*/
            public final HrFSTypesEnt hrFSTypes;

            private HrDeviceEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
            {
                super(mib, parent, "hrDevice", "1.3.6.1.2.1.25.3", false, false, false, false);
                this.hrDeviceTypes = new HrDeviceTypesEnt(mib, this);
                this.hrFSTypes = new HrFSTypesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrDeviceTypes,
                    this.hrFSTypes
                };
            }
            public static final class HrDeviceTypesEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
            {
                private HrDeviceTypesEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
                {
                    super(mib, parent, "hrDeviceTypes", "1.3.6.1.2.1.25.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrFSTypesEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
            {
                private HrFSTypesEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
                {
                    super(mib, parent, "hrFSTypes", "1.3.6.1.2.1.25.3.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HrStorageOtherEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageOtherEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageOther", "1.3.6.1.2.1.25.2.1.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageRamEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageRamEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageRam", "1.3.6.1.2.1.25.2.1.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageVirtualMemoryEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageVirtualMemoryEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageVirtualMemory", "1.3.6.1.2.1.25.2.1.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageFixedDiskEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageFixedDiskEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageFixedDisk", "1.3.6.1.2.1.25.2.1.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageRemovableDiskEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageRemovableDiskEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageRemovableDisk", "1.3.6.1.2.1.25.2.1.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageFloppyDiskEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageFloppyDiskEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageFloppyDisk", "1.3.6.1.2.1.25.2.1.6", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageCompactDiscEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageCompactDiscEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageCompactDisc", "1.3.6.1.2.1.25.2.1.7", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageRamDiskEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageRamDiskEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageRamDisk", "1.3.6.1.2.1.25.2.1.8", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageFlashMemoryEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageFlashMemoryEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageFlashMemory", "1.3.6.1.2.1.25.2.1.9", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrStorageNetworkDiskEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrStorageNetworkDiskEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrStorageNetworkDisk", "1.3.6.1.2.1.25.2.1.10", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceOtherEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceOtherEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceOther", "1.3.6.1.2.1.25.3.1.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceUnknownEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceUnknownEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceUnknown", "1.3.6.1.2.1.25.3.1.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceProcessorEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceProcessorEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceProcessor", "1.3.6.1.2.1.25.3.1.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceNetworkEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceNetworkEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceNetwork", "1.3.6.1.2.1.25.3.1.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDevicePrinterEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDevicePrinterEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDevicePrinter", "1.3.6.1.2.1.25.3.1.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceDiskStorageEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceDiskStorageEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceDiskStorage", "1.3.6.1.2.1.25.3.1.6", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceVideoEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceVideoEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceVideo", "1.3.6.1.2.1.25.3.1.10", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceAudioEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceAudioEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceAudio", "1.3.6.1.2.1.25.3.1.11", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceCoprocessorEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceCoprocessorEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceCoprocessor", "1.3.6.1.2.1.25.3.1.12", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceKeyboardEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceKeyboardEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceKeyboard", "1.3.6.1.2.1.25.3.1.13", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceModemEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceModemEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceModem", "1.3.6.1.2.1.25.3.1.14", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceParallelPortEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceParallelPortEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceParallelPort", "1.3.6.1.2.1.25.3.1.15", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDevicePointingEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDevicePointingEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDevicePointing", "1.3.6.1.2.1.25.3.1.16", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceSerialPortEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceSerialPortEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceSerialPort", "1.3.6.1.2.1.25.3.1.17", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceTapeEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceTapeEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceTape", "1.3.6.1.2.1.25.3.1.18", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceClockEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceClockEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceClock", "1.3.6.1.2.1.25.3.1.19", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceVolatileMemoryEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceVolatileMemoryEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceVolatileMemory", "1.3.6.1.2.1.25.3.1.20", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrDeviceNonVolatileMemoryEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrDeviceNonVolatileMemoryEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrDeviceNonVolatileMemory", "1.3.6.1.2.1.25.3.1.21", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSOtherEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSOtherEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSOther", "1.3.6.1.2.1.25.3.9.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSUnknownEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSUnknownEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSUnknown", "1.3.6.1.2.1.25.3.9.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSBerkeleyFFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSBerkeleyFFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSBerkeleyFFS", "1.3.6.1.2.1.25.3.9.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSSys5FSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSSys5FSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSSys5FS", "1.3.6.1.2.1.25.3.9.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSFatEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSFatEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSFat", "1.3.6.1.2.1.25.3.9.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSHPFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSHPFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSHPFS", "1.3.6.1.2.1.25.3.9.6", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSHFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSHFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSHFS", "1.3.6.1.2.1.25.3.9.7", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSMFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSMFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSMFS", "1.3.6.1.2.1.25.3.9.8", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSNTFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSNTFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSNTFS", "1.3.6.1.2.1.25.3.9.9", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSVNodeEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSVNodeEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSVNode", "1.3.6.1.2.1.25.3.9.10", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSJournaledEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSJournaledEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSJournaled", "1.3.6.1.2.1.25.3.9.11", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSiso9660Ent extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSiso9660Ent(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSiso9660", "1.3.6.1.2.1.25.3.9.12", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSRockRidgeEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSRockRidgeEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSRockRidge", "1.3.6.1.2.1.25.3.9.13", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSNFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSNFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSNFS", "1.3.6.1.2.1.25.3.9.14", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSNetwareEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSNetwareEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSNetware", "1.3.6.1.2.1.25.3.9.15", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSAFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSAFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSAFS", "1.3.6.1.2.1.25.3.9.16", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSDFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSDFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSDFS", "1.3.6.1.2.1.25.3.9.17", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSAppleshareEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSAppleshareEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSAppleshare", "1.3.6.1.2.1.25.3.9.18", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSRFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSRFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSRFS", "1.3.6.1.2.1.25.3.9.19", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSDGCFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSDGCFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSDGCFS", "1.3.6.1.2.1.25.3.9.20", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSBFSEnt extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSBFSEnt(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSBFS", "1.3.6.1.2.1.25.3.9.21", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSFAT32Ent extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSFAT32Ent(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSFAT32", "1.3.6.1.2.1.25.3.9.22", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HrFSLinuxExt2Ent extends MIBEntry<HOSTRESOURCESTYPESDef>
    {
        private HrFSLinuxExt2Ent(HOSTRESOURCESTYPESDef mib, MIBEntry<HOSTRESOURCESTYPESDef> parent)
        {
            super(mib, parent, "hrFSLinuxExt2", "1.3.6.1.2.1.25.3.9.23", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
