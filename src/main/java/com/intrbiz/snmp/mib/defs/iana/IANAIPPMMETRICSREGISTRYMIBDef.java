package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;

public final class IANAIPPMMETRICSREGISTRYMIBDef extends MIB
{
    public static final IANAIPPMMETRICSREGISTRYMIBDef IANAIPPMMETRICSREGISTRYMIB = new IANAIPPMMETRICSREGISTRYMIBDef();

    /** December 04, 2006*/
    public final IanaIppmMetricsRegistryEnt ianaIppmMetricsRegistry;

    private IANAIPPMMETRICSREGISTRYMIBDef()
    {
        super("IANA-IPPM-METRICS-REGISTRY-MIB");
        this.ianaIppmMetricsRegistry = new IanaIppmMetricsRegistryEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaIppmMetricsRegistry
        };
    }

    public static final class IanaIppmMetricsRegistryEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
    {
        public final IanaIppmMetricsEnt ianaIppmMetrics;

        private IanaIppmMetricsRegistryEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
        {
            super(mib, parent, "ianaIppmMetricsRegistry", "1.3.6.1.2.1.128", false, false, false, false);
            this.ianaIppmMetrics = new IanaIppmMetricsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ianaIppmMetrics
            };
        }
        public static final class IanaIppmMetricsEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
        {
            /** Registry of the metrics of the IPPM WG RFCs



RFC 2678 " IPPM Metrics for Measuring Connectivity"*/
            public final IetfInstantUnidirConnectivityEnt ietfInstantUnidirConnectivity;

            public final IetfInstantBidirConnectivityEnt ietfInstantBidirConnectivity;

            public final IetfIntervalUnidirConnectivityEnt ietfIntervalUnidirConnectivity;

            public final IetfIntervalBidirConnectivityEnt ietfIntervalBidirConnectivity;

            public final IetfIntervalTemporalConnectivityEnt ietfIntervalTemporalConnectivity;

            /** RFC 2679 "A One-way Delay Metric for IPPM"*/
            public final IetfOneWayDelayEnt ietfOneWayDelay;

            public final IetfOneWayDelayPoissonStreamEnt ietfOneWayDelayPoissonStream;

            public final IetfOneWayDelayPercentileEnt ietfOneWayDelayPercentile;

            public final IetfOneWayDelayMedianEnt ietfOneWayDelayMedian;

            public final IetfOneWayDelayMinimumEnt ietfOneWayDelayMinimum;

            public final IetfOneWayDelayInversePercentileEnt ietfOneWayDelayInversePercentile;

            /** RFC 2680  "One Way Packet Loss Metric for IPPM"*/
            public final IetfOneWayPktLossEnt ietfOneWayPktLoss;

            public final IetfOneWayPktLossPoissonStreamEnt ietfOneWayPktLossPoissonStream;

            public final IetfOneWayPktLossAverageEnt ietfOneWayPktLossAverage;

            /** RFC2681 "A Round-trip Delay Metric for IPPM"*/
            public final IetfRoundTripDelayEnt ietfRoundTripDelay;

            public final IetfRoundTripDelayPoissonStreamEnt ietfRoundTripDelayPoissonStream;

            public final IetfRoundTripDelayPercentileEnt ietfRoundTripDelayPercentile;

            public final IetfRoundTripDelayMedianEnt ietfRoundTripDelayMedian;

            public final IetfRoundTripDelayMinimumEnt ietfRoundTripDelayMinimum;

            public final IetfRoundTripDelayInvPercentileEnt ietfRoundTripDelayInvPercentile;

            /** RFC3357: "One-way Loss Pattern Sample Metrics"*/
            public final IetfOneWayLossDistanceStreamEnt ietfOneWayLossDistanceStream;

            public final IetfOneWayLossPeriodStreamEnt ietfOneWayLossPeriodStream;

            public final IetfOneWayLossNoticeableRateEnt ietfOneWayLossNoticeableRate;

            public final IetfOneWayLossPeriodTotalEnt ietfOneWayLossPeriodTotal;

            public final IetfOneWayLossPeriodLengthsEnt ietfOneWayLossPeriodLengths;

            public final IetfOneWayInterLossPeriodLengthsEnt ietfOneWayInterLossPeriodLengths;

            /** RFC3393:
IP Packet Delay Variation Metric for IP Performance Metrics (IPPM)*/
            public final IetfOneWayIpdvEnt ietfOneWayIpdv;

            public final IetfOneWayIpdvPoissonStreamEnt ietfOneWayIpdvPoissonStream;

            public final IetfOneWayIpdvPercentileEnt ietfOneWayIpdvPercentile;

            public final IetfOneWayIpdvInversePercentileEnt ietfOneWayIpdvInversePercentile;

            public final IetfOneWayIpdvJitterEnt ietfOneWayIpdvJitter;

            public final IetfOneWayPeakToPeakIpdvEnt ietfOneWayPeakToPeakIpdv;

            /** RFC3432: "Network performance measurement with periodic streams"*/
            public final IetfOneWayDelayPeriodicStreamEnt ietfOneWayDelayPeriodicStream;

            /** RFC4737 "Packet Reordering Metric for IPPM"*/
            public final IetfReorderedSingletonEnt ietfReorderedSingleton;

            public final IetfReorderedPacketRatioEnt ietfReorderedPacketRatio;

            public final IetfReorderingExtentEnt ietfReorderingExtent;

            public final IetfReorderingLateTimeOffsetEnt ietfReorderingLateTimeOffset;

            public final IetfReorderingByteOffsetEnt ietfReorderingByteOffset;

            public final IetfReorderingGapEnt ietfReorderingGap;

            public final IetfReorderingGapTimeEnt ietfReorderingGapTime;

            public final IetfReorderingFreeRunxEnt ietfReorderingFreeRunx;

            public final IetfReorderingFreeRunqEnt ietfReorderingFreeRunq;

            public final IetfReorderingFreeRunpEnt ietfReorderingFreeRunp;

            public final IetfReorderingFreeRunaEnt ietfReorderingFreeRuna;

            public final IetfnReorderingEnt ietfnReordering;

            private IanaIppmMetricsEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
            {
                super(mib, parent, "ianaIppmMetrics", "1.3.6.1.2.1.128.1", false, false, false, false);
                this.ietfInstantUnidirConnectivity = new IetfInstantUnidirConnectivityEnt(mib, this);
                this.ietfInstantBidirConnectivity = new IetfInstantBidirConnectivityEnt(mib, this);
                this.ietfIntervalUnidirConnectivity = new IetfIntervalUnidirConnectivityEnt(mib, this);
                this.ietfIntervalBidirConnectivity = new IetfIntervalBidirConnectivityEnt(mib, this);
                this.ietfIntervalTemporalConnectivity = new IetfIntervalTemporalConnectivityEnt(mib, this);
                this.ietfOneWayDelay = new IetfOneWayDelayEnt(mib, this);
                this.ietfOneWayDelayPoissonStream = new IetfOneWayDelayPoissonStreamEnt(mib, this);
                this.ietfOneWayDelayPercentile = new IetfOneWayDelayPercentileEnt(mib, this);
                this.ietfOneWayDelayMedian = new IetfOneWayDelayMedianEnt(mib, this);
                this.ietfOneWayDelayMinimum = new IetfOneWayDelayMinimumEnt(mib, this);
                this.ietfOneWayDelayInversePercentile = new IetfOneWayDelayInversePercentileEnt(mib, this);
                this.ietfOneWayPktLoss = new IetfOneWayPktLossEnt(mib, this);
                this.ietfOneWayPktLossPoissonStream = new IetfOneWayPktLossPoissonStreamEnt(mib, this);
                this.ietfOneWayPktLossAverage = new IetfOneWayPktLossAverageEnt(mib, this);
                this.ietfRoundTripDelay = new IetfRoundTripDelayEnt(mib, this);
                this.ietfRoundTripDelayPoissonStream = new IetfRoundTripDelayPoissonStreamEnt(mib, this);
                this.ietfRoundTripDelayPercentile = new IetfRoundTripDelayPercentileEnt(mib, this);
                this.ietfRoundTripDelayMedian = new IetfRoundTripDelayMedianEnt(mib, this);
                this.ietfRoundTripDelayMinimum = new IetfRoundTripDelayMinimumEnt(mib, this);
                this.ietfRoundTripDelayInvPercentile = new IetfRoundTripDelayInvPercentileEnt(mib, this);
                this.ietfOneWayLossDistanceStream = new IetfOneWayLossDistanceStreamEnt(mib, this);
                this.ietfOneWayLossPeriodStream = new IetfOneWayLossPeriodStreamEnt(mib, this);
                this.ietfOneWayLossNoticeableRate = new IetfOneWayLossNoticeableRateEnt(mib, this);
                this.ietfOneWayLossPeriodTotal = new IetfOneWayLossPeriodTotalEnt(mib, this);
                this.ietfOneWayLossPeriodLengths = new IetfOneWayLossPeriodLengthsEnt(mib, this);
                this.ietfOneWayInterLossPeriodLengths = new IetfOneWayInterLossPeriodLengthsEnt(mib, this);
                this.ietfOneWayIpdv = new IetfOneWayIpdvEnt(mib, this);
                this.ietfOneWayIpdvPoissonStream = new IetfOneWayIpdvPoissonStreamEnt(mib, this);
                this.ietfOneWayIpdvPercentile = new IetfOneWayIpdvPercentileEnt(mib, this);
                this.ietfOneWayIpdvInversePercentile = new IetfOneWayIpdvInversePercentileEnt(mib, this);
                this.ietfOneWayIpdvJitter = new IetfOneWayIpdvJitterEnt(mib, this);
                this.ietfOneWayPeakToPeakIpdv = new IetfOneWayPeakToPeakIpdvEnt(mib, this);
                this.ietfOneWayDelayPeriodicStream = new IetfOneWayDelayPeriodicStreamEnt(mib, this);
                this.ietfReorderedSingleton = new IetfReorderedSingletonEnt(mib, this);
                this.ietfReorderedPacketRatio = new IetfReorderedPacketRatioEnt(mib, this);
                this.ietfReorderingExtent = new IetfReorderingExtentEnt(mib, this);
                this.ietfReorderingLateTimeOffset = new IetfReorderingLateTimeOffsetEnt(mib, this);
                this.ietfReorderingByteOffset = new IetfReorderingByteOffsetEnt(mib, this);
                this.ietfReorderingGap = new IetfReorderingGapEnt(mib, this);
                this.ietfReorderingGapTime = new IetfReorderingGapTimeEnt(mib, this);
                this.ietfReorderingFreeRunx = new IetfReorderingFreeRunxEnt(mib, this);
                this.ietfReorderingFreeRunq = new IetfReorderingFreeRunqEnt(mib, this);
                this.ietfReorderingFreeRunp = new IetfReorderingFreeRunpEnt(mib, this);
                this.ietfReorderingFreeRuna = new IetfReorderingFreeRunaEnt(mib, this);
                this.ietfnReordering = new IetfnReorderingEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ietfInstantUnidirConnectivity,
                    this.ietfInstantBidirConnectivity,
                    this.ietfIntervalUnidirConnectivity,
                    this.ietfIntervalBidirConnectivity,
                    this.ietfIntervalTemporalConnectivity,
                    this.ietfOneWayDelay,
                    this.ietfOneWayDelayPoissonStream,
                    this.ietfOneWayDelayPercentile,
                    this.ietfOneWayDelayMedian,
                    this.ietfOneWayDelayMinimum,
                    this.ietfOneWayDelayInversePercentile,
                    this.ietfOneWayPktLoss,
                    this.ietfOneWayPktLossPoissonStream,
                    this.ietfOneWayPktLossAverage,
                    this.ietfRoundTripDelay,
                    this.ietfRoundTripDelayPoissonStream,
                    this.ietfRoundTripDelayPercentile,
                    this.ietfRoundTripDelayMedian,
                    this.ietfRoundTripDelayMinimum,
                    this.ietfRoundTripDelayInvPercentile,
                    this.ietfOneWayLossDistanceStream,
                    this.ietfOneWayLossPeriodStream,
                    this.ietfOneWayLossNoticeableRate,
                    this.ietfOneWayLossPeriodTotal,
                    this.ietfOneWayLossPeriodLengths,
                    this.ietfOneWayInterLossPeriodLengths,
                    this.ietfOneWayIpdv,
                    this.ietfOneWayIpdvPoissonStream,
                    this.ietfOneWayIpdvPercentile,
                    this.ietfOneWayIpdvInversePercentile,
                    this.ietfOneWayIpdvJitter,
                    this.ietfOneWayPeakToPeakIpdv,
                    this.ietfOneWayDelayPeriodicStream,
                    this.ietfReorderedSingleton,
                    this.ietfReorderedPacketRatio,
                    this.ietfReorderingExtent,
                    this.ietfReorderingLateTimeOffset,
                    this.ietfReorderingByteOffset,
                    this.ietfReorderingGap,
                    this.ietfReorderingGapTime,
                    this.ietfReorderingFreeRunx,
                    this.ietfReorderingFreeRunq,
                    this.ietfReorderingFreeRunp,
                    this.ietfReorderingFreeRuna,
                    this.ietfnReordering
                };
            }
            public static final class IetfInstantUnidirConnectivityEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfInstantUnidirConnectivityEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfInstantUnidirConnectivity", "1.3.6.1.2.1.128.1.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfInstantBidirConnectivityEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfInstantBidirConnectivityEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfInstantBidirConnectivity", "1.3.6.1.2.1.128.1.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfIntervalUnidirConnectivityEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfIntervalUnidirConnectivityEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfIntervalUnidirConnectivity", "1.3.6.1.2.1.128.1.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfIntervalBidirConnectivityEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfIntervalBidirConnectivityEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfIntervalBidirConnectivity", "1.3.6.1.2.1.128.1.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfIntervalTemporalConnectivityEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfIntervalTemporalConnectivityEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfIntervalTemporalConnectivity", "1.3.6.1.2.1.128.1.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelay", "1.3.6.1.2.1.128.1.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayPoissonStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayPoissonStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelayPoissonStream", "1.3.6.1.2.1.128.1.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayPercentileEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayPercentileEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelayPercentile", "1.3.6.1.2.1.128.1.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayMedianEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayMedianEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelayMedian", "1.3.6.1.2.1.128.1.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayMinimumEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayMinimumEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelayMinimum", "1.3.6.1.2.1.128.1.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayInversePercentileEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayInversePercentileEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelayInversePercentile", "1.3.6.1.2.1.128.1.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayPktLossEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayPktLossEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayPktLoss", "1.3.6.1.2.1.128.1.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayPktLossPoissonStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayPktLossPoissonStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayPktLossPoissonStream", "1.3.6.1.2.1.128.1.13", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayPktLossAverageEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayPktLossAverageEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayPktLossAverage", "1.3.6.1.2.1.128.1.14", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfRoundTripDelayEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfRoundTripDelayEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfRoundTripDelay", "1.3.6.1.2.1.128.1.15", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfRoundTripDelayPoissonStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfRoundTripDelayPoissonStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfRoundTripDelayPoissonStream", "1.3.6.1.2.1.128.1.16", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfRoundTripDelayPercentileEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfRoundTripDelayPercentileEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfRoundTripDelayPercentile", "1.3.6.1.2.1.128.1.17", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfRoundTripDelayMedianEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfRoundTripDelayMedianEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfRoundTripDelayMedian", "1.3.6.1.2.1.128.1.18", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfRoundTripDelayMinimumEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfRoundTripDelayMinimumEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfRoundTripDelayMinimum", "1.3.6.1.2.1.128.1.19", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfRoundTripDelayInvPercentileEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfRoundTripDelayInvPercentileEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfRoundTripDelayInvPercentile", "1.3.6.1.2.1.128.1.20", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayLossDistanceStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayLossDistanceStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayLossDistanceStream", "1.3.6.1.2.1.128.1.21", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayLossPeriodStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayLossPeriodStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayLossPeriodStream", "1.3.6.1.2.1.128.1.22", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayLossNoticeableRateEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayLossNoticeableRateEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayLossNoticeableRate", "1.3.6.1.2.1.128.1.23", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayLossPeriodTotalEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayLossPeriodTotalEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayLossPeriodTotal", "1.3.6.1.2.1.128.1.24", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayLossPeriodLengthsEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayLossPeriodLengthsEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayLossPeriodLengths", "1.3.6.1.2.1.128.1.25", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayInterLossPeriodLengthsEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayInterLossPeriodLengthsEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayInterLossPeriodLengths", "1.3.6.1.2.1.128.1.26", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayIpdvEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayIpdvEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayIpdv", "1.3.6.1.2.1.128.1.27", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayIpdvPoissonStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayIpdvPoissonStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayIpdvPoissonStream", "1.3.6.1.2.1.128.1.28", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayIpdvPercentileEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayIpdvPercentileEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayIpdvPercentile", "1.3.6.1.2.1.128.1.29", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayIpdvInversePercentileEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayIpdvInversePercentileEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayIpdvInversePercentile", "1.3.6.1.2.1.128.1.30", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayIpdvJitterEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayIpdvJitterEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayIpdvJitter", "1.3.6.1.2.1.128.1.31", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayPeakToPeakIpdvEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayPeakToPeakIpdvEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayPeakToPeakIpdv", "1.3.6.1.2.1.128.1.32", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfOneWayDelayPeriodicStreamEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfOneWayDelayPeriodicStreamEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfOneWayDelayPeriodicStream", "1.3.6.1.2.1.128.1.33", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderedSingletonEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderedSingletonEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderedSingleton", "1.3.6.1.2.1.128.1.34", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderedPacketRatioEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderedPacketRatioEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderedPacketRatio", "1.3.6.1.2.1.128.1.35", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingExtentEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingExtentEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingExtent", "1.3.6.1.2.1.128.1.36", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingLateTimeOffsetEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingLateTimeOffsetEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingLateTimeOffset", "1.3.6.1.2.1.128.1.37", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingByteOffsetEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingByteOffsetEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingByteOffset", "1.3.6.1.2.1.128.1.38", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingGapEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingGapEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingGap", "1.3.6.1.2.1.128.1.39", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingGapTimeEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingGapTimeEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingGapTime", "1.3.6.1.2.1.128.1.40", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingFreeRunxEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingFreeRunxEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingFreeRunx", "1.3.6.1.2.1.128.1.41", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingFreeRunqEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingFreeRunqEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingFreeRunq", "1.3.6.1.2.1.128.1.42", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingFreeRunpEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingFreeRunpEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingFreeRunp", "1.3.6.1.2.1.128.1.43", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfReorderingFreeRunaEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfReorderingFreeRunaEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfReorderingFreeRuna", "1.3.6.1.2.1.128.1.44", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IetfnReorderingEnt extends MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef>
            {
                private IetfnReorderingEnt(IANAIPPMMETRICSREGISTRYMIBDef mib, MIBEntry<IANAIPPMMETRICSREGISTRYMIBDef> parent)
                {
                    super(mib, parent, "ietfnReordering", "1.3.6.1.2.1.128.1.45", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
