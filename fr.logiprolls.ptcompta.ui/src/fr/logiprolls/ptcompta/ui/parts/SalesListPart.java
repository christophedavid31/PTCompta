
package fr.logiprolls.ptcompta.ui.parts;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ListDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ReflectiveColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.Shop;

public class SalesListPart {

	public static final String VIEW_ID = "fr.logiprolls.ptcompta.ui.saleslistpart";
	public static final String MENU_ID = VIEW_ID + ".menu";

	@Inject
	private Shop shop;

	private IDataProvider bodyDataProvider;
	private String[] propertyNames;
	//private BodyLayerStack bodyLayer;
	private Map<String, String> propertyToLabels;

	private NatTable table;

	@Inject
	public SalesListPart() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
	    parent.setLayout(new GridLayout());

		// Creating the NatTable
	    propertyNames = new String[] { "customer", "description", "date", "value" };
	    
	    // create the data provider
	    IColumnPropertyAccessor<Sale> columnPropertyAccessor = 
	        new ReflectiveColumnPropertyAccessor<Sale>(propertyNames);
	    IDataProvider bodyDataProvider = new ListDataProvider<Sale>(shop.getSales(), columnPropertyAccessor);
	    
	    // build up a layer stack consisting of DataLayer, SelectionLayer and ViewportLayer
	    DataLayer bodyDataLayer = new DataLayer(bodyDataProvider);
	    SelectionLayer selectionLayer = new SelectionLayer(bodyDataLayer);
	    ViewportLayer viewportLayer = new ViewportLayer(selectionLayer);
	 
	    //final DataLayer bodyDataLayer = new DataLayer(bodyDataProvider);
	    
	    // as the selection mouse bindings are registered for the region label GridRegion.BODY
	    // we need to set that region label to the viewport so the selection via mouse is working correctly
	    viewportLayer.setRegionName(GridRegion.BODY);

	    table = new NatTable(parent, viewportLayer);
	    
	    GridDataFactory.fillDefaults().grab(true, true).applyTo(table);
		
	}

	@Focus
	public void onFocus() {

	}

//	/**
//	 * Distribute sale elements among columns
//	 * @return
//	 */
//	@Inject
//	private IDataProvider setupBodyDataProvider() {
//
//		this.propertyToLabels = new HashMap<String, String>();
//		this.propertyToLabels.put("customer", "Customer");
//		this.propertyToLabels.put("description", "Description");
//		this.propertyToLabels.put("date", "Date");
//		this.propertyToLabels.put("value", "Value");
//		this.propertyToLabels.put("payments", "Payments");
//
//		this.propertyNames = new String[] { "customer", "description", "date", "value" };
//		return new ListDataProvider(shop.getSales(), new ReflectiveColumnPropertyAccessor(this.propertyNames));
//
//	}
//
//	public class BodyLayerStack extends AbstractLayerTransform {
//
//		private SelectionLayer selectionLayer;
//
//		public BodyLayerStack(IDataProvider dataProvider) {
//			DataLayer bodyDataLayer = new DataLayer(dataProvider);
//			ColumnReorderLayer columnReorderLayer = new ColumnReorderLayer(bodyDataLayer);
//			ColumnHideShowLayer columnHideShowLayer = new ColumnHideShowLayer(columnReorderLayer);
//			this.selectionLayer = new SelectionLayer(columnHideShowLayer);
//			ViewportLayer viewportLayer = new ViewportLayer(this.selectionLayer);
//			setUnderlyingLayer(viewportLayer);
//		}
//
//		public SelectionLayer getSelectionLayer() {
//			return this.selectionLayer;
//		}
//	}
//
//	public class ColumnHeaderLayerStack extends AbstractLayerTransform {
//
//		public ColumnHeaderLayerStack(IDataProvider dataProvider) {
//			DataLayer dataLayer = new DataLayer(dataProvider);
//			ColumnHeaderLayer colHeaderLayer = new ColumnHeaderLayer(dataLayer, bodyLayer,
//					bodyLayer.getSelectionLayer());
//			setUnderlyingLayer(colHeaderLayer);
//		}
//	}
//
//	public class RowHeaderLayerStack extends AbstractLayerTransform {
//
//		public RowHeaderLayerStack(IDataProvider dataProvider) {
//			DataLayer dataLayer = new DataLayer(dataProvider, 70, 20);
//			RowHeaderLayer rowHeaderLayer = new RowHeaderLayer(dataLayer, bodyLayer, bodyLayer.getSelectionLayer());
//			setUnderlyingLayer(rowHeaderLayer);
//		}
//	}

	
}