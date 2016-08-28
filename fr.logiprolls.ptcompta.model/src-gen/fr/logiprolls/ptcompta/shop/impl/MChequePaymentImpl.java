/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.logiprolls.ptcompta.shop.ChequePayment;
import fr.logiprolls.ptcompta.shop.MSale;
import fr.logiprolls.ptcompta.shop.MShopPackage;
import fr.logiprolls.ptcompta.shop.Sale;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheque Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#getSale <em>Sale</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#isDeposited <em>Deposited</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#getDepositDate <em>Deposit Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MChequePaymentImpl extends MinimalEObjectImpl.Container implements ChequePayment {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeposited() <em>Deposited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeposited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPOSITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeposited() <em>Deposited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeposited()
	 * @generated
	 * @ordered
	 */
	protected boolean deposited = DEPOSITED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepositDate() <em>Deposit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEPOSIT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepositDate() <em>Deposit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositDate()
	 * @generated
	 * @ordered
	 */
	protected Date depositDate = DEPOSIT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MChequePaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MShopPackage.Literals.CHEQUE_PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.CHEQUE_PAYMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.CHEQUE_PAYMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sale getSale() {
		if (eContainerFeatureID() != MShopPackage.CHEQUE_PAYMENT__SALE) return null;
		return (Sale)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSale(Sale newSale, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSale, MShopPackage.CHEQUE_PAYMENT__SALE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSale(Sale newSale) {
		if (newSale != eInternalContainer() || (eContainerFeatureID() != MShopPackage.CHEQUE_PAYMENT__SALE && newSale != null)) {
			if (EcoreUtil.isAncestor(this, newSale))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSale != null)
				msgs = ((InternalEObject)newSale).eInverseAdd(this, MShopPackage.SALE__PAYMENTS, MSale.class, msgs);
			msgs = basicSetSale(newSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.CHEQUE_PAYMENT__SALE, newSale, newSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeposited() {
		return deposited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeposited(boolean newDeposited) {
		boolean oldDeposited = deposited;
		deposited = newDeposited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.CHEQUE_PAYMENT__DEPOSITED, oldDeposited, deposited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDepositDate() {
		return depositDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepositDate(Date newDepositDate) {
		Date oldDepositDate = depositDate;
		depositDate = newDepositDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.CHEQUE_PAYMENT__DEPOSIT_DATE, oldDepositDate, depositDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSale((Sale)otherEnd, msgs);
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
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				return basicSetSale(null, msgs);
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
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				return eInternalContainer().eInverseRemove(this, MShopPackage.SALE__PAYMENTS, MSale.class, msgs);
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
			case MShopPackage.CHEQUE_PAYMENT__DATE:
				return getDate();
			case MShopPackage.CHEQUE_PAYMENT__VALUE:
				return getValue();
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				return getSale();
			case MShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				return isDeposited();
			case MShopPackage.CHEQUE_PAYMENT__DEPOSIT_DATE:
				return getDepositDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MShopPackage.CHEQUE_PAYMENT__DATE:
				setDate((Date)newValue);
				return;
			case MShopPackage.CHEQUE_PAYMENT__VALUE:
				setValue((Float)newValue);
				return;
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				setSale((Sale)newValue);
				return;
			case MShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				setDeposited((Boolean)newValue);
				return;
			case MShopPackage.CHEQUE_PAYMENT__DEPOSIT_DATE:
				setDepositDate((Date)newValue);
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
			case MShopPackage.CHEQUE_PAYMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MShopPackage.CHEQUE_PAYMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				setSale((Sale)null);
				return;
			case MShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				setDeposited(DEPOSITED_EDEFAULT);
				return;
			case MShopPackage.CHEQUE_PAYMENT__DEPOSIT_DATE:
				setDepositDate(DEPOSIT_DATE_EDEFAULT);
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
			case MShopPackage.CHEQUE_PAYMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case MShopPackage.CHEQUE_PAYMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case MShopPackage.CHEQUE_PAYMENT__SALE:
				return getSale() != null;
			case MShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				return deposited != DEPOSITED_EDEFAULT;
			case MShopPackage.CHEQUE_PAYMENT__DEPOSIT_DATE:
				return DEPOSIT_DATE_EDEFAULT == null ? depositDate != null : !DEPOSIT_DATE_EDEFAULT.equals(depositDate);
		}
		return super.eIsSet(featureID);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", value: ");
		result.append(value);
		result.append(", deposited: ");
		result.append(deposited);
		result.append(", depositDate: ");
		result.append(depositDate);
		result.append(')');
		return result.toString();
	}

} //MChequePaymentImpl