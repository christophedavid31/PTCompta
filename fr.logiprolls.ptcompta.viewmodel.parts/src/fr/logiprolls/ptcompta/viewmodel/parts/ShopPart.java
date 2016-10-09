 
package fr.logiprolls.ptcompta.viewmodel.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import fr.logiprolls.ptcompta.shop.Shop;

public class ShopPart {
	@Inject
	public ShopPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, Shop dummyObject) {
		try {
			final Composite content = new Composite(parent, SWT.NONE);
			content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
			content.setLayoutData(GridDataFactory.fillDefaults().create());

			ECPSWTViewRenderer.INSTANCE.render(content, dummyObject);
			content.layout();
		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}
		parent.layout();

	}
	
	
	
	
}