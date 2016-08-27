/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.Customer;
import fr.logiprolls.ptcompta.shop.Employee;
import fr.logiprolls.ptcompta.shop.Payment;
import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.ShopPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.SaleImpl#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaleImpl extends MinimalEObjectImpl.Container implements Sale {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getPayments() <em>Payments</em>}' containment reference list.
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
	protected SaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShopPackage.Literals.SALE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.SALE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.SALE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.SALE__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShopPackage.SALE__CUSTOMER, oldCustomer, customer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShopPackage.SALE__CUSTOMER, oldCustomer, newCustomer);
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
				msgs = ((InternalEObject)customer).eInverseRemove(this, ShopPackage.CUSTOMER__SALES, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, ShopPackage.CUSTOMER__SALES, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.SALE__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectWithInverseResolvingEList.ManyInverse<Employee>(Employee.class, this, ShopPackage.SALE__EMPLOYEES, ShopPackage.EMPLOYEE__SALES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectContainmentWithInverseEList<Payment>(Payment.class, this, ShopPackage.SALE__PAYMENTS, ShopPackage.PAYMENT__SALE);
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShopPackage.SALE__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, ShopPackage.CUSTOMER__SALES, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case ShopPackage.SALE__EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployees()).basicAdd(otherEnd, msgs);
			case ShopPackage.SALE__PAYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPayments()).basicAdd(otherEnd, msgs);
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
			case ShopPackage.SALE__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case ShopPackage.SALE__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case ShopPackage.SALE__PAYMENTS:
				return ((InternalEList<?>)getPayments()).basicRemove(otherEnd, msgs);
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
			case ShopPackage.SALE__DATE:
				return getDate();
			case ShopPackage.SALE__VALUE:
				return getValue();
			case ShopPackage.SALE__DESCRIPTION:
				return getDescription();
			case ShopPackage.SALE__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ShopPackage.SALE__EMPLOYEES:
				return getEmployees();
			case ShopPackage.SALE__PAYMENTS:
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
			case ShopPackage.SALE__DATE:
				setDate((Date)newValue);
				return;
			case ShopPackage.SALE__VALUE:
				setValue((Float)newValue);
				return;
			case ShopPackage.SALE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ShopPackage.SALE__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ShopPackage.SALE__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case ShopPackage.SALE__PAYMENTS:
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
			case ShopPackage.SALE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ShopPackage.SALE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ShopPackage.SALE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ShopPackage.SALE__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ShopPackage.SALE__EMPLOYEES:
				getEmployees().clear();
				return;
			case ShopPackage.SALE__PAYMENTS:
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
			case ShopPackage.SALE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ShopPackage.SALE__VALUE:
				return value != VALUE_EDEFAULT;
			case ShopPackage.SALE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ShopPackage.SALE__CUSTOMER:
				return customer != null;
			case ShopPackage.SALE__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case ShopPackage.SALE__PAYMENTS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", value: ");
		result.append(value);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SaleImpl
