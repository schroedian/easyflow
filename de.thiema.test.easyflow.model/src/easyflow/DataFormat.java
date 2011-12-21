/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see easyflow.EasyflowPackage#getDataFormat()
 * @model
 * @generated
 */
public enum DataFormat implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(14, "None", "None"), /**
	 * The '<em><b>FASTQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTQ_VALUE
	 * @generated
	 * @ordered
	 */
	FASTQ(0, "FASTQ", "FASTQ"), /**
	 * The '<em><b>SAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAM_VALUE
	 * @generated
	 * @ordered
	 */
	SAM(1, "SAM", "SAM"),

	/**
	 * The '<em><b>BAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAM_VALUE
	 * @generated
	 * @ordered
	 */
	BAM(2, "BAM", "BAM"),

	/**
	 * The '<em><b>VCF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCF_VALUE
	 * @generated
	 * @ordered
	 */
	VCF(3, "VCF", "VCF"),

	/**
	 * The '<em><b>BCF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCF_VALUE
	 * @generated
	 * @ordered
	 */
	BCF(4, "BCF", "BCF"),

	/**
	 * The '<em><b>TXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TXT_VALUE
	 * @generated
	 * @ordered
	 */
	TXT(5, "TXT", "TXT"),

	/**
	 * The '<em><b>CSV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV_VALUE
	 * @generated
	 * @ordered
	 */
	CSV(6, "CSV", "CSV"), /**
	 * The '<em><b>BAI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAI_VALUE
	 * @generated
	 * @ordered
	 */
	BAI(7, "BAI", "BAI"), /**
	 * The '<em><b>SAI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAI_VALUE
	 * @generated
	 * @ordered
	 */
	SAI(8, "SAI", "SAI"), /**
	 * The '<em><b>VCF IDX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCF_IDX_VALUE
	 * @generated
	 * @ordered
	 */
	VCF_IDX(9, "VCF_IDX", "VCF_IDX"), /**
	 * The '<em><b>FASTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTA_VALUE
	 * @generated
	 * @ordered
	 */
	FASTA(10, "FASTA", "FASTA"), /**
	 * The '<em><b>BWT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BWT_VALUE
	 * @generated
	 * @ordered
	 */
	BWT(11, "BWT", "BWT"), /**
	 * The '<em><b>DICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICT_VALUE
	 * @generated
	 * @ordered
	 */
	DICT(12, "DICT", "DICT"), /**
	 * The '<em><b>FAI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAI_VALUE
	 * @generated
	 * @ordered
	 */
	FAI(13, "FAI", "FAI"), /**
	 * The '<em><b>Interval List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_LIST(15, "IntervalList", "IntervalList");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 14;

	/**
	 * The '<em><b>FASTQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FASTQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FASTQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FASTQ_VALUE = 0;

	/**
	 * The '<em><b>SAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAM_VALUE = 1;

	/**
	 * The '<em><b>BAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAM_VALUE = 2;

	/**
	 * The '<em><b>VCF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vcf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VCF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VCF_VALUE = 3;

	/**
	 * The '<em><b>BCF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bcf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BCF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BCF_VALUE = 4;

	/**
	 * The '<em><b>TXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Txt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TXT_VALUE = 5;

	/**
	 * The '<em><b>CSV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Csv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSV_VALUE = 6;

	/**
	 * The '<em><b>BAI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAI_VALUE = 7;

	/**
	 * The '<em><b>SAI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAI_VALUE = 8;

	/**
	 * The '<em><b>VCF IDX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VCF IDX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VCF_IDX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VCF_IDX_VALUE = 9;

	/**
	 * The '<em><b>FASTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FASTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FASTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FASTA_VALUE = 10;

	/**
	 * The '<em><b>BWT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BWT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BWT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BWT_VALUE = 11;

	/**
	 * The '<em><b>DICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DICT_VALUE = 12;

	/**
	 * The '<em><b>FAI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAI_VALUE = 13;

	/**
	 * The '<em><b>Interval List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interval List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_LIST
	 * @model name="IntervalList"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_LIST_VALUE = 15;

	/**
	 * An array of all the '<em><b>Data Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataFormat[] VALUES_ARRAY =
		new DataFormat[] {
			NONE,
			FASTQ,
			SAM,
			BAM,
			VCF,
			BCF,
			TXT,
			CSV,
			BAI,
			SAI,
			VCF_IDX,
			FASTA,
			BWT,
			DICT,
			FAI,
			INTERVAL_LIST,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFormat get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case FASTQ_VALUE: return FASTQ;
			case SAM_VALUE: return SAM;
			case BAM_VALUE: return BAM;
			case VCF_VALUE: return VCF;
			case BCF_VALUE: return BCF;
			case TXT_VALUE: return TXT;
			case CSV_VALUE: return CSV;
			case BAI_VALUE: return BAI;
			case SAI_VALUE: return SAI;
			case VCF_IDX_VALUE: return VCF_IDX;
			case FASTA_VALUE: return FASTA;
			case BWT_VALUE: return BWT;
			case DICT_VALUE: return DICT;
			case FAI_VALUE: return FAI;
			case INTERVAL_LIST_VALUE: return INTERVAL_LIST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataFormat
