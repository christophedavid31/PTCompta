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

import shop.CashPayment;
import shop.Customer;
import shop.Sale;
import shop.ShopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shop.impl.CashPaymentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link shop.impl.CashPaymentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link shop.impl.CashPaymentImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link shop.impl.CashPaymentImpl#getSale <em>Sale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashPaymentImpl extends MinimalEObjectImpl.Container implements CashPayment {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashPaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShopPackage.Literals.CASH_PAYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CASH_PAYMENT__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CASH_PAYMENT__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShopPackage.CASH_PAYMENT__CUSTOMER, oldCustomer, customer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShopPackage.CASH_PAYMENT__CUSTOMER, oldCustomer, newCustomer);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CASH_PAYMENT__CUSTOMER, newCustomer, newCustomer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShopPackage.CASH_PAYMENT__SALE, oldSale, sale));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShopPackage.CASH_PAYMENT__SALE, oldSale, newSale);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CASH_PAYMENT__SALE, newSale, newSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShopPackage.CASH_PAYMENT__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, ShopPackage.CUSTOMER__PAYMENTS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case ShopPackage.CASH_PAYMENT__SALE:
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
			case ShopPackage.CASH_PAYMENT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case ShopPackage.CASH_PAYMENT__SALE:
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
			case ShopPackage.CASH_PAYMENT__DATE:
				return getDate();
			case ShopPackage.CASH_PAYMENT__VALUE:
				return getValue();
			case ShopPackage.CASH_PAYMENT__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ShopPackage.CASH_PAYMENT__SALE:
				if (resolve) return getSale();
				return basicGetSale();
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
			case ShopPackage.CASH_PAYMENT__DATE:
				setDate((Date)newValue);
				return;
			case ShopPackage.CASH_PAYMENT__VALUE:
				setValue((Float)newValue);
				return;
			case ShopPackage.CASH_PAYMENT__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ShopPackage.CASH_PAYMENT__SALE:
				setSale((Sale)newValue);
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
			case ShopPackage.CASH_PAYMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ShopPackage.CASH_PAYMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ShopPackage.CASH_PAYMENT__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ShopPackage.CASH_PAYMENT__SALE:
				setSale((Sale)null);
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
			case ShopPackage.CASH_PAYMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ShopPackage.CASH_PAYMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case ShopPackage.CASH_PAYMENT__CUSTOMER:
				return customer != null;
			case ShopPackage.CASH_PAYMENT__SALE:
				return sale != null;
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
		result.append(')');
		return result.toString();
	}

} //CashPaymentImpl
