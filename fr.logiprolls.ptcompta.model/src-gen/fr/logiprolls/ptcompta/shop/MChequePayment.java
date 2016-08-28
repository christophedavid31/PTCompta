/**
 */
package fr.logiprolls.ptcompta.shop;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheque Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MChequePayment#isDeposited <em>Deposited</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MChequePayment#getDepositDate <em>Deposit Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getChequePayment()
 * @model
 * @generated
 */
public interface MChequePayment extends Payment {
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
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getChequePayment_Deposited()
	 * @model
	 * @generated
	 */
	boolean isDeposited();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.MChequePayment#isDeposited <em>Deposited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposited</em>' attribute.
	 * @see #isDeposited()
	 * @generated
	 */
	void setDeposited(boolean value);

	/**
	 * Returns the value of the '<em><b>Deposit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit Date</em>' attribute.
	 * @see #setDepositDate(Date)
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getChequePayment_DepositDate()
	 * @model
	 * @generated
	 */
	Date getDepositDate();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.MChequePayment#getDepositDate <em>Deposit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit Date</em>' attribute.
	 * @see #getDepositDate()
	 * @generated
	 */
	void setDepositDate(Date value);

} // MChequePayment
