/**
 */
package shop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shop.Employee#getSales <em>Sales</em>}</li>
 * </ul>
 *
 * @see shop.ShopPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.
	 * The list contents are of type {@link shop.Sale}.
	 * It is bidirectional and its opposite is '{@link shop.Sale#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see shop.ShopPackage#getEmployee_Sales()
	 * @see shop.Sale#getEmployees
	 * @model opposite="employees"
	 * @generated
	 */
	EList<Sale> getSales();

} // Employee
