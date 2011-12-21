/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Util</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.WorkflowUtil#getLastTaskClassMap <em>Last Task Class Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getWorkflowUtil()
 * @model
 * @generated
 */
public interface WorkflowUtil extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Task Class Map</b></em>' map.
	 * The key is of type {@link easyflow.DataProcessingType},
	 * and the value is of type {@link easyflow.Task},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Task Class Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Task Class Map</em>' map.
	 * @see easyflow.EasyflowPackage#getWorkflowUtil_LastTaskClassMap()
	 * @model mapType="easyflow.DataProcessingTypeToTask<easyflow.DataProcessingType, easyflow.Task>"
	 * @generated
	 */
	EMap<DataProcessingType, Task> getLastTaskClassMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Task> getAllTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataFormatInMany="false" dataFormatOutMany="false"
	 * @generated
	 */
	void updateLastTaskClass(EList<DataFormat> dataFormatIn, EList<DataFormat> dataFormatOut, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataFormatInMany="false"
	 * @generated
	 */
	EList<Task> getTasksFromLastTaskClass(EList<DataFormat> dataFormatIn, EList<DataFormat> dataFormatOut);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateLastTaskClassMap(DataProcessingType dataProcessingType, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task getTaskFromLastTaskClassMap(DataProcessingType dataProcessingTypeIn);

} // WorkflowUtil
