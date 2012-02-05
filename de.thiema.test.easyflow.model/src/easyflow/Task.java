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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.Task#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.Task#getDataFormatIn <em>Data Format In</em>}</li>
 *   <li>{@link easyflow.Task#getDataFormatOut <em>Data Format Out</em>}</li>
 *   <li>{@link easyflow.Task#getCardinalityIn <em>Cardinality In</em>}</li>
 *   <li>{@link easyflow.Task#getCardinalityOut <em>Cardinality Out</em>}</li>
 *   <li>{@link easyflow.Task#getDataCriterion <em>Data Criterion</em>}</li>
 *   <li>{@link easyflow.Task#getIsMultipleInstanceOfDataCriterion <em>Is Multiple Instance Of Data Criterion</em>}</li>
 *   <li>{@link easyflow.Task#getSplitCriterion <em>Split Criterion</em>}</li>
 *   <li>{@link easyflow.Task#getTraversalCriterion <em>Traversal Criterion</em>}</li>
 *   <li>{@link easyflow.Task#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link easyflow.Task#getParentTasks <em>Parent Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * @see easyflow.EasyflowPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Criterion</b></em>' attribute list.
	 * The list contents are of type {@link easyflow.DataCriterion}.
	 * The literals are from the enumeration {@link easyflow.DataCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Criterion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Criterion</em>' attribute list.
	 * @see easyflow.DataCriterion
	 * @see easyflow.EasyflowPackage#getTask_DataCriterion()
	 * @model
	 * @generated
	 */
	EList<DataCriterion> getDataCriterion();

	/**
	 * Returns the value of the '<em><b>Data Format In</b></em>' attribute list.
	 * The list contents are of type {@link easyflow.DataFormat}.
	 * The literals are from the enumeration {@link easyflow.DataFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format In</em>' attribute list.
	 * @see easyflow.DataFormat
	 * @see easyflow.EasyflowPackage#getTask_DataFormatIn()
	 * @model
	 * @generated
	 */
	EList<DataFormat> getDataFormatIn();

	/**
	 * Returns the value of the '<em><b>Data Format Out</b></em>' attribute list.
	 * The list contents are of type {@link easyflow.DataFormat}.
	 * The literals are from the enumeration {@link easyflow.DataFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format Out</em>' attribute list.
	 * @see easyflow.DataFormat
	 * @see easyflow.EasyflowPackage#getTask_DataFormatOut()
	 * @model
	 * @generated
	 */
	EList<DataFormat> getDataFormatOut();

	/**
	 * Returns the value of the '<em><b>Cardinality In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality In</em>' attribute.
	 * @see #setCardinalityIn(short)
	 * @see easyflow.EasyflowPackage#getTask_CardinalityIn()
	 * @model
	 * @generated
	 */
	short getCardinalityIn();

	/**
	 * Sets the value of the '{@link easyflow.Task#getCardinalityIn <em>Cardinality In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality In</em>' attribute.
	 * @see #getCardinalityIn()
	 * @generated
	 */
	void setCardinalityIn(short value);

	/**
	 * Returns the value of the '<em><b>Cardinality Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Out</em>' attribute.
	 * @see #setCardinalityOut(short)
	 * @see easyflow.EasyflowPackage#getTask_CardinalityOut()
	 * @model
	 * @generated
	 */
	short getCardinalityOut();

	/**
	 * Sets the value of the '{@link easyflow.Task#getCardinalityOut <em>Cardinality Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Out</em>' attribute.
	 * @see #getCardinalityOut()
	 * @generated
	 */
	void setCardinalityOut(short value);

	/**
	 * Returns the value of the '<em><b>Is Multiple Instance Of Data Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * defines whether the task is able to process multiple Instances of the given DataCriterion at the same time. E.g.: LocalRealigner can process multiple samples at the same time.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multiple Instance Of Data Criterion</em>' attribute.
	 * @see #setIsMultipleInstanceOfDataCriterion(Boolean)
	 * @see easyflow.EasyflowPackage#getTask_IsMultipleInstanceOfDataCriterion()
	 * @model
	 * @generated
	 */
	Boolean getIsMultipleInstanceOfDataCriterion();

	/**
	 * Sets the value of the '{@link easyflow.Task#getIsMultipleInstanceOfDataCriterion <em>Is Multiple Instance Of Data Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multiple Instance Of Data Criterion</em>' attribute.
	 * @see #getIsMultipleInstanceOfDataCriterion()
	 * @generated
	 */
	void setIsMultipleInstanceOfDataCriterion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Split Criterion</b></em>' attribute list.
	 * The list contents are of type {@link easyflow.SplitCriterion}.
	 * The literals are from the enumeration {@link easyflow.SplitCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Criterion</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Criterion</em>' attribute list.
	 * @see easyflow.SplitCriterion
	 * @see easyflow.EasyflowPackage#getTask_SplitCriterion()
	 * @model
	 * @generated
	 */
	EList<SplitCriterion> getSplitCriterion();

	/**
	 * Returns the value of the '<em><b>Traversal Criterion</b></em>' attribute list.
	 * The list contents are of type {@link easyflow.TraversalCriterion}.
	 * The literals are from the enumeration {@link easyflow.TraversalCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Criterion</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Criterion</em>' attribute list.
	 * @see easyflow.TraversalCriterion
	 * @see easyflow.EasyflowPackage#getTask_TraversalCriterion()
	 * @model
	 * @generated
	 */
	EList<TraversalCriterion> getTraversalCriterion();

	/**
	 * Returns the value of the '<em><b>Parent Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Tasks</em>' containment reference list.
	 * @see easyflow.EasyflowPackage#getTask_ParentTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getParentTasks();

	/**
	 * Returns the value of the '<em><b>Command Line</b></em>' containment reference list.
	 * The list contents are of type {@link easyflow.CommandLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Line</em>' containment reference list.
	 * @see easyflow.EasyflowPackage#getTask_CommandLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandLine> getCommandLine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readTask(String wtplLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getFilesIn(DataFormat dataFormatIn);

} // Task
