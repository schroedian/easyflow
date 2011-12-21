/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Processing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.DataProcessingType#getDataFormatIn <em>Data Format In</em>}</li>
 *   <li>{@link easyflow.DataProcessingType#getDataFormatOut <em>Data Format Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getDataProcessingType()
 * @model
 * @generated
 */
public interface DataProcessingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Format In</b></em>' attribute.
	 * The literals are from the enumeration {@link easyflow.DataFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format In</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format In</em>' attribute.
	 * @see easyflow.DataFormat
	 * @see #setDataFormatIn(DataFormat)
	 * @see easyflow.EasyflowPackage#getDataProcessingType_DataFormatIn()
	 * @model
	 * @generated
	 */
	DataFormat getDataFormatIn();

	/**
	 * Sets the value of the '{@link easyflow.DataProcessingType#getDataFormatIn <em>Data Format In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format In</em>' attribute.
	 * @see easyflow.DataFormat
	 * @see #getDataFormatIn()
	 * @generated
	 */
	void setDataFormatIn(DataFormat value);

	/**
	 * Returns the value of the '<em><b>Data Format Out</b></em>' attribute.
	 * The literals are from the enumeration {@link easyflow.DataFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format Out</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format Out</em>' attribute.
	 * @see easyflow.DataFormat
	 * @see #setDataFormatOut(DataFormat)
	 * @see easyflow.EasyflowPackage#getDataProcessingType_DataFormatOut()
	 * @model
	 * @generated
	 */
	DataFormat getDataFormatOut();

	/**
	 * Sets the value of the '{@link easyflow.DataProcessingType#getDataFormatOut <em>Data Format Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format Out</em>' attribute.
	 * @see easyflow.DataFormat
	 * @see #getDataFormatOut()
	 * @generated
	 */
	void setDataFormatOut(DataFormat value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isConvertableTo(DataProcessingType dataProcessingTypeOut);

} // DataProcessingType
