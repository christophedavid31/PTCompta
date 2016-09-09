package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.ElectronicPayment;
import fr.logiprolls.ptcompta.shop.PaymentType;

// This class overrides the generated class and will be instantiated by factory
public class ElectronicPaymentImpl extends MElectronicPaymentImpl implements ElectronicPayment {

	public ElectronicPaymentImpl() {
		super();
		type = PaymentType.ELECTRONIC;
	}

}
