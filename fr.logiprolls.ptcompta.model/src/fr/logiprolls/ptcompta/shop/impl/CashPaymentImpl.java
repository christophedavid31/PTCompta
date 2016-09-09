package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.CashPayment;
import fr.logiprolls.ptcompta.shop.PaymentType;

// This class overrides the generated class and will be instantiated by factory
public class CashPaymentImpl extends MCashPaymentImpl implements CashPayment {

	public CashPaymentImpl() {
		super();
		type = PaymentType.CASH;
	}

}
