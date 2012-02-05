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
	 * The feature id for the '<em><b>Workflow Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKFLOW_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__METADATA = 4;

	/**
	 * The feature id for the '<em><b>Implementation Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__IMPLEMENTATION_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Data Processing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DATA_PROCESSING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Workflow Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKFLOW_UTIL = 7;

	/**
	 * The feature id for the '<em><b>Last Task Class Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__LAST_TASK_CLASS_MAP = 8;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Data Format In</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_FORMAT_IN = 1;

	/**
	 * The feature id for the '<em><b>Data Format Out</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_FORMAT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Cardinality In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CARDINALITY_IN = 3;

	/**
	 * The feature id for the '<em><b>Cardinality Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CARDINALITY_OUT = 4;

	/**
	 * The feature id for the '<em><b>Data Criterion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_CRITERION = 5;

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
	 * The feature id for the '<em><b>Command Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMMAND_LINE = 9;

	/**
	 * The feature id for the '<em><b>Parent Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_TASKS = 10;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 11;

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
	 * The feature id for the '<em><b>Config Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_CONFIGURATION__CONFIG_MAP = 1;

	/**
	 * The number of structural features of the '<em>Easy Flow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_CONFIGURATION_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Parameter File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameter Config Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP = 2;

	/**
	 * The feature id for the '<em><b>Json Root Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE = 3;

	/**
	 * The number of structural features of the '<em>Easy Flow Implementation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASY_FLOW_IMPLEMENTATION_TEMPLATE_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link easyflow.IWorkflowUtil <em>IWorkflow Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.IWorkflowUtil
	 * @see easyflow.impl.EasyflowPackageImpl#getIWorkflowUtil()
	 * @generated
	 */
	int IWORKFLOW_UTIL = 8;

	/**
	 * The number of structural features of the '<em>IWorkflow Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_UTIL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.impl.CommandLineImpl <em>Command Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.CommandLineImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getCommandLine()
	 * @generated
	 */
	int COMMAND_LINE = 9;

	/**
	 * The feature id for the '<em><b>Sub Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__SUB_CMD = 0;

	/**
	 * The feature id for the '<em><b>Arg In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__ARG_IN = 1;

	/**
	 * The feature id for the '<em><b>Arg Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__ARG_OUT = 2;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__TOOL = 3;

	/**
	 * The feature id for the '<em><b>Optional Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__OPTIONAL_ARG = 4;

	/**
	 * The feature id for the '<em><b>Required Arg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__REQUIRED_ARG = 5;

	/**
	 * The number of structural features of the '<em>Command Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link easyflow.impl.CommandArgumentImpl <em>Command Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.CommandArgumentImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getCommandArgument()
	 * @generated
	 */
	int COMMAND_ARGUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT__ARG = 1;

	/**
	 * The feature id for the '<em><b>Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT__SEP = 2;

	/**
	 * The feature id for the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT__NAMED = 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT__REQUIRED = 4;

	/**
	 * The number of structural features of the '<em>Command Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link easyflow.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.ToolImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link easyflow.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.ArgumentImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARG = 1;

	/**
	 * The feature id for the '<em><b>Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SEP = 2;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link easyflow.impl.CSVImpl <em>CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.impl.CSVImpl
	 * @see easyflow.impl.EasyflowPackageImpl#getCSV()
	 * @generated
	 */
	int CSV = 13;

	/**
	 * The number of structural features of the '<em>CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.DataFormat <em>Data Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.DataFormat
	 * @see easyflow.impl.EasyflowPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 14;

	/**
	 * The meta object id for the '{@link easyflow.DataCriterion <em>Data Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.DataCriterion
	 * @see easyflow.impl.EasyflowPackageImpl#getDataCriterion()
	 * @generated
	 */
	int DATA_CRITERION = 15;

	/**
	 * The meta object id for the '{@link easyflow.TraversalCriterion <em>Traversal Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.TraversalCriterion
	 * @see easyflow.impl.EasyflowPackageImpl#getTraversalCriterion()
	 * @generated
	 */
	int TRAVERSAL_CRITERION = 16;

	/**
	 * The meta object id for the '{@link easyflow.SplitCriterion <em>Split Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.SplitCriterion
	 * @see easyflow.impl.EasyflowPackageImpl#getSplitCriterion()
	 * @generated
	 */
	int SPLIT_CRITERION = 17;

	/**
	 * The meta object id for the '<em>Dag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.graph.ListenableDirectedGraph
	 * @see easyflow.impl.EasyflowPackageImpl#getDag()
	 * @generated
	 */
	int DAG = 18;


	/**
	 * The meta object id for the '<em>ESet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see easyflow.impl.EasyflowPackageImpl#getESet()
	 * @generated
	 */
	int ESET = 19;


	/**
	 * The meta object id for the '<em>Edge Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.EdgeFactory
	 * @see easyflow.impl.EasyflowPackageImpl#getEdgeFactory()
	 * @generated
	 */
	int EDGE_FACTORY = 20;


	/**
	 * The meta object id for the '<em>Json Root Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argo.jdom.JsonRootNode
	 * @see easyflow.impl.EasyflowPackageImpl#getJsonRootNode()
	 * @generated
	 */
	int JSON_ROOT_NODE = 21;


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
	 * Returns the meta object for the containment reference '{@link easyflow.Workflow#getWorkflowTemplate <em>Workflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow Template</em>'.
	 * @see easyflow.Workflow#getWorkflowTemplate()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_WorkflowTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.Workflow#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see easyflow.Workflow#getConfiguration()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.Workflow#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see easyflow.Workflow#getMetadata()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.Workflow#getImplementationTemplate <em>Implementation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Template</em>'.
	 * @see easyflow.Workflow#getImplementationTemplate()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ImplementationTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.Workflow#getDataProcessingType <em>Data Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Processing Type</em>'.
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
	 * Returns the meta object for the map '{@link easyflow.Workflow#getLastTaskClassMap <em>Last Task Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Last Task Class Map</em>'.
	 * @see easyflow.Workflow#getLastTaskClassMap()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_LastTaskClassMap();

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
	 * Returns the meta object for the containment reference list '{@link easyflow.Task#getParentTasks <em>Parent Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Tasks</em>'.
	 * @see easyflow.Task#getParentTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ParentTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.Task#getCommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command Line</em>'.
	 * @see easyflow.Task#getCommandLine()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_CommandLine();

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
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowConfiguration#getConfigMap <em>Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Map</em>'.
	 * @see easyflow.EasyFlowConfiguration#getConfigMap()
	 * @see #getEasyFlowConfiguration()
	 * @generated
	 */
	EAttribute getEasyFlowConfiguration_ConfigMap();

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
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowImplementationTemplate#getParameterFileName <em>Parameter File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter File Name</em>'.
	 * @see easyflow.EasyFlowImplementationTemplate#getParameterFileName()
	 * @see #getEasyFlowImplementationTemplate()
	 * @generated
	 */
	EAttribute getEasyFlowImplementationTemplate_ParameterFileName();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowImplementationTemplate#getParameterConfigMap <em>Parameter Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Config Map</em>'.
	 * @see easyflow.EasyFlowImplementationTemplate#getParameterConfigMap()
	 * @see #getEasyFlowImplementationTemplate()
	 * @generated
	 */
	EAttribute getEasyFlowImplementationTemplate_ParameterConfigMap();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.EasyFlowImplementationTemplate#getJsonRootNode <em>Json Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Root Node</em>'.
	 * @see easyflow.EasyFlowImplementationTemplate#getJsonRootNode()
	 * @see #getEasyFlowImplementationTemplate()
	 * @generated
	 */
	EAttribute getEasyFlowImplementationTemplate_JsonRootNode();

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
	 * Returns the meta object for class '{@link easyflow.IWorkflowUtil <em>IWorkflow Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWorkflow Util</em>'.
	 * @see easyflow.IWorkflowUtil
	 * @generated
	 */
	EClass getIWorkflowUtil();

	/**
	 * Returns the meta object for class '{@link easyflow.CommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line</em>'.
	 * @see easyflow.CommandLine
	 * @generated
	 */
	EClass getCommandLine();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.CommandLine#getSubCmd <em>Sub Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Cmd</em>'.
	 * @see easyflow.CommandLine#getSubCmd()
	 * @see #getCommandLine()
	 * @generated
	 */
	EAttribute getCommandLine_SubCmd();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.CommandLine#getArgIn <em>Arg In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg In</em>'.
	 * @see easyflow.CommandLine#getArgIn()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_ArgIn();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.CommandLine#getArgOut <em>Arg Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg Out</em>'.
	 * @see easyflow.CommandLine#getArgOut()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_ArgOut();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.CommandLine#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool</em>'.
	 * @see easyflow.CommandLine#getTool()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_Tool();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.CommandLine#getOptionalArg <em>Optional Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Arg</em>'.
	 * @see easyflow.CommandLine#getOptionalArg()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_OptionalArg();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.CommandLine#getRequiredArg <em>Required Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Arg</em>'.
	 * @see easyflow.CommandLine#getRequiredArg()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_RequiredArg();

	/**
	 * Returns the meta object for class '{@link easyflow.CommandArgument <em>Command Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Argument</em>'.
	 * @see easyflow.CommandArgument
	 * @generated
	 */
	EClass getCommandArgument();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.CommandArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.CommandArgument#getName()
	 * @see #getCommandArgument()
	 * @generated
	 */
	EAttribute getCommandArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.CommandArgument#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see easyflow.CommandArgument#getArg()
	 * @see #getCommandArgument()
	 * @generated
	 */
	EAttribute getCommandArgument_Arg();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.CommandArgument#getSep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sep</em>'.
	 * @see easyflow.CommandArgument#getSep()
	 * @see #getCommandArgument()
	 * @generated
	 */
	EAttribute getCommandArgument_Sep();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.CommandArgument#isNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Named</em>'.
	 * @see easyflow.CommandArgument#isNamed()
	 * @see #getCommandArgument()
	 * @generated
	 */
	EAttribute getCommandArgument_Named();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.CommandArgument#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see easyflow.CommandArgument#isRequired()
	 * @see #getCommandArgument()
	 * @generated
	 */
	EAttribute getCommandArgument_Required();

	/**
	 * Returns the meta object for class '{@link easyflow.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see easyflow.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Tool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.Tool#getName()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Tool#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see easyflow.Tool#getType()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Type();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Tool#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see easyflow.Tool#getCategory()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Category();

	/**
	 * Returns the meta object for class '{@link easyflow.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see easyflow.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Argument#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see easyflow.Argument#getArg()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Arg();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.Argument#getSep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sep</em>'.
	 * @see easyflow.Argument#getSep()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Sep();

	/**
	 * Returns the meta object for class '{@link easyflow.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV</em>'.
	 * @see easyflow.CSV
	 * @generated
	 */
	EClass getCSV();

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
	 * Returns the meta object for data type '{@link java.util.Set <em>ESet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ESet</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set"
	 * @generated
	 */
	EDataType getESet();

	/**
	 * Returns the meta object for data type '{@link org.jgrapht.EdgeFactory <em>Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Factory</em>'.
	 * @see org.jgrapht.EdgeFactory
	 * @model instanceClass="org.jgrapht.EdgeFactory"
	 * @generated
	 */
	EDataType getEdgeFactory();

	/**
	 * Returns the meta object for data type '{@link argo.jdom.JsonRootNode <em>Json Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Json Root Node</em>'.
	 * @see argo.jdom.JsonRootNode
	 * @model instanceClass="argo.jdom.JsonRootNode"
	 * @generated
	 */
	EDataType getJsonRootNode();

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
		 * The meta object literal for the '<em><b>Workflow Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WORKFLOW_TEMPLATE = eINSTANCE.getWorkflow_WorkflowTemplate();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONFIGURATION = eINSTANCE.getWorkflow_Configuration();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__METADATA = eINSTANCE.getWorkflow_Metadata();

		/**
		 * The meta object literal for the '<em><b>Implementation Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__IMPLEMENTATION_TEMPLATE = eINSTANCE.getWorkflow_ImplementationTemplate();

		/**
		 * The meta object literal for the '<em><b>Data Processing Type</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Last Task Class Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__LAST_TASK_CLASS_MAP = eINSTANCE.getWorkflow_LastTaskClassMap();

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
		 * The meta object literal for the '<em><b>Parent Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT_TASKS = eINSTANCE.getTask_ParentTasks();

		/**
		 * The meta object literal for the '<em><b>Command Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__COMMAND_LINE = eINSTANCE.getTask_CommandLine();

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
		 * The meta object literal for the '<em><b>Config Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_CONFIGURATION__CONFIG_MAP = eINSTANCE.getEasyFlowConfiguration_ConfigMap();

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
		 * The meta object literal for the '<em><b>Parameter File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME = eINSTANCE.getEasyFlowImplementationTemplate_ParameterFileName();

		/**
		 * The meta object literal for the '<em><b>Parameter Config Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP = eINSTANCE.getEasyFlowImplementationTemplate_ParameterConfigMap();

		/**
		 * The meta object literal for the '<em><b>Json Root Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE = eINSTANCE.getEasyFlowImplementationTemplate_JsonRootNode();

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
		 * The meta object literal for the '{@link easyflow.IWorkflowUtil <em>IWorkflow Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.IWorkflowUtil
		 * @see easyflow.impl.EasyflowPackageImpl#getIWorkflowUtil()
		 * @generated
		 */
		EClass IWORKFLOW_UTIL = eINSTANCE.getIWorkflowUtil();

		/**
		 * The meta object literal for the '{@link easyflow.impl.CommandLineImpl <em>Command Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.CommandLineImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getCommandLine()
		 * @generated
		 */
		EClass COMMAND_LINE = eINSTANCE.getCommandLine();

		/**
		 * The meta object literal for the '<em><b>Sub Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE__SUB_CMD = eINSTANCE.getCommandLine_SubCmd();

		/**
		 * The meta object literal for the '<em><b>Arg In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__ARG_IN = eINSTANCE.getCommandLine_ArgIn();

		/**
		 * The meta object literal for the '<em><b>Arg Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__ARG_OUT = eINSTANCE.getCommandLine_ArgOut();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__TOOL = eINSTANCE.getCommandLine_Tool();

		/**
		 * The meta object literal for the '<em><b>Optional Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__OPTIONAL_ARG = eINSTANCE.getCommandLine_OptionalArg();

		/**
		 * The meta object literal for the '<em><b>Required Arg</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__REQUIRED_ARG = eINSTANCE.getCommandLine_RequiredArg();

		/**
		 * The meta object literal for the '{@link easyflow.impl.CommandArgumentImpl <em>Command Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.CommandArgumentImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getCommandArgument()
		 * @generated
		 */
		EClass COMMAND_ARGUMENT = eINSTANCE.getCommandArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_ARGUMENT__NAME = eINSTANCE.getCommandArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_ARGUMENT__ARG = eINSTANCE.getCommandArgument_Arg();

		/**
		 * The meta object literal for the '<em><b>Sep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_ARGUMENT__SEP = eINSTANCE.getCommandArgument_Sep();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_ARGUMENT__NAMED = eINSTANCE.getCommandArgument_Named();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_ARGUMENT__REQUIRED = eINSTANCE.getCommandArgument_Required();

		/**
		 * The meta object literal for the '{@link easyflow.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.ToolImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__NAME = eINSTANCE.getTool_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TYPE = eINSTANCE.getTool_Type();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__CATEGORY = eINSTANCE.getTool_Category();

		/**
		 * The meta object literal for the '{@link easyflow.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.ArgumentImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ARG = eINSTANCE.getArgument_Arg();

		/**
		 * The meta object literal for the '<em><b>Sep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__SEP = eINSTANCE.getArgument_Sep();

		/**
		 * The meta object literal for the '{@link easyflow.impl.CSVImpl <em>CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.impl.CSVImpl
		 * @see easyflow.impl.EasyflowPackageImpl#getCSV()
		 * @generated
		 */
		EClass CSV = eINSTANCE.getCSV();

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

		/**
		 * The meta object literal for the '<em>ESet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see easyflow.impl.EasyflowPackageImpl#getESet()
		 * @generated
		 */
		EDataType ESET = eINSTANCE.getESet();

		/**
		 * The meta object literal for the '<em>Edge Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jgrapht.EdgeFactory
		 * @see easyflow.impl.EasyflowPackageImpl#getEdgeFactory()
		 * @generated
		 */
		EDataType EDGE_FACTORY = eINSTANCE.getEdgeFactory();

		/**
		 * The meta object literal for the '<em>Json Root Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argo.jdom.JsonRootNode
		 * @see easyflow.impl.EasyflowPackageImpl#getJsonRootNode()
		 * @generated
		 */
		EDataType JSON_ROOT_NODE = eINSTANCE.getJsonRootNode();

	}

} //EasyflowPackage
