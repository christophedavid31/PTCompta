/**
 */
package fr.logiprolls.ptcompta.shop;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MAccountBook#getBankOperations <em>Bank Operations</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MAccountBook#getCashFlow <em>Cash Flow</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MAccountBook#getShop <em>Shop</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MAccountBook#getPayments <em>Payments</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getAccountBook()
 * @model
 * @generated
 */
public interface MAccountBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Bank Operations</b></em>' containment reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MBankOperation}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Operations</em>' containment reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getAccountBook_BankOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BankOperation> getBankOperations();

	/**
	 * Returns the value of the '<em><b>Cash Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cash Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cash Flow</em>' attribute.
	 * @see #setCashFlow(float)
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getAccountBook_CashFlow()
	 * @model
	 * @generated
	 */
	float getCashFlow();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.MAccountBook#getCashFlow <em>Cash Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash Flow</em>' attribute.
	 * @see #getCashFlow()
	 * @generated
	 */
	void setCashFlow(float value);

	/**
	 * Returns the value of the '<em><b>Shop</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.MShop#getAccountBook <em>Account Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shop</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shop</em>' container reference.
	 * @see #setShop(MShop)
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getAccountBook_Shop()
	 * @see fr.logiprolls.ptcompta.shop.MShop#getAccountBook
	 * @model opposite="accountBook" required="true" transient="false"
	 * @generated
	 */
	Shop getShop();

	/**
	 * Sets the value of the '{@link fr.logiprolls.ptcompta.shop.MAccountBook#getShop <em>Shop</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shop</em>' container reference.
	 * @see #getShop()
	 * @generated
	 */
	void setShop(Shop value);

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MPayment}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getAccountBook_Payments()
	 * @model
	 * @generated
	 */
	EList<Payment> getPayments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void depositCash(float cashValue, Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chequesMany="true"
	 * @generated
	 */
	void depositCheques(EList<ChequePayment> cheques, Date date);

} // MAccountBook
