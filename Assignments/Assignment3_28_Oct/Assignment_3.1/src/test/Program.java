package test;

public class Program {


	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		
		InvoiceTest test = new InvoiceTest();
		
		test.AcceptInvoice(invoice);
	double amount = 	test.getInvoiceAmount(invoice);
		
	System.out.println("Invoice amount = " + amount);

	}

}



/*
Invoice should include four pieces of information as instance
variables—a part number (type String), a part description (type
String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and
a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that
calculates the invoice amount (i.e. multiplies the quantity by
the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0. If the
price per item is not positive, it should be set to
0.0.
Write a test application named, class Invoice’s capabilities.InvoiceTest that demonstrates*/