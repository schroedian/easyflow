/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.util;

import easyflow.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see easyflow.EasyflowPackage
 * @generated
 */
public class EasyflowValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EasyflowValidator INSTANCE = new EasyflowValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "easyflow";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EasyflowPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EasyflowPackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case EasyflowPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case EasyflowPackage.EASY_FLOW_TEMPLATE:
				return validateEasyFlowTemplate((EasyFlowTemplate)value, diagnostics, context);
			case EasyflowPackage.EASY_FLOW_CONFIGURATION:
				return validateEasyFlowConfiguration((EasyFlowConfiguration)value, diagnostics, context);
			case EasyflowPackage.EASY_FLOW_METADATA:
				return validateEasyFlowMetadata((EasyFlowMetadata)value, diagnostics, context);
			case EasyflowPackage.DATA_PROCESSING_TYPE:
				return validateDataProcessingType((DataProcessingType)value, diagnostics, context);
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE:
				return validateEasyFlowImplementationTemplate((EasyFlowImplementationTemplate)value, diagnostics, context);
			case EasyflowPackage.DATA_PROCESSING_TYPE_TO_TASK:
				return validateDataProcessingTypeToTask((Map.Entry<?, ?>)value, diagnostics, context);
			case EasyflowPackage.DATA_FORMAT:
				return validateDataFormat((DataFormat)value, diagnostics, context);
			case EasyflowPackage.DATA_CRITERION:
				return validateDataCriterion((DataCriterion)value, diagnostics, context);
			case EasyflowPackage.TRAVERSAL_CRITERION:
				return validateTraversalCriterion((TraversalCriterion)value, diagnostics, context);
			case EasyflowPackage.SPLIT_CRITERION:
				return validateSplitCriterion((SplitCriterion)value, diagnostics, context);
			case EasyflowPackage.DAG:
				return validateDag(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEasyFlowTemplate(EasyFlowTemplate easyFlowTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(easyFlowTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEasyFlowConfiguration(EasyFlowConfiguration easyFlowConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(easyFlowConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEasyFlowMetadata(EasyFlowMetadata easyFlowMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(easyFlowMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProcessingType(DataProcessingType dataProcessingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataProcessingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEasyFlowImplementationTemplate(EasyFlowImplementationTemplate easyFlowImplementationTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(easyFlowImplementationTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProcessingTypeToTask(Map.Entry<?, ?> dataProcessingTypeToString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataProcessingTypeToString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFormat(DataFormat dataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCriterion(DataCriterion dataCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraversalCriterion(TraversalCriterion traversalCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitCriterion(SplitCriterion splitCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDag(Object dag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDataFormatList(ArrayList<?> eDataFormatList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEDataFormatList_ItemType(eDataFormatList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>EData Format List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDataFormatList_ItemType(ArrayList<?> eDataFormatList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = eDataFormatList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (EasyflowPackage.Literals.DATA_FORMAT.isInstance(item)) {
				result &= validateDataFormat((DataFormat)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(EasyflowPackage.Literals.DATA_FORMAT, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EasyflowValidator
