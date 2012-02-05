/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tests;

import easyflow.CSV;
import easyflow.EasyflowFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CSV</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSVTest extends TestCase {

	/**
	 * The fixture for this CSV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSV fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CSVTest.class);
	}

	/**
	 * Constructs a new CSV test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this CSV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CSV fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this CSV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSV getFixture() {
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
		setFixture(EasyflowFactory.eINSTANCE.createCSV());
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

} //CSVTest
