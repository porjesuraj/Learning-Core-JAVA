package test;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		
		Customer c1 = new Customer(100000, 2);
		
		CustomerTest test = new CustomerTest();
		
		test.GetMaturityAmount(c1);
		 
	}

}
