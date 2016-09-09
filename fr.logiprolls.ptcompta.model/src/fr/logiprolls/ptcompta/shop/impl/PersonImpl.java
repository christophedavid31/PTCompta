package fr.logiprolls.ptcompta.shop.impl;

import fr.logiprolls.ptcompta.shop.Person;

// This class overrides the generated class and will be instantiated by factory
public class PersonImpl extends MPersonImpl implements Person
{

	/* (non-Javadoc)
	 * @see fr.logiprolls.ptcompta.shop.impl.MPersonImpl#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		return this.getFirstName() + " " + this.getLastName();
	}

}
