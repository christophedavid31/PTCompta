/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShopFactoryImpl extends EFactoryImpl implements ShopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShopFactory init() {
		try {
			ShopFactory theShopFactory = (ShopFactory)EPackage.Registry.INSTANCE.getEFactory(ShopPackage.eNS_URI);
			if (theShopFactory != null) {
				return theShopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShopPackage.SHOP: return createShop();
			case ShopPackage.CUSTOMER: return createCustomer();
			case ShopPackage.SALE: return createSale();
			case ShopPackage.EMPLOYEE: return createEmployee();
			case ShopPackage.CHEQUE_PAYMENT: return createChequePayment();
			case ShopPackage.CASH_PAYMENT: return createCashPayment();
			case ShopPackage.ELECTRONIC_PAYMENT: return createElectronicPayment();
			case ShopPackage.BANK_OPERATION: return createBankOperation();
			case ShopPackage.ACCOUNT_BOOK: return createAccountBook();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shop createShop() {
		ShopImpl shop = new ShopImpl();
		return shop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sale createSale() {
		SaleImpl sale = new SaleImpl();
		return sale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequePayment createChequePayment() {
		ChequePaymentImpl chequePayment = new ChequePaymentImpl();
		return chequePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashPayment createCashPayment() {
		CashPaymentImpl cashPayment = new CashPaymentImpl();
		return cashPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicPayment createElectronicPayment() {
		ElectronicPaymentImpl electronicPayment = new ElectronicPaymentImpl();
		return electronicPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankOperation createBankOperation() {
		BankOperationImpl bankOperation = new BankOperationImpl();
		return bankOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountBook createAccountBook() {
		AccountBookImpl accountBook = new AccountBookImpl();
		return accountBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopPackage getShopPackage() {
		return (ShopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShopPackage getPackage() {
		return ShopPackage.eINSTANCE;
	}

} //ShopFactoryImpl
