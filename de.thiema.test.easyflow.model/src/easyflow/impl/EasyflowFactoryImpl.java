/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import argo.jdom.JsonRootNode;
import easyflow.Argument;
import easyflow.CSV;
import easyflow.CommandArgument;
import easyflow.CommandLine;
import easyflow.*;
import java.util.Map;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import easyflow.SplitCriterion;
import easyflow.Task;
import easyflow.Tool;
import easyflow.TraversalCriterion;
import easyflow.Workflow;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EasyflowFactoryImpl extends EFactoryImpl implements EasyflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EasyflowFactory init() {
		try {
			EasyflowFactory theEasyflowFactory = (EasyflowFactory)EPackage.Registry.INSTANCE.getEFactory("ns_uri"); 
			if (theEasyflowFactory != null) {
				return theEasyflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EasyflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EasyflowPackage.WORKFLOW: return createWorkflow();
			case EasyflowPackage.TASK: return createTask();
			case EasyflowPackage.EASY_FLOW_TEMPLATE: return createEasyFlowTemplate();
			case EasyflowPackage.EASY_FLOW_CONFIGURATION: return createEasyFlowConfiguration();
			case EasyflowPackage.EASY_FLOW_METADATA: return createEasyFlowMetadata();
			case EasyflowPackage.DATA_PROCESSING_TYPE: return createDataProcessingType();
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE: return createEasyFlowImplementationTemplate();
			case EasyflowPackage.DATA_PROCESSING_TYPE_TO_TASK: return (EObject)createDataProcessingTypeToTask();
			case EasyflowPackage.COMMAND_LINE: return createCommandLine();
			case EasyflowPackage.COMMAND_ARGUMENT: return createCommandArgument();
			case EasyflowPackage.TOOL: return createTool();
			case EasyflowPackage.ARGUMENT: return createArgument();
			case EasyflowPackage.CSV: return createCSV();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EasyflowPackage.DATA_FORMAT:
				return createDataFormatFromString(eDataType, initialValue);
			case EasyflowPackage.DATA_CRITERION:
				return createDataCriterionFromString(eDataType, initialValue);
			case EasyflowPackage.TRAVERSAL_CRITERION:
				return createTraversalCriterionFromString(eDataType, initialValue);
			case EasyflowPackage.SPLIT_CRITERION:
				return createSplitCriterionFromString(eDataType, initialValue);
			case EasyflowPackage.DAG:
				return createDagFromString(eDataType, initialValue);
			case EasyflowPackage.ESET:
				return createESetFromString(eDataType, initialValue);
			case EasyflowPackage.EDGE_FACTORY:
				return createEdgeFactoryFromString(eDataType, initialValue);
			case EasyflowPackage.JSON_ROOT_NODE:
				return createJsonRootNodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EasyflowPackage.DATA_FORMAT:
				return convertDataFormatToString(eDataType, instanceValue);
			case EasyflowPackage.DATA_CRITERION:
				return convertDataCriterionToString(eDataType, instanceValue);
			case EasyflowPackage.TRAVERSAL_CRITERION:
				return convertTraversalCriterionToString(eDataType, instanceValue);
			case EasyflowPackage.SPLIT_CRITERION:
				return convertSplitCriterionToString(eDataType, instanceValue);
			case EasyflowPackage.DAG:
				return convertDagToString(eDataType, instanceValue);
			case EasyflowPackage.ESET:
				return convertESetToString(eDataType, instanceValue);
			case EasyflowPackage.EDGE_FACTORY:
				return convertEdgeFactoryToString(eDataType, instanceValue);
			case EasyflowPackage.JSON_ROOT_NODE:
				return convertJsonRootNodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowTemplate createEasyFlowTemplate() {
		EasyFlowTemplateImpl easyFlowTemplate = new EasyFlowTemplateImpl();
		return easyFlowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowConfiguration createEasyFlowConfiguration() {
		EasyFlowConfigurationImpl easyFlowConfiguration = new EasyFlowConfigurationImpl();
		return easyFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowMetadata createEasyFlowMetadata() {
		EasyFlowMetadataImpl easyFlowMetadata = new EasyFlowMetadataImpl();
		return easyFlowMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingType createDataProcessingType() {
		DataProcessingTypeImpl dataProcessingType = new DataProcessingTypeImpl();
		return dataProcessingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowImplementationTemplate createEasyFlowImplementationTemplate() {
		EasyFlowImplementationTemplateImpl easyFlowImplementationTemplate = new EasyFlowImplementationTemplateImpl();
		return easyFlowImplementationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<DataProcessingType, Task> createDataProcessingTypeToTask() {
		DataProcessingTypeToTaskImpl dataProcessingTypeToTask = new DataProcessingTypeToTaskImpl();
		return dataProcessingTypeToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLine createCommandLine() {
		CommandLineImpl commandLine = new CommandLineImpl();
		return commandLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandArgument createCommandArgument() {
		CommandArgumentImpl commandArgument = new CommandArgumentImpl();
		return commandArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV createCSV() {
		CSVImpl csv = new CSVImpl();
		return csv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat createDataFormatFromString(EDataType eDataType, String initialValue) {
		DataFormat result = DataFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCriterion createDataCriterionFromString(EDataType eDataType, String initialValue) {
		DataCriterion result = DataCriterion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataCriterionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalCriterion createTraversalCriterionFromString(EDataType eDataType, String initialValue) {
		TraversalCriterion result = TraversalCriterion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTraversalCriterionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitCriterion createSplitCriterionFromString(EDataType eDataType, String initialValue) {
		SplitCriterion result = SplitCriterion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSplitCriterionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenableDirectedGraph createDagFromString(EDataType eDataType, String initialValue) {
		return (ListenableDirectedGraph)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDagToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createESetFromString(EDataType eDataType, String initialValue) {
		return (Set)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeFactory createEdgeFactoryFromString(EDataType eDataType, String initialValue) {
		return (EdgeFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonRootNode createJsonRootNodeFromString(EDataType eDataType, String initialValue) {
		return (JsonRootNode)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonRootNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowPackage getEasyflowPackage() {
		return (EasyflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EasyflowPackage getPackage() {
		return EasyflowPackage.eINSTANCE;
	}

} //EasyflowFactoryImpl
