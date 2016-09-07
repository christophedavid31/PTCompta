 
package fr.logiprolls.ptcompta.ui;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

import fr.logiprolls.ptcompta.shop.Shop;
import fr.logiprolls.ptcompta.shop.helpers.ShopGenerator;

public class ShopAddon implements ShopUIConstants{

	@Inject Logger log;

	/**
	 * @param context
	 * @param reg
	 */
	@PostConstruct
	public void applicationStarsted(IEclipseContext context, IExtensionRegistry reg) {		
		Shop s = ShopGenerator.createSampleShop();
		context.set(Shop.class, s);
		context.set(SHOP_UI_IMG_REGISTRY, getLocalImageRegistry());
		ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);
		context.set(SHOP_UI_PREF_STORE, store);
		
	}
	
	
	ImageRegistry getLocalImageRegistry()
	{
		// Get the bundle using the universal method to get it from the current class
		Bundle b = FrameworkUtil.getBundle(getClass());  
		
		// Create a local image registry
		ImageRegistry reg = new ImageRegistry();

		// Then fill the values...
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		return reg;
	}
	

}
