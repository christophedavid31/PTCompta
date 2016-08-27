/**
 */
package fr.logiprolls.ptcompta.shop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.logiprolls.ptcompta.shop.ShopFactory
 * @model kind="package"
 * @generated
 */
public interface ShopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.logiprolls.fr/shop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShopPackage eINSTANCE = fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.ShopImpl <em>Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getShop()
	 * @generated
	 */
	int SHOP = 0;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__CUSTOMERS = 0;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__SALES = 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__EMPLOYEES = 2;

	/**
	 * The feature id for the '<em><b>Account Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__ACCOUNT_BOOK = 3;

	/**
	 * The number of structural features of the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.PersonImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DATE = 2;

	/**
	 * The feature id for the '<em><b>Phone Numbers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE_NUMBERS = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAILS = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Display Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_DISPLAY_NAME = 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.CustomerImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BIRTH_DATE = PERSON__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Phone Numbers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBERS = PERSON__PHONE_NUMBERS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAILS = PERSON__EMAILS;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SALES = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Display Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_DISPLAY_NAME = PERSON___GET_DISPLAY_NAME;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.Valuable <em>Valuable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.Valuable
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getValuable()
	 * @generated
	 */
	int VALUABLE = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Valuable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Valuable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl <em>Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.SaleImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getSale()
	 * @generated
	 */
	int SALE = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__DATE = VALUABLE__DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__VALUE = VALUABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__DESCRIPTION = VALUABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__CUSTOMER = VALUABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__EMPLOYEES = VALUABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__PAYMENTS = VALUABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_FEATURE_COUNT = VALUABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_OPERATION_COUNT = VALUABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.EmployeeImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BIRTH_DATE = PERSON__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Phone Numbers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PHONE_NUMBERS = PERSON__PHONE_NUMBERS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAILS = PERSON__EMAILS;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALES = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Display Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___GET_DISPLAY_NAME = PERSON___GET_DISPLAY_NAME;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.Payment <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.Payment
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__DATE = VALUABLE__DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__VALUE = VALUABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Sale</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__SALE = VALUABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = VALUABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = VALUABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.ChequePaymentImpl <em>Cheque Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.ChequePaymentImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getChequePayment()
	 * @generated
	 */
	int CHEQUE_PAYMENT = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_PAYMENT__DATE = PAYMENT__DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_PAYMENT__VALUE = PAYMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Sale</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_PAYMENT__SALE = PAYMENT__SALE;

	/**
	 * The feature id for the '<em><b>Deposited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_PAYMENT__DEPOSITED = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cheque Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_PAYMENT_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cheque Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_PAYMENT_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.CashPaymentImpl <em>Cash Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.CashPaymentImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getCashPayment()
	 * @generated
	 */
	int CASH_PAYMENT = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_PAYMENT__DATE = PAYMENT__DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_PAYMENT__VALUE = PAYMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Sale</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_PAYMENT__SALE = PAYMENT__SALE;

	/**
	 * The number of structural features of the '<em>Cash Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_PAYMENT_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cash Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_PAYMENT_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.ElectronicPaymentImpl <em>Electronic Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.ElectronicPaymentImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getElectronicPayment()
	 * @generated
	 */
	int ELECTRONIC_PAYMENT = 9;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PAYMENT__DATE = PAYMENT__DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PAYMENT__VALUE = PAYMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Sale</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PAYMENT__SALE = PAYMENT__SALE;

	/**
	 * The number of structural features of the '<em>Electronic Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PAYMENT_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Electronic Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PAYMENT_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.BankOperationImpl <em>Bank Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.BankOperationImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getBankOperation()
	 * @generated
	 */
	int BANK_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION__DATE = VALUABLE__DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION__VALUE = VALUABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION__DESCRIPTION = VALUABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bank Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_FEATURE_COUNT = VALUABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bank Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_OPERATION_COUNT = VALUABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.logiprolls.ptcompta.shop.impl.AccountBookImpl <em>Account Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.logiprolls.ptcompta.shop.impl.AccountBookImpl
	 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getAccountBook()
	 * @generated
	 */
	int ACCOUNT_BOOK = 11;

	/**
	 * The feature id for the '<em><b>Bank Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK__BANK_OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Cash Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK__CASH_FLOW = 1;

	/**
	 * The feature id for the '<em><b>Shop</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK__SHOP = 2;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK__PAYMENTS = 3;

	/**
	 * The number of structural features of the '<em>Account Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Deposit Cash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK___DEPOSIT_CASH__FLOAT = 0;

	/**
	 * The operation id for the '<em>Deposit Cheque</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK___DEPOSIT_CHEQUE__CHEQUEPAYMENT = 1;

	/**
	 * The number of operations of the '<em>Account Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_BOOK_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shop</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Shop
	 * @generated
	 */
	EClass getShop();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.logiprolls.ptcompta.shop.Shop#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Shop#getCustomers()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.logiprolls.ptcompta.shop.Shop#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Shop#getSales()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Sales();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.logiprolls.ptcompta.shop.Shop#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Shop#getEmployees()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Employees();

	/**
	 * Returns the meta object for the containment reference '{@link fr.logiprolls.ptcompta.shop.Shop#getAccountBook <em>Account Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Account Book</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Shop#getAccountBook()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_AccountBook();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference list '{@link fr.logiprolls.ptcompta.shop.Customer#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Customer#getSales()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Sales();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Sale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sale</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Sale
	 * @generated
	 */
	EClass getSale();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Sale#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Sale#getDescription()
	 * @see #getSale()
	 * @generated
	 */
	EAttribute getSale_Description();

	/**
	 * Returns the meta object for the reference '{@link fr.logiprolls.ptcompta.shop.Sale#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Sale#getCustomer()
	 * @see #getSale()
	 * @generated
	 */
	EReference getSale_Customer();

	/**
	 * Returns the meta object for the reference list '{@link fr.logiprolls.ptcompta.shop.Sale#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Sale#getEmployees()
	 * @see #getSale()
	 * @generated
	 */
	EReference getSale_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.logiprolls.ptcompta.shop.Sale#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payments</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Sale#getPayments()
	 * @see #getSale()
	 * @generated
	 */
	EReference getSale_Payments();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the reference list '{@link fr.logiprolls.ptcompta.shop.Employee#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Employee#getSales()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Sales();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthDate();

	/**
	 * Returns the meta object for the attribute list '{@link fr.logiprolls.ptcompta.shop.Person#getPhoneNumbers <em>Phone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phone Numbers</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person#getPhoneNumbers()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PhoneNumbers();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Person#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person#getAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Address();

	/**
	 * Returns the meta object for the attribute list '{@link fr.logiprolls.ptcompta.shop.Person#getEmails <em>Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emails</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Person#getEmails()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Emails();

	/**
	 * Returns the meta object for the '{@link fr.logiprolls.ptcompta.shop.Person#getDisplayName() <em>Get Display Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Display Name</em>' operation.
	 * @see fr.logiprolls.ptcompta.shop.Person#getDisplayName()
	 * @generated
	 */
	EOperation getPerson__GetDisplayName();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the container reference '{@link fr.logiprolls.ptcompta.shop.Payment#getSale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sale</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Payment#getSale()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Sale();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.Valuable <em>Valuable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuable</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Valuable
	 * @generated
	 */
	EClass getValuable();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Valuable#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Valuable#getDate()
	 * @see #getValuable()
	 * @generated
	 */
	EAttribute getValuable_Date();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.Valuable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.logiprolls.ptcompta.shop.Valuable#getValue()
	 * @see #getValuable()
	 * @generated
	 */
	EAttribute getValuable_Value();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.ChequePayment <em>Cheque Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheque Payment</em>'.
	 * @see fr.logiprolls.ptcompta.shop.ChequePayment
	 * @generated
	 */
	EClass getChequePayment();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.ChequePayment#isDeposited <em>Deposited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deposited</em>'.
	 * @see fr.logiprolls.ptcompta.shop.ChequePayment#isDeposited()
	 * @see #getChequePayment()
	 * @generated
	 */
	EAttribute getChequePayment_Deposited();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.CashPayment <em>Cash Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Payment</em>'.
	 * @see fr.logiprolls.ptcompta.shop.CashPayment
	 * @generated
	 */
	EClass getCashPayment();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.ElectronicPayment <em>Electronic Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Payment</em>'.
	 * @see fr.logiprolls.ptcompta.shop.ElectronicPayment
	 * @generated
	 */
	EClass getElectronicPayment();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.BankOperation <em>Bank Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Operation</em>'.
	 * @see fr.logiprolls.ptcompta.shop.BankOperation
	 * @generated
	 */
	EClass getBankOperation();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.BankOperation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.logiprolls.ptcompta.shop.BankOperation#getDescription()
	 * @see #getBankOperation()
	 * @generated
	 */
	EAttribute getBankOperation_Description();

	/**
	 * Returns the meta object for class '{@link fr.logiprolls.ptcompta.shop.AccountBook <em>Account Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Book</em>'.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook
	 * @generated
	 */
	EClass getAccountBook();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.logiprolls.ptcompta.shop.AccountBook#getBankOperations <em>Bank Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bank Operations</em>'.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook#getBankOperations()
	 * @see #getAccountBook()
	 * @generated
	 */
	EReference getAccountBook_BankOperations();

	/**
	 * Returns the meta object for the attribute '{@link fr.logiprolls.ptcompta.shop.AccountBook#getCashFlow <em>Cash Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cash Flow</em>'.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook#getCashFlow()
	 * @see #getAccountBook()
	 * @generated
	 */
	EAttribute getAccountBook_CashFlow();

	/**
	 * Returns the meta object for the container reference '{@link fr.logiprolls.ptcompta.shop.AccountBook#getShop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Shop</em>'.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook#getShop()
	 * @see #getAccountBook()
	 * @generated
	 */
	EReference getAccountBook_Shop();

	/**
	 * Returns the meta object for the reference list '{@link fr.logiprolls.ptcompta.shop.AccountBook#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payments</em>'.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook#getPayments()
	 * @see #getAccountBook()
	 * @generated
	 */
	EReference getAccountBook_Payments();

	/**
	 * Returns the meta object for the '{@link fr.logiprolls.ptcompta.shop.AccountBook#depositCash(float) <em>Deposit Cash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deposit Cash</em>' operation.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook#depositCash(float)
	 * @generated
	 */
	EOperation getAccountBook__DepositCash__float();

	/**
	 * Returns the meta object for the '{@link fr.logiprolls.ptcompta.shop.AccountBook#depositCheque(fr.logiprolls.ptcompta.shop.ChequePayment) <em>Deposit Cheque</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deposit Cheque</em>' operation.
	 * @see fr.logiprolls.ptcompta.shop.AccountBook#depositCheque(fr.logiprolls.ptcompta.shop.ChequePayment)
	 * @generated
	 */
	EOperation getAccountBook__DepositCheque__ChequePayment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShopFactory getShopFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.ShopImpl <em>Shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getShop()
		 * @generated
		 */
		EClass SHOP = eINSTANCE.getShop();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__CUSTOMERS = eINSTANCE.getShop_Customers();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__SALES = eINSTANCE.getShop_Sales();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__EMPLOYEES = eINSTANCE.getShop_Employees();

		/**
		 * The meta object literal for the '<em><b>Account Book</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__ACCOUNT_BOOK = eINSTANCE.getShop_AccountBook();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.CustomerImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__SALES = eINSTANCE.getCustomer_Sales();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl <em>Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.SaleImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getSale()
		 * @generated
		 */
		EClass SALE = eINSTANCE.getSale();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__DESCRIPTION = eINSTANCE.getSale_Description();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALE__CUSTOMER = eINSTANCE.getSale_Customer();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALE__EMPLOYEES = eINSTANCE.getSale_Employees();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALE__PAYMENTS = eINSTANCE.getSale_Payments();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.EmployeeImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__SALES = eINSTANCE.getEmployee_Sales();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.PersonImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Phone Numbers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PHONE_NUMBERS = eINSTANCE.getPerson_PhoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ADDRESS = eINSTANCE.getPerson_Address();

		/**
		 * The meta object literal for the '<em><b>Emails</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAILS = eINSTANCE.getPerson_Emails();

		/**
		 * The meta object literal for the '<em><b>Get Display Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_DISPLAY_NAME = eINSTANCE.getPerson__GetDisplayName();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.Payment <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.Payment
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Sale</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__SALE = eINSTANCE.getPayment_Sale();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.Valuable <em>Valuable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.Valuable
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getValuable()
		 * @generated
		 */
		EClass VALUABLE = eINSTANCE.getValuable();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUABLE__DATE = eINSTANCE.getValuable_Date();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUABLE__VALUE = eINSTANCE.getValuable_Value();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.ChequePaymentImpl <em>Cheque Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.ChequePaymentImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getChequePayment()
		 * @generated
		 */
		EClass CHEQUE_PAYMENT = eINSTANCE.getChequePayment();

		/**
		 * The meta object literal for the '<em><b>Deposited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE_PAYMENT__DEPOSITED = eINSTANCE.getChequePayment_Deposited();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.CashPaymentImpl <em>Cash Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.CashPaymentImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getCashPayment()
		 * @generated
		 */
		EClass CASH_PAYMENT = eINSTANCE.getCashPayment();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.ElectronicPaymentImpl <em>Electronic Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.ElectronicPaymentImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getElectronicPayment()
		 * @generated
		 */
		EClass ELECTRONIC_PAYMENT = eINSTANCE.getElectronicPayment();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.BankOperationImpl <em>Bank Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.BankOperationImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getBankOperation()
		 * @generated
		 */
		EClass BANK_OPERATION = eINSTANCE.getBankOperation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_OPERATION__DESCRIPTION = eINSTANCE.getBankOperation_Description();

		/**
		 * The meta object literal for the '{@link fr.logiprolls.ptcompta.shop.impl.AccountBookImpl <em>Account Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.logiprolls.ptcompta.shop.impl.AccountBookImpl
		 * @see fr.logiprolls.ptcompta.shop.impl.ShopPackageImpl#getAccountBook()
		 * @generated
		 */
		EClass ACCOUNT_BOOK = eINSTANCE.getAccountBook();

		/**
		 * The meta object literal for the '<em><b>Bank Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_BOOK__BANK_OPERATIONS = eINSTANCE.getAccountBook_BankOperations();

		/**
		 * The meta object literal for the '<em><b>Cash Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_BOOK__CASH_FLOW = eINSTANCE.getAccountBook_CashFlow();

		/**
		 * The meta object literal for the '<em><b>Shop</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_BOOK__SHOP = eINSTANCE.getAccountBook_Shop();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_BOOK__PAYMENTS = eINSTANCE.getAccountBook_Payments();

		/**
		 * The meta object literal for the '<em><b>Deposit Cash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT_BOOK___DEPOSIT_CASH__FLOAT = eINSTANCE.getAccountBook__DepositCash__float();

		/**
		 * The meta object literal for the '<em><b>Deposit Cheque</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT_BOOK___DEPOSIT_CHEQUE__CHEQUEPAYMENT = eINSTANCE.getAccountBook__DepositCheque__ChequePayment();

	}

} //ShopPackage
