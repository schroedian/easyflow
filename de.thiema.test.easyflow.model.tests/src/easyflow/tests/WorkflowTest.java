/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tests;

import easyflow.EasyflowFactory;
import easyflow.Workflow;
import easyflow.impl.WorkflowImpl;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link easyflow.Workflow#initDag() <em>Init Dag</em>}</li>
 *   <li>{@link easyflow.Workflow#generateDag() <em>Generate Dag</em>}</li>
 *   <li>{@link easyflow.Workflow#writeMakeflow() <em>Write Makeflow</em>}</li>
 *   <li>{@link easyflow.Workflow#writeAWSCloudFormation() <em>Write AWS Cloud Formation</em>}</li>
 *   <li>{@link easyflow.Workflow#readWorkflowTemplate() <em>Read Workflow Template</em>}</li>
 *   <li>{@link easyflow.Workflow#Task(java.lang.String, java.lang.String, java.lang.String) <em>Task</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class WorkflowTest extends TestCase {

	/**
	 * The fixture for this Workflow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Workflow fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkflowTest.class);
	}

	/**
	 * Constructs a new Workflow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Workflow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Workflow fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Workflow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Workflow getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EasyflowFactory.eINSTANCE.createWorkflow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link easyflow.Workflow#initDag() <em>Init Dag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.Workflow#initDag()
	 * @generated
	 */
	public void testInitDag() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link easyflow.Workflow#generateDag() <em>Generate Dag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.Workflow#generateDag()
	 * @generated
	 */
	public void testGenerateDag() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link easyflow.Workflow#writeMakeflow() <em>Write Makeflow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.Workflow#writeMakeflow()
	 * @generated
	 */
	public void testWriteMakeflow() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link easyflow.Workflow#writeAWSCloudFormation() <em>Write AWS Cloud Formation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.Workflow#writeAWSCloudFormation()
	 * @generated
	 */
	public void testWriteAWSCloudFormation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link easyflow.Workflow#readWorkflowTemplate() <em>Read Workflow Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.Workflow#readWorkflowTemplate()
	 * @generated
	 */
	public void testReadWorkflowTemplate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		Workflow testWorkflow=new WorkflowImpl();
		testWorkflow.setMetadataFileName("/usr/home/heinz/workspace/easyflow_bak/metadata.cfg");
		testWorkflow.setWorkflowTemplateFileName("/usr/home/heinz/workspace/easyflow_bak/workflow.wtpl");
		
		testWorkflow.readWorkflowTemplate();
	}

	/**
	 * Tests the '{@link easyflow.Workflow#Task(java.lang.String, java.lang.String, java.lang.String) <em>Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.Workflow#Task(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testTask__String_String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //WorkflowTest
