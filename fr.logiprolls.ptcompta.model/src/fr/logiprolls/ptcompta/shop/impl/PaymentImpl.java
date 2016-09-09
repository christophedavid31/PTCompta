package fr.logiprolls.ptcompta.shop.impl;

import java.text.SimpleDateFormat;

import fr.logiprolls.ptcompta.shop.Payment;

// This class overrides the generated class and will be instantiated by factory
public class PaymentImpl extends MPaymentImpl implements Payment
{

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
		return "Payment " + getType() + " " + getValue() + " " + ft.format(getDate());
	}

}
