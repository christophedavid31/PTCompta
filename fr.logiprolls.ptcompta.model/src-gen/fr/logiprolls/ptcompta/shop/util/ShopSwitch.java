/**
 */
package fr.logiprolls.ptcompta.shop.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.logiprolls.ptcompta.shop.MAccountBook;
import fr.logiprolls.ptcompta.shop.MBankOperation;
import fr.logiprolls.ptcompta.shop.MCashPayment;
import fr.logiprolls.ptcompta.shop.MChequePayment;
import fr.logiprolls.ptcompta.shop.MCustomer;
import fr.logiprolls.ptcompta.shop.MElectronicPayment;
import fr.logiprolls.ptcompta.shop.MEmployee;
import fr.logiprolls.ptcompta.shop.MPayment;
import fr.logiprolls.ptcompta.shop.MPerson;
import fr.logiprolls.ptcompta.shop.MSale;
import fr.logiprolls.ptcompta.shop.MShop;
import fr.logiprolls.ptcompta.shop.MShopPackage;
import fr.logiprolls.ptcompta.shop.MValuable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.logiprolls.ptcompta.shop.MShopPackage
 * @generated
 */
public class ShopSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MShopPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopSwitch() {
		if (modelPackage == null) {
			modelPackage = MShopPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MShopPackage.SHOP: {
				MShop shop = (MShop)theEObject;
				T result = caseShop(shop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.CUSTOMER: {
				MCustomer customer = (MCustomer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = casePerson(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.SALE: {
				MSale sale = (MSale)theEObject;
				T result = caseSale(sale);
				if (result == null) result = caseValuable(sale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.EMPLOYEE: {
				MEmployee employee = (MEmployee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = casePerson(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.PERSON: {
				MPerson person = (MPerson)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.PAYMENT: {
				MPayment payment = (MPayment)theEObject;
				T result = casePayment(payment);
				if (result == null) result = caseValuable(payment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.VALUABLE: {
				MValuable valuable = (MValuable)theEObject;
				T result = caseValuable(valuable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.CHEQUE_PAYMENT: {
				MChequePayment chequePayment = (MChequePayment)theEObject;
				T result = caseChequePayment(chequePayment);
				if (result == null) result = casePayment(chequePayment);
				if (result == null) result = caseValuable(chequePayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.CASH_PAYMENT: {
				MCashPayment cashPayment = (MCashPayment)theEObject;
				T result = caseCashPayment(cashPayment);
				if (result == null) result = casePayment(cashPayment);
				if (result == null) result = caseValuable(cashPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.ELECTRONIC_PAYMENT: {
				MElectronicPayment electronicPayment = (MElectronicPayment)theEObject;
				T result = caseElectronicPayment(electronicPayment);
				if (result == null) result = casePayment(electronicPayment);
				if (result == null) result = caseValuable(electronicPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.BANK_OPERATION: {
				MBankOperation bankOperation = (MBankOperation)theEObject;
				T result = caseBankOperation(bankOperation);
				if (result == null) result = caseValuable(bankOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MShopPackage.ACCOUNT_BOOK: {
				MAccountBook accountBook = (MAccountBook)theEObject;
				T result = caseAccountBook(accountBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShop(MShop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(MCustomer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSale(MSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(MEmployee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(MPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(MPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valuable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valuable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuable(MValuable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cheque Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cheque Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChequePayment(MChequePayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cash Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cash Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCashPayment(MCashPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electronic Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electronic Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectronicPayment(MElectronicPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankOperation(MBankOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountBook(MAccountBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ShopSwitch
