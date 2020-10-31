package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyTester {

	public static void main(String[] args) {

		Company comp = new Company();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 0 to end");
		
		while (true) {
			try {
				System.out.println("Enter the SalesPerson, Product and the Total Sales: ");
				comp.setSalesPerson(in.nextInt());
				if (comp.getSalesPerson() == 0)	break;
				comp.setProduct(in.nextInt());
				comp.setValue(in.nextDouble());
				comp.setElements(comp.getSalesPerson() - 1, comp.getProduct() - 1, comp.getValue());
			} catch (InputMismatchException e) {
				System.out.print("Invalid input. Please reenter: ");
				break;
			}
		}
		
		comp.total(comp.getSales());
	}
	
}	