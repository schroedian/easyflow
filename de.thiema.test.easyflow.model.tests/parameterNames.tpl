#bin	sub	FormatIn	ArgumentNames	FormatOut ArgumentNames	Attributes
bwa	aln	FASTQ		SAI		stdOut
bwa	sampe	FASTA,SAI,SAI,FASTQ,FASTQ	SAM		stdOut
bwa	same	FASTA,SAI,FASTQ		SAM		stdOut
gatk	GenomeAnalysisTK	FASTA,BAM,VCF,IntervalList -R,-I,-V,-L	BAM,VCF	-o
picard	
samtools	index
samtools	faidx
samtools	sort
samtools	view