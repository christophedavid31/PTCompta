/**
 */
package fr.logiprolls.ptcompta.shop.tests;

import fr.logiprolls.ptcompta.shop.MChequePayment;
import fr.logiprolls.ptcompta.shop.MShopFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cheque Payment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChequePaymentTest extends TestCase {

	/**
	 * The fixture for this Cheque Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MChequePayment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChequePaymentTest.class);
	}

	/**
	 * Constructs a new Cheque Payment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequePaymentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cheque Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MChequePayment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cheque Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MChequePayment getFixture() {
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
		setFixture(MShopFactory.eINSTANCE.createChequePayment());
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

} //ChequePaymentTest
