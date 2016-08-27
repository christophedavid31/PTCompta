/**
 */
package fr.logiprolls.ptcompta.shop.tests;

import fr.logiprolls.ptcompta.shop.CashPayment;
import fr.logiprolls.ptcompta.shop.ShopFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cash Payment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CashPaymentTest extends TestCase {

	/**
	 * The fixture for this Cash Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashPayment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CashPaymentTest.class);
	}

	/**
	 * Constructs a new Cash Payment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashPaymentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cash Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CashPayment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cash Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashPayment getFixture() {
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
		setFixture(ShopFactory.eINSTANCE.createCashPayment());
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

} //CashPaymentTest
