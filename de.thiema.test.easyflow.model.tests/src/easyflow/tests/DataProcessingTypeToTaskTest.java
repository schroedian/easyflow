/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tests;

import easyflow.DataProcessingType;
import easyflow.EasyflowFactory;
import easyflow.EasyflowPackage;
import easyflow.Task;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Processing Type To Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataProcessingTypeToTaskTest extends TestCase {

	/**
	 * The fixture for this Data Processing Type To Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<DataProcessingType, Task> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataProcessingTypeToTaskTest.class);
	}

	/**
	 * Constructs a new Data Processing Type To Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingTypeToTaskTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Processing Type To Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<DataProcessingType, Task> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Processing Type To Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<DataProcessingType, Task> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<DataProcessingType, Task>)EasyflowFactory.eINSTANCE.create(EasyflowPackage.Literals.DATA_PROCESSING_TYPE_TO_TASK));
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

} //DataProcessingTypeToTaskTest
