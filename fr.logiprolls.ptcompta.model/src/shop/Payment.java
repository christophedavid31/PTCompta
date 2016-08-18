/**
 */
package shop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shop.Payment#getCustomer <em>Customer</em>}</li>
 *   <li>{@link shop.Payment#getSale <em>Sale</em>}</li>
 * </ul>
 *
 * @see shop.ShopPackage#getPayment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Payment extends Valuable {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link shop.Customer#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see shop.ShopPackage#getPayment_Customer()
	 * @see shop.Customer#getPayments
	 * @model opposite="payments"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link shop.Payment#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Sale</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link shop.Sale#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sale</em>' reference.
	 * @see #setSale(Sale)
	 * @see shop.ShopPackage#getPayment_Sale()
	 * @see shop.Sale#getPayments
	 * @model opposite="payments"
	 * @generated
	 */
	Sale getSale();

	/**
	 * Sets the value of the '{@link shop.Payment#getSale <em>Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sale</em>' reference.
	 * @see #getSale()
	 * @generated
	 */
	void setSale(Sale value);

} // Payment
