/**
 */
package fr.logiprolls.ptcompta.shop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.logiprolls.ptcompta.shop.ShopPackage
 * @generated
 */
public interface ShopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShopFactory eINSTANCE = fr.logiprolls.ptcompta.shop.impl.ShopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shop</em>'.
	 * @generated
	 */
	Shop createShop();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sale</em>'.
	 * @generated
	 */
	Sale createSale();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Cheque Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cheque Payment</em>'.
	 * @generated
	 */
	ChequePayment createChequePayment();

	/**
	 * Returns a new object of class '<em>Cash Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Payment</em>'.
	 * @generated
	 */
	CashPayment createCashPayment();

	/**
	 * Returns a new object of class '<em>Electronic Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electronic Payment</em>'.
	 * @generated
	 */
	ElectronicPayment createElectronicPayment();

	/**
	 * Returns a new object of class '<em>Bank Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Operation</em>'.
	 * @generated
	 */
	BankOperation createBankOperation();

	/**
	 * Returns a new object of class '<em>Account Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Book</em>'.
	 * @generated
	 */
	AccountBook createAccountBook();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ShopPackage getShopPackage();

} //ShopFactory
