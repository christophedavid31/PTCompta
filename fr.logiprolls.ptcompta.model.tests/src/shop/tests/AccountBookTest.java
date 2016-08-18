/**
 */
package shop.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shop.AccountBook;
import shop.ShopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Account Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link shop.AccountBook#depositCash(float) <em>Deposit Cash</em>}</li>
 *   <li>{@link shop.AccountBook#depositCheque(shop.ChequePayment) <em>Deposit Cheque</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AccountBookTest extends TestCase {

	/**
	 * The fixture for this Account Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountBook fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccountBookTest.class);
	}

	/**
	 * Constructs a new Account Book test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountBookTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Account Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AccountBook fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Account Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountBook getFixture() {
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
		setFixture(ShopFactory.eINSTANCE.createAccountBook());
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
	 * Tests the '{@link shop.AccountBook#depositCash(float) <em>Deposit Cash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shop.AccountBook#depositCash(float)
	 * @generated
	 */
	public void testDepositCash__float() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link shop.AccountBook#depositCheque(shop.ChequePayment) <em>Deposit Cheque</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shop.AccountBook#depositCheque(shop.ChequePayment)
	 * @generated
	 */
	public void testDepositCheque__ChequePayment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AccountBookTest
