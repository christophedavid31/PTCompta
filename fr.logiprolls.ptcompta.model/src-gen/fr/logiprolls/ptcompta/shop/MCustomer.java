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
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MCustomer#getSales <em>Sales</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getCustomer()
 * @model
 * @generated
 */
public interface MCustomer extends Person {
	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MSale}. 
	
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.MSale#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getCustomer_Sales()
	 * @see fr.logiprolls.ptcompta.shop.MSale#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Sale> getSales();

} // MCustomer
