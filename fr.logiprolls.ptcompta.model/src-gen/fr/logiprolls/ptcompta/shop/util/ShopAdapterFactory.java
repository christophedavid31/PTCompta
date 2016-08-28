/**
 */
package fr.logiprolls.ptcompta.shop.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.logiprolls.ptcompta.shop.MAccountBook;
import fr.logiprolls.ptcompta.shop.MBankOperation;
import fr.logiprolls.ptcompta.shop.MCashPayment;
import fr.logiprolls.ptcompta.shop.MChequePayment;
import fr.logiprolls.ptcompta.shop.MCustomer;
import fr.logiprolls.ptcompta.shop.MElectronicPayment;
import fr.logiprolls.ptcompta.shop.MEmployee;
import fr.logiprolls.ptcompta.shop.MPayment;
import fr.logiprolls.ptcompta.shop.MPerson;
import fr.logiprolls.ptcompta.shop.MSale;
import fr.logiprolls.ptcompta.shop.MShop;
import fr.logiprolls.ptcompta.shop.MShopPackage;
import fr.logiprolls.ptcompta.shop.MValuable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.logiprolls.ptcompta.shop.MShopPackage
 * @generated
 */
public class ShopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MShopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MShopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopSwitch<Adapter> modelSwitch =
		new ShopSwitch<Adapter>() {
			@Override
			public Adapter caseShop(MShop object) {
				return createShopAdapter();
			}
			@Override
			public Adapter caseCustomer(MCustomer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseSale(MSale object) {
				return createSaleAdapter();
			}
			@Override
			public Adapter caseEmployee(MEmployee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter casePerson(MPerson object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePayment(MPayment object) {
				return createPaymentAdapter();
			}
			@Override
			public Adapter caseValuable(MValuable object) {
				return createValuableAdapter();
			}
			@Override
			public Adapter caseChequePayment(MChequePayment object) {
				return createChequePaymentAdapter();
			}
			@Override
			public Adapter caseCashPayment(MCashPayment object) {
				return createCashPaymentAdapter();
			}
			@Override
			public Adapter caseElectronicPayment(MElectronicPayment object) {
				return createElectronicPaymentAdapter();
			}
			@Override
			public Adapter caseBankOperation(MBankOperation object) {
				return createBankOperationAdapter();
			}
			@Override
			public Adapter caseAccountBook(MAccountBook object) {
				return createAccountBookAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MShop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MShop
	 * @generated
	 */
	public Adapter createShopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MCustomer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MSale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MSale
	 * @generated
	 */
	public Adapter createSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MEmployee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MPerson
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MPayment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MValuable <em>Valuable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MValuable
	 * @generated
	 */
	public Adapter createValuableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MChequePayment <em>Cheque Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MChequePayment
	 * @generated
	 */
	public Adapter createChequePaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MCashPayment <em>Cash Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MCashPayment
	 * @generated
	 */
	public Adapter createCashPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MElectronicPayment <em>Electronic Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MElectronicPayment
	 * @generated
	 */
	public Adapter createElectronicPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MBankOperation <em>Bank Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MBankOperation
	 * @generated
	 */
	public Adapter createBankOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.logiprolls.ptcompta.shop.MAccountBook <em>Account Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.logiprolls.ptcompta.shop.MAccountBook
	 * @generated
	 */
	public Adapter createAccountBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ShopAdapterFactory
