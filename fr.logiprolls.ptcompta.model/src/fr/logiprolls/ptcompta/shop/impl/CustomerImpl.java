package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.Customer;

// This class overrides the generated class and will be instantiated by factory
public class CustomerImpl extends MCustomerImpl implements Customer
{

	/* (non-Javadoc)
	 * @see fr.logiprolls.ptcompta.shop.impl.MPersonImpl#toString()
	 */
	@Override
	public String toString() {
		return this.getDisplayName();
	}

}
