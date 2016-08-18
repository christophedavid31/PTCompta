/**
 */
package shop.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shop.Shop;
import shop.ShopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShopTest extends TestCase {

	/**
	 * The fixture for this Shop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shop fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShopTest.class);
	}

	/**
	 * Constructs a new Shop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Shop fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shop getFixture() {
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
		setFixture(ShopFactory.eINSTANCE.createShop());
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

    public void testInstance()
    {
        assertNotNull(fixture);
    }
} //ShopTest
