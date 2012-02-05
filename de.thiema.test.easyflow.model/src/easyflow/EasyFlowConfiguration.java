/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import java.util.Map;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Easy Flow Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.EasyFlowConfiguration#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.EasyFlowConfiguration#getConfigMap <em>Config Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getEasyFlowConfiguration()
 * @model
 * @generated
 */
public interface EasyFlowConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see easyflow.EasyflowPackage#getEasyFlowConfiguration_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link easyflow.EasyFlowConfiguration#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Config Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Map</em>' attribute.
	 * @see #setConfigMap(Map)
	 * @see easyflow.EasyflowPackage#getEasyFlowConfiguration_ConfigMap()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getConfigMap();

	/**
	 * Sets the value of the '{@link easyflow.EasyFlowConfiguration#getConfigMap <em>Config Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Map</em>' attribute.
	 * @see #getConfigMap()
	 * @generated
	 */
	void setConfigMap(Map<String, String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void configFileReader() throws IOException;

} // EasyFlowConfiguration
