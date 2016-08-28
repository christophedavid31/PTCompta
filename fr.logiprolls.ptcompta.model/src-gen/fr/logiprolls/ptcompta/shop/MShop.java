/**
 */
package fr.logiprolls.ptcompta.shop;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MShop#getCustomers <em>Customers</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MShop#getSales <em>Sales</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MShop#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MShop#getAccountBook <em>Account Book</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getShop()
 * @model
 * @generated
 */
public interface MShop extends EObject {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MCustomer}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getShop_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Sales</b></em>' containment reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MSale}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' containment reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getShop_Sales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sale> getSales();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MEmployee}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getShop_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Account Book</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.MAccountBook#getShop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Book</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Book</em>' containment reference.
	 * @see #setAccountBook(MAccountBook)
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getShop_AccountBook()
	 * @see fr.logiprolls.ptcompta.shop.MAccountBook#getShop
	 * @model opposite="shop" containment="true" required="true"
	 * @generated
	 */
	AccountBook getAccountBook();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.MShop#getAccountBook <em>Account Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Book</em>' containment reference.
	 * @see #getAccountBook()
	 * @generated
	 */
	void setAccountBook(AccountBook value);

} // MShop
