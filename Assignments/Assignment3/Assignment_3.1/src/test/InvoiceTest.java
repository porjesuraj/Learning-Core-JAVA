package test;

import java.util.Scanner;

public class InvoiceTest {
	
	
	public double getInvoiceAmount(Invoice invoice)
	{
		
		if(invoice.getItemQuantity() < 0)
		{
			invoice.setItemQuantity(0);
		}
		if(invoice.getPricePerItem() < 0)
		{
			invoice.setPricePerItem(0.0);
		}
		
		double result = invoice.getItemQuantity() * invoice.getPricePerItem();
		
		return result;
	}
	
    public void AcceptInvoice(Invoice invoice)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter invoice id");
    	//sc.nextLine();
    	invoice.setNumber(sc.nextLine());
    	
    	System.out.println("Enter item description");
    	//sc.nextLine();
    	invoice.setDescription(sc.nextLine());
    	
    	System.out.println("Enter item quantity");
    	invoice.setItemQuantity(sc.nextInt());
    	
    	System.out.println("Enter cost per item ");
    	invoice.setPricePerItem(sc.nextDouble());
    }

}



/*
In addition, provide a method named getInvoiceAmount that
calculates the invoice amount (i.e. multiplies the quantity by
the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0. If the
price per item is not positive, it should be set to
0.0.
*/
