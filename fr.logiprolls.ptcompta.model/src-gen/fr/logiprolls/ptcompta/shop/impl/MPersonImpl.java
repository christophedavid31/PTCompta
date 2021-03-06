/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import fr.logiprolls.ptcompta.shop.MShopPackage;
import fr.logiprolls.ptcompta.shop.Person;
import fr.logiprolls.ptcompta.shop.ShopPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getPhoneNumbers <em>Phone Numbers</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getEmails <em>Emails</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public abstract class MPersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhoneNumbers() <em>Phone Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> phoneNumbers;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmails() <em>Emails</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MShopPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.PERSON__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPhoneNumbers() {
		if (phoneNumbers == null) {
			phoneNumbers = new EDataTypeUniqueEList<String>(String.class, this, ShopPackage.PERSON__PHONE_NUMBERS);
		}
		return phoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MShopPackage.PERSON__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmails() {
		if (emails == null) {
			emails = new EDataTypeUniqueEList<String>(String.class, this, ShopPackage.PERSON__EMAILS);
		}
		return emails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MShopPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case MShopPackage.PERSON__LAST_NAME:
				return getLastName();
			case MShopPackage.PERSON__BIRTH_DATE:
				return getBirthDate();
			case MShopPackage.PERSON__PHONE_NUMBERS:
				return getPhoneNumbers();
			case MShopPackage.PERSON__ADDRESS:
				return getAddress();
			case MShopPackage.PERSON__EMAILS:
				return getEmails();
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
			case MShopPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case MShopPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case MShopPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case MShopPackage.PERSON__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				getPhoneNumbers().addAll((Collection<? extends String>)newValue);
				return;
			case MShopPackage.PERSON__ADDRESS:
				setAddress((String)newValue);
				return;
			case MShopPackage.PERSON__EMAILS:
				getEmails().clear();
				getEmails().addAll((Collection<? extends String>)newValue);
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
			case MShopPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case MShopPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case MShopPackage.PERSON__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
				return;
			case MShopPackage.PERSON__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				return;
			case MShopPackage.PERSON__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case MShopPackage.PERSON__EMAILS:
				getEmails().clear();
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
			case MShopPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case MShopPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case MShopPackage.PERSON__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
			case MShopPackage.PERSON__PHONE_NUMBERS:
				return phoneNumbers != null && !phoneNumbers.isEmpty();
			case MShopPackage.PERSON__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case MShopPackage.PERSON__EMAILS:
				return emails != null && !emails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MShopPackage.PERSON___GET_DISPLAY_NAME:
				return getDisplayName();
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", birthDate: ");
		result.append(birthDate);
		result.append(", phoneNumbers: ");
		result.append(phoneNumbers);
		result.append(", address: ");
		result.append(address);
		result.append(", emails: ");
		result.append(emails);
		result.append(')');
		return result.toString();
	}

} //MPersonImpl
