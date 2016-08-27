/**
 */
package fr.logiprolls.ptcompta.shop;

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
 *   <li>{@link fr.logiprolls.ptcompta.shop.Customer#getSales <em>Sales</em>}</li>
 * </ul>
 *
 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.Sale}.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.Sale#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getCustomer_Sales()
	 * @see fr.logiprolls.ptcompta.shop.Sale#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Sale> getSales();

} // Customer
