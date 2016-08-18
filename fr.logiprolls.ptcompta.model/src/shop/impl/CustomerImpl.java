/**
 */
package shop.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shop.Customer;
import shop.Payment;
import shop.Sale;
import shop.ShopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shop.impl.CustomerImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link shop.impl.CustomerImpl#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<Sale> sales;

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
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShopPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sale> getSales() {
		if (sales == null) {
			sales = new EObjectWithInverseResolvingEList<Sale>(Sale.class, this, ShopPackage.CUSTOMER__SALES, ShopPackage.SALE__CUSTOMER);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectWithInverseResolvingEList<Payment>(Payment.class, this, ShopPackage.CUSTOMER__PAYMENTS, ShopPackage.PAYMENT__CUSTOMER);
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
			case ShopPackage.CUSTOMER__SALES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSales()).basicAdd(otherEnd, msgs);
			case ShopPackage.CUSTOMER__PAYMENTS:
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
			case ShopPackage.CUSTOMER__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
			case ShopPackage.CUSTOMER__PAYMENTS:
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
			case ShopPackage.CUSTOMER__SALES:
				return getSales();
			case ShopPackage.CUSTOMER__PAYMENTS:
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
			case ShopPackage.CUSTOMER__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends Sale>)newValue);
				return;
			case ShopPackage.CUSTOMER__PAYMENTS:
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
			case ShopPackage.CUSTOMER__SALES:
				getSales().clear();
				return;
			case ShopPackage.CUSTOMER__PAYMENTS:
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
			case ShopPackage.CUSTOMER__SALES:
				return sales != null && !sales.isEmpty();
			case ShopPackage.CUSTOMER__PAYMENTS:
				return payments != null && !payments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerImpl
