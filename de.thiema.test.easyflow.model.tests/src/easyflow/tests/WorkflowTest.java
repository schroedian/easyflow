/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jgraph.graph.Edge;
import org.jgrapht.graph.ListenableDirectedGraph;

import easyflow.DataProcessingType;
import easyflow.EasyFlowConfiguration;
import easyflow.EasyFlowImplementationTemplate;
import easyflow.EasyFlowMetadata;
import easyflow.EasyFlowTemplate;
import easyflow.EasyflowFactory;
import easyflow.Task;
import easyflow.Workflow;
import easyflow.impl.WorkflowUtilImpl;
import easyflow.impl.EasyFlowConfigurationImpl;
import easyflow.impl.EasyFlowImplementationTemplateImpl;
import easyflow.impl.EasyFlowMetadataImpl;
import easyflow.impl.EasyFlowTemplateImpl;
import easyflow.impl.EasyflowFactoryImpl;
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
 * </ul>
 * </p>
 * @generated
 */
public class WorkflowTest extends TestCase {
	protected static WorkflowUtilImpl workflowUtil=new WorkflowUtilImpl();
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
	 */
	public void testReadWorkflowTemplate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EasyflowFactoryImpl ef=new EasyflowFactoryImpl();
		//EasyFlowConfiguration projectCfg=new EasyFlowConfigurationImpl();
		EasyFlowConfiguration projectCfg=ef.createEasyFlowConfiguration();
		projectCfg.setFileName("/usr/home/heinz/workspace/easyflow_bak/main.json");
		try {
			projectCfg.configFileReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(projectCfg.toString());
		//EasyFlowTemplate easyflowTpl = new EasyFlowTemplateImpl();
		Workflow testWorkflow=ef.createWorkflow();;
		System.out.println(projectCfg.getConfigMap());
		
		//System.exit(1);
		EasyFlowTemplate easyflowTpl =ef.createEasyFlowTemplate(); 
		easyflowTpl.setFileName(projectCfg.getConfigMap().get("workflowTemplateFile"));
		//ListenableDirectedGraph<Task,Edge> dag=
		System.out.println(testWorkflow.getLastTaskClassMap());
		//(Map<DataProcessingType, Task>) testWorkflow.getLastTaskClassMap())
		Map<DataProcessingType, Task> lastTaskClassMap=new HashMap<DataProcessingType, Task>();
		testWorkflow.setDag(easyflowTpl.generateDAGFromTemplateFile(lastTaskClassMap));
		workflowUtil.checkDAG(testWorkflow.getDag());
		//testWorkflow.setL
		//testWorkflow.set
		/*read the metadata
		EasyFlowMetadata metadataTpl = ef.createEasyFlowMetadata();
		metadataTpl.setFileName(projectCfg.getConfigMap().get("metadataFile"));
		*/
		EasyFlowImplementationTemplate implTpl =ef.createEasyFlowImplementationTemplate(); 
		implTpl.setFileName(projectCfg.getConfigMap().get("implementationTemplateFile"));
		implTpl.templateFileParser(testWorkflow.getDag());
		workflowUtil.firstDAGWalker(testWorkflow.getDag());
		//testWorkflow.setConfiguration(projectCfg);
		
		//testWorkflow.readWorkflowTemplate();
	}

} //WorkflowTest
