/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.util;

import easyflow.*;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.EasyflowPackage
 * @generated
 */
public class EasyflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EasyflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EasyflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EasyflowSwitch<Adapter> modelSwitch =
		new EasyflowSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseEasyFlowTemplate(EasyFlowTemplate object) {
				return createEasyFlowTemplateAdapter();
			}
			@Override
			public Adapter caseEasyFlowConfiguration(EasyFlowConfiguration object) {
				return createEasyFlowConfigurationAdapter();
			}
			@Override
			public Adapter caseEasyFlowMetadata(EasyFlowMetadata object) {
				return createEasyFlowMetadataAdapter();
			}
			@Override
			public Adapter caseDataProcessingType(DataProcessingType object) {
				return createDataProcessingTypeAdapter();
			}
			@Override
			public Adapter caseEasyFlowImplementationTemplate(EasyFlowImplementationTemplate object) {
				return createEasyFlowImplementationTemplateAdapter();
			}
			@Override
			public Adapter caseDataProcessingTypeToTask(Map.Entry<DataProcessingType, Task> object) {
				return createDataProcessingTypeToTaskAdapter();
			}
			@Override
			public Adapter caseIWorkflowUtil(IWorkflowUtil object) {
				return createIWorkflowUtilAdapter();
			}
			@Override
			public Adapter caseCommandLine(CommandLine object) {
				return createCommandLineAdapter();
			}
			@Override
			public Adapter caseCommandArgument(CommandArgument object) {
				return createCommandArgumentAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseCSV(CSV object) {
				return createCSVAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link easyflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.EasyFlowTemplate <em>Easy Flow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.EasyFlowTemplate
	 * @generated
	 */
	public Adapter createEasyFlowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.EasyFlowConfiguration <em>Easy Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.EasyFlowConfiguration
	 * @generated
	 */
	public Adapter createEasyFlowConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.EasyFlowMetadata <em>Easy Flow Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.EasyFlowMetadata
	 * @generated
	 */
	public Adapter createEasyFlowMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.DataProcessingType <em>Data Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.DataProcessingType
	 * @generated
	 */
	public Adapter createDataProcessingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.EasyFlowImplementationTemplate <em>Easy Flow Implementation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.EasyFlowImplementationTemplate
	 * @generated
	 */
	public Adapter createEasyFlowImplementationTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Data Processing Type To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createDataProcessingTypeToTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.IWorkflowUtil <em>IWorkflow Util</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.IWorkflowUtil
	 * @generated
	 */
	public Adapter createIWorkflowUtilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.CommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.CommandLine
	 * @generated
	 */
	public Adapter createCommandLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.CommandArgument <em>Command Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.CommandArgument
	 * @generated
	 */
	public Adapter createCommandArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.CSV
	 * @generated
	 */
	public Adapter createCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EasyflowAdapterFactory
