/**
 */
package fr.logiprolls.ptcompta.shop.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.logiprolls.ptcompta.shop.ChequePayment;
import fr.logiprolls.ptcompta.shop.MShopPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheque Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#isDeposited <em>Deposited</em>}</li>
 *   <li>{@link fr.logiprolls.ptcompta.shop.impl.MChequePaymentImpl#getDepositDate <em>Deposit Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MChequePaymentImpl extends PaymentImpl implements ChequePayment {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		result.append(" (deposited: ");
		result.append(deposited);
		result.append(", depositDate: ");
		result.append(depositDate);
		result.append(')');
		return result.toString();
	}

} //MChequePaymentImpl
