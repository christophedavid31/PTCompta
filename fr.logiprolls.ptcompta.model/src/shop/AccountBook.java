/**
 */
package shop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shop.AccountBook#getBankOperations <em>Bank Operations</em>}</li>
 *   <li>{@link shop.AccountBook#getCashFlow <em>Cash Flow</em>}</li>
 *   <li>{@link shop.AccountBook#getShop <em>Shop</em>}</li>
 *   <li>{@link shop.AccountBook#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @see shop.ShopPackage#getAccountBook()
 * @model
 * @generated
 */
public interface AccountBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Bank Operations</b></em>' containment reference list.
	 * The list contents are of type {@link shop.BankOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Operations</em>' containment reference list.
	 * @see shop.ShopPackage#getAccountBook_BankOperations()
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
	 * @see shop.ShopPackage#getAccountBook_CashFlow()
	 * @model
	 * @generated
	 */
	float getCashFlow();

	/**
	 * Sets the value of the '{@link shop.AccountBook#getCashFlow <em>Cash Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash Flow</em>' attribute.
	 * @see #getCashFlow()
	 * @generated
	 */
	void setCashFlow(float value);

	/**
	 * Returns the value of the '<em><b>Shop</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link shop.Shop#getAccountBook <em>Account Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shop</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shop</em>' container reference.
	 * @see #setShop(Shop)
	 * @see shop.ShopPackage#getAccountBook_Shop()
	 * @see shop.Shop#getAccountBook
	 * @model opposite="accountBook" required="true" transient="false"
	 * @generated
	 */
	Shop getShop();

	/**
	 * Sets the value of the '{@link shop.AccountBook#getShop <em>Shop</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shop</em>' container reference.
	 * @see #getShop()
	 * @generated
	 */
	void setShop(Shop value);

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' containment reference list.
	 * The list contents are of type {@link shop.Payment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' containment reference list.
	 * @see shop.ShopPackage#getAccountBook_Payments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Payment> getPayments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void depositCash(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void depositCheque(ChequePayment cheque);

} // AccountBook
