/**
 */
package fr.logiprolls.ptcompta.shop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheque Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.ChequePayment#isDeposited <em>Deposited</em>}</li>
 * </ul>
 *
 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getChequePayment()
 * @model
 * @generated
 */
public interface ChequePayment extends Payment {
	/**
	 * Returns the value of the '<em><b>Deposited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposited</em>' attribute.
	 * @see #setDeposited(boolean)
	 * @see fr.logiprolls.ptcompta.shop.ShopPackage#getChequePayment_Deposited()
	 * @model
	 * @generated
	 */
	boolean isDeposited();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.ChequePayment#isDeposited <em>Deposited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposited</em>' attribute.
	 * @see #isDeposited()
	 * @generated
	 */
	void setDeposited(boolean value);

} // ChequePayment
