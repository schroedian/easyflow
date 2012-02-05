#0	1	2	3	4	5	6	7	8	9	10	11	12	13
#task	parent	implementation	#threads	mem	formatIn	formatOut	dataCriterion	traversalCriterion	cardIn	cardOut	multiInstance	Split
IndexFasta	Root	samtools	single	medium	FASTA	FAI	None	None	1	1	N	None
BwtFasta	Root	bwa	single	medium	FASTA	BWT	None	None	1	1	N	None
DictFasta	Root	gatk	single	medium	FASTA	DICT	None	None	1	1	N	None
MapReads1	IndexFasta,BwtFasta	bwa	multi	low	FASTQ	SAI	ReadGroup	Read	1	1	N	ByRead
MapReads2	MapReads1	bwa	single	low	FASTQ	SAM	ReadGroup	Read	2	1	N	ByRead
AddReadGroup		custom	single	low	SAM	BAM	ReadGroup	Read	1	n	N	ByRead
SortAlignment		samtools	single	low	BAM	BAM	ReadGroup	Read	1	1	Y	ByRead
IndexAlignment	SortAlignment	samtools	single	low	BAM	BAI	None	None	1	1	N	None
CreateRealignTargets	IndexAlignment,DictFasta	gatk	single	low	BAM	IntervalList	Sample	Locus	n	1	Y	ByLocus
LocalRealign		gatk	single	low	BAM,IntervalList	BAM	Sample	Locus	n	1	Y	ByLocus
RemoveDuplicates		picard	single	low	BAM	BAM	Library	Locus	1	1	Y	ByLibrary
CountCovariate		gatk	multi	low	BAM	None	ReadGroup	Locus	n	1	Y	ByReadGroup
RecalibrateBaseQualityScore		gatk	single	low	BAM	BAM	Sample	Locus	n	1	Y	ByLocus,ByReadGroup,BySample
CountCovariate		gatk	multi	low	BAM	None	ReadGroup	Locus	n	1	Y	ByReadGroup
DetectVariants		gatk	multi	low	BAM	VCF	Sample	Locus	n	1	Y	ByLocus
AnnotateVariants		gatk	single	low	BAM,VCF	VCF	Sample	Locus	n	1	Y	ByLocus
FilterVariants		gatk	single	low	VCF	VCF	Sample	Locus	n	1	Y	ByLocus
GenomicAnnotateVariants		gatk	single	low	VCF	VCF	Sample	Locus	n	1	Y	ByLocus
