/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.ListenableDirectedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IWorkflow Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see easyflow.EasyflowPackage#getIWorkflowUtil()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IWorkflowUtil extends EObject {
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
	EList<Task> getTasksFromLastTaskClass(EList<DataFormat> dataFormatIn, EList<DataFormat> dataFormatOut, Map<DataProcessingType, Task> lastTaskClassMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task getTaskFromLastTaskClassMap(DataProcessingType dataProcessingTypeIn, Map<DataProcessingType, Task> lastTaskClassMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataFormatInMany="false" dataFormatOutMany="false"
	 * @generated
	 */
	void updateLastTaskClass(EList<DataFormat> dataFormatIn, EList<DataFormat> dataFormatOut, Task task, Map<DataProcessingType, Task> lastTaskClassMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateLastTaskClassMap(DataProcessingType dataProcessingType, Task task, Map<DataProcessingType, Task> lastTaskClassMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dagDataType="easyflow.Dag" lastTasksMany="false"
	 * @generated
	 */
	void addTaskListToDAG(ListenableDirectedGraph dag, EList<Task> lastTasks, Task curTask);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" taskSetDataType="easyflow.ESet"
	 * @generated
	 */
	EList<Task> getTaskByName(Set taskSet, String rawTaskNames);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printLastTaskClassMap(Map<DataProcessingType, Task> lastTaskClassMap);

} // IWorkflowUtil
