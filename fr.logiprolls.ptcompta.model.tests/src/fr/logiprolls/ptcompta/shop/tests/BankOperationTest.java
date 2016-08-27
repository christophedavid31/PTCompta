/**
 */
package fr.logiprolls.ptcompta.shop.tests;

import fr.logiprolls.ptcompta.shop.BankOperation;
import fr.logiprolls.ptcompta.shop.ShopFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bank Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankOperationTest extends TestCase {

	/**
	 * The fixture for this Bank Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankOperation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BankOperationTest.class);
	}

	/**
	 * Constructs a new Bank Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankOperationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bank Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BankOperation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bank Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankOperation getFixture() {
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
		setFixture(ShopFactory.eINSTANCE.createBankOperation());
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

} //BankOperationTest
