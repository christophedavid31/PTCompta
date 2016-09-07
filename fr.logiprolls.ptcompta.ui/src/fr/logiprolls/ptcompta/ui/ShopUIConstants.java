package fr.logiprolls.ptcompta.ui;


/**
 * Constant definitions for plug-in preferences, keys for colors, and to
 * identify objects nature.
 */
public interface ShopUIConstants
{

	public static final String PLUGIN_ID = "com.altran.rental.ui";
	public static final String SHOP_UI_PREF_STORE = PLUGIN_ID + ".preferenceStore";
	public static final String SHOP_UI_IMG_REGISTRY = PLUGIN_ID + ".imageRegistry";

	// Constants to manage object images in registry. Constant values are path to icons
	public static final String IMG_CUSTOMER = "icons/Customers.png";
	public static final String IMG_COLLAPSE_ALL = "icons/collapseall.gif";
	public static final String IMG_EXPAND_ALL = "icons/expandall.gif";

	// Nodes for providers
	public static final String CUSTOMERS_NODE = "Clients";

	// Preferences constants
	public static final String PALETTE_MANAGER = PLUGIN_ID + ".paletteManager";


}
