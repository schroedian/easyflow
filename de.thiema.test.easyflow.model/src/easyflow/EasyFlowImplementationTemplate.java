/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import argo.jdom.JsonRootNode;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.ListenableDirectedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Easy Flow Implementation Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.EasyFlowImplementationTemplate#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.EasyFlowImplementationTemplate#getParameterFileName <em>Parameter File Name</em>}</li>
 *   <li>{@link easyflow.EasyFlowImplementationTemplate#getParameterConfigMap <em>Parameter Config Map</em>}</li>
 *   <li>{@link easyflow.EasyFlowImplementationTemplate#getJsonRootNode <em>Json Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getEasyFlowImplementationTemplate()
 * @model
 * @generated
 */
public interface EasyFlowImplementationTemplate extends EObject {
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
	 * @see easyflow.EasyflowPackage#getEasyFlowImplementationTemplate_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link easyflow.EasyFlowImplementationTemplate#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter File Name</em>' attribute.
	 * @see #setParameterFileName(String)
	 * @see easyflow.EasyflowPackage#getEasyFlowImplementationTemplate_ParameterFileName()
	 * @model
	 * @generated
	 */
	String getParameterFileName();

	/**
	 * Sets the value of the '{@link easyflow.EasyFlowImplementationTemplate#getParameterFileName <em>Parameter File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter File Name</em>' attribute.
	 * @see #getParameterFileName()
	 * @generated
	 */
	void setParameterFileName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Config Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Config Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Config Map</em>' attribute.
	 * @see #setParameterConfigMap(Map)
	 * @see easyflow.EasyflowPackage#getEasyFlowImplementationTemplate_ParameterConfigMap()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getParameterConfigMap();

	/**
	 * Sets the value of the '{@link easyflow.EasyFlowImplementationTemplate#getParameterConfigMap <em>Parameter Config Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Config Map</em>' attribute.
	 * @see #getParameterConfigMap()
	 * @generated
	 */
	void setParameterConfigMap(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Json Root Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Root Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Root Node</em>' attribute.
	 * @see #setJsonRootNode(JsonRootNode)
	 * @see easyflow.EasyflowPackage#getEasyFlowImplementationTemplate_JsonRootNode()
	 * @model dataType="easyflow.JsonRootNode"
	 * @generated
	 */
	JsonRootNode getJsonRootNode();

	/**
	 * Sets the value of the '{@link easyflow.EasyFlowImplementationTemplate#getJsonRootNode <em>Json Root Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Root Node</em>' attribute.
	 * @see #getJsonRootNode()
	 * @generated
	 */
	void setJsonRootNode(JsonRootNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dagDataType="easyflow.Dag"
	 * @generated
	 */
	void templateFileParser(ListenableDirectedGraph dag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readParameterConfig(String toolName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initJsonRootNode();

} // EasyFlowImplementationTemplate
