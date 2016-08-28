/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.logiprolls.ptcompta.shop.AccountBook;
import fr.logiprolls.ptcompta.shop.Customer;
import fr.logiprolls.ptcompta.shop.Employee;
import fr.logiprolls.ptcompta.shop.MAccountBook;
import fr.logiprolls.ptcompta.shop.MShopPackage;
import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.Shop;
import fr.logiprolls.ptcompta.shop.ShopPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MShopImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MShopImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MShopImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MShopImpl#getAccountBook <em>Account Book</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MShopImpl extends MinimalEObjectImpl.Container implements Shop {
	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<Sale> sales;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getAccountBook() <em>Account Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountBook()
	 * @generated
	 * @ordered
	 */
	protected AccountBook accountBook;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MShopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MShopPackage.Literals.SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, ShopPackage.SHOP__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sale> getSales() {
		if (sales == null) {
			sales = new EObjectContainmentEList<Sale>(Sale.class, this, ShopPackage.SHOP__SALES);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, ShopPackage.SHOP__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountBook getAccountBook() {
		return accountBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountBook(AccountBook newAccountBook, NotificationChain msgs) {
		AccountBook oldAccountBook = accountBook;
		accountBook = newAccountBook;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MShopPackage.SHOP__ACCOUNT_BOOK, oldAccountBook, newAccountBook);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountBook(AccountBook newAccountBook) {
		if (newAccountBook != accountBook) {
			NotificationChain msgs = null;
			if (accountBook != null)
				msgs = ((InternalEObject)accountBook).eInverseRemove(this, MShopPackage.ACCOUNT_BOOK__SHOP, MAccountBook.class, msgs);
			if (newAccountBook != null)
				msgs = ((InternalEObject)newAccountBook).eInverseAdd(this, MShopPackage.ACCOUNT_BOOK__SHOP, MAccountBook.class, msgs);
			msgs = basicSetAccountBook(newAccountBook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.SHOP__ACCOUNT_BOOK, newAccountBook, newAccountBook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MShopPackage.SHOP__ACCOUNT_BOOK:
				if (accountBook != null)
					msgs = ((InternalEObject)accountBook).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MShopPackage.SHOP__ACCOUNT_BOOK, null, msgs);
				return basicSetAccountBook((AccountBook)otherEnd, msgs);
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
			case MShopPackage.SHOP__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case MShopPackage.SHOP__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
			case MShopPackage.SHOP__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case MShopPackage.SHOP__ACCOUNT_BOOK:
				return basicSetAccountBook(null, msgs);
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
			case MShopPackage.SHOP__CUSTOMERS:
				return getCustomers();
			case MShopPackage.SHOP__SALES:
				return getSales();
			case MShopPackage.SHOP__EMPLOYEES:
				return getEmployees();
			case MShopPackage.SHOP__ACCOUNT_BOOK:
				return getAccountBook();
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
			case MShopPackage.SHOP__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case MShopPackage.SHOP__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends Sale>)newValue);
				return;
			case MShopPackage.SHOP__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case MShopPackage.SHOP__ACCOUNT_BOOK:
				setAccountBook((AccountBook)newValue);
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
			case MShopPackage.SHOP__CUSTOMERS:
				getCustomers().clear();
				return;
			case MShopPackage.SHOP__SALES:
				getSales().clear();
				return;
			case MShopPackage.SHOP__EMPLOYEES:
				getEmployees().clear();
				return;
			case MShopPackage.SHOP__ACCOUNT_BOOK:
				setAccountBook((AccountBook)null);
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
			case MShopPackage.SHOP__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case MShopPackage.SHOP__SALES:
				return sales != null && !sales.isEmpty();
			case MShopPackage.SHOP__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case MShopPackage.SHOP__ACCOUNT_BOOK:
				return accountBook != null;
		}
		return super.eIsSet(featureID);
	}

} //MShopImpl
