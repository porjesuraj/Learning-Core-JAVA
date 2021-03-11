package test;

import java.util.Scanner;


public class Program {
	
	//Blocking Calls : sleep(), suspend(), join(), wait(), io call
	public static void main(String[] args) {
	
		try {
			for (int count = 0; count <= 10; count++) {
				System.out.println(count);
				
				Thread.sleep(250);
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
