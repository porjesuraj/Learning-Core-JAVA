package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	
	
		
	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("please enter date in dd/mm/yyyy format");
		
		String strDate = sc.nextLine();
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date dateStr = formatter.parse(strDate);
			
			System.out.println(dateStr.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	 

}


/*11. (Printing Dates in Various Formats) Dates are printed in
several common formats. Two of the more common formats are
04/25/1955 and April 25, 1955
Write an application that reads a date in the first format and
prints it in the second format.*/










