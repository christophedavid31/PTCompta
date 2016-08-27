/**
 */
package fr.logiprolls.ptcompta.shop.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>shop</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShopTests extends TestSuite {

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
		TestSuite suite = new ShopTests("shop Tests");
		suite.addTestSuite(CustomerTest.class);
		suite.addTestSuite(EmployeeTest.class);
		suite.addTestSuite(AccountBookTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopTests(String name) {
		super(name);
	}

} //ShopTests
