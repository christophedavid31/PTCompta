package fr.logiprolls.ptcompta.shop.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import fr.logiprolls.ptcompta.shop.AccountBook;
import fr.logiprolls.ptcompta.shop.BankOperation;
import fr.logiprolls.ptcompta.shop.ChequePayment;

// This class overrides the generated class and will be instantiated by factory
public class AccountBookImpl extends MAccountBookImpl implements AccountBook
{

	/**
	 * <!-- begin-user-doc -->
	 * Creates a Bank Operation for depositing given cash value at given date.
	 * cashFlow is decreased from the same value
	 * <!-- end-user-doc -->
	 */
	/* (non-Javadoc)
	 * @see fr.logiprolls.ptcompta.shop.impl.MAccountBookImpl#depositCash(float, java.util.Date)
	 */
	@Override
	public void depositCash(float cashValue, Date date) {
		
		if (cashFlow>=cashValue)
		{
			cashFlow -= cashValue;
			
			BankOperation bo = new BankOperationImpl();
			bo.setDescription("Cash deposit");
			bo.setDate(date);
			bo.setValue(cashValue);
			
			bankOperations.add(bo);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates a Bank Operation for depositing given cheques at given date.
	 * Corresponding cheques are set as deposited.
	 * <!-- end-user-doc -->
	 */
	/* (non-Javadoc)
	 * @see fr.logiprolls.ptcompta.shop.impl.MAccountBookImpl#depositCheques(org.eclipse.emf.common.util.EList, java.util.Date)
	 */
	@Override
	public void depositCheques(EList<ChequePayment> cheques, Date date) {
		
		BankOperation bo = new BankOperationImpl();
		bo.setDescription("Cheques deposit");
		bo.setDate(date);
		bo.setValue((float) 0.);

		for ( ChequePayment cp : cheques )
		{
			if (! cp.isDeposited())
			{
				bo.setValue( bo.getValue() + cp.getValue());
				cp.setDeposited(true);
				cp.setDepositDate(date);
			}
		}
		
		if (bo.getValue()>0.)
			bankOperations.add(bo);		
	}

}
