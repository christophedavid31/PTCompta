package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.ChequePayment;
import fr.logiprolls.ptcompta.shop.PaymentType;

// This class overrides the generated class and will be instantiated by factory
public class ChequePaymentImpl extends MChequePaymentImpl implements ChequePayment {

	public ChequePaymentImpl() {
		super();
		type = PaymentType.CHEQUE;
	}

}
