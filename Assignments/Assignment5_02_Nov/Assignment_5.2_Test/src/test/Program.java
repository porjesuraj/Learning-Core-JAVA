package test;

import java.util.Scanner;

import org.sunbeam.dac.d3.lib.Circle;
import org.sunbeam.dac.d3.lib.Rectangle;
import org.sunbeam.dac.d3.lib.Triangle;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0;
		int ischoice = 1;
		
		do {
			System.out.println("please enter the shape for area and perimeter \n 1. Rectangle \n 2. Circle \n 3. Triangle \n");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Rectangle r = new Rectangle();
				
				System.out.println("please enter length of rectangle");
				r.setLength(sc.nextDouble());
				System.out.println("please enter breadth of rectangle");
				r.setBreadth(sc.nextDouble());
				
				System.out.println(	r.toString());
			
				r.Area(r);
				r.Perimeter(r);
				
				
			 break;
			case 2:
				Circle c = new Circle();
				
				System.out.println("please enter radius of circle");
				
				c.setRadius(sc.nextDouble());
				System.out.println(c.toString());
				
				c.Area(c);
				c.Perimeter(c);
				
				 break;
			case 3:
				
				Triangle t = new Triangle();
				
				System.out.println("please enter side 1 of triangle ");
				t.setSide1(sc.nextDouble());
				
				System.out.println("please enter side 2 of triangle ");
				t.setSide2(sc.nextDouble());
				System.out.println("please enter side 3 of triangle ");
				t.setSide3(sc.nextDouble());
				
				System.out.println(t.toString());
				
				t.Area(t);
				t.Perimeter(t);
				
				 break;

			default:
				System.out.println("wrong choice, please try again");
				break;
			}
			
			System.out.println("do you want to continue? if yes, press 1");
			ischoice = sc.nextInt();
			
		} while (ischoice == 1);
		
		
		
		
		
		
		
	}

}
