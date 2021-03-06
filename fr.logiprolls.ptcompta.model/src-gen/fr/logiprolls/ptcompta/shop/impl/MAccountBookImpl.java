/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.logiprolls.ptcompta.shop.AccountBook;
import fr.logiprolls.ptcompta.shop.BankOperation;
import fr.logiprolls.ptcompta.shop.ChequePayment;
import fr.logiprolls.ptcompta.shop.MShop;
import fr.logiprolls.ptcompta.shop.MShopPackage;
import fr.logiprolls.ptcompta.shop.Payment;
import fr.logiprolls.ptcompta.shop.Shop;
import fr.logiprolls.ptcompta.shop.ShopPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MAccountBookImpl#getBankOperations <em>Bank Operations</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MAccountBookImpl#getCashFlow <em>Cash Flow</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MAccountBookImpl#getShop <em>Shop</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MAccountBookImpl#getPayments <em>Payments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MAccountBookImpl extends MinimalEObjectImpl.Container implements AccountBook {
	/**
	 * The cached value of the '{@link #getBankOperations() <em>Bank Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BankOperation> bankOperations;

	/**
	 * The default value of the '{@link #getCashFlow() <em>Cash Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashFlow()
	 * @generated
	 * @ordered
	 */
	protected static final float CASH_FLOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCashFlow() <em>Cash Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashFlow()
	 * @generated
	 * @ordered
	 */
	protected float cashFlow = CASH_FLOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayments() <em>Payments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAccountBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MShopPackage.Literals.ACCOUNT_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankOperation> getBankOperations() {
		if (bankOperations == null) {
			bankOperations = new EObjectContainmentEList<BankOperation>(BankOperation.class, this, ShopPackage.ACCOUNT_BOOK__BANK_OPERATIONS);
		}
		return bankOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCashFlow() {
		return cashFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashFlow(float newCashFlow) {
		float oldCashFlow = cashFlow;
		cashFlow = newCashFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.ACCOUNT_BOOK__CASH_FLOW, oldCashFlow, cashFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shop getShop() {
		if (eContainerFeatureID() != MShopPackage.ACCOUNT_BOOK__SHOP) return null;
		return (Shop)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShop(Shop newShop, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newShop, MShopPackage.ACCOUNT_BOOK__SHOP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShop(Shop newShop) {
		if (newShop != eInternalContainer() || (eContainerFeatureID() != MShopPackage.ACCOUNT_BOOK__SHOP && newShop != null)) {
			if (EcoreUtil.isAncestor(this, newShop))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newShop != null)
				msgs = ((InternalEObject)newShop).eInverseAdd(this, MShopPackage.SHOP__ACCOUNT_BOOK, MShop.class, msgs);
			msgs = basicSetShop(newShop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.ACCOUNT_BOOK__SHOP, newShop, newShop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectResolvingEList<Payment>(Payment.class, this, ShopPackage.ACCOUNT_BOOK__PAYMENTS);
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void depositCash(float cashValue, Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void depositCheques(EList<ChequePayment> cheques, Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetShop((Shop)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MShopPackage.ACCOUNT_BOOK__BANK_OPERATIONS:
				return ((InternalEList<?>)getBankOperations()).basicRemove(otherEnd, msgs);
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				return basicSetShop(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				return eInternalContainer().eInverseRemove(this, MShopPackage.SHOP__ACCOUNT_BOOK, MShop.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MShopPackage.ACCOUNT_BOOK__BANK_OPERATIONS:
				return getBankOperations();
			case MShopPackage.ACCOUNT_BOOK__CASH_FLOW:
				return getCashFlow();
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				return getShop();
			case MShopPackage.ACCOUNT_BOOK__PAYMENTS:
				return getPayments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MShopPackage.ACCOUNT_BOOK__BANK_OPERATIONS:
				getBankOperations().clear();
				getBankOperations().addAll((Collection<? extends BankOperation>)newValue);
				return;
			case MShopPackage.ACCOUNT_BOOK__CASH_FLOW:
				setCashFlow((Float)newValue);
				return;
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				setShop((Shop)newValue);
				return;
			case MShopPackage.ACCOUNT_BOOK__PAYMENTS:
				getPayments().clear();
				getPayments().addAll((Collection<? extends Payment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MShopPackage.ACCOUNT_BOOK__BANK_OPERATIONS:
				getBankOperations().clear();
				return;
			case MShopPackage.ACCOUNT_BOOK__CASH_FLOW:
				setCashFlow(CASH_FLOW_EDEFAULT);
				return;
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				setShop((Shop)null);
				return;
			case MShopPackage.ACCOUNT_BOOK__PAYMENTS:
				getPayments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MShopPackage.ACCOUNT_BOOK__BANK_OPERATIONS:
				return bankOperations != null && !bankOperations.isEmpty();
			case MShopPackage.ACCOUNT_BOOK__CASH_FLOW:
				return cashFlow != CASH_FLOW_EDEFAULT;
			case MShopPackage.ACCOUNT_BOOK__SHOP:
				return getShop() != null;
			case MShopPackage.ACCOUNT_BOOK__PAYMENTS:
				return payments != null && !payments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MShopPackage.ACCOUNT_BOOK___DEPOSIT_CASH__FLOAT_DATE:
				depositCash((Float)arguments.get(0), (Date)arguments.get(1));
				return null;
			case MShopPackage.ACCOUNT_BOOK___DEPOSIT_CHEQUES__ELIST_DATE:
				depositCheques((EList<ChequePayment>)arguments.get(0), (Date)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cashFlow: ");
		result.append(cashFlow);
		result.append(')');
		return result.toString();
	}

} //MAccountBookImpl
