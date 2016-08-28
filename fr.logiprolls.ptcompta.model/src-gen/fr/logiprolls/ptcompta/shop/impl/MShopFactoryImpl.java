/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.logiprolls.ptcompta.shop.MAccountBook;
import fr.logiprolls.ptcompta.shop.MBankOperation;
import fr.logiprolls.ptcompta.shop.MCashPayment;
import fr.logiprolls.ptcompta.shop.MChequePayment;
import fr.logiprolls.ptcompta.shop.MCustomer;
import fr.logiprolls.ptcompta.shop.MElectronicPayment;
import fr.logiprolls.ptcompta.shop.MEmployee;
import fr.logiprolls.ptcompta.shop.MSale;
import fr.logiprolls.ptcompta.shop.MShop;
import fr.logiprolls.ptcompta.shop.MShopFactory;
import fr.logiprolls.ptcompta.shop.MShopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MShopFactoryImpl extends EFactoryImpl implements MShopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MShopFactory init() {
		try {
			MShopFactory theShopFactory = (MShopFactory)EPackage.Registry.INSTANCE.getEFactory(MShopPackage.eNS_URI);
			if (theShopFactory != null) {
				return theShopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MShopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MShopFactoryImpl() {
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
			case MShopPackage.SHOP: return createShop();
			case MShopPackage.CUSTOMER: return createCustomer();
			case MShopPackage.SALE: return createSale();
			case MShopPackage.EMPLOYEE: return createEmployee();
			case MShopPackage.CHEQUE_PAYMENT: return createChequePayment();
			case MShopPackage.CASH_PAYMENT: return createCashPayment();
			case MShopPackage.ELECTRONIC_PAYMENT: return createElectronicPayment();
			case MShopPackage.BANK_OPERATION: return createBankOperation();
			case MShopPackage.ACCOUNT_BOOK: return createAccountBook();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MShop createShop() {
		MShopImpl shop = new MShopImpl();
		return shop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCustomer createCustomer() {
		MCustomerImpl customer = new MCustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSale createSale() {
		MSaleImpl sale = new MSaleImpl();
		return sale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEmployee createEmployee() {
		MEmployeeImpl employee = new MEmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MChequePayment createChequePayment() {
		MChequePaymentImpl chequePayment = new MChequePaymentImpl();
		return chequePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCashPayment createCashPayment() {
		MCashPaymentImpl cashPayment = new MCashPaymentImpl();
		return cashPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MElectronicPayment createElectronicPayment() {
		MElectronicPaymentImpl electronicPayment = new MElectronicPaymentImpl();
		return electronicPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBankOperation createBankOperation() {
		MBankOperationImpl bankOperation = new MBankOperationImpl();
		return bankOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAccountBook createAccountBook() {
		MAccountBookImpl accountBook = new MAccountBookImpl();
		return accountBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MShopPackage getShopPackage() {
		return (MShopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MShopPackage getPackage() {
		return MShopPackage.eINSTANCE;
	}

} //MShopFactoryImpl
