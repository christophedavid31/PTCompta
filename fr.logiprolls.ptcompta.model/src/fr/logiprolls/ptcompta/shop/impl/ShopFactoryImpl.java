package fr.logiprolls.ptcompta.shop.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.logiprolls.ptcompta.shop.AccountBook;
import fr.logiprolls.ptcompta.shop.BankOperation;
import fr.logiprolls.ptcompta.shop.CashPayment;
import fr.logiprolls.ptcompta.shop.ChequePayment;
import fr.logiprolls.ptcompta.shop.Customer;
import fr.logiprolls.ptcompta.shop.ElectronicPayment;
import fr.logiprolls.ptcompta.shop.Employee;
import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.Shop;
import fr.logiprolls.ptcompta.shop.ShopFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class ShopFactoryImpl extends MShopFactoryImpl implements ShopFactory
{
	
	public static ShopFactory init() {
		
		try {
			Object fact = MShopFactoryImpl.init();
			if ((fact != null) && (fact instanceof ShopFactory))
					return (ShopFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShopFactoryImpl(); 
		 }
	
	public Shop createShop()
	{
		Shop result = new ShopImpl();
		return result;
	}
	public Customer createCustomer()
	{
		Customer result = new CustomerImpl();
		return result;
	}
	public Sale createSale()
	{
		Sale result = new SaleImpl();
		return result;
	}
	public Employee createEmployee()
	{
		Employee result = new EmployeeImpl();
		return result;
	}
	public ChequePayment createChequePayment()
	{
		ChequePayment result = new ChequePaymentImpl();
		return result;
	}
	public CashPayment createCashPayment()
	{
		CashPayment result = new CashPaymentImpl();
		return result;
	}
	public ElectronicPayment createElectronicPayment()
	{
		ElectronicPayment result = new ElectronicPaymentImpl();
		return result;
	}
	public BankOperation createBankOperation()
	{
		BankOperation result = new BankOperationImpl();
		return result;
	}
	public AccountBook createAccountBook()
	{
		AccountBook result = new AccountBookImpl();
		return result;
	}
}
