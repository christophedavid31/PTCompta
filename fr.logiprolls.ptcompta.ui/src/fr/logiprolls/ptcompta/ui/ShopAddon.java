
package fr.logiprolls.ptcompta.ui;

import java.io.IOException;
import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

import fr.logiprolls.ptcompta.shop.Shop;
import fr.logiprolls.ptcompta.shop.helpers.ShopGenerator;
import fr.logiprolls.ptcompta.shop.provider.ShopItemProviderAdapterFactory;

public class ShopAddon implements ShopUIConstants {

	@Inject
	Logger log;

	/**
	 * @param context
	 * @param reg
	 */
	@PostConstruct
	public void applicationStarted(IEclipseContext context, IExtensionRegistry reg) {
		//Shop s = ShopFactory.eINSTANCE.createShop();
		Shop s = ShopGenerator.createSampleShop();
		
		//Shop s = (ShopImpl) loadShopFromURI(SHOP_MODEL_URI);
		context.set(Shop.class, s);

		context.set(SHOP_UI_IMG_REGISTRY, getLocalImageRegistry());
		ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);
		context.set(SHOP_UI_PREF_STORE, store);

		EContentAdapter adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				System.out.println("Notification received from the data model. Data model has changed!!!");
				System.out.println(notification.getFeature());
			}
		};
		s.eAdapters().add(adapter);

	}

	@PreDestroy
	public void applicationClosing(Shop shop) {
		saveShopToURI(shop, SHOP_MODEL_URI);
	}

	ImageRegistry getLocalImageRegistry() {
		// Get the bundle using the universal method to get it from the current
		// class
		Bundle b = FrameworkUtil.getBundle(getClass());

		// Create a local image registry
		ImageRegistry reg = new ImageRegistry();

		// Then fill the values...
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		return reg;
	}

	Shop loadShopFromURI(String uri) {

		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
				   new ShopItemProviderAdapterFactory(),
				   new BasicCommandStack());
		ResourceSet resSet = domain.getResourceSet();
		Resource resource = resSet.getResource(URI.createURI(uri), true);
		return (Shop) resource.getContents().get(0);
	}

	void saveShopToURI(Shop shop, String uri) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("shop", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(uri));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(shop);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
