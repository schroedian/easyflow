/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.ListenableDirectedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.Workflow#getDag <em>Dag</em>}</li>
 *   <li>{@link easyflow.Workflow#getWorkflowTemplateFileName <em>Workflow Template File Name</em>}</li>
 *   <li>{@link easyflow.Workflow#getMetadataFileName <em>Metadata File Name</em>}</li>
 *   <li>{@link easyflow.Workflow#getWorkflowTemplate <em>Workflow Template</em>}</li>
 *   <li>{@link easyflow.Workflow#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link easyflow.Workflow#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link easyflow.Workflow#getImplementationTemplate <em>Implementation Template</em>}</li>
 *   <li>{@link easyflow.Workflow#getDataProcessingType <em>Data Processing Type</em>}</li>
 *   <li>{@link easyflow.Workflow#getWorkflowUtil <em>Workflow Util</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.EasyflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
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
	 * @see easyflow.EasyflowPackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dag</em>' attribute.
	 * @see #setDag(ListenableDirectedGraph)
	 * @see easyflow.EasyflowPackage#getWorkflow_Dag()
	 * @model dataType="easyflow.Dag"
	 * @generated
	 */
	ListenableDirectedGraph getDag();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getDag <em>Dag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dag</em>' attribute.
	 * @see #getDag()
	 * @generated
	 */
	void setDag(ListenableDirectedGraph value);

	/**
	 * Returns the value of the '<em><b>Workflow Template File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow Template File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Template File Name</em>' attribute.
	 * @see #setWorkflowTemplateFileName(String)
	 * @see easyflow.EasyflowPackage#getWorkflow_WorkflowTemplateFileName()
	 * @model
	 * @generated
	 */
	String getWorkflowTemplateFileName();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getWorkflowTemplateFileName <em>Workflow Template File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Template File Name</em>' attribute.
	 * @see #getWorkflowTemplateFileName()
	 * @generated
	 */
	void setWorkflowTemplateFileName(String value);

	/**
	 * Returns the value of the '<em><b>Metadata File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata File Name</em>' attribute.
	 * @see #setMetadataFileName(String)
	 * @see easyflow.EasyflowPackage#getWorkflow_MetadataFileName()
	 * @model
	 * @generated
	 */
	String getMetadataFileName();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getMetadataFileName <em>Metadata File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata File Name</em>' attribute.
	 * @see #getMetadataFileName()
	 * @generated
	 */
	void setMetadataFileName(String value);

	/**
	 * Returns the value of the '<em><b>Workflow Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Template</em>' reference.
	 * @see #setWorkflowTemplate(EasyFlowTemplate)
	 * @see easyflow.EasyflowPackage#getWorkflow_WorkflowTemplate()
	 * @model
	 * @generated
	 */
	EasyFlowTemplate getWorkflowTemplate();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getWorkflowTemplate <em>Workflow Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Template</em>' reference.
	 * @see #getWorkflowTemplate()
	 * @generated
	 */
	void setWorkflowTemplate(EasyFlowTemplate value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(EasyFlowConfiguration)
	 * @see easyflow.EasyflowPackage#getWorkflow_Configuration()
	 * @model
	 * @generated
	 */
	EasyFlowConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(EasyFlowConfiguration value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference.
	 * @see #setMetadata(EasyFlowMetadata)
	 * @see easyflow.EasyflowPackage#getWorkflow_Metadata()
	 * @model
	 * @generated
	 */
	EasyFlowMetadata getMetadata();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getMetadata <em>Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(EasyFlowMetadata value);

	/**
	 * Returns the value of the '<em><b>Implementation Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Template</em>' reference.
	 * @see #setImplementationTemplate(EasyFlowImplementationTemplate)
	 * @see easyflow.EasyflowPackage#getWorkflow_ImplementationTemplate()
	 * @model
	 * @generated
	 */
	EasyFlowImplementationTemplate getImplementationTemplate();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getImplementationTemplate <em>Implementation Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Template</em>' reference.
	 * @see #getImplementationTemplate()
	 * @generated
	 */
	void setImplementationTemplate(EasyFlowImplementationTemplate value);

	/**
	 * Returns the value of the '<em><b>Data Processing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Processing Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Processing Type</em>' reference.
	 * @see #setDataProcessingType(DataProcessingType)
	 * @see easyflow.EasyflowPackage#getWorkflow_DataProcessingType()
	 * @model
	 * @generated
	 */
	DataProcessingType getDataProcessingType();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getDataProcessingType <em>Data Processing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Processing Type</em>' reference.
	 * @see #getDataProcessingType()
	 * @generated
	 */
	void setDataProcessingType(DataProcessingType value);

	/**
	 * Returns the value of the '<em><b>Workflow Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow Util</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Util</em>' reference.
	 * @see #setWorkflowUtil(WorkflowUtil)
	 * @see easyflow.EasyflowPackage#getWorkflow_WorkflowUtil()
	 * @model
	 * @generated
	 */
	WorkflowUtil getWorkflowUtil();

	/**
	 * Sets the value of the '{@link easyflow.Workflow#getWorkflowUtil <em>Workflow Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Util</em>' reference.
	 * @see #getWorkflowUtil()
	 * @generated
	 */
	void setWorkflowUtil(WorkflowUtil value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initDag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateDag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeMakeflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeAWSCloudFormation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readWorkflowTemplate();

} // Workflow
