/**
 */
package fr.logiprolls.ptcompta.shop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.logiprolls.ptcompta.shop.MShopPackage
 * @generated
 */
public interface MShopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MShopFactory eINSTANCE = fr.logiprolls.ptcompta.shop.impl.MShopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shop</em>'.
	 * @generated
	 */
	MShop createShop();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	MCustomer createCustomer();

	/**
	 * Returns a new object of class '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sale</em>'.
	 * @generated
	 */
	MSale createSale();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	MEmployee createEmployee();

	/**
	 * Returns a new object of class '<em>Cheque Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cheque Payment</em>'.
	 * @generated
	 */
	MChequePayment createChequePayment();

	/**
	 * Returns a new object of class '<em>Cash Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Payment</em>'.
	 * @generated
	 */
	MCashPayment createCashPayment();

	/**
	 * Returns a new object of class '<em>Electronic Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electronic Payment</em>'.
	 * @generated
	 */
	MElectronicPayment createElectronicPayment();

	/**
	 * Returns a new object of class '<em>Bank Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Operation</em>'.
	 * @generated
	 */
	MBankOperation createBankOperation();

	/**
	 * Returns a new object of class '<em>Account Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Book</em>'.
	 * @generated
	 */
	MAccountBook createAccountBook();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MShopPackage getShopPackage();

} //MShopFactory
