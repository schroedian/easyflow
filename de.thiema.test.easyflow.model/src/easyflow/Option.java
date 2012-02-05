/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.Option#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.Option#getArg <em>Arg</em>}</li>
 *   <li>{@link easyflow.Option#getSeperator <em>Seperator</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see easyflow.EasyflowPackage#getOption_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.Option#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see easyflow.EasyflowPackage#getOption_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link easyflow.Option#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Seperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seperator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seperator</em>' attribute.
	 * @see #setSeperator(String)
	 * @see easyflow.EasyflowPackage#getOption_Seperator()
	 * @model
	 * @generated
	 */
	String getSeperator();

	/**
	 * Sets the value of the '{@link easyflow.Option#getSeperator <em>Seperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperator</em>' attribute.
	 * @see #getSeperator()
	 * @generated
	 */
	void setSeperator(String value);

} // Option
