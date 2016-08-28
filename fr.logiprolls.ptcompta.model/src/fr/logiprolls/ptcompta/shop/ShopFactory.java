package fr.logiprolls.ptcompta.shop;

import fr.logiprolls.ptcompta.shop.impl.ShopFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ShopFactory extends MShopFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ShopFactory eINSTANCE = ShopFactoryImpl.init();
				
	public Shop createShop();
	public Customer createCustomer();
	public Sale createSale();
	public Employee createEmployee();
	public ChequePayment createChequePayment();
	public CashPayment createCashPayment();
	public ElectronicPayment createElectronicPayment();
	public BankOperation createBankOperation();
	public AccountBook createAccountBook();
}
