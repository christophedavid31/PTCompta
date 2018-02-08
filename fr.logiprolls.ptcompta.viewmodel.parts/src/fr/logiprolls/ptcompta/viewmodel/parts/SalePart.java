 
package fr.logiprolls.ptcompta.viewmodel.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.Shop;

public class SalePart {
	ECPSWTView saleView;
	
	@Inject
	public SalePart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, Shop shop) {
		try {
			final Composite content = new Composite(parent, SWT.NONE);
			content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
			content.setLayoutData(GridDataFactory.fillDefaults().create());

			saleView = ECPSWTViewRenderer.INSTANCE.render(content, shop.getSales().get(0));
			content.layout();
		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}
		parent.layout();

	}
	
	@Inject @Optional
	public void receiveSelection(Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION) Sale s ){
		if ( s != null)
			setSale(parent, s);
	}
	
	public void setSale(Composite parent, Sale s){
		saleView.getViewModelContext().changeDomainModel(s);
		parent.redraw();
	}
	
	
}