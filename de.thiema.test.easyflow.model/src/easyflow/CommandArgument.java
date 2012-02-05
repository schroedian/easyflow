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
 * A representation of the model object '<em><b>Command Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.CommandArgument#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.CommandArgument#getArg <em>Arg</em>}</li>
 *   <li>{@link easyflow.CommandArgument#getSep <em>Sep</em>}</li>
 *   <li>{@link easyflow.CommandArgument#isNamed <em>Named</em>}</li>
 *   <li>{@link easyflow.CommandArgument#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getCommandArgument()
 * @model
 * @generated
 */
public interface CommandArgument extends EObject {
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
	 * @see easyflow.EasyflowPackage#getCommandArgument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.CommandArgument#getName <em>Name</em>}' attribute.
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
	 * @see easyflow.EasyflowPackage#getCommandArgument_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link easyflow.CommandArgument#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sep</em>' attribute.
	 * @see #setSep(String)
	 * @see easyflow.EasyflowPackage#getCommandArgument_Sep()
	 * @model
	 * @generated
	 */
	String getSep();

	/**
	 * Sets the value of the '{@link easyflow.CommandArgument#getSep <em>Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sep</em>' attribute.
	 * @see #getSep()
	 * @generated
	 */
	void setSep(String value);

	/**
	 * Returns the value of the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named</em>' attribute.
	 * @see #setNamed(boolean)
	 * @see easyflow.EasyflowPackage#getCommandArgument_Named()
	 * @model
	 * @generated
	 */
	boolean isNamed();

	/**
	 * Sets the value of the '{@link easyflow.CommandArgument#isNamed <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named</em>' attribute.
	 * @see #isNamed()
	 * @generated
	 */
	void setNamed(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see easyflow.EasyflowPackage#getCommandArgument_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link easyflow.CommandArgument#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // CommandArgument
