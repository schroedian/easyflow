/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.EasyflowFactory
 * @model kind="package"
 * @generated
 */
public interface EasyflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "easyflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ns_uri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ns_prefix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EasyflowPackage eINSTANCE = easyflow.impl.EasyflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.WorkflowImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DAG = 1;

	/**
	 * The feature id for the '<em><b>Workflow Template File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Metadata File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__METADATA_FILE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Workflow Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKFLOW_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__METADATA = 6;

	/**
	 * The feature id for the '<em><b>Implementation Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__IMPLEMENTATION_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Data Processing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DATA_PROCESSING_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Workflow Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKFLOW_UTIL = 9;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link easyflow.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.TaskImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Criterion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_CRITERION = 1;

	/**
	 * The feature id for the '<em><b>Data Format In</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_FORMAT_IN = 2;

	/**
	 * The feature id for the '<em><b>Data Format Out</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_FORMAT_OUT = 3;

	/**
	 * The feature id for the '<em><b>Cardinality In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CARDINALITY_IN = 4;

	/**
	 * The feature id for the '<em><b>Cardinality Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CARDINALITY_OUT = 5;

	/**
	 * The feature id for the '<em><b>Is Multiple Instance Of Data Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION = 6;

	/**
	 * The feature id for the '<em><b>Split Criterion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SPLIT_CRITERION = 7;

	/**
	 * The feature id for the '<em><b>Traversal Criterion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRAVERSAL_CRITERION = 8;

	/**
	 * The feature id for the '<em><b>Parent Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_TASKS = 9;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link easyflow.impl.EasyFlowTemplateImpl <em>Easy Flow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.EasyFlowTemplateImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowTemplate()
	 * @generated
	 */
	int EASY_FLOW_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_TEMPLATE__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Easy Flow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.impl.EasyFlowConfigurationImpl <em>Easy Flow Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.EasyFlowConfigurationImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowConfiguration()
	 * @generated
	 */
	int EASY_FLOW_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_CONFIGURATION__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Easy Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.impl.EasyFlowMetadataImpl <em>Easy Flow Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.EasyFlowMetadataImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowMetadata()
	 * @generated
	 */
	int EASY_FLOW_METADATA = 4;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_METADATA__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Easy Flow Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_METADATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.impl.DataProcessingTypeImpl <em>Data Processing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.DataProcessingTypeImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getDataProcessingType()
	 * @generated
	 */
	int DATA_PROCESSING_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Data Format In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE__DATA_FORMAT_IN = 0;

	/**
	 * The feature id for the '<em><b>Data Format Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE__DATA_FORMAT_OUT = 1;

	/**
	 * The number of structural features of the '<em>Data Processing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.impl.EasyFlowImplementationTemplateImpl <em>Easy Flow Implementation Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.EasyFlowImplementationTemplateImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowImplementationTemplate()
	 * @generated
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Easy Flow Implementation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.impl.DataProcessingTypeToTaskImpl <em>Data Processing Type To Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.DataProcessingTypeToTaskImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getDataProcessingTypeToTask()
	 * @generated
	 */
	int DATA_PROCESSING_TYPE_TO_TASK = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE_TO_TASK__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE_TO_TASK__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data Processing Type To Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE_TO_TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.impl.WorkflowUtilImpl <em>Workflow Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.WorkflowUtilImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getWorkflowUtil()
	 * @generated
	 */
	int WORKFLOW_UTIL = 8;

	/**
	 * The feature id for the '<em><b>Last Task Class Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UTIL__LAST_TASK_CLASS_MAP = 0;

	/**
	 * The number of structural features of the '<em>Workflow Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UTIL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.DataFormat <em>Data Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.DataFormat
	 * @see easyflow.impl.EasyflowPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 9;

	/**
	 * The meta object id for the '{@link easyflow.DataCriterion <em>Data Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.DataCriterion
	 * @see easyflow.impl.EasyflowPackageImpl#getDataCriterion()
	 * @generated
	 */
	int DATA_CRITERION = 10;

	/**
	 * The meta object id for the '{@link easyflow.TraversalCriterion <em>Traversal Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.TraversalCriterion
	 * @see easyflow.impl.EasyflowPackageImpl#getTraversalCriterion()
	 * @generated
	 */
	int TRAVERSAL_CRITERION = 11;

	/**
	 * The meta object id for the '{@link easyflow.SplitCriterion <em>Split Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.SplitCriterion
	 * @see easyflow.impl.EasyflowPackageImpl#getSplitCriterion()
	 * @generated
	 */
	int SPLIT_CRITERION = 12;

	/**
	 * The meta object id for the '<em>Dag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.graph.ListenableDirectedGraph
	 * @see easyflow.impl.EasyflowPackageImpl#getDag()
	 * @generated
	 */
	int DAG = 13;


	/**
	 * Returns the meta object for class '{@link easyflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see easyflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Workflow#getDag <em>Dag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dag</em>'.
	 * @see easyflow.Workflow#getDag()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Dag();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Workflow#getWorkflowTemplateFileName <em>Workflow Template File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workflow Template File Name</em>'.
	 * @see easyflow.Workflow#getWorkflowTemplateFileName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_WorkflowTemplateFileName();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Workflow#getMetadataFileName <em>Metadata File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata File Name</em>'.
	 * @see easyflow.Workflow#getMetadataFileName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_MetadataFileName();

	/**
	 * Returns the meta object for the reference '{@link easyflow.Workflow#getWorkflowTemplate <em>Workflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow Template</em>'.
	 * @see easyflow.Workflow#getWorkflowTemplate()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_WorkflowTemplate();

	/**
	 * Returns the meta object for the reference '{@link easyflow.Workflow#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see easyflow.Workflow#getConfiguration()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Configuration();

	/**
	 * Returns the meta object for the reference '{@link easyflow.Workflow#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metadata</em>'.
	 * @see easyflow.Workflow#getMetadata()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Metadata();

	/**
	 * Returns the meta object for the reference '{@link easyflow.Workflow#getImplementationTemplate <em>Implementation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Template</em>'.
	 * @see easyflow.Workflow#getImplementationTemplate()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ImplementationTemplate();

	/**
	 * Returns the meta object for the reference '{@link easyflow.Workflow#getDataProcessingType <em>Data Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Processing Type</em>'.
	 * @see easyflow.Workflow#getDataProcessingType()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_DataProcessingType();

	/**
	 * Returns the meta object for the reference '{@link easyflow.Workflow#getWorkflowUtil <em>Workflow Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow Util</em>'.
	 * @see easyflow.Workflow#getWorkflowUtil()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_WorkflowUtil();

	/**
	 * Returns the meta object for class '{@link easyflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see easyflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.Task#getDataCriterion <em>Data Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Criterion</em>'.
	 * @see easyflow.Task#getDataCriterion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_DataCriterion();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.Task#getDataFormatIn <em>Data Format In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Format In</em>'.
	 * @see easyflow.Task#getDataFormatIn()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_DataFormatIn();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.Task#getDataFormatOut <em>Data Format Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Format Out</em>'.
	 * @see easyflow.Task#getDataFormatOut()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_DataFormatOut();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Task#getCardinalityIn <em>Cardinality In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality In</em>'.
	 * @see easyflow.Task#getCardinalityIn()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CardinalityIn();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Task#getCardinalityOut <em>Cardinality Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Out</em>'.
	 * @see easyflow.Task#getCardinalityOut()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CardinalityOut();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Task#getIsMultipleInstanceOfDataCriterion <em>Is Multiple Instance Of Data Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiple Instance Of Data Criterion</em>'.
	 * @see easyflow.Task#getIsMultipleInstanceOfDataCriterion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsMultipleInstanceOfDataCriterion();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.Task#getSplitCriterion <em>Split Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Split Criterion</em>'.
	 * @see easyflow.Task#getSplitCriterion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_SplitCriterion();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.Task#getTraversalCriterion <em>Traversal Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Traversal Criterion</em>'.
	 * @see easyflow.Task#getTraversalCriterion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TraversalCriterion();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.Task#getParentTasks <em>Parent Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Tasks</em>'.
	 * @see easyflow.Task#getParentTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ParentTasks();

	/**
	 * Returns the meta object for class '{@link easyflow.EasyFlowTemplate <em>Easy Flow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Easy Flow Template</em>'.
	 * @see easyflow.EasyFlowTemplate
	 * @generated
	 */
	EClass getEasyFlowTemplate();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowTemplate#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see easyflow.EasyFlowTemplate#getFileName()
	 * @see #getEasyFlowTemplate()
	 * @generated
	 */
	EAttribute getEasyFlowTemplate_FileName();

	/**
	 * Returns the meta object for class '{@link easyflow.EasyFlowConfiguration <em>Easy Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Easy Flow Configuration</em>'.
	 * @see easyflow.EasyFlowConfiguration
	 * @generated
	 */
	EClass getEasyFlowConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowConfiguration#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see easyflow.EasyFlowConfiguration#getFileName()
	 * @see #getEasyFlowConfiguration()
	 * @generated
	 */
	EAttribute getEasyFlowConfiguration_FileName();

	/**
	 * Returns the meta object for class '{@link easyflow.EasyFlowMetadata <em>Easy Flow Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Easy Flow Metadata</em>'.
	 * @see easyflow.EasyFlowMetadata
	 * @generated
	 */
	EClass getEasyFlowMetadata();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowMetadata#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see easyflow.EasyFlowMetadata#getFileName()
	 * @see #getEasyFlowMetadata()
	 * @generated
	 */
	EAttribute getEasyFlowMetadata_FileName();

	/**
	 * Returns the meta object for class '{@link easyflow.DataProcessingType <em>Data Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing Type</em>'.
	 * @see easyflow.DataProcessingType
	 * @generated
	 */
	EClass getDataProcessingType();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.DataProcessingType#getDataFormatIn <em>Data Format In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Format In</em>'.
	 * @see easyflow.DataProcessingType#getDataFormatIn()
	 * @see #getDataProcessingType()
	 * @generated
	 */
	EAttribute getDataProcessingType_DataFormatIn();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.DataProcessingType#getDataFormatOut <em>Data Format Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Format Out</em>'.
	 * @see easyflow.DataProcessingType#getDataFormatOut()
	 * @see #getDataProcessingType()
	 * @generated
	 */
	EAttribute getDataProcessingType_DataFormatOut();

	/**
	 * Returns the meta object for class '{@link easyflow.EasyFlowImplementationTemplate <em>Easy Flow Implementation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Easy Flow Implementation Template</em>'.
	 * @see easyflow.EasyFlowImplementationTemplate
	 * @generated
	 */
	EClass getEasyFlowImplementationTemplate();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowImplementationTemplate#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see easyflow.EasyFlowImplementationTemplate#getFileName()
	 * @see #getEasyFlowImplementationTemplate()
	 * @generated
	 */
	EAttribute getEasyFlowImplementationTemplate_FileName();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Data Processing Type To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing Type To Task</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="easyflow.DataProcessingType"
	 *        valueType="easyflow.Task"
	 * @generated
	 */
	EClass getDataProcessingTypeToTask();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDataProcessingTypeToTask()
	 * @generated
	 */
	EReference getDataProcessingTypeToTask_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDataProcessingTypeToTask()
	 * @generated
	 */
	EReference getDataProcessingTypeToTask_Value();

	/**
	 * Returns the meta object for class '{@link easyflow.WorkflowUtil <em>Workflow Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Util</em>'.
	 * @see easyflow.WorkflowUtil
	 * @generated
	 */
	EClass getWorkflowUtil();

	/**
	 * Returns the meta object for the map '{@link easyflow.WorkflowUtil#getLastTaskClassMap <em>Last Task Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Last Task Class Map</em>'.
	 * @see easyflow.WorkflowUtil#getLastTaskClassMap()
	 * @see #getWorkflowUtil()
	 * @generated
	 */
	EReference getWorkflowUtil_LastTaskClassMap();

	/**
	 * Returns the meta object for enum '{@link easyflow.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Format</em>'.
	 * @see easyflow.DataFormat
	 * @generated
	 */
	EEnum getDataFormat();

	/**
	 * Returns the meta object for enum '{@link easyflow.DataCriterion <em>Data Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Criterion</em>'.
	 * @see easyflow.DataCriterion
	 * @generated
	 */
	EEnum getDataCriterion();

	/**
	 * Returns the meta object for enum '{@link easyflow.TraversalCriterion <em>Traversal Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traversal Criterion</em>'.
	 * @see easyflow.TraversalCriterion
	 * @generated
	 */
	EEnum getTraversalCriterion();

	/**
	 * Returns the meta object for enum '{@link easyflow.SplitCriterion <em>Split Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Split Criterion</em>'.
	 * @see easyflow.SplitCriterion
	 * @generated
	 */
	EEnum getSplitCriterion();

	/**
	 * Returns the meta object for data type '{@link org.jgrapht.graph.ListenableDirectedGraph <em>Dag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dag</em>'.
	 * @see org.jgrapht.graph.ListenableDirectedGraph
	 * @model instanceClass="org.jgrapht.graph.ListenableDirectedGraph"
	 * @generated
	 */
	EDataType getDag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EasyflowFactory getEasyflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.WorkflowImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Dag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__DAG = eINSTANCE.getWorkflow_Dag();

		/**
		 * The meta object literal for the '<em><b>Workflow Template File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME = eINSTANCE.getWorkflow_WorkflowTemplateFileName();

		/**
		 * The meta object literal for the '<em><b>Metadata File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__METADATA_FILE_NAME = eINSTANCE.getWorkflow_MetadataFileName();

		/**
		 * The meta object literal for the '<em><b>Workflow Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WORKFLOW_TEMPLATE = eINSTANCE.getWorkflow_WorkflowTemplate();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONFIGURATION = eINSTANCE.getWorkflow_Configuration();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__METADATA = eINSTANCE.getWorkflow_Metadata();

		/**
		 * The meta object literal for the '<em><b>Implementation Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__IMPLEMENTATION_TEMPLATE = eINSTANCE.getWorkflow_ImplementationTemplate();

		/**
		 * The meta object literal for the '<em><b>Data Processing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__DATA_PROCESSING_TYPE = eINSTANCE.getWorkflow_DataProcessingType();

		/**
		 * The meta object literal for the '<em><b>Workflow Util</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WORKFLOW_UTIL = eINSTANCE.getWorkflow_WorkflowUtil();

		/**
		 * The meta object literal for the '{@link easyflow.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.TaskImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Data Criterion</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DATA_CRITERION = eINSTANCE.getTask_DataCriterion();

		/**
		 * The meta object literal for the '<em><b>Data Format In</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DATA_FORMAT_IN = eINSTANCE.getTask_DataFormatIn();

		/**
		 * The meta object literal for the '<em><b>Data Format Out</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DATA_FORMAT_OUT = eINSTANCE.getTask_DataFormatOut();

		/**
		 * The meta object literal for the '<em><b>Cardinality In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CARDINALITY_IN = eINSTANCE.getTask_CardinalityIn();

		/**
		 * The meta object literal for the '<em><b>Cardinality Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CARDINALITY_OUT = eINSTANCE.getTask_CardinalityOut();

		/**
		 * The meta object literal for the '<em><b>Is Multiple Instance Of Data Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION = eINSTANCE.getTask_IsMultipleInstanceOfDataCriterion();

		/**
		 * The meta object literal for the '<em><b>Split Criterion</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SPLIT_CRITERION = eINSTANCE.getTask_SplitCriterion();

		/**
		 * The meta object literal for the '<em><b>Traversal Criterion</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TRAVERSAL_CRITERION = eINSTANCE.getTask_TraversalCriterion();

		/**
		 * The meta object literal for the '<em><b>Parent Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT_TASKS = eINSTANCE.getTask_ParentTasks();

		/**
		 * The meta object literal for the '{@link easyflow.impl.EasyFlowTemplateImpl <em>Easy Flow Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.EasyFlowTemplateImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowTemplate()
		 * @generated
		 */
		EClass EASY_FLOW_TEMPLATE = eINSTANCE.getEasyFlowTemplate();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_TEMPLATE__FILE_NAME = eINSTANCE.getEasyFlowTemplate_FileName();

		/**
		 * The meta object literal for the '{@link easyflow.impl.EasyFlowConfigurationImpl <em>Easy Flow Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.EasyFlowConfigurationImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowConfiguration()
		 * @generated
		 */
		EClass EASY_FLOW_CONFIGURATION = eINSTANCE.getEasyFlowConfiguration();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_CONFIGURATION__FILE_NAME = eINSTANCE.getEasyFlowConfiguration_FileName();

		/**
		 * The meta object literal for the '{@link easyflow.impl.EasyFlowMetadataImpl <em>Easy Flow Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.EasyFlowMetadataImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowMetadata()
		 * @generated
		 */
		EClass EASY_FLOW_METADATA = eINSTANCE.getEasyFlowMetadata();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_METADATA__FILE_NAME = eINSTANCE.getEasyFlowMetadata_FileName();

		/**
		 * The meta object literal for the '{@link easyflow.impl.DataProcessingTypeImpl <em>Data Processing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.DataProcessingTypeImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getDataProcessingType()
		 * @generated
		 */
		EClass DATA_PROCESSING_TYPE = eINSTANCE.getDataProcessingType();

		/**
		 * The meta object literal for the '<em><b>Data Format In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROCESSING_TYPE__DATA_FORMAT_IN = eINSTANCE.getDataProcessingType_DataFormatIn();

		/**
		 * The meta object literal for the '<em><b>Data Format Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROCESSING_TYPE__DATA_FORMAT_OUT = eINSTANCE.getDataProcessingType_DataFormatOut();

		/**
		 * The meta object literal for the '{@link easyflow.impl.EasyFlowImplementationTemplateImpl <em>Easy Flow Implementation Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.EasyFlowImplementationTemplateImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getEasyFlowImplementationTemplate()
		 * @generated
		 */
		EClass EASY_FLOW_IMPLEMENTATION_TEMPLATE = eINSTANCE.getEasyFlowImplementationTemplate();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME = eINSTANCE.getEasyFlowImplementationTemplate_FileName();

		/**
		 * The meta object literal for the '{@link easyflow.impl.DataProcessingTypeToTaskImpl <em>Data Processing Type To Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.DataProcessingTypeToTaskImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getDataProcessingTypeToTask()
		 * @generated
		 */
		EClass DATA_PROCESSING_TYPE_TO_TASK = eINSTANCE.getDataProcessingTypeToTask();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROCESSING_TYPE_TO_TASK__KEY = eINSTANCE.getDataProcessingTypeToTask_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROCESSING_TYPE_TO_TASK__VALUE = eINSTANCE.getDataProcessingTypeToTask_Value();

		/**
		 * The meta object literal for the '{@link easyflow.impl.WorkflowUtilImpl <em>Workflow Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.WorkflowUtilImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getWorkflowUtil()
		 * @generated
		 */
		EClass WORKFLOW_UTIL = eINSTANCE.getWorkflowUtil();

		/**
		 * The meta object literal for the '<em><b>Last Task Class Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_UTIL__LAST_TASK_CLASS_MAP = eINSTANCE.getWorkflowUtil_LastTaskClassMap();

		/**
		 * The meta object literal for the '{@link easyflow.DataFormat <em>Data Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.DataFormat
		 * @see easyflow.impl.EasyflowPackageImpl#getDataFormat()
		 * @generated
		 */
		EEnum DATA_FORMAT = eINSTANCE.getDataFormat();

		/**
		 * The meta object literal for the '{@link easyflow.DataCriterion <em>Data Criterion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.DataCriterion
		 * @see easyflow.impl.EasyflowPackageImpl#getDataCriterion()
		 * @generated
		 */
		EEnum DATA_CRITERION = eINSTANCE.getDataCriterion();

		/**
		 * The meta object literal for the '{@link easyflow.TraversalCriterion <em>Traversal Criterion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.TraversalCriterion
		 * @see easyflow.impl.EasyflowPackageImpl#getTraversalCriterion()
		 * @generated
		 */
		EEnum TRAVERSAL_CRITERION = eINSTANCE.getTraversalCriterion();

		/**
		 * The meta object literal for the '{@link easyflow.SplitCriterion <em>Split Criterion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.SplitCriterion
		 * @see easyflow.impl.EasyflowPackageImpl#getSplitCriterion()
		 * @generated
		 */
		EEnum SPLIT_CRITERION = eINSTANCE.getSplitCriterion();

		/**
		 * The meta object literal for the '<em>Dag</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jgrapht.graph.ListenableDirectedGraph
		 * @see easyflow.impl.EasyflowPackageImpl#getDag()
		 * @generated
		 */
		EDataType DAG = eINSTANCE.getDag();

	}

} //EasyflowPackage
