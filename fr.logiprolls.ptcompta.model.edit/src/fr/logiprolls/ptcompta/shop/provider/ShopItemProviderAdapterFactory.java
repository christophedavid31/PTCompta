/**
 */
package fr.logiprolls.ptcompta.shop.provider;

import fr.logiprolls.ptcompta.shop.util.ShopAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShopItemProviderAdapterFactory extends ShopAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MShop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopItemProvider shopItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MShop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShopAdapter() {
		if (shopItemProvider == null) {
			shopItemProvider = new ShopItemProvider(this);
		}

		return shopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MCustomer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerItemProvider customerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MCustomer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomerAdapter() {
		if (customerItemProvider == null) {
			customerItemProvider = new CustomerItemProvider(this);
		}

		return customerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MSale} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaleItemProvider saleItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MSale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSaleAdapter() {
		if (saleItemProvider == null) {
			saleItemProvider = new SaleItemProvider(this);
		}

		return saleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MEmployee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeItemProvider employeeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MEmployee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeAdapter() {
		if (employeeItemProvider == null) {
			employeeItemProvider = new EmployeeItemProvider(this);
		}

		return employeeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MChequePayment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequePaymentItemProvider chequePaymentItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MChequePayment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChequePaymentAdapter() {
		if (chequePaymentItemProvider == null) {
			chequePaymentItemProvider = new ChequePaymentItemProvider(this);
		}

		return chequePaymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MCashPayment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashPaymentItemProvider cashPaymentItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MCashPayment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCashPaymentAdapter() {
		if (cashPaymentItemProvider == null) {
			cashPaymentItemProvider = new CashPaymentItemProvider(this);
		}

		return cashPaymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MElectronicPayment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectronicPaymentItemProvider electronicPaymentItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MElectronicPayment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectronicPaymentAdapter() {
		if (electronicPaymentItemProvider == null) {
			electronicPaymentItemProvider = new ElectronicPaymentItemProvider(this);
		}

		return electronicPaymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MBankOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankOperationItemProvider bankOperationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MBankOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBankOperationAdapter() {
		if (bankOperationItemProvider == null) {
			bankOperationItemProvider = new BankOperationItemProvider(this);
		}

		return bankOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.logiprolls.ptcompta.shop.MAccountBook} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountBookItemProvider accountBookItemProvider;

	/**
	 * This creates an adapter for a {@link fr.logiprolls.ptcompta.shop.MAccountBook}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccountBookAdapter() {
		if (accountBookItemProvider == null) {
			accountBookItemProvider = new AccountBookItemProvider(this);
		}

		return accountBookItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (shopItemProvider != null) shopItemProvider.dispose();
		if (customerItemProvider != null) customerItemProvider.dispose();
		if (saleItemProvider != null) saleItemProvider.dispose();
		if (employeeItemProvider != null) employeeItemProvider.dispose();
		if (chequePaymentItemProvider != null) chequePaymentItemProvider.dispose();
		if (cashPaymentItemProvider != null) cashPaymentItemProvider.dispose();
		if (electronicPaymentItemProvider != null) electronicPaymentItemProvider.dispose();
		if (bankOperationItemProvider != null) bankOperationItemProvider.dispose();
		if (accountBookItemProvider != null) accountBookItemProvider.dispose();
	}

}
