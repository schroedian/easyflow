[section:cmd]
#bin	sub	FormatIn	ArgumentNames	FormatOut ArgumentNames	Sep
bwa	aln	FASTQ		SAI		stdOut
bwa	sampe	FASTA,SAI,SAI,FASTQ,FASTQ	SAM		stdOut
bwa	same	FASTA,SAI,FASTQ		SAM		stdOut
gatk	GenomeAnalysisTK	FASTA,BAM,VCF,IntervalList -R,-I,-V,-L	 	BAM,VCF	-o,
picard	MarkDuplicates	BAM	I	BAM	O	=
samtools	index	BAM
samtools	faidx	FASTA
samtools	sort	BAM
samtools	view	SAM|BAM
[section:tools]
#tool	type
bwa	bin
gatk	jar
picard	jar
samtools	bin
