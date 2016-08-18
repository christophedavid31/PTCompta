/**
 */
package shop.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shop.ChequePayment;
import shop.Customer;
import shop.Sale;
import shop.ShopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheque Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shop.impl.ChequePaymentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link shop.impl.ChequePaymentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link shop.impl.ChequePaymentImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link shop.impl.ChequePaymentImpl#getSale <em>Sale</em>}</li>
 *   <li>{@link shop.impl.ChequePaymentImpl#isDeposited <em>Deposited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChequePaymentImpl extends MinimalEObjectImpl.Container implements ChequePayment {
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
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getSale() <em>Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSale()
	 * @generated
	 * @ordered
	 */
	protected Sale sale;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequePaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShopPackage.Literals.CHEQUE_PAYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShopPackage.CHEQUE_PAYMENT__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, ShopPackage.CUSTOMER__PAYMENTS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, ShopPackage.CUSTOMER__PAYMENTS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sale getSale() {
		if (sale != null && sale.eIsProxy()) {
			InternalEObject oldSale = (InternalEObject)sale;
			sale = (Sale)eResolveProxy(oldSale);
			if (sale != oldSale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShopPackage.CHEQUE_PAYMENT__SALE, oldSale, sale));
			}
		}
		return sale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sale basicGetSale() {
		return sale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSale(Sale newSale, NotificationChain msgs) {
		Sale oldSale = sale;
		sale = newSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__SALE, oldSale, newSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSale(Sale newSale) {
		if (newSale != sale) {
			NotificationChain msgs = null;
			if (sale != null)
				msgs = ((InternalEObject)sale).eInverseRemove(this, ShopPackage.SALE__PAYMENTS, Sale.class, msgs);
			if (newSale != null)
				msgs = ((InternalEObject)newSale).eInverseAdd(this, ShopPackage.SALE__PAYMENTS, Sale.class, msgs);
			msgs = basicSetSale(newSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__SALE, newSale, newSale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CHEQUE_PAYMENT__DEPOSITED, oldDeposited, deposited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShopPackage.CHEQUE_PAYMENT__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, ShopPackage.CUSTOMER__PAYMENTS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case ShopPackage.CHEQUE_PAYMENT__SALE:
				if (sale != null)
					msgs = ((InternalEObject)sale).eInverseRemove(this, ShopPackage.SALE__PAYMENTS, Sale.class, msgs);
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
			case ShopPackage.CHEQUE_PAYMENT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case ShopPackage.CHEQUE_PAYMENT__SALE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShopPackage.CHEQUE_PAYMENT__DATE:
				return getDate();
			case ShopPackage.CHEQUE_PAYMENT__VALUE:
				return getValue();
			case ShopPackage.CHEQUE_PAYMENT__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ShopPackage.CHEQUE_PAYMENT__SALE:
				if (resolve) return getSale();
				return basicGetSale();
			case ShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				return isDeposited();
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
			case ShopPackage.CHEQUE_PAYMENT__DATE:
				setDate((Date)newValue);
				return;
			case ShopPackage.CHEQUE_PAYMENT__VALUE:
				setValue((Float)newValue);
				return;
			case ShopPackage.CHEQUE_PAYMENT__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ShopPackage.CHEQUE_PAYMENT__SALE:
				setSale((Sale)newValue);
				return;
			case ShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				setDeposited((Boolean)newValue);
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
			case ShopPackage.CHEQUE_PAYMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ShopPackage.CHEQUE_PAYMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ShopPackage.CHEQUE_PAYMENT__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ShopPackage.CHEQUE_PAYMENT__SALE:
				setSale((Sale)null);
				return;
			case ShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				setDeposited(DEPOSITED_EDEFAULT);
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
			case ShopPackage.CHEQUE_PAYMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ShopPackage.CHEQUE_PAYMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case ShopPackage.CHEQUE_PAYMENT__CUSTOMER:
				return customer != null;
			case ShopPackage.CHEQUE_PAYMENT__SALE:
				return sale != null;
			case ShopPackage.CHEQUE_PAYMENT__DEPOSITED:
				return deposited != DEPOSITED_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //ChequePaymentImpl
