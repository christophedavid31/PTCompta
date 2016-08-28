/**
 */
package fr.logiprolls.ptcompta.shop.tests;

import fr.logiprolls.ptcompta.shop.MElectronicPayment;
import fr.logiprolls.ptcompta.shop.MShopFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Electronic Payment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElectronicPaymentTest extends TestCase {

	/**
	 * The fixture for this Electronic Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MElectronicPayment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElectronicPaymentTest.class);
	}

	/**
	 * Constructs a new Electronic Payment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicPaymentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Electronic Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MElectronicPayment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Electronic Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MElectronicPayment getFixture() {
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
		setFixture(MShopFactory.eINSTANCE.createElectronicPayment());
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

} //ElectronicPaymentTest
