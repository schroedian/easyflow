/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import argo.jdom.JsonRootNode;
import easyflow.Argument;
import easyflow.CommandArgument;
import easyflow.CommandLine;
import java.util.Map;

import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.ListenableDirectedGraph;

import easyflow.DataCriterion;
import easyflow.DataFormat;
import easyflow.DataProcessingType;
import easyflow.EasyFlowConfiguration;
import easyflow.EasyFlowImplementationTemplate;
import easyflow.EasyFlowMetadata;
import easyflow.EasyFlowTemplate;
import easyflow.EasyflowFactory;
import easyflow.EasyflowPackage;
import easyflow.IWorkflowUtil;
import easyflow.Option;
import easyflow.SplitCriterion;
import easyflow.Task;
import easyflow.Tool;
import easyflow.TraversalCriterion;
import easyflow.Util;
import easyflow.Workflow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EasyflowPackageImpl extends EPackageImpl implements EasyflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass easyFlowTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass easyFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass easyFlowMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcessingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass easyFlowImplementationTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcessingTypeToTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iWorkflowUtilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataCriterionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum traversalCriterionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum splitCriterionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dagEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType edgeFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonRootNodeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see easyflow.EasyflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EasyflowPackageImpl() {
		super(eNS_URI, EasyflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EasyflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EasyflowPackage init() {
		if (isInited) return (EasyflowPackage)EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI);

		// Obtain or create and register package
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EasyflowPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEasyflowPackage.createPackageContents();

		// Initialize created meta-data
		theEasyflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEasyflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EasyflowPackage.eNS_URI, theEasyflowPackage);
		return theEasyflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Name() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Dag() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_WorkflowTemplate() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Configuration() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Metadata() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ImplementationTemplate() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_DataProcessingType() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_WorkflowUtil() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_LastTaskClassMap() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_DataCriterion() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_DataFormatIn() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_DataFormatOut() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CardinalityIn() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CardinalityOut() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_IsMultipleInstanceOfDataCriterion() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_SplitCriterion() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TraversalCriterion() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ParentTasks() {
		return (EReference)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_CommandLine() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEasyFlowTemplate() {
		return easyFlowTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowTemplate_FileName() {
		return (EAttribute)easyFlowTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEasyFlowConfiguration() {
		return easyFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowConfiguration_FileName() {
		return (EAttribute)easyFlowConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowConfiguration_ConfigMap() {
		return (EAttribute)easyFlowConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEasyFlowMetadata() {
		return easyFlowMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowMetadata_FileName() {
		return (EAttribute)easyFlowMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProcessingType() {
		return dataProcessingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProcessingType_DataFormatIn() {
		return (EAttribute)dataProcessingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProcessingType_DataFormatOut() {
		return (EAttribute)dataProcessingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEasyFlowImplementationTemplate() {
		return easyFlowImplementationTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowImplementationTemplate_FileName() {
		return (EAttribute)easyFlowImplementationTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowImplementationTemplate_ParameterFileName() {
		return (EAttribute)easyFlowImplementationTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowImplementationTemplate_ParameterConfigMap() {
		return (EAttribute)easyFlowImplementationTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyFlowImplementationTemplate_JsonRootNode() {
		return (EAttribute)easyFlowImplementationTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProcessingTypeToTask() {
		return dataProcessingTypeToTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProcessingTypeToTask_Key() {
		return (EReference)dataProcessingTypeToTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProcessingTypeToTask_Value() {
		return (EReference)dataProcessingTypeToTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIWorkflowUtil() {
		return iWorkflowUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLine() {
		return commandLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLine_SubCmd() {
		return (EAttribute)commandLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLine_ArgIn() {
		return (EReference)commandLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLine_ArgOut() {
		return (EReference)commandLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLine_Tool() {
		return (EReference)commandLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLine_OptionalArg() {
		return (EReference)commandLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLine_RequiredArg() {
		return (EReference)commandLineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandArgument() {
		return commandArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandArgument_Name() {
		return (EAttribute)commandArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandArgument_Arg() {
		return (EAttribute)commandArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandArgument_Sep() {
		return (EAttribute)commandArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandArgument_Named() {
		return (EAttribute)commandArgumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandArgument_Required() {
		return (EAttribute)commandArgumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Name() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Type() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Category() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Name() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Arg() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Sep() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSV() {
		return csvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataFormat() {
		return dataFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataCriterion() {
		return dataCriterionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTraversalCriterion() {
		return traversalCriterionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSplitCriterion() {
		return splitCriterionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDag() {
		return dagEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getESet() {
		return eSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEdgeFactory() {
		return edgeFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonRootNode() {
		return jsonRootNodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowFactory getEasyflowFactory() {
		return (EasyflowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEAttribute(workflowEClass, WORKFLOW__DAG);
		createEReference(workflowEClass, WORKFLOW__WORKFLOW_TEMPLATE);
		createEReference(workflowEClass, WORKFLOW__CONFIGURATION);
		createEReference(workflowEClass, WORKFLOW__METADATA);
		createEReference(workflowEClass, WORKFLOW__IMPLEMENTATION_TEMPLATE);
		createEReference(workflowEClass, WORKFLOW__DATA_PROCESSING_TYPE);
		createEReference(workflowEClass, WORKFLOW__WORKFLOW_UTIL);
		createEReference(workflowEClass, WORKFLOW__LAST_TASK_CLASS_MAP);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DATA_FORMAT_IN);
		createEAttribute(taskEClass, TASK__DATA_FORMAT_OUT);
		createEAttribute(taskEClass, TASK__CARDINALITY_IN);
		createEAttribute(taskEClass, TASK__CARDINALITY_OUT);
		createEAttribute(taskEClass, TASK__DATA_CRITERION);
		createEAttribute(taskEClass, TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION);
		createEAttribute(taskEClass, TASK__SPLIT_CRITERION);
		createEAttribute(taskEClass, TASK__TRAVERSAL_CRITERION);
		createEReference(taskEClass, TASK__COMMAND_LINE);
		createEReference(taskEClass, TASK__PARENT_TASKS);

		easyFlowTemplateEClass = createEClass(EASY_FLOW_TEMPLATE);
		createEAttribute(easyFlowTemplateEClass, EASY_FLOW_TEMPLATE__FILE_NAME);

		easyFlowConfigurationEClass = createEClass(EASY_FLOW_CONFIGURATION);
		createEAttribute(easyFlowConfigurationEClass, EASY_FLOW_CONFIGURATION__FILE_NAME);
		createEAttribute(easyFlowConfigurationEClass, EASY_FLOW_CONFIGURATION__CONFIG_MAP);

		easyFlowMetadataEClass = createEClass(EASY_FLOW_METADATA);
		createEAttribute(easyFlowMetadataEClass, EASY_FLOW_METADATA__FILE_NAME);

		dataProcessingTypeEClass = createEClass(DATA_PROCESSING_TYPE);
		createEAttribute(dataProcessingTypeEClass, DATA_PROCESSING_TYPE__DATA_FORMAT_IN);
		createEAttribute(dataProcessingTypeEClass, DATA_PROCESSING_TYPE__DATA_FORMAT_OUT);

		easyFlowImplementationTemplateEClass = createEClass(EASY_FLOW_IMPLEMENTATION_TEMPLATE);
		createEAttribute(easyFlowImplementationTemplateEClass, EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME);
		createEAttribute(easyFlowImplementationTemplateEClass, EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME);
		createEAttribute(easyFlowImplementationTemplateEClass, EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP);
		createEAttribute(easyFlowImplementationTemplateEClass, EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE);

		dataProcessingTypeToTaskEClass = createEClass(DATA_PROCESSING_TYPE_TO_TASK);
		createEReference(dataProcessingTypeToTaskEClass, DATA_PROCESSING_TYPE_TO_TASK__KEY);
		createEReference(dataProcessingTypeToTaskEClass, DATA_PROCESSING_TYPE_TO_TASK__VALUE);

		iWorkflowUtilEClass = createEClass(IWORKFLOW_UTIL);

		commandLineEClass = createEClass(COMMAND_LINE);
		createEAttribute(commandLineEClass, COMMAND_LINE__SUB_CMD);
		createEReference(commandLineEClass, COMMAND_LINE__ARG_IN);
		createEReference(commandLineEClass, COMMAND_LINE__ARG_OUT);
		createEReference(commandLineEClass, COMMAND_LINE__TOOL);
		createEReference(commandLineEClass, COMMAND_LINE__OPTIONAL_ARG);
		createEReference(commandLineEClass, COMMAND_LINE__REQUIRED_ARG);

		commandArgumentEClass = createEClass(COMMAND_ARGUMENT);
		createEAttribute(commandArgumentEClass, COMMAND_ARGUMENT__NAME);
		createEAttribute(commandArgumentEClass, COMMAND_ARGUMENT__ARG);
		createEAttribute(commandArgumentEClass, COMMAND_ARGUMENT__SEP);
		createEAttribute(commandArgumentEClass, COMMAND_ARGUMENT__NAMED);
		createEAttribute(commandArgumentEClass, COMMAND_ARGUMENT__REQUIRED);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__NAME);
		createEAttribute(toolEClass, TOOL__TYPE);
		createEAttribute(toolEClass, TOOL__CATEGORY);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);
		createEAttribute(argumentEClass, ARGUMENT__ARG);
		createEAttribute(argumentEClass, ARGUMENT__SEP);

		csvEClass = createEClass(CSV);

		// Create enums
		dataFormatEEnum = createEEnum(DATA_FORMAT);
		dataCriterionEEnum = createEEnum(DATA_CRITERION);
		traversalCriterionEEnum = createEEnum(TRAVERSAL_CRITERION);
		splitCriterionEEnum = createEEnum(SPLIT_CRITERION);

		// Create data types
		dagEDataType = createEDataType(DAG);
		eSetEDataType = createEDataType(ESET);
		edgeFactoryEDataType = createEDataType(EDGE_FACTORY);
		jsonRootNodeEDataType = createEDataType(JSON_ROOT_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Dag(), this.getDag(), "dag", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_WorkflowTemplate(), this.getEasyFlowTemplate(), null, "WorkflowTemplate", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Configuration(), this.getEasyFlowConfiguration(), null, "Configuration", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Metadata(), this.getEasyFlowMetadata(), null, "Metadata", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ImplementationTemplate(), this.getEasyFlowImplementationTemplate(), null, "ImplementationTemplate", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_DataProcessingType(), this.getDataProcessingType(), null, "DataProcessingType", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_WorkflowUtil(), this.getIWorkflowUtil(), null, "WorkflowUtil", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_LastTaskClassMap(), this.getDataProcessingTypeToTask(), null, "LastTaskClassMap", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workflowEClass, null, "initDag", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "generateDag", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "writeMakeflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "writeAWSCloudFormation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "readWorkflowTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_DataFormatIn(), this.getDataFormat(), "dataFormatIn", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_DataFormatOut(), this.getDataFormat(), "dataFormatOut", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CardinalityIn(), ecorePackage.getEShort(), "cardinalityIn", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CardinalityOut(), ecorePackage.getEShort(), "cardinalityOut", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_DataCriterion(), this.getDataCriterion(), "dataCriterion", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsMultipleInstanceOfDataCriterion(), ecorePackage.getEBooleanObject(), "isMultipleInstanceOfDataCriterion", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_SplitCriterion(), this.getSplitCriterion(), "splitCriterion", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TraversalCriterion(), this.getTraversalCriterion(), "TraversalCriterion", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_CommandLine(), this.getCommandLine(), null, "commandLine", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ParentTasks(), this.getTask(), null, "parentTasks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(taskEClass, null, "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "wtplLine", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEString(), "getFilesIn", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFormat(), "dataFormatIn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyFlowTemplateEClass, EasyFlowTemplate.class, "EasyFlowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEasyFlowTemplate_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, EasyFlowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(easyFlowTemplateEClass, this.getDag(), "generateDAGFromTemplateFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(this.getDataProcessingType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyFlowConfigurationEClass, EasyFlowConfiguration.class, "EasyFlowConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEasyFlowConfiguration_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, EasyFlowConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getEasyFlowConfiguration_ConfigMap(), g1, "configMap", null, 0, 1, EasyFlowConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(easyFlowConfigurationEClass, null, "configFileReader", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyFlowMetadataEClass, EasyFlowMetadata.class, "EasyFlowMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEasyFlowMetadata_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, EasyFlowMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(easyFlowMetadataEClass, null, "metadataFileReader", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataProcessingTypeEClass, DataProcessingType.class, "DataProcessingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataProcessingType_DataFormatIn(), this.getDataFormat(), "dataFormatIn", null, 0, 1, DataProcessingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProcessingType_DataFormatOut(), this.getDataFormat(), "dataFormatOut", null, 0, 1, DataProcessingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataProcessingTypeEClass, ecorePackage.getEBoolean(), "isConvertableTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataProcessingType(), "dataProcessingTypeOut", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyFlowImplementationTemplateEClass, EasyFlowImplementationTemplate.class, "EasyFlowImplementationTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEasyFlowImplementationTemplate_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, EasyFlowImplementationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEasyFlowImplementationTemplate_ParameterFileName(), ecorePackage.getEString(), "parameterFileName", null, 0, 1, EasyFlowImplementationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getEasyFlowImplementationTemplate_ParameterConfigMap(), g1, "parameterConfigMap", null, 0, 1, EasyFlowImplementationTemplate.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEasyFlowImplementationTemplate_JsonRootNode(), this.getJsonRootNode(), "jsonRootNode", null, 0, 1, EasyFlowImplementationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(easyFlowImplementationTemplateEClass, null, "templateFileParser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDag(), "dag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(easyFlowImplementationTemplateEClass, null, "readParameterConfig", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "toolName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(easyFlowImplementationTemplateEClass, null, "initJsonRootNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataProcessingTypeToTaskEClass, Map.Entry.class, "DataProcessingTypeToTask", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProcessingTypeToTask_Key(), this.getDataProcessingType(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProcessingTypeToTask_Value(), this.getTask(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iWorkflowUtilEClass, IWorkflowUtil.class, "IWorkflowUtil", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iWorkflowUtilEClass, this.getTask(), "getAllTasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowUtilEClass, this.getTask(), "getTasksFromLastTaskClass", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getDataFormat());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataFormatIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getDataFormat());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataFormatOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getDataProcessingType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowUtilEClass, this.getTask(), "getTaskFromLastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataProcessingType(), "dataProcessingTypeIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getDataProcessingType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowUtilEClass, null, "updateLastTaskClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getDataFormat());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataFormatIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getDataFormat());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataFormatOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getDataProcessingType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowUtilEClass, null, "updateLastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataProcessingType(), "dataProcessingType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getDataProcessingType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowUtilEClass, null, "addTaskListToDAG", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDag(), "dag", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTasks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "curTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowUtilEClass, null, "getTaskByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getESet(), "taskSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "rawTaskNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iWorkflowUtilEClass, null, "printLastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getDataProcessingType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "lastTaskClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandLineEClass, CommandLine.class, "CommandLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandLine_SubCmd(), ecorePackage.getEString(), "subCmd", null, 0, 1, CommandLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLine_ArgIn(), this.getCommandArgument(), null, "argIn", null, 0, -1, CommandLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLine_ArgOut(), this.getCommandArgument(), null, "argOut", null, 0, -1, CommandLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLine_Tool(), this.getTool(), null, "tool", null, 0, 1, CommandLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLine_OptionalArg(), this.getCommandArgument(), null, "optionalArg", null, 0, -1, CommandLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLine_RequiredArg(), this.getCommandArgument(), null, "requiredArg", null, 0, -1, CommandLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(commandLineEClass, ecorePackage.getEString(), "printCommandLine", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandLineEClass, null, "setCmdProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameterConfigMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandArgumentEClass, CommandArgument.class, "CommandArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, CommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandArgument_Arg(), ecorePackage.getEString(), "arg", null, 0, 1, CommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandArgument_Sep(), ecorePackage.getEString(), "sep", null, 0, 1, CommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandArgument_Named(), ecorePackage.getEBoolean(), "named", null, 0, 1, CommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandArgument_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, CommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Type(), ecorePackage.getEString(), "type", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Category(), ecorePackage.getEString(), "category", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Arg(), ecorePackage.getEString(), "arg", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Sep(), ecorePackage.getEString(), "sep", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvEClass, easyflow.CSV.class, "CSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataFormatEEnum, DataFormat.class, "DataFormat");
		addEEnumLiteral(dataFormatEEnum, DataFormat.NONE);
		addEEnumLiteral(dataFormatEEnum, DataFormat.FASTQ);
		addEEnumLiteral(dataFormatEEnum, DataFormat.SAM);
		addEEnumLiteral(dataFormatEEnum, DataFormat.BAM);
		addEEnumLiteral(dataFormatEEnum, DataFormat.VCF);
		addEEnumLiteral(dataFormatEEnum, DataFormat.BCF);
		addEEnumLiteral(dataFormatEEnum, DataFormat.TXT);
		addEEnumLiteral(dataFormatEEnum, DataFormat.CSV);
		addEEnumLiteral(dataFormatEEnum, DataFormat.BAI);
		addEEnumLiteral(dataFormatEEnum, DataFormat.SAI);
		addEEnumLiteral(dataFormatEEnum, DataFormat.VCF_IDX);
		addEEnumLiteral(dataFormatEEnum, DataFormat.FASTA);
		addEEnumLiteral(dataFormatEEnum, DataFormat.BWT);
		addEEnumLiteral(dataFormatEEnum, DataFormat.DICT);
		addEEnumLiteral(dataFormatEEnum, DataFormat.FAI);
		addEEnumLiteral(dataFormatEEnum, DataFormat.INTERVAL_LIST);

		initEEnum(dataCriterionEEnum, DataCriterion.class, "DataCriterion");
		addEEnumLiteral(dataCriterionEEnum, DataCriterion.READ_GROUP);
		addEEnumLiteral(dataCriterionEEnum, DataCriterion.SAMPLE);
		addEEnumLiteral(dataCriterionEEnum, DataCriterion.LIBRARY);
		addEEnumLiteral(dataCriterionEEnum, DataCriterion.NONE);

		initEEnum(traversalCriterionEEnum, TraversalCriterion.class, "TraversalCriterion");
		addEEnumLiteral(traversalCriterionEEnum, TraversalCriterion.LOCUS);
		addEEnumLiteral(traversalCriterionEEnum, TraversalCriterion.READ);
		addEEnumLiteral(traversalCriterionEEnum, TraversalCriterion.NONE);
		addEEnumLiteral(traversalCriterionEEnum, TraversalCriterion.READ_PAIR);

		initEEnum(splitCriterionEEnum, SplitCriterion.class, "SplitCriterion");
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.CONTIG);
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.INTERVAL);
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.READ);
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.LIBRARY);
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.SAMPLE);
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.READ_GROUP);
		addEEnumLiteral(splitCriterionEEnum, SplitCriterion.NONE);

		// Initialize data types
		initEDataType(dagEDataType, ListenableDirectedGraph.class, "Dag", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eSetEDataType, Set.class, "ESet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(edgeFactoryEDataType, EdgeFactory.class, "EdgeFactory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonRootNodeEDataType, JsonRootNode.class, "JsonRootNode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EasyflowPackageImpl
