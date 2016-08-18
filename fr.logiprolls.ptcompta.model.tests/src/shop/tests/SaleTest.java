/**
 */
package shop.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shop.Sale;
import shop.ShopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SaleTest extends TestCase {

	/**
	 * The fixture for this Sale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sale fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SaleTest.class);
	}

	/**
	 * Constructs a new Sale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sale fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sale getFixture() {
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
		setFixture(ShopFactory.eINSTANCE.createSale());
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

} //SaleTest
