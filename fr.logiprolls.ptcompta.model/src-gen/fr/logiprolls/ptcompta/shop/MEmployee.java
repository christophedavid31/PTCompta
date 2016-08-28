/**
 */
package fr.logiprolls.ptcompta.shop;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.MEmployee#getSales <em>Sales</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getEmployee()
 * @model
 * @generated
 */
public interface MEmployee extends Person {
	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.

	 
	 * The list contents are of type {@link fr.logiprolls.ptcompta.shop.MSale}. 
	
	 * It is bidirectional and its opposite is '{@link fr.logiprolls.ptcompta.shop.MSale#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see fr.logiprolls.ptcompta.shop.MShopPackage#getEmployee_Sales()
	 * @see fr.logiprolls.ptcompta.shop.MSale#getEmployees
	 * @model opposite="employees"
	 * @generated
	 */
	EList<Sale> getSales();

} // MEmployee
