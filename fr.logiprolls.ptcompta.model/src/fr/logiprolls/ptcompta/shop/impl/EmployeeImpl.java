/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.Employee;
import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.ShopPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.EmployeeImpl#getSales <em>Sales</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShopPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sale> getSales() {
		if (sales == null) {
			sales = new EObjectWithInverseResolvingEList.ManyInverse<Sale>(Sale.class, this, ShopPackage.EMPLOYEE__SALES, ShopPackage.SALE__EMPLOYEES);
		}
		return sales;
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
			case ShopPackage.EMPLOYEE__SALES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSales()).basicAdd(otherEnd, msgs);
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
			case ShopPackage.EMPLOYEE__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
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
			case ShopPackage.EMPLOYEE__SALES:
				return getSales();
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
			case ShopPackage.EMPLOYEE__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends Sale>)newValue);
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
			case ShopPackage.EMPLOYEE__SALES:
				getSales().clear();
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
			case ShopPackage.EMPLOYEE__SALES:
				return sales != null && !sales.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmployeeImpl
