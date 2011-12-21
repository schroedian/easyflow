/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.EasyflowPackage
 * @generated
 */
public interface EasyflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EasyflowFactory eINSTANCE = easyflow.impl.EasyflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Easy Flow Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Easy Flow Template</em>'.
	 * @generated
	 */
	EasyFlowTemplate createEasyFlowTemplate();

	/**
	 * Returns a new object of class '<em>Easy Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Easy Flow Configuration</em>'.
	 * @generated
	 */
	EasyFlowConfiguration createEasyFlowConfiguration();

	/**
	 * Returns a new object of class '<em>Easy Flow Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Easy Flow Metadata</em>'.
	 * @generated
	 */
	EasyFlowMetadata createEasyFlowMetadata();

	/**
	 * Returns a new object of class '<em>Data Processing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processing Type</em>'.
	 * @generated
	 */
	DataProcessingType createDataProcessingType();

	/**
	 * Returns a new object of class '<em>Easy Flow Implementation Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Easy Flow Implementation Template</em>'.
	 * @generated
	 */
	EasyFlowImplementationTemplate createEasyFlowImplementationTemplate();

	/**
	 * Returns a new object of class '<em>Workflow Util</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Util</em>'.
	 * @generated
	 */
	WorkflowUtil createWorkflowUtil();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EasyflowPackage getEasyflowPackage();

} //EasyflowFactory
