package fr.logiprolls.ptcompta.adapters;

import org.eclipse.core.runtime.IAdapterFactory;

import fr.logiprolls.ptcompta.shop.Customer;
import fr.logiprolls.ptcompta.shop.Sale;


public class SaleAdapterFactory implements IAdapterFactory
{
	/** Transform a Sale instance into a Customer instance */
	@SuppressWarnings("unchecked")
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType)
	{
		T result = null;
		if ((adaptableObject instanceof Sale) && (adapterType == Customer.class))
		{
			result =  (T) ((Sale)adaptableObject).getCustomer();
		}
		return result;
	}

	public Class<?>[] getAdapterList()
	{
		// Result returned types
		return new Class[] { Customer.class };
	}

}