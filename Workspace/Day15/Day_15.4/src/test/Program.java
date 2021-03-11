package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in); 
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
	
		int choice; 
		String pathname = "File.dat"; 
		while((choice = Program.menuList()) != 0)
		{
			switch (choice) {
			case 1:
				
				Program.writeRecord(pathname); 
				break;
            case 2:
				
            	Program.readRecord(pathname); 
				break;
			default:
				break;
			}
		}
		
		
	}
	private static void readRecord(String pathname) {
		
		
		try(FileInputStream  inputStream = new FileInputStream(new File(pathname)); ) {
	  int data;
	  while((data = inputStream.read()) != -1)
	  {
		  System.out.print( (char)data + " ");
	  }
	System.out.println();
			
		} catch (Exception e) {
		}
		
	}
	private static void writeRecord(String pathname) {
		
try(FileOutputStream outputStream = new FileOutputStream(new File(pathname)); ) {
			
		for(char ch = 'A'; ch <= 'Z'; ++ ch)
			outputStream.write(ch);	
		} catch (Exception e) {	
	}	
}


}











