package fr.logiprolls.ptcompta.shop.helpers;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.logiprolls.ptcompta.shop.Customer;
import fr.logiprolls.ptcompta.shop.Employee;
import fr.logiprolls.ptcompta.shop.Payment;
import fr.logiprolls.ptcompta.shop.PaymentType;
import fr.logiprolls.ptcompta.shop.Sale;
import fr.logiprolls.ptcompta.shop.Shop;
import fr.logiprolls.ptcompta.shop.ShopFactory;
import fr.logiprolls.ptcompta.shop.ShopPackage;


/**
 * @author olivier
 *
 */
public class ShopGenerator
{
public static Shop createSampleShop() 
{
	ShopFactory f =  ShopFactory.eINSTANCE;
    Shop shop = f.createShop();
    shop.setAccountBook(f.createAccountBook());
    
    SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy"); 
    
    // Create some employees
    Employee e1 = f.createEmployee(); 
    e1.setFirstName("Hélène");
    e1.setLastName("DEUTROI");
    try {
		e1.setBirthDate(ft.parse("16-08-1978"));
	} catch (ParseException e4) {
		// TODO Auto-generated catch block
		e4.printStackTrace();
	}
    shop.getEmployees().add(e1);
    
    Employee e2 = f.createEmployee(); 
    e2.setFirstName("River");
    e2.setLastName("SONG");
    shop.getEmployees().add(e2);
    
    // Create some customers
    Customer c1 = f.createCustomer(); 
    c1.setFirstName("Isabelle");
    c1.setLastName("DECASTILE");
    try {
		c1.setBirthDate(ft.parse("15-04-1975"));
	} catch (ParseException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
    shop.getCustomers().add(c1);
    
    Customer c2 = f.createCustomer(); 
    c2.setFirstName("Marie");
    c2.setLastName("DURAND");
    shop.getCustomers().add(c2);

    Customer c3 = f.createCustomer(); 
    c3.setFirstName("Jeanne");
    c3.setLastName("DUPONT");
    shop.getCustomers().add(c2);

    // Create some sales
    Sale s1 = f.createSale();
    Date d1;
	try {
		d1 = ft.parse("12-05-2016");
	} catch (ParseException e) {
		d1 = new Date();
	}
    s1.setCustomer(c1);
    s1.getEmployees().add(e2);
    s1.setDescription("Manucure");
    s1.setDate(d1);
    s1.setValue(30.F);
    Payment p1 = f.createCashPayment();
    p1.setDate(d1);
    p1.setValue(10.F);
    s1.getPayments().add(p1);
    Payment p11 = f.createElectronicPayment();
    p11.setDate(d1);
    p11.setValue(20.F);
    s1.getPayments().add(p11);

    Sale s2 = f.createSale();
    Date d2;
	try {
		d2 = ft.parse("12-05-2016");
	} catch (ParseException e) {
		d2 = new Date();
	}
    Payment p2 = f.createChequePayment();
    s2.setCustomer(c1);
    s2.getEmployees().add(e1);
    s2.setDescription("Epilation");
    s2.setDate(d2);
    s2.setValue(60.F);
    p2.setDate(d2);
    p2.setValue(60.F);
    s2.getPayments().add(p2);
    
    Sale s3 = f.createSale();
    Date d3;
	try {
		d3 = ft.parse("11-05-2016");
	} catch (ParseException e) {
		d3 = new Date();
	}
    Payment p3 = f.createElectronicPayment();
    s3.setCustomer(c2);
    s3.getEmployees().add(e1);
    s3.setDescription("Soin du corps");
    s3.setDate(d3);
    s3.setValue(80.F);
    p3.setDate(d3);
    p3.setValue(80.F);
    s3.getPayments().add(p3);
    
    shop.getSales().add(s1);
    shop.getSales().add(s2);
    shop.getSales().add(s3);

    return shop;

}

public static void navigateInModel()
{
	// Récupération des objets du métamodele
	ShopPackage pack = (ShopPackage) ShopPackage.eINSTANCE;
	EClass shopClass       = pack.getShop();
	EAttribute saleDescription = pack.getSale_Description();
	
	System.out.println("Nb features : " + shopClass.getFeatureCount());
	System.out.println("  Low bound : " + saleDescription.getLowerBound());
}

public static void main(String[] arg)
{
	Shop shop = createSampleShop();
	System.out.println("magasin crée... Nb de clients : " + shop.getCustomers().size());
}





}