#0	1	2	3
#task	bin	sub_cmd	cmd_static
MapReads1	bwa	aln
MapReads2	bwa	sampe
AddReadGroup	myg	
SortAlignment	samtools	sort -m 2G
CreateRealignTargets	gatk	RealignerTargetCreator		-interval_list <RealignIntervalsFile>
LocalRealign	gatk	LocalRealigner		-interval_list <RealignIntervalsFile>
RemoveDuplicates	picard	MarkDuplicates 	-metricsFile <MetricsFile>
CountCovariate	gatk	CountCovariates -cov Dinuc -cov Cycle -cov Baseposition
RecalibrateBaseQualityScore	gatk	TableRecalibration
DetectVariants	gatk	UnifiedGenotyper -emitConf 10 -standConf 20	-metricsFile <UGMetricsFile>
AnnotateVariants	gatk	VariantAnnotator
FilterVariants	gatk	VariantFiltration
GenomicAnnotator	gatk	SnpEff
IndexFasta	samtools	faidx
BwtFasta	bwa	index
DictFasta	gatk	CreateDict
IndexAlignment	samtools	index
