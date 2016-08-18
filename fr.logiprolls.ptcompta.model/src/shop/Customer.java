/**
 */
package shop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shop.Customer#getSales <em>Sales</em>}</li>
 *   <li>{@link shop.Customer#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @see shop.ShopPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.
	 * The list contents are of type {@link shop.Sale}.
	 * It is bidirectional and its opposite is '{@link shop.Sale#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see shop.ShopPackage#getCustomer_Sales()
	 * @see shop.Sale#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Sale> getSales();

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' reference list.
	 * The list contents are of type {@link shop.Payment}.
	 * It is bidirectional and its opposite is '{@link shop.Payment#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' reference list.
	 * @see shop.ShopPackage#getCustomer_Payments()
	 * @see shop.Payment#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Payment> getPayments();

} // Customer
