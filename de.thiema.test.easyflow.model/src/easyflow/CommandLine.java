/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.CommandLine#getSubCmd <em>Sub Cmd</em>}</li>
 *   <li>{@link easyflow.CommandLine#getArgIn <em>Arg In</em>}</li>
 *   <li>{@link easyflow.CommandLine#getArgOut <em>Arg Out</em>}</li>
 *   <li>{@link easyflow.CommandLine#getTool <em>Tool</em>}</li>
 *   <li>{@link easyflow.CommandLine#getOptionalArg <em>Optional Arg</em>}</li>
 *   <li>{@link easyflow.CommandLine#getRequiredArg <em>Required Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getCommandLine()
 * @model
 * @generated
 */
public interface CommandLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Cmd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Cmd</em>' attribute.
	 * @see #setSubCmd(String)
	 * @see easyflow.EasyflowPackage#getCommandLine_SubCmd()
	 * @model
	 * @generated
	 */
	String getSubCmd();

	/**
	 * Sets the value of the '{@link easyflow.CommandLine#getSubCmd <em>Sub Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Cmd</em>' attribute.
	 * @see #getSubCmd()
	 * @generated
	 */
	void setSubCmd(String value);

	/**
	 * Returns the value of the '<em><b>Arg In</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.CommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg In</em>' containment reference list.
	 * @see easyflow.EasyflowPackage#getCommandLine_ArgIn()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandArgument> getArgIn();

	/**
	 * Returns the value of the '<em><b>Arg Out</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.CommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Out</em>' containment reference list.
	 * @see easyflow.EasyflowPackage#getCommandLine_ArgOut()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandArgument> getArgOut();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference.
	 * @see #setTool(Tool)
	 * @see easyflow.EasyflowPackage#getCommandLine_Tool()
	 * @model containment="true"
	 * @generated
	 */
	Tool getTool();

	/**
	 * Sets the value of the '{@link easyflow.CommandLine#getTool <em>Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' containment reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(Tool value);

	/**
	 * Returns the value of the '<em><b>Optional Arg</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.CommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Arg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Arg</em>' containment reference list.
	 * @see easyflow.EasyflowPackage#getCommandLine_OptionalArg()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandArgument> getOptionalArg();

	/**
	 * Returns the value of the '<em><b>Required Arg</b></em>' reference list.
	 * The list contents are of type {@link easyflow.CommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Arg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Arg</em>' reference list.
	 * @see easyflow.EasyflowPackage#getCommandLine_RequiredArg()
	 * @model
	 * @generated
	 */
	EList<CommandArgument> getRequiredArg();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> printCommandLine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCmdProperties(Map<String, String> parameterConfigMap);

} // CommandLine
