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
 * A test suite for the '<em><b>Easyflow</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class EasyflowAllTests extends TestSuite {

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
		TestSuite suite = new EasyflowAllTests("Easyflow Tests");
		suite.addTest(EasyflowTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowAllTests(String name) {
		super(name);
	}

} //EasyflowAllTests
