/**
 */
package fr.logiprolls.ptcompta.shop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.Sale#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.Sale#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.Sale#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.Sale#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getSale()
 * @model
 * @generated
 */
public interface Sale extends Valuable {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getSale_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.Sale#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.Customer#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getSale_Customer()
	 * @see fr.logiprolls.ptcompta.shop.Customer#getSales
	 * @model opposite="sales" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.Sale#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.Employee}.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.Employee#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getSale_Employees()
	 * @see fr.logiprolls.ptcompta.shop.Employee#getSales
	 * @model opposite="sales" required="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' containment reference list.
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.Payment}.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.Payment#getSale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' containment reference list.
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getSale_Payments()
	 * @see fr.logiprolls.ptcompta.shop.Payment#getSale
	 * @model opposite="sale" containment="true"
	 * @generated
	 */
	EList<Payment> getPayments();

} // Sale
