/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>easyflow</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EasyflowTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EasyflowTests("easyflow Tests");
		suite.addTestSuite(WorkflowTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(EasyFlowTemplateTest.class);
		suite.addTestSuite(EasyFlowConfigurationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowTests(String name) {
		super(name);
	}

} //EasyflowTests
