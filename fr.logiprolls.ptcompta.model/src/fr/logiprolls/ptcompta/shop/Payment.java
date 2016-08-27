/**
 */
package fr.logiprolls.ptcompta.shop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.Payment#getSale <em>Sale</em>}</li>
 * </ul>
 *
 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getPayment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Payment extends Valuable {
	/**
	 * Returns the value of the '<em><b>Sale</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.Sale#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sale</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sale</em>' container reference.
	 * @see #setSale(Sale)
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getPayment_Sale()
	 * @see fr.logiprolls.ptcompta.shop.Sale#getPayments
	 * @model opposite="payments" transient="false"
	 * @generated
	 */
	Sale getSale();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.Payment#getSale <em>Sale</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sale</em>' container reference.
	 * @see #getSale()
	 * @generated
	 */
	void setSale(Sale value);

} // Payment
